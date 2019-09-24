/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.impl;

import edu.kit.ipd.sdq.kamp.model.modificationmarks.ModificationmarksPackage;

import edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.AbstractKAMP4aPSModificationRepository;
import edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ChangePropagationDueToHardwareChange;
import edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.KAMP4aPSModificationRepository;
import edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.KAMP4aPSModificationmarksFactory;
import edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.KAMP4aPSModificationmarksPackage;
import edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.KAMP4aPSSeedModifications;
import edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ModifyBusBox;
import edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ModifyBusCable;
import edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ModifyBusMaster;
import edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ModifyBusSlave;
import edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ModifyComponent;
import edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ModifyEntity;
import edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ModifyInterface;
import edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ModifyMicroSwitchModule;
import edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ModifyModule;
import edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ModifyPhysicalConnection;
import edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ModifyRamp;
import edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ModifySensor;
import edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ModifySignalinterface;
import edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ModifyStructure;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.BusComponentsPackage;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.ComponentRepositoryPackage;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.InterfaceRepositoryPackage;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.ModuleRepositoryPackage;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.StructureRepository.StructureRepositoryPackage;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.apsPackage;

import edu.kit.ipd.sdq.kamp4aps.model.basic.BasicPackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.ETypeParameter;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class KAMP4aPSModificationmarksPackageImpl extends EPackageImpl implements KAMP4aPSModificationmarksPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractKAMP4aPSModificationRepositoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass kamp4aPSModificationRepositoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass kamp4aPSSeedModificationsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass changePropagationDueToHardwareChangeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modifyEntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modifyComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modifyModuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modifyStructureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modifyInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modifySignalinterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modifyPhysicalConnectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modifyMicroSwitchModuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modifyBusBoxEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modifyBusMasterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modifyBusSlaveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modifyBusCableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modifySensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modifyRampEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.KAMP4aPSModificationmarksPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private KAMP4aPSModificationmarksPackageImpl() {
		super(eNS_URI, KAMP4aPSModificationmarksFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link KAMP4aPSModificationmarksPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static KAMP4aPSModificationmarksPackage init() {
		if (isInited) return (KAMP4aPSModificationmarksPackage)EPackage.Registry.INSTANCE.getEPackage(KAMP4aPSModificationmarksPackage.eNS_URI);

		// Obtain or create and register package
		KAMP4aPSModificationmarksPackageImpl theKAMP4aPSModificationmarksPackage = (KAMP4aPSModificationmarksPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof KAMP4aPSModificationmarksPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new KAMP4aPSModificationmarksPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		apsPackage.eINSTANCE.eClass();
		ModificationmarksPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theKAMP4aPSModificationmarksPackage.createPackageContents();

		// Initialize created meta-data
		theKAMP4aPSModificationmarksPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theKAMP4aPSModificationmarksPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(KAMP4aPSModificationmarksPackage.eNS_URI, theKAMP4aPSModificationmarksPackage);
		return theKAMP4aPSModificationmarksPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractKAMP4aPSModificationRepository() {
		return abstractKAMP4aPSModificationRepositoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKAMP4aPSModificationRepository() {
		return kamp4aPSModificationRepositoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKAMP4aPSSeedModifications() {
		return kamp4aPSSeedModificationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKAMP4aPSSeedModifications_StructureModifications() {
		return (EReference)kamp4aPSSeedModificationsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKAMP4aPSSeedModifications_ModuleModifications() {
		return (EReference)kamp4aPSSeedModificationsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKAMP4aPSSeedModifications_ComponentModifications() {
		return (EReference)kamp4aPSSeedModificationsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKAMP4aPSSeedModifications_InterfaceModifications() {
		return (EReference)kamp4aPSSeedModificationsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChangePropagationDueToHardwareChange() {
		return changePropagationDueToHardwareChangeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChangePropagationDueToHardwareChange_SensorModifications() {
		return (EReference)changePropagationDueToHardwareChangeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChangePropagationDueToHardwareChange_SignalinterfaceModifications() {
		return (EReference)changePropagationDueToHardwareChangeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChangePropagationDueToHardwareChange_PhysicalConnectionModifications() {
		return (EReference)changePropagationDueToHardwareChangeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChangePropagationDueToHardwareChange_MicroSwitchModuleModifications() {
		return (EReference)changePropagationDueToHardwareChangeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChangePropagationDueToHardwareChange_BusBoxModifications() {
		return (EReference)changePropagationDueToHardwareChangeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChangePropagationDueToHardwareChange_BusMasterModifications() {
		return (EReference)changePropagationDueToHardwareChangeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChangePropagationDueToHardwareChange_BusSlaveModifications() {
		return (EReference)changePropagationDueToHardwareChangeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChangePropagationDueToHardwareChange_BusCableModifications() {
		return (EReference)changePropagationDueToHardwareChangeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChangePropagationDueToHardwareChange_InterfaceModifications() {
		return (EReference)changePropagationDueToHardwareChangeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChangePropagationDueToHardwareChange_ComponentModifications() {
		return (EReference)changePropagationDueToHardwareChangeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChangePropagationDueToHardwareChange_StructureModifications() {
		return (EReference)changePropagationDueToHardwareChangeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChangePropagationDueToHardwareChange_ModuleModifications() {
		return (EReference)changePropagationDueToHardwareChangeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChangePropagationDueToHardwareChange_Changed() {
		return (EAttribute)changePropagationDueToHardwareChangeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModifyEntity() {
		return modifyEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModifyComponent() {
		return modifyComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModifyModule() {
		return modifyModuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModifyStructure() {
		return modifyStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModifyInterface() {
		return modifyInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModifySignalinterface() {
		return modifySignalinterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModifyPhysicalConnection() {
		return modifyPhysicalConnectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModifyMicroSwitchModule() {
		return modifyMicroSwitchModuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModifyMicroSwitchModule_IsReplaced() {
		return (EAttribute)modifyMicroSwitchModuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModifyBusBox() {
		return modifyBusBoxEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModifyBusMaster() {
		return modifyBusMasterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModifyBusSlave() {
		return modifyBusSlaveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModifyBusCable() {
		return modifyBusCableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModifySensor() {
		return modifySensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModifySensor_ModifySignalInterfaces() {
		return (EReference)modifySensorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModifySensor_ModifyPhysicalConnections() {
		return (EReference)modifySensorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModifyRamp() {
		return modifyRampEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KAMP4aPSModificationmarksFactory getKAMP4aPSModificationmarksFactory() {
		return (KAMP4aPSModificationmarksFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		abstractKAMP4aPSModificationRepositoryEClass = createEClass(ABSTRACT_KAMP_4A_PS_MODIFICATION_REPOSITORY);

		kamp4aPSModificationRepositoryEClass = createEClass(KAMP_4A_PS_MODIFICATION_REPOSITORY);

		kamp4aPSSeedModificationsEClass = createEClass(KAMP_4A_PS_SEED_MODIFICATIONS);
		createEReference(kamp4aPSSeedModificationsEClass, KAMP_4A_PS_SEED_MODIFICATIONS__STRUCTURE_MODIFICATIONS);
		createEReference(kamp4aPSSeedModificationsEClass, KAMP_4A_PS_SEED_MODIFICATIONS__MODULE_MODIFICATIONS);
		createEReference(kamp4aPSSeedModificationsEClass, KAMP_4A_PS_SEED_MODIFICATIONS__COMPONENT_MODIFICATIONS);
		createEReference(kamp4aPSSeedModificationsEClass, KAMP_4A_PS_SEED_MODIFICATIONS__INTERFACE_MODIFICATIONS);

		changePropagationDueToHardwareChangeEClass = createEClass(CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE);
		createEReference(changePropagationDueToHardwareChangeEClass, CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__SENSOR_MODIFICATIONS);
		createEReference(changePropagationDueToHardwareChangeEClass, CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__SIGNALINTERFACE_MODIFICATIONS);
		createEReference(changePropagationDueToHardwareChangeEClass, CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__PHYSICAL_CONNECTION_MODIFICATIONS);
		createEReference(changePropagationDueToHardwareChangeEClass, CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__MICRO_SWITCH_MODULE_MODIFICATIONS);
		createEReference(changePropagationDueToHardwareChangeEClass, CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__BUS_BOX_MODIFICATIONS);
		createEReference(changePropagationDueToHardwareChangeEClass, CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__BUS_MASTER_MODIFICATIONS);
		createEReference(changePropagationDueToHardwareChangeEClass, CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__BUS_SLAVE_MODIFICATIONS);
		createEReference(changePropagationDueToHardwareChangeEClass, CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__BUS_CABLE_MODIFICATIONS);
		createEReference(changePropagationDueToHardwareChangeEClass, CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__INTERFACE_MODIFICATIONS);
		createEReference(changePropagationDueToHardwareChangeEClass, CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__COMPONENT_MODIFICATIONS);
		createEReference(changePropagationDueToHardwareChangeEClass, CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__STRUCTURE_MODIFICATIONS);
		createEReference(changePropagationDueToHardwareChangeEClass, CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__MODULE_MODIFICATIONS);
		createEAttribute(changePropagationDueToHardwareChangeEClass, CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__CHANGED);

		modifyEntityEClass = createEClass(MODIFY_ENTITY);

		modifyComponentEClass = createEClass(MODIFY_COMPONENT);

		modifyModuleEClass = createEClass(MODIFY_MODULE);

		modifyStructureEClass = createEClass(MODIFY_STRUCTURE);

		modifyInterfaceEClass = createEClass(MODIFY_INTERFACE);

		modifySignalinterfaceEClass = createEClass(MODIFY_SIGNALINTERFACE);

		modifyPhysicalConnectionEClass = createEClass(MODIFY_PHYSICAL_CONNECTION);

		modifyMicroSwitchModuleEClass = createEClass(MODIFY_MICRO_SWITCH_MODULE);
		createEAttribute(modifyMicroSwitchModuleEClass, MODIFY_MICRO_SWITCH_MODULE__IS_REPLACED);

		modifyBusBoxEClass = createEClass(MODIFY_BUS_BOX);

		modifyBusMasterEClass = createEClass(MODIFY_BUS_MASTER);

		modifyBusSlaveEClass = createEClass(MODIFY_BUS_SLAVE);

		modifyBusCableEClass = createEClass(MODIFY_BUS_CABLE);

		modifySensorEClass = createEClass(MODIFY_SENSOR);
		createEReference(modifySensorEClass, MODIFY_SENSOR__MODIFY_SIGNAL_INTERFACES);
		createEReference(modifySensorEClass, MODIFY_SENSOR__MODIFY_PHYSICAL_CONNECTIONS);

		modifyRampEClass = createEClass(MODIFY_RAMP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		ModificationmarksPackage theModificationmarksPackage = (ModificationmarksPackage)EPackage.Registry.INSTANCE.getEPackage(ModificationmarksPackage.eNS_URI);
		StructureRepositoryPackage theStructureRepositoryPackage = (StructureRepositoryPackage)EPackage.Registry.INSTANCE.getEPackage(StructureRepositoryPackage.eNS_URI);
		ModuleRepositoryPackage theModuleRepositoryPackage = (ModuleRepositoryPackage)EPackage.Registry.INSTANCE.getEPackage(ModuleRepositoryPackage.eNS_URI);
		ComponentRepositoryPackage theComponentRepositoryPackage = (ComponentRepositoryPackage)EPackage.Registry.INSTANCE.getEPackage(ComponentRepositoryPackage.eNS_URI);
		InterfaceRepositoryPackage theInterfaceRepositoryPackage = (InterfaceRepositoryPackage)EPackage.Registry.INSTANCE.getEPackage(InterfaceRepositoryPackage.eNS_URI);
		BasicPackage theBasicPackage = (BasicPackage)EPackage.Registry.INSTANCE.getEPackage(BasicPackage.eNS_URI);
		BusComponentsPackage theBusComponentsPackage = (BusComponentsPackage)EPackage.Registry.INSTANCE.getEPackage(BusComponentsPackage.eNS_URI);

		// Create type parameters
		ETypeParameter abstractKAMP4aPSModificationRepositoryEClass_T = addETypeParameter(abstractKAMP4aPSModificationRepositoryEClass, "T");
		ETypeParameter modifyEntityEClass_T = addETypeParameter(modifyEntityEClass, "T");
		ETypeParameter modifyComponentEClass_T = addETypeParameter(modifyComponentEClass, "T");
		ETypeParameter modifyModuleEClass_T = addETypeParameter(modifyModuleEClass, "T");
		ETypeParameter modifyStructureEClass_T = addETypeParameter(modifyStructureEClass, "T");
		ETypeParameter modifyInterfaceEClass_T = addETypeParameter(modifyInterfaceEClass, "T");

		// Set bounds for type parameters
		EGenericType g1 = createEGenericType(this.getKAMP4aPSSeedModifications());
		abstractKAMP4aPSModificationRepositoryEClass_T.getEBounds().add(g1);
		g1 = createEGenericType(theBasicPackage.getEntity());
		modifyEntityEClass_T.getEBounds().add(g1);
		g1 = createEGenericType(theComponentRepositoryPackage.getComponent());
		modifyComponentEClass_T.getEBounds().add(g1);
		g1 = createEGenericType(theModuleRepositoryPackage.getModule());
		modifyModuleEClass_T.getEBounds().add(g1);
		g1 = createEGenericType(theStructureRepositoryPackage.getStructure());
		modifyStructureEClass_T.getEBounds().add(g1);
		g1 = createEGenericType(theInterfaceRepositoryPackage.getInterface());
		modifyInterfaceEClass_T.getEBounds().add(g1);

		// Add supertypes to classes
		g1 = createEGenericType(theModificationmarksPackage.getAbstractModificationRepository());
		EGenericType g2 = createEGenericType(abstractKAMP4aPSModificationRepositoryEClass_T);
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(theModificationmarksPackage.getChangePropagationStep());
		g1.getETypeArguments().add(g2);
		abstractKAMP4aPSModificationRepositoryEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getAbstractKAMP4aPSModificationRepository());
		g2 = createEGenericType(this.getKAMP4aPSSeedModifications());
		g1.getETypeArguments().add(g2);
		kamp4aPSModificationRepositoryEClass.getEGenericSuperTypes().add(g1);
		kamp4aPSSeedModificationsEClass.getESuperTypes().add(theModificationmarksPackage.getAbstractSeedModifications());
		changePropagationDueToHardwareChangeEClass.getESuperTypes().add(theModificationmarksPackage.getChangePropagationStep());
		g1 = createEGenericType(theModificationmarksPackage.getAbstractModification());
		g2 = createEGenericType(modifyEntityEClass_T);
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEObject());
		g1.getETypeArguments().add(g2);
		modifyEntityEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getModifyEntity());
		g2 = createEGenericType(theComponentRepositoryPackage.getComponent());
		g1.getETypeArguments().add(g2);
		modifyComponentEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getModifyEntity());
		g2 = createEGenericType(theModuleRepositoryPackage.getModule());
		g1.getETypeArguments().add(g2);
		modifyModuleEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getModifyEntity());
		g2 = createEGenericType(theStructureRepositoryPackage.getStructure());
		g1.getETypeArguments().add(g2);
		modifyStructureEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getModifyEntity());
		g2 = createEGenericType(theInterfaceRepositoryPackage.getInterface());
		g1.getETypeArguments().add(g2);
		modifyInterfaceEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getModifyInterface());
		g2 = createEGenericType(theInterfaceRepositoryPackage.getSignalInterface());
		g1.getETypeArguments().add(g2);
		modifySignalinterfaceEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getModifyInterface());
		g2 = createEGenericType(theInterfaceRepositoryPackage.getPhysicalConnection());
		g1.getETypeArguments().add(g2);
		modifyPhysicalConnectionEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getModifyModule());
		g2 = createEGenericType(theModuleRepositoryPackage.getMicroswitchModule());
		g1.getETypeArguments().add(g2);
		modifyMicroSwitchModuleEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getModifyComponent());
		g2 = createEGenericType(theBusComponentsPackage.getBusBox());
		g1.getETypeArguments().add(g2);
		modifyBusBoxEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getModifyComponent());
		g2 = createEGenericType(theBusComponentsPackage.getBusMaster());
		g1.getETypeArguments().add(g2);
		modifyBusMasterEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getModifyComponent());
		g2 = createEGenericType(theBusComponentsPackage.getBusSlave());
		g1.getETypeArguments().add(g2);
		modifyBusSlaveEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getModifyComponent());
		g2 = createEGenericType(theBusComponentsPackage.getBusCable());
		g1.getETypeArguments().add(g2);
		modifyBusCableEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getModifyComponent());
		g2 = createEGenericType(theComponentRepositoryPackage.getSensor());
		g1.getETypeArguments().add(g2);
		modifySensorEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getModifyComponent());
		g2 = createEGenericType(theComponentRepositoryPackage.getRegularRamp());
		g1.getETypeArguments().add(g2);
		modifyRampEClass.getEGenericSuperTypes().add(g1);

		// Initialize classes, features, and operations; add parameters
		initEClass(abstractKAMP4aPSModificationRepositoryEClass, AbstractKAMP4aPSModificationRepository.class, "AbstractKAMP4aPSModificationRepository", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(kamp4aPSModificationRepositoryEClass, KAMP4aPSModificationRepository.class, "KAMP4aPSModificationRepository", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(kamp4aPSSeedModificationsEClass, KAMP4aPSSeedModifications.class, "KAMP4aPSSeedModifications", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(this.getModifyStructure());
		g2 = createEGenericType(theStructureRepositoryPackage.getStructure());
		g1.getETypeArguments().add(g2);
		initEReference(getKAMP4aPSSeedModifications_StructureModifications(), g1, null, "structureModifications", null, 0, -1, KAMP4aPSSeedModifications.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(this.getModifyModule());
		g2 = createEGenericType(theModuleRepositoryPackage.getModule());
		g1.getETypeArguments().add(g2);
		initEReference(getKAMP4aPSSeedModifications_ModuleModifications(), g1, null, "moduleModifications", null, 0, -1, KAMP4aPSSeedModifications.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(this.getModifyComponent());
		g2 = createEGenericType(theComponentRepositoryPackage.getComponent());
		g1.getETypeArguments().add(g2);
		initEReference(getKAMP4aPSSeedModifications_ComponentModifications(), g1, null, "componentModifications", null, 0, -1, KAMP4aPSSeedModifications.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(this.getModifyInterface());
		g2 = createEGenericType(theInterfaceRepositoryPackage.getInterface());
		g1.getETypeArguments().add(g2);
		initEReference(getKAMP4aPSSeedModifications_InterfaceModifications(), g1, null, "interfaceModifications", null, 0, -1, KAMP4aPSSeedModifications.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(changePropagationDueToHardwareChangeEClass, ChangePropagationDueToHardwareChange.class, "ChangePropagationDueToHardwareChange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getChangePropagationDueToHardwareChange_SensorModifications(), this.getModifySensor(), null, "sensorModifications", null, 0, -1, ChangePropagationDueToHardwareChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChangePropagationDueToHardwareChange_SignalinterfaceModifications(), this.getModifySignalinterface(), null, "signalinterfaceModifications", null, 0, -1, ChangePropagationDueToHardwareChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChangePropagationDueToHardwareChange_PhysicalConnectionModifications(), this.getModifyPhysicalConnection(), null, "physicalConnectionModifications", null, 0, -1, ChangePropagationDueToHardwareChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChangePropagationDueToHardwareChange_MicroSwitchModuleModifications(), this.getModifyMicroSwitchModule(), null, "microSwitchModuleModifications", null, 0, -1, ChangePropagationDueToHardwareChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChangePropagationDueToHardwareChange_BusBoxModifications(), this.getModifyBusBox(), null, "busBoxModifications", null, 0, -1, ChangePropagationDueToHardwareChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChangePropagationDueToHardwareChange_BusMasterModifications(), this.getModifyBusMaster(), null, "busMasterModifications", null, 0, -1, ChangePropagationDueToHardwareChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChangePropagationDueToHardwareChange_BusSlaveModifications(), this.getModifyBusSlave(), null, "busSlaveModifications", null, 0, -1, ChangePropagationDueToHardwareChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChangePropagationDueToHardwareChange_BusCableModifications(), this.getModifyBusCable(), null, "busCableModifications", null, 0, -1, ChangePropagationDueToHardwareChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(this.getModifyInterface());
		g2 = createEGenericType(theInterfaceRepositoryPackage.getInterface());
		g1.getETypeArguments().add(g2);
		initEReference(getChangePropagationDueToHardwareChange_InterfaceModifications(), g1, null, "interfaceModifications", null, 0, -1, ChangePropagationDueToHardwareChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(this.getModifyComponent());
		g2 = createEGenericType(theComponentRepositoryPackage.getComponent());
		g1.getETypeArguments().add(g2);
		initEReference(getChangePropagationDueToHardwareChange_ComponentModifications(), g1, null, "componentModifications", null, 0, -1, ChangePropagationDueToHardwareChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(this.getModifyStructure());
		g2 = createEGenericType(theStructureRepositoryPackage.getStructure());
		g1.getETypeArguments().add(g2);
		initEReference(getChangePropagationDueToHardwareChange_StructureModifications(), g1, null, "structureModifications", null, 0, -1, ChangePropagationDueToHardwareChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(this.getModifyModule());
		g2 = createEGenericType(theModuleRepositoryPackage.getModule());
		g1.getETypeArguments().add(g2);
		initEReference(getChangePropagationDueToHardwareChange_ModuleModifications(), g1, null, "moduleModifications", null, 0, -1, ChangePropagationDueToHardwareChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChangePropagationDueToHardwareChange_Changed(), ecorePackage.getEBoolean(), "changed", "false", 1, 1, ChangePropagationDueToHardwareChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modifyEntityEClass, ModifyEntity.class, "ModifyEntity", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(modifyComponentEClass, ModifyComponent.class, "ModifyComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(modifyModuleEClass, ModifyModule.class, "ModifyModule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(modifyStructureEClass, ModifyStructure.class, "ModifyStructure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(modifyInterfaceEClass, ModifyInterface.class, "ModifyInterface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(modifySignalinterfaceEClass, ModifySignalinterface.class, "ModifySignalinterface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(modifyPhysicalConnectionEClass, ModifyPhysicalConnection.class, "ModifyPhysicalConnection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(modifyMicroSwitchModuleEClass, ModifyMicroSwitchModule.class, "ModifyMicroSwitchModule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModifyMicroSwitchModule_IsReplaced(), ecorePackage.getEBoolean(), "isReplaced", null, 1, 1, ModifyMicroSwitchModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modifyBusBoxEClass, ModifyBusBox.class, "ModifyBusBox", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(modifyBusMasterEClass, ModifyBusMaster.class, "ModifyBusMaster", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(modifyBusSlaveEClass, ModifyBusSlave.class, "ModifyBusSlave", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(modifyBusCableEClass, ModifyBusCable.class, "ModifyBusCable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(modifySensorEClass, ModifySensor.class, "ModifySensor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModifySensor_ModifySignalInterfaces(), theInterfaceRepositoryPackage.getSignalInterface(), null, "modifySignalInterfaces", null, 0, -1, ModifySensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModifySensor_ModifyPhysicalConnections(), theInterfaceRepositoryPackage.getPhysicalConnection(), null, "modifyPhysicalConnections", null, 0, -1, ModifySensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modifyRampEClass, ModifyRamp.class, "ModifyRamp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //KAMP4aPSModificationmarksPackageImpl
