/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.ComponentRepositoryPackage;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.InterfaceRepositoryPackage;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.ModuleRepositoryPackage;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.StructureRepository.StructureRepositoryPackage;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.apsPackage;

import edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.CalibrationConfiguration;
import edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.CalibrationSpecification;
import edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.ComponentDocumentationFiles;
import edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.ComponentDrawing;
import edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.ComponentStockList;
import edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.Documentation;
import edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.DocumentationFiles;
import edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.DocumentationSpecification;
import edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.Drawing;
import edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.ECADSpecification;
import edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.Engineer;
import edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.FieldOfActivityAnnotationRepository;
import edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.File;
import edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.HMIConfiguration;
import edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.HMISpecification;
import edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.InterfaceDocumentationFiles;
import edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.InterfaceDrawing;
import edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.InterfaceStockList;
import edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.KAMP4aPSFieldofactivityannotationsFactory;
import edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.KAMP4aPSFieldofactivityannotationsPackage;
import edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.MainteneanceDocumentation;
import edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.Mechanic;
import edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.ModuleDocumentationFiles;
import edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.ModuleDrawing;
import edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.ModuleStockList;
import edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.OperatorInstructions;
import edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.Person;
import edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.PersonList;
import edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.Purchaser;
import edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.Role;
import edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.RoleList;
import edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.StaffSpecification;
import edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.StockList;
import edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.StockSpecification;
import edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.StructureDocumentationFiles;
import edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.StructureDrawing;
import edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.StructureStockList;
import edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.SystemTest;
import edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.TestCase;
import edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.TestSpecification;
import edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.TrainingDocExternal;
import edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.TrainingDocIntern;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class KAMP4aPSFieldofactivityannotationsPackageImpl extends EPackageImpl implements KAMP4aPSFieldofactivityannotationsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fieldOfActivityAnnotationRepositoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stockSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hmiSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ecadSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentationSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass staffSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass calibrationSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass calibrationConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hmiConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass personListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass personEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testCaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemTestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass engineerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass purchaserEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mechanicEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass drawingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentDrawingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moduleDrawingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceDrawingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structureDrawingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mainteneanceDocumentationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operatorInstructionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trainingDocInternEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trainingDocExternalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentationFilesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentDocumentationFilesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moduleDocumentationFilesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceDocumentationFilesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structureDocumentationFilesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stockListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentStockListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceStockListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moduleStockListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structureStockListEClass = null;

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
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.KAMP4aPSFieldofactivityannotationsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private KAMP4aPSFieldofactivityannotationsPackageImpl() {
		super(eNS_URI, KAMP4aPSFieldofactivityannotationsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link KAMP4aPSFieldofactivityannotationsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static KAMP4aPSFieldofactivityannotationsPackage init() {
		if (isInited) return (KAMP4aPSFieldofactivityannotationsPackage)EPackage.Registry.INSTANCE.getEPackage(KAMP4aPSFieldofactivityannotationsPackage.eNS_URI);

		// Obtain or create and register package
		KAMP4aPSFieldofactivityannotationsPackageImpl theKAMP4aPSFieldofactivityannotationsPackage = (KAMP4aPSFieldofactivityannotationsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof KAMP4aPSFieldofactivityannotationsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new KAMP4aPSFieldofactivityannotationsPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		apsPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theKAMP4aPSFieldofactivityannotationsPackage.createPackageContents();

		// Initialize created meta-data
		theKAMP4aPSFieldofactivityannotationsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theKAMP4aPSFieldofactivityannotationsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(KAMP4aPSFieldofactivityannotationsPackage.eNS_URI, theKAMP4aPSFieldofactivityannotationsPackage);
		return theKAMP4aPSFieldofactivityannotationsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFieldOfActivityAnnotationRepository() {
		return fieldOfActivityAnnotationRepositoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFieldOfActivityAnnotationRepository_CalibrationSpecification() {
		return (EReference)fieldOfActivityAnnotationRepositoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFieldOfActivityAnnotationRepository_TestSpecification() {
		return (EReference)fieldOfActivityAnnotationRepositoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFieldOfActivityAnnotationRepository_StockSpecification() {
		return (EReference)fieldOfActivityAnnotationRepositoryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFieldOfActivityAnnotationRepository_HmiSpecification() {
		return (EReference)fieldOfActivityAnnotationRepositoryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFieldOfActivityAnnotationRepository_EcadSpecification() {
		return (EReference)fieldOfActivityAnnotationRepositoryEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFieldOfActivityAnnotationRepository_DocumentationSpecification() {
		return (EReference)fieldOfActivityAnnotationRepositoryEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFieldOfActivityAnnotationRepository_StaffSpecification() {
		return (EReference)fieldOfActivityAnnotationRepositoryEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestSpecification() {
		return testSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestSpecification_Parent() {
		return (EReference)testSpecificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestSpecification_SystemTests() {
		return (EReference)testSpecificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestSpecification_Role() {
		return (EReference)testSpecificationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStockSpecification() {
		return stockSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStockSpecification_Parent() {
		return (EReference)stockSpecificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStockSpecification_ComponentStockList() {
		return (EReference)stockSpecificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStockSpecification_InterfaceStockList() {
		return (EReference)stockSpecificationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStockSpecification_ModuleStockList() {
		return (EReference)stockSpecificationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStockSpecification_StructureStockList() {
		return (EReference)stockSpecificationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStockSpecification_Role() {
		return (EReference)stockSpecificationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHMISpecification() {
		return hmiSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHMISpecification_Parent() {
		return (EReference)hmiSpecificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHMISpecification_Role() {
		return (EReference)hmiSpecificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHMISpecification_HmiConfig() {
		return (EReference)hmiSpecificationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getECADSpecification() {
		return ecadSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getECADSpecification_Parent() {
		return (EReference)ecadSpecificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getECADSpecification_Drawings() {
		return (EReference)ecadSpecificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getECADSpecification_Role() {
		return (EReference)ecadSpecificationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentationSpecification() {
		return documentationSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentationSpecification_Parent() {
		return (EReference)documentationSpecificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentationSpecification_ComponentDocumentation() {
		return (EReference)documentationSpecificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentationSpecification_ModuleDocumentation() {
		return (EReference)documentationSpecificationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentationSpecification_InterfaceDocumentation() {
		return (EReference)documentationSpecificationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentationSpecification_StructureDocumentation() {
		return (EReference)documentationSpecificationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentationSpecification_Role() {
		return (EReference)documentationSpecificationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStaffSpecification() {
		return staffSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStaffSpecification_Parent() {
		return (EReference)staffSpecificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStaffSpecification_PersonList() {
		return (EReference)staffSpecificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStaffSpecification_RoleList() {
		return (EReference)staffSpecificationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCalibrationSpecification() {
		return calibrationSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCalibrationSpecification_Parent() {
		return (EReference)calibrationSpecificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCalibrationSpecification_Role() {
		return (EReference)calibrationSpecificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCalibrationSpecification_CalibrationConfig() {
		return (EReference)calibrationSpecificationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCalibrationConfiguration() {
		return calibrationConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCalibrationConfiguration_Name() {
		return (EAttribute)calibrationConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCalibrationConfiguration_Parent() {
		return (EReference)calibrationConfigurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCalibrationConfiguration_Components() {
		return (EReference)calibrationConfigurationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCalibrationConfiguration_Modules() {
		return (EReference)calibrationConfigurationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCalibrationConfiguration_Interfaces() {
		return (EReference)calibrationConfigurationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCalibrationConfiguration_Structures() {
		return (EReference)calibrationConfigurationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHMIConfiguration() {
		return hmiConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHMIConfiguration_Name() {
		return (EAttribute)hmiConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHMIConfiguration_Components() {
		return (EReference)hmiConfigurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHMIConfiguration_Modules() {
		return (EReference)hmiConfigurationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHMIConfiguration_Interfaces() {
		return (EReference)hmiConfigurationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHMIConfiguration_Structures() {
		return (EReference)hmiConfigurationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHMIConfiguration_Parent() {
		return (EReference)hmiConfigurationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPersonList() {
		return personListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonList_Parent() {
		return (EReference)personListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonList_Persons() {
		return (EReference)personListEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPerson() {
		return personEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPerson_Parent() {
		return (EReference)personEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPerson_Roles() {
		return (EReference)personEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerson_Name() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRole() {
		return roleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRole_Parent() {
		return (EReference)roleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRole_Person() {
		return (EReference)roleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRole_Description() {
		return (EAttribute)roleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoleList() {
		return roleListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoleList_Parent() {
		return (EReference)roleListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoleList_Roles() {
		return (EReference)roleListEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFile() {
		return fileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFile_Filename() {
		return (EAttribute)fileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestCase() {
		return testCaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestCase_TestName() {
		return (EAttribute)testCaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystemTest() {
		return systemTestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemTest_Parent() {
		return (EReference)systemTestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemTest_SystemUnderTest() {
		return (EReference)systemTestEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEngineer() {
		return engineerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPurchaser() {
		return purchaserEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMechanic() {
		return mechanicEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentation() {
		return documentationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDrawing() {
		return drawingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDrawing_Parent() {
		return (EReference)drawingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponentDrawing() {
		return componentDrawingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentDrawing_Drawn_component() {
		return (EReference)componentDrawingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModuleDrawing() {
		return moduleDrawingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModuleDrawing_Drawn_module() {
		return (EReference)moduleDrawingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterfaceDrawing() {
		return interfaceDrawingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfaceDrawing_Drawn_interface() {
		return (EReference)interfaceDrawingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStructureDrawing() {
		return structureDrawingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructureDrawing_Drawn_structure() {
		return (EReference)structureDrawingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMainteneanceDocumentation() {
		return mainteneanceDocumentationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMainteneanceDocumentation_Parent() {
		return (EReference)mainteneanceDocumentationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperatorInstructions() {
		return operatorInstructionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperatorInstructions_Parent() {
		return (EReference)operatorInstructionsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrainingDocIntern() {
		return trainingDocInternEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrainingDocIntern_Parent() {
		return (EReference)trainingDocInternEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrainingDocExternal() {
		return trainingDocExternalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrainingDocExternal_Parent() {
		return (EReference)trainingDocExternalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentationFiles() {
		return documentationFilesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentationFiles_Mainteneance() {
		return (EReference)documentationFilesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentationFiles_Instructions() {
		return (EReference)documentationFilesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentationFiles_TrainingIntern() {
		return (EReference)documentationFilesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentationFiles_TrainingExternal() {
		return (EReference)documentationFilesEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponentDocumentationFiles() {
		return componentDocumentationFilesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentDocumentationFiles_Parent() {
		return (EReference)componentDocumentationFilesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentDocumentationFiles_DocumentedComponent() {
		return (EReference)componentDocumentationFilesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModuleDocumentationFiles() {
		return moduleDocumentationFilesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModuleDocumentationFiles_Parent() {
		return (EReference)moduleDocumentationFilesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModuleDocumentationFiles_DocumentedModule() {
		return (EReference)moduleDocumentationFilesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterfaceDocumentationFiles() {
		return interfaceDocumentationFilesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfaceDocumentationFiles_Parent() {
		return (EReference)interfaceDocumentationFilesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfaceDocumentationFiles_DocumentedInterface() {
		return (EReference)interfaceDocumentationFilesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStructureDocumentationFiles() {
		return structureDocumentationFilesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructureDocumentationFiles_Parent() {
		return (EReference)structureDocumentationFilesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructureDocumentationFiles_DocumentedStructure() {
		return (EReference)structureDocumentationFilesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStockList() {
		return stockListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponentStockList() {
		return componentStockListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentStockList_Parent() {
		return (EReference)componentStockListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentStockList_Components() {
		return (EReference)componentStockListEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterfaceStockList() {
		return interfaceStockListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfaceStockList_Parent() {
		return (EReference)interfaceStockListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfaceStockList_Interfaces() {
		return (EReference)interfaceStockListEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModuleStockList() {
		return moduleStockListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModuleStockList_Parent() {
		return (EReference)moduleStockListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModuleStockList_Modules() {
		return (EReference)moduleStockListEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStructureStockList() {
		return structureStockListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructureStockList_Parent() {
		return (EReference)structureStockListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructureStockList_Structures() {
		return (EReference)structureStockListEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KAMP4aPSFieldofactivityannotationsFactory getKAMP4aPSFieldofactivityannotationsFactory() {
		return (KAMP4aPSFieldofactivityannotationsFactory)getEFactoryInstance();
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
		fieldOfActivityAnnotationRepositoryEClass = createEClass(FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY);
		createEReference(fieldOfActivityAnnotationRepositoryEClass, FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__CALIBRATION_SPECIFICATION);
		createEReference(fieldOfActivityAnnotationRepositoryEClass, FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__TEST_SPECIFICATION);
		createEReference(fieldOfActivityAnnotationRepositoryEClass, FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__STOCK_SPECIFICATION);
		createEReference(fieldOfActivityAnnotationRepositoryEClass, FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__HMI_SPECIFICATION);
		createEReference(fieldOfActivityAnnotationRepositoryEClass, FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__ECAD_SPECIFICATION);
		createEReference(fieldOfActivityAnnotationRepositoryEClass, FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__DOCUMENTATION_SPECIFICATION);
		createEReference(fieldOfActivityAnnotationRepositoryEClass, FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__STAFF_SPECIFICATION);

		testSpecificationEClass = createEClass(TEST_SPECIFICATION);
		createEReference(testSpecificationEClass, TEST_SPECIFICATION__PARENT);
		createEReference(testSpecificationEClass, TEST_SPECIFICATION__SYSTEM_TESTS);
		createEReference(testSpecificationEClass, TEST_SPECIFICATION__ROLE);

		stockSpecificationEClass = createEClass(STOCK_SPECIFICATION);
		createEReference(stockSpecificationEClass, STOCK_SPECIFICATION__PARENT);
		createEReference(stockSpecificationEClass, STOCK_SPECIFICATION__COMPONENT_STOCK_LIST);
		createEReference(stockSpecificationEClass, STOCK_SPECIFICATION__INTERFACE_STOCK_LIST);
		createEReference(stockSpecificationEClass, STOCK_SPECIFICATION__MODULE_STOCK_LIST);
		createEReference(stockSpecificationEClass, STOCK_SPECIFICATION__STRUCTURE_STOCK_LIST);
		createEReference(stockSpecificationEClass, STOCK_SPECIFICATION__ROLE);

		hmiSpecificationEClass = createEClass(HMI_SPECIFICATION);
		createEReference(hmiSpecificationEClass, HMI_SPECIFICATION__PARENT);
		createEReference(hmiSpecificationEClass, HMI_SPECIFICATION__ROLE);
		createEReference(hmiSpecificationEClass, HMI_SPECIFICATION__HMI_CONFIG);

		ecadSpecificationEClass = createEClass(ECAD_SPECIFICATION);
		createEReference(ecadSpecificationEClass, ECAD_SPECIFICATION__PARENT);
		createEReference(ecadSpecificationEClass, ECAD_SPECIFICATION__DRAWINGS);
		createEReference(ecadSpecificationEClass, ECAD_SPECIFICATION__ROLE);

		documentationSpecificationEClass = createEClass(DOCUMENTATION_SPECIFICATION);
		createEReference(documentationSpecificationEClass, DOCUMENTATION_SPECIFICATION__PARENT);
		createEReference(documentationSpecificationEClass, DOCUMENTATION_SPECIFICATION__COMPONENT_DOCUMENTATION);
		createEReference(documentationSpecificationEClass, DOCUMENTATION_SPECIFICATION__MODULE_DOCUMENTATION);
		createEReference(documentationSpecificationEClass, DOCUMENTATION_SPECIFICATION__INTERFACE_DOCUMENTATION);
		createEReference(documentationSpecificationEClass, DOCUMENTATION_SPECIFICATION__STRUCTURE_DOCUMENTATION);
		createEReference(documentationSpecificationEClass, DOCUMENTATION_SPECIFICATION__ROLE);

		staffSpecificationEClass = createEClass(STAFF_SPECIFICATION);
		createEReference(staffSpecificationEClass, STAFF_SPECIFICATION__PARENT);
		createEReference(staffSpecificationEClass, STAFF_SPECIFICATION__PERSON_LIST);
		createEReference(staffSpecificationEClass, STAFF_SPECIFICATION__ROLE_LIST);

		calibrationSpecificationEClass = createEClass(CALIBRATION_SPECIFICATION);
		createEReference(calibrationSpecificationEClass, CALIBRATION_SPECIFICATION__PARENT);
		createEReference(calibrationSpecificationEClass, CALIBRATION_SPECIFICATION__ROLE);
		createEReference(calibrationSpecificationEClass, CALIBRATION_SPECIFICATION__CALIBRATION_CONFIG);

		calibrationConfigurationEClass = createEClass(CALIBRATION_CONFIGURATION);
		createEAttribute(calibrationConfigurationEClass, CALIBRATION_CONFIGURATION__NAME);
		createEReference(calibrationConfigurationEClass, CALIBRATION_CONFIGURATION__PARENT);
		createEReference(calibrationConfigurationEClass, CALIBRATION_CONFIGURATION__COMPONENTS);
		createEReference(calibrationConfigurationEClass, CALIBRATION_CONFIGURATION__MODULES);
		createEReference(calibrationConfigurationEClass, CALIBRATION_CONFIGURATION__INTERFACES);
		createEReference(calibrationConfigurationEClass, CALIBRATION_CONFIGURATION__STRUCTURES);

		hmiConfigurationEClass = createEClass(HMI_CONFIGURATION);
		createEAttribute(hmiConfigurationEClass, HMI_CONFIGURATION__NAME);
		createEReference(hmiConfigurationEClass, HMI_CONFIGURATION__COMPONENTS);
		createEReference(hmiConfigurationEClass, HMI_CONFIGURATION__MODULES);
		createEReference(hmiConfigurationEClass, HMI_CONFIGURATION__INTERFACES);
		createEReference(hmiConfigurationEClass, HMI_CONFIGURATION__STRUCTURES);
		createEReference(hmiConfigurationEClass, HMI_CONFIGURATION__PARENT);

		personListEClass = createEClass(PERSON_LIST);
		createEReference(personListEClass, PERSON_LIST__PARENT);
		createEReference(personListEClass, PERSON_LIST__PERSONS);

		personEClass = createEClass(PERSON);
		createEReference(personEClass, PERSON__PARENT);
		createEReference(personEClass, PERSON__ROLES);
		createEAttribute(personEClass, PERSON__NAME);

		roleEClass = createEClass(ROLE);
		createEReference(roleEClass, ROLE__PARENT);
		createEReference(roleEClass, ROLE__PERSON);
		createEAttribute(roleEClass, ROLE__DESCRIPTION);

		roleListEClass = createEClass(ROLE_LIST);
		createEReference(roleListEClass, ROLE_LIST__PARENT);
		createEReference(roleListEClass, ROLE_LIST__ROLES);

		fileEClass = createEClass(FILE);
		createEAttribute(fileEClass, FILE__FILENAME);

		testCaseEClass = createEClass(TEST_CASE);
		createEAttribute(testCaseEClass, TEST_CASE__TEST_NAME);

		systemTestEClass = createEClass(SYSTEM_TEST);
		createEReference(systemTestEClass, SYSTEM_TEST__PARENT);
		createEReference(systemTestEClass, SYSTEM_TEST__SYSTEM_UNDER_TEST);

		engineerEClass = createEClass(ENGINEER);

		purchaserEClass = createEClass(PURCHASER);

		mechanicEClass = createEClass(MECHANIC);

		documentationEClass = createEClass(DOCUMENTATION);

		drawingEClass = createEClass(DRAWING);
		createEReference(drawingEClass, DRAWING__PARENT);

		componentDrawingEClass = createEClass(COMPONENT_DRAWING);
		createEReference(componentDrawingEClass, COMPONENT_DRAWING__DRAWN_COMPONENT);

		moduleDrawingEClass = createEClass(MODULE_DRAWING);
		createEReference(moduleDrawingEClass, MODULE_DRAWING__DRAWN_MODULE);

		interfaceDrawingEClass = createEClass(INTERFACE_DRAWING);
		createEReference(interfaceDrawingEClass, INTERFACE_DRAWING__DRAWN_INTERFACE);

		structureDrawingEClass = createEClass(STRUCTURE_DRAWING);
		createEReference(structureDrawingEClass, STRUCTURE_DRAWING__DRAWN_STRUCTURE);

		mainteneanceDocumentationEClass = createEClass(MAINTENEANCE_DOCUMENTATION);
		createEReference(mainteneanceDocumentationEClass, MAINTENEANCE_DOCUMENTATION__PARENT);

		operatorInstructionsEClass = createEClass(OPERATOR_INSTRUCTIONS);
		createEReference(operatorInstructionsEClass, OPERATOR_INSTRUCTIONS__PARENT);

		trainingDocInternEClass = createEClass(TRAINING_DOC_INTERN);
		createEReference(trainingDocInternEClass, TRAINING_DOC_INTERN__PARENT);

		trainingDocExternalEClass = createEClass(TRAINING_DOC_EXTERNAL);
		createEReference(trainingDocExternalEClass, TRAINING_DOC_EXTERNAL__PARENT);

		documentationFilesEClass = createEClass(DOCUMENTATION_FILES);
		createEReference(documentationFilesEClass, DOCUMENTATION_FILES__MAINTENEANCE);
		createEReference(documentationFilesEClass, DOCUMENTATION_FILES__INSTRUCTIONS);
		createEReference(documentationFilesEClass, DOCUMENTATION_FILES__TRAINING_INTERN);
		createEReference(documentationFilesEClass, DOCUMENTATION_FILES__TRAINING_EXTERNAL);

		componentDocumentationFilesEClass = createEClass(COMPONENT_DOCUMENTATION_FILES);
		createEReference(componentDocumentationFilesEClass, COMPONENT_DOCUMENTATION_FILES__PARENT);
		createEReference(componentDocumentationFilesEClass, COMPONENT_DOCUMENTATION_FILES__DOCUMENTED_COMPONENT);

		moduleDocumentationFilesEClass = createEClass(MODULE_DOCUMENTATION_FILES);
		createEReference(moduleDocumentationFilesEClass, MODULE_DOCUMENTATION_FILES__PARENT);
		createEReference(moduleDocumentationFilesEClass, MODULE_DOCUMENTATION_FILES__DOCUMENTED_MODULE);

		interfaceDocumentationFilesEClass = createEClass(INTERFACE_DOCUMENTATION_FILES);
		createEReference(interfaceDocumentationFilesEClass, INTERFACE_DOCUMENTATION_FILES__PARENT);
		createEReference(interfaceDocumentationFilesEClass, INTERFACE_DOCUMENTATION_FILES__DOCUMENTED_INTERFACE);

		structureDocumentationFilesEClass = createEClass(STRUCTURE_DOCUMENTATION_FILES);
		createEReference(structureDocumentationFilesEClass, STRUCTURE_DOCUMENTATION_FILES__PARENT);
		createEReference(structureDocumentationFilesEClass, STRUCTURE_DOCUMENTATION_FILES__DOCUMENTED_STRUCTURE);

		stockListEClass = createEClass(STOCK_LIST);

		componentStockListEClass = createEClass(COMPONENT_STOCK_LIST);
		createEReference(componentStockListEClass, COMPONENT_STOCK_LIST__PARENT);
		createEReference(componentStockListEClass, COMPONENT_STOCK_LIST__COMPONENTS);

		interfaceStockListEClass = createEClass(INTERFACE_STOCK_LIST);
		createEReference(interfaceStockListEClass, INTERFACE_STOCK_LIST__PARENT);
		createEReference(interfaceStockListEClass, INTERFACE_STOCK_LIST__INTERFACES);

		moduleStockListEClass = createEClass(MODULE_STOCK_LIST);
		createEReference(moduleStockListEClass, MODULE_STOCK_LIST__PARENT);
		createEReference(moduleStockListEClass, MODULE_STOCK_LIST__MODULES);

		structureStockListEClass = createEClass(STRUCTURE_STOCK_LIST);
		createEReference(structureStockListEClass, STRUCTURE_STOCK_LIST__PARENT);
		createEReference(structureStockListEClass, STRUCTURE_STOCK_LIST__STRUCTURES);
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

		// Obtain other dependent packages
		ComponentRepositoryPackage theComponentRepositoryPackage = (ComponentRepositoryPackage)EPackage.Registry.INSTANCE.getEPackage(ComponentRepositoryPackage.eNS_URI);
		ModuleRepositoryPackage theModuleRepositoryPackage = (ModuleRepositoryPackage)EPackage.Registry.INSTANCE.getEPackage(ModuleRepositoryPackage.eNS_URI);
		InterfaceRepositoryPackage theInterfaceRepositoryPackage = (InterfaceRepositoryPackage)EPackage.Registry.INSTANCE.getEPackage(InterfaceRepositoryPackage.eNS_URI);
		StructureRepositoryPackage theStructureRepositoryPackage = (StructureRepositoryPackage)EPackage.Registry.INSTANCE.getEPackage(StructureRepositoryPackage.eNS_URI);
		apsPackage theapsPackage = (apsPackage)EPackage.Registry.INSTANCE.getEPackage(apsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		systemTestEClass.getESuperTypes().add(this.getTestCase());
		engineerEClass.getESuperTypes().add(this.getRole());
		purchaserEClass.getESuperTypes().add(this.getRole());
		mechanicEClass.getESuperTypes().add(this.getRole());
		documentationEClass.getESuperTypes().add(this.getFile());
		drawingEClass.getESuperTypes().add(this.getFile());
		componentDrawingEClass.getESuperTypes().add(this.getDrawing());
		moduleDrawingEClass.getESuperTypes().add(this.getDrawing());
		interfaceDrawingEClass.getESuperTypes().add(this.getDrawing());
		structureDrawingEClass.getESuperTypes().add(this.getDrawing());
		mainteneanceDocumentationEClass.getESuperTypes().add(this.getDocumentation());
		operatorInstructionsEClass.getESuperTypes().add(this.getDocumentation());
		trainingDocInternEClass.getESuperTypes().add(this.getDocumentation());
		trainingDocExternalEClass.getESuperTypes().add(this.getDocumentation());
		componentDocumentationFilesEClass.getESuperTypes().add(this.getDocumentationFiles());
		moduleDocumentationFilesEClass.getESuperTypes().add(this.getDocumentationFiles());
		interfaceDocumentationFilesEClass.getESuperTypes().add(this.getDocumentationFiles());
		structureDocumentationFilesEClass.getESuperTypes().add(this.getDocumentationFiles());
		stockListEClass.getESuperTypes().add(this.getFile());
		componentStockListEClass.getESuperTypes().add(this.getStockList());
		interfaceStockListEClass.getESuperTypes().add(this.getStockList());
		moduleStockListEClass.getESuperTypes().add(this.getStockList());
		structureStockListEClass.getESuperTypes().add(this.getStockList());

		// Initialize classes, features, and operations; add parameters
		initEClass(fieldOfActivityAnnotationRepositoryEClass, FieldOfActivityAnnotationRepository.class, "FieldOfActivityAnnotationRepository", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFieldOfActivityAnnotationRepository_CalibrationSpecification(), this.getCalibrationSpecification(), this.getCalibrationSpecification_Parent(), "calibrationSpecification", null, 0, 1, FieldOfActivityAnnotationRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFieldOfActivityAnnotationRepository_TestSpecification(), this.getTestSpecification(), this.getTestSpecification_Parent(), "testSpecification", null, 0, 1, FieldOfActivityAnnotationRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFieldOfActivityAnnotationRepository_StockSpecification(), this.getStockSpecification(), this.getStockSpecification_Parent(), "stockSpecification", null, 0, 1, FieldOfActivityAnnotationRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFieldOfActivityAnnotationRepository_HmiSpecification(), this.getHMISpecification(), this.getHMISpecification_Parent(), "hmiSpecification", null, 0, 1, FieldOfActivityAnnotationRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFieldOfActivityAnnotationRepository_EcadSpecification(), this.getECADSpecification(), this.getECADSpecification_Parent(), "ecadSpecification", null, 0, 1, FieldOfActivityAnnotationRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFieldOfActivityAnnotationRepository_DocumentationSpecification(), this.getDocumentationSpecification(), this.getDocumentationSpecification_Parent(), "documentationSpecification", null, 0, 1, FieldOfActivityAnnotationRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFieldOfActivityAnnotationRepository_StaffSpecification(), this.getStaffSpecification(), this.getStaffSpecification_Parent(), "staffSpecification", null, 0, 1, FieldOfActivityAnnotationRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(testSpecificationEClass, TestSpecification.class, "TestSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTestSpecification_Parent(), this.getFieldOfActivityAnnotationRepository(), this.getFieldOfActivityAnnotationRepository_TestSpecification(), "parent", null, 1, 1, TestSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTestSpecification_SystemTests(), this.getSystemTest(), this.getSystemTest_Parent(), "systemTests", null, 0, -1, TestSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTestSpecification_Role(), this.getRole(), null, "role", null, 0, 1, TestSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stockSpecificationEClass, StockSpecification.class, "StockSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStockSpecification_Parent(), this.getFieldOfActivityAnnotationRepository(), this.getFieldOfActivityAnnotationRepository_StockSpecification(), "parent", null, 1, 1, StockSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStockSpecification_ComponentStockList(), this.getComponentStockList(), this.getComponentStockList_Parent(), "componentStockList", null, 0, -1, StockSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStockSpecification_InterfaceStockList(), this.getInterfaceStockList(), this.getInterfaceStockList_Parent(), "interfaceStockList", null, 0, -1, StockSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStockSpecification_ModuleStockList(), this.getModuleStockList(), this.getModuleStockList_Parent(), "moduleStockList", null, 0, -1, StockSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStockSpecification_StructureStockList(), this.getStructureStockList(), this.getStructureStockList_Parent(), "structureStockList", null, 0, -1, StockSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStockSpecification_Role(), this.getRole(), null, "role", null, 0, 1, StockSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hmiSpecificationEClass, HMISpecification.class, "HMISpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHMISpecification_Parent(), this.getFieldOfActivityAnnotationRepository(), this.getFieldOfActivityAnnotationRepository_HmiSpecification(), "parent", null, 1, 1, HMISpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHMISpecification_Role(), this.getRole(), null, "role", null, 0, 1, HMISpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHMISpecification_HmiConfig(), this.getHMIConfiguration(), this.getHMIConfiguration_Parent(), "hmiConfig", null, 0, -1, HMISpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ecadSpecificationEClass, ECADSpecification.class, "ECADSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getECADSpecification_Parent(), this.getFieldOfActivityAnnotationRepository(), this.getFieldOfActivityAnnotationRepository_EcadSpecification(), "parent", null, 1, 1, ECADSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getECADSpecification_Drawings(), this.getDrawing(), this.getDrawing_Parent(), "drawings", null, 0, -1, ECADSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getECADSpecification_Role(), this.getRole(), null, "role", null, 0, 1, ECADSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentationSpecificationEClass, DocumentationSpecification.class, "DocumentationSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDocumentationSpecification_Parent(), this.getFieldOfActivityAnnotationRepository(), this.getFieldOfActivityAnnotationRepository_DocumentationSpecification(), "parent", null, 1, 1, DocumentationSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentationSpecification_ComponentDocumentation(), this.getComponentDocumentationFiles(), this.getComponentDocumentationFiles_Parent(), "componentDocumentation", null, 0, -1, DocumentationSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentationSpecification_ModuleDocumentation(), this.getModuleDocumentationFiles(), this.getModuleDocumentationFiles_Parent(), "moduleDocumentation", null, 0, -1, DocumentationSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentationSpecification_InterfaceDocumentation(), this.getInterfaceDocumentationFiles(), this.getInterfaceDocumentationFiles_Parent(), "interfaceDocumentation", null, 0, -1, DocumentationSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentationSpecification_StructureDocumentation(), this.getStructureDocumentationFiles(), this.getStructureDocumentationFiles_Parent(), "structureDocumentation", null, 0, -1, DocumentationSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentationSpecification_Role(), this.getRole(), null, "role", null, 0, 1, DocumentationSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(staffSpecificationEClass, StaffSpecification.class, "StaffSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStaffSpecification_Parent(), this.getFieldOfActivityAnnotationRepository(), this.getFieldOfActivityAnnotationRepository_StaffSpecification(), "parent", null, 1, 1, StaffSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStaffSpecification_PersonList(), this.getPersonList(), this.getPersonList_Parent(), "personList", null, 1, 1, StaffSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStaffSpecification_RoleList(), this.getRoleList(), this.getRoleList_Parent(), "roleList", null, 1, 1, StaffSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(calibrationSpecificationEClass, CalibrationSpecification.class, "CalibrationSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCalibrationSpecification_Parent(), this.getFieldOfActivityAnnotationRepository(), this.getFieldOfActivityAnnotationRepository_CalibrationSpecification(), "parent", null, 1, 1, CalibrationSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCalibrationSpecification_Role(), this.getRole(), null, "role", null, 0, 1, CalibrationSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCalibrationSpecification_CalibrationConfig(), this.getCalibrationConfiguration(), this.getCalibrationConfiguration_Parent(), "calibrationConfig", null, 0, -1, CalibrationSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(calibrationConfigurationEClass, CalibrationConfiguration.class, "CalibrationConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCalibrationConfiguration_Name(), ecorePackage.getEString(), "name", null, 0, 1, CalibrationConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCalibrationConfiguration_Parent(), this.getCalibrationSpecification(), this.getCalibrationSpecification_CalibrationConfig(), "parent", null, 1, 1, CalibrationConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCalibrationConfiguration_Components(), theComponentRepositoryPackage.getComponent(), null, "components", null, 0, -1, CalibrationConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCalibrationConfiguration_Modules(), theModuleRepositoryPackage.getModule(), null, "modules", null, 0, -1, CalibrationConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCalibrationConfiguration_Interfaces(), theInterfaceRepositoryPackage.getInterface(), null, "interfaces", null, 0, -1, CalibrationConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCalibrationConfiguration_Structures(), theStructureRepositoryPackage.getStructure(), null, "structures", null, 0, -1, CalibrationConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hmiConfigurationEClass, HMIConfiguration.class, "HMIConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHMIConfiguration_Name(), ecorePackage.getEString(), "name", null, 0, 1, HMIConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHMIConfiguration_Components(), theComponentRepositoryPackage.getComponent(), null, "components", null, 0, -1, HMIConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHMIConfiguration_Modules(), theModuleRepositoryPackage.getModule(), null, "modules", null, 0, -1, HMIConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHMIConfiguration_Interfaces(), theInterfaceRepositoryPackage.getInterface(), null, "interfaces", null, 0, -1, HMIConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHMIConfiguration_Structures(), theStructureRepositoryPackage.getStructure(), null, "structures", null, 0, -1, HMIConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHMIConfiguration_Parent(), this.getHMISpecification(), this.getHMISpecification_HmiConfig(), "parent", null, 1, 1, HMIConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(personListEClass, PersonList.class, "PersonList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPersonList_Parent(), this.getStaffSpecification(), this.getStaffSpecification_PersonList(), "parent", null, 1, 1, PersonList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPersonList_Persons(), this.getPerson(), this.getPerson_Parent(), "persons", null, 0, -1, PersonList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(personEClass, Person.class, "Person", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPerson_Parent(), this.getPersonList(), this.getPersonList_Persons(), "parent", null, 1, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPerson_Roles(), this.getRole(), this.getRole_Person(), "roles", null, 0, -1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerson_Name(), ecorePackage.getEString(), "name", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(roleEClass, Role.class, "Role", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRole_Parent(), this.getRoleList(), this.getRoleList_Roles(), "parent", null, 1, 1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRole_Person(), this.getPerson(), this.getPerson_Roles(), "person", null, 0, -1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRole_Description(), ecorePackage.getEString(), "description", null, 0, 1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(roleListEClass, RoleList.class, "RoleList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRoleList_Parent(), this.getStaffSpecification(), this.getStaffSpecification_RoleList(), "parent", null, 1, 1, RoleList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoleList_Roles(), this.getRole(), this.getRole_Parent(), "roles", null, 0, -1, RoleList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fileEClass, File.class, "File", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFile_Filename(), ecorePackage.getEString(), "filename", null, 0, 1, File.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(testCaseEClass, TestCase.class, "TestCase", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTestCase_TestName(), ecorePackage.getEString(), "testName", null, 0, 1, TestCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(systemTestEClass, SystemTest.class, "SystemTest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSystemTest_Parent(), this.getTestSpecification(), this.getTestSpecification_SystemTests(), "parent", null, 1, 1, SystemTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystemTest_SystemUnderTest(), theapsPackage.getPlant(), null, "systemUnderTest", null, 0, 1, SystemTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(engineerEClass, Engineer.class, "Engineer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(purchaserEClass, Purchaser.class, "Purchaser", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mechanicEClass, Mechanic.class, "Mechanic", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(documentationEClass, Documentation.class, "Documentation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(drawingEClass, Drawing.class, "Drawing", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDrawing_Parent(), this.getECADSpecification(), this.getECADSpecification_Drawings(), "parent", null, 1, 1, Drawing.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(componentDrawingEClass, ComponentDrawing.class, "ComponentDrawing", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponentDrawing_Drawn_component(), theComponentRepositoryPackage.getComponent(), null, "drawn_component", null, 0, 1, ComponentDrawing.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(moduleDrawingEClass, ModuleDrawing.class, "ModuleDrawing", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModuleDrawing_Drawn_module(), theModuleRepositoryPackage.getModule(), null, "drawn_module", null, 0, 1, ModuleDrawing.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(interfaceDrawingEClass, InterfaceDrawing.class, "InterfaceDrawing", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInterfaceDrawing_Drawn_interface(), theInterfaceRepositoryPackage.getInterface(), null, "drawn_interface", null, 0, 1, InterfaceDrawing.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(structureDrawingEClass, StructureDrawing.class, "StructureDrawing", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStructureDrawing_Drawn_structure(), theStructureRepositoryPackage.getStructure(), null, "drawn_structure", null, 0, 1, StructureDrawing.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mainteneanceDocumentationEClass, MainteneanceDocumentation.class, "MainteneanceDocumentation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMainteneanceDocumentation_Parent(), this.getDocumentationFiles(), this.getDocumentationFiles_Mainteneance(), "parent", null, 1, 1, MainteneanceDocumentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operatorInstructionsEClass, OperatorInstructions.class, "OperatorInstructions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOperatorInstructions_Parent(), this.getDocumentationFiles(), this.getDocumentationFiles_Instructions(), "parent", null, 1, 1, OperatorInstructions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(trainingDocInternEClass, TrainingDocIntern.class, "TrainingDocIntern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTrainingDocIntern_Parent(), this.getDocumentationFiles(), this.getDocumentationFiles_TrainingIntern(), "parent", null, 1, 1, TrainingDocIntern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(trainingDocExternalEClass, TrainingDocExternal.class, "TrainingDocExternal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTrainingDocExternal_Parent(), this.getDocumentationFiles(), this.getDocumentationFiles_TrainingExternal(), "parent", null, 1, 1, TrainingDocExternal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentationFilesEClass, DocumentationFiles.class, "DocumentationFiles", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDocumentationFiles_Mainteneance(), this.getMainteneanceDocumentation(), this.getMainteneanceDocumentation_Parent(), "mainteneance", null, 0, -1, DocumentationFiles.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentationFiles_Instructions(), this.getOperatorInstructions(), this.getOperatorInstructions_Parent(), "instructions", null, 0, -1, DocumentationFiles.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentationFiles_TrainingIntern(), this.getTrainingDocIntern(), this.getTrainingDocIntern_Parent(), "trainingIntern", null, 0, -1, DocumentationFiles.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentationFiles_TrainingExternal(), this.getTrainingDocExternal(), this.getTrainingDocExternal_Parent(), "trainingExternal", null, 0, -1, DocumentationFiles.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(componentDocumentationFilesEClass, ComponentDocumentationFiles.class, "ComponentDocumentationFiles", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponentDocumentationFiles_Parent(), this.getDocumentationSpecification(), this.getDocumentationSpecification_ComponentDocumentation(), "parent", null, 1, 1, ComponentDocumentationFiles.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentDocumentationFiles_DocumentedComponent(), theComponentRepositoryPackage.getComponent(), null, "documentedComponent", null, 1, 1, ComponentDocumentationFiles.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(moduleDocumentationFilesEClass, ModuleDocumentationFiles.class, "ModuleDocumentationFiles", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModuleDocumentationFiles_Parent(), this.getDocumentationSpecification(), this.getDocumentationSpecification_ModuleDocumentation(), "parent", null, 1, 1, ModuleDocumentationFiles.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModuleDocumentationFiles_DocumentedModule(), theModuleRepositoryPackage.getModule(), null, "documentedModule", null, 1, 1, ModuleDocumentationFiles.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(interfaceDocumentationFilesEClass, InterfaceDocumentationFiles.class, "InterfaceDocumentationFiles", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInterfaceDocumentationFiles_Parent(), this.getDocumentationSpecification(), this.getDocumentationSpecification_InterfaceDocumentation(), "parent", null, 1, 1, InterfaceDocumentationFiles.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterfaceDocumentationFiles_DocumentedInterface(), theInterfaceRepositoryPackage.getInterface(), null, "documentedInterface", null, 1, 1, InterfaceDocumentationFiles.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(structureDocumentationFilesEClass, StructureDocumentationFiles.class, "StructureDocumentationFiles", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStructureDocumentationFiles_Parent(), this.getDocumentationSpecification(), this.getDocumentationSpecification_StructureDocumentation(), "parent", null, 1, 1, StructureDocumentationFiles.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStructureDocumentationFiles_DocumentedStructure(), theStructureRepositoryPackage.getStructure(), null, "documentedStructure", null, 1, 1, StructureDocumentationFiles.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stockListEClass, StockList.class, "StockList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(componentStockListEClass, ComponentStockList.class, "ComponentStockList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponentStockList_Parent(), this.getStockSpecification(), this.getStockSpecification_ComponentStockList(), "parent", null, 1, 1, ComponentStockList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentStockList_Components(), theComponentRepositoryPackage.getComponent(), null, "components", null, 0, -1, ComponentStockList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(interfaceStockListEClass, InterfaceStockList.class, "InterfaceStockList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInterfaceStockList_Parent(), this.getStockSpecification(), this.getStockSpecification_InterfaceStockList(), "parent", null, 1, 1, InterfaceStockList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterfaceStockList_Interfaces(), theInterfaceRepositoryPackage.getInterface(), null, "interfaces", null, 0, -1, InterfaceStockList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(moduleStockListEClass, ModuleStockList.class, "ModuleStockList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModuleStockList_Parent(), this.getStockSpecification(), this.getStockSpecification_ModuleStockList(), "parent", null, 1, 1, ModuleStockList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModuleStockList_Modules(), theModuleRepositoryPackage.getModule(), null, "modules", null, 0, -1, ModuleStockList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(structureStockListEClass, StructureStockList.class, "StructureStockList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStructureStockList_Parent(), this.getStockSpecification(), this.getStockSpecification_StructureStockList(), "parent", null, 1, 1, StructureStockList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStructureStockList_Structures(), theStructureRepositoryPackage.getStructure(), null, "structures", null, 0, -1, StructureStockList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //KAMP4aPSFieldofactivityannotationsPackageImpl
