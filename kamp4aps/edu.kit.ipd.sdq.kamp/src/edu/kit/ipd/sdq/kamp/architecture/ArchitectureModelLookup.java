package edu.kit.ipd.sdq.kamp.architecture;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractChangePropagationStep;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractModification;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractModificationRepository;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.AcceptanceAndConfirmationState;

/**
 * Utility for finding certain architecture elements and modifications in an
 * {@link AbstractArchitectureVersion}.
 */
public class ArchitectureModelLookup {

	/**
	 * Finds all objects of a certain <code>objectClass</code> or sub-class with 
	 * modification marks by searching all {@link ModifyArchitectureElement}s in
	 * the modificationmarks repository of the <code>version</code>.
	 */
	public static <T> Set<T> lookUpMarkedObjectsOfAType(AbstractArchitectureVersion<?> version, 
			Class<T> objectClass) {
		return lookUpMarkedObjectsOfATypeInAnIterator(version.getModificationMarkRepository().
				eAllContents(), objectClass);
	}
	
	public static <T> Set<T> lookUpMarkedObjectsOfATypeInSeedModifications(
			AbstractArchitectureVersion<?> version, Class<T> objectClass) {
		return lookUpMarkedObjectsOfATypeInAnIterator(version.getModificationMarkRepository().
				getSeedModifications().eAllContents(), objectClass);
	}
	
	@SuppressWarnings("unchecked")
	public static <T> Set<T> lookUpMarkedObjectsOfATypeInAnIterator(
			Iterator<?> objectsToSearch, Class<T> objectClass) {
		Set<T> results = new HashSet<T>();
		
		while (objectsToSearch.hasNext()) {
			Object object = objectsToSearch.next();
			if (object instanceof AbstractModification<?,?>) {
				AbstractModification<?, ?> modification = (AbstractModification<?, ?>) object;
				if (modification.getAffectedElement() != null && objectClass.isAssignableFrom(
						modification.getAffectedElement().getClass())) {
					results.add((T) modification.getAffectedElement());
				}
			}	
		}
		
		return results;
	}

	public static <T extends AbstractModification<?,?>> Set<T> lookUpAllModificationMarksOfAType(
			AbstractArchitectureVersion<?> version, Class<T> modificationClass) {	
		return lookUpAllModificationMarksOfATypeInAnIterator(modificationClass, 
				version.getModificationMarkRepository().eAllContents());
	}
	
	public static <T extends AbstractModification<?,?>> Set<T> lookUpAllModificationMarksOfAType(
			AbstractModificationRepository<?,?> modificationRepository, Class<T> modificationClass) {	
		return lookUpAllModificationMarksOfATypeInAnIterator(modificationClass, 
				modificationRepository.eAllContents());
	}
	
	public static <T extends AbstractModification<?,?>> Set<T> lookUpAllSeedModificationMarksOfAType(
			AbstractArchitectureVersion<?> version, Class<T> modificationClass) {	
		return lookUpAllModificationMarksOfATypeInAnIterator(modificationClass, 
				version.getModificationMarkRepository().getSeedModifications().eAllContents());
	}
	
	public static <T extends AbstractModification<?,?>> Set<T> lookUpAllCalculatedMarksOfAType(
			AbstractArchitectureVersion<?> version, Class<T> modificationClass) {
		Set<T> results = new HashSet<T>();
		for (AbstractChangePropagationStep cpStep: version.getModificationMarkRepository().
				getChangePropagationSteps()) {
			results.addAll(lookUpAllModificationMarksOfATypeInAnIterator(
					modificationClass, cpStep.eAllContents()));
		}
		return results;
	}
	
	@SuppressWarnings("unchecked")
	private static <T extends AbstractModification<?,?>> Set<T> lookUpAllModificationMarksOfATypeInAnIterator(
			Class<T> modificationClass, Iterator<?> objectsToSearch) {	
		Set<T> results = new HashSet<T>();
		
		while (objectsToSearch.hasNext()) {
			Object object = objectsToSearch.next();
			if (modificationClass.isAssignableFrom(object.getClass()))
				results.add((T) object);
		}
		
		return results;
	}
	
	@SuppressWarnings("rawtypes")
	public static Set<Object> lookUpExcludedElements(AbstractModificationRepository<?,?> 
			modificationRepository) {
		Set<Object> result = new HashSet<Object>();
		Set<AbstractModification> modificationMarks = lookUpAllModificationMarksOfAType(
				modificationRepository, AbstractModification.class);
		for(AbstractModification<?,?> modificationMark: modificationMarks) {
			if(modificationMark.getUserDecision() == AcceptanceAndConfirmationState.EXCLUDED) {
				result.add(modificationMark.getAffectedElement());
			}
		}
		return result;
	}

}
