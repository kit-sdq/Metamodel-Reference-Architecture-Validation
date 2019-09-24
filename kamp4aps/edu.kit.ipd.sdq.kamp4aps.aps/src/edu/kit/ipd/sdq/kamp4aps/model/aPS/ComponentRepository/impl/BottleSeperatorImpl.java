/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.BottleSeperator;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.ComponentRepositoryPackage;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.PowerSupply;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.PneumaticSupply;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.Screwing;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.SignalInterface;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bottle Seperator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.BottleSeperatorImpl#getSignalinterface <em>Signalinterface</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.BottleSeperatorImpl#getPneumaticsupply <em>Pneumaticsupply</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.BottleSeperatorImpl#getPowersupply <em>Powersupply</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.BottleSeperatorImpl#getScrewing_to_rack <em>Screwing to rack</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BottleSeperatorImpl extends ComponentImpl implements BottleSeperator {
	/**
	 * The cached value of the '{@link #getSignalinterface() <em>Signalinterface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignalinterface()
	 * @generated
	 * @ordered
	 */
	protected SignalInterface signalinterface;

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
	 * The cached value of the '{@link #getPowersupply() <em>Powersupply</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowersupply()
	 * @generated
	 * @ordered
	 */
	protected PowerSupply powersupply;

	/**
	 * The cached value of the '{@link #getScrewing_to_rack() <em>Screwing to rack</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScrewing_to_rack()
	 * @generated
	 * @ordered
	 */
	protected Screwing screwing_to_rack;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BottleSeperatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentRepositoryPackage.Literals.BOTTLE_SEPERATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignalInterface getSignalinterface() {
		if (signalinterface != null && signalinterface.eIsProxy()) {
			InternalEObject oldSignalinterface = (InternalEObject)signalinterface;
			signalinterface = (SignalInterface)eResolveProxy(oldSignalinterface);
			if (signalinterface != oldSignalinterface) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComponentRepositoryPackage.BOTTLE_SEPERATOR__SIGNALINTERFACE, oldSignalinterface, signalinterface));
			}
		}
		return signalinterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignalInterface basicGetSignalinterface() {
		return signalinterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSignalinterface(SignalInterface newSignalinterface) {
		SignalInterface oldSignalinterface = signalinterface;
		signalinterface = newSignalinterface;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentRepositoryPackage.BOTTLE_SEPERATOR__SIGNALINTERFACE, oldSignalinterface, signalinterface));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComponentRepositoryPackage.BOTTLE_SEPERATOR__PNEUMATICSUPPLY, oldPneumaticsupply, pneumaticsupply));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentRepositoryPackage.BOTTLE_SEPERATOR__PNEUMATICSUPPLY, oldPneumaticsupply, pneumaticsupply));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComponentRepositoryPackage.BOTTLE_SEPERATOR__POWERSUPPLY, oldPowersupply, powersupply));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentRepositoryPackage.BOTTLE_SEPERATOR__POWERSUPPLY, oldPowersupply, powersupply));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Screwing getScrewing_to_rack() {
		if (screwing_to_rack != null && screwing_to_rack.eIsProxy()) {
			InternalEObject oldScrewing_to_rack = (InternalEObject)screwing_to_rack;
			screwing_to_rack = (Screwing)eResolveProxy(oldScrewing_to_rack);
			if (screwing_to_rack != oldScrewing_to_rack) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComponentRepositoryPackage.BOTTLE_SEPERATOR__SCREWING_TO_RACK, oldScrewing_to_rack, screwing_to_rack));
			}
		}
		return screwing_to_rack;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Screwing basicGetScrewing_to_rack() {
		return screwing_to_rack;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScrewing_to_rack(Screwing newScrewing_to_rack) {
		Screwing oldScrewing_to_rack = screwing_to_rack;
		screwing_to_rack = newScrewing_to_rack;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentRepositoryPackage.BOTTLE_SEPERATOR__SCREWING_TO_RACK, oldScrewing_to_rack, screwing_to_rack));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ComponentRepositoryPackage.BOTTLE_SEPERATOR__SIGNALINTERFACE:
				if (resolve) return getSignalinterface();
				return basicGetSignalinterface();
			case ComponentRepositoryPackage.BOTTLE_SEPERATOR__PNEUMATICSUPPLY:
				if (resolve) return getPneumaticsupply();
				return basicGetPneumaticsupply();
			case ComponentRepositoryPackage.BOTTLE_SEPERATOR__POWERSUPPLY:
				if (resolve) return getPowersupply();
				return basicGetPowersupply();
			case ComponentRepositoryPackage.BOTTLE_SEPERATOR__SCREWING_TO_RACK:
				if (resolve) return getScrewing_to_rack();
				return basicGetScrewing_to_rack();
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
			case ComponentRepositoryPackage.BOTTLE_SEPERATOR__SIGNALINTERFACE:
				setSignalinterface((SignalInterface)newValue);
				return;
			case ComponentRepositoryPackage.BOTTLE_SEPERATOR__PNEUMATICSUPPLY:
				setPneumaticsupply((PneumaticSupply)newValue);
				return;
			case ComponentRepositoryPackage.BOTTLE_SEPERATOR__POWERSUPPLY:
				setPowersupply((PowerSupply)newValue);
				return;
			case ComponentRepositoryPackage.BOTTLE_SEPERATOR__SCREWING_TO_RACK:
				setScrewing_to_rack((Screwing)newValue);
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
			case ComponentRepositoryPackage.BOTTLE_SEPERATOR__SIGNALINTERFACE:
				setSignalinterface((SignalInterface)null);
				return;
			case ComponentRepositoryPackage.BOTTLE_SEPERATOR__PNEUMATICSUPPLY:
				setPneumaticsupply((PneumaticSupply)null);
				return;
			case ComponentRepositoryPackage.BOTTLE_SEPERATOR__POWERSUPPLY:
				setPowersupply((PowerSupply)null);
				return;
			case ComponentRepositoryPackage.BOTTLE_SEPERATOR__SCREWING_TO_RACK:
				setScrewing_to_rack((Screwing)null);
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
			case ComponentRepositoryPackage.BOTTLE_SEPERATOR__SIGNALINTERFACE:
				return signalinterface != null;
			case ComponentRepositoryPackage.BOTTLE_SEPERATOR__PNEUMATICSUPPLY:
				return pneumaticsupply != null;
			case ComponentRepositoryPackage.BOTTLE_SEPERATOR__POWERSUPPLY:
				return powersupply != null;
			case ComponentRepositoryPackage.BOTTLE_SEPERATOR__SCREWING_TO_RACK:
				return screwing_to_rack != null;
		}
		return super.eIsSet(featureID);
	}

} //BottleSeperatorImpl
