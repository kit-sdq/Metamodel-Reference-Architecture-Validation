/**
 */
package edu.kit.ipd.sdq.kamp4iec.model.IECRepository;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Global Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.GlobalVariable#getType <em>Type</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.GlobalVariable#getUsesEnum <em>Uses Enum</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECRepositoryPackage#getGlobalVariable()
 * @model
 * @generated
 */
public interface GlobalVariable extends Identifier {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"NONE"</code>.
	 * The literals are from the enumeration {@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.VariableType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.VariableType
	 * @see #setType(VariableType)
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECRepositoryPackage#getGlobalVariable_Type()
	 * @model default="NONE"
	 * @generated
	 */
	VariableType getType();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.GlobalVariable#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.VariableType
	 * @see #getType()
	 * @generated
	 */
	void setType(VariableType value);

	/**
	 * Returns the value of the '<em><b>Uses Enum</b></em>' reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.Enum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uses Enum</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uses Enum</em>' reference list.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECRepositoryPackage#getGlobalVariable_UsesEnum()
	 * @model
	 * @generated
	 */
	EList<edu.kit.ipd.sdq.kamp4iec.model.IECRepository.Enum> getUsesEnum();

} // GlobalVariable
