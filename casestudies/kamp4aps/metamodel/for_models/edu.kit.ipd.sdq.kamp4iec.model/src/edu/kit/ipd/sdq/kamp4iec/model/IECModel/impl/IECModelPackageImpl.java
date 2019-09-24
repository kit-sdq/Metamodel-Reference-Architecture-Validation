/**
 */
package edu.kit.ipd.sdq.kamp4iec.model.IECModel.impl;

import edu.kit.ipd.sdq.kamp4iec.model.ComponentInternalDependencies.ComponentInternalDependenciesPackage;

import edu.kit.ipd.sdq.kamp4iec.model.IECModel.Function;
import edu.kit.ipd.sdq.kamp4iec.model.IECModel.FunctionBlock;
import edu.kit.ipd.sdq.kamp4iec.model.IECModel.GlobalVariable;
import edu.kit.ipd.sdq.kamp4iec.model.IECModel.IECInterface;
import edu.kit.ipd.sdq.kamp4iec.model.IECModel.IECMethodImplementation;
import edu.kit.ipd.sdq.kamp4iec.model.IECModel.IECModelFactory;
import edu.kit.ipd.sdq.kamp4iec.model.IECModel.IECModelPackage;
import edu.kit.ipd.sdq.kamp4iec.model.IECModel.IECPropertyImplementation;
import edu.kit.ipd.sdq.kamp4iec.model.IECModel.Program;
import edu.kit.ipd.sdq.kamp4iec.model.IECModel.SPSSystem;

