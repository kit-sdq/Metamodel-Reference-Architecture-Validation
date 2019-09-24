package edu.kit.ipd.sdq.kamp.workplan;

/**
 * ActivityElementTypes refer to the kind of elements that can be affected by an
 * Activity. You might want to introduce enums (which implement this interface) for 
 * that purpose in your sub-project.
 */
public interface AbstractActivityElementType {
	
	String getName();
	
	Class<?> getElementClass();
	
}
