/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.util;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.*;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.ElectronicComponents.ElectronicPart;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.ElectronicComponents.Switch;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.Interface;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.MechanicalComponents.MechanicalPart;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.MechanicalComponents.Ramp;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.Module;

import edu.kit.ipd.sdq.kamp4aps.model.basic.Entity;
import edu.kit.ipd.sdq.kamp4aps.model.basic.Identifier;
import edu.kit.ipd.sdq.kamp4aps.model.basic.NamedElement;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.ComponentRepositoryPackage
 * @generated
 */
public class ComponentRepositoryAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ComponentRepositoryPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentRepositoryAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ComponentRepositoryPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentRepositorySwitch<Adapter> modelSwitch =
		new ComponentRepositorySwitch<Adapter>() {
			@Override
			public Adapter caseComponent(Component object) {
				return createComponentAdapter();
			}
			@Override
			public Adapter casePanel(Panel object) {
				return createPanelAdapter();
			}
			@Override
			public Adapter caseOperationPanel(OperationPanel object) {
				return createOperationPanelAdapter();
			}
			@Override
			public Adapter caseMotor(Motor object) {
				return createMotorAdapter();
			}
			@Override
			public Adapter caseSimpleMotor(SimpleMotor object) {
				return createSimpleMotorAdapter();
			}
			@Override
			public Adapter caseMechanicalAssembly(MechanicalAssembly object) {
				return createMechanicalAssemblyAdapter();
			}
			@Override
			public Adapter caseRegularRamp(RegularRamp object) {
				return createRegularRampAdapter();
			}
			@Override
			public Adapter caseSensor(Sensor object) {
				return createSensorAdapter();
			}
			@Override
			public Adapter caseOpticalSensor(OpticalSensor object) {
				return createOpticalSensorAdapter();
			}
			@Override
			public Adapter caseInductiveSensor(InductiveSensor object) {
				return createInductiveSensorAdapter();
			}
			@Override
			public Adapter casePresenceSensor(PresenceSensor object) {
				return createPresenceSensorAdapter();
			}
			@Override
			public Adapter casePressureSensor(PressureSensor object) {
				return createPressureSensorAdapter();
			}
			@Override
			public Adapter casePipe(Pipe object) {
				return createPipeAdapter();
			}
			@Override
			public Adapter casePneumaticPipe(PneumaticPipe object) {
				return createPneumaticPipeAdapter();
			}
			@Override
			public Adapter caseCompressor(Compressor object) {
				return createCompressorAdapter();
			}
			@Override
			public Adapter caseCable(Cable object) {
				return createCableAdapter();
			}
			@Override
			public Adapter casePowerCable(PowerCable object) {
				return createPowerCableAdapter();
			}
			@Override
			public Adapter caseCylinder(Cylinder object) {
				return createCylinderAdapter();
			}
			@Override
			public Adapter caseProportionalCylinder(ProportionalCylinder object) {
				return createProportionalCylinderAdapter();
			}
			@Override
			public Adapter caseBistableCylinder(BistableCylinder object) {
				return createBistableCylinderAdapter();
			}
			@Override
			public Adapter caseRack(Rack object) {
				return createRackAdapter();
			}
			@Override
			public Adapter caseCorner(Corner object) {
				return createCornerAdapter();
			}
			@Override
			public Adapter caseValve(Valve object) {
				return createValveAdapter();
			}
			@Override
			public Adapter caseRegularValve(RegularValve object) {
				return createRegularValveAdapter();
			}
			@Override
			public Adapter caseTank(Tank object) {
				return createTankAdapter();
			}
			@Override
			public Adapter caseDispenser(Dispenser object) {
				return createDispenserAdapter();
			}
			@Override
			public Adapter caseBottleSeperator(BottleSeperator object) {
				return createBottleSeperatorAdapter();
			}
			@Override
			public Adapter caseSplitter(Splitter object) {
				return createSplitterAdapter();
			}
			@Override
			public Adapter casePowerSupply(PowerSupply object) {
				return createPowerSupplyAdapter();
			}
			@Override
			public Adapter caseConveyorBelt(ConveyorBelt object) {
				return createConveyorBeltAdapter();
			}
			@Override
			public Adapter caseFrame(Frame object) {
				return createFrameAdapter();
			}
			@Override
			public Adapter casePusher(Pusher object) {
				return createPusherAdapter();
			}
			@Override
			public Adapter caseTurningTable(TurningTable object) {
				return createTurningTableAdapter();
			}
			@Override
			public Adapter caseController(Controller object) {
				return createControllerAdapter();
			}
			@Override
			public Adapter caseLogicalWiring(LogicalWiring object) {
				return createLogicalWiringAdapter();
			}
			@Override
			public Adapter caseVacuumSwitch(VacuumSwitch object) {
				return createVacuumSwitchAdapter();
			}
			@Override
			public Adapter caseReedSwitch(ReedSwitch object) {
				return createReedSwitchAdapter();
			}
			@Override
			public Adapter casePowerSplitter(PowerSplitter object) {
				return createPowerSplitterAdapter();
			}
			@Override
			public Adapter caseWaterSplitter(WaterSplitter object) {
				return createWaterSplitterAdapter();
			}
			@Override
			public Adapter casePneumaticSplitter(PneumaticSplitter object) {
				return createPneumaticSplitterAdapter();
			}
			@Override
			public Adapter caseCylinderPart(CylinderPart object) {
				return createCylinderPartAdapter();
			}
			@Override
			public Adapter caseMonostableCylinder(MonostableCylinder object) {
				return createMonostableCylinderAdapter();
			}
			@Override
			public Adapter caseComponentRepository(ComponentRepository object) {
				return createComponentRepositoryAdapter();
			}
			@Override
			public Adapter caseFixture(Fixture object) {
				return createFixtureAdapter();
			}
			@Override
			public Adapter caseIdentifier(Identifier object) {
				return createIdentifierAdapter();
			}
			@Override
			public Adapter caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
			}
			@Override
			public Adapter caseEntity(Entity object) {
				return createEntityAdapter();
			}
			@Override
			public Adapter caseRamp(Ramp object) {
				return createRampAdapter();
			}
			@Override
			public Adapter caseInterface(Interface object) {
				return createInterfaceAdapter();
			}
			@Override
			public Adapter caseModule(Module object) {
				return createModuleAdapter();
			}
			@Override
			public Adapter caseElectronicPart(ElectronicPart object) {
				return createElectronicPartAdapter();
			}
			@Override
			public Adapter caseSwitch(Switch object) {
				return createSwitchAdapter();
			}
			@Override
			public Adapter caseMechanicalPart(MechanicalPart object) {
				return createMechanicalPartAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Component
	 * @generated
	 */
	public Adapter createComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Panel <em>Panel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Panel
	 * @generated
	 */
	public Adapter createPanelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.OperationPanel <em>Operation Panel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.OperationPanel
	 * @generated
	 */
	public Adapter createOperationPanelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Motor <em>Motor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Motor
	 * @generated
	 */
	public Adapter createMotorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.SimpleMotor <em>Simple Motor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.SimpleMotor
	 * @generated
	 */
	public Adapter createSimpleMotorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.MechanicalAssembly <em>Mechanical Assembly</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.MechanicalAssembly
	 * @generated
	 */
	public Adapter createMechanicalAssemblyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.RegularRamp <em>Regular Ramp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.RegularRamp
	 * @generated
	 */
	public Adapter createRegularRampAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Sensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Sensor
	 * @generated
	 */
	public Adapter createSensorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.OpticalSensor <em>Optical Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.OpticalSensor
	 * @generated
	 */
	public Adapter createOpticalSensorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.InductiveSensor <em>Inductive Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.InductiveSensor
	 * @generated
	 */
	public Adapter createInductiveSensorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.PresenceSensor <em>Presence Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.PresenceSensor
	 * @generated
	 */
	public Adapter createPresenceSensorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.PressureSensor <em>Pressure Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.PressureSensor
	 * @generated
	 */
	public Adapter createPressureSensorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Pipe <em>Pipe</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Pipe
	 * @generated
	 */
	public Adapter createPipeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.PneumaticPipe <em>Pneumatic Pipe</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.PneumaticPipe
	 * @generated
	 */
	public Adapter createPneumaticPipeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Compressor <em>Compressor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Compressor
	 * @generated
	 */
	public Adapter createCompressorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Cable <em>Cable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Cable
	 * @generated
	 */
	public Adapter createCableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.PowerCable <em>Power Cable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.PowerCable
	 * @generated
	 */
	public Adapter createPowerCableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Cylinder <em>Cylinder</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Cylinder
	 * @generated
	 */
	public Adapter createCylinderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.ProportionalCylinder <em>Proportional Cylinder</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.ProportionalCylinder
	 * @generated
	 */
	public Adapter createProportionalCylinderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.BistableCylinder <em>Bistable Cylinder</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.BistableCylinder
	 * @generated
	 */
	public Adapter createBistableCylinderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Rack <em>Rack</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Rack
	 * @generated
	 */
	public Adapter createRackAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Corner <em>Corner</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Corner
	 * @generated
	 */
	public Adapter createCornerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Valve <em>Valve</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Valve
	 * @generated
	 */
	public Adapter createValveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.RegularValve <em>Regular Valve</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.RegularValve
	 * @generated
	 */
	public Adapter createRegularValveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Tank <em>Tank</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Tank
	 * @generated
	 */
	public Adapter createTankAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Dispenser <em>Dispenser</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Dispenser
	 * @generated
	 */
	public Adapter createDispenserAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.BottleSeperator <em>Bottle Seperator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.BottleSeperator
	 * @generated
	 */
	public Adapter createBottleSeperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Splitter <em>Splitter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Splitter
	 * @generated
	 */
	public Adapter createSplitterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.PowerSupply <em>Power Supply</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.PowerSupply
	 * @generated
	 */
	public Adapter createPowerSupplyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.ConveyorBelt <em>Conveyor Belt</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.ConveyorBelt
	 * @generated
	 */
	public Adapter createConveyorBeltAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Frame <em>Frame</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Frame
	 * @generated
	 */
	public Adapter createFrameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Pusher <em>Pusher</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Pusher
	 * @generated
	 */
	public Adapter createPusherAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.TurningTable <em>Turning Table</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.TurningTable
	 * @generated
	 */
	public Adapter createTurningTableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Controller <em>Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Controller
	 * @generated
	 */
	public Adapter createControllerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.LogicalWiring <em>Logical Wiring</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.LogicalWiring
	 * @generated
	 */
	public Adapter createLogicalWiringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.VacuumSwitch <em>Vacuum Switch</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.VacuumSwitch
	 * @generated
	 */
	public Adapter createVacuumSwitchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.ReedSwitch <em>Reed Switch</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.ReedSwitch
	 * @generated
	 */
	public Adapter createReedSwitchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.PowerSplitter <em>Power Splitter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.PowerSplitter
	 * @generated
	 */
	public Adapter createPowerSplitterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.WaterSplitter <em>Water Splitter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.WaterSplitter
	 * @generated
	 */
	public Adapter createWaterSplitterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.PneumaticSplitter <em>Pneumatic Splitter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.PneumaticSplitter
	 * @generated
	 */
	public Adapter createPneumaticSplitterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.CylinderPart <em>Cylinder Part</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.CylinderPart
	 * @generated
	 */
	public Adapter createCylinderPartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.MonostableCylinder <em>Monostable Cylinder</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.MonostableCylinder
	 * @generated
	 */
	public Adapter createMonostableCylinderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.ComponentRepository <em>Component Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.ComponentRepository
	 * @generated
	 */
	public Adapter createComponentRepositoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Fixture <em>Fixture</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Fixture
	 * @generated
	 */
	public Adapter createFixtureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4aps.model.basic.Identifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.basic.Identifier
	 * @generated
	 */
	public Adapter createIdentifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4aps.model.basic.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.basic.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4aps.model.basic.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.basic.Entity
	 * @generated
	 */
	public Adapter createEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.MechanicalComponents.Ramp <em>Ramp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.MechanicalComponents.Ramp
	 * @generated
	 */
	public Adapter createRampAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.Interface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.Interface
	 * @generated
	 */
	public Adapter createInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.Module <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.Module
	 * @generated
	 */
	public Adapter createModuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ElectronicComponents.ElectronicPart <em>Electronic Part</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ElectronicComponents.ElectronicPart
	 * @generated
	 */
	public Adapter createElectronicPartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ElectronicComponents.Switch <em>Switch</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ElectronicComponents.Switch
	 * @generated
	 */
	public Adapter createSwitchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.MechanicalComponents.MechanicalPart <em>Mechanical Part</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.MechanicalComponents.MechanicalPart
	 * @generated
	 */
	public Adapter createMechanicalPartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ComponentRepositoryAdapterFactory
