/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.util;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.*;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.ElectronicComponents.ElectronicPart;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.Interface;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.MechanicalComponents.MechanicalPart;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.MechanicalComponents.Ramp;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.Module;

import edu.kit.ipd.sdq.kamp4aps.model.basic.Entity;
import edu.kit.ipd.sdq.kamp4aps.model.basic.Identifier;
import edu.kit.ipd.sdq.kamp4aps.model.basic.NamedElement;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.ComponentRepositoryPackage
 * @generated
 */
public class ComponentRepositorySwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ComponentRepositoryPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentRepositorySwitch() {
		if (modelPackage == null) {
			modelPackage = ComponentRepositoryPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ComponentRepositoryPackage.COMPONENT: {
				Component component = (Component)theEObject;
				T result = caseComponent(component);
				if (result == null) result = caseEntity(component);
				if (result == null) result = caseIdentifier(component);
				if (result == null) result = caseNamedElement(component);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComponentRepositoryPackage.PANEL: {
				Panel panel = (Panel)theEObject;
				T result = casePanel(panel);
				if (result == null) result = caseComponent(panel);
				if (result == null) result = caseEntity(panel);
				if (result == null) result = caseIdentifier(panel);
				if (result == null) result = caseNamedElement(panel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComponentRepositoryPackage.OPERATION_PANEL: {
				OperationPanel operationPanel = (OperationPanel)theEObject;
				T result = caseOperationPanel(operationPanel);
				if (result == null) result = casePanel(operationPanel);
				if (result == null) result = caseComponent(operationPanel);
				if (result == null) result = caseEntity(operationPanel);
				if (result == null) result = caseIdentifier(operationPanel);
				if (result == null) result = caseNamedElement(operationPanel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComponentRepositoryPackage.MOTOR: {
				Motor motor = (Motor)theEObject;
				T result = caseMotor(motor);
				if (result == null) result = caseComponent(motor);
				if (result == null) result = caseEntity(motor);
				if (result == null) result = caseIdentifier(motor);
				if (result == null) result = caseNamedElement(motor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComponentRepositoryPackage.SIMPLE_MOTOR: {
				SimpleMotor simpleMotor = (SimpleMotor)theEObject;
				T result = caseSimpleMotor(simpleMotor);
				if (result == null) result = caseMotor(simpleMotor);
				if (result == null) result = caseComponent(simpleMotor);
				if (result == null) result = caseEntity(simpleMotor);
				if (result == null) result = caseIdentifier(simpleMotor);
				if (result == null) result = caseNamedElement(simpleMotor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComponentRepositoryPackage.MECHANICAL_ASSEMBLY: {
				MechanicalAssembly mechanicalAssembly = (MechanicalAssembly)theEObject;
				T result = caseMechanicalAssembly(mechanicalAssembly);
				if (result == null) result = caseComponent(mechanicalAssembly);
				if (result == null) result = caseEntity(mechanicalAssembly);
				if (result == null) result = caseIdentifier(mechanicalAssembly);
				if (result == null) result = caseNamedElement(mechanicalAssembly);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComponentRepositoryPackage.REGULAR_RAMP: {
				RegularRamp regularRamp = (RegularRamp)theEObject;
				T result = caseRegularRamp(regularRamp);
				if (result == null) result = caseRamp(regularRamp);
				if (result == null) result = caseMechanicalAssembly(regularRamp);
				if (result == null) result = caseComponent(regularRamp);
				if (result == null) result = caseEntity(regularRamp);
				if (result == null) result = caseIdentifier(regularRamp);
				if (result == null) result = caseNamedElement(regularRamp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComponentRepositoryPackage.SENSOR: {
				Sensor sensor = (Sensor)theEObject;
				T result = caseSensor(sensor);
				if (result == null) result = caseComponent(sensor);
				if (result == null) result = caseEntity(sensor);
				if (result == null) result = caseIdentifier(sensor);
				if (result == null) result = caseNamedElement(sensor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComponentRepositoryPackage.OPTICAL_SENSOR: {
				OpticalSensor opticalSensor = (OpticalSensor)theEObject;
				T result = caseOpticalSensor(opticalSensor);
				if (result == null) result = caseSensor(opticalSensor);
				if (result == null) result = caseComponent(opticalSensor);
				if (result == null) result = caseEntity(opticalSensor);
				if (result == null) result = caseIdentifier(opticalSensor);
				if (result == null) result = caseNamedElement(opticalSensor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComponentRepositoryPackage.INDUCTIVE_SENSOR: {
				InductiveSensor inductiveSensor = (InductiveSensor)theEObject;
				T result = caseInductiveSensor(inductiveSensor);
				if (result == null) result = caseSensor(inductiveSensor);
				if (result == null) result = caseComponent(inductiveSensor);
				if (result == null) result = caseEntity(inductiveSensor);
				if (result == null) result = caseIdentifier(inductiveSensor);
				if (result == null) result = caseNamedElement(inductiveSensor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComponentRepositoryPackage.PRESENCE_SENSOR: {
				PresenceSensor presenceSensor = (PresenceSensor)theEObject;
				T result = casePresenceSensor(presenceSensor);
				if (result == null) result = caseSensor(presenceSensor);
				if (result == null) result = caseComponent(presenceSensor);
				if (result == null) result = caseEntity(presenceSensor);
				if (result == null) result = caseIdentifier(presenceSensor);
				if (result == null) result = caseNamedElement(presenceSensor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComponentRepositoryPackage.PRESSURE_SENSOR: {
				PressureSensor pressureSensor = (PressureSensor)theEObject;
				T result = casePressureSensor(pressureSensor);
				if (result == null) result = caseSensor(pressureSensor);
				if (result == null) result = caseComponent(pressureSensor);
				if (result == null) result = caseEntity(pressureSensor);
				if (result == null) result = caseIdentifier(pressureSensor);
				if (result == null) result = caseNamedElement(pressureSensor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComponentRepositoryPackage.PIPE: {
				Pipe pipe = (Pipe)theEObject;
				T result = casePipe(pipe);
				if (result == null) result = caseComponent(pipe);
				if (result == null) result = caseEntity(pipe);
				if (result == null) result = caseIdentifier(pipe);
				if (result == null) result = caseNamedElement(pipe);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComponentRepositoryPackage.PNEUMATIC_PIPE: {
				PneumaticPipe pneumaticPipe = (PneumaticPipe)theEObject;
				T result = casePneumaticPipe(pneumaticPipe);
				if (result == null) result = casePipe(pneumaticPipe);
				if (result == null) result = caseComponent(pneumaticPipe);
				if (result == null) result = caseEntity(pneumaticPipe);
				if (result == null) result = caseIdentifier(pneumaticPipe);
				if (result == null) result = caseNamedElement(pneumaticPipe);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComponentRepositoryPackage.COMPRESSOR: {
				Compressor compressor = (Compressor)theEObject;
				T result = caseCompressor(compressor);
				if (result == null) result = caseComponent(compressor);
				if (result == null) result = caseEntity(compressor);
				if (result == null) result = caseIdentifier(compressor);
				if (result == null) result = caseNamedElement(compressor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComponentRepositoryPackage.CABLE: {
				Cable cable = (Cable)theEObject;
				T result = caseCable(cable);
				if (result == null) result = caseComponent(cable);
				if (result == null) result = caseEntity(cable);
				if (result == null) result = caseIdentifier(cable);
				if (result == null) result = caseNamedElement(cable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComponentRepositoryPackage.POWER_CABLE: {
				PowerCable powerCable = (PowerCable)theEObject;
				T result = casePowerCable(powerCable);
				if (result == null) result = caseCable(powerCable);
				if (result == null) result = caseComponent(powerCable);
				if (result == null) result = caseEntity(powerCable);
				if (result == null) result = caseIdentifier(powerCable);
				if (result == null) result = caseNamedElement(powerCable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComponentRepositoryPackage.CYLINDER: {
				Cylinder cylinder = (Cylinder)theEObject;
				T result = caseCylinder(cylinder);
				if (result == null) result = caseComponent(cylinder);
				if (result == null) result = caseEntity(cylinder);
				if (result == null) result = caseIdentifier(cylinder);
				if (result == null) result = caseNamedElement(cylinder);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComponentRepositoryPackage.PROPORTIONAL_CYLINDER: {
				ProportionalCylinder proportionalCylinder = (ProportionalCylinder)theEObject;
				T result = caseProportionalCylinder(proportionalCylinder);
				if (result == null) result = caseCylinder(proportionalCylinder);
				if (result == null) result = caseComponent(proportionalCylinder);
				if (result == null) result = caseEntity(proportionalCylinder);
				if (result == null) result = caseIdentifier(proportionalCylinder);
				if (result == null) result = caseNamedElement(proportionalCylinder);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComponentRepositoryPackage.BISTABLE_CYLINDER: {
				BistableCylinder bistableCylinder = (BistableCylinder)theEObject;
				T result = caseBistableCylinder(bistableCylinder);
				if (result == null) result = caseCylinder(bistableCylinder);
				if (result == null) result = caseComponent(bistableCylinder);
				if (result == null) result = caseEntity(bistableCylinder);
				if (result == null) result = caseIdentifier(bistableCylinder);
				if (result == null) result = caseNamedElement(bistableCylinder);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComponentRepositoryPackage.RACK: {
				Rack rack = (Rack)theEObject;
				T result = caseRack(rack);
				if (result == null) result = caseComponent(rack);
				if (result == null) result = caseEntity(rack);
				if (result == null) result = caseIdentifier(rack);
				if (result == null) result = caseNamedElement(rack);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComponentRepositoryPackage.CORNER: {
				Corner corner = (Corner)theEObject;
				T result = caseCorner(corner);
				if (result == null) result = caseComponent(corner);
				if (result == null) result = caseEntity(corner);
				if (result == null) result = caseIdentifier(corner);
				if (result == null) result = caseNamedElement(corner);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComponentRepositoryPackage.VALVE: {
				Valve valve = (Valve)theEObject;
				T result = caseValve(valve);
				if (result == null) result = caseComponent(valve);
				if (result == null) result = caseEntity(valve);
				if (result == null) result = caseIdentifier(valve);
				if (result == null) result = caseNamedElement(valve);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComponentRepositoryPackage.REGULAR_VALVE: {
				RegularValve regularValve = (RegularValve)theEObject;
				T result = caseRegularValve(regularValve);
				if (result == null) result = caseValve(regularValve);
				if (result == null) result = caseComponent(regularValve);
				if (result == null) result = caseEntity(regularValve);
				if (result == null) result = caseIdentifier(regularValve);
				if (result == null) result = caseNamedElement(regularValve);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComponentRepositoryPackage.TANK: {
				Tank tank = (Tank)theEObject;
				T result = caseTank(tank);
				if (result == null) result = caseComponent(tank);
				if (result == null) result = caseEntity(tank);
				if (result == null) result = caseIdentifier(tank);
				if (result == null) result = caseNamedElement(tank);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComponentRepositoryPackage.DISPENSER: {
				Dispenser dispenser = (Dispenser)theEObject;
				T result = caseDispenser(dispenser);
				if (result == null) result = caseComponent(dispenser);
				if (result == null) result = caseEntity(dispenser);
				if (result == null) result = caseIdentifier(dispenser);
				if (result == null) result = caseNamedElement(dispenser);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComponentRepositoryPackage.BOTTLE_SEPERATOR: {
				BottleSeperator bottleSeperator = (BottleSeperator)theEObject;
				T result = caseBottleSeperator(bottleSeperator);
				if (result == null) result = caseComponent(bottleSeperator);
				if (result == null) result = caseEntity(bottleSeperator);
				if (result == null) result = caseIdentifier(bottleSeperator);
				if (result == null) result = caseNamedElement(bottleSeperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComponentRepositoryPackage.SPLITTER: {
				Splitter splitter = (Splitter)theEObject;
				T result = caseSplitter(splitter);
				if (result == null) result = caseComponent(splitter);
				if (result == null) result = caseEntity(splitter);
				if (result == null) result = caseIdentifier(splitter);
				if (result == null) result = caseNamedElement(splitter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComponentRepositoryPackage.POWER_SUPPLY: {
				PowerSupply powerSupply = (PowerSupply)theEObject;
				T result = casePowerSupply(powerSupply);
				if (result == null) result = caseComponent(powerSupply);
				if (result == null) result = caseInterface(powerSupply);
				if (result == null) result = caseEntity(powerSupply);
				if (result == null) result = caseIdentifier(powerSupply);
				if (result == null) result = caseNamedElement(powerSupply);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComponentRepositoryPackage.CONVEYOR_BELT: {
				ConveyorBelt conveyorBelt = (ConveyorBelt)theEObject;
				T result = caseConveyorBelt(conveyorBelt);
				if (result == null) result = caseComponent(conveyorBelt);
				if (result == null) result = caseEntity(conveyorBelt);
				if (result == null) result = caseIdentifier(conveyorBelt);
				if (result == null) result = caseNamedElement(conveyorBelt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComponentRepositoryPackage.FRAME: {
				Frame frame = (Frame)theEObject;
				T result = caseFrame(frame);
				if (result == null) result = caseMechanicalAssembly(frame);
				if (result == null) result = caseComponent(frame);
				if (result == null) result = caseEntity(frame);
				if (result == null) result = caseIdentifier(frame);
				if (result == null) result = caseNamedElement(frame);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComponentRepositoryPackage.PUSHER: {
				Pusher pusher = (Pusher)theEObject;
				T result = casePusher(pusher);
				if (result == null) result = caseComponent(pusher);
				if (result == null) result = caseEntity(pusher);
				if (result == null) result = caseIdentifier(pusher);
				if (result == null) result = caseNamedElement(pusher);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComponentRepositoryPackage.TURNING_TABLE: {
				TurningTable turningTable = (TurningTable)theEObject;
				T result = caseTurningTable(turningTable);
				if (result == null) result = caseModule(turningTable);
				if (result == null) result = caseEntity(turningTable);
				if (result == null) result = caseIdentifier(turningTable);
				if (result == null) result = caseNamedElement(turningTable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComponentRepositoryPackage.CONTROLLER: {
				Controller controller = (Controller)theEObject;
				T result = caseController(controller);
				if (result == null) result = caseComponent(controller);
				if (result == null) result = caseEntity(controller);
				if (result == null) result = caseIdentifier(controller);
				if (result == null) result = caseNamedElement(controller);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComponentRepositoryPackage.LOGICAL_WIRING: {
				LogicalWiring logicalWiring = (LogicalWiring)theEObject;
				T result = caseLogicalWiring(logicalWiring);
				if (result == null) result = caseComponent(logicalWiring);
				if (result == null) result = caseEntity(logicalWiring);
				if (result == null) result = caseIdentifier(logicalWiring);
				if (result == null) result = caseNamedElement(logicalWiring);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComponentRepositoryPackage.VACUUM_SWITCH: {
				VacuumSwitch vacuumSwitch = (VacuumSwitch)theEObject;
				T result = caseVacuumSwitch(vacuumSwitch);
				if (result == null) result = caseSwitch(vacuumSwitch);
				if (result == null) result = caseElectronicPart(vacuumSwitch);
				if (result == null) result = caseComponent(vacuumSwitch);
				if (result == null) result = caseEntity(vacuumSwitch);
				if (result == null) result = caseIdentifier(vacuumSwitch);
				if (result == null) result = caseNamedElement(vacuumSwitch);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComponentRepositoryPackage.REED_SWITCH: {
				ReedSwitch reedSwitch = (ReedSwitch)theEObject;
				T result = caseReedSwitch(reedSwitch);
				if (result == null) result = caseSwitch(reedSwitch);
				if (result == null) result = caseElectronicPart(reedSwitch);
				if (result == null) result = caseComponent(reedSwitch);
				if (result == null) result = caseEntity(reedSwitch);
				if (result == null) result = caseIdentifier(reedSwitch);
				if (result == null) result = caseNamedElement(reedSwitch);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComponentRepositoryPackage.POWER_SPLITTER: {
				PowerSplitter powerSplitter = (PowerSplitter)theEObject;
				T result = casePowerSplitter(powerSplitter);
				if (result == null) result = caseSplitter(powerSplitter);
				if (result == null) result = caseComponent(powerSplitter);
				if (result == null) result = caseEntity(powerSplitter);
				if (result == null) result = caseIdentifier(powerSplitter);
				if (result == null) result = caseNamedElement(powerSplitter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComponentRepositoryPackage.WATER_SPLITTER: {
				WaterSplitter waterSplitter = (WaterSplitter)theEObject;
				T result = caseWaterSplitter(waterSplitter);
				if (result == null) result = caseSplitter(waterSplitter);
				if (result == null) result = caseComponent(waterSplitter);
				if (result == null) result = caseEntity(waterSplitter);
				if (result == null) result = caseIdentifier(waterSplitter);
				if (result == null) result = caseNamedElement(waterSplitter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComponentRepositoryPackage.PNEUMATIC_SPLITTER: {
				PneumaticSplitter pneumaticSplitter = (PneumaticSplitter)theEObject;
				T result = casePneumaticSplitter(pneumaticSplitter);
				if (result == null) result = caseSplitter(pneumaticSplitter);
				if (result == null) result = caseComponent(pneumaticSplitter);
				if (result == null) result = caseEntity(pneumaticSplitter);
				if (result == null) result = caseIdentifier(pneumaticSplitter);
				if (result == null) result = caseNamedElement(pneumaticSplitter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComponentRepositoryPackage.CYLINDER_PART: {
				CylinderPart cylinderPart = (CylinderPart)theEObject;
				T result = caseCylinderPart(cylinderPart);
				if (result == null) result = caseMechanicalPart(cylinderPart);
				if (result == null) result = caseComponent(cylinderPart);
				if (result == null) result = caseEntity(cylinderPart);
				if (result == null) result = caseIdentifier(cylinderPart);
				if (result == null) result = caseNamedElement(cylinderPart);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComponentRepositoryPackage.MONOSTABLE_CYLINDER: {
				MonostableCylinder monostableCylinder = (MonostableCylinder)theEObject;
				T result = caseMonostableCylinder(monostableCylinder);
				if (result == null) result = caseCylinder(monostableCylinder);
				if (result == null) result = caseComponent(monostableCylinder);
				if (result == null) result = caseEntity(monostableCylinder);
				if (result == null) result = caseIdentifier(monostableCylinder);
				if (result == null) result = caseNamedElement(monostableCylinder);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComponentRepositoryPackage.COMPONENT_REPOSITORY: {
				ComponentRepository componentRepository = (ComponentRepository)theEObject;
				T result = caseComponentRepository(componentRepository);
				if (result == null) result = caseEntity(componentRepository);
				if (result == null) result = caseIdentifier(componentRepository);
				if (result == null) result = caseNamedElement(componentRepository);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComponentRepositoryPackage.FIXTURE: {
				Fixture fixture = (Fixture)theEObject;
				T result = caseFixture(fixture);
				if (result == null) result = caseComponent(fixture);
				if (result == null) result = caseEntity(fixture);
				if (result == null) result = caseIdentifier(fixture);
				if (result == null) result = caseNamedElement(fixture);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponent(Component object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Panel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Panel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePanel(Panel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation Panel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation Panel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationPanel(OperationPanel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Motor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Motor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMotor(Motor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Motor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Motor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimpleMotor(SimpleMotor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mechanical Assembly</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mechanical Assembly</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMechanicalAssembly(MechanicalAssembly object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Regular Ramp</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Regular Ramp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRegularRamp(RegularRamp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sensor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSensor(Sensor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Optical Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Optical Sensor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOpticalSensor(OpticalSensor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inductive Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inductive Sensor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInductiveSensor(InductiveSensor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Presence Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Presence Sensor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePresenceSensor(PresenceSensor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pressure Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pressure Sensor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePressureSensor(PressureSensor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pipe</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pipe</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePipe(Pipe object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pneumatic Pipe</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pneumatic Pipe</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePneumaticPipe(PneumaticPipe object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Compressor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Compressor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompressor(Compressor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCable(Cable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Power Cable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Power Cable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePowerCable(PowerCable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cylinder</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cylinder</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCylinder(Cylinder object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Proportional Cylinder</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Proportional Cylinder</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProportionalCylinder(ProportionalCylinder object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bistable Cylinder</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bistable Cylinder</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBistableCylinder(BistableCylinder object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rack</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rack</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRack(Rack object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Corner</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Corner</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCorner(Corner object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Valve</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Valve</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValve(Valve object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Regular Valve</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Regular Valve</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRegularValve(RegularValve object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tank</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tank</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTank(Tank object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dispenser</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dispenser</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDispenser(Dispenser object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bottle Seperator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bottle Seperator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBottleSeperator(BottleSeperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Splitter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Splitter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSplitter(Splitter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Power Supply</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Power Supply</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePowerSupply(PowerSupply object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conveyor Belt</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conveyor Belt</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConveyorBelt(ConveyorBelt object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Frame</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Frame</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFrame(Frame object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pusher</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pusher</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePusher(Pusher object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Turning Table</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Turning Table</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTurningTable(TurningTable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Controller</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Controller</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseController(Controller object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Logical Wiring</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Logical Wiring</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLogicalWiring(LogicalWiring object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vacuum Switch</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vacuum Switch</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVacuumSwitch(VacuumSwitch object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reed Switch</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reed Switch</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReedSwitch(ReedSwitch object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Power Splitter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Power Splitter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePowerSplitter(PowerSplitter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Water Splitter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Water Splitter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWaterSplitter(WaterSplitter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pneumatic Splitter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pneumatic Splitter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePneumaticSplitter(PneumaticSplitter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cylinder Part</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cylinder Part</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCylinderPart(CylinderPart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Monostable Cylinder</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Monostable Cylinder</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMonostableCylinder(MonostableCylinder object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Repository</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Repository</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentRepository(ComponentRepository object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fixture</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fixture</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFixture(Fixture object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdentifier(Identifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntity(Entity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ramp</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ramp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRamp(Ramp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterface(Interface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Module</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Module</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModule(Module object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Electronic Part</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Electronic Part</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElectronicPart(ElectronicPart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Switch</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Switch</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSwitch(edu.kit.ipd.sdq.kamp4aps.model.aPS.ElectronicComponents.Switch object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mechanical Part</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mechanical Part</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMechanicalPart(MechanicalPart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ComponentRepositorySwitch
