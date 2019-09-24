/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.ComponentRepositoryPackage;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Splitter;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.Screwing;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Splitter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.SplitterImpl#getScrewing <em>Screwing</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class SplitterImpl extends ComponentImpl implements Splitter {
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
	protected SplitterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentRepositoryPackage.Literals.SPLITTER;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComponentRepositoryPackage.SPLITTER__SCREWING, oldScrewing, screwing));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentRepositoryPackage.SPLITTER__SCREWING, oldScrewing, screwing));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ComponentRepositoryPackage.SPLITTER__SCREWING:
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
			case ComponentRepositoryPackage.SPLITTER__SCREWING:
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
			case ComponentRepositoryPackage.SPLITTER__SCREWING:
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
			case ComponentRepositoryPackage.SPLITTER__SCREWING:
				return screwing != null;
		}
		return super.eIsSet(featureID);
	}

} //SplitterImpl
