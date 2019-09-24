/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.util;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.*;

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
 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.InterfaceRepositoryPackage
 * @generated
 */
public class InterfaceRepositorySwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static InterfaceRepositoryPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceRepositorySwitch() {
		if (modelPackage == null) {
			modelPackage = InterfaceRepositoryPackage.eINSTANCE;
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
			case InterfaceRepositoryPackage.INTERFACE_REPOSITORY: {
				InterfaceRepository interfaceRepository = (InterfaceRepository)theEObject;
				T result = caseInterfaceRepository(interfaceRepository);
				if (result == null) result = caseEntity(interfaceRepository);
				if (result == null) result = caseIdentifier(interfaceRepository);
				if (result == null) result = caseNamedElement(interfaceRepository);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfaceRepositoryPackage.INTERFACE: {
				Interface interface_ = (Interface)theEObject;
				T result = caseInterface(interface_);
				if (result == null) result = caseEntity(interface_);
				if (result == null) result = caseIdentifier(interface_);
				if (result == null) result = caseNamedElement(interface_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfaceRepositoryPackage.SCREWING: {
				Screwing screwing = (Screwing)theEObject;
				T result = caseScrewing(screwing);
				if (result == null) result = caseInterface(screwing);
				if (result == null) result = caseEntity(screwing);
				if (result == null) result = caseIdentifier(screwing);
				if (result == null) result = caseNamedElement(screwing);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfaceRepositoryPackage.SCREWING_SPLITTER: {
				ScrewingSplitter screwingSplitter = (ScrewingSplitter)theEObject;
				T result = caseScrewingSplitter(screwingSplitter);
				if (result == null) result = caseScrewing(screwingSplitter);
				if (result == null) result = caseInterface(screwingSplitter);
				if (result == null) result = caseEntity(screwingSplitter);
				if (result == null) result = caseIdentifier(screwingSplitter);
				if (result == null) result = caseNamedElement(screwingSplitter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfaceRepositoryPackage.SCREWING_MOTOR: {
				ScrewingMotor screwingMotor = (ScrewingMotor)theEObject;
				T result = caseScrewingMotor(screwingMotor);
				if (result == null) result = caseScrewing(screwingMotor);
				if (result == null) result = caseInterface(screwingMotor);
				if (result == null) result = caseEntity(screwingMotor);
				if (result == null) result = caseIdentifier(screwingMotor);
				if (result == null) result = caseNamedElement(screwingMotor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfaceRepositoryPackage.SCREWING_RACK: {
				ScrewingRack screwingRack = (ScrewingRack)theEObject;
				T result = caseScrewingRack(screwingRack);
				if (result == null) result = caseScrewing(screwingRack);
				if (result == null) result = caseInterface(screwingRack);
				if (result == null) result = caseEntity(screwingRack);
				if (result == null) result = caseIdentifier(screwingRack);
				if (result == null) result = caseNamedElement(screwingRack);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfaceRepositoryPackage.SCREWING_CYLINDER: {
				ScrewingCylinder screwingCylinder = (ScrewingCylinder)theEObject;
				T result = caseScrewingCylinder(screwingCylinder);
				if (result == null) result = caseScrewing(screwingCylinder);
				if (result == null) result = caseInterface(screwingCylinder);
				if (result == null) result = caseEntity(screwingCylinder);
				if (result == null) result = caseIdentifier(screwingCylinder);
				if (result == null) result = caseNamedElement(screwingCylinder);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfaceRepositoryPackage.SCREWING_FIXTURE: {
				ScrewingFixture screwingFixture = (ScrewingFixture)theEObject;
				T result = caseScrewingFixture(screwingFixture);
				if (result == null) result = caseScrewing(screwingFixture);
				if (result == null) result = caseInterface(screwingFixture);
				if (result == null) result = caseEntity(screwingFixture);
				if (result == null) result = caseIdentifier(screwingFixture);
				if (result == null) result = caseNamedElement(screwingFixture);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfaceRepositoryPackage.SCREWING_POTENTIOMETER: {
				ScrewingPotentiometer screwingPotentiometer = (ScrewingPotentiometer)theEObject;
				T result = caseScrewingPotentiometer(screwingPotentiometer);
				if (result == null) result = caseScrewing(screwingPotentiometer);
				if (result == null) result = caseInterface(screwingPotentiometer);
				if (result == null) result = caseEntity(screwingPotentiometer);
				if (result == null) result = caseIdentifier(screwingPotentiometer);
				if (result == null) result = caseNamedElement(screwingPotentiometer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfaceRepositoryPackage.SUSPENSION: {
				Suspension suspension = (Suspension)theEObject;
				T result = caseSuspension(suspension);
				if (result == null) result = caseInterface(suspension);
				if (result == null) result = caseEntity(suspension);
				if (result == null) result = caseIdentifier(suspension);
				if (result == null) result = caseNamedElement(suspension);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfaceRepositoryPackage.SUSPENSION_RACK: {
				SuspensionRack suspensionRack = (SuspensionRack)theEObject;
				T result = caseSuspensionRack(suspensionRack);
				if (result == null) result = caseSuspension(suspensionRack);
				if (result == null) result = caseInterface(suspensionRack);
				if (result == null) result = caseEntity(suspensionRack);
				if (result == null) result = caseIdentifier(suspensionRack);
				if (result == null) result = caseNamedElement(suspensionRack);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfaceRepositoryPackage.SUSPENSION_ARM: {
				SuspensionArm suspensionArm = (SuspensionArm)theEObject;
				T result = caseSuspensionArm(suspensionArm);
				if (result == null) result = caseSuspension(suspensionArm);
				if (result == null) result = caseInterface(suspensionArm);
				if (result == null) result = caseEntity(suspensionArm);
				if (result == null) result = caseIdentifier(suspensionArm);
				if (result == null) result = caseNamedElement(suspensionArm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfaceRepositoryPackage.GEARING: {
				Gearing gearing = (Gearing)theEObject;
				T result = caseGearing(gearing);
				if (result == null) result = caseInterface(gearing);
				if (result == null) result = caseEntity(gearing);
				if (result == null) result = caseIdentifier(gearing);
				if (result == null) result = caseNamedElement(gearing);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfaceRepositoryPackage.CLAMPING: {
				Clamping clamping = (Clamping)theEObject;
				T result = caseClamping(clamping);
				if (result == null) result = caseInterface(clamping);
				if (result == null) result = caseEntity(clamping);
				if (result == null) result = caseIdentifier(clamping);
				if (result == null) result = caseNamedElement(clamping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfaceRepositoryPackage.PNEUMATIC_SUPPLY: {
				PneumaticSupply pneumaticSupply = (PneumaticSupply)theEObject;
				T result = casePneumaticSupply(pneumaticSupply);
				if (result == null) result = caseInterface(pneumaticSupply);
				if (result == null) result = caseEntity(pneumaticSupply);
				if (result == null) result = caseIdentifier(pneumaticSupply);
				if (result == null) result = caseNamedElement(pneumaticSupply);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfaceRepositoryPackage.SIGNAL_INTERFACE: {
				SignalInterface signalInterface = (SignalInterface)theEObject;
				T result = caseSignalInterface(signalInterface);
				if (result == null) result = caseInterface(signalInterface);
				if (result == null) result = caseEntity(signalInterface);
				if (result == null) result = caseIdentifier(signalInterface);
				if (result == null) result = caseNamedElement(signalInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfaceRepositoryPackage.WATER_SUPPLY: {
				WaterSupply waterSupply = (WaterSupply)theEObject;
				T result = caseWaterSupply(waterSupply);
				if (result == null) result = caseInterface(waterSupply);
				if (result == null) result = caseEntity(waterSupply);
				if (result == null) result = caseIdentifier(waterSupply);
				if (result == null) result = caseNamedElement(waterSupply);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfaceRepositoryPackage.PHYSICAL_CONNECTION: {
				PhysicalConnection physicalConnection = (PhysicalConnection)theEObject;
				T result = casePhysicalConnection(physicalConnection);
				if (result == null) result = caseInterface(physicalConnection);
				if (result == null) result = caseEntity(physicalConnection);
				if (result == null) result = caseIdentifier(physicalConnection);
				if (result == null) result = caseNamedElement(physicalConnection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfaceRepositoryPackage.TRANSPORT_CONNECTION: {
				TransportConnection transportConnection = (TransportConnection)theEObject;
				T result = caseTransportConnection(transportConnection);
				if (result == null) result = caseInterface(transportConnection);
				if (result == null) result = caseEntity(transportConnection);
				if (result == null) result = caseIdentifier(transportConnection);
				if (result == null) result = caseNamedElement(transportConnection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfaceRepositoryPackage.FIXTURE: {
				Fixture fixture = (Fixture)theEObject;
				T result = caseFixture(fixture);
				if (result == null) result = caseInterface(fixture);
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
	 * Returns the result of interpreting the object as an instance of '<em>Interface Repository</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface Repository</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterfaceRepository(InterfaceRepository object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Screwing</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Screwing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScrewing(Screwing object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Screwing Splitter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Screwing Splitter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScrewingSplitter(ScrewingSplitter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Screwing Motor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Screwing Motor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScrewingMotor(ScrewingMotor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Screwing Rack</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Screwing Rack</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScrewingRack(ScrewingRack object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Screwing Cylinder</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Screwing Cylinder</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScrewingCylinder(ScrewingCylinder object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Screwing Fixture</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Screwing Fixture</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScrewingFixture(ScrewingFixture object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Screwing Potentiometer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Screwing Potentiometer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScrewingPotentiometer(ScrewingPotentiometer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Suspension</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Suspension</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSuspension(Suspension object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Suspension Rack</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Suspension Rack</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSuspensionRack(SuspensionRack object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Suspension Arm</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Suspension Arm</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSuspensionArm(SuspensionArm object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gearing</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gearing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGearing(Gearing object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clamping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clamping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClamping(Clamping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pneumatic Supply</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pneumatic Supply</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePneumaticSupply(PneumaticSupply object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Signal Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Signal Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSignalInterface(SignalInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Water Supply</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Water Supply</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWaterSupply(WaterSupply object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Physical Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Physical Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePhysicalConnection(PhysicalConnection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transport Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transport Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransportConnection(TransportConnection object) {
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

} //InterfaceRepositorySwitch
