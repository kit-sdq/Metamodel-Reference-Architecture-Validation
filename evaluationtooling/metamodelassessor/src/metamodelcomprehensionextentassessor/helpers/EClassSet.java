package metamodelcomprehensionextentassessor.helpers;

import java.util.HashSet;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import metamodelcomprehensionextentassessor.Reporting;

public class EClassSet extends HashSet<EClass> {

    private static final long serialVersionUID = 6141321221905984295L;

    private final boolean forgiving;
//    private final List<IgnoreMatchException> ignoredClasses;
//
//    public EClassSet(boolean forgiving, List<IgnoreMatchException> ignoredClasses) {
//        super();
//        this.forgiving = forgiving;
//        this.ignoredClasses = ignoredClasses;
//    }
//
//    public EClassSet(int size, boolean forgiving, List<IgnoreMatchException> ignoredClasses) {
//        super(size);
//        this.forgiving = forgiving;
//        this.ignoredClasses = ignoredClasses;
//    }
//
//    public EClassSet(EClassSet otherSet, boolean forgiving, List<IgnoreMatchException> ignoredClasses) {
//        super(otherSet);
//        this.forgiving = forgiving;
//        this.ignoredClasses = ignoredClasses;
//    }

    public EClassSet(boolean forgiving) {
        super();
        this.forgiving = forgiving;
    }

    public EClassSet(int size, boolean forgiving) {
        super(size);
        this.forgiving = forgiving;
    }

    public EClassSet(EClassSet otherSet, boolean forgiving) {
        super(otherSet);
        this.forgiving = forgiving;
    }

    @Override
    public boolean add(EClass eClass) {

        if (eClass == null) {
            String message = "Tried to add null to an eClass set. There are problems in the metamodel.";
            if (forgiving) {
                Reporting.getCurrentReporting().message("WARNING: " + message);
                return false;
            } else {
                throw new RuntimeException(message);
            }
        }

        if (eClass.getName() == null) {
            String message = "Tried to add an unresolved reference to an eClass set: " + eClass + '.';
            if (forgiving) {
                Reporting.getCurrentReporting().message("WARNING: " + message + " Ignoring.");
                return false;
            } else {
                throw new RuntimeException(message);
            }
        }

        if (contains(eClass)) {
            return false;
        }
        return super.add(eClass);
    }

    @Override
    public boolean contains(Object o) {

        if (o == null) {
            return false;
        }

        // if object already present => true
        if (super.contains(o)) {
            return true;
        }

        // not an EClass => false
        if (!(o instanceof EClass)) {
            return false;
        }
        EClass eClass = (EClass) o;
        String name = eClass.getName();

        // duplicate might still exist in the set
        Reporting reporting = Reporting.getCurrentReporting();
        for (EClass containedEClass : this) {
            if (containedEClass.getName().equalsIgnoreCase(name)) {
                // check if packages and namespaces are identical
                if (isPackageHierarchyIdentical(eClass.getEPackage(), containedEClass.getEPackage())) {
//                    reporting.message("The EClasses with the name " + name + " have same package and namespace hierarchies.");
                    return true;
                } else {
                    reporting.message("Different EClasses with the same name (" + name + ") were found! "
                            + "You will need to write a 'disti' class matching exception, or else these classes cannot be correctly matched in the other metamodel. "
                            + "This is relevant for the modes: Model (exception file in base dir of project), Modification (only for entry classes, specified in the mode files) and Extension (only for extended classes, not implemented as not yet needed).");
                    reporting.message(name + ": Package=" + eClass.getEPackage().getName() + " Resoruce=" + eClass.eResource());
                    reporting.message(name + ": Package=" + containedEClass.getEPackage().getName() + " Resoruce=" + containedEClass.eResource());
                }
            }
        }

        return false;
    }

    private boolean isPackageHierarchyIdentical(EPackage ePackage1, EPackage ePackage2) {
        // packages identical? (or both null?)
        if (ePackage1 == ePackage2)
            return true;

        // one of them null?
        if (ePackage1 == null || ePackage2 == null)
            return false;

        // other namespace?
        if (!ePackage1.getNsURI().equalsIgnoreCase(ePackage2.getNsURI()))
            return false;

        // identical namespace -> check rest of package hierarhcy
        return isPackageHierarchyIdentical(ePackage1.getESuperPackage(), ePackage2.getESuperPackage());
    }
}
