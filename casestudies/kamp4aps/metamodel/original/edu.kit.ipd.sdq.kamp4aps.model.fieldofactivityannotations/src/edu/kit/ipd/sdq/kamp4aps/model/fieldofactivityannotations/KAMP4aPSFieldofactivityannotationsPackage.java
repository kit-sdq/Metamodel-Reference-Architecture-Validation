/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations;

import org.eclipse.emf.ecore.EAttribute;
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
 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.KAMP4aPSFieldofactivityannotationsFactory
 * @model kind="package"
 * @generated
 */
public interface KAMP4aPSFieldofactivityannotationsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "fieldofactivityannotations";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://sdq.ipd.kit.edu/KAPSFieldofactivityannotations/0.1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "fieldofactivityannotations";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	KAMP4aPSFieldofactivityannotationsPackage eINSTANCE = edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.KAMP4aPSFieldofactivityannotationsPackageImpl.init();

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.FieldOfActivityAnnotationRepositoryImpl <em>Field Of Activity Annotation Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.FieldOfActivityAnnotationRepositoryImpl
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.KAMP4aPSFieldofactivityannotationsPackageImpl#getFieldOfActivityAnnotationRepository()
	 * @generated
	 */
	int FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY = 0;

	/**
	 * The feature id for the '<em><b>Calibration Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__CALIBRATION_SPECIFICATION = 0;

	/**
	 * The feature id for the '<em><b>Test Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__TEST_SPECIFICATION = 1;

	/**
	 * The feature id for the '<em><b>Stock Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__STOCK_SPECIFICATION = 2;

	/**
	 * The feature id for the '<em><b>Hmi Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__HMI_SPECIFICATION = 3;

	/**
	 * The feature id for the '<em><b>Ecad Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__ECAD_SPECIFICATION = 4;

	/**
	 * The feature id for the '<em><b>Documentation Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__DOCUMENTATION_SPECIFICATION = 5;

	/**
	 * The feature id for the '<em><b>Staff Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__STAFF_SPECIFICATION = 6;

	/**
	 * The number of structural features of the '<em>Field Of Activity Annotation Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Field Of Activity Annotation Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.TestSpecificationImpl <em>Test Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.TestSpecificationImpl
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.KAMP4aPSFieldofactivityannotationsPackageImpl#getTestSpecification()
	 * @generated
	 */
	int TEST_SPECIFICATION = 1;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_SPECIFICATION__PARENT = 0;

	/**
	 * The feature id for the '<em><b>System Tests</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_SPECIFICATION__SYSTEM_TESTS = 1;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_SPECIFICATION__ROLE = 2;

	/**
	 * The number of structural features of the '<em>Test Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_SPECIFICATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Test Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_SPECIFICATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.StockSpecificationImpl <em>Stock Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.StockSpecificationImpl
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.KAMP4aPSFieldofactivityannotationsPackageImpl#getStockSpecification()
	 * @generated
	 */
	int STOCK_SPECIFICATION = 2;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCK_SPECIFICATION__PARENT = 0;

	/**
	 * The feature id for the '<em><b>Component Stock List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCK_SPECIFICATION__COMPONENT_STOCK_LIST = 1;

	/**
	 * The feature id for the '<em><b>Interface Stock List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCK_SPECIFICATION__INTERFACE_STOCK_LIST = 2;

	/**
	 * The feature id for the '<em><b>Module Stock List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCK_SPECIFICATION__MODULE_STOCK_LIST = 3;

	/**
	 * The feature id for the '<em><b>Structure Stock List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCK_SPECIFICATION__STRUCTURE_STOCK_LIST = 4;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCK_SPECIFICATION__ROLE = 5;

	/**
	 * The number of structural features of the '<em>Stock Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCK_SPECIFICATION_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Stock Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCK_SPECIFICATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.HMISpecificationImpl <em>HMI Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.HMISpecificationImpl
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.KAMP4aPSFieldofactivityannotationsPackageImpl#getHMISpecification()
	 * @generated
	 */
	int HMI_SPECIFICATION = 3;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMI_SPECIFICATION__PARENT = 0;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMI_SPECIFICATION__ROLE = 1;

	/**
	 * The feature id for the '<em><b>Hmi Config</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMI_SPECIFICATION__HMI_CONFIG = 2;

	/**
	 * The number of structural features of the '<em>HMI Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMI_SPECIFICATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>HMI Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMI_SPECIFICATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.ECADSpecificationImpl <em>ECAD Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.ECADSpecificationImpl
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.KAMP4aPSFieldofactivityannotationsPackageImpl#getECADSpecification()
	 * @generated
	 */
	int ECAD_SPECIFICATION = 4;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECAD_SPECIFICATION__PARENT = 0;

	/**
	 * The feature id for the '<em><b>Drawings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECAD_SPECIFICATION__DRAWINGS = 1;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECAD_SPECIFICATION__ROLE = 2;

	/**
	 * The number of structural features of the '<em>ECAD Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECAD_SPECIFICATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>ECAD Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECAD_SPECIFICATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.DocumentationSpecificationImpl <em>Documentation Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.DocumentationSpecificationImpl
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.KAMP4aPSFieldofactivityannotationsPackageImpl#getDocumentationSpecification()
	 * @generated
	 */
	int DOCUMENTATION_SPECIFICATION = 5;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION_SPECIFICATION__PARENT = 0;

	/**
	 * The feature id for the '<em><b>Component Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION_SPECIFICATION__COMPONENT_DOCUMENTATION = 1;

	/**
	 * The feature id for the '<em><b>Module Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION_SPECIFICATION__MODULE_DOCUMENTATION = 2;

	/**
	 * The feature id for the '<em><b>Interface Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION_SPECIFICATION__INTERFACE_DOCUMENTATION = 3;

	/**
	 * The feature id for the '<em><b>Structure Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION_SPECIFICATION__STRUCTURE_DOCUMENTATION = 4;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION_SPECIFICATION__ROLE = 5;

	/**
	 * The number of structural features of the '<em>Documentation Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION_SPECIFICATION_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Documentation Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION_SPECIFICATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.StaffSpecificationImpl <em>Staff Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.StaffSpecificationImpl
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.KAMP4aPSFieldofactivityannotationsPackageImpl#getStaffSpecification()
	 * @generated
	 */
	int STAFF_SPECIFICATION = 6;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_SPECIFICATION__PARENT = 0;

	/**
	 * The feature id for the '<em><b>Person List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_SPECIFICATION__PERSON_LIST = 1;

	/**
	 * The feature id for the '<em><b>Role List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_SPECIFICATION__ROLE_LIST = 2;

	/**
	 * The number of structural features of the '<em>Staff Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_SPECIFICATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Staff Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_SPECIFICATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.CalibrationSpecificationImpl <em>Calibration Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.CalibrationSpecificationImpl
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.KAMP4aPSFieldofactivityannotationsPackageImpl#getCalibrationSpecification()
	 * @generated
	 */
	int CALIBRATION_SPECIFICATION = 7;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALIBRATION_SPECIFICATION__PARENT = 0;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALIBRATION_SPECIFICATION__ROLE = 1;

	/**
	 * The feature id for the '<em><b>Calibration Config</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALIBRATION_SPECIFICATION__CALIBRATION_CONFIG = 2;

	/**
	 * The number of structural features of the '<em>Calibration Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALIBRATION_SPECIFICATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Calibration Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALIBRATION_SPECIFICATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.CalibrationConfigurationImpl <em>Calibration Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.CalibrationConfigurationImpl
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.KAMP4aPSFieldofactivityannotationsPackageImpl#getCalibrationConfiguration()
	 * @generated
	 */
	int CALIBRATION_CONFIGURATION = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALIBRATION_CONFIGURATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALIBRATION_CONFIGURATION__PARENT = 1;

	/**
	 * The feature id for the '<em><b>Components</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALIBRATION_CONFIGURATION__COMPONENTS = 2;

	/**
	 * The feature id for the '<em><b>Modules</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALIBRATION_CONFIGURATION__MODULES = 3;

	/**
	 * The feature id for the '<em><b>Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALIBRATION_CONFIGURATION__INTERFACES = 4;

	/**
	 * The feature id for the '<em><b>Structures</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALIBRATION_CONFIGURATION__STRUCTURES = 5;

	/**
	 * The number of structural features of the '<em>Calibration Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALIBRATION_CONFIGURATION_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Calibration Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALIBRATION_CONFIGURATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.HMIConfigurationImpl <em>HMI Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.HMIConfigurationImpl
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.KAMP4aPSFieldofactivityannotationsPackageImpl#getHMIConfiguration()
	 * @generated
	 */
	int HMI_CONFIGURATION = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMI_CONFIGURATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Components</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMI_CONFIGURATION__COMPONENTS = 1;

	/**
	 * The feature id for the '<em><b>Modules</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMI_CONFIGURATION__MODULES = 2;

	/**
	 * The feature id for the '<em><b>Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMI_CONFIGURATION__INTERFACES = 3;

	/**
	 * The feature id for the '<em><b>Structures</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMI_CONFIGURATION__STRUCTURES = 4;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMI_CONFIGURATION__PARENT = 5;

	/**
	 * The number of structural features of the '<em>HMI Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMI_CONFIGURATION_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>HMI Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMI_CONFIGURATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.PersonListImpl <em>Person List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.PersonListImpl
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.KAMP4aPSFieldofactivityannotationsPackageImpl#getPersonList()
	 * @generated
	 */
	int PERSON_LIST = 10;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_LIST__PARENT = 0;

	/**
	 * The feature id for the '<em><b>Persons</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_LIST__PERSONS = 1;

	/**
	 * The number of structural features of the '<em>Person List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_LIST_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Person List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_LIST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.PersonImpl <em>Person</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.PersonImpl
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.KAMP4aPSFieldofactivityannotationsPackageImpl#getPerson()
	 * @generated
	 */
	int PERSON = 11;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__PARENT = 0;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__ROLES = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__NAME = 2;

	/**
	 * The number of structural features of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.RoleImpl <em>Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.RoleImpl
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.KAMP4aPSFieldofactivityannotationsPackageImpl#getRole()
	 * @generated
	 */
	int ROLE = 12;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__PARENT = 0;

	/**
	 * The feature id for the '<em><b>Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__PERSON = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__DESCRIPTION = 2;

	/**
	 * The number of structural features of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.RoleListImpl <em>Role List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.RoleListImpl
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.KAMP4aPSFieldofactivityannotationsPackageImpl#getRoleList()
	 * @generated
	 */
	int ROLE_LIST = 13;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_LIST__PARENT = 0;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_LIST__ROLES = 1;

	/**
	 * The number of structural features of the '<em>Role List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_LIST_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Role List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_LIST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.FileImpl <em>File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.FileImpl
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.KAMP4aPSFieldofactivityannotationsPackageImpl#getFile()
	 * @generated
	 */
	int FILE = 14;

	/**
	 * The feature id for the '<em><b>Filename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__FILENAME = 0;

	/**
	 * The number of structural features of the '<em>File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.TestCaseImpl <em>Test Case</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.TestCaseImpl
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.KAMP4aPSFieldofactivityannotationsPackageImpl#getTestCase()
	 * @generated
	 */
	int TEST_CASE = 15;

	/**
	 * The feature id for the '<em><b>Test Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CASE__TEST_NAME = 0;

	/**
	 * The number of structural features of the '<em>Test Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CASE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Test Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CASE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.SystemTestImpl <em>System Test</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.SystemTestImpl
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.KAMP4aPSFieldofactivityannotationsPackageImpl#getSystemTest()
	 * @generated
	 */
	int SYSTEM_TEST = 16;

	/**
	 * The feature id for the '<em><b>Test Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_TEST__TEST_NAME = TEST_CASE__TEST_NAME;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_TEST__PARENT = TEST_CASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>System Under Test</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_TEST__SYSTEM_UNDER_TEST = TEST_CASE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>System Test</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_TEST_FEATURE_COUNT = TEST_CASE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>System Test</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_TEST_OPERATION_COUNT = TEST_CASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.EngineerImpl <em>Engineer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.EngineerImpl
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.KAMP4aPSFieldofactivityannotationsPackageImpl#getEngineer()
	 * @generated
	 */
	int ENGINEER = 17;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEER__PARENT = ROLE__PARENT;

	/**
	 * The feature id for the '<em><b>Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEER__PERSON = ROLE__PERSON;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEER__DESCRIPTION = ROLE__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Engineer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEER_FEATURE_COUNT = ROLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Engineer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEER_OPERATION_COUNT = ROLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.PurchaserImpl <em>Purchaser</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.PurchaserImpl
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.KAMP4aPSFieldofactivityannotationsPackageImpl#getPurchaser()
	 * @generated
	 */
	int PURCHASER = 18;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PURCHASER__PARENT = ROLE__PARENT;

	/**
	 * The feature id for the '<em><b>Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PURCHASER__PERSON = ROLE__PERSON;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PURCHASER__DESCRIPTION = ROLE__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Purchaser</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PURCHASER_FEATURE_COUNT = ROLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Purchaser</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PURCHASER_OPERATION_COUNT = ROLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.MechanicImpl <em>Mechanic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.MechanicImpl
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.KAMP4aPSFieldofactivityannotationsPackageImpl#getMechanic()
	 * @generated
	 */
	int MECHANIC = 19;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MECHANIC__PARENT = ROLE__PARENT;

	/**
	 * The feature id for the '<em><b>Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MECHANIC__PERSON = ROLE__PERSON;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MECHANIC__DESCRIPTION = ROLE__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Mechanic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MECHANIC_FEATURE_COUNT = ROLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Mechanic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MECHANIC_OPERATION_COUNT = ROLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.DocumentationImpl <em>Documentation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.DocumentationImpl
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.KAMP4aPSFieldofactivityannotationsPackageImpl#getDocumentation()
	 * @generated
	 */
	int DOCUMENTATION = 20;

	/**
	 * The feature id for the '<em><b>Filename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION__FILENAME = FILE__FILENAME;

	/**
	 * The number of structural features of the '<em>Documentation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION_FEATURE_COUNT = FILE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Documentation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION_OPERATION_COUNT = FILE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.DrawingImpl <em>Drawing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.DrawingImpl
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.KAMP4aPSFieldofactivityannotationsPackageImpl#getDrawing()
	 * @generated
	 */
	int DRAWING = 21;

	/**
	 * The feature id for the '<em><b>Filename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRAWING__FILENAME = FILE__FILENAME;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRAWING__PARENT = FILE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Drawing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRAWING_FEATURE_COUNT = FILE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Drawing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRAWING_OPERATION_COUNT = FILE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.ComponentDrawingImpl <em>Component Drawing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.ComponentDrawingImpl
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.KAMP4aPSFieldofactivityannotationsPackageImpl#getComponentDrawing()
	 * @generated
	 */
	int COMPONENT_DRAWING = 22;

	/**
	 * The feature id for the '<em><b>Filename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DRAWING__FILENAME = DRAWING__FILENAME;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DRAWING__PARENT = DRAWING__PARENT;

	/**
	 * The feature id for the '<em><b>Drawn component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DRAWING__DRAWN_COMPONENT = DRAWING_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Component Drawing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DRAWING_FEATURE_COUNT = DRAWING_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Component Drawing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DRAWING_OPERATION_COUNT = DRAWING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.ModuleDrawingImpl <em>Module Drawing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.ModuleDrawingImpl
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.KAMP4aPSFieldofactivityannotationsPackageImpl#getModuleDrawing()
	 * @generated
	 */
	int MODULE_DRAWING = 23;

	/**
	 * The feature id for the '<em><b>Filename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_DRAWING__FILENAME = DRAWING__FILENAME;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_DRAWING__PARENT = DRAWING__PARENT;

	/**
	 * The feature id for the '<em><b>Drawn module</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_DRAWING__DRAWN_MODULE = DRAWING_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Module Drawing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_DRAWING_FEATURE_COUNT = DRAWING_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Module Drawing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_DRAWING_OPERATION_COUNT = DRAWING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.InterfaceDrawingImpl <em>Interface Drawing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.InterfaceDrawingImpl
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.KAMP4aPSFieldofactivityannotationsPackageImpl#getInterfaceDrawing()
	 * @generated
	 */
	int INTERFACE_DRAWING = 24;

	/**
	 * The feature id for the '<em><b>Filename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DRAWING__FILENAME = DRAWING__FILENAME;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DRAWING__PARENT = DRAWING__PARENT;

	/**
	 * The feature id for the '<em><b>Drawn interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DRAWING__DRAWN_INTERFACE = DRAWING_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Interface Drawing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DRAWING_FEATURE_COUNT = DRAWING_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Interface Drawing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DRAWING_OPERATION_COUNT = DRAWING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.StructureDrawingImpl <em>Structure Drawing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.StructureDrawingImpl
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.KAMP4aPSFieldofactivityannotationsPackageImpl#getStructureDrawing()
	 * @generated
	 */
	int STRUCTURE_DRAWING = 25;

	/**
	 * The feature id for the '<em><b>Filename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_DRAWING__FILENAME = DRAWING__FILENAME;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_DRAWING__PARENT = DRAWING__PARENT;

	/**
	 * The feature id for the '<em><b>Drawn structure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_DRAWING__DRAWN_STRUCTURE = DRAWING_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Structure Drawing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_DRAWING_FEATURE_COUNT = DRAWING_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Structure Drawing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_DRAWING_OPERATION_COUNT = DRAWING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.MainteneanceDocumentationImpl <em>Mainteneance Documentation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.MainteneanceDocumentationImpl
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.KAMP4aPSFieldofactivityannotationsPackageImpl#getMainteneanceDocumentation()
	 * @generated
	 */
	int MAINTENEANCE_DOCUMENTATION = 26;

	/**
	 * The feature id for the '<em><b>Filename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINTENEANCE_DOCUMENTATION__FILENAME = DOCUMENTATION__FILENAME;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINTENEANCE_DOCUMENTATION__PARENT = DOCUMENTATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Mainteneance Documentation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINTENEANCE_DOCUMENTATION_FEATURE_COUNT = DOCUMENTATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Mainteneance Documentation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINTENEANCE_DOCUMENTATION_OPERATION_COUNT = DOCUMENTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.OperatorInstructionsImpl <em>Operator Instructions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.OperatorInstructionsImpl
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.KAMP4aPSFieldofactivityannotationsPackageImpl#getOperatorInstructions()
	 * @generated
	 */
	int OPERATOR_INSTRUCTIONS = 27;

	/**
	 * The feature id for the '<em><b>Filename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_INSTRUCTIONS__FILENAME = DOCUMENTATION__FILENAME;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_INSTRUCTIONS__PARENT = DOCUMENTATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Operator Instructions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_INSTRUCTIONS_FEATURE_COUNT = DOCUMENTATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Operator Instructions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_INSTRUCTIONS_OPERATION_COUNT = DOCUMENTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.TrainingDocInternImpl <em>Training Doc Intern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.TrainingDocInternImpl
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.KAMP4aPSFieldofactivityannotationsPackageImpl#getTrainingDocIntern()
	 * @generated
	 */
	int TRAINING_DOC_INTERN = 28;

	/**
	 * The feature id for the '<em><b>Filename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAINING_DOC_INTERN__FILENAME = DOCUMENTATION__FILENAME;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAINING_DOC_INTERN__PARENT = DOCUMENTATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Training Doc Intern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAINING_DOC_INTERN_FEATURE_COUNT = DOCUMENTATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Training Doc Intern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAINING_DOC_INTERN_OPERATION_COUNT = DOCUMENTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.TrainingDocExternalImpl <em>Training Doc External</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.TrainingDocExternalImpl
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.KAMP4aPSFieldofactivityannotationsPackageImpl#getTrainingDocExternal()
	 * @generated
	 */
	int TRAINING_DOC_EXTERNAL = 29;

	/**
	 * The feature id for the '<em><b>Filename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAINING_DOC_EXTERNAL__FILENAME = DOCUMENTATION__FILENAME;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAINING_DOC_EXTERNAL__PARENT = DOCUMENTATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Training Doc External</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAINING_DOC_EXTERNAL_FEATURE_COUNT = DOCUMENTATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Training Doc External</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAINING_DOC_EXTERNAL_OPERATION_COUNT = DOCUMENTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.DocumentationFiles <em>Documentation Files</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.DocumentationFiles
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.KAMP4aPSFieldofactivityannotationsPackageImpl#getDocumentationFiles()
	 * @generated
	 */
	int DOCUMENTATION_FILES = 30;

	/**
	 * The feature id for the '<em><b>Mainteneance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION_FILES__MAINTENEANCE = 0;

	/**
	 * The feature id for the '<em><b>Instructions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION_FILES__INSTRUCTIONS = 1;

	/**
	 * The feature id for the '<em><b>Training Intern</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION_FILES__TRAINING_INTERN = 2;

	/**
	 * The feature id for the '<em><b>Training External</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION_FILES__TRAINING_EXTERNAL = 3;

	/**
	 * The number of structural features of the '<em>Documentation Files</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION_FILES_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Documentation Files</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION_FILES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.ComponentDocumentationFilesImpl <em>Component Documentation Files</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.ComponentDocumentationFilesImpl
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.KAMP4aPSFieldofactivityannotationsPackageImpl#getComponentDocumentationFiles()
	 * @generated
	 */
	int COMPONENT_DOCUMENTATION_FILES = 31;

	/**
	 * The feature id for the '<em><b>Mainteneance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DOCUMENTATION_FILES__MAINTENEANCE = DOCUMENTATION_FILES__MAINTENEANCE;

	/**
	 * The feature id for the '<em><b>Instructions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DOCUMENTATION_FILES__INSTRUCTIONS = DOCUMENTATION_FILES__INSTRUCTIONS;

	/**
	 * The feature id for the '<em><b>Training Intern</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DOCUMENTATION_FILES__TRAINING_INTERN = DOCUMENTATION_FILES__TRAINING_INTERN;

	/**
	 * The feature id for the '<em><b>Training External</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DOCUMENTATION_FILES__TRAINING_EXTERNAL = DOCUMENTATION_FILES__TRAINING_EXTERNAL;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DOCUMENTATION_FILES__PARENT = DOCUMENTATION_FILES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Documented Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DOCUMENTATION_FILES__DOCUMENTED_COMPONENT = DOCUMENTATION_FILES_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Component Documentation Files</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DOCUMENTATION_FILES_FEATURE_COUNT = DOCUMENTATION_FILES_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Component Documentation Files</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DOCUMENTATION_FILES_OPERATION_COUNT = DOCUMENTATION_FILES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.ModuleDocumentationFilesImpl <em>Module Documentation Files</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.ModuleDocumentationFilesImpl
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.KAMP4aPSFieldofactivityannotationsPackageImpl#getModuleDocumentationFiles()
	 * @generated
	 */
	int MODULE_DOCUMENTATION_FILES = 32;

	/**
	 * The feature id for the '<em><b>Mainteneance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_DOCUMENTATION_FILES__MAINTENEANCE = DOCUMENTATION_FILES__MAINTENEANCE;

	/**
	 * The feature id for the '<em><b>Instructions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_DOCUMENTATION_FILES__INSTRUCTIONS = DOCUMENTATION_FILES__INSTRUCTIONS;

	/**
	 * The feature id for the '<em><b>Training Intern</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_DOCUMENTATION_FILES__TRAINING_INTERN = DOCUMENTATION_FILES__TRAINING_INTERN;

	/**
	 * The feature id for the '<em><b>Training External</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_DOCUMENTATION_FILES__TRAINING_EXTERNAL = DOCUMENTATION_FILES__TRAINING_EXTERNAL;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_DOCUMENTATION_FILES__PARENT = DOCUMENTATION_FILES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Documented Module</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_DOCUMENTATION_FILES__DOCUMENTED_MODULE = DOCUMENTATION_FILES_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Module Documentation Files</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_DOCUMENTATION_FILES_FEATURE_COUNT = DOCUMENTATION_FILES_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Module Documentation Files</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_DOCUMENTATION_FILES_OPERATION_COUNT = DOCUMENTATION_FILES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.InterfaceDocumentationFilesImpl <em>Interface Documentation Files</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.InterfaceDocumentationFilesImpl
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.KAMP4aPSFieldofactivityannotationsPackageImpl#getInterfaceDocumentationFiles()
	 * @generated
	 */
	int INTERFACE_DOCUMENTATION_FILES = 33;

	/**
	 * The feature id for the '<em><b>Mainteneance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DOCUMENTATION_FILES__MAINTENEANCE = DOCUMENTATION_FILES__MAINTENEANCE;

	/**
	 * The feature id for the '<em><b>Instructions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DOCUMENTATION_FILES__INSTRUCTIONS = DOCUMENTATION_FILES__INSTRUCTIONS;

	/**
	 * The feature id for the '<em><b>Training Intern</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DOCUMENTATION_FILES__TRAINING_INTERN = DOCUMENTATION_FILES__TRAINING_INTERN;

	/**
	 * The feature id for the '<em><b>Training External</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DOCUMENTATION_FILES__TRAINING_EXTERNAL = DOCUMENTATION_FILES__TRAINING_EXTERNAL;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DOCUMENTATION_FILES__PARENT = DOCUMENTATION_FILES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Documented Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DOCUMENTATION_FILES__DOCUMENTED_INTERFACE = DOCUMENTATION_FILES_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Interface Documentation Files</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DOCUMENTATION_FILES_FEATURE_COUNT = DOCUMENTATION_FILES_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Interface Documentation Files</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DOCUMENTATION_FILES_OPERATION_COUNT = DOCUMENTATION_FILES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.StructureDocumentationFilesImpl <em>Structure Documentation Files</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.StructureDocumentationFilesImpl
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.KAMP4aPSFieldofactivityannotationsPackageImpl#getStructureDocumentationFiles()
	 * @generated
	 */
	int STRUCTURE_DOCUMENTATION_FILES = 34;

	/**
	 * The feature id for the '<em><b>Mainteneance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_DOCUMENTATION_FILES__MAINTENEANCE = DOCUMENTATION_FILES__MAINTENEANCE;

	/**
	 * The feature id for the '<em><b>Instructions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_DOCUMENTATION_FILES__INSTRUCTIONS = DOCUMENTATION_FILES__INSTRUCTIONS;

	/**
	 * The feature id for the '<em><b>Training Intern</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_DOCUMENTATION_FILES__TRAINING_INTERN = DOCUMENTATION_FILES__TRAINING_INTERN;

	/**
	 * The feature id for the '<em><b>Training External</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_DOCUMENTATION_FILES__TRAINING_EXTERNAL = DOCUMENTATION_FILES__TRAINING_EXTERNAL;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_DOCUMENTATION_FILES__PARENT = DOCUMENTATION_FILES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Documented Structure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_DOCUMENTATION_FILES__DOCUMENTED_STRUCTURE = DOCUMENTATION_FILES_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Structure Documentation Files</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_DOCUMENTATION_FILES_FEATURE_COUNT = DOCUMENTATION_FILES_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Structure Documentation Files</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_DOCUMENTATION_FILES_OPERATION_COUNT = DOCUMENTATION_FILES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.StockListImpl <em>Stock List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.StockListImpl
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.KAMP4aPSFieldofactivityannotationsPackageImpl#getStockList()
	 * @generated
	 */
	int STOCK_LIST = 35;

	/**
	 * The feature id for the '<em><b>Filename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCK_LIST__FILENAME = FILE__FILENAME;

	/**
	 * The number of structural features of the '<em>Stock List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCK_LIST_FEATURE_COUNT = FILE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Stock List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCK_LIST_OPERATION_COUNT = FILE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.ComponentStockListImpl <em>Component Stock List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.ComponentStockListImpl
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.KAMP4aPSFieldofactivityannotationsPackageImpl#getComponentStockList()
	 * @generated
	 */
	int COMPONENT_STOCK_LIST = 36;

	/**
	 * The feature id for the '<em><b>Filename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_STOCK_LIST__FILENAME = STOCK_LIST__FILENAME;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_STOCK_LIST__PARENT = STOCK_LIST_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Components</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_STOCK_LIST__COMPONENTS = STOCK_LIST_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Component Stock List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_STOCK_LIST_FEATURE_COUNT = STOCK_LIST_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Component Stock List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_STOCK_LIST_OPERATION_COUNT = STOCK_LIST_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.InterfaceStockListImpl <em>Interface Stock List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.InterfaceStockListImpl
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.KAMP4aPSFieldofactivityannotationsPackageImpl#getInterfaceStockList()
	 * @generated
	 */
	int INTERFACE_STOCK_LIST = 37;

	/**
	 * The feature id for the '<em><b>Filename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_STOCK_LIST__FILENAME = STOCK_LIST__FILENAME;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_STOCK_LIST__PARENT = STOCK_LIST_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_STOCK_LIST__INTERFACES = STOCK_LIST_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Interface Stock List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_STOCK_LIST_FEATURE_COUNT = STOCK_LIST_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Interface Stock List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_STOCK_LIST_OPERATION_COUNT = STOCK_LIST_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.ModuleStockListImpl <em>Module Stock List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.ModuleStockListImpl
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.KAMP4aPSFieldofactivityannotationsPackageImpl#getModuleStockList()
	 * @generated
	 */
	int MODULE_STOCK_LIST = 38;

	/**
	 * The feature id for the '<em><b>Filename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_STOCK_LIST__FILENAME = STOCK_LIST__FILENAME;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_STOCK_LIST__PARENT = STOCK_LIST_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Modules</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_STOCK_LIST__MODULES = STOCK_LIST_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Module Stock List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_STOCK_LIST_FEATURE_COUNT = STOCK_LIST_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Module Stock List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_STOCK_LIST_OPERATION_COUNT = STOCK_LIST_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.StructureStockListImpl <em>Structure Stock List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.StructureStockListImpl
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.KAMP4aPSFieldofactivityannotationsPackageImpl#getStructureStockList()
	 * @generated
	 */
	int STRUCTURE_STOCK_LIST = 39;

	/**
	 * The feature id for the '<em><b>Filename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_STOCK_LIST__FILENAME = STOCK_LIST__FILENAME;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_STOCK_LIST__PARENT = STOCK_LIST_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Structures</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_STOCK_LIST__STRUCTURES = STOCK_LIST_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Structure Stock List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_STOCK_LIST_FEATURE_COUNT = STOCK_LIST_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Structure Stock List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_STOCK_LIST_OPERATION_COUNT = STOCK_LIST_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.FieldOfActivityAnnotationRepository <em>Field Of Activity Annotation Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field Of Activity Annotation Repository</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.FieldOfActivityAnnotationRepository
	 * @generated
	 */
	EClass getFieldOfActivityAnnotationRepository();

	/**
	 * Returns the meta object for the containment reference '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.FieldOfActivityAnnotationRepository#getCalibrationSpecification <em>Calibration Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Calibration Specification</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.FieldOfActivityAnnotationRepository#getCalibrationSpecification()
	 * @see #getFieldOfActivityAnnotationRepository()
	 * @generated
	 */
	EReference getFieldOfActivityAnnotationRepository_CalibrationSpecification();

	/**
	 * Returns the meta object for the containment reference '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.FieldOfActivityAnnotationRepository#getTestSpecification <em>Test Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Test Specification</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.FieldOfActivityAnnotationRepository#getTestSpecification()
	 * @see #getFieldOfActivityAnnotationRepository()
	 * @generated
	 */
	EReference getFieldOfActivityAnnotationRepository_TestSpecification();

	/**
	 * Returns the meta object for the containment reference '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.FieldOfActivityAnnotationRepository#getStockSpecification <em>Stock Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Stock Specification</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.FieldOfActivityAnnotationRepository#getStockSpecification()
	 * @see #getFieldOfActivityAnnotationRepository()
	 * @generated
	 */
	EReference getFieldOfActivityAnnotationRepository_StockSpecification();

	/**
	 * Returns the meta object for the containment reference '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.FieldOfActivityAnnotationRepository#getHmiSpecification <em>Hmi Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Hmi Specification</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.FieldOfActivityAnnotationRepository#getHmiSpecification()
	 * @see #getFieldOfActivityAnnotationRepository()
	 * @generated
	 */
	EReference getFieldOfActivityAnnotationRepository_HmiSpecification();

	/**
	 * Returns the meta object for the containment reference '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.FieldOfActivityAnnotationRepository#getEcadSpecification <em>Ecad Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ecad Specification</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.FieldOfActivityAnnotationRepository#getEcadSpecification()
	 * @see #getFieldOfActivityAnnotationRepository()
	 * @generated
	 */
	EReference getFieldOfActivityAnnotationRepository_EcadSpecification();

	/**
	 * Returns the meta object for the containment reference '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.FieldOfActivityAnnotationRepository#getDocumentationSpecification <em>Documentation Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Documentation Specification</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.FieldOfActivityAnnotationRepository#getDocumentationSpecification()
	 * @see #getFieldOfActivityAnnotationRepository()
	 * @generated
	 */
	EReference getFieldOfActivityAnnotationRepository_DocumentationSpecification();

	/**
	 * Returns the meta object for the containment reference '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.FieldOfActivityAnnotationRepository#getStaffSpecification <em>Staff Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Staff Specification</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.FieldOfActivityAnnotationRepository#getStaffSpecification()
	 * @see #getFieldOfActivityAnnotationRepository()
	 * @generated
	 */
	EReference getFieldOfActivityAnnotationRepository_StaffSpecification();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.TestSpecification <em>Test Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Specification</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.TestSpecification
	 * @generated
	 */
	EClass getTestSpecification();

	/**
	 * Returns the meta object for the container reference '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.TestSpecification#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.TestSpecification#getParent()
	 * @see #getTestSpecification()
	 * @generated
	 */
	EReference getTestSpecification_Parent();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.TestSpecification#getSystemTests <em>System Tests</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>System Tests</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.TestSpecification#getSystemTests()
	 * @see #getTestSpecification()
	 * @generated
	 */
	EReference getTestSpecification_SystemTests();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.TestSpecification#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.TestSpecification#getRole()
	 * @see #getTestSpecification()
	 * @generated
	 */
	EReference getTestSpecification_Role();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.StockSpecification <em>Stock Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stock Specification</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.StockSpecification
	 * @generated
	 */
	EClass getStockSpecification();

	/**
	 * Returns the meta object for the container reference '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.StockSpecification#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.StockSpecification#getParent()
	 * @see #getStockSpecification()
	 * @generated
	 */
	EReference getStockSpecification_Parent();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.StockSpecification#getComponentStockList <em>Component Stock List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Component Stock List</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.StockSpecification#getComponentStockList()
	 * @see #getStockSpecification()
	 * @generated
	 */
	EReference getStockSpecification_ComponentStockList();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.StockSpecification#getInterfaceStockList <em>Interface Stock List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interface Stock List</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.StockSpecification#getInterfaceStockList()
	 * @see #getStockSpecification()
	 * @generated
	 */
	EReference getStockSpecification_InterfaceStockList();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.StockSpecification#getModuleStockList <em>Module Stock List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Module Stock List</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.StockSpecification#getModuleStockList()
	 * @see #getStockSpecification()
	 * @generated
	 */
	EReference getStockSpecification_ModuleStockList();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.StockSpecification#getStructureStockList <em>Structure Stock List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Structure Stock List</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.StockSpecification#getStructureStockList()
	 * @see #getStockSpecification()
	 * @generated
	 */
	EReference getStockSpecification_StructureStockList();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.StockSpecification#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.StockSpecification#getRole()
	 * @see #getStockSpecification()
	 * @generated
	 */
	EReference getStockSpecification_Role();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.HMISpecification <em>HMI Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HMI Specification</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.HMISpecification
	 * @generated
	 */
	EClass getHMISpecification();

	/**
	 * Returns the meta object for the container reference '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.HMISpecification#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.HMISpecification#getParent()
	 * @see #getHMISpecification()
	 * @generated
	 */
	EReference getHMISpecification_Parent();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.HMISpecification#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.HMISpecification#getRole()
	 * @see #getHMISpecification()
	 * @generated
	 */
	EReference getHMISpecification_Role();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.HMISpecification#getHmiConfig <em>Hmi Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hmi Config</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.HMISpecification#getHmiConfig()
	 * @see #getHMISpecification()
	 * @generated
	 */
	EReference getHMISpecification_HmiConfig();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.ECADSpecification <em>ECAD Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ECAD Specification</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.ECADSpecification
	 * @generated
	 */
	EClass getECADSpecification();

	/**
	 * Returns the meta object for the container reference '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.ECADSpecification#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.ECADSpecification#getParent()
	 * @see #getECADSpecification()
	 * @generated
	 */
	EReference getECADSpecification_Parent();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.ECADSpecification#getDrawings <em>Drawings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Drawings</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.ECADSpecification#getDrawings()
	 * @see #getECADSpecification()
	 * @generated
	 */
	EReference getECADSpecification_Drawings();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.ECADSpecification#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.ECADSpecification#getRole()
	 * @see #getECADSpecification()
	 * @generated
	 */
	EReference getECADSpecification_Role();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.DocumentationSpecification <em>Documentation Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Documentation Specification</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.DocumentationSpecification
	 * @generated
	 */
	EClass getDocumentationSpecification();

	/**
	 * Returns the meta object for the container reference '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.DocumentationSpecification#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.DocumentationSpecification#getParent()
	 * @see #getDocumentationSpecification()
	 * @generated
	 */
	EReference getDocumentationSpecification_Parent();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.DocumentationSpecification#getComponentDocumentation <em>Component Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Component Documentation</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.DocumentationSpecification#getComponentDocumentation()
	 * @see #getDocumentationSpecification()
	 * @generated
	 */
	EReference getDocumentationSpecification_ComponentDocumentation();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.DocumentationSpecification#getModuleDocumentation <em>Module Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Module Documentation</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.DocumentationSpecification#getModuleDocumentation()
	 * @see #getDocumentationSpecification()
	 * @generated
	 */
	EReference getDocumentationSpecification_ModuleDocumentation();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.DocumentationSpecification#getInterfaceDocumentation <em>Interface Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interface Documentation</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.DocumentationSpecification#getInterfaceDocumentation()
	 * @see #getDocumentationSpecification()
	 * @generated
	 */
	EReference getDocumentationSpecification_InterfaceDocumentation();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.DocumentationSpecification#getStructureDocumentation <em>Structure Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Structure Documentation</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.DocumentationSpecification#getStructureDocumentation()
	 * @see #getDocumentationSpecification()
	 * @generated
	 */
	EReference getDocumentationSpecification_StructureDocumentation();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.DocumentationSpecification#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.DocumentationSpecification#getRole()
	 * @see #getDocumentationSpecification()
	 * @generated
	 */
	EReference getDocumentationSpecification_Role();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.StaffSpecification <em>Staff Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Staff Specification</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.StaffSpecification
	 * @generated
	 */
	EClass getStaffSpecification();

	/**
	 * Returns the meta object for the container reference '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.StaffSpecification#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.StaffSpecification#getParent()
	 * @see #getStaffSpecification()
	 * @generated
	 */
	EReference getStaffSpecification_Parent();

	/**
	 * Returns the meta object for the containment reference '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.StaffSpecification#getPersonList <em>Person List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Person List</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.StaffSpecification#getPersonList()
	 * @see #getStaffSpecification()
	 * @generated
	 */
	EReference getStaffSpecification_PersonList();

	/**
	 * Returns the meta object for the containment reference '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.StaffSpecification#getRoleList <em>Role List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Role List</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.StaffSpecification#getRoleList()
	 * @see #getStaffSpecification()
	 * @generated
	 */
	EReference getStaffSpecification_RoleList();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.CalibrationSpecification <em>Calibration Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Calibration Specification</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.CalibrationSpecification
	 * @generated
	 */
	EClass getCalibrationSpecification();

	/**
	 * Returns the meta object for the container reference '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.CalibrationSpecification#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.CalibrationSpecification#getParent()
	 * @see #getCalibrationSpecification()
	 * @generated
	 */
	EReference getCalibrationSpecification_Parent();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.CalibrationSpecification#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.CalibrationSpecification#getRole()
	 * @see #getCalibrationSpecification()
	 * @generated
	 */
	EReference getCalibrationSpecification_Role();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.CalibrationSpecification#getCalibrationConfig <em>Calibration Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Calibration Config</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.CalibrationSpecification#getCalibrationConfig()
	 * @see #getCalibrationSpecification()
	 * @generated
	 */
	EReference getCalibrationSpecification_CalibrationConfig();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.CalibrationConfiguration <em>Calibration Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Calibration Configuration</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.CalibrationConfiguration
	 * @generated
	 */
	EClass getCalibrationConfiguration();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.CalibrationConfiguration#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.CalibrationConfiguration#getName()
	 * @see #getCalibrationConfiguration()
	 * @generated
	 */
	EAttribute getCalibrationConfiguration_Name();

	/**
	 * Returns the meta object for the container reference '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.CalibrationConfiguration#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.CalibrationConfiguration#getParent()
	 * @see #getCalibrationConfiguration()
	 * @generated
	 */
	EReference getCalibrationConfiguration_Parent();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.CalibrationConfiguration#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Components</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.CalibrationConfiguration#getComponents()
	 * @see #getCalibrationConfiguration()
	 * @generated
	 */
	EReference getCalibrationConfiguration_Components();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.CalibrationConfiguration#getModules <em>Modules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Modules</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.CalibrationConfiguration#getModules()
	 * @see #getCalibrationConfiguration()
	 * @generated
	 */
	EReference getCalibrationConfiguration_Modules();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.CalibrationConfiguration#getInterfaces <em>Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Interfaces</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.CalibrationConfiguration#getInterfaces()
	 * @see #getCalibrationConfiguration()
	 * @generated
	 */
	EReference getCalibrationConfiguration_Interfaces();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.CalibrationConfiguration#getStructures <em>Structures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Structures</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.CalibrationConfiguration#getStructures()
	 * @see #getCalibrationConfiguration()
	 * @generated
	 */
	EReference getCalibrationConfiguration_Structures();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.HMIConfiguration <em>HMI Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HMI Configuration</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.HMIConfiguration
	 * @generated
	 */
	EClass getHMIConfiguration();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.HMIConfiguration#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.HMIConfiguration#getName()
	 * @see #getHMIConfiguration()
	 * @generated
	 */
	EAttribute getHMIConfiguration_Name();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.HMIConfiguration#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Components</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.HMIConfiguration#getComponents()
	 * @see #getHMIConfiguration()
	 * @generated
	 */
	EReference getHMIConfiguration_Components();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.HMIConfiguration#getModules <em>Modules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Modules</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.HMIConfiguration#getModules()
	 * @see #getHMIConfiguration()
	 * @generated
	 */
	EReference getHMIConfiguration_Modules();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.HMIConfiguration#getInterfaces <em>Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Interfaces</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.HMIConfiguration#getInterfaces()
	 * @see #getHMIConfiguration()
	 * @generated
	 */
	EReference getHMIConfiguration_Interfaces();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.HMIConfiguration#getStructures <em>Structures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Structures</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.HMIConfiguration#getStructures()
	 * @see #getHMIConfiguration()
	 * @generated
	 */
	EReference getHMIConfiguration_Structures();

	/**
	 * Returns the meta object for the container reference '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.HMIConfiguration#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.HMIConfiguration#getParent()
	 * @see #getHMIConfiguration()
	 * @generated
	 */
	EReference getHMIConfiguration_Parent();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.PersonList <em>Person List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person List</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.PersonList
	 * @generated
	 */
	EClass getPersonList();

	/**
	 * Returns the meta object for the container reference '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.PersonList#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.PersonList#getParent()
	 * @see #getPersonList()
	 * @generated
	 */
	EReference getPersonList_Parent();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.PersonList#getPersons <em>Persons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Persons</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.PersonList#getPersons()
	 * @see #getPersonList()
	 * @generated
	 */
	EReference getPersonList_Persons();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.Person
	 * @generated
	 */
	EClass getPerson();

	/**
	 * Returns the meta object for the container reference '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.Person#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.Person#getParent()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_Parent();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.Person#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Roles</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.Person#getRoles()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_Roles();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.Person#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.Person#getName()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Name();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.Role
	 * @generated
	 */
	EClass getRole();

	/**
	 * Returns the meta object for the container reference '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.Role#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.Role#getParent()
	 * @see #getRole()
	 * @generated
	 */
	EReference getRole_Parent();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.Role#getPerson <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Person</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.Role#getPerson()
	 * @see #getRole()
	 * @generated
	 */
	EReference getRole_Person();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.Role#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.Role#getDescription()
	 * @see #getRole()
	 * @generated
	 */
	EAttribute getRole_Description();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.RoleList <em>Role List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role List</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.RoleList
	 * @generated
	 */
	EClass getRoleList();

	/**
	 * Returns the meta object for the container reference '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.RoleList#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.RoleList#getParent()
	 * @see #getRoleList()
	 * @generated
	 */
	EReference getRoleList_Parent();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.RoleList#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Roles</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.RoleList#getRoles()
	 * @see #getRoleList()
	 * @generated
	 */
	EReference getRoleList_Roles();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.File <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.File
	 * @generated
	 */
	EClass getFile();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.File#getFilename <em>Filename</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filename</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.File#getFilename()
	 * @see #getFile()
	 * @generated
	 */
	EAttribute getFile_Filename();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.TestCase <em>Test Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Case</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.TestCase
	 * @generated
	 */
	EClass getTestCase();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.TestCase#getTestName <em>Test Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Name</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.TestCase#getTestName()
	 * @see #getTestCase()
	 * @generated
	 */
	EAttribute getTestCase_TestName();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.SystemTest <em>System Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Test</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.SystemTest
	 * @generated
	 */
	EClass getSystemTest();

	/**
	 * Returns the meta object for the container reference '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.SystemTest#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.SystemTest#getParent()
	 * @see #getSystemTest()
	 * @generated
	 */
	EReference getSystemTest_Parent();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.SystemTest#getSystemUnderTest <em>System Under Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>System Under Test</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.SystemTest#getSystemUnderTest()
	 * @see #getSystemTest()
	 * @generated
	 */
	EReference getSystemTest_SystemUnderTest();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.Engineer <em>Engineer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Engineer</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.Engineer
	 * @generated
	 */
	EClass getEngineer();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.Purchaser <em>Purchaser</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Purchaser</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.Purchaser
	 * @generated
	 */
	EClass getPurchaser();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.Mechanic <em>Mechanic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mechanic</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.Mechanic
	 * @generated
	 */
	EClass getMechanic();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.Documentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Documentation</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.Documentation
	 * @generated
	 */
	EClass getDocumentation();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.Drawing <em>Drawing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Drawing</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.Drawing
	 * @generated
	 */
	EClass getDrawing();

	/**
	 * Returns the meta object for the container reference '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.Drawing#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.Drawing#getParent()
	 * @see #getDrawing()
	 * @generated
	 */
	EReference getDrawing_Parent();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.ComponentDrawing <em>Component Drawing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Drawing</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.ComponentDrawing
	 * @generated
	 */
	EClass getComponentDrawing();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.ComponentDrawing#getDrawn_component <em>Drawn component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Drawn component</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.ComponentDrawing#getDrawn_component()
	 * @see #getComponentDrawing()
	 * @generated
	 */
	EReference getComponentDrawing_Drawn_component();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.ModuleDrawing <em>Module Drawing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module Drawing</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.ModuleDrawing
	 * @generated
	 */
	EClass getModuleDrawing();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.ModuleDrawing#getDrawn_module <em>Drawn module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Drawn module</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.ModuleDrawing#getDrawn_module()
	 * @see #getModuleDrawing()
	 * @generated
	 */
	EReference getModuleDrawing_Drawn_module();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.InterfaceDrawing <em>Interface Drawing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface Drawing</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.InterfaceDrawing
	 * @generated
	 */
	EClass getInterfaceDrawing();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.InterfaceDrawing#getDrawn_interface <em>Drawn interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Drawn interface</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.InterfaceDrawing#getDrawn_interface()
	 * @see #getInterfaceDrawing()
	 * @generated
	 */
	EReference getInterfaceDrawing_Drawn_interface();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.StructureDrawing <em>Structure Drawing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Structure Drawing</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.StructureDrawing
	 * @generated
	 */
	EClass getStructureDrawing();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.StructureDrawing#getDrawn_structure <em>Drawn structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Drawn structure</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.StructureDrawing#getDrawn_structure()
	 * @see #getStructureDrawing()
	 * @generated
	 */
	EReference getStructureDrawing_Drawn_structure();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.MainteneanceDocumentation <em>Mainteneance Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mainteneance Documentation</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.MainteneanceDocumentation
	 * @generated
	 */
	EClass getMainteneanceDocumentation();

	/**
	 * Returns the meta object for the container reference '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.MainteneanceDocumentation#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.MainteneanceDocumentation#getParent()
	 * @see #getMainteneanceDocumentation()
	 * @generated
	 */
	EReference getMainteneanceDocumentation_Parent();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.OperatorInstructions <em>Operator Instructions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operator Instructions</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.OperatorInstructions
	 * @generated
	 */
	EClass getOperatorInstructions();

	/**
	 * Returns the meta object for the container reference '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.OperatorInstructions#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.OperatorInstructions#getParent()
	 * @see #getOperatorInstructions()
	 * @generated
	 */
	EReference getOperatorInstructions_Parent();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.TrainingDocIntern <em>Training Doc Intern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Training Doc Intern</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.TrainingDocIntern
	 * @generated
	 */
	EClass getTrainingDocIntern();

	/**
	 * Returns the meta object for the container reference '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.TrainingDocIntern#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.TrainingDocIntern#getParent()
	 * @see #getTrainingDocIntern()
	 * @generated
	 */
	EReference getTrainingDocIntern_Parent();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.TrainingDocExternal <em>Training Doc External</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Training Doc External</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.TrainingDocExternal
	 * @generated
	 */
	EClass getTrainingDocExternal();

	/**
	 * Returns the meta object for the container reference '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.TrainingDocExternal#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.TrainingDocExternal#getParent()
	 * @see #getTrainingDocExternal()
	 * @generated
	 */
	EReference getTrainingDocExternal_Parent();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.DocumentationFiles <em>Documentation Files</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Documentation Files</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.DocumentationFiles
	 * @generated
	 */
	EClass getDocumentationFiles();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.DocumentationFiles#getMainteneance <em>Mainteneance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mainteneance</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.DocumentationFiles#getMainteneance()
	 * @see #getDocumentationFiles()
	 * @generated
	 */
	EReference getDocumentationFiles_Mainteneance();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.DocumentationFiles#getInstructions <em>Instructions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Instructions</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.DocumentationFiles#getInstructions()
	 * @see #getDocumentationFiles()
	 * @generated
	 */
	EReference getDocumentationFiles_Instructions();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.DocumentationFiles#getTrainingIntern <em>Training Intern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Training Intern</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.DocumentationFiles#getTrainingIntern()
	 * @see #getDocumentationFiles()
	 * @generated
	 */
	EReference getDocumentationFiles_TrainingIntern();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.DocumentationFiles#getTrainingExternal <em>Training External</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Training External</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.DocumentationFiles#getTrainingExternal()
	 * @see #getDocumentationFiles()
	 * @generated
	 */
	EReference getDocumentationFiles_TrainingExternal();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.ComponentDocumentationFiles <em>Component Documentation Files</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Documentation Files</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.ComponentDocumentationFiles
	 * @generated
	 */
	EClass getComponentDocumentationFiles();

	/**
	 * Returns the meta object for the container reference '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.ComponentDocumentationFiles#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.ComponentDocumentationFiles#getParent()
	 * @see #getComponentDocumentationFiles()
	 * @generated
	 */
	EReference getComponentDocumentationFiles_Parent();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.ComponentDocumentationFiles#getDocumentedComponent <em>Documented Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Documented Component</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.ComponentDocumentationFiles#getDocumentedComponent()
	 * @see #getComponentDocumentationFiles()
	 * @generated
	 */
	EReference getComponentDocumentationFiles_DocumentedComponent();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.ModuleDocumentationFiles <em>Module Documentation Files</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module Documentation Files</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.ModuleDocumentationFiles
	 * @generated
	 */
	EClass getModuleDocumentationFiles();

	/**
	 * Returns the meta object for the container reference '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.ModuleDocumentationFiles#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.ModuleDocumentationFiles#getParent()
	 * @see #getModuleDocumentationFiles()
	 * @generated
	 */
	EReference getModuleDocumentationFiles_Parent();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.ModuleDocumentationFiles#getDocumentedModule <em>Documented Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Documented Module</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.ModuleDocumentationFiles#getDocumentedModule()
	 * @see #getModuleDocumentationFiles()
	 * @generated
	 */
	EReference getModuleDocumentationFiles_DocumentedModule();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.InterfaceDocumentationFiles <em>Interface Documentation Files</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface Documentation Files</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.InterfaceDocumentationFiles
	 * @generated
	 */
	EClass getInterfaceDocumentationFiles();

	/**
	 * Returns the meta object for the container reference '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.InterfaceDocumentationFiles#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.InterfaceDocumentationFiles#getParent()
	 * @see #getInterfaceDocumentationFiles()
	 * @generated
	 */
	EReference getInterfaceDocumentationFiles_Parent();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.InterfaceDocumentationFiles#getDocumentedInterface <em>Documented Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Documented Interface</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.InterfaceDocumentationFiles#getDocumentedInterface()
	 * @see #getInterfaceDocumentationFiles()
	 * @generated
	 */
	EReference getInterfaceDocumentationFiles_DocumentedInterface();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.StructureDocumentationFiles <em>Structure Documentation Files</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Structure Documentation Files</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.StructureDocumentationFiles
	 * @generated
	 */
	EClass getStructureDocumentationFiles();

	/**
	 * Returns the meta object for the container reference '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.StructureDocumentationFiles#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.StructureDocumentationFiles#getParent()
	 * @see #getStructureDocumentationFiles()
	 * @generated
	 */
	EReference getStructureDocumentationFiles_Parent();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.StructureDocumentationFiles#getDocumentedStructure <em>Documented Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Documented Structure</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.StructureDocumentationFiles#getDocumentedStructure()
	 * @see #getStructureDocumentationFiles()
	 * @generated
	 */
	EReference getStructureDocumentationFiles_DocumentedStructure();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.StockList <em>Stock List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stock List</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.StockList
	 * @generated
	 */
	EClass getStockList();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.ComponentStockList <em>Component Stock List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Stock List</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.ComponentStockList
	 * @generated
	 */
	EClass getComponentStockList();

	/**
	 * Returns the meta object for the container reference '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.ComponentStockList#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.ComponentStockList#getParent()
	 * @see #getComponentStockList()
	 * @generated
	 */
	EReference getComponentStockList_Parent();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.ComponentStockList#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Components</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.ComponentStockList#getComponents()
	 * @see #getComponentStockList()
	 * @generated
	 */
	EReference getComponentStockList_Components();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.InterfaceStockList <em>Interface Stock List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface Stock List</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.InterfaceStockList
	 * @generated
	 */
	EClass getInterfaceStockList();

	/**
	 * Returns the meta object for the container reference '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.InterfaceStockList#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.InterfaceStockList#getParent()
	 * @see #getInterfaceStockList()
	 * @generated
	 */
	EReference getInterfaceStockList_Parent();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.InterfaceStockList#getInterfaces <em>Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Interfaces</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.InterfaceStockList#getInterfaces()
	 * @see #getInterfaceStockList()
	 * @generated
	 */
	EReference getInterfaceStockList_Interfaces();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.ModuleStockList <em>Module Stock List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module Stock List</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.ModuleStockList
	 * @generated
	 */
	EClass getModuleStockList();

	/**
	 * Returns the meta object for the container reference '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.ModuleStockList#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.ModuleStockList#getParent()
	 * @see #getModuleStockList()
	 * @generated
	 */
	EReference getModuleStockList_Parent();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.ModuleStockList#getModules <em>Modules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Modules</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.ModuleStockList#getModules()
	 * @see #getModuleStockList()
	 * @generated
	 */
	EReference getModuleStockList_Modules();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.StructureStockList <em>Structure Stock List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Structure Stock List</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.StructureStockList
	 * @generated
	 */
	EClass getStructureStockList();

	/**
	 * Returns the meta object for the container reference '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.StructureStockList#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.StructureStockList#getParent()
	 * @see #getStructureStockList()
	 * @generated
	 */
	EReference getStructureStockList_Parent();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.StructureStockList#getStructures <em>Structures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Structures</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.StructureStockList#getStructures()
	 * @see #getStructureStockList()
	 * @generated
	 */
	EReference getStructureStockList_Structures();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	KAMP4aPSFieldofactivityannotationsFactory getKAMP4aPSFieldofactivityannotationsFactory();

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
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.FieldOfActivityAnnotationRepositoryImpl <em>Field Of Activity Annotation Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.FieldOfActivityAnnotationRepositoryImpl
		 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.KAMP4aPSFieldofactivityannotationsPackageImpl#getFieldOfActivityAnnotationRepository()
		 * @generated
		 */
		EClass FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY = eINSTANCE.getFieldOfActivityAnnotationRepository();

		/**
		 * The meta object literal for the '<em><b>Calibration Specification</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__CALIBRATION_SPECIFICATION = eINSTANCE.getFieldOfActivityAnnotationRepository_CalibrationSpecification();

		/**
		 * The meta object literal for the '<em><b>Test Specification</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__TEST_SPECIFICATION = eINSTANCE.getFieldOfActivityAnnotationRepository_TestSpecification();

		/**
		 * The meta object literal for the '<em><b>Stock Specification</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__STOCK_SPECIFICATION = eINSTANCE.getFieldOfActivityAnnotationRepository_StockSpecification();

		/**
		 * The meta object literal for the '<em><b>Hmi Specification</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__HMI_SPECIFICATION = eINSTANCE.getFieldOfActivityAnnotationRepository_HmiSpecification();

		/**
		 * The meta object literal for the '<em><b>Ecad Specification</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__ECAD_SPECIFICATION = eINSTANCE.getFieldOfActivityAnnotationRepository_EcadSpecification();

		/**
		 * The meta object literal for the '<em><b>Documentation Specification</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__DOCUMENTATION_SPECIFICATION = eINSTANCE.getFieldOfActivityAnnotationRepository_DocumentationSpecification();

		/**
		 * The meta object literal for the '<em><b>Staff Specification</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__STAFF_SPECIFICATION = eINSTANCE.getFieldOfActivityAnnotationRepository_StaffSpecification();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.TestSpecificationImpl <em>Test Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.TestSpecificationImpl
		 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.KAMP4aPSFieldofactivityannotationsPackageImpl#getTestSpecification()
		 * @generated
		 */
		EClass TEST_SPECIFICATION = eINSTANCE.getTestSpecification();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST_SPECIFICATION__PARENT = eINSTANCE.getTestSpecification_Parent();

		/**
		 * The meta object literal for the '<em><b>System Tests</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST_SPECIFICATION__SYSTEM_TESTS = eINSTANCE.getTestSpecification_SystemTests();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST_SPECIFICATION__ROLE = eINSTANCE.getTestSpecification_Role();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.StockSpecificationImpl <em>Stock Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.StockSpecificationImpl
		 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.KAMP4aPSFieldofactivityannotationsPackageImpl#getStockSpecification()
		 * @generated
		 */
		EClass STOCK_SPECIFICATION = eINSTANCE.getStockSpecification();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STOCK_SPECIFICATION__PARENT = eINSTANCE.getStockSpecification_Parent();

		/**
		 * The meta object literal for the '<em><b>Component Stock List</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STOCK_SPECIFICATION__COMPONENT_STOCK_LIST = eINSTANCE.getStockSpecification_ComponentStockList();

		/**
		 * The meta object literal for the '<em><b>Interface Stock List</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STOCK_SPECIFICATION__INTERFACE_STOCK_LIST = eINSTANCE.getStockSpecification_InterfaceStockList();

		/**
		 * The meta object literal for the '<em><b>Module Stock List</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STOCK_SPECIFICATION__MODULE_STOCK_LIST = eINSTANCE.getStockSpecification_ModuleStockList();

		/**
		 * The meta object literal for the '<em><b>Structure Stock List</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STOCK_SPECIFICATION__STRUCTURE_STOCK_LIST = eINSTANCE.getStockSpecification_StructureStockList();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STOCK_SPECIFICATION__ROLE = eINSTANCE.getStockSpecification_Role();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.HMISpecificationImpl <em>HMI Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.HMISpecificationImpl
		 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.KAMP4aPSFieldofactivityannotationsPackageImpl#getHMISpecification()
		 * @generated
		 */
		EClass HMI_SPECIFICATION = eINSTANCE.getHMISpecification();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HMI_SPECIFICATION__PARENT = eINSTANCE.getHMISpecification_Parent();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HMI_SPECIFICATION__ROLE = eINSTANCE.getHMISpecification_Role();

		/**
		 * The meta object literal for the '<em><b>Hmi Config</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HMI_SPECIFICATION__HMI_CONFIG = eINSTANCE.getHMISpecification_HmiConfig();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.ECADSpecificationImpl <em>ECAD Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.ECADSpecificationImpl
		 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.KAMP4aPSFieldofactivityannotationsPackageImpl#getECADSpecification()
		 * @generated
		 */
		EClass ECAD_SPECIFICATION = eINSTANCE.getECADSpecification();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECAD_SPECIFICATION__PARENT = eINSTANCE.getECADSpecification_Parent();

		/**
		 * The meta object literal for the '<em><b>Drawings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECAD_SPECIFICATION__DRAWINGS = eINSTANCE.getECADSpecification_Drawings();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECAD_SPECIFICATION__ROLE = eINSTANCE.getECADSpecification_Role();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.DocumentationSpecificationImpl <em>Documentation Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.DocumentationSpecificationImpl
		 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.KAMP4aPSFieldofactivityannotationsPackageImpl#getDocumentationSpecification()
		 * @generated
		 */
		EClass DOCUMENTATION_SPECIFICATION = eINSTANCE.getDocumentationSpecification();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENTATION_SPECIFICATION__PARENT = eINSTANCE.getDocumentationSpecification_Parent();

		/**
		 * The meta object literal for the '<em><b>Component Documentation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENTATION_SPECIFICATION__COMPONENT_DOCUMENTATION = eINSTANCE.getDocumentationSpecification_ComponentDocumentation();

		/**
		 * The meta object literal for the '<em><b>Module Documentation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENTATION_SPECIFICATION__MODULE_DOCUMENTATION = eINSTANCE.getDocumentationSpecification_ModuleDocumentation();

		/**
		 * The meta object literal for the '<em><b>Interface Documentation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENTATION_SPECIFICATION__INTERFACE_DOCUMENTATION = eINSTANCE.getDocumentationSpecification_InterfaceDocumentation();

		/**
		 * The meta object literal for the '<em><b>Structure Documentation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENTATION_SPECIFICATION__STRUCTURE_DOCUMENTATION = eINSTANCE.getDocumentationSpecification_StructureDocumentation();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENTATION_SPECIFICATION__ROLE = eINSTANCE.getDocumentationSpecification_Role();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.StaffSpecificationImpl <em>Staff Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.StaffSpecificationImpl
		 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.KAMP4aPSFieldofactivityannotationsPackageImpl#getStaffSpecification()
		 * @generated
		 */
		EClass STAFF_SPECIFICATION = eINSTANCE.getStaffSpecification();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STAFF_SPECIFICATION__PARENT = eINSTANCE.getStaffSpecification_Parent();

		/**
		 * The meta object literal for the '<em><b>Person List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STAFF_SPECIFICATION__PERSON_LIST = eINSTANCE.getStaffSpecification_PersonList();

		/**
		 * The meta object literal for the '<em><b>Role List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STAFF_SPECIFICATION__ROLE_LIST = eINSTANCE.getStaffSpecification_RoleList();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.CalibrationSpecificationImpl <em>Calibration Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.CalibrationSpecificationImpl
		 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.KAMP4aPSFieldofactivityannotationsPackageImpl#getCalibrationSpecification()
		 * @generated
		 */
		EClass CALIBRATION_SPECIFICATION = eINSTANCE.getCalibrationSpecification();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALIBRATION_SPECIFICATION__PARENT = eINSTANCE.getCalibrationSpecification_Parent();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALIBRATION_SPECIFICATION__ROLE = eINSTANCE.getCalibrationSpecification_Role();

		/**
		 * The meta object literal for the '<em><b>Calibration Config</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALIBRATION_SPECIFICATION__CALIBRATION_CONFIG = eINSTANCE.getCalibrationSpecification_CalibrationConfig();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.CalibrationConfigurationImpl <em>Calibration Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.CalibrationConfigurationImpl
		 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.KAMP4aPSFieldofactivityannotationsPackageImpl#getCalibrationConfiguration()
		 * @generated
		 */
		EClass CALIBRATION_CONFIGURATION = eINSTANCE.getCalibrationConfiguration();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALIBRATION_CONFIGURATION__NAME = eINSTANCE.getCalibrationConfiguration_Name();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALIBRATION_CONFIGURATION__PARENT = eINSTANCE.getCalibrationConfiguration_Parent();

		/**
		 * The meta object literal for the '<em><b>Components</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALIBRATION_CONFIGURATION__COMPONENTS = eINSTANCE.getCalibrationConfiguration_Components();

		/**
		 * The meta object literal for the '<em><b>Modules</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALIBRATION_CONFIGURATION__MODULES = eINSTANCE.getCalibrationConfiguration_Modules();

		/**
		 * The meta object literal for the '<em><b>Interfaces</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALIBRATION_CONFIGURATION__INTERFACES = eINSTANCE.getCalibrationConfiguration_Interfaces();

		/**
		 * The meta object literal for the '<em><b>Structures</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALIBRATION_CONFIGURATION__STRUCTURES = eINSTANCE.getCalibrationConfiguration_Structures();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.HMIConfigurationImpl <em>HMI Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.HMIConfigurationImpl
		 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.KAMP4aPSFieldofactivityannotationsPackageImpl#getHMIConfiguration()
		 * @generated
		 */
		EClass HMI_CONFIGURATION = eINSTANCE.getHMIConfiguration();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HMI_CONFIGURATION__NAME = eINSTANCE.getHMIConfiguration_Name();

		/**
		 * The meta object literal for the '<em><b>Components</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HMI_CONFIGURATION__COMPONENTS = eINSTANCE.getHMIConfiguration_Components();

		/**
		 * The meta object literal for the '<em><b>Modules</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HMI_CONFIGURATION__MODULES = eINSTANCE.getHMIConfiguration_Modules();

		/**
		 * The meta object literal for the '<em><b>Interfaces</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HMI_CONFIGURATION__INTERFACES = eINSTANCE.getHMIConfiguration_Interfaces();

		/**
		 * The meta object literal for the '<em><b>Structures</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HMI_CONFIGURATION__STRUCTURES = eINSTANCE.getHMIConfiguration_Structures();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HMI_CONFIGURATION__PARENT = eINSTANCE.getHMIConfiguration_Parent();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.PersonListImpl <em>Person List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.PersonListImpl
		 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.KAMP4aPSFieldofactivityannotationsPackageImpl#getPersonList()
		 * @generated
		 */
		EClass PERSON_LIST = eINSTANCE.getPersonList();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON_LIST__PARENT = eINSTANCE.getPersonList_Parent();

		/**
		 * The meta object literal for the '<em><b>Persons</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON_LIST__PERSONS = eINSTANCE.getPersonList_Persons();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.PersonImpl <em>Person</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.PersonImpl
		 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.KAMP4aPSFieldofactivityannotationsPackageImpl#getPerson()
		 * @generated
		 */
		EClass PERSON = eINSTANCE.getPerson();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON__PARENT = eINSTANCE.getPerson_Parent();

		/**
		 * The meta object literal for the '<em><b>Roles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON__ROLES = eINSTANCE.getPerson_Roles();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__NAME = eINSTANCE.getPerson_Name();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.RoleImpl <em>Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.RoleImpl
		 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.KAMP4aPSFieldofactivityannotationsPackageImpl#getRole()
		 * @generated
		 */
		EClass ROLE = eINSTANCE.getRole();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE__PARENT = eINSTANCE.getRole_Parent();

		/**
		 * The meta object literal for the '<em><b>Person</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE__PERSON = eINSTANCE.getRole_Person();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE__DESCRIPTION = eINSTANCE.getRole_Description();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.RoleListImpl <em>Role List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.RoleListImpl
		 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.KAMP4aPSFieldofactivityannotationsPackageImpl#getRoleList()
		 * @generated
		 */
		EClass ROLE_LIST = eINSTANCE.getRoleList();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE_LIST__PARENT = eINSTANCE.getRoleList_Parent();

		/**
		 * The meta object literal for the '<em><b>Roles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE_LIST__ROLES = eINSTANCE.getRoleList_Roles();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.FileImpl <em>File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.FileImpl
		 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.KAMP4aPSFieldofactivityannotationsPackageImpl#getFile()
		 * @generated
		 */
		EClass FILE = eINSTANCE.getFile();

		/**
		 * The meta object literal for the '<em><b>Filename</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE__FILENAME = eINSTANCE.getFile_Filename();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.TestCaseImpl <em>Test Case</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.TestCaseImpl
		 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.KAMP4aPSFieldofactivityannotationsPackageImpl#getTestCase()
		 * @generated
		 */
		EClass TEST_CASE = eINSTANCE.getTestCase();

		/**
		 * The meta object literal for the '<em><b>Test Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CASE__TEST_NAME = eINSTANCE.getTestCase_TestName();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.SystemTestImpl <em>System Test</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.SystemTestImpl
		 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.KAMP4aPSFieldofactivityannotationsPackageImpl#getSystemTest()
		 * @generated
		 */
		EClass SYSTEM_TEST = eINSTANCE.getSystemTest();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_TEST__PARENT = eINSTANCE.getSystemTest_Parent();

		/**
		 * The meta object literal for the '<em><b>System Under Test</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_TEST__SYSTEM_UNDER_TEST = eINSTANCE.getSystemTest_SystemUnderTest();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.EngineerImpl <em>Engineer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.EngineerImpl
		 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.KAMP4aPSFieldofactivityannotationsPackageImpl#getEngineer()
		 * @generated
		 */
		EClass ENGINEER = eINSTANCE.getEngineer();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.PurchaserImpl <em>Purchaser</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.PurchaserImpl
		 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.KAMP4aPSFieldofactivityannotationsPackageImpl#getPurchaser()
		 * @generated
		 */
		EClass PURCHASER = eINSTANCE.getPurchaser();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.MechanicImpl <em>Mechanic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.MechanicImpl
		 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.KAMP4aPSFieldofactivityannotationsPackageImpl#getMechanic()
		 * @generated
		 */
		EClass MECHANIC = eINSTANCE.getMechanic();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.DocumentationImpl <em>Documentation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.DocumentationImpl
		 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.KAMP4aPSFieldofactivityannotationsPackageImpl#getDocumentation()
		 * @generated
		 */
		EClass DOCUMENTATION = eINSTANCE.getDocumentation();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.DrawingImpl <em>Drawing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.DrawingImpl
		 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.KAMP4aPSFieldofactivityannotationsPackageImpl#getDrawing()
		 * @generated
		 */
		EClass DRAWING = eINSTANCE.getDrawing();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DRAWING__PARENT = eINSTANCE.getDrawing_Parent();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.ComponentDrawingImpl <em>Component Drawing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.ComponentDrawingImpl
		 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.KAMP4aPSFieldofactivityannotationsPackageImpl#getComponentDrawing()
		 * @generated
		 */
		EClass COMPONENT_DRAWING = eINSTANCE.getComponentDrawing();

		/**
		 * The meta object literal for the '<em><b>Drawn component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_DRAWING__DRAWN_COMPONENT = eINSTANCE.getComponentDrawing_Drawn_component();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.ModuleDrawingImpl <em>Module Drawing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.ModuleDrawingImpl
		 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.KAMP4aPSFieldofactivityannotationsPackageImpl#getModuleDrawing()
		 * @generated
		 */
		EClass MODULE_DRAWING = eINSTANCE.getModuleDrawing();

		/**
		 * The meta object literal for the '<em><b>Drawn module</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE_DRAWING__DRAWN_MODULE = eINSTANCE.getModuleDrawing_Drawn_module();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.InterfaceDrawingImpl <em>Interface Drawing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.InterfaceDrawingImpl
		 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.KAMP4aPSFieldofactivityannotationsPackageImpl#getInterfaceDrawing()
		 * @generated
		 */
		EClass INTERFACE_DRAWING = eINSTANCE.getInterfaceDrawing();

		/**
		 * The meta object literal for the '<em><b>Drawn interface</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_DRAWING__DRAWN_INTERFACE = eINSTANCE.getInterfaceDrawing_Drawn_interface();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.StructureDrawingImpl <em>Structure Drawing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.StructureDrawingImpl
		 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.KAMP4aPSFieldofactivityannotationsPackageImpl#getStructureDrawing()
		 * @generated
		 */
		EClass STRUCTURE_DRAWING = eINSTANCE.getStructureDrawing();

		/**
		 * The meta object literal for the '<em><b>Drawn structure</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCTURE_DRAWING__DRAWN_STRUCTURE = eINSTANCE.getStructureDrawing_Drawn_structure();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.MainteneanceDocumentationImpl <em>Mainteneance Documentation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.MainteneanceDocumentationImpl
		 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.KAMP4aPSFieldofactivityannotationsPackageImpl#getMainteneanceDocumentation()
		 * @generated
		 */
		EClass MAINTENEANCE_DOCUMENTATION = eINSTANCE.getMainteneanceDocumentation();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAINTENEANCE_DOCUMENTATION__PARENT = eINSTANCE.getMainteneanceDocumentation_Parent();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.OperatorInstructionsImpl <em>Operator Instructions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.OperatorInstructionsImpl
		 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.KAMP4aPSFieldofactivityannotationsPackageImpl#getOperatorInstructions()
		 * @generated
		 */
		EClass OPERATOR_INSTRUCTIONS = eINSTANCE.getOperatorInstructions();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATOR_INSTRUCTIONS__PARENT = eINSTANCE.getOperatorInstructions_Parent();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.TrainingDocInternImpl <em>Training Doc Intern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.TrainingDocInternImpl
		 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.KAMP4aPSFieldofactivityannotationsPackageImpl#getTrainingDocIntern()
		 * @generated
		 */
		EClass TRAINING_DOC_INTERN = eINSTANCE.getTrainingDocIntern();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRAINING_DOC_INTERN__PARENT = eINSTANCE.getTrainingDocIntern_Parent();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.TrainingDocExternalImpl <em>Training Doc External</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.TrainingDocExternalImpl
		 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.KAMP4aPSFieldofactivityannotationsPackageImpl#getTrainingDocExternal()
		 * @generated
		 */
		EClass TRAINING_DOC_EXTERNAL = eINSTANCE.getTrainingDocExternal();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRAINING_DOC_EXTERNAL__PARENT = eINSTANCE.getTrainingDocExternal_Parent();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.DocumentationFiles <em>Documentation Files</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.DocumentationFiles
		 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.KAMP4aPSFieldofactivityannotationsPackageImpl#getDocumentationFiles()
		 * @generated
		 */
		EClass DOCUMENTATION_FILES = eINSTANCE.getDocumentationFiles();

		/**
		 * The meta object literal for the '<em><b>Mainteneance</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENTATION_FILES__MAINTENEANCE = eINSTANCE.getDocumentationFiles_Mainteneance();

		/**
		 * The meta object literal for the '<em><b>Instructions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENTATION_FILES__INSTRUCTIONS = eINSTANCE.getDocumentationFiles_Instructions();

		/**
		 * The meta object literal for the '<em><b>Training Intern</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENTATION_FILES__TRAINING_INTERN = eINSTANCE.getDocumentationFiles_TrainingIntern();

		/**
		 * The meta object literal for the '<em><b>Training External</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENTATION_FILES__TRAINING_EXTERNAL = eINSTANCE.getDocumentationFiles_TrainingExternal();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.ComponentDocumentationFilesImpl <em>Component Documentation Files</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.ComponentDocumentationFilesImpl
		 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.KAMP4aPSFieldofactivityannotationsPackageImpl#getComponentDocumentationFiles()
		 * @generated
		 */
		EClass COMPONENT_DOCUMENTATION_FILES = eINSTANCE.getComponentDocumentationFiles();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_DOCUMENTATION_FILES__PARENT = eINSTANCE.getComponentDocumentationFiles_Parent();

		/**
		 * The meta object literal for the '<em><b>Documented Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_DOCUMENTATION_FILES__DOCUMENTED_COMPONENT = eINSTANCE.getComponentDocumentationFiles_DocumentedComponent();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.ModuleDocumentationFilesImpl <em>Module Documentation Files</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.ModuleDocumentationFilesImpl
		 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.KAMP4aPSFieldofactivityannotationsPackageImpl#getModuleDocumentationFiles()
		 * @generated
		 */
		EClass MODULE_DOCUMENTATION_FILES = eINSTANCE.getModuleDocumentationFiles();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE_DOCUMENTATION_FILES__PARENT = eINSTANCE.getModuleDocumentationFiles_Parent();

		/**
		 * The meta object literal for the '<em><b>Documented Module</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE_DOCUMENTATION_FILES__DOCUMENTED_MODULE = eINSTANCE.getModuleDocumentationFiles_DocumentedModule();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.InterfaceDocumentationFilesImpl <em>Interface Documentation Files</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.InterfaceDocumentationFilesImpl
		 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.KAMP4aPSFieldofactivityannotationsPackageImpl#getInterfaceDocumentationFiles()
		 * @generated
		 */
		EClass INTERFACE_DOCUMENTATION_FILES = eINSTANCE.getInterfaceDocumentationFiles();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_DOCUMENTATION_FILES__PARENT = eINSTANCE.getInterfaceDocumentationFiles_Parent();

		/**
		 * The meta object literal for the '<em><b>Documented Interface</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_DOCUMENTATION_FILES__DOCUMENTED_INTERFACE = eINSTANCE.getInterfaceDocumentationFiles_DocumentedInterface();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.StructureDocumentationFilesImpl <em>Structure Documentation Files</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.StructureDocumentationFilesImpl
		 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.KAMP4aPSFieldofactivityannotationsPackageImpl#getStructureDocumentationFiles()
		 * @generated
		 */
		EClass STRUCTURE_DOCUMENTATION_FILES = eINSTANCE.getStructureDocumentationFiles();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCTURE_DOCUMENTATION_FILES__PARENT = eINSTANCE.getStructureDocumentationFiles_Parent();

		/**
		 * The meta object literal for the '<em><b>Documented Structure</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCTURE_DOCUMENTATION_FILES__DOCUMENTED_STRUCTURE = eINSTANCE.getStructureDocumentationFiles_DocumentedStructure();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.StockListImpl <em>Stock List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.StockListImpl
		 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.KAMP4aPSFieldofactivityannotationsPackageImpl#getStockList()
		 * @generated
		 */
		EClass STOCK_LIST = eINSTANCE.getStockList();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.ComponentStockListImpl <em>Component Stock List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.ComponentStockListImpl
		 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.KAMP4aPSFieldofactivityannotationsPackageImpl#getComponentStockList()
		 * @generated
		 */
		EClass COMPONENT_STOCK_LIST = eINSTANCE.getComponentStockList();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_STOCK_LIST__PARENT = eINSTANCE.getComponentStockList_Parent();

		/**
		 * The meta object literal for the '<em><b>Components</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_STOCK_LIST__COMPONENTS = eINSTANCE.getComponentStockList_Components();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.InterfaceStockListImpl <em>Interface Stock List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.InterfaceStockListImpl
		 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.KAMP4aPSFieldofactivityannotationsPackageImpl#getInterfaceStockList()
		 * @generated
		 */
		EClass INTERFACE_STOCK_LIST = eINSTANCE.getInterfaceStockList();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_STOCK_LIST__PARENT = eINSTANCE.getInterfaceStockList_Parent();

		/**
		 * The meta object literal for the '<em><b>Interfaces</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_STOCK_LIST__INTERFACES = eINSTANCE.getInterfaceStockList_Interfaces();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.ModuleStockListImpl <em>Module Stock List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.ModuleStockListImpl
		 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.KAMP4aPSFieldofactivityannotationsPackageImpl#getModuleStockList()
		 * @generated
		 */
		EClass MODULE_STOCK_LIST = eINSTANCE.getModuleStockList();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE_STOCK_LIST__PARENT = eINSTANCE.getModuleStockList_Parent();

		/**
		 * The meta object literal for the '<em><b>Modules</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE_STOCK_LIST__MODULES = eINSTANCE.getModuleStockList_Modules();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.StructureStockListImpl <em>Structure Stock List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.StructureStockListImpl
		 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.KAMP4aPSFieldofactivityannotationsPackageImpl#getStructureStockList()
		 * @generated
		 */
		EClass STRUCTURE_STOCK_LIST = eINSTANCE.getStructureStockList();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCTURE_STOCK_LIST__PARENT = eINSTANCE.getStructureStockList_Parent();

		/**
		 * The meta object literal for the '<em><b>Structures</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCTURE_STOCK_LIST__STRUCTURES = eINSTANCE.getStructureStockList_Structures();

	}

} //KAMP4aPSFieldofactivityannotationsPackage
