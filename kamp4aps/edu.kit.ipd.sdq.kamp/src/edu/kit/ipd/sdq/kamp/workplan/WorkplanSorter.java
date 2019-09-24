package edu.kit.ipd.sdq.kamp.workplan;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Sorts work plan Activities, so they are a) easier to find in huge work plans and
 * b) the work plan is the same even if the Activities where found in a different 
 * order (the same amount of Activities results in same resulting work plan regardless
 * of order).
 */
public class WorkplanSorter {
	
	/**
	 * Sorts the activities by their description (string). The algorithm is applied
	 * recursively to sub- and follow-up-activities.
	 */
	public static void sortWorkplanActivities(List<Activity> activities) {
		Collections.sort(activities, new Comparator<Activity>() {

			@Override
			public int compare(Activity activity1, Activity activity2) {
				return activity1.getDescription().compareTo(activity2.getDescription());
			}
		});
		for (Activity activity: activities) {
			sortWorkplanActivities(activity.getSubActivities());
			sortWorkplanActivities(activity.getFollowupActivities());
		}
	}
	
}
