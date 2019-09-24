/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.Gearing;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.Screwing;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Motor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Motor#getGearing <em>Gearing</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Motor#getScrewing <em>Screwing</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Motor#getPowersupply <em>Powersupply</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.ComponentRepositoryPackage#getMotor()
 * @model abstract="true"
 * @generated
 */
public interface Motor extends Component {
	/**
	 * Returns the value of the '<em><b>Gearing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gearing</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gearing</em>' reference.
	 * @see #setGearing(Gearing)
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.ComponentRepositoryPackage#getMotor_Gearing()
	 * @model required="true"
	 * @generated
	 */
	Gearing getGearing();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Motor#getGearing <em>Gearing</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gearing</em>' reference.
	 * @see #getGearing()
	 * @generated
	 */
	void setGearing(Gearing value);

	/**
	 * Returns the value of the '<em><b>Screwing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Screwing</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Screwing</em>' reference.
	 * @see #setScrewing(Screwing)
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.ComponentRepositoryPackage#getMotor_Screwing()
	 * @model required="true"
	 * @generated
	 */
	Screwing getScrewing();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Motor#getScrewing <em>Screwing</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Screwing</em>' reference.
	 * @see #getScrewing()
	 * @generated
	 */
	void setScrewing(Screwing value);

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
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.ComponentRepositoryPackage#getMotor_Powersupply()
	 * @model required="true"
	 * @generated
	 */
	PowerSupply getPowersupply();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Motor#getPowersupply <em>Powersupply</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Powersupply</em>' reference.
	 * @see #getPowersupply()
	 * @generated
	 */
	void setPowersupply(PowerSupply value);

} // Motor
