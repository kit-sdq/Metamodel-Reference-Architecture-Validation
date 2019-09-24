/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.BusSlave;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.ElectronicComponents.MicroSwitch;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Microswitch Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.MicroswitchModule#getBusSlave <em>Bus Slave</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.MicroswitchModule#getSwitch <em>Switch</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.ModuleRepositoryPackage#getMicroswitchModule()
 * @model
 * @generated
 */
public interface MicroswitchModule extends Module {
	/**
	 * Returns the value of the '<em><b>Bus Slave</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.BusSlave}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bus Slave</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bus Slave</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.ModuleRepositoryPackage#getMicroswitchModule_BusSlave()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<BusSlave> getBusSlave();

	/**
	 * Returns the value of the '<em><b>Switch</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ElectronicComponents.MicroSwitch#getMsModule <em>Ms Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Switch</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Switch</em>' containment reference.
	 * @see #setSwitch(MicroSwitch)
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.ModuleRepositoryPackage#getMicroswitchModule_Switch()
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ElectronicComponents.MicroSwitch#getMsModule
	 * @model opposite="msModule" containment="true" required="true"
	 * @generated
	 */
	MicroSwitch getSwitch();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.MicroswitchModule#getSwitch <em>Switch</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Switch</em>' containment reference.
	 * @see #getSwitch()
	 * @generated
	 */
	void setSwitch(MicroSwitch value);

} // MicroswitchModule
