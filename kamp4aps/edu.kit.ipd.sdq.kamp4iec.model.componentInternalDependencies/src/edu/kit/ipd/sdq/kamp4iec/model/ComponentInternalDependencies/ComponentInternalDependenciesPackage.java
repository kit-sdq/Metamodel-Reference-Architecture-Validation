/**
 */
package edu.kit.ipd.sdq.kamp4iec.model.ComponentInternalDependencies;

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
 * @see edu.kit.ipd.sdq.kamp4iec.model.ComponentInternalDependencies.ComponentInternalDependenciesFactory
 * @model kind="package"
 * @generated
 */
public interface ComponentInternalDependenciesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ComponentInternalDependencies";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://sdq.ipd.kit.edu/ComponentInternalDependencies";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ComponentInternalDependencies";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ComponentInternalDependenciesPackage eINSTANCE = edu.kit.ipd.sdq.kamp4iec.model.ComponentInternalDependencies.impl.ComponentInternalDependenciesPackageImpl.init();

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4iec.model.ComponentInternalDependencies.impl.ComponentInternalDependenciesRepositoryImpl <em>Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4iec.model.ComponentInternalDependencies.impl.ComponentInternalDependenciesRepositoryImpl
	 * @see edu.kit.ipd.sdq.kamp4iec.model.ComponentInternalDependencies.impl.ComponentInternalDependenciesPackageImpl#getComponentInternalDependenciesRepository()
	 * @generated
	 */
	int COMPONENT_INTERNAL_DEPENDENCIES_REPOSITORY = 0;

	/**
	 * The feature id for the '<em><b>Has Functionblock Dependency</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INTERNAL_DEPENDENCIES_REPOSITORY__HAS_FUNCTIONBLOCK_DEPENDENCY = 0;

	/**
	 * The number of structural features of the '<em>Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INTERNAL_DEPENDENCIES_REPOSITORY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INTERNAL_DEPENDENCIES_REPOSITORY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4iec.model.ComponentInternalDependencies.impl.FunctionblockDependencyImpl <em>Functionblock Dependency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4iec.model.ComponentInternalDependencies.impl.FunctionblockDependencyImpl
	 * @see edu.kit.ipd.sdq.kamp4iec.model.ComponentInternalDependencies.impl.ComponentInternalDependenciesPackageImpl#getFunctionblockDependency()
	 * @generated
	 */
	int FUNCTIONBLOCK_DEPENDENCY = 1;

	/**
	 * The feature id for the '<em><b>Provided Function Block</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONBLOCK_DEPENDENCY__PROVIDED_FUNCTION_BLOCK = 0;

	/**
	 * The feature id for the '<em><b>Required Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONBLOCK_DEPENDENCY__REQUIRED_RESOURCE = 1;

	/**
	 * The feature id for the '<em><b>Has Method Dependency</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONBLOCK_DEPENDENCY__HAS_METHOD_DEPENDENCY = 2;

	/**
	 * The number of structural features of the '<em>Functionblock Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONBLOCK_DEPENDENCY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Functionblock Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONBLOCK_DEPENDENCY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4iec.model.ComponentInternalDependencies.impl.MethodDependencyImpl <em>Method Dependency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4iec.model.ComponentInternalDependencies.impl.MethodDependencyImpl
	 * @see edu.kit.ipd.sdq.kamp4iec.model.ComponentInternalDependencies.impl.ComponentInternalDependenciesPackageImpl#getMethodDependency()
	 * @generated
	 */
	int METHOD_DEPENDENCY = 2;

	/**
	 * The feature id for the '<em><b>Required Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_DEPENDENCY__REQUIRED_RESOURCE = 0;

	/**
	 * The feature id for the '<em><b>Provided Method</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_DEPENDENCY__PROVIDED_METHOD = 1;

	/**
	 * The number of structural features of the '<em>Method Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_DEPENDENCY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Method Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_DEPENDENCY_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4iec.model.ComponentInternalDependencies.ComponentInternalDependenciesRepository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Repository</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.ComponentInternalDependencies.ComponentInternalDependenciesRepository
	 * @generated
	 */
	EClass getComponentInternalDependenciesRepository();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4iec.model.ComponentInternalDependencies.ComponentInternalDependenciesRepository#getHasFunctionblockDependency <em>Has Functionblock Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Functionblock Dependency</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.ComponentInternalDependencies.ComponentInternalDependenciesRepository#getHasFunctionblockDependency()
	 * @see #getComponentInternalDependenciesRepository()
	 * @generated
	 */
	EReference getComponentInternalDependenciesRepository_HasFunctionblockDependency();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4iec.model.ComponentInternalDependencies.FunctionblockDependency <em>Functionblock Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Functionblock Dependency</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.ComponentInternalDependencies.FunctionblockDependency
	 * @generated
	 */
	EClass getFunctionblockDependency();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.kamp4iec.model.ComponentInternalDependencies.FunctionblockDependency#getProvidedFunctionBlock <em>Provided Function Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Provided Function Block</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.ComponentInternalDependencies.FunctionblockDependency#getProvidedFunctionBlock()
	 * @see #getFunctionblockDependency()
	 * @generated
	 */
	EReference getFunctionblockDependency_ProvidedFunctionBlock();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.kamp4iec.model.ComponentInternalDependencies.FunctionblockDependency#getRequiredResource <em>Required Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Required Resource</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.ComponentInternalDependencies.FunctionblockDependency#getRequiredResource()
	 * @see #getFunctionblockDependency()
	 * @generated
	 */
	EReference getFunctionblockDependency_RequiredResource();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4iec.model.ComponentInternalDependencies.FunctionblockDependency#getHasMethodDependency <em>Has Method Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Method Dependency</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.ComponentInternalDependencies.FunctionblockDependency#getHasMethodDependency()
	 * @see #getFunctionblockDependency()
	 * @generated
	 */
	EReference getFunctionblockDependency_HasMethodDependency();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4iec.model.ComponentInternalDependencies.MethodDependency <em>Method Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method Dependency</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.ComponentInternalDependencies.MethodDependency
	 * @generated
	 */
	EClass getMethodDependency();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.kamp4iec.model.ComponentInternalDependencies.MethodDependency#getRequiredResource <em>Required Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Required Resource</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.ComponentInternalDependencies.MethodDependency#getRequiredResource()
	 * @see #getMethodDependency()
	 * @generated
	 */
	EReference getMethodDependency_RequiredResource();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.kamp4iec.model.ComponentInternalDependencies.MethodDependency#getProvidedMethod <em>Provided Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Provided Method</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.ComponentInternalDependencies.MethodDependency#getProvidedMethod()
	 * @see #getMethodDependency()
	 * @generated
	 */
	EReference getMethodDependency_ProvidedMethod();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ComponentInternalDependenciesFactory getComponentInternalDependenciesFactory();

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
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4iec.model.ComponentInternalDependencies.impl.ComponentInternalDependenciesRepositoryImpl <em>Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4iec.model.ComponentInternalDependencies.impl.ComponentInternalDependenciesRepositoryImpl
		 * @see edu.kit.ipd.sdq.kamp4iec.model.ComponentInternalDependencies.impl.ComponentInternalDependenciesPackageImpl#getComponentInternalDependenciesRepository()
		 * @generated
		 */
		EClass COMPONENT_INTERNAL_DEPENDENCIES_REPOSITORY = eINSTANCE.getComponentInternalDependenciesRepository();

		/**
		 * The meta object literal for the '<em><b>Has Functionblock Dependency</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_INTERNAL_DEPENDENCIES_REPOSITORY__HAS_FUNCTIONBLOCK_DEPENDENCY = eINSTANCE.getComponentInternalDependenciesRepository_HasFunctionblockDependency();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4iec.model.ComponentInternalDependencies.impl.FunctionblockDependencyImpl <em>Functionblock Dependency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4iec.model.ComponentInternalDependencies.impl.FunctionblockDependencyImpl
		 * @see edu.kit.ipd.sdq.kamp4iec.model.ComponentInternalDependencies.impl.ComponentInternalDependenciesPackageImpl#getFunctionblockDependency()
		 * @generated
		 */
		EClass FUNCTIONBLOCK_DEPENDENCY = eINSTANCE.getFunctionblockDependency();

		/**
		 * The meta object literal for the '<em><b>Provided Function Block</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTIONBLOCK_DEPENDENCY__PROVIDED_FUNCTION_BLOCK = eINSTANCE.getFunctionblockDependency_ProvidedFunctionBlock();

		/**
		 * The meta object literal for the '<em><b>Required Resource</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTIONBLOCK_DEPENDENCY__REQUIRED_RESOURCE = eINSTANCE.getFunctionblockDependency_RequiredResource();

		/**
		 * The meta object literal for the '<em><b>Has Method Dependency</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTIONBLOCK_DEPENDENCY__HAS_METHOD_DEPENDENCY = eINSTANCE.getFunctionblockDependency_HasMethodDependency();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4iec.model.ComponentInternalDependencies.impl.MethodDependencyImpl <em>Method Dependency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4iec.model.ComponentInternalDependencies.impl.MethodDependencyImpl
		 * @see edu.kit.ipd.sdq.kamp4iec.model.ComponentInternalDependencies.impl.ComponentInternalDependenciesPackageImpl#getMethodDependency()
		 * @generated
		 */
		EClass METHOD_DEPENDENCY = eINSTANCE.getMethodDependency();

		/**
		 * The meta object literal for the '<em><b>Required Resource</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD_DEPENDENCY__REQUIRED_RESOURCE = eINSTANCE.getMethodDependency_RequiredResource();

		/**
		 * The meta object literal for the '<em><b>Provided Method</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD_DEPENDENCY__PROVIDED_METHOD = eINSTANCE.getMethodDependency_ProvidedMethod();

	}

} //ComponentInternalDependenciesPackage
