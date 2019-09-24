/**
 */
package smartgridtopo;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Physical
 * Connection</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link smartgridtopo.PhysicalConnection#getLinks <em>Links</em>}</li>
 * <li>{@link smartgridtopo.PhysicalConnection#getIsA <em>Is A</em>}</li>
 * </ul>
 *
 * @see smartgridtopo.SmartgridtopoPackage#getPhysicalConnection()
 * @model
 * @generated
 */
public interface PhysicalConnection extends NamedEntity {
    /**
     * Returns the value of the '<em><b>Links</b></em>' reference list. The list contents are of
     * type {@link smartgridtopo.NetworkEntity}. It is bidirectional and its opposite is
     * '{@link smartgridtopo.NetworkEntity#getLinkedBy <em>Linked By</em>}'. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Links</em>' reference list isn't clear, there really should be
     * more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Links</em>' reference list.
     * @see smartgridtopo.SmartgridtopoPackage#getPhysicalConnection_Links()
     * @see smartgridtopo.NetworkEntity#getLinkedBy
     * @model opposite="LinkedBy" lower="2" upper="2"
     * @generated
     */
    EList<NetworkEntity> getLinks();

    /**
     * Returns the value of the '<em><b>Is A</b></em>' reference. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Is A</em>' reference isn't clear, there really should be more of a
     * description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Is A</em>' reference.
     * @see #setIsA(ConnectionType)
     * @see smartgridtopo.SmartgridtopoPackage#getPhysicalConnection_IsA()
     * @model
     * @generated
     */
    ConnectionType getIsA();

    /**
     * Sets the value of the '{@link smartgridtopo.PhysicalConnection#getIsA <em>Is A</em>}'
     * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>Is A</em>' reference.
     * @see #getIsA()
     * @generated
     */
    void setIsA(ConnectionType value);

} // PhysicalConnection
