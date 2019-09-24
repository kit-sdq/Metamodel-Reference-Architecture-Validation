/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository;

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
 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.ModuleRepositoryFactory
 * @model kind="package"
 * @generated
 */
public interface ModuleRepositoryPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ModuleRepository";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "edu.kit.ipd.sdq.kaps.xppu.modulerepository";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ModuleRepository";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModuleRepositoryPackage eINSTANCE = edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.impl.ModuleRepositoryPackageImpl.init();

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.impl.ModuleImpl <em>Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.impl.ModuleImpl
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.impl.ModuleRepositoryPackageImpl#getModule()
	 * @generated
	 */
	int MODULE = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__ID = BasicPackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__NAME = BasicPackage.ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Parent Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__PARENT_ENTITY = BasicPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__MODULES = BasicPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__COMPONENTS = BasicPackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__INTERFACES = BasicPackage.ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_FEATURE_COUNT = BasicPackage.ENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_OPERATION_COUNT = BasicPackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.impl.MicroswitchModuleImpl <em>Microswitch Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.impl.MicroswitchModuleImpl
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.impl.ModuleRepositoryPackageImpl#getMicroswitchModule()
	 * @generated
	 */
	int MICROSWITCH_MODULE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSWITCH_MODULE__ID = MODULE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSWITCH_MODULE__NAME = MODULE__NAME;

	/**
	 * The feature id for the '<em><b>Parent Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSWITCH_MODULE__PARENT_ENTITY = MODULE__PARENT_ENTITY;

	/**
	 * The feature id for the '<em><b>Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSWITCH_MODULE__MODULES = MODULE__MODULES;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSWITCH_MODULE__COMPONENTS = MODULE__COMPONENTS;

	/**
	 * The feature id for the '<em><b>Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSWITCH_MODULE__INTERFACES = MODULE__INTERFACES;

	/**
	 * The feature id for the '<em><b>Bus Slave</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSWITCH_MODULE__BUS_SLAVE = MODULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Switch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSWITCH_MODULE__SWITCH = MODULE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Microswitch Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSWITCH_MODULE_FEATURE_COUNT = MODULE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Microswitch Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSWITCH_MODULE_OPERATION_COUNT = MODULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.impl.PotentiometerModuleImpl <em>Potentiometer Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.impl.PotentiometerModuleImpl
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.impl.ModuleRepositoryPackageImpl#getPotentiometerModule()
	 * @generated
	 */
	int POTENTIOMETER_MODULE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POTENTIOMETER_MODULE__ID = MODULE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POTENTIOMETER_MODULE__NAME = MODULE__NAME;

	/**
	 * The feature id for the '<em><b>Parent Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POTENTIOMETER_MODULE__PARENT_ENTITY = MODULE__PARENT_ENTITY;

	/**
	 * The feature id for the '<em><b>Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POTENTIOMETER_MODULE__MODULES = MODULE__MODULES;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POTENTIOMETER_MODULE__COMPONENTS = MODULE__COMPONENTS;

	/**
	 * The feature id for the '<em><b>Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POTENTIOMETER_MODULE__INTERFACES = MODULE__INTERFACES;

	/**
	 * The feature id for the '<em><b>Poti</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POTENTIOMETER_MODULE__POTI = MODULE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Potentiometer Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POTENTIOMETER_MODULE_FEATURE_COUNT = MODULE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Potentiometer Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POTENTIOMETER_MODULE_OPERATION_COUNT = MODULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.impl.ModuleRepositoryImpl <em>Module Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.impl.ModuleRepositoryImpl
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.impl.ModuleRepositoryPackageImpl#getModuleRepository()
	 * @generated
	 */
	int MODULE_REPOSITORY = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_REPOSITORY__ID = BasicPackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_REPOSITORY__NAME = BasicPackage.ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>All Modules In Plant</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_REPOSITORY__ALL_MODULES_IN_PLANT = BasicPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Module Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_REPOSITORY_FEATURE_COUNT = BasicPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Module Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_REPOSITORY_OPERATION_COUNT = BasicPackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.impl.RampModuleImpl <em>Ramp Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.impl.RampModuleImpl
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.impl.ModuleRepositoryPackageImpl#getRampModule()
	 * @generated
	 */
	int RAMP_MODULE = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAMP_MODULE__ID = MODULE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAMP_MODULE__NAME = MODULE__NAME;

	/**
	 * The feature id for the '<em><b>Parent Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAMP_MODULE__PARENT_ENTITY = MODULE__PARENT_ENTITY;

	/**
	 * The feature id for the '<em><b>Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAMP_MODULE__MODULES = MODULE__MODULES;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAMP_MODULE__COMPONENTS = MODULE__COMPONENTS;

	/**
	 * The feature id for the '<em><b>Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAMP_MODULE__INTERFACES = MODULE__INTERFACES;

	/**
	 * The number of structural features of the '<em>Ramp Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAMP_MODULE_FEATURE_COUNT = MODULE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Ramp Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAMP_MODULE_OPERATION_COUNT = MODULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.impl.PusherModuleImpl <em>Pusher Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.impl.PusherModuleImpl
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.impl.ModuleRepositoryPackageImpl#getPusherModule()
	 * @generated
	 */
	int PUSHER_MODULE = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSHER_MODULE__ID = MODULE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSHER_MODULE__NAME = MODULE__NAME;

	/**
	 * The feature id for the '<em><b>Parent Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSHER_MODULE__PARENT_ENTITY = MODULE__PARENT_ENTITY;

	/**
	 * The feature id for the '<em><b>Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSHER_MODULE__MODULES = MODULE__MODULES;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSHER_MODULE__COMPONENTS = MODULE__COMPONENTS;

	/**
	 * The feature id for the '<em><b>Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSHER_MODULE__INTERFACES = MODULE__INTERFACES;

	/**
	 * The number of structural features of the '<em>Pusher Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSHER_MODULE_FEATURE_COUNT = MODULE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Pusher Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSHER_MODULE_OPERATION_COUNT = MODULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.impl.MotorModuleImpl <em>Motor Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.impl.MotorModuleImpl
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.impl.ModuleRepositoryPackageImpl#getMotorModule()
	 * @generated
	 */
	int MOTOR_MODULE = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTOR_MODULE__ID = MODULE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTOR_MODULE__NAME = MODULE__NAME;

	/**
	 * The feature id for the '<em><b>Parent Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTOR_MODULE__PARENT_ENTITY = MODULE__PARENT_ENTITY;

	/**
	 * The feature id for the '<em><b>Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTOR_MODULE__MODULES = MODULE__MODULES;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTOR_MODULE__COMPONENTS = MODULE__COMPONENTS;

	/**
	 * The feature id for the '<em><b>Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTOR_MODULE__INTERFACES = MODULE__INTERFACES;

	/**
	 * The feature id for the '<em><b>Simple Motor</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTOR_MODULE__SIMPLE_MOTOR = MODULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Bus Slave</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTOR_MODULE__BUS_SLAVE = MODULE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Bus Box</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTOR_MODULE__BUS_BOX = MODULE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Bus Cable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTOR_MODULE__BUS_CABLE = MODULE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Motor Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTOR_MODULE_FEATURE_COUNT = MODULE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Motor Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTOR_MODULE_OPERATION_COUNT = MODULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.impl.SensorModuleImpl <em>Sensor Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.impl.SensorModuleImpl
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.impl.ModuleRepositoryPackageImpl#getSensorModule()
	 * @generated
	 */
	int SENSOR_MODULE = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_MODULE__ID = MODULE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_MODULE__NAME = MODULE__NAME;

	/**
	 * The feature id for the '<em><b>Parent Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_MODULE__PARENT_ENTITY = MODULE__PARENT_ENTITY;

	/**
	 * The feature id for the '<em><b>Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_MODULE__MODULES = MODULE__MODULES;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_MODULE__COMPONENTS = MODULE__COMPONENTS;

	/**
	 * The feature id for the '<em><b>Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_MODULE__INTERFACES = MODULE__INTERFACES;

	/**
	 * The number of structural features of the '<em>Sensor Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_MODULE_FEATURE_COUNT = MODULE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sensor Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_MODULE_OPERATION_COUNT = MODULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.impl.OpticalSensorModuleImpl <em>Optical Sensor Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.impl.OpticalSensorModuleImpl
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.impl.ModuleRepositoryPackageImpl#getOpticalSensorModule()
	 * @generated
	 */
	int OPTICAL_SENSOR_MODULE = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTICAL_SENSOR_MODULE__ID = MODULE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTICAL_SENSOR_MODULE__NAME = MODULE__NAME;

	/**
	 * The feature id for the '<em><b>Parent Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTICAL_SENSOR_MODULE__PARENT_ENTITY = MODULE__PARENT_ENTITY;

	/**
	 * The feature id for the '<em><b>Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTICAL_SENSOR_MODULE__MODULES = MODULE__MODULES;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTICAL_SENSOR_MODULE__COMPONENTS = MODULE__COMPONENTS;

	/**
	 * The feature id for the '<em><b>Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTICAL_SENSOR_MODULE__INTERFACES = MODULE__INTERFACES;

	/**
	 * The feature id for the '<em><b>Optical Sensor</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTICAL_SENSOR_MODULE__OPTICAL_SENSOR = MODULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Bus Slave</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTICAL_SENSOR_MODULE__BUS_SLAVE = MODULE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Optical Sensor Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTICAL_SENSOR_MODULE_FEATURE_COUNT = MODULE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Optical Sensor Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTICAL_SENSOR_MODULE_OPERATION_COUNT = MODULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.impl.InductiveSensorModuleImpl <em>Inductive Sensor Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.impl.InductiveSensorModuleImpl
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.impl.ModuleRepositoryPackageImpl#getInductiveSensorModule()
	 * @generated
	 */
	int INDUCTIVE_SENSOR_MODULE = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDUCTIVE_SENSOR_MODULE__ID = MODULE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDUCTIVE_SENSOR_MODULE__NAME = MODULE__NAME;

	/**
	 * The feature id for the '<em><b>Parent Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDUCTIVE_SENSOR_MODULE__PARENT_ENTITY = MODULE__PARENT_ENTITY;

	/**
	 * The feature id for the '<em><b>Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDUCTIVE_SENSOR_MODULE__MODULES = MODULE__MODULES;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDUCTIVE_SENSOR_MODULE__COMPONENTS = MODULE__COMPONENTS;

	/**
	 * The feature id for the '<em><b>Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDUCTIVE_SENSOR_MODULE__INTERFACES = MODULE__INTERFACES;

	/**
	 * The feature id for the '<em><b>Inductive Sensor</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDUCTIVE_SENSOR_MODULE__INDUCTIVE_SENSOR = MODULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Bus Slave</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDUCTIVE_SENSOR_MODULE__BUS_SLAVE = MODULE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Inductive Sensor Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDUCTIVE_SENSOR_MODULE_FEATURE_COUNT = MODULE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Inductive Sensor Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDUCTIVE_SENSOR_MODULE_OPERATION_COUNT = MODULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.impl.PresenceSensorModuleImpl <em>Presence Sensor Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.impl.PresenceSensorModuleImpl
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.impl.ModuleRepositoryPackageImpl#getPresenceSensorModule()
	 * @generated
	 */
	int PRESENCE_SENSOR_MODULE = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENCE_SENSOR_MODULE__ID = MODULE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENCE_SENSOR_MODULE__NAME = MODULE__NAME;

	/**
	 * The feature id for the '<em><b>Parent Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENCE_SENSOR_MODULE__PARENT_ENTITY = MODULE__PARENT_ENTITY;

	/**
	 * The feature id for the '<em><b>Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENCE_SENSOR_MODULE__MODULES = MODULE__MODULES;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENCE_SENSOR_MODULE__COMPONENTS = MODULE__COMPONENTS;

	/**
	 * The feature id for the '<em><b>Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENCE_SENSOR_MODULE__INTERFACES = MODULE__INTERFACES;

	/**
	 * The feature id for the '<em><b>Presence Sensor</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENCE_SENSOR_MODULE__PRESENCE_SENSOR = MODULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Bus Slave</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENCE_SENSOR_MODULE__BUS_SLAVE = MODULE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Presence Sensor Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENCE_SENSOR_MODULE_FEATURE_COUNT = MODULE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Presence Sensor Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENCE_SENSOR_MODULE_OPERATION_COUNT = MODULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.impl.PressureSensorModuleImpl <em>Pressure Sensor Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.impl.PressureSensorModuleImpl
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.impl.ModuleRepositoryPackageImpl#getPressureSensorModule()
	 * @generated
	 */
	int PRESSURE_SENSOR_MODULE = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESSURE_SENSOR_MODULE__ID = MODULE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESSURE_SENSOR_MODULE__NAME = MODULE__NAME;

	/**
	 * The feature id for the '<em><b>Parent Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESSURE_SENSOR_MODULE__PARENT_ENTITY = MODULE__PARENT_ENTITY;

	/**
	 * The feature id for the '<em><b>Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESSURE_SENSOR_MODULE__MODULES = MODULE__MODULES;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESSURE_SENSOR_MODULE__COMPONENTS = MODULE__COMPONENTS;

	/**
	 * The feature id for the '<em><b>Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESSURE_SENSOR_MODULE__INTERFACES = MODULE__INTERFACES;

	/**
	 * The number of structural features of the '<em>Pressure Sensor Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESSURE_SENSOR_MODULE_FEATURE_COUNT = MODULE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Pressure Sensor Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESSURE_SENSOR_MODULE_OPERATION_COUNT = MODULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.impl.ConveyorBeltModuleImpl <em>Conveyor Belt Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.impl.ConveyorBeltModuleImpl
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.impl.ModuleRepositoryPackageImpl#getConveyorBeltModule()
	 * @generated
	 */
	int CONVEYOR_BELT_MODULE = 12;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVEYOR_BELT_MODULE__ID = MODULE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVEYOR_BELT_MODULE__NAME = MODULE__NAME;

	/**
	 * The feature id for the '<em><b>Parent Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVEYOR_BELT_MODULE__PARENT_ENTITY = MODULE__PARENT_ENTITY;

	/**
	 * The feature id for the '<em><b>Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVEYOR_BELT_MODULE__MODULES = MODULE__MODULES;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVEYOR_BELT_MODULE__COMPONENTS = MODULE__COMPONENTS;

	/**
	 * The feature id for the '<em><b>Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVEYOR_BELT_MODULE__INTERFACES = MODULE__INTERFACES;

	/**
	 * The feature id for the '<em><b>Rubber Band</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVEYOR_BELT_MODULE__RUBBER_BAND = MODULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Frame</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVEYOR_BELT_MODULE__FRAME = MODULE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Conveyor Belt Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVEYOR_BELT_MODULE_FEATURE_COUNT = MODULE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Conveyor Belt Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVEYOR_BELT_MODULE_OPERATION_COUNT = MODULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.impl.VacuumGripperModuleImpl <em>Vacuum Gripper Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.impl.VacuumGripperModuleImpl
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.impl.ModuleRepositoryPackageImpl#getVacuumGripperModule()
	 * @generated
	 */
	int VACUUM_GRIPPER_MODULE = 13;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VACUUM_GRIPPER_MODULE__ID = MODULE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VACUUM_GRIPPER_MODULE__NAME = MODULE__NAME;

	/**
	 * The feature id for the '<em><b>Parent Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VACUUM_GRIPPER_MODULE__PARENT_ENTITY = MODULE__PARENT_ENTITY;

	/**
	 * The feature id for the '<em><b>Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VACUUM_GRIPPER_MODULE__MODULES = MODULE__MODULES;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VACUUM_GRIPPER_MODULE__COMPONENTS = MODULE__COMPONENTS;

	/**
	 * The feature id for the '<em><b>Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VACUUM_GRIPPER_MODULE__INTERFACES = MODULE__INTERFACES;

	/**
	 * The number of structural features of the '<em>Vacuum Gripper Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VACUUM_GRIPPER_MODULE_FEATURE_COUNT = MODULE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Vacuum Gripper Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VACUUM_GRIPPER_MODULE_OPERATION_COUNT = MODULE_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.impl.MonostableCylinderModuleImpl <em>Monostable Cylinder Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.impl.MonostableCylinderModuleImpl
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.impl.ModuleRepositoryPackageImpl#getMonostableCylinderModule()
	 * @generated
	 */
	int MONOSTABLE_CYLINDER_MODULE = 14;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONOSTABLE_CYLINDER_MODULE__ID = MODULE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONOSTABLE_CYLINDER_MODULE__NAME = MODULE__NAME;

	/**
	 * The feature id for the '<em><b>Parent Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONOSTABLE_CYLINDER_MODULE__PARENT_ENTITY = MODULE__PARENT_ENTITY;

	/**
	 * The feature id for the '<em><b>Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONOSTABLE_CYLINDER_MODULE__MODULES = MODULE__MODULES;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONOSTABLE_CYLINDER_MODULE__COMPONENTS = MODULE__COMPONENTS;

	/**
	 * The feature id for the '<em><b>Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONOSTABLE_CYLINDER_MODULE__INTERFACES = MODULE__INTERFACES;

	/**
	 * The number of structural features of the '<em>Monostable Cylinder Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONOSTABLE_CYLINDER_MODULE_FEATURE_COUNT = MODULE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Monostable Cylinder Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONOSTABLE_CYLINDER_MODULE_OPERATION_COUNT = MODULE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.MicroswitchModule <em>Microswitch Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Microswitch Module</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.MicroswitchModule
	 * @generated
	 */
	EClass getMicroswitchModule();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.MicroswitchModule#getBusSlave <em>Bus Slave</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bus Slave</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.MicroswitchModule#getBusSlave()
	 * @see #getMicroswitchModule()
	 * @generated
	 */
	EReference getMicroswitchModule_BusSlave();

	/**
	 * Returns the meta object for the containment reference '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.MicroswitchModule#getSwitch <em>Switch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Switch</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.MicroswitchModule#getSwitch()
	 * @see #getMicroswitchModule()
	 * @generated
	 */
	EReference getMicroswitchModule_Switch();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.PotentiometerModule <em>Potentiometer Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Potentiometer Module</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.PotentiometerModule
	 * @generated
	 */
	EClass getPotentiometerModule();

	/**
	 * Returns the meta object for the containment reference '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.PotentiometerModule#getPoti <em>Poti</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Poti</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.PotentiometerModule#getPoti()
	 * @see #getPotentiometerModule()
	 * @generated
	 */
	EReference getPotentiometerModule_Poti();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.ModuleRepository <em>Module Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module Repository</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.ModuleRepository
	 * @generated
	 */
	EClass getModuleRepository();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.ModuleRepository#getAllModulesInPlant <em>All Modules In Plant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>All Modules In Plant</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.ModuleRepository#getAllModulesInPlant()
	 * @see #getModuleRepository()
	 * @generated
	 */
	EReference getModuleRepository_AllModulesInPlant();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.Module <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.Module
	 * @generated
	 */
	EClass getModule();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.Module#getParentEntity <em>Parent Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Entity</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.Module#getParentEntity()
	 * @see #getModule()
	 * @generated
	 */
	EReference getModule_ParentEntity();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.Module#getModules <em>Modules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Modules</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.Module#getModules()
	 * @see #getModule()
	 * @generated
	 */
	EReference getModule_Modules();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.Module#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Components</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.Module#getComponents()
	 * @see #getModule()
	 * @generated
	 */
	EReference getModule_Components();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.Module#getInterfaces <em>Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Interfaces</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.Module#getInterfaces()
	 * @see #getModule()
	 * @generated
	 */
	EReference getModule_Interfaces();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.RampModule <em>Ramp Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ramp Module</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.RampModule
	 * @generated
	 */
	EClass getRampModule();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.PusherModule <em>Pusher Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pusher Module</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.PusherModule
	 * @generated
	 */
	EClass getPusherModule();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.MotorModule <em>Motor Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Motor Module</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.MotorModule
	 * @generated
	 */
	EClass getMotorModule();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.MotorModule#getSimpleMotor <em>Simple Motor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Simple Motor</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.MotorModule#getSimpleMotor()
	 * @see #getMotorModule()
	 * @generated
	 */
	EReference getMotorModule_SimpleMotor();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.MotorModule#getBusSlave <em>Bus Slave</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bus Slave</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.MotorModule#getBusSlave()
	 * @see #getMotorModule()
	 * @generated
	 */
	EReference getMotorModule_BusSlave();

	/**
	 * Returns the meta object for the containment reference '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.MotorModule#getBusBox <em>Bus Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bus Box</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.MotorModule#getBusBox()
	 * @see #getMotorModule()
	 * @generated
	 */
	EReference getMotorModule_BusBox();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.MotorModule#getBusCable <em>Bus Cable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bus Cable</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.MotorModule#getBusCable()
	 * @see #getMotorModule()
	 * @generated
	 */
	EReference getMotorModule_BusCable();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.SensorModule <em>Sensor Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sensor Module</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.SensorModule
	 * @generated
	 */
	EClass getSensorModule();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.OpticalSensorModule <em>Optical Sensor Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Optical Sensor Module</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.OpticalSensorModule
	 * @generated
	 */
	EClass getOpticalSensorModule();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.OpticalSensorModule#getOpticalSensor <em>Optical Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Optical Sensor</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.OpticalSensorModule#getOpticalSensor()
	 * @see #getOpticalSensorModule()
	 * @generated
	 */
	EReference getOpticalSensorModule_OpticalSensor();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.OpticalSensorModule#getBusSlave <em>Bus Slave</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bus Slave</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.OpticalSensorModule#getBusSlave()
	 * @see #getOpticalSensorModule()
	 * @generated
	 */
	EReference getOpticalSensorModule_BusSlave();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.InductiveSensorModule <em>Inductive Sensor Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inductive Sensor Module</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.InductiveSensorModule
	 * @generated
	 */
	EClass getInductiveSensorModule();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.InductiveSensorModule#getInductiveSensor <em>Inductive Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inductive Sensor</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.InductiveSensorModule#getInductiveSensor()
	 * @see #getInductiveSensorModule()
	 * @generated
	 */
	EReference getInductiveSensorModule_InductiveSensor();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.InductiveSensorModule#getBusSlave <em>Bus Slave</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bus Slave</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.InductiveSensorModule#getBusSlave()
	 * @see #getInductiveSensorModule()
	 * @generated
	 */
	EReference getInductiveSensorModule_BusSlave();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.PresenceSensorModule <em>Presence Sensor Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Presence Sensor Module</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.PresenceSensorModule
	 * @generated
	 */
	EClass getPresenceSensorModule();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.PresenceSensorModule#getPresenceSensor <em>Presence Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Presence Sensor</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.PresenceSensorModule#getPresenceSensor()
	 * @see #getPresenceSensorModule()
	 * @generated
	 */
	EReference getPresenceSensorModule_PresenceSensor();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.PresenceSensorModule#getBusSlave <em>Bus Slave</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bus Slave</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.PresenceSensorModule#getBusSlave()
	 * @see #getPresenceSensorModule()
	 * @generated
	 */
	EReference getPresenceSensorModule_BusSlave();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.PressureSensorModule <em>Pressure Sensor Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pressure Sensor Module</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.PressureSensorModule
	 * @generated
	 */
	EClass getPressureSensorModule();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.ConveyorBeltModule <em>Conveyor Belt Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conveyor Belt Module</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.ConveyorBeltModule
	 * @generated
	 */
	EClass getConveyorBeltModule();

	/**
	 * Returns the meta object for the containment reference '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.ConveyorBeltModule#getRubberBand <em>Rubber Band</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rubber Band</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.ConveyorBeltModule#getRubberBand()
	 * @see #getConveyorBeltModule()
	 * @generated
	 */
	EReference getConveyorBeltModule_RubberBand();

	/**
	 * Returns the meta object for the containment reference '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.ConveyorBeltModule#getFrame <em>Frame</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Frame</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.ConveyorBeltModule#getFrame()
	 * @see #getConveyorBeltModule()
	 * @generated
	 */
	EReference getConveyorBeltModule_Frame();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.VacuumGripperModule <em>Vacuum Gripper Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vacuum Gripper Module</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.VacuumGripperModule
	 * @generated
	 */
	EClass getVacuumGripperModule();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.MonostableCylinderModule <em>Monostable Cylinder Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Monostable Cylinder Module</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.MonostableCylinderModule
	 * @generated
	 */
	EClass getMonostableCylinderModule();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ModuleRepositoryFactory getModuleRepositoryFactory();

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
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.impl.MicroswitchModuleImpl <em>Microswitch Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.impl.MicroswitchModuleImpl
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.impl.ModuleRepositoryPackageImpl#getMicroswitchModule()
		 * @generated
		 */
		EClass MICROSWITCH_MODULE = eINSTANCE.getMicroswitchModule();

		/**
		 * The meta object literal for the '<em><b>Bus Slave</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MICROSWITCH_MODULE__BUS_SLAVE = eINSTANCE.getMicroswitchModule_BusSlave();

		/**
		 * The meta object literal for the '<em><b>Switch</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MICROSWITCH_MODULE__SWITCH = eINSTANCE.getMicroswitchModule_Switch();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.impl.PotentiometerModuleImpl <em>Potentiometer Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.impl.PotentiometerModuleImpl
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.impl.ModuleRepositoryPackageImpl#getPotentiometerModule()
		 * @generated
		 */
		EClass POTENTIOMETER_MODULE = eINSTANCE.getPotentiometerModule();

		/**
		 * The meta object literal for the '<em><b>Poti</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POTENTIOMETER_MODULE__POTI = eINSTANCE.getPotentiometerModule_Poti();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.impl.ModuleRepositoryImpl <em>Module Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.impl.ModuleRepositoryImpl
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.impl.ModuleRepositoryPackageImpl#getModuleRepository()
		 * @generated
		 */
		EClass MODULE_REPOSITORY = eINSTANCE.getModuleRepository();

		/**
		 * The meta object literal for the '<em><b>All Modules In Plant</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE_REPOSITORY__ALL_MODULES_IN_PLANT = eINSTANCE.getModuleRepository_AllModulesInPlant();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.impl.ModuleImpl <em>Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.impl.ModuleImpl
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.impl.ModuleRepositoryPackageImpl#getModule()
		 * @generated
		 */
		EClass MODULE = eINSTANCE.getModule();

		/**
		 * The meta object literal for the '<em><b>Parent Entity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE__PARENT_ENTITY = eINSTANCE.getModule_ParentEntity();

		/**
		 * The meta object literal for the '<em><b>Modules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE__MODULES = eINSTANCE.getModule_Modules();

		/**
		 * The meta object literal for the '<em><b>Components</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE__COMPONENTS = eINSTANCE.getModule_Components();

		/**
		 * The meta object literal for the '<em><b>Interfaces</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE__INTERFACES = eINSTANCE.getModule_Interfaces();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.impl.RampModuleImpl <em>Ramp Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.impl.RampModuleImpl
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.impl.ModuleRepositoryPackageImpl#getRampModule()
		 * @generated
		 */
		EClass RAMP_MODULE = eINSTANCE.getRampModule();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.impl.PusherModuleImpl <em>Pusher Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.impl.PusherModuleImpl
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.impl.ModuleRepositoryPackageImpl#getPusherModule()
		 * @generated
		 */
		EClass PUSHER_MODULE = eINSTANCE.getPusherModule();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.impl.MotorModuleImpl <em>Motor Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.impl.MotorModuleImpl
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.impl.ModuleRepositoryPackageImpl#getMotorModule()
		 * @generated
		 */
		EClass MOTOR_MODULE = eINSTANCE.getMotorModule();

		/**
		 * The meta object literal for the '<em><b>Simple Motor</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOTOR_MODULE__SIMPLE_MOTOR = eINSTANCE.getMotorModule_SimpleMotor();

		/**
		 * The meta object literal for the '<em><b>Bus Slave</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOTOR_MODULE__BUS_SLAVE = eINSTANCE.getMotorModule_BusSlave();

		/**
		 * The meta object literal for the '<em><b>Bus Box</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOTOR_MODULE__BUS_BOX = eINSTANCE.getMotorModule_BusBox();

		/**
		 * The meta object literal for the '<em><b>Bus Cable</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOTOR_MODULE__BUS_CABLE = eINSTANCE.getMotorModule_BusCable();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.impl.SensorModuleImpl <em>Sensor Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.impl.SensorModuleImpl
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.impl.ModuleRepositoryPackageImpl#getSensorModule()
		 * @generated
		 */
		EClass SENSOR_MODULE = eINSTANCE.getSensorModule();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.impl.OpticalSensorModuleImpl <em>Optical Sensor Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.impl.OpticalSensorModuleImpl
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.impl.ModuleRepositoryPackageImpl#getOpticalSensorModule()
		 * @generated
		 */
		EClass OPTICAL_SENSOR_MODULE = eINSTANCE.getOpticalSensorModule();

		/**
		 * The meta object literal for the '<em><b>Optical Sensor</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPTICAL_SENSOR_MODULE__OPTICAL_SENSOR = eINSTANCE.getOpticalSensorModule_OpticalSensor();

		/**
		 * The meta object literal for the '<em><b>Bus Slave</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPTICAL_SENSOR_MODULE__BUS_SLAVE = eINSTANCE.getOpticalSensorModule_BusSlave();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.impl.InductiveSensorModuleImpl <em>Inductive Sensor Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.impl.InductiveSensorModuleImpl
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.impl.ModuleRepositoryPackageImpl#getInductiveSensorModule()
		 * @generated
		 */
		EClass INDUCTIVE_SENSOR_MODULE = eINSTANCE.getInductiveSensorModule();

		/**
		 * The meta object literal for the '<em><b>Inductive Sensor</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INDUCTIVE_SENSOR_MODULE__INDUCTIVE_SENSOR = eINSTANCE.getInductiveSensorModule_InductiveSensor();

		/**
		 * The meta object literal for the '<em><b>Bus Slave</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INDUCTIVE_SENSOR_MODULE__BUS_SLAVE = eINSTANCE.getInductiveSensorModule_BusSlave();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.impl.PresenceSensorModuleImpl <em>Presence Sensor Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.impl.PresenceSensorModuleImpl
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.impl.ModuleRepositoryPackageImpl#getPresenceSensorModule()
		 * @generated
		 */
		EClass PRESENCE_SENSOR_MODULE = eINSTANCE.getPresenceSensorModule();

		/**
		 * The meta object literal for the '<em><b>Presence Sensor</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRESENCE_SENSOR_MODULE__PRESENCE_SENSOR = eINSTANCE.getPresenceSensorModule_PresenceSensor();

		/**
		 * The meta object literal for the '<em><b>Bus Slave</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRESENCE_SENSOR_MODULE__BUS_SLAVE = eINSTANCE.getPresenceSensorModule_BusSlave();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.impl.PressureSensorModuleImpl <em>Pressure Sensor Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.impl.PressureSensorModuleImpl
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.impl.ModuleRepositoryPackageImpl#getPressureSensorModule()
		 * @generated
		 */
		EClass PRESSURE_SENSOR_MODULE = eINSTANCE.getPressureSensorModule();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.impl.ConveyorBeltModuleImpl <em>Conveyor Belt Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.impl.ConveyorBeltModuleImpl
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.impl.ModuleRepositoryPackageImpl#getConveyorBeltModule()
		 * @generated
		 */
		EClass CONVEYOR_BELT_MODULE = eINSTANCE.getConveyorBeltModule();

		/**
		 * The meta object literal for the '<em><b>Rubber Band</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONVEYOR_BELT_MODULE__RUBBER_BAND = eINSTANCE.getConveyorBeltModule_RubberBand();

		/**
		 * The meta object literal for the '<em><b>Frame</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONVEYOR_BELT_MODULE__FRAME = eINSTANCE.getConveyorBeltModule_Frame();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.impl.VacuumGripperModuleImpl <em>Vacuum Gripper Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.impl.VacuumGripperModuleImpl
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.impl.ModuleRepositoryPackageImpl#getVacuumGripperModule()
		 * @generated
		 */
		EClass VACUUM_GRIPPER_MODULE = eINSTANCE.getVacuumGripperModule();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.impl.MonostableCylinderModuleImpl <em>Monostable Cylinder Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.impl.MonostableCylinderModuleImpl
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.impl.ModuleRepositoryPackageImpl#getMonostableCylinderModule()
		 * @generated
		 */
		EClass MONOSTABLE_CYLINDER_MODULE = eINSTANCE.getMonostableCylinderModule();

	}

} //ModuleRepositoryPackage
