/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.DeploymentContext.impl;

import edu.kit.ipd.sdq.kamp4aps.model.DeploymentContext.ComponentCorrelation;
import edu.kit.ipd.sdq.kamp4aps.model.DeploymentContext.DeploymentContextFactory;
import edu.kit.ipd.sdq.kamp4aps.model.DeploymentContext.DeploymentContextPackage;
import edu.kit.ipd.sdq.kamp4aps.model.DeploymentContext.DeploymentContextRepository;
import edu.kit.ipd.sdq.kamp4aps.model.DeploymentContext.VariableMapping;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.ComponentRepositoryPackage;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.InterfaceRepositoryPackage;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.apsPackage;

import edu.kit.ipd.sdq.kamp4iec.model.IECModel.IECModelPackage;

import org.eclipse.emf.ecore.EAttribute;
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
public class DeploymentContextPackageImpl extends EPackageImpl implements DeploymentContextPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deploymentContextRepositoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentCorrelationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableMappingEClass = null;

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
	 * @see edu.kit.ipd.sdq.kamp4aps.model.DeploymentContext.DeploymentContextPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DeploymentContextPackageImpl() {
		super(eNS_URI, DeploymentContextFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link DeploymentContextPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DeploymentContextPackage init() {
		if (isInited) return (DeploymentContextPackage)EPackage.Registry.INSTANCE.getEPackage(DeploymentContextPackage.eNS_URI);

		// Obtain or create and register package
		DeploymentContextPackageImpl theDeploymentContextPackage = (DeploymentContextPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DeploymentContextPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DeploymentContextPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		apsPackage.eINSTANCE.eClass();
		IECModelPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theDeploymentContextPackage.createPackageContents();

		// Initialize created meta-data
		theDeploymentContextPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDeploymentContextPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DeploymentContextPackage.eNS_URI, theDeploymentContextPackage);
		return theDeploymentContextPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeploymentContextRepository() {
		return deploymentContextRepositoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeploymentContextRepository_ComponentCorrelation() {
		return (EReference)deploymentContextRepositoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponentCorrelation() {
		return componentCorrelationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentCorrelation_Parent() {
		return (EReference)componentCorrelationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentCorrelation_Component() {
		return (EReference)componentCorrelationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentCorrelation_Program() {
		return (EReference)componentCorrelationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponentCorrelation_Name() {
		return (EAttribute)componentCorrelationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentCorrelation_VariableMapping() {
		return (EReference)componentCorrelationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariableMapping() {
		return variableMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariableMapping_Name() {
		return (EAttribute)variableMappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariableMapping_ProgramVariable() {
		return (EReference)variableMappingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariableMapping_InterfaceDeclaration() {
		return (EReference)variableMappingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariableMapping_Parent() {
		return (EReference)variableMappingEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeploymentContextFactory getDeploymentContextFactory() {
		return (DeploymentContextFactory)getEFactoryInstance();
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
		deploymentContextRepositoryEClass = createEClass(DEPLOYMENT_CONTEXT_REPOSITORY);
		createEReference(deploymentContextRepositoryEClass, DEPLOYMENT_CONTEXT_REPOSITORY__COMPONENT_CORRELATION);

		componentCorrelationEClass = createEClass(COMPONENT_CORRELATION);
		createEReference(componentCorrelationEClass, COMPONENT_CORRELATION__PARENT);
		createEReference(componentCorrelationEClass, COMPONENT_CORRELATION__COMPONENT);
		createEReference(componentCorrelationEClass, COMPONENT_CORRELATION__PROGRAM);
		createEAttribute(componentCorrelationEClass, COMPONENT_CORRELATION__NAME);
		createEReference(componentCorrelationEClass, COMPONENT_CORRELATION__VARIABLE_MAPPING);

		variableMappingEClass = createEClass(VARIABLE_MAPPING);
		createEAttribute(variableMappingEClass, VARIABLE_MAPPING__NAME);
		createEReference(variableMappingEClass, VARIABLE_MAPPING__PROGRAM_VARIABLE);
		createEReference(variableMappingEClass, VARIABLE_MAPPING__INTERFACE_DECLARATION);
		createEReference(variableMappingEClass, VARIABLE_MAPPING__PARENT);
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
		ComponentRepositoryPackage theComponentRepositoryPackage = (ComponentRepositoryPackage)EPackage.Registry.INSTANCE.getEPackage(ComponentRepositoryPackage.eNS_URI);
		IECModelPackage theIECModelPackage = (IECModelPackage)EPackage.Registry.INSTANCE.getEPackage(IECModelPackage.eNS_URI);
		InterfaceRepositoryPackage theInterfaceRepositoryPackage = (InterfaceRepositoryPackage)EPackage.Registry.INSTANCE.getEPackage(InterfaceRepositoryPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(deploymentContextRepositoryEClass, DeploymentContextRepository.class, "DeploymentContextRepository", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeploymentContextRepository_ComponentCorrelation(), this.getComponentCorrelation(), this.getComponentCorrelation_Parent(), "componentCorrelation", null, 0, -1, DeploymentContextRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(componentCorrelationEClass, ComponentCorrelation.class, "ComponentCorrelation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponentCorrelation_Parent(), this.getDeploymentContextRepository(), this.getDeploymentContextRepository_ComponentCorrelation(), "parent", null, 1, 1, ComponentCorrelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentCorrelation_Component(), theComponentRepositoryPackage.getComponent(), null, "component", null, 0, 1, ComponentCorrelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentCorrelation_Program(), theIECModelPackage.getProgram(), null, "program", null, 0, 1, ComponentCorrelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponentCorrelation_Name(), ecorePackage.getEString(), "name", null, 1, 1, ComponentCorrelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentCorrelation_VariableMapping(), this.getVariableMapping(), this.getVariableMapping_Parent(), "variableMapping", null, 0, -1, ComponentCorrelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(variableMappingEClass, VariableMapping.class, "VariableMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVariableMapping_Name(), ecorePackage.getEString(), "name", null, 0, 1, VariableMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVariableMapping_ProgramVariable(), theIECModelPackage.getGlobalVariable(), null, "programVariable", null, 1, 1, VariableMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVariableMapping_InterfaceDeclaration(), theInterfaceRepositoryPackage.getInterface(), null, "interfaceDeclaration", null, 1, 1, VariableMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVariableMapping_Parent(), this.getComponentCorrelation(), this.getComponentCorrelation_VariableMapping(), "parent", null, 1, 1, VariableMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //DeploymentContextPackageImpl
