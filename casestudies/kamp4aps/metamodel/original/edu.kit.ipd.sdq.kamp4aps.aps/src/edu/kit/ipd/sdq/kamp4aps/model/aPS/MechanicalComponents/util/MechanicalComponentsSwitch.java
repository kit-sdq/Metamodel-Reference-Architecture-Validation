/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.aPS.MechanicalComponents.util;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Component;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.MechanicalAssembly;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.MechanicalComponents.*;

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
 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.MechanicalComponents.MechanicalComponentsPackage
 * @generated
 */
public class MechanicalComponentsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MechanicalComponentsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MechanicalComponentsSwitch() {
		if (modelPackage == null) {
			modelPackage = MechanicalComponentsPackage.eINSTANCE;
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
			case MechanicalComponentsPackage.MECHANICAL_PART: {
				MechanicalPart mechanicalPart = (MechanicalPart)theEObject;
				T result = caseMechanicalPart(mechanicalPart);
				if (result == null) result = caseComponent(mechanicalPart);
				if (result == null) result = caseEntity(mechanicalPart);
				if (result == null) result = caseIdentifier(mechanicalPart);
				if (result == null) result = caseNamedElement(mechanicalPart);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MechanicalComponentsPackage.PUSHHEAD: {
				Pushhead pushhead = (Pushhead)theEObject;
				T result = casePushhead(pushhead);
				if (result == null) result = caseMechanicalPart(pushhead);
				if (result == null) result = caseComponent(pushhead);
				if (result == null) result = caseEntity(pushhead);
				if (result == null) result = caseIdentifier(pushhead);
				if (result == null) result = caseNamedElement(pushhead);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MechanicalComponentsPackage.HOUSING: {
				Housing housing = (Housing)theEObject;
				T result = caseHousing(housing);
				if (result == null) result = caseMechanicalPart(housing);
				if (result == null) result = caseComponent(housing);
				if (result == null) result = caseEntity(housing);
				if (result == null) result = caseIdentifier(housing);
				if (result == null) result = caseNamedElement(housing);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MechanicalComponentsPackage.RETURN_SPRING: {
				ReturnSpring returnSpring = (ReturnSpring)theEObject;
				T result = caseReturnSpring(returnSpring);
				if (result == null) result = caseMechanicalPart(returnSpring);
				if (result == null) result = caseComponent(returnSpring);
				if (result == null) result = caseEntity(returnSpring);
				if (result == null) result = caseIdentifier(returnSpring);
				if (result == null) result = caseNamedElement(returnSpring);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MechanicalComponentsPackage.RUBBER_BAND: {
				RubberBand rubberBand = (RubberBand)theEObject;
				T result = caseRubberBand(rubberBand);
				if (result == null) result = caseMechanicalPart(rubberBand);
				if (result == null) result = caseComponent(rubberBand);
				if (result == null) result = caseEntity(rubberBand);
				if (result == null) result = caseIdentifier(rubberBand);
				if (result == null) result = caseNamedElement(rubberBand);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MechanicalComponentsPackage.GRIPPER_PART: {
				GripperPart gripperPart = (GripperPart)theEObject;
				T result = caseGripperPart(gripperPart);
				if (result == null) result = caseMechanicalAssembly(gripperPart);
				if (result == null) result = caseComponent(gripperPart);
				if (result == null) result = caseEntity(gripperPart);
				if (result == null) result = caseIdentifier(gripperPart);
				if (result == null) result = caseNamedElement(gripperPart);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MechanicalComponentsPackage.ARM: {
				Arm arm = (Arm)theEObject;
				T result = caseArm(arm);
				if (result == null) result = caseMechanicalAssembly(arm);
				if (result == null) result = caseComponent(arm);
				if (result == null) result = caseEntity(arm);
				if (result == null) result = caseIdentifier(arm);
				if (result == null) result = caseNamedElement(arm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MechanicalComponentsPackage.RAMP: {
				Ramp ramp = (Ramp)theEObject;
				T result = caseRamp(ramp);
				if (result == null) result = caseMechanicalAssembly(ramp);
				if (result == null) result = caseComponent(ramp);
				if (result == null) result = caseEntity(ramp);
				if (result == null) result = caseIdentifier(ramp);
				if (result == null) result = caseNamedElement(ramp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MechanicalComponentsPackage.TABLE: {
				Table table = (Table)theEObject;
				T result = caseTable(table);
				if (result == null) result = caseMechanicalAssembly(table);
				if (result == null) result = caseComponent(table);
				if (result == null) result = caseEntity(table);
				if (result == null) result = caseIdentifier(table);
				if (result == null) result = caseNamedElement(table);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
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
	 * Returns the result of interpreting the object as an instance of '<em>Pushhead</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pushhead</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePushhead(Pushhead object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Housing</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Housing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHousing(Housing object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Return Spring</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Return Spring</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReturnSpring(ReturnSpring object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rubber Band</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rubber Band</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRubberBand(RubberBand object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gripper Part</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gripper Part</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGripperPart(GripperPart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arm</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arm</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArm(Arm object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Table</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Table</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTable(Table object) {
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

} //MechanicalComponentsSwitch
