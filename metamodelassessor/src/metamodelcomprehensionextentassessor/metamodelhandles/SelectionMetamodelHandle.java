package metamodelcomprehensionextentassessor.metamodelhandles;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jface.viewers.IStructuredSelection;

import metamodelcomprehensionextentassessor.exceptions.MetamodelAssessorIoException;
import metamodelcomprehensionextentassessor.helpers.ECoreLoadHelper;

public class SelectionMetamodelHandle extends MetamodelHandle {
    private IStructuredSelection selection;

    public SelectionMetamodelHandle(IStructuredSelection selection) {
        this.selection = selection;
    }

    @Override
    public void loadInternal(ResourceSet resourceSet) throws MetamodelAssessorIoException {
        ECoreLoadHelper.loadMetamodelsFromSelectionAndChildren(resourceSet, selection);
    }

    @Override
    public String toString() {
        return "Selection";
    }
}
