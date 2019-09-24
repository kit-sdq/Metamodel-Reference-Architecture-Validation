package edu.kit.ipd.sdq.kamp.workplan;

/**
 * Describes a very basic categorization of Activities.
 */
public enum BasicActivity {
	ADD("Add"), 
	MODIFY("Modify"), 
	REMOVE("Remove"), 
	EXECUTE("Execute"), 
	CHECKANDUPDATE("Check and update");
	
	private final String name;
	
	private BasicActivity(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
}
