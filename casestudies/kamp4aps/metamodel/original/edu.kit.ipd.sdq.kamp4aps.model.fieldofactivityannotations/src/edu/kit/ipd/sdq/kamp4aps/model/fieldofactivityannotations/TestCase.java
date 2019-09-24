/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Case</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.TestCase#getTestName <em>Test Name</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.KAMP4aPSFieldofactivityannotationsPackage#getTestCase()
 * @model abstract="true"
 * @generated
 */
public interface TestCase extends EObject {
	/**
	 * Returns the value of the '<em><b>Test Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Test Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Name</em>' attribute.
	 * @see #setTestName(String)
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.KAMP4aPSFieldofactivityannotationsPackage#getTestCase_TestName()
	 * @model
	 * @generated
	 */
	String getTestName();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.TestCase#getTestName <em>Test Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Test Name</em>' attribute.
	 * @see #getTestName()
	 * @generated
	 */
	void setTestName(String value);

} // TestCase
