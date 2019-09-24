/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.util;

import edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.KAMP4aPSFieldofactivityannotationsPackage
 * @generated
 */
public class KAMP4aPSFieldofactivityannotationsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static KAMP4aPSFieldofactivityannotationsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KAMP4aPSFieldofactivityannotationsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = KAMP4aPSFieldofactivityannotationsPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KAMP4aPSFieldofactivityannotationsSwitch<Adapter> modelSwitch =
		new KAMP4aPSFieldofactivityannotationsSwitch<Adapter>() {
			@Override
			public Adapter caseFieldOfActivityAnnotationRepository(FieldOfActivityAnnotationRepository object) {
				return createFieldOfActivityAnnotationRepositoryAdapter();
			}
			@Override
			public Adapter caseTestSpecification(TestSpecification object) {
				return createTestSpecificationAdapter();
			}
			@Override
			public Adapter caseStockSpecification(StockSpecification object) {
				return createStockSpecificationAdapter();
			}
			@Override
			public Adapter caseHMISpecification(HMISpecification object) {
				return createHMISpecificationAdapter();
			}
			@Override
			public Adapter caseECADSpecification(ECADSpecification object) {
				return createECADSpecificationAdapter();
			}
			@Override
			public Adapter caseDocumentationSpecification(DocumentationSpecification object) {
				return createDocumentationSpecificationAdapter();
			}
			@Override
			public Adapter caseStaffSpecification(StaffSpecification object) {
				return createStaffSpecificationAdapter();
			}
			@Override
			public Adapter caseCalibrationSpecification(CalibrationSpecification object) {
				return createCalibrationSpecificationAdapter();
			}
			@Override
			public Adapter caseCalibrationConfiguration(CalibrationConfiguration object) {
				return createCalibrationConfigurationAdapter();
			}
			@Override
			public Adapter caseHMIConfiguration(HMIConfiguration object) {
				return createHMIConfigurationAdapter();
			}
			@Override
			public Adapter casePersonList(PersonList object) {
				return createPersonListAdapter();
			}
			@Override
			public Adapter casePerson(Person object) {
				return createPersonAdapter();
			}
			@Override
			public Adapter caseRole(Role object) {
				return createRoleAdapter();
			}
			@Override
			public Adapter caseRoleList(RoleList object) {
				return createRoleListAdapter();
			}
			@Override
			public Adapter caseFile(File object) {
				return createFileAdapter();
			}
			@Override
			public Adapter caseTestCase(TestCase object) {
				return createTestCaseAdapter();
			}
			@Override
			public Adapter caseSystemTest(SystemTest object) {
				return createSystemTestAdapter();
			}
			@Override
			public Adapter caseEngineer(Engineer object) {
				return createEngineerAdapter();
			}
			@Override
			public Adapter casePurchaser(Purchaser object) {
				return createPurchaserAdapter();
			}
			@Override
			public Adapter caseMechanic(Mechanic object) {
				return createMechanicAdapter();
			}
			@Override
			public Adapter caseDocumentation(Documentation object) {
				return createDocumentationAdapter();
			}
			@Override
			public Adapter caseDrawing(Drawing object) {
				return createDrawingAdapter();
			}
			@Override
			public Adapter caseComponentDrawing(ComponentDrawing object) {
				return createComponentDrawingAdapter();
			}
			@Override
			public Adapter caseModuleDrawing(ModuleDrawing object) {
				return createModuleDrawingAdapter();
			}
			@Override
			public Adapter caseInterfaceDrawing(InterfaceDrawing object) {
				return createInterfaceDrawingAdapter();
			}
			@Override
			public Adapter caseStructureDrawing(StructureDrawing object) {
				return createStructureDrawingAdapter();
			}
			@Override
			public Adapter caseMainteneanceDocumentation(MainteneanceDocumentation object) {
				return createMainteneanceDocumentationAdapter();
			}
			@Override
			public Adapter caseOperatorInstructions(OperatorInstructions object) {
				return createOperatorInstructionsAdapter();
			}
			@Override
			public Adapter caseTrainingDocIntern(TrainingDocIntern object) {
				return createTrainingDocInternAdapter();
			}
			@Override
			public Adapter caseTrainingDocExternal(TrainingDocExternal object) {
				return createTrainingDocExternalAdapter();
			}
			@Override
			public Adapter caseDocumentationFiles(DocumentationFiles object) {
				return createDocumentationFilesAdapter();
			}
			@Override
			public Adapter caseComponentDocumentationFiles(ComponentDocumentationFiles object) {
				return createComponentDocumentationFilesAdapter();
			}
			@Override
			public Adapter caseModuleDocumentationFiles(ModuleDocumentationFiles object) {
				return createModuleDocumentationFilesAdapter();
			}
			@Override
			public Adapter caseInterfaceDocumentationFiles(InterfaceDocumentationFiles object) {
				return createInterfaceDocumentationFilesAdapter();
			}
			@Override
			public Adapter caseStructureDocumentationFiles(StructureDocumentationFiles object) {
				return createStructureDocumentationFilesAdapter();
			}
			@Override
			public Adapter caseStockList(StockList object) {
				return createStockListAdapter();
			}
			@Override
			public Adapter caseComponentStockList(ComponentStockList object) {
				return createComponentStockListAdapter();
			}
			@Override
			public Adapter caseInterfaceStockList(InterfaceStockList object) {
				return createInterfaceStockListAdapter();
			}
			@Override
			public Adapter caseModuleStockList(ModuleStockList object) {
				return createModuleStockListAdapter();
			}
			@Override
			public Adapter caseStructureStockList(StructureStockList object) {
				return createStructureStockListAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.FieldOfActivityAnnotationRepository <em>Field Of Activity Annotation Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.FieldOfActivityAnnotationRepository
	 * @generated
	 */
	public Adapter createFieldOfActivityAnnotationRepositoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.TestSpecification <em>Test Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.TestSpecification
	 * @generated
	 */
	public Adapter createTestSpecificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.StockSpecification <em>Stock Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.StockSpecification
	 * @generated
	 */
	public Adapter createStockSpecificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.HMISpecification <em>HMI Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.HMISpecification
	 * @generated
	 */
	public Adapter createHMISpecificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.ECADSpecification <em>ECAD Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.ECADSpecification
	 * @generated
	 */
	public Adapter createECADSpecificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.DocumentationSpecification <em>Documentation Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.DocumentationSpecification
	 * @generated
	 */
	public Adapter createDocumentationSpecificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.StaffSpecification <em>Staff Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.StaffSpecification
	 * @generated
	 */
	public Adapter createStaffSpecificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.CalibrationSpecification <em>Calibration Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.CalibrationSpecification
	 * @generated
	 */
	public Adapter createCalibrationSpecificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.CalibrationConfiguration <em>Calibration Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.CalibrationConfiguration
	 * @generated
	 */
	public Adapter createCalibrationConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.HMIConfiguration <em>HMI Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.HMIConfiguration
	 * @generated
	 */
	public Adapter createHMIConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.PersonList <em>Person List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.PersonList
	 * @generated
	 */
	public Adapter createPersonListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.Person
	 * @generated
	 */
	public Adapter createPersonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.Role
	 * @generated
	 */
	public Adapter createRoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.RoleList <em>Role List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.RoleList
	 * @generated
	 */
	public Adapter createRoleListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.File <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.File
	 * @generated
	 */
	public Adapter createFileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.TestCase <em>Test Case</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.TestCase
	 * @generated
	 */
	public Adapter createTestCaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.SystemTest <em>System Test</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.SystemTest
	 * @generated
	 */
	public Adapter createSystemTestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.Engineer <em>Engineer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.Engineer
	 * @generated
	 */
	public Adapter createEngineerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.Purchaser <em>Purchaser</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.Purchaser
	 * @generated
	 */
	public Adapter createPurchaserAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.Mechanic <em>Mechanic</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.Mechanic
	 * @generated
	 */
	public Adapter createMechanicAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.Documentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.Documentation
	 * @generated
	 */
	public Adapter createDocumentationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.Drawing <em>Drawing</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.Drawing
	 * @generated
	 */
	public Adapter createDrawingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.ComponentDrawing <em>Component Drawing</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.ComponentDrawing
	 * @generated
	 */
	public Adapter createComponentDrawingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.ModuleDrawing <em>Module Drawing</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.ModuleDrawing
	 * @generated
	 */
	public Adapter createModuleDrawingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.InterfaceDrawing <em>Interface Drawing</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.InterfaceDrawing
	 * @generated
	 */
	public Adapter createInterfaceDrawingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.StructureDrawing <em>Structure Drawing</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.StructureDrawing
	 * @generated
	 */
	public Adapter createStructureDrawingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.MainteneanceDocumentation <em>Mainteneance Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.MainteneanceDocumentation
	 * @generated
	 */
	public Adapter createMainteneanceDocumentationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.OperatorInstructions <em>Operator Instructions</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.OperatorInstructions
	 * @generated
	 */
	public Adapter createOperatorInstructionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.TrainingDocIntern <em>Training Doc Intern</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.TrainingDocIntern
	 * @generated
	 */
	public Adapter createTrainingDocInternAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.TrainingDocExternal <em>Training Doc External</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.TrainingDocExternal
	 * @generated
	 */
	public Adapter createTrainingDocExternalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.DocumentationFiles <em>Documentation Files</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.DocumentationFiles
	 * @generated
	 */
	public Adapter createDocumentationFilesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.ComponentDocumentationFiles <em>Component Documentation Files</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.ComponentDocumentationFiles
	 * @generated
	 */
	public Adapter createComponentDocumentationFilesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.ModuleDocumentationFiles <em>Module Documentation Files</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.ModuleDocumentationFiles
	 * @generated
	 */
	public Adapter createModuleDocumentationFilesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.InterfaceDocumentationFiles <em>Interface Documentation Files</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.InterfaceDocumentationFiles
	 * @generated
	 */
	public Adapter createInterfaceDocumentationFilesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.StructureDocumentationFiles <em>Structure Documentation Files</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.StructureDocumentationFiles
	 * @generated
	 */
	public Adapter createStructureDocumentationFilesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.StockList <em>Stock List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.StockList
	 * @generated
	 */
	public Adapter createStockListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.ComponentStockList <em>Component Stock List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.ComponentStockList
	 * @generated
	 */
	public Adapter createComponentStockListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.InterfaceStockList <em>Interface Stock List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.InterfaceStockList
	 * @generated
	 */
	public Adapter createInterfaceStockListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.ModuleStockList <em>Module Stock List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.ModuleStockList
	 * @generated
	 */
	public Adapter createModuleStockListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.StructureStockList <em>Structure Stock List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.StructureStockList
	 * @generated
	 */
	public Adapter createStructureStockListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //KAMP4aPSFieldofactivityannotationsAdapterFactory
