package edu.kit.ipd.sdq.kamp.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;

/**
 * Provides some utilities for Eclipse resource handling.
 */
public class FileAndFolderManagement {

	public static IContainer retrieveSelectedFolder(ISelection aselection) {
		if (aselection instanceof IStructuredSelection) {
			IStructuredSelection structuredSelection;
			structuredSelection = (IStructuredSelection) aselection;
	
			List<IContainer> selectedFolders = new ArrayList<IContainer>();
	
			for (Object partSelection : structuredSelection.toList()) {
				if (partSelection instanceof IFolder || partSelection instanceof IProject) {
					selectedFolders.add((IContainer) partSelection);
				}
			}
			
			if (selectedFolders.size()==1) {
				return selectedFolders.get(0);
			}
		}
		
		return null;
	}
	
	/**
	 * Returns the first file with the specified extension in the folder.
	 */
	public static IFile retrieveFileWithExtension(IContainer folder, String fileExtension) {
		try {
			for (IResource resource : folder.members()) {
				if (resource instanceof IFile) {
					if (resource.getFileExtension().equals(fileExtension)) {
						return (IFile) resource;
					}
					
				}
			}
		} catch (CoreException e) {
			throw new RuntimeException(e);
		}
		
		return null;
	}

	/**
	 * Returns all files with the specified extension in the folder.
	 */
	public static Collection<IFile> retrieveFilesWithExtension(IContainer folder, String fileExtension) {
		List<IFile> result = new LinkedList<IFile>();
		try {
			for (IResource resource : folder.members()) {
				if (resource instanceof IFile) {
					if (resource.getFileExtension().equals(fileExtension)) {
						result.add((IFile) resource);
					}
					
				}
			}
		} catch (CoreException e) {
			throw new RuntimeException(e);
		}
		return result;
	}

}
