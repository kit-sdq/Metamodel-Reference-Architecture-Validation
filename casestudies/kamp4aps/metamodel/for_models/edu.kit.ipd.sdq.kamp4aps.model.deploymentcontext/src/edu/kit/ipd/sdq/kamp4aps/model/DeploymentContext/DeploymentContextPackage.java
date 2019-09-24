/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.DeploymentContext;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see edu.kit.ipd.sdq.kamp4aps.model.DeploymentContext.DeploymentContextFactory
 * @model kind="package"
 * @generated
 */
public interface DeploymentContextPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "DeploymentContext";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://sdq.ipd.kit.edu/KAPS_DeploymentContext/0.1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "DeploymentContext";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DeploymentContextPackage eINSTANCE = edu.kit.ipd.sdq.kamp4aps.model.DeploymentContext.impl.DeploymentContextPackageImpl.init();

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps.model.DeploymentContext.impl.DeploymentContextRepositoryImpl <em>Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps.model.DeploymentContext.impl.DeploymentContextRepositoryImpl
	 * @see edu.kit.ipd.sdq.kamp4aps.model.DeploymentContext.impl.DeploymentContextPackageImpl#getDeploymentContextRepository()
	 * @generated
	 */
	int DEPLOYMENT_CONTEXT_REPOSITORY = 0;

	/**
	 * The feature id for the '<em><b>Component Correlation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_CONTEXT_REPOSITORY__COMPONENT_CORRELATION = 0;

	/**
	 * The number of structural features of the '<em>Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_CONTEXT_REPOSITORY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_CONTEXT_REPOSITORY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps.model.DeploymentContext.impl.ComponentCorrelationImpl <em>Component Correlation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps.model.DeploymentContext.impl.ComponentCorrelationImpl
	 * @see edu.kit.ipd.sdq.kamp4aps.model.DeploymentContext.impl.DeploymentContextPackageImpl#getComponentCorrelation()
	 * @generated
	 */
	int COMPONENT_CORRELATION = 1;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_CORRELATION__PARENT = 0;

	/**
	 * The feature id for the '<em><b>Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_CORRELATION__COMPONENT = 1;

	/**
	 * The feature id for the '<em><b>Program</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_CORRELATION__PROGRAM = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_CORRELATION__NAME = 3;

	/**
	 * The feature id for the '<em><b>Variable Mapping</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_CORRELATION__VARIABLE_MAPPING = 4;

	/**
	 * The number of structural features of the '<em>Component Correlation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_CORRELATION_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Component Correlation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_CORRELATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps.model.DeploymentContext.impl.VariableMappingImpl <em>Variable Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps.model.DeploymentContext.impl.VariableMappingImpl
	 * @see edu.kit.ipd.sdq.kamp4aps.model.DeploymentContext.impl.DeploymentContextPackageImpl#getVariableMapping()
	 * @generated
	 */
	int VARIABLE_MAPPING = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_MAPPING__NAME = 0;

	/**
	 * The feature id for the '<em><b>Program Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_MAPPING__PROGRAM_VARIABLE = 1;

	/**
	 * The feature id for the '<em><b>Interface Declaration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_MAPPING__INTERFACE_DECLARATION = 2;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_MAPPING__PARENT = 3;

	/**
	 * The number of structural features of the '<em>Variable Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_MAPPING_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Variable Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_MAPPING_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps.model.DeploymentContext.DeploymentContextRepository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Repository</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.DeploymentContext.DeploymentContextRepository
	 * @generated
	 */
	EClass getDeploymentContextRepository();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4aps.model.DeploymentContext.DeploymentContextRepository#getComponentCorrelation <em>Component Correlation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Component Correlation</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.DeploymentContext.DeploymentContextRepository#getComponentCorrelation()
	 * @see #getDeploymentContextRepository()
	 * @generated
	 */
	EReference getDeploymentContextRepository_ComponentCorrelation();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps.model.DeploymentContext.ComponentCorrelation <em>Component Correlation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Correlation</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.DeploymentContext.ComponentCorrelation
	 * @generated
	 */
	EClass getComponentCorrelation();

	/**
	 * Returns the meta object for the container reference '{@link edu.kit.ipd.sdq.kamp4aps.model.DeploymentContext.ComponentCorrelation#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.DeploymentContext.ComponentCorrelation#getParent()
	 * @see #getComponentCorrelation()
	 * @generated
	 */
	EReference getComponentCorrelation_Parent();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.kamp4aps.model.DeploymentContext.ComponentCorrelation#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Component</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.DeploymentContext.ComponentCorrelation#getComponent()
	 * @see #getComponentCorrelation()
	 * @generated
	 */
	EReference getComponentCorrelation_Component();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.kamp4aps.model.DeploymentContext.ComponentCorrelation#getProgram <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Program</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.DeploymentContext.ComponentCorrelation#getProgram()
	 * @see #getComponentCorrelation()
	 * @generated
	 */
	EReference getComponentCorrelation_Program();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.kamp4aps.model.DeploymentContext.ComponentCorrelation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.DeploymentContext.ComponentCorrelation#getName()
	 * @see #getComponentCorrelation()
	 * @generated
	 */
	EAttribute getComponentCorrelation_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4aps.model.DeploymentContext.ComponentCorrelation#getVariableMapping <em>Variable Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variable Mapping</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.DeploymentContext.ComponentCorrelation#getVariableMapping()
	 * @see #getComponentCorrelation()
	 * @generated
	 */
	EReference getComponentCorrelation_VariableMapping();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps.model.DeploymentContext.VariableMapping <em>Variable Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Mapping</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.DeploymentContext.VariableMapping
	 * @generated
	 */
	EClass getVariableMapping();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.kamp4aps.model.DeploymentContext.VariableMapping#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.DeploymentContext.VariableMapping#getName()
	 * @see #getVariableMapping()
	 * @generated
	 */
	EAttribute getVariableMapping_Name();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.kamp4aps.model.DeploymentContext.VariableMapping#getProgramVariable <em>Program Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Program Variable</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.DeploymentContext.VariableMapping#getProgramVariable()
	 * @see #getVariableMapping()
	 * @generated
	 */
	EReference getVariableMapping_ProgramVariable();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.kamp4aps.model.DeploymentContext.VariableMapping#getInterfaceDeclaration <em>Interface Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Interface Declaration</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.DeploymentContext.VariableMapping#getInterfaceDeclaration()
	 * @see #getVariableMapping()
	 * @generated
	 */
	EReference getVariableMapping_InterfaceDeclaration();

	/**
	 * Returns the meta object for the container reference '{@link edu.kit.ipd.sdq.kamp4aps.model.DeploymentContext.VariableMapping#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.DeploymentContext.VariableMapping#getParent()
	 * @see #getVariableMapping()
	 * @generated
	 */
	EReference getVariableMapping_Parent();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DeploymentContextFactory getDeploymentContextFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps.model.DeploymentContext.impl.DeploymentContextRepositoryImpl <em>Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps.model.DeploymentContext.impl.DeploymentContextRepositoryImpl
		 * @see edu.kit.ipd.sdq.kamp4aps.model.DeploymentContext.impl.DeploymentContextPackageImpl#getDeploymentContextRepository()
		 * @generated
		 */
		EClass DEPLOYMENT_CONTEXT_REPOSITORY = eINSTANCE.getDeploymentContextRepository();

		/**
		 * The meta object literal for the '<em><b>Component Correlation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPLOYMENT_CONTEXT_REPOSITORY__COMPONENT_CORRELATION = eINSTANCE.getDeploymentContextRepository_ComponentCorrelation();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps.model.DeploymentContext.impl.ComponentCorrelationImpl <em>Component Correlation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps.model.DeploymentContext.impl.ComponentCorrelationImpl
		 * @see edu.kit.ipd.sdq.kamp4aps.model.DeploymentContext.impl.DeploymentContextPackageImpl#getComponentCorrelation()
		 * @generated
		 */
		EClass COMPONENT_CORRELATION = eINSTANCE.getComponentCorrelation();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_CORRELATION__PARENT = eINSTANCE.getComponentCorrelation_Parent();

		/**
		 * The meta object literal for the '<em><b>Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_CORRELATION__COMPONENT = eINSTANCE.getComponentCorrelation_Component();

		/**
		 * The meta object literal for the '<em><b>Program</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_CORRELATION__PROGRAM = eINSTANCE.getComponentCorrelation_Program();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_CORRELATION__NAME = eINSTANCE.getComponentCorrelation_Name();

		/**
		 * The meta object literal for the '<em><b>Variable Mapping</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_CORRELATION__VARIABLE_MAPPING = eINSTANCE.getComponentCorrelation_VariableMapping();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps.model.DeploymentContext.impl.VariableMappingImpl <em>Variable Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps.model.DeploymentContext.impl.VariableMappingImpl
		 * @see edu.kit.ipd.sdq.kamp4aps.model.DeploymentContext.impl.DeploymentContextPackageImpl#getVariableMapping()
		 * @generated
		 */
		EClass VARIABLE_MAPPING = eINSTANCE.getVariableMapping();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE_MAPPING__NAME = eINSTANCE.getVariableMapping_Name();

		/**
		 * The meta object literal for the '<em><b>Program Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_MAPPING__PROGRAM_VARIABLE = eINSTANCE.getVariableMapping_ProgramVariable();

		/**
		 * The meta object literal for the '<em><b>Interface Declaration</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_MAPPING__INTERFACE_DECLARATION = eINSTANCE.getVariableMapping_InterfaceDeclaration();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_MAPPING__PARENT = eINSTANCE.getVariableMapping_Parent();

	}

} //DeploymentContextPackage
