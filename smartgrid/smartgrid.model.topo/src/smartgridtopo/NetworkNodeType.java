/**
 */
package smartgridtopo;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Network Node Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link smartgridtopo.NetworkNodeType#getIsA <em>Is A</em>}</li>
 * </ul>
 *
 * @see smartgridtopo.SmartgridtopoPackage#getNetworkNodeType()
 * @model
 * @generated
 */
public interface NetworkNodeType extends NamedIdentifier {
    /**
     * Returns the value of the '<em><b>Is A</b></em>' reference. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Is A</em>' reference isn't clear, there really should be more of a
     * description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Is A</em>' reference.
     * @see #setIsA(SmartMeterType)
     * @see smartgridtopo.SmartgridtopoPackage#getNetworkNodeType_IsA()
     * @model required="true"
     * @generated
     */
    SmartMeterType getIsA();

    /**
     * Sets the value of the '{@link smartgridtopo.NetworkNodeType#getIsA <em>Is A</em>}' reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>Is A</em>' reference.
     * @see #getIsA()
     * @generated
     */
    void setIsA(SmartMeterType value);

} // NetworkNodeType
