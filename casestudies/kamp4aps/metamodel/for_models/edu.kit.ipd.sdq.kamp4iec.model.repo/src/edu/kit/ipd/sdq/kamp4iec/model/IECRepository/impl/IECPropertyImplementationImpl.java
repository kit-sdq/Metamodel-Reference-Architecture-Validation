/**
 */
package edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl;

import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.GlobalVariable;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECProperty;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECPropertyImplementation;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECRepositoryPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>IEC Property Implementation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IECPropertyImplementationImpl#getImplements <em>Implements</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IECPropertyImplementationImpl#getAccessesVariable <em>Accesses Variable</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IECPropertyImplementationImpl#getUsesEnum <em>Uses Enum</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IECPropertyImplementationImpl extends IdentifierImpl implements IECPropertyImplementation {
	/**
	 * The cached value of the '{@link #getImplements() <em>Implements</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplements()
	 * @generated
	 * @ordered
	 */
	protected IECProperty implements_;

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
	 * The cached value of the '{@link #getUsesEnum() <em>Uses Enum</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsesEnum()
	 * @generated
	 * @ordered
	 */
	protected EList<edu.kit.ipd.sdq.kamp4iec.model.IECRepository.Enum> usesEnum;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IECPropertyImplementationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IECRepositoryPackage.Literals.IEC_PROPERTY_IMPLEMENTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IECProperty getImplements() {
		if (implements_ != null && implements_.eIsProxy()) {
			InternalEObject oldImplements = (InternalEObject)implements_;
			implements_ = (IECProperty)eResolveProxy(oldImplements);
			if (implements_ != oldImplements) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IECRepositoryPackage.IEC_PROPERTY_IMPLEMENTATION__IMPLEMENTS, oldImplements, implements_));
			}
		}
		return implements_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IECProperty basicGetImplements() {
		return implements_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImplements(IECProperty newImplements) {
		IECProperty oldImplements = implements_;
		implements_ = newImplements;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IECRepositoryPackage.IEC_PROPERTY_IMPLEMENTATION__IMPLEMENTS, oldImplements, implements_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GlobalVariable> getAccessesVariable() {
		if (accessesVariable == null) {
			accessesVariable = new EObjectResolvingEList<GlobalVariable>(GlobalVariable.class, this, IECRepositoryPackage.IEC_PROPERTY_IMPLEMENTATION__ACCESSES_VARIABLE);
		}
		return accessesVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<edu.kit.ipd.sdq.kamp4iec.model.IECRepository.Enum> getUsesEnum() {
		if (usesEnum == null) {
			usesEnum = new EObjectResolvingEList<edu.kit.ipd.sdq.kamp4iec.model.IECRepository.Enum>(edu.kit.ipd.sdq.kamp4iec.model.IECRepository.Enum.class, this, IECRepositoryPackage.IEC_PROPERTY_IMPLEMENTATION__USES_ENUM);
		}
		return usesEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IECRepositoryPackage.IEC_PROPERTY_IMPLEMENTATION__IMPLEMENTS:
				if (resolve) return getImplements();
				return basicGetImplements();
			case IECRepositoryPackage.IEC_PROPERTY_IMPLEMENTATION__ACCESSES_VARIABLE:
				return getAccessesVariable();
			case IECRepositoryPackage.IEC_PROPERTY_IMPLEMENTATION__USES_ENUM:
				return getUsesEnum();
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
			case IECRepositoryPackage.IEC_PROPERTY_IMPLEMENTATION__IMPLEMENTS:
				setImplements((IECProperty)newValue);
				return;
			case IECRepositoryPackage.IEC_PROPERTY_IMPLEMENTATION__ACCESSES_VARIABLE:
				getAccessesVariable().clear();
				getAccessesVariable().addAll((Collection<? extends GlobalVariable>)newValue);
				return;
			case IECRepositoryPackage.IEC_PROPERTY_IMPLEMENTATION__USES_ENUM:
				getUsesEnum().clear();
				getUsesEnum().addAll((Collection<? extends edu.kit.ipd.sdq.kamp4iec.model.IECRepository.Enum>)newValue);
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
			case IECRepositoryPackage.IEC_PROPERTY_IMPLEMENTATION__IMPLEMENTS:
				setImplements((IECProperty)null);
				return;
			case IECRepositoryPackage.IEC_PROPERTY_IMPLEMENTATION__ACCESSES_VARIABLE:
				getAccessesVariable().clear();
				return;
			case IECRepositoryPackage.IEC_PROPERTY_IMPLEMENTATION__USES_ENUM:
				getUsesEnum().clear();
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
			case IECRepositoryPackage.IEC_PROPERTY_IMPLEMENTATION__IMPLEMENTS:
				return implements_ != null;
			case IECRepositoryPackage.IEC_PROPERTY_IMPLEMENTATION__ACCESSES_VARIABLE:
				return accessesVariable != null && !accessesVariable.isEmpty();
			case IECRepositoryPackage.IEC_PROPERTY_IMPLEMENTATION__USES_ENUM:
				return usesEnum != null && !usesEnum.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //IECPropertyImplementationImpl
