/**
 */
package edu.kit.ipd.sdq.kamp.model.modificationmarks.impl;

import edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractChangePropagationStep;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractModificationRepository;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractSeedModifications;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.ModificationmarksPackage;

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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Modification Repository</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp.model.modificationmarks.impl.AbstractModificationRepositoryImpl#getSeedModifications <em>Seed Modifications</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp.model.modificationmarks.impl.AbstractModificationRepositoryImpl#getChangePropagationSteps <em>Change Propagation Steps</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractModificationRepositoryImpl<S extends AbstractSeedModifications, T extends AbstractChangePropagationStep> extends MinimalEObjectImpl.Container implements AbstractModificationRepository<S, T> {
	/**
	 * The cached value of the '{@link #getSeedModifications() <em>Seed Modifications</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeedModifications()
	 * @generated
	 * @ordered
	 */
	protected S seedModifications;

	/**
	 * The cached value of the '{@link #getChangePropagationSteps() <em>Change Propagation Steps</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangePropagationSteps()
	 * @generated
	 * @ordered
	 */
	protected EList<T> changePropagationSteps;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractModificationRepositoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModificationmarksPackage.Literals.ABSTRACT_MODIFICATION_REPOSITORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public S getSeedModifications() {
		return seedModifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSeedModifications(S newSeedModifications, NotificationChain msgs) {
		S oldSeedModifications = seedModifications;
		seedModifications = newSeedModifications;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModificationmarksPackage.ABSTRACT_MODIFICATION_REPOSITORY__SEED_MODIFICATIONS, oldSeedModifications, newSeedModifications);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeedModifications(S newSeedModifications) {
		if (newSeedModifications != seedModifications) {
			NotificationChain msgs = null;
			if (seedModifications != null)
				msgs = ((InternalEObject)seedModifications).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModificationmarksPackage.ABSTRACT_MODIFICATION_REPOSITORY__SEED_MODIFICATIONS, null, msgs);
			if (newSeedModifications != null)
				msgs = ((InternalEObject)newSeedModifications).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModificationmarksPackage.ABSTRACT_MODIFICATION_REPOSITORY__SEED_MODIFICATIONS, null, msgs);
			msgs = basicSetSeedModifications(newSeedModifications, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModificationmarksPackage.ABSTRACT_MODIFICATION_REPOSITORY__SEED_MODIFICATIONS, newSeedModifications, newSeedModifications));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<T> getChangePropagationSteps() {
		if (changePropagationSteps == null) {
			changePropagationSteps = new EObjectContainmentEList<T>(AbstractChangePropagationStep.class, this, ModificationmarksPackage.ABSTRACT_MODIFICATION_REPOSITORY__CHANGE_PROPAGATION_STEPS);
		}
		return changePropagationSteps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModificationmarksPackage.ABSTRACT_MODIFICATION_REPOSITORY__SEED_MODIFICATIONS:
				return basicSetSeedModifications(null, msgs);
			case ModificationmarksPackage.ABSTRACT_MODIFICATION_REPOSITORY__CHANGE_PROPAGATION_STEPS:
				return ((InternalEList<?>)getChangePropagationSteps()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModificationmarksPackage.ABSTRACT_MODIFICATION_REPOSITORY__SEED_MODIFICATIONS:
				return getSeedModifications();
			case ModificationmarksPackage.ABSTRACT_MODIFICATION_REPOSITORY__CHANGE_PROPAGATION_STEPS:
				return getChangePropagationSteps();
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
			case ModificationmarksPackage.ABSTRACT_MODIFICATION_REPOSITORY__SEED_MODIFICATIONS:
				setSeedModifications((S)newValue);
				return;
			case ModificationmarksPackage.ABSTRACT_MODIFICATION_REPOSITORY__CHANGE_PROPAGATION_STEPS:
				getChangePropagationSteps().clear();
				getChangePropagationSteps().addAll((Collection<? extends T>)newValue);
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
			case ModificationmarksPackage.ABSTRACT_MODIFICATION_REPOSITORY__SEED_MODIFICATIONS:
				setSeedModifications((S)null);
				return;
			case ModificationmarksPackage.ABSTRACT_MODIFICATION_REPOSITORY__CHANGE_PROPAGATION_STEPS:
				getChangePropagationSteps().clear();
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
			case ModificationmarksPackage.ABSTRACT_MODIFICATION_REPOSITORY__SEED_MODIFICATIONS:
				return seedModifications != null;
			case ModificationmarksPackage.ABSTRACT_MODIFICATION_REPOSITORY__CHANGE_PROPAGATION_STEPS:
				return changePropagationSteps != null && !changePropagationSteps.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AbstractModificationRepositoryImpl
