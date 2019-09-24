/**
 */
package smartgridtopo.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import smartgridtopo.CommunicatingEntity;
import smartgridtopo.ConnectionType;
import smartgridtopo.ControlCenter;
import smartgridtopo.GenericController;
import smartgridtopo.Identifier;
import smartgridtopo.InterCom;
import smartgridtopo.LogicalCommunication;
import smartgridtopo.NamedEntity;
import smartgridtopo.NamedIdentifier;
import smartgridtopo.NetworkEntity;
import smartgridtopo.NetworkNode;
import smartgridtopo.NetworkNodeType;
import smartgridtopo.PhysicalConnection;
import smartgridtopo.PowerGridNode;
import smartgridtopo.Repository;
import smartgridtopo.SmartGridTopology;
import smartgridtopo.SmartMeter;
import smartgridtopo.SmartMeterType;
import smartgridtopo.SmartgridtopoFactory;
import smartgridtopo.SmartgridtopoPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!-- end-user-doc -->
 * 
 * @generated
 */
public class SmartgridtopoPackageImpl extends EPackageImpl implements SmartgridtopoPackage {
    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass smartGridTopologyEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass namedEntityEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass identifierEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass namedIdentifierEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass networkEntityEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass powerGridNodeEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass smartMeterEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass smartMeterTypeEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass physicalConnectionEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass repositoryEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass connectionTypeEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass networkNodeEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass networkNodeTypeEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass controlCenterEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass genericControllerEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass communicatingEntityEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass interComEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass logicalCommunicationEClass = null;

