/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks;

import edu.kit.ipd.sdq.kamp.model.modificationmarks.ChangePropagationStep;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Component;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.Interface;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.Module;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.StructureRepository.Structure;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Change Propagation Due To Hardware Change</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ChangePropagationDueToHardwareChange#getSensorModifications <em>Sensor Modifications</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ChangePropagationDueToHardwareChange#getSignalinterfaceModifications <em>Signalinterface Modifications</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ChangePropagationDueToHardwareChange#getPhysicalConnectionModifications <em>Physical Connection Modifications</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ChangePropagationDueToHardwareChange#getMicroSwitchModuleModifications <em>Micro Switch Module Modifications</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ChangePropagationDueToHardwareChange#getBusBoxModifications <em>Bus Box Modifications</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ChangePropagationDueToHardwareChange#getBusMasterModifications <em>Bus Master Modifications</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ChangePropagationDueToHardwareChange#getBusSlaveModifications <em>Bus Slave Modifications</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ChangePropagationDueToHardwareChange#getBusCableModifications <em>Bus Cable Modifications</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ChangePropagationDueToHardwareChange#getInterfaceModifications <em>Interface Modifications</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ChangePropagationDueToHardwareChange#getComponentModifications <em>Component Modifications</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ChangePropagationDueToHardwareChange#getStructureModifications <em>Structure Modifications</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ChangePropagationDueToHardwareChange#getModuleModifications <em>Module Modifications</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ChangePropagationDueToHardwareChange#isChanged <em>Changed</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.KAMP4aPSModificationmarksPackage#getChangePropagationDueToHardwareChange()
 * @model
 * @generated
 */
public interface ChangePropagationDueToHardwareChange extends ChangePropagationStep {
	/**
	 * Returns the value of the '<em><b>Sensor Modifications</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ModifySensor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sensor Modifications</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sensor Modifications</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.KAMP4aPSModificationmarksPackage#getChangePropagationDueToHardwareChange_SensorModifications()
	 * @model containment="true"
	 * @generated
	 */
	EList<ModifySensor> getSensorModifications();

	/**
	 * Returns the value of the '<em><b>Signalinterface Modifications</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ModifySignalinterface}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Signalinterface Modifications</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signalinterface Modifications</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.KAMP4aPSModificationmarksPackage#getChangePropagationDueToHardwareChange_SignalinterfaceModifications()
	 * @model containment="true"
	 * @generated
	 */
	EList<ModifySignalinterface> getSignalinterfaceModifications();

	/**
	 * Returns the value of the '<em><b>Physical Connection Modifications</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ModifyPhysicalConnection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Physical Connection Modifications</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Physical Connection Modifications</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.KAMP4aPSModificationmarksPackage#getChangePropagationDueToHardwareChange_PhysicalConnectionModifications()
	 * @model containment="true"
	 * @generated
	 */
	EList<ModifyPhysicalConnection> getPhysicalConnectionModifications();

	/**
	 * Returns the value of the '<em><b>Micro Switch Module Modifications</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ModifyMicroSwitchModule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Micro Switch Module Modifications</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Micro Switch Module Modifications</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.KAMP4aPSModificationmarksPackage#getChangePropagationDueToHardwareChange_MicroSwitchModuleModifications()
	 * @model containment="true"
	 * @generated
	 */
	EList<ModifyMicroSwitchModule> getMicroSwitchModuleModifications();

	/**
	 * Returns the value of the '<em><b>Bus Box Modifications</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ModifyBusBox}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bus Box Modifications</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bus Box Modifications</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.KAMP4aPSModificationmarksPackage#getChangePropagationDueToHardwareChange_BusBoxModifications()
	 * @model containment="true"
	 * @generated
	 */
	EList<ModifyBusBox> getBusBoxModifications();

	/**
	 * Returns the value of the '<em><b>Bus Master Modifications</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ModifyBusMaster}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bus Master Modifications</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bus Master Modifications</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.KAMP4aPSModificationmarksPackage#getChangePropagationDueToHardwareChange_BusMasterModifications()
	 * @model containment="true"
	 * @generated
	 */
	EList<ModifyBusMaster> getBusMasterModifications();

	/**
	 * Returns the value of the '<em><b>Bus Slave Modifications</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ModifyBusSlave}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bus Slave Modifications</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bus Slave Modifications</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.KAMP4aPSModificationmarksPackage#getChangePropagationDueToHardwareChange_BusSlaveModifications()
	 * @model containment="true"
	 * @generated
	 */
	EList<ModifyBusSlave> getBusSlaveModifications();

	/**
	 * Returns the value of the '<em><b>Bus Cable Modifications</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ModifyBusCable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bus Cable Modifications</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bus Cable Modifications</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.KAMP4aPSModificationmarksPackage#getChangePropagationDueToHardwareChange_BusCableModifications()
	 * @model containment="true"
	 * @generated
	 */
	EList<ModifyBusCable> getBusCableModifications();

	/**
	 * Returns the value of the '<em><b>Interface Modifications</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ModifyInterface}&lt;edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.Interface>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface Modifications</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface Modifications</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.KAMP4aPSModificationmarksPackage#getChangePropagationDueToHardwareChange_InterfaceModifications()
	 * @model containment="true"
	 * @generated
	 */
	EList<ModifyInterface<Interface>> getInterfaceModifications();

	/**
	 * Returns the value of the '<em><b>Component Modifications</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ModifyComponent}&lt;edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Component>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component Modifications</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Modifications</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.KAMP4aPSModificationmarksPackage#getChangePropagationDueToHardwareChange_ComponentModifications()
	 * @model containment="true"
	 * @generated
	 */
	EList<ModifyComponent<Component>> getComponentModifications();

	/**
	 * Returns the value of the '<em><b>Structure Modifications</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ModifyStructure}&lt;edu.kit.ipd.sdq.kamp4aps.model.aPS.StructureRepository.Structure>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Structure Modifications</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Structure Modifications</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.KAMP4aPSModificationmarksPackage#getChangePropagationDueToHardwareChange_StructureModifications()
	 * @model containment="true"
	 * @generated
	 */
	EList<ModifyStructure<Structure>> getStructureModifications();

	/**
	 * Returns the value of the '<em><b>Module Modifications</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ModifyModule}&lt;edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.Module>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Module Modifications</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Module Modifications</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.KAMP4aPSModificationmarksPackage#getChangePropagationDueToHardwareChange_ModuleModifications()
	 * @model containment="true"
	 * @generated
	 */
	EList<ModifyModule<Module>> getModuleModifications();

	/**
	 * Returns the value of the '<em><b>Changed</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Changed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Changed</em>' attribute.
	 * @see #setChanged(boolean)
	 * @see edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.KAMP4aPSModificationmarksPackage#getChangePropagationDueToHardwareChange_Changed()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isChanged();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ChangePropagationDueToHardwareChange#isChanged <em>Changed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Changed</em>' attribute.
	 * @see #isChanged()
	 * @generated
	 */
	void setChanged(boolean value);

} // ChangePropagationDueToHardwareChange
