/**
 */
package smartgridtopo;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Repository</b></em>'. <!--
 * end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link smartgridtopo.Repository#getContainsSmartMeterTypes <em>Contains Smart Meter
 * Types</em>}</li>
 * <li>{@link smartgridtopo.Repository#getContainsConnectionType <em>Contains Connection
 * Type</em>}</li>
 * <li>{@link smartgridtopo.Repository#getContainsNetworkNodeTypes <em>Contains Network Node
 * Types</em>}</li>
 * </ul>
 *
 * @see smartgridtopo.SmartgridtopoPackage#getRepository()
 * @model
 * @generated
 */
public interface Repository extends NamedIdentifier {
    /**
     * Returns the value of the '<em><b>Contains Smart Meter Types</b></em>' containment reference
     * list. The list contents are of type {@link smartgridtopo.SmartMeterType}. <!-- begin-user-doc
     * -->
     * <p>
     * If the meaning of the '<em>Contains Smart Meter Types</em>' containment reference list isn't
     * clear, there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Contains Smart Meter Types</em>' containment reference list.
     * @see smartgridtopo.SmartgridtopoPackage#getRepository_ContainsSmartMeterTypes()
     * @model containment="true"
     * @generated
     */
    EList<SmartMeterType> getContainsSmartMeterTypes();

    /**
     * Returns the value of the '<em><b>Contains Connection Type</b></em>' containment reference
     * list. The list contents are of type {@link smartgridtopo.ConnectionType}. <!-- begin-user-doc
     * -->
     * <p>
     * If the meaning of the '<em>Contains Connection Type</em>' containment reference list isn't
     * clear, there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Contains Connection Type</em>' containment reference list.
     * @see smartgridtopo.SmartgridtopoPackage#getRepository_ContainsConnectionType()
     * @model containment="true"
     * @generated
     */
    EList<ConnectionType> getContainsConnectionType();

    /**
     * Returns the value of the '<em><b>Contains Network Node Types</b></em>' containment reference
     * list. The list contents are of type {@link smartgridtopo.NetworkNodeType}. <!--
     * begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Contains Network Node Types</em>' containment reference list isn't
     * clear, there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Contains Network Node Types</em>' containment reference list.
     * @see smartgridtopo.SmartgridtopoPackage#getRepository_ContainsNetworkNodeTypes()
     * @model containment="true"
     * @generated
     */
    EList<NetworkNodeType> getContainsNetworkNodeTypes();

} // Repository
