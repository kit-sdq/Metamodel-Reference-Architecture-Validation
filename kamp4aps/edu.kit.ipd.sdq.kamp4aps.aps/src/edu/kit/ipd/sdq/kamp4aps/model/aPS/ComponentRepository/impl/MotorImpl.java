/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.ComponentRepositoryPackage;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Motor;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.PowerSupply;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.Gearing;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.Screwing;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Motor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.MotorImpl#getGearing <em>Gearing</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.MotorImpl#getScrewing <em>Screwing</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.MotorImpl#getPowersupply <em>Powersupply</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class MotorImpl extends ComponentImpl implements Motor {
	/**
	 * The cached value of the '{@link #getGearing() <em>Gearing</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGearing()
	 * @generated
	 * @ordered
	 */
	protected Gearing gearing;

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
	protected MotorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentRepositoryPackage.Literals.MOTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Gearing getGearing() {
		if (gearing != null && gearing.eIsProxy()) {
			InternalEObject oldGearing = (InternalEObject)gearing;
			gearing = (Gearing)eResolveProxy(oldGearing);
			if (gearing != oldGearing) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComponentRepositoryPackage.MOTOR__GEARING, oldGearing, gearing));
			}
		}
		return gearing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Gearing basicGetGearing() {
		return gearing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGearing(Gearing newGearing) {
		Gearing oldGearing = gearing;
		gearing = newGearing;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentRepositoryPackage.MOTOR__GEARING, oldGearing, gearing));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComponentRepositoryPackage.MOTOR__SCREWING, oldScrewing, screwing));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentRepositoryPackage.MOTOR__SCREWING, oldScrewing, screwing));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComponentRepositoryPackage.MOTOR__POWERSUPPLY, oldPowersupply, powersupply));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentRepositoryPackage.MOTOR__POWERSUPPLY, oldPowersupply, powersupply));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ComponentRepositoryPackage.MOTOR__GEARING:
				if (resolve) return getGearing();
				return basicGetGearing();
			case ComponentRepositoryPackage.MOTOR__SCREWING:
				if (resolve) return getScrewing();
				return basicGetScrewing();
			case ComponentRepositoryPackage.MOTOR__POWERSUPPLY:
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
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ComponentRepositoryPackage.MOTOR__GEARING:
				setGearing((Gearing)newValue);
				return;
			case ComponentRepositoryPackage.MOTOR__SCREWING:
				setScrewing((Screwing)newValue);
				return;
			case ComponentRepositoryPackage.MOTOR__POWERSUPPLY:
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
			case ComponentRepositoryPackage.MOTOR__GEARING:
				setGearing((Gearing)null);
				return;
			case ComponentRepositoryPackage.MOTOR__SCREWING:
				setScrewing((Screwing)null);
				return;
			case ComponentRepositoryPackage.MOTOR__POWERSUPPLY:
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
			case ComponentRepositoryPackage.MOTOR__GEARING:
				return gearing != null;
			case ComponentRepositoryPackage.MOTOR__SCREWING:
				return screwing != null;
			case ComponentRepositoryPackage.MOTOR__POWERSUPPLY:
				return powersupply != null;
		}
		return super.eIsSet(featureID);
	}

} //MotorImpl
