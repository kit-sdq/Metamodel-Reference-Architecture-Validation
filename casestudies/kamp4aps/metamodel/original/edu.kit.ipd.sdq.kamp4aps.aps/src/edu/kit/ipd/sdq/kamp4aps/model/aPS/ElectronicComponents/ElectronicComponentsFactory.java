/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.aPS.ElectronicComponents;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ElectronicComponents.ElectronicComponentsPackage
 * @generated
 */
public interface ElectronicComponentsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ElectronicComponentsFactory eINSTANCE = edu.kit.ipd.sdq.kamp4aps.model.aPS.ElectronicComponents.impl.ElectronicComponentsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Switch</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Switch</em>'.
	 * @generated
	 */
	Switch createSwitch();

	/**
	 * Returns a new object of class '<em>LED</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>LED</em>'.
	 * @generated
	 */
	LED createLED();

	/**
	 * Returns a new object of class '<em>Button</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Button</em>'.
	 * @generated
	 */
	Button createButton();

	/**
	 * Returns a new object of class '<em>Micro Switch</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Micro Switch</em>'.
	 * @generated
	 */
	MicroSwitch createMicroSwitch();

	/**
	 * Returns a new object of class '<em>Potentiometer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Potentiometer</em>'.
	 * @generated
	 */
	Potentiometer createPotentiometer();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ElectronicComponentsPackage getElectronicComponentsPackage();

} //ElectronicComponentsFactory
