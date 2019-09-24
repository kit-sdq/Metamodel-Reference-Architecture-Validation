package metamodelcomprehensionextentassessor.helpers;

import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.emf.ecore.resource.ResourceSet;

import metamodelcomprehensionextentassessor.Reporting;
import metamodelcomprehensionextentassessor.exceptions.MetamodelAssessorIoException;

public class PalladioMetamodelHelper {

    private PalladioMetamodelHelper() {
    }

    public static void loadPCMModules(ResourceSet resourceSet) throws MetamodelAssessorIoException {
        // old way of loading directly from platform: (danger of changes in the metamodel on plugin update)
//        resourceSet.getResource(URI.createURI("platform:/plugin/org.palladiosimulator.pcm/model/pcm.ecore"), true);

        loadModules(resourceSet, "org.palladiosimulator.pcm", 1);
    }

    public static void loadMPCMModules(ResourceSet resourceSet) throws MetamodelAssessorIoException {
        loadModules(resourceSet, "mpcm.", 23);
    }

    private static void loadModules(ResourceSet resourceSet, String prefix, int expectedModules) throws MetamodelAssessorIoException {

        List<IProject> projects = EclipseHelper.getProjectsWithPrefix(prefix);

        Reporting currentReporting = Reporting.getCurrentReporting();
        if (projects.size() != expectedModules) {
            currentReporting.promptAndLog("WARNING: I found " + projects.size() + " projects. I expect " + expectedModules + '.');
        }
        ECoreLoadHelper.loadMetamodelsFromModuleProjects(resourceSet, projects);

        Reporting.getCurrentReporting().message("Loaded " + projects.size() + " metamodel modules.");
    }
}
