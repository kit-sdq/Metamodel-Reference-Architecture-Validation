/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.DeploymentContext;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.Interface;

import edu.kit.ipd.sdq.kamp4iec.model.IECModel.GlobalVariable;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.DeploymentContext.VariableMapping#getName <em>Name</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.DeploymentContext.VariableMapping#getProgramVariable <em>Program Variable</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.DeploymentContext.VariableMapping#getInterfaceDeclaration <em>Interface Declaration</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.DeploymentContext.VariableMapping#getParent <em>Parent</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.kamp4aps.model.DeploymentContext.DeploymentContextPackage#getVariableMapping()
 * @model
 * @generated
 */
public interface VariableMapping extends EObject {
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
	 * @see edu.kit.ipd.sdq.kamp4aps.model.DeploymentContext.DeploymentContextPackage#getVariableMapping_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.kamp4aps.model.DeploymentContext.VariableMapping#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Program Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Program Variable</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Program Variable</em>' reference.
	 * @see #setProgramVariable(GlobalVariable)
	 * @see edu.kit.ipd.sdq.kamp4aps.model.DeploymentContext.DeploymentContextPackage#getVariableMapping_ProgramVariable()
	 * @model required="true"
	 * @generated
	 */
	GlobalVariable getProgramVariable();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.kamp4aps.model.DeploymentContext.VariableMapping#getProgramVariable <em>Program Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Program Variable</em>' reference.
	 * @see #getProgramVariable()
	 * @generated
	 */
	void setProgramVariable(GlobalVariable value);

	/**
	 * Returns the value of the '<em><b>Interface Declaration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface Declaration</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface Declaration</em>' reference.
	 * @see #setInterfaceDeclaration(Interface)
	 * @see edu.kit.ipd.sdq.kamp4aps.model.DeploymentContext.DeploymentContextPackage#getVariableMapping_InterfaceDeclaration()
	 * @model required="true"
	 * @generated
	 */
	Interface getInterfaceDeclaration();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.kamp4aps.model.DeploymentContext.VariableMapping#getInterfaceDeclaration <em>Interface Declaration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interface Declaration</em>' reference.
	 * @see #getInterfaceDeclaration()
	 * @generated
	 */
	void setInterfaceDeclaration(Interface value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link edu.kit.ipd.sdq.kamp4aps.model.DeploymentContext.ComponentCorrelation#getVariableMapping <em>Variable Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(ComponentCorrelation)
	 * @see edu.kit.ipd.sdq.kamp4aps.model.DeploymentContext.DeploymentContextPackage#getVariableMapping_Parent()
	 * @see edu.kit.ipd.sdq.kamp4aps.model.DeploymentContext.ComponentCorrelation#getVariableMapping
	 * @model opposite="variableMapping" required="true" transient="false"
	 * @generated
	 */
	ComponentCorrelation getParent();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.kamp4aps.model.DeploymentContext.VariableMapping#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(ComponentCorrelation value);

} // VariableMapping
