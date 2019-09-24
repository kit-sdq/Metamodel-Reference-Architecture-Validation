/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.aPS.MechanicalComponents.impl;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.BusComponentsPackage;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.impl.BusComponentsPackageImpl;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.ComponentRepositoryPackage;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.ComponentRepositoryPackageImpl;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.ElectronicComponents.ElectronicComponentsPackage;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.ElectronicComponents.impl.ElectronicComponentsPackageImpl;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.InterfaceRepositoryPackage;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.impl.InterfaceRepositoryPackageImpl;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.MechanicalComponents.Arm;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.MechanicalComponents.GripperPart;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.MechanicalComponents.Housing;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.MechanicalComponents.MechanicalComponentsFactory;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.MechanicalComponents.MechanicalComponentsPackage;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.MechanicalComponents.MechanicalPart;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.MechanicalComponents.Pushhead;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.MechanicalComponents.Ramp;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.MechanicalComponents.ReturnSpring;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.MechanicalComponents.RubberBand;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.MechanicalComponents.Table;

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
public class MechanicalComponentsPackageImpl extends EPackageImpl implements MechanicalComponentsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mechanicalPartEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pushheadEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass housingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass returnSpringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rubberBandEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gripperPartEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass armEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rampEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tableEClass = null;

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
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.MechanicalComponents.MechanicalComponentsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MechanicalComponentsPackageImpl() {
		super(eNS_URI, MechanicalComponentsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link MechanicalComponentsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MechanicalComponentsPackage init() {
		if (isInited) return (MechanicalComponentsPackage)EPackage.Registry.INSTANCE.getEPackage(MechanicalComponentsPackage.eNS_URI);

		// Obtain or create and register package
		MechanicalComponentsPackageImpl theMechanicalComponentsPackage = (MechanicalComponentsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof MechanicalComponentsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new MechanicalComponentsPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		BasicPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		apsPackageImpl theapsPackage = (apsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(apsPackage.eNS_URI) instanceof apsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(apsPackage.eNS_URI) : apsPackage.eINSTANCE);
		ComponentRepositoryPackageImpl theComponentRepositoryPackage = (ComponentRepositoryPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ComponentRepositoryPackage.eNS_URI) instanceof ComponentRepositoryPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ComponentRepositoryPackage.eNS_URI) : ComponentRepositoryPackage.eINSTANCE);
		BusComponentsPackageImpl theBusComponentsPackage = (BusComponentsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BusComponentsPackage.eNS_URI) instanceof BusComponentsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BusComponentsPackage.eNS_URI) : BusComponentsPackage.eINSTANCE);
		ElectronicComponentsPackageImpl theElectronicComponentsPackage = (ElectronicComponentsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ElectronicComponentsPackage.eNS_URI) instanceof ElectronicComponentsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ElectronicComponentsPackage.eNS_URI) : ElectronicComponentsPackage.eINSTANCE);
		StructureRepositoryPackageImpl theStructureRepositoryPackage = (StructureRepositoryPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StructureRepositoryPackage.eNS_URI) instanceof StructureRepositoryPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StructureRepositoryPackage.eNS_URI) : StructureRepositoryPackage.eINSTANCE);
		ModuleRepositoryPackageImpl theModuleRepositoryPackage = (ModuleRepositoryPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ModuleRepositoryPackage.eNS_URI) instanceof ModuleRepositoryPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ModuleRepositoryPackage.eNS_URI) : ModuleRepositoryPackage.eINSTANCE);
		InterfaceRepositoryPackageImpl theInterfaceRepositoryPackage = (InterfaceRepositoryPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InterfaceRepositoryPackage.eNS_URI) instanceof InterfaceRepositoryPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InterfaceRepositoryPackage.eNS_URI) : InterfaceRepositoryPackage.eINSTANCE);

		// Create package meta-data objects
		theMechanicalComponentsPackage.createPackageContents();
		theapsPackage.createPackageContents();
		theComponentRepositoryPackage.createPackageContents();
		theBusComponentsPackage.createPackageContents();
		theElectronicComponentsPackage.createPackageContents();
		theStructureRepositoryPackage.createPackageContents();
		theModuleRepositoryPackage.createPackageContents();
		theInterfaceRepositoryPackage.createPackageContents();

		// Initialize created meta-data
		theMechanicalComponentsPackage.initializePackageContents();
		theapsPackage.initializePackageContents();
		theComponentRepositoryPackage.initializePackageContents();
		theBusComponentsPackage.initializePackageContents();
		theElectronicComponentsPackage.initializePackageContents();
		theStructureRepositoryPackage.initializePackageContents();
		theModuleRepositoryPackage.initializePackageContents();
		theInterfaceRepositoryPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMechanicalComponentsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MechanicalComponentsPackage.eNS_URI, theMechanicalComponentsPackage);
		return theMechanicalComponentsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMechanicalPart() {
		return mechanicalPartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMechanicalPart_Screwing() {
		return (EReference)mechanicalPartEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPushhead() {
		return pushheadEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHousing() {
		return housingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReturnSpring() {
		return returnSpringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRubberBand() {
		return rubberBandEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGripperPart() {
		return gripperPartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArm() {
		return armEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArm_MountedTo() {
		return (EReference)armEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRamp() {
		return rampEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRamp_Screwing_base() {
		return (EReference)rampEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRamp_Screwing_component() {
		return (EReference)rampEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRamp_Physicalconnection() {
		return (EReference)rampEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTable() {
		return tableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MechanicalComponentsFactory getMechanicalComponentsFactory() {
		return (MechanicalComponentsFactory)getEFactoryInstance();
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
		mechanicalPartEClass = createEClass(MECHANICAL_PART);
		createEReference(mechanicalPartEClass, MECHANICAL_PART__SCREWING);

		pushheadEClass = createEClass(PUSHHEAD);

		housingEClass = createEClass(HOUSING);

		returnSpringEClass = createEClass(RETURN_SPRING);

		rubberBandEClass = createEClass(RUBBER_BAND);

		gripperPartEClass = createEClass(GRIPPER_PART);

		armEClass = createEClass(ARM);
		createEReference(armEClass, ARM__MOUNTED_TO);

		rampEClass = createEClass(RAMP);
		createEReference(rampEClass, RAMP__SCREWING_BASE);
		createEReference(rampEClass, RAMP__SCREWING_COMPONENT);
		createEReference(rampEClass, RAMP__PHYSICALCONNECTION);

		tableEClass = createEClass(TABLE);
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
		StructureRepositoryPackage theStructureRepositoryPackage = (StructureRepositoryPackage)EPackage.Registry.INSTANCE.getEPackage(StructureRepositoryPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		mechanicalPartEClass.getESuperTypes().add(theComponentRepositoryPackage.getComponent());
		pushheadEClass.getESuperTypes().add(this.getMechanicalPart());
		housingEClass.getESuperTypes().add(this.getMechanicalPart());
		returnSpringEClass.getESuperTypes().add(this.getMechanicalPart());
		rubberBandEClass.getESuperTypes().add(this.getMechanicalPart());
		gripperPartEClass.getESuperTypes().add(theComponentRepositoryPackage.getMechanicalAssembly());
		armEClass.getESuperTypes().add(theComponentRepositoryPackage.getMechanicalAssembly());
		rampEClass.getESuperTypes().add(theComponentRepositoryPackage.getMechanicalAssembly());
		tableEClass.getESuperTypes().add(theComponentRepositoryPackage.getMechanicalAssembly());

		// Initialize classes, features, and operations; add parameters
		initEClass(mechanicalPartEClass, MechanicalPart.class, "MechanicalPart", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMechanicalPart_Screwing(), theInterfaceRepositoryPackage.getScrewing(), null, "screwing", null, 1, 1, MechanicalPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pushheadEClass, Pushhead.class, "Pushhead", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(housingEClass, Housing.class, "Housing", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(returnSpringEClass, ReturnSpring.class, "ReturnSpring", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(rubberBandEClass, RubberBand.class, "RubberBand", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(gripperPartEClass, GripperPart.class, "GripperPart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(armEClass, Arm.class, "Arm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArm_MountedTo(), theStructureRepositoryPackage.getCrane(), theStructureRepositoryPackage.getCrane_Arm(), "mountedTo", null, 1, 1, Arm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rampEClass, Ramp.class, "Ramp", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRamp_Screwing_base(), theInterfaceRepositoryPackage.getScrewing(), null, "screwing_base", null, 1, 1, Ramp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRamp_Screwing_component(), theInterfaceRepositoryPackage.getScrewing(), null, "screwing_component", null, 1, 1, Ramp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRamp_Physicalconnection(), theInterfaceRepositoryPackage.getPhysicalConnection(), null, "physicalconnection", null, 1, 1, Ramp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tableEClass, Table.class, "Table", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
	}

} //MechanicalComponentsPackageImpl
