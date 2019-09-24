/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository;

import edu.kit.ipd.sdq.kamp4aps.model.basic.Entity;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.InterfaceRepository#getAllInterfacesInPlant <em>All Interfaces In Plant</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.InterfaceRepositoryPackage#getInterfaceRepository()
 * @model
 * @generated
 */
public interface InterfaceRepository extends Entity {
	/**
	 * Returns the value of the '<em><b>All Interfaces In Plant</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.Interface}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>All Interfaces In Plant</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Interfaces In Plant</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.InterfaceRepositoryPackage#getInterfaceRepository_AllInterfacesInPlant()
	 * @model containment="true"
	 * @generated
	 */
	EList<Interface> getAllInterfacesInPlant();

} // InterfaceRepository
