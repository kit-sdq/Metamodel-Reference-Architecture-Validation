/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.Interface;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.Module;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.StructureRepository.Structure;

import edu.kit.ipd.sdq.kamp4aps.model.basic.Entity;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Component#getConnectedInterfaces <em>Connected Interfaces</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Component#getParent <em>Parent</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Component#getParentModule <em>Parent Module</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.ComponentRepositoryPackage#getComponent()
 * @model
 * @generated
 */
public interface Component extends Entity {
	/**
	 * Returns the value of the '<em><b>Connected Interfaces</b></em>' reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.Interface}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connected Interfaces</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connected Interfaces</em>' reference list.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.ComponentRepositoryPackage#getComponent_ConnectedInterfaces()
	 * @model
	 * @generated
	 */
	EList<Interface> getConnectedInterfaces();

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.StructureRepository.Structure#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(Structure)
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.ComponentRepositoryPackage#getComponent_Parent()
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.StructureRepository.Structure#getComponents
	 * @model opposite="components" transient="false"
	 * @generated
	 */
	Structure getParent();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Component#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(Structure value);

	/**
	 * Returns the value of the '<em><b>Parent Module</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.Module#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Module</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Module</em>' container reference.
	 * @see #setParentModule(Module)
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.ComponentRepositoryPackage#getComponent_ParentModule()
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.Module#getComponents
	 * @model opposite="components" transient="false"
	 * @generated
	 */
	Module getParentModule();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Component#getParentModule <em>Parent Module</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Module</em>' container reference.
	 * @see #getParentModule()
	 * @generated
	 */
	void setParentModule(Module value);

} // Component
