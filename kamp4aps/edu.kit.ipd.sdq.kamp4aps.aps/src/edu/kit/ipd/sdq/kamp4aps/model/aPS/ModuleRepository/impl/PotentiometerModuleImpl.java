/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.impl;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.ElectronicComponents.Potentiometer;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.ModuleRepositoryPackage;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.PotentiometerModule;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Potentiometer Module</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.impl.PotentiometerModuleImpl#getPoti <em>Poti</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PotentiometerModuleImpl extends ModuleImpl implements PotentiometerModule {
	/**
	 * The cached value of the '{@link #getPoti() <em>Poti</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPoti()
	 * @generated
	 * @ordered
	 */
	protected Potentiometer poti;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PotentiometerModuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModuleRepositoryPackage.Literals.POTENTIOMETER_MODULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Potentiometer getPoti() {
		return poti;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPoti(Potentiometer newPoti, NotificationChain msgs) {
		Potentiometer oldPoti = poti;
		poti = newPoti;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModuleRepositoryPackage.POTENTIOMETER_MODULE__POTI, oldPoti, newPoti);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPoti(Potentiometer newPoti) {
		if (newPoti != poti) {
			NotificationChain msgs = null;
			if (poti != null)
				msgs = ((InternalEObject)poti).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModuleRepositoryPackage.POTENTIOMETER_MODULE__POTI, null, msgs);
			if (newPoti != null)
				msgs = ((InternalEObject)newPoti).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModuleRepositoryPackage.POTENTIOMETER_MODULE__POTI, null, msgs);
			msgs = basicSetPoti(newPoti, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModuleRepositoryPackage.POTENTIOMETER_MODULE__POTI, newPoti, newPoti));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModuleRepositoryPackage.POTENTIOMETER_MODULE__POTI:
				return basicSetPoti(null, msgs);
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
			case ModuleRepositoryPackage.POTENTIOMETER_MODULE__POTI:
				return getPoti();
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
			case ModuleRepositoryPackage.POTENTIOMETER_MODULE__POTI:
				setPoti((Potentiometer)newValue);
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
			case ModuleRepositoryPackage.POTENTIOMETER_MODULE__POTI:
				setPoti((Potentiometer)null);
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
			case ModuleRepositoryPackage.POTENTIOMETER_MODULE__POTI:
				return poti != null;
		}
		return super.eIsSet(featureID);
	}

} //PotentiometerModuleImpl
