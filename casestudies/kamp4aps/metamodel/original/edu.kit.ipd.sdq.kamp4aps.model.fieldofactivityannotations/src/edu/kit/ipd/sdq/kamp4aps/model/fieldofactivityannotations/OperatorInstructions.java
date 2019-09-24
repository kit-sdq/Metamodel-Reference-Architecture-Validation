/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operator Instructions</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.OperatorInstructions#getParent <em>Parent</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.KAMP4aPSFieldofactivityannotationsPackage#getOperatorInstructions()
 * @model
 * @generated
 */
public interface OperatorInstructions extends Documentation {
	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.DocumentationFiles#getInstructions <em>Instructions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(DocumentationFiles)
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.KAMP4aPSFieldofactivityannotationsPackage#getOperatorInstructions_Parent()
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.DocumentationFiles#getInstructions
	 * @model opposite="instructions" required="true" transient="false"
	 * @generated
	 */
	DocumentationFiles getParent();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.OperatorInstructions#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(DocumentationFiles value);

} // OperatorInstructions
