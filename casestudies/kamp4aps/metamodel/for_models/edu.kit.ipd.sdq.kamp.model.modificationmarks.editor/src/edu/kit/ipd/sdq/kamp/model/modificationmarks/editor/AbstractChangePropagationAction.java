package edu.kit.ipd.sdq.kamp.model.modificationmarks.editor;

import java.io.IOException;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.PlatformUI;

import edu.kit.ipd.sdq.kamp.architecture.AbstractArchitectureVersion;
import edu.kit.ipd.sdq.kamp.architecture.AbstractArchitectureVersionPersistency;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractModificationRepository;
import edu.kit.ipd.sdq.kamp.propagation.AbstractChangePropagationAnalysis;
import edu.kit.ipd.sdq.kamp.ui.AbstractDeriveWorkplanAction;

/**
 * Runs the change propagation algorithm of 
 * {@link AbstractChangePropagationAnalysis#runChangePropagationAnalysis(AbstractArchitectureVersion)},
 * based on a *.modificationmarks file which is loaded and saved (with the modifications 
 * found by an {@link AbstractArchitectureVersionPersistency}). As the loading/
 * saving and calculating the propagation are highly model-dependent, those 
 * components have to be plugged in to the action. If they are provided properly, 
 * the whole action should run without further changes required.<br>
 * The action should be started from an AbstractModificationRepository element in a
 * *.modificationmarks file (how it is started depends on your code, change a 
 * plugin.xml file to integrate the action into Eclipse.
 * 
 * @generated NOT
 */
public abstract class AbstractChangePropagationAction <T extends AbstractArchitectureVersion<?>> implements IActionDelegate {

	private ISelection selection;
	
	protected abstract AbstractChangePropagationAnalysis<T> createChangePropagationAnalysis();
	
	protected abstract AbstractArchitectureVersionPersistency<T> createArchitectureVersionPersistency();

	@Override
	public void run(IAction action) {

		PlatformUI.getWorkbench().saveAllEditors(false);
		AbstractArchitectureVersionPersistency<T> architectureVersionPersistency = this.createArchitectureVersionPersistency();
		
		Object selectedElement = null;
		if (selection instanceof IStructuredSelection) {
			if (((IStructuredSelection)selection).size()==1) {
				selectedElement = ((IStructuredSelection)selection).getFirstElement();
			}
		}
		
		if (selectedElement != null) {
			if (selectedElement instanceof AbstractModificationRepository) {
				URI resourceURI = ((AbstractModificationRepository<?,?>)selectedElement).eResource().getURI();
				String fileName = resourceURI.trimFileExtension().lastSegment();
				String folderPathString = resourceURI.trimSegments(1).toPlatformString(false);
				IFolder folder = ResourcesPlugin.getWorkspace().getRoot().getFolder(new Path(folderPathString));

				T targetversion = null;
				if (folderPathString != null) {
					targetversion = architectureVersionPersistency.load(folder, "target");
				}
				
				if (targetversion != null) {
					//Clear results of previous run and start new run
					targetversion.getModificationMarkRepository().getChangePropagationSteps().clear();
					this.createChangePropagationAnalysis().runChangePropagationAnalysis(targetversion);
					try {
						architectureVersionPersistency.saveModificationMarkFile(folderPathString, fileName, targetversion);
					} catch (IOException e) {
						throw new RuntimeException(e);
					}
				}
				
				if (!targetversion.getModificationMarkRepository().getChangePropagationSteps().isEmpty()) {
					AbstractDeriveWorkplanAction.showMessage("Propagation steps have been added to the tree.");
				} else {
					AbstractDeriveWorkplanAction.showMessage("No propagation steps could be found.");
				}
				
				PlatformUI.getWorkbench().saveAllEditors(false);
			}
		}	
	}

	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		this.selection = selection;
	}
	
}
