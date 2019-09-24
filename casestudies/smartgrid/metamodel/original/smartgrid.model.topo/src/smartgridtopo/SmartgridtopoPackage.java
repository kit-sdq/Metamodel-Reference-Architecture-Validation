/**
 */
package smartgridtopo;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc --> The <b>Package</b> for the model. It contains accessors for the meta
 * objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each operation of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * 
 * @see smartgridtopo.SmartgridtopoFactory
 * @model kind="package"
 * @generated
 */
public interface SmartgridtopoPackage extends EPackage {
    /**
     * The package name. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    String eNAME = "smartgridtopo";

    /**
     * The package namespace URI. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    String eNS_URI = "http://sdq.ipd.uka.de/smartgridtopo/1.1";

    /**
     * The package namespace name. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    String eNS_PREFIX = "smartgridtopo";

    /**
     * The singleton instance of the package. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    SmartgridtopoPackage eINSTANCE = smartgridtopo.impl.SmartgridtopoPackageImpl.init();

    /**
     * The meta object id for the '{@link smartgridtopo.Identifier <em>Identifier</em>}' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see smartgridtopo.Identifier
     * @see smartgridtopo.impl.SmartgridtopoPackageImpl#getIdentifier()
     * @generated
     */
    int IDENTIFIER = 2;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int IDENTIFIER__ID = 0;

    /**
     * The number of structural features of the '<em>Identifier</em>' class. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int IDENTIFIER_FEATURE_COUNT = 1;

    /**
     * The number of operations of the '<em>Identifier</em>' class. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int IDENTIFIER_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link smartgridtopo.NamedIdentifier <em>Named Identifier</em>}'
     * class. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see smartgridtopo.NamedIdentifier
     * @see smartgridtopo.impl.SmartgridtopoPackageImpl#getNamedIdentifier()
     * @generated
     */
    int NAMED_IDENTIFIER = 3;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int NAMED_IDENTIFIER__ID = IDENTIFIER__ID;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int NAMED_IDENTIFIER__NAME = IDENTIFIER_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Named Identifier</em>' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int NAMED_IDENTIFIER_FEATURE_COUNT = IDENTIFIER_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Named Identifier</em>' class. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int NAMED_IDENTIFIER_OPERATION_COUNT = IDENTIFIER_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link smartgridtopo.impl.SmartGridTopologyImpl <em>Smart Grid
     * Topology</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see smartgridtopo.impl.SmartGridTopologyImpl
     * @see smartgridtopo.impl.SmartgridtopoPackageImpl#getSmartGridTopology()
     * @generated
     */
    int SMART_GRID_TOPOLOGY = 0;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SMART_GRID_TOPOLOGY__ID = NAMED_IDENTIFIER__ID;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SMART_GRID_TOPOLOGY__NAME = NAMED_IDENTIFIER__NAME;

    /**
     * The feature id for the '<em><b>Contains NE</b></em>' containment reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SMART_GRID_TOPOLOGY__CONTAINS_NE = NAMED_IDENTIFIER_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Contains PGN</b></em>' containment reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SMART_GRID_TOPOLOGY__CONTAINS_PGN = NAMED_IDENTIFIER_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Contains PC</b></em>' containment reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SMART_GRID_TOPOLOGY__CONTAINS_PC = NAMED_IDENTIFIER_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Contains LC</b></em>' containment reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SMART_GRID_TOPOLOGY__CONTAINS_LC = NAMED_IDENTIFIER_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Smart Grid Topology</em>' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SMART_GRID_TOPOLOGY_FEATURE_COUNT = NAMED_IDENTIFIER_FEATURE_COUNT + 4;

    /**
     * The number of operations of the '<em>Smart Grid Topology</em>' class. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SMART_GRID_TOPOLOGY_OPERATION_COUNT = NAMED_IDENTIFIER_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link smartgridtopo.NamedEntity <em>Named Entity</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see smartgridtopo.NamedEntity
     * @see smartgridtopo.impl.SmartgridtopoPackageImpl#getNamedEntity()
     * @generated
     */
    int NAMED_ENTITY = 1;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int NAMED_ENTITY__NAME = 0;

    /**
     * The number of structural features of the '<em>Named Entity</em>' class. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int NAMED_ENTITY_FEATURE_COUNT = 1;

    /**
     * The number of operations of the '<em>Named Entity</em>' class. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int NAMED_ENTITY_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link smartgridtopo.impl.NetworkEntityImpl <em>Network
     * Entity</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see smartgridtopo.impl.NetworkEntityImpl
     * @see smartgridtopo.impl.SmartgridtopoPackageImpl#getNetworkEntity()
     * @generated
     */
    int NETWORK_ENTITY = 4;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int NETWORK_ENTITY__ID = NAMED_IDENTIFIER__ID;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int NETWORK_ENTITY__NAME = NAMED_IDENTIFIER__NAME;

    /**
     * The feature id for the '<em><b>Connected To</b></em>' reference list. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int NETWORK_ENTITY__CONNECTED_TO = NAMED_IDENTIFIER_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Linked By</b></em>' reference list. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int NETWORK_ENTITY__LINKED_BY = NAMED_IDENTIFIER_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Network Entity</em>' class. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int NETWORK_ENTITY_FEATURE_COUNT = NAMED_IDENTIFIER_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Network Entity</em>' class. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int NETWORK_ENTITY_OPERATION_COUNT = NAMED_IDENTIFIER_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link smartgridtopo.impl.PowerGridNodeImpl <em>Power Grid
     * Node</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see smartgridtopo.impl.PowerGridNodeImpl
     * @see smartgridtopo.impl.SmartgridtopoPackageImpl#getPowerGridNode()
     * @generated
     */
    int POWER_GRID_NODE = 5;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int POWER_GRID_NODE__ID = NAMED_IDENTIFIER__ID;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int POWER_GRID_NODE__NAME = NAMED_IDENTIFIER__NAME;

