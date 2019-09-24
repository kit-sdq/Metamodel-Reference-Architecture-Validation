/**
 */
package smartgridtopo;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Logical
 * Communication</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link smartgridtopo.LogicalCommunication#getLinks <em>Links</em>}</li>
 * </ul>
 *
 * @see smartgridtopo.SmartgridtopoPackage#getLogicalCommunication()
 * @model
 * @generated
 */
public interface LogicalCommunication extends NamedEntity {
    /**
     * Returns the value of the '<em><b>Links</b></em>' reference list. The list contents are of
     * type {@link smartgridtopo.CommunicatingEntity}. It is bidirectional and its opposite is
     * '{@link smartgridtopo.CommunicatingEntity#getCommunicatesBy <em>Communicates By</em>}'. <!--
     * begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Links</em>' reference list isn't clear, there really should be
     * more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Links</em>' reference list.
     * @see smartgridtopo.SmartgridtopoPackage#getLogicalCommunication_Links()
     * @see smartgridtopo.CommunicatingEntity#getCommunicatesBy
     * @model opposite="CommunicatesBy" lower="2" upper="2"
     * @generated
     */
    EList<CommunicatingEntity> getLinks();

} // LogicalCommunication
