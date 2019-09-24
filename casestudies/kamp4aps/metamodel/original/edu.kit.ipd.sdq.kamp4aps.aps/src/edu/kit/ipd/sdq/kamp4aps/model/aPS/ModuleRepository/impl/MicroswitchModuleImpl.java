/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.impl;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.BusSlave;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.ElectronicComponents.ElectronicComponentsPackage;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.ElectronicComponents.MicroSwitch;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.MicroswitchModule;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.ModuleRepositoryPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Microswitch Module</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.impl.MicroswitchModuleImpl#getBusSlave <em>Bus Slave</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.impl.MicroswitchModuleImpl#getSwitch <em>Switch</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MicroswitchModuleImpl extends ModuleImpl implements MicroswitchModule {
	/**
	 * The cached value of the '{@link #getBusSlave() <em>Bus Slave</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusSlave()
	 * @generated
	 * @ordered
	 */
	protected EList<BusSlave> busSlave;

	/**
	 * The cached value of the '{@link #getSwitch() <em>Switch</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwitch()
	 * @generated
	 * @ordered
	 */
	protected MicroSwitch switch_;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MicroswitchModuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModuleRepositoryPackage.Literals.MICROSWITCH_MODULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BusSlave> getBusSlave() {
		if (busSlave == null) {
			busSlave = new EObjectContainmentEList<BusSlave>(BusSlave.class, this, ModuleRepositoryPackage.MICROSWITCH_MODULE__BUS_SLAVE);
		}
		return busSlave;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MicroSwitch getSwitch() {
		return switch_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSwitch(MicroSwitch newSwitch, NotificationChain msgs) {
		MicroSwitch oldSwitch = switch_;
		switch_ = newSwitch;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModuleRepositoryPackage.MICROSWITCH_MODULE__SWITCH, oldSwitch, newSwitch);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSwitch(MicroSwitch newSwitch) {
		if (newSwitch != switch_) {
			NotificationChain msgs = null;
			if (switch_ != null)
				msgs = ((InternalEObject)switch_).eInverseRemove(this, ElectronicComponentsPackage.MICRO_SWITCH__MS_MODULE, MicroSwitch.class, msgs);
			if (newSwitch != null)
				msgs = ((InternalEObject)newSwitch).eInverseAdd(this, ElectronicComponentsPackage.MICRO_SWITCH__MS_MODULE, MicroSwitch.class, msgs);
			msgs = basicSetSwitch(newSwitch, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModuleRepositoryPackage.MICROSWITCH_MODULE__SWITCH, newSwitch, newSwitch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModuleRepositoryPackage.MICROSWITCH_MODULE__SWITCH:
				if (switch_ != null)
					msgs = ((InternalEObject)switch_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModuleRepositoryPackage.MICROSWITCH_MODULE__SWITCH, null, msgs);
				return basicSetSwitch((MicroSwitch)otherEnd, msgs);
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
			case ModuleRepositoryPackage.MICROSWITCH_MODULE__BUS_SLAVE:
				return ((InternalEList<?>)getBusSlave()).basicRemove(otherEnd, msgs);
			case ModuleRepositoryPackage.MICROSWITCH_MODULE__SWITCH:
				return basicSetSwitch(null, msgs);
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
			case ModuleRepositoryPackage.MICROSWITCH_MODULE__BUS_SLAVE:
				return getBusSlave();
			case ModuleRepositoryPackage.MICROSWITCH_MODULE__SWITCH:
				return getSwitch();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ModuleRepositoryPackage.MICROSWITCH_MODULE__BUS_SLAVE:
				getBusSlave().clear();
				getBusSlave().addAll((Collection<? extends BusSlave>)newValue);
				return;
			case ModuleRepositoryPackage.MICROSWITCH_MODULE__SWITCH:
				setSwitch((MicroSwitch)newValue);
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
			case ModuleRepositoryPackage.MICROSWITCH_MODULE__BUS_SLAVE:
				getBusSlave().clear();
				return;
			case ModuleRepositoryPackage.MICROSWITCH_MODULE__SWITCH:
				setSwitch((MicroSwitch)null);
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
			case ModuleRepositoryPackage.MICROSWITCH_MODULE__BUS_SLAVE:
				return busSlave != null && !busSlave.isEmpty();
			case ModuleRepositoryPackage.MICROSWITCH_MODULE__SWITCH:
				return switch_ != null;
		}
		return super.eIsSet(featureID);
	}

} //MicroswitchModuleImpl