    /**
     * The number of structural features of the '<em>Power Grid Node</em>' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int POWER_GRID_NODE_FEATURE_COUNT = NAMED_IDENTIFIER_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Power Grid Node</em>' class. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int POWER_GRID_NODE_OPERATION_COUNT = NAMED_IDENTIFIER_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link smartgridtopo.impl.CommunicatingEntityImpl
     * <em>Communicating Entity</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see smartgridtopo.impl.CommunicatingEntityImpl
     * @see smartgridtopo.impl.SmartgridtopoPackageImpl#getCommunicatingEntity()
     * @generated
     */
    int COMMUNICATING_ENTITY = 15;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int COMMUNICATING_ENTITY__ID = NETWORK_ENTITY__ID;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int COMMUNICATING_ENTITY__NAME = NETWORK_ENTITY__NAME;

    /**
     * The feature id for the '<em><b>Connected To</b></em>' reference list. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int COMMUNICATING_ENTITY__CONNECTED_TO = NETWORK_ENTITY__CONNECTED_TO;

    /**
     * The feature id for the '<em><b>Linked By</b></em>' reference list. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int COMMUNICATING_ENTITY__LINKED_BY = NETWORK_ENTITY__LINKED_BY;

    /**
     * The feature id for the '<em><b>Communicates By</b></em>' reference list. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int COMMUNICATING_ENTITY__COMMUNICATES_BY = NETWORK_ENTITY_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Communicating Entity</em>' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int COMMUNICATING_ENTITY_FEATURE_COUNT = NETWORK_ENTITY_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Communicating Entity</em>' class. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int COMMUNICATING_ENTITY_OPERATION_COUNT = NETWORK_ENTITY_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link smartgridtopo.impl.SmartMeterImpl <em>Smart Meter</em>}'
     * class. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see smartgridtopo.impl.SmartMeterImpl
     * @see smartgridtopo.impl.SmartgridtopoPackageImpl#getSmartMeter()
     * @generated
     */
    int SMART_METER = 6;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SMART_METER__ID = COMMUNICATING_ENTITY__ID;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SMART_METER__NAME = COMMUNICATING_ENTITY__NAME;

    /**
     * The feature id for the '<em><b>Connected To</b></em>' reference list. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SMART_METER__CONNECTED_TO = COMMUNICATING_ENTITY__CONNECTED_TO;

    /**
     * The feature id for the '<em><b>Linked By</b></em>' reference list. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SMART_METER__LINKED_BY = COMMUNICATING_ENTITY__LINKED_BY;

    /**
     * The feature id for the '<em><b>Communicates By</b></em>' reference list. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SMART_METER__COMMUNICATES_BY = COMMUNICATING_ENTITY__COMMUNICATES_BY;

    /**
     * The feature id for the '<em><b>Is A</b></em>' reference. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SMART_METER__IS_A = COMMUNICATING_ENTITY_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Aggregation</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SMART_METER__AGGREGATION = COMMUNICATING_ENTITY_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Smart Meter</em>' class. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SMART_METER_FEATURE_COUNT = COMMUNICATING_ENTITY_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Smart Meter</em>' class. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SMART_METER_OPERATION_COUNT = COMMUNICATING_ENTITY_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link smartgridtopo.impl.SmartMeterTypeImpl <em>Smart Meter
     * Type</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see smartgridtopo.impl.SmartMeterTypeImpl
     * @see smartgridtopo.impl.SmartgridtopoPackageImpl#getSmartMeterType()
     * @generated
     */
    int SMART_METER_TYPE = 7;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SMART_METER_TYPE__ID = NAMED_IDENTIFIER__ID;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SMART_METER_TYPE__NAME = NAMED_IDENTIFIER__NAME;

    /**
     * The number of structural features of the '<em>Smart Meter Type</em>' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SMART_METER_TYPE_FEATURE_COUNT = NAMED_IDENTIFIER_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Smart Meter Type</em>' class. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SMART_METER_TYPE_OPERATION_COUNT = NAMED_IDENTIFIER_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link smartgridtopo.impl.PhysicalConnectionImpl <em>Physical
     * Connection</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see smartgridtopo.impl.PhysicalConnectionImpl
     * @see smartgridtopo.impl.SmartgridtopoPackageImpl#getPhysicalConnection()
     * @generated
     */
    int PHYSICAL_CONNECTION = 8;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PHYSICAL_CONNECTION__NAME = NAMED_ENTITY__NAME;

    /**
     * The feature id for the '<em><b>Links</b></em>' reference list. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PHYSICAL_CONNECTION__LINKS = NAMED_ENTITY_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Is A</b></em>' reference. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PHYSICAL_CONNECTION__IS_A = NAMED_ENTITY_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Physical Connection</em>' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PHYSICAL_CONNECTION_FEATURE_COUNT = NAMED_ENTITY_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Physical Connection</em>' class. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PHYSICAL_CONNECTION_OPERATION_COUNT = NAMED_ENTITY_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link smartgridtopo.impl.RepositoryImpl <em>Repository</em>}'
     * class. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see smartgridtopo.impl.RepositoryImpl
     * @see smartgridtopo.impl.SmartgridtopoPackageImpl#getRepository()
     * @generated
     */
    int REPOSITORY = 9;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REPOSITORY__ID = NAMED_IDENTIFIER__ID;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REPOSITORY__NAME = NAMED_IDENTIFIER__NAME;

