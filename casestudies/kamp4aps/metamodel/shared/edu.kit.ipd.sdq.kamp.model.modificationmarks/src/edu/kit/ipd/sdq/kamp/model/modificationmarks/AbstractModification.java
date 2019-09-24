/**
 */
package edu.kit.ipd.sdq.kamp.model.modificationmarks;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Modification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractModification#getAffectedElement <em>Affected Element</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractModification#getCausingElements <em>Causing Elements</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractModification#getId <em>Id</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractModification#isToolderived <em>Toolderived</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractModification#getUserDecision <em>User Decision</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.kamp.model.modificationmarks.ModificationmarksPackage#getAbstractModification()
 * @model abstract="true"
 * @generated
 */
public interface AbstractModification<S, T> extends EObject {
	/**
	 * Returns the value of the '<em><b>Affected Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Affected Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Affected Element</em>' reference.
	 * @see #setAffectedElement(Object)
	 * @see edu.kit.ipd.sdq.kamp.model.modificationmarks.ModificationmarksPackage#getAbstractModification_AffectedElement()
	 * @model kind="reference" required="true"
	 * @generated
	 */
	S getAffectedElement();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractModification#getAffectedElement <em>Affected Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Affected Element</em>' reference.
	 * @see #getAffectedElement()
	 * @generated
	 */
	void setAffectedElement(S value);

	/**
	 * Returns the value of the '<em><b>Causing Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Causing Elements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Causing Elements</em>' reference list.
	 * @see edu.kit.ipd.sdq.kamp.model.modificationmarks.ModificationmarksPackage#getAbstractModification_CausingElements()
	 * @model kind="reference"
	 * @generated
	 */
	EList<T> getCausingElements();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see edu.kit.ipd.sdq.kamp.model.modificationmarks.ModificationmarksPackage#getAbstractModification_Id()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractModification#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Toolderived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Toolderived</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Toolderived</em>' attribute.
	 * @see #setToolderived(boolean)
	 * @see edu.kit.ipd.sdq.kamp.model.modificationmarks.ModificationmarksPackage#getAbstractModification_Toolderived()
	 * @model required="true"
	 * @generated
	 */
	boolean isToolderived();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractModification#isToolderived <em>Toolderived</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Toolderived</em>' attribute.
	 * @see #isToolderived()
	 * @generated
	 */
	void setToolderived(boolean value);

	/**
	 * Returns the value of the '<em><b>User Decision</b></em>' attribute.
	 * The default value is <code>"NODECISION"</code>.
	 * The literals are from the enumeration {@link edu.kit.ipd.sdq.kamp.model.modificationmarks.AcceptanceAndConfirmationState}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Decision</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Decision</em>' attribute.
	 * @see edu.kit.ipd.sdq.kamp.model.modificationmarks.AcceptanceAndConfirmationState
	 * @see #setUserDecision(AcceptanceAndConfirmationState)
	 * @see edu.kit.ipd.sdq.kamp.model.modificationmarks.ModificationmarksPackage#getAbstractModification_UserDecision()
	 * @model default="NODECISION" required="true"
	 * @generated
	 */
	AcceptanceAndConfirmationState getUserDecision();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractModification#getUserDecision <em>User Decision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Decision</em>' attribute.
	 * @see edu.kit.ipd.sdq.kamp.model.modificationmarks.AcceptanceAndConfirmationState
	 * @see #getUserDecision()
	 * @generated
	 */
	void setUserDecision(AcceptanceAndConfirmationState value);

} // AbstractModification
