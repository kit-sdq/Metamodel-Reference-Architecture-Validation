package edu.kit.ipd.sdq.kamp.workplan;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

import org.eclipse.emf.ecore.EObject;

/**
 * Items of the work plan.
 */
public class Activity {
	private AbstractActivityType type;
	private AbstractActivityElementType elementType;
	private String elementName;
	private EObject element;
	// Causes should be sorted and duplicate-free in workplan
	private SortedSet<String> causingElementsNames;
	private BasicActivity basicActivity;
	private String description;
	
	private Activity parentActivity;
	private List<Activity> subActivities;
	private List<Activity> followupActivities;
	
	public Activity(AbstractActivityType type, AbstractActivityElementType elementType,
			EObject element, String elementName, Collection<String> causingElementsNames,
			BasicActivity basicActivity, String description) {
		super();
		this.type = type;
		this.elementType = elementType;
		this.element = element;
		this.elementName = elementName;
		if (causingElementsNames != null) {
			this.causingElementsNames = new TreeSet<String>(causingElementsNames);
		} else {
			this.causingElementsNames = new TreeSet<String>();
		}
		this.basicActivity = basicActivity;
		this.description = description;
		this.subActivities = new ArrayList<Activity>();
		this.followupActivities = new ArrayList<Activity>();
	}

	public AbstractActivityType getType() {
		return type;
	}

	public AbstractActivityElementType getElementType() {
		return elementType;
	}

	public void setElementType(AbstractActivityElementType elementType) {
		this.elementType = elementType;
	}

	public String getElementName() {
		return elementName;
	}

	public BasicActivity getBasicActivity() {
		return basicActivity;
	}

	public String getDescription() {
		return description;
	}
	
	public void addSubActivities(Collection<Activity> subActivities) {
		for (Activity subActivity: subActivities) {
			this.addSubActivity(subActivity);
		}
	}
	
	public void addSubActivity(Activity subActivity) {
		this.subActivities.add(subActivity);
		subActivity.parentActivity = this;
	}

	public void addFollowUpActivities(Collection<Activity> followUpActivities) {
		for (Activity followUpActivity: followUpActivities) {
			this.addFollowupActivity(followUpActivity);
		}
	}
	
	public void addFollowupActivity(Activity followupActivity) {
		this.followupActivities.add(followupActivity);
		followupActivity.parentActivity = this;
	}

	public EObject getElement() {
		return element;
	}

	public SortedSet<String> getCausingElementsNames() {
		return causingElementsNames;
	}

	public List<Activity> getSubActivities() {
		return subActivities;
	}

	public List<Activity> getFollowupActivities() {
		return followupActivities;
	}

	public Activity getParentActivity() {
		return parentActivity;
	}
	
}
