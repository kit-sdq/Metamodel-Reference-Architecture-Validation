/**
 */
package smartgridtopo;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Identifier</b></em>'. <!--
 * end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link smartgridtopo.Identifier#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see smartgridtopo.SmartgridtopoPackage#getIdentifier()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Identifier extends EObject {
    /**
     * Returns the value of the '<em><b>Id</b></em>' attribute. The default value is
     * <code>"0"</code>. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Id</em>' attribute isn't clear, there really should be more of a
     * description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Id</em>' attribute.
     * @see #setId(int)
     * @see smartgridtopo.SmartgridtopoPackage#getIdentifier_Id()
     * @model default="0" unique="false" id="true" required="true" ordered="false"
     * @generated
     */
    int getId();

    /**
     * Sets the value of the '{@link smartgridtopo.Identifier#getId <em>Id</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>Id</em>' attribute.
     * @see #getId()
     * @generated
     */
    void setId(int value);

} // Identifier
