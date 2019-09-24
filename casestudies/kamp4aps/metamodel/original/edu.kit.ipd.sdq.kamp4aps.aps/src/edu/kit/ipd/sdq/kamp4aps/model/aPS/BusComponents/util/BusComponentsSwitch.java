/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.util;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.*;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Cable;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Component;

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
 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.BusComponentsPackage
 * @generated
 */
public class BusComponentsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BusComponentsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusComponentsSwitch() {
		if (modelPackage == null) {
			modelPackage = BusComponentsPackage.eINSTANCE;
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
			case BusComponentsPackage.BUS_BOX: {
				BusBox busBox = (BusBox)theEObject;
				T result = caseBusBox(busBox);
				if (result == null) result = caseComponent(busBox);
				if (result == null) result = caseEntity(busBox);
				if (result == null) result = caseIdentifier(busBox);
				if (result == null) result = caseNamedElement(busBox);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BusComponentsPackage.BUS_MASTER: {
				BusMaster busMaster = (BusMaster)theEObject;
				T result = caseBusMaster(busMaster);
				if (result == null) result = caseComponent(busMaster);
				if (result == null) result = caseEntity(busMaster);
				if (result == null) result = caseIdentifier(busMaster);
				if (result == null) result = caseNamedElement(busMaster);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BusComponentsPackage.BUS_SLAVE: {
				BusSlave busSlave = (BusSlave)theEObject;
				T result = caseBusSlave(busSlave);
				if (result == null) result = caseComponent(busSlave);
				if (result == null) result = caseEntity(busSlave);
				if (result == null) result = caseIdentifier(busSlave);
				if (result == null) result = caseNamedElement(busSlave);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BusComponentsPackage.BUS_CABLE: {
				BusCable busCable = (BusCable)theEObject;
				T result = caseBusCable(busCable);
				if (result == null) result = caseCable(busCable);
				if (result == null) result = caseComponent(busCable);
				if (result == null) result = caseEntity(busCable);
				if (result == null) result = caseIdentifier(busCable);
				if (result == null) result = caseNamedElement(busCable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BusComponentsPackage.PROFIBUS_DP_BOX: {
				ProfibusDPBox profibusDPBox = (ProfibusDPBox)theEObject;
				T result = caseProfibusDPBox(profibusDPBox);
				if (result == null) result = caseBusBox(profibusDPBox);
				if (result == null) result = caseComponent(profibusDPBox);
				if (result == null) result = caseEntity(profibusDPBox);
				if (result == null) result = caseIdentifier(profibusDPBox);
				if (result == null) result = caseNamedElement(profibusDPBox);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BusComponentsPackage.PROFIBUS_DP_MASTER: {
				ProfibusDPMaster profibusDPMaster = (ProfibusDPMaster)theEObject;
				T result = caseProfibusDPMaster(profibusDPMaster);
				if (result == null) result = caseBusMaster(profibusDPMaster);
				if (result == null) result = caseComponent(profibusDPMaster);
				if (result == null) result = caseEntity(profibusDPMaster);
				if (result == null) result = caseIdentifier(profibusDPMaster);
				if (result == null) result = caseNamedElement(profibusDPMaster);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BusComponentsPackage.PROFIBUS_DP_SLAVE: {
				ProfibusDPSlave profibusDPSlave = (ProfibusDPSlave)theEObject;
				T result = caseProfibusDPSlave(profibusDPSlave);
				if (result == null) result = caseBusSlave(profibusDPSlave);
				if (result == null) result = caseComponent(profibusDPSlave);
				if (result == null) result = caseEntity(profibusDPSlave);
				if (result == null) result = caseIdentifier(profibusDPSlave);
				if (result == null) result = caseNamedElement(profibusDPSlave);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BusComponentsPackage.PROFIBUS_DP_CABLE: {
				ProfibusDPCable profibusDPCable = (ProfibusDPCable)theEObject;
				T result = caseProfibusDPCable(profibusDPCable);
				if (result == null) result = caseBusCable(profibusDPCable);
				if (result == null) result = caseCable(profibusDPCable);
				if (result == null) result = caseComponent(profibusDPCable);
				if (result == null) result = caseEntity(profibusDPCable);
				if (result == null) result = caseIdentifier(profibusDPCable);
				if (result == null) result = caseNamedElement(profibusDPCable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BusComponentsPackage.ETHER_CAT_BOX: {
				EtherCATBox etherCATBox = (EtherCATBox)theEObject;
				T result = caseEtherCATBox(etherCATBox);
				if (result == null) result = caseBusBox(etherCATBox);
				if (result == null) result = caseComponent(etherCATBox);
				if (result == null) result = caseEntity(etherCATBox);
				if (result == null) result = caseIdentifier(etherCATBox);
				if (result == null) result = caseNamedElement(etherCATBox);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BusComponentsPackage.ETHER_CAT_MASTER: {
				EtherCATMaster etherCATMaster = (EtherCATMaster)theEObject;
				T result = caseEtherCATMaster(etherCATMaster);
				if (result == null) result = caseBusMaster(etherCATMaster);
				if (result == null) result = caseComponent(etherCATMaster);
				if (result == null) result = caseEntity(etherCATMaster);
				if (result == null) result = caseIdentifier(etherCATMaster);
				if (result == null) result = caseNamedElement(etherCATMaster);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BusComponentsPackage.ETHER_CAT_SLAVE: {
				EtherCATSlave etherCATSlave = (EtherCATSlave)theEObject;
				T result = caseEtherCATSlave(etherCATSlave);
				if (result == null) result = caseBusSlave(etherCATSlave);
				if (result == null) result = caseComponent(etherCATSlave);
				if (result == null) result = caseEntity(etherCATSlave);
				if (result == null) result = caseIdentifier(etherCATSlave);
				if (result == null) result = caseNamedElement(etherCATSlave);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BusComponentsPackage.ETHER_CAT_CABLE: {
				EtherCATCable etherCATCable = (EtherCATCable)theEObject;
				T result = caseEtherCATCable(etherCATCable);
				if (result == null) result = caseBusCable(etherCATCable);
				if (result == null) result = caseCable(etherCATCable);
				if (result == null) result = caseComponent(etherCATCable);
				if (result == null) result = caseEntity(etherCATCable);
				if (result == null) result = caseIdentifier(etherCATCable);
				if (result == null) result = caseNamedElement(etherCATCable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bus Box</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bus Box</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBusBox(BusBox object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bus Master</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bus Master</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBusMaster(BusMaster object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bus Slave</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bus Slave</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBusSlave(BusSlave object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bus Cable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bus Cable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBusCable(BusCable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Profibus DP Box</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Profibus DP Box</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProfibusDPBox(ProfibusDPBox object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Profibus DP Master</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Profibus DP Master</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProfibusDPMaster(ProfibusDPMaster object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Profibus DP Slave</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Profibus DP Slave</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProfibusDPSlave(ProfibusDPSlave object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Profibus DP Cable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Profibus DP Cable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProfibusDPCable(ProfibusDPCable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ether CAT Box</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ether CAT Box</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEtherCATBox(EtherCATBox object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ether CAT Master</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ether CAT Master</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEtherCATMaster(EtherCATMaster object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ether CAT Slave</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ether CAT Slave</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEtherCATSlave(EtherCATSlave object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ether CAT Cable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ether CAT Cable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEtherCATCable(EtherCATCable object) {
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

} //BusComponentsSwitch