    /**
     * The feature id for the '<em><b>Contains Smart Meter Types</b></em>' containment reference
     * list. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REPOSITORY__CONTAINS_SMART_METER_TYPES = NAMED_IDENTIFIER_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Contains Connection Type</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REPOSITORY__CONTAINS_CONNECTION_TYPE = NAMED_IDENTIFIER_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Contains Network Node Types</b></em>' containment reference
     * list. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REPOSITORY__CONTAINS_NETWORK_NODE_TYPES = NAMED_IDENTIFIER_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Repository</em>' class. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REPOSITORY_FEATURE_COUNT = NAMED_IDENTIFIER_FEATURE_COUNT + 3;

    /**
     * The number of operations of the '<em>Repository</em>' class. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REPOSITORY_OPERATION_COUNT = NAMED_IDENTIFIER_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link smartgridtopo.impl.ConnectionTypeImpl <em>Connection
     * Type</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see smartgridtopo.impl.ConnectionTypeImpl
     * @see smartgridtopo.impl.SmartgridtopoPackageImpl#getConnectionType()
     * @generated
     */
    int CONNECTION_TYPE = 10;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int CONNECTION_TYPE__ID = NAMED_IDENTIFIER__ID;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int CONNECTION_TYPE__NAME = NAMED_IDENTIFIER__NAME;

    /**
     * The number of structural features of the '<em>Connection Type</em>' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int CONNECTION_TYPE_FEATURE_COUNT = NAMED_IDENTIFIER_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Connection Type</em>' class. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int CONNECTION_TYPE_OPERATION_COUNT = NAMED_IDENTIFIER_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link smartgridtopo.impl.NetworkNodeImpl <em>Network Node</em>}'
     * class. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see smartgridtopo.impl.NetworkNodeImpl
     * @see smartgridtopo.impl.SmartgridtopoPackageImpl#getNetworkNode()
     * @generated
     */
    int NETWORK_NODE = 11;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int NETWORK_NODE__ID = NETWORK_ENTITY__ID;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int NETWORK_NODE__NAME = NETWORK_ENTITY__NAME;

    /**
     * The feature id for the '<em><b>Connected To</b></em>' reference list. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int NETWORK_NODE__CONNECTED_TO = NETWORK_ENTITY__CONNECTED_TO;

    /**
     * The feature id for the '<em><b>Linked By</b></em>' reference list. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int NETWORK_NODE__LINKED_BY = NETWORK_ENTITY__LINKED_BY;

    /**
     * The feature id for the '<em><b>Is A</b></em>' reference. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int NETWORK_NODE__IS_A = NETWORK_ENTITY_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Network Node</em>' class. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int NETWORK_NODE_FEATURE_COUNT = NETWORK_ENTITY_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Network Node</em>' class. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int NETWORK_NODE_OPERATION_COUNT = NETWORK_ENTITY_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link smartgridtopo.impl.NetworkNodeTypeImpl <em>Network Node
     * Type</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see smartgridtopo.impl.NetworkNodeTypeImpl
     * @see smartgridtopo.impl.SmartgridtopoPackageImpl#getNetworkNodeType()
     * @generated
     */
    int NETWORK_NODE_TYPE = 12;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int NETWORK_NODE_TYPE__ID = NAMED_IDENTIFIER__ID;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int NETWORK_NODE_TYPE__NAME = NAMED_IDENTIFIER__NAME;

    /**
     * The feature id for the '<em><b>Is A</b></em>' reference. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int NETWORK_NODE_TYPE__IS_A = NAMED_IDENTIFIER_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Network Node Type</em>' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int NETWORK_NODE_TYPE_FEATURE_COUNT = NAMED_IDENTIFIER_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Network Node Type</em>' class. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int NETWORK_NODE_TYPE_OPERATION_COUNT = NAMED_IDENTIFIER_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link smartgridtopo.impl.ControlCenterImpl <em>Control
     * Center</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see smartgridtopo.impl.ControlCenterImpl
     * @see smartgridtopo.impl.SmartgridtopoPackageImpl#getControlCenter()
     * @generated
     */
    int CONTROL_CENTER = 13;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int CONTROL_CENTER__ID = COMMUNICATING_ENTITY__ID;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int CONTROL_CENTER__NAME = COMMUNICATING_ENTITY__NAME;

    /**
     * The feature id for the '<em><b>Connected To</b></em>' reference list. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int CONTROL_CENTER__CONNECTED_TO = COMMUNICATING_ENTITY__CONNECTED_TO;

    /**
     * The feature id for the '<em><b>Linked By</b></em>' reference list. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int CONTROL_CENTER__LINKED_BY = COMMUNICATING_ENTITY__LINKED_BY;

    /**
     * The feature id for the '<em><b>Communicates By</b></em>' reference list. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int CONTROL_CENTER__COMMUNICATES_BY = COMMUNICATING_ENTITY__COMMUNICATES_BY;

    /**
     * The number of structural features of the '<em>Control Center</em>' class. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int CONTROL_CENTER_FEATURE_COUNT = COMMUNICATING_ENTITY_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Control Center</em>' class. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int CONTROL_CENTER_OPERATION_COUNT = COMMUNICATING_ENTITY_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link smartgridtopo.impl.GenericControllerImpl <em>Generic
     * Controller</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see smartgridtopo.impl.GenericControllerImpl
     * @see smartgridtopo.impl.SmartgridtopoPackageImpl#getGenericController()
     * @generated
     */
    int GENERIC_CONTROLLER = 14;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int GENERIC_CONTROLLER__ID = COMMUNICATING_ENTITY__ID;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int GENERIC_CONTROLLER__NAME = COMMUNICATING_ENTITY__NAME;

