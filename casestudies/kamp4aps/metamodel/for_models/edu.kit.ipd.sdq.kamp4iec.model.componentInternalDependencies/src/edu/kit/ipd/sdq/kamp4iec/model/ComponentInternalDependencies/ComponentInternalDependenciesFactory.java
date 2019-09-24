/**
 */
package edu.kit.ipd.sdq.kamp4iec.model.ComponentInternalDependencies;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see edu.kit.ipd.sdq.kamp4iec.model.ComponentInternalDependencies.ComponentInternalDependenciesPackage
 * @generated
 */
public interface ComponentInternalDependenciesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ComponentInternalDependenciesFactory eINSTANCE = edu.kit.ipd.sdq.kamp4iec.model.ComponentInternalDependencies.impl.ComponentInternalDependenciesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Repository</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Repository</em>'.
	 * @generated
	 */
	ComponentInternalDependenciesRepository createComponentInternalDependenciesRepository();

	/**
	 * Returns a new object of class '<em>Functionblock Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Functionblock Dependency</em>'.
	 * @generated
	 */
	FunctionblockDependency createFunctionblockDependency();

	/**
	 * Returns a new object of class '<em>Method Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Method Dependency</em>'.
	 * @generated
	 */
	MethodDependency createMethodDependency();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ComponentInternalDependenciesPackage getComponentInternalDependenciesPackage();

} //ComponentInternalDependenciesFactory
