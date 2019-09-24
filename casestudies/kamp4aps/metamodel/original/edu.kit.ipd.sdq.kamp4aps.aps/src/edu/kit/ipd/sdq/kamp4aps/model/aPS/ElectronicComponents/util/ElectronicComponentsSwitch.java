/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.aPS.ElectronicComponents.util;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Component;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.ElectronicComponents.*;

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
 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ElectronicComponents.ElectronicComponentsPackage
 * @generated
 */
public class ElectronicComponentsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ElectronicComponentsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElectronicComponentsSwitch() {
		if (modelPackage == null) {
			modelPackage = ElectronicComponentsPackage.eINSTANCE;
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
			case ElectronicComponentsPackage.ELECTRONIC_PART: {
				ElectronicPart electronicPart = (ElectronicPart)theEObject;
				T result = caseElectronicPart(electronicPart);
				if (result == null) result = caseComponent(electronicPart);
				if (result == null) result = caseEntity(electronicPart);
				if (result == null) result = caseIdentifier(electronicPart);
				if (result == null) result = caseNamedElement(electronicPart);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ElectronicComponentsPackage.SWITCH: {
				edu.kit.ipd.sdq.kamp4aps.model.aPS.ElectronicComponents.Switch switch_ = (edu.kit.ipd.sdq.kamp4aps.model.aPS.ElectronicComponents.Switch)theEObject;
				T result = caseSwitch(switch_);
				if (result == null) result = caseElectronicPart(switch_);
				if (result == null) result = caseComponent(switch_);
				if (result == null) result = caseEntity(switch_);
				if (result == null) result = caseIdentifier(switch_);
				if (result == null) result = caseNamedElement(switch_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ElectronicComponentsPackage.LED: {
				LED led = (LED)theEObject;
				T result = caseLED(led);
				if (result == null) result = caseElectronicPart(led);
				if (result == null) result = caseComponent(led);
				if (result == null) result = caseEntity(led);
				if (result == null) result = caseIdentifier(led);
				if (result == null) result = caseNamedElement(led);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ElectronicComponentsPackage.BUTTON: {
				Button button = (Button)theEObject;
				T result = caseButton(button);
				if (result == null) result = caseElectronicPart(button);
				if (result == null) result = caseComponent(button);
				if (result == null) result = caseEntity(button);
				if (result == null) result = caseIdentifier(button);
				if (result == null) result = caseNamedElement(button);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ElectronicComponentsPackage.MICRO_SWITCH: {
				MicroSwitch microSwitch = (MicroSwitch)theEObject;
				T result = caseMicroSwitch(microSwitch);
				if (result == null) result = caseSwitch(microSwitch);
				if (result == null) result = caseElectronicPart(microSwitch);
				if (result == null) result = caseComponent(microSwitch);
				if (result == null) result = caseEntity(microSwitch);
				if (result == null) result = caseIdentifier(microSwitch);
				if (result == null) result = caseNamedElement(microSwitch);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ElectronicComponentsPackage.POTENTIOMETER: {
				Potentiometer potentiometer = (Potentiometer)theEObject;
				T result = casePotentiometer(potentiometer);
				if (result == null) result = caseElectronicPart(potentiometer);
				if (result == null) result = caseComponent(potentiometer);
				if (result == null) result = caseEntity(potentiometer);
				if (result == null) result = caseIdentifier(potentiometer);
				if (result == null) result = caseNamedElement(potentiometer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
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
	 * Returns the result of interpreting the object as an instance of '<em>LED</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>LED</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLED(LED object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Button</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Button</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseButton(Button object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Micro Switch</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Micro Switch</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMicroSwitch(MicroSwitch object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Potentiometer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Potentiometer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePotentiometer(Potentiometer object) {
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

} //ElectronicComponentsSwitch
