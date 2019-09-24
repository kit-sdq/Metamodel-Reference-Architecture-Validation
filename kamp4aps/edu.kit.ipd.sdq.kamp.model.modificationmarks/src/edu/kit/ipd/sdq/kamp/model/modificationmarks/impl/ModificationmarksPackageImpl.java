/**
 */
package edu.kit.ipd.sdq.kamp.model.modificationmarks.impl;

import edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractChangePropagationStep;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractModification;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractModificationRepository;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractSeedModifications;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.AcceptanceAndConfirmationState;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.ChangePropagationStep;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.Modification;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.ModificationRepository;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.ModificationmarksFactory;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.ModificationmarksPackage;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.SeedModifications;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.ETypeParameter;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModificationmarksPackageImpl extends EPackageImpl implements ModificationmarksPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractModificationRepositoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modificationRepositoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractSeedModificationsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass seedModificationsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractChangePropagationStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass changePropagationStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractModificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum acceptanceAndConfirmationStateEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see edu.kit.ipd.sdq.kamp.model.modificationmarks.ModificationmarksPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ModificationmarksPackageImpl() {
		super(eNS_URI, ModificationmarksFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ModificationmarksPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ModificationmarksPackage init() {
		if (isInited) return (ModificationmarksPackage)EPackage.Registry.INSTANCE.getEPackage(ModificationmarksPackage.eNS_URI);

		// Obtain or create and register package
		ModificationmarksPackageImpl theModificationmarksPackage = (ModificationmarksPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ModificationmarksPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ModificationmarksPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theModificationmarksPackage.createPackageContents();

		// Initialize created meta-data
		theModificationmarksPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theModificationmarksPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ModificationmarksPackage.eNS_URI, theModificationmarksPackage);
		return theModificationmarksPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractModificationRepository() {
		return abstractModificationRepositoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractModificationRepository_SeedModifications() {
		return (EReference)abstractModificationRepositoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractModificationRepository_ChangePropagationSteps() {
		return (EReference)abstractModificationRepositoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModificationRepository() {
		return modificationRepositoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractSeedModifications() {
		return abstractSeedModificationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSeedModifications() {
		return seedModificationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSeedModifications_SeedElements() {
		return (EReference)seedModificationsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractChangePropagationStep() {
		return abstractChangePropagationStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChangePropagationStep() {
		return changePropagationStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractModification() {
		return abstractModificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractModification_AffectedElement() {
		return (EReference)abstractModificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractModification_CausingElements() {
		return (EReference)abstractModificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractModification_Id() {
		return (EAttribute)abstractModificationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractModification_Toolderived() {
		return (EAttribute)abstractModificationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractModification_UserDecision() {
		return (EAttribute)abstractModificationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModification() {
		return modificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAcceptanceAndConfirmationState() {
		return acceptanceAndConfirmationStateEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModificationmarksFactory getModificationmarksFactory() {
		return (ModificationmarksFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		abstractModificationRepositoryEClass = createEClass(ABSTRACT_MODIFICATION_REPOSITORY);
		createEReference(abstractModificationRepositoryEClass, ABSTRACT_MODIFICATION_REPOSITORY__SEED_MODIFICATIONS);
		createEReference(abstractModificationRepositoryEClass, ABSTRACT_MODIFICATION_REPOSITORY__CHANGE_PROPAGATION_STEPS);

		modificationRepositoryEClass = createEClass(MODIFICATION_REPOSITORY);

		abstractSeedModificationsEClass = createEClass(ABSTRACT_SEED_MODIFICATIONS);

		seedModificationsEClass = createEClass(SEED_MODIFICATIONS);
		createEReference(seedModificationsEClass, SEED_MODIFICATIONS__SEED_ELEMENTS);

		abstractChangePropagationStepEClass = createEClass(ABSTRACT_CHANGE_PROPAGATION_STEP);

		changePropagationStepEClass = createEClass(CHANGE_PROPAGATION_STEP);

		abstractModificationEClass = createEClass(ABSTRACT_MODIFICATION);
		createEReference(abstractModificationEClass, ABSTRACT_MODIFICATION__AFFECTED_ELEMENT);
		createEReference(abstractModificationEClass, ABSTRACT_MODIFICATION__CAUSING_ELEMENTS);
		createEAttribute(abstractModificationEClass, ABSTRACT_MODIFICATION__ID);
		createEAttribute(abstractModificationEClass, ABSTRACT_MODIFICATION__TOOLDERIVED);
		createEAttribute(abstractModificationEClass, ABSTRACT_MODIFICATION__USER_DECISION);

		modificationEClass = createEClass(MODIFICATION);

		// Create enums
		acceptanceAndConfirmationStateEEnum = createEEnum(ACCEPTANCE_AND_CONFIRMATION_STATE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters
		ETypeParameter abstractModificationRepositoryEClass_S = addETypeParameter(abstractModificationRepositoryEClass, "S");
		ETypeParameter abstractModificationRepositoryEClass_T = addETypeParameter(abstractModificationRepositoryEClass, "T");
		ETypeParameter abstractModificationEClass_S = addETypeParameter(abstractModificationEClass, "S");
		ETypeParameter abstractModificationEClass_T = addETypeParameter(abstractModificationEClass, "T");

		// Set bounds for type parameters
		EGenericType g1 = createEGenericType(this.getAbstractSeedModifications());
		abstractModificationRepositoryEClass_S.getEBounds().add(g1);
		g1 = createEGenericType(this.getAbstractChangePropagationStep());
		abstractModificationRepositoryEClass_T.getEBounds().add(g1);

		// Add supertypes to classes
		g1 = createEGenericType(this.getAbstractModificationRepository());
		EGenericType g2 = createEGenericType(this.getSeedModifications());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(this.getChangePropagationStep());
		g1.getETypeArguments().add(g2);
		modificationRepositoryEClass.getEGenericSuperTypes().add(g1);
		seedModificationsEClass.getESuperTypes().add(this.getAbstractSeedModifications());
		changePropagationStepEClass.getESuperTypes().add(this.getAbstractChangePropagationStep());
		g1 = createEGenericType(this.getAbstractModification());
		g2 = createEGenericType(ecorePackage.getEObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEObject());
		g1.getETypeArguments().add(g2);
		modificationEClass.getEGenericSuperTypes().add(g1);

		// Initialize classes, features, and operations; add parameters
		initEClass(abstractModificationRepositoryEClass, AbstractModificationRepository.class, "AbstractModificationRepository", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(abstractModificationRepositoryEClass_S);
		initEReference(getAbstractModificationRepository_SeedModifications(), g1, null, "seedModifications", null, 1, 1, AbstractModificationRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(abstractModificationRepositoryEClass_T);
		initEReference(getAbstractModificationRepository_ChangePropagationSteps(), g1, null, "changePropagationSteps", null, 0, -1, AbstractModificationRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modificationRepositoryEClass, ModificationRepository.class, "ModificationRepository", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(abstractSeedModificationsEClass, AbstractSeedModifications.class, "AbstractSeedModifications", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(seedModificationsEClass, SeedModifications.class, "SeedModifications", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSeedModifications_SeedElements(), ecorePackage.getEObject(), null, "seedElements", null, 0, -1, SeedModifications.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractChangePropagationStepEClass, AbstractChangePropagationStep.class, "AbstractChangePropagationStep", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(changePropagationStepEClass, ChangePropagationStep.class, "ChangePropagationStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(abstractModificationEClass, AbstractModification.class, "AbstractModification", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(abstractModificationEClass_S);
		initEReference(getAbstractModification_AffectedElement(), g1, null, "affectedElement", null, 1, 1, AbstractModification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(abstractModificationEClass_T);
		initEReference(getAbstractModification_CausingElements(), g1, null, "causingElements", null, 0, -1, AbstractModification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractModification_Id(), ecorePackage.getEString(), "id", null, 1, 1, AbstractModification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractModification_Toolderived(), ecorePackage.getEBoolean(), "toolderived", null, 1, 1, AbstractModification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractModification_UserDecision(), this.getAcceptanceAndConfirmationState(), "userDecision", "NODECISION", 1, 1, AbstractModification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modificationEClass, Modification.class, "Modification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(acceptanceAndConfirmationStateEEnum, AcceptanceAndConfirmationState.class, "AcceptanceAndConfirmationState");
		addEEnumLiteral(acceptanceAndConfirmationStateEEnum, AcceptanceAndConfirmationState.NODECISION);
		addEEnumLiteral(acceptanceAndConfirmationStateEEnum, AcceptanceAndConfirmationState.CONFIRMED);
		addEEnumLiteral(acceptanceAndConfirmationStateEEnum, AcceptanceAndConfirmationState.EXCLUDED);

		// Create resource
		createResource(eNS_URI);
	}

} //ModificationmarksPackageImpl
