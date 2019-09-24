/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository;

import edu.kit.ipd.sdq.kamp4aps.model.basic.Entity;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Module Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.ModuleRepository#getAllModulesInPlant <em>All Modules In Plant</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.ModuleRepositoryPackage#getModuleRepository()
 * @model
 * @generated
 */
public interface ModuleRepository extends Entity {
	/**
	 * Returns the value of the '<em><b>All Modules In Plant</b></em>' reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.Module}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>All Modules In Plant</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Modules In Plant</em>' reference list.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.ModuleRepositoryPackage#getModuleRepository_AllModulesInPlant()
	 * @model
	 * @generated
	 */
	EList<Module> getAllModulesInPlant();

} // ModuleRepository
