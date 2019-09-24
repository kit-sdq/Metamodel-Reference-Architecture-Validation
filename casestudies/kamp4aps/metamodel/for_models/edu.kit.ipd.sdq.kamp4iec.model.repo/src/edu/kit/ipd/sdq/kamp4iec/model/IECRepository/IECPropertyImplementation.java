/**
 */
package edu.kit.ipd.sdq.kamp4iec.model.IECRepository;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IEC Property Implementation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECPropertyImplementation#getImplements <em>Implements</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECPropertyImplementation#getAccessesVariable <em>Accesses Variable</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECPropertyImplementation#getUsesEnum <em>Uses Enum</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECRepositoryPackage#getIECPropertyImplementation()
 * @model
 * @generated
 */
public interface IECPropertyImplementation extends Identifier, MethodResource {
	/**
	 * Returns the value of the '<em><b>Implements</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implements</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implements</em>' reference.
	 * @see #setImplements(IECProperty)
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECRepositoryPackage#getIECPropertyImplementation_Implements()
	 * @model
	 * @generated
	 */
	IECProperty getImplements();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECPropertyImplementation#getImplements <em>Implements</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implements</em>' reference.
	 * @see #getImplements()
	 * @generated
	 */
	void setImplements(IECProperty value);

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
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECRepositoryPackage#getIECPropertyImplementation_AccessesVariable()
	 * @model
	 * @generated
	 */
	EList<GlobalVariable> getAccessesVariable();

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
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECRepositoryPackage#getIECPropertyImplementation_UsesEnum()
	 * @model
	 * @generated
	 */
	EList<edu.kit.ipd.sdq.kamp4iec.model.IECRepository.Enum> getUsesEnum();

} // IECPropertyImplementation
