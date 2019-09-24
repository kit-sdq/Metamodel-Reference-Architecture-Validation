/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.BusSlave;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.PresenceSensor;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Presence Sensor Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.PresenceSensorModule#getPresenceSensor <em>Presence Sensor</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.PresenceSensorModule#getBusSlave <em>Bus Slave</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.ModuleRepositoryPackage#getPresenceSensorModule()
 * @model
 * @generated
 */
public interface PresenceSensorModule extends Module {
	/**
	 * Returns the value of the '<em><b>Presence Sensor</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.PresenceSensor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Presence Sensor</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Presence Sensor</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.ModuleRepositoryPackage#getPresenceSensorModule_PresenceSensor()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<PresenceSensor> getPresenceSensor();

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
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.ModuleRepositoryPackage#getPresenceSensorModule_BusSlave()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<BusSlave> getBusSlave();

} // PresenceSensorModule
