/**
 */
package edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl;

import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.Function;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.FunctionBlock;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.GlobalVariable;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECInterface;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECRepositoryPackage;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.Program;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.Repository;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Repository</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.RepositoryImpl#getContainsProgram <em>Contains Program</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.RepositoryImpl#getContainsInterface <em>Contains Interface</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.RepositoryImpl#getContainsFunctionBlock <em>Contains Function Block</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.RepositoryImpl#getContainsFunction <em>Contains Function</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.RepositoryImpl#getContainsVariable <em>Contains Variable</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.RepositoryImpl#getName <em>Name</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.RepositoryImpl#getContainsEnum <em>Contains Enum</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RepositoryImpl extends MinimalEObjectImpl.Container implements Repository {
	/**
	 * The cached value of the '{@link #getContainsProgram() <em>Contains Program</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsProgram()
	 * @generated
	 * @ordered
	 */
	protected EList<Program> containsProgram;

	/**
	 * The cached value of the '{@link #getContainsInterface() <em>Contains Interface</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsInterface()
	 * @generated
	 * @ordered
	 */
	protected EList<IECInterface> containsInterface;

	/**
	 * The cached value of the '{@link #getContainsFunctionBlock() <em>Contains Function Block</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsFunctionBlock()
	 * @generated
	 * @ordered
	 */
	protected EList<FunctionBlock> containsFunctionBlock;

	/**
	 * The cached value of the '{@link #getContainsFunction() <em>Contains Function</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsFunction()
	 * @generated
	 * @ordered
	 */
	protected EList<Function> containsFunction;

	/**
	 * The cached value of the '{@link #getContainsVariable() <em>Contains Variable</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsVariable()
	 * @generated
	 * @ordered
	 */
	protected EList<GlobalVariable> containsVariable;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getContainsEnum() <em>Contains Enum</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsEnum()
	 * @generated
	 * @ordered
	 */
	protected EList<edu.kit.ipd.sdq.kamp4iec.model.IECRepository.Enum> containsEnum;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RepositoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IECRepositoryPackage.Literals.REPOSITORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Program> getContainsProgram() {
		if (containsProgram == null) {
			containsProgram = new EObjectContainmentEList<Program>(Program.class, this, IECRepositoryPackage.REPOSITORY__CONTAINS_PROGRAM);
		}
		return containsProgram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IECInterface> getContainsInterface() {
		if (containsInterface == null) {
			containsInterface = new EObjectContainmentEList<IECInterface>(IECInterface.class, this, IECRepositoryPackage.REPOSITORY__CONTAINS_INTERFACE);
		}
		return containsInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FunctionBlock> getContainsFunctionBlock() {
		if (containsFunctionBlock == null) {
			containsFunctionBlock = new EObjectContainmentEList<FunctionBlock>(FunctionBlock.class, this, IECRepositoryPackage.REPOSITORY__CONTAINS_FUNCTION_BLOCK);
		}
		return containsFunctionBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Function> getContainsFunction() {
		if (containsFunction == null) {
			containsFunction = new EObjectContainmentEList<Function>(Function.class, this, IECRepositoryPackage.REPOSITORY__CONTAINS_FUNCTION);
		}
		return containsFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GlobalVariable> getContainsVariable() {
		if (containsVariable == null) {
			containsVariable = new EObjectContainmentEList<GlobalVariable>(GlobalVariable.class, this, IECRepositoryPackage.REPOSITORY__CONTAINS_VARIABLE);
		}
		return containsVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IECRepositoryPackage.REPOSITORY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<edu.kit.ipd.sdq.kamp4iec.model.IECRepository.Enum> getContainsEnum() {
		if (containsEnum == null) {
			containsEnum = new EObjectContainmentEList<edu.kit.ipd.sdq.kamp4iec.model.IECRepository.Enum>(edu.kit.ipd.sdq.kamp4iec.model.IECRepository.Enum.class, this, IECRepositoryPackage.REPOSITORY__CONTAINS_ENUM);
		}
		return containsEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IECRepositoryPackage.REPOSITORY__CONTAINS_PROGRAM:
				return ((InternalEList<?>)getContainsProgram()).basicRemove(otherEnd, msgs);
			case IECRepositoryPackage.REPOSITORY__CONTAINS_INTERFACE:
				return ((InternalEList<?>)getContainsInterface()).basicRemove(otherEnd, msgs);
			case IECRepositoryPackage.REPOSITORY__CONTAINS_FUNCTION_BLOCK:
				return ((InternalEList<?>)getContainsFunctionBlock()).basicRemove(otherEnd, msgs);
			case IECRepositoryPackage.REPOSITORY__CONTAINS_FUNCTION:
				return ((InternalEList<?>)getContainsFunction()).basicRemove(otherEnd, msgs);
			case IECRepositoryPackage.REPOSITORY__CONTAINS_VARIABLE:
				return ((InternalEList<?>)getContainsVariable()).basicRemove(otherEnd, msgs);
			case IECRepositoryPackage.REPOSITORY__CONTAINS_ENUM:
				return ((InternalEList<?>)getContainsEnum()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IECRepositoryPackage.REPOSITORY__CONTAINS_PROGRAM:
				return getContainsProgram();
			case IECRepositoryPackage.REPOSITORY__CONTAINS_INTERFACE:
				return getContainsInterface();
			case IECRepositoryPackage.REPOSITORY__CONTAINS_FUNCTION_BLOCK:
				return getContainsFunctionBlock();
			case IECRepositoryPackage.REPOSITORY__CONTAINS_FUNCTION:
				return getContainsFunction();
			case IECRepositoryPackage.REPOSITORY__CONTAINS_VARIABLE:
				return getContainsVariable();
			case IECRepositoryPackage.REPOSITORY__NAME:
				return getName();
			case IECRepositoryPackage.REPOSITORY__CONTAINS_ENUM:
				return getContainsEnum();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case IECRepositoryPackage.REPOSITORY__CONTAINS_PROGRAM:
				getContainsProgram().clear();
				getContainsProgram().addAll((Collection<? extends Program>)newValue);
				return;
			case IECRepositoryPackage.REPOSITORY__CONTAINS_INTERFACE:
				getContainsInterface().clear();
				getContainsInterface().addAll((Collection<? extends IECInterface>)newValue);
				return;
			case IECRepositoryPackage.REPOSITORY__CONTAINS_FUNCTION_BLOCK:
				getContainsFunctionBlock().clear();
				getContainsFunctionBlock().addAll((Collection<? extends FunctionBlock>)newValue);
				return;
			case IECRepositoryPackage.REPOSITORY__CONTAINS_FUNCTION:
				getContainsFunction().clear();
				getContainsFunction().addAll((Collection<? extends Function>)newValue);
				return;
			case IECRepositoryPackage.REPOSITORY__CONTAINS_VARIABLE:
				getContainsVariable().clear();
				getContainsVariable().addAll((Collection<? extends GlobalVariable>)newValue);
				return;
			case IECRepositoryPackage.REPOSITORY__NAME:
				setName((String)newValue);
				return;
			case IECRepositoryPackage.REPOSITORY__CONTAINS_ENUM:
				getContainsEnum().clear();
				getContainsEnum().addAll((Collection<? extends edu.kit.ipd.sdq.kamp4iec.model.IECRepository.Enum>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case IECRepositoryPackage.REPOSITORY__CONTAINS_PROGRAM:
				getContainsProgram().clear();
				return;
			case IECRepositoryPackage.REPOSITORY__CONTAINS_INTERFACE:
				getContainsInterface().clear();
				return;
			case IECRepositoryPackage.REPOSITORY__CONTAINS_FUNCTION_BLOCK:
				getContainsFunctionBlock().clear();
				return;
			case IECRepositoryPackage.REPOSITORY__CONTAINS_FUNCTION:
				getContainsFunction().clear();
				return;
			case IECRepositoryPackage.REPOSITORY__CONTAINS_VARIABLE:
				getContainsVariable().clear();
				return;
			case IECRepositoryPackage.REPOSITORY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case IECRepositoryPackage.REPOSITORY__CONTAINS_ENUM:
				getContainsEnum().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case IECRepositoryPackage.REPOSITORY__CONTAINS_PROGRAM:
				return containsProgram != null && !containsProgram.isEmpty();
			case IECRepositoryPackage.REPOSITORY__CONTAINS_INTERFACE:
				return containsInterface != null && !containsInterface.isEmpty();
			case IECRepositoryPackage.REPOSITORY__CONTAINS_FUNCTION_BLOCK:
				return containsFunctionBlock != null && !containsFunctionBlock.isEmpty();
			case IECRepositoryPackage.REPOSITORY__CONTAINS_FUNCTION:
				return containsFunction != null && !containsFunction.isEmpty();
			case IECRepositoryPackage.REPOSITORY__CONTAINS_VARIABLE:
				return containsVariable != null && !containsVariable.isEmpty();
			case IECRepositoryPackage.REPOSITORY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case IECRepositoryPackage.REPOSITORY__CONTAINS_ENUM:
				return containsEnum != null && !containsEnum.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (Name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //RepositoryImpl
