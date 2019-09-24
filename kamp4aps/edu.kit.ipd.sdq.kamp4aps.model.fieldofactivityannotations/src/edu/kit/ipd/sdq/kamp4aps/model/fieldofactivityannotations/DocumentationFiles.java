/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Documentation Files</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.DocumentationFiles#getMainteneance <em>Mainteneance</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.DocumentationFiles#getInstructions <em>Instructions</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.DocumentationFiles#getTrainingIntern <em>Training Intern</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.DocumentationFiles#getTrainingExternal <em>Training External</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.KAMP4aPSFieldofactivityannotationsPackage#getDocumentationFiles()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface DocumentationFiles extends EObject {
	/**
	 * Returns the value of the '<em><b>Mainteneance</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.MainteneanceDocumentation}.
	 * It is bidirectional and its opposite is '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.MainteneanceDocumentation#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mainteneance</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mainteneance</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.KAMP4aPSFieldofactivityannotationsPackage#getDocumentationFiles_Mainteneance()
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.MainteneanceDocumentation#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<MainteneanceDocumentation> getMainteneance();

	/**
	 * Returns the value of the '<em><b>Instructions</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.OperatorInstructions}.
	 * It is bidirectional and its opposite is '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.OperatorInstructions#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instructions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instructions</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.KAMP4aPSFieldofactivityannotationsPackage#getDocumentationFiles_Instructions()
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.OperatorInstructions#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<OperatorInstructions> getInstructions();

	/**
	 * Returns the value of the '<em><b>Training Intern</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.TrainingDocIntern}.
	 * It is bidirectional and its opposite is '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.TrainingDocIntern#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Training Intern</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Training Intern</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.KAMP4aPSFieldofactivityannotationsPackage#getDocumentationFiles_TrainingIntern()
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.TrainingDocIntern#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<TrainingDocIntern> getTrainingIntern();

	/**
	 * Returns the value of the '<em><b>Training External</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.TrainingDocExternal}.
	 * It is bidirectional and its opposite is '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.TrainingDocExternal#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Training External</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Training External</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.KAMP4aPSFieldofactivityannotationsPackage#getDocumentationFiles_TrainingExternal()
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.TrainingDocExternal#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<TrainingDocExternal> getTrainingExternal();

} // DocumentationFiles
