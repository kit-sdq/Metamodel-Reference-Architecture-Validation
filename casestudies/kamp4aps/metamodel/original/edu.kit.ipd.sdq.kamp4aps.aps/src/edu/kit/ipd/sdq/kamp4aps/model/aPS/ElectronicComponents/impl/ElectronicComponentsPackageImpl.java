/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.aPS.ElectronicComponents.impl;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.BusComponentsPackage;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.impl.BusComponentsPackageImpl;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.ComponentRepositoryPackage;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.ComponentRepositoryPackageImpl;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.ElectronicComponents.Button;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.ElectronicComponents.ElectronicComponentsFactory;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.ElectronicComponents.ElectronicComponentsPackage;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.ElectronicComponents.ElectronicPart;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.ElectronicComponents.MicroSwitch;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.ElectronicComponents.Potentiometer;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.ElectronicComponents.Switch;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.InterfaceRepositoryPackage;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.impl.InterfaceRepositoryPackageImpl;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.MechanicalComponents.MechanicalComponentsPackage;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.MechanicalComponents.impl.MechanicalComponentsPackageImpl;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.ModuleRepositoryPackage;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.impl.ModuleRepositoryPackageImpl;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.StructureRepository.StructureRepositoryPackage;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.StructureRepository.impl.StructureRepositoryPackageImpl;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.apsPackage;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.impl.apsPackageImpl;

