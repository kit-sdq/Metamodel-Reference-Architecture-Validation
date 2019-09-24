/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl;

import edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.FieldOfActivityAnnotationRepository;
import edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.HMIConfiguration;
import edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.HMISpecification;
import edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.KAMP4aPSFieldofactivityannotationsPackage;
import edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.Role;

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
 * An implementation of the model object '<em><b>HMI Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.HMISpecificationImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.HMISpecificationImpl#getRole <em>Role</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.HMISpecificationImpl#getHmiConfig <em>Hmi Config</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HMISpecificationImpl extends MinimalEObjectImpl.Container implements HMISpecification {
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
	 * The cached value of the '{@link #getHmiConfig() <em>Hmi Config</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHmiConfig()
	 * @generated
	 * @ordered
	 */
	protected EList<HMIConfiguration> hmiConfig;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HMISpecificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KAMP4aPSFieldofactivityannotationsPackage.Literals.HMI_SPECIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FieldOfActivityAnnotationRepository getParent() {
		if (eContainerFeatureID() != KAMP4aPSFieldofactivityannotationsPackage.HMI_SPECIFICATION__PARENT) return null;
		return (FieldOfActivityAnnotationRepository)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(FieldOfActivityAnnotationRepository newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, KAMP4aPSFieldofactivityannotationsPackage.HMI_SPECIFICATION__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(FieldOfActivityAnnotationRepository newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != KAMP4aPSFieldofactivityannotationsPackage.HMI_SPECIFICATION__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, KAMP4aPSFieldofactivityannotationsPackage.FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__HMI_SPECIFICATION, FieldOfActivityAnnotationRepository.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KAMP4aPSFieldofactivityannotationsPackage.HMI_SPECIFICATION__PARENT, newParent, newParent));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, KAMP4aPSFieldofactivityannotationsPackage.HMI_SPECIFICATION__ROLE, oldRole, role));
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
			eNotify(new ENotificationImpl(this, Notification.SET, KAMP4aPSFieldofactivityannotationsPackage.HMI_SPECIFICATION__ROLE, oldRole, role));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HMIConfiguration> getHmiConfig() {
		if (hmiConfig == null) {
			hmiConfig = new EObjectContainmentWithInverseEList<HMIConfiguration>(HMIConfiguration.class, this, KAMP4aPSFieldofactivityannotationsPackage.HMI_SPECIFICATION__HMI_CONFIG, KAMP4aPSFieldofactivityannotationsPackage.HMI_CONFIGURATION__PARENT);
		}
		return hmiConfig;
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
			case KAMP4aPSFieldofactivityannotationsPackage.HMI_SPECIFICATION__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((FieldOfActivityAnnotationRepository)otherEnd, msgs);
			case KAMP4aPSFieldofactivityannotationsPackage.HMI_SPECIFICATION__HMI_CONFIG:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHmiConfig()).basicAdd(otherEnd, msgs);
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
			case KAMP4aPSFieldofactivityannotationsPackage.HMI_SPECIFICATION__PARENT:
				return basicSetParent(null, msgs);
			case KAMP4aPSFieldofactivityannotationsPackage.HMI_SPECIFICATION__HMI_CONFIG:
				return ((InternalEList<?>)getHmiConfig()).basicRemove(otherEnd, msgs);
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
			case KAMP4aPSFieldofactivityannotationsPackage.HMI_SPECIFICATION__PARENT:
				return eInternalContainer().eInverseRemove(this, KAMP4aPSFieldofactivityannotationsPackage.FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__HMI_SPECIFICATION, FieldOfActivityAnnotationRepository.class, msgs);
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
			case KAMP4aPSFieldofactivityannotationsPackage.HMI_SPECIFICATION__PARENT:
				return getParent();
			case KAMP4aPSFieldofactivityannotationsPackage.HMI_SPECIFICATION__ROLE:
				if (resolve) return getRole();
				return basicGetRole();
			case KAMP4aPSFieldofactivityannotationsPackage.HMI_SPECIFICATION__HMI_CONFIG:
				return getHmiConfig();
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
			case KAMP4aPSFieldofactivityannotationsPackage.HMI_SPECIFICATION__PARENT:
				setParent((FieldOfActivityAnnotationRepository)newValue);
				return;
			case KAMP4aPSFieldofactivityannotationsPackage.HMI_SPECIFICATION__ROLE:
				setRole((Role)newValue);
				return;
			case KAMP4aPSFieldofactivityannotationsPackage.HMI_SPECIFICATION__HMI_CONFIG:
				getHmiConfig().clear();
				getHmiConfig().addAll((Collection<? extends HMIConfiguration>)newValue);
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
			case KAMP4aPSFieldofactivityannotationsPackage.HMI_SPECIFICATION__PARENT:
				setParent((FieldOfActivityAnnotationRepository)null);
				return;
			case KAMP4aPSFieldofactivityannotationsPackage.HMI_SPECIFICATION__ROLE:
				setRole((Role)null);
				return;
			case KAMP4aPSFieldofactivityannotationsPackage.HMI_SPECIFICATION__HMI_CONFIG:
				getHmiConfig().clear();
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
			case KAMP4aPSFieldofactivityannotationsPackage.HMI_SPECIFICATION__PARENT:
				return getParent() != null;
			case KAMP4aPSFieldofactivityannotationsPackage.HMI_SPECIFICATION__ROLE:
				return role != null;
			case KAMP4aPSFieldofactivityannotationsPackage.HMI_SPECIFICATION__HMI_CONFIG:
				return hmiConfig != null && !hmiConfig.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //HMISpecificationImpl
