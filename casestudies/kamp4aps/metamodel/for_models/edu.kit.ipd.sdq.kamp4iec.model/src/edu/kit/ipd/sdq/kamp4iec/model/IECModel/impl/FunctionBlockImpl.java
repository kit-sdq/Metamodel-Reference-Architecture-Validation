/**
 */
package edu.kit.ipd.sdq.kamp4iec.model.IECModel.impl;

import edu.kit.ipd.sdq.kamp4iec.model.IECModel.FunctionBlock;
import edu.kit.ipd.sdq.kamp4iec.model.IECModel.IECMethodImplementation;
import edu.kit.ipd.sdq.kamp4iec.model.IECModel.IECModelPackage;
import edu.kit.ipd.sdq.kamp4iec.model.IECModel.IECPropertyImplementation;

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
 * An implementation of the model object '<em><b>Function Block</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECModel.impl.FunctionBlockImpl#getType <em>Type</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECModel.impl.FunctionBlockImpl#getAccessesProperty <em>Accesses Property</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECModel.impl.FunctionBlockImpl#getHasMethod <em>Has Method</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECModel.impl.FunctionBlockImpl#getHasProperty <em>Has Property</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FunctionBlockImpl extends IdentifierImpl implements FunctionBlock {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected edu.kit.ipd.sdq.kamp4iec.model.IECRepository.FunctionBlock type;

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
	 * The cached value of the '{@link #getHasMethod() <em>Has Method</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasMethod()
	 * @generated
	 * @ordered
	 */
	protected EList<IECMethodImplementation> hasMethod;

	/**
	 * The cached value of the '{@link #getHasProperty() <em>Has Property</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<IECPropertyImplementation> hasProperty;

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
		return IECModelPackage.Literals.FUNCTION_BLOCK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public edu.kit.ipd.sdq.kamp4iec.model.IECRepository.FunctionBlock getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (edu.kit.ipd.sdq.kamp4iec.model.IECRepository.FunctionBlock)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IECModelPackage.FUNCTION_BLOCK__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public edu.kit.ipd.sdq.kamp4iec.model.IECRepository.FunctionBlock basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(edu.kit.ipd.sdq.kamp4iec.model.IECRepository.FunctionBlock newType) {
		edu.kit.ipd.sdq.kamp4iec.model.IECRepository.FunctionBlock oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IECModelPackage.FUNCTION_BLOCK__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IECPropertyImplementation> getAccessesProperty() {
		if (accessesProperty == null) {
			accessesProperty = new EObjectResolvingEList<IECPropertyImplementation>(IECPropertyImplementation.class, this, IECModelPackage.FUNCTION_BLOCK__ACCESSES_PROPERTY);
		}
		return accessesProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IECMethodImplementation> getHasMethod() {
		if (hasMethod == null) {
			hasMethod = new EObjectContainmentEList<IECMethodImplementation>(IECMethodImplementation.class, this, IECModelPackage.FUNCTION_BLOCK__HAS_METHOD);
		}
		return hasMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IECPropertyImplementation> getHasProperty() {
		if (hasProperty == null) {
			hasProperty = new EObjectContainmentEList<IECPropertyImplementation>(IECPropertyImplementation.class, this, IECModelPackage.FUNCTION_BLOCK__HAS_PROPERTY);
		}
		return hasProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IECModelPackage.FUNCTION_BLOCK__HAS_METHOD:
				return ((InternalEList<?>)getHasMethod()).basicRemove(otherEnd, msgs);
			case IECModelPackage.FUNCTION_BLOCK__HAS_PROPERTY:
				return ((InternalEList<?>)getHasProperty()).basicRemove(otherEnd, msgs);
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
			case IECModelPackage.FUNCTION_BLOCK__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case IECModelPackage.FUNCTION_BLOCK__ACCESSES_PROPERTY:
				return getAccessesProperty();
			case IECModelPackage.FUNCTION_BLOCK__HAS_METHOD:
				return getHasMethod();
			case IECModelPackage.FUNCTION_BLOCK__HAS_PROPERTY:
				return getHasProperty();
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
			case IECModelPackage.FUNCTION_BLOCK__TYPE:
				setType((edu.kit.ipd.sdq.kamp4iec.model.IECRepository.FunctionBlock)newValue);
				return;
			case IECModelPackage.FUNCTION_BLOCK__ACCESSES_PROPERTY:
				getAccessesProperty().clear();
				getAccessesProperty().addAll((Collection<? extends IECPropertyImplementation>)newValue);
				return;
			case IECModelPackage.FUNCTION_BLOCK__HAS_METHOD:
				getHasMethod().clear();
				getHasMethod().addAll((Collection<? extends IECMethodImplementation>)newValue);
				return;
			case IECModelPackage.FUNCTION_BLOCK__HAS_PROPERTY:
				getHasProperty().clear();
				getHasProperty().addAll((Collection<? extends IECPropertyImplementation>)newValue);
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
			case IECModelPackage.FUNCTION_BLOCK__TYPE:
				setType((edu.kit.ipd.sdq.kamp4iec.model.IECRepository.FunctionBlock)null);
				return;
			case IECModelPackage.FUNCTION_BLOCK__ACCESSES_PROPERTY:
				getAccessesProperty().clear();
				return;
			case IECModelPackage.FUNCTION_BLOCK__HAS_METHOD:
				getHasMethod().clear();
				return;
			case IECModelPackage.FUNCTION_BLOCK__HAS_PROPERTY:
				getHasProperty().clear();
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
			case IECModelPackage.FUNCTION_BLOCK__TYPE:
				return type != null;
			case IECModelPackage.FUNCTION_BLOCK__ACCESSES_PROPERTY:
				return accessesProperty != null && !accessesProperty.isEmpty();
			case IECModelPackage.FUNCTION_BLOCK__HAS_METHOD:
				return hasMethod != null && !hasMethod.isEmpty();
			case IECModelPackage.FUNCTION_BLOCK__HAS_PROPERTY:
				return hasProperty != null && !hasProperty.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FunctionBlockImpl
