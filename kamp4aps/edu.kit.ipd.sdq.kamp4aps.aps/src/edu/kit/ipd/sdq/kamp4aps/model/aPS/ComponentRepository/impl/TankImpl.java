/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.ComponentRepositoryPackage;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Tank;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.Screwing;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.WaterSupply;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tank</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.TankImpl#getWatersupply <em>Watersupply</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.TankImpl#getScrewing <em>Screwing</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TankImpl extends ComponentImpl implements Tank {
	/**
	 * The cached value of the '{@link #getWatersupply() <em>Watersupply</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWatersupply()
	 * @generated
	 * @ordered
	 */
	protected WaterSupply watersupply;

	/**
	 * The cached value of the '{@link #getScrewing() <em>Screwing</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScrewing()
	 * @generated
	 * @ordered
	 */
	protected Screwing screwing;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TankImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentRepositoryPackage.Literals.TANK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WaterSupply getWatersupply() {
		if (watersupply != null && watersupply.eIsProxy()) {
			InternalEObject oldWatersupply = (InternalEObject)watersupply;
			watersupply = (WaterSupply)eResolveProxy(oldWatersupply);
			if (watersupply != oldWatersupply) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComponentRepositoryPackage.TANK__WATERSUPPLY, oldWatersupply, watersupply));
			}
		}
		return watersupply;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WaterSupply basicGetWatersupply() {
		return watersupply;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWatersupply(WaterSupply newWatersupply) {
		WaterSupply oldWatersupply = watersupply;
		watersupply = newWatersupply;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentRepositoryPackage.TANK__WATERSUPPLY, oldWatersupply, watersupply));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Screwing getScrewing() {
		if (screwing != null && screwing.eIsProxy()) {
			InternalEObject oldScrewing = (InternalEObject)screwing;
			screwing = (Screwing)eResolveProxy(oldScrewing);
			if (screwing != oldScrewing) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComponentRepositoryPackage.TANK__SCREWING, oldScrewing, screwing));
			}
		}
		return screwing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Screwing basicGetScrewing() {
		return screwing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScrewing(Screwing newScrewing) {
		Screwing oldScrewing = screwing;
		screwing = newScrewing;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentRepositoryPackage.TANK__SCREWING, oldScrewing, screwing));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ComponentRepositoryPackage.TANK__WATERSUPPLY:
				if (resolve) return getWatersupply();
				return basicGetWatersupply();
			case ComponentRepositoryPackage.TANK__SCREWING:
				if (resolve) return getScrewing();
				return basicGetScrewing();
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
			case ComponentRepositoryPackage.TANK__WATERSUPPLY:
				setWatersupply((WaterSupply)newValue);
				return;
			case ComponentRepositoryPackage.TANK__SCREWING:
				setScrewing((Screwing)newValue);
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
			case ComponentRepositoryPackage.TANK__WATERSUPPLY:
				setWatersupply((WaterSupply)null);
				return;
			case ComponentRepositoryPackage.TANK__SCREWING:
				setScrewing((Screwing)null);
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
			case ComponentRepositoryPackage.TANK__WATERSUPPLY:
				return watersupply != null;
			case ComponentRepositoryPackage.TANK__SCREWING:
				return screwing != null;
		}
		return super.eIsSet(featureID);
	}

} //TankImpl
