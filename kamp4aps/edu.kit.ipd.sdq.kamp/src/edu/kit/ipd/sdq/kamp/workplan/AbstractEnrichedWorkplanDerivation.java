package edu.kit.ipd.sdq.kamp.workplan;

import java.util.List;

import edu.kit.ipd.sdq.kamp.architecture.AbstractArchitectureVersion;

/**
 * Calculates an enriched work plan for an architecture, considering secondary
 * model files and further information which are not used by 
 * {@link AbstractWorkplanDerivation}. If you do not have such information or
 * the ordinary work plan derivation already considers everything, this class 
 * might just do nothing at all.
 */
public interface AbstractEnrichedWorkplanDerivation<T extends AbstractArchitectureVersion<?>> {

	/**
	 * Main method of the enriched work plan derivation. Based on an "old" (= base, 
	 * source) version and a changed (= new, target) one, activities should be added
	 * to the <code>activityList</code> (which might already contain activities
	 * determined by {@link AbstractWorkplanDerivation#deriveWorkplan(AbstractArchitectureVersion, AbstractArchitectureVersion)}.
	 */
	List<Activity> deriveEnrichedWorkplan(T baseArchitectureVersion, T subVersion, 
			List<Activity> activityList);
	
}
