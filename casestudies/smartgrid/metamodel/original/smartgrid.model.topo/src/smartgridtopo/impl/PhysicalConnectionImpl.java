/**
 */
package smartgridtopo.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import smartgridtopo.ConnectionType;
import smartgridtopo.NetworkEntity;
import smartgridtopo.PhysicalConnection;
import smartgridtopo.SmartgridtopoPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Physical
 * Connection</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link smartgridtopo.impl.PhysicalConnectionImpl#getName <em>Name</em>}</li>
 * <li>{@link smartgridtopo.impl.PhysicalConnectionImpl#getLinks <em>Links</em>}</li>
 * <li>{@link smartgridtopo.impl.PhysicalConnectionImpl#getIsA <em>Is A</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PhysicalConnectionImpl extends MinimalEObjectImpl.Container implements PhysicalConnection {
    /**
     * The default value of the '{@link #getName() <em>Name</em>}' attribute. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * 
     * @see #getName()
     * @generated
     * @ordered
     */
    protected static final String NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getName() <em>Name</em>}' attribute. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #getName()
     * @generated
     * @ordered
     */
    protected String name = NAME_EDEFAULT;

    /**
     * The cached value of the '{@link #getLinks() <em>Links</em>}' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getLinks()
     * @generated
     * @ordered
     */
    protected EList<NetworkEntity> links;

    /**
     * The cached value of the '{@link #getIsA() <em>Is A</em>}' reference. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #getIsA()
     * @generated
     * @ordered
     */
    protected ConnectionType isA;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected PhysicalConnectionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SmartgridtopoPackage.Literals.PHYSICAL_CONNECTION;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setName(String newName) {
        String oldName = name;
        name = newName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SmartgridtopoPackage.PHYSICAL_CONNECTION__NAME, oldName, name));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EList<NetworkEntity> getLinks() {
        if (links == null) {
            links = new EObjectWithInverseResolvingEList.ManyInverse<>(NetworkEntity.class, this, SmartgridtopoPackage.PHYSICAL_CONNECTION__LINKS,
                    SmartgridtopoPackage.NETWORK_ENTITY__LINKED_BY);
        }
        return links;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public ConnectionType getIsA() {
        if (isA != null && isA.eIsProxy()) {
            InternalEObject oldIsA = (InternalEObject) isA;
            isA = (ConnectionType) eResolveProxy(oldIsA);
            if (isA != oldIsA) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, SmartgridtopoPackage.PHYSICAL_CONNECTION__IS_A, oldIsA, isA));
            }
        }
        return isA;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public ConnectionType basicGetIsA() {
        return isA;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setIsA(ConnectionType newIsA) {
        ConnectionType oldIsA = isA;
        isA = newIsA;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SmartgridtopoPackage.PHYSICAL_CONNECTION__IS_A, oldIsA, isA));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case SmartgridtopoPackage.PHYSICAL_CONNECTION__LINKS:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) getLinks()).basicAdd(otherEnd, msgs);
        }
        return super.eInverseAdd(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case SmartgridtopoPackage.PHYSICAL_CONNECTION__LINKS:
            return ((InternalEList<?>) getLinks()).basicRemove(otherEnd, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
        case SmartgridtopoPackage.PHYSICAL_CONNECTION__NAME:
            return getName();
        case SmartgridtopoPackage.PHYSICAL_CONNECTION__LINKS:
            return getLinks();
        case SmartgridtopoPackage.PHYSICAL_CONNECTION__IS_A:
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
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
        case SmartgridtopoPackage.PHYSICAL_CONNECTION__NAME:
            setName((String) newValue);
            return;
        case SmartgridtopoPackage.PHYSICAL_CONNECTION__LINKS:
            getLinks().clear();
            getLinks().addAll((Collection<? extends NetworkEntity>) newValue);
            return;
        case SmartgridtopoPackage.PHYSICAL_CONNECTION__IS_A:
            setIsA((ConnectionType) newValue);
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
        case SmartgridtopoPackage.PHYSICAL_CONNECTION__NAME:
            setName(NAME_EDEFAULT);
            return;
        case SmartgridtopoPackage.PHYSICAL_CONNECTION__LINKS:
            getLinks().clear();
            return;
        case SmartgridtopoPackage.PHYSICAL_CONNECTION__IS_A:
            setIsA((ConnectionType) null);
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
        case SmartgridtopoPackage.PHYSICAL_CONNECTION__NAME:
            return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
        case SmartgridtopoPackage.PHYSICAL_CONNECTION__LINKS:
            return links != null && !links.isEmpty();
        case SmartgridtopoPackage.PHYSICAL_CONNECTION__IS_A:
            return isA != null;
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
        result.append(" (name: ");
        result.append(name);
        result.append(')');
        return result.toString();
    }

} //PhysicalConnectionImpl
