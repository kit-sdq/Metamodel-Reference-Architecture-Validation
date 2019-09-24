/**
 */
package edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl;

import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.Function;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.FunctionBlock;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.GlobalVariable;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECInterface;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECMethodImplementation;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECPropertyImplementation;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECRepositoryPackage;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.ImplementsInterface;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function Block</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.FunctionBlockImpl#getHasIecMethod <em>Has Iec Method</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.FunctionBlockImpl#getHasIecProperty <em>Has Iec Property</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.FunctionBlockImpl#getHasInterface <em>Has Interface</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.FunctionBlockImpl#getAccessesVariable <em>Accesses Variable</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.FunctionBlockImpl#getUsesFunctionBlock <em>Uses Function Block</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.FunctionBlockImpl#getCallsFunction <em>Calls Function</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.FunctionBlockImpl#getUsesEnum <em>Uses Enum</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.FunctionBlockImpl#getUsesInterface <em>Uses Interface</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FunctionBlockImpl extends IdentifierImpl implements FunctionBlock {
	/**
	 * The cached value of the '{@link #getHasIecMethod() <em>Has Iec Method</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasIecMethod()
	 * @generated
	 * @ordered
	 */
	protected EList<IECMethodImplementation> hasIecMethod;

	/**
	 * The cached value of the '{@link #getHasIecProperty() <em>Has Iec Property</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasIecProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<IECPropertyImplementation> hasIecProperty;

	/**
	 * The cached value of the '{@link #getHasInterface() <em>Has Interface</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasInterface()
	 * @generated
	 * @ordered
	 */
	protected EList<ImplementsInterface> hasInterface;

	/**
	 * The cached value of the '{@link #getAccessesVariable() <em>Accesses Variable</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessesVariable()
	 * @generated
	 * @ordered
	 */
	protected EList<GlobalVariable> accessesVariable;

	/**
	 * The cached value of the '{@link #getUsesFunctionBlock() <em>Uses Function Block</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsesFunctionBlock()
	 * @generated
	 * @ordered
	 */
	protected EList<FunctionBlock> usesFunctionBlock;

	/**
	 * The cached value of the '{@link #getCallsFunction() <em>Calls Function</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCallsFunction()
	 * @generated
	 * @ordered
	 */
	protected EList<Function> callsFunction;

	/**
	 * The cached value of the '{@link #getUsesEnum() <em>Uses Enum</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsesEnum()
	 * @generated
	 * @ordered
	 */
	protected EList<edu.kit.ipd.sdq.kamp4iec.model.IECRepository.Enum> usesEnum;

	/**
	 * The cached value of the '{@link #getUsesInterface() <em>Uses Interface</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsesInterface()
	 * @generated
	 * @ordered
	 */
	protected EList<IECInterface> usesInterface;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionBlockImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IECRepositoryPackage.Literals.FUNCTION_BLOCK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IECMethodImplementation> getHasIecMethod() {
		if (hasIecMethod == null) {
			hasIecMethod = new EObjectContainmentEList<IECMethodImplementation>(IECMethodImplementation.class, this, IECRepositoryPackage.FUNCTION_BLOCK__HAS_IEC_METHOD);
		}
		return hasIecMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IECPropertyImplementation> getHasIecProperty() {
		if (hasIecProperty == null) {
			hasIecProperty = new EObjectContainmentEList<IECPropertyImplementation>(IECPropertyImplementation.class, this, IECRepositoryPackage.FUNCTION_BLOCK__HAS_IEC_PROPERTY);
		}
		return hasIecProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ImplementsInterface> getHasInterface() {
		if (hasInterface == null) {
			hasInterface = new EObjectContainmentEList<ImplementsInterface>(ImplementsInterface.class, this, IECRepositoryPackage.FUNCTION_BLOCK__HAS_INTERFACE);
		}
		return hasInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GlobalVariable> getAccessesVariable() {
		if (accessesVariable == null) {
			accessesVariable = new EObjectResolvingEList<GlobalVariable>(GlobalVariable.class, this, IECRepositoryPackage.FUNCTION_BLOCK__ACCESSES_VARIABLE);
		}
		return accessesVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FunctionBlock> getUsesFunctionBlock() {
		if (usesFunctionBlock == null) {
			usesFunctionBlock = new EObjectResolvingEList<FunctionBlock>(FunctionBlock.class, this, IECRepositoryPackage.FUNCTION_BLOCK__USES_FUNCTION_BLOCK);
		}
		return usesFunctionBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Function> getCallsFunction() {
		if (callsFunction == null) {
			callsFunction = new EObjectResolvingEList<Function>(Function.class, this, IECRepositoryPackage.FUNCTION_BLOCK__CALLS_FUNCTION);
		}
		return callsFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<edu.kit.ipd.sdq.kamp4iec.model.IECRepository.Enum> getUsesEnum() {
		if (usesEnum == null) {
			usesEnum = new EObjectResolvingEList<edu.kit.ipd.sdq.kamp4iec.model.IECRepository.Enum>(edu.kit.ipd.sdq.kamp4iec.model.IECRepository.Enum.class, this, IECRepositoryPackage.FUNCTION_BLOCK__USES_ENUM);
		}
		return usesEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IECInterface> getUsesInterface() {
		if (usesInterface == null) {
			usesInterface = new EObjectResolvingEList<IECInterface>(IECInterface.class, this, IECRepositoryPackage.FUNCTION_BLOCK__USES_INTERFACE);
		}
		return usesInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IECRepositoryPackage.FUNCTION_BLOCK__HAS_IEC_METHOD:
				return ((InternalEList<?>)getHasIecMethod()).basicRemove(otherEnd, msgs);
			case IECRepositoryPackage.FUNCTION_BLOCK__HAS_IEC_PROPERTY:
				return ((InternalEList<?>)getHasIecProperty()).basicRemove(otherEnd, msgs);
			case IECRepositoryPackage.FUNCTION_BLOCK__HAS_INTERFACE:
				return ((InternalEList<?>)getHasInterface()).basicRemove(otherEnd, msgs);
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
			case IECRepositoryPackage.FUNCTION_BLOCK__HAS_IEC_METHOD:
				return getHasIecMethod();
			case IECRepositoryPackage.FUNCTION_BLOCK__HAS_IEC_PROPERTY:
				return getHasIecProperty();
			case IECRepositoryPackage.FUNCTION_BLOCK__HAS_INTERFACE:
				return getHasInterface();
			case IECRepositoryPackage.FUNCTION_BLOCK__ACCESSES_VARIABLE:
				return getAccessesVariable();
			case IECRepositoryPackage.FUNCTION_BLOCK__USES_FUNCTION_BLOCK:
				return getUsesFunctionBlock();
			case IECRepositoryPackage.FUNCTION_BLOCK__CALLS_FUNCTION:
				return getCallsFunction();
			case IECRepositoryPackage.FUNCTION_BLOCK__USES_ENUM:
				return getUsesEnum();
			case IECRepositoryPackage.FUNCTION_BLOCK__USES_INTERFACE:
				return getUsesInterface();
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
			case IECRepositoryPackage.FUNCTION_BLOCK__HAS_IEC_METHOD:
				getHasIecMethod().clear();
				getHasIecMethod().addAll((Collection<? extends IECMethodImplementation>)newValue);
				return;
			case IECRepositoryPackage.FUNCTION_BLOCK__HAS_IEC_PROPERTY:
				getHasIecProperty().clear();
				getHasIecProperty().addAll((Collection<? extends IECPropertyImplementation>)newValue);
				return;
			case IECRepositoryPackage.FUNCTION_BLOCK__HAS_INTERFACE:
				getHasInterface().clear();
				getHasInterface().addAll((Collection<? extends ImplementsInterface>)newValue);
				return;
			case IECRepositoryPackage.FUNCTION_BLOCK__ACCESSES_VARIABLE:
				getAccessesVariable().clear();
				getAccessesVariable().addAll((Collection<? extends GlobalVariable>)newValue);
				return;
			case IECRepositoryPackage.FUNCTION_BLOCK__USES_FUNCTION_BLOCK:
				getUsesFunctionBlock().clear();
				getUsesFunctionBlock().addAll((Collection<? extends FunctionBlock>)newValue);
				return;
			case IECRepositoryPackage.FUNCTION_BLOCK__CALLS_FUNCTION:
				getCallsFunction().clear();
				getCallsFunction().addAll((Collection<? extends Function>)newValue);
				return;
			case IECRepositoryPackage.FUNCTION_BLOCK__USES_ENUM:
				getUsesEnum().clear();
				getUsesEnum().addAll((Collection<? extends edu.kit.ipd.sdq.kamp4iec.model.IECRepository.Enum>)newValue);
				return;
			case IECRepositoryPackage.FUNCTION_BLOCK__USES_INTERFACE:
				getUsesInterface().clear();
				getUsesInterface().addAll((Collection<? extends IECInterface>)newValue);
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
			case IECRepositoryPackage.FUNCTION_BLOCK__HAS_IEC_METHOD:
				getHasIecMethod().clear();
				return;
			case IECRepositoryPackage.FUNCTION_BLOCK__HAS_IEC_PROPERTY:
				getHasIecProperty().clear();
				return;
			case IECRepositoryPackage.FUNCTION_BLOCK__HAS_INTERFACE:
				getHasInterface().clear();
				return;
			case IECRepositoryPackage.FUNCTION_BLOCK__ACCESSES_VARIABLE:
				getAccessesVariable().clear();
				return;
			case IECRepositoryPackage.FUNCTION_BLOCK__USES_FUNCTION_BLOCK:
				getUsesFunctionBlock().clear();
				return;
			case IECRepositoryPackage.FUNCTION_BLOCK__CALLS_FUNCTION:
				getCallsFunction().clear();
				return;
			case IECRepositoryPackage.FUNCTION_BLOCK__USES_ENUM:
				getUsesEnum().clear();
				return;
			case IECRepositoryPackage.FUNCTION_BLOCK__USES_INTERFACE:
				getUsesInterface().clear();
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
			case IECRepositoryPackage.FUNCTION_BLOCK__HAS_IEC_METHOD:
				return hasIecMethod != null && !hasIecMethod.isEmpty();
			case IECRepositoryPackage.FUNCTION_BLOCK__HAS_IEC_PROPERTY:
				return hasIecProperty != null && !hasIecProperty.isEmpty();
			case IECRepositoryPackage.FUNCTION_BLOCK__HAS_INTERFACE:
				return hasInterface != null && !hasInterface.isEmpty();
			case IECRepositoryPackage.FUNCTION_BLOCK__ACCESSES_VARIABLE:
				return accessesVariable != null && !accessesVariable.isEmpty();
			case IECRepositoryPackage.FUNCTION_BLOCK__USES_FUNCTION_BLOCK:
				return usesFunctionBlock != null && !usesFunctionBlock.isEmpty();
			case IECRepositoryPackage.FUNCTION_BLOCK__CALLS_FUNCTION:
				return callsFunction != null && !callsFunction.isEmpty();
			case IECRepositoryPackage.FUNCTION_BLOCK__USES_ENUM:
				return usesEnum != null && !usesEnum.isEmpty();
			case IECRepositoryPackage.FUNCTION_BLOCK__USES_INTERFACE:
				return usesInterface != null && !usesInterface.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FunctionBlockImpl
