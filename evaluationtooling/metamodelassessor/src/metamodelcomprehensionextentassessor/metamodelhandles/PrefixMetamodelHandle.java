package metamodelcomprehensionextentassessor.metamodelhandles;

import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.emf.ecore.resource.ResourceSet;

import metamodelcomprehensionextentassessor.Reporting;
import metamodelcomprehensionextentassessor.exceptions.MetamodelAssessorIoException;
import metamodelcomprehensionextentassessor.helpers.ECoreLoadHelper;
import metamodelcomprehensionextentassessor.helpers.EclipseHelper;

public class PrefixMetamodelHandle extends MetamodelHandle {
    private String prefix;

    public PrefixMetamodelHandle(String prefix) {
        this.prefix = prefix;
    }

//    public String getPrefix() {
//        return prefix;
//    }

    @Override
    public void loadInternal(ResourceSet resourceSet) throws MetamodelAssessorIoException {
        List<IProject> projects = EclipseHelper.getProjectsWithPrefix(prefix);
        ECoreLoadHelper.loadMetamodelsFromModuleProjects(resourceSet, projects);
        Reporting.getCurrentReporting().message("Loaded " + projects.size() + " metamodel modules.");
    }

    @Override
    public String toString() {
        return prefix;
    }
}
