/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.aPS.MechanicalComponents.impl;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.MechanicalAssemblyImpl;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.PhysicalConnection;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.Screwing;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.MechanicalComponents.MechanicalComponentsPackage;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.MechanicalComponents.Ramp;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ramp</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.MechanicalComponents.impl.RampImpl#getScrewing_base <em>Screwing base</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.MechanicalComponents.impl.RampImpl#getScrewing_component <em>Screwing component</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.MechanicalComponents.impl.RampImpl#getPhysicalconnection <em>Physicalconnection</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class RampImpl extends MechanicalAssemblyImpl implements Ramp {
	/**
	 * The cached value of the '{@link #getScrewing_base() <em>Screwing base</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScrewing_base()
	 * @generated
	 * @ordered
	 */
	protected Screwing screwing_base;

	/**
	 * The cached value of the '{@link #getScrewing_component() <em>Screwing component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScrewing_component()
	 * @generated
	 * @ordered
	 */
	protected Screwing screwing_component;

	/**
	 * The cached value of the '{@link #getPhysicalconnection() <em>Physicalconnection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysicalconnection()
	 * @generated
	 * @ordered
	 */
	protected PhysicalConnection physicalconnection;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RampImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MechanicalComponentsPackage.Literals.RAMP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Screwing getScrewing_base() {
		if (screwing_base != null && screwing_base.eIsProxy()) {
			InternalEObject oldScrewing_base = (InternalEObject)screwing_base;
			screwing_base = (Screwing)eResolveProxy(oldScrewing_base);
			if (screwing_base != oldScrewing_base) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MechanicalComponentsPackage.RAMP__SCREWING_BASE, oldScrewing_base, screwing_base));
			}
		}
		return screwing_base;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Screwing basicGetScrewing_base() {
		return screwing_base;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScrewing_base(Screwing newScrewing_base) {
		Screwing oldScrewing_base = screwing_base;
		screwing_base = newScrewing_base;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MechanicalComponentsPackage.RAMP__SCREWING_BASE, oldScrewing_base, screwing_base));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Screwing getScrewing_component() {
		if (screwing_component != null && screwing_component.eIsProxy()) {
			InternalEObject oldScrewing_component = (InternalEObject)screwing_component;
			screwing_component = (Screwing)eResolveProxy(oldScrewing_component);
			if (screwing_component != oldScrewing_component) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MechanicalComponentsPackage.RAMP__SCREWING_COMPONENT, oldScrewing_component, screwing_component));
			}
		}
		return screwing_component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Screwing basicGetScrewing_component() {
		return screwing_component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScrewing_component(Screwing newScrewing_component) {
		Screwing oldScrewing_component = screwing_component;
		screwing_component = newScrewing_component;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MechanicalComponentsPackage.RAMP__SCREWING_COMPONENT, oldScrewing_component, screwing_component));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalConnection getPhysicalconnection() {
		if (physicalconnection != null && physicalconnection.eIsProxy()) {
			InternalEObject oldPhysicalconnection = (InternalEObject)physicalconnection;
			physicalconnection = (PhysicalConnection)eResolveProxy(oldPhysicalconnection);
			if (physicalconnection != oldPhysicalconnection) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MechanicalComponentsPackage.RAMP__PHYSICALCONNECTION, oldPhysicalconnection, physicalconnection));
			}
		}
		return physicalconnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalConnection basicGetPhysicalconnection() {
		return physicalconnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhysicalconnection(PhysicalConnection newPhysicalconnection) {
		PhysicalConnection oldPhysicalconnection = physicalconnection;
		physicalconnection = newPhysicalconnection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MechanicalComponentsPackage.RAMP__PHYSICALCONNECTION, oldPhysicalconnection, physicalconnection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MechanicalComponentsPackage.RAMP__SCREWING_BASE:
				if (resolve) return getScrewing_base();
				return basicGetScrewing_base();
			case MechanicalComponentsPackage.RAMP__SCREWING_COMPONENT:
				if (resolve) return getScrewing_component();
				return basicGetScrewing_component();
			case MechanicalComponentsPackage.RAMP__PHYSICALCONNECTION:
				if (resolve) return getPhysicalconnection();
				return basicGetPhysicalconnection();
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
			case MechanicalComponentsPackage.RAMP__SCREWING_BASE:
				setScrewing_base((Screwing)newValue);
				return;
			case MechanicalComponentsPackage.RAMP__SCREWING_COMPONENT:
				setScrewing_component((Screwing)newValue);
				return;
			case MechanicalComponentsPackage.RAMP__PHYSICALCONNECTION:
				setPhysicalconnection((PhysicalConnection)newValue);
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
			case MechanicalComponentsPackage.RAMP__SCREWING_BASE:
				setScrewing_base((Screwing)null);
				return;
			case MechanicalComponentsPackage.RAMP__SCREWING_COMPONENT:
				setScrewing_component((Screwing)null);
				return;
			case MechanicalComponentsPackage.RAMP__PHYSICALCONNECTION:
				setPhysicalconnection((PhysicalConnection)null);
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
			case MechanicalComponentsPackage.RAMP__SCREWING_BASE:
				return screwing_base != null;
			case MechanicalComponentsPackage.RAMP__SCREWING_COMPONENT:
				return screwing_component != null;
			case MechanicalComponentsPackage.RAMP__PHYSICALCONNECTION:
				return physicalconnection != null;
		}
		return super.eIsSet(featureID);
	}

} //RampImpl
