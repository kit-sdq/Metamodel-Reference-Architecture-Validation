/**
 */
package smartgridtopo.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

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
 * <!-- begin-user-doc --> The <b>Switch</b> for the model's inheritance hierarchy. It supports the
 * call {@link #doSwitch(EObject) doSwitch(object)} to invoke the <code>caseXXX</code> method for
 * each class of the model, starting with the actual class of the object and proceeding up the
 * inheritance hierarchy until a non-null result is returned, which is the result of the switch.
 * <!-- end-user-doc -->
 * 
 * @see smartgridtopo.SmartgridtopoPackage
 * @generated
 */
public class SmartgridtopoSwitch<T> extends Switch<T> {
    /**
     * The cached model package <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected static SmartgridtopoPackage modelPackage;

    /**
     * Creates an instance of the switch. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public SmartgridtopoSwitch() {
        if (modelPackage == null) {
            modelPackage = SmartgridtopoPackage.eINSTANCE;
        }
    }

    /**
     * Checks whether this is a switch for the given package. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @param ePackage
     *            the package in question.
     * @return whether this is a switch for the given package.
     * @generated
     */
    @Override
    protected boolean isSwitchFor(EPackage ePackage) {
        return ePackage == modelPackage;
    }

    /**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result;
     * it yields that result. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
    @Override
    protected T doSwitch(int classifierID, EObject theEObject) {
        switch (classifierID) {
        case SmartgridtopoPackage.SMART_GRID_TOPOLOGY: {
            SmartGridTopology smartGridTopology = (SmartGridTopology) theEObject;
            T result = caseSmartGridTopology(smartGridTopology);
            if (result == null)
                result = caseNamedIdentifier(smartGridTopology);
            if (result == null)
                result = caseIdentifier(smartGridTopology);
            if (result == null)
                result = caseNamedEntity(smartGridTopology);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case SmartgridtopoPackage.NAMED_ENTITY: {
            NamedEntity namedEntity = (NamedEntity) theEObject;
            T result = caseNamedEntity(namedEntity);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case SmartgridtopoPackage.IDENTIFIER: {
            Identifier identifier = (Identifier) theEObject;
            T result = caseIdentifier(identifier);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case SmartgridtopoPackage.NAMED_IDENTIFIER: {
            NamedIdentifier namedIdentifier = (NamedIdentifier) theEObject;
            T result = caseNamedIdentifier(namedIdentifier);
            if (result == null)
                result = caseIdentifier(namedIdentifier);
            if (result == null)
                result = caseNamedEntity(namedIdentifier);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case SmartgridtopoPackage.NETWORK_ENTITY: {
            NetworkEntity networkEntity = (NetworkEntity) theEObject;
            T result = caseNetworkEntity(networkEntity);
            if (result == null)
                result = caseNamedIdentifier(networkEntity);
            if (result == null)
                result = caseIdentifier(networkEntity);
            if (result == null)
                result = caseNamedEntity(networkEntity);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case SmartgridtopoPackage.POWER_GRID_NODE: {
            PowerGridNode powerGridNode = (PowerGridNode) theEObject;
            T result = casePowerGridNode(powerGridNode);
            if (result == null)
                result = caseNamedIdentifier(powerGridNode);
            if (result == null)
                result = caseIdentifier(powerGridNode);
            if (result == null)
                result = caseNamedEntity(powerGridNode);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case SmartgridtopoPackage.SMART_METER: {
            SmartMeter smartMeter = (SmartMeter) theEObject;
            T result = caseSmartMeter(smartMeter);
            if (result == null)
                result = caseCommunicatingEntity(smartMeter);
            if (result == null)
                result = caseNetworkEntity(smartMeter);
            if (result == null)
                result = caseNamedIdentifier(smartMeter);
            if (result == null)
                result = caseIdentifier(smartMeter);
            if (result == null)
                result = caseNamedEntity(smartMeter);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case SmartgridtopoPackage.SMART_METER_TYPE: {
            SmartMeterType smartMeterType = (SmartMeterType) theEObject;
            T result = caseSmartMeterType(smartMeterType);
            if (result == null)
                result = caseNamedIdentifier(smartMeterType);
            if (result == null)
                result = caseIdentifier(smartMeterType);
            if (result == null)
                result = caseNamedEntity(smartMeterType);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case SmartgridtopoPackage.PHYSICAL_CONNECTION: {
            PhysicalConnection physicalConnection = (PhysicalConnection) theEObject;
            T result = casePhysicalConnection(physicalConnection);
            if (result == null)
                result = caseNamedEntity(physicalConnection);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case SmartgridtopoPackage.REPOSITORY: {
            Repository repository = (Repository) theEObject;
            T result = caseRepository(repository);
            if (result == null)
                result = caseNamedIdentifier(repository);
            if (result == null)
                result = caseIdentifier(repository);
            if (result == null)
                result = caseNamedEntity(repository);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case SmartgridtopoPackage.CONNECTION_TYPE: {
            ConnectionType connectionType = (ConnectionType) theEObject;
            T result = caseConnectionType(connectionType);
            if (result == null)
                result = caseNamedIdentifier(connectionType);
            if (result == null)
                result = caseIdentifier(connectionType);
            if (result == null)
                result = caseNamedEntity(connectionType);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case SmartgridtopoPackage.NETWORK_NODE: {
            NetworkNode networkNode = (NetworkNode) theEObject;
            T result = caseNetworkNode(networkNode);
            if (result == null)
                result = caseNetworkEntity(networkNode);
            if (result == null)
                result = caseNamedIdentifier(networkNode);
            if (result == null)
                result = caseIdentifier(networkNode);
            if (result == null)
                result = caseNamedEntity(networkNode);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case SmartgridtopoPackage.NETWORK_NODE_TYPE: {
            NetworkNodeType networkNodeType = (NetworkNodeType) theEObject;
            T result = caseNetworkNodeType(networkNodeType);
            if (result == null)
                result = caseNamedIdentifier(networkNodeType);
            if (result == null)
                result = caseIdentifier(networkNodeType);
            if (result == null)
                result = caseNamedEntity(networkNodeType);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case SmartgridtopoPackage.CONTROL_CENTER: {
            ControlCenter controlCenter = (ControlCenter) theEObject;
            T result = caseControlCenter(controlCenter);
            if (result == null)
                result = caseCommunicatingEntity(controlCenter);
            if (result == null)
                result = caseNetworkEntity(controlCenter);
            if (result == null)
                result = caseNamedIdentifier(controlCenter);
            if (result == null)
                result = caseIdentifier(controlCenter);
            if (result == null)
                result = caseNamedEntity(controlCenter);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case SmartgridtopoPackage.GENERIC_CONTROLLER: {
            GenericController genericController = (GenericController) theEObject;
            T result = caseGenericController(genericController);
            if (result == null)
                result = caseCommunicatingEntity(genericController);
            if (result == null)
                result = caseNetworkEntity(genericController);
            if (result == null)
                result = caseNamedIdentifier(genericController);
            if (result == null)
                result = caseIdentifier(genericController);
            if (result == null)
                result = caseNamedEntity(genericController);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case SmartgridtopoPackage.COMMUNICATING_ENTITY: {
            CommunicatingEntity communicatingEntity = (CommunicatingEntity) theEObject;
            T result = caseCommunicatingEntity(communicatingEntity);
            if (result == null)
                result = caseNetworkEntity(communicatingEntity);
            if (result == null)
                result = caseNamedIdentifier(communicatingEntity);
            if (result == null)
                result = caseIdentifier(communicatingEntity);
            if (result == null)
                result = caseNamedEntity(communicatingEntity);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case SmartgridtopoPackage.INTER_COM: {
            InterCom interCom = (InterCom) theEObject;
            T result = caseInterCom(interCom);
            if (result == null)
                result = caseCommunicatingEntity(interCom);
            if (result == null)
                result = caseNetworkEntity(interCom);
            if (result == null)
                result = caseNamedIdentifier(interCom);
            if (result == null)
                result = caseIdentifier(interCom);
            if (result == null)
                result = caseNamedEntity(interCom);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case SmartgridtopoPackage.LOGICAL_COMMUNICATION: {
            LogicalCommunication logicalCommunication = (LogicalCommunication) theEObject;
            T result = caseLogicalCommunication(logicalCommunication);
            if (result == null)
                result = caseNamedEntity(logicalCommunication);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        default:
            return defaultCase(theEObject);
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Smart Grid
     * Topology</em>'. <!-- begin-user-doc --> This implementation returns null; returning a
     * non-null result will terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Smart Grid
     *         Topology</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSmartGridTopology(SmartGridTopology object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Named Entity</em>'. <!--
     * begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Named Entity</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseNamedEntity(NamedEntity object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Identifier</em>'. <!--
     * begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Identifier</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseIdentifier(Identifier object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Named Identifier</em>'.
     * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Named Identifier</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseNamedIdentifier(NamedIdentifier object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Network Entity</em>'.
     * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Network Entity</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseNetworkEntity(NetworkEntity object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Power Grid Node</em>'.
     * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Power Grid Node</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePowerGridNode(PowerGridNode object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Smart Meter</em>'. <!--
     * begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Smart Meter</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSmartMeter(SmartMeter object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Smart Meter Type</em>'.
     * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Smart Meter Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSmartMeterType(SmartMeterType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Physical
     * Connection</em>'. <!-- begin-user-doc --> This implementation returns null; returning a
     * non-null result will terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Physical
     *         Connection</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePhysicalConnection(PhysicalConnection object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Repository</em>'. <!--
     * begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Repository</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRepository(Repository object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Connection Type</em>'.
     * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Connection Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseConnectionType(ConnectionType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Network Node</em>'. <!--
     * begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Network Node</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseNetworkNode(NetworkNode object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Network Node Type</em>'.
     * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Network Node Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseNetworkNodeType(NetworkNodeType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Control Center</em>'.
     * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Control Center</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseControlCenter(ControlCenter object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Generic
     * Controller</em>'. <!-- begin-user-doc --> This implementation returns null; returning a
     * non-null result will terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Generic
     *         Controller</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseGenericController(GenericController object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Communicating
     * Entity</em>'. <!-- begin-user-doc --> This implementation returns null; returning a non-null
     * result will terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Communicating
     *         Entity</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCommunicatingEntity(CommunicatingEntity object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Inter Com</em>'. <!--
     * begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Inter Com</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseInterCom(InterCom object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Logical
     * Communication</em>'. <!-- begin-user-doc --> This implementation returns null; returning a
     * non-null result will terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Logical
     *         Communication</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseLogicalCommunication(LogicalCommunication object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>EObject</em>'. <!--
     * begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch, but this is the last case anyway. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject)
     * @generated
     */
    @Override
    public T defaultCase(EObject object) {
        return null;
    }

} //SmartgridtopoSwitch
