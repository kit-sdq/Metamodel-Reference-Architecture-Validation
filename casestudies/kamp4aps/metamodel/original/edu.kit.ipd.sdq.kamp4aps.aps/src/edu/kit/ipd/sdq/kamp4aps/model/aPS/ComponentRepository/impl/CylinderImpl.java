/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.ComponentRepositoryPackage;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Cylinder;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.PneumaticSupply;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.SignalInterface;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cylinder</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.CylinderImpl#getPneumaticsupply <em>Pneumaticsupply</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.CylinderImpl#getSignalInterface <em>Signal Interface</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class CylinderImpl extends ComponentImpl implements Cylinder {
	/**
	 * The cached value of the '{@link #getPneumaticsupply() <em>Pneumaticsupply</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPneumaticsupply()
	 * @generated
	 * @ordered
	 */
	protected PneumaticSupply pneumaticsupply;

	/**
	 * The cached value of the '{@link #getSignalInterface() <em>Signal Interface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignalInterface()
	 * @generated
	 * @ordered
	 */
	protected SignalInterface signalInterface;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CylinderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentRepositoryPackage.Literals.CYLINDER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PneumaticSupply getPneumaticsupply() {
		if (pneumaticsupply != null && pneumaticsupply.eIsProxy()) {
			InternalEObject oldPneumaticsupply = (InternalEObject)pneumaticsupply;
			pneumaticsupply = (PneumaticSupply)eResolveProxy(oldPneumaticsupply);
			if (pneumaticsupply != oldPneumaticsupply) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComponentRepositoryPackage.CYLINDER__PNEUMATICSUPPLY, oldPneumaticsupply, pneumaticsupply));
			}
		}
		return pneumaticsupply;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PneumaticSupply basicGetPneumaticsupply() {
		return pneumaticsupply;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPneumaticsupply(PneumaticSupply newPneumaticsupply) {
		PneumaticSupply oldPneumaticsupply = pneumaticsupply;
		pneumaticsupply = newPneumaticsupply;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentRepositoryPackage.CYLINDER__PNEUMATICSUPPLY, oldPneumaticsupply, pneumaticsupply));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignalInterface getSignalInterface() {
		if (signalInterface != null && signalInterface.eIsProxy()) {
			InternalEObject oldSignalInterface = (InternalEObject)signalInterface;
			signalInterface = (SignalInterface)eResolveProxy(oldSignalInterface);
			if (signalInterface != oldSignalInterface) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComponentRepositoryPackage.CYLINDER__SIGNAL_INTERFACE, oldSignalInterface, signalInterface));
			}
		}
		return signalInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignalInterface basicGetSignalInterface() {
		return signalInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSignalInterface(SignalInterface newSignalInterface) {
		SignalInterface oldSignalInterface = signalInterface;
		signalInterface = newSignalInterface;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentRepositoryPackage.CYLINDER__SIGNAL_INTERFACE, oldSignalInterface, signalInterface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ComponentRepositoryPackage.CYLINDER__PNEUMATICSUPPLY:
				if (resolve) return getPneumaticsupply();
				return basicGetPneumaticsupply();
			case ComponentRepositoryPackage.CYLINDER__SIGNAL_INTERFACE:
				if (resolve) return getSignalInterface();
				return basicGetSignalInterface();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ComponentRepositoryPackage.CYLINDER__PNEUMATICSUPPLY:
				setPneumaticsupply((PneumaticSupply)newValue);
				return;
			case ComponentRepositoryPackage.CYLINDER__SIGNAL_INTERFACE:
				setSignalInterface((SignalInterface)newValue);
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
			case ComponentRepositoryPackage.CYLINDER__PNEUMATICSUPPLY:
				setPneumaticsupply((PneumaticSupply)null);
				return;
			case ComponentRepositoryPackage.CYLINDER__SIGNAL_INTERFACE:
				setSignalInterface((SignalInterface)null);
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
			case ComponentRepositoryPackage.CYLINDER__PNEUMATICSUPPLY:
				return pneumaticsupply != null;
			case ComponentRepositoryPackage.CYLINDER__SIGNAL_INTERFACE:
				return signalInterface != null;
		}
		return super.eIsSet(featureID);
	}

} //CylinderImpl