    /**
     * The feature id for the '<em><b>Connected To</b></em>' reference list. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int GENERIC_CONTROLLER__CONNECTED_TO = COMMUNICATING_ENTITY__CONNECTED_TO;

    /**
     * The feature id for the '<em><b>Linked By</b></em>' reference list. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int GENERIC_CONTROLLER__LINKED_BY = COMMUNICATING_ENTITY__LINKED_BY;

    /**
     * The feature id for the '<em><b>Communicates By</b></em>' reference list. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int GENERIC_CONTROLLER__COMMUNICATES_BY = COMMUNICATING_ENTITY__COMMUNICATES_BY;

    /**
     * The number of structural features of the '<em>Generic Controller</em>' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int GENERIC_CONTROLLER_FEATURE_COUNT = COMMUNICATING_ENTITY_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Generic Controller</em>' class. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int GENERIC_CONTROLLER_OPERATION_COUNT = COMMUNICATING_ENTITY_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link smartgridtopo.impl.InterComImpl <em>Inter Com</em>}'
     * class. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see smartgridtopo.impl.InterComImpl
     * @see smartgridtopo.impl.SmartgridtopoPackageImpl#getInterCom()
     * @generated
     */
    int INTER_COM = 16;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int INTER_COM__ID = COMMUNICATING_ENTITY__ID;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int INTER_COM__NAME = COMMUNICATING_ENTITY__NAME;

    /**
     * The feature id for the '<em><b>Connected To</b></em>' reference list. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int INTER_COM__CONNECTED_TO = COMMUNICATING_ENTITY__CONNECTED_TO;

    /**
     * The feature id for the '<em><b>Linked By</b></em>' reference list. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int INTER_COM__LINKED_BY = COMMUNICATING_ENTITY__LINKED_BY;

    /**
     * The feature id for the '<em><b>Communicates By</b></em>' reference list. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int INTER_COM__COMMUNICATES_BY = COMMUNICATING_ENTITY__COMMUNICATES_BY;

    /**
     * The number of structural features of the '<em>Inter Com</em>' class. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int INTER_COM_FEATURE_COUNT = COMMUNICATING_ENTITY_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Inter Com</em>' class. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int INTER_COM_OPERATION_COUNT = COMMUNICATING_ENTITY_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link smartgridtopo.impl.LogicalCommunicationImpl <em>Logical
     * Communication</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see smartgridtopo.impl.LogicalCommunicationImpl
     * @see smartgridtopo.impl.SmartgridtopoPackageImpl#getLogicalCommunication()
     * @generated
     */
    int LOGICAL_COMMUNICATION = 17;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int LOGICAL_COMMUNICATION__NAME = NAMED_ENTITY__NAME;

    /**
     * The feature id for the '<em><b>Links</b></em>' reference list. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int LOGICAL_COMMUNICATION__LINKS = NAMED_ENTITY_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Logical Communication</em>' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int LOGICAL_COMMUNICATION_FEATURE_COUNT = NAMED_ENTITY_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Logical Communication</em>' class. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int LOGICAL_COMMUNICATION_OPERATION_COUNT = NAMED_ENTITY_OPERATION_COUNT + 0;

    /**
     * Returns the meta object for class '{@link smartgridtopo.SmartGridTopology <em>Smart Grid
     * Topology</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for class '<em>Smart Grid Topology</em>'.
     * @see smartgridtopo.SmartGridTopology
     * @generated
     */
    EClass getSmartGridTopology();

    /**
     * Returns the meta object for the containment reference list
     * '{@link smartgridtopo.SmartGridTopology#getContainsNE <em>Contains NE</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the containment reference list '<em>Contains NE</em>'.
     * @see smartgridtopo.SmartGridTopology#getContainsNE()
     * @see #getSmartGridTopology()
     * @generated
     */
    EReference getSmartGridTopology_ContainsNE();

    /**
     * Returns the meta object for the containment reference list
     * '{@link smartgridtopo.SmartGridTopology#getContainsPGN <em>Contains PGN</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the containment reference list '<em>Contains PGN</em>'.
     * @see smartgridtopo.SmartGridTopology#getContainsPGN()
     * @see #getSmartGridTopology()
     * @generated
     */
    EReference getSmartGridTopology_ContainsPGN();

    /**
     * Returns the meta object for the containment reference list
     * '{@link smartgridtopo.SmartGridTopology#getContainsPC <em>Contains PC</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the containment reference list '<em>Contains PC</em>'.
     * @see smartgridtopo.SmartGridTopology#getContainsPC()
     * @see #getSmartGridTopology()
     * @generated
     */
    EReference getSmartGridTopology_ContainsPC();

    /**
     * Returns the meta object for the containment reference list
     * '{@link smartgridtopo.SmartGridTopology#getContainsLC <em>Contains LC</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the containment reference list '<em>Contains LC</em>'.
     * @see smartgridtopo.SmartGridTopology#getContainsLC()
     * @see #getSmartGridTopology()
     * @generated
     */
    EReference getSmartGridTopology_ContainsLC();

    /**
     * Returns the meta object for class '{@link smartgridtopo.NamedEntity <em>Named Entity</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for class '<em>Named Entity</em>'.
     * @see smartgridtopo.NamedEntity
     * @generated
     */
    EClass getNamedEntity();

    /**
     * Returns the meta object for the attribute '{@link smartgridtopo.NamedEntity#getName
     * <em>Name</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see smartgridtopo.NamedEntity#getName()
     * @see #getNamedEntity()
     * @generated
     */
    EAttribute getNamedEntity_Name();

    /**
     * Returns the meta object for class '{@link smartgridtopo.Identifier <em>Identifier</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for class '<em>Identifier</em>'.
     * @see smartgridtopo.Identifier
     * @generated
     */
    EClass getIdentifier();

