/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.ConveyorBeltModule;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.InductiveSensorModule;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.MicroswitchModule;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.Module;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.ModuleRepository;
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
import edu.kit.ipd.sdq.kamp4aps.model.basic.Entity;
import edu.kit.ipd.sdq.kamp4aps.model.basic.Identifier;
import edu.kit.ipd.sdq.kamp4aps.model.basic.NamedElement;

/**
 * <!-- begin-user-doc --> The <b>Switch</b> for the model's inheritance hierarchy. It supports the
 * call {@link #doSwitch(EObject) doSwitch(object)} to invoke the <code>caseXXX</code> method for
 * each class of the model, starting with the actual class of the object and proceeding up the
 * inheritance hierarchy until a non-null result is returned, which is the result of the switch.
 * <!-- end-user-doc -->
 * 
 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.ModuleRepositoryPackage
 * @generated
 */
public class ModuleRepositorySwitch<T> extends Switch<T> {
    /**
     * The cached model package <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected static ModuleRepositoryPackage modelPackage;

    /**
     * Creates an instance of the switch. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public ModuleRepositorySwitch() {
        if (modelPackage == null) {
            modelPackage = ModuleRepositoryPackage.eINSTANCE;
        }
    }

    /**
     * Checks whether this is a switch for the given package. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @param ePackage
     *            the package in question.
     * @return whether this is a switch for the given package.
     * @generated
     */
    @Override
    protected boolean isSwitchFor(EPackage ePackage) {
        return ePackage == modelPackage;
    }

