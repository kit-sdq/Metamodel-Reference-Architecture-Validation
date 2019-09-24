/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.BusComponentsPackage;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.impl.BusComponentsPackageImpl;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.BistableCylinder;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.BottleSeperator;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Cable;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Component;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.ComponentRepository;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.ComponentRepositoryFactory;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.ComponentRepositoryPackage;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Compressor;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Controller;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.ConveyorBelt;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Corner;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Cylinder;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.CylinderPart;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Dispenser;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Fixture;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Frame;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.InductiveSensor;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.LogicalWiring;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.MechanicalAssembly;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.MonostableCylinder;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Motor;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.OperationPanel;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.OpticalSensor;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Panel;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Pipe;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.PneumaticPipe;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.PneumaticSplitter;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.PowerCable;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.PowerSplitter;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.PowerSupply;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.PresenceSensor;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.PressureSensor;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.ProportionalCylinder;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Pusher;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Rack;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.ReedSwitch;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.RegularRamp;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.RegularValve;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Sensor;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.SimpleMotor;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Splitter;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Tank;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.TurningTable;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.VacuumSwitch;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Valve;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.WaterSplitter;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.ElectronicComponents.ElectronicComponentsPackage;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.ElectronicComponents.impl.ElectronicComponentsPackageImpl;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.InterfaceRepositoryPackage;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.impl.InterfaceRepositoryPackageImpl;

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
public class ComponentRepositoryPackageImpl extends EPackageImpl implements ComponentRepositoryPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass panelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationPanelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass motorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleMotorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mechanicalAssemblyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass regularRampEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass opticalSensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inductiveSensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass presenceSensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pressureSensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pipeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pneumaticPipeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compressorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass powerCableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cylinderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass proportionalCylinderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bistableCylinderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rackEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cornerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass regularValveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tankEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dispenserEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bottleSeperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass splitterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass powerSupplyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conveyorBeltEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass frameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pusherEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass turningTableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controllerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logicalWiringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vacuumSwitchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reedSwitchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass powerSplitterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass waterSplitterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pneumaticSplitterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cylinderPartEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass monostableCylinderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentRepositoryEClass = null;

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
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.ComponentRepositoryPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ComponentRepositoryPackageImpl() {
		super(eNS_URI, ComponentRepositoryFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ComponentRepositoryPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ComponentRepositoryPackage init() {
		if (isInited) return (ComponentRepositoryPackage)EPackage.Registry.INSTANCE.getEPackage(ComponentRepositoryPackage.eNS_URI);

		// Obtain or create and register package
		ComponentRepositoryPackageImpl theComponentRepositoryPackage = (ComponentRepositoryPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ComponentRepositoryPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ComponentRepositoryPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		BasicPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		apsPackageImpl theapsPackage = (apsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(apsPackage.eNS_URI) instanceof apsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(apsPackage.eNS_URI) : apsPackage.eINSTANCE);
		BusComponentsPackageImpl theBusComponentsPackage = (BusComponentsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BusComponentsPackage.eNS_URI) instanceof BusComponentsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BusComponentsPackage.eNS_URI) : BusComponentsPackage.eINSTANCE);
		ElectronicComponentsPackageImpl theElectronicComponentsPackage = (ElectronicComponentsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ElectronicComponentsPackage.eNS_URI) instanceof ElectronicComponentsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ElectronicComponentsPackage.eNS_URI) : ElectronicComponentsPackage.eINSTANCE);
		MechanicalComponentsPackageImpl theMechanicalComponentsPackage = (MechanicalComponentsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MechanicalComponentsPackage.eNS_URI) instanceof MechanicalComponentsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MechanicalComponentsPackage.eNS_URI) : MechanicalComponentsPackage.eINSTANCE);
		StructureRepositoryPackageImpl theStructureRepositoryPackage = (StructureRepositoryPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StructureRepositoryPackage.eNS_URI) instanceof StructureRepositoryPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StructureRepositoryPackage.eNS_URI) : StructureRepositoryPackage.eINSTANCE);
		ModuleRepositoryPackageImpl theModuleRepositoryPackage = (ModuleRepositoryPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ModuleRepositoryPackage.eNS_URI) instanceof ModuleRepositoryPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ModuleRepositoryPackage.eNS_URI) : ModuleRepositoryPackage.eINSTANCE);
		InterfaceRepositoryPackageImpl theInterfaceRepositoryPackage = (InterfaceRepositoryPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InterfaceRepositoryPackage.eNS_URI) instanceof InterfaceRepositoryPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InterfaceRepositoryPackage.eNS_URI) : InterfaceRepositoryPackage.eINSTANCE);

		// Create package meta-data objects
		theComponentRepositoryPackage.createPackageContents();
		theapsPackage.createPackageContents();
		theBusComponentsPackage.createPackageContents();
		theElectronicComponentsPackage.createPackageContents();
		theMechanicalComponentsPackage.createPackageContents();
		theStructureRepositoryPackage.createPackageContents();
		theModuleRepositoryPackage.createPackageContents();
		theInterfaceRepositoryPackage.createPackageContents();

		// Initialize created meta-data
		theComponentRepositoryPackage.initializePackageContents();
		theapsPackage.initializePackageContents();
		theBusComponentsPackage.initializePackageContents();
		theElectronicComponentsPackage.initializePackageContents();
		theMechanicalComponentsPackage.initializePackageContents();
		theStructureRepositoryPackage.initializePackageContents();
		theModuleRepositoryPackage.initializePackageContents();
		theInterfaceRepositoryPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theComponentRepositoryPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ComponentRepositoryPackage.eNS_URI, theComponentRepositoryPackage);
		return theComponentRepositoryPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponent() {
		return componentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_ConnectedInterfaces() {
		return (EReference)componentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_Parent() {
		return (EReference)componentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_ParentModule() {
		return (EReference)componentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPanel() {
		return panelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPanel_ComponentRepository() {
		return (EReference)panelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperationPanel() {
		return operationPanelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationPanel_Screwing_rack() {
		return (EReference)operationPanelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationPanel_Leds() {
		return (EReference)operationPanelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationPanel_Buttons() {
		return (EReference)operationPanelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMotor() {
		return motorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMotor_Gearing() {
		return (EReference)motorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMotor_Screwing() {
		return (EReference)motorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMotor_Powersupply() {
		return (EReference)motorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleMotor() {
		return simpleMotorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMechanicalAssembly() {
		return mechanicalAssemblyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRegularRamp() {
		return regularRampEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSensor() {
		return sensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSensor_Physicalconnection() {
		return (EReference)sensorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSensor_Signalinterface() {
		return (EReference)sensorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSensor_Powersupply() {
		return (EReference)sensorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOpticalSensor() {
		return opticalSensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInductiveSensor() {
		return inductiveSensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPresenceSensor() {
		return presenceSensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPressureSensor() {
		return pressureSensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPipe() {
		return pipeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPipe_Plugs() {
		return (EReference)pipeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPneumaticPipe() {
		return pneumaticPipeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompressor() {
		return compressorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompressor_Powersupply() {
		return (EReference)compressorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompressor_Pneumaticsupply() {
		return (EReference)compressorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompressor_Pins() {
		return (EReference)compressorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompressor_Screwing() {
		return (EReference)compressorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompressor_Switch() {
		return (EReference)compressorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCable() {
		return cableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPowerCable() {
		return powerCableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCylinder() {
		return cylinderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCylinder_Pneumaticsupply() {
		return (EReference)cylinderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCylinder_SignalInterface() {
		return (EReference)cylinderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProportionalCylinder() {
		return proportionalCylinderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBistableCylinder() {
		return bistableCylinderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRack() {
		return rackEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRack_Screwing_to_base() {
		return (EReference)rackEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCorner() {
		return cornerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValve() {
		return valveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValve_Pneumaticsupply() {
		return (EReference)valveEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValve_Powersupply() {
		return (EReference)valveEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValve_Signalinterface() {
		return (EReference)valveEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRegularValve() {
		return regularValveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTank() {
		return tankEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTank_Watersupply() {
		return (EReference)tankEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTank_Screwing() {
		return (EReference)tankEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDispenser() {
		return dispenserEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBottleSeperator() {
		return bottleSeperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBottleSeperator_Signalinterface() {
		return (EReference)bottleSeperatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBottleSeperator_Pneumaticsupply() {
		return (EReference)bottleSeperatorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBottleSeperator_Powersupply() {
		return (EReference)bottleSeperatorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBottleSeperator_Screwing_to_rack() {
		return (EReference)bottleSeperatorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSplitter() {
		return splitterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSplitter_Screwing() {
		return (EReference)splitterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPowerSupply() {
		return powerSupplyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConveyorBelt() {
		return conveyorBeltEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConveyorBelt_MountedTo() {
		return (EReference)conveyorBeltEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConveyorBelt_Frame() {
		return (EReference)conveyorBeltEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConveyorBelt_RubberBand() {
		return (EReference)conveyorBeltEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFrame() {
		return frameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPusher() {
		return pusherEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPusher_ComponentsRepository() {
		return (EReference)pusherEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPusher_FixtureCylinder() {
		return (EReference)pusherEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPusher_MonostableCylinder() {
		return (EReference)pusherEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPusher_BusBox() {
		return (EReference)pusherEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPusher_BusCable() {
		return (EReference)pusherEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTurningTable() {
		return turningTableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTurningTable_Rack_for_turningtable() {
		return (EReference)turningTableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTurningTable_Table_to_stand_on() {
		return (EReference)turningTableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTurningTable_Motor_to_drive() {
		return (EReference)turningTableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTurningTable_MicroswitchModule() {
		return (EReference)turningTableEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTurningTable_BusSlave() {
		return (EReference)turningTableEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTurningTable_BusBox() {
		return (EReference)turningTableEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTurningTable_BusCable() {
		return (EReference)turningTableEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTurningTable_Potentiometer() {
		return (EReference)turningTableEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getController() {
		return controllerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getController_Powersupply() {
		return (EReference)controllerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getController_ControllerOf() {
		return (EReference)controllerEClass.getEStructuralFeatures().get(1);
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
	public EReference getLogicalWiring_BusCable() {
		return (EReference)logicalWiringEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVacuumSwitch() {
		return vacuumSwitchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReedSwitch() {
		return reedSwitchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPowerSplitter() {
		return powerSplitterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPowerSplitter_Powersupply() {
		return (EReference)powerSplitterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWaterSplitter() {
		return waterSplitterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWaterSplitter_Watersupply() {
		return (EReference)waterSplitterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPneumaticSplitter() {
		return pneumaticSplitterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPneumaticSplitter_Pneumaticsupply() {
		return (EReference)pneumaticSplitterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCylinderPart() {
		return cylinderPartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMonostableCylinder() {
		return monostableCylinderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMonostableCylinder_Housing() {
		return (EReference)monostableCylinderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMonostableCylinder_Spring() {
		return (EReference)monostableCylinderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMonostableCylinder_ReedSwitches() {
		return (EReference)monostableCylinderEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMonostableCylinder_CylinderPart() {
		return (EReference)monostableCylinderEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMonostableCylinder_Valve() {
		return (EReference)monostableCylinderEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMonostableCylinder_BusSlave() {
		return (EReference)monostableCylinderEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponentRepository() {
		return componentRepositoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentRepository_AllComponentsInPlant() {
		return (EReference)componentRepositoryEClass.getEStructuralFeatures().get(0);
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
	public ComponentRepositoryFactory getComponentRepositoryFactory() {
		return (ComponentRepositoryFactory)getEFactoryInstance();
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
		componentEClass = createEClass(COMPONENT);
		createEReference(componentEClass, COMPONENT__CONNECTED_INTERFACES);
		createEReference(componentEClass, COMPONENT__PARENT);
		createEReference(componentEClass, COMPONENT__PARENT_MODULE);

		panelEClass = createEClass(PANEL);
		createEReference(panelEClass, PANEL__COMPONENT_REPOSITORY);

		operationPanelEClass = createEClass(OPERATION_PANEL);
		createEReference(operationPanelEClass, OPERATION_PANEL__SCREWING_RACK);
		createEReference(operationPanelEClass, OPERATION_PANEL__LEDS);
		createEReference(operationPanelEClass, OPERATION_PANEL__BUTTONS);

		motorEClass = createEClass(MOTOR);
		createEReference(motorEClass, MOTOR__GEARING);
		createEReference(motorEClass, MOTOR__SCREWING);
		createEReference(motorEClass, MOTOR__POWERSUPPLY);

		simpleMotorEClass = createEClass(SIMPLE_MOTOR);

		mechanicalAssemblyEClass = createEClass(MECHANICAL_ASSEMBLY);

		regularRampEClass = createEClass(REGULAR_RAMP);

		sensorEClass = createEClass(SENSOR);
		createEReference(sensorEClass, SENSOR__PHYSICALCONNECTION);
		createEReference(sensorEClass, SENSOR__SIGNALINTERFACE);
		createEReference(sensorEClass, SENSOR__POWERSUPPLY);

		opticalSensorEClass = createEClass(OPTICAL_SENSOR);

		inductiveSensorEClass = createEClass(INDUCTIVE_SENSOR);

		presenceSensorEClass = createEClass(PRESENCE_SENSOR);

		pressureSensorEClass = createEClass(PRESSURE_SENSOR);

		pipeEClass = createEClass(PIPE);
		createEReference(pipeEClass, PIPE__PLUGS);

		pneumaticPipeEClass = createEClass(PNEUMATIC_PIPE);

		compressorEClass = createEClass(COMPRESSOR);
		createEReference(compressorEClass, COMPRESSOR__POWERSUPPLY);
		createEReference(compressorEClass, COMPRESSOR__PNEUMATICSUPPLY);
		createEReference(compressorEClass, COMPRESSOR__PINS);
		createEReference(compressorEClass, COMPRESSOR__SCREWING);
		createEReference(compressorEClass, COMPRESSOR__SWITCH);

		cableEClass = createEClass(CABLE);

		powerCableEClass = createEClass(POWER_CABLE);

		cylinderEClass = createEClass(CYLINDER);
		createEReference(cylinderEClass, CYLINDER__PNEUMATICSUPPLY);
		createEReference(cylinderEClass, CYLINDER__SIGNAL_INTERFACE);

		proportionalCylinderEClass = createEClass(PROPORTIONAL_CYLINDER);

		bistableCylinderEClass = createEClass(BISTABLE_CYLINDER);

		rackEClass = createEClass(RACK);
		createEReference(rackEClass, RACK__SCREWING_TO_BASE);

		cornerEClass = createEClass(CORNER);

		valveEClass = createEClass(VALVE);
		createEReference(valveEClass, VALVE__PNEUMATICSUPPLY);
		createEReference(valveEClass, VALVE__POWERSUPPLY);
		createEReference(valveEClass, VALVE__SIGNALINTERFACE);

		regularValveEClass = createEClass(REGULAR_VALVE);

		tankEClass = createEClass(TANK);
		createEReference(tankEClass, TANK__WATERSUPPLY);
		createEReference(tankEClass, TANK__SCREWING);

		dispenserEClass = createEClass(DISPENSER);

		bottleSeperatorEClass = createEClass(BOTTLE_SEPERATOR);
		createEReference(bottleSeperatorEClass, BOTTLE_SEPERATOR__SIGNALINTERFACE);
		createEReference(bottleSeperatorEClass, BOTTLE_SEPERATOR__PNEUMATICSUPPLY);
		createEReference(bottleSeperatorEClass, BOTTLE_SEPERATOR__POWERSUPPLY);
		createEReference(bottleSeperatorEClass, BOTTLE_SEPERATOR__SCREWING_TO_RACK);

		splitterEClass = createEClass(SPLITTER);
		createEReference(splitterEClass, SPLITTER__SCREWING);

		powerSupplyEClass = createEClass(POWER_SUPPLY);

		conveyorBeltEClass = createEClass(CONVEYOR_BELT);
		createEReference(conveyorBeltEClass, CONVEYOR_BELT__MOUNTED_TO);
		createEReference(conveyorBeltEClass, CONVEYOR_BELT__FRAME);
		createEReference(conveyorBeltEClass, CONVEYOR_BELT__RUBBER_BAND);

		frameEClass = createEClass(FRAME);

		pusherEClass = createEClass(PUSHER);
		createEReference(pusherEClass, PUSHER__COMPONENTS_REPOSITORY);
		createEReference(pusherEClass, PUSHER__FIXTURE_CYLINDER);
		createEReference(pusherEClass, PUSHER__MONOSTABLE_CYLINDER);
		createEReference(pusherEClass, PUSHER__BUS_BOX);
		createEReference(pusherEClass, PUSHER__BUS_CABLE);

		turningTableEClass = createEClass(TURNING_TABLE);
		createEReference(turningTableEClass, TURNING_TABLE__RACK_FOR_TURNINGTABLE);
		createEReference(turningTableEClass, TURNING_TABLE__TABLE_TO_STAND_ON);
		createEReference(turningTableEClass, TURNING_TABLE__MOTOR_TO_DRIVE);
		createEReference(turningTableEClass, TURNING_TABLE__MICROSWITCH_MODULE);
		createEReference(turningTableEClass, TURNING_TABLE__BUS_SLAVE);
		createEReference(turningTableEClass, TURNING_TABLE__BUS_BOX);
		createEReference(turningTableEClass, TURNING_TABLE__BUS_CABLE);
		createEReference(turningTableEClass, TURNING_TABLE__POTENTIOMETER);

		controllerEClass = createEClass(CONTROLLER);
		createEReference(controllerEClass, CONTROLLER__POWERSUPPLY);
		createEReference(controllerEClass, CONTROLLER__CONTROLLER_OF);

		logicalWiringEClass = createEClass(LOGICAL_WIRING);
		createEReference(logicalWiringEClass, LOGICAL_WIRING__BUS_CABLE);

		vacuumSwitchEClass = createEClass(VACUUM_SWITCH);

		reedSwitchEClass = createEClass(REED_SWITCH);

		powerSplitterEClass = createEClass(POWER_SPLITTER);
		createEReference(powerSplitterEClass, POWER_SPLITTER__POWERSUPPLY);

		waterSplitterEClass = createEClass(WATER_SPLITTER);
		createEReference(waterSplitterEClass, WATER_SPLITTER__WATERSUPPLY);

		pneumaticSplitterEClass = createEClass(PNEUMATIC_SPLITTER);
		createEReference(pneumaticSplitterEClass, PNEUMATIC_SPLITTER__PNEUMATICSUPPLY);

		cylinderPartEClass = createEClass(CYLINDER_PART);

		monostableCylinderEClass = createEClass(MONOSTABLE_CYLINDER);
		createEReference(monostableCylinderEClass, MONOSTABLE_CYLINDER__HOUSING);
		createEReference(monostableCylinderEClass, MONOSTABLE_CYLINDER__SPRING);
		createEReference(monostableCylinderEClass, MONOSTABLE_CYLINDER__REED_SWITCHES);
		createEReference(monostableCylinderEClass, MONOSTABLE_CYLINDER__CYLINDER_PART);
		createEReference(monostableCylinderEClass, MONOSTABLE_CYLINDER__VALVE);
		createEReference(monostableCylinderEClass, MONOSTABLE_CYLINDER__BUS_SLAVE);

		componentRepositoryEClass = createEClass(COMPONENT_REPOSITORY);
		createEReference(componentRepositoryEClass, COMPONENT_REPOSITORY__ALL_COMPONENTS_IN_PLANT);

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
		InterfaceRepositoryPackage theInterfaceRepositoryPackage = (InterfaceRepositoryPackage)EPackage.Registry.INSTANCE.getEPackage(InterfaceRepositoryPackage.eNS_URI);
		StructureRepositoryPackage theStructureRepositoryPackage = (StructureRepositoryPackage)EPackage.Registry.INSTANCE.getEPackage(StructureRepositoryPackage.eNS_URI);
		ModuleRepositoryPackage theModuleRepositoryPackage = (ModuleRepositoryPackage)EPackage.Registry.INSTANCE.getEPackage(ModuleRepositoryPackage.eNS_URI);
		ElectronicComponentsPackage theElectronicComponentsPackage = (ElectronicComponentsPackage)EPackage.Registry.INSTANCE.getEPackage(ElectronicComponentsPackage.eNS_URI);
		MechanicalComponentsPackage theMechanicalComponentsPackage = (MechanicalComponentsPackage)EPackage.Registry.INSTANCE.getEPackage(MechanicalComponentsPackage.eNS_URI);
		BusComponentsPackage theBusComponentsPackage = (BusComponentsPackage)EPackage.Registry.INSTANCE.getEPackage(BusComponentsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		componentEClass.getESuperTypes().add(theBasicPackage.getEntity());
		panelEClass.getESuperTypes().add(this.getComponent());
		operationPanelEClass.getESuperTypes().add(this.getPanel());
		motorEClass.getESuperTypes().add(this.getComponent());
		simpleMotorEClass.getESuperTypes().add(this.getMotor());
		mechanicalAssemblyEClass.getESuperTypes().add(this.getComponent());
		regularRampEClass.getESuperTypes().add(theMechanicalComponentsPackage.getRamp());
		sensorEClass.getESuperTypes().add(this.getComponent());
		opticalSensorEClass.getESuperTypes().add(this.getSensor());
		inductiveSensorEClass.getESuperTypes().add(this.getSensor());
		presenceSensorEClass.getESuperTypes().add(this.getSensor());
		pressureSensorEClass.getESuperTypes().add(this.getSensor());
		pipeEClass.getESuperTypes().add(this.getComponent());
		pneumaticPipeEClass.getESuperTypes().add(this.getPipe());
		compressorEClass.getESuperTypes().add(this.getComponent());
		cableEClass.getESuperTypes().add(this.getComponent());
		powerCableEClass.getESuperTypes().add(this.getCable());
		cylinderEClass.getESuperTypes().add(this.getComponent());
		proportionalCylinderEClass.getESuperTypes().add(this.getCylinder());
		bistableCylinderEClass.getESuperTypes().add(this.getCylinder());
		rackEClass.getESuperTypes().add(this.getComponent());
		cornerEClass.getESuperTypes().add(this.getComponent());
		valveEClass.getESuperTypes().add(this.getComponent());
		regularValveEClass.getESuperTypes().add(this.getValve());
		tankEClass.getESuperTypes().add(this.getComponent());
		dispenserEClass.getESuperTypes().add(this.getComponent());
		bottleSeperatorEClass.getESuperTypes().add(this.getComponent());
		splitterEClass.getESuperTypes().add(this.getComponent());
		powerSupplyEClass.getESuperTypes().add(this.getComponent());
		powerSupplyEClass.getESuperTypes().add(theInterfaceRepositoryPackage.getInterface());
		conveyorBeltEClass.getESuperTypes().add(this.getComponent());
		frameEClass.getESuperTypes().add(this.getMechanicalAssembly());
		pusherEClass.getESuperTypes().add(this.getComponent());
		turningTableEClass.getESuperTypes().add(theModuleRepositoryPackage.getModule());
		controllerEClass.getESuperTypes().add(this.getComponent());
		logicalWiringEClass.getESuperTypes().add(this.getComponent());
		vacuumSwitchEClass.getESuperTypes().add(theElectronicComponentsPackage.getSwitch());
		reedSwitchEClass.getESuperTypes().add(theElectronicComponentsPackage.getSwitch());
		powerSplitterEClass.getESuperTypes().add(this.getSplitter());
		waterSplitterEClass.getESuperTypes().add(this.getSplitter());
		pneumaticSplitterEClass.getESuperTypes().add(this.getSplitter());
		cylinderPartEClass.getESuperTypes().add(theMechanicalComponentsPackage.getMechanicalPart());
		monostableCylinderEClass.getESuperTypes().add(this.getCylinder());
		componentRepositoryEClass.getESuperTypes().add(theBasicPackage.getEntity());
		fixtureEClass.getESuperTypes().add(this.getComponent());

		// Initialize classes, features, and operations; add parameters
		initEClass(componentEClass, Component.class, "Component", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponent_ConnectedInterfaces(), theInterfaceRepositoryPackage.getInterface(), null, "connectedInterfaces", null, 0, -1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponent_Parent(), theStructureRepositoryPackage.getStructure(), theStructureRepositoryPackage.getStructure_Components(), "parent", null, 0, 1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponent_ParentModule(), theModuleRepositoryPackage.getModule(), theModuleRepositoryPackage.getModule_Components(), "parentModule", null, 0, 1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(panelEClass, Panel.class, "Panel", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPanel_ComponentRepository(), this.getComponent(), null, "componentRepository", null, 1, 1, Panel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operationPanelEClass, OperationPanel.class, "OperationPanel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOperationPanel_Screwing_rack(), theInterfaceRepositoryPackage.getScrewing(), null, "screwing_rack", null, 1, 1, OperationPanel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperationPanel_Leds(), theElectronicComponentsPackage.getLED(), null, "leds", null, 0, -1, OperationPanel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperationPanel_Buttons(), theElectronicComponentsPackage.getButton(), null, "buttons", null, 0, -1, OperationPanel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(motorEClass, Motor.class, "Motor", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMotor_Gearing(), theInterfaceRepositoryPackage.getGearing(), null, "gearing", null, 1, 1, Motor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMotor_Screwing(), theInterfaceRepositoryPackage.getScrewing(), null, "screwing", null, 1, 1, Motor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMotor_Powersupply(), this.getPowerSupply(), null, "powersupply", null, 1, 1, Motor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(simpleMotorEClass, SimpleMotor.class, "SimpleMotor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mechanicalAssemblyEClass, MechanicalAssembly.class, "MechanicalAssembly", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(regularRampEClass, RegularRamp.class, "RegularRamp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sensorEClass, Sensor.class, "Sensor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSensor_Physicalconnection(), theInterfaceRepositoryPackage.getPhysicalConnection(), null, "physicalconnection", null, 1, 1, Sensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSensor_Signalinterface(), theInterfaceRepositoryPackage.getSignalInterface(), null, "signalinterface", null, 1, 1, Sensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSensor_Powersupply(), this.getPowerSupply(), null, "powersupply", null, 1, 1, Sensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(opticalSensorEClass, OpticalSensor.class, "OpticalSensor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(inductiveSensorEClass, InductiveSensor.class, "InductiveSensor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(presenceSensorEClass, PresenceSensor.class, "PresenceSensor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pressureSensorEClass, PressureSensor.class, "PressureSensor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pipeEClass, Pipe.class, "Pipe", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPipe_Plugs(), theInterfaceRepositoryPackage.getPneumaticSupply(), null, "plugs", null, 0, 1, Pipe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pneumaticPipeEClass, PneumaticPipe.class, "PneumaticPipe", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(compressorEClass, Compressor.class, "Compressor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompressor_Powersupply(), this.getPowerSupply(), null, "powersupply", null, 1, 1, Compressor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCompressor_Pneumaticsupply(), theInterfaceRepositoryPackage.getPneumaticSupply(), null, "pneumaticsupply", null, 0, -1, Compressor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCompressor_Pins(), theInterfaceRepositoryPackage.getSignalInterface(), null, "pins", null, 2, 2, Compressor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCompressor_Screwing(), theInterfaceRepositoryPackage.getScrewing(), null, "screwing", null, 1, 1, Compressor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCompressor_Switch(), theElectronicComponentsPackage.getSwitch(), null, "switch", null, 1, 1, Compressor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cableEClass, Cable.class, "Cable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(powerCableEClass, PowerCable.class, "PowerCable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(cylinderEClass, Cylinder.class, "Cylinder", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCylinder_Pneumaticsupply(), theInterfaceRepositoryPackage.getPneumaticSupply(), null, "pneumaticsupply", null, 1, 1, Cylinder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCylinder_SignalInterface(), theInterfaceRepositoryPackage.getSignalInterface(), null, "SignalInterface", null, 1, 1, Cylinder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(proportionalCylinderEClass, ProportionalCylinder.class, "ProportionalCylinder", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bistableCylinderEClass, BistableCylinder.class, "BistableCylinder", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(rackEClass, Rack.class, "Rack", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRack_Screwing_to_base(), theInterfaceRepositoryPackage.getScrewing(), null, "screwing_to_base", null, 1, 1, Rack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cornerEClass, Corner.class, "Corner", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(valveEClass, Valve.class, "Valve", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getValve_Pneumaticsupply(), theInterfaceRepositoryPackage.getPneumaticSupply(), null, "pneumaticsupply", null, 1, 1, Valve.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getValve_Powersupply(), this.getPowerSupply(), null, "powersupply", null, 1, 1, Valve.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getValve_Signalinterface(), theInterfaceRepositoryPackage.getSignalInterface(), null, "signalinterface", null, 1, 1, Valve.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(regularValveEClass, RegularValve.class, "RegularValve", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tankEClass, Tank.class, "Tank", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTank_Watersupply(), theInterfaceRepositoryPackage.getWaterSupply(), null, "watersupply", null, 1, 1, Tank.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTank_Screwing(), theInterfaceRepositoryPackage.getScrewing(), null, "screwing", null, 1, 1, Tank.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dispenserEClass, Dispenser.class, "Dispenser", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bottleSeperatorEClass, BottleSeperator.class, "BottleSeperator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBottleSeperator_Signalinterface(), theInterfaceRepositoryPackage.getSignalInterface(), null, "signalinterface", null, 1, 1, BottleSeperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBottleSeperator_Pneumaticsupply(), theInterfaceRepositoryPackage.getPneumaticSupply(), null, "pneumaticsupply", null, 1, 1, BottleSeperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBottleSeperator_Powersupply(), this.getPowerSupply(), null, "powersupply", null, 1, 1, BottleSeperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBottleSeperator_Screwing_to_rack(), theInterfaceRepositoryPackage.getScrewing(), null, "screwing_to_rack", null, 1, 1, BottleSeperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(splitterEClass, Splitter.class, "Splitter", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSplitter_Screwing(), theInterfaceRepositoryPackage.getScrewing(), null, "screwing", null, 1, 1, Splitter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(powerSupplyEClass, PowerSupply.class, "PowerSupply", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(conveyorBeltEClass, ConveyorBelt.class, "ConveyorBelt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConveyorBelt_MountedTo(), theStructureRepositoryPackage.getConveyor(), theStructureRepositoryPackage.getConveyor_Belts(), "mountedTo", null, 1, 1, ConveyorBelt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConveyorBelt_Frame(), this.getFrame(), null, "frame", null, 1, 1, ConveyorBelt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConveyorBelt_RubberBand(), theMechanicalComponentsPackage.getRubberBand(), null, "rubberBand", null, 1, 1, ConveyorBelt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(frameEClass, Frame.class, "Frame", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pusherEClass, Pusher.class, "Pusher", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPusher_ComponentsRepository(), this.getComponent(), null, "componentsRepository", null, 1, 1, Pusher.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPusher_FixtureCylinder(), theInterfaceRepositoryPackage.getPhysicalConnection(), null, "fixtureCylinder", null, 1, 1, Pusher.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPusher_MonostableCylinder(), this.getMonostableCylinder(), null, "monostableCylinder", null, 1, 1, Pusher.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPusher_BusBox(), theBusComponentsPackage.getBusBox(), null, "busBox", null, 1, 1, Pusher.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPusher_BusCable(), theBusComponentsPackage.getBusCable(), null, "busCable", null, 1, -1, Pusher.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(turningTableEClass, TurningTable.class, "TurningTable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTurningTable_Rack_for_turningtable(), this.getRack(), null, "rack_for_turningtable", null, 1, 1, TurningTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTurningTable_Table_to_stand_on(), theMechanicalComponentsPackage.getTable(), null, "table_to_stand_on", null, 1, 1, TurningTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTurningTable_Motor_to_drive(), this.getSimpleMotor(), null, "motor_to_drive", null, 1, 1, TurningTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTurningTable_MicroswitchModule(), theModuleRepositoryPackage.getMicroswitchModule(), null, "microswitchModule", null, 1, -1, TurningTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTurningTable_BusSlave(), theBusComponentsPackage.getBusSlave(), null, "busSlave", null, 1, 1, TurningTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTurningTable_BusBox(), theBusComponentsPackage.getBusBox(), null, "busBox", null, 1, 1, TurningTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTurningTable_BusCable(), theBusComponentsPackage.getBusCable(), null, "busCable", null, 1, -1, TurningTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTurningTable_Potentiometer(), theElectronicComponentsPackage.getPotentiometer(), null, "potentiometer", null, 1, -1, TurningTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(controllerEClass, Controller.class, "Controller", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getController_Powersupply(), this.getPowerSupply(), null, "powersupply", null, 1, 1, Controller.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getController_ControllerOf(), theStructureRepositoryPackage.getControlCabinet(), theStructureRepositoryPackage.getControlCabinet_Controller(), "controllerOf", null, 1, 1, Controller.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(logicalWiringEClass, LogicalWiring.class, "LogicalWiring", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLogicalWiring_BusCable(), theBusComponentsPackage.getBusCable(), null, "busCable", null, 1, -1, LogicalWiring.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vacuumSwitchEClass, VacuumSwitch.class, "VacuumSwitch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(reedSwitchEClass, ReedSwitch.class, "ReedSwitch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(powerSplitterEClass, PowerSplitter.class, "PowerSplitter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPowerSplitter_Powersupply(), this.getPowerSupply(), null, "powersupply", null, 1, 1, PowerSplitter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(waterSplitterEClass, WaterSplitter.class, "WaterSplitter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWaterSplitter_Watersupply(), theInterfaceRepositoryPackage.getWaterSupply(), null, "watersupply", null, 1, 1, WaterSplitter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pneumaticSplitterEClass, PneumaticSplitter.class, "PneumaticSplitter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPneumaticSplitter_Pneumaticsupply(), theInterfaceRepositoryPackage.getPneumaticSupply(), null, "pneumaticsupply", null, 0, 1, PneumaticSplitter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cylinderPartEClass, CylinderPart.class, "CylinderPart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(monostableCylinderEClass, MonostableCylinder.class, "MonostableCylinder", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMonostableCylinder_Housing(), theMechanicalComponentsPackage.getHousing(), null, "housing", null, 1, 1, MonostableCylinder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMonostableCylinder_Spring(), theMechanicalComponentsPackage.getReturnSpring(), null, "spring", null, 1, 1, MonostableCylinder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMonostableCylinder_ReedSwitches(), this.getReedSwitch(), null, "reedSwitches", null, 1, -1, MonostableCylinder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMonostableCylinder_CylinderPart(), this.getCylinderPart(), null, "cylinderPart", null, 1, -1, MonostableCylinder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMonostableCylinder_Valve(), this.getRegularValve(), null, "valve", null, 1, -1, MonostableCylinder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMonostableCylinder_BusSlave(), theBusComponentsPackage.getProfibusDPSlave(), null, "busSlave", null, 1, -1, MonostableCylinder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(componentRepositoryEClass, ComponentRepository.class, "ComponentRepository", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponentRepository_AllComponentsInPlant(), this.getComponent(), null, "allComponentsInPlant", null, 0, -1, ComponentRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fixtureEClass, Fixture.class, "Fixture", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
	}

} //ComponentRepositoryPackageImpl
