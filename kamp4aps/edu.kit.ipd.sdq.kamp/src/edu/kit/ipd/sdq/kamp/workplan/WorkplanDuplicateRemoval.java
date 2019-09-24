package edu.kit.ipd.sdq.kamp.workplan;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;

import edu.kit.ipd.sdq.kamp.util.MapUtil;

/**
 * An element might be detected as possible modification by multiple propagation
 * steps, leading to multiple activities for the same elements. This utility merges 
 * such activities to make the work plan free of duplicates.
 */
public class WorkplanDuplicateRemoval {

	/**
	 * Goes through the list of activities and merges modification activities (all
	 * other kinds of BasicActivity are just copied) such that there is only one 
	 * modification activity per affected element and ActivityType. The merged list 
	 * is returned so the input list remains unchanged.
	 */
	public static List<Activity> removeModificationDuplicates(List<Activity> actvityList) {
		List<Activity> result = new LinkedList<Activity>();
		Map<EObject, Set<Activity>> objectsWithActivity = new HashMap<EObject, Set<Activity>>();
		
		for (Activity activityToAnalyze: actvityList) {
			if (activityToAnalyze.getBasicActivity().equals(BasicActivity.MODIFY)) {
				boolean merged = false;
				if (objectsWithActivity.containsKey(activityToAnalyze.getElement())) {
					for (Activity existingActivity: objectsWithActivity.get(activityToAnalyze.getElement())) {
						//Besides the element, the ActivityType should be the same.
						if (existingActivity.getElement().equals(activityToAnalyze.getElement())
								&& existingActivity.getType().equals(activityToAnalyze.getType())) {
							mergeActivities(existingActivity, activityToAnalyze);
							merged = true;
							break;
						}
					}
				}
				if (!merged) { // no activity for element or no activity with same type
					Activity modificationActivity = copyActivity(activityToAnalyze);
					result.add(modificationActivity);
					MapUtil.putOrAddToMap(objectsWithActivity, modificationActivity.getElement(), 
							modificationActivity);
				}
			} else { // no modification activity
				result.add(copyActivity(activityToAnalyze));
			}
		}
		
		return result;
	}

	/**
	 * Creates a new Activity with the same attribute values. Recursive
	 * with regard to sub- and follow-up-activities.
	 */
	private static Activity copyActivity(Activity activityToCopy) {
		Activity result = new Activity(activityToCopy.getType(), activityToCopy.getElementType(), 
				activityToCopy.getElement(), activityToCopy.getElementName(), 
				activityToCopy.getCausingElementsNames(), activityToCopy.getBasicActivity(), 
				activityToCopy.getDescription());
		for (Activity subActivity: activityToCopy.getSubActivities()) {
			result.addSubActivity(copyActivity(subActivity));
		}
		for (Activity followUpActivity: activityToCopy.getFollowupActivities()) {
			result.addFollowupActivity(copyActivity(followUpActivity));
		}
		return result;
	}
	
	/**
	 * Adds information from the <code>activityToAnalyze</code> to the 
	 * <code>existingActivity</code>. It is assumed that the following 
	 * attributes are already equal (some of them checked in the calling method):
	 * <ul><li>type (same type is condition for merge)</li>
	 * <li>elementName (should be the same if element the same)</li>
	 * <li>element (same element is condition for merge)</li>
	 * <li>basicActivity ({@link BasicActivity#MODIFY} is condition for merge)</li>
	 * <li>description (should be the same for the same type and element)</li>
	 * <li>parentActivity (only sub-activities of the same parent should be merged)</li></ul>
	 */
	private static void mergeActivities(Activity existingActivity, Activity activityToAnalyze) {
		// Merge follow-up activities and remove duplicates (recursive)
		List<Activity> followUpActivities = new LinkedList<Activity>();
		followUpActivities.addAll(existingActivity.getFollowupActivities());
		followUpActivities.addAll(activityToAnalyze.getFollowupActivities());
		followUpActivities = removeModificationDuplicates(followUpActivities);
		existingActivity.getFollowupActivities().clear();
		existingActivity.addFollowUpActivities(followUpActivities);
		
		// Merge sub-activities and remove duplicates (recursive)
		List<Activity> subActivities = new LinkedList<Activity>();
		subActivities.addAll(existingActivity.getSubActivities());
		subActivities.addAll(activityToAnalyze.getSubActivities());
		subActivities = removeModificationDuplicates(subActivities);
		existingActivity.getSubActivities().clear();
		existingActivity.addSubActivities(subActivities);

		// Use more specific ActivityElementType
		if (existingActivity.getElementType().getElementClass().isAssignableFrom(
				activityToAnalyze.getElementType().getElementClass())) {
			existingActivity.setElementType(activityToAnalyze.getElementType());
		}
		
		// Sorted, duplicate-free list of causes (automatically because of type)
		existingActivity.getCausingElementsNames().addAll(
				activityToAnalyze.getCausingElementsNames());
	}
	
}
