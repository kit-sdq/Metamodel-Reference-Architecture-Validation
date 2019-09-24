/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.DeploymentContext;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see edu.kit.ipd.sdq.kamp4aps.model.DeploymentContext.DeploymentContextPackage
 * @generated
 */
public interface DeploymentContextFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DeploymentContextFactory eINSTANCE = edu.kit.ipd.sdq.kamp4aps.model.DeploymentContext.impl.DeploymentContextFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Repository</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Repository</em>'.
	 * @generated
	 */
	DeploymentContextRepository createDeploymentContextRepository();

	/**
	 * Returns a new object of class '<em>Component Correlation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Correlation</em>'.
	 * @generated
	 */
	ComponentCorrelation createComponentCorrelation();

	/**
	 * Returns a new object of class '<em>Variable Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variable Mapping</em>'.
	 * @generated
	 */
	VariableMapping createVariableMapping();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DeploymentContextPackage getDeploymentContextPackage();

} //DeploymentContextFactory
