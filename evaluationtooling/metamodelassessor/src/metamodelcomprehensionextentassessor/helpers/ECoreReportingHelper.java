package metamodelcomprehensionextentassessor.helpers;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

import metamodelcomprehensionextentassessor.Reporting;

public class ECoreReportingHelper {

    private ECoreReportingHelper() {
    }

    public static void reportClasses(String setName, EClassSet classes) {
        /*
         * This check is obsolete (done by EClassSet now). Can be safely removed after a short
         * testing period. boolean classNameseUnique =
         * ECoreContentHelper.areClassNameseUnique(classes); if(!classNameseUnique) {
         * Reporting.getCurrentReporting().prompt("WARNING: \""+setName+"\" are not unique!"); }
         */
        List<String> classNames = classes.stream().map(eClass -> eClass.getName()).collect(Collectors.toList());
        Reporting.getCurrentReporting().reportCollection(setName, classNames, false);
    }

    public static void reportResources(String setName, ResourceSet resourceSet) {
        reportResources(setName, resourceSet.getResources());
    }

    public static void reportResources(String setName, Collection<Resource> resources) {
        List<String> classNames = resources.stream().map(resource -> ECoreContentHelper.getResourceName(resource)).collect(Collectors.toList());
        Reporting.getCurrentReporting().reportCollection(setName, classNames, false);
    }

    public static void reportModelResources(String setName, ResourceSet resourceSet) {
        reportModelResources(setName, resourceSet.getResources());
    }

    public static void reportModelResources(String setName, Collection<Resource> resources) {
        List<String> classNames = resources.stream().map(resource -> ECoreContentHelper.getModelResourceName(resource)).collect(Collectors.toList());
        Reporting.getCurrentReporting().reportCollection(setName, classNames, false);
    }

    public static void persistClassNames(EClassSet classes, String fileName) {
        StringBuilder stringBuilder = new StringBuilder();
        classes.forEach(eClass -> stringBuilder.append(eClass.getName()).append('\n'));
        Reporting.getCurrentReporting().reportToFile(fileName, stringBuilder.toString(), "class list");
    }

    public static void reportResourcesOfClasses(String setName, EClassSet classes) {
        Set<String> resourceNames = ECoreContentHelper.getResourcesOfClasses(classes).stream().map(ECoreContentHelper::getResourceName).collect(Collectors.toSet());
        Reporting.getCurrentReporting().reportCollection(setName, resourceNames, true);
    }
}
