/**
 */
package smartgridtopo.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

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
import smartgridtopo.SmartgridtopoPackage;

/**
 * <!-- begin-user-doc --> The <b>Adapter Factory</b> for the model. It provides an adapter
 * <code>createXXX</code> method for each class of the model. <!-- end-user-doc -->
 * 
 * @see smartgridtopo.SmartgridtopoPackage
 * @generated
 */
public class SmartgridtopoAdapterFactory extends AdapterFactoryImpl {
    /**
     * The cached model package. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected static SmartgridtopoPackage modelPackage;

    /**
     * Creates an instance of the adapter factory. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public SmartgridtopoAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = SmartgridtopoPackage.eINSTANCE;
        }
    }

    /**
     * Returns whether this factory is applicable for the type of the object. <!-- begin-user-doc
     * --> This implementation returns <code>true</code> if the object is either the model's package
     * or is an instance object of the model. <!-- end-user-doc -->
     * 
     * @return whether this factory is applicable for the type of the object.
     * @generated
     */
    @Override
    public boolean isFactoryForType(Object object) {
        if (object == modelPackage) {
            return true;
        }
        if (object instanceof EObject) {
            return ((EObject) object).eClass().getEPackage() == modelPackage;
        }
        return false;
    }

    /**
     * The switch that delegates to the <code>createXXX</code> methods. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     */
    protected SmartgridtopoSwitch<Adapter> modelSwitch = new SmartgridtopoSwitch<Adapter>() {
        @Override
        public Adapter caseSmartGridTopology(SmartGridTopology object) {
            return createSmartGridTopologyAdapter();
        }

        @Override
        public Adapter caseNamedEntity(NamedEntity object) {
            return createNamedEntityAdapter();
        }

        @Override
        public Adapter caseIdentifier(Identifier object) {
            return createIdentifierAdapter();
        }

        @Override
        public Adapter caseNamedIdentifier(NamedIdentifier object) {
            return createNamedIdentifierAdapter();
        }

        @Override
        public Adapter caseNetworkEntity(NetworkEntity object) {
            return createNetworkEntityAdapter();
        }

        @Override
        public Adapter casePowerGridNode(PowerGridNode object) {
            return createPowerGridNodeAdapter();
        }

        @Override
        public Adapter caseSmartMeter(SmartMeter object) {
            return createSmartMeterAdapter();
        }

        @Override
        public Adapter caseSmartMeterType(SmartMeterType object) {
            return createSmartMeterTypeAdapter();
        }

        @Override
        public Adapter casePhysicalConnection(PhysicalConnection object) {
            return createPhysicalConnectionAdapter();
        }

        @Override
        public Adapter caseRepository(Repository object) {
            return createRepositoryAdapter();
        }

        @Override
        public Adapter caseConnectionType(ConnectionType object) {
            return createConnectionTypeAdapter();
        }

        @Override
        public Adapter caseNetworkNode(NetworkNode object) {
            return createNetworkNodeAdapter();
        }

        @Override
        public Adapter caseNetworkNodeType(NetworkNodeType object) {
            return createNetworkNodeTypeAdapter();
        }

        @Override
        public Adapter caseControlCenter(ControlCenter object) {
            return createControlCenterAdapter();
        }

        @Override
        public Adapter caseGenericController(GenericController object) {
            return createGenericControllerAdapter();
        }

        @Override
        public Adapter caseCommunicatingEntity(CommunicatingEntity object) {
            return createCommunicatingEntityAdapter();
        }

        @Override
        public Adapter caseInterCom(InterCom object) {
            return createInterComAdapter();
        }

        @Override
        public Adapter caseLogicalCommunication(LogicalCommunication object) {
            return createLogicalCommunicationAdapter();
        }

        @Override
        public Adapter defaultCase(EObject object) {
            return createEObjectAdapter();
        }
    };

    /**
     * Creates an adapter for the <code>target</code>. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @param target
     *            the object to adapt.
     * @return the adapter for the <code>target</code>.
     * @generated
     */
    @Override
    public Adapter createAdapter(Notifier target) {
        return modelSwitch.doSwitch((EObject) target);
    }

