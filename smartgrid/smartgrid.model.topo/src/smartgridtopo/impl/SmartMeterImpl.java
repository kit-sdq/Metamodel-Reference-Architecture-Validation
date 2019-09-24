/**
 */
package smartgridtopo.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import smartgridtopo.SmartMeter;
import smartgridtopo.SmartMeterType;
import smartgridtopo.SmartgridtopoPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Smart Meter</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link smartgridtopo.impl.SmartMeterImpl#getIsA <em>Is A</em>}</li>
 * <li>{@link smartgridtopo.impl.SmartMeterImpl#getAggregation <em>Aggregation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SmartMeterImpl extends CommunicatingEntityImpl implements SmartMeter {
    /**
     * The cached value of the '{@link #getIsA() <em>Is A</em>}' reference. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #getIsA()
     * @generated
     * @ordered
     */
    protected SmartMeterType isA;

    /**
     * The default value of the '{@link #getAggregation() <em>Aggregation</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getAggregation()
     * @generated
     * @ordered
     */
    protected static final int AGGREGATION_EDEFAULT = 1;

    /**
     * The cached value of the '{@link #getAggregation() <em>Aggregation</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getAggregation()
     * @generated
     * @ordered
     */
    protected int aggregation = AGGREGATION_EDEFAULT;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected SmartMeterImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SmartgridtopoPackage.Literals.SMART_METER;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public SmartMeterType getIsA() {
        if (isA != null && isA.eIsProxy()) {
            InternalEObject oldIsA = (InternalEObject) isA;
            isA = (SmartMeterType) eResolveProxy(oldIsA);
            if (isA != oldIsA) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, SmartgridtopoPackage.SMART_METER__IS_A, oldIsA, isA));
            }
        }
        return isA;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public SmartMeterType basicGetIsA() {
        return isA;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setIsA(SmartMeterType newIsA) {
        SmartMeterType oldIsA = isA;
        isA = newIsA;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SmartgridtopoPackage.SMART_METER__IS_A, oldIsA, isA));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public int getAggregation() {
        return aggregation;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setAggregation(int newAggregation) {
        int oldAggregation = aggregation;
        aggregation = newAggregation;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SmartgridtopoPackage.SMART_METER__AGGREGATION, oldAggregation, aggregation));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
        case SmartgridtopoPackage.SMART_METER__IS_A:
            if (resolve)
                return getIsA();
            return basicGetIsA();
        case SmartgridtopoPackage.SMART_METER__AGGREGATION:
            return getAggregation();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
        case SmartgridtopoPackage.SMART_METER__IS_A:
            setIsA((SmartMeterType) newValue);
            return;
        case SmartgridtopoPackage.SMART_METER__AGGREGATION:
            setAggregation((Integer) newValue);
            return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
        case SmartgridtopoPackage.SMART_METER__IS_A:
            setIsA((SmartMeterType) null);
            return;
        case SmartgridtopoPackage.SMART_METER__AGGREGATION:
            setAggregation(AGGREGATION_EDEFAULT);
            return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
        case SmartgridtopoPackage.SMART_METER__IS_A:
            return isA != null;
        case SmartgridtopoPackage.SMART_METER__AGGREGATION:
            return aggregation != AGGREGATION_EDEFAULT;
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy())
            return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (Aggregation: ");
        result.append(aggregation);
        result.append(')');
        return result.toString();
    }

} //SmartMeterImpl
