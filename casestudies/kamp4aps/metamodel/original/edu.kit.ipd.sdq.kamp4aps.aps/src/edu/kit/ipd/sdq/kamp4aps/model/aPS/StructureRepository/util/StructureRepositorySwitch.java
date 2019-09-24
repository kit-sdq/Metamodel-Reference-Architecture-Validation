/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.aPS.StructureRepository.util;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.StructureRepository.*;

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
 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.StructureRepository.StructureRepositoryPackage
 * @generated
 */
public class StructureRepositorySwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static StructureRepositoryPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureRepositorySwitch() {
		if (modelPackage == null) {
			modelPackage = StructureRepositoryPackage.eINSTANCE;
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
			case StructureRepositoryPackage.STRUCTURE: {
				Structure structure = (Structure)theEObject;
				T result = caseStructure(structure);
				if (result == null) result = caseEntity(structure);
				if (result == null) result = caseIdentifier(structure);
				if (result == null) result = caseNamedElement(structure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructureRepositoryPackage.COMMUNICATION_NETWORK: {
				CommunicationNetwork communicationNetwork = (CommunicationNetwork)theEObject;
				T result = caseCommunicationNetwork(communicationNetwork);
				if (result == null) result = caseStructure(communicationNetwork);
				if (result == null) result = caseEntity(communicationNetwork);
				if (result == null) result = caseIdentifier(communicationNetwork);
				if (result == null) result = caseNamedElement(communicationNetwork);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructureRepositoryPackage.POWER_NETWORK: {
				PowerNetwork powerNetwork = (PowerNetwork)theEObject;
				T result = casePowerNetwork(powerNetwork);
				if (result == null) result = caseStructure(powerNetwork);
				if (result == null) result = caseEntity(powerNetwork);
				if (result == null) result = caseIdentifier(powerNetwork);
				if (result == null) result = caseNamedElement(powerNetwork);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructureRepositoryPackage.CONTROL_CABINET: {
				ControlCabinet controlCabinet = (ControlCabinet)theEObject;
				T result = caseControlCabinet(controlCabinet);
				if (result == null) result = caseStructure(controlCabinet);
				if (result == null) result = caseEntity(controlCabinet);
				if (result == null) result = caseIdentifier(controlCabinet);
				if (result == null) result = caseNamedElement(controlCabinet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructureRepositoryPackage.PNEUMATIC_NETWORK: {
				PneumaticNetwork pneumaticNetwork = (PneumaticNetwork)theEObject;
				T result = casePneumaticNetwork(pneumaticNetwork);
				if (result == null) result = caseStructure(pneumaticNetwork);
				if (result == null) result = caseEntity(pneumaticNetwork);
				if (result == null) result = caseIdentifier(pneumaticNetwork);
				if (result == null) result = caseNamedElement(pneumaticNetwork);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructureRepositoryPackage.CONVEYOR: {
				Conveyor conveyor = (Conveyor)theEObject;
				T result = caseConveyor(conveyor);
				if (result == null) result = caseStructure(conveyor);
				if (result == null) result = caseEntity(conveyor);
				if (result == null) result = caseIdentifier(conveyor);
				if (result == null) result = caseNamedElement(conveyor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructureRepositoryPackage.CRANE: {
				Crane crane = (Crane)theEObject;
				T result = caseCrane(crane);
				if (result == null) result = caseStructure(crane);
				if (result == null) result = caseEntity(crane);
				if (result == null) result = caseIdentifier(crane);
				if (result == null) result = caseNamedElement(crane);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructureRepositoryPackage.POWER_WIRING: {
				PowerWiring powerWiring = (PowerWiring)theEObject;
				T result = casePowerWiring(powerWiring);
				if (result == null) result = caseStructure(powerWiring);
				if (result == null) result = caseEntity(powerWiring);
				if (result == null) result = caseIdentifier(powerWiring);
				if (result == null) result = caseNamedElement(powerWiring);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructureRepositoryPackage.LOGICAL_WIRING: {
				LogicalWiring logicalWiring = (LogicalWiring)theEObject;
				T result = caseLogicalWiring(logicalWiring);
				if (result == null) result = caseStructure(logicalWiring);
				if (result == null) result = caseEntity(logicalWiring);
				if (result == null) result = caseIdentifier(logicalWiring);
				if (result == null) result = caseNamedElement(logicalWiring);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructure(Structure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Communication Network</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Communication Network</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommunicationNetwork(CommunicationNetwork object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Power Network</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Power Network</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePowerNetwork(PowerNetwork object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Cabinet</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Cabinet</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControlCabinet(ControlCabinet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pneumatic Network</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pneumatic Network</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePneumaticNetwork(PneumaticNetwork object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conveyor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conveyor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConveyor(Conveyor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Crane</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Crane</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCrane(Crane object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Power Wiring</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Power Wiring</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePowerWiring(PowerWiring object) {
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

} //StructureRepositorySwitch
