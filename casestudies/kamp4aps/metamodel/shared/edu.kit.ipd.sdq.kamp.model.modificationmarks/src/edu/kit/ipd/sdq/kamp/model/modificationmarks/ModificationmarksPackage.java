/**
 */
package edu.kit.ipd.sdq.kamp.model.modificationmarks;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see edu.kit.ipd.sdq.kamp.model.modificationmarks.ModificationmarksFactory
 * @model kind="package"
 * @generated
 */
public interface ModificationmarksPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "modificationmarks";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://sdq.ipd.kit.edu/Modificationmarks/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "modificationmarks";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModificationmarksPackage eINSTANCE = edu.kit.ipd.sdq.kamp.model.modificationmarks.impl.ModificationmarksPackageImpl.init();

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp.model.modificationmarks.impl.AbstractModificationRepositoryImpl <em>Abstract Modification Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp.model.modificationmarks.impl.AbstractModificationRepositoryImpl
	 * @see edu.kit.ipd.sdq.kamp.model.modificationmarks.impl.ModificationmarksPackageImpl#getAbstractModificationRepository()
	 * @generated
	 */
	int ABSTRACT_MODIFICATION_REPOSITORY = 0;

	/**
	 * The feature id for the '<em><b>Seed Modifications</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MODIFICATION_REPOSITORY__SEED_MODIFICATIONS = 0;

	/**
	 * The feature id for the '<em><b>Change Propagation Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MODIFICATION_REPOSITORY__CHANGE_PROPAGATION_STEPS = 1;

	/**
	 * The number of structural features of the '<em>Abstract Modification Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MODIFICATION_REPOSITORY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Abstract Modification Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MODIFICATION_REPOSITORY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp.model.modificationmarks.impl.ModificationRepositoryImpl <em>Modification Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp.model.modificationmarks.impl.ModificationRepositoryImpl
	 * @see edu.kit.ipd.sdq.kamp.model.modificationmarks.impl.ModificationmarksPackageImpl#getModificationRepository()
	 * @generated
	 */
	int MODIFICATION_REPOSITORY = 1;

	/**
	 * The feature id for the '<em><b>Seed Modifications</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFICATION_REPOSITORY__SEED_MODIFICATIONS = ABSTRACT_MODIFICATION_REPOSITORY__SEED_MODIFICATIONS;

	/**
	 * The feature id for the '<em><b>Change Propagation Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFICATION_REPOSITORY__CHANGE_PROPAGATION_STEPS = ABSTRACT_MODIFICATION_REPOSITORY__CHANGE_PROPAGATION_STEPS;

	/**
	 * The number of structural features of the '<em>Modification Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFICATION_REPOSITORY_FEATURE_COUNT = ABSTRACT_MODIFICATION_REPOSITORY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Modification Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFICATION_REPOSITORY_OPERATION_COUNT = ABSTRACT_MODIFICATION_REPOSITORY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp.model.modificationmarks.impl.AbstractSeedModificationsImpl <em>Abstract Seed Modifications</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp.model.modificationmarks.impl.AbstractSeedModificationsImpl
	 * @see edu.kit.ipd.sdq.kamp.model.modificationmarks.impl.ModificationmarksPackageImpl#getAbstractSeedModifications()
	 * @generated
	 */
	int ABSTRACT_SEED_MODIFICATIONS = 2;

	/**
	 * The number of structural features of the '<em>Abstract Seed Modifications</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SEED_MODIFICATIONS_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Abstract Seed Modifications</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SEED_MODIFICATIONS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp.model.modificationmarks.impl.SeedModificationsImpl <em>Seed Modifications</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp.model.modificationmarks.impl.SeedModificationsImpl
	 * @see edu.kit.ipd.sdq.kamp.model.modificationmarks.impl.ModificationmarksPackageImpl#getSeedModifications()
	 * @generated
	 */
	int SEED_MODIFICATIONS = 3;

	/**
	 * The feature id for the '<em><b>Seed Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEED_MODIFICATIONS__SEED_ELEMENTS = ABSTRACT_SEED_MODIFICATIONS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Seed Modifications</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEED_MODIFICATIONS_FEATURE_COUNT = ABSTRACT_SEED_MODIFICATIONS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Seed Modifications</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEED_MODIFICATIONS_OPERATION_COUNT = ABSTRACT_SEED_MODIFICATIONS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp.model.modificationmarks.impl.AbstractChangePropagationStepImpl <em>Abstract Change Propagation Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp.model.modificationmarks.impl.AbstractChangePropagationStepImpl
	 * @see edu.kit.ipd.sdq.kamp.model.modificationmarks.impl.ModificationmarksPackageImpl#getAbstractChangePropagationStep()
	 * @generated
	 */
	int ABSTRACT_CHANGE_PROPAGATION_STEP = 4;

	/**
	 * The number of structural features of the '<em>Abstract Change Propagation Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CHANGE_PROPAGATION_STEP_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Abstract Change Propagation Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CHANGE_PROPAGATION_STEP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp.model.modificationmarks.impl.ChangePropagationStepImpl <em>Change Propagation Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp.model.modificationmarks.impl.ChangePropagationStepImpl
	 * @see edu.kit.ipd.sdq.kamp.model.modificationmarks.impl.ModificationmarksPackageImpl#getChangePropagationStep()
	 * @generated
	 */
	int CHANGE_PROPAGATION_STEP = 5;

	/**
	 * The number of structural features of the '<em>Change Propagation Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_PROPAGATION_STEP_FEATURE_COUNT = ABSTRACT_CHANGE_PROPAGATION_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Change Propagation Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_PROPAGATION_STEP_OPERATION_COUNT = ABSTRACT_CHANGE_PROPAGATION_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp.model.modificationmarks.impl.AbstractModificationImpl <em>Abstract Modification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp.model.modificationmarks.impl.AbstractModificationImpl
	 * @see edu.kit.ipd.sdq.kamp.model.modificationmarks.impl.ModificationmarksPackageImpl#getAbstractModification()
	 * @generated
	 */
	int ABSTRACT_MODIFICATION = 6;

	/**
	 * The feature id for the '<em><b>Affected Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MODIFICATION__AFFECTED_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Causing Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MODIFICATION__CAUSING_ELEMENTS = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MODIFICATION__ID = 2;

	/**
	 * The feature id for the '<em><b>Toolderived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MODIFICATION__TOOLDERIVED = 3;

	/**
	 * The feature id for the '<em><b>User Decision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MODIFICATION__USER_DECISION = 4;

	/**
	 * The number of structural features of the '<em>Abstract Modification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MODIFICATION_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Abstract Modification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MODIFICATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp.model.modificationmarks.impl.ModificationImpl <em>Modification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp.model.modificationmarks.impl.ModificationImpl
	 * @see edu.kit.ipd.sdq.kamp.model.modificationmarks.impl.ModificationmarksPackageImpl#getModification()
	 * @generated
	 */
	int MODIFICATION = 7;

	/**
	 * The feature id for the '<em><b>Affected Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFICATION__AFFECTED_ELEMENT = ABSTRACT_MODIFICATION__AFFECTED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Causing Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFICATION__CAUSING_ELEMENTS = ABSTRACT_MODIFICATION__CAUSING_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFICATION__ID = ABSTRACT_MODIFICATION__ID;

	/**
	 * The feature id for the '<em><b>Toolderived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFICATION__TOOLDERIVED = ABSTRACT_MODIFICATION__TOOLDERIVED;

	/**
	 * The feature id for the '<em><b>User Decision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFICATION__USER_DECISION = ABSTRACT_MODIFICATION__USER_DECISION;

	/**
	 * The number of structural features of the '<em>Modification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFICATION_FEATURE_COUNT = ABSTRACT_MODIFICATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Modification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFICATION_OPERATION_COUNT = ABSTRACT_MODIFICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp.model.modificationmarks.AcceptanceAndConfirmationState <em>Acceptance And Confirmation State</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp.model.modificationmarks.AcceptanceAndConfirmationState
	 * @see edu.kit.ipd.sdq.kamp.model.modificationmarks.impl.ModificationmarksPackageImpl#getAcceptanceAndConfirmationState()
	 * @generated
	 */
	int ACCEPTANCE_AND_CONFIRMATION_STATE = 8;


	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractModificationRepository <em>Abstract Modification Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Modification Repository</em>'.
	 * @see edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractModificationRepository
	 * @generated
	 */
	EClass getAbstractModificationRepository();

	/**
	 * Returns the meta object for the containment reference '{@link edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractModificationRepository#getSeedModifications <em>Seed Modifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Seed Modifications</em>'.
	 * @see edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractModificationRepository#getSeedModifications()
	 * @see #getAbstractModificationRepository()
	 * @generated
	 */
	EReference getAbstractModificationRepository_SeedModifications();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractModificationRepository#getChangePropagationSteps <em>Change Propagation Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Change Propagation Steps</em>'.
	 * @see edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractModificationRepository#getChangePropagationSteps()
	 * @see #getAbstractModificationRepository()
	 * @generated
	 */
	EReference getAbstractModificationRepository_ChangePropagationSteps();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp.model.modificationmarks.ModificationRepository <em>Modification Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modification Repository</em>'.
	 * @see edu.kit.ipd.sdq.kamp.model.modificationmarks.ModificationRepository
	 * @generated
	 */
	EClass getModificationRepository();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractSeedModifications <em>Abstract Seed Modifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Seed Modifications</em>'.
	 * @see edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractSeedModifications
	 * @generated
	 */
	EClass getAbstractSeedModifications();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp.model.modificationmarks.SeedModifications <em>Seed Modifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Seed Modifications</em>'.
	 * @see edu.kit.ipd.sdq.kamp.model.modificationmarks.SeedModifications
	 * @generated
	 */
	EClass getSeedModifications();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.ipd.sdq.kamp.model.modificationmarks.SeedModifications#getSeedElements <em>Seed Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Seed Elements</em>'.
	 * @see edu.kit.ipd.sdq.kamp.model.modificationmarks.SeedModifications#getSeedElements()
	 * @see #getSeedModifications()
	 * @generated
	 */
	EReference getSeedModifications_SeedElements();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractChangePropagationStep <em>Abstract Change Propagation Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Change Propagation Step</em>'.
	 * @see edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractChangePropagationStep
	 * @generated
	 */
	EClass getAbstractChangePropagationStep();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp.model.modificationmarks.ChangePropagationStep <em>Change Propagation Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Change Propagation Step</em>'.
	 * @see edu.kit.ipd.sdq.kamp.model.modificationmarks.ChangePropagationStep
	 * @generated
	 */
	EClass getChangePropagationStep();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractModification <em>Abstract Modification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Modification</em>'.
	 * @see edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractModification
	 * @generated
	 */
	EClass getAbstractModification();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractModification#getAffectedElement <em>Affected Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Affected Element</em>'.
	 * @see edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractModification#getAffectedElement()
	 * @see #getAbstractModification()
	 * @generated
	 */
	EReference getAbstractModification_AffectedElement();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractModification#getCausingElements <em>Causing Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Causing Elements</em>'.
	 * @see edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractModification#getCausingElements()
	 * @see #getAbstractModification()
	 * @generated
	 */
	EReference getAbstractModification_CausingElements();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractModification#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractModification#getId()
	 * @see #getAbstractModification()
	 * @generated
	 */
	EAttribute getAbstractModification_Id();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractModification#isToolderived <em>Toolderived</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Toolderived</em>'.
	 * @see edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractModification#isToolderived()
	 * @see #getAbstractModification()
	 * @generated
	 */
	EAttribute getAbstractModification_Toolderived();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractModification#getUserDecision <em>User Decision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Decision</em>'.
	 * @see edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractModification#getUserDecision()
	 * @see #getAbstractModification()
	 * @generated
	 */
	EAttribute getAbstractModification_UserDecision();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp.model.modificationmarks.Modification <em>Modification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modification</em>'.
	 * @see edu.kit.ipd.sdq.kamp.model.modificationmarks.Modification
	 * @generated
	 */
	EClass getModification();

	/**
	 * Returns the meta object for enum '{@link edu.kit.ipd.sdq.kamp.model.modificationmarks.AcceptanceAndConfirmationState <em>Acceptance And Confirmation State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Acceptance And Confirmation State</em>'.
	 * @see edu.kit.ipd.sdq.kamp.model.modificationmarks.AcceptanceAndConfirmationState
	 * @generated
	 */
	EEnum getAcceptanceAndConfirmationState();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ModificationmarksFactory getModificationmarksFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp.model.modificationmarks.impl.AbstractModificationRepositoryImpl <em>Abstract Modification Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp.model.modificationmarks.impl.AbstractModificationRepositoryImpl
		 * @see edu.kit.ipd.sdq.kamp.model.modificationmarks.impl.ModificationmarksPackageImpl#getAbstractModificationRepository()
		 * @generated
		 */
		EClass ABSTRACT_MODIFICATION_REPOSITORY = eINSTANCE.getAbstractModificationRepository();

		/**
		 * The meta object literal for the '<em><b>Seed Modifications</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_MODIFICATION_REPOSITORY__SEED_MODIFICATIONS = eINSTANCE.getAbstractModificationRepository_SeedModifications();

		/**
		 * The meta object literal for the '<em><b>Change Propagation Steps</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_MODIFICATION_REPOSITORY__CHANGE_PROPAGATION_STEPS = eINSTANCE.getAbstractModificationRepository_ChangePropagationSteps();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp.model.modificationmarks.impl.ModificationRepositoryImpl <em>Modification Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp.model.modificationmarks.impl.ModificationRepositoryImpl
		 * @see edu.kit.ipd.sdq.kamp.model.modificationmarks.impl.ModificationmarksPackageImpl#getModificationRepository()
		 * @generated
		 */
		EClass MODIFICATION_REPOSITORY = eINSTANCE.getModificationRepository();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp.model.modificationmarks.impl.AbstractSeedModificationsImpl <em>Abstract Seed Modifications</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp.model.modificationmarks.impl.AbstractSeedModificationsImpl
		 * @see edu.kit.ipd.sdq.kamp.model.modificationmarks.impl.ModificationmarksPackageImpl#getAbstractSeedModifications()
		 * @generated
		 */
		EClass ABSTRACT_SEED_MODIFICATIONS = eINSTANCE.getAbstractSeedModifications();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp.model.modificationmarks.impl.SeedModificationsImpl <em>Seed Modifications</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp.model.modificationmarks.impl.SeedModificationsImpl
		 * @see edu.kit.ipd.sdq.kamp.model.modificationmarks.impl.ModificationmarksPackageImpl#getSeedModifications()
		 * @generated
		 */
		EClass SEED_MODIFICATIONS = eINSTANCE.getSeedModifications();

		/**
		 * The meta object literal for the '<em><b>Seed Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEED_MODIFICATIONS__SEED_ELEMENTS = eINSTANCE.getSeedModifications_SeedElements();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp.model.modificationmarks.impl.AbstractChangePropagationStepImpl <em>Abstract Change Propagation Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp.model.modificationmarks.impl.AbstractChangePropagationStepImpl
		 * @see edu.kit.ipd.sdq.kamp.model.modificationmarks.impl.ModificationmarksPackageImpl#getAbstractChangePropagationStep()
		 * @generated
		 */
		EClass ABSTRACT_CHANGE_PROPAGATION_STEP = eINSTANCE.getAbstractChangePropagationStep();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp.model.modificationmarks.impl.ChangePropagationStepImpl <em>Change Propagation Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp.model.modificationmarks.impl.ChangePropagationStepImpl
		 * @see edu.kit.ipd.sdq.kamp.model.modificationmarks.impl.ModificationmarksPackageImpl#getChangePropagationStep()
		 * @generated
		 */
		EClass CHANGE_PROPAGATION_STEP = eINSTANCE.getChangePropagationStep();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp.model.modificationmarks.impl.AbstractModificationImpl <em>Abstract Modification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp.model.modificationmarks.impl.AbstractModificationImpl
		 * @see edu.kit.ipd.sdq.kamp.model.modificationmarks.impl.ModificationmarksPackageImpl#getAbstractModification()
		 * @generated
		 */
		EClass ABSTRACT_MODIFICATION = eINSTANCE.getAbstractModification();

		/**
		 * The meta object literal for the '<em><b>Affected Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_MODIFICATION__AFFECTED_ELEMENT = eINSTANCE.getAbstractModification_AffectedElement();

		/**
		 * The meta object literal for the '<em><b>Causing Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_MODIFICATION__CAUSING_ELEMENTS = eINSTANCE.getAbstractModification_CausingElements();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_MODIFICATION__ID = eINSTANCE.getAbstractModification_Id();

		/**
		 * The meta object literal for the '<em><b>Toolderived</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_MODIFICATION__TOOLDERIVED = eINSTANCE.getAbstractModification_Toolderived();

		/**
		 * The meta object literal for the '<em><b>User Decision</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_MODIFICATION__USER_DECISION = eINSTANCE.getAbstractModification_UserDecision();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp.model.modificationmarks.impl.ModificationImpl <em>Modification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp.model.modificationmarks.impl.ModificationImpl
		 * @see edu.kit.ipd.sdq.kamp.model.modificationmarks.impl.ModificationmarksPackageImpl#getModification()
		 * @generated
		 */
		EClass MODIFICATION = eINSTANCE.getModification();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp.model.modificationmarks.AcceptanceAndConfirmationState <em>Acceptance And Confirmation State</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp.model.modificationmarks.AcceptanceAndConfirmationState
		 * @see edu.kit.ipd.sdq.kamp.model.modificationmarks.impl.ModificationmarksPackageImpl#getAcceptanceAndConfirmationState()
		 * @generated
		 */
		EEnum ACCEPTANCE_AND_CONFIRMATION_STATE = eINSTANCE.getAcceptanceAndConfirmationState();

	}

} //ModificationmarksPackage
