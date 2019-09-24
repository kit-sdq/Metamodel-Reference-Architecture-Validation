/**
 */
package edu.kit.ipd.sdq.kamp.model.modificationmarks.impl;

import edu.kit.ipd.sdq.kamp.model.modificationmarks.ChangePropagationStep;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.ModificationRepository;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.ModificationmarksPackage;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.SeedModifications;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Modification Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ModificationRepositoryImpl extends AbstractModificationRepositoryImpl<SeedModifications, ChangePropagationStep> implements ModificationRepository {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModificationRepositoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModificationmarksPackage.Literals.MODIFICATION_REPOSITORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public NotificationChain basicSetSeedModifications(SeedModifications newSeedModifications, NotificationChain msgs) {
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
			changePropagationSteps = new EObjectContainmentEList<ChangePropagationStep>(ChangePropagationStep.class, this, ModificationmarksPackage.MODIFICATION_REPOSITORY__CHANGE_PROPAGATION_STEPS);
		}
		return changePropagationSteps;
	}

} //ModificationRepositoryImpl
