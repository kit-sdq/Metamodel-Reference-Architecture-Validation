/**
 */
package smartgridtopo;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Network Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link smartgridtopo.NetworkEntity#getConnectedTo <em>Connected To</em>}</li>
 * <li>{@link smartgridtopo.NetworkEntity#getLinkedBy <em>Linked By</em>}</li>
 * </ul>
 *
 * @see smartgridtopo.SmartgridtopoPackage#getNetworkEntity()
 * @model abstract="true"
 * @generated
 */
public interface NetworkEntity extends NamedIdentifier {
    /**
     * Returns the value of the '<em><b>Connected To</b></em>' reference list. The list contents are
     * of type {@link smartgridtopo.PowerGridNode}. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Connected To</em>' reference list isn't clear, there really should
     * be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Connected To</em>' reference list.
     * @see smartgridtopo.SmartgridtopoPackage#getNetworkEntity_ConnectedTo()
     * @model required="true"
     * @generated
     */
    EList<PowerGridNode> getConnectedTo();

    /**
     * Returns the value of the '<em><b>Linked By</b></em>' reference list. The list contents are of
     * type {@link smartgridtopo.PhysicalConnection}. It is bidirectional and its opposite is
     * '{@link smartgridtopo.PhysicalConnection#getLinks <em>Links</em>}'. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Linked By</em>' reference list isn't clear, there really should be
     * more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Linked By</em>' reference list.
     * @see smartgridtopo.SmartgridtopoPackage#getNetworkEntity_LinkedBy()
     * @see smartgridtopo.PhysicalConnection#getLinks
     * @model opposite="Links"
     * @generated
     */
    EList<PhysicalConnection> getLinkedBy();

} // NetworkEntity
