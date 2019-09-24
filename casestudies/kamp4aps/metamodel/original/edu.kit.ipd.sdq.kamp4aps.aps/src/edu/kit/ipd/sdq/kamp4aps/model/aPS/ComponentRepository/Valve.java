/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.PneumaticSupply;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.SignalInterface;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Valve</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Valve#getPneumaticsupply <em>Pneumaticsupply</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Valve#getPowersupply <em>Powersupply</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Valve#getSignalinterface <em>Signalinterface</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.ComponentRepositoryPackage#getValve()
 * @model abstract="true"
 * @generated
 */
public interface Valve extends Component {
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
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.ComponentRepositoryPackage#getValve_Pneumaticsupply()
	 * @model required="true"
	 * @generated
	 */
	PneumaticSupply getPneumaticsupply();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Valve#getPneumaticsupply <em>Pneumaticsupply</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pneumaticsupply</em>' reference.
	 * @see #getPneumaticsupply()
	 * @generated
	 */
	void setPneumaticsupply(PneumaticSupply value);

	/**
	 * Returns the value of the '<em><b>Powersupply</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Powersupply</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Powersupply</em>' reference.
	 * @see #setPowersupply(PowerSupply)
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.ComponentRepositoryPackage#getValve_Powersupply()
	 * @model required="true"
	 * @generated
	 */
	PowerSupply getPowersupply();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Valve#getPowersupply <em>Powersupply</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Powersupply</em>' reference.
	 * @see #getPowersupply()
	 * @generated
	 */
	void setPowersupply(PowerSupply value);

	/**
	 * Returns the value of the '<em><b>Signalinterface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Signalinterface</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signalinterface</em>' reference.
	 * @see #setSignalinterface(SignalInterface)
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.ComponentRepositoryPackage#getValve_Signalinterface()
	 * @model required="true"
	 * @generated
	 */
	SignalInterface getSignalinterface();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Valve#getSignalinterface <em>Signalinterface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signalinterface</em>' reference.
	 * @see #getSignalinterface()
	 * @generated
	 */
	void setSignalinterface(SignalInterface value);

} // Valve
