package edu.kit.ipd.sdq.kamp.propagation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;

import edu.kit.ipd.sdq.kamp.architecture.ArchitectureModelLookup;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractChangePropagationStep;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractModification;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractModificationRepository;

/**
 * Considers user decisions for modifications calculated by the change propagation 
 * algorithm.
 * 
 * @see #considerUserDecisions(AbstractModificationRepository)
 */
public class UserDecisionAnalysis {

	/**
	 * The algorithm consists of three steps.
	 * <ol><li>Determine all modifications in the <code>modificationRepository</code>
	 * whose {@link AcceptanceAndConfirmationState} equals "EXCLUDED" (sematics: the 
	 * user does not want the corresponding affected element to be marked, so if the
	 * affected element occurs in multiple modifications, all those modifications will
	 * be removed).</li>
	 * <li>If an element should not be marked as modification, all other modifications
	 * which are only caused by the first modification should also be removed. Therefore,
	 * the algorithm checks all elements excluded by the user and removes them as causes
	 * from further modifications. If all causes of a further modification are removed,
	 * the affected element is also considered as "EXCLUDED" and the consequences are
	 * calculated, so the algorithm is transitive and iterates until there is no change.</li>
	 * <li>Remove all modifications whose affected elements were determined by the 
	 * previous step from the <code>modificationRepository</code>.</li></ol>
	 * Be aware that this algorithm is independent of the concrete propagation steps, so
	 * it has not to be adapted if you add further ones. It does dependent on the causes
	 * of modifications, so if you want the exclusion to propagate correctly, you should 
	 * set the causes references (the algorithm in this class considers causing DataTypes
	 * and Entities, but if you have further causes in you modification model, you can
	 * easily sub-type this class and override {@link #removeCauseForElement(ModifyArchitectureElement, Object)}
	 * and {@link #hasModificationNoCauses(ModifyArchitectureElement)}. 
	 */
	@SuppressWarnings("rawtypes")
	public static void considerUserDecisions(AbstractModificationRepository<?,?> modificationRepository) {
		List<Object> elementsToAnalyze = new ArrayList<Object>(ArchitectureModelLookup.
				lookUpExcludedElements(modificationRepository));
		List<Object> elementsToRemove = new ArrayList<Object>(elementsToAnalyze);	
		Collection<AbstractModification> modifications = ArchitectureModelLookup.
				lookUpAllModificationMarksOfAType(modificationRepository, AbstractModification.class);
		
		while (!elementsToAnalyze.isEmpty()) {
			Object objectToAnalyze = elementsToAnalyze.remove(0);
			for (AbstractModification modification: modifications) {
				boolean objectIsCause = removeCauseForElement(modification, objectToAnalyze);
				if (objectIsCause && hasModificationNoCauses(modification) && 
						!elementsToRemove.contains(modification.getAffectedElement())) {
					elementsToRemove.add(modification.getAffectedElement());
					elementsToAnalyze.add(modification.getAffectedElement());
				}
			}
		}
		
		removeModificationsForElementsFromRepository(elementsToRemove, modificationRepository);
	}
	
	/**
	 * Tries to remove the <code>cause</code> from the list of causes.
	 *
	 * @return Was a cause removed?
	 */
	protected static boolean removeCauseForElement(AbstractModification<?,?> 
			modification, Object cause) {
		return modification.getCausingElements().remove(cause);
	}
	
	/**
	 * The causes for a modification determined by the propagation algorithm might already 
	 * be removed by this user decision algorithm, so there are no causes left.
	 */
	protected static boolean hasModificationNoCauses(AbstractModification<?,?> modification) {
		return modification.getCausingElements().isEmpty();
	}
	
	/**
	 * Removes all modifications from the <code>modificationRepository</code> whose
	 * affected elements are contained in <code>affectedElementsToRemove</code>.
	 * If an ChangePropagationStep does not contains any modifications after this
	 * step, it is also removed.
	 */
	protected static void removeModificationsForElementsFromRepository(Collection<Object> 
			affectedElementsToRemove, AbstractModificationRepository<?,?> modificationRepository) {
		if (!affectedElementsToRemove.isEmpty()) {
			//Removing directly in iterator throws exception
			Collection<EObject> modificationsToRemove = new LinkedList<EObject>();
			
			TreeIterator<EObject> iterator = modificationRepository.eAllContents();			
			while (iterator.hasNext()) {
				EObject nextObject = iterator.next();
				if (nextObject instanceof AbstractModification) {
					AbstractModification<?,?> modification = 
							(AbstractModification<?,?>) nextObject;
					if (affectedElementsToRemove.contains(modification.getAffectedElement())) {
						modificationsToRemove.add(modification);
					}
				}
			}
			
			for (EObject modification: modificationsToRemove) {
				EcoreUtil.remove(modification);
			}
			
			for (AbstractChangePropagationStep step: new ArrayList<AbstractChangePropagationStep>(
					modificationRepository.getChangePropagationSteps())) {
				if (step.eContents().isEmpty()) {
					modificationRepository.getChangePropagationSteps().remove(step);
				}
			}
		}
	}
	
}
