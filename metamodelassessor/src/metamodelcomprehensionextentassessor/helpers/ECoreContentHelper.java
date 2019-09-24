package metamodelcomprehensionextentassessor.helpers;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;

import metamodelcomprehensionextentassessor.classdetection.IClassIdentificator;
import metamodelcomprehensionextentassessor.classdetection.IMatchException;

public class ECoreContentHelper {

    private ECoreContentHelper() {
    }

    public static MyResourceSet getResourcesOfClasses(EClassSet classes) {
        return new MyResourceSet(classes.stream().map(EClass::eResource));
    }

    /**
     * Determines the name of a resource that contains metamodel content. It uses the namespace
     * prefix of the outer package.
     * 
     * @param resource
     * @return human readable name of the resource
     */
    public static String getResourceName(Resource resource) {
        return ((EPackage) resource.getContents().get(0)).getNsPrefix();
    }

    /**
     * Determines the name of a resource that contains model content. It uses the file name.
     * 
     * @param resource
     * @return human readable name of the resource
     */
    public static String getModelResourceName(Resource resource) {
        return resource.getURI().lastSegment();
    }

    public static Collection<IClassIdentificator> getClassIdentificatorsFromModels(ResourceSet modelResourceSet, List<IMatchException> exceptions) {

        Set<IClassIdentificator> classIds = new HashSet<>();

        // iterate over all objects
        EcoreUtil.getAllContents(modelResourceSet, false).forEachRemaining(element -> {
            if (element instanceof EObject) {
                EObject eObject = (EObject) element;

                // add their class to relevant classes
                classIds.add(IClassIdentificator.create(eObject, exceptions));
            }
        });

        return classIds;
    }

    public static boolean areClassNameseUnique(Collection<EClass> classes) {
        Set<String> uniqueNames = classes.stream().map(EClass::getName).collect(Collectors.toSet());
        return classes.size() == uniqueNames.size();
    }

    public static void recursiveTraverseClassesInRessources(ResourceSet resourceSet, Consumer<EClass> procedure) {
        recursiveTraverseClassesInRessources(resourceSet.getResources(), procedure);
    }

    public static void recursiveTraverseClassesInRessources(Collection<Resource> resources, Consumer<EClass> procedure) {
        for (Resource resource : resources) {
            EPackage rootPackage = (EPackage) resource.getContents().get(0);
            recursiveTraverseClassesInPackage(rootPackage, procedure);
        }
    }

    public static void recursiveTraverseClassesInPackage(EPackage ePackage, Consumer<EClass> procedure) {
        // iterate over all classes of package
        for (EClassifier eClassifier : ePackage.getEClassifiers()) {
            if (eClassifier instanceof EClass) {
                procedure.accept((EClass) eClassifier);
            }
        }

        // search in subpackages
        for (EPackage eSubPackage : ePackage.getESubpackages()) {
            recursiveTraverseClassesInPackage(eSubPackage, procedure);
        }
    }

    /*
     * This might be faulty. It is here for testing reasons. Update: problem seems to originate from
     * elsewhere
     */
    @Deprecated
    public static void iterateClassesInRessources(ResourceSet resourceSet, Consumer<EClass> procedure) {
        // search for remaining classes
        resourceSet.getAllContents().forEachRemaining(o -> {
            if (o instanceof EClass) {
                procedure.accept((EClass) o);
            }
        });
    }

    public static boolean resourceEquals(Resource resource1, Resource resource2) {

        if (resource1.getURI().equals(resource2.getURI())) {
            return true;
        }

        EPackage rootPackage1 = (EPackage) resource1.getContents().get(0);
        EPackage rootPackage2 = (EPackage) resource2.getContents().get(0);

        if (rootPackage1.equals(rootPackage2)) {
            return true;
        }

        if (shallowPackageEquals(rootPackage1, rootPackage2)) {
            return true;
        }

        return false;
    }

    public static boolean shallowPackageEquals(EPackage package1, EPackage package2) {
        boolean nameIdentical = package1.getName().equalsIgnoreCase(package2.getName());
        boolean nsUriIdentical = package1.getNsURI().equalsIgnoreCase(package2.getNsURI());
        boolean nsPrefixIdentical = package1.getNsPrefix().equalsIgnoreCase(package2.getNsPrefix());
        return nameIdentical && nsUriIdentical && nsPrefixIdentical;
    }
}