import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECRepositoryPackage;

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
public class IECModelPackageImpl extends EPackageImpl implements IECModelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionBlockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass programEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass spsSystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iecInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass globalVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iecMethodImplementationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iecPropertyImplementationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumEClass = null;

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
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECModel.IECModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private IECModelPackageImpl() {
		super(eNS_URI, IECModelFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link IECModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static IECModelPackage init() {
		if (isInited) return (IECModelPackage)EPackage.Registry.INSTANCE.getEPackage(IECModelPackage.eNS_URI);

		// Obtain or create and register package
		IECModelPackageImpl theIECModelPackage = (IECModelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof IECModelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new IECModelPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ComponentInternalDependenciesPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theIECModelPackage.createPackageContents();

		// Initialize created meta-data
		theIECModelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theIECModelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(IECModelPackage.eNS_URI, theIECModelPackage);
		return theIECModelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionBlock() {
		return functionBlockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionBlock_Type() {
		return (EReference)functionBlockEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionBlock_AccessesProperty() {
		return (EReference)functionBlockEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionBlock_HasMethod() {
		return (EReference)functionBlockEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionBlock_HasProperty() {
		return (EReference)functionBlockEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunction() {
		return functionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunction_Type() {
		return (EReference)functionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProgram() {
		return programEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProgram_CallsFunction() {
		return (EReference)programEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProgram_CallsFunctionBlock() {
		return (EReference)programEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProgram_Type() {
		return (EReference)programEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProgram_ImplementsInterface() {
		return (EReference)programEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProgram_DeclaresVariable() {
		return (EReference)programEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProgram_UsesEnum() {
		return (EReference)programEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProgram_AccessesProperty() {
		return (EReference)programEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProgram_CallsMethod() {
		return (EReference)programEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSPSSystem() {
		return spsSystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSPSSystem_ContainsProgram() {
		return (EReference)spsSystemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSPSSystem_ComponentInternalDependencies() {
		return (EReference)spsSystemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIECInterface() {
		return iecInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIECInterface_Type() {
		return (EReference)iecInterfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGlobalVariable() {
		return globalVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlobalVariable_Type() {
		return (EReference)globalVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIECMethodImplementation() {
		return iecMethodImplementationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIECMethodImplementation_Type() {
		return (EReference)iecMethodImplementationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIECMethodImplementation_AccessesGlobalVariable() {
		return (EReference)iecMethodImplementationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIECMethodImplementation_AccessesProperty() {
		return (EReference)iecMethodImplementationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIECPropertyImplementation() {
		return iecPropertyImplementationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIECPropertyImplementation_Type() {
		return (EReference)iecPropertyImplementationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnum() {
		return enumEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnum_Name() {
		return (EAttribute)enumEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnum_Type() {
		return (EReference)enumEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IECModelFactory getIECModelFactory() {
		return (IECModelFactory)getEFactoryInstance();
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
		functionBlockEClass = createEClass(FUNCTION_BLOCK);
		createEReference(functionBlockEClass, FUNCTION_BLOCK__TYPE);
		createEReference(functionBlockEClass, FUNCTION_BLOCK__ACCESSES_PROPERTY);
		createEReference(functionBlockEClass, FUNCTION_BLOCK__HAS_METHOD);
		createEReference(functionBlockEClass, FUNCTION_BLOCK__HAS_PROPERTY);

		functionEClass = createEClass(FUNCTION);
		createEReference(functionEClass, FUNCTION__TYPE);

		programEClass = createEClass(PROGRAM);
		createEReference(programEClass, PROGRAM__CALLS_FUNCTION);
		createEReference(programEClass, PROGRAM__CALLS_FUNCTION_BLOCK);
		createEReference(programEClass, PROGRAM__TYPE);
		createEReference(programEClass, PROGRAM__IMPLEMENTS_INTERFACE);
		createEReference(programEClass, PROGRAM__DECLARES_VARIABLE);
		createEReference(programEClass, PROGRAM__USES_ENUM);
		createEReference(programEClass, PROGRAM__ACCESSES_PROPERTY);
		createEReference(programEClass, PROGRAM__CALLS_METHOD);

		spsSystemEClass = createEClass(SPS_SYSTEM);
		createEReference(spsSystemEClass, SPS_SYSTEM__CONTAINS_PROGRAM);
		createEReference(spsSystemEClass, SPS_SYSTEM__COMPONENT_INTERNAL_DEPENDENCIES);

		iecInterfaceEClass = createEClass(IEC_INTERFACE);
		createEReference(iecInterfaceEClass, IEC_INTERFACE__TYPE);

		globalVariableEClass = createEClass(GLOBAL_VARIABLE);
		createEReference(globalVariableEClass, GLOBAL_VARIABLE__TYPE);

		iecMethodImplementationEClass = createEClass(IEC_METHOD_IMPLEMENTATION);
		createEReference(iecMethodImplementationEClass, IEC_METHOD_IMPLEMENTATION__TYPE);
		createEReference(iecMethodImplementationEClass, IEC_METHOD_IMPLEMENTATION__ACCESSES_GLOBAL_VARIABLE);
		createEReference(iecMethodImplementationEClass, IEC_METHOD_IMPLEMENTATION__ACCESSES_PROPERTY);

		iecPropertyImplementationEClass = createEClass(IEC_PROPERTY_IMPLEMENTATION);
		createEReference(iecPropertyImplementationEClass, IEC_PROPERTY_IMPLEMENTATION__TYPE);

		enumEClass = createEClass(ENUM);
		createEAttribute(enumEClass, ENUM__NAME);
		createEReference(enumEClass, ENUM__TYPE);
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
		ComponentInternalDependenciesPackage theComponentInternalDependenciesPackage = (ComponentInternalDependenciesPackage)EPackage.Registry.INSTANCE.getEPackage(ComponentInternalDependenciesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		functionBlockEClass.getESuperTypes().add(theIECRepositoryPackage.getIdentifier());
		functionEClass.getESuperTypes().add(theIECRepositoryPackage.getIdentifier());
		programEClass.getESuperTypes().add(theIECRepositoryPackage.getIdentifier());
		spsSystemEClass.getESuperTypes().add(theIECRepositoryPackage.getIdentifier());
		iecInterfaceEClass.getESuperTypes().add(theIECRepositoryPackage.getIdentifier());
		globalVariableEClass.getESuperTypes().add(theIECRepositoryPackage.getIdentifier());
		iecMethodImplementationEClass.getESuperTypes().add(theIECRepositoryPackage.getIdentifier());
		iecPropertyImplementationEClass.getESuperTypes().add(theIECRepositoryPackage.getIdentifier());

		// Initialize classes, features, and operations; add parameters
		initEClass(functionBlockEClass, FunctionBlock.class, "FunctionBlock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFunctionBlock_Type(), theIECRepositoryPackage.getFunctionBlock(), null, "Type", null, 1, 1, FunctionBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionBlock_AccessesProperty(), this.getIECPropertyImplementation(), null, "AccessesProperty", null, 0, -1, FunctionBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionBlock_HasMethod(), this.getIECMethodImplementation(), null, "HasMethod", null, 0, -1, FunctionBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionBlock_HasProperty(), this.getIECPropertyImplementation(), null, "HasProperty", null, 0, -1, FunctionBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(functionEClass, Function.class, "Function", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFunction_Type(), theIECRepositoryPackage.getFunction(), null, "Type", null, 1, 1, Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(programEClass, Program.class, "Program", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProgram_CallsFunction(), this.getFunction(), null, "CallsFunction", null, 0, -1, Program.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProgram_CallsFunctionBlock(), this.getFunctionBlock(), null, "CallsFunctionBlock", null, 0, -1, Program.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProgram_Type(), theIECRepositoryPackage.getProgram(), null, "Type", null, 1, 1, Program.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProgram_ImplementsInterface(), this.getIECInterface(), null, "ImplementsInterface", null, 0, -1, Program.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProgram_DeclaresVariable(), this.getGlobalVariable(), null, "DeclaresVariable", null, 0, -1, Program.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProgram_UsesEnum(), this.getEnum(), null, "UsesEnum", null, 0, -1, Program.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProgram_AccessesProperty(), this.getIECPropertyImplementation(), null, "AccessesProperty", null, 0, -1, Program.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProgram_CallsMethod(), this.getIECMethodImplementation(), null, "CallsMethod", null, 0, -1, Program.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(spsSystemEClass, SPSSystem.class, "SPSSystem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSPSSystem_ContainsProgram(), this.getProgram(), null, "ContainsProgram", null, 0, -1, SPSSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSPSSystem_ComponentInternalDependencies(), theComponentInternalDependenciesPackage.getComponentInternalDependenciesRepository(), null, "ComponentInternalDependencies", null, 0, -1, SPSSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iecInterfaceEClass, IECInterface.class, "IECInterface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIECInterface_Type(), theIECRepositoryPackage.getIECInterface(), null, "Type", null, 1, 1, IECInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(globalVariableEClass, GlobalVariable.class, "GlobalVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGlobalVariable_Type(), theIECRepositoryPackage.getGlobalVariable(), null, "Type", null, 1, 1, GlobalVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iecMethodImplementationEClass, IECMethodImplementation.class, "IECMethodImplementation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIECMethodImplementation_Type(), theIECRepositoryPackage.getIECMethodImplementation(), null, "Type", null, 1, 1, IECMethodImplementation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getIECMethodImplementation_AccessesGlobalVariable(), this.getGlobalVariable(), null, "AccessesGlobalVariable", null, 0, -1, IECMethodImplementation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIECMethodImplementation_AccessesProperty(), this.getIECPropertyImplementation(), null, "AccessesProperty", null, 0, -1, IECMethodImplementation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iecPropertyImplementationEClass, IECPropertyImplementation.class, "IECPropertyImplementation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIECPropertyImplementation_Type(), theIECRepositoryPackage.getIECPropertyImplementation(), null, "Type", null, 1, 1, IECPropertyImplementation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enumEClass, edu.kit.ipd.sdq.kamp4iec.model.IECModel.Enum.class, "Enum", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEnum_Name(), ecorePackage.getEString(), "Name", null, 0, 1, edu.kit.ipd.sdq.kamp4iec.model.IECModel.Enum.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEnum_Type(), theIECRepositoryPackage.getEnum(), null, "Type", null, 1, 1, edu.kit.ipd.sdq.kamp4iec.model.IECModel.Enum.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //IECModelPackageImpl
