/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl;

import edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.*;

import org.eclipse.emf.ecore.EClass;
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
public class KAMP4aPSFieldofactivityannotationsFactoryImpl extends EFactoryImpl implements KAMP4aPSFieldofactivityannotationsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static KAMP4aPSFieldofactivityannotationsFactory init() {
		try {
			KAMP4aPSFieldofactivityannotationsFactory theKAMP4aPSFieldofactivityannotationsFactory = (KAMP4aPSFieldofactivityannotationsFactory)EPackage.Registry.INSTANCE.getEFactory(KAMP4aPSFieldofactivityannotationsPackage.eNS_URI);
			if (theKAMP4aPSFieldofactivityannotationsFactory != null) {
				return theKAMP4aPSFieldofactivityannotationsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new KAMP4aPSFieldofactivityannotationsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KAMP4aPSFieldofactivityannotationsFactoryImpl() {
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
			case KAMP4aPSFieldofactivityannotationsPackage.FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY: return createFieldOfActivityAnnotationRepository();
			case KAMP4aPSFieldofactivityannotationsPackage.TEST_SPECIFICATION: return createTestSpecification();
			case KAMP4aPSFieldofactivityannotationsPackage.STOCK_SPECIFICATION: return createStockSpecification();
			case KAMP4aPSFieldofactivityannotationsPackage.HMI_SPECIFICATION: return createHMISpecification();
			case KAMP4aPSFieldofactivityannotationsPackage.ECAD_SPECIFICATION: return createECADSpecification();
			case KAMP4aPSFieldofactivityannotationsPackage.DOCUMENTATION_SPECIFICATION: return createDocumentationSpecification();
			case KAMP4aPSFieldofactivityannotationsPackage.STAFF_SPECIFICATION: return createStaffSpecification();
			case KAMP4aPSFieldofactivityannotationsPackage.CALIBRATION_SPECIFICATION: return createCalibrationSpecification();
			case KAMP4aPSFieldofactivityannotationsPackage.CALIBRATION_CONFIGURATION: return createCalibrationConfiguration();
			case KAMP4aPSFieldofactivityannotationsPackage.HMI_CONFIGURATION: return createHMIConfiguration();
			case KAMP4aPSFieldofactivityannotationsPackage.PERSON_LIST: return createPersonList();
			case KAMP4aPSFieldofactivityannotationsPackage.PERSON: return createPerson();
			case KAMP4aPSFieldofactivityannotationsPackage.ROLE_LIST: return createRoleList();
			case KAMP4aPSFieldofactivityannotationsPackage.SYSTEM_TEST: return createSystemTest();
			case KAMP4aPSFieldofactivityannotationsPackage.ENGINEER: return createEngineer();
			case KAMP4aPSFieldofactivityannotationsPackage.PURCHASER: return createPurchaser();
			case KAMP4aPSFieldofactivityannotationsPackage.MECHANIC: return createMechanic();
			case KAMP4aPSFieldofactivityannotationsPackage.DOCUMENTATION: return createDocumentation();
			case KAMP4aPSFieldofactivityannotationsPackage.DRAWING: return createDrawing();
			case KAMP4aPSFieldofactivityannotationsPackage.COMPONENT_DRAWING: return createComponentDrawing();
			case KAMP4aPSFieldofactivityannotationsPackage.MODULE_DRAWING: return createModuleDrawing();
			case KAMP4aPSFieldofactivityannotationsPackage.INTERFACE_DRAWING: return createInterfaceDrawing();
			case KAMP4aPSFieldofactivityannotationsPackage.STRUCTURE_DRAWING: return createStructureDrawing();
			case KAMP4aPSFieldofactivityannotationsPackage.MAINTENEANCE_DOCUMENTATION: return createMainteneanceDocumentation();
			case KAMP4aPSFieldofactivityannotationsPackage.OPERATOR_INSTRUCTIONS: return createOperatorInstructions();
			case KAMP4aPSFieldofactivityannotationsPackage.TRAINING_DOC_INTERN: return createTrainingDocIntern();
			case KAMP4aPSFieldofactivityannotationsPackage.TRAINING_DOC_EXTERNAL: return createTrainingDocExternal();
			case KAMP4aPSFieldofactivityannotationsPackage.COMPONENT_DOCUMENTATION_FILES: return createComponentDocumentationFiles();
			case KAMP4aPSFieldofactivityannotationsPackage.MODULE_DOCUMENTATION_FILES: return createModuleDocumentationFiles();
			case KAMP4aPSFieldofactivityannotationsPackage.INTERFACE_DOCUMENTATION_FILES: return createInterfaceDocumentationFiles();
			case KAMP4aPSFieldofactivityannotationsPackage.STRUCTURE_DOCUMENTATION_FILES: return createStructureDocumentationFiles();
			case KAMP4aPSFieldofactivityannotationsPackage.STOCK_LIST: return createStockList();
			case KAMP4aPSFieldofactivityannotationsPackage.COMPONENT_STOCK_LIST: return createComponentStockList();
			case KAMP4aPSFieldofactivityannotationsPackage.INTERFACE_STOCK_LIST: return createInterfaceStockList();
			case KAMP4aPSFieldofactivityannotationsPackage.MODULE_STOCK_LIST: return createModuleStockList();
			case KAMP4aPSFieldofactivityannotationsPackage.STRUCTURE_STOCK_LIST: return createStructureStockList();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FieldOfActivityAnnotationRepository createFieldOfActivityAnnotationRepository() {
		FieldOfActivityAnnotationRepositoryImpl fieldOfActivityAnnotationRepository = new FieldOfActivityAnnotationRepositoryImpl();
		return fieldOfActivityAnnotationRepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestSpecification createTestSpecification() {
		TestSpecificationImpl testSpecification = new TestSpecificationImpl();
		return testSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StockSpecification createStockSpecification() {
		StockSpecificationImpl stockSpecification = new StockSpecificationImpl();
		return stockSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HMISpecification createHMISpecification() {
		HMISpecificationImpl hmiSpecification = new HMISpecificationImpl();
		return hmiSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ECADSpecification createECADSpecification() {
		ECADSpecificationImpl ecadSpecification = new ECADSpecificationImpl();
		return ecadSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentationSpecification createDocumentationSpecification() {
		DocumentationSpecificationImpl documentationSpecification = new DocumentationSpecificationImpl();
		return documentationSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StaffSpecification createStaffSpecification() {
		StaffSpecificationImpl staffSpecification = new StaffSpecificationImpl();
		return staffSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalibrationSpecification createCalibrationSpecification() {
		CalibrationSpecificationImpl calibrationSpecification = new CalibrationSpecificationImpl();
		return calibrationSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalibrationConfiguration createCalibrationConfiguration() {
		CalibrationConfigurationImpl calibrationConfiguration = new CalibrationConfigurationImpl();
		return calibrationConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HMIConfiguration createHMIConfiguration() {
		HMIConfigurationImpl hmiConfiguration = new HMIConfigurationImpl();
		return hmiConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersonList createPersonList() {
		PersonListImpl personList = new PersonListImpl();
		return personList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person createPerson() {
		PersonImpl person = new PersonImpl();
		return person;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleList createRoleList() {
		RoleListImpl roleList = new RoleListImpl();
		return roleList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemTest createSystemTest() {
		SystemTestImpl systemTest = new SystemTestImpl();
		return systemTest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Engineer createEngineer() {
		EngineerImpl engineer = new EngineerImpl();
		return engineer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Purchaser createPurchaser() {
		PurchaserImpl purchaser = new PurchaserImpl();
		return purchaser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mechanic createMechanic() {
		MechanicImpl mechanic = new MechanicImpl();
		return mechanic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Documentation createDocumentation() {
		DocumentationImpl documentation = new DocumentationImpl();
		return documentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Drawing createDrawing() {
		DrawingImpl drawing = new DrawingImpl();
		return drawing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentDrawing createComponentDrawing() {
		ComponentDrawingImpl componentDrawing = new ComponentDrawingImpl();
		return componentDrawing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModuleDrawing createModuleDrawing() {
		ModuleDrawingImpl moduleDrawing = new ModuleDrawingImpl();
		return moduleDrawing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceDrawing createInterfaceDrawing() {
		InterfaceDrawingImpl interfaceDrawing = new InterfaceDrawingImpl();
		return interfaceDrawing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureDrawing createStructureDrawing() {
		StructureDrawingImpl structureDrawing = new StructureDrawingImpl();
		return structureDrawing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MainteneanceDocumentation createMainteneanceDocumentation() {
		MainteneanceDocumentationImpl mainteneanceDocumentation = new MainteneanceDocumentationImpl();
		return mainteneanceDocumentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperatorInstructions createOperatorInstructions() {
		OperatorInstructionsImpl operatorInstructions = new OperatorInstructionsImpl();
		return operatorInstructions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrainingDocIntern createTrainingDocIntern() {
		TrainingDocInternImpl trainingDocIntern = new TrainingDocInternImpl();
		return trainingDocIntern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrainingDocExternal createTrainingDocExternal() {
		TrainingDocExternalImpl trainingDocExternal = new TrainingDocExternalImpl();
		return trainingDocExternal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentDocumentationFiles createComponentDocumentationFiles() {
		ComponentDocumentationFilesImpl componentDocumentationFiles = new ComponentDocumentationFilesImpl();
		return componentDocumentationFiles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModuleDocumentationFiles createModuleDocumentationFiles() {
		ModuleDocumentationFilesImpl moduleDocumentationFiles = new ModuleDocumentationFilesImpl();
		return moduleDocumentationFiles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceDocumentationFiles createInterfaceDocumentationFiles() {
		InterfaceDocumentationFilesImpl interfaceDocumentationFiles = new InterfaceDocumentationFilesImpl();
		return interfaceDocumentationFiles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureDocumentationFiles createStructureDocumentationFiles() {
		StructureDocumentationFilesImpl structureDocumentationFiles = new StructureDocumentationFilesImpl();
		return structureDocumentationFiles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StockList createStockList() {
		StockListImpl stockList = new StockListImpl();
		return stockList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentStockList createComponentStockList() {
		ComponentStockListImpl componentStockList = new ComponentStockListImpl();
		return componentStockList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceStockList createInterfaceStockList() {
		InterfaceStockListImpl interfaceStockList = new InterfaceStockListImpl();
		return interfaceStockList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModuleStockList createModuleStockList() {
		ModuleStockListImpl moduleStockList = new ModuleStockListImpl();
		return moduleStockList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureStockList createStructureStockList() {
		StructureStockListImpl structureStockList = new StructureStockListImpl();
		return structureStockList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KAMP4aPSFieldofactivityannotationsPackage getKAMP4aPSFieldofactivityannotationsPackage() {
		return (KAMP4aPSFieldofactivityannotationsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static KAMP4aPSFieldofactivityannotationsPackage getPackage() {
		return KAMP4aPSFieldofactivityannotationsPackage.eINSTANCE;
	}

} //KAMP4aPSFieldofactivityannotationsFactoryImpl
