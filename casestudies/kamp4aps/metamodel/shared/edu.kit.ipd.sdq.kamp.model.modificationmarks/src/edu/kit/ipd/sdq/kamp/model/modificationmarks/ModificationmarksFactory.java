/**
 */
package edu.kit.ipd.sdq.kamp.model.modificationmarks;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see edu.kit.ipd.sdq.kamp.model.modificationmarks.ModificationmarksPackage
 * @generated
 */
public interface ModificationmarksFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModificationmarksFactory eINSTANCE = edu.kit.ipd.sdq.kamp.model.modificationmarks.impl.ModificationmarksFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Modification Repository</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Modification Repository</em>'.
	 * @generated
	 */
	ModificationRepository createModificationRepository();

	/**
	 * Returns a new object of class '<em>Seed Modifications</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Seed Modifications</em>'.
	 * @generated
	 */
	SeedModifications createSeedModifications();

	/**
	 * Returns a new object of class '<em>Change Propagation Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Change Propagation Step</em>'.
	 * @generated
	 */
	ChangePropagationStep createChangePropagationStep();

	/**
	 * Returns a new object of class '<em>Modification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Modification</em>'.
	 * @generated
	 */
	Modification createModification();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ModificationmarksPackage getModificationmarksPackage();

} //ModificationmarksFactory
