/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Component;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Documentation Files</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.ComponentDocumentationFiles#getParent <em>Parent</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.ComponentDocumentationFiles#getDocumentedComponent <em>Documented Component</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.KAMP4aPSFieldofactivityannotationsPackage#getComponentDocumentationFiles()
 * @model
 * @generated
 */
public interface ComponentDocumentationFiles extends DocumentationFiles {
	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.DocumentationSpecification#getComponentDocumentation <em>Component Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(DocumentationSpecification)
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.KAMP4aPSFieldofactivityannotationsPackage#getComponentDocumentationFiles_Parent()
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.DocumentationSpecification#getComponentDocumentation
	 * @model opposite="componentDocumentation" required="true" transient="false"
	 * @generated
	 */
	DocumentationSpecification getParent();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.ComponentDocumentationFiles#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(DocumentationSpecification value);

	/**
	 * Returns the value of the '<em><b>Documented Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Documented Component</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Documented Component</em>' reference.
	 * @see #setDocumentedComponent(Component)
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.KAMP4aPSFieldofactivityannotationsPackage#getComponentDocumentationFiles_DocumentedComponent()
	 * @model required="true"
	 * @generated
	 */
	Component getDocumentedComponent();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.ComponentDocumentationFiles#getDocumentedComponent <em>Documented Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Documented Component</em>' reference.
	 * @see #getDocumentedComponent()
	 * @generated
	 */
	void setDocumentedComponent(Component value);

} // ComponentDocumentationFiles