    /**
     * Returns the meta object for the attribute '{@link smartgridtopo.Identifier#getId
     * <em>Id</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the attribute '<em>Id</em>'.
     * @see smartgridtopo.Identifier#getId()
     * @see #getIdentifier()
     * @generated
     */
    EAttribute getIdentifier_Id();

    /**
     * Returns the meta object for class '{@link smartgridtopo.NamedIdentifier <em>Named
     * Identifier</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for class '<em>Named Identifier</em>'.
     * @see smartgridtopo.NamedIdentifier
     * @generated
     */
    EClass getNamedIdentifier();

    /**
     * Returns the meta object for class '{@link smartgridtopo.NetworkEntity <em>Network
     * Entity</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for class '<em>Network Entity</em>'.
     * @see smartgridtopo.NetworkEntity
     * @generated
     */
    EClass getNetworkEntity();

    /**
     * Returns the meta object for the reference list
     * '{@link smartgridtopo.NetworkEntity#getConnectedTo <em>Connected To</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the reference list '<em>Connected To</em>'.
     * @see smartgridtopo.NetworkEntity#getConnectedTo()
     * @see #getNetworkEntity()
     * @generated
     */
    EReference getNetworkEntity_ConnectedTo();

    /**
     * Returns the meta object for the reference list
     * '{@link smartgridtopo.NetworkEntity#getLinkedBy <em>Linked By</em>}'. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @return the meta object for the reference list '<em>Linked By</em>'.
     * @see smartgridtopo.NetworkEntity#getLinkedBy()
     * @see #getNetworkEntity()
     * @generated
     */
    EReference getNetworkEntity_LinkedBy();

    /**
     * Returns the meta object for class '{@link smartgridtopo.PowerGridNode <em>Power Grid
     * Node</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for class '<em>Power Grid Node</em>'.
     * @see smartgridtopo.PowerGridNode
     * @generated
     */
    EClass getPowerGridNode();

    /**
     * Returns the meta object for class '{@link smartgridtopo.SmartMeter <em>Smart Meter</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for class '<em>Smart Meter</em>'.
     * @see smartgridtopo.SmartMeter
     * @generated
     */
    EClass getSmartMeter();

    /**
     * Returns the meta object for the reference '{@link smartgridtopo.SmartMeter#getIsA <em>Is
     * A</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the reference '<em>Is A</em>'.
     * @see smartgridtopo.SmartMeter#getIsA()
     * @see #getSmartMeter()
     * @generated
     */
    EReference getSmartMeter_IsA();

    /**
     * Returns the meta object for the attribute '{@link smartgridtopo.SmartMeter#getAggregation
     * <em>Aggregation</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the attribute '<em>Aggregation</em>'.
     * @see smartgridtopo.SmartMeter#getAggregation()
     * @see #getSmartMeter()
     * @generated
     */
    EAttribute getSmartMeter_Aggregation();

    /**
     * Returns the meta object for class '{@link smartgridtopo.SmartMeterType <em>Smart Meter
     * Type</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for class '<em>Smart Meter Type</em>'.
     * @see smartgridtopo.SmartMeterType
     * @generated
     */
    EClass getSmartMeterType();

    /**
     * Returns the meta object for class '{@link smartgridtopo.PhysicalConnection <em>Physical
     * Connection</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for class '<em>Physical Connection</em>'.
     * @see smartgridtopo.PhysicalConnection
     * @generated
     */
    EClass getPhysicalConnection();

    /**
     * Returns the meta object for the reference list
     * '{@link smartgridtopo.PhysicalConnection#getLinks <em>Links</em>}'. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @return the meta object for the reference list '<em>Links</em>'.
     * @see smartgridtopo.PhysicalConnection#getLinks()
     * @see #getPhysicalConnection()
     * @generated
     */
    EReference getPhysicalConnection_Links();

    /**
     * Returns the meta object for the reference '{@link smartgridtopo.PhysicalConnection#getIsA
     * <em>Is A</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the reference '<em>Is A</em>'.
     * @see smartgridtopo.PhysicalConnection#getIsA()
     * @see #getPhysicalConnection()
     * @generated
     */
    EReference getPhysicalConnection_IsA();

    /**
     * Returns the meta object for class '{@link smartgridtopo.Repository <em>Repository</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for class '<em>Repository</em>'.
     * @see smartgridtopo.Repository
     * @generated
     */
    EClass getRepository();

    /**
     * Returns the meta object for the containment reference list
     * '{@link smartgridtopo.Repository#getContainsSmartMeterTypes <em>Contains Smart Meter
     * Types</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the containment reference list '<em>Contains Smart Meter
     *         Types</em>'.
     * @see smartgridtopo.Repository#getContainsSmartMeterTypes()
     * @see #getRepository()
     * @generated
     */
    EReference getRepository_ContainsSmartMeterTypes();

    /**
     * Returns the meta object for the containment reference list
     * '{@link smartgridtopo.Repository#getContainsConnectionType <em>Contains Connection
     * Type</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the containment reference list '<em>Contains Connection
     *         Type</em>'.
     * @see smartgridtopo.Repository#getContainsConnectionType()
     * @see #getRepository()
     * @generated
     */
    EReference getRepository_ContainsConnectionType();

    /**
     * Returns the meta object for the containment reference list
     * '{@link smartgridtopo.Repository#getContainsNetworkNodeTypes <em>Contains Network Node
     * Types</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the containment reference list '<em>Contains Network Node
     *         Types</em>'.
     * @see smartgridtopo.Repository#getContainsNetworkNodeTypes()
     * @see #getRepository()
     * @generated
     */
    EReference getRepository_ContainsNetworkNodeTypes();

    /**
     * Returns the meta object for class '{@link smartgridtopo.ConnectionType <em>Connection
     * Type</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for class '<em>Connection Type</em>'.
     * @see smartgridtopo.ConnectionType
     * @generated
     */
    EClass getConnectionType();

