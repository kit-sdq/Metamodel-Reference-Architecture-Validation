package edu.kit.ipd.sdq.kamp.model.modificationmarks.editor;

import java.util.List;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.PlatformUI;

import edu.kit.ipd.sdq.kamp.architecture.AbstractArchitectureVersion;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractModificationRepository;
import edu.kit.ipd.sdq.kamp.ui.AbstractDeriveWorkplanAction;
import edu.kit.ipd.sdq.kamp.workplan.Activity;
import edu.kit.ipd.sdq.kamp.workplan.WorkplanDuplicateRemoval;
import edu.kit.ipd.sdq.kamp.workplan.WorkplanSorter;

/**
 * Derives a work plan containing added/removed elements, modifications found by 
 * the propagation algorithm and "enriched" information (considering secondary model 
 * files and additional information). The work plan is sorted and duplicate-free 
 * (on the same activity level there should only be one activity per model element).
 * Sub-classes should fix the type parameter "T" and then the action should work without
 * further changes necessary.<br>
 * The action should be started from an AbstractModificationRepository element in a
 * *.modificationmarks file (how it is started depends on your code, change a 
 * plugin.xml file to integrate the action into Eclipse.
 * 
 * @generated NOT
 */
public abstract class AbstractArchitectureBasedWorkplanDerivationAction<T extends AbstractArchitectureVersion<?>>
	extends AbstractDeriveWorkplanAction<T> {

	@Override
	public void run(IAction action) {
		Object selectedElement = null;
		if (this.getSelection() instanceof IStructuredSelection) {
			if (((IStructuredSelection)this.getSelection()).size()==1) {
				selectedElement = ((IStructuredSelection)this.getSelection()).getFirstElement();
			}
		}
		
		if (selectedElement != null) {
			if (selectedElement instanceof AbstractModificationRepository) {
				URI resourceURI = ((AbstractModificationRepository<?,?>)selectedElement).eResource().getURI();
				String nameOfTargetVersionFolder = resourceURI.trimSegments(1).lastSegment();
				String targetFolderPathString = resourceURI.trimSegments(1).toPlatformString(false);
				IFile currentFile = ResourcesPlugin.getWorkspace().getRoot().getFile(
						new Path(resourceURI.toPlatformString(false)));
				IContainer targetFolder = currentFile.getParent();
				IContainer baseFolder = targetFolder.getParent();
				
				T targetversion = loadVersion(targetFolder, "target");	
				T baseversion = loadVersion(baseFolder, "base");
				
				if ((baseversion != null) && (targetversion != null)) {
					String username = System.getProperty("user.name");
					String usernameSuffix = (username != null) ? username : "";
					
					List<Activity> baseActivityList = this.getWorkplanDerivation().
							deriveWorkplan(baseversion, targetversion);
					baseActivityList = WorkplanDuplicateRemoval.removeModificationDuplicates(baseActivityList);
					List<Activity> enrichedActivityList = this.getEnrichedWorkplanDerivation().
							deriveEnrichedWorkplan(baseversion, targetversion, baseActivityList);
					WorkplanSorter.sortWorkplanActivities(enrichedActivityList);			
					this.getArchitectureVersionPersistency().saveActivityListToExcelFile(
							targetFolderPathString, "activitylist-" + usernameSuffix + "-"
							+ nameOfTargetVersionFolder, enrichedActivityList);
					
					showMessage("Activity list has been calculated.");
					PlatformUI.getWorkbench().saveAllEditors(false);				
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
	}

}