    /**
     * Creates a new adapter for an object of class '{@link smartgridtopo.SmartGridTopology
     * <em>Smart Grid Topology</em>}'. <!-- begin-user-doc --> This default implementation returns
     * null so that we can easily ignore cases; it's useful to ignore a case when inheritance will
     * catch all the cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @see smartgridtopo.SmartGridTopology
     * @generated
     */
    public Adapter createSmartGridTopologyAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link smartgridtopo.NamedEntity <em>Named
     * Entity</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we
     * can easily ignore cases; it's useful to ignore a case when inheritance will catch all the
     * cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @see smartgridtopo.NamedEntity
     * @generated
     */
    public Adapter createNamedEntityAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link smartgridtopo.Identifier
     * <em>Identifier</em>}'. <!-- begin-user-doc --> This default implementation returns null so
     * that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all
     * the cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @see smartgridtopo.Identifier
     * @generated
     */
    public Adapter createIdentifierAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link smartgridtopo.NamedIdentifier <em>Named
     * Identifier</em>}'. <!-- begin-user-doc --> This default implementation returns null so that
     * we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the
     * cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @see smartgridtopo.NamedIdentifier
     * @generated
     */
    public Adapter createNamedIdentifierAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link smartgridtopo.NetworkEntity <em>Network
     * Entity</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we
     * can easily ignore cases; it's useful to ignore a case when inheritance will catch all the
     * cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @see smartgridtopo.NetworkEntity
     * @generated
     */
    public Adapter createNetworkEntityAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link smartgridtopo.PowerGridNode <em>Power
     * Grid Node</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we
     * can easily ignore cases; it's useful to ignore a case when inheritance will catch all the
     * cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @see smartgridtopo.PowerGridNode
     * @generated
     */
    public Adapter createPowerGridNodeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link smartgridtopo.SmartMeter <em>Smart
     * Meter</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can
     * easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases
     * anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @see smartgridtopo.SmartMeter
     * @generated
     */
    public Adapter createSmartMeterAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link smartgridtopo.SmartMeterType <em>Smart
     * Meter Type</em>}'. <!-- begin-user-doc --> This default implementation returns null so that
     * we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the
     * cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @see smartgridtopo.SmartMeterType
     * @generated
     */
    public Adapter createSmartMeterTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link smartgridtopo.PhysicalConnection
     * <em>Physical Connection</em>}'. <!-- begin-user-doc --> This default implementation returns
     * null so that we can easily ignore cases; it's useful to ignore a case when inheritance will
     * catch all the cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @see smartgridtopo.PhysicalConnection
     * @generated
     */
    public Adapter createPhysicalConnectionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link smartgridtopo.Repository
     * <em>Repository</em>}'. <!-- begin-user-doc --> This default implementation returns null so
     * that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all
     * the cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @see smartgridtopo.Repository
     * @generated
     */
    public Adapter createRepositoryAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link smartgridtopo.ConnectionType
     * <em>Connection Type</em>}'. <!-- begin-user-doc --> This default implementation returns null
     * so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch
     * all the cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @see smartgridtopo.ConnectionType
     * @generated
     */
    public Adapter createConnectionTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link smartgridtopo.NetworkNode <em>Network
     * Node</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can
     * easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases
     * anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @see smartgridtopo.NetworkNode
     * @generated
     */
    public Adapter createNetworkNodeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link smartgridtopo.NetworkNodeType
     * <em>Network Node Type</em>}'. <!-- begin-user-doc --> This default implementation returns
     * null so that we can easily ignore cases; it's useful to ignore a case when inheritance will
     * catch all the cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @see smartgridtopo.NetworkNodeType
     * @generated
     */
    public Adapter createNetworkNodeTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link smartgridtopo.ControlCenter <em>Control
     * Center</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we
     * can easily ignore cases; it's useful to ignore a case when inheritance will catch all the
     * cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @see smartgridtopo.ControlCenter
     * @generated
     */
    public Adapter createControlCenterAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link smartgridtopo.GenericController
     * <em>Generic Controller</em>}'. <!-- begin-user-doc --> This default implementation returns
     * null so that we can easily ignore cases; it's useful to ignore a case when inheritance will
     * catch all the cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @see smartgridtopo.GenericController
     * @generated
     */
    public Adapter createGenericControllerAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link smartgridtopo.CommunicatingEntity
     * <em>Communicating Entity</em>}'. <!-- begin-user-doc --> This default implementation returns
     * null so that we can easily ignore cases; it's useful to ignore a case when inheritance will
     * catch all the cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @see smartgridtopo.CommunicatingEntity
     * @generated
     */
    public Adapter createCommunicatingEntityAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link smartgridtopo.InterCom <em>Inter
     * Com</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can
     * easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases
     * anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @see smartgridtopo.InterCom
     * @generated
     */
    public Adapter createInterComAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link smartgridtopo.LogicalCommunication
     * <em>Logical Communication</em>}'. <!-- begin-user-doc --> This default implementation returns
     * null so that we can easily ignore cases; it's useful to ignore a case when inheritance will
     * catch all the cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @see smartgridtopo.LogicalCommunication
     * @generated
     */
    public Adapter createLogicalCommunicationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for the default case. <!-- begin-user-doc --> This default
     * implementation returns null. <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @generated
     */
    public Adapter createEObjectAdapter() {
        return null;
    }

} //SmartgridtopoAdapterFactory
