/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.aPS.ElectronicComponents;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Component;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.PhysicalConnection;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.SignalInterface;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Electronic Part</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ElectronicComponents.ElectronicPart#getPin <em>Pin</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ElectronicComponents.ElectronicPart#getPhysicalconnection <em>Physicalconnection</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ElectronicComponents.ElectronicComponentsPackage#getElectronicPart()
 * @model abstract="true"
 * @generated
 */
public interface ElectronicPart extends Component {
	/**
	 * Returns the value of the '<em><b>Pin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pin</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pin</em>' containment reference.
	 * @see #setPin(SignalInterface)
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ElectronicComponents.ElectronicComponentsPackage#getElectronicPart_Pin()
	 * @model containment="true" required="true"
	 * @generated
	 */
	SignalInterface getPin();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ElectronicComponents.ElectronicPart#getPin <em>Pin</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pin</em>' containment reference.
	 * @see #getPin()
	 * @generated
	 */
	void setPin(SignalInterface value);

	/**
	 * Returns the value of the '<em><b>Physicalconnection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Physicalconnection</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Physicalconnection</em>' containment reference.
	 * @see #setPhysicalconnection(PhysicalConnection)
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ElectronicComponents.ElectronicComponentsPackage#getElectronicPart_Physicalconnection()
	 * @model containment="true" required="true"
	 * @generated
	 */
	PhysicalConnection getPhysicalconnection();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ElectronicComponents.ElectronicPart#getPhysicalconnection <em>Physicalconnection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Physicalconnection</em>' containment reference.
	 * @see #getPhysicalconnection()
	 * @generated
	 */
	void setPhysicalconnection(PhysicalConnection value);

} // ElectronicPart
