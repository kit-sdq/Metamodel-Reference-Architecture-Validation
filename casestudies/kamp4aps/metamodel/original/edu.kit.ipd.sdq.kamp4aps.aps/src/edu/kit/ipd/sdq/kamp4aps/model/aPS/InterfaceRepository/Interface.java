/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository;

import edu.kit.ipd.sdq.kamp4aps.model.basic.Entity;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.Interface#getParentElement <em>Parent Element</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.InterfaceRepositoryPackage#getInterface()
 * @model
 * @generated
 */
public interface Interface extends Entity {
	/**
	 * Returns the value of the '<em><b>Parent Element</b></em>' reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4aps.model.basic.Entity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Element</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Element</em>' reference list.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.InterfaceRepositoryPackage#getInterface_ParentElement()
	 * @model required="true"
	 * @generated
	 */
	EList<Entity> getParentElement();

} // Interface
