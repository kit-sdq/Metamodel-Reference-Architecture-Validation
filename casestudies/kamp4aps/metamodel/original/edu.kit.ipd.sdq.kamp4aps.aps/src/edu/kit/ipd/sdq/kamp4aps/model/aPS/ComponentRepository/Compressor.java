/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.ElectronicComponents.Switch;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.PneumaticSupply;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.Screwing;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.SignalInterface;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compressor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Compressor#getPowersupply <em>Powersupply</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Compressor#getPneumaticsupply <em>Pneumaticsupply</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Compressor#getPins <em>Pins</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Compressor#getScrewing <em>Screwing</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Compressor#getSwitch <em>Switch</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.ComponentRepositoryPackage#getCompressor()
 * @model
 * @generated
 */
public interface Compressor extends Component {
	/**
	 * Returns the value of the '<em><b>Powersupply</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Powersupply</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Powersupply</em>' containment reference.
	 * @see #setPowersupply(PowerSupply)
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.ComponentRepositoryPackage#getCompressor_Powersupply()
	 * @model containment="true" required="true"
	 * @generated
	 */
	PowerSupply getPowersupply();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Compressor#getPowersupply <em>Powersupply</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Powersupply</em>' containment reference.
	 * @see #getPowersupply()
	 * @generated
	 */
	void setPowersupply(PowerSupply value);

	/**
	 * Returns the value of the '<em><b>Pneumaticsupply</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.PneumaticSupply}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pneumaticsupply</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pneumaticsupply</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.ComponentRepositoryPackage#getCompressor_Pneumaticsupply()
	 * @model containment="true"
	 * @generated
	 */
	EList<PneumaticSupply> getPneumaticsupply();

	/**
	 * Returns the value of the '<em><b>Pins</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.SignalInterface}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pins</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pins</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.ComponentRepositoryPackage#getCompressor_Pins()
	 * @model containment="true" lower="2" upper="2"
	 * @generated
	 */
	EList<SignalInterface> getPins();

	/**
	 * Returns the value of the '<em><b>Screwing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Screwing</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Screwing</em>' containment reference.
	 * @see #setScrewing(Screwing)
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.ComponentRepositoryPackage#getCompressor_Screwing()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Screwing getScrewing();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Compressor#getScrewing <em>Screwing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Screwing</em>' containment reference.
	 * @see #getScrewing()
	 * @generated
	 */
	void setScrewing(Screwing value);

	/**
	 * Returns the value of the '<em><b>Switch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Switch</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Switch</em>' containment reference.
	 * @see #setSwitch(Switch)
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.ComponentRepositoryPackage#getCompressor_Switch()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Switch getSwitch();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Compressor#getSwitch <em>Switch</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Switch</em>' containment reference.
	 * @see #getSwitch()
	 * @generated
	 */
	void setSwitch(Switch value);

} // Compressor
