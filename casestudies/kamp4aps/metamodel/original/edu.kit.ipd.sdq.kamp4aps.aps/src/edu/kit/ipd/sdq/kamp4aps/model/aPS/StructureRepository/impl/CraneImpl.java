/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.aPS.StructureRepository.impl;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.TurningTable;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.MechanicalComponents.Arm;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.MechanicalComponents.MechanicalComponentsPackage;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.VacuumGripperModule;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.StructureRepository.Crane;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.StructureRepository.StructureRepositoryPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Crane</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.StructureRepository.impl.CraneImpl#getArm <em>Arm</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.StructureRepository.impl.CraneImpl#getMountedOn <em>Mounted On</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.StructureRepository.impl.CraneImpl#getVacuumgripper <em>Vacuumgripper</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CraneImpl extends StructureImpl implements Crane {
	/**
	 * The cached value of the '{@link #getArm() <em>Arm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArm()
	 * @generated
	 * @ordered
	 */
	protected Arm arm;

	/**
	 * The cached value of the '{@link #getMountedOn() <em>Mounted On</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMountedOn()
	 * @generated
	 * @ordered
	 */
	protected TurningTable mountedOn;

	/**
	 * The cached value of the '{@link #getVacuumgripper() <em>Vacuumgripper</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVacuumgripper()
	 * @generated
	 * @ordered
	 */
	protected VacuumGripperModule vacuumgripper;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CraneImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StructureRepositoryPackage.Literals.CRANE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Arm getArm() {
		if (arm != null && arm.eIsProxy()) {
			InternalEObject oldArm = (InternalEObject)arm;
			arm = (Arm)eResolveProxy(oldArm);
			if (arm != oldArm) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StructureRepositoryPackage.CRANE__ARM, oldArm, arm));
			}
		}
		return arm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Arm basicGetArm() {
		return arm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArm(Arm newArm, NotificationChain msgs) {
		Arm oldArm = arm;
		arm = newArm;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StructureRepositoryPackage.CRANE__ARM, oldArm, newArm);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArm(Arm newArm) {
		if (newArm != arm) {
			NotificationChain msgs = null;
			if (arm != null)
				msgs = ((InternalEObject)arm).eInverseRemove(this, MechanicalComponentsPackage.ARM__MOUNTED_TO, Arm.class, msgs);
			if (newArm != null)
				msgs = ((InternalEObject)newArm).eInverseAdd(this, MechanicalComponentsPackage.ARM__MOUNTED_TO, Arm.class, msgs);
			msgs = basicSetArm(newArm, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructureRepositoryPackage.CRANE__ARM, newArm, newArm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TurningTable getMountedOn() {
		if (mountedOn != null && mountedOn.eIsProxy()) {
			InternalEObject oldMountedOn = (InternalEObject)mountedOn;
			mountedOn = (TurningTable)eResolveProxy(oldMountedOn);
			if (mountedOn != oldMountedOn) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StructureRepositoryPackage.CRANE__MOUNTED_ON, oldMountedOn, mountedOn));
			}
		}
		return mountedOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TurningTable basicGetMountedOn() {
		return mountedOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMountedOn(TurningTable newMountedOn) {
		TurningTable oldMountedOn = mountedOn;
		mountedOn = newMountedOn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructureRepositoryPackage.CRANE__MOUNTED_ON, oldMountedOn, mountedOn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VacuumGripperModule getVacuumgripper() {
		if (vacuumgripper != null && vacuumgripper.eIsProxy()) {
			InternalEObject oldVacuumgripper = (InternalEObject)vacuumgripper;
			vacuumgripper = (VacuumGripperModule)eResolveProxy(oldVacuumgripper);
			if (vacuumgripper != oldVacuumgripper) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StructureRepositoryPackage.CRANE__VACUUMGRIPPER, oldVacuumgripper, vacuumgripper));
			}
		}
		return vacuumgripper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VacuumGripperModule basicGetVacuumgripper() {
		return vacuumgripper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVacuumgripper(VacuumGripperModule newVacuumgripper) {
		VacuumGripperModule oldVacuumgripper = vacuumgripper;
		vacuumgripper = newVacuumgripper;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructureRepositoryPackage.CRANE__VACUUMGRIPPER, oldVacuumgripper, vacuumgripper));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StructureRepositoryPackage.CRANE__ARM:
				if (arm != null)
					msgs = ((InternalEObject)arm).eInverseRemove(this, MechanicalComponentsPackage.ARM__MOUNTED_TO, Arm.class, msgs);
				return basicSetArm((Arm)otherEnd, msgs);
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
			case StructureRepositoryPackage.CRANE__ARM:
				return basicSetArm(null, msgs);
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
			case StructureRepositoryPackage.CRANE__ARM:
				if (resolve) return getArm();
				return basicGetArm();
			case StructureRepositoryPackage.CRANE__MOUNTED_ON:
				if (resolve) return getMountedOn();
				return basicGetMountedOn();
			case StructureRepositoryPackage.CRANE__VACUUMGRIPPER:
				if (resolve) return getVacuumgripper();
				return basicGetVacuumgripper();
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
			case StructureRepositoryPackage.CRANE__ARM:
				setArm((Arm)newValue);
				return;
			case StructureRepositoryPackage.CRANE__MOUNTED_ON:
				setMountedOn((TurningTable)newValue);
				return;
			case StructureRepositoryPackage.CRANE__VACUUMGRIPPER:
				setVacuumgripper((VacuumGripperModule)newValue);
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
			case StructureRepositoryPackage.CRANE__ARM:
				setArm((Arm)null);
				return;
			case StructureRepositoryPackage.CRANE__MOUNTED_ON:
				setMountedOn((TurningTable)null);
				return;
			case StructureRepositoryPackage.CRANE__VACUUMGRIPPER:
				setVacuumgripper((VacuumGripperModule)null);
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
			case StructureRepositoryPackage.CRANE__ARM:
				return arm != null;
			case StructureRepositoryPackage.CRANE__MOUNTED_ON:
				return mountedOn != null;
			case StructureRepositoryPackage.CRANE__VACUUMGRIPPER:
				return vacuumgripper != null;
		}
		return super.eIsSet(featureID);
	}

} //CraneImpl
