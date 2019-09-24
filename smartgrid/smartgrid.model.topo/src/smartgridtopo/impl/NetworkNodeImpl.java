/**
 */
package smartgridtopo.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import smartgridtopo.NetworkNode;
import smartgridtopo.NetworkNodeType;
import smartgridtopo.SmartgridtopoPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Network Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link smartgridtopo.impl.NetworkNodeImpl#getIsA <em>Is A</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NetworkNodeImpl extends NetworkEntityImpl implements NetworkNode {
    /**
     * The cached value of the '{@link #getIsA() <em>Is A</em>}' reference. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #getIsA()
     * @generated
     * @ordered
     */
    protected NetworkNodeType isA;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected NetworkNodeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SmartgridtopoPackage.Literals.NETWORK_NODE;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public NetworkNodeType getIsA() {
        if (isA != null && isA.eIsProxy()) {
            InternalEObject oldIsA = (InternalEObject) isA;
            isA = (NetworkNodeType) eResolveProxy(oldIsA);
            if (isA != oldIsA) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, SmartgridtopoPackage.NETWORK_NODE__IS_A, oldIsA, isA));
            }
        }
        return isA;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public NetworkNodeType basicGetIsA() {
        return isA;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setIsA(NetworkNodeType newIsA) {
        NetworkNodeType oldIsA = isA;
        isA = newIsA;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SmartgridtopoPackage.NETWORK_NODE__IS_A, oldIsA, isA));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
        case SmartgridtopoPackage.NETWORK_NODE__IS_A:
            if (resolve)
                return getIsA();
            return basicGetIsA();
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
        case SmartgridtopoPackage.NETWORK_NODE__IS_A:
            setIsA((NetworkNodeType) newValue);
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
        case SmartgridtopoPackage.NETWORK_NODE__IS_A:
            setIsA((NetworkNodeType) null);
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
        case SmartgridtopoPackage.NETWORK_NODE__IS_A:
            return isA != null;
        }
        return super.eIsSet(featureID);
    }

} //NetworkNodeImpl
