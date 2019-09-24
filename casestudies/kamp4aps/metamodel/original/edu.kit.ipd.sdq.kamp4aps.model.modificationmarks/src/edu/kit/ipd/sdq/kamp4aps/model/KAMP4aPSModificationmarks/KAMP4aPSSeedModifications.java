/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks;

import edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractSeedModifications;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Component;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.Interface;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.Module;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.StructureRepository.Structure;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>KAMP 4a PS Seed Modifications</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.KAMP4aPSSeedModifications#getStructureModifications <em>Structure Modifications</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.KAMP4aPSSeedModifications#getModuleModifications <em>Module Modifications</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.KAMP4aPSSeedModifications#getComponentModifications <em>Component Modifications</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.KAMP4aPSSeedModifications#getInterfaceModifications <em>Interface Modifications</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.KAMP4aPSModificationmarksPackage#getKAMP4aPSSeedModifications()
 * @model
 * @generated
 */
public interface KAMP4aPSSeedModifications extends AbstractSeedModifications {
	/**
	 * Returns the value of the '<em><b>Structure Modifications</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ModifyStructure}&lt;edu.kit.ipd.sdq.kamp4aps.model.aPS.StructureRepository.Structure>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Structure Modifications</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Structure Modifications</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.KAMP4aPSModificationmarksPackage#getKAMP4aPSSeedModifications_StructureModifications()
	 * @model containment="true"
	 * @generated
	 */
	EList<ModifyStructure<Structure>> getStructureModifications();

	/**
	 * Returns the value of the '<em><b>Module Modifications</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ModifyModule}&lt;edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.Module>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Module Modifications</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Module Modifications</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.KAMP4aPSModificationmarksPackage#getKAMP4aPSSeedModifications_ModuleModifications()
	 * @model containment="true"
	 * @generated
	 */
	EList<ModifyModule<Module>> getModuleModifications();

	/**
	 * Returns the value of the '<em><b>Component Modifications</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ModifyComponent}&lt;edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Component>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component Modifications</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Modifications</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.KAMP4aPSModificationmarksPackage#getKAMP4aPSSeedModifications_ComponentModifications()
	 * @model containment="true"
	 * @generated
	 */
	EList<ModifyComponent<Component>> getComponentModifications();

	/**
	 * Returns the value of the '<em><b>Interface Modifications</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ModifyInterface}&lt;edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.Interface>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface Modifications</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface Modifications</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.KAMP4aPSModificationmarksPackage#getKAMP4aPSSeedModifications_InterfaceModifications()
	 * @model containment="true"
	 * @generated
	 */
	EList<ModifyInterface<Interface>> getInterfaceModifications();

} // KAMP4aPSSeedModifications
