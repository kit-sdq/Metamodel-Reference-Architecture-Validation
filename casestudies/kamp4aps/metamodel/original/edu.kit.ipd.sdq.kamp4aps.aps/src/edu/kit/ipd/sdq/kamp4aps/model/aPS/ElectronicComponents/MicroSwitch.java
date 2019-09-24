/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.aPS.ElectronicComponents;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.MicroswitchModule;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Micro Switch</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ElectronicComponents.MicroSwitch#getMsModule <em>Ms Module</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ElectronicComponents.ElectronicComponentsPackage#getMicroSwitch()
 * @model
 * @generated
 */
public interface MicroSwitch extends Switch {
	/**
	 * Returns the value of the '<em><b>Ms Module</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.MicroswitchModule#getSwitch <em>Switch</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ms Module</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ms Module</em>' container reference.
	 * @see #setMsModule(MicroswitchModule)
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ElectronicComponents.ElectronicComponentsPackage#getMicroSwitch_MsModule()
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.MicroswitchModule#getSwitch
	 * @model opposite="switch" required="true" transient="false"
	 * @generated
	 */
	MicroswitchModule getMsModule();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ElectronicComponents.MicroSwitch#getMsModule <em>Ms Module</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ms Module</em>' container reference.
	 * @see #getMsModule()
	 * @generated
	 */
	void setMsModule(MicroswitchModule value);

} // MicroSwitch
