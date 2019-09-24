/**
 */
package edu.kit.ipd.sdq.kamp4iec.model.ComponentInternalDependencies.impl;

import edu.kit.ipd.sdq.kamp4iec.model.ComponentInternalDependencies.ComponentInternalDependenciesFactory;
import edu.kit.ipd.sdq.kamp4iec.model.ComponentInternalDependencies.ComponentInternalDependenciesPackage;
import edu.kit.ipd.sdq.kamp4iec.model.ComponentInternalDependencies.ComponentInternalDependenciesRepository;
import edu.kit.ipd.sdq.kamp4iec.model.ComponentInternalDependencies.FunctionblockDependency;
import edu.kit.ipd.sdq.kamp4iec.model.ComponentInternalDependencies.MethodDependency;

import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECRepositoryPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ComponentInternalDependenciesPackageImpl extends EPackageImpl implements ComponentInternalDependenciesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentInternalDependenciesRepositoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionblockDependencyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass methodDependencyEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see edu.kit.ipd.sdq.kamp4iec.model.ComponentInternalDependencies.ComponentInternalDependenciesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ComponentInternalDependenciesPackageImpl() {
		super(eNS_URI, ComponentInternalDependenciesFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ComponentInternalDependenciesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ComponentInternalDependenciesPackage init() {
		if (isInited) return (ComponentInternalDependenciesPackage)EPackage.Registry.INSTANCE.getEPackage(ComponentInternalDependenciesPackage.eNS_URI);

		// Obtain or create and register package
		ComponentInternalDependenciesPackageImpl theComponentInternalDependenciesPackage = (ComponentInternalDependenciesPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ComponentInternalDependenciesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ComponentInternalDependenciesPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		IECRepositoryPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theComponentInternalDependenciesPackage.createPackageContents();

		// Initialize created meta-data
		theComponentInternalDependenciesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theComponentInternalDependenciesPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ComponentInternalDependenciesPackage.eNS_URI, theComponentInternalDependenciesPackage);
		return theComponentInternalDependenciesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponentInternalDependenciesRepository() {
		return componentInternalDependenciesRepositoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentInternalDependenciesRepository_HasFunctionblockDependency() {
		return (EReference)componentInternalDependenciesRepositoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionblockDependency() {
		return functionblockDependencyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionblockDependency_ProvidedFunctionBlock() {
		return (EReference)functionblockDependencyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionblockDependency_RequiredResource() {
		return (EReference)functionblockDependencyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionblockDependency_HasMethodDependency() {
		return (EReference)functionblockDependencyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMethodDependency() {
		return methodDependencyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMethodDependency_RequiredResource() {
		return (EReference)methodDependencyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMethodDependency_ProvidedMethod() {
		return (EReference)methodDependencyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentInternalDependenciesFactory getComponentInternalDependenciesFactory() {
		return (ComponentInternalDependenciesFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		componentInternalDependenciesRepositoryEClass = createEClass(COMPONENT_INTERNAL_DEPENDENCIES_REPOSITORY);
		createEReference(componentInternalDependenciesRepositoryEClass, COMPONENT_INTERNAL_DEPENDENCIES_REPOSITORY__HAS_FUNCTIONBLOCK_DEPENDENCY);

		functionblockDependencyEClass = createEClass(FUNCTIONBLOCK_DEPENDENCY);
		createEReference(functionblockDependencyEClass, FUNCTIONBLOCK_DEPENDENCY__PROVIDED_FUNCTION_BLOCK);
		createEReference(functionblockDependencyEClass, FUNCTIONBLOCK_DEPENDENCY__REQUIRED_RESOURCE);
		createEReference(functionblockDependencyEClass, FUNCTIONBLOCK_DEPENDENCY__HAS_METHOD_DEPENDENCY);

		methodDependencyEClass = createEClass(METHOD_DEPENDENCY);
		createEReference(methodDependencyEClass, METHOD_DEPENDENCY__REQUIRED_RESOURCE);
		createEReference(methodDependencyEClass, METHOD_DEPENDENCY__PROVIDED_METHOD);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		IECRepositoryPackage theIECRepositoryPackage = (IECRepositoryPackage)EPackage.Registry.INSTANCE.getEPackage(IECRepositoryPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(componentInternalDependenciesRepositoryEClass, ComponentInternalDependenciesRepository.class, "ComponentInternalDependenciesRepository", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponentInternalDependenciesRepository_HasFunctionblockDependency(), this.getFunctionblockDependency(), null, "HasFunctionblockDependency", null, 0, -1, ComponentInternalDependenciesRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(functionblockDependencyEClass, FunctionblockDependency.class, "FunctionblockDependency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFunctionblockDependency_ProvidedFunctionBlock(), theIECRepositoryPackage.getFunctionBlock(), null, "ProvidedFunctionBlock", null, 1, 1, FunctionblockDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionblockDependency_RequiredResource(), theIECRepositoryPackage.getFunctionblockResource(), null, "RequiredResource", null, 1, 1, FunctionblockDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionblockDependency_HasMethodDependency(), this.getMethodDependency(), null, "HasMethodDependency", null, 0, -1, FunctionblockDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(methodDependencyEClass, MethodDependency.class, "MethodDependency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMethodDependency_RequiredResource(), theIECRepositoryPackage.getMethodResource(), null, "RequiredResource", null, 1, 1, MethodDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMethodDependency_ProvidedMethod(), theIECRepositoryPackage.getIECMethodImplementation(), null, "ProvidedMethod", null, 1, 1, MethodDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ComponentInternalDependenciesPackageImpl
