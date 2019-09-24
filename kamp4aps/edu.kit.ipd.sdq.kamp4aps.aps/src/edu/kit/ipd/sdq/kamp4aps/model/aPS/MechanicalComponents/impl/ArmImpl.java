/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.aPS.MechanicalComponents.impl;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.MechanicalAssemblyImpl;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.MechanicalComponents.Arm;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.MechanicalComponents.MechanicalComponentsPackage;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.StructureRepository.Crane;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.StructureRepository.StructureRepositoryPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Arm</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.MechanicalComponents.impl.ArmImpl#getMountedTo <em>Mounted To</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArmImpl extends MechanicalAssemblyImpl implements Arm {
	/**
	 * The cached value of the '{@link #getMountedTo() <em>Mounted To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMountedTo()
	 * @generated
	 * @ordered
	 */
	protected Crane mountedTo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArmImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MechanicalComponentsPackage.Literals.ARM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Crane getMountedTo() {
		if (mountedTo != null && mountedTo.eIsProxy()) {
			InternalEObject oldMountedTo = (InternalEObject)mountedTo;
			mountedTo = (Crane)eResolveProxy(oldMountedTo);
			if (mountedTo != oldMountedTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MechanicalComponentsPackage.ARM__MOUNTED_TO, oldMountedTo, mountedTo));
			}
		}
		return mountedTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Crane basicGetMountedTo() {
		return mountedTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMountedTo(Crane newMountedTo, NotificationChain msgs) {
		Crane oldMountedTo = mountedTo;
		mountedTo = newMountedTo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MechanicalComponentsPackage.ARM__MOUNTED_TO, oldMountedTo, newMountedTo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMountedTo(Crane newMountedTo) {
		if (newMountedTo != mountedTo) {
			NotificationChain msgs = null;
			if (mountedTo != null)
				msgs = ((InternalEObject)mountedTo).eInverseRemove(this, StructureRepositoryPackage.CRANE__ARM, Crane.class, msgs);
			if (newMountedTo != null)
				msgs = ((InternalEObject)newMountedTo).eInverseAdd(this, StructureRepositoryPackage.CRANE__ARM, Crane.class, msgs);
			msgs = basicSetMountedTo(newMountedTo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MechanicalComponentsPackage.ARM__MOUNTED_TO, newMountedTo, newMountedTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MechanicalComponentsPackage.ARM__MOUNTED_TO:
				if (mountedTo != null)
					msgs = ((InternalEObject)mountedTo).eInverseRemove(this, StructureRepositoryPackage.CRANE__ARM, Crane.class, msgs);
				return basicSetMountedTo((Crane)otherEnd, msgs);
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
			case MechanicalComponentsPackage.ARM__MOUNTED_TO:
				return basicSetMountedTo(null, msgs);
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
			case MechanicalComponentsPackage.ARM__MOUNTED_TO:
				if (resolve) return getMountedTo();
				return basicGetMountedTo();
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
			case MechanicalComponentsPackage.ARM__MOUNTED_TO:
				setMountedTo((Crane)newValue);
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
			case MechanicalComponentsPackage.ARM__MOUNTED_TO:
				setMountedTo((Crane)null);
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
			case MechanicalComponentsPackage.ARM__MOUNTED_TO:
				return mountedTo != null;
		}
		return super.eIsSet(featureID);
	}

} //ArmImpl
