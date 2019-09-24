/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.Interface;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface Documentation Files</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.InterfaceDocumentationFiles#getParent <em>Parent</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.InterfaceDocumentationFiles#getDocumentedInterface <em>Documented Interface</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.KAMP4aPSFieldofactivityannotationsPackage#getInterfaceDocumentationFiles()
 * @model
 * @generated
 */
public interface InterfaceDocumentationFiles extends DocumentationFiles {
	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.DocumentationSpecification#getInterfaceDocumentation <em>Interface Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(DocumentationSpecification)
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.KAMP4aPSFieldofactivityannotationsPackage#getInterfaceDocumentationFiles_Parent()
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.DocumentationSpecification#getInterfaceDocumentation
	 * @model opposite="interfaceDocumentation" required="true" transient="false"
	 * @generated
	 */
	DocumentationSpecification getParent();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.InterfaceDocumentationFiles#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(DocumentationSpecification value);

	/**
	 * Returns the value of the '<em><b>Documented Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Documented Interface</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Documented Interface</em>' reference.
	 * @see #setDocumentedInterface(Interface)
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.KAMP4aPSFieldofactivityannotationsPackage#getInterfaceDocumentationFiles_DocumentedInterface()
	 * @model required="true"
	 * @generated
	 */
	Interface getDocumentedInterface();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.InterfaceDocumentationFiles#getDocumentedInterface <em>Documented Interface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Documented Interface</em>' reference.
	 * @see #getDocumentedInterface()
	 * @generated
	 */
	void setDocumentedInterface(Interface value);

} // InterfaceDocumentationFiles
