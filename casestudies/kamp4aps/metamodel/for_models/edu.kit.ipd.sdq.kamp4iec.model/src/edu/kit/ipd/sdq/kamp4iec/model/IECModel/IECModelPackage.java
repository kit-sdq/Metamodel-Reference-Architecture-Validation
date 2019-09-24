/**
 */
package edu.kit.ipd.sdq.kamp4iec.model.IECModel;

import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECRepositoryPackage;
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
 * @see edu.kit.ipd.sdq.kamp4iec.model.IECModel.IECModelFactory
 * @model kind="package"
 * @generated
 */
public interface IECModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "IECModel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://sdq.ipd.kit.edu/IECModel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "IECModel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IECModelPackage eINSTANCE = edu.kit.ipd.sdq.kamp4iec.model.IECModel.impl.IECModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4iec.model.IECModel.impl.FunctionBlockImpl <em>Function Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECModel.impl.FunctionBlockImpl
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECModel.impl.IECModelPackageImpl#getFunctionBlock()
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
	int FUNCTION_BLOCK__ID = IECRepositoryPackage.IDENTIFIER__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BLOCK__NAME = IECRepositoryPackage.IDENTIFIER__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BLOCK__TYPE = IECRepositoryPackage.IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Accesses Property</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BLOCK__ACCESSES_PROPERTY = IECRepositoryPackage.IDENTIFIER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Has Method</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BLOCK__HAS_METHOD = IECRepositoryPackage.IDENTIFIER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Has Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BLOCK__HAS_PROPERTY = IECRepositoryPackage.IDENTIFIER_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Function Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BLOCK_FEATURE_COUNT = IECRepositoryPackage.IDENTIFIER_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Function Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BLOCK_OPERATION_COUNT = IECRepositoryPackage.IDENTIFIER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4iec.model.IECModel.impl.FunctionImpl <em>Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECModel.impl.FunctionImpl
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECModel.impl.IECModelPackageImpl#getFunction()
	 * @generated
	 */
	int FUNCTION = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__ID = IECRepositoryPackage.IDENTIFIER__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__NAME = IECRepositoryPackage.IDENTIFIER__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__TYPE = IECRepositoryPackage.IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_FEATURE_COUNT = IECRepositoryPackage.IDENTIFIER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_OPERATION_COUNT = IECRepositoryPackage.IDENTIFIER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4iec.model.IECModel.impl.ProgramImpl <em>Program</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECModel.impl.ProgramImpl
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECModel.impl.IECModelPackageImpl#getProgram()
	 * @generated
	 */
	int PROGRAM = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__ID = IECRepositoryPackage.IDENTIFIER__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__NAME = IECRepositoryPackage.IDENTIFIER__NAME;

	/**
	 * The feature id for the '<em><b>Calls Function</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__CALLS_FUNCTION = IECRepositoryPackage.IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Calls Function Block</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__CALLS_FUNCTION_BLOCK = IECRepositoryPackage.IDENTIFIER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__TYPE = IECRepositoryPackage.IDENTIFIER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Implements Interface</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__IMPLEMENTS_INTERFACE = IECRepositoryPackage.IDENTIFIER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Declares Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__DECLARES_VARIABLE = IECRepositoryPackage.IDENTIFIER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Uses Enum</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__USES_ENUM = IECRepositoryPackage.IDENTIFIER_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Accesses Property</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__ACCESSES_PROPERTY = IECRepositoryPackage.IDENTIFIER_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Calls Method</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__CALLS_METHOD = IECRepositoryPackage.IDENTIFIER_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_FEATURE_COUNT = IECRepositoryPackage.IDENTIFIER_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_OPERATION_COUNT = IECRepositoryPackage.IDENTIFIER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4iec.model.IECModel.impl.SPSSystemImpl <em>SPS System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECModel.impl.SPSSystemImpl
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECModel.impl.IECModelPackageImpl#getSPSSystem()
	 * @generated
	 */
	int SPS_SYSTEM = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPS_SYSTEM__ID = IECRepositoryPackage.IDENTIFIER__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPS_SYSTEM__NAME = IECRepositoryPackage.IDENTIFIER__NAME;

	/**
	 * The feature id for the '<em><b>Contains Program</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPS_SYSTEM__CONTAINS_PROGRAM = IECRepositoryPackage.IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Component Internal Dependencies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPS_SYSTEM__COMPONENT_INTERNAL_DEPENDENCIES = IECRepositoryPackage.IDENTIFIER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>SPS System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPS_SYSTEM_FEATURE_COUNT = IECRepositoryPackage.IDENTIFIER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>SPS System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPS_SYSTEM_OPERATION_COUNT = IECRepositoryPackage.IDENTIFIER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4iec.model.IECModel.impl.IECInterfaceImpl <em>IEC Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECModel.impl.IECInterfaceImpl
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECModel.impl.IECModelPackageImpl#getIECInterface()
	 * @generated
	 */
	int IEC_INTERFACE = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_INTERFACE__ID = IECRepositoryPackage.IDENTIFIER__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_INTERFACE__NAME = IECRepositoryPackage.IDENTIFIER__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_INTERFACE__TYPE = IECRepositoryPackage.IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>IEC Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_INTERFACE_FEATURE_COUNT = IECRepositoryPackage.IDENTIFIER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>IEC Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_INTERFACE_OPERATION_COUNT = IECRepositoryPackage.IDENTIFIER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4iec.model.IECModel.impl.GlobalVariableImpl <em>Global Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECModel.impl.GlobalVariableImpl
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECModel.impl.IECModelPackageImpl#getGlobalVariable()
	 * @generated
	 */
	int GLOBAL_VARIABLE = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_VARIABLE__ID = IECRepositoryPackage.IDENTIFIER__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_VARIABLE__NAME = IECRepositoryPackage.IDENTIFIER__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_VARIABLE__TYPE = IECRepositoryPackage.IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Global Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_VARIABLE_FEATURE_COUNT = IECRepositoryPackage.IDENTIFIER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Global Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_VARIABLE_OPERATION_COUNT = IECRepositoryPackage.IDENTIFIER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4iec.model.IECModel.impl.IECMethodImplementationImpl <em>IEC Method Implementation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECModel.impl.IECMethodImplementationImpl
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECModel.impl.IECModelPackageImpl#getIECMethodImplementation()
	 * @generated
	 */
	int IEC_METHOD_IMPLEMENTATION = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_METHOD_IMPLEMENTATION__ID = IECRepositoryPackage.IDENTIFIER__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_METHOD_IMPLEMENTATION__NAME = IECRepositoryPackage.IDENTIFIER__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_METHOD_IMPLEMENTATION__TYPE = IECRepositoryPackage.IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Accesses Global Variable</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_METHOD_IMPLEMENTATION__ACCESSES_GLOBAL_VARIABLE = IECRepositoryPackage.IDENTIFIER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Accesses Property</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_METHOD_IMPLEMENTATION__ACCESSES_PROPERTY = IECRepositoryPackage.IDENTIFIER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>IEC Method Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_METHOD_IMPLEMENTATION_FEATURE_COUNT = IECRepositoryPackage.IDENTIFIER_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>IEC Method Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_METHOD_IMPLEMENTATION_OPERATION_COUNT = IECRepositoryPackage.IDENTIFIER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4iec.model.IECModel.impl.IECPropertyImplementationImpl <em>IEC Property Implementation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECModel.impl.IECPropertyImplementationImpl
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECModel.impl.IECModelPackageImpl#getIECPropertyImplementation()
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
	int IEC_PROPERTY_IMPLEMENTATION__ID = IECRepositoryPackage.IDENTIFIER__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_PROPERTY_IMPLEMENTATION__NAME = IECRepositoryPackage.IDENTIFIER__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_PROPERTY_IMPLEMENTATION__TYPE = IECRepositoryPackage.IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>IEC Property Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_PROPERTY_IMPLEMENTATION_FEATURE_COUNT = IECRepositoryPackage.IDENTIFIER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>IEC Property Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_PROPERTY_IMPLEMENTATION_OPERATION_COUNT = IECRepositoryPackage.IDENTIFIER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4iec.model.IECModel.impl.EnumImpl <em>Enum</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECModel.impl.EnumImpl
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECModel.impl.IECModelPackageImpl#getEnum()
	 * @generated
	 */
	int ENUM = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Enum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Enum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4iec.model.IECModel.FunctionBlock <em>Function Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Block</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECModel.FunctionBlock
	 * @generated
	 */
	EClass getFunctionBlock();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.kamp4iec.model.IECModel.FunctionBlock#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECModel.FunctionBlock#getType()
	 * @see #getFunctionBlock()
	 * @generated
	 */
	EReference getFunctionBlock_Type();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.ipd.sdq.kamp4iec.model.IECModel.FunctionBlock#getAccessesProperty <em>Accesses Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Accesses Property</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECModel.FunctionBlock#getAccessesProperty()
	 * @see #getFunctionBlock()
	 * @generated
	 */
	EReference getFunctionBlock_AccessesProperty();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4iec.model.IECModel.FunctionBlock#getHasMethod <em>Has Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Method</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECModel.FunctionBlock#getHasMethod()
	 * @see #getFunctionBlock()
	 * @generated
	 */
	EReference getFunctionBlock_HasMethod();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4iec.model.IECModel.FunctionBlock#getHasProperty <em>Has Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Property</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECModel.FunctionBlock#getHasProperty()
	 * @see #getFunctionBlock()
	 * @generated
	 */
	EReference getFunctionBlock_HasProperty();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4iec.model.IECModel.Function <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECModel.Function
	 * @generated
	 */
	EClass getFunction();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.kamp4iec.model.IECModel.Function#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECModel.Function#getType()
	 * @see #getFunction()
	 * @generated
	 */
	EReference getFunction_Type();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4iec.model.IECModel.Program <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Program</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECModel.Program
	 * @generated
	 */
	EClass getProgram();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4iec.model.IECModel.Program#getCallsFunction <em>Calls Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Calls Function</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECModel.Program#getCallsFunction()
	 * @see #getProgram()
	 * @generated
	 */
	EReference getProgram_CallsFunction();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4iec.model.IECModel.Program#getCallsFunctionBlock <em>Calls Function Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Calls Function Block</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECModel.Program#getCallsFunctionBlock()
	 * @see #getProgram()
	 * @generated
	 */
	EReference getProgram_CallsFunctionBlock();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.kamp4iec.model.IECModel.Program#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECModel.Program#getType()
	 * @see #getProgram()
	 * @generated
	 */
	EReference getProgram_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4iec.model.IECModel.Program#getImplementsInterface <em>Implements Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Implements Interface</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECModel.Program#getImplementsInterface()
	 * @see #getProgram()
	 * @generated
	 */
	EReference getProgram_ImplementsInterface();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4iec.model.IECModel.Program#getDeclaresVariable <em>Declares Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Declares Variable</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECModel.Program#getDeclaresVariable()
	 * @see #getProgram()
	 * @generated
	 */
	EReference getProgram_DeclaresVariable();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4iec.model.IECModel.Program#getUsesEnum <em>Uses Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Uses Enum</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECModel.Program#getUsesEnum()
	 * @see #getProgram()
	 * @generated
	 */
	EReference getProgram_UsesEnum();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.ipd.sdq.kamp4iec.model.IECModel.Program#getAccessesProperty <em>Accesses Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Accesses Property</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECModel.Program#getAccessesProperty()
	 * @see #getProgram()
	 * @generated
	 */
	EReference getProgram_AccessesProperty();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.ipd.sdq.kamp4iec.model.IECModel.Program#getCallsMethod <em>Calls Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Calls Method</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECModel.Program#getCallsMethod()
	 * @see #getProgram()
	 * @generated
	 */
	EReference getProgram_CallsMethod();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4iec.model.IECModel.SPSSystem <em>SPS System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SPS System</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECModel.SPSSystem
	 * @generated
	 */
	EClass getSPSSystem();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4iec.model.IECModel.SPSSystem#getContainsProgram <em>Contains Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains Program</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECModel.SPSSystem#getContainsProgram()
	 * @see #getSPSSystem()
	 * @generated
	 */
	EReference getSPSSystem_ContainsProgram();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.ipd.sdq.kamp4iec.model.IECModel.SPSSystem#getComponentInternalDependencies <em>Component Internal Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Component Internal Dependencies</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECModel.SPSSystem#getComponentInternalDependencies()
	 * @see #getSPSSystem()
	 * @generated
	 */
	EReference getSPSSystem_ComponentInternalDependencies();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4iec.model.IECModel.IECInterface <em>IEC Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IEC Interface</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECModel.IECInterface
	 * @generated
	 */
	EClass getIECInterface();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.kamp4iec.model.IECModel.IECInterface#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECModel.IECInterface#getType()
	 * @see #getIECInterface()
	 * @generated
	 */
	EReference getIECInterface_Type();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4iec.model.IECModel.GlobalVariable <em>Global Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Global Variable</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECModel.GlobalVariable
	 * @generated
	 */
	EClass getGlobalVariable();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.kamp4iec.model.IECModel.GlobalVariable#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECModel.GlobalVariable#getType()
	 * @see #getGlobalVariable()
	 * @generated
	 */
	EReference getGlobalVariable_Type();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4iec.model.IECModel.IECMethodImplementation <em>IEC Method Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IEC Method Implementation</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECModel.IECMethodImplementation
	 * @generated
	 */
	EClass getIECMethodImplementation();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.kamp4iec.model.IECModel.IECMethodImplementation#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECModel.IECMethodImplementation#getType()
	 * @see #getIECMethodImplementation()
	 * @generated
	 */
	EReference getIECMethodImplementation_Type();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.ipd.sdq.kamp4iec.model.IECModel.IECMethodImplementation#getAccessesGlobalVariable <em>Accesses Global Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Accesses Global Variable</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECModel.IECMethodImplementation#getAccessesGlobalVariable()
	 * @see #getIECMethodImplementation()
	 * @generated
	 */
	EReference getIECMethodImplementation_AccessesGlobalVariable();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.ipd.sdq.kamp4iec.model.IECModel.IECMethodImplementation#getAccessesProperty <em>Accesses Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Accesses Property</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECModel.IECMethodImplementation#getAccessesProperty()
	 * @see #getIECMethodImplementation()
	 * @generated
	 */
	EReference getIECMethodImplementation_AccessesProperty();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4iec.model.IECModel.IECPropertyImplementation <em>IEC Property Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IEC Property Implementation</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECModel.IECPropertyImplementation
	 * @generated
	 */
	EClass getIECPropertyImplementation();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.kamp4iec.model.IECModel.IECPropertyImplementation#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECModel.IECPropertyImplementation#getType()
	 * @see #getIECPropertyImplementation()
	 * @generated
	 */
	EReference getIECPropertyImplementation_Type();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4iec.model.IECModel.Enum <em>Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enum</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECModel.Enum
	 * @generated
	 */
	EClass getEnum();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.kamp4iec.model.IECModel.Enum#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECModel.Enum#getName()
	 * @see #getEnum()
	 * @generated
	 */
	EAttribute getEnum_Name();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.kamp4iec.model.IECModel.Enum#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECModel.Enum#getType()
	 * @see #getEnum()
	 * @generated
	 */
	EReference getEnum_Type();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	IECModelFactory getIECModelFactory();

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
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4iec.model.IECModel.impl.FunctionBlockImpl <em>Function Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4iec.model.IECModel.impl.FunctionBlockImpl
		 * @see edu.kit.ipd.sdq.kamp4iec.model.IECModel.impl.IECModelPackageImpl#getFunctionBlock()
		 * @generated
		 */
		EClass FUNCTION_BLOCK = eINSTANCE.getFunctionBlock();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_BLOCK__TYPE = eINSTANCE.getFunctionBlock_Type();

		/**
		 * The meta object literal for the '<em><b>Accesses Property</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_BLOCK__ACCESSES_PROPERTY = eINSTANCE.getFunctionBlock_AccessesProperty();

		/**
		 * The meta object literal for the '<em><b>Has Method</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_BLOCK__HAS_METHOD = eINSTANCE.getFunctionBlock_HasMethod();

		/**
		 * The meta object literal for the '<em><b>Has Property</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_BLOCK__HAS_PROPERTY = eINSTANCE.getFunctionBlock_HasProperty();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4iec.model.IECModel.impl.FunctionImpl <em>Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4iec.model.IECModel.impl.FunctionImpl
		 * @see edu.kit.ipd.sdq.kamp4iec.model.IECModel.impl.IECModelPackageImpl#getFunction()
		 * @generated
		 */
		EClass FUNCTION = eINSTANCE.getFunction();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION__TYPE = eINSTANCE.getFunction_Type();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4iec.model.IECModel.impl.ProgramImpl <em>Program</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4iec.model.IECModel.impl.ProgramImpl
		 * @see edu.kit.ipd.sdq.kamp4iec.model.IECModel.impl.IECModelPackageImpl#getProgram()
		 * @generated
		 */
		EClass PROGRAM = eINSTANCE.getProgram();

		/**
		 * The meta object literal for the '<em><b>Calls Function</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM__CALLS_FUNCTION = eINSTANCE.getProgram_CallsFunction();

		/**
		 * The meta object literal for the '<em><b>Calls Function Block</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM__CALLS_FUNCTION_BLOCK = eINSTANCE.getProgram_CallsFunctionBlock();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM__TYPE = eINSTANCE.getProgram_Type();

		/**
		 * The meta object literal for the '<em><b>Implements Interface</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM__IMPLEMENTS_INTERFACE = eINSTANCE.getProgram_ImplementsInterface();

		/**
		 * The meta object literal for the '<em><b>Declares Variable</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM__DECLARES_VARIABLE = eINSTANCE.getProgram_DeclaresVariable();

		/**
		 * The meta object literal for the '<em><b>Uses Enum</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM__USES_ENUM = eINSTANCE.getProgram_UsesEnum();

		/**
		 * The meta object literal for the '<em><b>Accesses Property</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM__ACCESSES_PROPERTY = eINSTANCE.getProgram_AccessesProperty();

		/**
		 * The meta object literal for the '<em><b>Calls Method</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM__CALLS_METHOD = eINSTANCE.getProgram_CallsMethod();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4iec.model.IECModel.impl.SPSSystemImpl <em>SPS System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4iec.model.IECModel.impl.SPSSystemImpl
		 * @see edu.kit.ipd.sdq.kamp4iec.model.IECModel.impl.IECModelPackageImpl#getSPSSystem()
		 * @generated
		 */
		EClass SPS_SYSTEM = eINSTANCE.getSPSSystem();

		/**
		 * The meta object literal for the '<em><b>Contains Program</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPS_SYSTEM__CONTAINS_PROGRAM = eINSTANCE.getSPSSystem_ContainsProgram();

		/**
		 * The meta object literal for the '<em><b>Component Internal Dependencies</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPS_SYSTEM__COMPONENT_INTERNAL_DEPENDENCIES = eINSTANCE.getSPSSystem_ComponentInternalDependencies();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4iec.model.IECModel.impl.IECInterfaceImpl <em>IEC Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4iec.model.IECModel.impl.IECInterfaceImpl
		 * @see edu.kit.ipd.sdq.kamp4iec.model.IECModel.impl.IECModelPackageImpl#getIECInterface()
		 * @generated
		 */
		EClass IEC_INTERFACE = eINSTANCE.getIECInterface();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IEC_INTERFACE__TYPE = eINSTANCE.getIECInterface_Type();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4iec.model.IECModel.impl.GlobalVariableImpl <em>Global Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4iec.model.IECModel.impl.GlobalVariableImpl
		 * @see edu.kit.ipd.sdq.kamp4iec.model.IECModel.impl.IECModelPackageImpl#getGlobalVariable()
		 * @generated
		 */
		EClass GLOBAL_VARIABLE = eINSTANCE.getGlobalVariable();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GLOBAL_VARIABLE__TYPE = eINSTANCE.getGlobalVariable_Type();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4iec.model.IECModel.impl.IECMethodImplementationImpl <em>IEC Method Implementation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4iec.model.IECModel.impl.IECMethodImplementationImpl
		 * @see edu.kit.ipd.sdq.kamp4iec.model.IECModel.impl.IECModelPackageImpl#getIECMethodImplementation()
		 * @generated
		 */
		EClass IEC_METHOD_IMPLEMENTATION = eINSTANCE.getIECMethodImplementation();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IEC_METHOD_IMPLEMENTATION__TYPE = eINSTANCE.getIECMethodImplementation_Type();

		/**
		 * The meta object literal for the '<em><b>Accesses Global Variable</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IEC_METHOD_IMPLEMENTATION__ACCESSES_GLOBAL_VARIABLE = eINSTANCE.getIECMethodImplementation_AccessesGlobalVariable();

		/**
		 * The meta object literal for the '<em><b>Accesses Property</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IEC_METHOD_IMPLEMENTATION__ACCESSES_PROPERTY = eINSTANCE.getIECMethodImplementation_AccessesProperty();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4iec.model.IECModel.impl.IECPropertyImplementationImpl <em>IEC Property Implementation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4iec.model.IECModel.impl.IECPropertyImplementationImpl
		 * @see edu.kit.ipd.sdq.kamp4iec.model.IECModel.impl.IECModelPackageImpl#getIECPropertyImplementation()
		 * @generated
		 */
		EClass IEC_PROPERTY_IMPLEMENTATION = eINSTANCE.getIECPropertyImplementation();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IEC_PROPERTY_IMPLEMENTATION__TYPE = eINSTANCE.getIECPropertyImplementation_Type();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4iec.model.IECModel.impl.EnumImpl <em>Enum</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4iec.model.IECModel.impl.EnumImpl
		 * @see edu.kit.ipd.sdq.kamp4iec.model.IECModel.impl.IECModelPackageImpl#getEnum()
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
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUM__TYPE = eINSTANCE.getEnum_Type();

	}

} //IECModelPackage
