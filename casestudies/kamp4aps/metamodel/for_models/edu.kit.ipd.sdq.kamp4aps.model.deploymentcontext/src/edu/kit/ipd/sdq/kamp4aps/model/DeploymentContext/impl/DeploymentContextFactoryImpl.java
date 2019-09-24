/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.DeploymentContext.impl;

import edu.kit.ipd.sdq.kamp4aps.model.DeploymentContext.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DeploymentContextFactoryImpl extends EFactoryImpl implements DeploymentContextFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DeploymentContextFactory init() {
		try {
			DeploymentContextFactory theDeploymentContextFactory = (DeploymentContextFactory)EPackage.Registry.INSTANCE.getEFactory(DeploymentContextPackage.eNS_URI);
			if (theDeploymentContextFactory != null) {
				return theDeploymentContextFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DeploymentContextFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeploymentContextFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case DeploymentContextPackage.DEPLOYMENT_CONTEXT_REPOSITORY: return createDeploymentContextRepository();
			case DeploymentContextPackage.COMPONENT_CORRELATION: return createComponentCorrelation();
			case DeploymentContextPackage.VARIABLE_MAPPING: return createVariableMapping();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeploymentContextRepository createDeploymentContextRepository() {
		DeploymentContextRepositoryImpl deploymentContextRepository = new DeploymentContextRepositoryImpl();
		return deploymentContextRepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentCorrelation createComponentCorrelation() {
		ComponentCorrelationImpl componentCorrelation = new ComponentCorrelationImpl();
		return componentCorrelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableMapping createVariableMapping() {
		VariableMappingImpl variableMapping = new VariableMappingImpl();
		return variableMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeploymentContextPackage getDeploymentContextPackage() {
		return (DeploymentContextPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DeploymentContextPackage getPackage() {
		return DeploymentContextPackage.eINSTANCE;
	}

} //DeploymentContextFactoryImpl
