/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.ComponentRepositoryPackage;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Controller;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.PowerSupply;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.StructureRepository.ControlCabinet;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.StructureRepository.StructureRepositoryPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Controller</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.ControllerImpl#getPowersupply <em>Powersupply</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.ControllerImpl#getControllerOf <em>Controller Of</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ControllerImpl extends ComponentImpl implements Controller {
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
	 * The cached value of the '{@link #getControllerOf() <em>Controller Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControllerOf()
	 * @generated
	 * @ordered
	 */
	protected ControlCabinet controllerOf;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ControllerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentRepositoryPackage.Literals.CONTROLLER;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComponentRepositoryPackage.CONTROLLER__POWERSUPPLY, oldPowersupply, powersupply));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentRepositoryPackage.CONTROLLER__POWERSUPPLY, oldPowersupply, powersupply));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlCabinet getControllerOf() {
		if (controllerOf != null && controllerOf.eIsProxy()) {
			InternalEObject oldControllerOf = (InternalEObject)controllerOf;
			controllerOf = (ControlCabinet)eResolveProxy(oldControllerOf);
			if (controllerOf != oldControllerOf) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComponentRepositoryPackage.CONTROLLER__CONTROLLER_OF, oldControllerOf, controllerOf));
			}
		}
		return controllerOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlCabinet basicGetControllerOf() {
		return controllerOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetControllerOf(ControlCabinet newControllerOf, NotificationChain msgs) {
		ControlCabinet oldControllerOf = controllerOf;
		controllerOf = newControllerOf;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ComponentRepositoryPackage.CONTROLLER__CONTROLLER_OF, oldControllerOf, newControllerOf);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setControllerOf(ControlCabinet newControllerOf) {
		if (newControllerOf != controllerOf) {
			NotificationChain msgs = null;
			if (controllerOf != null)
				msgs = ((InternalEObject)controllerOf).eInverseRemove(this, StructureRepositoryPackage.CONTROL_CABINET__CONTROLLER, ControlCabinet.class, msgs);
			if (newControllerOf != null)
				msgs = ((InternalEObject)newControllerOf).eInverseAdd(this, StructureRepositoryPackage.CONTROL_CABINET__CONTROLLER, ControlCabinet.class, msgs);
			msgs = basicSetControllerOf(newControllerOf, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentRepositoryPackage.CONTROLLER__CONTROLLER_OF, newControllerOf, newControllerOf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ComponentRepositoryPackage.CONTROLLER__CONTROLLER_OF:
				if (controllerOf != null)
					msgs = ((InternalEObject)controllerOf).eInverseRemove(this, StructureRepositoryPackage.CONTROL_CABINET__CONTROLLER, ControlCabinet.class, msgs);
				return basicSetControllerOf((ControlCabinet)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ComponentRepositoryPackage.CONTROLLER__CONTROLLER_OF:
				return basicSetControllerOf(null, msgs);
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
			case ComponentRepositoryPackage.CONTROLLER__POWERSUPPLY:
				if (resolve) return getPowersupply();
				return basicGetPowersupply();
			case ComponentRepositoryPackage.CONTROLLER__CONTROLLER_OF:
				if (resolve) return getControllerOf();
				return basicGetControllerOf();
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
			case ComponentRepositoryPackage.CONTROLLER__POWERSUPPLY:
				setPowersupply((PowerSupply)newValue);
				return;
			case ComponentRepositoryPackage.CONTROLLER__CONTROLLER_OF:
				setControllerOf((ControlCabinet)newValue);
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
			case ComponentRepositoryPackage.CONTROLLER__POWERSUPPLY:
				setPowersupply((PowerSupply)null);
				return;
			case ComponentRepositoryPackage.CONTROLLER__CONTROLLER_OF:
				setControllerOf((ControlCabinet)null);
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
			case ComponentRepositoryPackage.CONTROLLER__POWERSUPPLY:
				return powersupply != null;
			case ComponentRepositoryPackage.CONTROLLER__CONTROLLER_OF:
				return controllerOf != null;
		}
		return super.eIsSet(featureID);
	}

} //ControllerImpl