    /**
     * Returns the meta object for class '{@link smartgridtopo.NetworkNode <em>Network Node</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for class '<em>Network Node</em>'.
     * @see smartgridtopo.NetworkNode
     * @generated
     */
    EClass getNetworkNode();

    /**
     * Returns the meta object for the reference '{@link smartgridtopo.NetworkNode#getIsA <em>Is
     * A</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the reference '<em>Is A</em>'.
     * @see smartgridtopo.NetworkNode#getIsA()
     * @see #getNetworkNode()
     * @generated
     */
    EReference getNetworkNode_IsA();

    /**
     * Returns the meta object for class '{@link smartgridtopo.NetworkNodeType <em>Network Node
     * Type</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for class '<em>Network Node Type</em>'.
     * @see smartgridtopo.NetworkNodeType
     * @generated
     */
    EClass getNetworkNodeType();

    /**
     * Returns the meta object for the reference '{@link smartgridtopo.NetworkNodeType#getIsA <em>Is
     * A</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the reference '<em>Is A</em>'.
     * @see smartgridtopo.NetworkNodeType#getIsA()
     * @see #getNetworkNodeType()
     * @generated
     */
    EReference getNetworkNodeType_IsA();

    /**
     * Returns the meta object for class '{@link smartgridtopo.ControlCenter <em>Control
     * Center</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for class '<em>Control Center</em>'.
     * @see smartgridtopo.ControlCenter
     * @generated
     */
    EClass getControlCenter();

    /**
     * Returns the meta object for class '{@link smartgridtopo.GenericController <em>Generic
     * Controller</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for class '<em>Generic Controller</em>'.
     * @see smartgridtopo.GenericController
     * @generated
     */
    EClass getGenericController();

    /**
     * Returns the meta object for class '{@link smartgridtopo.CommunicatingEntity <em>Communicating
     * Entity</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for class '<em>Communicating Entity</em>'.
     * @see smartgridtopo.CommunicatingEntity
     * @generated
     */
    EClass getCommunicatingEntity();

    /**
     * Returns the meta object for the reference list
     * '{@link smartgridtopo.CommunicatingEntity#getCommunicatesBy <em>Communicates By</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the reference list '<em>Communicates By</em>'.
     * @see smartgridtopo.CommunicatingEntity#getCommunicatesBy()
     * @see #getCommunicatingEntity()
     * @generated
     */
    EReference getCommunicatingEntity_CommunicatesBy();

    /**
     * Returns the meta object for class '{@link smartgridtopo.InterCom <em>Inter Com</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for class '<em>Inter Com</em>'.
     * @see smartgridtopo.InterCom
     * @generated
     */
    EClass getInterCom();

    /**
     * Returns the meta object for class '{@link smartgridtopo.LogicalCommunication <em>Logical
     * Communication</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for class '<em>Logical Communication</em>'.
     * @see smartgridtopo.LogicalCommunication
     * @generated
     */
    EClass getLogicalCommunication();

    /**
     * Returns the meta object for the reference list
     * '{@link smartgridtopo.LogicalCommunication#getLinks <em>Links</em>}'. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @return the meta object for the reference list '<em>Links</em>'.
     * @see smartgridtopo.LogicalCommunication#getLinks()
     * @see #getLogicalCommunication()
     * @generated
     */
    EReference getLogicalCommunication_Links();

    /**
     * Returns the factory that creates the instances of the model. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @return the factory that creates the instances of the model.
     * @generated
     */
    SmartgridtopoFactory getSmartgridtopoFactory();

    /**
     * <!-- begin-user-doc --> Defines literals for the meta objects that represent
     * <ul>
     * <li>each class,</li>
     * <li>each feature of each class,</li>
     * <li>each operation of each class,</li>
     * <li>each enum,</li>
     * <li>and each data type</li>
     * </ul>
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    interface Literals {
        /**
         * The meta object literal for the '{@link smartgridtopo.impl.SmartGridTopologyImpl
         * <em>Smart Grid Topology</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
         * 
         * @see smartgridtopo.impl.SmartGridTopologyImpl
         * @see smartgridtopo.impl.SmartgridtopoPackageImpl#getSmartGridTopology()
         * @generated
         */
        EClass SMART_GRID_TOPOLOGY = eINSTANCE.getSmartGridTopology();

        /**
         * The meta object literal for the '<em><b>Contains NE</b></em>' containment reference list
         * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
         * 
         * @generated
         */
        EReference SMART_GRID_TOPOLOGY__CONTAINS_NE = eINSTANCE.getSmartGridTopology_ContainsNE();

        /**
         * The meta object literal for the '<em><b>Contains PGN</b></em>' containment reference list
         * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
         * 
         * @generated
         */
        EReference SMART_GRID_TOPOLOGY__CONTAINS_PGN = eINSTANCE.getSmartGridTopology_ContainsPGN();

        /**
         * The meta object literal for the '<em><b>Contains PC</b></em>' containment reference list
         * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
         * 
         * @generated
         */
        EReference SMART_GRID_TOPOLOGY__CONTAINS_PC = eINSTANCE.getSmartGridTopology_ContainsPC();

        /**
         * The meta object literal for the '<em><b>Contains LC</b></em>' containment reference list
         * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
         * 
         * @generated
         */
        EReference SMART_GRID_TOPOLOGY__CONTAINS_LC = eINSTANCE.getSmartGridTopology_ContainsLC();

