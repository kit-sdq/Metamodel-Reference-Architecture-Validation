/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.BusBox;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.BusCable;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.BusSlave;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.SimpleMotor;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Motor Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.MotorModule#getSimpleMotor <em>Simple Motor</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.MotorModule#getBusSlave <em>Bus Slave</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.MotorModule#getBusBox <em>Bus Box</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.MotorModule#getBusCable <em>Bus Cable</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.ModuleRepositoryPackage#getMotorModule()
 * @model
 * @generated
 */
public interface MotorModule extends Module {
	/**
	 * Returns the value of the '<em><b>Simple Motor</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.SimpleMotor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Simple Motor</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Simple Motor</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.ModuleRepositoryPackage#getMotorModule_SimpleMotor()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<SimpleMotor> getSimpleMotor();

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
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.ModuleRepositoryPackage#getMotorModule_BusSlave()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<BusSlave> getBusSlave();

	/**
	 * Returns the value of the '<em><b>Bus Box</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bus Box</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bus Box</em>' containment reference.
	 * @see #setBusBox(BusBox)
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.ModuleRepositoryPackage#getMotorModule_BusBox()
	 * @model containment="true" required="true"
	 * @generated
	 */
	BusBox getBusBox();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.MotorModule#getBusBox <em>Bus Box</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bus Box</em>' containment reference.
	 * @see #getBusBox()
	 * @generated
	 */
	void setBusBox(BusBox value);

	/**
	 * Returns the value of the '<em><b>Bus Cable</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.BusCable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bus Cable</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bus Cable</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.ModuleRepositoryPackage#getMotorModule_BusCable()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<BusCable> getBusCable();

} // MotorModule
