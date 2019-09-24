/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.ProfibusDPSlave;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.MechanicalComponents.Housing;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.MechanicalComponents.ReturnSpring;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Monostable Cylinder</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.MonostableCylinder#getHousing <em>Housing</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.MonostableCylinder#getSpring <em>Spring</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.MonostableCylinder#getReedSwitches <em>Reed Switches</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.MonostableCylinder#getCylinderPart <em>Cylinder Part</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.MonostableCylinder#getValve <em>Valve</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.MonostableCylinder#getBusSlave <em>Bus Slave</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.ComponentRepositoryPackage#getMonostableCylinder()
 * @model
 * @generated
 */
public interface MonostableCylinder extends Cylinder {
	/**
	 * Returns the value of the '<em><b>Housing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Housing</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Housing</em>' containment reference.
	 * @see #setHousing(Housing)
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.ComponentRepositoryPackage#getMonostableCylinder_Housing()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Housing getHousing();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.MonostableCylinder#getHousing <em>Housing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Housing</em>' containment reference.
	 * @see #getHousing()
	 * @generated
	 */
	void setHousing(Housing value);

	/**
	 * Returns the value of the '<em><b>Spring</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Spring</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spring</em>' containment reference.
	 * @see #setSpring(ReturnSpring)
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.ComponentRepositoryPackage#getMonostableCylinder_Spring()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ReturnSpring getSpring();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.MonostableCylinder#getSpring <em>Spring</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spring</em>' containment reference.
	 * @see #getSpring()
	 * @generated
	 */
	void setSpring(ReturnSpring value);

	/**
	 * Returns the value of the '<em><b>Reed Switches</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.ReedSwitch}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reed Switches</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reed Switches</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.ComponentRepositoryPackage#getMonostableCylinder_ReedSwitches()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ReedSwitch> getReedSwitches();

	/**
	 * Returns the value of the '<em><b>Cylinder Part</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.CylinderPart}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cylinder Part</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cylinder Part</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.ComponentRepositoryPackage#getMonostableCylinder_CylinderPart()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<CylinderPart> getCylinderPart();

	/**
	 * Returns the value of the '<em><b>Valve</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.RegularValve}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Valve</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valve</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.ComponentRepositoryPackage#getMonostableCylinder_Valve()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<RegularValve> getValve();

	/**
	 * Returns the value of the '<em><b>Bus Slave</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.ProfibusDPSlave}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bus Slave</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bus Slave</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.ComponentRepositoryPackage#getMonostableCylinder_BusSlave()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ProfibusDPSlave> getBusSlave();

} // MonostableCylinder
