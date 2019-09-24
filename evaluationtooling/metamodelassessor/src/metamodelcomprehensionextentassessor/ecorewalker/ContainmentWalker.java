package metamodelcomprehensionextentassessor.ecorewalker;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import metamodelcomprehensionextentassessor.Reporting;
import metamodelcomprehensionextentassessor.helpers.EClassSet;
import metamodelcomprehensionextentassessor.helpers.ECoreContentHelper;
import metamodelcomprehensionextentassessor.helpers.GenericityHelper;

public class ContainmentWalker extends AbstractWalker {

    private static final boolean DEBUG = true;

    private final boolean grabPackageContent;
    private final boolean grabSubClasses;
    private final boolean grabIncomingContainments;

    private final boolean forgiving;

    private EClassSet visitedContainedClasses;
    private EClassSet unvisitedContainedClasses;
    private EClassSet visitedSuperClasses;
    private EClassSet unvisitedSuperClasses;
    private EClassSet unreachedClasses;
    private Set<EPackage> visitedPackages;

    public ContainmentWalker(boolean grabPackageContent, boolean grabSubClasses, boolean grabIncomingContainments, boolean forgiving) {
        this.grabPackageContent = grabPackageContent;
        this.grabSubClasses = grabSubClasses;
        this.grabIncomingContainments = grabIncomingContainments;
        this.forgiving = forgiving;
    }

    public ContainmentWalker() {
        this(true, false, false, false);
    }

    @Override
    public void walk(EClassSet relevantClasses, EClassSet remainingClasses) {

        visitedContainedClasses = new EClassSet(forgiving);
        unvisitedContainedClasses = relevantClasses;
        unreachedClasses = remainingClasses;

        // uncontained superclasses (subclasses must not be searched)
        visitedSuperClasses = new EClassSet(forgiving);
        unvisitedSuperClasses = new EClassSet(forgiving);

        visitedPackages = new HashSet<>();

        // visit every unvisited class in the containment tree
        boolean setsChanged = true;
        while (setsChanged) {
            setsChanged = false;

            if (unvisitedContainedClasses.size() > 0) {
                visitContainedClass();
                setsChanged = true;
            }

            if (unvisitedSuperClasses.size() > 0) {
                visitSuperClass();
                setsChanged = true;
            }

            if (!setsChanged) {
                assert unvisitedSuperClasses.size() + unvisitedContainedClasses.size() == 0;
                setsChanged = checkUnreachedClassesForContainersAndSubclasses();
            }
        }

        assert unvisitedSuperClasses.size() + unvisitedContainedClasses.size() == 0;

        /* we did not change this in/out parameter, so we have to update it */
        relevantClasses.clear();
        relevantClasses.addAll(visitedContainedClasses);
        relevantClasses.addAll(visitedSuperClasses);
    }

    private void visitContainedClass() {
        Iterator<EClass> iterator = unvisitedContainedClasses.iterator();
        EClass eClass = iterator.next();
        iterator.remove();
        visitedContainedClasses.add(eClass);

        visitClass(eClass);
    }

    private void visitSuperClass() {
        Iterator<EClass> iterator = unvisitedSuperClasses.iterator();
        EClass superClass = iterator.next();
        iterator.remove();
        visitedSuperClasses.add(superClass);

        visitClass(superClass);
    }

    private void visitClass(EClass eClass) {
        visitOutgoingReferences(eClass);
        visitSuperClasses(eClass);
        visitGenericity(eClass);
        if (grabPackageContent) {
            visitPackage(eClass);
        }
    }

    private void visitOutgoingReferences(EClass eClass) {
        // for an unvisited class follow all relevant relations
        EList<EReference> references = eClass.getEReferences();
        for (EReference ref : references) {

            // is it in containment graph? (ie should it be added)
            if (ref.isContainer() || ref.isContainment() || ref.getLowerBound() > 0) {
                EClass referencedClass = ref.getEReferenceType();

                boolean foundNewClass = addClassToContainmentIfNotAlreadyPresent(referencedClass);
                possiblyReportNewClass(foundNewClass, refToString(ref), eClass, referencedClass);
            }
        }
    }

    private String refToString(EReference ref) {
        if (ref.isContainer())
            return "container";
        else if (ref.isContainment())
            return "outgoing containment";
        else if (ref.getLowerBound() > 0)
            return "obligatory ref";
        throw new RuntimeException("Not expected reference type");
    }

