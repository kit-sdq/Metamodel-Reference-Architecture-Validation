package edu.kit.ipd.sdq.kamp.ui;

import org.eclipse.core.resources.IContainer;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IActionDelegate;

import edu.kit.ipd.sdq.kamp.architecture.AbstractArchitectureVersion;
import edu.kit.ipd.sdq.kamp.architecture.AbstractArchitectureVersionPersistency;
import edu.kit.ipd.sdq.kamp.util.FileAndFolderManagement;

/**
 * Creates a new set of model files (initialization depends on {@link #createArchitectureVersion()},
 * representing all necessary elements of an architecture, and saves them in the current folder.<br>
 * You can integrate the action into Eclipse by changing a plugin.xml file accordingly.
 */
public abstract class AbstractCreateEmptyBaseModelAction<T extends AbstractArchitectureVersion<?>> 
		implements IActionDelegate {

	private AbstractArchitectureVersionPersistency<? super T> architectureVersionPersistency;
	private ISelection selection;
	
	/**
	 * Create an initialized version of your architecture here. Each field of the 
	 * created version should have a value assigned which represents one top-level
	 * element of a model file.
	 */
	protected abstract T createArchitectureVersion();
	
	@Override
	public void run(IAction action) {
		IContainer selectedFolder = FileAndFolderManagement.retrieveSelectedFolder(selection);
		if (selectedFolder != null) {
			T version = this.createArchitectureVersion();
			this.getArchitectureVersionPersistency().save(selectedFolder.getFullPath().toString(), 
					"architecturemodel", version);
		}
		
	}
	
	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		this.selection = selection;
	}

	protected AbstractArchitectureVersionPersistency<? super T> getArchitectureVersionPersistency() {
		return architectureVersionPersistency;
	}

	protected void setArchitectureVersionPersistency(AbstractArchitectureVersionPersistency<? super T> architectureVersionPersistency) {
		this.architectureVersionPersistency = architectureVersionPersistency;
	}
}
