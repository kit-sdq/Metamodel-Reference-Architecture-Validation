/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.impl;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.BusSlave;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.PresenceSensor;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.ModuleRepositoryPackage;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.PresenceSensorModule;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Presence Sensor Module</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.impl.PresenceSensorModuleImpl#getPresenceSensor <em>Presence Sensor</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.impl.PresenceSensorModuleImpl#getBusSlave <em>Bus Slave</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PresenceSensorModuleImpl extends ModuleImpl implements PresenceSensorModule {
	/**
	 * The cached value of the '{@link #getPresenceSensor() <em>Presence Sensor</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPresenceSensor()
	 * @generated
	 * @ordered
	 */
	protected EList<PresenceSensor> presenceSensor;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PresenceSensorModuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModuleRepositoryPackage.Literals.PRESENCE_SENSOR_MODULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PresenceSensor> getPresenceSensor() {
		if (presenceSensor == null) {
			presenceSensor = new EObjectContainmentEList<PresenceSensor>(PresenceSensor.class, this, ModuleRepositoryPackage.PRESENCE_SENSOR_MODULE__PRESENCE_SENSOR);
		}
		return presenceSensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BusSlave> getBusSlave() {
		if (busSlave == null) {
			busSlave = new EObjectContainmentEList<BusSlave>(BusSlave.class, this, ModuleRepositoryPackage.PRESENCE_SENSOR_MODULE__BUS_SLAVE);
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
			case ModuleRepositoryPackage.PRESENCE_SENSOR_MODULE__PRESENCE_SENSOR:
				return ((InternalEList<?>)getPresenceSensor()).basicRemove(otherEnd, msgs);
			case ModuleRepositoryPackage.PRESENCE_SENSOR_MODULE__BUS_SLAVE:
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
			case ModuleRepositoryPackage.PRESENCE_SENSOR_MODULE__PRESENCE_SENSOR:
				return getPresenceSensor();
			case ModuleRepositoryPackage.PRESENCE_SENSOR_MODULE__BUS_SLAVE:
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
			case ModuleRepositoryPackage.PRESENCE_SENSOR_MODULE__PRESENCE_SENSOR:
				getPresenceSensor().clear();
				getPresenceSensor().addAll((Collection<? extends PresenceSensor>)newValue);
				return;
			case ModuleRepositoryPackage.PRESENCE_SENSOR_MODULE__BUS_SLAVE:
				getBusSlave().clear();
				getBusSlave().addAll((Collection<? extends BusSlave>)newValue);
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
			case ModuleRepositoryPackage.PRESENCE_SENSOR_MODULE__PRESENCE_SENSOR:
				getPresenceSensor().clear();
				return;
			case ModuleRepositoryPackage.PRESENCE_SENSOR_MODULE__BUS_SLAVE:
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
			case ModuleRepositoryPackage.PRESENCE_SENSOR_MODULE__PRESENCE_SENSOR:
				return presenceSensor != null && !presenceSensor.isEmpty();
			case ModuleRepositoryPackage.PRESENCE_SENSOR_MODULE__BUS_SLAVE:
				return busSlave != null && !busSlave.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PresenceSensorModuleImpl
