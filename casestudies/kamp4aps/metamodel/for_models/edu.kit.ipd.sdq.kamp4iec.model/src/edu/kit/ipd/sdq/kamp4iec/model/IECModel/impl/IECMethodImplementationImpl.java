/**
 */
package edu.kit.ipd.sdq.kamp4iec.model.IECModel.impl;

import edu.kit.ipd.sdq.kamp4iec.model.IECModel.GlobalVariable;
import edu.kit.ipd.sdq.kamp4iec.model.IECModel.IECMethodImplementation;
import edu.kit.ipd.sdq.kamp4iec.model.IECModel.IECModelPackage;
import edu.kit.ipd.sdq.kamp4iec.model.IECModel.IECPropertyImplementation;

import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IdentifierImpl;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>IEC Method Implementation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECModel.impl.IECMethodImplementationImpl#getType <em>Type</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECModel.impl.IECMethodImplementationImpl#getAccessesGlobalVariable <em>Accesses Global Variable</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECModel.impl.IECMethodImplementationImpl#getAccessesProperty <em>Accesses Property</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IECMethodImplementationImpl extends IdentifierImpl implements IECMethodImplementation {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECMethodImplementation type;

	/**
	 * The cached value of the '{@link #getAccessesGlobalVariable() <em>Accesses Global Variable</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessesGlobalVariable()
	 * @generated
	 * @ordered
	 */
	protected EList<GlobalVariable> accessesGlobalVariable;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IECMethodImplementationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IECModelPackage.Literals.IEC_METHOD_IMPLEMENTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECMethodImplementation getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECMethodImplementation)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IECModelPackage.IEC_METHOD_IMPLEMENTATION__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECMethodImplementation basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECMethodImplementation newType) {
		edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECMethodImplementation oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IECModelPackage.IEC_METHOD_IMPLEMENTATION__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GlobalVariable> getAccessesGlobalVariable() {
		if (accessesGlobalVariable == null) {
			accessesGlobalVariable = new EObjectResolvingEList<GlobalVariable>(GlobalVariable.class, this, IECModelPackage.IEC_METHOD_IMPLEMENTATION__ACCESSES_GLOBAL_VARIABLE);
		}
		return accessesGlobalVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IECPropertyImplementation> getAccessesProperty() {
		if (accessesProperty == null) {
			accessesProperty = new EObjectResolvingEList<IECPropertyImplementation>(IECPropertyImplementation.class, this, IECModelPackage.IEC_METHOD_IMPLEMENTATION__ACCESSES_PROPERTY);
		}
		return accessesProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IECModelPackage.IEC_METHOD_IMPLEMENTATION__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case IECModelPackage.IEC_METHOD_IMPLEMENTATION__ACCESSES_GLOBAL_VARIABLE:
				return getAccessesGlobalVariable();
			case IECModelPackage.IEC_METHOD_IMPLEMENTATION__ACCESSES_PROPERTY:
				return getAccessesProperty();
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
			case IECModelPackage.IEC_METHOD_IMPLEMENTATION__TYPE:
				setType((edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECMethodImplementation)newValue);
				return;
			case IECModelPackage.IEC_METHOD_IMPLEMENTATION__ACCESSES_GLOBAL_VARIABLE:
				getAccessesGlobalVariable().clear();
				getAccessesGlobalVariable().addAll((Collection<? extends GlobalVariable>)newValue);
				return;
			case IECModelPackage.IEC_METHOD_IMPLEMENTATION__ACCESSES_PROPERTY:
				getAccessesProperty().clear();
				getAccessesProperty().addAll((Collection<? extends IECPropertyImplementation>)newValue);
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
			case IECModelPackage.IEC_METHOD_IMPLEMENTATION__TYPE:
				setType((edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECMethodImplementation)null);
				return;
			case IECModelPackage.IEC_METHOD_IMPLEMENTATION__ACCESSES_GLOBAL_VARIABLE:
				getAccessesGlobalVariable().clear();
				return;
			case IECModelPackage.IEC_METHOD_IMPLEMENTATION__ACCESSES_PROPERTY:
				getAccessesProperty().clear();
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
			case IECModelPackage.IEC_METHOD_IMPLEMENTATION__TYPE:
				return type != null;
			case IECModelPackage.IEC_METHOD_IMPLEMENTATION__ACCESSES_GLOBAL_VARIABLE:
				return accessesGlobalVariable != null && !accessesGlobalVariable.isEmpty();
			case IECModelPackage.IEC_METHOD_IMPLEMENTATION__ACCESSES_PROPERTY:
				return accessesProperty != null && !accessesProperty.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //IECMethodImplementationImpl
