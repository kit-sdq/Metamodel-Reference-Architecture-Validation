/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.aPS.MechanicalComponents;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.MechanicalAssembly;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.PhysicalConnection;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.Screwing;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ramp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.MechanicalComponents.Ramp#getScrewing_base <em>Screwing base</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.MechanicalComponents.Ramp#getScrewing_component <em>Screwing component</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.MechanicalComponents.Ramp#getPhysicalconnection <em>Physicalconnection</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.MechanicalComponents.MechanicalComponentsPackage#getRamp()
 * @model abstract="true"
 * @generated
 */
public interface Ramp extends MechanicalAssembly {
	/**
	 * Returns the value of the '<em><b>Screwing base</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Screwing base</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Screwing base</em>' reference.
	 * @see #setScrewing_base(Screwing)
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.MechanicalComponents.MechanicalComponentsPackage#getRamp_Screwing_base()
	 * @model required="true"
	 * @generated
	 */
	Screwing getScrewing_base();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.MechanicalComponents.Ramp#getScrewing_base <em>Screwing base</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Screwing base</em>' reference.
	 * @see #getScrewing_base()
	 * @generated
	 */
	void setScrewing_base(Screwing value);

	/**
	 * Returns the value of the '<em><b>Screwing component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Screwing component</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Screwing component</em>' reference.
	 * @see #setScrewing_component(Screwing)
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.MechanicalComponents.MechanicalComponentsPackage#getRamp_Screwing_component()
	 * @model required="true"
	 * @generated
	 */
	Screwing getScrewing_component();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.MechanicalComponents.Ramp#getScrewing_component <em>Screwing component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Screwing component</em>' reference.
	 * @see #getScrewing_component()
	 * @generated
	 */
	void setScrewing_component(Screwing value);

	/**
	 * Returns the value of the '<em><b>Physicalconnection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Physicalconnection</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Physicalconnection</em>' reference.
	 * @see #setPhysicalconnection(PhysicalConnection)
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.MechanicalComponents.MechanicalComponentsPackage#getRamp_Physicalconnection()
	 * @model required="true"
	 * @generated
	 */
	PhysicalConnection getPhysicalconnection();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.MechanicalComponents.Ramp#getPhysicalconnection <em>Physicalconnection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Physicalconnection</em>' reference.
	 * @see #getPhysicalconnection()
	 * @generated
	 */
	void setPhysicalconnection(PhysicalConnection value);

} // Ramp
