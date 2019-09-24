/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.BusSlave;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.InductiveSensor;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inductive Sensor Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.InductiveSensorModule#getInductiveSensor <em>Inductive Sensor</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.InductiveSensorModule#getBusSlave <em>Bus Slave</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.ModuleRepositoryPackage#getInductiveSensorModule()
 * @model
 * @generated
 */
public interface InductiveSensorModule extends Module {
	/**
	 * Returns the value of the '<em><b>Inductive Sensor</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.InductiveSensor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inductive Sensor</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inductive Sensor</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.ModuleRepositoryPackage#getInductiveSensorModule_InductiveSensor()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<InductiveSensor> getInductiveSensor();

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
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.ModuleRepositoryPackage#getInductiveSensorModule_BusSlave()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<BusSlave> getBusSlave();

} // InductiveSensorModule
