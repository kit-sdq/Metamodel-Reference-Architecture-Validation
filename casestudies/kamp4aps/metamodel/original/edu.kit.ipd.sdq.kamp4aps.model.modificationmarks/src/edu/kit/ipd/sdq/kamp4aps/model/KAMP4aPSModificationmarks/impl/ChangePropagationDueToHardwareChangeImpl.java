/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.impl;

import edu.kit.ipd.sdq.kamp.model.modificationmarks.impl.ChangePropagationStepImpl;

import edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ChangePropagationDueToHardwareChange;
import edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.KAMP4aPSModificationmarksPackage;
import edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ModifyBusBox;
import edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ModifyBusCable;
import edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ModifyBusMaster;
import edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ModifyBusSlave;
import edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ModifyComponent;
import edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ModifyInterface;
import edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ModifyMicroSwitchModule;
import edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ModifyModule;
import edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ModifyPhysicalConnection;
import edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ModifySensor;
import edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ModifySignalinterface;
import edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ModifyStructure;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Component;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.Interface;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.Module;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.StructureRepository.Structure;

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
 * An implementation of the model object '<em><b>Change Propagation Due To Hardware Change</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.impl.ChangePropagationDueToHardwareChangeImpl#getSensorModifications <em>Sensor Modifications</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.impl.ChangePropagationDueToHardwareChangeImpl#getSignalinterfaceModifications <em>Signalinterface Modifications</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.impl.ChangePropagationDueToHardwareChangeImpl#getPhysicalConnectionModifications <em>Physical Connection Modifications</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.impl.ChangePropagationDueToHardwareChangeImpl#getMicroSwitchModuleModifications <em>Micro Switch Module Modifications</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.impl.ChangePropagationDueToHardwareChangeImpl#getBusBoxModifications <em>Bus Box Modifications</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.impl.ChangePropagationDueToHardwareChangeImpl#getBusMasterModifications <em>Bus Master Modifications</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.impl.ChangePropagationDueToHardwareChangeImpl#getBusSlaveModifications <em>Bus Slave Modifications</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.impl.ChangePropagationDueToHardwareChangeImpl#getBusCableModifications <em>Bus Cable Modifications</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.impl.ChangePropagationDueToHardwareChangeImpl#getInterfaceModifications <em>Interface Modifications</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.impl.ChangePropagationDueToHardwareChangeImpl#getComponentModifications <em>Component Modifications</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.impl.ChangePropagationDueToHardwareChangeImpl#getStructureModifications <em>Structure Modifications</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.impl.ChangePropagationDueToHardwareChangeImpl#getModuleModifications <em>Module Modifications</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.impl.ChangePropagationDueToHardwareChangeImpl#isChanged <em>Changed</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChangePropagationDueToHardwareChangeImpl extends ChangePropagationStepImpl implements ChangePropagationDueToHardwareChange {
	/**
	 * The cached value of the '{@link #getSensorModifications() <em>Sensor Modifications</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSensorModifications()
	 * @generated
	 * @ordered
	 */
	protected EList<ModifySensor> sensorModifications;

	/**
	 * The cached value of the '{@link #getSignalinterfaceModifications() <em>Signalinterface Modifications</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignalinterfaceModifications()
	 * @generated
	 * @ordered
	 */
	protected EList<ModifySignalinterface> signalinterfaceModifications;

	/**
	 * The cached value of the '{@link #getPhysicalConnectionModifications() <em>Physical Connection Modifications</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysicalConnectionModifications()
	 * @generated
	 * @ordered
	 */
	protected EList<ModifyPhysicalConnection> physicalConnectionModifications;

	/**
	 * The cached value of the '{@link #getMicroSwitchModuleModifications() <em>Micro Switch Module Modifications</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMicroSwitchModuleModifications()
	 * @generated
	 * @ordered
	 */
	protected EList<ModifyMicroSwitchModule> microSwitchModuleModifications;

	/**
	 * The cached value of the '{@link #getBusBoxModifications() <em>Bus Box Modifications</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusBoxModifications()
	 * @generated
	 * @ordered
	 */
	protected EList<ModifyBusBox> busBoxModifications;

	/**
	 * The cached value of the '{@link #getBusMasterModifications() <em>Bus Master Modifications</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusMasterModifications()
	 * @generated
	 * @ordered
	 */
	protected EList<ModifyBusMaster> busMasterModifications;

	/**
	 * The cached value of the '{@link #getBusSlaveModifications() <em>Bus Slave Modifications</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusSlaveModifications()
	 * @generated
	 * @ordered
	 */
	protected EList<ModifyBusSlave> busSlaveModifications;

	/**
	 * The cached value of the '{@link #getBusCableModifications() <em>Bus Cable Modifications</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusCableModifications()
	 * @generated
	 * @ordered
	 */
	protected EList<ModifyBusCable> busCableModifications;

	/**
	 * The cached value of the '{@link #getInterfaceModifications() <em>Interface Modifications</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaceModifications()
	 * @generated
	 * @ordered
	 */
	protected EList<ModifyInterface<Interface>> interfaceModifications;

	/**
	 * The cached value of the '{@link #getComponentModifications() <em>Component Modifications</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentModifications()
	 * @generated
	 * @ordered
	 */
	protected EList<ModifyComponent<Component>> componentModifications;

	/**
	 * The cached value of the '{@link #getStructureModifications() <em>Structure Modifications</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructureModifications()
	 * @generated
	 * @ordered
	 */
	protected EList<ModifyStructure<Structure>> structureModifications;

	/**
	 * The cached value of the '{@link #getModuleModifications() <em>Module Modifications</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModuleModifications()
	 * @generated
	 * @ordered
	 */
	protected EList<ModifyModule<Module>> moduleModifications;

	/**
	 * The default value of the '{@link #isChanged() <em>Changed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isChanged()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CHANGED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isChanged() <em>Changed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isChanged()
	 * @generated
	 * @ordered
	 */
	protected boolean changed = CHANGED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChangePropagationDueToHardwareChangeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KAMP4aPSModificationmarksPackage.Literals.CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModifySensor> getSensorModifications() {
		if (sensorModifications == null) {
			sensorModifications = new EObjectContainmentEList<ModifySensor>(ModifySensor.class, this, KAMP4aPSModificationmarksPackage.CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__SENSOR_MODIFICATIONS);
		}
		return sensorModifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModifySignalinterface> getSignalinterfaceModifications() {
		if (signalinterfaceModifications == null) {
			signalinterfaceModifications = new EObjectContainmentEList<ModifySignalinterface>(ModifySignalinterface.class, this, KAMP4aPSModificationmarksPackage.CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__SIGNALINTERFACE_MODIFICATIONS);
		}
		return signalinterfaceModifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModifyPhysicalConnection> getPhysicalConnectionModifications() {
		if (physicalConnectionModifications == null) {
			physicalConnectionModifications = new EObjectContainmentEList<ModifyPhysicalConnection>(ModifyPhysicalConnection.class, this, KAMP4aPSModificationmarksPackage.CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__PHYSICAL_CONNECTION_MODIFICATIONS);
		}
		return physicalConnectionModifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModifyMicroSwitchModule> getMicroSwitchModuleModifications() {
		if (microSwitchModuleModifications == null) {
			microSwitchModuleModifications = new EObjectContainmentEList<ModifyMicroSwitchModule>(ModifyMicroSwitchModule.class, this, KAMP4aPSModificationmarksPackage.CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__MICRO_SWITCH_MODULE_MODIFICATIONS);
		}
		return microSwitchModuleModifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModifyBusBox> getBusBoxModifications() {
		if (busBoxModifications == null) {
			busBoxModifications = new EObjectContainmentEList<ModifyBusBox>(ModifyBusBox.class, this, KAMP4aPSModificationmarksPackage.CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__BUS_BOX_MODIFICATIONS);
		}
		return busBoxModifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModifyBusMaster> getBusMasterModifications() {
		if (busMasterModifications == null) {
			busMasterModifications = new EObjectContainmentEList<ModifyBusMaster>(ModifyBusMaster.class, this, KAMP4aPSModificationmarksPackage.CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__BUS_MASTER_MODIFICATIONS);
		}
		return busMasterModifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModifyBusSlave> getBusSlaveModifications() {
		if (busSlaveModifications == null) {
			busSlaveModifications = new EObjectContainmentEList<ModifyBusSlave>(ModifyBusSlave.class, this, KAMP4aPSModificationmarksPackage.CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__BUS_SLAVE_MODIFICATIONS);
		}
		return busSlaveModifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModifyBusCable> getBusCableModifications() {
		if (busCableModifications == null) {
			busCableModifications = new EObjectContainmentEList<ModifyBusCable>(ModifyBusCable.class, this, KAMP4aPSModificationmarksPackage.CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__BUS_CABLE_MODIFICATIONS);
		}
		return busCableModifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModifyInterface<Interface>> getInterfaceModifications() {
		if (interfaceModifications == null) {
			interfaceModifications = new EObjectContainmentEList<ModifyInterface<Interface>>(ModifyInterface.class, this, KAMP4aPSModificationmarksPackage.CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__INTERFACE_MODIFICATIONS);
		}
		return interfaceModifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModifyComponent<Component>> getComponentModifications() {
		if (componentModifications == null) {
			componentModifications = new EObjectContainmentEList<ModifyComponent<Component>>(ModifyComponent.class, this, KAMP4aPSModificationmarksPackage.CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__COMPONENT_MODIFICATIONS);
		}
		return componentModifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModifyStructure<Structure>> getStructureModifications() {
		if (structureModifications == null) {
			structureModifications = new EObjectContainmentEList<ModifyStructure<Structure>>(ModifyStructure.class, this, KAMP4aPSModificationmarksPackage.CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__STRUCTURE_MODIFICATIONS);
		}
		return structureModifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModifyModule<Module>> getModuleModifications() {
		if (moduleModifications == null) {
			moduleModifications = new EObjectContainmentEList<ModifyModule<Module>>(ModifyModule.class, this, KAMP4aPSModificationmarksPackage.CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__MODULE_MODIFICATIONS);
		}
		return moduleModifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isChanged() {
		return changed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChanged(boolean newChanged) {
		boolean oldChanged = changed;
		changed = newChanged;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KAMP4aPSModificationmarksPackage.CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__CHANGED, oldChanged, changed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KAMP4aPSModificationmarksPackage.CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__SENSOR_MODIFICATIONS:
				return ((InternalEList<?>)getSensorModifications()).basicRemove(otherEnd, msgs);
			case KAMP4aPSModificationmarksPackage.CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__SIGNALINTERFACE_MODIFICATIONS:
				return ((InternalEList<?>)getSignalinterfaceModifications()).basicRemove(otherEnd, msgs);
			case KAMP4aPSModificationmarksPackage.CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__PHYSICAL_CONNECTION_MODIFICATIONS:
				return ((InternalEList<?>)getPhysicalConnectionModifications()).basicRemove(otherEnd, msgs);
			case KAMP4aPSModificationmarksPackage.CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__MICRO_SWITCH_MODULE_MODIFICATIONS:
				return ((InternalEList<?>)getMicroSwitchModuleModifications()).basicRemove(otherEnd, msgs);
			case KAMP4aPSModificationmarksPackage.CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__BUS_BOX_MODIFICATIONS:
				return ((InternalEList<?>)getBusBoxModifications()).basicRemove(otherEnd, msgs);
			case KAMP4aPSModificationmarksPackage.CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__BUS_MASTER_MODIFICATIONS:
				return ((InternalEList<?>)getBusMasterModifications()).basicRemove(otherEnd, msgs);
			case KAMP4aPSModificationmarksPackage.CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__BUS_SLAVE_MODIFICATIONS:
				return ((InternalEList<?>)getBusSlaveModifications()).basicRemove(otherEnd, msgs);
			case KAMP4aPSModificationmarksPackage.CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__BUS_CABLE_MODIFICATIONS:
				return ((InternalEList<?>)getBusCableModifications()).basicRemove(otherEnd, msgs);
			case KAMP4aPSModificationmarksPackage.CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__INTERFACE_MODIFICATIONS:
				return ((InternalEList<?>)getInterfaceModifications()).basicRemove(otherEnd, msgs);
			case KAMP4aPSModificationmarksPackage.CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__COMPONENT_MODIFICATIONS:
				return ((InternalEList<?>)getComponentModifications()).basicRemove(otherEnd, msgs);
			case KAMP4aPSModificationmarksPackage.CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__STRUCTURE_MODIFICATIONS:
				return ((InternalEList<?>)getStructureModifications()).basicRemove(otherEnd, msgs);
			case KAMP4aPSModificationmarksPackage.CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__MODULE_MODIFICATIONS:
				return ((InternalEList<?>)getModuleModifications()).basicRemove(otherEnd, msgs);
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
			case KAMP4aPSModificationmarksPackage.CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__SENSOR_MODIFICATIONS:
				return getSensorModifications();
			case KAMP4aPSModificationmarksPackage.CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__SIGNALINTERFACE_MODIFICATIONS:
				return getSignalinterfaceModifications();
			case KAMP4aPSModificationmarksPackage.CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__PHYSICAL_CONNECTION_MODIFICATIONS:
				return getPhysicalConnectionModifications();
			case KAMP4aPSModificationmarksPackage.CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__MICRO_SWITCH_MODULE_MODIFICATIONS:
				return getMicroSwitchModuleModifications();
			case KAMP4aPSModificationmarksPackage.CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__BUS_BOX_MODIFICATIONS:
				return getBusBoxModifications();
			case KAMP4aPSModificationmarksPackage.CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__BUS_MASTER_MODIFICATIONS:
				return getBusMasterModifications();
			case KAMP4aPSModificationmarksPackage.CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__BUS_SLAVE_MODIFICATIONS:
				return getBusSlaveModifications();
			case KAMP4aPSModificationmarksPackage.CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__BUS_CABLE_MODIFICATIONS:
				return getBusCableModifications();
			case KAMP4aPSModificationmarksPackage.CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__INTERFACE_MODIFICATIONS:
				return getInterfaceModifications();
			case KAMP4aPSModificationmarksPackage.CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__COMPONENT_MODIFICATIONS:
				return getComponentModifications();
			case KAMP4aPSModificationmarksPackage.CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__STRUCTURE_MODIFICATIONS:
				return getStructureModifications();
			case KAMP4aPSModificationmarksPackage.CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__MODULE_MODIFICATIONS:
				return getModuleModifications();
			case KAMP4aPSModificationmarksPackage.CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__CHANGED:
				return isChanged();
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
			case KAMP4aPSModificationmarksPackage.CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__SENSOR_MODIFICATIONS:
				getSensorModifications().clear();
				getSensorModifications().addAll((Collection<? extends ModifySensor>)newValue);
				return;
			case KAMP4aPSModificationmarksPackage.CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__SIGNALINTERFACE_MODIFICATIONS:
				getSignalinterfaceModifications().clear();
				getSignalinterfaceModifications().addAll((Collection<? extends ModifySignalinterface>)newValue);
				return;
			case KAMP4aPSModificationmarksPackage.CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__PHYSICAL_CONNECTION_MODIFICATIONS:
				getPhysicalConnectionModifications().clear();
				getPhysicalConnectionModifications().addAll((Collection<? extends ModifyPhysicalConnection>)newValue);
				return;
			case KAMP4aPSModificationmarksPackage.CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__MICRO_SWITCH_MODULE_MODIFICATIONS:
				getMicroSwitchModuleModifications().clear();
				getMicroSwitchModuleModifications().addAll((Collection<? extends ModifyMicroSwitchModule>)newValue);
				return;
			case KAMP4aPSModificationmarksPackage.CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__BUS_BOX_MODIFICATIONS:
				getBusBoxModifications().clear();
				getBusBoxModifications().addAll((Collection<? extends ModifyBusBox>)newValue);
				return;
			case KAMP4aPSModificationmarksPackage.CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__BUS_MASTER_MODIFICATIONS:
				getBusMasterModifications().clear();
				getBusMasterModifications().addAll((Collection<? extends ModifyBusMaster>)newValue);
				return;
			case KAMP4aPSModificationmarksPackage.CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__BUS_SLAVE_MODIFICATIONS:
				getBusSlaveModifications().clear();
				getBusSlaveModifications().addAll((Collection<? extends ModifyBusSlave>)newValue);
				return;
			case KAMP4aPSModificationmarksPackage.CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__BUS_CABLE_MODIFICATIONS:
				getBusCableModifications().clear();
				getBusCableModifications().addAll((Collection<? extends ModifyBusCable>)newValue);
				return;
			case KAMP4aPSModificationmarksPackage.CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__INTERFACE_MODIFICATIONS:
				getInterfaceModifications().clear();
				getInterfaceModifications().addAll((Collection<? extends ModifyInterface<Interface>>)newValue);
				return;
			case KAMP4aPSModificationmarksPackage.CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__COMPONENT_MODIFICATIONS:
				getComponentModifications().clear();
				getComponentModifications().addAll((Collection<? extends ModifyComponent<Component>>)newValue);
				return;
			case KAMP4aPSModificationmarksPackage.CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__STRUCTURE_MODIFICATIONS:
				getStructureModifications().clear();
				getStructureModifications().addAll((Collection<? extends ModifyStructure<Structure>>)newValue);
				return;
			case KAMP4aPSModificationmarksPackage.CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__MODULE_MODIFICATIONS:
				getModuleModifications().clear();
				getModuleModifications().addAll((Collection<? extends ModifyModule<Module>>)newValue);
				return;
			case KAMP4aPSModificationmarksPackage.CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__CHANGED:
				setChanged((Boolean)newValue);
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
			case KAMP4aPSModificationmarksPackage.CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__SENSOR_MODIFICATIONS:
				getSensorModifications().clear();
				return;
			case KAMP4aPSModificationmarksPackage.CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__SIGNALINTERFACE_MODIFICATIONS:
				getSignalinterfaceModifications().clear();
				return;
			case KAMP4aPSModificationmarksPackage.CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__PHYSICAL_CONNECTION_MODIFICATIONS:
				getPhysicalConnectionModifications().clear();
				return;
			case KAMP4aPSModificationmarksPackage.CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__MICRO_SWITCH_MODULE_MODIFICATIONS:
				getMicroSwitchModuleModifications().clear();
				return;
			case KAMP4aPSModificationmarksPackage.CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__BUS_BOX_MODIFICATIONS:
				getBusBoxModifications().clear();
				return;
			case KAMP4aPSModificationmarksPackage.CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__BUS_MASTER_MODIFICATIONS:
				getBusMasterModifications().clear();
				return;
			case KAMP4aPSModificationmarksPackage.CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__BUS_SLAVE_MODIFICATIONS:
				getBusSlaveModifications().clear();
				return;
			case KAMP4aPSModificationmarksPackage.CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__BUS_CABLE_MODIFICATIONS:
				getBusCableModifications().clear();
				return;
			case KAMP4aPSModificationmarksPackage.CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__INTERFACE_MODIFICATIONS:
				getInterfaceModifications().clear();
				return;
			case KAMP4aPSModificationmarksPackage.CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__COMPONENT_MODIFICATIONS:
				getComponentModifications().clear();
				return;
			case KAMP4aPSModificationmarksPackage.CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__STRUCTURE_MODIFICATIONS:
				getStructureModifications().clear();
				return;
			case KAMP4aPSModificationmarksPackage.CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__MODULE_MODIFICATIONS:
				getModuleModifications().clear();
				return;
			case KAMP4aPSModificationmarksPackage.CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__CHANGED:
				setChanged(CHANGED_EDEFAULT);
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
			case KAMP4aPSModificationmarksPackage.CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__SENSOR_MODIFICATIONS:
				return sensorModifications != null && !sensorModifications.isEmpty();
			case KAMP4aPSModificationmarksPackage.CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__SIGNALINTERFACE_MODIFICATIONS:
				return signalinterfaceModifications != null && !signalinterfaceModifications.isEmpty();
			case KAMP4aPSModificationmarksPackage.CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__PHYSICAL_CONNECTION_MODIFICATIONS:
				return physicalConnectionModifications != null && !physicalConnectionModifications.isEmpty();
			case KAMP4aPSModificationmarksPackage.CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__MICRO_SWITCH_MODULE_MODIFICATIONS:
				return microSwitchModuleModifications != null && !microSwitchModuleModifications.isEmpty();
			case KAMP4aPSModificationmarksPackage.CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__BUS_BOX_MODIFICATIONS:
				return busBoxModifications != null && !busBoxModifications.isEmpty();
			case KAMP4aPSModificationmarksPackage.CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__BUS_MASTER_MODIFICATIONS:
				return busMasterModifications != null && !busMasterModifications.isEmpty();
			case KAMP4aPSModificationmarksPackage.CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__BUS_SLAVE_MODIFICATIONS:
				return busSlaveModifications != null && !busSlaveModifications.isEmpty();
			case KAMP4aPSModificationmarksPackage.CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__BUS_CABLE_MODIFICATIONS:
				return busCableModifications != null && !busCableModifications.isEmpty();
			case KAMP4aPSModificationmarksPackage.CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__INTERFACE_MODIFICATIONS:
				return interfaceModifications != null && !interfaceModifications.isEmpty();
			case KAMP4aPSModificationmarksPackage.CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__COMPONENT_MODIFICATIONS:
				return componentModifications != null && !componentModifications.isEmpty();
			case KAMP4aPSModificationmarksPackage.CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__STRUCTURE_MODIFICATIONS:
				return structureModifications != null && !structureModifications.isEmpty();
			case KAMP4aPSModificationmarksPackage.CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__MODULE_MODIFICATIONS:
				return moduleModifications != null && !moduleModifications.isEmpty();
			case KAMP4aPSModificationmarksPackage.CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__CHANGED:
				return changed != CHANGED_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (changed: ");
		result.append(changed);
		result.append(')');
		return result.toString();
	}

} //ChangePropagationDueToHardwareChangeImpl
