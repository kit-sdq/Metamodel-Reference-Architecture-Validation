/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl;

import edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.FieldOfActivityAnnotationRepository;
import edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.KAMP4aPSFieldofactivityannotationsPackage;
import edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.PersonList;
import edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.RoleList;
import edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.StaffSpecification;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Staff Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.StaffSpecificationImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.StaffSpecificationImpl#getPersonList <em>Person List</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.StaffSpecificationImpl#getRoleList <em>Role List</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StaffSpecificationImpl extends MinimalEObjectImpl.Container implements StaffSpecification {
	/**
	 * The cached value of the '{@link #getPersonList() <em>Person List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonList()
	 * @generated
	 * @ordered
	 */
	protected PersonList personList;

	/**
	 * The cached value of the '{@link #getRoleList() <em>Role List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleList()
	 * @generated
	 * @ordered
	 */
	protected RoleList roleList;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StaffSpecificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KAMP4aPSFieldofactivityannotationsPackage.Literals.STAFF_SPECIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FieldOfActivityAnnotationRepository getParent() {
		if (eContainerFeatureID() != KAMP4aPSFieldofactivityannotationsPackage.STAFF_SPECIFICATION__PARENT) return null;
		return (FieldOfActivityAnnotationRepository)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(FieldOfActivityAnnotationRepository newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, KAMP4aPSFieldofactivityannotationsPackage.STAFF_SPECIFICATION__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(FieldOfActivityAnnotationRepository newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != KAMP4aPSFieldofactivityannotationsPackage.STAFF_SPECIFICATION__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, KAMP4aPSFieldofactivityannotationsPackage.FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__STAFF_SPECIFICATION, FieldOfActivityAnnotationRepository.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KAMP4aPSFieldofactivityannotationsPackage.STAFF_SPECIFICATION__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersonList getPersonList() {
		return personList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPersonList(PersonList newPersonList, NotificationChain msgs) {
		PersonList oldPersonList = personList;
		personList = newPersonList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KAMP4aPSFieldofactivityannotationsPackage.STAFF_SPECIFICATION__PERSON_LIST, oldPersonList, newPersonList);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPersonList(PersonList newPersonList) {
		if (newPersonList != personList) {
			NotificationChain msgs = null;
			if (personList != null)
				msgs = ((InternalEObject)personList).eInverseRemove(this, KAMP4aPSFieldofactivityannotationsPackage.PERSON_LIST__PARENT, PersonList.class, msgs);
			if (newPersonList != null)
				msgs = ((InternalEObject)newPersonList).eInverseAdd(this, KAMP4aPSFieldofactivityannotationsPackage.PERSON_LIST__PARENT, PersonList.class, msgs);
			msgs = basicSetPersonList(newPersonList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KAMP4aPSFieldofactivityannotationsPackage.STAFF_SPECIFICATION__PERSON_LIST, newPersonList, newPersonList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleList getRoleList() {
		return roleList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRoleList(RoleList newRoleList, NotificationChain msgs) {
		RoleList oldRoleList = roleList;
		roleList = newRoleList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KAMP4aPSFieldofactivityannotationsPackage.STAFF_SPECIFICATION__ROLE_LIST, oldRoleList, newRoleList);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoleList(RoleList newRoleList) {
		if (newRoleList != roleList) {
			NotificationChain msgs = null;
			if (roleList != null)
				msgs = ((InternalEObject)roleList).eInverseRemove(this, KAMP4aPSFieldofactivityannotationsPackage.ROLE_LIST__PARENT, RoleList.class, msgs);
			if (newRoleList != null)
				msgs = ((InternalEObject)newRoleList).eInverseAdd(this, KAMP4aPSFieldofactivityannotationsPackage.ROLE_LIST__PARENT, RoleList.class, msgs);
			msgs = basicSetRoleList(newRoleList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KAMP4aPSFieldofactivityannotationsPackage.STAFF_SPECIFICATION__ROLE_LIST, newRoleList, newRoleList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KAMP4aPSFieldofactivityannotationsPackage.STAFF_SPECIFICATION__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((FieldOfActivityAnnotationRepository)otherEnd, msgs);
			case KAMP4aPSFieldofactivityannotationsPackage.STAFF_SPECIFICATION__PERSON_LIST:
				if (personList != null)
					msgs = ((InternalEObject)personList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KAMP4aPSFieldofactivityannotationsPackage.STAFF_SPECIFICATION__PERSON_LIST, null, msgs);
				return basicSetPersonList((PersonList)otherEnd, msgs);
			case KAMP4aPSFieldofactivityannotationsPackage.STAFF_SPECIFICATION__ROLE_LIST:
				if (roleList != null)
					msgs = ((InternalEObject)roleList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KAMP4aPSFieldofactivityannotationsPackage.STAFF_SPECIFICATION__ROLE_LIST, null, msgs);
				return basicSetRoleList((RoleList)otherEnd, msgs);
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
			case KAMP4aPSFieldofactivityannotationsPackage.STAFF_SPECIFICATION__PARENT:
				return basicSetParent(null, msgs);
			case KAMP4aPSFieldofactivityannotationsPackage.STAFF_SPECIFICATION__PERSON_LIST:
				return basicSetPersonList(null, msgs);
			case KAMP4aPSFieldofactivityannotationsPackage.STAFF_SPECIFICATION__ROLE_LIST:
				return basicSetRoleList(null, msgs);
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
			case KAMP4aPSFieldofactivityannotationsPackage.STAFF_SPECIFICATION__PARENT:
				return eInternalContainer().eInverseRemove(this, KAMP4aPSFieldofactivityannotationsPackage.FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__STAFF_SPECIFICATION, FieldOfActivityAnnotationRepository.class, msgs);
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
			case KAMP4aPSFieldofactivityannotationsPackage.STAFF_SPECIFICATION__PARENT:
				return getParent();
			case KAMP4aPSFieldofactivityannotationsPackage.STAFF_SPECIFICATION__PERSON_LIST:
				return getPersonList();
			case KAMP4aPSFieldofactivityannotationsPackage.STAFF_SPECIFICATION__ROLE_LIST:
				return getRoleList();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case KAMP4aPSFieldofactivityannotationsPackage.STAFF_SPECIFICATION__PARENT:
				setParent((FieldOfActivityAnnotationRepository)newValue);
				return;
			case KAMP4aPSFieldofactivityannotationsPackage.STAFF_SPECIFICATION__PERSON_LIST:
				setPersonList((PersonList)newValue);
				return;
			case KAMP4aPSFieldofactivityannotationsPackage.STAFF_SPECIFICATION__ROLE_LIST:
				setRoleList((RoleList)newValue);
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
			case KAMP4aPSFieldofactivityannotationsPackage.STAFF_SPECIFICATION__PARENT:
				setParent((FieldOfActivityAnnotationRepository)null);
				return;
			case KAMP4aPSFieldofactivityannotationsPackage.STAFF_SPECIFICATION__PERSON_LIST:
				setPersonList((PersonList)null);
				return;
			case KAMP4aPSFieldofactivityannotationsPackage.STAFF_SPECIFICATION__ROLE_LIST:
				setRoleList((RoleList)null);
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
			case KAMP4aPSFieldofactivityannotationsPackage.STAFF_SPECIFICATION__PARENT:
				return getParent() != null;
			case KAMP4aPSFieldofactivityannotationsPackage.STAFF_SPECIFICATION__PERSON_LIST:
				return personList != null;
			case KAMP4aPSFieldofactivityannotationsPackage.STAFF_SPECIFICATION__ROLE_LIST:
				return roleList != null;
		}
		return super.eIsSet(featureID);
	}

} //StaffSpecificationImpl
