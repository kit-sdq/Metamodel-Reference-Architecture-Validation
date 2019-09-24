/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.BusBox;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.BusCable;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.BusSlave;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.ElectronicComponents.Potentiometer;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.MechanicalComponents.Table;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.MicroswitchModule;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.Module;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Turning Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.TurningTable#getRack_for_turningtable <em>Rack for turningtable</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.TurningTable#getTable_to_stand_on <em>Table to stand on</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.TurningTable#getMotor_to_drive <em>Motor to drive</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.TurningTable#getMicroswitchModule <em>Microswitch Module</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.TurningTable#getBusSlave <em>Bus Slave</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.TurningTable#getBusBox <em>Bus Box</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.TurningTable#getBusCable <em>Bus Cable</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.TurningTable#getPotentiometer <em>Potentiometer</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.ComponentRepositoryPackage#getTurningTable()
 * @model
 * @generated
 */
public interface TurningTable extends Module {
	/**
	 * Returns the value of the '<em><b>Rack for turningtable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rack for turningtable</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rack for turningtable</em>' containment reference.
	 * @see #setRack_for_turningtable(Rack)
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.ComponentRepositoryPackage#getTurningTable_Rack_for_turningtable()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Rack getRack_for_turningtable();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.TurningTable#getRack_for_turningtable <em>Rack for turningtable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rack for turningtable</em>' containment reference.
	 * @see #getRack_for_turningtable()
	 * @generated
	 */
	void setRack_for_turningtable(Rack value);

	/**
	 * Returns the value of the '<em><b>Table to stand on</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table to stand on</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table to stand on</em>' containment reference.
	 * @see #setTable_to_stand_on(Table)
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.ComponentRepositoryPackage#getTurningTable_Table_to_stand_on()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Table getTable_to_stand_on();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.TurningTable#getTable_to_stand_on <em>Table to stand on</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table to stand on</em>' containment reference.
	 * @see #getTable_to_stand_on()
	 * @generated
	 */
	void setTable_to_stand_on(Table value);

	/**
	 * Returns the value of the '<em><b>Motor to drive</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Motor to drive</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Motor to drive</em>' containment reference.
	 * @see #setMotor_to_drive(SimpleMotor)
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.ComponentRepositoryPackage#getTurningTable_Motor_to_drive()
	 * @model containment="true" required="true"
	 * @generated
	 */
	SimpleMotor getMotor_to_drive();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.TurningTable#getMotor_to_drive <em>Motor to drive</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Motor to drive</em>' containment reference.
	 * @see #getMotor_to_drive()
	 * @generated
	 */
	void setMotor_to_drive(SimpleMotor value);

	/**
	 * Returns the value of the '<em><b>Microswitch Module</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.MicroswitchModule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Microswitch Module</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Microswitch Module</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.ComponentRepositoryPackage#getTurningTable_MicroswitchModule()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<MicroswitchModule> getMicroswitchModule();

	/**
	 * Returns the value of the '<em><b>Bus Slave</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bus Slave</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bus Slave</em>' containment reference.
	 * @see #setBusSlave(BusSlave)
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.ComponentRepositoryPackage#getTurningTable_BusSlave()
	 * @model containment="true" required="true"
	 * @generated
	 */
	BusSlave getBusSlave();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.TurningTable#getBusSlave <em>Bus Slave</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bus Slave</em>' containment reference.
	 * @see #getBusSlave()
	 * @generated
	 */
	void setBusSlave(BusSlave value);

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
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.ComponentRepositoryPackage#getTurningTable_BusBox()
	 * @model containment="true" required="true"
	 * @generated
	 */
	BusBox getBusBox();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.TurningTable#getBusBox <em>Bus Box</em>}' containment reference.
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
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.ComponentRepositoryPackage#getTurningTable_BusCable()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<BusCable> getBusCable();

	/**
	 * Returns the value of the '<em><b>Potentiometer</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ElectronicComponents.Potentiometer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Potentiometer</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Potentiometer</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.ComponentRepositoryPackage#getTurningTable_Potentiometer()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Potentiometer> getPotentiometer();

} // TurningTable
