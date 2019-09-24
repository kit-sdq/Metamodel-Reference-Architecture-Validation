package metamodelcomprehensionextentassessor.metamodelhandles;

import org.eclipse.emf.ecore.resource.ResourceSet;

import metamodelcomprehensionextentassessor.exceptions.MetamodelAssessorIoException;
import metamodelcomprehensionextentassessor.helpers.PalladioMetamodelHelper;

public class MpcmHandle extends MetamodelHandle {
    @Override
    public void loadInternal(ResourceSet resourceSet) throws MetamodelAssessorIoException {
        PalladioMetamodelHelper.loadMPCMModules(resourceSet);
    }

    @Override
    public String toString() {
        return "mPCM";
    }
}
