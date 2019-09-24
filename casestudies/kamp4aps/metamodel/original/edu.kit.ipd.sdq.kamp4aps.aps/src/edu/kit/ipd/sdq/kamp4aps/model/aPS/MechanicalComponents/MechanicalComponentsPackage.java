/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.aPS.MechanicalComponents;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.ComponentRepositoryPackage;

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
 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.MechanicalComponents.MechanicalComponentsFactory
 * @model kind="package"
 * @generated
 */
public interface MechanicalComponentsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "MechanicalComponents";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "edu.kit.ipd.sdq.kaps.xppu.mechanicalcomponents";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "MechanicalComponents";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MechanicalComponentsPackage eINSTANCE = edu.kit.ipd.sdq.kamp4aps.model.aPS.MechanicalComponents.impl.MechanicalComponentsPackageImpl.init();

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.MechanicalComponents.impl.MechanicalPartImpl <em>Mechanical Part</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.MechanicalComponents.impl.MechanicalPartImpl
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.MechanicalComponents.impl.MechanicalComponentsPackageImpl#getMechanicalPart()
	 * @generated
	 */
	int MECHANICAL_PART = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MECHANICAL_PART__ID = ComponentRepositoryPackage.COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MECHANICAL_PART__NAME = ComponentRepositoryPackage.COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Connected Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MECHANICAL_PART__CONNECTED_INTERFACES = ComponentRepositoryPackage.COMPONENT__CONNECTED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MECHANICAL_PART__PARENT = ComponentRepositoryPackage.COMPONENT__PARENT;

	/**
	 * The feature id for the '<em><b>Parent Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MECHANICAL_PART__PARENT_MODULE = ComponentRepositoryPackage.COMPONENT__PARENT_MODULE;

	/**
	 * The feature id for the '<em><b>Screwing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MECHANICAL_PART__SCREWING = ComponentRepositoryPackage.COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Mechanical Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MECHANICAL_PART_FEATURE_COUNT = ComponentRepositoryPackage.COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Mechanical Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MECHANICAL_PART_OPERATION_COUNT = ComponentRepositoryPackage.COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.MechanicalComponents.impl.PushheadImpl <em>Pushhead</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.MechanicalComponents.impl.PushheadImpl
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.MechanicalComponents.impl.MechanicalComponentsPackageImpl#getPushhead()
	 * @generated
	 */
	int PUSHHEAD = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSHHEAD__ID = MECHANICAL_PART__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSHHEAD__NAME = MECHANICAL_PART__NAME;

	/**
	 * The feature id for the '<em><b>Connected Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSHHEAD__CONNECTED_INTERFACES = MECHANICAL_PART__CONNECTED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSHHEAD__PARENT = MECHANICAL_PART__PARENT;

	/**
	 * The feature id for the '<em><b>Parent Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSHHEAD__PARENT_MODULE = MECHANICAL_PART__PARENT_MODULE;

	/**
	 * The feature id for the '<em><b>Screwing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSHHEAD__SCREWING = MECHANICAL_PART__SCREWING;

	/**
	 * The number of structural features of the '<em>Pushhead</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSHHEAD_FEATURE_COUNT = MECHANICAL_PART_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Pushhead</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSHHEAD_OPERATION_COUNT = MECHANICAL_PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.MechanicalComponents.impl.HousingImpl <em>Housing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.MechanicalComponents.impl.HousingImpl
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.MechanicalComponents.impl.MechanicalComponentsPackageImpl#getHousing()
	 * @generated
	 */
	int HOUSING = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSING__ID = MECHANICAL_PART__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSING__NAME = MECHANICAL_PART__NAME;

	/**
	 * The feature id for the '<em><b>Connected Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSING__CONNECTED_INTERFACES = MECHANICAL_PART__CONNECTED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSING__PARENT = MECHANICAL_PART__PARENT;

	/**
	 * The feature id for the '<em><b>Parent Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSING__PARENT_MODULE = MECHANICAL_PART__PARENT_MODULE;

	/**
	 * The feature id for the '<em><b>Screwing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSING__SCREWING = MECHANICAL_PART__SCREWING;

	/**
	 * The number of structural features of the '<em>Housing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSING_FEATURE_COUNT = MECHANICAL_PART_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Housing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSING_OPERATION_COUNT = MECHANICAL_PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.MechanicalComponents.impl.ReturnSpringImpl <em>Return Spring</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.MechanicalComponents.impl.ReturnSpringImpl
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.MechanicalComponents.impl.MechanicalComponentsPackageImpl#getReturnSpring()
	 * @generated
	 */
	int RETURN_SPRING = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_SPRING__ID = MECHANICAL_PART__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_SPRING__NAME = MECHANICAL_PART__NAME;

	/**
	 * The feature id for the '<em><b>Connected Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_SPRING__CONNECTED_INTERFACES = MECHANICAL_PART__CONNECTED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_SPRING__PARENT = MECHANICAL_PART__PARENT;

	/**
	 * The feature id for the '<em><b>Parent Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_SPRING__PARENT_MODULE = MECHANICAL_PART__PARENT_MODULE;

	/**
	 * The feature id for the '<em><b>Screwing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_SPRING__SCREWING = MECHANICAL_PART__SCREWING;

	/**
	 * The number of structural features of the '<em>Return Spring</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_SPRING_FEATURE_COUNT = MECHANICAL_PART_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Return Spring</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_SPRING_OPERATION_COUNT = MECHANICAL_PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.MechanicalComponents.impl.RubberBandImpl <em>Rubber Band</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.MechanicalComponents.impl.RubberBandImpl
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.MechanicalComponents.impl.MechanicalComponentsPackageImpl#getRubberBand()
	 * @generated
	 */
	int RUBBER_BAND = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUBBER_BAND__ID = MECHANICAL_PART__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUBBER_BAND__NAME = MECHANICAL_PART__NAME;

	/**
	 * The feature id for the '<em><b>Connected Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUBBER_BAND__CONNECTED_INTERFACES = MECHANICAL_PART__CONNECTED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUBBER_BAND__PARENT = MECHANICAL_PART__PARENT;

	/**
	 * The feature id for the '<em><b>Parent Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUBBER_BAND__PARENT_MODULE = MECHANICAL_PART__PARENT_MODULE;

	/**
	 * The feature id for the '<em><b>Screwing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUBBER_BAND__SCREWING = MECHANICAL_PART__SCREWING;

	/**
	 * The number of structural features of the '<em>Rubber Band</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUBBER_BAND_FEATURE_COUNT = MECHANICAL_PART_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Rubber Band</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUBBER_BAND_OPERATION_COUNT = MECHANICAL_PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.MechanicalComponents.impl.GripperPartImpl <em>Gripper Part</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.MechanicalComponents.impl.GripperPartImpl
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.MechanicalComponents.impl.MechanicalComponentsPackageImpl#getGripperPart()
	 * @generated
	 */
	int GRIPPER_PART = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRIPPER_PART__ID = ComponentRepositoryPackage.MECHANICAL_ASSEMBLY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRIPPER_PART__NAME = ComponentRepositoryPackage.MECHANICAL_ASSEMBLY__NAME;

	/**
	 * The feature id for the '<em><b>Connected Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRIPPER_PART__CONNECTED_INTERFACES = ComponentRepositoryPackage.MECHANICAL_ASSEMBLY__CONNECTED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRIPPER_PART__PARENT = ComponentRepositoryPackage.MECHANICAL_ASSEMBLY__PARENT;

	/**
	 * The feature id for the '<em><b>Parent Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRIPPER_PART__PARENT_MODULE = ComponentRepositoryPackage.MECHANICAL_ASSEMBLY__PARENT_MODULE;

	/**
	 * The number of structural features of the '<em>Gripper Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRIPPER_PART_FEATURE_COUNT = ComponentRepositoryPackage.MECHANICAL_ASSEMBLY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Gripper Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRIPPER_PART_OPERATION_COUNT = ComponentRepositoryPackage.MECHANICAL_ASSEMBLY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.MechanicalComponents.impl.ArmImpl <em>Arm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.MechanicalComponents.impl.ArmImpl
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.MechanicalComponents.impl.MechanicalComponentsPackageImpl#getArm()
	 * @generated
	 */
	int ARM = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARM__ID = ComponentRepositoryPackage.MECHANICAL_ASSEMBLY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARM__NAME = ComponentRepositoryPackage.MECHANICAL_ASSEMBLY__NAME;

	/**
	 * The feature id for the '<em><b>Connected Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARM__CONNECTED_INTERFACES = ComponentRepositoryPackage.MECHANICAL_ASSEMBLY__CONNECTED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARM__PARENT = ComponentRepositoryPackage.MECHANICAL_ASSEMBLY__PARENT;

	/**
	 * The feature id for the '<em><b>Parent Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARM__PARENT_MODULE = ComponentRepositoryPackage.MECHANICAL_ASSEMBLY__PARENT_MODULE;

	/**
	 * The feature id for the '<em><b>Mounted To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARM__MOUNTED_TO = ComponentRepositoryPackage.MECHANICAL_ASSEMBLY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Arm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARM_FEATURE_COUNT = ComponentRepositoryPackage.MECHANICAL_ASSEMBLY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Arm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARM_OPERATION_COUNT = ComponentRepositoryPackage.MECHANICAL_ASSEMBLY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.MechanicalComponents.impl.RampImpl <em>Ramp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.MechanicalComponents.impl.RampImpl
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.MechanicalComponents.impl.MechanicalComponentsPackageImpl#getRamp()
	 * @generated
	 */
	int RAMP = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAMP__ID = ComponentRepositoryPackage.MECHANICAL_ASSEMBLY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAMP__NAME = ComponentRepositoryPackage.MECHANICAL_ASSEMBLY__NAME;

	/**
	 * The feature id for the '<em><b>Connected Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAMP__CONNECTED_INTERFACES = ComponentRepositoryPackage.MECHANICAL_ASSEMBLY__CONNECTED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAMP__PARENT = ComponentRepositoryPackage.MECHANICAL_ASSEMBLY__PARENT;

	/**
	 * The feature id for the '<em><b>Parent Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAMP__PARENT_MODULE = ComponentRepositoryPackage.MECHANICAL_ASSEMBLY__PARENT_MODULE;

	/**
	 * The feature id for the '<em><b>Screwing base</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAMP__SCREWING_BASE = ComponentRepositoryPackage.MECHANICAL_ASSEMBLY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Screwing component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAMP__SCREWING_COMPONENT = ComponentRepositoryPackage.MECHANICAL_ASSEMBLY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Physicalconnection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAMP__PHYSICALCONNECTION = ComponentRepositoryPackage.MECHANICAL_ASSEMBLY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Ramp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAMP_FEATURE_COUNT = ComponentRepositoryPackage.MECHANICAL_ASSEMBLY_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Ramp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAMP_OPERATION_COUNT = ComponentRepositoryPackage.MECHANICAL_ASSEMBLY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.MechanicalComponents.impl.TableImpl <em>Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.MechanicalComponents.impl.TableImpl
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.MechanicalComponents.impl.MechanicalComponentsPackageImpl#getTable()
	 * @generated
	 */
	int TABLE = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__ID = ComponentRepositoryPackage.MECHANICAL_ASSEMBLY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__NAME = ComponentRepositoryPackage.MECHANICAL_ASSEMBLY__NAME;

	/**
	 * The feature id for the '<em><b>Connected Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__CONNECTED_INTERFACES = ComponentRepositoryPackage.MECHANICAL_ASSEMBLY__CONNECTED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__PARENT = ComponentRepositoryPackage.MECHANICAL_ASSEMBLY__PARENT;

	/**
	 * The feature id for the '<em><b>Parent Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__PARENT_MODULE = ComponentRepositoryPackage.MECHANICAL_ASSEMBLY__PARENT_MODULE;

	/**
	 * The number of structural features of the '<em>Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_FEATURE_COUNT = ComponentRepositoryPackage.MECHANICAL_ASSEMBLY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_OPERATION_COUNT = ComponentRepositoryPackage.MECHANICAL_ASSEMBLY_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.MechanicalComponents.MechanicalPart <em>Mechanical Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mechanical Part</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.MechanicalComponents.MechanicalPart
	 * @generated
	 */
	EClass getMechanicalPart();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.MechanicalComponents.MechanicalPart#getScrewing <em>Screwing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Screwing</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.MechanicalComponents.MechanicalPart#getScrewing()
	 * @see #getMechanicalPart()
	 * @generated
	 */
	EReference getMechanicalPart_Screwing();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.MechanicalComponents.Pushhead <em>Pushhead</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pushhead</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.MechanicalComponents.Pushhead
	 * @generated
	 */
	EClass getPushhead();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.MechanicalComponents.Housing <em>Housing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Housing</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.MechanicalComponents.Housing
	 * @generated
	 */
	EClass getHousing();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.MechanicalComponents.ReturnSpring <em>Return Spring</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Return Spring</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.MechanicalComponents.ReturnSpring
	 * @generated
	 */
	EClass getReturnSpring();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.MechanicalComponents.RubberBand <em>Rubber Band</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rubber Band</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.MechanicalComponents.RubberBand
	 * @generated
	 */
	EClass getRubberBand();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.MechanicalComponents.GripperPart <em>Gripper Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gripper Part</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.MechanicalComponents.GripperPart
	 * @generated
	 */
	EClass getGripperPart();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.MechanicalComponents.Arm <em>Arm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arm</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.MechanicalComponents.Arm
	 * @generated
	 */
	EClass getArm();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.MechanicalComponents.Arm#getMountedTo <em>Mounted To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Mounted To</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.MechanicalComponents.Arm#getMountedTo()
	 * @see #getArm()
	 * @generated
	 */
	EReference getArm_MountedTo();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.MechanicalComponents.Ramp <em>Ramp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ramp</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.MechanicalComponents.Ramp
	 * @generated
	 */
	EClass getRamp();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.MechanicalComponents.Ramp#getScrewing_base <em>Screwing base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Screwing base</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.MechanicalComponents.Ramp#getScrewing_base()
	 * @see #getRamp()
	 * @generated
	 */
	EReference getRamp_Screwing_base();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.MechanicalComponents.Ramp#getScrewing_component <em>Screwing component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Screwing component</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.MechanicalComponents.Ramp#getScrewing_component()
	 * @see #getRamp()
	 * @generated
	 */
	EReference getRamp_Screwing_component();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.MechanicalComponents.Ramp#getPhysicalconnection <em>Physicalconnection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Physicalconnection</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.MechanicalComponents.Ramp#getPhysicalconnection()
	 * @see #getRamp()
	 * @generated
	 */
	EReference getRamp_Physicalconnection();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.MechanicalComponents.Table <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.MechanicalComponents.Table
	 * @generated
	 */
	EClass getTable();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MechanicalComponentsFactory getMechanicalComponentsFactory();

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
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.MechanicalComponents.impl.MechanicalPartImpl <em>Mechanical Part</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.MechanicalComponents.impl.MechanicalPartImpl
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.MechanicalComponents.impl.MechanicalComponentsPackageImpl#getMechanicalPart()
		 * @generated
		 */
		EClass MECHANICAL_PART = eINSTANCE.getMechanicalPart();

		/**
		 * The meta object literal for the '<em><b>Screwing</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MECHANICAL_PART__SCREWING = eINSTANCE.getMechanicalPart_Screwing();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.MechanicalComponents.impl.PushheadImpl <em>Pushhead</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.MechanicalComponents.impl.PushheadImpl
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.MechanicalComponents.impl.MechanicalComponentsPackageImpl#getPushhead()
		 * @generated
		 */
		EClass PUSHHEAD = eINSTANCE.getPushhead();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.MechanicalComponents.impl.HousingImpl <em>Housing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.MechanicalComponents.impl.HousingImpl
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.MechanicalComponents.impl.MechanicalComponentsPackageImpl#getHousing()
		 * @generated
		 */
		EClass HOUSING = eINSTANCE.getHousing();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.MechanicalComponents.impl.ReturnSpringImpl <em>Return Spring</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.MechanicalComponents.impl.ReturnSpringImpl
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.MechanicalComponents.impl.MechanicalComponentsPackageImpl#getReturnSpring()
		 * @generated
		 */
		EClass RETURN_SPRING = eINSTANCE.getReturnSpring();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.MechanicalComponents.impl.RubberBandImpl <em>Rubber Band</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.MechanicalComponents.impl.RubberBandImpl
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.MechanicalComponents.impl.MechanicalComponentsPackageImpl#getRubberBand()
		 * @generated
		 */
		EClass RUBBER_BAND = eINSTANCE.getRubberBand();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.MechanicalComponents.impl.GripperPartImpl <em>Gripper Part</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.MechanicalComponents.impl.GripperPartImpl
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.MechanicalComponents.impl.MechanicalComponentsPackageImpl#getGripperPart()
		 * @generated
		 */
		EClass GRIPPER_PART = eINSTANCE.getGripperPart();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.MechanicalComponents.impl.ArmImpl <em>Arm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.MechanicalComponents.impl.ArmImpl
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.MechanicalComponents.impl.MechanicalComponentsPackageImpl#getArm()
		 * @generated
		 */
		EClass ARM = eINSTANCE.getArm();

		/**
		 * The meta object literal for the '<em><b>Mounted To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARM__MOUNTED_TO = eINSTANCE.getArm_MountedTo();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.MechanicalComponents.impl.RampImpl <em>Ramp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.MechanicalComponents.impl.RampImpl
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.MechanicalComponents.impl.MechanicalComponentsPackageImpl#getRamp()
		 * @generated
		 */
		EClass RAMP = eINSTANCE.getRamp();

		/**
		 * The meta object literal for the '<em><b>Screwing base</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RAMP__SCREWING_BASE = eINSTANCE.getRamp_Screwing_base();

		/**
		 * The meta object literal for the '<em><b>Screwing component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RAMP__SCREWING_COMPONENT = eINSTANCE.getRamp_Screwing_component();

		/**
		 * The meta object literal for the '<em><b>Physicalconnection</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RAMP__PHYSICALCONNECTION = eINSTANCE.getRamp_Physicalconnection();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.MechanicalComponents.impl.TableImpl <em>Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.MechanicalComponents.impl.TableImpl
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.MechanicalComponents.impl.MechanicalComponentsPackageImpl#getTable()
		 * @generated
		 */
		EClass TABLE = eINSTANCE.getTable();

	}

} //MechanicalComponentsPackage
