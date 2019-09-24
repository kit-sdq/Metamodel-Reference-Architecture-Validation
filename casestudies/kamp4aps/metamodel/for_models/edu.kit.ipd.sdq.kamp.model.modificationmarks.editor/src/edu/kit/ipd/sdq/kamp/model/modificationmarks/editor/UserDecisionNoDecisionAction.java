package edu.kit.ipd.sdq.kamp.model.modificationmarks.editor;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IActionDelegate;

import edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractModification;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.AcceptanceAndConfirmationState;

/**
 * Enables setting the {@link AcceptanceAndConfirmationState} of 
 * {@link AbstractModification}s through an Eclipse action.<br>
 * As the action is independent of the concrete models of your architecture and your
 * personal modificationmarks model (as long as you extends AMP's modificationmarks
 * model), this action is ready to use in Eclipse without further changes (in the 
 * context menu of any {@link AbstractModification} element.
 * 
 * @generated NOT
 */
public class UserDecisionNoDecisionAction implements IActionDelegate {

private ISelection selection;
	
	@Override
	public void run(IAction action) {
		Object selectedElement = null;
		if (selection instanceof IStructuredSelection) {
			if (((IStructuredSelection)selection).size() == 1) {
				selectedElement = ((IStructuredSelection)selection).getFirstElement();
			}
		}
		
		if (selectedElement != null && selectedElement instanceof AbstractModification<?,?>) {
			AbstractModification<?,?> modification = ((AbstractModification<?,?>) selectedElement);
			AcceptanceAndConfirmationState oldState = modification.getUserDecision();
			if (oldState != AcceptanceAndConfirmationState.NODECISION) {
				modification.setUserDecision(AcceptanceAndConfirmationState.NODECISION);
			}
		}
	}
	
	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		this.selection = selection;
	}

}
