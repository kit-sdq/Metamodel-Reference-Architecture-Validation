/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.aPS.StructureRepository.impl;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.BusComponentsPackage;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.impl.BusComponentsPackageImpl;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.ComponentRepositoryPackage;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.ComponentRepositoryPackageImpl;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.ElectronicComponents.ElectronicComponentsPackage;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.ElectronicComponents.impl.ElectronicComponentsPackageImpl;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.InterfaceRepositoryPackage;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.impl.InterfaceRepositoryPackageImpl;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.MechanicalComponents.MechanicalComponentsPackage;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.MechanicalComponents.impl.MechanicalComponentsPackageImpl;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.ModuleRepositoryPackage;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.impl.ModuleRepositoryPackageImpl;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.StructureRepository.CommunicationNetwork;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.StructureRepository.ControlCabinet;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.StructureRepository.Conveyor;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.StructureRepository.Crane;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.StructureRepository.LogicalWiring;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.StructureRepository.PneumaticNetwork;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.StructureRepository.PowerNetwork;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.StructureRepository.PowerWiring;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.StructureRepository.Structure;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.StructureRepository.StructureRepositoryFactory;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.StructureRepository.StructureRepositoryPackage;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.apsPackage;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.impl.apsPackageImpl;

import edu.kit.ipd.sdq.kamp4aps.model.basic.BasicPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StructureRepositoryPackageImpl extends EPackageImpl implements StructureRepositoryPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass communicationNetworkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass powerNetworkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controlCabinetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pneumaticNetworkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conveyorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass craneEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass powerWiringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logicalWiringEClass = null;

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
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.StructureRepository.StructureRepositoryPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private StructureRepositoryPackageImpl() {
		super(eNS_URI, StructureRepositoryFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link StructureRepositoryPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static StructureRepositoryPackage init() {
		if (isInited) return (StructureRepositoryPackage)EPackage.Registry.INSTANCE.getEPackage(StructureRepositoryPackage.eNS_URI);

		// Obtain or create and register package
		StructureRepositoryPackageImpl theStructureRepositoryPackage = (StructureRepositoryPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof StructureRepositoryPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new StructureRepositoryPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		BasicPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		apsPackageImpl theapsPackage = (apsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(apsPackage.eNS_URI) instanceof apsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(apsPackage.eNS_URI) : apsPackage.eINSTANCE);
		ComponentRepositoryPackageImpl theComponentRepositoryPackage = (ComponentRepositoryPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ComponentRepositoryPackage.eNS_URI) instanceof ComponentRepositoryPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ComponentRepositoryPackage.eNS_URI) : ComponentRepositoryPackage.eINSTANCE);
		BusComponentsPackageImpl theBusComponentsPackage = (BusComponentsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BusComponentsPackage.eNS_URI) instanceof BusComponentsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BusComponentsPackage.eNS_URI) : BusComponentsPackage.eINSTANCE);
		ElectronicComponentsPackageImpl theElectronicComponentsPackage = (ElectronicComponentsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ElectronicComponentsPackage.eNS_URI) instanceof ElectronicComponentsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ElectronicComponentsPackage.eNS_URI) : ElectronicComponentsPackage.eINSTANCE);
		MechanicalComponentsPackageImpl theMechanicalComponentsPackage = (MechanicalComponentsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MechanicalComponentsPackage.eNS_URI) instanceof MechanicalComponentsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MechanicalComponentsPackage.eNS_URI) : MechanicalComponentsPackage.eINSTANCE);
		ModuleRepositoryPackageImpl theModuleRepositoryPackage = (ModuleRepositoryPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ModuleRepositoryPackage.eNS_URI) instanceof ModuleRepositoryPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ModuleRepositoryPackage.eNS_URI) : ModuleRepositoryPackage.eINSTANCE);
		InterfaceRepositoryPackageImpl theInterfaceRepositoryPackage = (InterfaceRepositoryPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InterfaceRepositoryPackage.eNS_URI) instanceof InterfaceRepositoryPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InterfaceRepositoryPackage.eNS_URI) : InterfaceRepositoryPackage.eINSTANCE);

		// Create package meta-data objects
		theStructureRepositoryPackage.createPackageContents();
		theapsPackage.createPackageContents();
		theComponentRepositoryPackage.createPackageContents();
		theBusComponentsPackage.createPackageContents();
		theElectronicComponentsPackage.createPackageContents();
		theMechanicalComponentsPackage.createPackageContents();
		theModuleRepositoryPackage.createPackageContents();
		theInterfaceRepositoryPackage.createPackageContents();

		// Initialize created meta-data
		theStructureRepositoryPackage.initializePackageContents();
		theapsPackage.initializePackageContents();
		theComponentRepositoryPackage.initializePackageContents();
		theBusComponentsPackage.initializePackageContents();
		theElectronicComponentsPackage.initializePackageContents();
		theMechanicalComponentsPackage.initializePackageContents();
		theModuleRepositoryPackage.initializePackageContents();
		theInterfaceRepositoryPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theStructureRepositoryPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(StructureRepositoryPackage.eNS_URI, theStructureRepositoryPackage);
		return theStructureRepositoryPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStructure() {
		return structureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructure_ParentPlant() {
		return (EReference)structureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructure_Modules() {
		return (EReference)structureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructure_Components() {
		return (EReference)structureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommunicationNetwork() {
		return communicationNetworkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPowerNetwork() {
		return powerNetworkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControlCabinet() {
		return controlCabinetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControlCabinet_Controller() {
		return (EReference)controlCabinetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPneumaticNetwork() {
		return pneumaticNetworkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConveyor() {
		return conveyorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConveyor_Belts() {
		return (EReference)conveyorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCrane() {
		return craneEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCrane_Arm() {
		return (EReference)craneEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCrane_MountedOn() {
		return (EReference)craneEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCrane_Vacuumgripper() {
		return (EReference)craneEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPowerWiring() {
		return powerWiringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLogicalWiring() {
		return logicalWiringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureRepositoryFactory getStructureRepositoryFactory() {
		return (StructureRepositoryFactory)getEFactoryInstance();
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
		structureEClass = createEClass(STRUCTURE);
		createEReference(structureEClass, STRUCTURE__PARENT_PLANT);
		createEReference(structureEClass, STRUCTURE__MODULES);
		createEReference(structureEClass, STRUCTURE__COMPONENTS);

		communicationNetworkEClass = createEClass(COMMUNICATION_NETWORK);

		powerNetworkEClass = createEClass(POWER_NETWORK);

		controlCabinetEClass = createEClass(CONTROL_CABINET);
		createEReference(controlCabinetEClass, CONTROL_CABINET__CONTROLLER);

		pneumaticNetworkEClass = createEClass(PNEUMATIC_NETWORK);

		conveyorEClass = createEClass(CONVEYOR);
		createEReference(conveyorEClass, CONVEYOR__BELTS);

		craneEClass = createEClass(CRANE);
		createEReference(craneEClass, CRANE__ARM);
		createEReference(craneEClass, CRANE__MOUNTED_ON);
		createEReference(craneEClass, CRANE__VACUUMGRIPPER);

		powerWiringEClass = createEClass(POWER_WIRING);

		logicalWiringEClass = createEClass(LOGICAL_WIRING);
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
		BasicPackage theBasicPackage = (BasicPackage)EPackage.Registry.INSTANCE.getEPackage(BasicPackage.eNS_URI);
		apsPackage theapsPackage = (apsPackage)EPackage.Registry.INSTANCE.getEPackage(apsPackage.eNS_URI);
		ModuleRepositoryPackage theModuleRepositoryPackage = (ModuleRepositoryPackage)EPackage.Registry.INSTANCE.getEPackage(ModuleRepositoryPackage.eNS_URI);
		ComponentRepositoryPackage theComponentRepositoryPackage = (ComponentRepositoryPackage)EPackage.Registry.INSTANCE.getEPackage(ComponentRepositoryPackage.eNS_URI);
		MechanicalComponentsPackage theMechanicalComponentsPackage = (MechanicalComponentsPackage)EPackage.Registry.INSTANCE.getEPackage(MechanicalComponentsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		structureEClass.getESuperTypes().add(theBasicPackage.getEntity());
		communicationNetworkEClass.getESuperTypes().add(this.getStructure());
		powerNetworkEClass.getESuperTypes().add(this.getStructure());
		controlCabinetEClass.getESuperTypes().add(this.getStructure());
		pneumaticNetworkEClass.getESuperTypes().add(this.getStructure());
		conveyorEClass.getESuperTypes().add(this.getStructure());
		craneEClass.getESuperTypes().add(this.getStructure());
		powerWiringEClass.getESuperTypes().add(this.getStructure());
		logicalWiringEClass.getESuperTypes().add(this.getStructure());

		// Initialize classes, features, and operations; add parameters
		initEClass(structureEClass, Structure.class, "Structure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStructure_ParentPlant(), theapsPackage.getPlant(), theapsPackage.getPlant_Structures(), "parentPlant", null, 1, 1, Structure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStructure_Modules(), theModuleRepositoryPackage.getModule(), null, "modules", null, 0, -1, Structure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStructure_Components(), theComponentRepositoryPackage.getComponent(), theComponentRepositoryPackage.getComponent_Parent(), "components", null, 0, -1, Structure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(communicationNetworkEClass, CommunicationNetwork.class, "CommunicationNetwork", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(powerNetworkEClass, PowerNetwork.class, "PowerNetwork", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(controlCabinetEClass, ControlCabinet.class, "ControlCabinet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getControlCabinet_Controller(), theComponentRepositoryPackage.getController(), theComponentRepositoryPackage.getController_ControllerOf(), "controller", null, 1, 1, ControlCabinet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pneumaticNetworkEClass, PneumaticNetwork.class, "PneumaticNetwork", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(conveyorEClass, Conveyor.class, "Conveyor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConveyor_Belts(), theComponentRepositoryPackage.getConveyorBelt(), theComponentRepositoryPackage.getConveyorBelt_MountedTo(), "belts", null, 0, -1, Conveyor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(craneEClass, Crane.class, "Crane", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCrane_Arm(), theMechanicalComponentsPackage.getArm(), theMechanicalComponentsPackage.getArm_MountedTo(), "arm", null, 1, 1, Crane.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCrane_MountedOn(), theComponentRepositoryPackage.getTurningTable(), null, "mountedOn", null, 1, 1, Crane.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCrane_Vacuumgripper(), theModuleRepositoryPackage.getVacuumGripperModule(), null, "vacuumgripper", null, 1, 1, Crane.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(powerWiringEClass, PowerWiring.class, "PowerWiring", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(logicalWiringEClass, LogicalWiring.class, "LogicalWiring", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
	}

} //StructureRepositoryPackageImpl
