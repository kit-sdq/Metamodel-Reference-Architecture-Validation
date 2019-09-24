/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.impl;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.BusCable;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.BusComponentsPackage;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.CableImpl;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.SignalInterface;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bus Cable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.impl.BusCableImpl#getSignalPlug1 <em>Signal Plug1</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.impl.BusCableImpl#getSignalPlug2 <em>Signal Plug2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BusCableImpl extends CableImpl implements BusCable {
	/**
	 * The cached value of the '{@link #getSignalPlug1() <em>Signal Plug1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignalPlug1()
	 * @generated
	 * @ordered
	 */
	protected SignalInterface signalPlug1;

	/**
	 * The cached value of the '{@link #getSignalPlug2() <em>Signal Plug2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignalPlug2()
	 * @generated
	 * @ordered
	 */
	protected SignalInterface signalPlug2;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BusCableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BusComponentsPackage.Literals.BUS_CABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignalInterface getSignalPlug1() {
		return signalPlug1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSignalPlug1(SignalInterface newSignalPlug1, NotificationChain msgs) {
		SignalInterface oldSignalPlug1 = signalPlug1;
		signalPlug1 = newSignalPlug1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BusComponentsPackage.BUS_CABLE__SIGNAL_PLUG1, oldSignalPlug1, newSignalPlug1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSignalPlug1(SignalInterface newSignalPlug1) {
		if (newSignalPlug1 != signalPlug1) {
			NotificationChain msgs = null;
			if (signalPlug1 != null)
				msgs = ((InternalEObject)signalPlug1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BusComponentsPackage.BUS_CABLE__SIGNAL_PLUG1, null, msgs);
			if (newSignalPlug1 != null)
				msgs = ((InternalEObject)newSignalPlug1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BusComponentsPackage.BUS_CABLE__SIGNAL_PLUG1, null, msgs);
			msgs = basicSetSignalPlug1(newSignalPlug1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BusComponentsPackage.BUS_CABLE__SIGNAL_PLUG1, newSignalPlug1, newSignalPlug1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignalInterface getSignalPlug2() {
		return signalPlug2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSignalPlug2(SignalInterface newSignalPlug2, NotificationChain msgs) {
		SignalInterface oldSignalPlug2 = signalPlug2;
		signalPlug2 = newSignalPlug2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BusComponentsPackage.BUS_CABLE__SIGNAL_PLUG2, oldSignalPlug2, newSignalPlug2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSignalPlug2(SignalInterface newSignalPlug2) {
		if (newSignalPlug2 != signalPlug2) {
			NotificationChain msgs = null;
			if (signalPlug2 != null)
				msgs = ((InternalEObject)signalPlug2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BusComponentsPackage.BUS_CABLE__SIGNAL_PLUG2, null, msgs);
			if (newSignalPlug2 != null)
				msgs = ((InternalEObject)newSignalPlug2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BusComponentsPackage.BUS_CABLE__SIGNAL_PLUG2, null, msgs);
			msgs = basicSetSignalPlug2(newSignalPlug2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BusComponentsPackage.BUS_CABLE__SIGNAL_PLUG2, newSignalPlug2, newSignalPlug2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BusComponentsPackage.BUS_CABLE__SIGNAL_PLUG1:
				return basicSetSignalPlug1(null, msgs);
			case BusComponentsPackage.BUS_CABLE__SIGNAL_PLUG2:
				return basicSetSignalPlug2(null, msgs);
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
			case BusComponentsPackage.BUS_CABLE__SIGNAL_PLUG1:
				return getSignalPlug1();
			case BusComponentsPackage.BUS_CABLE__SIGNAL_PLUG2:
				return getSignalPlug2();
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
			case BusComponentsPackage.BUS_CABLE__SIGNAL_PLUG1:
				setSignalPlug1((SignalInterface)newValue);
				return;
			case BusComponentsPackage.BUS_CABLE__SIGNAL_PLUG2:
				setSignalPlug2((SignalInterface)newValue);
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
			case BusComponentsPackage.BUS_CABLE__SIGNAL_PLUG1:
				setSignalPlug1((SignalInterface)null);
				return;
			case BusComponentsPackage.BUS_CABLE__SIGNAL_PLUG2:
				setSignalPlug2((SignalInterface)null);
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
			case BusComponentsPackage.BUS_CABLE__SIGNAL_PLUG1:
				return signalPlug1 != null;
			case BusComponentsPackage.BUS_CABLE__SIGNAL_PLUG2:
				return signalPlug2 != null;
		}
		return super.eIsSet(featureID);
	}

} //BusCableImpl
