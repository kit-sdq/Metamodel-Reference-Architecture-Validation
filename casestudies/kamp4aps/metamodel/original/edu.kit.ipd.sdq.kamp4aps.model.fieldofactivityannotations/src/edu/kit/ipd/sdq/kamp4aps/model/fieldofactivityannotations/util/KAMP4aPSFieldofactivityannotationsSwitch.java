/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.util;

import edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.KAMP4aPSFieldofactivityannotationsPackage
 * @generated
 */
public class KAMP4aPSFieldofactivityannotationsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static KAMP4aPSFieldofactivityannotationsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KAMP4aPSFieldofactivityannotationsSwitch() {
		if (modelPackage == null) {
			modelPackage = KAMP4aPSFieldofactivityannotationsPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case KAMP4aPSFieldofactivityannotationsPackage.FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY: {
				FieldOfActivityAnnotationRepository fieldOfActivityAnnotationRepository = (FieldOfActivityAnnotationRepository)theEObject;
				T result = caseFieldOfActivityAnnotationRepository(fieldOfActivityAnnotationRepository);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KAMP4aPSFieldofactivityannotationsPackage.TEST_SPECIFICATION: {
				TestSpecification testSpecification = (TestSpecification)theEObject;
				T result = caseTestSpecification(testSpecification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KAMP4aPSFieldofactivityannotationsPackage.STOCK_SPECIFICATION: {
				StockSpecification stockSpecification = (StockSpecification)theEObject;
				T result = caseStockSpecification(stockSpecification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KAMP4aPSFieldofactivityannotationsPackage.HMI_SPECIFICATION: {
				HMISpecification hmiSpecification = (HMISpecification)theEObject;
				T result = caseHMISpecification(hmiSpecification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KAMP4aPSFieldofactivityannotationsPackage.ECAD_SPECIFICATION: {
				ECADSpecification ecadSpecification = (ECADSpecification)theEObject;
				T result = caseECADSpecification(ecadSpecification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KAMP4aPSFieldofactivityannotationsPackage.DOCUMENTATION_SPECIFICATION: {
				DocumentationSpecification documentationSpecification = (DocumentationSpecification)theEObject;
				T result = caseDocumentationSpecification(documentationSpecification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KAMP4aPSFieldofactivityannotationsPackage.STAFF_SPECIFICATION: {
				StaffSpecification staffSpecification = (StaffSpecification)theEObject;
				T result = caseStaffSpecification(staffSpecification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KAMP4aPSFieldofactivityannotationsPackage.CALIBRATION_SPECIFICATION: {
				CalibrationSpecification calibrationSpecification = (CalibrationSpecification)theEObject;
				T result = caseCalibrationSpecification(calibrationSpecification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KAMP4aPSFieldofactivityannotationsPackage.CALIBRATION_CONFIGURATION: {
				CalibrationConfiguration calibrationConfiguration = (CalibrationConfiguration)theEObject;
				T result = caseCalibrationConfiguration(calibrationConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KAMP4aPSFieldofactivityannotationsPackage.HMI_CONFIGURATION: {
				HMIConfiguration hmiConfiguration = (HMIConfiguration)theEObject;
				T result = caseHMIConfiguration(hmiConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KAMP4aPSFieldofactivityannotationsPackage.PERSON_LIST: {
				PersonList personList = (PersonList)theEObject;
				T result = casePersonList(personList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KAMP4aPSFieldofactivityannotationsPackage.PERSON: {
				Person person = (Person)theEObject;
				T result = casePerson(person);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KAMP4aPSFieldofactivityannotationsPackage.ROLE: {
				Role role = (Role)theEObject;
				T result = caseRole(role);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KAMP4aPSFieldofactivityannotationsPackage.ROLE_LIST: {
				RoleList roleList = (RoleList)theEObject;
				T result = caseRoleList(roleList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KAMP4aPSFieldofactivityannotationsPackage.FILE: {
				File file = (File)theEObject;
				T result = caseFile(file);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KAMP4aPSFieldofactivityannotationsPackage.TEST_CASE: {
				TestCase testCase = (TestCase)theEObject;
				T result = caseTestCase(testCase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KAMP4aPSFieldofactivityannotationsPackage.SYSTEM_TEST: {
				SystemTest systemTest = (SystemTest)theEObject;
				T result = caseSystemTest(systemTest);
				if (result == null) result = caseTestCase(systemTest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KAMP4aPSFieldofactivityannotationsPackage.ENGINEER: {
				Engineer engineer = (Engineer)theEObject;
				T result = caseEngineer(engineer);
				if (result == null) result = caseRole(engineer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KAMP4aPSFieldofactivityannotationsPackage.PURCHASER: {
				Purchaser purchaser = (Purchaser)theEObject;
				T result = casePurchaser(purchaser);
				if (result == null) result = caseRole(purchaser);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KAMP4aPSFieldofactivityannotationsPackage.MECHANIC: {
				Mechanic mechanic = (Mechanic)theEObject;
				T result = caseMechanic(mechanic);
				if (result == null) result = caseRole(mechanic);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KAMP4aPSFieldofactivityannotationsPackage.DOCUMENTATION: {
				Documentation documentation = (Documentation)theEObject;
				T result = caseDocumentation(documentation);
				if (result == null) result = caseFile(documentation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KAMP4aPSFieldofactivityannotationsPackage.DRAWING: {
				Drawing drawing = (Drawing)theEObject;
				T result = caseDrawing(drawing);
				if (result == null) result = caseFile(drawing);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KAMP4aPSFieldofactivityannotationsPackage.COMPONENT_DRAWING: {
				ComponentDrawing componentDrawing = (ComponentDrawing)theEObject;
				T result = caseComponentDrawing(componentDrawing);
				if (result == null) result = caseDrawing(componentDrawing);
				if (result == null) result = caseFile(componentDrawing);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KAMP4aPSFieldofactivityannotationsPackage.MODULE_DRAWING: {
				ModuleDrawing moduleDrawing = (ModuleDrawing)theEObject;
				T result = caseModuleDrawing(moduleDrawing);
				if (result == null) result = caseDrawing(moduleDrawing);
				if (result == null) result = caseFile(moduleDrawing);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KAMP4aPSFieldofactivityannotationsPackage.INTERFACE_DRAWING: {
				InterfaceDrawing interfaceDrawing = (InterfaceDrawing)theEObject;
				T result = caseInterfaceDrawing(interfaceDrawing);
				if (result == null) result = caseDrawing(interfaceDrawing);
				if (result == null) result = caseFile(interfaceDrawing);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KAMP4aPSFieldofactivityannotationsPackage.STRUCTURE_DRAWING: {
				StructureDrawing structureDrawing = (StructureDrawing)theEObject;
				T result = caseStructureDrawing(structureDrawing);
				if (result == null) result = caseDrawing(structureDrawing);
				if (result == null) result = caseFile(structureDrawing);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KAMP4aPSFieldofactivityannotationsPackage.MAINTENEANCE_DOCUMENTATION: {
				MainteneanceDocumentation mainteneanceDocumentation = (MainteneanceDocumentation)theEObject;
				T result = caseMainteneanceDocumentation(mainteneanceDocumentation);
				if (result == null) result = caseDocumentation(mainteneanceDocumentation);
				if (result == null) result = caseFile(mainteneanceDocumentation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KAMP4aPSFieldofactivityannotationsPackage.OPERATOR_INSTRUCTIONS: {
				OperatorInstructions operatorInstructions = (OperatorInstructions)theEObject;
				T result = caseOperatorInstructions(operatorInstructions);
				if (result == null) result = caseDocumentation(operatorInstructions);
				if (result == null) result = caseFile(operatorInstructions);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KAMP4aPSFieldofactivityannotationsPackage.TRAINING_DOC_INTERN: {
				TrainingDocIntern trainingDocIntern = (TrainingDocIntern)theEObject;
				T result = caseTrainingDocIntern(trainingDocIntern);
				if (result == null) result = caseDocumentation(trainingDocIntern);
				if (result == null) result = caseFile(trainingDocIntern);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KAMP4aPSFieldofactivityannotationsPackage.TRAINING_DOC_EXTERNAL: {
				TrainingDocExternal trainingDocExternal = (TrainingDocExternal)theEObject;
				T result = caseTrainingDocExternal(trainingDocExternal);
				if (result == null) result = caseDocumentation(trainingDocExternal);
				if (result == null) result = caseFile(trainingDocExternal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KAMP4aPSFieldofactivityannotationsPackage.DOCUMENTATION_FILES: {
				DocumentationFiles documentationFiles = (DocumentationFiles)theEObject;
				T result = caseDocumentationFiles(documentationFiles);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KAMP4aPSFieldofactivityannotationsPackage.COMPONENT_DOCUMENTATION_FILES: {
				ComponentDocumentationFiles componentDocumentationFiles = (ComponentDocumentationFiles)theEObject;
				T result = caseComponentDocumentationFiles(componentDocumentationFiles);
				if (result == null) result = caseDocumentationFiles(componentDocumentationFiles);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KAMP4aPSFieldofactivityannotationsPackage.MODULE_DOCUMENTATION_FILES: {
				ModuleDocumentationFiles moduleDocumentationFiles = (ModuleDocumentationFiles)theEObject;
				T result = caseModuleDocumentationFiles(moduleDocumentationFiles);
				if (result == null) result = caseDocumentationFiles(moduleDocumentationFiles);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KAMP4aPSFieldofactivityannotationsPackage.INTERFACE_DOCUMENTATION_FILES: {
				InterfaceDocumentationFiles interfaceDocumentationFiles = (InterfaceDocumentationFiles)theEObject;
				T result = caseInterfaceDocumentationFiles(interfaceDocumentationFiles);
				if (result == null) result = caseDocumentationFiles(interfaceDocumentationFiles);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KAMP4aPSFieldofactivityannotationsPackage.STRUCTURE_DOCUMENTATION_FILES: {
				StructureDocumentationFiles structureDocumentationFiles = (StructureDocumentationFiles)theEObject;
				T result = caseStructureDocumentationFiles(structureDocumentationFiles);
				if (result == null) result = caseDocumentationFiles(structureDocumentationFiles);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KAMP4aPSFieldofactivityannotationsPackage.STOCK_LIST: {
				StockList stockList = (StockList)theEObject;
				T result = caseStockList(stockList);
				if (result == null) result = caseFile(stockList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KAMP4aPSFieldofactivityannotationsPackage.COMPONENT_STOCK_LIST: {
				ComponentStockList componentStockList = (ComponentStockList)theEObject;
				T result = caseComponentStockList(componentStockList);
				if (result == null) result = caseStockList(componentStockList);
				if (result == null) result = caseFile(componentStockList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KAMP4aPSFieldofactivityannotationsPackage.INTERFACE_STOCK_LIST: {
				InterfaceStockList interfaceStockList = (InterfaceStockList)theEObject;
				T result = caseInterfaceStockList(interfaceStockList);
				if (result == null) result = caseStockList(interfaceStockList);
				if (result == null) result = caseFile(interfaceStockList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KAMP4aPSFieldofactivityannotationsPackage.MODULE_STOCK_LIST: {
				ModuleStockList moduleStockList = (ModuleStockList)theEObject;
				T result = caseModuleStockList(moduleStockList);
				if (result == null) result = caseStockList(moduleStockList);
				if (result == null) result = caseFile(moduleStockList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KAMP4aPSFieldofactivityannotationsPackage.STRUCTURE_STOCK_LIST: {
				StructureStockList structureStockList = (StructureStockList)theEObject;
				T result = caseStructureStockList(structureStockList);
				if (result == null) result = caseStockList(structureStockList);
				if (result == null) result = caseFile(structureStockList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Field Of Activity Annotation Repository</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Field Of Activity Annotation Repository</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFieldOfActivityAnnotationRepository(FieldOfActivityAnnotationRepository object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestSpecification(TestSpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stock Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stock Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStockSpecification(StockSpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HMI Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HMI Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHMISpecification(HMISpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ECAD Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ECAD Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseECADSpecification(ECADSpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Documentation Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Documentation Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentationSpecification(DocumentationSpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Staff Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Staff Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStaffSpecification(StaffSpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Calibration Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Calibration Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCalibrationSpecification(CalibrationSpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Calibration Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Calibration Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCalibrationConfiguration(CalibrationConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HMI Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HMI Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHMIConfiguration(HMIConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Person List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Person List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePersonList(PersonList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Person</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Person</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePerson(Person object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRole(Role object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoleList(RoleList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>File</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>File</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFile(File object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test Case</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test Case</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestCase(TestCase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System Test</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System Test</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystemTest(SystemTest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Engineer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Engineer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEngineer(Engineer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Purchaser</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Purchaser</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePurchaser(Purchaser object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mechanic</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mechanic</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMechanic(Mechanic object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Documentation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Documentation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentation(Documentation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Drawing</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Drawing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDrawing(Drawing object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Drawing</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Drawing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentDrawing(ComponentDrawing object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Module Drawing</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Module Drawing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModuleDrawing(ModuleDrawing object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface Drawing</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface Drawing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterfaceDrawing(InterfaceDrawing object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structure Drawing</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structure Drawing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructureDrawing(StructureDrawing object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mainteneance Documentation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mainteneance Documentation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMainteneanceDocumentation(MainteneanceDocumentation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operator Instructions</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operator Instructions</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperatorInstructions(OperatorInstructions object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Training Doc Intern</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Training Doc Intern</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrainingDocIntern(TrainingDocIntern object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Training Doc External</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Training Doc External</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrainingDocExternal(TrainingDocExternal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Documentation Files</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Documentation Files</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentationFiles(DocumentationFiles object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Documentation Files</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Documentation Files</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentDocumentationFiles(ComponentDocumentationFiles object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Module Documentation Files</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Module Documentation Files</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModuleDocumentationFiles(ModuleDocumentationFiles object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface Documentation Files</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface Documentation Files</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterfaceDocumentationFiles(InterfaceDocumentationFiles object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structure Documentation Files</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structure Documentation Files</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructureDocumentationFiles(StructureDocumentationFiles object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stock List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stock List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStockList(StockList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Stock List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Stock List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentStockList(ComponentStockList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface Stock List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface Stock List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterfaceStockList(InterfaceStockList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Module Stock List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Module Stock List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModuleStockList(ModuleStockList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structure Stock List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structure Stock List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructureStockList(StructureStockList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //KAMP4aPSFieldofactivityannotationsSwitch