    private void visitSuperClasses(EClass eClass) {
        // visit superclasses
        EList<EClass> superClasses = eClass.getESuperTypes();
        for (EClass superClass : superClasses) {
            // is it a new super class?
            if (!visitedContainedClasses.contains(superClass) && !unvisitedContainedClasses.contains(superClass) && !visitedSuperClasses.contains(superClass)
                    && !unvisitedSuperClasses.contains(superClass)) {
                unvisitedSuperClasses.add(superClass);
                unreachedClasses.remove(superClass);
                possiblyReportNewClass(true, "super class", eClass, superClass);
            }
        }
    }

    private void visitGenericity(EClass eClass) {
        EClassSet genericallyReferencedClasses = new EClassSet(forgiving);
        GenericityHelper.visitGenericity(eClass, genericallyReferencedClasses);
        for (EClass genericallyReferencedClass : genericallyReferencedClasses) {
            boolean foundNewClass = addClassToContainmentIfNotAlreadyPresent(genericallyReferencedClass);
            possiblyReportNewClass(foundNewClass, "generic", eClass, genericallyReferencedClass);
        }
    }

    private void visitPackage(EClass eClass) {
        EPackage ePackage = eClass.getEPackage();
        if (!visitedPackages.contains(ePackage)) {
            for (EClassifier classifier : ePackage.getEClassifiers()) {
                if (classifier instanceof EClass) {
                    EClass containedClass = (EClass) classifier;
                    boolean foundNewClass = addClassToContainmentIfNotAlreadyPresent(containedClass);
                    possiblyReportNewClass(foundNewClass, "package", eClass, containedClass);
                }
            }
        }
    }

    private boolean addClassToContainmentIfNotAlreadyPresent(EClass referencedClass) {
        boolean isNewClass = !visitedContainedClasses.contains(referencedClass) && !unvisitedContainedClasses.contains(referencedClass);
        if (isNewClass) {
            unvisitedContainedClasses.add(referencedClass);
            visitedSuperClasses.remove(referencedClass);
            unvisitedSuperClasses.remove(referencedClass);
            unreachedClasses.remove(referencedClass);
        }
        return isNewClass;
    }

    private boolean checkUnreachedClassesForContainersAndSubclasses() {
        // iterate over all yet unreached classes
        Iterator<EClass> iterator = unreachedClasses.iterator();
        while (iterator.hasNext()) {
            EClass eClass = iterator.next();

            if (grabIncomingContainments && addIfContainer(eClass) || grabSubClasses && addIfContainedSubClass(eClass)) {
                iterator.remove();
                return true;
            }
        }
        return false;
    }

    private boolean addIfContainer(EClass eClass) {
        // search for containments going into contained classes and superclasses
        EList<EReference> containments = eClass.getEAllContainments();
        for (EReference containment : containments) {
            EClass containee = containment.getEReferenceType();
            if (visitedContainedClasses.contains(containee) || visitedSuperClasses.contains(containee)) {

                // add new container
                unvisitedContainedClasses.add(eClass);

                // does the containment point to a uncontained superclass? 
                if (visitedSuperClasses.remove(containee)) {
                    unvisitedContainedClasses.add(containee);
                }

                possiblyReportNewClass(true, "incoming containment", containee, eClass);

                return true;
            }
        }
        return false;
    }

    private boolean addIfContainedSubClass(EClass eClass) {

        // search for inheritances going into contained classes
        EList<EClass> superClasses = eClass.getESuperTypes();
        for (EClass superClass : superClasses) {
            if (visitedContainedClasses.contains(superClass)) {

                // eClass is a subclass of the containment set
                unvisitedContainedClasses.add(eClass);

                possiblyReportNewClass(true, "sub class", superClass, eClass);
                return true;
            }
        }
        return false;
    }

    private void possiblyReportNewClass(boolean isNew, String relation, EClass sourceClass, EClass newClass) {
        if (DEBUG && isNew) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(sourceClass.getName());
            stringBuilder.append('(');
            stringBuilder.append(relation);
            stringBuilder.append(")->");
            stringBuilder.append(newClass.getName());
            stringBuilder.append(" (package: ");
            stringBuilder.append(ECoreContentHelper.getResourceName(newClass.eResource()));
            stringBuilder.append(')');
            Reporting.getCurrentReporting().message(stringBuilder.toString());
        }
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ContainmentWalker(");
        stringBuilder.append(grabPackageContent ? "grab package" : "don't grab package");
        stringBuilder.append(", ");
        stringBuilder.append(grabSubClasses ? "grab subclasses" : "don't grab subclasses");
        stringBuilder.append(", ");
        stringBuilder.append(grabIncomingContainments ? "grab incoming containmentss" : "don't grab incoming containments");
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
