/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.impl;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.BusSlave;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.InductiveSensor;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.InductiveSensorModule;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.ModuleRepositoryPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Inductive Sensor Module</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.impl.InductiveSensorModuleImpl#getInductiveSensor <em>Inductive Sensor</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.impl.InductiveSensorModuleImpl#getBusSlave <em>Bus Slave</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InductiveSensorModuleImpl extends ModuleImpl implements InductiveSensorModule {
	/**
	 * The cached value of the '{@link #getInductiveSensor() <em>Inductive Sensor</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInductiveSensor()
	 * @generated
	 * @ordered
	 */
	protected EList<InductiveSensor> inductiveSensor;

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
	protected InductiveSensorModuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModuleRepositoryPackage.Literals.INDUCTIVE_SENSOR_MODULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InductiveSensor> getInductiveSensor() {
		if (inductiveSensor == null) {
			inductiveSensor = new EObjectContainmentEList<InductiveSensor>(InductiveSensor.class, this, ModuleRepositoryPackage.INDUCTIVE_SENSOR_MODULE__INDUCTIVE_SENSOR);
		}
		return inductiveSensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BusSlave> getBusSlave() {
		if (busSlave == null) {
			busSlave = new EObjectContainmentEList<BusSlave>(BusSlave.class, this, ModuleRepositoryPackage.INDUCTIVE_SENSOR_MODULE__BUS_SLAVE);
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
			case ModuleRepositoryPackage.INDUCTIVE_SENSOR_MODULE__INDUCTIVE_SENSOR:
				return ((InternalEList<?>)getInductiveSensor()).basicRemove(otherEnd, msgs);
			case ModuleRepositoryPackage.INDUCTIVE_SENSOR_MODULE__BUS_SLAVE:
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
			case ModuleRepositoryPackage.INDUCTIVE_SENSOR_MODULE__INDUCTIVE_SENSOR:
				return getInductiveSensor();
			case ModuleRepositoryPackage.INDUCTIVE_SENSOR_MODULE__BUS_SLAVE:
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
			case ModuleRepositoryPackage.INDUCTIVE_SENSOR_MODULE__INDUCTIVE_SENSOR:
				getInductiveSensor().clear();
				getInductiveSensor().addAll((Collection<? extends InductiveSensor>)newValue);
				return;
			case ModuleRepositoryPackage.INDUCTIVE_SENSOR_MODULE__BUS_SLAVE:
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
			case ModuleRepositoryPackage.INDUCTIVE_SENSOR_MODULE__INDUCTIVE_SENSOR:
				getInductiveSensor().clear();
				return;
			case ModuleRepositoryPackage.INDUCTIVE_SENSOR_MODULE__BUS_SLAVE:
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
			case ModuleRepositoryPackage.INDUCTIVE_SENSOR_MODULE__INDUCTIVE_SENSOR:
				return inductiveSensor != null && !inductiveSensor.isEmpty();
			case ModuleRepositoryPackage.INDUCTIVE_SENSOR_MODULE__BUS_SLAVE:
				return busSlave != null && !busSlave.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //InductiveSensorModuleImpl
