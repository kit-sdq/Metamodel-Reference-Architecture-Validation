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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import smartgridtopo.NamedEntity;
import smartgridtopo.NetworkEntity;
import smartgridtopo.PhysicalConnection;
import smartgridtopo.PowerGridNode;
import smartgridtopo.SmartgridtopoPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Network Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link smartgridtopo.impl.NetworkEntityImpl#getId <em>Id</em>}</li>
 * <li>{@link smartgridtopo.impl.NetworkEntityImpl#getName <em>Name</em>}</li>
 * <li>{@link smartgridtopo.impl.NetworkEntityImpl#getConnectedTo <em>Connected To</em>}</li>
 * <li>{@link smartgridtopo.impl.NetworkEntityImpl#getLinkedBy <em>Linked By</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class NetworkEntityImpl extends MinimalEObjectImpl.Container implements NetworkEntity {
    /**
     * The default value of the '{@link #getId() <em>Id</em>}' attribute. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #getId()
     * @generated
     * @ordered
     */
    protected static final int ID_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getId() <em>Id</em>}' attribute. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #getId()
     * @generated
     * @ordered
     */
    protected int id = ID_EDEFAULT;

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
     * The cached value of the '{@link #getConnectedTo() <em>Connected To</em>}' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getConnectedTo()
     * @generated
     * @ordered
     */
    protected EList<PowerGridNode> connectedTo;

    /**
     * The cached value of the '{@link #getLinkedBy() <em>Linked By</em>}' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getLinkedBy()
     * @generated
     * @ordered
     */
    protected EList<PhysicalConnection> linkedBy;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected NetworkEntityImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SmartgridtopoPackage.Literals.NETWORK_ENTITY;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public int getId() {
        return id;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setId(int newId) {
        int oldId = id;
        id = newId;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SmartgridtopoPackage.NETWORK_ENTITY__ID, oldId, id));
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
            eNotify(new ENotificationImpl(this, Notification.SET, SmartgridtopoPackage.NETWORK_ENTITY__NAME, oldName, name));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EList<PowerGridNode> getConnectedTo() {
        if (connectedTo == null) {
            connectedTo = new EObjectResolvingEList<>(PowerGridNode.class, this, SmartgridtopoPackage.NETWORK_ENTITY__CONNECTED_TO);
        }
        return connectedTo;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EList<PhysicalConnection> getLinkedBy() {
        if (linkedBy == null) {
            linkedBy = new EObjectWithInverseResolvingEList.ManyInverse<>(PhysicalConnection.class, this, SmartgridtopoPackage.NETWORK_ENTITY__LINKED_BY,
                    SmartgridtopoPackage.PHYSICAL_CONNECTION__LINKS);
        }
        return linkedBy;
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
        case SmartgridtopoPackage.NETWORK_ENTITY__LINKED_BY:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) getLinkedBy()).basicAdd(otherEnd, msgs);
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
        case SmartgridtopoPackage.NETWORK_ENTITY__LINKED_BY:
            return ((InternalEList<?>) getLinkedBy()).basicRemove(otherEnd, msgs);
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
        case SmartgridtopoPackage.NETWORK_ENTITY__ID:
            return getId();
        case SmartgridtopoPackage.NETWORK_ENTITY__NAME:
            return getName();
        case SmartgridtopoPackage.NETWORK_ENTITY__CONNECTED_TO:
            return getConnectedTo();
        case SmartgridtopoPackage.NETWORK_ENTITY__LINKED_BY:
            return getLinkedBy();
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
        case SmartgridtopoPackage.NETWORK_ENTITY__ID:
            setId((Integer) newValue);
            return;
        case SmartgridtopoPackage.NETWORK_ENTITY__NAME:
            setName((String) newValue);
            return;
        case SmartgridtopoPackage.NETWORK_ENTITY__CONNECTED_TO:
            getConnectedTo().clear();
            getConnectedTo().addAll((Collection<? extends PowerGridNode>) newValue);
            return;
        case SmartgridtopoPackage.NETWORK_ENTITY__LINKED_BY:
            getLinkedBy().clear();
            getLinkedBy().addAll((Collection<? extends PhysicalConnection>) newValue);
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
        case SmartgridtopoPackage.NETWORK_ENTITY__ID:
            setId(ID_EDEFAULT);
            return;
        case SmartgridtopoPackage.NETWORK_ENTITY__NAME:
            setName(NAME_EDEFAULT);
            return;
        case SmartgridtopoPackage.NETWORK_ENTITY__CONNECTED_TO:
            getConnectedTo().clear();
            return;
        case SmartgridtopoPackage.NETWORK_ENTITY__LINKED_BY:
            getLinkedBy().clear();
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
        case SmartgridtopoPackage.NETWORK_ENTITY__ID:
            return id != ID_EDEFAULT;
        case SmartgridtopoPackage.NETWORK_ENTITY__NAME:
            return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
        case SmartgridtopoPackage.NETWORK_ENTITY__CONNECTED_TO:
            return connectedTo != null && !connectedTo.isEmpty();
        case SmartgridtopoPackage.NETWORK_ENTITY__LINKED_BY:
            return linkedBy != null && !linkedBy.isEmpty();
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
        if (baseClass == NamedEntity.class) {
            switch (derivedFeatureID) {
            case SmartgridtopoPackage.NETWORK_ENTITY__NAME:
                return SmartgridtopoPackage.NAMED_ENTITY__NAME;
            default:
                return -1;
            }
        }
        return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
        if (baseClass == NamedEntity.class) {
            switch (baseFeatureID) {
            case SmartgridtopoPackage.NAMED_ENTITY__NAME:
                return SmartgridtopoPackage.NETWORK_ENTITY__NAME;
            default:
                return -1;
            }
        }
        return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
        result.append(" (id: ");
        result.append(id);
        result.append(", name: ");
        result.append(name);
        result.append(')');
        return result.toString();
    }

} //NetworkEntityImpl
