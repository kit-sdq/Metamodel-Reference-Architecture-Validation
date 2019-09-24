/**
 */
package edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl;

import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.Function;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.FunctionBlock;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.FunctionblockResource;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.GlobalVariable;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECInterface;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECMethod;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECMethodImplementation;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECProperty;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECPropertyImplementation;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECRepositoryFactory;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECRepositoryPackage;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.Identifier;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.ImplementsInterface;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.MethodResource;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.Program;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.Repository;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.VariableType;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class IECRepositoryPackageImpl extends EPackageImpl implements IECRepositoryPackage {
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
	private EClass globalVariableEClass = null;

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
	private EClass iecMethodImplementationEClass = null;

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
	private EClass repositoryEClass = null;

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
	private EClass iecPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iecMethodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionblockResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass methodResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass identifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass implementsInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum variableTypeEEnum = null;

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
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECRepositoryPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private IECRepositoryPackageImpl() {
		super(eNS_URI, IECRepositoryFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link IECRepositoryPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static IECRepositoryPackage init() {
		if (isInited) return (IECRepositoryPackage)EPackage.Registry.INSTANCE.getEPackage(IECRepositoryPackage.eNS_URI);

		// Obtain or create and register package
		IECRepositoryPackageImpl theIECRepositoryPackage = (IECRepositoryPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof IECRepositoryPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new IECRepositoryPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theIECRepositoryPackage.createPackageContents();

		// Initialize created meta-data
		theIECRepositoryPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theIECRepositoryPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(IECRepositoryPackage.eNS_URI, theIECRepositoryPackage);
		return theIECRepositoryPackage;
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
	public EReference getFunctionBlock_HasIecMethod() {
		return (EReference)functionBlockEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionBlock_HasIecProperty() {
		return (EReference)functionBlockEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionBlock_HasInterface() {
		return (EReference)functionBlockEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionBlock_AccessesVariable() {
		return (EReference)functionBlockEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionBlock_UsesFunctionBlock() {
		return (EReference)functionBlockEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionBlock_CallsFunction() {
		return (EReference)functionBlockEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionBlock_UsesEnum() {
		return (EReference)functionBlockEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionBlock_UsesInterface() {
		return (EReference)functionBlockEClass.getEStructuralFeatures().get(7);
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
	public EAttribute getGlobalVariable_Type() {
		return (EAttribute)globalVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlobalVariable_UsesEnum() {
		return (EReference)globalVariableEClass.getEStructuralFeatures().get(1);
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
	public EReference getIECInterface_DefinesIecMethod() {
		return (EReference)iecInterfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIECInterface_DefinesIecProperty() {
		return (EReference)iecInterfaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIECInterface_UsesEnum() {
		return (EReference)iecInterfaceEClass.getEStructuralFeatures().get(2);
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
	public EReference getIECMethodImplementation_Implements() {
		return (EReference)iecMethodImplementationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIECMethodImplementation_AccessesProperty() {
		return (EReference)iecMethodImplementationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIECMethodImplementation_AccessesVariable() {
		return (EReference)iecMethodImplementationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIECMethodImplementation_UsesEnum() {
		return (EReference)iecMethodImplementationEClass.getEStructuralFeatures().get(3);
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
	public EReference getFunction_CallsFunction() {
		return (EReference)functionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunction_UsesEnum() {
		return (EReference)functionEClass.getEStructuralFeatures().get(1);
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
	public EClass getRepository() {
		return repositoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepository_ContainsProgram() {
		return (EReference)repositoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepository_ContainsInterface() {
		return (EReference)repositoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepository_ContainsFunctionBlock() {
		return (EReference)repositoryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepository_ContainsFunction() {
		return (EReference)repositoryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepository_ContainsVariable() {
		return (EReference)repositoryEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRepository_Name() {
		return (EAttribute)repositoryEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepository_ContainsEnum() {
		return (EReference)repositoryEClass.getEStructuralFeatures().get(6);
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
	public EReference getIECPropertyImplementation_Implements() {
		return (EReference)iecPropertyImplementationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIECPropertyImplementation_AccessesVariable() {
		return (EReference)iecPropertyImplementationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIECPropertyImplementation_UsesEnum() {
		return (EReference)iecPropertyImplementationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIECProperty() {
		return iecPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIECProperty_UsesEnum() {
		return (EReference)iecPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIECMethod() {
		return iecMethodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIECMethod_UsesEnum() {
		return (EReference)iecMethodEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionblockResource() {
		return functionblockResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMethodResource() {
		return methodResourceEClass;
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
	public EClass getIdentifier() {
		return identifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIdentifier_Id() {
		return (EAttribute)identifierEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIdentifier_Name() {
		return (EAttribute)identifierEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImplementsInterface() {
		return implementsInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImplementsInterface_Interface() {
		return (EReference)implementsInterfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getVariableType() {
		return variableTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IECRepositoryFactory getIECRepositoryFactory() {
		return (IECRepositoryFactory)getEFactoryInstance();
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
		createEReference(functionBlockEClass, FUNCTION_BLOCK__HAS_IEC_METHOD);
		createEReference(functionBlockEClass, FUNCTION_BLOCK__HAS_IEC_PROPERTY);
		createEReference(functionBlockEClass, FUNCTION_BLOCK__HAS_INTERFACE);
		createEReference(functionBlockEClass, FUNCTION_BLOCK__ACCESSES_VARIABLE);
		createEReference(functionBlockEClass, FUNCTION_BLOCK__USES_FUNCTION_BLOCK);
		createEReference(functionBlockEClass, FUNCTION_BLOCK__CALLS_FUNCTION);
		createEReference(functionBlockEClass, FUNCTION_BLOCK__USES_ENUM);
		createEReference(functionBlockEClass, FUNCTION_BLOCK__USES_INTERFACE);

		globalVariableEClass = createEClass(GLOBAL_VARIABLE);
		createEAttribute(globalVariableEClass, GLOBAL_VARIABLE__TYPE);
		createEReference(globalVariableEClass, GLOBAL_VARIABLE__USES_ENUM);

		iecInterfaceEClass = createEClass(IEC_INTERFACE);
		createEReference(iecInterfaceEClass, IEC_INTERFACE__DEFINES_IEC_METHOD);
		createEReference(iecInterfaceEClass, IEC_INTERFACE__DEFINES_IEC_PROPERTY);
		createEReference(iecInterfaceEClass, IEC_INTERFACE__USES_ENUM);

		iecMethodImplementationEClass = createEClass(IEC_METHOD_IMPLEMENTATION);
		createEReference(iecMethodImplementationEClass, IEC_METHOD_IMPLEMENTATION__IMPLEMENTS);
		createEReference(iecMethodImplementationEClass, IEC_METHOD_IMPLEMENTATION__ACCESSES_PROPERTY);
		createEReference(iecMethodImplementationEClass, IEC_METHOD_IMPLEMENTATION__ACCESSES_VARIABLE);
		createEReference(iecMethodImplementationEClass, IEC_METHOD_IMPLEMENTATION__USES_ENUM);

		functionEClass = createEClass(FUNCTION);
		createEReference(functionEClass, FUNCTION__CALLS_FUNCTION);
		createEReference(functionEClass, FUNCTION__USES_ENUM);

		programEClass = createEClass(PROGRAM);

		repositoryEClass = createEClass(REPOSITORY);
		createEReference(repositoryEClass, REPOSITORY__CONTAINS_PROGRAM);
		createEReference(repositoryEClass, REPOSITORY__CONTAINS_INTERFACE);
		createEReference(repositoryEClass, REPOSITORY__CONTAINS_FUNCTION_BLOCK);
		createEReference(repositoryEClass, REPOSITORY__CONTAINS_FUNCTION);
		createEReference(repositoryEClass, REPOSITORY__CONTAINS_VARIABLE);
		createEAttribute(repositoryEClass, REPOSITORY__NAME);
		createEReference(repositoryEClass, REPOSITORY__CONTAINS_ENUM);

		iecPropertyImplementationEClass = createEClass(IEC_PROPERTY_IMPLEMENTATION);
		createEReference(iecPropertyImplementationEClass, IEC_PROPERTY_IMPLEMENTATION__IMPLEMENTS);
		createEReference(iecPropertyImplementationEClass, IEC_PROPERTY_IMPLEMENTATION__ACCESSES_VARIABLE);
		createEReference(iecPropertyImplementationEClass, IEC_PROPERTY_IMPLEMENTATION__USES_ENUM);

		iecPropertyEClass = createEClass(IEC_PROPERTY);
		createEReference(iecPropertyEClass, IEC_PROPERTY__USES_ENUM);

		iecMethodEClass = createEClass(IEC_METHOD);
		createEReference(iecMethodEClass, IEC_METHOD__USES_ENUM);

		functionblockResourceEClass = createEClass(FUNCTIONBLOCK_RESOURCE);

		methodResourceEClass = createEClass(METHOD_RESOURCE);

		enumEClass = createEClass(ENUM);
		createEAttribute(enumEClass, ENUM__NAME);

		identifierEClass = createEClass(IDENTIFIER);
		createEAttribute(identifierEClass, IDENTIFIER__ID);
		createEAttribute(identifierEClass, IDENTIFIER__NAME);

		implementsInterfaceEClass = createEClass(IMPLEMENTS_INTERFACE);
		createEReference(implementsInterfaceEClass, IMPLEMENTS_INTERFACE__INTERFACE);

		// Create enums
		variableTypeEEnum = createEEnum(VARIABLE_TYPE);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		functionBlockEClass.getESuperTypes().add(this.getIdentifier());
		functionBlockEClass.getESuperTypes().add(this.getFunctionblockResource());
		globalVariableEClass.getESuperTypes().add(this.getIdentifier());
		iecInterfaceEClass.getESuperTypes().add(this.getIdentifier());
		iecInterfaceEClass.getESuperTypes().add(this.getFunctionblockResource());
		iecMethodImplementationEClass.getESuperTypes().add(this.getIdentifier());
		iecMethodImplementationEClass.getESuperTypes().add(this.getMethodResource());
		functionEClass.getESuperTypes().add(this.getIdentifier());
		programEClass.getESuperTypes().add(this.getIdentifier());
		iecPropertyImplementationEClass.getESuperTypes().add(this.getIdentifier());
		iecPropertyImplementationEClass.getESuperTypes().add(this.getMethodResource());
		iecPropertyEClass.getESuperTypes().add(this.getIdentifier());
		iecMethodEClass.getESuperTypes().add(this.getIdentifier());

		// Initialize classes, features, and operations; add parameters
		initEClass(functionBlockEClass, FunctionBlock.class, "FunctionBlock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFunctionBlock_HasIecMethod(), this.getIECMethodImplementation(), null, "HasIecMethod", null, 0, -1, FunctionBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionBlock_HasIecProperty(), this.getIECPropertyImplementation(), null, "HasIecProperty", null, 0, -1, FunctionBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionBlock_HasInterface(), this.getImplementsInterface(), null, "HasInterface", null, 0, -1, FunctionBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionBlock_AccessesVariable(), this.getGlobalVariable(), null, "AccessesVariable", null, 0, -1, FunctionBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionBlock_UsesFunctionBlock(), this.getFunctionBlock(), null, "UsesFunctionBlock", null, 0, -1, FunctionBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionBlock_CallsFunction(), this.getFunction(), null, "CallsFunction", null, 0, -1, FunctionBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionBlock_UsesEnum(), this.getEnum(), null, "UsesEnum", null, 0, -1, FunctionBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionBlock_UsesInterface(), this.getIECInterface(), null, "UsesInterface", null, 0, -1, FunctionBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(globalVariableEClass, GlobalVariable.class, "GlobalVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGlobalVariable_Type(), this.getVariableType(), "Type", "NONE", 0, 1, GlobalVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGlobalVariable_UsesEnum(), this.getEnum(), null, "UsesEnum", null, 0, -1, GlobalVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iecInterfaceEClass, IECInterface.class, "IECInterface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIECInterface_DefinesIecMethod(), this.getIECMethod(), null, "DefinesIecMethod", null, 0, -1, IECInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIECInterface_DefinesIecProperty(), this.getIECProperty(), null, "DefinesIecProperty", null, 0, -1, IECInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIECInterface_UsesEnum(), this.getEnum(), null, "UsesEnum", null, 0, -1, IECInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iecMethodImplementationEClass, IECMethodImplementation.class, "IECMethodImplementation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIECMethodImplementation_Implements(), this.getIECMethod(), null, "implements", null, 0, 1, IECMethodImplementation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIECMethodImplementation_AccessesProperty(), this.getIECPropertyImplementation(), null, "AccessesProperty", null, 0, -1, IECMethodImplementation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIECMethodImplementation_AccessesVariable(), this.getGlobalVariable(), null, "AccessesVariable", null, 0, -1, IECMethodImplementation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIECMethodImplementation_UsesEnum(), this.getEnum(), null, "UsesEnum", null, 0, -1, IECMethodImplementation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(functionEClass, Function.class, "Function", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFunction_CallsFunction(), this.getFunction(), null, "CallsFunction", null, 0, -1, Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunction_UsesEnum(), this.getEnum(), null, "UsesEnum", null, 0, -1, Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(programEClass, Program.class, "Program", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(repositoryEClass, Repository.class, "Repository", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRepository_ContainsProgram(), this.getProgram(), null, "ContainsProgram", null, 0, -1, Repository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRepository_ContainsInterface(), this.getIECInterface(), null, "ContainsInterface", null, 0, -1, Repository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRepository_ContainsFunctionBlock(), this.getFunctionBlock(), null, "ContainsFunctionBlock", null, 0, -1, Repository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRepository_ContainsFunction(), this.getFunction(), null, "ContainsFunction", null, 0, -1, Repository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRepository_ContainsVariable(), this.getGlobalVariable(), null, "ContainsVariable", null, 0, -1, Repository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRepository_Name(), ecorePackage.getEString(), "Name", null, 0, 1, Repository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRepository_ContainsEnum(), this.getEnum(), null, "ContainsEnum", null, 0, -1, Repository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iecPropertyImplementationEClass, IECPropertyImplementation.class, "IECPropertyImplementation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIECPropertyImplementation_Implements(), this.getIECProperty(), null, "implements", null, 0, 1, IECPropertyImplementation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIECPropertyImplementation_AccessesVariable(), this.getGlobalVariable(), null, "AccessesVariable", null, 0, -1, IECPropertyImplementation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIECPropertyImplementation_UsesEnum(), this.getEnum(), null, "UsesEnum", null, 0, -1, IECPropertyImplementation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iecPropertyEClass, IECProperty.class, "IECProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIECProperty_UsesEnum(), this.getEnum(), null, "UsesEnum", null, 0, -1, IECProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iecMethodEClass, IECMethod.class, "IECMethod", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIECMethod_UsesEnum(), this.getEnum(), null, "UsesEnum", null, 0, -1, IECMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(functionblockResourceEClass, FunctionblockResource.class, "FunctionblockResource", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(methodResourceEClass, MethodResource.class, "MethodResource", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(enumEClass, edu.kit.ipd.sdq.kamp4iec.model.IECRepository.Enum.class, "Enum", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEnum_Name(), ecorePackage.getEString(), "Name", null, 0, 1, edu.kit.ipd.sdq.kamp4iec.model.IECRepository.Enum.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(identifierEClass, Identifier.class, "Identifier", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIdentifier_Id(), ecorePackage.getEString(), "id", null, 0, 1, Identifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIdentifier_Name(), ecorePackage.getEString(), "Name", null, 0, 1, Identifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(implementsInterfaceEClass, ImplementsInterface.class, "ImplementsInterface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getImplementsInterface_Interface(), this.getIECInterface(), null, "Interface", null, 1, 1, ImplementsInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(variableTypeEEnum, VariableType.class, "VariableType");
		addEEnumLiteral(variableTypeEEnum, VariableType.NONE);
		addEEnumLiteral(variableTypeEEnum, VariableType.INPUT);
		addEEnumLiteral(variableTypeEEnum, VariableType.OUTPUT);

		// Create resource
		createResource(eNS_URI);
	}

} //IECRepositoryPackageImpl
