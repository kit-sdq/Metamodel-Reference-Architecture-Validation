/**
 */
package edu.kit.ipd.sdq.kamp4iec.model.IECRepository;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.FunctionBlock#getHasIecMethod <em>Has Iec Method</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.FunctionBlock#getHasIecProperty <em>Has Iec Property</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.FunctionBlock#getHasInterface <em>Has Interface</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.FunctionBlock#getAccessesVariable <em>Accesses Variable</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.FunctionBlock#getUsesFunctionBlock <em>Uses Function Block</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.FunctionBlock#getCallsFunction <em>Calls Function</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.FunctionBlock#getUsesEnum <em>Uses Enum</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.FunctionBlock#getUsesInterface <em>Uses Interface</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECRepositoryPackage#getFunctionBlock()
 * @model
 * @generated
 */
public interface FunctionBlock extends Identifier, FunctionblockResource {
	/**
	 * Returns the value of the '<em><b>Has Iec Method</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECMethodImplementation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Iec Method</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Iec Method</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECRepositoryPackage#getFunctionBlock_HasIecMethod()
	 * @model containment="true"
	 * @generated
	 */
	EList<IECMethodImplementation> getHasIecMethod();

	/**
	 * Returns the value of the '<em><b>Has Iec Property</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECPropertyImplementation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Iec Property</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Iec Property</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECRepositoryPackage#getFunctionBlock_HasIecProperty()
	 * @model containment="true"
	 * @generated
	 */
	EList<IECPropertyImplementation> getHasIecProperty();

	/**
	 * Returns the value of the '<em><b>Has Interface</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.ImplementsInterface}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Interface</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Interface</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECRepositoryPackage#getFunctionBlock_HasInterface()
	 * @model containment="true"
	 * @generated
	 */
	EList<ImplementsInterface> getHasInterface();

	/**
	 * Returns the value of the '<em><b>Accesses Variable</b></em>' reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.GlobalVariable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Accesses Variable</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accesses Variable</em>' reference list.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECRepositoryPackage#getFunctionBlock_AccessesVariable()
	 * @model
	 * @generated
	 */
	EList<GlobalVariable> getAccessesVariable();

	/**
	 * Returns the value of the '<em><b>Uses Function Block</b></em>' reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.FunctionBlock}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uses Function Block</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uses Function Block</em>' reference list.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECRepositoryPackage#getFunctionBlock_UsesFunctionBlock()
	 * @model
	 * @generated
	 */
	EList<FunctionBlock> getUsesFunctionBlock();

	/**
	 * Returns the value of the '<em><b>Calls Function</b></em>' reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.Function}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Calls Function</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Calls Function</em>' reference list.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECRepositoryPackage#getFunctionBlock_CallsFunction()
	 * @model
	 * @generated
	 */
	EList<Function> getCallsFunction();

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
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECRepositoryPackage#getFunctionBlock_UsesEnum()
	 * @model
	 * @generated
	 */
	EList<edu.kit.ipd.sdq.kamp4iec.model.IECRepository.Enum> getUsesEnum();

	/**
	 * Returns the value of the '<em><b>Uses Interface</b></em>' reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECInterface}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uses Interface</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uses Interface</em>' reference list.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECRepositoryPackage#getFunctionBlock_UsesInterface()
	 * @model
	 * @generated
	 */
	EList<IECInterface> getUsesInterface();

} // FunctionBlock
