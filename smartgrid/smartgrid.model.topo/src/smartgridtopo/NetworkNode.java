/**
 */
package smartgridtopo;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Network Node</b></em>'. <!--
 * end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link smartgridtopo.NetworkNode#getIsA <em>Is A</em>}</li>
 * </ul>
 *
 * @see smartgridtopo.SmartgridtopoPackage#getNetworkNode()
 * @model
 * @generated
 */
public interface NetworkNode extends NetworkEntity {
    /**
     * Returns the value of the '<em><b>Is A</b></em>' reference. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Is A</em>' reference isn't clear, there really should be more of a
     * description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Is A</em>' reference.
     * @see #setIsA(NetworkNodeType)
     * @see smartgridtopo.SmartgridtopoPackage#getNetworkNode_IsA()
     * @model
     * @generated
     */
    NetworkNodeType getIsA();

    /**
     * Sets the value of the '{@link smartgridtopo.NetworkNode#getIsA <em>Is A</em>}' reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>Is A</em>' reference.
     * @see #getIsA()
     * @generated
     */
    void setIsA(NetworkNodeType value);

} // NetworkNode
