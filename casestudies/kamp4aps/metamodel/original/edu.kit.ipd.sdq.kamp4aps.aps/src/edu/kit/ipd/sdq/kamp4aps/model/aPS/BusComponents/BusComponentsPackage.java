/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents;

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
 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.BusComponentsFactory
 * @model kind="package"
 * @generated
 */
public interface BusComponentsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "BusComponents";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "edu.kit.ipd.sdq.kaps.xppu.buscomponents";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "BusComponents";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BusComponentsPackage eINSTANCE = edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.impl.BusComponentsPackageImpl.init();

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.impl.BusBoxImpl <em>Bus Box</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.impl.BusBoxImpl
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.impl.BusComponentsPackageImpl#getBusBox()
	 * @generated
	 */
	int BUS_BOX = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_BOX__ID = ComponentRepositoryPackage.COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_BOX__NAME = ComponentRepositoryPackage.COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Connected Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_BOX__CONNECTED_INTERFACES = ComponentRepositoryPackage.COMPONENT__CONNECTED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_BOX__PARENT = ComponentRepositoryPackage.COMPONENT__PARENT;

	/**
	 * The feature id for the '<em><b>Parent Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_BOX__PARENT_MODULE = ComponentRepositoryPackage.COMPONENT__PARENT_MODULE;

	/**
	 * The feature id for the '<em><b>Signalinterfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_BOX__SIGNALINTERFACES = ComponentRepositoryPackage.COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Signalinterface master</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_BOX__SIGNALINTERFACE_MASTER = ComponentRepositoryPackage.COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Signalinterface box</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_BOX__SIGNALINTERFACE_BOX = ComponentRepositoryPackage.COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Powersupply</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_BOX__POWERSUPPLY = ComponentRepositoryPackage.COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Bus Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_BOX_FEATURE_COUNT = ComponentRepositoryPackage.COMPONENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Bus Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_BOX_OPERATION_COUNT = ComponentRepositoryPackage.COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.impl.BusMasterImpl <em>Bus Master</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.impl.BusMasterImpl
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.impl.BusComponentsPackageImpl#getBusMaster()
	 * @generated
	 */
	int BUS_MASTER = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_MASTER__ID = ComponentRepositoryPackage.COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_MASTER__NAME = ComponentRepositoryPackage.COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Connected Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_MASTER__CONNECTED_INTERFACES = ComponentRepositoryPackage.COMPONENT__CONNECTED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_MASTER__PARENT = ComponentRepositoryPackage.COMPONENT__PARENT;

	/**
	 * The feature id for the '<em><b>Parent Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_MASTER__PARENT_MODULE = ComponentRepositoryPackage.COMPONENT__PARENT_MODULE;

	/**
	 * The feature id for the '<em><b>Signalinterfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_MASTER__SIGNALINTERFACES = ComponentRepositoryPackage.COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Signalinterface controller</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_MASTER__SIGNALINTERFACE_CONTROLLER = ComponentRepositoryPackage.COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Bus Master</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_MASTER_FEATURE_COUNT = ComponentRepositoryPackage.COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Bus Master</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_MASTER_OPERATION_COUNT = ComponentRepositoryPackage.COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.impl.BusSlaveImpl <em>Bus Slave</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.impl.BusSlaveImpl
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.impl.BusComponentsPackageImpl#getBusSlave()
	 * @generated
	 */
	int BUS_SLAVE = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_SLAVE__ID = ComponentRepositoryPackage.COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_SLAVE__NAME = ComponentRepositoryPackage.COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Connected Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_SLAVE__CONNECTED_INTERFACES = ComponentRepositoryPackage.COMPONENT__CONNECTED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_SLAVE__PARENT = ComponentRepositoryPackage.COMPONENT__PARENT;

	/**
	 * The feature id for the '<em><b>Parent Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_SLAVE__PARENT_MODULE = ComponentRepositoryPackage.COMPONENT__PARENT_MODULE;

	/**
	 * The feature id for the '<em><b>Signalinterface master</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_SLAVE__SIGNALINTERFACE_MASTER = ComponentRepositoryPackage.COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Signalinterface slave</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_SLAVE__SIGNALINTERFACE_SLAVE = ComponentRepositoryPackage.COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Bus Slave</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_SLAVE_FEATURE_COUNT = ComponentRepositoryPackage.COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Bus Slave</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_SLAVE_OPERATION_COUNT = ComponentRepositoryPackage.COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.impl.BusCableImpl <em>Bus Cable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.impl.BusCableImpl
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.impl.BusComponentsPackageImpl#getBusCable()
	 * @generated
	 */
	int BUS_CABLE = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_CABLE__ID = ComponentRepositoryPackage.CABLE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_CABLE__NAME = ComponentRepositoryPackage.CABLE__NAME;

	/**
	 * The feature id for the '<em><b>Connected Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_CABLE__CONNECTED_INTERFACES = ComponentRepositoryPackage.CABLE__CONNECTED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_CABLE__PARENT = ComponentRepositoryPackage.CABLE__PARENT;

	/**
	 * The feature id for the '<em><b>Parent Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_CABLE__PARENT_MODULE = ComponentRepositoryPackage.CABLE__PARENT_MODULE;

	/**
	 * The feature id for the '<em><b>Signal Plug1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_CABLE__SIGNAL_PLUG1 = ComponentRepositoryPackage.CABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Signal Plug2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_CABLE__SIGNAL_PLUG2 = ComponentRepositoryPackage.CABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Bus Cable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_CABLE_FEATURE_COUNT = ComponentRepositoryPackage.CABLE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Bus Cable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_CABLE_OPERATION_COUNT = ComponentRepositoryPackage.CABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.impl.ProfibusDPBoxImpl <em>Profibus DP Box</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.impl.ProfibusDPBoxImpl
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.impl.BusComponentsPackageImpl#getProfibusDPBox()
	 * @generated
	 */
	int PROFIBUS_DP_BOX = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFIBUS_DP_BOX__ID = BUS_BOX__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFIBUS_DP_BOX__NAME = BUS_BOX__NAME;

	/**
	 * The feature id for the '<em><b>Connected Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFIBUS_DP_BOX__CONNECTED_INTERFACES = BUS_BOX__CONNECTED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFIBUS_DP_BOX__PARENT = BUS_BOX__PARENT;

	/**
	 * The feature id for the '<em><b>Parent Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFIBUS_DP_BOX__PARENT_MODULE = BUS_BOX__PARENT_MODULE;

	/**
	 * The feature id for the '<em><b>Signalinterfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFIBUS_DP_BOX__SIGNALINTERFACES = BUS_BOX__SIGNALINTERFACES;

	/**
	 * The feature id for the '<em><b>Signalinterface master</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFIBUS_DP_BOX__SIGNALINTERFACE_MASTER = BUS_BOX__SIGNALINTERFACE_MASTER;

	/**
	 * The feature id for the '<em><b>Signalinterface box</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFIBUS_DP_BOX__SIGNALINTERFACE_BOX = BUS_BOX__SIGNALINTERFACE_BOX;

	/**
	 * The feature id for the '<em><b>Powersupply</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFIBUS_DP_BOX__POWERSUPPLY = BUS_BOX__POWERSUPPLY;

	/**
	 * The number of structural features of the '<em>Profibus DP Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFIBUS_DP_BOX_FEATURE_COUNT = BUS_BOX_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Profibus DP Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFIBUS_DP_BOX_OPERATION_COUNT = BUS_BOX_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.impl.ProfibusDPMasterImpl <em>Profibus DP Master</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.impl.ProfibusDPMasterImpl
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.impl.BusComponentsPackageImpl#getProfibusDPMaster()
	 * @generated
	 */
	int PROFIBUS_DP_MASTER = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFIBUS_DP_MASTER__ID = BUS_MASTER__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFIBUS_DP_MASTER__NAME = BUS_MASTER__NAME;

	/**
	 * The feature id for the '<em><b>Connected Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFIBUS_DP_MASTER__CONNECTED_INTERFACES = BUS_MASTER__CONNECTED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFIBUS_DP_MASTER__PARENT = BUS_MASTER__PARENT;

	/**
	 * The feature id for the '<em><b>Parent Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFIBUS_DP_MASTER__PARENT_MODULE = BUS_MASTER__PARENT_MODULE;

	/**
	 * The feature id for the '<em><b>Signalinterfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFIBUS_DP_MASTER__SIGNALINTERFACES = BUS_MASTER__SIGNALINTERFACES;

	/**
	 * The feature id for the '<em><b>Signalinterface controller</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFIBUS_DP_MASTER__SIGNALINTERFACE_CONTROLLER = BUS_MASTER__SIGNALINTERFACE_CONTROLLER;

	/**
	 * The number of structural features of the '<em>Profibus DP Master</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFIBUS_DP_MASTER_FEATURE_COUNT = BUS_MASTER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Profibus DP Master</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFIBUS_DP_MASTER_OPERATION_COUNT = BUS_MASTER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.impl.ProfibusDPSlaveImpl <em>Profibus DP Slave</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.impl.ProfibusDPSlaveImpl
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.impl.BusComponentsPackageImpl#getProfibusDPSlave()
	 * @generated
	 */
	int PROFIBUS_DP_SLAVE = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFIBUS_DP_SLAVE__ID = BUS_SLAVE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFIBUS_DP_SLAVE__NAME = BUS_SLAVE__NAME;

	/**
	 * The feature id for the '<em><b>Connected Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFIBUS_DP_SLAVE__CONNECTED_INTERFACES = BUS_SLAVE__CONNECTED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFIBUS_DP_SLAVE__PARENT = BUS_SLAVE__PARENT;

	/**
	 * The feature id for the '<em><b>Parent Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFIBUS_DP_SLAVE__PARENT_MODULE = BUS_SLAVE__PARENT_MODULE;

	/**
	 * The feature id for the '<em><b>Signalinterface master</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFIBUS_DP_SLAVE__SIGNALINTERFACE_MASTER = BUS_SLAVE__SIGNALINTERFACE_MASTER;

	/**
	 * The feature id for the '<em><b>Signalinterface slave</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFIBUS_DP_SLAVE__SIGNALINTERFACE_SLAVE = BUS_SLAVE__SIGNALINTERFACE_SLAVE;

	/**
	 * The number of structural features of the '<em>Profibus DP Slave</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFIBUS_DP_SLAVE_FEATURE_COUNT = BUS_SLAVE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Profibus DP Slave</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFIBUS_DP_SLAVE_OPERATION_COUNT = BUS_SLAVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.impl.ProfibusDPCableImpl <em>Profibus DP Cable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.impl.ProfibusDPCableImpl
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.impl.BusComponentsPackageImpl#getProfibusDPCable()
	 * @generated
	 */
	int PROFIBUS_DP_CABLE = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFIBUS_DP_CABLE__ID = BUS_CABLE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFIBUS_DP_CABLE__NAME = BUS_CABLE__NAME;

	/**
	 * The feature id for the '<em><b>Connected Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFIBUS_DP_CABLE__CONNECTED_INTERFACES = BUS_CABLE__CONNECTED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFIBUS_DP_CABLE__PARENT = BUS_CABLE__PARENT;

	/**
	 * The feature id for the '<em><b>Parent Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFIBUS_DP_CABLE__PARENT_MODULE = BUS_CABLE__PARENT_MODULE;

	/**
	 * The feature id for the '<em><b>Signal Plug1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFIBUS_DP_CABLE__SIGNAL_PLUG1 = BUS_CABLE__SIGNAL_PLUG1;

	/**
	 * The feature id for the '<em><b>Signal Plug2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFIBUS_DP_CABLE__SIGNAL_PLUG2 = BUS_CABLE__SIGNAL_PLUG2;

	/**
	 * The number of structural features of the '<em>Profibus DP Cable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFIBUS_DP_CABLE_FEATURE_COUNT = BUS_CABLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Profibus DP Cable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFIBUS_DP_CABLE_OPERATION_COUNT = BUS_CABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.impl.EtherCATBoxImpl <em>Ether CAT Box</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.impl.EtherCATBoxImpl
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.impl.BusComponentsPackageImpl#getEtherCATBox()
	 * @generated
	 */
	int ETHER_CAT_BOX = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETHER_CAT_BOX__ID = BUS_BOX__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETHER_CAT_BOX__NAME = BUS_BOX__NAME;

	/**
	 * The feature id for the '<em><b>Connected Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETHER_CAT_BOX__CONNECTED_INTERFACES = BUS_BOX__CONNECTED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETHER_CAT_BOX__PARENT = BUS_BOX__PARENT;

	/**
	 * The feature id for the '<em><b>Parent Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETHER_CAT_BOX__PARENT_MODULE = BUS_BOX__PARENT_MODULE;

	/**
	 * The feature id for the '<em><b>Signalinterfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETHER_CAT_BOX__SIGNALINTERFACES = BUS_BOX__SIGNALINTERFACES;

	/**
	 * The feature id for the '<em><b>Signalinterface master</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETHER_CAT_BOX__SIGNALINTERFACE_MASTER = BUS_BOX__SIGNALINTERFACE_MASTER;

	/**
	 * The feature id for the '<em><b>Signalinterface box</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETHER_CAT_BOX__SIGNALINTERFACE_BOX = BUS_BOX__SIGNALINTERFACE_BOX;

	/**
	 * The feature id for the '<em><b>Powersupply</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETHER_CAT_BOX__POWERSUPPLY = BUS_BOX__POWERSUPPLY;

	/**
	 * The number of structural features of the '<em>Ether CAT Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETHER_CAT_BOX_FEATURE_COUNT = BUS_BOX_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Ether CAT Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETHER_CAT_BOX_OPERATION_COUNT = BUS_BOX_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.impl.EtherCATMasterImpl <em>Ether CAT Master</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.impl.EtherCATMasterImpl
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.impl.BusComponentsPackageImpl#getEtherCATMaster()
	 * @generated
	 */
	int ETHER_CAT_MASTER = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETHER_CAT_MASTER__ID = BUS_MASTER__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETHER_CAT_MASTER__NAME = BUS_MASTER__NAME;

	/**
	 * The feature id for the '<em><b>Connected Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETHER_CAT_MASTER__CONNECTED_INTERFACES = BUS_MASTER__CONNECTED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETHER_CAT_MASTER__PARENT = BUS_MASTER__PARENT;

	/**
	 * The feature id for the '<em><b>Parent Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETHER_CAT_MASTER__PARENT_MODULE = BUS_MASTER__PARENT_MODULE;

	/**
	 * The feature id for the '<em><b>Signalinterfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETHER_CAT_MASTER__SIGNALINTERFACES = BUS_MASTER__SIGNALINTERFACES;

	/**
	 * The feature id for the '<em><b>Signalinterface controller</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETHER_CAT_MASTER__SIGNALINTERFACE_CONTROLLER = BUS_MASTER__SIGNALINTERFACE_CONTROLLER;

	/**
	 * The number of structural features of the '<em>Ether CAT Master</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETHER_CAT_MASTER_FEATURE_COUNT = BUS_MASTER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Ether CAT Master</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETHER_CAT_MASTER_OPERATION_COUNT = BUS_MASTER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.impl.EtherCATSlaveImpl <em>Ether CAT Slave</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.impl.EtherCATSlaveImpl
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.impl.BusComponentsPackageImpl#getEtherCATSlave()
	 * @generated
	 */
	int ETHER_CAT_SLAVE = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETHER_CAT_SLAVE__ID = BUS_SLAVE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETHER_CAT_SLAVE__NAME = BUS_SLAVE__NAME;

	/**
	 * The feature id for the '<em><b>Connected Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETHER_CAT_SLAVE__CONNECTED_INTERFACES = BUS_SLAVE__CONNECTED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETHER_CAT_SLAVE__PARENT = BUS_SLAVE__PARENT;

	/**
	 * The feature id for the '<em><b>Parent Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETHER_CAT_SLAVE__PARENT_MODULE = BUS_SLAVE__PARENT_MODULE;

	/**
	 * The feature id for the '<em><b>Signalinterface master</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETHER_CAT_SLAVE__SIGNALINTERFACE_MASTER = BUS_SLAVE__SIGNALINTERFACE_MASTER;

	/**
	 * The feature id for the '<em><b>Signalinterface slave</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETHER_CAT_SLAVE__SIGNALINTERFACE_SLAVE = BUS_SLAVE__SIGNALINTERFACE_SLAVE;

	/**
	 * The number of structural features of the '<em>Ether CAT Slave</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETHER_CAT_SLAVE_FEATURE_COUNT = BUS_SLAVE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Ether CAT Slave</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETHER_CAT_SLAVE_OPERATION_COUNT = BUS_SLAVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.impl.EtherCATCableImpl <em>Ether CAT Cable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.impl.EtherCATCableImpl
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.impl.BusComponentsPackageImpl#getEtherCATCable()
	 * @generated
	 */
	int ETHER_CAT_CABLE = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETHER_CAT_CABLE__ID = BUS_CABLE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETHER_CAT_CABLE__NAME = BUS_CABLE__NAME;

	/**
	 * The feature id for the '<em><b>Connected Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETHER_CAT_CABLE__CONNECTED_INTERFACES = BUS_CABLE__CONNECTED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETHER_CAT_CABLE__PARENT = BUS_CABLE__PARENT;

	/**
	 * The feature id for the '<em><b>Parent Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETHER_CAT_CABLE__PARENT_MODULE = BUS_CABLE__PARENT_MODULE;

	/**
	 * The feature id for the '<em><b>Signal Plug1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETHER_CAT_CABLE__SIGNAL_PLUG1 = BUS_CABLE__SIGNAL_PLUG1;

	/**
	 * The feature id for the '<em><b>Signal Plug2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETHER_CAT_CABLE__SIGNAL_PLUG2 = BUS_CABLE__SIGNAL_PLUG2;

	/**
	 * The number of structural features of the '<em>Ether CAT Cable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETHER_CAT_CABLE_FEATURE_COUNT = BUS_CABLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Ether CAT Cable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETHER_CAT_CABLE_OPERATION_COUNT = BUS_CABLE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.BusBox <em>Bus Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bus Box</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.BusBox
	 * @generated
	 */
	EClass getBusBox();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.BusBox#getSignalinterfaces <em>Signalinterfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Signalinterfaces</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.BusBox#getSignalinterfaces()
	 * @see #getBusBox()
	 * @generated
	 */
	EReference getBusBox_Signalinterfaces();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.BusBox#getSignalinterface_master <em>Signalinterface master</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Signalinterface master</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.BusBox#getSignalinterface_master()
	 * @see #getBusBox()
	 * @generated
	 */
	EReference getBusBox_Signalinterface_master();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.BusBox#getSignalinterface_box <em>Signalinterface box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Signalinterface box</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.BusBox#getSignalinterface_box()
	 * @see #getBusBox()
	 * @generated
	 */
	EReference getBusBox_Signalinterface_box();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.BusBox#getPowersupply <em>Powersupply</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Powersupply</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.BusBox#getPowersupply()
	 * @see #getBusBox()
	 * @generated
	 */
	EReference getBusBox_Powersupply();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.BusMaster <em>Bus Master</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bus Master</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.BusMaster
	 * @generated
	 */
	EClass getBusMaster();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.BusMaster#getSignalinterfaces <em>Signalinterfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Signalinterfaces</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.BusMaster#getSignalinterfaces()
	 * @see #getBusMaster()
	 * @generated
	 */
	EReference getBusMaster_Signalinterfaces();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.BusMaster#getSignalinterface_controller <em>Signalinterface controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Signalinterface controller</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.BusMaster#getSignalinterface_controller()
	 * @see #getBusMaster()
	 * @generated
	 */
	EReference getBusMaster_Signalinterface_controller();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.BusSlave <em>Bus Slave</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bus Slave</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.BusSlave
	 * @generated
	 */
	EClass getBusSlave();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.BusSlave#getSignalinterface_master <em>Signalinterface master</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Signalinterface master</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.BusSlave#getSignalinterface_master()
	 * @see #getBusSlave()
	 * @generated
	 */
	EReference getBusSlave_Signalinterface_master();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.BusSlave#getSignalinterface_slave <em>Signalinterface slave</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Signalinterface slave</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.BusSlave#getSignalinterface_slave()
	 * @see #getBusSlave()
	 * @generated
	 */
	EReference getBusSlave_Signalinterface_slave();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.BusCable <em>Bus Cable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bus Cable</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.BusCable
	 * @generated
	 */
	EClass getBusCable();

	/**
	 * Returns the meta object for the containment reference '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.BusCable#getSignalPlug1 <em>Signal Plug1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Signal Plug1</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.BusCable#getSignalPlug1()
	 * @see #getBusCable()
	 * @generated
	 */
	EReference getBusCable_SignalPlug1();

	/**
	 * Returns the meta object for the containment reference '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.BusCable#getSignalPlug2 <em>Signal Plug2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Signal Plug2</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.BusCable#getSignalPlug2()
	 * @see #getBusCable()
	 * @generated
	 */
	EReference getBusCable_SignalPlug2();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.ProfibusDPBox <em>Profibus DP Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Profibus DP Box</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.ProfibusDPBox
	 * @generated
	 */
	EClass getProfibusDPBox();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.ProfibusDPMaster <em>Profibus DP Master</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Profibus DP Master</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.ProfibusDPMaster
	 * @generated
	 */
	EClass getProfibusDPMaster();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.ProfibusDPSlave <em>Profibus DP Slave</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Profibus DP Slave</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.ProfibusDPSlave
	 * @generated
	 */
	EClass getProfibusDPSlave();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.ProfibusDPCable <em>Profibus DP Cable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Profibus DP Cable</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.ProfibusDPCable
	 * @generated
	 */
	EClass getProfibusDPCable();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.EtherCATBox <em>Ether CAT Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ether CAT Box</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.EtherCATBox
	 * @generated
	 */
	EClass getEtherCATBox();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.EtherCATMaster <em>Ether CAT Master</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ether CAT Master</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.EtherCATMaster
	 * @generated
	 */
	EClass getEtherCATMaster();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.EtherCATSlave <em>Ether CAT Slave</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ether CAT Slave</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.EtherCATSlave
	 * @generated
	 */
	EClass getEtherCATSlave();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.EtherCATCable <em>Ether CAT Cable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ether CAT Cable</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.EtherCATCable
	 * @generated
	 */
	EClass getEtherCATCable();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BusComponentsFactory getBusComponentsFactory();

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
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.impl.BusBoxImpl <em>Bus Box</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.impl.BusBoxImpl
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.impl.BusComponentsPackageImpl#getBusBox()
		 * @generated
		 */
		EClass BUS_BOX = eINSTANCE.getBusBox();

		/**
		 * The meta object literal for the '<em><b>Signalinterfaces</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUS_BOX__SIGNALINTERFACES = eINSTANCE.getBusBox_Signalinterfaces();

		/**
		 * The meta object literal for the '<em><b>Signalinterface master</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUS_BOX__SIGNALINTERFACE_MASTER = eINSTANCE.getBusBox_Signalinterface_master();

		/**
		 * The meta object literal for the '<em><b>Signalinterface box</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUS_BOX__SIGNALINTERFACE_BOX = eINSTANCE.getBusBox_Signalinterface_box();

		/**
		 * The meta object literal for the '<em><b>Powersupply</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUS_BOX__POWERSUPPLY = eINSTANCE.getBusBox_Powersupply();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.impl.BusMasterImpl <em>Bus Master</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.impl.BusMasterImpl
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.impl.BusComponentsPackageImpl#getBusMaster()
		 * @generated
		 */
		EClass BUS_MASTER = eINSTANCE.getBusMaster();

		/**
		 * The meta object literal for the '<em><b>Signalinterfaces</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUS_MASTER__SIGNALINTERFACES = eINSTANCE.getBusMaster_Signalinterfaces();

		/**
		 * The meta object literal for the '<em><b>Signalinterface controller</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUS_MASTER__SIGNALINTERFACE_CONTROLLER = eINSTANCE.getBusMaster_Signalinterface_controller();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.impl.BusSlaveImpl <em>Bus Slave</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.impl.BusSlaveImpl
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.impl.BusComponentsPackageImpl#getBusSlave()
		 * @generated
		 */
		EClass BUS_SLAVE = eINSTANCE.getBusSlave();

		/**
		 * The meta object literal for the '<em><b>Signalinterface master</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUS_SLAVE__SIGNALINTERFACE_MASTER = eINSTANCE.getBusSlave_Signalinterface_master();

		/**
		 * The meta object literal for the '<em><b>Signalinterface slave</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUS_SLAVE__SIGNALINTERFACE_SLAVE = eINSTANCE.getBusSlave_Signalinterface_slave();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.impl.BusCableImpl <em>Bus Cable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.impl.BusCableImpl
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.impl.BusComponentsPackageImpl#getBusCable()
		 * @generated
		 */
		EClass BUS_CABLE = eINSTANCE.getBusCable();

		/**
		 * The meta object literal for the '<em><b>Signal Plug1</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUS_CABLE__SIGNAL_PLUG1 = eINSTANCE.getBusCable_SignalPlug1();

		/**
		 * The meta object literal for the '<em><b>Signal Plug2</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUS_CABLE__SIGNAL_PLUG2 = eINSTANCE.getBusCable_SignalPlug2();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.impl.ProfibusDPBoxImpl <em>Profibus DP Box</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.impl.ProfibusDPBoxImpl
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.impl.BusComponentsPackageImpl#getProfibusDPBox()
		 * @generated
		 */
		EClass PROFIBUS_DP_BOX = eINSTANCE.getProfibusDPBox();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.impl.ProfibusDPMasterImpl <em>Profibus DP Master</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.impl.ProfibusDPMasterImpl
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.impl.BusComponentsPackageImpl#getProfibusDPMaster()
		 * @generated
		 */
		EClass PROFIBUS_DP_MASTER = eINSTANCE.getProfibusDPMaster();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.impl.ProfibusDPSlaveImpl <em>Profibus DP Slave</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.impl.ProfibusDPSlaveImpl
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.impl.BusComponentsPackageImpl#getProfibusDPSlave()
		 * @generated
		 */
		EClass PROFIBUS_DP_SLAVE = eINSTANCE.getProfibusDPSlave();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.impl.ProfibusDPCableImpl <em>Profibus DP Cable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.impl.ProfibusDPCableImpl
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.impl.BusComponentsPackageImpl#getProfibusDPCable()
		 * @generated
		 */
		EClass PROFIBUS_DP_CABLE = eINSTANCE.getProfibusDPCable();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.impl.EtherCATBoxImpl <em>Ether CAT Box</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.impl.EtherCATBoxImpl
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.impl.BusComponentsPackageImpl#getEtherCATBox()
		 * @generated
		 */
		EClass ETHER_CAT_BOX = eINSTANCE.getEtherCATBox();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.impl.EtherCATMasterImpl <em>Ether CAT Master</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.impl.EtherCATMasterImpl
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.impl.BusComponentsPackageImpl#getEtherCATMaster()
		 * @generated
		 */
		EClass ETHER_CAT_MASTER = eINSTANCE.getEtherCATMaster();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.impl.EtherCATSlaveImpl <em>Ether CAT Slave</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.impl.EtherCATSlaveImpl
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.impl.BusComponentsPackageImpl#getEtherCATSlave()
		 * @generated
		 */
		EClass ETHER_CAT_SLAVE = eINSTANCE.getEtherCATSlave();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.impl.EtherCATCableImpl <em>Ether CAT Cable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.impl.EtherCATCableImpl
		 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.impl.BusComponentsPackageImpl#getEtherCATCable()
		 * @generated
		 */
		EClass ETHER_CAT_CABLE = eINSTANCE.getEtherCATCable();

	}

} //BusComponentsPackage