    /**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result;
     * it yields that result. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
    @Override
    protected T doSwitch(int classifierID, EObject theEObject) {
        switch (classifierID) {
        case ModuleRepositoryPackage.MICROSWITCH_MODULE: {
            MicroswitchModule microswitchModule = (MicroswitchModule) theEObject;
            T result = caseMicroswitchModule(microswitchModule);
            if (result == null)
                result = caseModule(microswitchModule);
            if (result == null)
                result = caseEntity(microswitchModule);
            if (result == null)
                result = caseIdentifier(microswitchModule);
            if (result == null)
                result = caseNamedElement(microswitchModule);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case ModuleRepositoryPackage.POTENTIOMETER_MODULE: {
            PotentiometerModule potentiometerModule = (PotentiometerModule) theEObject;
            T result = casePotentiometerModule(potentiometerModule);
            if (result == null)
                result = caseModule(potentiometerModule);
            if (result == null)
                result = caseEntity(potentiometerModule);
            if (result == null)
                result = caseIdentifier(potentiometerModule);
            if (result == null)
                result = caseNamedElement(potentiometerModule);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case ModuleRepositoryPackage.MODULE_REPOSITORY: {
            ModuleRepository moduleRepository = (ModuleRepository) theEObject;
            T result = caseModuleRepository(moduleRepository);
            if (result == null)
                result = caseEntity(moduleRepository);
            if (result == null)
                result = caseIdentifier(moduleRepository);
            if (result == null)
                result = caseNamedElement(moduleRepository);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case ModuleRepositoryPackage.MODULE: {
            Module module = (Module) theEObject;
            T result = caseModule(module);
            if (result == null)
                result = caseEntity(module);
            if (result == null)
                result = caseIdentifier(module);
            if (result == null)
                result = caseNamedElement(module);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case ModuleRepositoryPackage.RAMP_MODULE: {
            RampModule rampModule = (RampModule) theEObject;
            T result = caseRampModule(rampModule);
            if (result == null)
                result = caseModule(rampModule);
            if (result == null)
                result = caseEntity(rampModule);
            if (result == null)
                result = caseIdentifier(rampModule);
            if (result == null)
                result = caseNamedElement(rampModule);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case ModuleRepositoryPackage.PUSHER_MODULE: {
            PusherModule pusherModule = (PusherModule) theEObject;
            T result = casePusherModule(pusherModule);
            if (result == null)
                result = caseModule(pusherModule);
            if (result == null)
                result = caseEntity(pusherModule);
            if (result == null)
                result = caseIdentifier(pusherModule);
            if (result == null)
                result = caseNamedElement(pusherModule);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case ModuleRepositoryPackage.MOTOR_MODULE: {
            MotorModule motorModule = (MotorModule) theEObject;
            T result = caseMotorModule(motorModule);
            if (result == null)
                result = caseModule(motorModule);
            if (result == null)
                result = caseEntity(motorModule);
            if (result == null)
                result = caseIdentifier(motorModule);
            if (result == null)
                result = caseNamedElement(motorModule);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case ModuleRepositoryPackage.SENSOR_MODULE: {
            SensorModule sensorModule = (SensorModule) theEObject;
            T result = caseSensorModule(sensorModule);
            if (result == null)
                result = caseModule(sensorModule);
            if (result == null)
                result = caseEntity(sensorModule);
            if (result == null)
                result = caseIdentifier(sensorModule);
            if (result == null)
                result = caseNamedElement(sensorModule);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case ModuleRepositoryPackage.OPTICAL_SENSOR_MODULE: {
            OpticalSensorModule opticalSensorModule = (OpticalSensorModule) theEObject;
            T result = caseOpticalSensorModule(opticalSensorModule);
            if (result == null)
                result = caseModule(opticalSensorModule);
            if (result == null)
                result = caseEntity(opticalSensorModule);
            if (result == null)
                result = caseIdentifier(opticalSensorModule);
            if (result == null)
                result = caseNamedElement(opticalSensorModule);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case ModuleRepositoryPackage.INDUCTIVE_SENSOR_MODULE: {
            InductiveSensorModule inductiveSensorModule = (InductiveSensorModule) theEObject;
            T result = caseInductiveSensorModule(inductiveSensorModule);
            if (result == null)
                result = caseModule(inductiveSensorModule);
            if (result == null)
                result = caseEntity(inductiveSensorModule);
            if (result == null)
                result = caseIdentifier(inductiveSensorModule);
            if (result == null)
                result = caseNamedElement(inductiveSensorModule);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case ModuleRepositoryPackage.PRESENCE_SENSOR_MODULE: {
            PresenceSensorModule presenceSensorModule = (PresenceSensorModule) theEObject;
            T result = casePresenceSensorModule(presenceSensorModule);
            if (result == null)
                result = caseModule(presenceSensorModule);
            if (result == null)
                result = caseEntity(presenceSensorModule);
            if (result == null)
                result = caseIdentifier(presenceSensorModule);
            if (result == null)
                result = caseNamedElement(presenceSensorModule);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case ModuleRepositoryPackage.PRESSURE_SENSOR_MODULE: {
            PressureSensorModule pressureSensorModule = (PressureSensorModule) theEObject;
            T result = casePressureSensorModule(pressureSensorModule);
            if (result == null)
                result = caseModule(pressureSensorModule);
            if (result == null)
                result = caseEntity(pressureSensorModule);
            if (result == null)
                result = caseIdentifier(pressureSensorModule);
            if (result == null)
                result = caseNamedElement(pressureSensorModule);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case ModuleRepositoryPackage.CONVEYOR_BELT_MODULE: {
            ConveyorBeltModule conveyorBeltModule = (ConveyorBeltModule) theEObject;
            T result = caseConveyorBeltModule(conveyorBeltModule);
            if (result == null)
                result = caseModule(conveyorBeltModule);
            if (result == null)
                result = caseEntity(conveyorBeltModule);
            if (result == null)
                result = caseIdentifier(conveyorBeltModule);
            if (result == null)
                result = caseNamedElement(conveyorBeltModule);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case ModuleRepositoryPackage.VACUUM_GRIPPER_MODULE: {
            VacuumGripperModule vacuumGripperModule = (VacuumGripperModule) theEObject;
            T result = caseVacuumGripperModule(vacuumGripperModule);
            if (result == null)
                result = caseModule(vacuumGripperModule);
            if (result == null)
                result = caseEntity(vacuumGripperModule);
            if (result == null)
                result = caseIdentifier(vacuumGripperModule);
            if (result == null)
                result = caseNamedElement(vacuumGripperModule);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case ModuleRepositoryPackage.MONOSTABLE_CYLINDER_MODULE: {
            MonostableCylinderModule monostableCylinderModule = (MonostableCylinderModule) theEObject;
            T result = caseMonostableCylinderModule(monostableCylinderModule);
            if (result == null)
                result = caseModule(monostableCylinderModule);
            if (result == null)
                result = caseEntity(monostableCylinderModule);
            if (result == null)
                result = caseIdentifier(monostableCylinderModule);
            if (result == null)
                result = caseNamedElement(monostableCylinderModule);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        default:
            return defaultCase(theEObject);
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Microswitch
     * Module</em>'. <!-- begin-user-doc --> This implementation returns null; returning a non-null
     * result will terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Microswitch
     *         Module</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMicroswitchModule(MicroswitchModule object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Potentiometer
     * Module</em>'. <!-- begin-user-doc --> This implementation returns null; returning a non-null
     * result will terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Potentiometer
     *         Module</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePotentiometerModule(PotentiometerModule object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Module Repository</em>'.
     * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Module Repository</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseModuleRepository(ModuleRepository object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Module</em>'. <!--
     * begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Module</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseModule(Module object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Ramp Module</em>'. <!--
     * begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Ramp Module</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRampModule(RampModule object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Pusher Module</em>'.
     * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Pusher Module</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePusherModule(PusherModule object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Motor Module</em>'. <!--
     * begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Motor Module</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMotorModule(MotorModule object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Sensor Module</em>'.
     * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Sensor Module</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSensorModule(SensorModule object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Optical Sensor
     * Module</em>'. <!-- begin-user-doc --> This implementation returns null; returning a non-null
     * result will terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Optical Sensor
     *         Module</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseOpticalSensorModule(OpticalSensorModule object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Inductive Sensor
     * Module</em>'. <!-- begin-user-doc --> This implementation returns null; returning a non-null
     * result will terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Inductive Sensor
     *         Module</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseInductiveSensorModule(InductiveSensorModule object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Presence Sensor
     * Module</em>'. <!-- begin-user-doc --> This implementation returns null; returning a non-null
     * result will terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Presence Sensor
     *         Module</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePresenceSensorModule(PresenceSensorModule object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Pressure Sensor
     * Module</em>'. <!-- begin-user-doc --> This implementation returns null; returning a non-null
     * result will terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Pressure Sensor
     *         Module</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePressureSensorModule(PressureSensorModule object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Conveyor Belt
     * Module</em>'. <!-- begin-user-doc --> This implementation returns null; returning a non-null
     * result will terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Conveyor Belt
     *         Module</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseConveyorBeltModule(ConveyorBeltModule object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Vacuum Gripper
     * Module</em>'. <!-- begin-user-doc --> This implementation returns null; returning a non-null
     * result will terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Vacuum Gripper
     *         Module</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseVacuumGripperModule(VacuumGripperModule object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Monostable Cylinder
     * Module</em>'. <!-- begin-user-doc --> This implementation returns null; returning a non-null
     * result will terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Monostable Cylinder
     *         Module</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMonostableCylinderModule(MonostableCylinderModule object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Identifier</em>'. <!--
     * begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Identifier</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseIdentifier(Identifier object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
     * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseNamedElement(NamedElement object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Entity</em>'. <!--
     * begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Entity</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEntity(Entity object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>EObject</em>'. <!--
     * begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch, but this is the last case anyway. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject)
     * @generated
     */
    @Override
    public T defaultCase(EObject object) {
        return null;
    }

} //ModuleRepositorySwitch
