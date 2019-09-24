package metamodelcomprehensionextentassessor.metamodelhandles;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectNature;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jface.viewers.IStructuredSelection;

import metamodelcomprehensionextentassessor.Reporting;
import metamodelcomprehensionextentassessor.exceptions.MetamodelAssessorIoException;
import metamodelcomprehensionextentassessor.helpers.ECoreLoadHelper;

public class MultipleModularMetamodelsHandle extends MetamodelHandle {

    private IStructuredSelection selection;
    private List<IContainer> metamodelContainers;
    private boolean metamodelsSearched;
    private int currentContainer;

    public MultipleModularMetamodelsHandle(IStructuredSelection selection) {
        this.selection = selection;
        metamodelsSearched = false;
        currentContainer = 0;
        metamodelContainers = new ArrayList<>();
    }

    public boolean hasNext() {
        return !metamodelsSearched || currentContainer < metamodelContainers.size();
    }

    @Override
    protected void loadInternal(ResourceSet resourceSet) throws MetamodelAssessorIoException {
        if (!metamodelsSearched) {
            searchFoldersContainingMetamodels();
            metamodelsSearched = true;
        }

        if (metamodelContainers.size() == 0) {
            throw new MetamodelAssessorIoException("No Folders found that contain metamodels.");
        }

        ECoreLoadHelper.loadResourcesFromContainer(resourceSet, getCurrentContainer(), true);
    }

    public void advance() {
        currentContainer++;
    }

    private void searchFoldersContainingMetamodels() throws MetamodelAssessorIoException {
        Iterator<?> iterator = selection.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            if (next instanceof IContainer) {
                IContainer container = (IContainer) next;
                searchRecursively(container);
            } else if (next instanceof IProjectNature) {
                IProject project = ((IProjectNature) next).getProject();
                searchRecursively(project);
            } else {
                throw new MetamodelAssessorIoException("Unexpected selection type: " + ((IResource) next).getName());
            }
        }
        Reporting.getCurrentReporting().message("Found " + metamodelContainers.size() + " metamodel containers.");
    }

    private void searchRecursively(IContainer container) {
        IResource[] children;
        try {
            children = container.members();
        } catch (CoreException e) {
            Reporting.getCurrentReporting().reportException("Could not access children of " + container.getName(), e, false);
            return;
        }

        if (containEcore(children)) {
            // found a metamodel folder, subfolders are ignored
            metamodelContainers.add(container);
        } else {
            // recursive descend
            for (IResource child : children) {
                if (child instanceof IContainer) {
                    searchRecursively((IContainer) child);
                }
            }
        }
    }

    private static boolean containEcore(IResource[] children) {
        boolean containsEcore = false;
        for (IResource child : children) {
            if (child instanceof IFile) {
                IFile file = (IFile) child;
                if (ECoreLoadHelper.isEcore(file)) {
                    containsEcore = true;
                    break;
                }
            }
        }
        return containsEcore;
    }

    @Override
    public String toString() {
        if (metamodelsSearched && currentContainer < metamodelContainers.size()) {
            IContainer current = getCurrentContainer();
            return current.getParent().getName() + ' ' + current.getName();
        } else {
            return "MultipleModularMetamodels";
        }
    }

    private IContainer getCurrentContainer() {
        return metamodelContainers.get(currentContainer);
    }
}
