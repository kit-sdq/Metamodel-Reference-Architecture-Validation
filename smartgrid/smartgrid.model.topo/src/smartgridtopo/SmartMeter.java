/**
 */
package smartgridtopo;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Smart Meter</b></em>'. <!--
 * end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link smartgridtopo.SmartMeter#getIsA <em>Is A</em>}</li>
 * <li>{@link smartgridtopo.SmartMeter#getAggregation <em>Aggregation</em>}</li>
 * </ul>
 *
 * @see smartgridtopo.SmartgridtopoPackage#getSmartMeter()
 * @model
 * @generated
 */
public interface SmartMeter extends CommunicatingEntity {
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
     * @see smartgridtopo.SmartgridtopoPackage#getSmartMeter_IsA()
     * @model
     * @generated
     */
    SmartMeterType getIsA();

    /**
     * Sets the value of the '{@link smartgridtopo.SmartMeter#getIsA <em>Is A</em>}' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>Is A</em>' reference.
     * @see #getIsA()
     * @generated
     */
    void setIsA(SmartMeterType value);

    /**
     * Returns the value of the '<em><b>Aggregation</b></em>' attribute. The default value is
     * <code>"1"</code>. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Aggregation</em>' attribute isn't clear, there really should be
     * more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Aggregation</em>' attribute.
     * @see #setAggregation(int)
     * @see smartgridtopo.SmartgridtopoPackage#getSmartMeter_Aggregation()
     * @model default="1"
     * @generated
     */
    int getAggregation();

    /**
     * Sets the value of the '{@link smartgridtopo.SmartMeter#getAggregation <em>Aggregation</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>Aggregation</em>' attribute.
     * @see #getAggregation()
     * @generated
     */
    void setAggregation(int value);

} // SmartMeter
