package metamodelcomprehensionextentassessor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;

import metamodelcomprehensionextentassessor.exceptions.MetamodelAssessorIoException;
import metamodelcomprehensionextentassessor.helpers.EClassSet;
import metamodelcomprehensionextentassessor.helpers.ECoreContentHelper;
import metamodelcomprehensionextentassessor.helpers.ECoreReportingHelper;
import metamodelcomprehensionextentassessor.helpers.GenericityHelper;
import metamodelcomprehensionextentassessor.metamodelhandles.MetamodelHandle;
import metamodelcomprehensionextentassessor.metamodelhandles.MpcmHandle;

public class MetamodelSubgraphFromExtension extends MetamodelSubgraph {

    private List<Resource> extensionResources;
    private EClassSet extendedClasses;

    public MetamodelSubgraphFromExtension(ResourceSet extensionSet) {
        super(extensionSet, false);
        extendedClasses = null;
    }

    public EClassSet getExtendedClasses() {
        return extendedClasses;
    }

    /**
     * Assumes the ResourceSet only contains resources with extensions. Searches for outgoing
     * inter-metamodel dependencies (from the set of extensions). Loads the referenced (i.e.,
     * extended) classes into the RelevantClasses set. At the end, removes the extension resources
     * from the ResourceSet.
     */
    public void loadExtensions() {

        extensionResources = Collections.unmodifiableList(new ArrayList<>(resourceSet.getResources()));

        // search inter-metamodel dependencies
        ECoreContentHelper.recursiveTraverseClassesInRessources(extensionResources, eClass -> {
            collectExtendedClasses(extensionResources, eClass);
            collectExtendedSuperclasses(extensionResources, eClass);
            collectGenericallyReferencedClasses(extensionResources, eClass);
        });

        // remove EObject
        relevantClasses.removeIf(eClass -> eClass.getName().equalsIgnoreCase("EObject"));

        relevantClassesLoaded = true;

        extendedClasses = new EClassSet(relevantClasses, false);
        ECoreReportingHelper.persistClassNames(relevantClasses, "classes.txt");

        //remove extensions, so only the modules remain that should be analyzed
        resourceSet.getResources().removeAll(extensionResources);

        ECoreReportingHelper.reportResources("Extended Metamodels", resourceSet);
        EcoreUtil.resolveAll(resourceSet);
    }

    private void collectExtendedClasses(List<Resource> extensions, EClass eClass) {
        // iterate over references
        EList<EReference> references = eClass.getEReferences();
        for (EReference reference : references) {

            // does reference point into other metamodel?
            EClass targetClass = reference.getEReferenceType();
            Resource targetResource = targetClass.eResource();
            if (!extensions.contains(targetResource)) {

                // extended class found
                relevantClasses.add(targetClass);
                Reporting.getCurrentReporting().message("Found inter-metamodel reference   from " + eClass.getName() + " to " + targetClass.getName());
            }
        }
    }

    private void collectExtendedSuperclasses(List<Resource> extensions, EClass eClass) {
        // iterate over all superclasses
        List<EGenericType> genSuperTypes = eClass.getEGenericSuperTypes();
        for (EGenericType genSuperType : genSuperTypes) {
            EClassifier superClassifier = genSuperType.getEClassifier();

            // don't include inheritances with type arguments, they are added by the genericity helper
            if (genSuperType.getETypeArguments().size() > 0)
                break;

            // does inheritance point into other metamodel?
            Resource targetResource = superClassifier.eResource();
            if (!extensions.contains(targetResource)) {

                // extended class found
                relevantClasses.add((EClass) superClassifier);
                Reporting.getCurrentReporting().message("Found inter-metamodel inheritance from " + eClass.getName() + " to " + superClassifier.getName());
            }
        }
    }

    private void collectGenericallyReferencedClasses(List<Resource> extensions, EClass eClass) {
        // get all generically referenced classes
        EClassSet genericallyReferencedClasses = new EClassSet(false);
        GenericityHelper.visitGenericity(eClass, genericallyReferencedClasses);

        for (EClass targetClass : genericallyReferencedClasses) {
            // does reference point into other metamodel?
            Resource targetResource = targetClass.eResource();
            if (!extensions.contains(targetResource)) {

                // extended class found
                relevantClasses.add(targetClass);
                Reporting.getCurrentReporting().message("Found inter-metamodel genericity  from " + eClass.getName() + " to " + targetClass.getName());
            }
        }
    }

    @Override
    public void loadMetmaodel(MetamodelHandle metamodelHandle) throws MetamodelAssessorIoException {
        super.loadMetmaodel(metamodelHandle);
        if (metamodelHandle instanceof MpcmHandle) {
            assertExtensionsNotReloaded(resourceSet, extensionResources);
            EcoreUtil.resolveAll(resourceSet);
        }
    }

    private void assertExtensionsNotReloaded(ResourceSet resourceSet, List<Resource> extensionResources) {
        //check and warn if a module was readded (i.e. an extension is now in the investigation set)
        for (Resource extension : extensionResources) {
            URI extensionUri = extension.getURI();
            for (Resource resource : resourceSet.getResources()) {
                if (resource.getURI().equals(extensionUri)) {
                    Reporting.getCurrentReporting().promptAndLog("WARNING: extension metamodel " + ECoreContentHelper.getResourceName(extension) + " was readded to the investigation set.");
                    break;
                }
            }
        }
    }
}
