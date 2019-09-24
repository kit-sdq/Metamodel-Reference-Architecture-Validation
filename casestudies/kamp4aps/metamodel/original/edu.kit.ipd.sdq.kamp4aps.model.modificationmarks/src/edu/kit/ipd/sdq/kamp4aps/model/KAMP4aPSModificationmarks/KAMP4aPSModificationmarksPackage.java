/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks;

import edu.kit.ipd.sdq.kamp.model.modificationmarks.ModificationmarksPackage;

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
 * @see edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.KAMP4aPSModificationmarksFactory
 * @model kind="package"
 * @generated
 */
public interface KAMP4aPSModificationmarksPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "KAMP4aPSModificationmarks";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://sdq.ipd.kit.edu/KAMP4aPSModificationmarks/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "KAMP4aPSModificationmarks";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	KAMP4aPSModificationmarksPackage eINSTANCE = edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.impl.KAMP4aPSModificationmarksPackageImpl.init();

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.impl.AbstractKAMP4aPSModificationRepositoryImpl <em>Abstract KAMP 4a PS Modification Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.impl.AbstractKAMP4aPSModificationRepositoryImpl
	 * @see edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.impl.KAMP4aPSModificationmarksPackageImpl#getAbstractKAMP4aPSModificationRepository()
	 * @generated
	 */
	int ABSTRACT_KAMP_4A_PS_MODIFICATION_REPOSITORY = 0;

	/**
	 * The feature id for the '<em><b>Seed Modifications</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_KAMP_4A_PS_MODIFICATION_REPOSITORY__SEED_MODIFICATIONS = ModificationmarksPackage.ABSTRACT_MODIFICATION_REPOSITORY__SEED_MODIFICATIONS;

	/**
	 * The feature id for the '<em><b>Change Propagation Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_KAMP_4A_PS_MODIFICATION_REPOSITORY__CHANGE_PROPAGATION_STEPS = ModificationmarksPackage.ABSTRACT_MODIFICATION_REPOSITORY__CHANGE_PROPAGATION_STEPS;

	/**
	 * The number of structural features of the '<em>Abstract KAMP 4a PS Modification Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_KAMP_4A_PS_MODIFICATION_REPOSITORY_FEATURE_COUNT = ModificationmarksPackage.ABSTRACT_MODIFICATION_REPOSITORY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Abstract KAMP 4a PS Modification Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_KAMP_4A_PS_MODIFICATION_REPOSITORY_OPERATION_COUNT = ModificationmarksPackage.ABSTRACT_MODIFICATION_REPOSITORY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.impl.KAMP4aPSModificationRepositoryImpl <em>KAMP 4a PS Modification Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.impl.KAMP4aPSModificationRepositoryImpl
	 * @see edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.impl.KAMP4aPSModificationmarksPackageImpl#getKAMP4aPSModificationRepository()
	 * @generated
	 */
	int KAMP_4A_PS_MODIFICATION_REPOSITORY = 1;

	/**
	 * The feature id for the '<em><b>Seed Modifications</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAMP_4A_PS_MODIFICATION_REPOSITORY__SEED_MODIFICATIONS = ABSTRACT_KAMP_4A_PS_MODIFICATION_REPOSITORY__SEED_MODIFICATIONS;

	/**
	 * The feature id for the '<em><b>Change Propagation Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAMP_4A_PS_MODIFICATION_REPOSITORY__CHANGE_PROPAGATION_STEPS = ABSTRACT_KAMP_4A_PS_MODIFICATION_REPOSITORY__CHANGE_PROPAGATION_STEPS;

	/**
	 * The number of structural features of the '<em>KAMP 4a PS Modification Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAMP_4A_PS_MODIFICATION_REPOSITORY_FEATURE_COUNT = ABSTRACT_KAMP_4A_PS_MODIFICATION_REPOSITORY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>KAMP 4a PS Modification Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAMP_4A_PS_MODIFICATION_REPOSITORY_OPERATION_COUNT = ABSTRACT_KAMP_4A_PS_MODIFICATION_REPOSITORY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.impl.KAMP4aPSSeedModificationsImpl <em>KAMP 4a PS Seed Modifications</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.impl.KAMP4aPSSeedModificationsImpl
	 * @see edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.impl.KAMP4aPSModificationmarksPackageImpl#getKAMP4aPSSeedModifications()
	 * @generated
	 */
	int KAMP_4A_PS_SEED_MODIFICATIONS = 2;

	/**
	 * The feature id for the '<em><b>Structure Modifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAMP_4A_PS_SEED_MODIFICATIONS__STRUCTURE_MODIFICATIONS = ModificationmarksPackage.ABSTRACT_SEED_MODIFICATIONS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Module Modifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAMP_4A_PS_SEED_MODIFICATIONS__MODULE_MODIFICATIONS = ModificationmarksPackage.ABSTRACT_SEED_MODIFICATIONS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Component Modifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAMP_4A_PS_SEED_MODIFICATIONS__COMPONENT_MODIFICATIONS = ModificationmarksPackage.ABSTRACT_SEED_MODIFICATIONS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Interface Modifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAMP_4A_PS_SEED_MODIFICATIONS__INTERFACE_MODIFICATIONS = ModificationmarksPackage.ABSTRACT_SEED_MODIFICATIONS_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>KAMP 4a PS Seed Modifications</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAMP_4A_PS_SEED_MODIFICATIONS_FEATURE_COUNT = ModificationmarksPackage.ABSTRACT_SEED_MODIFICATIONS_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>KAMP 4a PS Seed Modifications</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAMP_4A_PS_SEED_MODIFICATIONS_OPERATION_COUNT = ModificationmarksPackage.ABSTRACT_SEED_MODIFICATIONS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.impl.ChangePropagationDueToHardwareChangeImpl <em>Change Propagation Due To Hardware Change</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.impl.ChangePropagationDueToHardwareChangeImpl
	 * @see edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.impl.KAMP4aPSModificationmarksPackageImpl#getChangePropagationDueToHardwareChange()
	 * @generated
	 */
	int CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE = 3;

	/**
	 * The feature id for the '<em><b>Sensor Modifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__SENSOR_MODIFICATIONS = ModificationmarksPackage.CHANGE_PROPAGATION_STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Signalinterface Modifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__SIGNALINTERFACE_MODIFICATIONS = ModificationmarksPackage.CHANGE_PROPAGATION_STEP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Physical Connection Modifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__PHYSICAL_CONNECTION_MODIFICATIONS = ModificationmarksPackage.CHANGE_PROPAGATION_STEP_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Micro Switch Module Modifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__MICRO_SWITCH_MODULE_MODIFICATIONS = ModificationmarksPackage.CHANGE_PROPAGATION_STEP_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Bus Box Modifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__BUS_BOX_MODIFICATIONS = ModificationmarksPackage.CHANGE_PROPAGATION_STEP_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Bus Master Modifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__BUS_MASTER_MODIFICATIONS = ModificationmarksPackage.CHANGE_PROPAGATION_STEP_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Bus Slave Modifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__BUS_SLAVE_MODIFICATIONS = ModificationmarksPackage.CHANGE_PROPAGATION_STEP_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Bus Cable Modifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__BUS_CABLE_MODIFICATIONS = ModificationmarksPackage.CHANGE_PROPAGATION_STEP_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Interface Modifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__INTERFACE_MODIFICATIONS = ModificationmarksPackage.CHANGE_PROPAGATION_STEP_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Component Modifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__COMPONENT_MODIFICATIONS = ModificationmarksPackage.CHANGE_PROPAGATION_STEP_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Structure Modifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__STRUCTURE_MODIFICATIONS = ModificationmarksPackage.CHANGE_PROPAGATION_STEP_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Module Modifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__MODULE_MODIFICATIONS = ModificationmarksPackage.CHANGE_PROPAGATION_STEP_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__CHANGED = ModificationmarksPackage.CHANGE_PROPAGATION_STEP_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>Change Propagation Due To Hardware Change</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE_FEATURE_COUNT = ModificationmarksPackage.CHANGE_PROPAGATION_STEP_FEATURE_COUNT + 13;

	/**
	 * The number of operations of the '<em>Change Propagation Due To Hardware Change</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE_OPERATION_COUNT = ModificationmarksPackage.CHANGE_PROPAGATION_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.impl.ModifyEntityImpl <em>Modify Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.impl.ModifyEntityImpl
	 * @see edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.impl.KAMP4aPSModificationmarksPackageImpl#getModifyEntity()
	 * @generated
	 */
	int MODIFY_ENTITY = 4;

	/**
	 * The feature id for the '<em><b>Affected Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_ENTITY__AFFECTED_ELEMENT = ModificationmarksPackage.ABSTRACT_MODIFICATION__AFFECTED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Causing Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_ENTITY__CAUSING_ELEMENTS = ModificationmarksPackage.ABSTRACT_MODIFICATION__CAUSING_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_ENTITY__ID = ModificationmarksPackage.ABSTRACT_MODIFICATION__ID;

	/**
	 * The feature id for the '<em><b>Toolderived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_ENTITY__TOOLDERIVED = ModificationmarksPackage.ABSTRACT_MODIFICATION__TOOLDERIVED;

	/**
	 * The feature id for the '<em><b>User Decision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_ENTITY__USER_DECISION = ModificationmarksPackage.ABSTRACT_MODIFICATION__USER_DECISION;

	/**
	 * The number of structural features of the '<em>Modify Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_ENTITY_FEATURE_COUNT = ModificationmarksPackage.ABSTRACT_MODIFICATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Modify Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_ENTITY_OPERATION_COUNT = ModificationmarksPackage.ABSTRACT_MODIFICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.impl.ModifyComponentImpl <em>Modify Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.impl.ModifyComponentImpl
	 * @see edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.impl.KAMP4aPSModificationmarksPackageImpl#getModifyComponent()
	 * @generated
	 */
	int MODIFY_COMPONENT = 5;

	/**
	 * The feature id for the '<em><b>Affected Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_COMPONENT__AFFECTED_ELEMENT = MODIFY_ENTITY__AFFECTED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Causing Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_COMPONENT__CAUSING_ELEMENTS = MODIFY_ENTITY__CAUSING_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_COMPONENT__ID = MODIFY_ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Toolderived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_COMPONENT__TOOLDERIVED = MODIFY_ENTITY__TOOLDERIVED;

	/**
	 * The feature id for the '<em><b>User Decision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_COMPONENT__USER_DECISION = MODIFY_ENTITY__USER_DECISION;

	/**
	 * The number of structural features of the '<em>Modify Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_COMPONENT_FEATURE_COUNT = MODIFY_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Modify Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_COMPONENT_OPERATION_COUNT = MODIFY_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.impl.ModifyModuleImpl <em>Modify Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.impl.ModifyModuleImpl
	 * @see edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.impl.KAMP4aPSModificationmarksPackageImpl#getModifyModule()
	 * @generated
	 */
	int MODIFY_MODULE = 6;

	/**
	 * The feature id for the '<em><b>Affected Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_MODULE__AFFECTED_ELEMENT = MODIFY_ENTITY__AFFECTED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Causing Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_MODULE__CAUSING_ELEMENTS = MODIFY_ENTITY__CAUSING_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_MODULE__ID = MODIFY_ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Toolderived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_MODULE__TOOLDERIVED = MODIFY_ENTITY__TOOLDERIVED;

	/**
	 * The feature id for the '<em><b>User Decision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_MODULE__USER_DECISION = MODIFY_ENTITY__USER_DECISION;

	/**
	 * The number of structural features of the '<em>Modify Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_MODULE_FEATURE_COUNT = MODIFY_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Modify Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_MODULE_OPERATION_COUNT = MODIFY_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.impl.ModifyStructureImpl <em>Modify Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.impl.ModifyStructureImpl
	 * @see edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.impl.KAMP4aPSModificationmarksPackageImpl#getModifyStructure()
	 * @generated
	 */
	int MODIFY_STRUCTURE = 7;

	/**
	 * The feature id for the '<em><b>Affected Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_STRUCTURE__AFFECTED_ELEMENT = MODIFY_ENTITY__AFFECTED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Causing Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_STRUCTURE__CAUSING_ELEMENTS = MODIFY_ENTITY__CAUSING_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_STRUCTURE__ID = MODIFY_ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Toolderived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_STRUCTURE__TOOLDERIVED = MODIFY_ENTITY__TOOLDERIVED;

	/**
	 * The feature id for the '<em><b>User Decision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_STRUCTURE__USER_DECISION = MODIFY_ENTITY__USER_DECISION;

	/**
	 * The number of structural features of the '<em>Modify Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_STRUCTURE_FEATURE_COUNT = MODIFY_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Modify Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_STRUCTURE_OPERATION_COUNT = MODIFY_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.impl.ModifyInterfaceImpl <em>Modify Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.impl.ModifyInterfaceImpl
	 * @see edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.impl.KAMP4aPSModificationmarksPackageImpl#getModifyInterface()
	 * @generated
	 */
	int MODIFY_INTERFACE = 8;

	/**
	 * The feature id for the '<em><b>Affected Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_INTERFACE__AFFECTED_ELEMENT = MODIFY_ENTITY__AFFECTED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Causing Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_INTERFACE__CAUSING_ELEMENTS = MODIFY_ENTITY__CAUSING_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_INTERFACE__ID = MODIFY_ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Toolderived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_INTERFACE__TOOLDERIVED = MODIFY_ENTITY__TOOLDERIVED;

	/**
	 * The feature id for the '<em><b>User Decision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_INTERFACE__USER_DECISION = MODIFY_ENTITY__USER_DECISION;

	/**
	 * The number of structural features of the '<em>Modify Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_INTERFACE_FEATURE_COUNT = MODIFY_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Modify Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_INTERFACE_OPERATION_COUNT = MODIFY_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.impl.ModifySignalinterfaceImpl <em>Modify Signalinterface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.impl.ModifySignalinterfaceImpl
	 * @see edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.impl.KAMP4aPSModificationmarksPackageImpl#getModifySignalinterface()
	 * @generated
	 */
	int MODIFY_SIGNALINTERFACE = 9;

	/**
	 * The feature id for the '<em><b>Affected Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_SIGNALINTERFACE__AFFECTED_ELEMENT = MODIFY_INTERFACE__AFFECTED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Causing Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_SIGNALINTERFACE__CAUSING_ELEMENTS = MODIFY_INTERFACE__CAUSING_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_SIGNALINTERFACE__ID = MODIFY_INTERFACE__ID;

	/**
	 * The feature id for the '<em><b>Toolderived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_SIGNALINTERFACE__TOOLDERIVED = MODIFY_INTERFACE__TOOLDERIVED;

	/**
	 * The feature id for the '<em><b>User Decision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_SIGNALINTERFACE__USER_DECISION = MODIFY_INTERFACE__USER_DECISION;

	/**
	 * The number of structural features of the '<em>Modify Signalinterface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_SIGNALINTERFACE_FEATURE_COUNT = MODIFY_INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Modify Signalinterface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_SIGNALINTERFACE_OPERATION_COUNT = MODIFY_INTERFACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.impl.ModifyPhysicalConnectionImpl <em>Modify Physical Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.impl.ModifyPhysicalConnectionImpl
	 * @see edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.impl.KAMP4aPSModificationmarksPackageImpl#getModifyPhysicalConnection()
	 * @generated
	 */
	int MODIFY_PHYSICAL_CONNECTION = 10;

	/**
	 * The feature id for the '<em><b>Affected Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_PHYSICAL_CONNECTION__AFFECTED_ELEMENT = MODIFY_INTERFACE__AFFECTED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Causing Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_PHYSICAL_CONNECTION__CAUSING_ELEMENTS = MODIFY_INTERFACE__CAUSING_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_PHYSICAL_CONNECTION__ID = MODIFY_INTERFACE__ID;

	/**
	 * The feature id for the '<em><b>Toolderived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_PHYSICAL_CONNECTION__TOOLDERIVED = MODIFY_INTERFACE__TOOLDERIVED;

	/**
	 * The feature id for the '<em><b>User Decision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_PHYSICAL_CONNECTION__USER_DECISION = MODIFY_INTERFACE__USER_DECISION;

	/**
	 * The number of structural features of the '<em>Modify Physical Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_PHYSICAL_CONNECTION_FEATURE_COUNT = MODIFY_INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Modify Physical Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_PHYSICAL_CONNECTION_OPERATION_COUNT = MODIFY_INTERFACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.impl.ModifyMicroSwitchModuleImpl <em>Modify Micro Switch Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.impl.ModifyMicroSwitchModuleImpl
	 * @see edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.impl.KAMP4aPSModificationmarksPackageImpl#getModifyMicroSwitchModule()
	 * @generated
	 */
	int MODIFY_MICRO_SWITCH_MODULE = 11;

	/**
	 * The feature id for the '<em><b>Affected Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_MICRO_SWITCH_MODULE__AFFECTED_ELEMENT = MODIFY_MODULE__AFFECTED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Causing Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_MICRO_SWITCH_MODULE__CAUSING_ELEMENTS = MODIFY_MODULE__CAUSING_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_MICRO_SWITCH_MODULE__ID = MODIFY_MODULE__ID;

	/**
	 * The feature id for the '<em><b>Toolderived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_MICRO_SWITCH_MODULE__TOOLDERIVED = MODIFY_MODULE__TOOLDERIVED;

	/**
	 * The feature id for the '<em><b>User Decision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_MICRO_SWITCH_MODULE__USER_DECISION = MODIFY_MODULE__USER_DECISION;

	/**
	 * The feature id for the '<em><b>Is Replaced</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_MICRO_SWITCH_MODULE__IS_REPLACED = MODIFY_MODULE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Modify Micro Switch Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_MICRO_SWITCH_MODULE_FEATURE_COUNT = MODIFY_MODULE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Modify Micro Switch Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_MICRO_SWITCH_MODULE_OPERATION_COUNT = MODIFY_MODULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.impl.ModifyBusBoxImpl <em>Modify Bus Box</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.impl.ModifyBusBoxImpl
	 * @see edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.impl.KAMP4aPSModificationmarksPackageImpl#getModifyBusBox()
	 * @generated
	 */
	int MODIFY_BUS_BOX = 12;

	/**
	 * The feature id for the '<em><b>Affected Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_BUS_BOX__AFFECTED_ELEMENT = MODIFY_COMPONENT__AFFECTED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Causing Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_BUS_BOX__CAUSING_ELEMENTS = MODIFY_COMPONENT__CAUSING_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_BUS_BOX__ID = MODIFY_COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Toolderived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_BUS_BOX__TOOLDERIVED = MODIFY_COMPONENT__TOOLDERIVED;

	/**
	 * The feature id for the '<em><b>User Decision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_BUS_BOX__USER_DECISION = MODIFY_COMPONENT__USER_DECISION;

	/**
	 * The number of structural features of the '<em>Modify Bus Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_BUS_BOX_FEATURE_COUNT = MODIFY_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Modify Bus Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_BUS_BOX_OPERATION_COUNT = MODIFY_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.impl.ModifyBusMasterImpl <em>Modify Bus Master</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.impl.ModifyBusMasterImpl
	 * @see edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.impl.KAMP4aPSModificationmarksPackageImpl#getModifyBusMaster()
	 * @generated
	 */
	int MODIFY_BUS_MASTER = 13;

	/**
	 * The feature id for the '<em><b>Affected Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_BUS_MASTER__AFFECTED_ELEMENT = MODIFY_COMPONENT__AFFECTED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Causing Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_BUS_MASTER__CAUSING_ELEMENTS = MODIFY_COMPONENT__CAUSING_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_BUS_MASTER__ID = MODIFY_COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Toolderived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_BUS_MASTER__TOOLDERIVED = MODIFY_COMPONENT__TOOLDERIVED;

	/**
	 * The feature id for the '<em><b>User Decision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_BUS_MASTER__USER_DECISION = MODIFY_COMPONENT__USER_DECISION;

	/**
	 * The number of structural features of the '<em>Modify Bus Master</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_BUS_MASTER_FEATURE_COUNT = MODIFY_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Modify Bus Master</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_BUS_MASTER_OPERATION_COUNT = MODIFY_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.impl.ModifyBusSlaveImpl <em>Modify Bus Slave</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.impl.ModifyBusSlaveImpl
	 * @see edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.impl.KAMP4aPSModificationmarksPackageImpl#getModifyBusSlave()
	 * @generated
	 */
	int MODIFY_BUS_SLAVE = 14;

	/**
	 * The feature id for the '<em><b>Affected Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_BUS_SLAVE__AFFECTED_ELEMENT = MODIFY_COMPONENT__AFFECTED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Causing Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_BUS_SLAVE__CAUSING_ELEMENTS = MODIFY_COMPONENT__CAUSING_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_BUS_SLAVE__ID = MODIFY_COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Toolderived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_BUS_SLAVE__TOOLDERIVED = MODIFY_COMPONENT__TOOLDERIVED;

	/**
	 * The feature id for the '<em><b>User Decision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_BUS_SLAVE__USER_DECISION = MODIFY_COMPONENT__USER_DECISION;

	/**
	 * The number of structural features of the '<em>Modify Bus Slave</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_BUS_SLAVE_FEATURE_COUNT = MODIFY_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Modify Bus Slave</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_BUS_SLAVE_OPERATION_COUNT = MODIFY_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.impl.ModifyBusCableImpl <em>Modify Bus Cable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.impl.ModifyBusCableImpl
	 * @see edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.impl.KAMP4aPSModificationmarksPackageImpl#getModifyBusCable()
	 * @generated
	 */
	int MODIFY_BUS_CABLE = 15;

	/**
	 * The feature id for the '<em><b>Affected Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_BUS_CABLE__AFFECTED_ELEMENT = MODIFY_COMPONENT__AFFECTED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Causing Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_BUS_CABLE__CAUSING_ELEMENTS = MODIFY_COMPONENT__CAUSING_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_BUS_CABLE__ID = MODIFY_COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Toolderived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_BUS_CABLE__TOOLDERIVED = MODIFY_COMPONENT__TOOLDERIVED;

	/**
	 * The feature id for the '<em><b>User Decision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_BUS_CABLE__USER_DECISION = MODIFY_COMPONENT__USER_DECISION;

	/**
	 * The number of structural features of the '<em>Modify Bus Cable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_BUS_CABLE_FEATURE_COUNT = MODIFY_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Modify Bus Cable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_BUS_CABLE_OPERATION_COUNT = MODIFY_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.impl.ModifySensorImpl <em>Modify Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.impl.ModifySensorImpl
	 * @see edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.impl.KAMP4aPSModificationmarksPackageImpl#getModifySensor()
	 * @generated
	 */
	int MODIFY_SENSOR = 16;

	/**
	 * The feature id for the '<em><b>Affected Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_SENSOR__AFFECTED_ELEMENT = MODIFY_COMPONENT__AFFECTED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Causing Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_SENSOR__CAUSING_ELEMENTS = MODIFY_COMPONENT__CAUSING_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_SENSOR__ID = MODIFY_COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Toolderived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_SENSOR__TOOLDERIVED = MODIFY_COMPONENT__TOOLDERIVED;

	/**
	 * The feature id for the '<em><b>User Decision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_SENSOR__USER_DECISION = MODIFY_COMPONENT__USER_DECISION;

	/**
	 * The feature id for the '<em><b>Modify Signal Interfaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_SENSOR__MODIFY_SIGNAL_INTERFACES = MODIFY_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Modify Physical Connections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_SENSOR__MODIFY_PHYSICAL_CONNECTIONS = MODIFY_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Modify Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_SENSOR_FEATURE_COUNT = MODIFY_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Modify Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_SENSOR_OPERATION_COUNT = MODIFY_COMPONENT_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.impl.ModifyRampImpl <em>Modify Ramp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.impl.ModifyRampImpl
	 * @see edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.impl.KAMP4aPSModificationmarksPackageImpl#getModifyRamp()
	 * @generated
	 */
	int MODIFY_RAMP = 17;

	/**
	 * The feature id for the '<em><b>Affected Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_RAMP__AFFECTED_ELEMENT = MODIFY_COMPONENT__AFFECTED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Causing Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_RAMP__CAUSING_ELEMENTS = MODIFY_COMPONENT__CAUSING_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_RAMP__ID = MODIFY_COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Toolderived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_RAMP__TOOLDERIVED = MODIFY_COMPONENT__TOOLDERIVED;

	/**
	 * The feature id for the '<em><b>User Decision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_RAMP__USER_DECISION = MODIFY_COMPONENT__USER_DECISION;

	/**
	 * The number of structural features of the '<em>Modify Ramp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_RAMP_FEATURE_COUNT = MODIFY_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Modify Ramp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_RAMP_OPERATION_COUNT = MODIFY_COMPONENT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.AbstractKAMP4aPSModificationRepository <em>Abstract KAMP 4a PS Modification Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract KAMP 4a PS Modification Repository</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.AbstractKAMP4aPSModificationRepository
	 * @generated
	 */
	EClass getAbstractKAMP4aPSModificationRepository();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.KAMP4aPSModificationRepository <em>KAMP 4a PS Modification Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>KAMP 4a PS Modification Repository</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.KAMP4aPSModificationRepository
	 * @generated
	 */
	EClass getKAMP4aPSModificationRepository();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.KAMP4aPSSeedModifications <em>KAMP 4a PS Seed Modifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>KAMP 4a PS Seed Modifications</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.KAMP4aPSSeedModifications
	 * @generated
	 */
	EClass getKAMP4aPSSeedModifications();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.KAMP4aPSSeedModifications#getStructureModifications <em>Structure Modifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Structure Modifications</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.KAMP4aPSSeedModifications#getStructureModifications()
	 * @see #getKAMP4aPSSeedModifications()
	 * @generated
	 */
	EReference getKAMP4aPSSeedModifications_StructureModifications();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.KAMP4aPSSeedModifications#getModuleModifications <em>Module Modifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Module Modifications</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.KAMP4aPSSeedModifications#getModuleModifications()
	 * @see #getKAMP4aPSSeedModifications()
	 * @generated
	 */
	EReference getKAMP4aPSSeedModifications_ModuleModifications();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.KAMP4aPSSeedModifications#getComponentModifications <em>Component Modifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Component Modifications</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.KAMP4aPSSeedModifications#getComponentModifications()
	 * @see #getKAMP4aPSSeedModifications()
	 * @generated
	 */
	EReference getKAMP4aPSSeedModifications_ComponentModifications();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.KAMP4aPSSeedModifications#getInterfaceModifications <em>Interface Modifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interface Modifications</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.KAMP4aPSSeedModifications#getInterfaceModifications()
	 * @see #getKAMP4aPSSeedModifications()
	 * @generated
	 */
	EReference getKAMP4aPSSeedModifications_InterfaceModifications();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ChangePropagationDueToHardwareChange <em>Change Propagation Due To Hardware Change</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Change Propagation Due To Hardware Change</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ChangePropagationDueToHardwareChange
	 * @generated
	 */
	EClass getChangePropagationDueToHardwareChange();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ChangePropagationDueToHardwareChange#getSensorModifications <em>Sensor Modifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sensor Modifications</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ChangePropagationDueToHardwareChange#getSensorModifications()
	 * @see #getChangePropagationDueToHardwareChange()
	 * @generated
	 */
	EReference getChangePropagationDueToHardwareChange_SensorModifications();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ChangePropagationDueToHardwareChange#getSignalinterfaceModifications <em>Signalinterface Modifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Signalinterface Modifications</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ChangePropagationDueToHardwareChange#getSignalinterfaceModifications()
	 * @see #getChangePropagationDueToHardwareChange()
	 * @generated
	 */
	EReference getChangePropagationDueToHardwareChange_SignalinterfaceModifications();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ChangePropagationDueToHardwareChange#getPhysicalConnectionModifications <em>Physical Connection Modifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Physical Connection Modifications</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ChangePropagationDueToHardwareChange#getPhysicalConnectionModifications()
	 * @see #getChangePropagationDueToHardwareChange()
	 * @generated
	 */
	EReference getChangePropagationDueToHardwareChange_PhysicalConnectionModifications();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ChangePropagationDueToHardwareChange#getMicroSwitchModuleModifications <em>Micro Switch Module Modifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Micro Switch Module Modifications</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ChangePropagationDueToHardwareChange#getMicroSwitchModuleModifications()
	 * @see #getChangePropagationDueToHardwareChange()
	 * @generated
	 */
	EReference getChangePropagationDueToHardwareChange_MicroSwitchModuleModifications();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ChangePropagationDueToHardwareChange#getBusBoxModifications <em>Bus Box Modifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bus Box Modifications</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ChangePropagationDueToHardwareChange#getBusBoxModifications()
	 * @see #getChangePropagationDueToHardwareChange()
	 * @generated
	 */
	EReference getChangePropagationDueToHardwareChange_BusBoxModifications();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ChangePropagationDueToHardwareChange#getBusMasterModifications <em>Bus Master Modifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bus Master Modifications</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ChangePropagationDueToHardwareChange#getBusMasterModifications()
	 * @see #getChangePropagationDueToHardwareChange()
	 * @generated
	 */
	EReference getChangePropagationDueToHardwareChange_BusMasterModifications();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ChangePropagationDueToHardwareChange#getBusSlaveModifications <em>Bus Slave Modifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bus Slave Modifications</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ChangePropagationDueToHardwareChange#getBusSlaveModifications()
	 * @see #getChangePropagationDueToHardwareChange()
	 * @generated
	 */
	EReference getChangePropagationDueToHardwareChange_BusSlaveModifications();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ChangePropagationDueToHardwareChange#getBusCableModifications <em>Bus Cable Modifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bus Cable Modifications</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ChangePropagationDueToHardwareChange#getBusCableModifications()
	 * @see #getChangePropagationDueToHardwareChange()
	 * @generated
	 */
	EReference getChangePropagationDueToHardwareChange_BusCableModifications();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ChangePropagationDueToHardwareChange#getInterfaceModifications <em>Interface Modifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interface Modifications</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ChangePropagationDueToHardwareChange#getInterfaceModifications()
	 * @see #getChangePropagationDueToHardwareChange()
	 * @generated
	 */
	EReference getChangePropagationDueToHardwareChange_InterfaceModifications();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ChangePropagationDueToHardwareChange#getComponentModifications <em>Component Modifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Component Modifications</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ChangePropagationDueToHardwareChange#getComponentModifications()
	 * @see #getChangePropagationDueToHardwareChange()
	 * @generated
	 */
	EReference getChangePropagationDueToHardwareChange_ComponentModifications();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ChangePropagationDueToHardwareChange#getStructureModifications <em>Structure Modifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Structure Modifications</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ChangePropagationDueToHardwareChange#getStructureModifications()
	 * @see #getChangePropagationDueToHardwareChange()
	 * @generated
	 */
	EReference getChangePropagationDueToHardwareChange_StructureModifications();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ChangePropagationDueToHardwareChange#getModuleModifications <em>Module Modifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Module Modifications</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ChangePropagationDueToHardwareChange#getModuleModifications()
	 * @see #getChangePropagationDueToHardwareChange()
	 * @generated
	 */
	EReference getChangePropagationDueToHardwareChange_ModuleModifications();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ChangePropagationDueToHardwareChange#isChanged <em>Changed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Changed</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ChangePropagationDueToHardwareChange#isChanged()
	 * @see #getChangePropagationDueToHardwareChange()
	 * @generated
	 */
	EAttribute getChangePropagationDueToHardwareChange_Changed();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ModifyEntity <em>Modify Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modify Entity</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ModifyEntity
	 * @generated
	 */
	EClass getModifyEntity();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ModifyComponent <em>Modify Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modify Component</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ModifyComponent
	 * @generated
	 */
	EClass getModifyComponent();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ModifyModule <em>Modify Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modify Module</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ModifyModule
	 * @generated
	 */
	EClass getModifyModule();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ModifyStructure <em>Modify Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modify Structure</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ModifyStructure
	 * @generated
	 */
	EClass getModifyStructure();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ModifyInterface <em>Modify Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modify Interface</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ModifyInterface
	 * @generated
	 */
	EClass getModifyInterface();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ModifySignalinterface <em>Modify Signalinterface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modify Signalinterface</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ModifySignalinterface
	 * @generated
	 */
	EClass getModifySignalinterface();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ModifyPhysicalConnection <em>Modify Physical Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modify Physical Connection</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ModifyPhysicalConnection
	 * @generated
	 */
	EClass getModifyPhysicalConnection();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ModifyMicroSwitchModule <em>Modify Micro Switch Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modify Micro Switch Module</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ModifyMicroSwitchModule
	 * @generated
	 */
	EClass getModifyMicroSwitchModule();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ModifyMicroSwitchModule#isIsReplaced <em>Is Replaced</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Replaced</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ModifyMicroSwitchModule#isIsReplaced()
	 * @see #getModifyMicroSwitchModule()
	 * @generated
	 */
	EAttribute getModifyMicroSwitchModule_IsReplaced();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ModifyBusBox <em>Modify Bus Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modify Bus Box</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ModifyBusBox
	 * @generated
	 */
	EClass getModifyBusBox();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ModifyBusMaster <em>Modify Bus Master</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modify Bus Master</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ModifyBusMaster
	 * @generated
	 */
	EClass getModifyBusMaster();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ModifyBusSlave <em>Modify Bus Slave</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modify Bus Slave</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ModifyBusSlave
	 * @generated
	 */
	EClass getModifyBusSlave();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ModifyBusCable <em>Modify Bus Cable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modify Bus Cable</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ModifyBusCable
	 * @generated
	 */
	EClass getModifyBusCable();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ModifySensor <em>Modify Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modify Sensor</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ModifySensor
	 * @generated
	 */
	EClass getModifySensor();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ModifySensor#getModifySignalInterfaces <em>Modify Signal Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Modify Signal Interfaces</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ModifySensor#getModifySignalInterfaces()
	 * @see #getModifySensor()
	 * @generated
	 */
	EReference getModifySensor_ModifySignalInterfaces();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ModifySensor#getModifyPhysicalConnections <em>Modify Physical Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Modify Physical Connections</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ModifySensor#getModifyPhysicalConnections()
	 * @see #getModifySensor()
	 * @generated
	 */
	EReference getModifySensor_ModifyPhysicalConnections();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ModifyRamp <em>Modify Ramp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modify Ramp</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ModifyRamp
	 * @generated
	 */
	EClass getModifyRamp();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	KAMP4aPSModificationmarksFactory getKAMP4aPSModificationmarksFactory();

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
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.impl.AbstractKAMP4aPSModificationRepositoryImpl <em>Abstract KAMP 4a PS Modification Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.impl.AbstractKAMP4aPSModificationRepositoryImpl
		 * @see edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.impl.KAMP4aPSModificationmarksPackageImpl#getAbstractKAMP4aPSModificationRepository()
		 * @generated
		 */
		EClass ABSTRACT_KAMP_4A_PS_MODIFICATION_REPOSITORY = eINSTANCE.getAbstractKAMP4aPSModificationRepository();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.impl.KAMP4aPSModificationRepositoryImpl <em>KAMP 4a PS Modification Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.impl.KAMP4aPSModificationRepositoryImpl
		 * @see edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.impl.KAMP4aPSModificationmarksPackageImpl#getKAMP4aPSModificationRepository()
		 * @generated
		 */
		EClass KAMP_4A_PS_MODIFICATION_REPOSITORY = eINSTANCE.getKAMP4aPSModificationRepository();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.impl.KAMP4aPSSeedModificationsImpl <em>KAMP 4a PS Seed Modifications</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.impl.KAMP4aPSSeedModificationsImpl
		 * @see edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.impl.KAMP4aPSModificationmarksPackageImpl#getKAMP4aPSSeedModifications()
		 * @generated
		 */
		EClass KAMP_4A_PS_SEED_MODIFICATIONS = eINSTANCE.getKAMP4aPSSeedModifications();

		/**
		 * The meta object literal for the '<em><b>Structure Modifications</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KAMP_4A_PS_SEED_MODIFICATIONS__STRUCTURE_MODIFICATIONS = eINSTANCE.getKAMP4aPSSeedModifications_StructureModifications();

		/**
		 * The meta object literal for the '<em><b>Module Modifications</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KAMP_4A_PS_SEED_MODIFICATIONS__MODULE_MODIFICATIONS = eINSTANCE.getKAMP4aPSSeedModifications_ModuleModifications();

		/**
		 * The meta object literal for the '<em><b>Component Modifications</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KAMP_4A_PS_SEED_MODIFICATIONS__COMPONENT_MODIFICATIONS = eINSTANCE.getKAMP4aPSSeedModifications_ComponentModifications();

		/**
		 * The meta object literal for the '<em><b>Interface Modifications</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KAMP_4A_PS_SEED_MODIFICATIONS__INTERFACE_MODIFICATIONS = eINSTANCE.getKAMP4aPSSeedModifications_InterfaceModifications();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.impl.ChangePropagationDueToHardwareChangeImpl <em>Change Propagation Due To Hardware Change</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.impl.ChangePropagationDueToHardwareChangeImpl
		 * @see edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.impl.KAMP4aPSModificationmarksPackageImpl#getChangePropagationDueToHardwareChange()
		 * @generated
		 */
		EClass CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE = eINSTANCE.getChangePropagationDueToHardwareChange();

		/**
		 * The meta object literal for the '<em><b>Sensor Modifications</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__SENSOR_MODIFICATIONS = eINSTANCE.getChangePropagationDueToHardwareChange_SensorModifications();

		/**
		 * The meta object literal for the '<em><b>Signalinterface Modifications</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__SIGNALINTERFACE_MODIFICATIONS = eINSTANCE.getChangePropagationDueToHardwareChange_SignalinterfaceModifications();

		/**
		 * The meta object literal for the '<em><b>Physical Connection Modifications</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__PHYSICAL_CONNECTION_MODIFICATIONS = eINSTANCE.getChangePropagationDueToHardwareChange_PhysicalConnectionModifications();

		/**
		 * The meta object literal for the '<em><b>Micro Switch Module Modifications</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__MICRO_SWITCH_MODULE_MODIFICATIONS = eINSTANCE.getChangePropagationDueToHardwareChange_MicroSwitchModuleModifications();

		/**
		 * The meta object literal for the '<em><b>Bus Box Modifications</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__BUS_BOX_MODIFICATIONS = eINSTANCE.getChangePropagationDueToHardwareChange_BusBoxModifications();

		/**
		 * The meta object literal for the '<em><b>Bus Master Modifications</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__BUS_MASTER_MODIFICATIONS = eINSTANCE.getChangePropagationDueToHardwareChange_BusMasterModifications();

		/**
		 * The meta object literal for the '<em><b>Bus Slave Modifications</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__BUS_SLAVE_MODIFICATIONS = eINSTANCE.getChangePropagationDueToHardwareChange_BusSlaveModifications();

		/**
		 * The meta object literal for the '<em><b>Bus Cable Modifications</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__BUS_CABLE_MODIFICATIONS = eINSTANCE.getChangePropagationDueToHardwareChange_BusCableModifications();

		/**
		 * The meta object literal for the '<em><b>Interface Modifications</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__INTERFACE_MODIFICATIONS = eINSTANCE.getChangePropagationDueToHardwareChange_InterfaceModifications();

		/**
		 * The meta object literal for the '<em><b>Component Modifications</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__COMPONENT_MODIFICATIONS = eINSTANCE.getChangePropagationDueToHardwareChange_ComponentModifications();

		/**
		 * The meta object literal for the '<em><b>Structure Modifications</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__STRUCTURE_MODIFICATIONS = eINSTANCE.getChangePropagationDueToHardwareChange_StructureModifications();

		/**
		 * The meta object literal for the '<em><b>Module Modifications</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__MODULE_MODIFICATIONS = eINSTANCE.getChangePropagationDueToHardwareChange_ModuleModifications();

		/**
		 * The meta object literal for the '<em><b>Changed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__CHANGED = eINSTANCE.getChangePropagationDueToHardwareChange_Changed();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.impl.ModifyEntityImpl <em>Modify Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.impl.ModifyEntityImpl
		 * @see edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.impl.KAMP4aPSModificationmarksPackageImpl#getModifyEntity()
		 * @generated
		 */
		EClass MODIFY_ENTITY = eINSTANCE.getModifyEntity();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.impl.ModifyComponentImpl <em>Modify Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.impl.ModifyComponentImpl
		 * @see edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.impl.KAMP4aPSModificationmarksPackageImpl#getModifyComponent()
		 * @generated
		 */
		EClass MODIFY_COMPONENT = eINSTANCE.getModifyComponent();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.impl.ModifyModuleImpl <em>Modify Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.impl.ModifyModuleImpl
		 * @see edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.impl.KAMP4aPSModificationmarksPackageImpl#getModifyModule()
		 * @generated
		 */
		EClass MODIFY_MODULE = eINSTANCE.getModifyModule();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.impl.ModifyStructureImpl <em>Modify Structure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.impl.ModifyStructureImpl
		 * @see edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.impl.KAMP4aPSModificationmarksPackageImpl#getModifyStructure()
		 * @generated
		 */
		EClass MODIFY_STRUCTURE = eINSTANCE.getModifyStructure();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.impl.ModifyInterfaceImpl <em>Modify Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.impl.ModifyInterfaceImpl
		 * @see edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.impl.KAMP4aPSModificationmarksPackageImpl#getModifyInterface()
		 * @generated
		 */
		EClass MODIFY_INTERFACE = eINSTANCE.getModifyInterface();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.impl.ModifySignalinterfaceImpl <em>Modify Signalinterface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.impl.ModifySignalinterfaceImpl
		 * @see edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.impl.KAMP4aPSModificationmarksPackageImpl#getModifySignalinterface()
		 * @generated
		 */
		EClass MODIFY_SIGNALINTERFACE = eINSTANCE.getModifySignalinterface();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.impl.ModifyPhysicalConnectionImpl <em>Modify Physical Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.impl.ModifyPhysicalConnectionImpl
		 * @see edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.impl.KAMP4aPSModificationmarksPackageImpl#getModifyPhysicalConnection()
		 * @generated
		 */
		EClass MODIFY_PHYSICAL_CONNECTION = eINSTANCE.getModifyPhysicalConnection();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.impl.ModifyMicroSwitchModuleImpl <em>Modify Micro Switch Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.impl.ModifyMicroSwitchModuleImpl
		 * @see edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.impl.KAMP4aPSModificationmarksPackageImpl#getModifyMicroSwitchModule()
		 * @generated
		 */
		EClass MODIFY_MICRO_SWITCH_MODULE = eINSTANCE.getModifyMicroSwitchModule();

		/**
		 * The meta object literal for the '<em><b>Is Replaced</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODIFY_MICRO_SWITCH_MODULE__IS_REPLACED = eINSTANCE.getModifyMicroSwitchModule_IsReplaced();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.impl.ModifyBusBoxImpl <em>Modify Bus Box</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.impl.ModifyBusBoxImpl
		 * @see edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.impl.KAMP4aPSModificationmarksPackageImpl#getModifyBusBox()
		 * @generated
		 */
		EClass MODIFY_BUS_BOX = eINSTANCE.getModifyBusBox();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.impl.ModifyBusMasterImpl <em>Modify Bus Master</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.impl.ModifyBusMasterImpl
		 * @see edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.impl.KAMP4aPSModificationmarksPackageImpl#getModifyBusMaster()
		 * @generated
		 */
		EClass MODIFY_BUS_MASTER = eINSTANCE.getModifyBusMaster();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.impl.ModifyBusSlaveImpl <em>Modify Bus Slave</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.impl.ModifyBusSlaveImpl
		 * @see edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.impl.KAMP4aPSModificationmarksPackageImpl#getModifyBusSlave()
		 * @generated
		 */
		EClass MODIFY_BUS_SLAVE = eINSTANCE.getModifyBusSlave();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.impl.ModifyBusCableImpl <em>Modify Bus Cable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.impl.ModifyBusCableImpl
		 * @see edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.impl.KAMP4aPSModificationmarksPackageImpl#getModifyBusCable()
		 * @generated
		 */
		EClass MODIFY_BUS_CABLE = eINSTANCE.getModifyBusCable();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.impl.ModifySensorImpl <em>Modify Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.impl.ModifySensorImpl
		 * @see edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.impl.KAMP4aPSModificationmarksPackageImpl#getModifySensor()
		 * @generated
		 */
		EClass MODIFY_SENSOR = eINSTANCE.getModifySensor();

		/**
		 * The meta object literal for the '<em><b>Modify Signal Interfaces</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODIFY_SENSOR__MODIFY_SIGNAL_INTERFACES = eINSTANCE.getModifySensor_ModifySignalInterfaces();

		/**
		 * The meta object literal for the '<em><b>Modify Physical Connections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODIFY_SENSOR__MODIFY_PHYSICAL_CONNECTIONS = eINSTANCE.getModifySensor_ModifyPhysicalConnections();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.impl.ModifyRampImpl <em>Modify Ramp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.impl.ModifyRampImpl
		 * @see edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.impl.KAMP4aPSModificationmarksPackageImpl#getModifyRamp()
		 * @generated
		 */
		EClass MODIFY_RAMP = eINSTANCE.getModifyRamp();

	}

} //KAMP4aPSModificationmarksPackage