        /**
         * The meta object literal for the '{@link smartgridtopo.NamedEntity <em>Named Entity</em>}'
         * class. <!-- begin-user-doc --> <!-- end-user-doc -->
         * 
         * @see smartgridtopo.NamedEntity
         * @see smartgridtopo.impl.SmartgridtopoPackageImpl#getNamedEntity()
         * @generated
         */
        EClass NAMED_ENTITY = eINSTANCE.getNamedEntity();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature. <!--
         * begin-user-doc --> <!-- end-user-doc -->
         * 
         * @generated
         */
        EAttribute NAMED_ENTITY__NAME = eINSTANCE.getNamedEntity_Name();

        /**
         * The meta object literal for the '{@link smartgridtopo.Identifier <em>Identifier</em>}'
         * class. <!-- begin-user-doc --> <!-- end-user-doc -->
         * 
         * @see smartgridtopo.Identifier
         * @see smartgridtopo.impl.SmartgridtopoPackageImpl#getIdentifier()
         * @generated
         */
        EClass IDENTIFIER = eINSTANCE.getIdentifier();

        /**
         * The meta object literal for the '<em><b>Id</b></em>' attribute feature. <!--
         * begin-user-doc --> <!-- end-user-doc -->
         * 
         * @generated
         */
        EAttribute IDENTIFIER__ID = eINSTANCE.getIdentifier_Id();

        /**
         * The meta object literal for the '{@link smartgridtopo.NamedIdentifier <em>Named
         * Identifier</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
         * 
         * @see smartgridtopo.NamedIdentifier
         * @see smartgridtopo.impl.SmartgridtopoPackageImpl#getNamedIdentifier()
         * @generated
         */
        EClass NAMED_IDENTIFIER = eINSTANCE.getNamedIdentifier();

        /**
         * The meta object literal for the '{@link smartgridtopo.impl.NetworkEntityImpl <em>Network
         * Entity</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
         * 
         * @see smartgridtopo.impl.NetworkEntityImpl
         * @see smartgridtopo.impl.SmartgridtopoPackageImpl#getNetworkEntity()
         * @generated
         */
        EClass NETWORK_ENTITY = eINSTANCE.getNetworkEntity();

        /**
         * The meta object literal for the '<em><b>Connected To</b></em>' reference list feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * 
         * @generated
         */
        EReference NETWORK_ENTITY__CONNECTED_TO = eINSTANCE.getNetworkEntity_ConnectedTo();

        /**
         * The meta object literal for the '<em><b>Linked By</b></em>' reference list feature. <!--
         * begin-user-doc --> <!-- end-user-doc -->
         * 
         * @generated
         */
        EReference NETWORK_ENTITY__LINKED_BY = eINSTANCE.getNetworkEntity_LinkedBy();

        /**
         * The meta object literal for the '{@link smartgridtopo.impl.PowerGridNodeImpl <em>Power
         * Grid Node</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
         * 
         * @see smartgridtopo.impl.PowerGridNodeImpl
         * @see smartgridtopo.impl.SmartgridtopoPackageImpl#getPowerGridNode()
         * @generated
         */
        EClass POWER_GRID_NODE = eINSTANCE.getPowerGridNode();

        /**
         * The meta object literal for the '{@link smartgridtopo.impl.SmartMeterImpl <em>Smart
         * Meter</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
         * 
         * @see smartgridtopo.impl.SmartMeterImpl
         * @see smartgridtopo.impl.SmartgridtopoPackageImpl#getSmartMeter()
         * @generated
         */
        EClass SMART_METER = eINSTANCE.getSmartMeter();

        /**
         * The meta object literal for the '<em><b>Is A</b></em>' reference feature. <!--
         * begin-user-doc --> <!-- end-user-doc -->
         * 
         * @generated
         */
        EReference SMART_METER__IS_A = eINSTANCE.getSmartMeter_IsA();

        /**
         * The meta object literal for the '<em><b>Aggregation</b></em>' attribute feature. <!--
         * begin-user-doc --> <!-- end-user-doc -->
         * 
         * @generated
         */
        EAttribute SMART_METER__AGGREGATION = eINSTANCE.getSmartMeter_Aggregation();

        /**
         * The meta object literal for the '{@link smartgridtopo.impl.SmartMeterTypeImpl <em>Smart
         * Meter Type</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
         * 
         * @see smartgridtopo.impl.SmartMeterTypeImpl
         * @see smartgridtopo.impl.SmartgridtopoPackageImpl#getSmartMeterType()
         * @generated
         */
        EClass SMART_METER_TYPE = eINSTANCE.getSmartMeterType();

        /**
         * The meta object literal for the '{@link smartgridtopo.impl.PhysicalConnectionImpl
         * <em>Physical Connection</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
         * 
         * @see smartgridtopo.impl.PhysicalConnectionImpl
         * @see smartgridtopo.impl.SmartgridtopoPackageImpl#getPhysicalConnection()
         * @generated
         */
        EClass PHYSICAL_CONNECTION = eINSTANCE.getPhysicalConnection();

        /**
         * The meta object literal for the '<em><b>Links</b></em>' reference list feature. <!--
         * begin-user-doc --> <!-- end-user-doc -->
         * 
         * @generated
         */
        EReference PHYSICAL_CONNECTION__LINKS = eINSTANCE.getPhysicalConnection_Links();

        /**
         * The meta object literal for the '<em><b>Is A</b></em>' reference feature. <!--
         * begin-user-doc --> <!-- end-user-doc -->
         * 
         * @generated
         */
        EReference PHYSICAL_CONNECTION__IS_A = eINSTANCE.getPhysicalConnection_IsA();

        /**
         * The meta object literal for the '{@link smartgridtopo.impl.RepositoryImpl
         * <em>Repository</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
         * 
         * @see smartgridtopo.impl.RepositoryImpl
         * @see smartgridtopo.impl.SmartgridtopoPackageImpl#getRepository()
         * @generated
         */
        EClass REPOSITORY = eINSTANCE.getRepository();

