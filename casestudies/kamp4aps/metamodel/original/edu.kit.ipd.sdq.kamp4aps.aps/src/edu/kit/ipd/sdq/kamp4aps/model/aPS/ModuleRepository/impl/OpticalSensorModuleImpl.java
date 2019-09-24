/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.impl;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.BusSlave;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.OpticalSensor;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.ModuleRepositoryPackage;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.OpticalSensorModule;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Optical Sensor Module</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.impl.OpticalSensorModuleImpl#getOpticalSensor <em>Optical Sensor</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.impl.OpticalSensorModuleImpl#getBusSlave <em>Bus Slave</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OpticalSensorModuleImpl extends ModuleImpl implements OpticalSensorModule {
	/**
	 * The cached value of the '{@link #getOpticalSensor() <em>Optical Sensor</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpticalSensor()
	 * @generated
	 * @ordered
	 */
	protected EList<OpticalSensor> opticalSensor;

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
	protected OpticalSensorModuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModuleRepositoryPackage.Literals.OPTICAL_SENSOR_MODULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OpticalSensor> getOpticalSensor() {
		if (opticalSensor == null) {
			opticalSensor = new EObjectContainmentEList<OpticalSensor>(OpticalSensor.class, this, ModuleRepositoryPackage.OPTICAL_SENSOR_MODULE__OPTICAL_SENSOR);
		}
		return opticalSensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BusSlave> getBusSlave() {
		if (busSlave == null) {
			busSlave = new EObjectContainmentEList<BusSlave>(BusSlave.class, this, ModuleRepositoryPackage.OPTICAL_SENSOR_MODULE__BUS_SLAVE);
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
			case ModuleRepositoryPackage.OPTICAL_SENSOR_MODULE__OPTICAL_SENSOR:
				return ((InternalEList<?>)getOpticalSensor()).basicRemove(otherEnd, msgs);
			case ModuleRepositoryPackage.OPTICAL_SENSOR_MODULE__BUS_SLAVE:
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
			case ModuleRepositoryPackage.OPTICAL_SENSOR_MODULE__OPTICAL_SENSOR:
				return getOpticalSensor();
			case ModuleRepositoryPackage.OPTICAL_SENSOR_MODULE__BUS_SLAVE:
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
			case ModuleRepositoryPackage.OPTICAL_SENSOR_MODULE__OPTICAL_SENSOR:
				getOpticalSensor().clear();
				getOpticalSensor().addAll((Collection<? extends OpticalSensor>)newValue);
				return;
			case ModuleRepositoryPackage.OPTICAL_SENSOR_MODULE__BUS_SLAVE:
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
			case ModuleRepositoryPackage.OPTICAL_SENSOR_MODULE__OPTICAL_SENSOR:
				getOpticalSensor().clear();
				return;
			case ModuleRepositoryPackage.OPTICAL_SENSOR_MODULE__BUS_SLAVE:
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
			case ModuleRepositoryPackage.OPTICAL_SENSOR_MODULE__OPTICAL_SENSOR:
				return opticalSensor != null && !opticalSensor.isEmpty();
			case ModuleRepositoryPackage.OPTICAL_SENSOR_MODULE__BUS_SLAVE:
				return busSlave != null && !busSlave.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //OpticalSensorModuleImpl
