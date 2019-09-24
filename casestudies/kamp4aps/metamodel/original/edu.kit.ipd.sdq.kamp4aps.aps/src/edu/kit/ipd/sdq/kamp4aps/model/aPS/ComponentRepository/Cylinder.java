/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.PneumaticSupply;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.SignalInterface;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cylinder</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Cylinder#getPneumaticsupply <em>Pneumaticsupply</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Cylinder#getSignalInterface <em>Signal Interface</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.ComponentRepositoryPackage#getCylinder()
 * @model abstract="true"
 * @generated
 */
public interface Cylinder extends Component {
	/**
	 * Returns the value of the '<em><b>Pneumaticsupply</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pneumaticsupply</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pneumaticsupply</em>' reference.
	 * @see #setPneumaticsupply(PneumaticSupply)
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.ComponentRepositoryPackage#getCylinder_Pneumaticsupply()
	 * @model required="true"
	 * @generated
	 */
	PneumaticSupply getPneumaticsupply();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Cylinder#getPneumaticsupply <em>Pneumaticsupply</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pneumaticsupply</em>' reference.
	 * @see #getPneumaticsupply()
	 * @generated
	 */
	void setPneumaticsupply(PneumaticSupply value);

	/**
	 * Returns the value of the '<em><b>Signal Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Signal Interface</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signal Interface</em>' reference.
	 * @see #setSignalInterface(SignalInterface)
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.ComponentRepositoryPackage#getCylinder_SignalInterface()
	 * @model required="true"
	 * @generated
	 */
	SignalInterface getSignalInterface();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Cylinder#getSignalInterface <em>Signal Interface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signal Interface</em>' reference.
	 * @see #getSignalInterface()
	 * @generated
	 */
	void setSignalInterface(SignalInterface value);

} // Cylinder
