/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.impl;

import edu.kit.ipd.sdq.kamp.model.modificationmarks.ChangePropagationStep;

import edu.kit.ipd.sdq.kamp.model.modificationmarks.impl.AbstractModificationRepositoryImpl;

import edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.AbstractKAMP4aPSModificationRepository;
import edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.KAMP4aPSModificationmarksPackage;
import edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.KAMP4aPSSeedModifications;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract KAMP 4a PS Modification Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class AbstractKAMP4aPSModificationRepositoryImpl<T extends KAMP4aPSSeedModifications> extends AbstractModificationRepositoryImpl<T, ChangePropagationStep> implements AbstractKAMP4aPSModificationRepository<T> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractKAMP4aPSModificationRepositoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KAMP4aPSModificationmarksPackage.Literals.ABSTRACT_KAMP_4A_PS_MODIFICATION_REPOSITORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public NotificationChain basicSetSeedModifications(T newSeedModifications, NotificationChain msgs) {
		return super.basicSetSeedModifications(newSeedModifications, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific element type known in this context.
	 * @generated
	 */
	@Override
	public EList<ChangePropagationStep> getChangePropagationSteps() {
		if (changePropagationSteps == null) {
			changePropagationSteps = new EObjectContainmentEList<ChangePropagationStep>(ChangePropagationStep.class, this, KAMP4aPSModificationmarksPackage.ABSTRACT_KAMP_4A_PS_MODIFICATION_REPOSITORY__CHANGE_PROPAGATION_STEPS);
		}
		return changePropagationSteps;
	}

} //AbstractKAMP4aPSModificationRepositoryImpl
