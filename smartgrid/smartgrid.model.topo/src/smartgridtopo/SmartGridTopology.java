/**
 */
package smartgridtopo;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Smart Grid
 * Topology</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link smartgridtopo.SmartGridTopology#getContainsNE <em>Contains NE</em>}</li>
 * <li>{@link smartgridtopo.SmartGridTopology#getContainsPGN <em>Contains PGN</em>}</li>
 * <li>{@link smartgridtopo.SmartGridTopology#getContainsPC <em>Contains PC</em>}</li>
 * <li>{@link smartgridtopo.SmartGridTopology#getContainsLC <em>Contains LC</em>}</li>
 * </ul>
 *
 * @see smartgridtopo.SmartgridtopoPackage#getSmartGridTopology()
 * @model
 * @generated
 */
public interface SmartGridTopology extends NamedIdentifier {
    /**
     * Returns the value of the '<em><b>Contains NE</b></em>' containment reference list. The list
     * contents are of type {@link smartgridtopo.NetworkEntity}. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Contains NE</em>' containment reference list isn't clear, there
     * really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Contains NE</em>' containment reference list.
     * @see smartgridtopo.SmartgridtopoPackage#getSmartGridTopology_ContainsNE()
     * @model containment="true"
     * @generated
     */
    EList<NetworkEntity> getContainsNE();

    /**
     * Returns the value of the '<em><b>Contains PGN</b></em>' containment reference list. The list
     * contents are of type {@link smartgridtopo.PowerGridNode}. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Contains PGN</em>' containment reference list isn't clear, there
     * really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Contains PGN</em>' containment reference list.
     * @see smartgridtopo.SmartgridtopoPackage#getSmartGridTopology_ContainsPGN()
     * @model containment="true"
     * @generated
     */
    EList<PowerGridNode> getContainsPGN();

    /**
     * Returns the value of the '<em><b>Contains PC</b></em>' containment reference list. The list
     * contents are of type {@link smartgridtopo.PhysicalConnection}. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Contains PC</em>' containment reference list isn't clear, there
     * really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Contains PC</em>' containment reference list.
     * @see smartgridtopo.SmartgridtopoPackage#getSmartGridTopology_ContainsPC()
     * @model containment="true"
     * @generated
     */
    EList<PhysicalConnection> getContainsPC();

    /**
     * Returns the value of the '<em><b>Contains LC</b></em>' containment reference list. The list
     * contents are of type {@link smartgridtopo.LogicalCommunication}. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Contains LC</em>' containment reference list isn't clear, there
     * really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Contains LC</em>' containment reference list.
     * @see smartgridtopo.SmartgridtopoPackage#getSmartGridTopology_ContainsLC()
     * @model containment="true"
     * @generated
     */
    EList<LogicalCommunication> getContainsLC();

} // SmartGridTopology
