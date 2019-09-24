/**
 */
package edu.kit.ipd.sdq.kamp.model.modificationmarks;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Modification Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractModificationRepository#getSeedModifications <em>Seed Modifications</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractModificationRepository#getChangePropagationSteps <em>Change Propagation Steps</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.kamp.model.modificationmarks.ModificationmarksPackage#getAbstractModificationRepository()
 * @model abstract="true"
 * @generated
 */
public interface AbstractModificationRepository<S extends AbstractSeedModifications, T extends AbstractChangePropagationStep> extends EObject {
	/**
	 * Returns the value of the '<em><b>Seed Modifications</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Seed Modifications</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Seed Modifications</em>' containment reference.
	 * @see #setSeedModifications(AbstractSeedModifications)
	 * @see edu.kit.ipd.sdq.kamp.model.modificationmarks.ModificationmarksPackage#getAbstractModificationRepository_SeedModifications()
	 * @model containment="true" required="true"
	 * @generated
	 */
	S getSeedModifications();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractModificationRepository#getSeedModifications <em>Seed Modifications</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Seed Modifications</em>' containment reference.
	 * @see #getSeedModifications()
	 * @generated
	 */
	void setSeedModifications(S value);

	/**
	 * Returns the value of the '<em><b>Change Propagation Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Change Propagation Steps</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change Propagation Steps</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.kamp.model.modificationmarks.ModificationmarksPackage#getAbstractModificationRepository_ChangePropagationSteps()
	 * @model containment="true"
	 * @generated
	 */
	EList<T> getChangePropagationSteps();

} // AbstractModificationRepository