import edu.kit.ipd.sdq.kamp4aps.model.basic.BasicPackage;

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
public class ElectronicComponentsPackageImpl extends EPackageImpl implements ElectronicComponentsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass electronicPartEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass switchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ledEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass buttonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass microSwitchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass potentiometerEClass = null;

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
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ElectronicComponents.ElectronicComponentsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ElectronicComponentsPackageImpl() {
		super(eNS_URI, ElectronicComponentsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ElectronicComponentsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ElectronicComponentsPackage init() {
		if (isInited) return (ElectronicComponentsPackage)EPackage.Registry.INSTANCE.getEPackage(ElectronicComponentsPackage.eNS_URI);

		// Obtain or create and register package
		ElectronicComponentsPackageImpl theElectronicComponentsPackage = (ElectronicComponentsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ElectronicComponentsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ElectronicComponentsPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		BasicPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		apsPackageImpl theapsPackage = (apsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(apsPackage.eNS_URI) instanceof apsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(apsPackage.eNS_URI) : apsPackage.eINSTANCE);
		ComponentRepositoryPackageImpl theComponentRepositoryPackage = (ComponentRepositoryPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ComponentRepositoryPackage.eNS_URI) instanceof ComponentRepositoryPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ComponentRepositoryPackage.eNS_URI) : ComponentRepositoryPackage.eINSTANCE);
		BusComponentsPackageImpl theBusComponentsPackage = (BusComponentsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BusComponentsPackage.eNS_URI) instanceof BusComponentsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BusComponentsPackage.eNS_URI) : BusComponentsPackage.eINSTANCE);
		MechanicalComponentsPackageImpl theMechanicalComponentsPackage = (MechanicalComponentsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MechanicalComponentsPackage.eNS_URI) instanceof MechanicalComponentsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MechanicalComponentsPackage.eNS_URI) : MechanicalComponentsPackage.eINSTANCE);
		StructureRepositoryPackageImpl theStructureRepositoryPackage = (StructureRepositoryPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StructureRepositoryPackage.eNS_URI) instanceof StructureRepositoryPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StructureRepositoryPackage.eNS_URI) : StructureRepositoryPackage.eINSTANCE);
		ModuleRepositoryPackageImpl theModuleRepositoryPackage = (ModuleRepositoryPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ModuleRepositoryPackage.eNS_URI) instanceof ModuleRepositoryPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ModuleRepositoryPackage.eNS_URI) : ModuleRepositoryPackage.eINSTANCE);
		InterfaceRepositoryPackageImpl theInterfaceRepositoryPackage = (InterfaceRepositoryPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InterfaceRepositoryPackage.eNS_URI) instanceof InterfaceRepositoryPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InterfaceRepositoryPackage.eNS_URI) : InterfaceRepositoryPackage.eINSTANCE);

		// Create package meta-data objects
		theElectronicComponentsPackage.createPackageContents();
		theapsPackage.createPackageContents();
		theComponentRepositoryPackage.createPackageContents();
		theBusComponentsPackage.createPackageContents();
		theMechanicalComponentsPackage.createPackageContents();
		theStructureRepositoryPackage.createPackageContents();
		theModuleRepositoryPackage.createPackageContents();
		theInterfaceRepositoryPackage.createPackageContents();

		// Initialize created meta-data
		theElectronicComponentsPackage.initializePackageContents();
		theapsPackage.initializePackageContents();
		theComponentRepositoryPackage.initializePackageContents();
		theBusComponentsPackage.initializePackageContents();
		theMechanicalComponentsPackage.initializePackageContents();
		theStructureRepositoryPackage.initializePackageContents();
		theModuleRepositoryPackage.initializePackageContents();
		theInterfaceRepositoryPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theElectronicComponentsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ElectronicComponentsPackage.eNS_URI, theElectronicComponentsPackage);
		return theElectronicComponentsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElectronicPart() {
		return electronicPartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElectronicPart_Pin() {
		return (EReference)electronicPartEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElectronicPart_Physicalconnection() {
		return (EReference)electronicPartEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSwitch() {
		return switchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLED() {
		return ledEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getButton() {
		return buttonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMicroSwitch() {
		return microSwitchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMicroSwitch_MsModule() {
		return (EReference)microSwitchEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPotentiometer() {
		return potentiometerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElectronicComponentsFactory getElectronicComponentsFactory() {
		return (ElectronicComponentsFactory)getEFactoryInstance();
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
		electronicPartEClass = createEClass(ELECTRONIC_PART);
		createEReference(electronicPartEClass, ELECTRONIC_PART__PIN);
		createEReference(electronicPartEClass, ELECTRONIC_PART__PHYSICALCONNECTION);

		switchEClass = createEClass(SWITCH);

		ledEClass = createEClass(LED);

		buttonEClass = createEClass(BUTTON);

		microSwitchEClass = createEClass(MICRO_SWITCH);
		createEReference(microSwitchEClass, MICRO_SWITCH__MS_MODULE);

		potentiometerEClass = createEClass(POTENTIOMETER);
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
		InterfaceRepositoryPackage theInterfaceRepositoryPackage = (InterfaceRepositoryPackage)EPackage.Registry.INSTANCE.getEPackage(InterfaceRepositoryPackage.eNS_URI);
		ModuleRepositoryPackage theModuleRepositoryPackage = (ModuleRepositoryPackage)EPackage.Registry.INSTANCE.getEPackage(ModuleRepositoryPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		electronicPartEClass.getESuperTypes().add(theComponentRepositoryPackage.getComponent());
		switchEClass.getESuperTypes().add(this.getElectronicPart());
		ledEClass.getESuperTypes().add(this.getElectronicPart());
		buttonEClass.getESuperTypes().add(this.getElectronicPart());
		microSwitchEClass.getESuperTypes().add(this.getSwitch());
		potentiometerEClass.getESuperTypes().add(this.getElectronicPart());

		// Initialize classes, features, and operations; add parameters
		initEClass(electronicPartEClass, ElectronicPart.class, "ElectronicPart", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getElectronicPart_Pin(), theInterfaceRepositoryPackage.getSignalInterface(), null, "pin", null, 1, 1, ElectronicPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElectronicPart_Physicalconnection(), theInterfaceRepositoryPackage.getPhysicalConnection(), null, "physicalconnection", null, 1, 1, ElectronicPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(switchEClass, Switch.class, "Switch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ledEClass, edu.kit.ipd.sdq.kamp4aps.model.aPS.ElectronicComponents.LED.class, "LED", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(buttonEClass, Button.class, "Button", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(microSwitchEClass, MicroSwitch.class, "MicroSwitch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMicroSwitch_MsModule(), theModuleRepositoryPackage.getMicroswitchModule(), theModuleRepositoryPackage.getMicroswitchModule_Switch(), "msModule", null, 1, 1, MicroSwitch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(potentiometerEClass, Potentiometer.class, "Potentiometer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
	}

} //ElectronicComponentsPackageImpl
