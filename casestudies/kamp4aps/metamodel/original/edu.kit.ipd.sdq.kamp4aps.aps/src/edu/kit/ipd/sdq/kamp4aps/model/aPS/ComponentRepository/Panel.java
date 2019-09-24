/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Panel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Panel#getComponentRepository <em>Component Repository</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.ComponentRepositoryPackage#getPanel()
 * @model abstract="true"
 * @generated
 */
public interface Panel extends Component {
	/**
	 * Returns the value of the '<em><b>Component Repository</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component Repository</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Repository</em>' reference.
	 * @see #setComponentRepository(Component)
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.ComponentRepositoryPackage#getPanel_ComponentRepository()
	 * @model required="true"
	 * @generated
	 */
	Component getComponentRepository();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Panel#getComponentRepository <em>Component Repository</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Repository</em>' reference.
	 * @see #getComponentRepository()
	 * @generated
	 */
	void setComponentRepository(Component value);

} // Panel
