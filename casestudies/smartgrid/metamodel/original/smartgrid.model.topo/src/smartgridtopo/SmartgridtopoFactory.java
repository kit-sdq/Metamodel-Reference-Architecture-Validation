/**
 */
package smartgridtopo;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc --> The <b>Factory</b> for the model. It provides a create method for each
 * non-abstract class of the model. <!-- end-user-doc -->
 * 
 * @see smartgridtopo.SmartgridtopoPackage
 * @generated
 */
public interface SmartgridtopoFactory extends EFactory {
    /**
     * The singleton instance of the factory. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    SmartgridtopoFactory eINSTANCE = smartgridtopo.impl.SmartgridtopoFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Smart Grid Topology</em>'. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @return a new object of class '<em>Smart Grid Topology</em>'.
     * @generated
     */
    SmartGridTopology createSmartGridTopology();

    /**
     * Returns a new object of class '<em>Power Grid Node</em>'. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @return a new object of class '<em>Power Grid Node</em>'.
     * @generated
     */
    PowerGridNode createPowerGridNode();

    /**
     * Returns a new object of class '<em>Smart Meter</em>'. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @return a new object of class '<em>Smart Meter</em>'.
     * @generated
     */
    SmartMeter createSmartMeter();

    /**
     * Returns a new object of class '<em>Smart Meter Type</em>'. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @return a new object of class '<em>Smart Meter Type</em>'.
     * @generated
     */
    SmartMeterType createSmartMeterType();

    /**
     * Returns a new object of class '<em>Physical Connection</em>'. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @return a new object of class '<em>Physical Connection</em>'.
     * @generated
     */
    PhysicalConnection createPhysicalConnection();

    /**
     * Returns a new object of class '<em>Repository</em>'. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @return a new object of class '<em>Repository</em>'.
     * @generated
     */
    Repository createRepository();

    /**
     * Returns a new object of class '<em>Connection Type</em>'. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @return a new object of class '<em>Connection Type</em>'.
     * @generated
     */
    ConnectionType createConnectionType();

    /**
     * Returns a new object of class '<em>Network Node</em>'. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @return a new object of class '<em>Network Node</em>'.
     * @generated
     */
    NetworkNode createNetworkNode();

    /**
     * Returns a new object of class '<em>Network Node Type</em>'. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @return a new object of class '<em>Network Node Type</em>'.
     * @generated
     */
    NetworkNodeType createNetworkNodeType();

    /**
     * Returns a new object of class '<em>Control Center</em>'. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @return a new object of class '<em>Control Center</em>'.
     * @generated
     */
    ControlCenter createControlCenter();

    /**
     * Returns a new object of class '<em>Generic Controller</em>'. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @return a new object of class '<em>Generic Controller</em>'.
     * @generated
     */
    GenericController createGenericController();

    /**
     * Returns a new object of class '<em>Inter Com</em>'. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @return a new object of class '<em>Inter Com</em>'.
     * @generated
     */
    InterCom createInterCom();

    /**
     * Returns a new object of class '<em>Logical Communication</em>'. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @return a new object of class '<em>Logical Communication</em>'.
     * @generated
     */
    LogicalCommunication createLogicalCommunication();

    /**
     * Returns the package supported by this factory. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the package supported by this factory.
     * @generated
     */
    SmartgridtopoPackage getSmartgridtopoPackage();

} //SmartgridtopoFactory
