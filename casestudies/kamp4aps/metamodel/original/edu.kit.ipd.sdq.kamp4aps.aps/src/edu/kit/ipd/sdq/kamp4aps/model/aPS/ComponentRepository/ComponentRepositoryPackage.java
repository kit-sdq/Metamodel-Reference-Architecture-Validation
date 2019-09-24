/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.ElectronicComponents.ElectronicComponentsPackage;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.MechanicalComponents.MechanicalComponentsPackage;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.ModuleRepositoryPackage;

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
 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.ComponentRepositoryFactory
 * @model kind="package"
 * @generated
 */
public interface ComponentRepositoryPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ComponentRepository";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "edu.kit.ipd.sdq.kaps.xppu.componentrepository";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ComponentRepository";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ComponentRepositoryPackage eINSTANCE = edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.ComponentRepositoryPackageImpl.init();

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.ComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.ComponentImpl
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.ComponentRepositoryPackageImpl#getComponent()
	 * @generated
	 */
	int COMPONENT = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__ID = BasicPackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__NAME = BasicPackage.ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Connected Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__CONNECTED_INTERFACES = BasicPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__PARENT = BasicPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parent Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__PARENT_MODULE = BasicPackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FEATURE_COUNT = BasicPackage.ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OPERATION_COUNT = BasicPackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.PanelImpl <em>Panel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.PanelImpl
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.ComponentRepositoryPackageImpl#getPanel()
	 * @generated
	 */
	int PANEL = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANEL__ID = COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANEL__NAME = COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Connected Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANEL__CONNECTED_INTERFACES = COMPONENT__CONNECTED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANEL__PARENT = COMPONENT__PARENT;

	/**
	 * The feature id for the '<em><b>Parent Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANEL__PARENT_MODULE = COMPONENT__PARENT_MODULE;

	/**
	 * The feature id for the '<em><b>Component Repository</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANEL__COMPONENT_REPOSITORY = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Panel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANEL_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Panel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANEL_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.OperationPanelImpl <em>Operation Panel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.OperationPanelImpl
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.ComponentRepositoryPackageImpl#getOperationPanel()
	 * @generated
	 */
	int OPERATION_PANEL = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_PANEL__ID = PANEL__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_PANEL__NAME = PANEL__NAME;

	/**
	 * The feature id for the '<em><b>Connected Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_PANEL__CONNECTED_INTERFACES = PANEL__CONNECTED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_PANEL__PARENT = PANEL__PARENT;

	/**
	 * The feature id for the '<em><b>Parent Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_PANEL__PARENT_MODULE = PANEL__PARENT_MODULE;

	/**
	 * The feature id for the '<em><b>Component Repository</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_PANEL__COMPONENT_REPOSITORY = PANEL__COMPONENT_REPOSITORY;

	/**
	 * The feature id for the '<em><b>Screwing rack</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_PANEL__SCREWING_RACK = PANEL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Leds</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_PANEL__LEDS = PANEL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Buttons</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_PANEL__BUTTONS = PANEL_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Operation Panel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_PANEL_FEATURE_COUNT = PANEL_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Operation Panel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_PANEL_OPERATION_COUNT = PANEL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.MotorImpl <em>Motor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.MotorImpl
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.ComponentRepositoryPackageImpl#getMotor()
	 * @generated
	 */
	int MOTOR = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTOR__ID = COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTOR__NAME = COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Connected Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTOR__CONNECTED_INTERFACES = COMPONENT__CONNECTED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTOR__PARENT = COMPONENT__PARENT;

	/**
	 * The feature id for the '<em><b>Parent Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTOR__PARENT_MODULE = COMPONENT__PARENT_MODULE;

	/**
	 * The feature id for the '<em><b>Gearing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTOR__GEARING = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Screwing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTOR__SCREWING = COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Powersupply</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTOR__POWERSUPPLY = COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Motor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTOR_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Motor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTOR_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.SimpleMotorImpl <em>Simple Motor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.SimpleMotorImpl
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.ComponentRepositoryPackageImpl#getSimpleMotor()
	 * @generated
	 */
	int SIMPLE_MOTOR = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_MOTOR__ID = MOTOR__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_MOTOR__NAME = MOTOR__NAME;

	/**
	 * The feature id for the '<em><b>Connected Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_MOTOR__CONNECTED_INTERFACES = MOTOR__CONNECTED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_MOTOR__PARENT = MOTOR__PARENT;

	/**
	 * The feature id for the '<em><b>Parent Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_MOTOR__PARENT_MODULE = MOTOR__PARENT_MODULE;

	/**
	 * The feature id for the '<em><b>Gearing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_MOTOR__GEARING = MOTOR__GEARING;

	/**
	 * The feature id for the '<em><b>Screwing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_MOTOR__SCREWING = MOTOR__SCREWING;

	/**
	 * The feature id for the '<em><b>Powersupply</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_MOTOR__POWERSUPPLY = MOTOR__POWERSUPPLY;

	/**
	 * The number of structural features of the '<em>Simple Motor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_MOTOR_FEATURE_COUNT = MOTOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Simple Motor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_MOTOR_OPERATION_COUNT = MOTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.MechanicalAssemblyImpl <em>Mechanical Assembly</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.MechanicalAssemblyImpl
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.ComponentRepositoryPackageImpl#getMechanicalAssembly()
	 * @generated
	 */
	int MECHANICAL_ASSEMBLY = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MECHANICAL_ASSEMBLY__ID = COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MECHANICAL_ASSEMBLY__NAME = COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Connected Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MECHANICAL_ASSEMBLY__CONNECTED_INTERFACES = COMPONENT__CONNECTED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MECHANICAL_ASSEMBLY__PARENT = COMPONENT__PARENT;

	/**
	 * The feature id for the '<em><b>Parent Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MECHANICAL_ASSEMBLY__PARENT_MODULE = COMPONENT__PARENT_MODULE;

	/**
	 * The number of structural features of the '<em>Mechanical Assembly</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MECHANICAL_ASSEMBLY_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Mechanical Assembly</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MECHANICAL_ASSEMBLY_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.RegularRampImpl <em>Regular Ramp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.RegularRampImpl
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.ComponentRepositoryPackageImpl#getRegularRamp()
	 * @generated
	 */
	int REGULAR_RAMP = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_RAMP__ID = MechanicalComponentsPackage.RAMP__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_RAMP__NAME = MechanicalComponentsPackage.RAMP__NAME;

	/**
	 * The feature id for the '<em><b>Connected Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_RAMP__CONNECTED_INTERFACES = MechanicalComponentsPackage.RAMP__CONNECTED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_RAMP__PARENT = MechanicalComponentsPackage.RAMP__PARENT;

	/**
	 * The feature id for the '<em><b>Parent Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_RAMP__PARENT_MODULE = MechanicalComponentsPackage.RAMP__PARENT_MODULE;

	/**
	 * The feature id for the '<em><b>Screwing base</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_RAMP__SCREWING_BASE = MechanicalComponentsPackage.RAMP__SCREWING_BASE;

	/**
	 * The feature id for the '<em><b>Screwing component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_RAMP__SCREWING_COMPONENT = MechanicalComponentsPackage.RAMP__SCREWING_COMPONENT;

	/**
	 * The feature id for the '<em><b>Physicalconnection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_RAMP__PHYSICALCONNECTION = MechanicalComponentsPackage.RAMP__PHYSICALCONNECTION;

	/**
	 * The number of structural features of the '<em>Regular Ramp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_RAMP_FEATURE_COUNT = MechanicalComponentsPackage.RAMP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Regular Ramp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_RAMP_OPERATION_COUNT = MechanicalComponentsPackage.RAMP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.SensorImpl <em>Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.SensorImpl
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.ComponentRepositoryPackageImpl#getSensor()
	 * @generated
	 */
	int SENSOR = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__ID = COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__NAME = COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Connected Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__CONNECTED_INTERFACES = COMPONENT__CONNECTED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__PARENT = COMPONENT__PARENT;

	/**
	 * The feature id for the '<em><b>Parent Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__PARENT_MODULE = COMPONENT__PARENT_MODULE;

	/**
	 * The feature id for the '<em><b>Physicalconnection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__PHYSICALCONNECTION = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Signalinterface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__SIGNALINTERFACE = COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Powersupply</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__POWERSUPPLY = COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.OpticalSensorImpl <em>Optical Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.OpticalSensorImpl
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.ComponentRepositoryPackageImpl#getOpticalSensor()
	 * @generated
	 */
	int OPTICAL_SENSOR = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTICAL_SENSOR__ID = SENSOR__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTICAL_SENSOR__NAME = SENSOR__NAME;

	/**
	 * The feature id for the '<em><b>Connected Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTICAL_SENSOR__CONNECTED_INTERFACES = SENSOR__CONNECTED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTICAL_SENSOR__PARENT = SENSOR__PARENT;

	/**
	 * The feature id for the '<em><b>Parent Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTICAL_SENSOR__PARENT_MODULE = SENSOR__PARENT_MODULE;

	/**
	 * The feature id for the '<em><b>Physicalconnection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTICAL_SENSOR__PHYSICALCONNECTION = SENSOR__PHYSICALCONNECTION;

	/**
	 * The feature id for the '<em><b>Signalinterface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTICAL_SENSOR__SIGNALINTERFACE = SENSOR__SIGNALINTERFACE;

	/**
	 * The feature id for the '<em><b>Powersupply</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTICAL_SENSOR__POWERSUPPLY = SENSOR__POWERSUPPLY;

	/**
	 * The number of structural features of the '<em>Optical Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTICAL_SENSOR_FEATURE_COUNT = SENSOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Optical Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTICAL_SENSOR_OPERATION_COUNT = SENSOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.InductiveSensorImpl <em>Inductive Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.InductiveSensorImpl
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.ComponentRepositoryPackageImpl#getInductiveSensor()
	 * @generated
	 */
	int INDUCTIVE_SENSOR = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDUCTIVE_SENSOR__ID = SENSOR__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDUCTIVE_SENSOR__NAME = SENSOR__NAME;

	/**
	 * The feature id for the '<em><b>Connected Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDUCTIVE_SENSOR__CONNECTED_INTERFACES = SENSOR__CONNECTED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDUCTIVE_SENSOR__PARENT = SENSOR__PARENT;

	/**
	 * The feature id for the '<em><b>Parent Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDUCTIVE_SENSOR__PARENT_MODULE = SENSOR__PARENT_MODULE;

	/**
	 * The feature id for the '<em><b>Physicalconnection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDUCTIVE_SENSOR__PHYSICALCONNECTION = SENSOR__PHYSICALCONNECTION;

	/**
	 * The feature id for the '<em><b>Signalinterface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDUCTIVE_SENSOR__SIGNALINTERFACE = SENSOR__SIGNALINTERFACE;

	/**
	 * The feature id for the '<em><b>Powersupply</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDUCTIVE_SENSOR__POWERSUPPLY = SENSOR__POWERSUPPLY;

	/**
	 * The number of structural features of the '<em>Inductive Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDUCTIVE_SENSOR_FEATURE_COUNT = SENSOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Inductive Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDUCTIVE_SENSOR_OPERATION_COUNT = SENSOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.PresenceSensorImpl <em>Presence Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.PresenceSensorImpl
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.ComponentRepositoryPackageImpl#getPresenceSensor()
	 * @generated
	 */
	int PRESENCE_SENSOR = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENCE_SENSOR__ID = SENSOR__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENCE_SENSOR__NAME = SENSOR__NAME;

	/**
	 * The feature id for the '<em><b>Connected Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENCE_SENSOR__CONNECTED_INTERFACES = SENSOR__CONNECTED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENCE_SENSOR__PARENT = SENSOR__PARENT;

	/**
	 * The feature id for the '<em><b>Parent Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENCE_SENSOR__PARENT_MODULE = SENSOR__PARENT_MODULE;

	/**
	 * The feature id for the '<em><b>Physicalconnection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENCE_SENSOR__PHYSICALCONNECTION = SENSOR__PHYSICALCONNECTION;

	/**
	 * The feature id for the '<em><b>Signalinterface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENCE_SENSOR__SIGNALINTERFACE = SENSOR__SIGNALINTERFACE;

	/**
	 * The feature id for the '<em><b>Powersupply</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENCE_SENSOR__POWERSUPPLY = SENSOR__POWERSUPPLY;

	/**
	 * The number of structural features of the '<em>Presence Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENCE_SENSOR_FEATURE_COUNT = SENSOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Presence Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENCE_SENSOR_OPERATION_COUNT = SENSOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.PressureSensorImpl <em>Pressure Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.PressureSensorImpl
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.ComponentRepositoryPackageImpl#getPressureSensor()
	 * @generated
	 */
	int PRESSURE_SENSOR = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESSURE_SENSOR__ID = SENSOR__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESSURE_SENSOR__NAME = SENSOR__NAME;

	/**
	 * The feature id for the '<em><b>Connected Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESSURE_SENSOR__CONNECTED_INTERFACES = SENSOR__CONNECTED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESSURE_SENSOR__PARENT = SENSOR__PARENT;

	/**
	 * The feature id for the '<em><b>Parent Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESSURE_SENSOR__PARENT_MODULE = SENSOR__PARENT_MODULE;

	/**
	 * The feature id for the '<em><b>Physicalconnection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESSURE_SENSOR__PHYSICALCONNECTION = SENSOR__PHYSICALCONNECTION;

	/**
	 * The feature id for the '<em><b>Signalinterface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESSURE_SENSOR__SIGNALINTERFACE = SENSOR__SIGNALINTERFACE;

	/**
	 * The feature id for the '<em><b>Powersupply</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESSURE_SENSOR__POWERSUPPLY = SENSOR__POWERSUPPLY;

	/**
	 * The number of structural features of the '<em>Pressure Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESSURE_SENSOR_FEATURE_COUNT = SENSOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Pressure Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESSURE_SENSOR_OPERATION_COUNT = SENSOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.PipeImpl <em>Pipe</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.PipeImpl
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.ComponentRepositoryPackageImpl#getPipe()
	 * @generated
	 */
	int PIPE = 12;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPE__ID = COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPE__NAME = COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Connected Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPE__CONNECTED_INTERFACES = COMPONENT__CONNECTED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPE__PARENT = COMPONENT__PARENT;

	/**
	 * The feature id for the '<em><b>Parent Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPE__PARENT_MODULE = COMPONENT__PARENT_MODULE;

	/**
	 * The feature id for the '<em><b>Plugs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPE__PLUGS = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pipe</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPE_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Pipe</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPE_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.PneumaticPipeImpl <em>Pneumatic Pipe</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.PneumaticPipeImpl
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.ComponentRepositoryPackageImpl#getPneumaticPipe()
	 * @generated
	 */
	int PNEUMATIC_PIPE = 13;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PNEUMATIC_PIPE__ID = PIPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PNEUMATIC_PIPE__NAME = PIPE__NAME;

	/**
	 * The feature id for the '<em><b>Connected Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PNEUMATIC_PIPE__CONNECTED_INTERFACES = PIPE__CONNECTED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PNEUMATIC_PIPE__PARENT = PIPE__PARENT;

	/**
	 * The feature id for the '<em><b>Parent Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PNEUMATIC_PIPE__PARENT_MODULE = PIPE__PARENT_MODULE;

	/**
	 * The feature id for the '<em><b>Plugs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PNEUMATIC_PIPE__PLUGS = PIPE__PLUGS;

	/**
	 * The number of structural features of the '<em>Pneumatic Pipe</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PNEUMATIC_PIPE_FEATURE_COUNT = PIPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Pneumatic Pipe</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PNEUMATIC_PIPE_OPERATION_COUNT = PIPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.CompressorImpl <em>Compressor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.CompressorImpl
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.ComponentRepositoryPackageImpl#getCompressor()
	 * @generated
	 */
	int COMPRESSOR = 14;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPRESSOR__ID = COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPRESSOR__NAME = COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Connected Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPRESSOR__CONNECTED_INTERFACES = COMPONENT__CONNECTED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPRESSOR__PARENT = COMPONENT__PARENT;

	/**
	 * The feature id for the '<em><b>Parent Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPRESSOR__PARENT_MODULE = COMPONENT__PARENT_MODULE;

	/**
	 * The feature id for the '<em><b>Powersupply</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPRESSOR__POWERSUPPLY = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pneumaticsupply</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPRESSOR__PNEUMATICSUPPLY = COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Pins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPRESSOR__PINS = COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Screwing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPRESSOR__SCREWING = COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Switch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPRESSOR__SWITCH = COMPONENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Compressor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPRESSOR_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Compressor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPRESSOR_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.CableImpl <em>Cable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.CableImpl
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.ComponentRepositoryPackageImpl#getCable()
	 * @generated
	 */
	int CABLE = 15;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABLE__ID = COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABLE__NAME = COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Connected Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABLE__CONNECTED_INTERFACES = COMPONENT__CONNECTED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABLE__PARENT = COMPONENT__PARENT;

	/**
	 * The feature id for the '<em><b>Parent Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABLE__PARENT_MODULE = COMPONENT__PARENT_MODULE;

	/**
	 * The number of structural features of the '<em>Cable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABLE_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Cable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABLE_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.PowerCableImpl <em>Power Cable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.PowerCableImpl
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.ComponentRepositoryPackageImpl#getPowerCable()
	 * @generated
	 */
	int POWER_CABLE = 16;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_CABLE__ID = CABLE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_CABLE__NAME = CABLE__NAME;

	/**
	 * The feature id for the '<em><b>Connected Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_CABLE__CONNECTED_INTERFACES = CABLE__CONNECTED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_CABLE__PARENT = CABLE__PARENT;

	/**
	 * The feature id for the '<em><b>Parent Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_CABLE__PARENT_MODULE = CABLE__PARENT_MODULE;

	/**
	 * The number of structural features of the '<em>Power Cable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_CABLE_FEATURE_COUNT = CABLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Power Cable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_CABLE_OPERATION_COUNT = CABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.CylinderImpl <em>Cylinder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.CylinderImpl
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.ComponentRepositoryPackageImpl#getCylinder()
	 * @generated
	 */
	int CYLINDER = 17;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYLINDER__ID = COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYLINDER__NAME = COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Connected Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYLINDER__CONNECTED_INTERFACES = COMPONENT__CONNECTED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYLINDER__PARENT = COMPONENT__PARENT;

	/**
	 * The feature id for the '<em><b>Parent Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYLINDER__PARENT_MODULE = COMPONENT__PARENT_MODULE;

	/**
	 * The feature id for the '<em><b>Pneumaticsupply</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYLINDER__PNEUMATICSUPPLY = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Signal Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYLINDER__SIGNAL_INTERFACE = COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Cylinder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYLINDER_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Cylinder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYLINDER_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.ProportionalCylinderImpl <em>Proportional Cylinder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.ProportionalCylinderImpl
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.ComponentRepositoryPackageImpl#getProportionalCylinder()
	 * @generated
	 */
	int PROPORTIONAL_CYLINDER = 18;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPORTIONAL_CYLINDER__ID = CYLINDER__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPORTIONAL_CYLINDER__NAME = CYLINDER__NAME;

	/**
	 * The feature id for the '<em><b>Connected Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPORTIONAL_CYLINDER__CONNECTED_INTERFACES = CYLINDER__CONNECTED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPORTIONAL_CYLINDER__PARENT = CYLINDER__PARENT;

	/**
	 * The feature id for the '<em><b>Parent Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPORTIONAL_CYLINDER__PARENT_MODULE = CYLINDER__PARENT_MODULE;

	/**
	 * The feature id for the '<em><b>Pneumaticsupply</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPORTIONAL_CYLINDER__PNEUMATICSUPPLY = CYLINDER__PNEUMATICSUPPLY;

	/**
	 * The feature id for the '<em><b>Signal Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPORTIONAL_CYLINDER__SIGNAL_INTERFACE = CYLINDER__SIGNAL_INTERFACE;

	/**
	 * The number of structural features of the '<em>Proportional Cylinder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPORTIONAL_CYLINDER_FEATURE_COUNT = CYLINDER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Proportional Cylinder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPORTIONAL_CYLINDER_OPERATION_COUNT = CYLINDER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.BistableCylinderImpl <em>Bistable Cylinder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.BistableCylinderImpl
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.ComponentRepositoryPackageImpl#getBistableCylinder()
	 * @generated
	 */
	int BISTABLE_CYLINDER = 19;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BISTABLE_CYLINDER__ID = CYLINDER__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BISTABLE_CYLINDER__NAME = CYLINDER__NAME;

	/**
	 * The feature id for the '<em><b>Connected Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BISTABLE_CYLINDER__CONNECTED_INTERFACES = CYLINDER__CONNECTED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BISTABLE_CYLINDER__PARENT = CYLINDER__PARENT;

	/**
	 * The feature id for the '<em><b>Parent Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BISTABLE_CYLINDER__PARENT_MODULE = CYLINDER__PARENT_MODULE;

	/**
	 * The feature id for the '<em><b>Pneumaticsupply</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BISTABLE_CYLINDER__PNEUMATICSUPPLY = CYLINDER__PNEUMATICSUPPLY;

	/**
	 * The feature id for the '<em><b>Signal Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BISTABLE_CYLINDER__SIGNAL_INTERFACE = CYLINDER__SIGNAL_INTERFACE;

	/**
	 * The number of structural features of the '<em>Bistable Cylinder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BISTABLE_CYLINDER_FEATURE_COUNT = CYLINDER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Bistable Cylinder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BISTABLE_CYLINDER_OPERATION_COUNT = CYLINDER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.RackImpl <em>Rack</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.RackImpl
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.ComponentRepositoryPackageImpl#getRack()
	 * @generated
	 */
	int RACK = 20;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RACK__ID = COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RACK__NAME = COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Connected Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RACK__CONNECTED_INTERFACES = COMPONENT__CONNECTED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RACK__PARENT = COMPONENT__PARENT;

	/**
	 * The feature id for the '<em><b>Parent Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RACK__PARENT_MODULE = COMPONENT__PARENT_MODULE;

	/**
	 * The feature id for the '<em><b>Screwing to base</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RACK__SCREWING_TO_BASE = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Rack</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RACK_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Rack</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RACK_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.CornerImpl <em>Corner</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.CornerImpl
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.ComponentRepositoryPackageImpl#getCorner()
	 * @generated
	 */
	int CORNER = 21;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORNER__ID = COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORNER__NAME = COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Connected Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORNER__CONNECTED_INTERFACES = COMPONENT__CONNECTED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORNER__PARENT = COMPONENT__PARENT;

	/**
	 * The feature id for the '<em><b>Parent Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORNER__PARENT_MODULE = COMPONENT__PARENT_MODULE;

	/**
	 * The number of structural features of the '<em>Corner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORNER_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Corner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORNER_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.ValveImpl <em>Valve</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.ValveImpl
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.ComponentRepositoryPackageImpl#getValve()
	 * @generated
	 */
	int VALVE = 22;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALVE__ID = COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALVE__NAME = COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Connected Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALVE__CONNECTED_INTERFACES = COMPONENT__CONNECTED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALVE__PARENT = COMPONENT__PARENT;

	/**
	 * The feature id for the '<em><b>Parent Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALVE__PARENT_MODULE = COMPONENT__PARENT_MODULE;

	/**
	 * The feature id for the '<em><b>Pneumaticsupply</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALVE__PNEUMATICSUPPLY = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Powersupply</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALVE__POWERSUPPLY = COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Signalinterface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALVE__SIGNALINTERFACE = COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Valve</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALVE_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Valve</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALVE_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.RegularValveImpl <em>Regular Valve</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.RegularValveImpl
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.ComponentRepositoryPackageImpl#getRegularValve()
	 * @generated
	 */
	int REGULAR_VALVE = 23;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_VALVE__ID = VALVE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_VALVE__NAME = VALVE__NAME;

	/**
	 * The feature id for the '<em><b>Connected Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_VALVE__CONNECTED_INTERFACES = VALVE__CONNECTED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_VALVE__PARENT = VALVE__PARENT;

	/**
	 * The feature id for the '<em><b>Parent Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_VALVE__PARENT_MODULE = VALVE__PARENT_MODULE;

	/**
	 * The feature id for the '<em><b>Pneumaticsupply</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_VALVE__PNEUMATICSUPPLY = VALVE__PNEUMATICSUPPLY;

	/**
	 * The feature id for the '<em><b>Powersupply</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_VALVE__POWERSUPPLY = VALVE__POWERSUPPLY;

	/**
	 * The feature id for the '<em><b>Signalinterface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_VALVE__SIGNALINTERFACE = VALVE__SIGNALINTERFACE;

	/**
	 * The number of structural features of the '<em>Regular Valve</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_VALVE_FEATURE_COUNT = VALVE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Regular Valve</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_VALVE_OPERATION_COUNT = VALVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.TankImpl <em>Tank</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.TankImpl
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.ComponentRepositoryPackageImpl#getTank()
	 * @generated
	 */
	int TANK = 24;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TANK__ID = COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TANK__NAME = COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Connected Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TANK__CONNECTED_INTERFACES = COMPONENT__CONNECTED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TANK__PARENT = COMPONENT__PARENT;

	/**
	 * The feature id for the '<em><b>Parent Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TANK__PARENT_MODULE = COMPONENT__PARENT_MODULE;

	/**
	 * The feature id for the '<em><b>Watersupply</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TANK__WATERSUPPLY = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Screwing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TANK__SCREWING = COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Tank</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TANK_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Tank</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TANK_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.DispenserImpl <em>Dispenser</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.DispenserImpl
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.ComponentRepositoryPackageImpl#getDispenser()
	 * @generated
	 */
	int DISPENSER = 25;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPENSER__ID = COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPENSER__NAME = COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Connected Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPENSER__CONNECTED_INTERFACES = COMPONENT__CONNECTED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPENSER__PARENT = COMPONENT__PARENT;

	/**
	 * The feature id for the '<em><b>Parent Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPENSER__PARENT_MODULE = COMPONENT__PARENT_MODULE;

	/**
	 * The number of structural features of the '<em>Dispenser</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPENSER_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Dispenser</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPENSER_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.BottleSeperatorImpl <em>Bottle Seperator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.BottleSeperatorImpl
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.ComponentRepositoryPackageImpl#getBottleSeperator()
	 * @generated
	 */
	int BOTTLE_SEPERATOR = 26;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOTTLE_SEPERATOR__ID = COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOTTLE_SEPERATOR__NAME = COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Connected Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOTTLE_SEPERATOR__CONNECTED_INTERFACES = COMPONENT__CONNECTED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOTTLE_SEPERATOR__PARENT = COMPONENT__PARENT;

	/**
	 * The feature id for the '<em><b>Parent Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOTTLE_SEPERATOR__PARENT_MODULE = COMPONENT__PARENT_MODULE;

	/**
	 * The feature id for the '<em><b>Signalinterface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOTTLE_SEPERATOR__SIGNALINTERFACE = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pneumaticsupply</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOTTLE_SEPERATOR__PNEUMATICSUPPLY = COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Powersupply</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOTTLE_SEPERATOR__POWERSUPPLY = COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Screwing to rack</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOTTLE_SEPERATOR__SCREWING_TO_RACK = COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Bottle Seperator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOTTLE_SEPERATOR_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Bottle Seperator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOTTLE_SEPERATOR_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.SplitterImpl <em>Splitter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.SplitterImpl
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.ComponentRepositoryPackageImpl#getSplitter()
	 * @generated
	 */
	int SPLITTER = 27;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLITTER__ID = COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLITTER__NAME = COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Connected Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLITTER__CONNECTED_INTERFACES = COMPONENT__CONNECTED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLITTER__PARENT = COMPONENT__PARENT;

	/**
	 * The feature id for the '<em><b>Parent Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLITTER__PARENT_MODULE = COMPONENT__PARENT_MODULE;

	/**
	 * The feature id for the '<em><b>Screwing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLITTER__SCREWING = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Splitter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLITTER_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Splitter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLITTER_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.PowerSupplyImpl <em>Power Supply</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.PowerSupplyImpl
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.ComponentRepositoryPackageImpl#getPowerSupply()
	 * @generated
	 */
	int POWER_SUPPLY = 28;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_SUPPLY__ID = COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_SUPPLY__NAME = COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Connected Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_SUPPLY__CONNECTED_INTERFACES = COMPONENT__CONNECTED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_SUPPLY__PARENT = COMPONENT__PARENT;

	/**
	 * The feature id for the '<em><b>Parent Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_SUPPLY__PARENT_MODULE = COMPONENT__PARENT_MODULE;

	/**
	 * The feature id for the '<em><b>Parent Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_SUPPLY__PARENT_ELEMENT = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Power Supply</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_SUPPLY_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Power Supply</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_SUPPLY_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.ConveyorBeltImpl <em>Conveyor Belt</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.ConveyorBeltImpl
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.ComponentRepositoryPackageImpl#getConveyorBelt()
	 * @generated
	 */
	int CONVEYOR_BELT = 29;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVEYOR_BELT__ID = COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVEYOR_BELT__NAME = COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Connected Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVEYOR_BELT__CONNECTED_INTERFACES = COMPONENT__CONNECTED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVEYOR_BELT__PARENT = COMPONENT__PARENT;

	/**
	 * The feature id for the '<em><b>Parent Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVEYOR_BELT__PARENT_MODULE = COMPONENT__PARENT_MODULE;

	/**
	 * The feature id for the '<em><b>Mounted To</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVEYOR_BELT__MOUNTED_TO = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Frame</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVEYOR_BELT__FRAME = COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Rubber Band</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVEYOR_BELT__RUBBER_BAND = COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Conveyor Belt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVEYOR_BELT_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Conveyor Belt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVEYOR_BELT_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.FrameImpl <em>Frame</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.FrameImpl
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.ComponentRepositoryPackageImpl#getFrame()
	 * @generated
	 */
	int FRAME = 30;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME__ID = MECHANICAL_ASSEMBLY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME__NAME = MECHANICAL_ASSEMBLY__NAME;

	/**
	 * The feature id for the '<em><b>Connected Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME__CONNECTED_INTERFACES = MECHANICAL_ASSEMBLY__CONNECTED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME__PARENT = MECHANICAL_ASSEMBLY__PARENT;

	/**
	 * The feature id for the '<em><b>Parent Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME__PARENT_MODULE = MECHANICAL_ASSEMBLY__PARENT_MODULE;

	/**
	 * The number of structural features of the '<em>Frame</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME_FEATURE_COUNT = MECHANICAL_ASSEMBLY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Frame</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME_OPERATION_COUNT = MECHANICAL_ASSEMBLY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.PusherImpl <em>Pusher</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.PusherImpl
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.ComponentRepositoryPackageImpl#getPusher()
	 * @generated
	 */
	int PUSHER = 31;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSHER__ID = COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSHER__NAME = COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Connected Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSHER__CONNECTED_INTERFACES = COMPONENT__CONNECTED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSHER__PARENT = COMPONENT__PARENT;

	/**
	 * The feature id for the '<em><b>Parent Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSHER__PARENT_MODULE = COMPONENT__PARENT_MODULE;

	/**
	 * The feature id for the '<em><b>Components Repository</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSHER__COMPONENTS_REPOSITORY = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fixture Cylinder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSHER__FIXTURE_CYLINDER = COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Monostable Cylinder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSHER__MONOSTABLE_CYLINDER = COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Bus Box</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSHER__BUS_BOX = COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Bus Cable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSHER__BUS_CABLE = COMPONENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Pusher</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSHER_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Pusher</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSHER_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.TurningTableImpl <em>Turning Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.TurningTableImpl
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.ComponentRepositoryPackageImpl#getTurningTable()
	 * @generated
	 */
	int TURNING_TABLE = 32;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURNING_TABLE__ID = ModuleRepositoryPackage.MODULE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURNING_TABLE__NAME = ModuleRepositoryPackage.MODULE__NAME;

	/**
	 * The feature id for the '<em><b>Parent Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURNING_TABLE__PARENT_ENTITY = ModuleRepositoryPackage.MODULE__PARENT_ENTITY;

	/**
	 * The feature id for the '<em><b>Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURNING_TABLE__MODULES = ModuleRepositoryPackage.MODULE__MODULES;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURNING_TABLE__COMPONENTS = ModuleRepositoryPackage.MODULE__COMPONENTS;

	/**
	 * The feature id for the '<em><b>Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURNING_TABLE__INTERFACES = ModuleRepositoryPackage.MODULE__INTERFACES;

	/**
	 * The feature id for the '<em><b>Rack for turningtable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURNING_TABLE__RACK_FOR_TURNINGTABLE = ModuleRepositoryPackage.MODULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Table to stand on</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURNING_TABLE__TABLE_TO_STAND_ON = ModuleRepositoryPackage.MODULE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Motor to drive</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURNING_TABLE__MOTOR_TO_DRIVE = ModuleRepositoryPackage.MODULE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Microswitch Module</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURNING_TABLE__MICROSWITCH_MODULE = ModuleRepositoryPackage.MODULE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Bus Slave</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURNING_TABLE__BUS_SLAVE = ModuleRepositoryPackage.MODULE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Bus Box</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURNING_TABLE__BUS_BOX = ModuleRepositoryPackage.MODULE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Bus Cable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURNING_TABLE__BUS_CABLE = ModuleRepositoryPackage.MODULE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Potentiometer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURNING_TABLE__POTENTIOMETER = ModuleRepositoryPackage.MODULE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Turning Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURNING_TABLE_FEATURE_COUNT = ModuleRepositoryPackage.MODULE_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Turning Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURNING_TABLE_OPERATION_COUNT = ModuleRepositoryPackage.MODULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.ControllerImpl <em>Controller</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.ControllerImpl
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.ComponentRepositoryPackageImpl#getController()
	 * @generated
	 */
	int CONTROLLER = 33;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER__ID = COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER__NAME = COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Connected Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER__CONNECTED_INTERFACES = COMPONENT__CONNECTED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER__PARENT = COMPONENT__PARENT;

	/**
	 * The feature id for the '<em><b>Parent Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER__PARENT_MODULE = COMPONENT__PARENT_MODULE;

	/**
	 * The feature id for the '<em><b>Powersupply</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER__POWERSUPPLY = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Controller Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER__CONTROLLER_OF = COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.LogicalWiringImpl <em>Logical Wiring</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.LogicalWiringImpl
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.ComponentRepositoryPackageImpl#getLogicalWiring()
	 * @generated
	 */
	int LOGICAL_WIRING = 34;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_WIRING__ID = COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_WIRING__NAME = COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Connected Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_WIRING__CONNECTED_INTERFACES = COMPONENT__CONNECTED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_WIRING__PARENT = COMPONENT__PARENT;

	/**
	 * The feature id for the '<em><b>Parent Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_WIRING__PARENT_MODULE = COMPONENT__PARENT_MODULE;

	/**
	 * The feature id for the '<em><b>Bus Cable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_WIRING__BUS_CABLE = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Logical Wiring</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_WIRING_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Logical Wiring</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_WIRING_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.VacuumSwitchImpl <em>Vacuum Switch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.VacuumSwitchImpl
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.ComponentRepositoryPackageImpl#getVacuumSwitch()
	 * @generated
	 */
	int VACUUM_SWITCH = 35;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VACUUM_SWITCH__ID = ElectronicComponentsPackage.SWITCH__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VACUUM_SWITCH__NAME = ElectronicComponentsPackage.SWITCH__NAME;

	/**
	 * The feature id for the '<em><b>Connected Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VACUUM_SWITCH__CONNECTED_INTERFACES = ElectronicComponentsPackage.SWITCH__CONNECTED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VACUUM_SWITCH__PARENT = ElectronicComponentsPackage.SWITCH__PARENT;

	/**
	 * The feature id for the '<em><b>Parent Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VACUUM_SWITCH__PARENT_MODULE = ElectronicComponentsPackage.SWITCH__PARENT_MODULE;

	/**
	 * The feature id for the '<em><b>Pin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VACUUM_SWITCH__PIN = ElectronicComponentsPackage.SWITCH__PIN;

	/**
	 * The feature id for the '<em><b>Physicalconnection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VACUUM_SWITCH__PHYSICALCONNECTION = ElectronicComponentsPackage.SWITCH__PHYSICALCONNECTION;

	/**
	 * The number of structural features of the '<em>Vacuum Switch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VACUUM_SWITCH_FEATURE_COUNT = ElectronicComponentsPackage.SWITCH_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Vacuum Switch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VACUUM_SWITCH_OPERATION_COUNT = ElectronicComponentsPackage.SWITCH_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.ReedSwitchImpl <em>Reed Switch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.ReedSwitchImpl
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.ComponentRepositoryPackageImpl#getReedSwitch()
	 * @generated
	 */
	int REED_SWITCH = 36;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REED_SWITCH__ID = ElectronicComponentsPackage.SWITCH__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REED_SWITCH__NAME = ElectronicComponentsPackage.SWITCH__NAME;

	/**
	 * The feature id for the '<em><b>Connected Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REED_SWITCH__CONNECTED_INTERFACES = ElectronicComponentsPackage.SWITCH__CONNECTED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REED_SWITCH__PARENT = ElectronicComponentsPackage.SWITCH__PARENT;

	/**
	 * The feature id for the '<em><b>Parent Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REED_SWITCH__PARENT_MODULE = ElectronicComponentsPackage.SWITCH__PARENT_MODULE;

	/**
	 * The feature id for the '<em><b>Pin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REED_SWITCH__PIN = ElectronicComponentsPackage.SWITCH__PIN;

	/**
	 * The feature id for the '<em><b>Physicalconnection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REED_SWITCH__PHYSICALCONNECTION = ElectronicComponentsPackage.SWITCH__PHYSICALCONNECTION;

	/**
	 * The number of structural features of the '<em>Reed Switch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REED_SWITCH_FEATURE_COUNT = ElectronicComponentsPackage.SWITCH_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Reed Switch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REED_SWITCH_OPERATION_COUNT = ElectronicComponentsPackage.SWITCH_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.PowerSplitterImpl <em>Power Splitter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.PowerSplitterImpl
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.ComponentRepositoryPackageImpl#getPowerSplitter()
	 * @generated
	 */
	int POWER_SPLITTER = 37;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_SPLITTER__ID = SPLITTER__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_SPLITTER__NAME = SPLITTER__NAME;

	/**
	 * The feature id for the '<em><b>Connected Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_SPLITTER__CONNECTED_INTERFACES = SPLITTER__CONNECTED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_SPLITTER__PARENT = SPLITTER__PARENT;

	/**
	 * The feature id for the '<em><b>Parent Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_SPLITTER__PARENT_MODULE = SPLITTER__PARENT_MODULE;

	/**
	 * The feature id for the '<em><b>Screwing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_SPLITTER__SCREWING = SPLITTER__SCREWING;

	/**
	 * The feature id for the '<em><b>Powersupply</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_SPLITTER__POWERSUPPLY = SPLITTER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Power Splitter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_SPLITTER_FEATURE_COUNT = SPLITTER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Power Splitter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_SPLITTER_OPERATION_COUNT = SPLITTER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.WaterSplitterImpl <em>Water Splitter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.WaterSplitterImpl
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.ComponentRepositoryPackageImpl#getWaterSplitter()
	 * @generated
	 */
	int WATER_SPLITTER = 38;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATER_SPLITTER__ID = SPLITTER__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATER_SPLITTER__NAME = SPLITTER__NAME;

	/**
	 * The feature id for the '<em><b>Connected Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATER_SPLITTER__CONNECTED_INTERFACES = SPLITTER__CONNECTED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATER_SPLITTER__PARENT = SPLITTER__PARENT;

	/**
	 * The feature id for the '<em><b>Parent Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATER_SPLITTER__PARENT_MODULE = SPLITTER__PARENT_MODULE;

	/**
	 * The feature id for the '<em><b>Screwing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATER_SPLITTER__SCREWING = SPLITTER__SCREWING;

	/**
	 * The feature id for the '<em><b>Watersupply</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATER_SPLITTER__WATERSUPPLY = SPLITTER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Water Splitter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATER_SPLITTER_FEATURE_COUNT = SPLITTER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Water Splitter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATER_SPLITTER_OPERATION_COUNT = SPLITTER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.PneumaticSplitterImpl <em>Pneumatic Splitter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.PneumaticSplitterImpl
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.ComponentRepositoryPackageImpl#getPneumaticSplitter()
	 * @generated
	 */
	int PNEUMATIC_SPLITTER = 39;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PNEUMATIC_SPLITTER__ID = SPLITTER__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PNEUMATIC_SPLITTER__NAME = SPLITTER__NAME;

	/**
	 * The feature id for the '<em><b>Connected Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PNEUMATIC_SPLITTER__CONNECTED_INTERFACES = SPLITTER__CONNECTED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PNEUMATIC_SPLITTER__PARENT = SPLITTER__PARENT;

	/**
	 * The feature id for the '<em><b>Parent Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PNEUMATIC_SPLITTER__PARENT_MODULE = SPLITTER__PARENT_MODULE;

	/**
	 * The feature id for the '<em><b>Screwing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PNEUMATIC_SPLITTER__SCREWING = SPLITTER__SCREWING;

	/**
	 * The feature id for the '<em><b>Pneumaticsupply</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PNEUMATIC_SPLITTER__PNEUMATICSUPPLY = SPLITTER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pneumatic Splitter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PNEUMATIC_SPLITTER_FEATURE_COUNT = SPLITTER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Pneumatic Splitter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PNEUMATIC_SPLITTER_OPERATION_COUNT = SPLITTER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.CylinderPartImpl <em>Cylinder Part</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.CylinderPartImpl
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.ComponentRepositoryPackageImpl#getCylinderPart()
	 * @generated
	 */
	int CYLINDER_PART = 40;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYLINDER_PART__ID = MechanicalComponentsPackage.MECHANICAL_PART__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYLINDER_PART__NAME = MechanicalComponentsPackage.MECHANICAL_PART__NAME;

	/**
	 * The feature id for the '<em><b>Connected Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYLINDER_PART__CONNECTED_INTERFACES = MechanicalComponentsPackage.MECHANICAL_PART__CONNECTED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYLINDER_PART__PARENT = MechanicalComponentsPackage.MECHANICAL_PART__PARENT;

	/**
	 * The feature id for the '<em><b>Parent Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYLINDER_PART__PARENT_MODULE = MechanicalComponentsPackage.MECHANICAL_PART__PARENT_MODULE;

	/**
	 * The feature id for the '<em><b>Screwing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYLINDER_PART__SCREWING = MechanicalComponentsPackage.MECHANICAL_PART__SCREWING;

	/**
	 * The number of structural features of the '<em>Cylinder Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYLINDER_PART_FEATURE_COUNT = MechanicalComponentsPackage.MECHANICAL_PART_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Cylinder Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYLINDER_PART_OPERATION_COUNT = MechanicalComponentsPackage.MECHANICAL_PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.MonostableCylinderImpl <em>Monostable Cylinder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.MonostableCylinderImpl
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.ComponentRepositoryPackageImpl#getMonostableCylinder()
	 * @generated
	 */
	int MONOSTABLE_CYLINDER = 41;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONOSTABLE_CYLINDER__ID = CYLINDER__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONOSTABLE_CYLINDER__NAME = CYLINDER__NAME;

	/**
	 * The feature id for the '<em><b>Connected Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONOSTABLE_CYLINDER__CONNECTED_INTERFACES = CYLINDER__CONNECTED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONOSTABLE_CYLINDER__PARENT = CYLINDER__PARENT;

	/**
	 * The feature id for the '<em><b>Parent Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONOSTABLE_CYLINDER__PARENT_MODULE = CYLINDER__PARENT_MODULE;

	/**
	 * The feature id for the '<em><b>Pneumaticsupply</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONOSTABLE_CYLINDER__PNEUMATICSUPPLY = CYLINDER__PNEUMATICSUPPLY;

	/**
	 * The feature id for the '<em><b>Signal Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONOSTABLE_CYLINDER__SIGNAL_INTERFACE = CYLINDER__SIGNAL_INTERFACE;

	/**
	 * The feature id for the '<em><b>Housing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONOSTABLE_CYLINDER__HOUSING = CYLINDER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Spring</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONOSTABLE_CYLINDER__SPRING = CYLINDER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Reed Switches</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONOSTABLE_CYLINDER__REED_SWITCHES = CYLINDER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Cylinder Part</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONOSTABLE_CYLINDER__CYLINDER_PART = CYLINDER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Valve</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONOSTABLE_CYLINDER__VALVE = CYLINDER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Bus Slave</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONOSTABLE_CYLINDER__BUS_SLAVE = CYLINDER_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Monostable Cylinder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONOSTABLE_CYLINDER_FEATURE_COUNT = CYLINDER_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Monostable Cylinder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONOSTABLE_CYLINDER_OPERATION_COUNT = CYLINDER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.ComponentRepositoryImpl <em>Component Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.ComponentRepositoryImpl
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.ComponentRepositoryPackageImpl#getComponentRepository()
	 * @generated
	 */
	int COMPONENT_REPOSITORY = 42;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_REPOSITORY__ID = BasicPackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_REPOSITORY__NAME = BasicPackage.ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>All Components In Plant</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_REPOSITORY__ALL_COMPONENTS_IN_PLANT = BasicPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Component Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_REPOSITORY_FEATURE_COUNT = BasicPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Component Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_REPOSITORY_OPERATION_COUNT = BasicPackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.FixtureImpl <em>Fixture</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.FixtureImpl
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.ComponentRepositoryPackageImpl#getFixture()
	 * @generated
	 */
	int FIXTURE = 43;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXTURE__ID = COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXTURE__NAME = COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Connected Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXTURE__CONNECTED_INTERFACES = COMPONENT__CONNECTED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXTURE__PARENT = COMPONENT__PARENT;

	/**
	 * The feature id for the '<em><b>Parent Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXTURE__PARENT_MODULE = COMPONENT__PARENT_MODULE;

	/**
	 * The number of structural features of the '<em>Fixture</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXTURE_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Fixture</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXTURE_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Component
	 * @generated
	 */
	EClass getComponent();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Component#getConnectedInterfaces <em>Connected Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Connected Interfaces</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Component#getConnectedInterfaces()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_ConnectedInterfaces();

	/**
	 * Returns the meta object for the container reference '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Component#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Component#getParent()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Parent();

	/**
	 * Returns the meta object for the container reference '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Component#getParentModule <em>Parent Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent Module</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Component#getParentModule()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_ParentModule();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Panel <em>Panel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Panel</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Panel
	 * @generated
	 */
	EClass getPanel();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Panel#getComponentRepository <em>Component Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Component Repository</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Panel#getComponentRepository()
	 * @see #getPanel()
	 * @generated
	 */
	EReference getPanel_ComponentRepository();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.OperationPanel <em>Operation Panel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation Panel</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.OperationPanel
	 * @generated
	 */
	EClass getOperationPanel();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.OperationPanel#getScrewing_rack <em>Screwing rack</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Screwing rack</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.OperationPanel#getScrewing_rack()
	 * @see #getOperationPanel()
	 * @generated
	 */
	EReference getOperationPanel_Screwing_rack();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.OperationPanel#getLeds <em>Leds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Leds</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.OperationPanel#getLeds()
	 * @see #getOperationPanel()
	 * @generated
	 */
	EReference getOperationPanel_Leds();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.OperationPanel#getButtons <em>Buttons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Buttons</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.OperationPanel#getButtons()
	 * @see #getOperationPanel()
	 * @generated
	 */
	EReference getOperationPanel_Buttons();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Motor <em>Motor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Motor</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Motor
	 * @generated
	 */
	EClass getMotor();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Motor#getGearing <em>Gearing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gearing</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Motor#getGearing()
	 * @see #getMotor()
	 * @generated
	 */
	EReference getMotor_Gearing();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Motor#getScrewing <em>Screwing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Screwing</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Motor#getScrewing()
	 * @see #getMotor()
	 * @generated
	 */
	EReference getMotor_Screwing();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Motor#getPowersupply <em>Powersupply</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Powersupply</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Motor#getPowersupply()
	 * @see #getMotor()
	 * @generated
	 */
	EReference getMotor_Powersupply();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.SimpleMotor <em>Simple Motor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Motor</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.SimpleMotor
	 * @generated
	 */
	EClass getSimpleMotor();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.MechanicalAssembly <em>Mechanical Assembly</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mechanical Assembly</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.MechanicalAssembly
	 * @generated
	 */
	EClass getMechanicalAssembly();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.RegularRamp <em>Regular Ramp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Regular Ramp</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.RegularRamp
	 * @generated
	 */
	EClass getRegularRamp();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Sensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sensor</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Sensor
	 * @generated
	 */
	EClass getSensor();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Sensor#getPhysicalconnection <em>Physicalconnection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Physicalconnection</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Sensor#getPhysicalconnection()
	 * @see #getSensor()
	 * @generated
	 */
	EReference getSensor_Physicalconnection();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Sensor#getSignalinterface <em>Signalinterface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Signalinterface</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Sensor#getSignalinterface()
	 * @see #getSensor()
	 * @generated
	 */
	EReference getSensor_Signalinterface();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Sensor#getPowersupply <em>Powersupply</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Powersupply</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Sensor#getPowersupply()
	 * @see #getSensor()
	 * @generated
	 */
	EReference getSensor_Powersupply();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.OpticalSensor <em>Optical Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Optical Sensor</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.OpticalSensor
	 * @generated
	 */
	EClass getOpticalSensor();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.InductiveSensor <em>Inductive Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inductive Sensor</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.InductiveSensor
	 * @generated
	 */
	EClass getInductiveSensor();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.PresenceSensor <em>Presence Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Presence Sensor</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.PresenceSensor
	 * @generated
	 */
	EClass getPresenceSensor();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.PressureSensor <em>Pressure Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pressure Sensor</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.PressureSensor
	 * @generated
	 */
	EClass getPressureSensor();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Pipe <em>Pipe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pipe</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Pipe
	 * @generated
	 */
	EClass getPipe();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Pipe#getPlugs <em>Plugs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Plugs</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Pipe#getPlugs()
	 * @see #getPipe()
	 * @generated
	 */
	EReference getPipe_Plugs();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.PneumaticPipe <em>Pneumatic Pipe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pneumatic Pipe</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.PneumaticPipe
	 * @generated
	 */
	EClass getPneumaticPipe();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Compressor <em>Compressor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compressor</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Compressor
	 * @generated
	 */
	EClass getCompressor();

	/**
	 * Returns the meta object for the containment reference '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Compressor#getPowersupply <em>Powersupply</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Powersupply</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Compressor#getPowersupply()
	 * @see #getCompressor()
	 * @generated
	 */
	EReference getCompressor_Powersupply();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Compressor#getPneumaticsupply <em>Pneumaticsupply</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pneumaticsupply</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Compressor#getPneumaticsupply()
	 * @see #getCompressor()
	 * @generated
	 */
	EReference getCompressor_Pneumaticsupply();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Compressor#getPins <em>Pins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pins</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Compressor#getPins()
	 * @see #getCompressor()
	 * @generated
	 */
	EReference getCompressor_Pins();

	/**
	 * Returns the meta object for the containment reference '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Compressor#getScrewing <em>Screwing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Screwing</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Compressor#getScrewing()
	 * @see #getCompressor()
	 * @generated
	 */
	EReference getCompressor_Screwing();

	/**
	 * Returns the meta object for the containment reference '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Compressor#getSwitch <em>Switch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Switch</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Compressor#getSwitch()
	 * @see #getCompressor()
	 * @generated
	 */
	EReference getCompressor_Switch();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Cable <em>Cable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cable</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Cable
	 * @generated
	 */
	EClass getCable();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.PowerCable <em>Power Cable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Power Cable</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.PowerCable
	 * @generated
	 */
	EClass getPowerCable();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Cylinder <em>Cylinder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cylinder</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Cylinder
	 * @generated
	 */
	EClass getCylinder();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Cylinder#getPneumaticsupply <em>Pneumaticsupply</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pneumaticsupply</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Cylinder#getPneumaticsupply()
	 * @see #getCylinder()
	 * @generated
	 */
	EReference getCylinder_Pneumaticsupply();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Cylinder#getSignalInterface <em>Signal Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Signal Interface</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Cylinder#getSignalInterface()
	 * @see #getCylinder()
	 * @generated
	 */
	EReference getCylinder_SignalInterface();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.ProportionalCylinder <em>Proportional Cylinder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Proportional Cylinder</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.ProportionalCylinder
	 * @generated
	 */
	EClass getProportionalCylinder();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.BistableCylinder <em>Bistable Cylinder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bistable Cylinder</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.BistableCylinder
	 * @generated
	 */
	EClass getBistableCylinder();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Rack <em>Rack</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rack</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Rack
	 * @generated
	 */
	EClass getRack();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Rack#getScrewing_to_base <em>Screwing to base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Screwing to base</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Rack#getScrewing_to_base()
	 * @see #getRack()
	 * @generated
	 */
	EReference getRack_Screwing_to_base();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Corner <em>Corner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Corner</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Corner
	 * @generated
	 */
	EClass getCorner();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Valve <em>Valve</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Valve</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Valve
	 * @generated
	 */
	EClass getValve();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Valve#getPneumaticsupply <em>Pneumaticsupply</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pneumaticsupply</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Valve#getPneumaticsupply()
	 * @see #getValve()
	 * @generated
	 */
	EReference getValve_Pneumaticsupply();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Valve#getPowersupply <em>Powersupply</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Powersupply</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Valve#getPowersupply()
	 * @see #getValve()
	 * @generated
	 */
	EReference getValve_Powersupply();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Valve#getSignalinterface <em>Signalinterface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Signalinterface</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Valve#getSignalinterface()
	 * @see #getValve()
	 * @generated
	 */
	EReference getValve_Signalinterface();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.RegularValve <em>Regular Valve</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Regular Valve</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.RegularValve
	 * @generated
	 */
	EClass getRegularValve();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Tank <em>Tank</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tank</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Tank
	 * @generated
	 */
	EClass getTank();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Tank#getWatersupply <em>Watersupply</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Watersupply</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Tank#getWatersupply()
	 * @see #getTank()
	 * @generated
	 */
	EReference getTank_Watersupply();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Tank#getScrewing <em>Screwing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Screwing</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Tank#getScrewing()
	 * @see #getTank()
	 * @generated
	 */
	EReference getTank_Screwing();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Dispenser <em>Dispenser</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dispenser</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Dispenser
	 * @generated
	 */
	EClass getDispenser();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.BottleSeperator <em>Bottle Seperator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bottle Seperator</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.BottleSeperator
	 * @generated
	 */
	EClass getBottleSeperator();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.BottleSeperator#getSignalinterface <em>Signalinterface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Signalinterface</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.BottleSeperator#getSignalinterface()
	 * @see #getBottleSeperator()
	 * @generated
	 */
	EReference getBottleSeperator_Signalinterface();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.BottleSeperator#getPneumaticsupply <em>Pneumaticsupply</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pneumaticsupply</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.BottleSeperator#getPneumaticsupply()
	 * @see #getBottleSeperator()
	 * @generated
	 */
	EReference getBottleSeperator_Pneumaticsupply();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.BottleSeperator#getPowersupply <em>Powersupply</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Powersupply</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.BottleSeperator#getPowersupply()
	 * @see #getBottleSeperator()
	 * @generated
	 */
	EReference getBottleSeperator_Powersupply();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.BottleSeperator#getScrewing_to_rack <em>Screwing to rack</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Screwing to rack</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.BottleSeperator#getScrewing_to_rack()
	 * @see #getBottleSeperator()
	 * @generated
	 */
	EReference getBottleSeperator_Screwing_to_rack();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Splitter <em>Splitter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Splitter</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Splitter
	 * @generated
	 */
	EClass getSplitter();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Splitter#getScrewing <em>Screwing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Screwing</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Splitter#getScrewing()
	 * @see #getSplitter()
	 * @generated
	 */
	EReference getSplitter_Screwing();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.PowerSupply <em>Power Supply</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Power Supply</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.PowerSupply
	 * @generated
	 */
	EClass getPowerSupply();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.ConveyorBelt <em>Conveyor Belt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conveyor Belt</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.ConveyorBelt
	 * @generated
	 */
	EClass getConveyorBelt();

	/**
	 * Returns the meta object for the container reference '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.ConveyorBelt#getMountedTo <em>Mounted To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Mounted To</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.ConveyorBelt#getMountedTo()
	 * @see #getConveyorBelt()
	 * @generated
	 */
	EReference getConveyorBelt_MountedTo();

	/**
	 * Returns the meta object for the containment reference '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.ConveyorBelt#getFrame <em>Frame</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Frame</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.ConveyorBelt#getFrame()
	 * @see #getConveyorBelt()
	 * @generated
	 */
	EReference getConveyorBelt_Frame();

	/**
	 * Returns the meta object for the containment reference '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.ConveyorBelt#getRubberBand <em>Rubber Band</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rubber Band</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.ConveyorBelt#getRubberBand()
	 * @see #getConveyorBelt()
	 * @generated
	 */
	EReference getConveyorBelt_RubberBand();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Frame <em>Frame</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Frame</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Frame
	 * @generated
	 */
	EClass getFrame();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Pusher <em>Pusher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pusher</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Pusher
	 * @generated
	 */
	EClass getPusher();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Pusher#getComponentsRepository <em>Components Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Components Repository</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Pusher#getComponentsRepository()
	 * @see #getPusher()
	 * @generated
	 */
	EReference getPusher_ComponentsRepository();

	/**
	 * Returns the meta object for the containment reference '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Pusher#getFixtureCylinder <em>Fixture Cylinder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fixture Cylinder</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Pusher#getFixtureCylinder()
	 * @see #getPusher()
	 * @generated
	 */
	EReference getPusher_FixtureCylinder();

	/**
	 * Returns the meta object for the containment reference '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Pusher#getMonostableCylinder <em>Monostable Cylinder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Monostable Cylinder</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Pusher#getMonostableCylinder()
	 * @see #getPusher()
	 * @generated
	 */
	EReference getPusher_MonostableCylinder();

	/**
	 * Returns the meta object for the containment reference '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Pusher#getBusBox <em>Bus Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bus Box</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Pusher#getBusBox()
	 * @see #getPusher()
	 * @generated
	 */
	EReference getPusher_BusBox();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Pusher#getBusCable <em>Bus Cable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bus Cable</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Pusher#getBusCable()
	 * @see #getPusher()
	 * @generated
	 */
	EReference getPusher_BusCable();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.TurningTable <em>Turning Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Turning Table</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.TurningTable
	 * @generated
	 */
	EClass getTurningTable();

	/**
	 * Returns the meta object for the containment reference '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.TurningTable#getRack_for_turningtable <em>Rack for turningtable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rack for turningtable</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.TurningTable#getRack_for_turningtable()
	 * @see #getTurningTable()
	 * @generated
	 */
	EReference getTurningTable_Rack_for_turningtable();

	/**
	 * Returns the meta object for the containment reference '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.TurningTable#getTable_to_stand_on <em>Table to stand on</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Table to stand on</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.TurningTable#getTable_to_stand_on()
	 * @see #getTurningTable()
	 * @generated
	 */
	EReference getTurningTable_Table_to_stand_on();

	/**
	 * Returns the meta object for the containment reference '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.TurningTable#getMotor_to_drive <em>Motor to drive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Motor to drive</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.TurningTable#getMotor_to_drive()
	 * @see #getTurningTable()
	 * @generated
	 */
	EReference getTurningTable_Motor_to_drive();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.TurningTable#getMicroswitchModule <em>Microswitch Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Microswitch Module</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.TurningTable#getMicroswitchModule()
	 * @see #getTurningTable()
	 * @generated
	 */
	EReference getTurningTable_MicroswitchModule();

	/**
	 * Returns the meta object for the containment reference '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.TurningTable#getBusSlave <em>Bus Slave</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bus Slave</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.TurningTable#getBusSlave()
	 * @see #getTurningTable()
	 * @generated
	 */
	EReference getTurningTable_BusSlave();

	/**
	 * Returns the meta object for the containment reference '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.TurningTable#getBusBox <em>Bus Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bus Box</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.TurningTable#getBusBox()
	 * @see #getTurningTable()
	 * @generated
	 */
	EReference getTurningTable_BusBox();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.TurningTable#getBusCable <em>Bus Cable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bus Cable</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.TurningTable#getBusCable()
	 * @see #getTurningTable()
	 * @generated
	 */
	EReference getTurningTable_BusCable();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.TurningTable#getPotentiometer <em>Potentiometer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Potentiometer</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.TurningTable#getPotentiometer()
	 * @see #getTurningTable()
	 * @generated
	 */
	EReference getTurningTable_Potentiometer();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Controller <em>Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Controller</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Controller
	 * @generated
	 */
	EClass getController();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Controller#getPowersupply <em>Powersupply</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Powersupply</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Controller#getPowersupply()
	 * @see #getController()
	 * @generated
	 */
	EReference getController_Powersupply();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Controller#getControllerOf <em>Controller Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Controller Of</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Controller#getControllerOf()
	 * @see #getController()
	 * @generated
	 */
	EReference getController_ControllerOf();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.LogicalWiring <em>Logical Wiring</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logical Wiring</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.LogicalWiring
	 * @generated
	 */
	EClass getLogicalWiring();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.LogicalWiring#getBusCable <em>Bus Cable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bus Cable</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.LogicalWiring#getBusCable()
	 * @see #getLogicalWiring()
	 * @generated
	 */
	EReference getLogicalWiring_BusCable();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.VacuumSwitch <em>Vacuum Switch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vacuum Switch</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.VacuumSwitch
	 * @generated
	 */
	EClass getVacuumSwitch();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.ReedSwitch <em>Reed Switch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reed Switch</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.ReedSwitch
	 * @generated
	 */
	EClass getReedSwitch();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.PowerSplitter <em>Power Splitter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Power Splitter</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.PowerSplitter
	 * @generated
	 */
	EClass getPowerSplitter();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.PowerSplitter#getPowersupply <em>Powersupply</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Powersupply</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.PowerSplitter#getPowersupply()
	 * @see #getPowerSplitter()
	 * @generated
	 */
	EReference getPowerSplitter_Powersupply();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.WaterSplitter <em>Water Splitter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Water Splitter</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.WaterSplitter
	 * @generated
	 */
	EClass getWaterSplitter();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.WaterSplitter#getWatersupply <em>Watersupply</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Watersupply</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.WaterSplitter#getWatersupply()
	 * @see #getWaterSplitter()
	 * @generated
	 */
	EReference getWaterSplitter_Watersupply();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.PneumaticSplitter <em>Pneumatic Splitter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pneumatic Splitter</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.PneumaticSplitter
	 * @generated
	 */
	EClass getPneumaticSplitter();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.PneumaticSplitter#getPneumaticsupply <em>Pneumaticsupply</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pneumaticsupply</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.PneumaticSplitter#getPneumaticsupply()
	 * @see #getPneumaticSplitter()
	 * @generated
	 */
	EReference getPneumaticSplitter_Pneumaticsupply();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.CylinderPart <em>Cylinder Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cylinder Part</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.CylinderPart
	 * @generated
	 */
	EClass getCylinderPart();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.MonostableCylinder <em>Monostable Cylinder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Monostable Cylinder</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.MonostableCylinder
	 * @generated
	 */
	EClass getMonostableCylinder();

	/**
	 * Returns the meta object for the containment reference '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.MonostableCylinder#getHousing <em>Housing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Housing</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.MonostableCylinder#getHousing()
	 * @see #getMonostableCylinder()
	 * @generated
	 */
	EReference getMonostableCylinder_Housing();

	/**
	 * Returns the meta object for the containment reference '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.MonostableCylinder#getSpring <em>Spring</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Spring</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.MonostableCylinder#getSpring()
	 * @see #getMonostableCylinder()
	 * @generated
	 */
	EReference getMonostableCylinder_Spring();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.MonostableCylinder#getReedSwitches <em>Reed Switches</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Reed Switches</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.MonostableCylinder#getReedSwitches()
	 * @see #getMonostableCylinder()
	 * @generated
	 */
	EReference getMonostableCylinder_ReedSwitches();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.MonostableCylinder#getCylinderPart <em>Cylinder Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cylinder Part</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.MonostableCylinder#getCylinderPart()
	 * @see #getMonostableCylinder()
	 * @generated
	 */
	EReference getMonostableCylinder_CylinderPart();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.MonostableCylinder#getValve <em>Valve</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Valve</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.MonostableCylinder#getValve()
	 * @see #getMonostableCylinder()
	 * @generated
	 */
	EReference getMonostableCylinder_Valve();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.MonostableCylinder#getBusSlave <em>Bus Slave</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bus Slave</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.MonostableCylinder#getBusSlave()
	 * @see #getMonostableCylinder()
	 * @generated
	 */
	EReference getMonostableCylinder_BusSlave();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.ComponentRepository <em>Component Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Repository</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.ComponentRepository
	 * @generated
	 */
	EClass getComponentRepository();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.ComponentRepository#getAllComponentsInPlant <em>All Components In Plant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>All Components In Plant</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.ComponentRepository#getAllComponentsInPlant()
	 * @see #getComponentRepository()
	 * @generated
	 */
	EReference getComponentRepository_AllComponentsInPlant();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Fixture <em>Fixture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fixture</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Fixture
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
	ComponentRepositoryFactory getComponentRepositoryFactory();

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
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.ComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.ComponentImpl
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.ComponentRepositoryPackageImpl#getComponent()
		 * @generated
		 */
		EClass COMPONENT = eINSTANCE.getComponent();

		/**
		 * The meta object literal for the '<em><b>Connected Interfaces</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__CONNECTED_INTERFACES = eINSTANCE.getComponent_ConnectedInterfaces();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__PARENT = eINSTANCE.getComponent_Parent();

		/**
		 * The meta object literal for the '<em><b>Parent Module</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__PARENT_MODULE = eINSTANCE.getComponent_ParentModule();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.PanelImpl <em>Panel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.PanelImpl
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.ComponentRepositoryPackageImpl#getPanel()
		 * @generated
		 */
		EClass PANEL = eINSTANCE.getPanel();

		/**
		 * The meta object literal for the '<em><b>Component Repository</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PANEL__COMPONENT_REPOSITORY = eINSTANCE.getPanel_ComponentRepository();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.OperationPanelImpl <em>Operation Panel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.OperationPanelImpl
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.ComponentRepositoryPackageImpl#getOperationPanel()
		 * @generated
		 */
		EClass OPERATION_PANEL = eINSTANCE.getOperationPanel();

		/**
		 * The meta object literal for the '<em><b>Screwing rack</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_PANEL__SCREWING_RACK = eINSTANCE.getOperationPanel_Screwing_rack();

		/**
		 * The meta object literal for the '<em><b>Leds</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_PANEL__LEDS = eINSTANCE.getOperationPanel_Leds();

		/**
		 * The meta object literal for the '<em><b>Buttons</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_PANEL__BUTTONS = eINSTANCE.getOperationPanel_Buttons();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.MotorImpl <em>Motor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.MotorImpl
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.ComponentRepositoryPackageImpl#getMotor()
		 * @generated
		 */
		EClass MOTOR = eINSTANCE.getMotor();

		/**
		 * The meta object literal for the '<em><b>Gearing</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOTOR__GEARING = eINSTANCE.getMotor_Gearing();

		/**
		 * The meta object literal for the '<em><b>Screwing</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOTOR__SCREWING = eINSTANCE.getMotor_Screwing();

		/**
		 * The meta object literal for the '<em><b>Powersupply</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOTOR__POWERSUPPLY = eINSTANCE.getMotor_Powersupply();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.SimpleMotorImpl <em>Simple Motor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.SimpleMotorImpl
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.ComponentRepositoryPackageImpl#getSimpleMotor()
		 * @generated
		 */
		EClass SIMPLE_MOTOR = eINSTANCE.getSimpleMotor();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.MechanicalAssemblyImpl <em>Mechanical Assembly</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.MechanicalAssemblyImpl
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.ComponentRepositoryPackageImpl#getMechanicalAssembly()
		 * @generated
		 */
		EClass MECHANICAL_ASSEMBLY = eINSTANCE.getMechanicalAssembly();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.RegularRampImpl <em>Regular Ramp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.RegularRampImpl
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.ComponentRepositoryPackageImpl#getRegularRamp()
		 * @generated
		 */
		EClass REGULAR_RAMP = eINSTANCE.getRegularRamp();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.SensorImpl <em>Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.SensorImpl
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.ComponentRepositoryPackageImpl#getSensor()
		 * @generated
		 */
		EClass SENSOR = eINSTANCE.getSensor();

		/**
		 * The meta object literal for the '<em><b>Physicalconnection</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENSOR__PHYSICALCONNECTION = eINSTANCE.getSensor_Physicalconnection();

		/**
		 * The meta object literal for the '<em><b>Signalinterface</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENSOR__SIGNALINTERFACE = eINSTANCE.getSensor_Signalinterface();

		/**
		 * The meta object literal for the '<em><b>Powersupply</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENSOR__POWERSUPPLY = eINSTANCE.getSensor_Powersupply();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.OpticalSensorImpl <em>Optical Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.OpticalSensorImpl
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.ComponentRepositoryPackageImpl#getOpticalSensor()
		 * @generated
		 */
		EClass OPTICAL_SENSOR = eINSTANCE.getOpticalSensor();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.InductiveSensorImpl <em>Inductive Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.InductiveSensorImpl
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.ComponentRepositoryPackageImpl#getInductiveSensor()
		 * @generated
		 */
		EClass INDUCTIVE_SENSOR = eINSTANCE.getInductiveSensor();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.PresenceSensorImpl <em>Presence Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.PresenceSensorImpl
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.ComponentRepositoryPackageImpl#getPresenceSensor()
		 * @generated
		 */
		EClass PRESENCE_SENSOR = eINSTANCE.getPresenceSensor();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.PressureSensorImpl <em>Pressure Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.PressureSensorImpl
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.ComponentRepositoryPackageImpl#getPressureSensor()
		 * @generated
		 */
		EClass PRESSURE_SENSOR = eINSTANCE.getPressureSensor();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.PipeImpl <em>Pipe</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.PipeImpl
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.ComponentRepositoryPackageImpl#getPipe()
		 * @generated
		 */
		EClass PIPE = eINSTANCE.getPipe();

		/**
		 * The meta object literal for the '<em><b>Plugs</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIPE__PLUGS = eINSTANCE.getPipe_Plugs();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.PneumaticPipeImpl <em>Pneumatic Pipe</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.PneumaticPipeImpl
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.ComponentRepositoryPackageImpl#getPneumaticPipe()
		 * @generated
		 */
		EClass PNEUMATIC_PIPE = eINSTANCE.getPneumaticPipe();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.CompressorImpl <em>Compressor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.CompressorImpl
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.ComponentRepositoryPackageImpl#getCompressor()
		 * @generated
		 */
		EClass COMPRESSOR = eINSTANCE.getCompressor();

		/**
		 * The meta object literal for the '<em><b>Powersupply</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPRESSOR__POWERSUPPLY = eINSTANCE.getCompressor_Powersupply();

		/**
		 * The meta object literal for the '<em><b>Pneumaticsupply</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPRESSOR__PNEUMATICSUPPLY = eINSTANCE.getCompressor_Pneumaticsupply();

		/**
		 * The meta object literal for the '<em><b>Pins</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPRESSOR__PINS = eINSTANCE.getCompressor_Pins();

		/**
		 * The meta object literal for the '<em><b>Screwing</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPRESSOR__SCREWING = eINSTANCE.getCompressor_Screwing();

		/**
		 * The meta object literal for the '<em><b>Switch</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPRESSOR__SWITCH = eINSTANCE.getCompressor_Switch();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.CableImpl <em>Cable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.CableImpl
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.ComponentRepositoryPackageImpl#getCable()
		 * @generated
		 */
		EClass CABLE = eINSTANCE.getCable();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.PowerCableImpl <em>Power Cable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.PowerCableImpl
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.ComponentRepositoryPackageImpl#getPowerCable()
		 * @generated
		 */
		EClass POWER_CABLE = eINSTANCE.getPowerCable();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.CylinderImpl <em>Cylinder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.CylinderImpl
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.ComponentRepositoryPackageImpl#getCylinder()
		 * @generated
		 */
		EClass CYLINDER = eINSTANCE.getCylinder();

		/**
		 * The meta object literal for the '<em><b>Pneumaticsupply</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CYLINDER__PNEUMATICSUPPLY = eINSTANCE.getCylinder_Pneumaticsupply();

		/**
		 * The meta object literal for the '<em><b>Signal Interface</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CYLINDER__SIGNAL_INTERFACE = eINSTANCE.getCylinder_SignalInterface();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.ProportionalCylinderImpl <em>Proportional Cylinder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.ProportionalCylinderImpl
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.ComponentRepositoryPackageImpl#getProportionalCylinder()
		 * @generated
		 */
		EClass PROPORTIONAL_CYLINDER = eINSTANCE.getProportionalCylinder();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.BistableCylinderImpl <em>Bistable Cylinder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.BistableCylinderImpl
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.ComponentRepositoryPackageImpl#getBistableCylinder()
		 * @generated
		 */
		EClass BISTABLE_CYLINDER = eINSTANCE.getBistableCylinder();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.RackImpl <em>Rack</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.RackImpl
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.ComponentRepositoryPackageImpl#getRack()
		 * @generated
		 */
		EClass RACK = eINSTANCE.getRack();

		/**
		 * The meta object literal for the '<em><b>Screwing to base</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RACK__SCREWING_TO_BASE = eINSTANCE.getRack_Screwing_to_base();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.CornerImpl <em>Corner</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.CornerImpl
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.ComponentRepositoryPackageImpl#getCorner()
		 * @generated
		 */
		EClass CORNER = eINSTANCE.getCorner();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.ValveImpl <em>Valve</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.ValveImpl
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.ComponentRepositoryPackageImpl#getValve()
		 * @generated
		 */
		EClass VALVE = eINSTANCE.getValve();

		/**
		 * The meta object literal for the '<em><b>Pneumaticsupply</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALVE__PNEUMATICSUPPLY = eINSTANCE.getValve_Pneumaticsupply();

		/**
		 * The meta object literal for the '<em><b>Powersupply</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALVE__POWERSUPPLY = eINSTANCE.getValve_Powersupply();

		/**
		 * The meta object literal for the '<em><b>Signalinterface</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALVE__SIGNALINTERFACE = eINSTANCE.getValve_Signalinterface();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.RegularValveImpl <em>Regular Valve</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.RegularValveImpl
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.ComponentRepositoryPackageImpl#getRegularValve()
		 * @generated
		 */
		EClass REGULAR_VALVE = eINSTANCE.getRegularValve();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.TankImpl <em>Tank</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.TankImpl
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.ComponentRepositoryPackageImpl#getTank()
		 * @generated
		 */
		EClass TANK = eINSTANCE.getTank();

		/**
		 * The meta object literal for the '<em><b>Watersupply</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TANK__WATERSUPPLY = eINSTANCE.getTank_Watersupply();

		/**
		 * The meta object literal for the '<em><b>Screwing</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TANK__SCREWING = eINSTANCE.getTank_Screwing();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.DispenserImpl <em>Dispenser</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.DispenserImpl
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.ComponentRepositoryPackageImpl#getDispenser()
		 * @generated
		 */
		EClass DISPENSER = eINSTANCE.getDispenser();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.BottleSeperatorImpl <em>Bottle Seperator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.BottleSeperatorImpl
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.ComponentRepositoryPackageImpl#getBottleSeperator()
		 * @generated
		 */
		EClass BOTTLE_SEPERATOR = eINSTANCE.getBottleSeperator();

		/**
		 * The meta object literal for the '<em><b>Signalinterface</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOTTLE_SEPERATOR__SIGNALINTERFACE = eINSTANCE.getBottleSeperator_Signalinterface();

		/**
		 * The meta object literal for the '<em><b>Pneumaticsupply</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOTTLE_SEPERATOR__PNEUMATICSUPPLY = eINSTANCE.getBottleSeperator_Pneumaticsupply();

		/**
		 * The meta object literal for the '<em><b>Powersupply</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOTTLE_SEPERATOR__POWERSUPPLY = eINSTANCE.getBottleSeperator_Powersupply();

		/**
		 * The meta object literal for the '<em><b>Screwing to rack</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOTTLE_SEPERATOR__SCREWING_TO_RACK = eINSTANCE.getBottleSeperator_Screwing_to_rack();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.SplitterImpl <em>Splitter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.SplitterImpl
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.ComponentRepositoryPackageImpl#getSplitter()
		 * @generated
		 */
		EClass SPLITTER = eINSTANCE.getSplitter();

		/**
		 * The meta object literal for the '<em><b>Screwing</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPLITTER__SCREWING = eINSTANCE.getSplitter_Screwing();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.PowerSupplyImpl <em>Power Supply</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.PowerSupplyImpl
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.ComponentRepositoryPackageImpl#getPowerSupply()
		 * @generated
		 */
		EClass POWER_SUPPLY = eINSTANCE.getPowerSupply();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.ConveyorBeltImpl <em>Conveyor Belt</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.ConveyorBeltImpl
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.ComponentRepositoryPackageImpl#getConveyorBelt()
		 * @generated
		 */
		EClass CONVEYOR_BELT = eINSTANCE.getConveyorBelt();

		/**
		 * The meta object literal for the '<em><b>Mounted To</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONVEYOR_BELT__MOUNTED_TO = eINSTANCE.getConveyorBelt_MountedTo();

		/**
		 * The meta object literal for the '<em><b>Frame</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONVEYOR_BELT__FRAME = eINSTANCE.getConveyorBelt_Frame();

		/**
		 * The meta object literal for the '<em><b>Rubber Band</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONVEYOR_BELT__RUBBER_BAND = eINSTANCE.getConveyorBelt_RubberBand();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.FrameImpl <em>Frame</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.FrameImpl
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.ComponentRepositoryPackageImpl#getFrame()
		 * @generated
		 */
		EClass FRAME = eINSTANCE.getFrame();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.PusherImpl <em>Pusher</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.PusherImpl
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.ComponentRepositoryPackageImpl#getPusher()
		 * @generated
		 */
		EClass PUSHER = eINSTANCE.getPusher();

		/**
		 * The meta object literal for the '<em><b>Components Repository</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PUSHER__COMPONENTS_REPOSITORY = eINSTANCE.getPusher_ComponentsRepository();

		/**
		 * The meta object literal for the '<em><b>Fixture Cylinder</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PUSHER__FIXTURE_CYLINDER = eINSTANCE.getPusher_FixtureCylinder();

		/**
		 * The meta object literal for the '<em><b>Monostable Cylinder</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PUSHER__MONOSTABLE_CYLINDER = eINSTANCE.getPusher_MonostableCylinder();

		/**
		 * The meta object literal for the '<em><b>Bus Box</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PUSHER__BUS_BOX = eINSTANCE.getPusher_BusBox();

		/**
		 * The meta object literal for the '<em><b>Bus Cable</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PUSHER__BUS_CABLE = eINSTANCE.getPusher_BusCable();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.TurningTableImpl <em>Turning Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.TurningTableImpl
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.ComponentRepositoryPackageImpl#getTurningTable()
		 * @generated
		 */
		EClass TURNING_TABLE = eINSTANCE.getTurningTable();

		/**
		 * The meta object literal for the '<em><b>Rack for turningtable</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TURNING_TABLE__RACK_FOR_TURNINGTABLE = eINSTANCE.getTurningTable_Rack_for_turningtable();

		/**
		 * The meta object literal for the '<em><b>Table to stand on</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TURNING_TABLE__TABLE_TO_STAND_ON = eINSTANCE.getTurningTable_Table_to_stand_on();

		/**
		 * The meta object literal for the '<em><b>Motor to drive</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TURNING_TABLE__MOTOR_TO_DRIVE = eINSTANCE.getTurningTable_Motor_to_drive();

		/**
		 * The meta object literal for the '<em><b>Microswitch Module</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TURNING_TABLE__MICROSWITCH_MODULE = eINSTANCE.getTurningTable_MicroswitchModule();

		/**
		 * The meta object literal for the '<em><b>Bus Slave</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TURNING_TABLE__BUS_SLAVE = eINSTANCE.getTurningTable_BusSlave();

		/**
		 * The meta object literal for the '<em><b>Bus Box</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TURNING_TABLE__BUS_BOX = eINSTANCE.getTurningTable_BusBox();

		/**
		 * The meta object literal for the '<em><b>Bus Cable</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TURNING_TABLE__BUS_CABLE = eINSTANCE.getTurningTable_BusCable();

		/**
		 * The meta object literal for the '<em><b>Potentiometer</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TURNING_TABLE__POTENTIOMETER = eINSTANCE.getTurningTable_Potentiometer();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.ControllerImpl <em>Controller</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.ControllerImpl
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.ComponentRepositoryPackageImpl#getController()
		 * @generated
		 */
		EClass CONTROLLER = eINSTANCE.getController();

		/**
		 * The meta object literal for the '<em><b>Powersupply</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROLLER__POWERSUPPLY = eINSTANCE.getController_Powersupply();

		/**
		 * The meta object literal for the '<em><b>Controller Of</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROLLER__CONTROLLER_OF = eINSTANCE.getController_ControllerOf();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.LogicalWiringImpl <em>Logical Wiring</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.LogicalWiringImpl
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.ComponentRepositoryPackageImpl#getLogicalWiring()
		 * @generated
		 */
		EClass LOGICAL_WIRING = eINSTANCE.getLogicalWiring();

		/**
		 * The meta object literal for the '<em><b>Bus Cable</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGICAL_WIRING__BUS_CABLE = eINSTANCE.getLogicalWiring_BusCable();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.VacuumSwitchImpl <em>Vacuum Switch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.VacuumSwitchImpl
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.ComponentRepositoryPackageImpl#getVacuumSwitch()
		 * @generated
		 */
		EClass VACUUM_SWITCH = eINSTANCE.getVacuumSwitch();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.ReedSwitchImpl <em>Reed Switch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.ReedSwitchImpl
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.ComponentRepositoryPackageImpl#getReedSwitch()
		 * @generated
		 */
		EClass REED_SWITCH = eINSTANCE.getReedSwitch();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.PowerSplitterImpl <em>Power Splitter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.PowerSplitterImpl
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.ComponentRepositoryPackageImpl#getPowerSplitter()
		 * @generated
		 */
		EClass POWER_SPLITTER = eINSTANCE.getPowerSplitter();

		/**
		 * The meta object literal for the '<em><b>Powersupply</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POWER_SPLITTER__POWERSUPPLY = eINSTANCE.getPowerSplitter_Powersupply();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.WaterSplitterImpl <em>Water Splitter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.WaterSplitterImpl
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.ComponentRepositoryPackageImpl#getWaterSplitter()
		 * @generated
		 */
		EClass WATER_SPLITTER = eINSTANCE.getWaterSplitter();

		/**
		 * The meta object literal for the '<em><b>Watersupply</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WATER_SPLITTER__WATERSUPPLY = eINSTANCE.getWaterSplitter_Watersupply();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.PneumaticSplitterImpl <em>Pneumatic Splitter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.PneumaticSplitterImpl
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.ComponentRepositoryPackageImpl#getPneumaticSplitter()
		 * @generated
		 */
		EClass PNEUMATIC_SPLITTER = eINSTANCE.getPneumaticSplitter();

		/**
		 * The meta object literal for the '<em><b>Pneumaticsupply</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PNEUMATIC_SPLITTER__PNEUMATICSUPPLY = eINSTANCE.getPneumaticSplitter_Pneumaticsupply();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.CylinderPartImpl <em>Cylinder Part</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.CylinderPartImpl
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.ComponentRepositoryPackageImpl#getCylinderPart()
		 * @generated
		 */
		EClass CYLINDER_PART = eINSTANCE.getCylinderPart();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.MonostableCylinderImpl <em>Monostable Cylinder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.MonostableCylinderImpl
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.ComponentRepositoryPackageImpl#getMonostableCylinder()
		 * @generated
		 */
		EClass MONOSTABLE_CYLINDER = eINSTANCE.getMonostableCylinder();

		/**
		 * The meta object literal for the '<em><b>Housing</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MONOSTABLE_CYLINDER__HOUSING = eINSTANCE.getMonostableCylinder_Housing();

		/**
		 * The meta object literal for the '<em><b>Spring</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MONOSTABLE_CYLINDER__SPRING = eINSTANCE.getMonostableCylinder_Spring();

		/**
		 * The meta object literal for the '<em><b>Reed Switches</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MONOSTABLE_CYLINDER__REED_SWITCHES = eINSTANCE.getMonostableCylinder_ReedSwitches();

		/**
		 * The meta object literal for the '<em><b>Cylinder Part</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MONOSTABLE_CYLINDER__CYLINDER_PART = eINSTANCE.getMonostableCylinder_CylinderPart();

		/**
		 * The meta object literal for the '<em><b>Valve</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MONOSTABLE_CYLINDER__VALVE = eINSTANCE.getMonostableCylinder_Valve();

		/**
		 * The meta object literal for the '<em><b>Bus Slave</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MONOSTABLE_CYLINDER__BUS_SLAVE = eINSTANCE.getMonostableCylinder_BusSlave();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.ComponentRepositoryImpl <em>Component Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.ComponentRepositoryImpl
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.ComponentRepositoryPackageImpl#getComponentRepository()
		 * @generated
		 */
		EClass COMPONENT_REPOSITORY = eINSTANCE.getComponentRepository();

		/**
		 * The meta object literal for the '<em><b>All Components In Plant</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_REPOSITORY__ALL_COMPONENTS_IN_PLANT = eINSTANCE.getComponentRepository_AllComponentsInPlant();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.FixtureImpl <em>Fixture</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.FixtureImpl
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.ComponentRepositoryPackageImpl#getFixture()
		 * @generated
		 */
		EClass FIXTURE = eINSTANCE.getFixture();

	}

} //ComponentRepositoryPackage
