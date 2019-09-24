/**
 */
package smartgridtopo;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Communicating
 * Entity</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link smartgridtopo.CommunicatingEntity#getCommunicatesBy <em>Communicates By</em>}</li>
 * </ul>
 *
 * @see smartgridtopo.SmartgridtopoPackage#getCommunicatingEntity()
 * @model abstract="true"
 * @generated
 */
public interface CommunicatingEntity extends NetworkEntity {
    /**
     * Returns the value of the '<em><b>Communicates By</b></em>' reference list. The list contents
     * are of type {@link smartgridtopo.LogicalCommunication}. It is bidirectional and its opposite
     * is '{@link smartgridtopo.LogicalCommunication#getLinks <em>Links</em>}'. <!-- begin-user-doc
     * -->
     * <p>
     * If the meaning of the '<em>Communicates By</em>' reference list isn't clear, there really
     * should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Communicates By</em>' reference list.
     * @see smartgridtopo.SmartgridtopoPackage#getCommunicatingEntity_CommunicatesBy()
     * @see smartgridtopo.LogicalCommunication#getLinks
     * @model opposite="Links"
     * @generated
     */
    EList<LogicalCommunication> getCommunicatesBy();

} // CommunicatingEntity
