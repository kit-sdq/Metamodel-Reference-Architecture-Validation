package edu.kit.ipd.sdq.kamp4aps.core;

import edu.kit.ipd.sdq.kamp.workplan.AbstractActivityType;

/**
 * This class represents the activity type metamodel. Each type of activity
 * is represented in this class. Basic activities for adding, removing and
 * updating are defined. This is possible for structural as well as 
 * non-structural changes of the system. APS specific is the system
 * calibration and the purchasing activities for mechanical and electrical
 * components.
 * 
 * 
 * @author Sandro Koch
 * @see AbstractActivityType
 */
public enum APSActivityType implements AbstractActivityType {
	ARCHITECTUREMODELDIFF("Architecture-related activity"),
	INTERNALMODIFICATIONMARK("Modification mark"),

	CALIBRATION("Calibration"),
	TEST_EXECUTION("Test execution"),

	// Remove stuff
	REMOVE_COMPONENT("Remove component"),
	REMOVE_MODULE("Remove module"),
	REMOVE_INTERFACE("Remove interface"),
	REMOVE_DOCUMENTATION("Remove Documentation"),

	// Add stuff
	ADD_COMPONENT("Add component"),
	ADD_MODULE("Add module"),
	ADD_INTERFACE("Add interface"),
	ADD_DOCUMENTATION("Add documentation"),

	// Update stuff
	UPDATE_STOCKLIST("Update stocklist"),
	UPDATE_DOCUMENTATION("Update documentation"),
	UPDATE_HMI("Update HMI"),
	UPDATE_CAD("Update CAD"),
	UPDATE_CALIBRATION("Update Calibration"),
	
	// Buy stuff
	BUY_COMPONENT("Buy component"),
	
	// Software
	UPDATE_SOFTWARE("Update Software");
	
	private final String name;
	
	private APSActivityType(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return name;
	}
}
