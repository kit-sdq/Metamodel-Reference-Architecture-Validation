/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.InterfaceRepositoryPackage
 * @generated
 */
public interface InterfaceRepositoryFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	InterfaceRepositoryFactory eINSTANCE = edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.impl.InterfaceRepositoryFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Interface Repository</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interface Repository</em>'.
	 * @generated
	 */
	InterfaceRepository createInterfaceRepository();

	/**
	 * Returns a new object of class '<em>Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interface</em>'.
	 * @generated
	 */
	Interface createInterface();

	/**
	 * Returns a new object of class '<em>Screwing</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Screwing</em>'.
	 * @generated
	 */
	Screwing createScrewing();

	/**
	 * Returns a new object of class '<em>Suspension</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Suspension</em>'.
	 * @generated
	 */
	Suspension createSuspension();

	/**
	 * Returns a new object of class '<em>Gearing</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gearing</em>'.
	 * @generated
	 */
	Gearing createGearing();

	/**
	 * Returns a new object of class '<em>Clamping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Clamping</em>'.
	 * @generated
	 */
	Clamping createClamping();

	/**
	 * Returns a new object of class '<em>Pneumatic Supply</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pneumatic Supply</em>'.
	 * @generated
	 */
	PneumaticSupply createPneumaticSupply();

	/**
	 * Returns a new object of class '<em>Signal Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Signal Interface</em>'.
	 * @generated
	 */
	SignalInterface createSignalInterface();

	/**
	 * Returns a new object of class '<em>Water Supply</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Water Supply</em>'.
	 * @generated
	 */
	WaterSupply createWaterSupply();

	/**
	 * Returns a new object of class '<em>Physical Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Physical Connection</em>'.
	 * @generated
	 */
	PhysicalConnection createPhysicalConnection();

	/**
	 * Returns a new object of class '<em>Transport Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transport Connection</em>'.
	 * @generated
	 */
	TransportConnection createTransportConnection();

	/**
	 * Returns a new object of class '<em>Fixture</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fixture</em>'.
	 * @generated
	 */
	Fixture createFixture();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	InterfaceRepositoryPackage getInterfaceRepositoryPackage();

} //InterfaceRepositoryFactory
