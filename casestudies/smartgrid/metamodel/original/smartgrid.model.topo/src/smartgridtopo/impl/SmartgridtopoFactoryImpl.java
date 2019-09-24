/**
 */
package smartgridtopo.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import smartgridtopo.ConnectionType;
import smartgridtopo.ControlCenter;
import smartgridtopo.GenericController;
import smartgridtopo.InterCom;
import smartgridtopo.LogicalCommunication;
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
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!-- end-user-doc -->
 * 
 * @generated
 */
public class SmartgridtopoFactoryImpl extends EFactoryImpl implements SmartgridtopoFactory {
    /**
     * Creates the default factory implementation. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public static SmartgridtopoFactory init() {
        try {
            SmartgridtopoFactory theSmartgridtopoFactory = (SmartgridtopoFactory) EPackage.Registry.INSTANCE.getEFactory(SmartgridtopoPackage.eNS_URI);
            if (theSmartgridtopoFactory != null) {
                return theSmartgridtopoFactory;
            }
        } catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new SmartgridtopoFactoryImpl();
    }

    /**
     * Creates an instance of the factory. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public SmartgridtopoFactoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EObject create(EClass eClass) {
        switch (eClass.getClassifierID()) {
        case SmartgridtopoPackage.SMART_GRID_TOPOLOGY:
            return createSmartGridTopology();
        case SmartgridtopoPackage.POWER_GRID_NODE:
            return createPowerGridNode();
        case SmartgridtopoPackage.SMART_METER:
            return createSmartMeter();
        case SmartgridtopoPackage.SMART_METER_TYPE:
            return createSmartMeterType();
        case SmartgridtopoPackage.PHYSICAL_CONNECTION:
            return createPhysicalConnection();
        case SmartgridtopoPackage.REPOSITORY:
            return createRepository();
        case SmartgridtopoPackage.CONNECTION_TYPE:
            return createConnectionType();
        case SmartgridtopoPackage.NETWORK_NODE:
            return createNetworkNode();
        case SmartgridtopoPackage.NETWORK_NODE_TYPE:
            return createNetworkNodeType();
        case SmartgridtopoPackage.CONTROL_CENTER:
            return createControlCenter();
        case SmartgridtopoPackage.GENERIC_CONTROLLER:
            return createGenericController();
        case SmartgridtopoPackage.INTER_COM:
            return createInterCom();
        case SmartgridtopoPackage.LOGICAL_COMMUNICATION:
            return createLogicalCommunication();
        default:
            throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public SmartGridTopology createSmartGridTopology() {
        SmartGridTopologyImpl smartGridTopology = new SmartGridTopologyImpl();
        return smartGridTopology;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public PowerGridNode createPowerGridNode() {
        PowerGridNodeImpl powerGridNode = new PowerGridNodeImpl();
        return powerGridNode;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public SmartMeter createSmartMeter() {
        SmartMeterImpl smartMeter = new SmartMeterImpl();
        return smartMeter;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public SmartMeterType createSmartMeterType() {
        SmartMeterTypeImpl smartMeterType = new SmartMeterTypeImpl();
        return smartMeterType;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public PhysicalConnection createPhysicalConnection() {
        PhysicalConnectionImpl physicalConnection = new PhysicalConnectionImpl();
        return physicalConnection;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Repository createRepository() {
        RepositoryImpl repository = new RepositoryImpl();
        return repository;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public ConnectionType createConnectionType() {
        ConnectionTypeImpl connectionType = new ConnectionTypeImpl();
        return connectionType;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public NetworkNode createNetworkNode() {
        NetworkNodeImpl networkNode = new NetworkNodeImpl();
        return networkNode;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public NetworkNodeType createNetworkNodeType() {
        NetworkNodeTypeImpl networkNodeType = new NetworkNodeTypeImpl();
        return networkNodeType;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public ControlCenter createControlCenter() {
        ControlCenterImpl controlCenter = new ControlCenterImpl();
        return controlCenter;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public GenericController createGenericController() {
        GenericControllerImpl genericController = new GenericControllerImpl();
        return genericController;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public InterCom createInterCom() {
        InterComImpl interCom = new InterComImpl();
        return interCom;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public LogicalCommunication createLogicalCommunication() {
        LogicalCommunicationImpl logicalCommunication = new LogicalCommunicationImpl();
        return logicalCommunication;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public SmartgridtopoPackage getSmartgridtopoPackage() {
        return (SmartgridtopoPackage) getEPackage();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @deprecated
     * @generated
     */
    @Deprecated
    public static SmartgridtopoPackage getPackage() {
        return SmartgridtopoPackage.eINSTANCE;
    }

} //SmartgridtopoFactoryImpl
