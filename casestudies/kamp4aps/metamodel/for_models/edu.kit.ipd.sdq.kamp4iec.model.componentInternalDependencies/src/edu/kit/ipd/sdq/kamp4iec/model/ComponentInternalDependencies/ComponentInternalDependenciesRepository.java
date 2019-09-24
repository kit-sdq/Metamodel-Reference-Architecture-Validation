/**
 */
package edu.kit.ipd.sdq.kamp4iec.model.ComponentInternalDependencies;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.ComponentInternalDependencies.ComponentInternalDependenciesRepository#getHasFunctionblockDependency <em>Has Functionblock Dependency</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.kamp4iec.model.ComponentInternalDependencies.ComponentInternalDependenciesPackage#getComponentInternalDependenciesRepository()
 * @model
 * @generated
 */
public interface ComponentInternalDependenciesRepository extends EObject {
	/**
	 * Returns the value of the '<em><b>Has Functionblock Dependency</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4iec.model.ComponentInternalDependencies.FunctionblockDependency}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Functionblock Dependency</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Functionblock Dependency</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.ComponentInternalDependencies.ComponentInternalDependenciesPackage#getComponentInternalDependenciesRepository_HasFunctionblockDependency()
	 * @model containment="true"
	 * @generated
	 */
	EList<FunctionblockDependency> getHasFunctionblockDependency();

} // ComponentInternalDependenciesRepository
