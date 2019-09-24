package metamodelcomprehensionextentassessor.helpers;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectNature;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;

import metamodelcomprehensionextentassessor.exceptions.MetamodelAssessorIoException;

public class EclipseHelper {
    private EclipseHelper() {
    }

    public static IProject getProjectOfSelection(IStructuredSelection selection) throws MetamodelAssessorIoException {
        Object firstSelection = selection.getFirstElement();
        if (firstSelection instanceof IFile) {
            return ((IFile) firstSelection).getProject();
        } else if (firstSelection instanceof IProject) {
            return (IProject) firstSelection;
        } else if (firstSelection instanceof IProjectNature) {
            return ((IProjectNature) firstSelection).getProject();
        } else {
            throw new MetamodelAssessorIoException("Unknown type of first selection.");
        }
    }

    public static Path iFileToPath(IFile file) {
        return file.getLocation().makeAbsolute().toFile().toPath();
    }

    public static URI iFileToUri(IFile file) {
        return URI.createPlatformResourceURI(file.getFullPath().toString(), true);
    }

    public static <T> Collection<T> getMembersOfContainer(IContainer container, Class<T> type) throws MetamodelAssessorIoException {

        IResource[] members;
        try {
            members = container.members();
        } catch (CoreException e) {
            throw new MetamodelAssessorIoException("Failed reading content of folder " + container.getFullPath(), e);
        }

        return Arrays.stream(members).filter(type::isInstance).map(type::cast).collect(Collectors.toList());
    }

    public static Shell getShell() {
        return PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
    }

    public static void prompt(String message, Shell shell) {
        Display.getDefault().asyncExec(() -> MessageDialog.openInformation(shell, "Metamodel Assessor", message));
    }

    public static List<String> readLinesOfFile(IFile iFile) throws MetamodelAssessorIoException {
        Path path = iFileToPath(iFile);
        try {
            return Files.readAllLines(path);
        } catch (IOException e) {
            throw new MetamodelAssessorIoException("Could not read file " + iFile.toString(), e);
        }
    }

    public static IProject createDummyProject(String name) {
        IWorkspaceRoot workspaceRoot = ResourcesPlugin.getWorkspace().getRoot();
        IProject project = workspaceRoot.getProject(name);
        return project;
    }

    public static List<IProject> getProjectsWithPrefix(String prefix) {
        List<IProject> projectList = new ArrayList<>();
        IWorkspaceRoot workspaceRoot = ResourcesPlugin.getWorkspace().getRoot();
        IProject[] projects = workspaceRoot.getProjects();
        for (IProject project : projects) {
            if (project.isOpen() && project.getName().toLowerCase().startsWith(prefix.toLowerCase())) {
                projectList.add(project);
            }
        }
        return projectList;
    }
}
