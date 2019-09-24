package metamodelcomprehensionextentassessor;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import metamodelcomprehensionextentassessor.classdetection.IClassIdentificator;
import metamodelcomprehensionextentassessor.exceptions.MetamodelAssessorIoException;
import metamodelcomprehensionextentassessor.helpers.EClassSet;
import metamodelcomprehensionextentassessor.helpers.ECoreContentHelper;
import metamodelcomprehensionextentassessor.helpers.ECoreLoadHelper;
import metamodelcomprehensionextentassessor.helpers.MyResourceSet;
import metamodelcomprehensionextentassessor.metamodelhandles.MetamodelHandle;

public class MetamodelSubgraph {

    protected final ResourceSet resourceSet;
    protected EClassSet relevantClasses;
    protected final EClassSet remainingClasses;
    protected boolean relevantClassesLoaded;
    protected boolean remainingClassesLoaded;

    protected MetamodelSubgraph(ResourceSet resourceSet, boolean forgiving) {
        this.resourceSet = resourceSet;
        relevantClasses = new EClassSet(forgiving);
        remainingClasses = new EClassSet(forgiving);
        relevantClassesLoaded = false;
        remainingClassesLoaded = false;
    }

    public MetamodelSubgraph(boolean forgiving) {
        this(new ResourceSetImpl(), forgiving);
    }

    public ResourceSet getResourceSet() {
        return resourceSet;
    }

    public EClassSet getRelevantClasses() {
        return relevantClasses;
    }

    public void setRelevantClasses(EClassSet relevantClasses) {
        this.relevantClasses = relevantClasses;
        relevantClassesLoaded = true;
    }

    public MyResourceSet getResourcesOfRelevantClasses() {
        return ECoreContentHelper.getResourcesOfClasses(relevantClasses);
    }

    public EClassSet getRemainingClasses() {
        return remainingClasses;
    }

    public MyResourceSet getResourcesOfRemainingClasses() {
        return ECoreContentHelper.getResourcesOfClasses(remainingClasses);
    }

    public void loadMetmaodel(MetamodelHandle target) throws MetamodelAssessorIoException {
        target.load(resourceSet);
    }

    public void resolveAll() {
        EcoreUtil.resolveAll(resourceSet);
    }

    public void loadAllClasses() {
        ECoreContentHelper.recursiveTraverseClassesInRessources(resourceSet, eClass -> remainingClasses.add(eClass));
        remainingClassesLoaded = true;
    }

    /**
     * Search classes which are not yet present in the classes set.
     * 
     * @param metamodelResourceSet
     *            ResourceSet containing the metamodels which should be searched
     * @param classes
     *            A set of classes
     * @param remainingClasses
     *            This set will be filled with all classes contained in the resources of the
     *            ResourceSet which are not yet contained in classes
     */
    public void loadRemainingClasses() {
        assert !remainingClassesLoaded;
        assert relevantClassesLoaded;

        ECoreContentHelper.recursiveTraverseClassesInRessources(resourceSet, eClass -> {
            if (!relevantClasses.contains(eClass)) {
                remainingClasses.add(eClass);
            }
        });

        remainingClassesLoaded = true;
    }

    public void loadClassesFromNameList(Collection<IClassIdentificator> classIds) {
        assert !relevantClassesLoaded;

        Reporting.getCurrentReporting().message("Searching class names in loaded modules.");

        ECoreContentHelper.recursiveTraverseClassesInRessources(resourceSet, eClassifier -> {
            if (eClassifier instanceof EClass) {
                EClass eClass = eClassifier;
                processClassAgainstIdList(eClass, classIds);
            }
        });

        relevantClassesLoaded = true;
        remainingClassesLoaded = true;

        List<String> errors = new ArrayList<>();
        for (IClassIdentificator id : classIds) {
            errors.addAll(id.getMatchingErrorsAndReset());
        }

        if (errors.size() > 0) {
            errors.add(0, "WARNING: There were unexpected (non) matches for class names:");
            String allErrors = errors.stream().collect(Collectors.joining("\n"));
            Reporting.getCurrentReporting().promptAndLog(allErrors);
        }
    }

    private void processClassAgainstIdList(EClass eClass, Collection<IClassIdentificator> classIds) {

//        Stream<IClassIdentificator> ignoredClasses = classIds.stream().filter(id -> (id instanceof IgnoreMatchException));

        // iterate ids and apply them to class
        boolean found = false;
        for (IClassIdentificator classId : classIds) {
            if (classId.matches(eClass)) {
                // found entry class
                relevantClasses.add(eClass);
                found = true;
            }
        }

        if (!found)
            remainingClasses.add(eClass);
    }

    public void dispose() {
        ECoreLoadHelper.disposeResourceSet(resourceSet);
    }
}
