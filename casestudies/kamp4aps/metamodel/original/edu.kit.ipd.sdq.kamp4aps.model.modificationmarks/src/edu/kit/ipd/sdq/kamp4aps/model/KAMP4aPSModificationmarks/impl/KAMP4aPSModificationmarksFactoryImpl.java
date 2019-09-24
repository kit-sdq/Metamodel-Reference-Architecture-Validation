/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.impl;

import edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.*;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Component;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.Interface;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.Module;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.StructureRepository.Structure;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class KAMP4aPSModificationmarksFactoryImpl extends EFactoryImpl implements KAMP4aPSModificationmarksFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static KAMP4aPSModificationmarksFactory init() {
		try {
			KAMP4aPSModificationmarksFactory theKAMP4aPSModificationmarksFactory = (KAMP4aPSModificationmarksFactory)EPackage.Registry.INSTANCE.getEFactory(KAMP4aPSModificationmarksPackage.eNS_URI);
			if (theKAMP4aPSModificationmarksFactory != null) {
				return theKAMP4aPSModificationmarksFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new KAMP4aPSModificationmarksFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KAMP4aPSModificationmarksFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case KAMP4aPSModificationmarksPackage.KAMP_4A_PS_MODIFICATION_REPOSITORY: return createKAMP4aPSModificationRepository();
			case KAMP4aPSModificationmarksPackage.KAMP_4A_PS_SEED_MODIFICATIONS: return createKAMP4aPSSeedModifications();
			case KAMP4aPSModificationmarksPackage.CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE: return createChangePropagationDueToHardwareChange();
			case KAMP4aPSModificationmarksPackage.MODIFY_COMPONENT: return createModifyComponent();
			case KAMP4aPSModificationmarksPackage.MODIFY_MODULE: return createModifyModule();
			case KAMP4aPSModificationmarksPackage.MODIFY_STRUCTURE: return createModifyStructure();
			case KAMP4aPSModificationmarksPackage.MODIFY_INTERFACE: return createModifyInterface();
			case KAMP4aPSModificationmarksPackage.MODIFY_SIGNALINTERFACE: return createModifySignalinterface();
			case KAMP4aPSModificationmarksPackage.MODIFY_PHYSICAL_CONNECTION: return createModifyPhysicalConnection();
			case KAMP4aPSModificationmarksPackage.MODIFY_MICRO_SWITCH_MODULE: return createModifyMicroSwitchModule();
			case KAMP4aPSModificationmarksPackage.MODIFY_BUS_BOX: return createModifyBusBox();
			case KAMP4aPSModificationmarksPackage.MODIFY_BUS_MASTER: return createModifyBusMaster();
			case KAMP4aPSModificationmarksPackage.MODIFY_BUS_SLAVE: return createModifyBusSlave();
			case KAMP4aPSModificationmarksPackage.MODIFY_BUS_CABLE: return createModifyBusCable();
			case KAMP4aPSModificationmarksPackage.MODIFY_SENSOR: return createModifySensor();
			case KAMP4aPSModificationmarksPackage.MODIFY_RAMP: return createModifyRamp();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KAMP4aPSModificationRepository createKAMP4aPSModificationRepository() {
		KAMP4aPSModificationRepositoryImpl kamp4aPSModificationRepository = new KAMP4aPSModificationRepositoryImpl();
		return kamp4aPSModificationRepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KAMP4aPSSeedModifications createKAMP4aPSSeedModifications() {
		KAMP4aPSSeedModificationsImpl kamp4aPSSeedModifications = new KAMP4aPSSeedModificationsImpl();
		return kamp4aPSSeedModifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangePropagationDueToHardwareChange createChangePropagationDueToHardwareChange() {
		ChangePropagationDueToHardwareChangeImpl changePropagationDueToHardwareChange = new ChangePropagationDueToHardwareChangeImpl();
		return changePropagationDueToHardwareChange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <T extends Component> ModifyComponent<T> createModifyComponent() {
		ModifyComponentImpl<T> modifyComponent = new ModifyComponentImpl<T>();
		return modifyComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <T extends Module> ModifyModule<T> createModifyModule() {
		ModifyModuleImpl<T> modifyModule = new ModifyModuleImpl<T>();
		return modifyModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <T extends Structure> ModifyStructure<T> createModifyStructure() {
		ModifyStructureImpl<T> modifyStructure = new ModifyStructureImpl<T>();
		return modifyStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <T extends Interface> ModifyInterface<T> createModifyInterface() {
		ModifyInterfaceImpl<T> modifyInterface = new ModifyInterfaceImpl<T>();
		return modifyInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModifySignalinterface createModifySignalinterface() {
		ModifySignalinterfaceImpl modifySignalinterface = new ModifySignalinterfaceImpl();
		return modifySignalinterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModifyPhysicalConnection createModifyPhysicalConnection() {
		ModifyPhysicalConnectionImpl modifyPhysicalConnection = new ModifyPhysicalConnectionImpl();
		return modifyPhysicalConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModifyMicroSwitchModule createModifyMicroSwitchModule() {
		ModifyMicroSwitchModuleImpl modifyMicroSwitchModule = new ModifyMicroSwitchModuleImpl();
		return modifyMicroSwitchModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModifyBusBox createModifyBusBox() {
		ModifyBusBoxImpl modifyBusBox = new ModifyBusBoxImpl();
		return modifyBusBox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModifyBusMaster createModifyBusMaster() {
		ModifyBusMasterImpl modifyBusMaster = new ModifyBusMasterImpl();
		return modifyBusMaster;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModifyBusSlave createModifyBusSlave() {
		ModifyBusSlaveImpl modifyBusSlave = new ModifyBusSlaveImpl();
		return modifyBusSlave;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModifyBusCable createModifyBusCable() {
		ModifyBusCableImpl modifyBusCable = new ModifyBusCableImpl();
		return modifyBusCable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModifySensor createModifySensor() {
		ModifySensorImpl modifySensor = new ModifySensorImpl();
		return modifySensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModifyRamp createModifyRamp() {
		ModifyRampImpl modifyRamp = new ModifyRampImpl();
		return modifyRamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KAMP4aPSModificationmarksPackage getKAMP4aPSModificationmarksPackage() {
		return (KAMP4aPSModificationmarksPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static KAMP4aPSModificationmarksPackage getPackage() {
		return KAMP4aPSModificationmarksPackage.eINSTANCE;
	}

} //KAMP4aPSModificationmarksFactoryImpl