        /**
         * The meta object literal for the '<em><b>Contains Smart Meter Types</b></em>' containment
         * reference list feature. <!-- begin-user-doc --> <!-- end-user-doc -->
         * 
         * @generated
         */
        EReference REPOSITORY__CONTAINS_SMART_METER_TYPES = eINSTANCE.getRepository_ContainsSmartMeterTypes();

        /**
         * The meta object literal for the '<em><b>Contains Connection Type</b></em>' containment
         * reference list feature. <!-- begin-user-doc --> <!-- end-user-doc -->
         * 
         * @generated
         */
        EReference REPOSITORY__CONTAINS_CONNECTION_TYPE = eINSTANCE.getRepository_ContainsConnectionType();

        /**
         * The meta object literal for the '<em><b>Contains Network Node Types</b></em>' containment
         * reference list feature. <!-- begin-user-doc --> <!-- end-user-doc -->
         * 
         * @generated
         */
        EReference REPOSITORY__CONTAINS_NETWORK_NODE_TYPES = eINSTANCE.getRepository_ContainsNetworkNodeTypes();

        /**
         * The meta object literal for the '{@link smartgridtopo.impl.ConnectionTypeImpl
         * <em>Connection Type</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
         * 
         * @see smartgridtopo.impl.ConnectionTypeImpl
         * @see smartgridtopo.impl.SmartgridtopoPackageImpl#getConnectionType()
         * @generated
         */
        EClass CONNECTION_TYPE = eINSTANCE.getConnectionType();

        /**
         * The meta object literal for the '{@link smartgridtopo.impl.NetworkNodeImpl <em>Network
         * Node</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
         * 
         * @see smartgridtopo.impl.NetworkNodeImpl
         * @see smartgridtopo.impl.SmartgridtopoPackageImpl#getNetworkNode()
         * @generated
         */
        EClass NETWORK_NODE = eINSTANCE.getNetworkNode();

        /**
         * The meta object literal for the '<em><b>Is A</b></em>' reference feature. <!--
         * begin-user-doc --> <!-- end-user-doc -->
         * 
         * @generated
         */
        EReference NETWORK_NODE__IS_A = eINSTANCE.getNetworkNode_IsA();

        /**
         * The meta object literal for the '{@link smartgridtopo.impl.NetworkNodeTypeImpl
         * <em>Network Node Type</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
         * 
         * @see smartgridtopo.impl.NetworkNodeTypeImpl
         * @see smartgridtopo.impl.SmartgridtopoPackageImpl#getNetworkNodeType()
         * @generated
         */
        EClass NETWORK_NODE_TYPE = eINSTANCE.getNetworkNodeType();

        /**
         * The meta object literal for the '<em><b>Is A</b></em>' reference feature. <!--
         * begin-user-doc --> <!-- end-user-doc -->
         * 
         * @generated
         */
        EReference NETWORK_NODE_TYPE__IS_A = eINSTANCE.getNetworkNodeType_IsA();

        /**
         * The meta object literal for the '{@link smartgridtopo.impl.ControlCenterImpl <em>Control
         * Center</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
         * 
         * @see smartgridtopo.impl.ControlCenterImpl
         * @see smartgridtopo.impl.SmartgridtopoPackageImpl#getControlCenter()
         * @generated
         */
        EClass CONTROL_CENTER = eINSTANCE.getControlCenter();

        /**
         * The meta object literal for the '{@link smartgridtopo.impl.GenericControllerImpl
         * <em>Generic Controller</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
         * 
         * @see smartgridtopo.impl.GenericControllerImpl
         * @see smartgridtopo.impl.SmartgridtopoPackageImpl#getGenericController()
         * @generated
         */
        EClass GENERIC_CONTROLLER = eINSTANCE.getGenericController();

        /**
         * The meta object literal for the '{@link smartgridtopo.impl.CommunicatingEntityImpl
         * <em>Communicating Entity</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
         * 
         * @see smartgridtopo.impl.CommunicatingEntityImpl
         * @see smartgridtopo.impl.SmartgridtopoPackageImpl#getCommunicatingEntity()
         * @generated
         */
        EClass COMMUNICATING_ENTITY = eINSTANCE.getCommunicatingEntity();

        /**
         * The meta object literal for the '<em><b>Communicates By</b></em>' reference list feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * 
         * @generated
         */
        EReference COMMUNICATING_ENTITY__COMMUNICATES_BY = eINSTANCE.getCommunicatingEntity_CommunicatesBy();

        /**
         * The meta object literal for the '{@link smartgridtopo.impl.InterComImpl <em>Inter
         * Com</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
         * 
         * @see smartgridtopo.impl.InterComImpl
         * @see smartgridtopo.impl.SmartgridtopoPackageImpl#getInterCom()
         * @generated
         */
        EClass INTER_COM = eINSTANCE.getInterCom();

        /**
         * The meta object literal for the '{@link smartgridtopo.impl.LogicalCommunicationImpl
         * <em>Logical Communication</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
         * 
         * @see smartgridtopo.impl.LogicalCommunicationImpl
         * @see smartgridtopo.impl.SmartgridtopoPackageImpl#getLogicalCommunication()
         * @generated
         */
        EClass LOGICAL_COMMUNICATION = eINSTANCE.getLogicalCommunication();

        /**
         * The meta object literal for the '<em><b>Links</b></em>' reference list feature. <!--
         * begin-user-doc --> <!-- end-user-doc -->
         * 
         * @generated
         */
        EReference LOGICAL_COMMUNICATION__LINKS = eINSTANCE.getLogicalCommunication_Links();

    }

} //SmartgridtopoPackage