    /**
     * Creates an instance of the model <b>Package</b>, registered with
     * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package package URI
     * value.
     * <p>
     * Note: the correct way to create the package is via the static factory method {@link #init
     * init()}, which also performs initialization of the package, or returns the registered
     * package, if one already exists. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see org.eclipse.emf.ecore.EPackage.Registry
     * @see smartgridtopo.SmartgridtopoPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private SmartgridtopoPackageImpl() {
        super(eNS_URI, SmartgridtopoFactory.eINSTANCE);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private static boolean isInited = false;

    /**
     * Creates, registers, and initializes the <b>Package</b> for this model, and for any others
     * upon which it depends.
     * 
     * <p>
     * This method is used to initialize {@link SmartgridtopoPackage#eINSTANCE} when that field is
     * accessed. Clients should not invoke it directly. Instead, they should simply access that
     * field to obtain the package. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static SmartgridtopoPackage init() {
        if (isInited)
            return (SmartgridtopoPackage) EPackage.Registry.INSTANCE.getEPackage(SmartgridtopoPackage.eNS_URI);

        // Obtain or create and register package
        SmartgridtopoPackageImpl theSmartgridtopoPackage = (SmartgridtopoPackageImpl) (EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SmartgridtopoPackageImpl
                ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SmartgridtopoPackageImpl());

        isInited = true;

        // Create package meta-data objects
        theSmartgridtopoPackage.createPackageContents();

        // Initialize created meta-data
        theSmartgridtopoPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theSmartgridtopoPackage.freeze();

        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(SmartgridtopoPackage.eNS_URI, theSmartgridtopoPackage);
        return theSmartgridtopoPackage;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getSmartGridTopology() {
        return smartGridTopologyEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EReference getSmartGridTopology_ContainsNE() {
        return (EReference) smartGridTopologyEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EReference getSmartGridTopology_ContainsPGN() {
        return (EReference) smartGridTopologyEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EReference getSmartGridTopology_ContainsPC() {
        return (EReference) smartGridTopologyEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EReference getSmartGridTopology_ContainsLC() {
        return (EReference) smartGridTopologyEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getNamedEntity() {
        return namedEntityEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EAttribute getNamedEntity_Name() {
        return (EAttribute) namedEntityEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getIdentifier() {
        return identifierEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EAttribute getIdentifier_Id() {
        return (EAttribute) identifierEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getNamedIdentifier() {
        return namedIdentifierEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getNetworkEntity() {
        return networkEntityEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EReference getNetworkEntity_ConnectedTo() {
        return (EReference) networkEntityEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EReference getNetworkEntity_LinkedBy() {
        return (EReference) networkEntityEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getPowerGridNode() {
        return powerGridNodeEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getSmartMeter() {
        return smartMeterEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EReference getSmartMeter_IsA() {
        return (EReference) smartMeterEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EAttribute getSmartMeter_Aggregation() {
        return (EAttribute) smartMeterEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getSmartMeterType() {
        return smartMeterTypeEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getPhysicalConnection() {
        return physicalConnectionEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EReference getPhysicalConnection_Links() {
        return (EReference) physicalConnectionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EReference getPhysicalConnection_IsA() {
        return (EReference) physicalConnectionEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getRepository() {
        return repositoryEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EReference getRepository_ContainsSmartMeterTypes() {
        return (EReference) repositoryEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EReference getRepository_ContainsConnectionType() {
        return (EReference) repositoryEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EReference getRepository_ContainsNetworkNodeTypes() {
        return (EReference) repositoryEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getConnectionType() {
        return connectionTypeEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getNetworkNode() {
        return networkNodeEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EReference getNetworkNode_IsA() {
        return (EReference) networkNodeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getNetworkNodeType() {
        return networkNodeTypeEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EReference getNetworkNodeType_IsA() {
        return (EReference) networkNodeTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getControlCenter() {
        return controlCenterEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getGenericController() {
        return genericControllerEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getCommunicatingEntity() {
        return communicatingEntityEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EReference getCommunicatingEntity_CommunicatesBy() {
        return (EReference) communicatingEntityEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getInterCom() {
        return interComEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getLogicalCommunication() {
        return logicalCommunicationEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EReference getLogicalCommunication_Links() {
        return (EReference) logicalCommunicationEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public SmartgridtopoFactory getSmartgridtopoFactory() {
        return (SmartgridtopoFactory) getEFactoryInstance();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private boolean isCreated = false;

    /**
     * Creates the meta-model objects for the package. This method is guarded to have no affect on
     * any invocation but its first. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void createPackageContents() {
        if (isCreated)
            return;
        isCreated = true;

        // Create classes and their features
        smartGridTopologyEClass = createEClass(SMART_GRID_TOPOLOGY);
        createEReference(smartGridTopologyEClass, SMART_GRID_TOPOLOGY__CONTAINS_NE);
        createEReference(smartGridTopologyEClass, SMART_GRID_TOPOLOGY__CONTAINS_PGN);
        createEReference(smartGridTopologyEClass, SMART_GRID_TOPOLOGY__CONTAINS_PC);
        createEReference(smartGridTopologyEClass, SMART_GRID_TOPOLOGY__CONTAINS_LC);

        namedEntityEClass = createEClass(NAMED_ENTITY);
        createEAttribute(namedEntityEClass, NAMED_ENTITY__NAME);

        identifierEClass = createEClass(IDENTIFIER);
        createEAttribute(identifierEClass, IDENTIFIER__ID);

        namedIdentifierEClass = createEClass(NAMED_IDENTIFIER);

        networkEntityEClass = createEClass(NETWORK_ENTITY);
        createEReference(networkEntityEClass, NETWORK_ENTITY__CONNECTED_TO);
        createEReference(networkEntityEClass, NETWORK_ENTITY__LINKED_BY);

        powerGridNodeEClass = createEClass(POWER_GRID_NODE);

        smartMeterEClass = createEClass(SMART_METER);
        createEReference(smartMeterEClass, SMART_METER__IS_A);
        createEAttribute(smartMeterEClass, SMART_METER__AGGREGATION);

        smartMeterTypeEClass = createEClass(SMART_METER_TYPE);

        physicalConnectionEClass = createEClass(PHYSICAL_CONNECTION);
        createEReference(physicalConnectionEClass, PHYSICAL_CONNECTION__LINKS);
        createEReference(physicalConnectionEClass, PHYSICAL_CONNECTION__IS_A);

        repositoryEClass = createEClass(REPOSITORY);
        createEReference(repositoryEClass, REPOSITORY__CONTAINS_SMART_METER_TYPES);
        createEReference(repositoryEClass, REPOSITORY__CONTAINS_CONNECTION_TYPE);
        createEReference(repositoryEClass, REPOSITORY__CONTAINS_NETWORK_NODE_TYPES);

        connectionTypeEClass = createEClass(CONNECTION_TYPE);

        networkNodeEClass = createEClass(NETWORK_NODE);
        createEReference(networkNodeEClass, NETWORK_NODE__IS_A);

        networkNodeTypeEClass = createEClass(NETWORK_NODE_TYPE);
        createEReference(networkNodeTypeEClass, NETWORK_NODE_TYPE__IS_A);

        controlCenterEClass = createEClass(CONTROL_CENTER);

        genericControllerEClass = createEClass(GENERIC_CONTROLLER);

        communicatingEntityEClass = createEClass(COMMUNICATING_ENTITY);
        createEReference(communicatingEntityEClass, COMMUNICATING_ENTITY__COMMUNICATES_BY);

        interComEClass = createEClass(INTER_COM);

        logicalCommunicationEClass = createEClass(LOGICAL_COMMUNICATION);
        createEReference(logicalCommunicationEClass, LOGICAL_COMMUNICATION__LINKS);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private boolean isInitialized = false;

    /**
     * Complete the initialization of the package and its meta-model. This method is guarded to have
     * no affect on any invocation but its first. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void initializePackageContents() {
        if (isInitialized)
            return;
        isInitialized = true;

        // Initialize package
        setName(eNAME);
        setNsPrefix(eNS_PREFIX);
        setNsURI(eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        smartGridTopologyEClass.getESuperTypes().add(getNamedIdentifier());
        namedIdentifierEClass.getESuperTypes().add(getIdentifier());
        namedIdentifierEClass.getESuperTypes().add(getNamedEntity());
        networkEntityEClass.getESuperTypes().add(getNamedIdentifier());
        powerGridNodeEClass.getESuperTypes().add(getNamedIdentifier());
        smartMeterEClass.getESuperTypes().add(getCommunicatingEntity());
        smartMeterTypeEClass.getESuperTypes().add(getNamedIdentifier());
        physicalConnectionEClass.getESuperTypes().add(getNamedEntity());
        repositoryEClass.getESuperTypes().add(getNamedIdentifier());
        connectionTypeEClass.getESuperTypes().add(getNamedIdentifier());
        networkNodeEClass.getESuperTypes().add(getNetworkEntity());
        networkNodeTypeEClass.getESuperTypes().add(getNamedIdentifier());
        controlCenterEClass.getESuperTypes().add(getCommunicatingEntity());
        genericControllerEClass.getESuperTypes().add(getCommunicatingEntity());
        communicatingEntityEClass.getESuperTypes().add(getNetworkEntity());
        interComEClass.getESuperTypes().add(getCommunicatingEntity());
        logicalCommunicationEClass.getESuperTypes().add(getNamedEntity());

        // Initialize classes, features, and operations; add parameters
        initEClass(smartGridTopologyEClass, SmartGridTopology.class, "SmartGridTopology", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getSmartGridTopology_ContainsNE(), getNetworkEntity(), null, "ContainsNE", null, 0, -1, SmartGridTopology.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getSmartGridTopology_ContainsPGN(), getPowerGridNode(), null, "ContainsPGN", null, 0, -1, SmartGridTopology.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getSmartGridTopology_ContainsPC(), getPhysicalConnection(), null, "ContainsPC", null, 0, -1, SmartGridTopology.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getSmartGridTopology_ContainsLC(), getLogicalCommunication(), null, "ContainsLC", null, 0, -1, SmartGridTopology.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(namedEntityEClass, NamedEntity.class, "NamedEntity", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getNamedEntity_Name(), ecorePackage.getEString(), "name", null, 0, 1, NamedEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);

        initEClass(identifierEClass, Identifier.class, "Identifier", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getIdentifier_Id(), ecorePackage.getEInt(), "id", "0", 1, 1, Identifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, !IS_UNIQUE, !IS_DERIVED,
                !IS_ORDERED);

        initEClass(namedIdentifierEClass, NamedIdentifier.class, "NamedIdentifier", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(networkEntityEClass, NetworkEntity.class, "NetworkEntity", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getNetworkEntity_ConnectedTo(), getPowerGridNode(), null, "ConnectedTo", null, 1, -1, NetworkEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
                IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getNetworkEntity_LinkedBy(), getPhysicalConnection(), getPhysicalConnection_Links(), "LinkedBy", null, 0, -1, NetworkEntity.class, !IS_TRANSIENT, !IS_VOLATILE,
                IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(powerGridNodeEClass, PowerGridNode.class, "PowerGridNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(smartMeterEClass, SmartMeter.class, "SmartMeter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getSmartMeter_IsA(), getSmartMeterType(), null, "IsA", null, 0, 1, SmartMeter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getSmartMeter_Aggregation(), ecorePackage.getEInt(), "Aggregation", "1", 0, 1, SmartMeter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);

        initEClass(smartMeterTypeEClass, SmartMeterType.class, "SmartMeterType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(physicalConnectionEClass, PhysicalConnection.class, "PhysicalConnection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getPhysicalConnection_Links(), getNetworkEntity(), getNetworkEntity_LinkedBy(), "Links", null, 2, 2, PhysicalConnection.class, !IS_TRANSIENT, !IS_VOLATILE,
                IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getPhysicalConnection_IsA(), getConnectionType(), null, "IsA", null, 0, 1, PhysicalConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
                IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(repositoryEClass, Repository.class, "Repository", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getRepository_ContainsSmartMeterTypes(), getSmartMeterType(), null, "ContainsSmartMeterTypes", null, 0, -1, Repository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getRepository_ContainsConnectionType(), getConnectionType(), null, "ContainsConnectionType", null, 0, -1, Repository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getRepository_ContainsNetworkNodeTypes(), getNetworkNodeType(), null, "ContainsNetworkNodeTypes", null, 0, -1, Repository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(connectionTypeEClass, ConnectionType.class, "ConnectionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(networkNodeEClass, NetworkNode.class, "NetworkNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getNetworkNode_IsA(), getNetworkNodeType(), null, "IsA", null, 0, 1, NetworkNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(networkNodeTypeEClass, NetworkNodeType.class, "NetworkNodeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getNetworkNodeType_IsA(), getSmartMeterType(), null, "IsA", null, 1, 1, NetworkNodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
                IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(controlCenterEClass, ControlCenter.class, "ControlCenter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(genericControllerEClass, GenericController.class, "GenericController", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(communicatingEntityEClass, CommunicatingEntity.class, "CommunicatingEntity", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getCommunicatingEntity_CommunicatesBy(), getLogicalCommunication(), getLogicalCommunication_Links(), "CommunicatesBy", null, 0, -1, CommunicatingEntity.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(interComEClass, InterCom.class, "InterCom", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(logicalCommunicationEClass, LogicalCommunication.class, "LogicalCommunication", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getLogicalCommunication_Links(), getCommunicatingEntity(), getCommunicatingEntity_CommunicatesBy(), "Links", null, 2, 2, LogicalCommunication.class, !IS_TRANSIENT,
                !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        // Create resource
        createResource(eNS_URI);
    }

} //SmartgridtopoPackageImpl
