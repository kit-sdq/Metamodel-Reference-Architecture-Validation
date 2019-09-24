/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.ComponentRepositoryPackage;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.WaterSplitter;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.WaterSupply;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Water Splitter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.WaterSplitterImpl#getWatersupply <em>Watersupply</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WaterSplitterImpl extends SplitterImpl implements WaterSplitter {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WaterSplitterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentRepositoryPackage.Literals.WATER_SPLITTER;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComponentRepositoryPackage.WATER_SPLITTER__WATERSUPPLY, oldWatersupply, watersupply));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentRepositoryPackage.WATER_SPLITTER__WATERSUPPLY, oldWatersupply, watersupply));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ComponentRepositoryPackage.WATER_SPLITTER__WATERSUPPLY:
				if (resolve) return getWatersupply();
				return basicGetWatersupply();
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
			case ComponentRepositoryPackage.WATER_SPLITTER__WATERSUPPLY:
				setWatersupply((WaterSupply)newValue);
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
			case ComponentRepositoryPackage.WATER_SPLITTER__WATERSUPPLY:
				setWatersupply((WaterSupply)null);
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
			case ComponentRepositoryPackage.WATER_SPLITTER__WATERSUPPLY:
				return watersupply != null;
		}
		return super.eIsSet(featureID);
	}

} //WaterSplitterImpl
