/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.aPS.MechanicalComponents;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.MechanicalComponents.MechanicalComponentsPackage
 * @generated
 */
public interface MechanicalComponentsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MechanicalComponentsFactory eINSTANCE = edu.kit.ipd.sdq.kamp4aps.model.aPS.MechanicalComponents.impl.MechanicalComponentsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Housing</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Housing</em>'.
	 * @generated
	 */
	Housing createHousing();

	/**
	 * Returns a new object of class '<em>Return Spring</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Return Spring</em>'.
	 * @generated
	 */
	ReturnSpring createReturnSpring();

	/**
	 * Returns a new object of class '<em>Rubber Band</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rubber Band</em>'.
	 * @generated
	 */
	RubberBand createRubberBand();

	/**
	 * Returns a new object of class '<em>Gripper Part</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gripper Part</em>'.
	 * @generated
	 */
	GripperPart createGripperPart();

	/**
	 * Returns a new object of class '<em>Arm</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Arm</em>'.
	 * @generated
	 */
	Arm createArm();

	/**
	 * Returns a new object of class '<em>Table</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Table</em>'.
	 * @generated
	 */
	Table createTable();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MechanicalComponentsPackage getMechanicalComponentsPackage();

} //MechanicalComponentsFactory
