package edu.kit.ipd.sdq.kamp.ui;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IActionDelegate;

import edu.kit.ipd.sdq.kamp.util.FileAndFolderManagement;

/**
 * Copies the content of an Eclipse folder to a new sub-folder. Can be used to
 * create modified architecture versions out of base architecture versions.<br>
 * You can integrate the action into Eclipse by changing a plugin.xml file accordingly.
 */
public class CreateSubalternativeAction implements IActionDelegate {

	public CreateSubalternativeAction() {
	}

	private ISelection selection;
	
	@Override
	public void run(IAction action) {
		
		final String PREFIX = "subversion";
		
		IContainer selectedFolder = FileAndFolderManagement.retrieveSelectedFolder(selection);
		 
		IFolder newFolder = null;
		newFolder = determineNewSubfolder(PREFIX, selectedFolder);

		if (newFolder != null) {
			createFolderIfNotExisting(newFolder);
			copyContentsOfParentFolderIntoSubfolder(selectedFolder, newFolder);
		}
	}

	private void copyContentsOfParentFolderIntoSubfolder(
			IContainer selectedFolder, IFolder newFolder) {
		if (newFolder.exists()) {
			try {
				for (IResource resource : selectedFolder.members()) {
					if (resource instanceof IFile) {
						IPath destination = newFolder.getFullPath().append(resource.getName());
						resource.copy(destination, true, null);
					}
				}
			} catch (CoreException e) {
				throw new RuntimeException(e);
			}
			
		}
	}

	private void createFolderIfNotExisting(IFolder newFolder) {
		if (!newFolder.exists()) {
			try {
				newFolder.create(true, true, null);
			} catch (CoreException e) {
				throw new RuntimeException(e);
			}
		}
	}

	private IFolder determineNewSubfolder(final String PREFIX, IContainer selectedFolder) {
		IFolder newFolder = null;
		int count = 1;
		if (selectedFolder instanceof IFolder) {
			while (((IFolder)selectedFolder).getFolder(PREFIX + count).exists()) {
				count++;
			}
			newFolder = ((IFolder)selectedFolder).getFolder(PREFIX + count);
		} else if (selectedFolder instanceof IProject) {
			while (((IProject)selectedFolder).getFolder(PREFIX + count).exists()) {
				count++;
			}
			newFolder = ((IProject)selectedFolder).getFolder(PREFIX + count);
		}
		return newFolder;
	}
	
	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		this.selection = selection;
	}
}

