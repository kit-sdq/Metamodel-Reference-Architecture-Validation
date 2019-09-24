/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository;

import edu.kit.ipd.sdq.kamp4aps.model.basic.BasicPackage;

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
 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.InterfaceRepositoryFactory
 * @model kind="package"
 * @generated
 */
public interface InterfaceRepositoryPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "InterfaceRepository";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "edu.kit.ipd.sdq.kaps.xppu.interfacerepository";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "InterfaceRepository";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	InterfaceRepositoryPackage eINSTANCE = edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.impl.InterfaceRepositoryPackageImpl.init();

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.impl.InterfaceRepositoryImpl <em>Interface Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.impl.InterfaceRepositoryImpl
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.impl.InterfaceRepositoryPackageImpl#getInterfaceRepository()
	 * @generated
	 */
	int INTERFACE_REPOSITORY = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_REPOSITORY__ID = BasicPackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_REPOSITORY__NAME = BasicPackage.ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>All Interfaces In Plant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_REPOSITORY__ALL_INTERFACES_IN_PLANT = BasicPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Interface Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_REPOSITORY_FEATURE_COUNT = BasicPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Interface Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_REPOSITORY_OPERATION_COUNT = BasicPackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.impl.InterfaceImpl <em>Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.impl.InterfaceImpl
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.impl.InterfaceRepositoryPackageImpl#getInterface()
	 * @generated
	 */
	int INTERFACE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__ID = BasicPackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__NAME = BasicPackage.ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Parent Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__PARENT_ELEMENT = BasicPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FEATURE_COUNT = BasicPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_OPERATION_COUNT = BasicPackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.impl.ScrewingImpl <em>Screwing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.impl.ScrewingImpl
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.impl.InterfaceRepositoryPackageImpl#getScrewing()
	 * @generated
	 */
	int SCREWING = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREWING__ID = INTERFACE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREWING__NAME = INTERFACE__NAME;

	/**
	 * The feature id for the '<em><b>Parent Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREWING__PARENT_ELEMENT = INTERFACE__PARENT_ELEMENT;

	/**
	 * The number of structural features of the '<em>Screwing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREWING_FEATURE_COUNT = INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Screwing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREWING_OPERATION_COUNT = INTERFACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.impl.ScrewingSplitterImpl <em>Screwing Splitter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.impl.ScrewingSplitterImpl
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.impl.InterfaceRepositoryPackageImpl#getScrewingSplitter()
	 * @generated
	 */
	int SCREWING_SPLITTER = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREWING_SPLITTER__ID = SCREWING__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREWING_SPLITTER__NAME = SCREWING__NAME;

	/**
	 * The feature id for the '<em><b>Parent Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREWING_SPLITTER__PARENT_ELEMENT = SCREWING__PARENT_ELEMENT;

	/**
	 * The number of structural features of the '<em>Screwing Splitter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREWING_SPLITTER_FEATURE_COUNT = SCREWING_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Screwing Splitter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREWING_SPLITTER_OPERATION_COUNT = SCREWING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.impl.ScrewingMotorImpl <em>Screwing Motor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.impl.ScrewingMotorImpl
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.impl.InterfaceRepositoryPackageImpl#getScrewingMotor()
	 * @generated
	 */
	int SCREWING_MOTOR = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREWING_MOTOR__ID = SCREWING__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREWING_MOTOR__NAME = SCREWING__NAME;

	/**
	 * The feature id for the '<em><b>Parent Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREWING_MOTOR__PARENT_ELEMENT = SCREWING__PARENT_ELEMENT;

	/**
	 * The number of structural features of the '<em>Screwing Motor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREWING_MOTOR_FEATURE_COUNT = SCREWING_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Screwing Motor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREWING_MOTOR_OPERATION_COUNT = SCREWING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.impl.ScrewingRackImpl <em>Screwing Rack</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.impl.ScrewingRackImpl
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.impl.InterfaceRepositoryPackageImpl#getScrewingRack()
	 * @generated
	 */
	int SCREWING_RACK = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREWING_RACK__ID = SCREWING__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREWING_RACK__NAME = SCREWING__NAME;

	/**
	 * The feature id for the '<em><b>Parent Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREWING_RACK__PARENT_ELEMENT = SCREWING__PARENT_ELEMENT;

	/**
	 * The number of structural features of the '<em>Screwing Rack</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREWING_RACK_FEATURE_COUNT = SCREWING_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Screwing Rack</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREWING_RACK_OPERATION_COUNT = SCREWING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.impl.ScrewingCylinderImpl <em>Screwing Cylinder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.impl.ScrewingCylinderImpl
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.impl.InterfaceRepositoryPackageImpl#getScrewingCylinder()
	 * @generated
	 */
	int SCREWING_CYLINDER = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREWING_CYLINDER__ID = SCREWING__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREWING_CYLINDER__NAME = SCREWING__NAME;

	/**
	 * The feature id for the '<em><b>Parent Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREWING_CYLINDER__PARENT_ELEMENT = SCREWING__PARENT_ELEMENT;

	/**
	 * The number of structural features of the '<em>Screwing Cylinder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREWING_CYLINDER_FEATURE_COUNT = SCREWING_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Screwing Cylinder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREWING_CYLINDER_OPERATION_COUNT = SCREWING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.impl.ScrewingFixtureImpl <em>Screwing Fixture</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.impl.ScrewingFixtureImpl
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.impl.InterfaceRepositoryPackageImpl#getScrewingFixture()
	 * @generated
	 */
	int SCREWING_FIXTURE = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREWING_FIXTURE__ID = SCREWING__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREWING_FIXTURE__NAME = SCREWING__NAME;

	/**
	 * The feature id for the '<em><b>Parent Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREWING_FIXTURE__PARENT_ELEMENT = SCREWING__PARENT_ELEMENT;

	/**
	 * The number of structural features of the '<em>Screwing Fixture</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREWING_FIXTURE_FEATURE_COUNT = SCREWING_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Screwing Fixture</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREWING_FIXTURE_OPERATION_COUNT = SCREWING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.impl.ScrewingPotentiometerImpl <em>Screwing Potentiometer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.impl.ScrewingPotentiometerImpl
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.impl.InterfaceRepositoryPackageImpl#getScrewingPotentiometer()
	 * @generated
	 */
	int SCREWING_POTENTIOMETER = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREWING_POTENTIOMETER__ID = SCREWING__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREWING_POTENTIOMETER__NAME = SCREWING__NAME;

	/**
	 * The feature id for the '<em><b>Parent Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREWING_POTENTIOMETER__PARENT_ELEMENT = SCREWING__PARENT_ELEMENT;

	/**
	 * The number of structural features of the '<em>Screwing Potentiometer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREWING_POTENTIOMETER_FEATURE_COUNT = SCREWING_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Screwing Potentiometer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREWING_POTENTIOMETER_OPERATION_COUNT = SCREWING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.impl.SuspensionImpl <em>Suspension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.impl.SuspensionImpl
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.impl.InterfaceRepositoryPackageImpl#getSuspension()
	 * @generated
	 */
	int SUSPENSION = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUSPENSION__ID = INTERFACE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUSPENSION__NAME = INTERFACE__NAME;

	/**
	 * The feature id for the '<em><b>Parent Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUSPENSION__PARENT_ELEMENT = INTERFACE__PARENT_ELEMENT;

	/**
	 * The number of structural features of the '<em>Suspension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUSPENSION_FEATURE_COUNT = INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Suspension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUSPENSION_OPERATION_COUNT = INTERFACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.impl.SuspensionRackImpl <em>Suspension Rack</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.impl.SuspensionRackImpl
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.impl.InterfaceRepositoryPackageImpl#getSuspensionRack()
	 * @generated
	 */
	int SUSPENSION_RACK = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUSPENSION_RACK__ID = SUSPENSION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUSPENSION_RACK__NAME = SUSPENSION__NAME;

	/**
	 * The feature id for the '<em><b>Parent Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUSPENSION_RACK__PARENT_ELEMENT = SUSPENSION__PARENT_ELEMENT;

	/**
	 * The number of structural features of the '<em>Suspension Rack</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUSPENSION_RACK_FEATURE_COUNT = SUSPENSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Suspension Rack</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUSPENSION_RACK_OPERATION_COUNT = SUSPENSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.impl.SuspensionArmImpl <em>Suspension Arm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.impl.SuspensionArmImpl
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.impl.InterfaceRepositoryPackageImpl#getSuspensionArm()
	 * @generated
	 */
	int SUSPENSION_ARM = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUSPENSION_ARM__ID = SUSPENSION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUSPENSION_ARM__NAME = SUSPENSION__NAME;

	/**
	 * The feature id for the '<em><b>Parent Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUSPENSION_ARM__PARENT_ELEMENT = SUSPENSION__PARENT_ELEMENT;

	/**
	 * The number of structural features of the '<em>Suspension Arm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUSPENSION_ARM_FEATURE_COUNT = SUSPENSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Suspension Arm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUSPENSION_ARM_OPERATION_COUNT = SUSPENSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.impl.GearingImpl <em>Gearing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.impl.GearingImpl
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.impl.InterfaceRepositoryPackageImpl#getGearing()
	 * @generated
	 */
	int GEARING = 12;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEARING__ID = INTERFACE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEARING__NAME = INTERFACE__NAME;

	/**
	 * The feature id for the '<em><b>Parent Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEARING__PARENT_ELEMENT = INTERFACE__PARENT_ELEMENT;

	/**
	 * The number of structural features of the '<em>Gearing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEARING_FEATURE_COUNT = INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Gearing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEARING_OPERATION_COUNT = INTERFACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.impl.ClampingImpl <em>Clamping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.impl.ClampingImpl
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.impl.InterfaceRepositoryPackageImpl#getClamping()
	 * @generated
	 */
	int CLAMPING = 13;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAMPING__ID = INTERFACE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAMPING__NAME = INTERFACE__NAME;

	/**
	 * The feature id for the '<em><b>Parent Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAMPING__PARENT_ELEMENT = INTERFACE__PARENT_ELEMENT;

	/**
	 * The number of structural features of the '<em>Clamping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAMPING_FEATURE_COUNT = INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Clamping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAMPING_OPERATION_COUNT = INTERFACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.impl.PneumaticSupplyImpl <em>Pneumatic Supply</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.impl.PneumaticSupplyImpl
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.impl.InterfaceRepositoryPackageImpl#getPneumaticSupply()
	 * @generated
	 */
	int PNEUMATIC_SUPPLY = 14;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PNEUMATIC_SUPPLY__ID = INTERFACE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PNEUMATIC_SUPPLY__NAME = INTERFACE__NAME;

	/**
	 * The feature id for the '<em><b>Parent Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PNEUMATIC_SUPPLY__PARENT_ELEMENT = INTERFACE__PARENT_ELEMENT;

	/**
	 * The number of structural features of the '<em>Pneumatic Supply</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PNEUMATIC_SUPPLY_FEATURE_COUNT = INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Pneumatic Supply</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PNEUMATIC_SUPPLY_OPERATION_COUNT = INTERFACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.impl.SignalInterfaceImpl <em>Signal Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.impl.SignalInterfaceImpl
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.impl.InterfaceRepositoryPackageImpl#getSignalInterface()
	 * @generated
	 */
	int SIGNAL_INTERFACE = 15;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_INTERFACE__ID = INTERFACE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_INTERFACE__NAME = INTERFACE__NAME;

	/**
	 * The feature id for the '<em><b>Parent Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_INTERFACE__PARENT_ELEMENT = INTERFACE__PARENT_ELEMENT;

	/**
	 * The number of structural features of the '<em>Signal Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_INTERFACE_FEATURE_COUNT = INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Signal Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_INTERFACE_OPERATION_COUNT = INTERFACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.impl.WaterSupplyImpl <em>Water Supply</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.impl.WaterSupplyImpl
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.impl.InterfaceRepositoryPackageImpl#getWaterSupply()
	 * @generated
	 */
	int WATER_SUPPLY = 16;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATER_SUPPLY__ID = INTERFACE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATER_SUPPLY__NAME = INTERFACE__NAME;

	/**
	 * The feature id for the '<em><b>Parent Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATER_SUPPLY__PARENT_ELEMENT = INTERFACE__PARENT_ELEMENT;

	/**
	 * The number of structural features of the '<em>Water Supply</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATER_SUPPLY_FEATURE_COUNT = INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Water Supply</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATER_SUPPLY_OPERATION_COUNT = INTERFACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.impl.PhysicalConnectionImpl <em>Physical Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.impl.PhysicalConnectionImpl
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.impl.InterfaceRepositoryPackageImpl#getPhysicalConnection()
	 * @generated
	 */
	int PHYSICAL_CONNECTION = 17;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_CONNECTION__ID = INTERFACE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_CONNECTION__NAME = INTERFACE__NAME;

	/**
	 * The feature id for the '<em><b>Parent Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_CONNECTION__PARENT_ELEMENT = INTERFACE__PARENT_ELEMENT;

	/**
	 * The number of structural features of the '<em>Physical Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_CONNECTION_FEATURE_COUNT = INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Physical Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_CONNECTION_OPERATION_COUNT = INTERFACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.impl.TransportConnectionImpl <em>Transport Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.impl.TransportConnectionImpl
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.impl.InterfaceRepositoryPackageImpl#getTransportConnection()
	 * @generated
	 */
	int TRANSPORT_CONNECTION = 18;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT_CONNECTION__ID = INTERFACE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT_CONNECTION__NAME = INTERFACE__NAME;

	/**
	 * The feature id for the '<em><b>Parent Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT_CONNECTION__PARENT_ELEMENT = INTERFACE__PARENT_ELEMENT;

	/**
	 * The number of structural features of the '<em>Transport Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT_CONNECTION_FEATURE_COUNT = INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Transport Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT_CONNECTION_OPERATION_COUNT = INTERFACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.impl.FixtureImpl <em>Fixture</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.impl.FixtureImpl
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.impl.InterfaceRepositoryPackageImpl#getFixture()
	 * @generated
	 */
	int FIXTURE = 19;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXTURE__ID = INTERFACE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXTURE__NAME = INTERFACE__NAME;

	/**
	 * The feature id for the '<em><b>Parent Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXTURE__PARENT_ELEMENT = INTERFACE__PARENT_ELEMENT;

	/**
	 * The number of structural features of the '<em>Fixture</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXTURE_FEATURE_COUNT = INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Fixture</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXTURE_OPERATION_COUNT = INTERFACE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.InterfaceRepository <em>Interface Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface Repository</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.InterfaceRepository
	 * @generated
	 */
	EClass getInterfaceRepository();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.InterfaceRepository#getAllInterfacesInPlant <em>All Interfaces In Plant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>All Interfaces In Plant</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.InterfaceRepository#getAllInterfacesInPlant()
	 * @see #getInterfaceRepository()
	 * @generated
	 */
	EReference getInterfaceRepository_AllInterfacesInPlant();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.Interface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.Interface
	 * @generated
	 */
	EClass getInterface();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.Interface#getParentElement <em>Parent Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Parent Element</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.Interface#getParentElement()
	 * @see #getInterface()
	 * @generated
	 */
	EReference getInterface_ParentElement();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.Screwing <em>Screwing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Screwing</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.Screwing
	 * @generated
	 */
	EClass getScrewing();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.ScrewingSplitter <em>Screwing Splitter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Screwing Splitter</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.ScrewingSplitter
	 * @generated
	 */
	EClass getScrewingSplitter();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.ScrewingMotor <em>Screwing Motor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Screwing Motor</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.ScrewingMotor
	 * @generated
	 */
	EClass getScrewingMotor();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.ScrewingRack <em>Screwing Rack</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Screwing Rack</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.ScrewingRack
	 * @generated
	 */
	EClass getScrewingRack();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.ScrewingCylinder <em>Screwing Cylinder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Screwing Cylinder</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.ScrewingCylinder
	 * @generated
	 */
	EClass getScrewingCylinder();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.ScrewingFixture <em>Screwing Fixture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Screwing Fixture</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.ScrewingFixture
	 * @generated
	 */
	EClass getScrewingFixture();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.ScrewingPotentiometer <em>Screwing Potentiometer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Screwing Potentiometer</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.ScrewingPotentiometer
	 * @generated
	 */
	EClass getScrewingPotentiometer();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.Suspension <em>Suspension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Suspension</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.Suspension
	 * @generated
	 */
	EClass getSuspension();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.SuspensionRack <em>Suspension Rack</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Suspension Rack</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.SuspensionRack
	 * @generated
	 */
	EClass getSuspensionRack();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.SuspensionArm <em>Suspension Arm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Suspension Arm</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.SuspensionArm
	 * @generated
	 */
	EClass getSuspensionArm();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.Gearing <em>Gearing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gearing</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.Gearing
	 * @generated
	 */
	EClass getGearing();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.Clamping <em>Clamping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clamping</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.Clamping
	 * @generated
	 */
	EClass getClamping();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.PneumaticSupply <em>Pneumatic Supply</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pneumatic Supply</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.PneumaticSupply
	 * @generated
	 */
	EClass getPneumaticSupply();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.SignalInterface <em>Signal Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Signal Interface</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.SignalInterface
	 * @generated
	 */
	EClass getSignalInterface();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.WaterSupply <em>Water Supply</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Water Supply</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.WaterSupply
	 * @generated
	 */
	EClass getWaterSupply();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.PhysicalConnection <em>Physical Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Physical Connection</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.PhysicalConnection
	 * @generated
	 */
	EClass getPhysicalConnection();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.TransportConnection <em>Transport Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transport Connection</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.TransportConnection
	 * @generated
	 */
	EClass getTransportConnection();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.Fixture <em>Fixture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fixture</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.Fixture
	 * @generated
	 */
	EClass getFixture();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	InterfaceRepositoryFactory getInterfaceRepositoryFactory();

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
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.impl.InterfaceRepositoryImpl <em>Interface Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.impl.InterfaceRepositoryImpl
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.impl.InterfaceRepositoryPackageImpl#getInterfaceRepository()
		 * @generated
		 */
		EClass INTERFACE_REPOSITORY = eINSTANCE.getInterfaceRepository();

		/**
		 * The meta object literal for the '<em><b>All Interfaces In Plant</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_REPOSITORY__ALL_INTERFACES_IN_PLANT = eINSTANCE.getInterfaceRepository_AllInterfacesInPlant();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.impl.InterfaceImpl <em>Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.impl.InterfaceImpl
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.impl.InterfaceRepositoryPackageImpl#getInterface()
		 * @generated
		 */
		EClass INTERFACE = eINSTANCE.getInterface();

		/**
		 * The meta object literal for the '<em><b>Parent Element</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE__PARENT_ELEMENT = eINSTANCE.getInterface_ParentElement();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.impl.ScrewingImpl <em>Screwing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.impl.ScrewingImpl
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.impl.InterfaceRepositoryPackageImpl#getScrewing()
		 * @generated
		 */
		EClass SCREWING = eINSTANCE.getScrewing();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.impl.ScrewingSplitterImpl <em>Screwing Splitter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.impl.ScrewingSplitterImpl
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.impl.InterfaceRepositoryPackageImpl#getScrewingSplitter()
		 * @generated
		 */
		EClass SCREWING_SPLITTER = eINSTANCE.getScrewingSplitter();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.impl.ScrewingMotorImpl <em>Screwing Motor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.impl.ScrewingMotorImpl
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.impl.InterfaceRepositoryPackageImpl#getScrewingMotor()
		 * @generated
		 */
		EClass SCREWING_MOTOR = eINSTANCE.getScrewingMotor();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.impl.ScrewingRackImpl <em>Screwing Rack</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.impl.ScrewingRackImpl
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.impl.InterfaceRepositoryPackageImpl#getScrewingRack()
		 * @generated
		 */
		EClass SCREWING_RACK = eINSTANCE.getScrewingRack();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.impl.ScrewingCylinderImpl <em>Screwing Cylinder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.impl.ScrewingCylinderImpl
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.impl.InterfaceRepositoryPackageImpl#getScrewingCylinder()
		 * @generated
		 */
		EClass SCREWING_CYLINDER = eINSTANCE.getScrewingCylinder();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.impl.ScrewingFixtureImpl <em>Screwing Fixture</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.impl.ScrewingFixtureImpl
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.impl.InterfaceRepositoryPackageImpl#getScrewingFixture()
		 * @generated
		 */
		EClass SCREWING_FIXTURE = eINSTANCE.getScrewingFixture();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.impl.ScrewingPotentiometerImpl <em>Screwing Potentiometer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.impl.ScrewingPotentiometerImpl
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.impl.InterfaceRepositoryPackageImpl#getScrewingPotentiometer()
		 * @generated
		 */
		EClass SCREWING_POTENTIOMETER = eINSTANCE.getScrewingPotentiometer();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.impl.SuspensionImpl <em>Suspension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.impl.SuspensionImpl
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.impl.InterfaceRepositoryPackageImpl#getSuspension()
		 * @generated
		 */
		EClass SUSPENSION = eINSTANCE.getSuspension();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.impl.SuspensionRackImpl <em>Suspension Rack</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.impl.SuspensionRackImpl
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.impl.InterfaceRepositoryPackageImpl#getSuspensionRack()
		 * @generated
		 */
		EClass SUSPENSION_RACK = eINSTANCE.getSuspensionRack();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.impl.SuspensionArmImpl <em>Suspension Arm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.impl.SuspensionArmImpl
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.impl.InterfaceRepositoryPackageImpl#getSuspensionArm()
		 * @generated
		 */
		EClass SUSPENSION_ARM = eINSTANCE.getSuspensionArm();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.impl.GearingImpl <em>Gearing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.impl.GearingImpl
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.impl.InterfaceRepositoryPackageImpl#getGearing()
		 * @generated
		 */
		EClass GEARING = eINSTANCE.getGearing();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.impl.ClampingImpl <em>Clamping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.impl.ClampingImpl
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.impl.InterfaceRepositoryPackageImpl#getClamping()
		 * @generated
		 */
		EClass CLAMPING = eINSTANCE.getClamping();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.impl.PneumaticSupplyImpl <em>Pneumatic Supply</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.impl.PneumaticSupplyImpl
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.impl.InterfaceRepositoryPackageImpl#getPneumaticSupply()
		 * @generated
		 */
		EClass PNEUMATIC_SUPPLY = eINSTANCE.getPneumaticSupply();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.impl.SignalInterfaceImpl <em>Signal Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.impl.SignalInterfaceImpl
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.impl.InterfaceRepositoryPackageImpl#getSignalInterface()
		 * @generated
		 */
		EClass SIGNAL_INTERFACE = eINSTANCE.getSignalInterface();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.impl.WaterSupplyImpl <em>Water Supply</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.impl.WaterSupplyImpl
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.impl.InterfaceRepositoryPackageImpl#getWaterSupply()
		 * @generated
		 */
		EClass WATER_SUPPLY = eINSTANCE.getWaterSupply();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.impl.PhysicalConnectionImpl <em>Physical Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.impl.PhysicalConnectionImpl
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.impl.InterfaceRepositoryPackageImpl#getPhysicalConnection()
		 * @generated
		 */
		EClass PHYSICAL_CONNECTION = eINSTANCE.getPhysicalConnection();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.impl.TransportConnectionImpl <em>Transport Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.impl.TransportConnectionImpl
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.impl.InterfaceRepositoryPackageImpl#getTransportConnection()
		 * @generated
		 */
		EClass TRANSPORT_CONNECTION = eINSTANCE.getTransportConnection();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.impl.FixtureImpl <em>Fixture</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.impl.FixtureImpl
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.impl.InterfaceRepositoryPackageImpl#getFixture()
		 * @generated
		 */
		EClass FIXTURE = eINSTANCE.getFixture();

	}

} //InterfaceRepositoryPackage
