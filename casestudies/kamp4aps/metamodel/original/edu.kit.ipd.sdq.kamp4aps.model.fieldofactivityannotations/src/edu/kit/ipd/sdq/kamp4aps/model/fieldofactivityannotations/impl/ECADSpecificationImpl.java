/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl;

import edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.Drawing;
import edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.ECADSpecification;
import edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.FieldOfActivityAnnotationRepository;
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
 * An implementation of the model object '<em><b>ECAD Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.ECADSpecificationImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.ECADSpecificationImpl#getDrawings <em>Drawings</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.ECADSpecificationImpl#getRole <em>Role</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ECADSpecificationImpl extends MinimalEObjectImpl.Container implements ECADSpecification {
	/**
	 * The cached value of the '{@link #getDrawings() <em>Drawings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDrawings()
	 * @generated
	 * @ordered
	 */
	protected EList<Drawing> drawings;

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
	protected ECADSpecificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KAMP4aPSFieldofactivityannotationsPackage.Literals.ECAD_SPECIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FieldOfActivityAnnotationRepository getParent() {
		if (eContainerFeatureID() != KAMP4aPSFieldofactivityannotationsPackage.ECAD_SPECIFICATION__PARENT) return null;
		return (FieldOfActivityAnnotationRepository)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(FieldOfActivityAnnotationRepository newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, KAMP4aPSFieldofactivityannotationsPackage.ECAD_SPECIFICATION__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(FieldOfActivityAnnotationRepository newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != KAMP4aPSFieldofactivityannotationsPackage.ECAD_SPECIFICATION__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, KAMP4aPSFieldofactivityannotationsPackage.FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__ECAD_SPECIFICATION, FieldOfActivityAnnotationRepository.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KAMP4aPSFieldofactivityannotationsPackage.ECAD_SPECIFICATION__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Drawing> getDrawings() {
		if (drawings == null) {
			drawings = new EObjectContainmentWithInverseEList<Drawing>(Drawing.class, this, KAMP4aPSFieldofactivityannotationsPackage.ECAD_SPECIFICATION__DRAWINGS, KAMP4aPSFieldofactivityannotationsPackage.DRAWING__PARENT);
		}
		return drawings;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, KAMP4aPSFieldofactivityannotationsPackage.ECAD_SPECIFICATION__ROLE, oldRole, role));
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
			eNotify(new ENotificationImpl(this, Notification.SET, KAMP4aPSFieldofactivityannotationsPackage.ECAD_SPECIFICATION__ROLE, oldRole, role));
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
			case KAMP4aPSFieldofactivityannotationsPackage.ECAD_SPECIFICATION__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((FieldOfActivityAnnotationRepository)otherEnd, msgs);
			case KAMP4aPSFieldofactivityannotationsPackage.ECAD_SPECIFICATION__DRAWINGS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDrawings()).basicAdd(otherEnd, msgs);
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
			case KAMP4aPSFieldofactivityannotationsPackage.ECAD_SPECIFICATION__PARENT:
				return basicSetParent(null, msgs);
			case KAMP4aPSFieldofactivityannotationsPackage.ECAD_SPECIFICATION__DRAWINGS:
				return ((InternalEList<?>)getDrawings()).basicRemove(otherEnd, msgs);
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
			case KAMP4aPSFieldofactivityannotationsPackage.ECAD_SPECIFICATION__PARENT:
				return eInternalContainer().eInverseRemove(this, KAMP4aPSFieldofactivityannotationsPackage.FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__ECAD_SPECIFICATION, FieldOfActivityAnnotationRepository.class, msgs);
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
			case KAMP4aPSFieldofactivityannotationsPackage.ECAD_SPECIFICATION__PARENT:
				return getParent();
			case KAMP4aPSFieldofactivityannotationsPackage.ECAD_SPECIFICATION__DRAWINGS:
				return getDrawings();
			case KAMP4aPSFieldofactivityannotationsPackage.ECAD_SPECIFICATION__ROLE:
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
			case KAMP4aPSFieldofactivityannotationsPackage.ECAD_SPECIFICATION__PARENT:
				setParent((FieldOfActivityAnnotationRepository)newValue);
				return;
			case KAMP4aPSFieldofactivityannotationsPackage.ECAD_SPECIFICATION__DRAWINGS:
				getDrawings().clear();
				getDrawings().addAll((Collection<? extends Drawing>)newValue);
				return;
			case KAMP4aPSFieldofactivityannotationsPackage.ECAD_SPECIFICATION__ROLE:
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
			case KAMP4aPSFieldofactivityannotationsPackage.ECAD_SPECIFICATION__PARENT:
				setParent((FieldOfActivityAnnotationRepository)null);
				return;
			case KAMP4aPSFieldofactivityannotationsPackage.ECAD_SPECIFICATION__DRAWINGS:
				getDrawings().clear();
				return;
			case KAMP4aPSFieldofactivityannotationsPackage.ECAD_SPECIFICATION__ROLE:
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
			case KAMP4aPSFieldofactivityannotationsPackage.ECAD_SPECIFICATION__PARENT:
				return getParent() != null;
			case KAMP4aPSFieldofactivityannotationsPackage.ECAD_SPECIFICATION__DRAWINGS:
				return drawings != null && !drawings.isEmpty();
			case KAMP4aPSFieldofactivityannotationsPackage.ECAD_SPECIFICATION__ROLE:
				return role != null;
		}
		return super.eIsSet(featureID);
	}

} //ECADSpecificationImpl
