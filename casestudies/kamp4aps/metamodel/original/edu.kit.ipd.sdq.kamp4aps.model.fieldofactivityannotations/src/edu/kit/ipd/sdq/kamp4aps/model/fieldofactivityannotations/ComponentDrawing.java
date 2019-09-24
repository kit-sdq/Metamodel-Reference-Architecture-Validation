/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Component;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Drawing</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.ComponentDrawing#getDrawn_component <em>Drawn component</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.KAMP4aPSFieldofactivityannotationsPackage#getComponentDrawing()
 * @model
 * @generated
 */
public interface ComponentDrawing extends Drawing {
	/**
	 * Returns the value of the '<em><b>Drawn component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Drawn component</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Drawn component</em>' reference.
	 * @see #setDrawn_component(Component)
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.KAMP4aPSFieldofactivityannotationsPackage#getComponentDrawing_Drawn_component()
	 * @model
	 * @generated
	 */
	Component getDrawn_component();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.ComponentDrawing#getDrawn_component <em>Drawn component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Drawn component</em>' reference.
	 * @see #getDrawn_component()
	 * @generated
	 */
	void setDrawn_component(Component value);

} // ComponentDrawing
