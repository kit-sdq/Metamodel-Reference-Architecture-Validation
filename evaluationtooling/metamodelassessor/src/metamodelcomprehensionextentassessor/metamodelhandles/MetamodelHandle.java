package metamodelcomprehensionextentassessor.metamodelhandles;

import org.eclipse.emf.ecore.resource.ResourceSet;

import metamodelcomprehensionextentassessor.exceptions.MetamodelAssessorIoException;

public abstract class MetamodelHandle {

    public void load(ResourceSet resourceSet) throws MetamodelAssessorIoException {
        loadInternal(resourceSet);
        if (resourceSet.getResources().size() == 0)
            throw new MetamodelAssessorIoException("No metamodels were found.");
    }

    protected abstract void loadInternal(ResourceSet resourceSet) throws MetamodelAssessorIoException;
}
