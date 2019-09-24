/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.ProfibusDPSlave;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.ComponentRepositoryPackage;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.CylinderPart;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.MonostableCylinder;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.ReedSwitch;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.RegularValve;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.MechanicalComponents.Housing;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.MechanicalComponents.ReturnSpring;

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
 * An implementation of the model object '<em><b>Monostable Cylinder</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.MonostableCylinderImpl#getHousing <em>Housing</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.MonostableCylinderImpl#getSpring <em>Spring</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.MonostableCylinderImpl#getReedSwitches <em>Reed Switches</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.MonostableCylinderImpl#getCylinderPart <em>Cylinder Part</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.MonostableCylinderImpl#getValve <em>Valve</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.MonostableCylinderImpl#getBusSlave <em>Bus Slave</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MonostableCylinderImpl extends CylinderImpl implements MonostableCylinder {
	/**
	 * The cached value of the '{@link #getHousing() <em>Housing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHousing()
	 * @generated
	 * @ordered
	 */
	protected Housing housing;

	/**
	 * The cached value of the '{@link #getSpring() <em>Spring</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpring()
	 * @generated
	 * @ordered
	 */
	protected ReturnSpring spring;

	/**
	 * The cached value of the '{@link #getReedSwitches() <em>Reed Switches</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReedSwitches()
	 * @generated
	 * @ordered
	 */
	protected EList<ReedSwitch> reedSwitches;

	/**
	 * The cached value of the '{@link #getCylinderPart() <em>Cylinder Part</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCylinderPart()
	 * @generated
	 * @ordered
	 */
	protected EList<CylinderPart> cylinderPart;

	/**
	 * The cached value of the '{@link #getValve() <em>Valve</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValve()
	 * @generated
	 * @ordered
	 */
	protected EList<RegularValve> valve;

	/**
	 * The cached value of the '{@link #getBusSlave() <em>Bus Slave</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusSlave()
	 * @generated
	 * @ordered
	 */
	protected EList<ProfibusDPSlave> busSlave;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MonostableCylinderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentRepositoryPackage.Literals.MONOSTABLE_CYLINDER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Housing getHousing() {
		return housing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHousing(Housing newHousing, NotificationChain msgs) {
		Housing oldHousing = housing;
		housing = newHousing;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ComponentRepositoryPackage.MONOSTABLE_CYLINDER__HOUSING, oldHousing, newHousing);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHousing(Housing newHousing) {
		if (newHousing != housing) {
			NotificationChain msgs = null;
			if (housing != null)
				msgs = ((InternalEObject)housing).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ComponentRepositoryPackage.MONOSTABLE_CYLINDER__HOUSING, null, msgs);
			if (newHousing != null)
				msgs = ((InternalEObject)newHousing).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ComponentRepositoryPackage.MONOSTABLE_CYLINDER__HOUSING, null, msgs);
			msgs = basicSetHousing(newHousing, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentRepositoryPackage.MONOSTABLE_CYLINDER__HOUSING, newHousing, newHousing));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReturnSpring getSpring() {
		return spring;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpring(ReturnSpring newSpring, NotificationChain msgs) {
		ReturnSpring oldSpring = spring;
		spring = newSpring;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ComponentRepositoryPackage.MONOSTABLE_CYLINDER__SPRING, oldSpring, newSpring);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpring(ReturnSpring newSpring) {
		if (newSpring != spring) {
			NotificationChain msgs = null;
			if (spring != null)
				msgs = ((InternalEObject)spring).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ComponentRepositoryPackage.MONOSTABLE_CYLINDER__SPRING, null, msgs);
			if (newSpring != null)
				msgs = ((InternalEObject)newSpring).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ComponentRepositoryPackage.MONOSTABLE_CYLINDER__SPRING, null, msgs);
			msgs = basicSetSpring(newSpring, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentRepositoryPackage.MONOSTABLE_CYLINDER__SPRING, newSpring, newSpring));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ReedSwitch> getReedSwitches() {
		if (reedSwitches == null) {
			reedSwitches = new EObjectContainmentEList<ReedSwitch>(ReedSwitch.class, this, ComponentRepositoryPackage.MONOSTABLE_CYLINDER__REED_SWITCHES);
		}
		return reedSwitches;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CylinderPart> getCylinderPart() {
		if (cylinderPart == null) {
			cylinderPart = new EObjectContainmentEList<CylinderPart>(CylinderPart.class, this, ComponentRepositoryPackage.MONOSTABLE_CYLINDER__CYLINDER_PART);
		}
		return cylinderPart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RegularValve> getValve() {
		if (valve == null) {
			valve = new EObjectContainmentEList<RegularValve>(RegularValve.class, this, ComponentRepositoryPackage.MONOSTABLE_CYLINDER__VALVE);
		}
		return valve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProfibusDPSlave> getBusSlave() {
		if (busSlave == null) {
			busSlave = new EObjectContainmentEList<ProfibusDPSlave>(ProfibusDPSlave.class, this, ComponentRepositoryPackage.MONOSTABLE_CYLINDER__BUS_SLAVE);
		}
		return busSlave;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ComponentRepositoryPackage.MONOSTABLE_CYLINDER__HOUSING:
				return basicSetHousing(null, msgs);
			case ComponentRepositoryPackage.MONOSTABLE_CYLINDER__SPRING:
				return basicSetSpring(null, msgs);
			case ComponentRepositoryPackage.MONOSTABLE_CYLINDER__REED_SWITCHES:
				return ((InternalEList<?>)getReedSwitches()).basicRemove(otherEnd, msgs);
			case ComponentRepositoryPackage.MONOSTABLE_CYLINDER__CYLINDER_PART:
				return ((InternalEList<?>)getCylinderPart()).basicRemove(otherEnd, msgs);
			case ComponentRepositoryPackage.MONOSTABLE_CYLINDER__VALVE:
				return ((InternalEList<?>)getValve()).basicRemove(otherEnd, msgs);
			case ComponentRepositoryPackage.MONOSTABLE_CYLINDER__BUS_SLAVE:
				return ((InternalEList<?>)getBusSlave()).basicRemove(otherEnd, msgs);
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
			case ComponentRepositoryPackage.MONOSTABLE_CYLINDER__HOUSING:
				return getHousing();
			case ComponentRepositoryPackage.MONOSTABLE_CYLINDER__SPRING:
				return getSpring();
			case ComponentRepositoryPackage.MONOSTABLE_CYLINDER__REED_SWITCHES:
				return getReedSwitches();
			case ComponentRepositoryPackage.MONOSTABLE_CYLINDER__CYLINDER_PART:
				return getCylinderPart();
			case ComponentRepositoryPackage.MONOSTABLE_CYLINDER__VALVE:
				return getValve();
			case ComponentRepositoryPackage.MONOSTABLE_CYLINDER__BUS_SLAVE:
				return getBusSlave();
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
			case ComponentRepositoryPackage.MONOSTABLE_CYLINDER__HOUSING:
				setHousing((Housing)newValue);
				return;
			case ComponentRepositoryPackage.MONOSTABLE_CYLINDER__SPRING:
				setSpring((ReturnSpring)newValue);
				return;
			case ComponentRepositoryPackage.MONOSTABLE_CYLINDER__REED_SWITCHES:
				getReedSwitches().clear();
				getReedSwitches().addAll((Collection<? extends ReedSwitch>)newValue);
				return;
			case ComponentRepositoryPackage.MONOSTABLE_CYLINDER__CYLINDER_PART:
				getCylinderPart().clear();
				getCylinderPart().addAll((Collection<? extends CylinderPart>)newValue);
				return;
			case ComponentRepositoryPackage.MONOSTABLE_CYLINDER__VALVE:
				getValve().clear();
				getValve().addAll((Collection<? extends RegularValve>)newValue);
				return;
			case ComponentRepositoryPackage.MONOSTABLE_CYLINDER__BUS_SLAVE:
				getBusSlave().clear();
				getBusSlave().addAll((Collection<? extends ProfibusDPSlave>)newValue);
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
			case ComponentRepositoryPackage.MONOSTABLE_CYLINDER__HOUSING:
				setHousing((Housing)null);
				return;
			case ComponentRepositoryPackage.MONOSTABLE_CYLINDER__SPRING:
				setSpring((ReturnSpring)null);
				return;
			case ComponentRepositoryPackage.MONOSTABLE_CYLINDER__REED_SWITCHES:
				getReedSwitches().clear();
				return;
			case ComponentRepositoryPackage.MONOSTABLE_CYLINDER__CYLINDER_PART:
				getCylinderPart().clear();
				return;
			case ComponentRepositoryPackage.MONOSTABLE_CYLINDER__VALVE:
				getValve().clear();
				return;
			case ComponentRepositoryPackage.MONOSTABLE_CYLINDER__BUS_SLAVE:
				getBusSlave().clear();
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
			case ComponentRepositoryPackage.MONOSTABLE_CYLINDER__HOUSING:
				return housing != null;
			case ComponentRepositoryPackage.MONOSTABLE_CYLINDER__SPRING:
				return spring != null;
			case ComponentRepositoryPackage.MONOSTABLE_CYLINDER__REED_SWITCHES:
				return reedSwitches != null && !reedSwitches.isEmpty();
			case ComponentRepositoryPackage.MONOSTABLE_CYLINDER__CYLINDER_PART:
				return cylinderPart != null && !cylinderPart.isEmpty();
			case ComponentRepositoryPackage.MONOSTABLE_CYLINDER__VALVE:
				return valve != null && !valve.isEmpty();
			case ComponentRepositoryPackage.MONOSTABLE_CYLINDER__BUS_SLAVE:
				return busSlave != null && !busSlave.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MonostableCylinderImpl
