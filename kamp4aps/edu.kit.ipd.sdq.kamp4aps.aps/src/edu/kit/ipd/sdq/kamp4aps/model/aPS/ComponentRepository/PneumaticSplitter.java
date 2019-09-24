/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.PneumaticSupply;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pneumatic Splitter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.PneumaticSplitter#getPneumaticsupply <em>Pneumaticsupply</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.ComponentRepositoryPackage#getPneumaticSplitter()
 * @model
 * @generated
 */
public interface PneumaticSplitter extends Splitter {
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
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.ComponentRepositoryPackage#getPneumaticSplitter_Pneumaticsupply()
	 * @model
	 * @generated
	 */
	PneumaticSupply getPneumaticsupply();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.PneumaticSplitter#getPneumaticsupply <em>Pneumaticsupply</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pneumaticsupply</em>' reference.
	 * @see #getPneumaticsupply()
	 * @generated
	 */
	void setPneumaticsupply(PneumaticSupply value);

} // PneumaticSplitter
