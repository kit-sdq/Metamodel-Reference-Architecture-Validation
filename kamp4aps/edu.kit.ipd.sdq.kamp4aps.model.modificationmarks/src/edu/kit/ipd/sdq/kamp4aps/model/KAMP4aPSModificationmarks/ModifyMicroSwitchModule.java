/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.MicroswitchModule;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Modify Micro Switch Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ModifyMicroSwitchModule#isIsReplaced <em>Is Replaced</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.KAMP4aPSModificationmarksPackage#getModifyMicroSwitchModule()
 * @model
 * @generated
 */
public interface ModifyMicroSwitchModule extends ModifyModule<MicroswitchModule> {
	/**
	 * Returns the value of the '<em><b>Is Replaced</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Replaced</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Replaced</em>' attribute.
	 * @see #setIsReplaced(boolean)
	 * @see edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.KAMP4aPSModificationmarksPackage#getModifyMicroSwitchModule_IsReplaced()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsReplaced();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ModifyMicroSwitchModule#isIsReplaced <em>Is Replaced</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Replaced</em>' attribute.
	 * @see #isIsReplaced()
	 * @generated
	 */
	void setIsReplaced(boolean value);

} // ModifyMicroSwitchModule
