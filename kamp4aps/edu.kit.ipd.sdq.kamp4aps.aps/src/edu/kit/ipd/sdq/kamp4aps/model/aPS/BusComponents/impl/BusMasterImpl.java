/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.impl;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.BusComponentsPackage;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.BusMaster;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.ComponentImpl;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.SignalInterface;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bus Master</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.impl.BusMasterImpl#getSignalinterfaces <em>Signalinterfaces</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.impl.BusMasterImpl#getSignalinterface_controller <em>Signalinterface controller</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BusMasterImpl extends ComponentImpl implements BusMaster {
	/**
	 * The cached value of the '{@link #getSignalinterfaces() <em>Signalinterfaces</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignalinterfaces()
	 * @generated
	 * @ordered
	 */
	protected EList<SignalInterface> signalinterfaces;

	/**
	 * The cached value of the '{@link #getSignalinterface_controller() <em>Signalinterface controller</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignalinterface_controller()
	 * @generated
	 * @ordered
	 */
	protected SignalInterface signalinterface_controller;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BusMasterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BusComponentsPackage.Literals.BUS_MASTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SignalInterface> getSignalinterfaces() {
		if (signalinterfaces == null) {
			signalinterfaces = new EObjectResolvingEList<SignalInterface>(SignalInterface.class, this, BusComponentsPackage.BUS_MASTER__SIGNALINTERFACES);
		}
		return signalinterfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignalInterface getSignalinterface_controller() {
		if (signalinterface_controller != null && signalinterface_controller.eIsProxy()) {
			InternalEObject oldSignalinterface_controller = (InternalEObject)signalinterface_controller;
			signalinterface_controller = (SignalInterface)eResolveProxy(oldSignalinterface_controller);
			if (signalinterface_controller != oldSignalinterface_controller) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BusComponentsPackage.BUS_MASTER__SIGNALINTERFACE_CONTROLLER, oldSignalinterface_controller, signalinterface_controller));
			}
		}
		return signalinterface_controller;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignalInterface basicGetSignalinterface_controller() {
		return signalinterface_controller;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSignalinterface_controller(SignalInterface newSignalinterface_controller) {
		SignalInterface oldSignalinterface_controller = signalinterface_controller;
		signalinterface_controller = newSignalinterface_controller;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BusComponentsPackage.BUS_MASTER__SIGNALINTERFACE_CONTROLLER, oldSignalinterface_controller, signalinterface_controller));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BusComponentsPackage.BUS_MASTER__SIGNALINTERFACES:
				return getSignalinterfaces();
			case BusComponentsPackage.BUS_MASTER__SIGNALINTERFACE_CONTROLLER:
				if (resolve) return getSignalinterface_controller();
				return basicGetSignalinterface_controller();
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
			case BusComponentsPackage.BUS_MASTER__SIGNALINTERFACES:
				getSignalinterfaces().clear();
				getSignalinterfaces().addAll((Collection<? extends SignalInterface>)newValue);
				return;
			case BusComponentsPackage.BUS_MASTER__SIGNALINTERFACE_CONTROLLER:
				setSignalinterface_controller((SignalInterface)newValue);
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
			case BusComponentsPackage.BUS_MASTER__SIGNALINTERFACES:
				getSignalinterfaces().clear();
				return;
			case BusComponentsPackage.BUS_MASTER__SIGNALINTERFACE_CONTROLLER:
				setSignalinterface_controller((SignalInterface)null);
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
			case BusComponentsPackage.BUS_MASTER__SIGNALINTERFACES:
				return signalinterfaces != null && !signalinterfaces.isEmpty();
			case BusComponentsPackage.BUS_MASTER__SIGNALINTERFACE_CONTROLLER:
				return signalinterface_controller != null;
		}
		return super.eIsSet(featureID);
	}

} //BusMasterImpl
