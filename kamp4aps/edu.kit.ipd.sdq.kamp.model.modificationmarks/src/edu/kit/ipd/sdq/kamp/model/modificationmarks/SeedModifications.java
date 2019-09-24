/**
 */
package edu.kit.ipd.sdq.kamp.model.modificationmarks;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Seed Modifications</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp.model.modificationmarks.SeedModifications#getSeedElements <em>Seed Elements</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.kamp.model.modificationmarks.ModificationmarksPackage#getSeedModifications()
 * @model
 * @generated
 */
public interface SeedModifications extends AbstractSeedModifications {
	/**
	 * Returns the value of the '<em><b>Seed Elements</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Seed Elements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Seed Elements</em>' reference list.
	 * @see edu.kit.ipd.sdq.kamp.model.modificationmarks.ModificationmarksPackage#getSeedModifications_SeedElements()
	 * @model
	 * @generated
	 */
	EList<EObject> getSeedElements();

} // SeedModifications
