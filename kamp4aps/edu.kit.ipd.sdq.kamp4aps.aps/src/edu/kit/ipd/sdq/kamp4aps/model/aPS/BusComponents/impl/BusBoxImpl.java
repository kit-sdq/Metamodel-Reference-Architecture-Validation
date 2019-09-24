/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.impl;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.BusBox;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.BusComponentsPackage;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.PowerSupply;

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
 * An implementation of the model object '<em><b>Bus Box</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.impl.BusBoxImpl#getSignalinterfaces <em>Signalinterfaces</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.impl.BusBoxImpl#getSignalinterface_master <em>Signalinterface master</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.impl.BusBoxImpl#getSignalinterface_box <em>Signalinterface box</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.impl.BusBoxImpl#getPowersupply <em>Powersupply</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BusBoxImpl extends ComponentImpl implements BusBox {
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
	 * The cached value of the '{@link #getSignalinterface_master() <em>Signalinterface master</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignalinterface_master()
	 * @generated
	 * @ordered
	 */
	protected SignalInterface signalinterface_master;

	/**
	 * The cached value of the '{@link #getSignalinterface_box() <em>Signalinterface box</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignalinterface_box()
	 * @generated
	 * @ordered
	 */
	protected SignalInterface signalinterface_box;

	/**
	 * The cached value of the '{@link #getPowersupply() <em>Powersupply</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowersupply()
	 * @generated
	 * @ordered
	 */
	protected PowerSupply powersupply;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BusBoxImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BusComponentsPackage.Literals.BUS_BOX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SignalInterface> getSignalinterfaces() {
		if (signalinterfaces == null) {
			signalinterfaces = new EObjectResolvingEList<SignalInterface>(SignalInterface.class, this, BusComponentsPackage.BUS_BOX__SIGNALINTERFACES);
		}
		return signalinterfaces;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BusComponentsPackage.BUS_BOX__SIGNALINTERFACE_MASTER, oldSignalinterface_master, signalinterface_master));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BusComponentsPackage.BUS_BOX__SIGNALINTERFACE_MASTER, oldSignalinterface_master, signalinterface_master));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignalInterface getSignalinterface_box() {
		if (signalinterface_box != null && signalinterface_box.eIsProxy()) {
			InternalEObject oldSignalinterface_box = (InternalEObject)signalinterface_box;
			signalinterface_box = (SignalInterface)eResolveProxy(oldSignalinterface_box);
			if (signalinterface_box != oldSignalinterface_box) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BusComponentsPackage.BUS_BOX__SIGNALINTERFACE_BOX, oldSignalinterface_box, signalinterface_box));
			}
		}
		return signalinterface_box;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignalInterface basicGetSignalinterface_box() {
		return signalinterface_box;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSignalinterface_box(SignalInterface newSignalinterface_box) {
		SignalInterface oldSignalinterface_box = signalinterface_box;
		signalinterface_box = newSignalinterface_box;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BusComponentsPackage.BUS_BOX__SIGNALINTERFACE_BOX, oldSignalinterface_box, signalinterface_box));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PowerSupply getPowersupply() {
		if (powersupply != null && powersupply.eIsProxy()) {
			InternalEObject oldPowersupply = (InternalEObject)powersupply;
			powersupply = (PowerSupply)eResolveProxy(oldPowersupply);
			if (powersupply != oldPowersupply) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BusComponentsPackage.BUS_BOX__POWERSUPPLY, oldPowersupply, powersupply));
			}
		}
		return powersupply;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PowerSupply basicGetPowersupply() {
		return powersupply;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPowersupply(PowerSupply newPowersupply) {
		PowerSupply oldPowersupply = powersupply;
		powersupply = newPowersupply;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BusComponentsPackage.BUS_BOX__POWERSUPPLY, oldPowersupply, powersupply));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BusComponentsPackage.BUS_BOX__SIGNALINTERFACES:
				return getSignalinterfaces();
			case BusComponentsPackage.BUS_BOX__SIGNALINTERFACE_MASTER:
				if (resolve) return getSignalinterface_master();
				return basicGetSignalinterface_master();
			case BusComponentsPackage.BUS_BOX__SIGNALINTERFACE_BOX:
				if (resolve) return getSignalinterface_box();
				return basicGetSignalinterface_box();
			case BusComponentsPackage.BUS_BOX__POWERSUPPLY:
				if (resolve) return getPowersupply();
				return basicGetPowersupply();
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
			case BusComponentsPackage.BUS_BOX__SIGNALINTERFACES:
				getSignalinterfaces().clear();
				getSignalinterfaces().addAll((Collection<? extends SignalInterface>)newValue);
				return;
			case BusComponentsPackage.BUS_BOX__SIGNALINTERFACE_MASTER:
				setSignalinterface_master((SignalInterface)newValue);
				return;
			case BusComponentsPackage.BUS_BOX__SIGNALINTERFACE_BOX:
				setSignalinterface_box((SignalInterface)newValue);
				return;
			case BusComponentsPackage.BUS_BOX__POWERSUPPLY:
				setPowersupply((PowerSupply)newValue);
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
			case BusComponentsPackage.BUS_BOX__SIGNALINTERFACES:
				getSignalinterfaces().clear();
				return;
			case BusComponentsPackage.BUS_BOX__SIGNALINTERFACE_MASTER:
				setSignalinterface_master((SignalInterface)null);
				return;
			case BusComponentsPackage.BUS_BOX__SIGNALINTERFACE_BOX:
				setSignalinterface_box((SignalInterface)null);
				return;
			case BusComponentsPackage.BUS_BOX__POWERSUPPLY:
				setPowersupply((PowerSupply)null);
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
			case BusComponentsPackage.BUS_BOX__SIGNALINTERFACES:
				return signalinterfaces != null && !signalinterfaces.isEmpty();
			case BusComponentsPackage.BUS_BOX__SIGNALINTERFACE_MASTER:
				return signalinterface_master != null;
			case BusComponentsPackage.BUS_BOX__SIGNALINTERFACE_BOX:
				return signalinterface_box != null;
			case BusComponentsPackage.BUS_BOX__POWERSUPPLY:
				return powersupply != null;
		}
		return super.eIsSet(featureID);
	}

} //BusBoxImpl
