/**
 */
package edu.kit.ipd.sdq.kamp4iec.model.IECRepository;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECRepositoryFactory
 * @model kind="package"
 * @generated
 */
public interface IECRepositoryPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "IECRepository";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://sdq.ipd.kit.edu/IECRepository";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "IECReporitory";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IECRepositoryPackage eINSTANCE = edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IECRepositoryPackageImpl.init();

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IdentifierImpl <em>Identifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IdentifierImpl
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IECRepositoryPackageImpl#getIdentifier()
	 * @generated
	 */
	int IDENTIFIER = 13;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER__NAME = 1;

	/**
	 * The number of structural features of the '<em>Identifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Identifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.FunctionBlockImpl <em>Function Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.FunctionBlockImpl
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IECRepositoryPackageImpl#getFunctionBlock()
	 * @generated
	 */
	int FUNCTION_BLOCK = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BLOCK__ID = IDENTIFIER__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BLOCK__NAME = IDENTIFIER__NAME;

	/**
	 * The feature id for the '<em><b>Has Iec Method</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BLOCK__HAS_IEC_METHOD = IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Has Iec Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BLOCK__HAS_IEC_PROPERTY = IDENTIFIER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Has Interface</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BLOCK__HAS_INTERFACE = IDENTIFIER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Accesses Variable</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BLOCK__ACCESSES_VARIABLE = IDENTIFIER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Uses Function Block</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BLOCK__USES_FUNCTION_BLOCK = IDENTIFIER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Calls Function</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BLOCK__CALLS_FUNCTION = IDENTIFIER_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Uses Enum</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BLOCK__USES_ENUM = IDENTIFIER_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Uses Interface</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BLOCK__USES_INTERFACE = IDENTIFIER_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Function Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BLOCK_FEATURE_COUNT = IDENTIFIER_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Function Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BLOCK_OPERATION_COUNT = IDENTIFIER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.GlobalVariableImpl <em>Global Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.GlobalVariableImpl
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IECRepositoryPackageImpl#getGlobalVariable()
	 * @generated
	 */
	int GLOBAL_VARIABLE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_VARIABLE__ID = IDENTIFIER__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_VARIABLE__NAME = IDENTIFIER__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_VARIABLE__TYPE = IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Uses Enum</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_VARIABLE__USES_ENUM = IDENTIFIER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Global Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_VARIABLE_FEATURE_COUNT = IDENTIFIER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Global Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_VARIABLE_OPERATION_COUNT = IDENTIFIER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IECInterfaceImpl <em>IEC Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IECInterfaceImpl
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IECRepositoryPackageImpl#getIECInterface()
	 * @generated
	 */
	int IEC_INTERFACE = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_INTERFACE__ID = IDENTIFIER__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_INTERFACE__NAME = IDENTIFIER__NAME;

	/**
	 * The feature id for the '<em><b>Defines Iec Method</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_INTERFACE__DEFINES_IEC_METHOD = IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Defines Iec Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_INTERFACE__DEFINES_IEC_PROPERTY = IDENTIFIER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Uses Enum</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_INTERFACE__USES_ENUM = IDENTIFIER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>IEC Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_INTERFACE_FEATURE_COUNT = IDENTIFIER_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>IEC Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_INTERFACE_OPERATION_COUNT = IDENTIFIER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IECMethodImplementationImpl <em>IEC Method Implementation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IECMethodImplementationImpl
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IECRepositoryPackageImpl#getIECMethodImplementation()
	 * @generated
	 */
	int IEC_METHOD_IMPLEMENTATION = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_METHOD_IMPLEMENTATION__ID = IDENTIFIER__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_METHOD_IMPLEMENTATION__NAME = IDENTIFIER__NAME;

	/**
	 * The feature id for the '<em><b>Implements</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_METHOD_IMPLEMENTATION__IMPLEMENTS = IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Accesses Property</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_METHOD_IMPLEMENTATION__ACCESSES_PROPERTY = IDENTIFIER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Accesses Variable</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_METHOD_IMPLEMENTATION__ACCESSES_VARIABLE = IDENTIFIER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Uses Enum</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_METHOD_IMPLEMENTATION__USES_ENUM = IDENTIFIER_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>IEC Method Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_METHOD_IMPLEMENTATION_FEATURE_COUNT = IDENTIFIER_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>IEC Method Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_METHOD_IMPLEMENTATION_OPERATION_COUNT = IDENTIFIER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.FunctionImpl <em>Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.FunctionImpl
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IECRepositoryPackageImpl#getFunction()
	 * @generated
	 */
	int FUNCTION = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__ID = IDENTIFIER__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__NAME = IDENTIFIER__NAME;

	/**
	 * The feature id for the '<em><b>Calls Function</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__CALLS_FUNCTION = IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Uses Enum</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__USES_ENUM = IDENTIFIER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_FEATURE_COUNT = IDENTIFIER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_OPERATION_COUNT = IDENTIFIER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.ProgramImpl <em>Program</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.ProgramImpl
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IECRepositoryPackageImpl#getProgram()
	 * @generated
	 */
	int PROGRAM = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__ID = IDENTIFIER__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__NAME = IDENTIFIER__NAME;

	/**
	 * The number of structural features of the '<em>Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_FEATURE_COUNT = IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_OPERATION_COUNT = IDENTIFIER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.RepositoryImpl <em>Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.RepositoryImpl
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IECRepositoryPackageImpl#getRepository()
	 * @generated
	 */
	int REPOSITORY = 6;

	/**
	 * The feature id for the '<em><b>Contains Program</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__CONTAINS_PROGRAM = 0;

	/**
	 * The feature id for the '<em><b>Contains Interface</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__CONTAINS_INTERFACE = 1;

	/**
	 * The feature id for the '<em><b>Contains Function Block</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__CONTAINS_FUNCTION_BLOCK = 2;

	/**
	 * The feature id for the '<em><b>Contains Function</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__CONTAINS_FUNCTION = 3;

	/**
	 * The feature id for the '<em><b>Contains Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__CONTAINS_VARIABLE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__NAME = 5;

	/**
	 * The feature id for the '<em><b>Contains Enum</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__CONTAINS_ENUM = 6;

	/**
	 * The number of structural features of the '<em>Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IECPropertyImplementationImpl <em>IEC Property Implementation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IECPropertyImplementationImpl
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IECRepositoryPackageImpl#getIECPropertyImplementation()
	 * @generated
	 */
	int IEC_PROPERTY_IMPLEMENTATION = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_PROPERTY_IMPLEMENTATION__ID = IDENTIFIER__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_PROPERTY_IMPLEMENTATION__NAME = IDENTIFIER__NAME;

	/**
	 * The feature id for the '<em><b>Implements</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_PROPERTY_IMPLEMENTATION__IMPLEMENTS = IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Accesses Variable</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_PROPERTY_IMPLEMENTATION__ACCESSES_VARIABLE = IDENTIFIER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Uses Enum</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_PROPERTY_IMPLEMENTATION__USES_ENUM = IDENTIFIER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>IEC Property Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_PROPERTY_IMPLEMENTATION_FEATURE_COUNT = IDENTIFIER_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>IEC Property Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_PROPERTY_IMPLEMENTATION_OPERATION_COUNT = IDENTIFIER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IECPropertyImpl <em>IEC Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IECPropertyImpl
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IECRepositoryPackageImpl#getIECProperty()
	 * @generated
	 */
	int IEC_PROPERTY = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_PROPERTY__ID = IDENTIFIER__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_PROPERTY__NAME = IDENTIFIER__NAME;

	/**
	 * The feature id for the '<em><b>Uses Enum</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_PROPERTY__USES_ENUM = IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>IEC Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_PROPERTY_FEATURE_COUNT = IDENTIFIER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>IEC Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_PROPERTY_OPERATION_COUNT = IDENTIFIER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IECMethodImpl <em>IEC Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IECMethodImpl
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IECRepositoryPackageImpl#getIECMethod()
	 * @generated
	 */
	int IEC_METHOD = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_METHOD__ID = IDENTIFIER__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_METHOD__NAME = IDENTIFIER__NAME;

	/**
	 * The feature id for the '<em><b>Uses Enum</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_METHOD__USES_ENUM = IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>IEC Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_METHOD_FEATURE_COUNT = IDENTIFIER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>IEC Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_METHOD_OPERATION_COUNT = IDENTIFIER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.FunctionblockResource <em>Functionblock Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.FunctionblockResource
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IECRepositoryPackageImpl#getFunctionblockResource()
	 * @generated
	 */
	int FUNCTIONBLOCK_RESOURCE = 10;

	/**
	 * The number of structural features of the '<em>Functionblock Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONBLOCK_RESOURCE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Functionblock Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONBLOCK_RESOURCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.MethodResource <em>Method Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.MethodResource
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IECRepositoryPackageImpl#getMethodResource()
	 * @generated
	 */
	int METHOD_RESOURCE = 11;

	/**
	 * The number of structural features of the '<em>Method Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_RESOURCE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Method Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_RESOURCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.EnumImpl <em>Enum</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.EnumImpl
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IECRepositoryPackageImpl#getEnum()
	 * @generated
	 */
	int ENUM = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM__NAME = 0;

	/**
	 * The number of structural features of the '<em>Enum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Enum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.ImplementsInterfaceImpl <em>Implements Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.ImplementsInterfaceImpl
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IECRepositoryPackageImpl#getImplementsInterface()
	 * @generated
	 */
	int IMPLEMENTS_INTERFACE = 14;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTS_INTERFACE__INTERFACE = 0;

	/**
	 * The number of structural features of the '<em>Implements Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTS_INTERFACE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Implements Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTS_INTERFACE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.VariableType <em>Variable Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.VariableType
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IECRepositoryPackageImpl#getVariableType()
	 * @generated
	 */
	int VARIABLE_TYPE = 15;


	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.FunctionBlock <em>Function Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Block</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.FunctionBlock
	 * @generated
	 */
	EClass getFunctionBlock();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.FunctionBlock#getHasIecMethod <em>Has Iec Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Iec Method</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.FunctionBlock#getHasIecMethod()
	 * @see #getFunctionBlock()
	 * @generated
	 */
	EReference getFunctionBlock_HasIecMethod();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.FunctionBlock#getHasIecProperty <em>Has Iec Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Iec Property</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.FunctionBlock#getHasIecProperty()
	 * @see #getFunctionBlock()
	 * @generated
	 */
	EReference getFunctionBlock_HasIecProperty();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.FunctionBlock#getHasInterface <em>Has Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Interface</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.FunctionBlock#getHasInterface()
	 * @see #getFunctionBlock()
	 * @generated
	 */
	EReference getFunctionBlock_HasInterface();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.FunctionBlock#getAccessesVariable <em>Accesses Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Accesses Variable</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.FunctionBlock#getAccessesVariable()
	 * @see #getFunctionBlock()
	 * @generated
	 */
	EReference getFunctionBlock_AccessesVariable();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.FunctionBlock#getUsesFunctionBlock <em>Uses Function Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Uses Function Block</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.FunctionBlock#getUsesFunctionBlock()
	 * @see #getFunctionBlock()
	 * @generated
	 */
	EReference getFunctionBlock_UsesFunctionBlock();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.FunctionBlock#getCallsFunction <em>Calls Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Calls Function</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.FunctionBlock#getCallsFunction()
	 * @see #getFunctionBlock()
	 * @generated
	 */
	EReference getFunctionBlock_CallsFunction();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.FunctionBlock#getUsesEnum <em>Uses Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Uses Enum</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.FunctionBlock#getUsesEnum()
	 * @see #getFunctionBlock()
	 * @generated
	 */
	EReference getFunctionBlock_UsesEnum();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.FunctionBlock#getUsesInterface <em>Uses Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Uses Interface</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.FunctionBlock#getUsesInterface()
	 * @see #getFunctionBlock()
	 * @generated
	 */
	EReference getFunctionBlock_UsesInterface();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.GlobalVariable <em>Global Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Global Variable</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.GlobalVariable
	 * @generated
	 */
	EClass getGlobalVariable();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.GlobalVariable#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.GlobalVariable#getType()
	 * @see #getGlobalVariable()
	 * @generated
	 */
	EAttribute getGlobalVariable_Type();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.GlobalVariable#getUsesEnum <em>Uses Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Uses Enum</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.GlobalVariable#getUsesEnum()
	 * @see #getGlobalVariable()
	 * @generated
	 */
	EReference getGlobalVariable_UsesEnum();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECInterface <em>IEC Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IEC Interface</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECInterface
	 * @generated
	 */
	EClass getIECInterface();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECInterface#getDefinesIecMethod <em>Defines Iec Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Defines Iec Method</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECInterface#getDefinesIecMethod()
	 * @see #getIECInterface()
	 * @generated
	 */
	EReference getIECInterface_DefinesIecMethod();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECInterface#getDefinesIecProperty <em>Defines Iec Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Defines Iec Property</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECInterface#getDefinesIecProperty()
	 * @see #getIECInterface()
	 * @generated
	 */
	EReference getIECInterface_DefinesIecProperty();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECInterface#getUsesEnum <em>Uses Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Uses Enum</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECInterface#getUsesEnum()
	 * @see #getIECInterface()
	 * @generated
	 */
	EReference getIECInterface_UsesEnum();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECMethodImplementation <em>IEC Method Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IEC Method Implementation</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECMethodImplementation
	 * @generated
	 */
	EClass getIECMethodImplementation();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECMethodImplementation#getImplements <em>Implements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Implements</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECMethodImplementation#getImplements()
	 * @see #getIECMethodImplementation()
	 * @generated
	 */
	EReference getIECMethodImplementation_Implements();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECMethodImplementation#getAccessesProperty <em>Accesses Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Accesses Property</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECMethodImplementation#getAccessesProperty()
	 * @see #getIECMethodImplementation()
	 * @generated
	 */
	EReference getIECMethodImplementation_AccessesProperty();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECMethodImplementation#getAccessesVariable <em>Accesses Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Accesses Variable</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECMethodImplementation#getAccessesVariable()
	 * @see #getIECMethodImplementation()
	 * @generated
	 */
	EReference getIECMethodImplementation_AccessesVariable();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECMethodImplementation#getUsesEnum <em>Uses Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Uses Enum</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECMethodImplementation#getUsesEnum()
	 * @see #getIECMethodImplementation()
	 * @generated
	 */
	EReference getIECMethodImplementation_UsesEnum();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.Function <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.Function
	 * @generated
	 */
	EClass getFunction();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.Function#getCallsFunction <em>Calls Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Calls Function</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.Function#getCallsFunction()
	 * @see #getFunction()
	 * @generated
	 */
	EReference getFunction_CallsFunction();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.Function#getUsesEnum <em>Uses Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Uses Enum</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.Function#getUsesEnum()
	 * @see #getFunction()
	 * @generated
	 */
	EReference getFunction_UsesEnum();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.Program <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Program</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.Program
	 * @generated
	 */
	EClass getProgram();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.Repository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Repository</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.Repository
	 * @generated
	 */
	EClass getRepository();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.Repository#getContainsProgram <em>Contains Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains Program</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.Repository#getContainsProgram()
	 * @see #getRepository()
	 * @generated
	 */
	EReference getRepository_ContainsProgram();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.Repository#getContainsInterface <em>Contains Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains Interface</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.Repository#getContainsInterface()
	 * @see #getRepository()
	 * @generated
	 */
	EReference getRepository_ContainsInterface();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.Repository#getContainsFunctionBlock <em>Contains Function Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains Function Block</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.Repository#getContainsFunctionBlock()
	 * @see #getRepository()
	 * @generated
	 */
	EReference getRepository_ContainsFunctionBlock();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.Repository#getContainsFunction <em>Contains Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains Function</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.Repository#getContainsFunction()
	 * @see #getRepository()
	 * @generated
	 */
	EReference getRepository_ContainsFunction();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.Repository#getContainsVariable <em>Contains Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains Variable</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.Repository#getContainsVariable()
	 * @see #getRepository()
	 * @generated
	 */
	EReference getRepository_ContainsVariable();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.Repository#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.Repository#getName()
	 * @see #getRepository()
	 * @generated
	 */
	EAttribute getRepository_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.Repository#getContainsEnum <em>Contains Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains Enum</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.Repository#getContainsEnum()
	 * @see #getRepository()
	 * @generated
	 */
	EReference getRepository_ContainsEnum();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECPropertyImplementation <em>IEC Property Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IEC Property Implementation</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECPropertyImplementation
	 * @generated
	 */
	EClass getIECPropertyImplementation();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECPropertyImplementation#getImplements <em>Implements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Implements</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECPropertyImplementation#getImplements()
	 * @see #getIECPropertyImplementation()
	 * @generated
	 */
	EReference getIECPropertyImplementation_Implements();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECPropertyImplementation#getAccessesVariable <em>Accesses Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Accesses Variable</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECPropertyImplementation#getAccessesVariable()
	 * @see #getIECPropertyImplementation()
	 * @generated
	 */
	EReference getIECPropertyImplementation_AccessesVariable();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECPropertyImplementation#getUsesEnum <em>Uses Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Uses Enum</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECPropertyImplementation#getUsesEnum()
	 * @see #getIECPropertyImplementation()
	 * @generated
	 */
	EReference getIECPropertyImplementation_UsesEnum();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECProperty <em>IEC Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IEC Property</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECProperty
	 * @generated
	 */
	EClass getIECProperty();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECProperty#getUsesEnum <em>Uses Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Uses Enum</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECProperty#getUsesEnum()
	 * @see #getIECProperty()
	 * @generated
	 */
	EReference getIECProperty_UsesEnum();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECMethod <em>IEC Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IEC Method</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECMethod
	 * @generated
	 */
	EClass getIECMethod();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECMethod#getUsesEnum <em>Uses Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Uses Enum</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECMethod#getUsesEnum()
	 * @see #getIECMethod()
	 * @generated
	 */
	EReference getIECMethod_UsesEnum();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.FunctionblockResource <em>Functionblock Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Functionblock Resource</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.FunctionblockResource
	 * @generated
	 */
	EClass getFunctionblockResource();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.MethodResource <em>Method Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method Resource</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.MethodResource
	 * @generated
	 */
	EClass getMethodResource();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.Enum <em>Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enum</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.Enum
	 * @generated
	 */
	EClass getEnum();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.Enum#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.Enum#getName()
	 * @see #getEnum()
	 * @generated
	 */
	EAttribute getEnum_Name();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.Identifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identifier</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.Identifier
	 * @generated
	 */
	EClass getIdentifier();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.Identifier#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.Identifier#getId()
	 * @see #getIdentifier()
	 * @generated
	 */
	EAttribute getIdentifier_Id();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.Identifier#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.Identifier#getName()
	 * @see #getIdentifier()
	 * @generated
	 */
	EAttribute getIdentifier_Name();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.ImplementsInterface <em>Implements Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Implements Interface</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.ImplementsInterface
	 * @generated
	 */
	EClass getImplementsInterface();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.ImplementsInterface#getInterface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Interface</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.ImplementsInterface#getInterface()
	 * @see #getImplementsInterface()
	 * @generated
	 */
	EReference getImplementsInterface_Interface();

	/**
	 * Returns the meta object for enum '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.VariableType <em>Variable Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Variable Type</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.VariableType
	 * @generated
	 */
	EEnum getVariableType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	IECRepositoryFactory getIECRepositoryFactory();

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
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.FunctionBlockImpl <em>Function Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.FunctionBlockImpl
		 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IECRepositoryPackageImpl#getFunctionBlock()
		 * @generated
		 */
		EClass FUNCTION_BLOCK = eINSTANCE.getFunctionBlock();

		/**
		 * The meta object literal for the '<em><b>Has Iec Method</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_BLOCK__HAS_IEC_METHOD = eINSTANCE.getFunctionBlock_HasIecMethod();

		/**
		 * The meta object literal for the '<em><b>Has Iec Property</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_BLOCK__HAS_IEC_PROPERTY = eINSTANCE.getFunctionBlock_HasIecProperty();

		/**
		 * The meta object literal for the '<em><b>Has Interface</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_BLOCK__HAS_INTERFACE = eINSTANCE.getFunctionBlock_HasInterface();

		/**
		 * The meta object literal for the '<em><b>Accesses Variable</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_BLOCK__ACCESSES_VARIABLE = eINSTANCE.getFunctionBlock_AccessesVariable();

		/**
		 * The meta object literal for the '<em><b>Uses Function Block</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_BLOCK__USES_FUNCTION_BLOCK = eINSTANCE.getFunctionBlock_UsesFunctionBlock();

		/**
		 * The meta object literal for the '<em><b>Calls Function</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_BLOCK__CALLS_FUNCTION = eINSTANCE.getFunctionBlock_CallsFunction();

		/**
		 * The meta object literal for the '<em><b>Uses Enum</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_BLOCK__USES_ENUM = eINSTANCE.getFunctionBlock_UsesEnum();

		/**
		 * The meta object literal for the '<em><b>Uses Interface</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_BLOCK__USES_INTERFACE = eINSTANCE.getFunctionBlock_UsesInterface();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.GlobalVariableImpl <em>Global Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.GlobalVariableImpl
		 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IECRepositoryPackageImpl#getGlobalVariable()
		 * @generated
		 */
		EClass GLOBAL_VARIABLE = eINSTANCE.getGlobalVariable();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GLOBAL_VARIABLE__TYPE = eINSTANCE.getGlobalVariable_Type();

		/**
		 * The meta object literal for the '<em><b>Uses Enum</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GLOBAL_VARIABLE__USES_ENUM = eINSTANCE.getGlobalVariable_UsesEnum();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IECInterfaceImpl <em>IEC Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IECInterfaceImpl
		 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IECRepositoryPackageImpl#getIECInterface()
		 * @generated
		 */
		EClass IEC_INTERFACE = eINSTANCE.getIECInterface();

		/**
		 * The meta object literal for the '<em><b>Defines Iec Method</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IEC_INTERFACE__DEFINES_IEC_METHOD = eINSTANCE.getIECInterface_DefinesIecMethod();

		/**
		 * The meta object literal for the '<em><b>Defines Iec Property</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IEC_INTERFACE__DEFINES_IEC_PROPERTY = eINSTANCE.getIECInterface_DefinesIecProperty();

		/**
		 * The meta object literal for the '<em><b>Uses Enum</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IEC_INTERFACE__USES_ENUM = eINSTANCE.getIECInterface_UsesEnum();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IECMethodImplementationImpl <em>IEC Method Implementation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IECMethodImplementationImpl
		 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IECRepositoryPackageImpl#getIECMethodImplementation()
		 * @generated
		 */
		EClass IEC_METHOD_IMPLEMENTATION = eINSTANCE.getIECMethodImplementation();

		/**
		 * The meta object literal for the '<em><b>Implements</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IEC_METHOD_IMPLEMENTATION__IMPLEMENTS = eINSTANCE.getIECMethodImplementation_Implements();

		/**
		 * The meta object literal for the '<em><b>Accesses Property</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IEC_METHOD_IMPLEMENTATION__ACCESSES_PROPERTY = eINSTANCE.getIECMethodImplementation_AccessesProperty();

		/**
		 * The meta object literal for the '<em><b>Accesses Variable</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IEC_METHOD_IMPLEMENTATION__ACCESSES_VARIABLE = eINSTANCE.getIECMethodImplementation_AccessesVariable();

		/**
		 * The meta object literal for the '<em><b>Uses Enum</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IEC_METHOD_IMPLEMENTATION__USES_ENUM = eINSTANCE.getIECMethodImplementation_UsesEnum();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.FunctionImpl <em>Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.FunctionImpl
		 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IECRepositoryPackageImpl#getFunction()
		 * @generated
		 */
		EClass FUNCTION = eINSTANCE.getFunction();

		/**
		 * The meta object literal for the '<em><b>Calls Function</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION__CALLS_FUNCTION = eINSTANCE.getFunction_CallsFunction();

		/**
		 * The meta object literal for the '<em><b>Uses Enum</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION__USES_ENUM = eINSTANCE.getFunction_UsesEnum();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.ProgramImpl <em>Program</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.ProgramImpl
		 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IECRepositoryPackageImpl#getProgram()
		 * @generated
		 */
		EClass PROGRAM = eINSTANCE.getProgram();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.RepositoryImpl <em>Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.RepositoryImpl
		 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IECRepositoryPackageImpl#getRepository()
		 * @generated
		 */
		EClass REPOSITORY = eINSTANCE.getRepository();

		/**
		 * The meta object literal for the '<em><b>Contains Program</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPOSITORY__CONTAINS_PROGRAM = eINSTANCE.getRepository_ContainsProgram();

		/**
		 * The meta object literal for the '<em><b>Contains Interface</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPOSITORY__CONTAINS_INTERFACE = eINSTANCE.getRepository_ContainsInterface();

		/**
		 * The meta object literal for the '<em><b>Contains Function Block</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPOSITORY__CONTAINS_FUNCTION_BLOCK = eINSTANCE.getRepository_ContainsFunctionBlock();

		/**
		 * The meta object literal for the '<em><b>Contains Function</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPOSITORY__CONTAINS_FUNCTION = eINSTANCE.getRepository_ContainsFunction();

		/**
		 * The meta object literal for the '<em><b>Contains Variable</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPOSITORY__CONTAINS_VARIABLE = eINSTANCE.getRepository_ContainsVariable();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY__NAME = eINSTANCE.getRepository_Name();

		/**
		 * The meta object literal for the '<em><b>Contains Enum</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPOSITORY__CONTAINS_ENUM = eINSTANCE.getRepository_ContainsEnum();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IECPropertyImplementationImpl <em>IEC Property Implementation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IECPropertyImplementationImpl
		 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IECRepositoryPackageImpl#getIECPropertyImplementation()
		 * @generated
		 */
		EClass IEC_PROPERTY_IMPLEMENTATION = eINSTANCE.getIECPropertyImplementation();

		/**
		 * The meta object literal for the '<em><b>Implements</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IEC_PROPERTY_IMPLEMENTATION__IMPLEMENTS = eINSTANCE.getIECPropertyImplementation_Implements();

		/**
		 * The meta object literal for the '<em><b>Accesses Variable</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IEC_PROPERTY_IMPLEMENTATION__ACCESSES_VARIABLE = eINSTANCE.getIECPropertyImplementation_AccessesVariable();

		/**
		 * The meta object literal for the '<em><b>Uses Enum</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IEC_PROPERTY_IMPLEMENTATION__USES_ENUM = eINSTANCE.getIECPropertyImplementation_UsesEnum();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IECPropertyImpl <em>IEC Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IECPropertyImpl
		 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IECRepositoryPackageImpl#getIECProperty()
		 * @generated
		 */
		EClass IEC_PROPERTY = eINSTANCE.getIECProperty();

		/**
		 * The meta object literal for the '<em><b>Uses Enum</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IEC_PROPERTY__USES_ENUM = eINSTANCE.getIECProperty_UsesEnum();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IECMethodImpl <em>IEC Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IECMethodImpl
		 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IECRepositoryPackageImpl#getIECMethod()
		 * @generated
		 */
		EClass IEC_METHOD = eINSTANCE.getIECMethod();

		/**
		 * The meta object literal for the '<em><b>Uses Enum</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IEC_METHOD__USES_ENUM = eINSTANCE.getIECMethod_UsesEnum();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.FunctionblockResource <em>Functionblock Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.FunctionblockResource
		 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IECRepositoryPackageImpl#getFunctionblockResource()
		 * @generated
		 */
		EClass FUNCTIONBLOCK_RESOURCE = eINSTANCE.getFunctionblockResource();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.MethodResource <em>Method Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.MethodResource
		 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IECRepositoryPackageImpl#getMethodResource()
		 * @generated
		 */
		EClass METHOD_RESOURCE = eINSTANCE.getMethodResource();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.EnumImpl <em>Enum</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.EnumImpl
		 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IECRepositoryPackageImpl#getEnum()
		 * @generated
		 */
		EClass ENUM = eINSTANCE.getEnum();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUM__NAME = eINSTANCE.getEnum_Name();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IdentifierImpl <em>Identifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IdentifierImpl
		 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IECRepositoryPackageImpl#getIdentifier()
		 * @generated
		 */
		EClass IDENTIFIER = eINSTANCE.getIdentifier();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENTIFIER__ID = eINSTANCE.getIdentifier_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENTIFIER__NAME = eINSTANCE.getIdentifier_Name();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.ImplementsInterfaceImpl <em>Implements Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.ImplementsInterfaceImpl
		 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IECRepositoryPackageImpl#getImplementsInterface()
		 * @generated
		 */
		EClass IMPLEMENTS_INTERFACE = eINSTANCE.getImplementsInterface();

		/**
		 * The meta object literal for the '<em><b>Interface</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPLEMENTS_INTERFACE__INTERFACE = eINSTANCE.getImplementsInterface_Interface();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.VariableType <em>Variable Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.VariableType
		 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IECRepositoryPackageImpl#getVariableType()
		 * @generated
		 */
		EEnum VARIABLE_TYPE = eINSTANCE.getVariableType();

	}

} //IECRepositoryPackage
