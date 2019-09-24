/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.Screwing;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Splitter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Splitter#getScrewing <em>Screwing</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.ComponentRepositoryPackage#getSplitter()
 * @model abstract="true"
 * @generated
 */
public interface Splitter extends Component {
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
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.ComponentRepositoryPackage#getSplitter_Screwing()
	 * @model required="true"
	 * @generated
	 */
	Screwing getScrewing();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Splitter#getScrewing <em>Screwing</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Screwing</em>' reference.
	 * @see #getScrewing()
	 * @generated
	 */
	void setScrewing(Screwing value);

} // Splitter
