/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.impl;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.BusComponentsPackage;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.impl.BusComponentsPackageImpl;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.ComponentRepositoryPackage;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.ComponentRepositoryPackageImpl;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.ElectronicComponents.ElectronicComponentsPackage;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.ElectronicComponents.impl.ElectronicComponentsPackageImpl;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.Clamping;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.Fixture;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.Gearing;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.Interface;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.InterfaceRepository;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.InterfaceRepositoryFactory;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.InterfaceRepositoryPackage;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.PhysicalConnection;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.PneumaticSupply;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.Screwing;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.ScrewingCylinder;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.ScrewingFixture;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.ScrewingMotor;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.ScrewingPotentiometer;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.ScrewingRack;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.ScrewingSplitter;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.SignalInterface;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.Suspension;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.SuspensionArm;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.SuspensionRack;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.TransportConnection;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.WaterSupply;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.MechanicalComponents.MechanicalComponentsPackage;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.MechanicalComponents.impl.MechanicalComponentsPackageImpl;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.ModuleRepositoryPackage;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.impl.ModuleRepositoryPackageImpl;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.StructureRepository.StructureRepositoryPackage;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.StructureRepository.impl.StructureRepositoryPackageImpl;

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
public class InterfaceRepositoryPackageImpl extends EPackageImpl implements InterfaceRepositoryPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceRepositoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass screwingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass screwingSplitterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass screwingMotorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass screwingRackEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass screwingCylinderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass screwingFixtureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass screwingPotentiometerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass suspensionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass suspensionRackEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass suspensionArmEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gearingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clampingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pneumaticSupplyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass signalInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass waterSupplyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass physicalConnectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transportConnectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fixtureEClass = null;

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
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.InterfaceRepositoryPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private InterfaceRepositoryPackageImpl() {
		super(eNS_URI, InterfaceRepositoryFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link InterfaceRepositoryPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static InterfaceRepositoryPackage init() {
		if (isInited) return (InterfaceRepositoryPackage)EPackage.Registry.INSTANCE.getEPackage(InterfaceRepositoryPackage.eNS_URI);

		// Obtain or create and register package
		InterfaceRepositoryPackageImpl theInterfaceRepositoryPackage = (InterfaceRepositoryPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof InterfaceRepositoryPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new InterfaceRepositoryPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		BasicPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		apsPackageImpl theapsPackage = (apsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(apsPackage.eNS_URI) instanceof apsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(apsPackage.eNS_URI) : apsPackage.eINSTANCE);
		ComponentRepositoryPackageImpl theComponentRepositoryPackage = (ComponentRepositoryPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ComponentRepositoryPackage.eNS_URI) instanceof ComponentRepositoryPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ComponentRepositoryPackage.eNS_URI) : ComponentRepositoryPackage.eINSTANCE);
		BusComponentsPackageImpl theBusComponentsPackage = (BusComponentsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BusComponentsPackage.eNS_URI) instanceof BusComponentsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BusComponentsPackage.eNS_URI) : BusComponentsPackage.eINSTANCE);
		ElectronicComponentsPackageImpl theElectronicComponentsPackage = (ElectronicComponentsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ElectronicComponentsPackage.eNS_URI) instanceof ElectronicComponentsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ElectronicComponentsPackage.eNS_URI) : ElectronicComponentsPackage.eINSTANCE);
		MechanicalComponentsPackageImpl theMechanicalComponentsPackage = (MechanicalComponentsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MechanicalComponentsPackage.eNS_URI) instanceof MechanicalComponentsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MechanicalComponentsPackage.eNS_URI) : MechanicalComponentsPackage.eINSTANCE);
		StructureRepositoryPackageImpl theStructureRepositoryPackage = (StructureRepositoryPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StructureRepositoryPackage.eNS_URI) instanceof StructureRepositoryPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StructureRepositoryPackage.eNS_URI) : StructureRepositoryPackage.eINSTANCE);
		ModuleRepositoryPackageImpl theModuleRepositoryPackage = (ModuleRepositoryPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ModuleRepositoryPackage.eNS_URI) instanceof ModuleRepositoryPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ModuleRepositoryPackage.eNS_URI) : ModuleRepositoryPackage.eINSTANCE);

		// Create package meta-data objects
		theInterfaceRepositoryPackage.createPackageContents();
		theapsPackage.createPackageContents();
		theComponentRepositoryPackage.createPackageContents();
		theBusComponentsPackage.createPackageContents();
		theElectronicComponentsPackage.createPackageContents();
		theMechanicalComponentsPackage.createPackageContents();
		theStructureRepositoryPackage.createPackageContents();
		theModuleRepositoryPackage.createPackageContents();

		// Initialize created meta-data
		theInterfaceRepositoryPackage.initializePackageContents();
		theapsPackage.initializePackageContents();
		theComponentRepositoryPackage.initializePackageContents();
		theBusComponentsPackage.initializePackageContents();
		theElectronicComponentsPackage.initializePackageContents();
		theMechanicalComponentsPackage.initializePackageContents();
		theStructureRepositoryPackage.initializePackageContents();
		theModuleRepositoryPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theInterfaceRepositoryPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(InterfaceRepositoryPackage.eNS_URI, theInterfaceRepositoryPackage);
		return theInterfaceRepositoryPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterfaceRepository() {
		return interfaceRepositoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfaceRepository_AllInterfacesInPlant() {
		return (EReference)interfaceRepositoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterface() {
		return interfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterface_ParentElement() {
		return (EReference)interfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScrewing() {
		return screwingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScrewingSplitter() {
		return screwingSplitterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScrewingMotor() {
		return screwingMotorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScrewingRack() {
		return screwingRackEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScrewingCylinder() {
		return screwingCylinderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScrewingFixture() {
		return screwingFixtureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScrewingPotentiometer() {
		return screwingPotentiometerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSuspension() {
		return suspensionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSuspensionRack() {
		return suspensionRackEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSuspensionArm() {
		return suspensionArmEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGearing() {
		return gearingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClamping() {
		return clampingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPneumaticSupply() {
		return pneumaticSupplyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSignalInterface() {
		return signalInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWaterSupply() {
		return waterSupplyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPhysicalConnection() {
		return physicalConnectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransportConnection() {
		return transportConnectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFixture() {
		return fixtureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceRepositoryFactory getInterfaceRepositoryFactory() {
		return (InterfaceRepositoryFactory)getEFactoryInstance();
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
		interfaceRepositoryEClass = createEClass(INTERFACE_REPOSITORY);
		createEReference(interfaceRepositoryEClass, INTERFACE_REPOSITORY__ALL_INTERFACES_IN_PLANT);

		interfaceEClass = createEClass(INTERFACE);
		createEReference(interfaceEClass, INTERFACE__PARENT_ELEMENT);

		screwingEClass = createEClass(SCREWING);

		screwingSplitterEClass = createEClass(SCREWING_SPLITTER);

		screwingMotorEClass = createEClass(SCREWING_MOTOR);

		screwingRackEClass = createEClass(SCREWING_RACK);

		screwingCylinderEClass = createEClass(SCREWING_CYLINDER);

		screwingFixtureEClass = createEClass(SCREWING_FIXTURE);

		screwingPotentiometerEClass = createEClass(SCREWING_POTENTIOMETER);

		suspensionEClass = createEClass(SUSPENSION);

		suspensionRackEClass = createEClass(SUSPENSION_RACK);

		suspensionArmEClass = createEClass(SUSPENSION_ARM);

		gearingEClass = createEClass(GEARING);

		clampingEClass = createEClass(CLAMPING);

		pneumaticSupplyEClass = createEClass(PNEUMATIC_SUPPLY);

		signalInterfaceEClass = createEClass(SIGNAL_INTERFACE);

		waterSupplyEClass = createEClass(WATER_SUPPLY);

		physicalConnectionEClass = createEClass(PHYSICAL_CONNECTION);

		transportConnectionEClass = createEClass(TRANSPORT_CONNECTION);

		fixtureEClass = createEClass(FIXTURE);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		interfaceRepositoryEClass.getESuperTypes().add(theBasicPackage.getEntity());
		interfaceEClass.getESuperTypes().add(theBasicPackage.getEntity());
		screwingEClass.getESuperTypes().add(this.getInterface());
		screwingSplitterEClass.getESuperTypes().add(this.getScrewing());
		screwingMotorEClass.getESuperTypes().add(this.getScrewing());
		screwingRackEClass.getESuperTypes().add(this.getScrewing());
		screwingCylinderEClass.getESuperTypes().add(this.getScrewing());
		screwingFixtureEClass.getESuperTypes().add(this.getScrewing());
		screwingPotentiometerEClass.getESuperTypes().add(this.getScrewing());
		suspensionEClass.getESuperTypes().add(this.getInterface());
		suspensionRackEClass.getESuperTypes().add(this.getSuspension());
		suspensionArmEClass.getESuperTypes().add(this.getSuspension());
		gearingEClass.getESuperTypes().add(this.getInterface());
		clampingEClass.getESuperTypes().add(this.getInterface());
		pneumaticSupplyEClass.getESuperTypes().add(this.getInterface());
		signalInterfaceEClass.getESuperTypes().add(this.getInterface());
		waterSupplyEClass.getESuperTypes().add(this.getInterface());
		physicalConnectionEClass.getESuperTypes().add(this.getInterface());
		transportConnectionEClass.getESuperTypes().add(this.getInterface());
		fixtureEClass.getESuperTypes().add(this.getInterface());

		// Initialize classes, features, and operations; add parameters
		initEClass(interfaceRepositoryEClass, InterfaceRepository.class, "InterfaceRepository", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInterfaceRepository_AllInterfacesInPlant(), this.getInterface(), null, "allInterfacesInPlant", null, 0, -1, InterfaceRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(interfaceEClass, Interface.class, "Interface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInterface_ParentElement(), theBasicPackage.getEntity(), null, "parentElement", null, 1, -1, Interface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(screwingEClass, Screwing.class, "Screwing", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(screwingSplitterEClass, ScrewingSplitter.class, "ScrewingSplitter", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(screwingMotorEClass, ScrewingMotor.class, "ScrewingMotor", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(screwingRackEClass, ScrewingRack.class, "ScrewingRack", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(screwingCylinderEClass, ScrewingCylinder.class, "ScrewingCylinder", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(screwingFixtureEClass, ScrewingFixture.class, "ScrewingFixture", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(screwingPotentiometerEClass, ScrewingPotentiometer.class, "ScrewingPotentiometer", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(suspensionEClass, Suspension.class, "Suspension", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(suspensionRackEClass, SuspensionRack.class, "SuspensionRack", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(suspensionArmEClass, SuspensionArm.class, "SuspensionArm", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(gearingEClass, Gearing.class, "Gearing", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(clampingEClass, Clamping.class, "Clamping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pneumaticSupplyEClass, PneumaticSupply.class, "PneumaticSupply", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(signalInterfaceEClass, SignalInterface.class, "SignalInterface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(waterSupplyEClass, WaterSupply.class, "WaterSupply", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(physicalConnectionEClass, PhysicalConnection.class, "PhysicalConnection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(transportConnectionEClass, TransportConnection.class, "TransportConnection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(fixtureEClass, Fixture.class, "Fixture", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
	}

} //InterfaceRepositoryPackageImpl
