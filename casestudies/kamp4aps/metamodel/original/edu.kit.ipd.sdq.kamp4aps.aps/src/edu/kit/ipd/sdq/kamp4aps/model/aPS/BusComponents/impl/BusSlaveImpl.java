/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.impl;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.BusComponentsPackage;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.BusSlave;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.ComponentImpl;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.SignalInterface;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bus Slave</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.impl.BusSlaveImpl#getSignalinterface_master <em>Signalinterface master</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.impl.BusSlaveImpl#getSignalinterface_slave <em>Signalinterface slave</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BusSlaveImpl extends ComponentImpl implements BusSlave {
	/**
	 * The cached value of the '{@link #getSignalinterface_master() <em>Signalinterface master</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignalinterface_master()
	 * @generated
	 * @ordered
	 */
	protected SignalInterface signalinterface_master;

	/**
	 * The cached value of the '{@link #getSignalinterface_slave() <em>Signalinterface slave</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignalinterface_slave()
	 * @generated
	 * @ordered
	 */
	protected SignalInterface signalinterface_slave;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BusSlaveImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BusComponentsPackage.Literals.BUS_SLAVE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignalInterface getSignalinterface_master() {
		if (signalinterface_master != null && signalinterface_master.eIsProxy()) {
			InternalEObject oldSignalinterface_master = (InternalEObject)signalinterface_master;
			signalinterface_master = (SignalInterface)eResolveProxy(oldSignalinterface_master);
			if (signalinterface_master != oldSignalinterface_master) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BusComponentsPackage.BUS_SLAVE__SIGNALINTERFACE_MASTER, oldSignalinterface_master, signalinterface_master));
			}
		}
		return signalinterface_master;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignalInterface basicGetSignalinterface_master() {
		return signalinterface_master;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSignalinterface_master(SignalInterface newSignalinterface_master) {
		SignalInterface oldSignalinterface_master = signalinterface_master;
		signalinterface_master = newSignalinterface_master;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BusComponentsPackage.BUS_SLAVE__SIGNALINTERFACE_MASTER, oldSignalinterface_master, signalinterface_master));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignalInterface getSignalinterface_slave() {
		if (signalinterface_slave != null && signalinterface_slave.eIsProxy()) {
			InternalEObject oldSignalinterface_slave = (InternalEObject)signalinterface_slave;
			signalinterface_slave = (SignalInterface)eResolveProxy(oldSignalinterface_slave);
			if (signalinterface_slave != oldSignalinterface_slave) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BusComponentsPackage.BUS_SLAVE__SIGNALINTERFACE_SLAVE, oldSignalinterface_slave, signalinterface_slave));
			}
		}
		return signalinterface_slave;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignalInterface basicGetSignalinterface_slave() {
		return signalinterface_slave;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSignalinterface_slave(SignalInterface newSignalinterface_slave) {
		SignalInterface oldSignalinterface_slave = signalinterface_slave;
		signalinterface_slave = newSignalinterface_slave;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BusComponentsPackage.BUS_SLAVE__SIGNALINTERFACE_SLAVE, oldSignalinterface_slave, signalinterface_slave));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BusComponentsPackage.BUS_SLAVE__SIGNALINTERFACE_MASTER:
				if (resolve) return getSignalinterface_master();
				return basicGetSignalinterface_master();
			case BusComponentsPackage.BUS_SLAVE__SIGNALINTERFACE_SLAVE:
				if (resolve) return getSignalinterface_slave();
				return basicGetSignalinterface_slave();
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
			case BusComponentsPackage.BUS_SLAVE__SIGNALINTERFACE_MASTER:
				setSignalinterface_master((SignalInterface)newValue);
				return;
			case BusComponentsPackage.BUS_SLAVE__SIGNALINTERFACE_SLAVE:
				setSignalinterface_slave((SignalInterface)newValue);
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
			case BusComponentsPackage.BUS_SLAVE__SIGNALINTERFACE_MASTER:
				setSignalinterface_master((SignalInterface)null);
				return;
			case BusComponentsPackage.BUS_SLAVE__SIGNALINTERFACE_SLAVE:
				setSignalinterface_slave((SignalInterface)null);
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
			case BusComponentsPackage.BUS_SLAVE__SIGNALINTERFACE_MASTER:
				return signalinterface_master != null;
			case BusComponentsPackage.BUS_SLAVE__SIGNALINTERFACE_SLAVE:
				return signalinterface_slave != null;
		}
		return super.eIsSet(featureID);
	}

} //BusSlaveImpl
