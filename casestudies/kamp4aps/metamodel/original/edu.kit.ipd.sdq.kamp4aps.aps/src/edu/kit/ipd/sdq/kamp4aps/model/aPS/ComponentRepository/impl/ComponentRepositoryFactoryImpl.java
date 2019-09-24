/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.*;

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
public class ComponentRepositoryFactoryImpl extends EFactoryImpl implements ComponentRepositoryFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ComponentRepositoryFactory init() {
		try {
			ComponentRepositoryFactory theComponentRepositoryFactory = (ComponentRepositoryFactory)EPackage.Registry.INSTANCE.getEFactory(ComponentRepositoryPackage.eNS_URI);
			if (theComponentRepositoryFactory != null) {
				return theComponentRepositoryFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ComponentRepositoryFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentRepositoryFactoryImpl() {
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
			case ComponentRepositoryPackage.COMPONENT: return createComponent();
			case ComponentRepositoryPackage.OPERATION_PANEL: return createOperationPanel();
			case ComponentRepositoryPackage.SIMPLE_MOTOR: return createSimpleMotor();
			case ComponentRepositoryPackage.REGULAR_RAMP: return createRegularRamp();
			case ComponentRepositoryPackage.SENSOR: return createSensor();
			case ComponentRepositoryPackage.OPTICAL_SENSOR: return createOpticalSensor();
			case ComponentRepositoryPackage.INDUCTIVE_SENSOR: return createInductiveSensor();
			case ComponentRepositoryPackage.PRESENCE_SENSOR: return createPresenceSensor();
			case ComponentRepositoryPackage.PRESSURE_SENSOR: return createPressureSensor();
			case ComponentRepositoryPackage.PNEUMATIC_PIPE: return createPneumaticPipe();
			case ComponentRepositoryPackage.COMPRESSOR: return createCompressor();
			case ComponentRepositoryPackage.POWER_CABLE: return createPowerCable();
			case ComponentRepositoryPackage.PROPORTIONAL_CYLINDER: return createProportionalCylinder();
			case ComponentRepositoryPackage.BISTABLE_CYLINDER: return createBistableCylinder();
			case ComponentRepositoryPackage.RACK: return createRack();
			case ComponentRepositoryPackage.CORNER: return createCorner();
			case ComponentRepositoryPackage.REGULAR_VALVE: return createRegularValve();
			case ComponentRepositoryPackage.TANK: return createTank();
			case ComponentRepositoryPackage.DISPENSER: return createDispenser();
			case ComponentRepositoryPackage.BOTTLE_SEPERATOR: return createBottleSeperator();
			case ComponentRepositoryPackage.POWER_SUPPLY: return createPowerSupply();
			case ComponentRepositoryPackage.CONVEYOR_BELT: return createConveyorBelt();
			case ComponentRepositoryPackage.FRAME: return createFrame();
			case ComponentRepositoryPackage.PUSHER: return createPusher();
			case ComponentRepositoryPackage.TURNING_TABLE: return createTurningTable();
			case ComponentRepositoryPackage.CONTROLLER: return createController();
			case ComponentRepositoryPackage.LOGICAL_WIRING: return createLogicalWiring();
			case ComponentRepositoryPackage.VACUUM_SWITCH: return createVacuumSwitch();
			case ComponentRepositoryPackage.REED_SWITCH: return createReedSwitch();
			case ComponentRepositoryPackage.POWER_SPLITTER: return createPowerSplitter();
			case ComponentRepositoryPackage.WATER_SPLITTER: return createWaterSplitter();
			case ComponentRepositoryPackage.PNEUMATIC_SPLITTER: return createPneumaticSplitter();
			case ComponentRepositoryPackage.CYLINDER_PART: return createCylinderPart();
			case ComponentRepositoryPackage.MONOSTABLE_CYLINDER: return createMonostableCylinder();
			case ComponentRepositoryPackage.COMPONENT_REPOSITORY: return createComponentRepository();
			case ComponentRepositoryPackage.FIXTURE: return createFixture();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component createComponent() {
		ComponentImpl component = new ComponentImpl();
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationPanel createOperationPanel() {
		OperationPanelImpl operationPanel = new OperationPanelImpl();
		return operationPanel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleMotor createSimpleMotor() {
		SimpleMotorImpl simpleMotor = new SimpleMotorImpl();
		return simpleMotor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegularRamp createRegularRamp() {
		RegularRampImpl regularRamp = new RegularRampImpl();
		return regularRamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sensor createSensor() {
		SensorImpl sensor = new SensorImpl();
		return sensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpticalSensor createOpticalSensor() {
		OpticalSensorImpl opticalSensor = new OpticalSensorImpl();
		return opticalSensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InductiveSensor createInductiveSensor() {
		InductiveSensorImpl inductiveSensor = new InductiveSensorImpl();
		return inductiveSensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PresenceSensor createPresenceSensor() {
		PresenceSensorImpl presenceSensor = new PresenceSensorImpl();
		return presenceSensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PressureSensor createPressureSensor() {
		PressureSensorImpl pressureSensor = new PressureSensorImpl();
		return pressureSensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PneumaticPipe createPneumaticPipe() {
		PneumaticPipeImpl pneumaticPipe = new PneumaticPipeImpl();
		return pneumaticPipe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Compressor createCompressor() {
		CompressorImpl compressor = new CompressorImpl();
		return compressor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PowerCable createPowerCable() {
		PowerCableImpl powerCable = new PowerCableImpl();
		return powerCable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProportionalCylinder createProportionalCylinder() {
		ProportionalCylinderImpl proportionalCylinder = new ProportionalCylinderImpl();
		return proportionalCylinder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BistableCylinder createBistableCylinder() {
		BistableCylinderImpl bistableCylinder = new BistableCylinderImpl();
		return bistableCylinder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rack createRack() {
		RackImpl rack = new RackImpl();
		return rack;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Corner createCorner() {
		CornerImpl corner = new CornerImpl();
		return corner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegularValve createRegularValve() {
		RegularValveImpl regularValve = new RegularValveImpl();
		return regularValve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tank createTank() {
		TankImpl tank = new TankImpl();
		return tank;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dispenser createDispenser() {
		DispenserImpl dispenser = new DispenserImpl();
		return dispenser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BottleSeperator createBottleSeperator() {
		BottleSeperatorImpl bottleSeperator = new BottleSeperatorImpl();
		return bottleSeperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PowerSupply createPowerSupply() {
		PowerSupplyImpl powerSupply = new PowerSupplyImpl();
		return powerSupply;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConveyorBelt createConveyorBelt() {
		ConveyorBeltImpl conveyorBelt = new ConveyorBeltImpl();
		return conveyorBelt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Frame createFrame() {
		FrameImpl frame = new FrameImpl();
		return frame;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pusher createPusher() {
		PusherImpl pusher = new PusherImpl();
		return pusher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TurningTable createTurningTable() {
		TurningTableImpl turningTable = new TurningTableImpl();
		return turningTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Controller createController() {
		ControllerImpl controller = new ControllerImpl();
		return controller;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalWiring createLogicalWiring() {
		LogicalWiringImpl logicalWiring = new LogicalWiringImpl();
		return logicalWiring;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VacuumSwitch createVacuumSwitch() {
		VacuumSwitchImpl vacuumSwitch = new VacuumSwitchImpl();
		return vacuumSwitch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReedSwitch createReedSwitch() {
		ReedSwitchImpl reedSwitch = new ReedSwitchImpl();
		return reedSwitch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PowerSplitter createPowerSplitter() {
		PowerSplitterImpl powerSplitter = new PowerSplitterImpl();
		return powerSplitter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WaterSplitter createWaterSplitter() {
		WaterSplitterImpl waterSplitter = new WaterSplitterImpl();
		return waterSplitter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PneumaticSplitter createPneumaticSplitter() {
		PneumaticSplitterImpl pneumaticSplitter = new PneumaticSplitterImpl();
		return pneumaticSplitter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CylinderPart createCylinderPart() {
		CylinderPartImpl cylinderPart = new CylinderPartImpl();
		return cylinderPart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MonostableCylinder createMonostableCylinder() {
		MonostableCylinderImpl monostableCylinder = new MonostableCylinderImpl();
		return monostableCylinder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentRepository createComponentRepository() {
		ComponentRepositoryImpl componentRepository = new ComponentRepositoryImpl();
		return componentRepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fixture createFixture() {
		FixtureImpl fixture = new FixtureImpl();
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentRepositoryPackage getComponentRepositoryPackage() {
		return (ComponentRepositoryPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ComponentRepositoryPackage getPackage() {
		return ComponentRepositoryPackage.eINSTANCE;
	}

} //ComponentRepositoryFactoryImpl
