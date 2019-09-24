/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.ComponentRepositoryPackage;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Rack;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.Screwing;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rack</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.RackImpl#getScrewing_to_base <em>Screwing to base</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RackImpl extends ComponentImpl implements Rack {
	/**
	 * The cached value of the '{@link #getScrewing_to_base() <em>Screwing to base</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScrewing_to_base()
	 * @generated
	 * @ordered
	 */
	protected Screwing screwing_to_base;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RackImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentRepositoryPackage.Literals.RACK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Screwing getScrewing_to_base() {
		if (screwing_to_base != null && screwing_to_base.eIsProxy()) {
			InternalEObject oldScrewing_to_base = (InternalEObject)screwing_to_base;
			screwing_to_base = (Screwing)eResolveProxy(oldScrewing_to_base);
			if (screwing_to_base != oldScrewing_to_base) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComponentRepositoryPackage.RACK__SCREWING_TO_BASE, oldScrewing_to_base, screwing_to_base));
			}
		}
		return screwing_to_base;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Screwing basicGetScrewing_to_base() {
		return screwing_to_base;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScrewing_to_base(Screwing newScrewing_to_base) {
		Screwing oldScrewing_to_base = screwing_to_base;
		screwing_to_base = newScrewing_to_base;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentRepositoryPackage.RACK__SCREWING_TO_BASE, oldScrewing_to_base, screwing_to_base));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ComponentRepositoryPackage.RACK__SCREWING_TO_BASE:
				if (resolve) return getScrewing_to_base();
				return basicGetScrewing_to_base();
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
			case ComponentRepositoryPackage.RACK__SCREWING_TO_BASE:
				setScrewing_to_base((Screwing)newValue);
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
			case ComponentRepositoryPackage.RACK__SCREWING_TO_BASE:
				setScrewing_to_base((Screwing)null);
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
			case ComponentRepositoryPackage.RACK__SCREWING_TO_BASE:
				return screwing_to_base != null;
		}
		return super.eIsSet(featureID);
	}

} //RackImpl
