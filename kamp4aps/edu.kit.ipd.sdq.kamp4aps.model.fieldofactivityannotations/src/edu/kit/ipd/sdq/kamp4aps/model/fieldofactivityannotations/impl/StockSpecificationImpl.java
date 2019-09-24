/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl;

import edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.ComponentStockList;
import edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.FieldOfActivityAnnotationRepository;
import edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.InterfaceStockList;
import edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.KAMP4aPSFieldofactivityannotationsPackage;
import edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.ModuleStockList;
import edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.Role;
import edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.StockSpecification;
import edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.StructureStockList;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stock Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.StockSpecificationImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.StockSpecificationImpl#getComponentStockList <em>Component Stock List</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.StockSpecificationImpl#getInterfaceStockList <em>Interface Stock List</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.StockSpecificationImpl#getModuleStockList <em>Module Stock List</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.StockSpecificationImpl#getStructureStockList <em>Structure Stock List</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.StockSpecificationImpl#getRole <em>Role</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StockSpecificationImpl extends MinimalEObjectImpl.Container implements StockSpecification {
	/**
	 * The cached value of the '{@link #getComponentStockList() <em>Component Stock List</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentStockList()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentStockList> componentStockList;

	/**
	 * The cached value of the '{@link #getInterfaceStockList() <em>Interface Stock List</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaceStockList()
	 * @generated
	 * @ordered
	 */
	protected EList<InterfaceStockList> interfaceStockList;

	/**
	 * The cached value of the '{@link #getModuleStockList() <em>Module Stock List</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModuleStockList()
	 * @generated
	 * @ordered
	 */
	protected EList<ModuleStockList> moduleStockList;

	/**
	 * The cached value of the '{@link #getStructureStockList() <em>Structure Stock List</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructureStockList()
	 * @generated
	 * @ordered
	 */
	protected EList<StructureStockList> structureStockList;

	/**
	 * The cached value of the '{@link #getRole() <em>Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected Role role;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StockSpecificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KAMP4aPSFieldofactivityannotationsPackage.Literals.STOCK_SPECIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FieldOfActivityAnnotationRepository getParent() {
		if (eContainerFeatureID() != KAMP4aPSFieldofactivityannotationsPackage.STOCK_SPECIFICATION__PARENT) return null;
		return (FieldOfActivityAnnotationRepository)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(FieldOfActivityAnnotationRepository newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, KAMP4aPSFieldofactivityannotationsPackage.STOCK_SPECIFICATION__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(FieldOfActivityAnnotationRepository newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != KAMP4aPSFieldofactivityannotationsPackage.STOCK_SPECIFICATION__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, KAMP4aPSFieldofactivityannotationsPackage.FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__STOCK_SPECIFICATION, FieldOfActivityAnnotationRepository.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KAMP4aPSFieldofactivityannotationsPackage.STOCK_SPECIFICATION__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComponentStockList> getComponentStockList() {
		if (componentStockList == null) {
			componentStockList = new EObjectContainmentWithInverseEList<ComponentStockList>(ComponentStockList.class, this, KAMP4aPSFieldofactivityannotationsPackage.STOCK_SPECIFICATION__COMPONENT_STOCK_LIST, KAMP4aPSFieldofactivityannotationsPackage.COMPONENT_STOCK_LIST__PARENT);
		}
		return componentStockList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InterfaceStockList> getInterfaceStockList() {
		if (interfaceStockList == null) {
			interfaceStockList = new EObjectContainmentWithInverseEList<InterfaceStockList>(InterfaceStockList.class, this, KAMP4aPSFieldofactivityannotationsPackage.STOCK_SPECIFICATION__INTERFACE_STOCK_LIST, KAMP4aPSFieldofactivityannotationsPackage.INTERFACE_STOCK_LIST__PARENT);
		}
		return interfaceStockList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModuleStockList> getModuleStockList() {
		if (moduleStockList == null) {
			moduleStockList = new EObjectContainmentWithInverseEList<ModuleStockList>(ModuleStockList.class, this, KAMP4aPSFieldofactivityannotationsPackage.STOCK_SPECIFICATION__MODULE_STOCK_LIST, KAMP4aPSFieldofactivityannotationsPackage.MODULE_STOCK_LIST__PARENT);
		}
		return moduleStockList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StructureStockList> getStructureStockList() {
		if (structureStockList == null) {
			structureStockList = new EObjectContainmentWithInverseEList<StructureStockList>(StructureStockList.class, this, KAMP4aPSFieldofactivityannotationsPackage.STOCK_SPECIFICATION__STRUCTURE_STOCK_LIST, KAMP4aPSFieldofactivityannotationsPackage.STRUCTURE_STOCK_LIST__PARENT);
		}
		return structureStockList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role getRole() {
		if (role != null && role.eIsProxy()) {
			InternalEObject oldRole = (InternalEObject)role;
			role = (Role)eResolveProxy(oldRole);
			if (role != oldRole) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, KAMP4aPSFieldofactivityannotationsPackage.STOCK_SPECIFICATION__ROLE, oldRole, role));
			}
		}
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role basicGetRole() {
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRole(Role newRole) {
		Role oldRole = role;
		role = newRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KAMP4aPSFieldofactivityannotationsPackage.STOCK_SPECIFICATION__ROLE, oldRole, role));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KAMP4aPSFieldofactivityannotationsPackage.STOCK_SPECIFICATION__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((FieldOfActivityAnnotationRepository)otherEnd, msgs);
			case KAMP4aPSFieldofactivityannotationsPackage.STOCK_SPECIFICATION__COMPONENT_STOCK_LIST:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getComponentStockList()).basicAdd(otherEnd, msgs);
			case KAMP4aPSFieldofactivityannotationsPackage.STOCK_SPECIFICATION__INTERFACE_STOCK_LIST:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInterfaceStockList()).basicAdd(otherEnd, msgs);
			case KAMP4aPSFieldofactivityannotationsPackage.STOCK_SPECIFICATION__MODULE_STOCK_LIST:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getModuleStockList()).basicAdd(otherEnd, msgs);
			case KAMP4aPSFieldofactivityannotationsPackage.STOCK_SPECIFICATION__STRUCTURE_STOCK_LIST:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getStructureStockList()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KAMP4aPSFieldofactivityannotationsPackage.STOCK_SPECIFICATION__PARENT:
				return basicSetParent(null, msgs);
			case KAMP4aPSFieldofactivityannotationsPackage.STOCK_SPECIFICATION__COMPONENT_STOCK_LIST:
				return ((InternalEList<?>)getComponentStockList()).basicRemove(otherEnd, msgs);
			case KAMP4aPSFieldofactivityannotationsPackage.STOCK_SPECIFICATION__INTERFACE_STOCK_LIST:
				return ((InternalEList<?>)getInterfaceStockList()).basicRemove(otherEnd, msgs);
			case KAMP4aPSFieldofactivityannotationsPackage.STOCK_SPECIFICATION__MODULE_STOCK_LIST:
				return ((InternalEList<?>)getModuleStockList()).basicRemove(otherEnd, msgs);
			case KAMP4aPSFieldofactivityannotationsPackage.STOCK_SPECIFICATION__STRUCTURE_STOCK_LIST:
				return ((InternalEList<?>)getStructureStockList()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case KAMP4aPSFieldofactivityannotationsPackage.STOCK_SPECIFICATION__PARENT:
				return eInternalContainer().eInverseRemove(this, KAMP4aPSFieldofactivityannotationsPackage.FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__STOCK_SPECIFICATION, FieldOfActivityAnnotationRepository.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case KAMP4aPSFieldofactivityannotationsPackage.STOCK_SPECIFICATION__PARENT:
				return getParent();
			case KAMP4aPSFieldofactivityannotationsPackage.STOCK_SPECIFICATION__COMPONENT_STOCK_LIST:
				return getComponentStockList();
			case KAMP4aPSFieldofactivityannotationsPackage.STOCK_SPECIFICATION__INTERFACE_STOCK_LIST:
				return getInterfaceStockList();
			case KAMP4aPSFieldofactivityannotationsPackage.STOCK_SPECIFICATION__MODULE_STOCK_LIST:
				return getModuleStockList();
			case KAMP4aPSFieldofactivityannotationsPackage.STOCK_SPECIFICATION__STRUCTURE_STOCK_LIST:
				return getStructureStockList();
			case KAMP4aPSFieldofactivityannotationsPackage.STOCK_SPECIFICATION__ROLE:
				if (resolve) return getRole();
				return basicGetRole();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case KAMP4aPSFieldofactivityannotationsPackage.STOCK_SPECIFICATION__PARENT:
				setParent((FieldOfActivityAnnotationRepository)newValue);
				return;
			case KAMP4aPSFieldofactivityannotationsPackage.STOCK_SPECIFICATION__COMPONENT_STOCK_LIST:
				getComponentStockList().clear();
				getComponentStockList().addAll((Collection<? extends ComponentStockList>)newValue);
				return;
			case KAMP4aPSFieldofactivityannotationsPackage.STOCK_SPECIFICATION__INTERFACE_STOCK_LIST:
				getInterfaceStockList().clear();
				getInterfaceStockList().addAll((Collection<? extends InterfaceStockList>)newValue);
				return;
			case KAMP4aPSFieldofactivityannotationsPackage.STOCK_SPECIFICATION__MODULE_STOCK_LIST:
				getModuleStockList().clear();
				getModuleStockList().addAll((Collection<? extends ModuleStockList>)newValue);
				return;
			case KAMP4aPSFieldofactivityannotationsPackage.STOCK_SPECIFICATION__STRUCTURE_STOCK_LIST:
				getStructureStockList().clear();
				getStructureStockList().addAll((Collection<? extends StructureStockList>)newValue);
				return;
			case KAMP4aPSFieldofactivityannotationsPackage.STOCK_SPECIFICATION__ROLE:
				setRole((Role)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case KAMP4aPSFieldofactivityannotationsPackage.STOCK_SPECIFICATION__PARENT:
				setParent((FieldOfActivityAnnotationRepository)null);
				return;
			case KAMP4aPSFieldofactivityannotationsPackage.STOCK_SPECIFICATION__COMPONENT_STOCK_LIST:
				getComponentStockList().clear();
				return;
			case KAMP4aPSFieldofactivityannotationsPackage.STOCK_SPECIFICATION__INTERFACE_STOCK_LIST:
				getInterfaceStockList().clear();
				return;
			case KAMP4aPSFieldofactivityannotationsPackage.STOCK_SPECIFICATION__MODULE_STOCK_LIST:
				getModuleStockList().clear();
				return;
			case KAMP4aPSFieldofactivityannotationsPackage.STOCK_SPECIFICATION__STRUCTURE_STOCK_LIST:
				getStructureStockList().clear();
				return;
			case KAMP4aPSFieldofactivityannotationsPackage.STOCK_SPECIFICATION__ROLE:
				setRole((Role)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case KAMP4aPSFieldofactivityannotationsPackage.STOCK_SPECIFICATION__PARENT:
				return getParent() != null;
			case KAMP4aPSFieldofactivityannotationsPackage.STOCK_SPECIFICATION__COMPONENT_STOCK_LIST:
				return componentStockList != null && !componentStockList.isEmpty();
			case KAMP4aPSFieldofactivityannotationsPackage.STOCK_SPECIFICATION__INTERFACE_STOCK_LIST:
				return interfaceStockList != null && !interfaceStockList.isEmpty();
			case KAMP4aPSFieldofactivityannotationsPackage.STOCK_SPECIFICATION__MODULE_STOCK_LIST:
				return moduleStockList != null && !moduleStockList.isEmpty();
			case KAMP4aPSFieldofactivityannotationsPackage.STOCK_SPECIFICATION__STRUCTURE_STOCK_LIST:
				return structureStockList != null && !structureStockList.isEmpty();
			case KAMP4aPSFieldofactivityannotationsPackage.STOCK_SPECIFICATION__ROLE:
				return role != null;
		}
		return super.eIsSet(featureID);
	}

} //StockSpecificationImpl
