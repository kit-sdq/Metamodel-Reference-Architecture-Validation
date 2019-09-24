package edu.kit.ipd.sdq.kamp.ui;

import java.util.List;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.PlatformUI;

import edu.kit.ipd.sdq.kamp.architecture.AbstractArchitectureVersion;
import edu.kit.ipd.sdq.kamp.architecture.AbstractArchitectureVersionPersistency;
import edu.kit.ipd.sdq.kamp.util.FileAndFolderManagement;
import edu.kit.ipd.sdq.kamp.workplan.AbstractEnrichedWorkplanDerivation;
import edu.kit.ipd.sdq.kamp.workplan.AbstractWorkplanDerivation;
import edu.kit.ipd.sdq.kamp.workplan.Activity;
import edu.kit.ipd.sdq.kamp.workplan.WorkplanDuplicateRemoval;
import edu.kit.ipd.sdq.kamp.workplan.WorkplanSorter;

/**
 * Derives a base work plan (added/removed elements, modifications found by the
 * propagation algorithm) as well as an enriched work plan (considering secondary
 * model files and additional information). Both work plans are sorted and 
 * duplicate-free (on the same activity level there should only be one activity 
 * per model element). Sub-classes should fix the type parameter and provide values
 * for the fields <code>workplanDerivation</code>, <code>enrichedWorkplanDerivation</code> 
 * and <code>architectureVersionPersistency</code>. If they are initialized properly, 
 * you do not need to change any of the methods belonging to this class, but it should
 * work directly.<br>
 * The action should be started from the folder containing the modified architecture
 * version (how it is started depends on your code, change a plugin.xml file to 
 * integrate the action into Eclipse).
 */
public abstract class AbstractDeriveWorkplanAction<T extends AbstractArchitectureVersion<?>> implements IActionDelegate {
	
	private AbstractWorkplanDerivation<? super T> workplanDerivation;
	private AbstractEnrichedWorkplanDerivation<? super T> enrichedWorkplanDerivation;
	private AbstractArchitectureVersionPersistency<? extends T> architectureVersionPersistency;
	private ISelection selection;

	@Override
	public void run(IAction action) {		
		IContainer selectedFolder = FileAndFolderManagement.retrieveSelectedFolder(this.getSelection());
		
		if (selectedFolder != null) {
			T targetversion = loadVersion(selectedFolder, "target");
			T baseversion = loadVersion((IContainer)selectedFolder.getParent(), "base");
			
			if ((baseversion != null) && (targetversion != null)) {
				String username = System.getProperty("user.name");
				String usernameSuffix = (username != null) ? "-" + username : "";	
				
				List<Activity> baseActivityList = this.getWorkplanDerivation().
						deriveWorkplan(baseversion, targetversion);
				baseActivityList = WorkplanDuplicateRemoval.removeModificationDuplicates(baseActivityList);
				WorkplanSorter.sortWorkplanActivities(baseActivityList);	
				this.getArchitectureVersionPersistency().saveActivityListToExcelFile(
						selectedFolder.getFullPath().toString(), "workplan-base"+usernameSuffix, 
						baseActivityList);
				
				List<Activity> enrichedActivityList = this.getEnrichedWorkplanDerivation().
						deriveEnrichedWorkplan(baseversion, targetversion, baseActivityList);
				WorkplanSorter.sortWorkplanActivities(enrichedActivityList);
				this.getArchitectureVersionPersistency().saveActivityListToExcelFile(
						selectedFolder.getFullPath().toString(), "workplan-enriched"+usernameSuffix, 
						enrichedActivityList);
				
				showMessage("Activity lists have been calculated.");
				refreshAllProjectsInWorkspace();
			}
			if (baseversion == null) {
				showMessage("Activity list could not be calculated, as the base version was not found.");
			}
			if (targetversion == null) {
				showMessage("Activity list could not be calculated, as the target version was not found.");
			}
		}
	}
	
	protected T loadVersion(IContainer folder, String versionName) {
		T result = null;
		if (folder != null) {
			result = this.getArchitectureVersionPersistency().load(folder, versionName);
		}
		return result;
	}
	
	public static void showMessage(String text) {
		if ((text != null) && !(text.trim().equals(""))) {
			Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
		    int style = SWT.ICON_INFORMATION;	   
		    MessageBox messageBox = new MessageBox(shell, style);
		    messageBox.setMessage(text);
		    messageBox.open();
		}
	}
	
	protected static void refreshAllProjectsInWorkspace() {
		for (IProject project : ResourcesPlugin.getWorkspace().getRoot().getProjects()) {
			try {
				project.refreshLocal(IProject.DEPTH_INFINITE, null);
			} catch (CoreException e) {
				throw new RuntimeException(e);
			}
		}
	}
	
	protected ISelection getSelection() {
		return selection;
	}
	
	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		this.selection = selection;
	}

	protected AbstractWorkplanDerivation<? super T> getWorkplanDerivation() {
		return workplanDerivation;
	}

	protected void setWorkplanDerivation(AbstractWorkplanDerivation<? super T> differenceCalculation) {
		this.workplanDerivation = differenceCalculation;
	}

	protected AbstractEnrichedWorkplanDerivation<? super T> getEnrichedWorkplanDerivation() {
		return enrichedWorkplanDerivation;
	}

	protected void setEnrichedWorkplanDerivation(AbstractEnrichedWorkplanDerivation<? super T> enrichedWorkplanDerivation) {
		this.enrichedWorkplanDerivation = enrichedWorkplanDerivation;
	}

	protected AbstractArchitectureVersionPersistency<? extends T> getArchitectureVersionPersistency() {
		return architectureVersionPersistency;
	}

	protected void setArchitectureVersionPersistency(AbstractArchitectureVersionPersistency<? extends T> architectureVersionPersistency) {
		this.architectureVersionPersistency = architectureVersionPersistency;
	}

}
