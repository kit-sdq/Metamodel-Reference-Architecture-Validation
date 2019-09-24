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
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import smartgridtopo.ConnectionType;
import smartgridtopo.NamedEntity;
import smartgridtopo.NetworkNodeType;
import smartgridtopo.Repository;
import smartgridtopo.SmartMeterType;
import smartgridtopo.SmartgridtopoPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Repository</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link smartgridtopo.impl.RepositoryImpl#getId <em>Id</em>}</li>
 * <li>{@link smartgridtopo.impl.RepositoryImpl#getName <em>Name</em>}</li>
 * <li>{@link smartgridtopo.impl.RepositoryImpl#getContainsSmartMeterTypes <em>Contains Smart Meter
 * Types</em>}</li>
 * <li>{@link smartgridtopo.impl.RepositoryImpl#getContainsConnectionType <em>Contains Connection
 * Type</em>}</li>
 * <li>{@link smartgridtopo.impl.RepositoryImpl#getContainsNetworkNodeTypes <em>Contains Network
 * Node Types</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RepositoryImpl extends MinimalEObjectImpl.Container implements Repository {
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
     * The cached value of the '{@link #getContainsSmartMeterTypes() <em>Contains Smart Meter
     * Types</em>}' containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getContainsSmartMeterTypes()
     * @generated
     * @ordered
     */
    protected EList<SmartMeterType> containsSmartMeterTypes;

    /**
     * The cached value of the '{@link #getContainsConnectionType() <em>Contains Connection
     * Type</em>}' containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getContainsConnectionType()
     * @generated
     * @ordered
     */
    protected EList<ConnectionType> containsConnectionType;

    /**
     * The cached value of the '{@link #getContainsNetworkNodeTypes() <em>Contains Network Node
     * Types</em>}' containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getContainsNetworkNodeTypes()
     * @generated
     * @ordered
     */
    protected EList<NetworkNodeType> containsNetworkNodeTypes;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected RepositoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SmartgridtopoPackage.Literals.REPOSITORY;
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
            eNotify(new ENotificationImpl(this, Notification.SET, SmartgridtopoPackage.REPOSITORY__ID, oldId, id));
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
            eNotify(new ENotificationImpl(this, Notification.SET, SmartgridtopoPackage.REPOSITORY__NAME, oldName, name));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EList<SmartMeterType> getContainsSmartMeterTypes() {
        if (containsSmartMeterTypes == null) {
            containsSmartMeterTypes = new EObjectContainmentEList<>(SmartMeterType.class, this, SmartgridtopoPackage.REPOSITORY__CONTAINS_SMART_METER_TYPES);
        }
        return containsSmartMeterTypes;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EList<ConnectionType> getContainsConnectionType() {
        if (containsConnectionType == null) {
            containsConnectionType = new EObjectContainmentEList<>(ConnectionType.class, this, SmartgridtopoPackage.REPOSITORY__CONTAINS_CONNECTION_TYPE);
        }
        return containsConnectionType;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EList<NetworkNodeType> getContainsNetworkNodeTypes() {
        if (containsNetworkNodeTypes == null) {
            containsNetworkNodeTypes = new EObjectContainmentEList<>(NetworkNodeType.class, this, SmartgridtopoPackage.REPOSITORY__CONTAINS_NETWORK_NODE_TYPES);
        }
        return containsNetworkNodeTypes;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case SmartgridtopoPackage.REPOSITORY__CONTAINS_SMART_METER_TYPES:
            return ((InternalEList<?>) getContainsSmartMeterTypes()).basicRemove(otherEnd, msgs);
        case SmartgridtopoPackage.REPOSITORY__CONTAINS_CONNECTION_TYPE:
            return ((InternalEList<?>) getContainsConnectionType()).basicRemove(otherEnd, msgs);
        case SmartgridtopoPackage.REPOSITORY__CONTAINS_NETWORK_NODE_TYPES:
            return ((InternalEList<?>) getContainsNetworkNodeTypes()).basicRemove(otherEnd, msgs);
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
        case SmartgridtopoPackage.REPOSITORY__ID:
            return getId();
        case SmartgridtopoPackage.REPOSITORY__NAME:
            return getName();
        case SmartgridtopoPackage.REPOSITORY__CONTAINS_SMART_METER_TYPES:
            return getContainsSmartMeterTypes();
        case SmartgridtopoPackage.REPOSITORY__CONTAINS_CONNECTION_TYPE:
            return getContainsConnectionType();
        case SmartgridtopoPackage.REPOSITORY__CONTAINS_NETWORK_NODE_TYPES:
            return getContainsNetworkNodeTypes();
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
        case SmartgridtopoPackage.REPOSITORY__ID:
            setId((Integer) newValue);
            return;
        case SmartgridtopoPackage.REPOSITORY__NAME:
            setName((String) newValue);
            return;
        case SmartgridtopoPackage.REPOSITORY__CONTAINS_SMART_METER_TYPES:
            getContainsSmartMeterTypes().clear();
            getContainsSmartMeterTypes().addAll((Collection<? extends SmartMeterType>) newValue);
            return;
        case SmartgridtopoPackage.REPOSITORY__CONTAINS_CONNECTION_TYPE:
            getContainsConnectionType().clear();
            getContainsConnectionType().addAll((Collection<? extends ConnectionType>) newValue);
            return;
        case SmartgridtopoPackage.REPOSITORY__CONTAINS_NETWORK_NODE_TYPES:
            getContainsNetworkNodeTypes().clear();
            getContainsNetworkNodeTypes().addAll((Collection<? extends NetworkNodeType>) newValue);
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
        case SmartgridtopoPackage.REPOSITORY__ID:
            setId(ID_EDEFAULT);
            return;
        case SmartgridtopoPackage.REPOSITORY__NAME:
            setName(NAME_EDEFAULT);
            return;
        case SmartgridtopoPackage.REPOSITORY__CONTAINS_SMART_METER_TYPES:
            getContainsSmartMeterTypes().clear();
            return;
        case SmartgridtopoPackage.REPOSITORY__CONTAINS_CONNECTION_TYPE:
            getContainsConnectionType().clear();
            return;
        case SmartgridtopoPackage.REPOSITORY__CONTAINS_NETWORK_NODE_TYPES:
            getContainsNetworkNodeTypes().clear();
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
        case SmartgridtopoPackage.REPOSITORY__ID:
            return id != ID_EDEFAULT;
        case SmartgridtopoPackage.REPOSITORY__NAME:
            return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
        case SmartgridtopoPackage.REPOSITORY__CONTAINS_SMART_METER_TYPES:
            return containsSmartMeterTypes != null && !containsSmartMeterTypes.isEmpty();
        case SmartgridtopoPackage.REPOSITORY__CONTAINS_CONNECTION_TYPE:
            return containsConnectionType != null && !containsConnectionType.isEmpty();
        case SmartgridtopoPackage.REPOSITORY__CONTAINS_NETWORK_NODE_TYPES:
            return containsNetworkNodeTypes != null && !containsNetworkNodeTypes.isEmpty();
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
            case SmartgridtopoPackage.REPOSITORY__NAME:
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
                return SmartgridtopoPackage.REPOSITORY__NAME;
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

} //RepositoryImpl
