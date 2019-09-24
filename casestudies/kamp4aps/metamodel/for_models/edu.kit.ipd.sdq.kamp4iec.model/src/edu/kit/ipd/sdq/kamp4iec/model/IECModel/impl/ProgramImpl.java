/**
 */
package edu.kit.ipd.sdq.kamp4iec.model.IECModel.impl;

import edu.kit.ipd.sdq.kamp4iec.model.IECModel.Function;
import edu.kit.ipd.sdq.kamp4iec.model.IECModel.FunctionBlock;
import edu.kit.ipd.sdq.kamp4iec.model.IECModel.GlobalVariable;
import edu.kit.ipd.sdq.kamp4iec.model.IECModel.IECInterface;
import edu.kit.ipd.sdq.kamp4iec.model.IECModel.IECMethodImplementation;
import edu.kit.ipd.sdq.kamp4iec.model.IECModel.IECModelPackage;
import edu.kit.ipd.sdq.kamp4iec.model.IECModel.IECPropertyImplementation;
import edu.kit.ipd.sdq.kamp4iec.model.IECModel.Program;

import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IdentifierImpl;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Program</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECModel.impl.ProgramImpl#getCallsFunction <em>Calls Function</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECModel.impl.ProgramImpl#getCallsFunctionBlock <em>Calls Function Block</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECModel.impl.ProgramImpl#getType <em>Type</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECModel.impl.ProgramImpl#getImplementsInterface <em>Implements Interface</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECModel.impl.ProgramImpl#getDeclaresVariable <em>Declares Variable</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECModel.impl.ProgramImpl#getUsesEnum <em>Uses Enum</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECModel.impl.ProgramImpl#getAccessesProperty <em>Accesses Property</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECModel.impl.ProgramImpl#getCallsMethod <em>Calls Method</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProgramImpl extends IdentifierImpl implements Program {
	/**
	 * The cached value of the '{@link #getCallsFunction() <em>Calls Function</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCallsFunction()
	 * @generated
	 * @ordered
	 */
	protected EList<Function> callsFunction;

	/**
	 * The cached value of the '{@link #getCallsFunctionBlock() <em>Calls Function Block</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCallsFunctionBlock()
	 * @generated
	 * @ordered
	 */
	protected EList<FunctionBlock> callsFunctionBlock;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected edu.kit.ipd.sdq.kamp4iec.model.IECRepository.Program type;

	/**
	 * The cached value of the '{@link #getImplementsInterface() <em>Implements Interface</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementsInterface()
	 * @generated
	 * @ordered
	 */
	protected EList<IECInterface> implementsInterface;

	/**
	 * The cached value of the '{@link #getDeclaresVariable() <em>Declares Variable</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeclaresVariable()
	 * @generated
	 * @ordered
	 */
	protected EList<GlobalVariable> declaresVariable;

	/**
	 * The cached value of the '{@link #getUsesEnum() <em>Uses Enum</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsesEnum()
	 * @generated
	 * @ordered
	 */
	protected EList<edu.kit.ipd.sdq.kamp4iec.model.IECModel.Enum> usesEnum;

	/**
	 * The cached value of the '{@link #getAccessesProperty() <em>Accesses Property</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessesProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<IECPropertyImplementation> accessesProperty;

	/**
	 * The cached value of the '{@link #getCallsMethod() <em>Calls Method</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCallsMethod()
	 * @generated
	 * @ordered
	 */
	protected EList<IECMethodImplementation> callsMethod;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProgramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IECModelPackage.Literals.PROGRAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Function> getCallsFunction() {
		if (callsFunction == null) {
			callsFunction = new EObjectContainmentEList<Function>(Function.class, this, IECModelPackage.PROGRAM__CALLS_FUNCTION);
		}
		return callsFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FunctionBlock> getCallsFunctionBlock() {
		if (callsFunctionBlock == null) {
			callsFunctionBlock = new EObjectContainmentEList<FunctionBlock>(FunctionBlock.class, this, IECModelPackage.PROGRAM__CALLS_FUNCTION_BLOCK);
		}
		return callsFunctionBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public edu.kit.ipd.sdq.kamp4iec.model.IECRepository.Program getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (edu.kit.ipd.sdq.kamp4iec.model.IECRepository.Program)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IECModelPackage.PROGRAM__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public edu.kit.ipd.sdq.kamp4iec.model.IECRepository.Program basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(edu.kit.ipd.sdq.kamp4iec.model.IECRepository.Program newType) {
		edu.kit.ipd.sdq.kamp4iec.model.IECRepository.Program oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IECModelPackage.PROGRAM__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IECInterface> getImplementsInterface() {
		if (implementsInterface == null) {
			implementsInterface = new EObjectContainmentEList<IECInterface>(IECInterface.class, this, IECModelPackage.PROGRAM__IMPLEMENTS_INTERFACE);
		}
		return implementsInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GlobalVariable> getDeclaresVariable() {
		if (declaresVariable == null) {
			declaresVariable = new EObjectContainmentEList<GlobalVariable>(GlobalVariable.class, this, IECModelPackage.PROGRAM__DECLARES_VARIABLE);
		}
		return declaresVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<edu.kit.ipd.sdq.kamp4iec.model.IECModel.Enum> getUsesEnum() {
		if (usesEnum == null) {
			usesEnum = new EObjectContainmentEList<edu.kit.ipd.sdq.kamp4iec.model.IECModel.Enum>(edu.kit.ipd.sdq.kamp4iec.model.IECModel.Enum.class, this, IECModelPackage.PROGRAM__USES_ENUM);
		}
		return usesEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IECPropertyImplementation> getAccessesProperty() {
		if (accessesProperty == null) {
			accessesProperty = new EObjectResolvingEList<IECPropertyImplementation>(IECPropertyImplementation.class, this, IECModelPackage.PROGRAM__ACCESSES_PROPERTY);
		}
		return accessesProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IECMethodImplementation> getCallsMethod() {
		if (callsMethod == null) {
			callsMethod = new EObjectResolvingEList<IECMethodImplementation>(IECMethodImplementation.class, this, IECModelPackage.PROGRAM__CALLS_METHOD);
		}
		return callsMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IECModelPackage.PROGRAM__CALLS_FUNCTION:
				return ((InternalEList<?>)getCallsFunction()).basicRemove(otherEnd, msgs);
			case IECModelPackage.PROGRAM__CALLS_FUNCTION_BLOCK:
				return ((InternalEList<?>)getCallsFunctionBlock()).basicRemove(otherEnd, msgs);
			case IECModelPackage.PROGRAM__IMPLEMENTS_INTERFACE:
				return ((InternalEList<?>)getImplementsInterface()).basicRemove(otherEnd, msgs);
			case IECModelPackage.PROGRAM__DECLARES_VARIABLE:
				return ((InternalEList<?>)getDeclaresVariable()).basicRemove(otherEnd, msgs);
			case IECModelPackage.PROGRAM__USES_ENUM:
				return ((InternalEList<?>)getUsesEnum()).basicRemove(otherEnd, msgs);
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
			case IECModelPackage.PROGRAM__CALLS_FUNCTION:
				return getCallsFunction();
			case IECModelPackage.PROGRAM__CALLS_FUNCTION_BLOCK:
				return getCallsFunctionBlock();
			case IECModelPackage.PROGRAM__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case IECModelPackage.PROGRAM__IMPLEMENTS_INTERFACE:
				return getImplementsInterface();
			case IECModelPackage.PROGRAM__DECLARES_VARIABLE:
				return getDeclaresVariable();
			case IECModelPackage.PROGRAM__USES_ENUM:
				return getUsesEnum();
			case IECModelPackage.PROGRAM__ACCESSES_PROPERTY:
				return getAccessesProperty();
			case IECModelPackage.PROGRAM__CALLS_METHOD:
				return getCallsMethod();
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
			case IECModelPackage.PROGRAM__CALLS_FUNCTION:
				getCallsFunction().clear();
				getCallsFunction().addAll((Collection<? extends Function>)newValue);
				return;
			case IECModelPackage.PROGRAM__CALLS_FUNCTION_BLOCK:
				getCallsFunctionBlock().clear();
				getCallsFunctionBlock().addAll((Collection<? extends FunctionBlock>)newValue);
				return;
			case IECModelPackage.PROGRAM__TYPE:
				setType((edu.kit.ipd.sdq.kamp4iec.model.IECRepository.Program)newValue);
				return;
			case IECModelPackage.PROGRAM__IMPLEMENTS_INTERFACE:
				getImplementsInterface().clear();
				getImplementsInterface().addAll((Collection<? extends IECInterface>)newValue);
				return;
			case IECModelPackage.PROGRAM__DECLARES_VARIABLE:
				getDeclaresVariable().clear();
				getDeclaresVariable().addAll((Collection<? extends GlobalVariable>)newValue);
				return;
			case IECModelPackage.PROGRAM__USES_ENUM:
				getUsesEnum().clear();
				getUsesEnum().addAll((Collection<? extends edu.kit.ipd.sdq.kamp4iec.model.IECModel.Enum>)newValue);
				return;
			case IECModelPackage.PROGRAM__ACCESSES_PROPERTY:
				getAccessesProperty().clear();
				getAccessesProperty().addAll((Collection<? extends IECPropertyImplementation>)newValue);
				return;
			case IECModelPackage.PROGRAM__CALLS_METHOD:
				getCallsMethod().clear();
				getCallsMethod().addAll((Collection<? extends IECMethodImplementation>)newValue);
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
			case IECModelPackage.PROGRAM__CALLS_FUNCTION:
				getCallsFunction().clear();
				return;
			case IECModelPackage.PROGRAM__CALLS_FUNCTION_BLOCK:
				getCallsFunctionBlock().clear();
				return;
			case IECModelPackage.PROGRAM__TYPE:
				setType((edu.kit.ipd.sdq.kamp4iec.model.IECRepository.Program)null);
				return;
			case IECModelPackage.PROGRAM__IMPLEMENTS_INTERFACE:
				getImplementsInterface().clear();
				return;
			case IECModelPackage.PROGRAM__DECLARES_VARIABLE:
				getDeclaresVariable().clear();
				return;
			case IECModelPackage.PROGRAM__USES_ENUM:
				getUsesEnum().clear();
				return;
			case IECModelPackage.PROGRAM__ACCESSES_PROPERTY:
				getAccessesProperty().clear();
				return;
			case IECModelPackage.PROGRAM__CALLS_METHOD:
				getCallsMethod().clear();
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
			case IECModelPackage.PROGRAM__CALLS_FUNCTION:
				return callsFunction != null && !callsFunction.isEmpty();
			case IECModelPackage.PROGRAM__CALLS_FUNCTION_BLOCK:
				return callsFunctionBlock != null && !callsFunctionBlock.isEmpty();
			case IECModelPackage.PROGRAM__TYPE:
				return type != null;
			case IECModelPackage.PROGRAM__IMPLEMENTS_INTERFACE:
				return implementsInterface != null && !implementsInterface.isEmpty();
			case IECModelPackage.PROGRAM__DECLARES_VARIABLE:
				return declaresVariable != null && !declaresVariable.isEmpty();
			case IECModelPackage.PROGRAM__USES_ENUM:
				return usesEnum != null && !usesEnum.isEmpty();
			case IECModelPackage.PROGRAM__ACCESSES_PROPERTY:
				return accessesProperty != null && !accessesProperty.isEmpty();
			case IECModelPackage.PROGRAM__CALLS_METHOD:
				return callsMethod != null && !callsMethod.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ProgramImpl
