package metamodelcomprehensionextentassessor.helpers;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectNature;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.viewers.IStructuredSelection;

import metamodelcomprehensionextentassessor.Reporting;
import metamodelcomprehensionextentassessor.exceptions.MetamodelAssessorIoException;

public class ECoreLoadHelper {

    private ECoreLoadHelper() {
    }

    public static ResourceSet loadMetamodelsFromSelectionAndChildren(ResourceSet resourceSet, IStructuredSelection selection) throws MetamodelAssessorIoException {

        // load metamodels
        Iterator<?> iterator = selection.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            if (next instanceof IFile) {
                loadMetamodelFromFile(resourceSet, (IFile) next);
            } else if (next instanceof IContainer) {
                IContainer container = (IContainer) next;
                loadMetamodelsFromContainerAndChildren(resourceSet, container);
            } else if (next instanceof IProjectNature) {
                IProject project = ((IProjectNature) next).getProject();
                loadMetamodelsFromContainerAndChildren(resourceSet, project);
            } else {
                Reporting.getCurrentReporting().promptAndLog("ERROR: unexpected selection type: " + ((IResource) next).getName());
            }
        }

        return resourceSet;
    }

    public static void loadMetamodelsFromContainerAndChildren(ResourceSet resourceSet, IContainer container) throws MetamodelAssessorIoException {
        IResource[] children;
        try {
            children = container.members();
        } catch (CoreException e) {
            Reporting.getCurrentReporting().reportException("Could not access children of " + container.getName(), e, false);
            return;
        }

        for (IResource child : children) {
            if (child instanceof IContainer) {
                loadMetamodelsFromContainerAndChildren(resourceSet, (IContainer) child);
            } else if (child instanceof IFile) {
                IFile file = (IFile) child;
                if (isEcore(file)) {
                    loadMetamodelFromFile(resourceSet, file);
                }
            }
        }
    }

    public static boolean isEcore(IFile child) {
        return child.getName().toLowerCase().endsWith(".ecore");
    }

    public static void loadMetamodelFromFile(ResourceSet resourceSet, IFile file) throws MetamodelAssessorIoException {
        if (isEcore(file)) {
            loadResourceFromFile(resourceSet, file);
        }
    }

    public static void loadResourceFromFile(ResourceSet resourceSet, IFile file) throws MetamodelAssessorIoException {
        URI uri = EclipseHelper.iFileToUri(file);

        /*
         * Sometimes multiple resources are loaded (out of reasons not clear to me). However, in
         * some situations we only want the one resource at the URI
         */
        ResourceSet tempResourceSet = new ResourceSetImpl();
        Resource resource;
        try {
            resource = tempResourceSet.getResource(uri, true);
        } catch (Exception e) {
            throw new MetamodelAssessorIoException("Could not load file " + file.getName() + ": " + e.getMessage(), e);
        }
        resourceSet.getResources().add(resource);
    }

    public static void loadMetamodelsFromModuleProjects(ResourceSet resourceSet, List<IProject> projects) throws MetamodelAssessorIoException {
        for (IProject project : projects) {
            ECoreLoadHelper.loadMetamodelFromModuleProject(resourceSet, project);
        }
    }

    /**
     * Loads metamodels from a project. Expects the metamodels in the model folder.
     * 
     * @param resourceSet
     *            the loaded metamodels are loaded in the ResourceSet
     * @param project
     *            from which the metamodels should be loaded
     */
    public static void loadMetamodelFromModuleProject(ResourceSet resourceSet, IProject project) throws MetamodelAssessorIoException {
        IFolder modelFolder = project.getFolder("model");
        if (modelFolder.exists()) {

            // count ecores and warn
            Collection<IFile> files = EclipseHelper.getMembersOfContainer(modelFolder, IFile.class);
            Long ecoreCount = files.stream().filter(ECoreLoadHelper::isEcore).collect(Collectors.counting());
            if (ecoreCount > 1) {
                Reporting.getCurrentReporting().promptAndLog("WARNING: multiple metamodels found in module '" + project.getName() + "'. This is unexpected.");
            }

            loadResourcesFromContainer(resourceSet, modelFolder, true);
        } else {
            Reporting.getCurrentReporting().message("WARNING: Skipping project that does not contain model folder: " + project.getName());
        }
    }

    public static void loadResourcesFromContainer(ResourceSet resourceSet, IContainer container, boolean onlyEcore) throws MetamodelAssessorIoException {

        Collection<IFile> files = EclipseHelper.getMembersOfContainer(container, IFile.class);
        for (IFile file : files) {

            //skip txt
            boolean isTextFile = file.getName().toLowerCase().endsWith(".txt");
            if (!isTextFile) {

                if (onlyEcore) {
                    ECoreLoadHelper.loadMetamodelFromFile(resourceSet, file);
                } else {
                    ECoreLoadHelper.loadResourceFromFile(resourceSet, file);
                }
            }
        }
    }

    public static void disposeResourceSet(ResourceSet resourceSet) {
        // unload and delete all resources
        Iterator<Resource> iterator = resourceSet.getResources().iterator();
        while (iterator.hasNext()) {
            Resource res = iterator.next();
            res.unload();
            iterator.remove();
        }
    }
}
