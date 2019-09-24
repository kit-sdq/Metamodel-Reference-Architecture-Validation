/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.impl;

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

import edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.ConveyorBeltModule;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.InductiveSensorModule;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.MicroswitchModule;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.Module;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.ModuleRepository;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.ModuleRepositoryFactory;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.ModuleRepositoryPackage;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.MonostableCylinderModule;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.MotorModule;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.OpticalSensorModule;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.PotentiometerModule;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.PresenceSensorModule;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.PressureSensorModule;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.PusherModule;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.RampModule;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.SensorModule;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.VacuumGripperModule;

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
public class ModuleRepositoryPackageImpl extends EPackageImpl implements ModuleRepositoryPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass microswitchModuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass potentiometerModuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moduleRepositoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moduleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rampModuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pusherModuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass motorModuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sensorModuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass opticalSensorModuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inductiveSensorModuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass presenceSensorModuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pressureSensorModuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conveyorBeltModuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vacuumGripperModuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass monostableCylinderModuleEClass = null;

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
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.ModuleRepositoryPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ModuleRepositoryPackageImpl() {
		super(eNS_URI, ModuleRepositoryFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ModuleRepositoryPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ModuleRepositoryPackage init() {
		if (isInited) return (ModuleRepositoryPackage)EPackage.Registry.INSTANCE.getEPackage(ModuleRepositoryPackage.eNS_URI);

		// Obtain or create and register package
		ModuleRepositoryPackageImpl theModuleRepositoryPackage = (ModuleRepositoryPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ModuleRepositoryPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ModuleRepositoryPackageImpl());

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
		InterfaceRepositoryPackageImpl theInterfaceRepositoryPackage = (InterfaceRepositoryPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InterfaceRepositoryPackage.eNS_URI) instanceof InterfaceRepositoryPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InterfaceRepositoryPackage.eNS_URI) : InterfaceRepositoryPackage.eINSTANCE);

		// Create package meta-data objects
		theModuleRepositoryPackage.createPackageContents();
		theapsPackage.createPackageContents();
		theComponentRepositoryPackage.createPackageContents();
		theBusComponentsPackage.createPackageContents();
		theElectronicComponentsPackage.createPackageContents();
		theMechanicalComponentsPackage.createPackageContents();
		theStructureRepositoryPackage.createPackageContents();
		theInterfaceRepositoryPackage.createPackageContents();

		// Initialize created meta-data
		theModuleRepositoryPackage.initializePackageContents();
		theapsPackage.initializePackageContents();
		theComponentRepositoryPackage.initializePackageContents();
		theBusComponentsPackage.initializePackageContents();
		theElectronicComponentsPackage.initializePackageContents();
		theMechanicalComponentsPackage.initializePackageContents();
		theStructureRepositoryPackage.initializePackageContents();
		theInterfaceRepositoryPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theModuleRepositoryPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ModuleRepositoryPackage.eNS_URI, theModuleRepositoryPackage);
		return theModuleRepositoryPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMicroswitchModule() {
		return microswitchModuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMicroswitchModule_BusSlave() {
		return (EReference)microswitchModuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMicroswitchModule_Switch() {
		return (EReference)microswitchModuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPotentiometerModule() {
		return potentiometerModuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPotentiometerModule_Poti() {
		return (EReference)potentiometerModuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModuleRepository() {
		return moduleRepositoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModuleRepository_AllModulesInPlant() {
		return (EReference)moduleRepositoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModule() {
		return moduleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModule_ParentEntity() {
		return (EReference)moduleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModule_Modules() {
		return (EReference)moduleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModule_Components() {
		return (EReference)moduleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModule_Interfaces() {
		return (EReference)moduleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRampModule() {
		return rampModuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPusherModule() {
		return pusherModuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMotorModule() {
		return motorModuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMotorModule_SimpleMotor() {
		return (EReference)motorModuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMotorModule_BusSlave() {
		return (EReference)motorModuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMotorModule_BusBox() {
		return (EReference)motorModuleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMotorModule_BusCable() {
		return (EReference)motorModuleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSensorModule() {
		return sensorModuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOpticalSensorModule() {
		return opticalSensorModuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOpticalSensorModule_OpticalSensor() {
		return (EReference)opticalSensorModuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOpticalSensorModule_BusSlave() {
		return (EReference)opticalSensorModuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInductiveSensorModule() {
		return inductiveSensorModuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInductiveSensorModule_InductiveSensor() {
		return (EReference)inductiveSensorModuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInductiveSensorModule_BusSlave() {
		return (EReference)inductiveSensorModuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPresenceSensorModule() {
		return presenceSensorModuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPresenceSensorModule_PresenceSensor() {
		return (EReference)presenceSensorModuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPresenceSensorModule_BusSlave() {
		return (EReference)presenceSensorModuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPressureSensorModule() {
		return pressureSensorModuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConveyorBeltModule() {
		return conveyorBeltModuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConveyorBeltModule_RubberBand() {
		return (EReference)conveyorBeltModuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConveyorBeltModule_Frame() {
		return (EReference)conveyorBeltModuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVacuumGripperModule() {
		return vacuumGripperModuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMonostableCylinderModule() {
		return monostableCylinderModuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModuleRepositoryFactory getModuleRepositoryFactory() {
		return (ModuleRepositoryFactory)getEFactoryInstance();
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
		microswitchModuleEClass = createEClass(MICROSWITCH_MODULE);
		createEReference(microswitchModuleEClass, MICROSWITCH_MODULE__BUS_SLAVE);
		createEReference(microswitchModuleEClass, MICROSWITCH_MODULE__SWITCH);

		potentiometerModuleEClass = createEClass(POTENTIOMETER_MODULE);
		createEReference(potentiometerModuleEClass, POTENTIOMETER_MODULE__POTI);

		moduleRepositoryEClass = createEClass(MODULE_REPOSITORY);
		createEReference(moduleRepositoryEClass, MODULE_REPOSITORY__ALL_MODULES_IN_PLANT);

		moduleEClass = createEClass(MODULE);
		createEReference(moduleEClass, MODULE__PARENT_ENTITY);
		createEReference(moduleEClass, MODULE__MODULES);
		createEReference(moduleEClass, MODULE__COMPONENTS);
		createEReference(moduleEClass, MODULE__INTERFACES);

		rampModuleEClass = createEClass(RAMP_MODULE);

		pusherModuleEClass = createEClass(PUSHER_MODULE);

		motorModuleEClass = createEClass(MOTOR_MODULE);
		createEReference(motorModuleEClass, MOTOR_MODULE__SIMPLE_MOTOR);
		createEReference(motorModuleEClass, MOTOR_MODULE__BUS_SLAVE);
		createEReference(motorModuleEClass, MOTOR_MODULE__BUS_BOX);
		createEReference(motorModuleEClass, MOTOR_MODULE__BUS_CABLE);

		sensorModuleEClass = createEClass(SENSOR_MODULE);

		opticalSensorModuleEClass = createEClass(OPTICAL_SENSOR_MODULE);
		createEReference(opticalSensorModuleEClass, OPTICAL_SENSOR_MODULE__OPTICAL_SENSOR);
		createEReference(opticalSensorModuleEClass, OPTICAL_SENSOR_MODULE__BUS_SLAVE);

		inductiveSensorModuleEClass = createEClass(INDUCTIVE_SENSOR_MODULE);
		createEReference(inductiveSensorModuleEClass, INDUCTIVE_SENSOR_MODULE__INDUCTIVE_SENSOR);
		createEReference(inductiveSensorModuleEClass, INDUCTIVE_SENSOR_MODULE__BUS_SLAVE);

		presenceSensorModuleEClass = createEClass(PRESENCE_SENSOR_MODULE);
		createEReference(presenceSensorModuleEClass, PRESENCE_SENSOR_MODULE__PRESENCE_SENSOR);
		createEReference(presenceSensorModuleEClass, PRESENCE_SENSOR_MODULE__BUS_SLAVE);

		pressureSensorModuleEClass = createEClass(PRESSURE_SENSOR_MODULE);

		conveyorBeltModuleEClass = createEClass(CONVEYOR_BELT_MODULE);
		createEReference(conveyorBeltModuleEClass, CONVEYOR_BELT_MODULE__RUBBER_BAND);
		createEReference(conveyorBeltModuleEClass, CONVEYOR_BELT_MODULE__FRAME);

		vacuumGripperModuleEClass = createEClass(VACUUM_GRIPPER_MODULE);

		monostableCylinderModuleEClass = createEClass(MONOSTABLE_CYLINDER_MODULE);
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
		BusComponentsPackage theBusComponentsPackage = (BusComponentsPackage)EPackage.Registry.INSTANCE.getEPackage(BusComponentsPackage.eNS_URI);
		ElectronicComponentsPackage theElectronicComponentsPackage = (ElectronicComponentsPackage)EPackage.Registry.INSTANCE.getEPackage(ElectronicComponentsPackage.eNS_URI);
		BasicPackage theBasicPackage = (BasicPackage)EPackage.Registry.INSTANCE.getEPackage(BasicPackage.eNS_URI);
		ComponentRepositoryPackage theComponentRepositoryPackage = (ComponentRepositoryPackage)EPackage.Registry.INSTANCE.getEPackage(ComponentRepositoryPackage.eNS_URI);
		InterfaceRepositoryPackage theInterfaceRepositoryPackage = (InterfaceRepositoryPackage)EPackage.Registry.INSTANCE.getEPackage(InterfaceRepositoryPackage.eNS_URI);
		MechanicalComponentsPackage theMechanicalComponentsPackage = (MechanicalComponentsPackage)EPackage.Registry.INSTANCE.getEPackage(MechanicalComponentsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		microswitchModuleEClass.getESuperTypes().add(this.getModule());
		potentiometerModuleEClass.getESuperTypes().add(this.getModule());
		moduleRepositoryEClass.getESuperTypes().add(theBasicPackage.getEntity());
		moduleEClass.getESuperTypes().add(theBasicPackage.getEntity());
		rampModuleEClass.getESuperTypes().add(this.getModule());
		pusherModuleEClass.getESuperTypes().add(this.getModule());
		motorModuleEClass.getESuperTypes().add(this.getModule());
		sensorModuleEClass.getESuperTypes().add(this.getModule());
		opticalSensorModuleEClass.getESuperTypes().add(this.getModule());
		inductiveSensorModuleEClass.getESuperTypes().add(this.getModule());
		presenceSensorModuleEClass.getESuperTypes().add(this.getModule());
		pressureSensorModuleEClass.getESuperTypes().add(this.getModule());
		conveyorBeltModuleEClass.getESuperTypes().add(this.getModule());
		vacuumGripperModuleEClass.getESuperTypes().add(this.getModule());
		monostableCylinderModuleEClass.getESuperTypes().add(this.getModule());

		// Initialize classes, features, and operations; add parameters
		initEClass(microswitchModuleEClass, MicroswitchModule.class, "MicroswitchModule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMicroswitchModule_BusSlave(), theBusComponentsPackage.getBusSlave(), null, "busSlave", null, 1, -1, MicroswitchModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMicroswitchModule_Switch(), theElectronicComponentsPackage.getMicroSwitch(), theElectronicComponentsPackage.getMicroSwitch_MsModule(), "switch", null, 1, 1, MicroswitchModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(potentiometerModuleEClass, PotentiometerModule.class, "PotentiometerModule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPotentiometerModule_Poti(), theElectronicComponentsPackage.getPotentiometer(), null, "poti", null, 1, 1, PotentiometerModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(moduleRepositoryEClass, ModuleRepository.class, "ModuleRepository", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModuleRepository_AllModulesInPlant(), this.getModule(), null, "allModulesInPlant", null, 0, -1, ModuleRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(moduleEClass, Module.class, "Module", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModule_ParentEntity(), theBasicPackage.getEntity(), null, "parentEntity", null, 1, 1, Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModule_Modules(), this.getModule(), null, "modules", null, 0, -1, Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModule_Components(), theComponentRepositoryPackage.getComponent(), theComponentRepositoryPackage.getComponent_ParentModule(), "components", null, 0, -1, Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModule_Interfaces(), theInterfaceRepositoryPackage.getInterface(), null, "interfaces", null, 0, -1, Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rampModuleEClass, RampModule.class, "RampModule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pusherModuleEClass, PusherModule.class, "PusherModule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(motorModuleEClass, MotorModule.class, "MotorModule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMotorModule_SimpleMotor(), theComponentRepositoryPackage.getSimpleMotor(), null, "simpleMotor", null, 1, -1, MotorModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMotorModule_BusSlave(), theBusComponentsPackage.getBusSlave(), null, "busSlave", null, 1, -1, MotorModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMotorModule_BusBox(), theBusComponentsPackage.getBusBox(), null, "busBox", null, 1, 1, MotorModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMotorModule_BusCable(), theBusComponentsPackage.getBusCable(), null, "busCable", null, 1, -1, MotorModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sensorModuleEClass, SensorModule.class, "SensorModule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(opticalSensorModuleEClass, OpticalSensorModule.class, "OpticalSensorModule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOpticalSensorModule_OpticalSensor(), theComponentRepositoryPackage.getOpticalSensor(), null, "opticalSensor", null, 1, -1, OpticalSensorModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOpticalSensorModule_BusSlave(), theBusComponentsPackage.getBusSlave(), null, "busSlave", null, 1, -1, OpticalSensorModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inductiveSensorModuleEClass, InductiveSensorModule.class, "InductiveSensorModule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInductiveSensorModule_InductiveSensor(), theComponentRepositoryPackage.getInductiveSensor(), null, "inductiveSensor", null, 1, -1, InductiveSensorModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInductiveSensorModule_BusSlave(), theBusComponentsPackage.getBusSlave(), null, "busSlave", null, 1, -1, InductiveSensorModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(presenceSensorModuleEClass, PresenceSensorModule.class, "PresenceSensorModule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPresenceSensorModule_PresenceSensor(), theComponentRepositoryPackage.getPresenceSensor(), null, "presenceSensor", null, 1, -1, PresenceSensorModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPresenceSensorModule_BusSlave(), theBusComponentsPackage.getBusSlave(), null, "busSlave", null, 1, -1, PresenceSensorModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pressureSensorModuleEClass, PressureSensorModule.class, "PressureSensorModule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(conveyorBeltModuleEClass, ConveyorBeltModule.class, "ConveyorBeltModule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConveyorBeltModule_RubberBand(), theMechanicalComponentsPackage.getRubberBand(), null, "rubberBand", null, 1, 1, ConveyorBeltModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConveyorBeltModule_Frame(), theComponentRepositoryPackage.getFrame(), null, "frame", null, 1, 1, ConveyorBeltModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vacuumGripperModuleEClass, VacuumGripperModule.class, "VacuumGripperModule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(monostableCylinderModuleEClass, MonostableCylinderModule.class, "MonostableCylinderModule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
	}

} //ModuleRepositoryPackageImpl
