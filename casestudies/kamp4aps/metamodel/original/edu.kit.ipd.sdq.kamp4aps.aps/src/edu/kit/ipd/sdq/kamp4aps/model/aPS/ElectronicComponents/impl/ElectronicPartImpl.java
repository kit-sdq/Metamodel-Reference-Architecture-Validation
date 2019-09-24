/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.aPS.ElectronicComponents.impl;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.ComponentImpl;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.ElectronicComponents.ElectronicComponentsPackage;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.ElectronicComponents.ElectronicPart;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.PhysicalConnection;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.SignalInterface;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Electronic Part</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ElectronicComponents.impl.ElectronicPartImpl#getPin <em>Pin</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ElectronicComponents.impl.ElectronicPartImpl#getPhysicalconnection <em>Physicalconnection</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ElectronicPartImpl extends ComponentImpl implements ElectronicPart {
	/**
	 * The cached value of the '{@link #getPin() <em>Pin</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPin()
	 * @generated
	 * @ordered
	 */
	protected SignalInterface pin;

	/**
	 * The cached value of the '{@link #getPhysicalconnection() <em>Physicalconnection</em>}' containment reference.
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
	protected ElectronicPartImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ElectronicComponentsPackage.Literals.ELECTRONIC_PART;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignalInterface getPin() {
		return pin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPin(SignalInterface newPin, NotificationChain msgs) {
		SignalInterface oldPin = pin;
		pin = newPin;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ElectronicComponentsPackage.ELECTRONIC_PART__PIN, oldPin, newPin);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPin(SignalInterface newPin) {
		if (newPin != pin) {
			NotificationChain msgs = null;
			if (pin != null)
				msgs = ((InternalEObject)pin).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ElectronicComponentsPackage.ELECTRONIC_PART__PIN, null, msgs);
			if (newPin != null)
				msgs = ((InternalEObject)newPin).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ElectronicComponentsPackage.ELECTRONIC_PART__PIN, null, msgs);
			msgs = basicSetPin(newPin, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElectronicComponentsPackage.ELECTRONIC_PART__PIN, newPin, newPin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalConnection getPhysicalconnection() {
		return physicalconnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPhysicalconnection(PhysicalConnection newPhysicalconnection, NotificationChain msgs) {
		PhysicalConnection oldPhysicalconnection = physicalconnection;
		physicalconnection = newPhysicalconnection;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ElectronicComponentsPackage.ELECTRONIC_PART__PHYSICALCONNECTION, oldPhysicalconnection, newPhysicalconnection);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhysicalconnection(PhysicalConnection newPhysicalconnection) {
		if (newPhysicalconnection != physicalconnection) {
			NotificationChain msgs = null;
			if (physicalconnection != null)
				msgs = ((InternalEObject)physicalconnection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ElectronicComponentsPackage.ELECTRONIC_PART__PHYSICALCONNECTION, null, msgs);
			if (newPhysicalconnection != null)
				msgs = ((InternalEObject)newPhysicalconnection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ElectronicComponentsPackage.ELECTRONIC_PART__PHYSICALCONNECTION, null, msgs);
			msgs = basicSetPhysicalconnection(newPhysicalconnection, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElectronicComponentsPackage.ELECTRONIC_PART__PHYSICALCONNECTION, newPhysicalconnection, newPhysicalconnection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ElectronicComponentsPackage.ELECTRONIC_PART__PIN:
				return basicSetPin(null, msgs);
			case ElectronicComponentsPackage.ELECTRONIC_PART__PHYSICALCONNECTION:
				return basicSetPhysicalconnection(null, msgs);
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
			case ElectronicComponentsPackage.ELECTRONIC_PART__PIN:
				return getPin();
			case ElectronicComponentsPackage.ELECTRONIC_PART__PHYSICALCONNECTION:
				return getPhysicalconnection();
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
			case ElectronicComponentsPackage.ELECTRONIC_PART__PIN:
				setPin((SignalInterface)newValue);
				return;
			case ElectronicComponentsPackage.ELECTRONIC_PART__PHYSICALCONNECTION:
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
			case ElectronicComponentsPackage.ELECTRONIC_PART__PIN:
				setPin((SignalInterface)null);
				return;
			case ElectronicComponentsPackage.ELECTRONIC_PART__PHYSICALCONNECTION:
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
			case ElectronicComponentsPackage.ELECTRONIC_PART__PIN:
				return pin != null;
			case ElectronicComponentsPackage.ELECTRONIC_PART__PHYSICALCONNECTION:
				return physicalconnection != null;
		}
		return super.eIsSet(featureID);
	}

} //ElectronicPartImpl
