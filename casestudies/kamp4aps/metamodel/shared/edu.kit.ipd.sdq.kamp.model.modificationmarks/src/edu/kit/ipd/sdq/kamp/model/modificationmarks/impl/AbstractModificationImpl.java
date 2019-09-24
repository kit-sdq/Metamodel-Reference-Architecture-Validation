/**
 */
package edu.kit.ipd.sdq.kamp.model.modificationmarks.impl;

import edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractModification;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.AcceptanceAndConfirmationState;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.ModificationmarksPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Modification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp.model.modificationmarks.impl.AbstractModificationImpl#getAffectedElement <em>Affected Element</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp.model.modificationmarks.impl.AbstractModificationImpl#getCausingElements <em>Causing Elements</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp.model.modificationmarks.impl.AbstractModificationImpl#getId <em>Id</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp.model.modificationmarks.impl.AbstractModificationImpl#isToolderived <em>Toolderived</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp.model.modificationmarks.impl.AbstractModificationImpl#getUserDecision <em>User Decision</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractModificationImpl<S, T> extends MinimalEObjectImpl.Container implements AbstractModification<S, T> {
	/**
	 * The cached value of the '{@link #getAffectedElement() <em>Affected Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAffectedElement()
	 * @generated
	 * @ordered
	 */
	protected S affectedElement;

	/**
	 * The cached value of the '{@link #getCausingElements() <em>Causing Elements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCausingElements()
	 * @generated
	 * @ordered
	 */
	protected EList<T> causingElements;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #isToolderived() <em>Toolderived</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isToolderived()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TOOLDERIVED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isToolderived() <em>Toolderived</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isToolderived()
	 * @generated
	 * @ordered
	 */
	protected boolean toolderived = TOOLDERIVED_EDEFAULT;

	/**
	 * The default value of the '{@link #getUserDecision() <em>User Decision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserDecision()
	 * @generated
	 * @ordered
	 */
	protected static final AcceptanceAndConfirmationState USER_DECISION_EDEFAULT = AcceptanceAndConfirmationState.NODECISION;

	/**
	 * The cached value of the '{@link #getUserDecision() <em>User Decision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserDecision()
	 * @generated
	 * @ordered
	 */
	protected AcceptanceAndConfirmationState userDecision = USER_DECISION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractModificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModificationmarksPackage.Literals.ABSTRACT_MODIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public S getAffectedElement() {
		if (affectedElement != null && ((EObject)affectedElement).eIsProxy()) {
			InternalEObject oldAffectedElement = (InternalEObject)affectedElement;
			affectedElement = (S)eResolveProxy(oldAffectedElement);
			if (affectedElement != oldAffectedElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModificationmarksPackage.ABSTRACT_MODIFICATION__AFFECTED_ELEMENT, oldAffectedElement, affectedElement));
			}
		}
		return affectedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public S basicGetAffectedElement() {
		return affectedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAffectedElement(S newAffectedElement) {
		S oldAffectedElement = affectedElement;
		affectedElement = newAffectedElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModificationmarksPackage.ABSTRACT_MODIFICATION__AFFECTED_ELEMENT, oldAffectedElement, affectedElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<T> getCausingElements() {
		if (causingElements == null) {
			causingElements = new EObjectResolvingEList<T>(EObject.class, this, ModificationmarksPackage.ABSTRACT_MODIFICATION__CAUSING_ELEMENTS);
		}
		return causingElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModificationmarksPackage.ABSTRACT_MODIFICATION__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isToolderived() {
		return toolderived;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToolderived(boolean newToolderived) {
		boolean oldToolderived = toolderived;
		toolderived = newToolderived;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModificationmarksPackage.ABSTRACT_MODIFICATION__TOOLDERIVED, oldToolderived, toolderived));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AcceptanceAndConfirmationState getUserDecision() {
		return userDecision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserDecision(AcceptanceAndConfirmationState newUserDecision) {
		AcceptanceAndConfirmationState oldUserDecision = userDecision;
		userDecision = newUserDecision == null ? USER_DECISION_EDEFAULT : newUserDecision;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModificationmarksPackage.ABSTRACT_MODIFICATION__USER_DECISION, oldUserDecision, userDecision));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModificationmarksPackage.ABSTRACT_MODIFICATION__AFFECTED_ELEMENT:
				if (resolve) return getAffectedElement();
				return basicGetAffectedElement();
			case ModificationmarksPackage.ABSTRACT_MODIFICATION__CAUSING_ELEMENTS:
				return getCausingElements();
			case ModificationmarksPackage.ABSTRACT_MODIFICATION__ID:
				return getId();
			case ModificationmarksPackage.ABSTRACT_MODIFICATION__TOOLDERIVED:
				return isToolderived();
			case ModificationmarksPackage.ABSTRACT_MODIFICATION__USER_DECISION:
				return getUserDecision();
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
			case ModificationmarksPackage.ABSTRACT_MODIFICATION__AFFECTED_ELEMENT:
				setAffectedElement((S)newValue);
				return;
			case ModificationmarksPackage.ABSTRACT_MODIFICATION__CAUSING_ELEMENTS:
				getCausingElements().clear();
				getCausingElements().addAll((Collection<? extends T>)newValue);
				return;
			case ModificationmarksPackage.ABSTRACT_MODIFICATION__ID:
				setId((String)newValue);
				return;
			case ModificationmarksPackage.ABSTRACT_MODIFICATION__TOOLDERIVED:
				setToolderived((Boolean)newValue);
				return;
			case ModificationmarksPackage.ABSTRACT_MODIFICATION__USER_DECISION:
				setUserDecision((AcceptanceAndConfirmationState)newValue);
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
			case ModificationmarksPackage.ABSTRACT_MODIFICATION__AFFECTED_ELEMENT:
				setAffectedElement((S)null);
				return;
			case ModificationmarksPackage.ABSTRACT_MODIFICATION__CAUSING_ELEMENTS:
				getCausingElements().clear();
				return;
			case ModificationmarksPackage.ABSTRACT_MODIFICATION__ID:
				setId(ID_EDEFAULT);
				return;
			case ModificationmarksPackage.ABSTRACT_MODIFICATION__TOOLDERIVED:
				setToolderived(TOOLDERIVED_EDEFAULT);
				return;
			case ModificationmarksPackage.ABSTRACT_MODIFICATION__USER_DECISION:
				setUserDecision(USER_DECISION_EDEFAULT);
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
			case ModificationmarksPackage.ABSTRACT_MODIFICATION__AFFECTED_ELEMENT:
				return affectedElement != null;
			case ModificationmarksPackage.ABSTRACT_MODIFICATION__CAUSING_ELEMENTS:
				return causingElements != null && !causingElements.isEmpty();
			case ModificationmarksPackage.ABSTRACT_MODIFICATION__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case ModificationmarksPackage.ABSTRACT_MODIFICATION__TOOLDERIVED:
				return toolderived != TOOLDERIVED_EDEFAULT;
			case ModificationmarksPackage.ABSTRACT_MODIFICATION__USER_DECISION:
				return userDecision != USER_DECISION_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(", toolderived: ");
		result.append(toolderived);
		result.append(", userDecision: ");
		result.append(userDecision);
		result.append(')');
		return result.toString();
	}

} //AbstractModificationImpl
