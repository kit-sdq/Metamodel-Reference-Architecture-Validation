/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository;

import edu.kit.ipd.sdq.kamp4aps.model.basic.Entity;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.ComponentRepository#getAllComponentsInPlant <em>All Components In Plant</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.ComponentRepositoryPackage#getComponentRepository()
 * @model
 * @generated
 */
public interface ComponentRepository extends Entity {
	/**
	 * Returns the value of the '<em><b>All Components In Plant</b></em>' reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Component}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>All Components In Plant</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Components In Plant</em>' reference list.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.ComponentRepositoryPackage#getComponentRepository_AllComponentsInPlant()
	 * @model
	 * @generated
	 */
	EList<Component> getAllComponentsInPlant();

} // ComponentRepository
