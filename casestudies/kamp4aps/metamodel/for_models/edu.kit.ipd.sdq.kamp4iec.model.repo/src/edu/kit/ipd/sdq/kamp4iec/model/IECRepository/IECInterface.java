/**
 */
package edu.kit.ipd.sdq.kamp4iec.model.IECRepository;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IEC Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECInterface#getDefinesIecMethod <em>Defines Iec Method</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECInterface#getDefinesIecProperty <em>Defines Iec Property</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECInterface#getUsesEnum <em>Uses Enum</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECRepositoryPackage#getIECInterface()
 * @model
 * @generated
 */
public interface IECInterface extends Identifier, FunctionblockResource {
	/**
	 * Returns the value of the '<em><b>Defines Iec Method</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECMethod}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Defines Iec Method</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Defines Iec Method</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECRepositoryPackage#getIECInterface_DefinesIecMethod()
	 * @model containment="true"
	 * @generated
	 */
	EList<IECMethod> getDefinesIecMethod();

	/**
	 * Returns the value of the '<em><b>Defines Iec Property</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECProperty}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Defines Iec Property</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Defines Iec Property</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECRepositoryPackage#getIECInterface_DefinesIecProperty()
	 * @model containment="true"
	 * @generated
	 */
	EList<IECProperty> getDefinesIecProperty();

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
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECRepositoryPackage#getIECInterface_UsesEnum()
	 * @model
	 * @generated
	 */
	EList<edu.kit.ipd.sdq.kamp4iec.model.IECRepository.Enum> getUsesEnum();

} // IECInterface
