/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Power Splitter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.PowerSplitter#getPowersupply <em>Powersupply</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.ComponentRepositoryPackage#getPowerSplitter()
 * @model
 * @generated
 */
public interface PowerSplitter extends Splitter {
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
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.ComponentRepositoryPackage#getPowerSplitter_Powersupply()
	 * @model required="true"
	 * @generated
	 */
	PowerSupply getPowersupply();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.PowerSplitter#getPowersupply <em>Powersupply</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Powersupply</em>' reference.
	 * @see #getPowersupply()
	 * @generated
	 */
	void setPowersupply(PowerSupply value);

} // PowerSplitter
