/**
 */
package edu.kit.ipd.sdq.kamp.model.modificationmarks.impl;

import edu.kit.ipd.sdq.kamp.model.modificationmarks.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModificationmarksFactoryImpl extends EFactoryImpl implements ModificationmarksFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ModificationmarksFactory init() {
		try {
			ModificationmarksFactory theModificationmarksFactory = (ModificationmarksFactory)EPackage.Registry.INSTANCE.getEFactory(ModificationmarksPackage.eNS_URI);
			if (theModificationmarksFactory != null) {
				return theModificationmarksFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ModificationmarksFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModificationmarksFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ModificationmarksPackage.MODIFICATION_REPOSITORY: return createModificationRepository();
			case ModificationmarksPackage.SEED_MODIFICATIONS: return createSeedModifications();
			case ModificationmarksPackage.CHANGE_PROPAGATION_STEP: return createChangePropagationStep();
			case ModificationmarksPackage.MODIFICATION: return createModification();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ModificationmarksPackage.ACCEPTANCE_AND_CONFIRMATION_STATE:
				return createAcceptanceAndConfirmationStateFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ModificationmarksPackage.ACCEPTANCE_AND_CONFIRMATION_STATE:
				return convertAcceptanceAndConfirmationStateToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModificationRepository createModificationRepository() {
		ModificationRepositoryImpl modificationRepository = new ModificationRepositoryImpl();
		return modificationRepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SeedModifications createSeedModifications() {
		SeedModificationsImpl seedModifications = new SeedModificationsImpl();
		return seedModifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangePropagationStep createChangePropagationStep() {
		ChangePropagationStepImpl changePropagationStep = new ChangePropagationStepImpl();
		return changePropagationStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Modification createModification() {
		ModificationImpl modification = new ModificationImpl();
		return modification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AcceptanceAndConfirmationState createAcceptanceAndConfirmationStateFromString(EDataType eDataType, String initialValue) {
		AcceptanceAndConfirmationState result = AcceptanceAndConfirmationState.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAcceptanceAndConfirmationStateToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModificationmarksPackage getModificationmarksPackage() {
		return (ModificationmarksPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ModificationmarksPackage getPackage() {
		return ModificationmarksPackage.eINSTANCE;
	}

} //ModificationmarksFactoryImpl
