package edu.kit.ipd.sdq.kamp.model.modificationmarks.editor;

import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.PlatformUI;

import edu.kit.ipd.sdq.kamp.architecture.AbstractArchitectureVersionPersistency;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractModificationRepository;
import edu.kit.ipd.sdq.kamp.propagation.UserDecisionAnalysis;
import edu.kit.ipd.sdq.kamp.ui.AbstractDeriveWorkplanAction;

/**
 * Considers user decisions (accept, exclude, no decision) in the *.modificationmarks
 * file, running the {@link UserDecisionAnalysis#considerUserDecisions(AbstractModificationRepository)} 
 * algorithm and saving the result.<br>
 * As the action is independent of the concrete models of your architecture and your
 * personal modificationmarks model (as long as you extends AMP's modificationmarks
 * model), this action is ready to use in Eclipse without further changes (in the 
 * context menu of {@link AbstractModificationRepository} elements.
 * 
 * @generated NOT
 */
public class UserDecisionApplyAction implements IActionDelegate {
	
	private ISelection selection;
	
	@Override
	public void run(IAction action) {
		PlatformUI.getWorkbench().saveAllEditors(false);	
		Object selectedElement = null;
		if (selection instanceof IStructuredSelection) {
			if (((IStructuredSelection)selection).size() == 1) {
				selectedElement = ((IStructuredSelection)selection).getFirstElement();
			}
		}
		
		if (selectedElement != null && selectedElement instanceof AbstractModificationRepository) {
			AbstractModificationRepository<?,?> modificationRepository =
					(AbstractModificationRepository<?,?>) selectedElement;
			UserDecisionAnalysis.considerUserDecisions(modificationRepository);		
			
			String fileName = modificationRepository.eResource().getURI().lastSegment();
			String folderPathString = modificationRepository.eResource().getURI().
					trimSegments(1).toPlatformString(false);
			AbstractArchitectureVersionPersistency.saveEmfModelToResource(modificationRepository, 
					folderPathString, fileName, new ResourceSetImpl());
			AbstractDeriveWorkplanAction.showMessage("User actions are considered.");		
			PlatformUI.getWorkbench().saveAllEditors(false);
		}
	}
	
	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		this.selection = selection;
	}

}
