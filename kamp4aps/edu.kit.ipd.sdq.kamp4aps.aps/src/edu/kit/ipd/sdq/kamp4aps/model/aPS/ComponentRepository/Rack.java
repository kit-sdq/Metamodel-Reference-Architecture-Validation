/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.Screwing;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rack</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Rack#getScrewing_to_base <em>Screwing to base</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.ComponentRepositoryPackage#getRack()
 * @model
 * @generated
 */
public interface Rack extends Component {
	/**
	 * Returns the value of the '<em><b>Screwing to base</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Screwing to base</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Screwing to base</em>' reference.
	 * @see #setScrewing_to_base(Screwing)
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.ComponentRepositoryPackage#getRack_Screwing_to_base()
	 * @model required="true"
	 * @generated
	 */
	Screwing getScrewing_to_base();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Rack#getScrewing_to_base <em>Screwing to base</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Screwing to base</em>' reference.
	 * @see #getScrewing_to_base()
	 * @generated
	 */
	void setScrewing_to_base(Screwing value);

} // Rack
