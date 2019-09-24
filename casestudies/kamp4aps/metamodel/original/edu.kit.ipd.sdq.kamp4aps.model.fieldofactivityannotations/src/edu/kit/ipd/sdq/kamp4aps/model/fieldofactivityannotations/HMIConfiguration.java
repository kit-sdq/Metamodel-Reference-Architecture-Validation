/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Component;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.Interface;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.Module;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.StructureRepository.Structure;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HMI Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.HMIConfiguration#getName <em>Name</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.HMIConfiguration#getComponents <em>Components</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.HMIConfiguration#getModules <em>Modules</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.HMIConfiguration#getInterfaces <em>Interfaces</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.HMIConfiguration#getStructures <em>Structures</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.HMIConfiguration#getParent <em>Parent</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.KAMP4aPSFieldofactivityannotationsPackage#getHMIConfiguration()
 * @model
 * @generated
 */
public interface HMIConfiguration extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.KAMP4aPSFieldofactivityannotationsPackage#getHMIConfiguration_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.HMIConfiguration#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Components</b></em>' reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Component}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Components</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Components</em>' reference list.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.KAMP4aPSFieldofactivityannotationsPackage#getHMIConfiguration_Components()
	 * @model
	 * @generated
	 */
	EList<Component> getComponents();

	/**
	 * Returns the value of the '<em><b>Modules</b></em>' reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.Module}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modules</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modules</em>' reference list.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.KAMP4aPSFieldofactivityannotationsPackage#getHMIConfiguration_Modules()
	 * @model
	 * @generated
	 */
	EList<Module> getModules();

	/**
	 * Returns the value of the '<em><b>Interfaces</b></em>' reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.Interface}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interfaces</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interfaces</em>' reference list.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.KAMP4aPSFieldofactivityannotationsPackage#getHMIConfiguration_Interfaces()
	 * @model
	 * @generated
	 */
	EList<Interface> getInterfaces();

	/**
	 * Returns the value of the '<em><b>Structures</b></em>' reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4aps.model.aPS.StructureRepository.Structure}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Structures</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Structures</em>' reference list.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.KAMP4aPSFieldofactivityannotationsPackage#getHMIConfiguration_Structures()
	 * @model
	 * @generated
	 */
	EList<Structure> getStructures();

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.HMISpecification#getHmiConfig <em>Hmi Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(HMISpecification)
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.KAMP4aPSFieldofactivityannotationsPackage#getHMIConfiguration_Parent()
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.HMISpecification#getHmiConfig
	 * @model opposite="hmiConfig" required="true" transient="false"
	 * @generated
	 */
	HMISpecification getParent();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.HMIConfiguration#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(HMISpecification value);

} // HMIConfiguration
