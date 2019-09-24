package edu.kit.ipd.sdq.kamp4aps.core.derivation;

import edu.kit.ipd.sdq.kamp4aps.core.APSArchitectureVersion;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;

import edu.kit.ipd.sdq.kamp.workplan.AbstractEnrichedWorkplanDerivation;
import edu.kit.ipd.sdq.kamp.workplan.Activity;
import edu.kit.ipd.sdq.kamp.workplan.BasicActivity;
import edu.kit.ipd.sdq.kamp4aps.core.APSActivityElementType;
import edu.kit.ipd.sdq.kamp4aps.core.APSActivityType;
import edu.kit.ipd.sdq.kamp4aps.core.APSArchitectureAnnotationLookup;
import edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.ComponentDrawing;
import edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.ComponentStockList;
import edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.DocumentationFiles;
import edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.InterfaceDrawing;
import edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.InterfaceStockList;
import edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.ModuleDrawing;
import edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.ModuleStockList;
import edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.Role;
import edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.StructureDrawing;
import edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.StructureStockList;
import edu.kit.ipd.sdq.kamp4iec.model.IECModel.Program;
import edu.kit.ipd.sdq.kamp4iec.model.IECModel.GlobalVariable;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.Plant;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Component;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.Interface;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.Module;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.StructureRepository.Structure;

/**
 * 
 * This class uses the look up methods of \texttt{ArchitectureAnnotationLookup}
 * to add the activities based on the non-structural changes to the workplan.
 * 
 * @author Sandro Koch
 * @see APSArchitectureAnnotationLookup
 */

public class APSEnrichedWorkplanDerivation implements AbstractEnrichedWorkplanDerivation<APSArchitectureVersion> {
	@Override
	public List<Activity> deriveEnrichedWorkplan(APSArchitectureVersion baseArchitectureVersion,
			APSArchitectureVersion subVersion, List<Activity> baseActivityList) {
		List<Activity> result = new ArrayList<Activity>(baseActivityList);

		deriveCADDrawingActivities(baseArchitectureVersion, subVersion, result);
		deriveDocumentationActivities(baseArchitectureVersion, subVersion, result);
		derivePurchaseActivities(baseArchitectureVersion, subVersion, result);
		deriveHMIActivities(baseArchitectureVersion, subVersion, result);
		deriveCalibrationActivities(baseArchitectureVersion, subVersion, result);
		deriveTestExecutionActivities(baseArchitectureVersion, subVersion, result);
		
		deriveSoftwareChangeActivities(baseArchitectureVersion, subVersion, result);
		return result;
	}

	private void deriveSoftwareChangeActivities(APSArchitectureVersion baseVersion, APSArchitectureVersion targetVersion, 
			List<Activity> baseActivityList) {
		Map<Component, Program> softwareSeedChanges = new HashMap<Component, Program>();
		Map<Interface, GlobalVariable> variableChanges = new HashMap<Interface, GlobalVariable>();
		for(Activity activity : baseActivityList){
			APSArchitectureVersion version = determineRelevantArchitectureVersion(activity, baseVersion, targetVersion);
			softwareSeedChanges.putAll(APSArchitectureAnnotationLookup.lookUpToChangeSoftware(
					version, activity));
			variableChanges.putAll(APSArchitectureAnnotationLookup.lookUpInterfacesOfSoftwareChanges(
					version, activity));
			addSoftwareChanges(softwareSeedChanges, variableChanges, activity);
		}
	}

	private void addSoftwareChanges(Map<Component, Program> softwareChangeAffectedParts, 
									Map<Interface, GlobalVariable> variableChanges, Activity activity) {
		for(Component component : softwareChangeAffectedParts.keySet()){
			if(component == activity.getElement()){
				activity.addFollowupActivity(new Activity(APSActivityType.UPDATE_SOFTWARE, APSActivityElementType.PROGRAM_TYPE,
						activity.getElement(), component.getId() , null, activity.getBasicActivity(), "Firmware of Element " + component.getName() +" in ProgramType "+ softwareChangeAffectedParts.get(component).getName()));
				
				for(Interface interfaceElement : variableChanges.keySet()){
						if(component.getConnectedInterfaces().contains(interfaceElement) || component.getConnectedInterfaces().contains(interfaceElement)){
							activity.addFollowupActivity(new Activity(APSActivityType.UPDATE_SOFTWARE, APSActivityElementType.PROGRAM_TYPE,
									activity.getElement(), "Variable: " + variableChanges.get(interfaceElement).getType() + " " + variableChanges.get(interfaceElement).getName(), 
									null, activity.getBasicActivity(), "Firmware of Element " + interfaceElement.getName() +": Variable "+ variableChanges.get(interfaceElement).getType()
									+ " " + variableChanges.get(interfaceElement).getName()));			
						}
					}
			}
		}
	}

	private void deriveCalibrationActivities(APSArchitectureVersion baseVersion, APSArchitectureVersion targetVersion,
			List<Activity> baseActivityList) {
		Map<APSActivityElementType, List<? extends EObject>> calibrationAffectingParts = new HashMap<APSActivityElementType, List<? extends EObject>>();
		Activity lastActivity = null;
		for(Activity activity : baseActivityList){
			lastActivity = activity;
			APSArchitectureAnnotationLookup.lookUpNumberOfCalibrationChanges(
					determineRelevantArchitectureVersion(activity, baseVersion, targetVersion), activity,
					calibrationAffectingParts);
		}
		if(lastActivity != null)
			addCalibrationChanges(calibrationAffectingParts, lastActivity);
	}

	private void addCalibrationChanges(Map<APSActivityElementType, List<? extends EObject>> calibrationAffectingParts,
			Activity activity) {
		if (!calibrationAffectingParts.isEmpty())
			activity.addFollowupActivity(new Activity(APSActivityType.UPDATE_CALIBRATION, APSActivityElementType.CALIBRATION_CONFIG,
					activity.getElement(), "Calibration", null, activity.getBasicActivity(), "Calibrate Plant(s)"));
	}

	private void deriveHMIActivities(APSArchitectureVersion baseVersion, APSArchitectureVersion targetVersion,
			List<Activity> baseActivityList) {
		Map<APSActivityElementType, List<? extends EObject>> hmiAffectingParts = new HashMap<APSActivityElementType, List<? extends EObject>>();
		for (Activity activity : baseActivityList) {
			APSArchitectureAnnotationLookup.lookUpNumberOfHmiChanges(
					determineRelevantArchitectureVersion(activity, baseVersion, targetVersion), activity,
					hmiAffectingParts);
			addHmiChanges(hmiAffectingParts, activity);
		}
	}

	private void addHmiChanges(Map<APSActivityElementType, List<? extends EObject>> hmiAffectingParts, Activity activity) {
		if (!hmiAffectingParts.isEmpty())
			activity.addFollowupActivity(new Activity(APSActivityType.UPDATE_HMI, APSActivityElementType.HMI_CONFIG,
					activity.getElement(), "HMI", null, activity.getBasicActivity(), "Update HMI"));
	}

	private void deriveCADDrawingActivities(APSArchitectureVersion baseVersion, APSArchitectureVersion targetVersion,
			List<Activity> baseActivityList) {
		for (Activity activity : baseActivityList) {
			APSArchitectureVersion version = determineRelevantArchitectureVersion(activity, baseVersion, targetVersion);
			Map<APSActivityElementType, Integer> numberOfFiles = determineNumberOfCADFiles(version, activity);
			deriveComponentDrawing(version, activity, numberOfFiles);
			deriveModuleDrawing(version, activity, numberOfFiles);
			deriveInterfaceDrawing(version, activity, numberOfFiles);
			deriveStructureDrawing(version, activity, numberOfFiles);
		}
	}

	private Map<APSActivityElementType, Integer> determineNumberOfCADFiles(APSArchitectureVersion version,
			Activity activity) {
		Map<APSActivityElementType, Integer> numberOfDrawings = new HashMap<APSActivityElementType, Integer>();
		numberOfDrawings.put(APSActivityElementType.COMPONENT, 0);
		numberOfDrawings.put(APSActivityElementType.MODULE, 0);
		numberOfDrawings.put(APSActivityElementType.INTERFACE, 0);
		numberOfDrawings.put(APSActivityElementType.STRUCTURE, 0);

		if (activity.getElement() instanceof Component) {
			Component component = (Component) activity.getElement();
			List<ComponentDrawing> drawings = APSArchitectureAnnotationLookup.lookUpDrawingsForComponent(version,
					component);
			numberOfDrawings.put(APSActivityElementType.COMPONENT,
					numberOfDrawings.get(APSActivityElementType.COMPONENT) + drawings.size());
		} else if (activity.getElement() instanceof Module) {
			Module module = (Module) activity.getElement();
			List<ModuleDrawing> drawings = APSArchitectureAnnotationLookup.lookUpDrawingsForModules(version, module);
			numberOfDrawings.put(APSActivityElementType.MODULE,
					numberOfDrawings.get(APSActivityElementType.MODULE) + drawings.size());
		} else if (activity.getElement() instanceof Interface) {
			Interface interfacemodule = (Interface) activity.getElement();
			List<InterfaceDrawing> drawings = APSArchitectureAnnotationLookup.lookUpDrawingsForInterfaces(version,
					interfacemodule);
			numberOfDrawings.put(APSActivityElementType.INTERFACE,
					numberOfDrawings.get(APSActivityElementType.INTERFACE) + drawings.size());
		} else if (activity.getElement() instanceof Structure) {
			Structure structure = (Structure) activity.getElement();
			List<StructureDrawing> drawings = APSArchitectureAnnotationLookup.lookUpDrawingsForStructures(version,
					structure);
			numberOfDrawings.put(APSActivityElementType.STRUCTURE,
					numberOfDrawings.get(APSActivityElementType.STRUCTURE) + drawings.size());
		}
		return numberOfDrawings;
	}

	private void deriveComponentDrawing(APSArchitectureVersion version, Activity activity,
			Map<APSActivityElementType, Integer> numberOfFiles) {
		APSActivityElementType componentType = APSActivityElementType.COMPONENT;
		Role role = version.getFieldOfActivityRepository().getEcadSpecification().getRole();
		if (activity.getElementType() == componentType && numberOfFiles.get(componentType) > 0) {
			activity.addFollowupActivity(
					new Activity(APSActivityType.UPDATE_CAD, APSActivityElementType.DRAWING, activity.getElement(),
							"Component drawings of " + activity.getElementName(), null, activity.getBasicActivity(),
							"ECAD: " + activity.getBasicActivity().getName()
									+ " drawings (Component files) of component " + activity.getElementName() + ". "
									+ role.getDescription()));
		}
	}

	private void deriveModuleDrawing(APSArchitectureVersion version, Activity activity,
			Map<APSActivityElementType, Integer> numberOfFiles) {
		APSActivityElementType moduleType = APSActivityElementType.MODULE;
		Role role = version.getFieldOfActivityRepository().getEcadSpecification().getRole();
		if (activity.getElementType() == moduleType && numberOfFiles.get(moduleType) > 0) {
			activity.addFollowupActivity(
					new Activity(APSActivityType.UPDATE_CAD, APSActivityElementType.DRAWING, activity.getElement(),
							"Module drawings of " + activity.getElementName(), null, activity.getBasicActivity(),
							"ECAD: " + activity.getBasicActivity().getName() + " drawings (Module files) of module "
									+ activity.getElementName() + ". " + role.getDescription()));
		}
	}

	private void deriveInterfaceDrawing(APSArchitectureVersion version, Activity activity,
			Map<APSActivityElementType, Integer> numberOfFiles) {
		APSActivityElementType interfaceType = APSActivityElementType.INTERFACE;
		Role role = version.getFieldOfActivityRepository().getEcadSpecification().getRole();
		if (activity.getElementType() == interfaceType && numberOfFiles.get(interfaceType) > 0) {
			activity.addFollowupActivity(
					new Activity(APSActivityType.UPDATE_CAD, APSActivityElementType.DRAWING, activity.getElement(),
							"Interface drawings of " + activity.getElementName(), null, activity.getBasicActivity(),
							"ECAD: " + activity.getBasicActivity().getName()
									+ " drawings (Interface files) of interface " + activity.getElementName() + ". "
									+ role.getDescription()));
		}
	}

	private void deriveStructureDrawing(APSArchitectureVersion version, Activity activity,
			Map<APSActivityElementType, Integer> numberOfFiles) {
		APSActivityElementType structureType = APSActivityElementType.STRUCTURE;
		Role role = version.getFieldOfActivityRepository().getEcadSpecification().getRole();
		if (activity.getElementType() == structureType && numberOfFiles.get(structureType) > 0) {
			activity.addFollowupActivity(
					new Activity(APSActivityType.UPDATE_CAD, APSActivityElementType.DRAWING, activity.getElement(),
							"Structure drawings of " + activity.getElementName(), null, activity.getBasicActivity(),
							"ECAD: " + activity.getBasicActivity().getName()
									+ " drawings (Structure files) of interface " + activity.getElementName() + ". "
									+ role.getDescription()));
		}
	}

	private void deriveDocumentationActivities(APSArchitectureVersion baseVersion, APSArchitectureVersion targetVersion,
			List<Activity> baseActivityList) {
		for (Activity activity : baseActivityList) {
			Map<APSActivityElementType, Integer> numberOfFiles = determineNumberOfDocumentationFiles(
					determineRelevantArchitectureVersion(activity, baseVersion, targetVersion), activity);
			deriveDocumentationForOneActivity(activity, numberOfFiles);
		}
	}

	private Map<APSActivityElementType, Integer> determineNumberOfDocumentationFiles(APSArchitectureVersion version,
			Activity activity) {
		Map<APSActivityElementType, Integer> numberOfFiles = new HashMap<APSActivityElementType, Integer>();
		numberOfFiles.put(APSActivityElementType.MAINTENEANCE_DOCUMENTATION, 0);
		numberOfFiles.put(APSActivityElementType.OPERATOR_INSTRUCTIONS, 0);
		numberOfFiles.put(APSActivityElementType.TRAINING_DOCUMENTATION_INTERNAL, 0);
		numberOfFiles.put(APSActivityElementType.TRAINING_DOCUMENTATION_EXTERNAL, 0);

		EObject activityElement = activity.getElement();
		if (activityElement instanceof Component) {
			Component component = (Component) activityElement;
			List<? extends DocumentationFiles> compDocFiles = APSArchitectureAnnotationLookup
					.lookUpDocumentationForComponents(version, component);
			numberOfFiles = calcNumberOfDocumentationFiles(numberOfFiles, compDocFiles);
		} else if (activityElement instanceof Module) {
			Module module = (Module) activityElement;
			List<? extends DocumentationFiles> modDocFiles = APSArchitectureAnnotationLookup
					.lookUpDocumentationForModules(version, module);
			numberOfFiles = calcNumberOfDocumentationFiles(numberOfFiles, modDocFiles);
		} else if (activityElement instanceof Interface) {
			Interface interfaceElement = (Interface) activityElement;
			List<? extends DocumentationFiles> intDocFiles = APSArchitectureAnnotationLookup
					.lookUpDocumentationForInterfaces(version, interfaceElement);
			numberOfFiles = calcNumberOfDocumentationFiles(numberOfFiles, intDocFiles);
		} else if (activityElement instanceof Structure) {
			Structure structure = (Structure) activityElement;
			List<? extends DocumentationFiles> structDocFiles = APSArchitectureAnnotationLookup
					.lookUpDocumentationForStructures(version, structure);
			numberOfFiles = calcNumberOfDocumentationFiles(numberOfFiles, structDocFiles);
		}
		return numberOfFiles;
	}

	private Map<APSActivityElementType, Integer> calcNumberOfDocumentationFiles(
			Map<APSActivityElementType, Integer> numberOfFiles, List<? extends DocumentationFiles> docFiles) {
		if (!docFiles.isEmpty()) {
			for (DocumentationFiles doc : docFiles) {
				numberOfFiles.put(APSActivityElementType.MAINTENEANCE_DOCUMENTATION,
						numberOfFiles.get(APSActivityElementType.MAINTENEANCE_DOCUMENTATION)
								+ doc.getMainteneance().size());
				numberOfFiles.put(APSActivityElementType.OPERATOR_INSTRUCTIONS,
						numberOfFiles.get(APSActivityElementType.OPERATOR_INSTRUCTIONS) + doc.getInstructions().size());
				numberOfFiles.put(APSActivityElementType.TRAINING_DOCUMENTATION_INTERNAL,
						numberOfFiles.get(APSActivityElementType.TRAINING_DOCUMENTATION_INTERNAL)
								+ doc.getTrainingIntern().size());
				numberOfFiles.put(APSActivityElementType.TRAINING_DOCUMENTATION_EXTERNAL,
						numberOfFiles.get(APSActivityElementType.TRAINING_DOCUMENTATION_EXTERNAL)
								+ doc.getTrainingExternal().size());
			}
		}
		return numberOfFiles;
	}

	private void deriveDocumentationForOneActivity(Activity activity, Map<APSActivityElementType, Integer> numberOfFiles) {
		switch ((APSActivityElementType) activity.getElementType()) {
		case COMPONENT:
			addDocumentation(activity, numberOfFiles, "component");
			break;
		case INTERFACE:
			addDocumentation(activity, numberOfFiles, "interface");
			break;
		case MODULE:
			addDocumentation(activity, numberOfFiles, "module");
			break;
		case STRUCTURE:
			addDocumentation(activity, numberOfFiles, "structure");
			break;
		default:
			break;

		}
	}

	private void addDocumentation(Activity activity, Map<APSActivityElementType, Integer> numberOfFiles, String type) {
		if (numberOfFiles.get(APSActivityElementType.MAINTENEANCE_DOCUMENTATION) > 0) {
			activity.addFollowupActivity(new Activity(APSActivityType.UPDATE_DOCUMENTATION,
					APSActivityElementType.MAINTENEANCE_DOCUMENTATION, activity.getElement(),
					numberOfFiles.get(APSActivityElementType.MAINTENEANCE_DOCUMENTATION) + " mainteneance documentation",
					null, activity.getBasicActivity(),
					"Documentation: " + activity.getBasicActivity().getName() + " mainteneance ("
							+ numberOfFiles.get(APSActivityElementType.MAINTENEANCE_DOCUMENTATION) + " files) of " + type
							+ " " + activity.getElementName() + "."));
		}
		if (numberOfFiles.get(APSActivityElementType.OPERATOR_INSTRUCTIONS) > 0) {
			activity.addFollowupActivity(new Activity(APSActivityType.UPDATE_DOCUMENTATION,
					APSActivityElementType.OPERATOR_INSTRUCTIONS, activity.getElement(),
					numberOfFiles.get(APSActivityElementType.OPERATOR_INSTRUCTIONS) + " operator instructions", null,
					activity.getBasicActivity(),
					"Documentation: " + activity.getBasicActivity().getName() + " instructions ("
							+ numberOfFiles.get(APSActivityElementType.OPERATOR_INSTRUCTIONS) + " files) of " + type + " "
							+ activity.getElementName() + "."));
		}
		if (numberOfFiles.get(APSActivityElementType.TRAINING_DOCUMENTATION_INTERNAL) > 0) {
			activity.addFollowupActivity(new Activity(APSActivityType.UPDATE_DOCUMENTATION,
					APSActivityElementType.TRAINING_DOCUMENTATION_INTERNAL, activity.getElement(),
					numberOfFiles.get(APSActivityElementType.TRAINING_DOCUMENTATION_INTERNAL)
							+ " training documentation (internal) ",
					null, activity.getBasicActivity(),
					"Documentation: " + activity.getBasicActivity().getName() + " training ("
							+ numberOfFiles.get(APSActivityElementType.TRAINING_DOCUMENTATION_INTERNAL) + " files) of "
							+ type + " " + activity.getElementName() + "."));
		}
		if (numberOfFiles.get(APSActivityElementType.TRAINING_DOCUMENTATION_EXTERNAL) > 0) {
			activity.addFollowupActivity(new Activity(APSActivityType.UPDATE_DOCUMENTATION,
					APSActivityElementType.TRAINING_DOCUMENTATION_EXTERNAL, activity.getElement(),
					numberOfFiles.get(APSActivityElementType.TRAINING_DOCUMENTATION_EXTERNAL)
							+ " training documentation (external) ",
					null, activity.getBasicActivity(),
					"Documentation: " + activity.getBasicActivity().getName() + " training ("
							+ numberOfFiles.get(APSActivityElementType.TRAINING_DOCUMENTATION_EXTERNAL) + " files) of  "
							+ type + " " + activity.getElementName() + "."));
		}
	}

	private void derivePurchaseActivities(APSArchitectureVersion baseVersion, APSArchitectureVersion targetVersion,
			List<Activity> baseActivityList) {
		Map<APSActivityElementType, Integer> numberOfFiles = new HashMap<APSActivityElementType, Integer>();
		numberOfFiles.put(APSActivityElementType.COMPONENT_STOCKLIST, 0);
		numberOfFiles.put(APSActivityElementType.INTERFACE_STOCKLIST, 0);
		numberOfFiles.put(APSActivityElementType.STRUCTURE_STOCKLIST, 0);
		numberOfFiles.put(APSActivityElementType.MODULE_STOCKLIST, 0);

		for (Activity activity : baseActivityList) {
			numberOfFiles = determineNumberOfStockLists(
					determineRelevantArchitectureVersion(activity, baseVersion, targetVersion), activity);
			if (numberOfFiles.get(APSActivityElementType.COMPONENT_STOCKLIST) > 0) {
				activity.addFollowupActivity(new Activity(APSActivityType.UPDATE_STOCKLIST,
						APSActivityElementType.COMPONENT_STOCKLIST, activity.getElement(),
						numberOfFiles.get(APSActivityElementType.COMPONENT_STOCKLIST) + " component stocklist ", null,
						activity.getBasicActivity(),
						"StockList: " + activity.getBasicActivity().getName() + " stocklist ("
								+ numberOfFiles.get(APSActivityElementType.COMPONENT_STOCKLIST) + " files) of component "
								+ activity.getElementName() + "."));
			}
			if (numberOfFiles.get(APSActivityElementType.MODULE_STOCKLIST) > 0) {
				activity.addFollowupActivity(new Activity(APSActivityType.UPDATE_STOCKLIST,
						APSActivityElementType.MODULE_STOCKLIST, activity.getElement(),
						numberOfFiles.get(APSActivityElementType.MODULE_STOCKLIST) + " module stocklist ", null,
						activity.getBasicActivity(),
						"StockList: " + activity.getBasicActivity().getName() + " stocklist ("
								+ numberOfFiles.get(APSActivityElementType.MODULE_STOCKLIST) + " files) of module "
								+ activity.getElementName() + "."));
			}
			if (numberOfFiles.get(APSActivityElementType.INTERFACE_STOCKLIST) > 0) {
				activity.addFollowupActivity(new Activity(APSActivityType.UPDATE_STOCKLIST,
						APSActivityElementType.INTERFACE_STOCKLIST, activity.getElement(),
						numberOfFiles.get(APSActivityElementType.INTERFACE_STOCKLIST) + " interface stocklist ", null,
						activity.getBasicActivity(),
						"StockList: " + activity.getBasicActivity().getName() + " stocklist ("
								+ numberOfFiles.get(APSActivityElementType.INTERFACE_STOCKLIST) + " files) of interface "
								+ activity.getElementName() + "."));
			}
			if (numberOfFiles.get(APSActivityElementType.STRUCTURE_STOCKLIST) > 0) {
				activity.addFollowupActivity(new Activity(APSActivityType.UPDATE_STOCKLIST,
						APSActivityElementType.STRUCTURE_STOCKLIST, activity.getElement(),
						numberOfFiles.get(APSActivityElementType.STRUCTURE_STOCKLIST) + " structure stocklist ", null,
						activity.getBasicActivity(),
						"StockList: " + activity.getBasicActivity().getName() + " stocklist ("
								+ numberOfFiles.get(APSActivityElementType.STRUCTURE_STOCKLIST) + " files) of structure "
								+ activity.getElementName() + "."));
			}
		}

	}

	private Map<APSActivityElementType, Integer> determineNumberOfStockLists(APSArchitectureVersion version,
			Activity activity) {
		Map<APSActivityElementType, Integer> numberOfFiles = new HashMap<APSActivityElementType, Integer>();
		numberOfFiles.put(APSActivityElementType.COMPONENT_STOCKLIST, 0);
		numberOfFiles.put(APSActivityElementType.INTERFACE_STOCKLIST, 0);
		numberOfFiles.put(APSActivityElementType.STRUCTURE_STOCKLIST, 0);
		numberOfFiles.put(APSActivityElementType.MODULE_STOCKLIST, 0);

		EObject activityElementType = activity.getElement();
		if (activityElementType instanceof Component) {
			List<ComponentStockList> componentStockList = APSArchitectureAnnotationLookup
					.lookUpStockListForComponent(version, (Component) activityElementType);
			numberOfFiles.put(APSActivityElementType.COMPONENT_STOCKLIST,
					numberOfFiles.get(APSActivityElementType.COMPONENT_STOCKLIST) + componentStockList.size());
		} else if (activityElementType instanceof Module) {
			List<ModuleStockList> moduleStockList = APSArchitectureAnnotationLookup.lookUpStockListForModule(version,
					(Module) activityElementType);
			numberOfFiles.put(APSActivityElementType.MODULE_STOCKLIST,
					numberOfFiles.get(APSActivityElementType.MODULE_STOCKLIST) + moduleStockList.size());
		} else if (activityElementType instanceof Structure) {
			List<StructureStockList> structureStockList = APSArchitectureAnnotationLookup
					.lookUpStockListForStructure(version, (Structure) activityElementType);
			numberOfFiles.put(APSActivityElementType.STRUCTURE_STOCKLIST,
					numberOfFiles.get(APSActivityElementType.STRUCTURE_STOCKLIST) + structureStockList.size());
		} else if (activityElementType instanceof Interface) {
			List<InterfaceStockList> interfaceStockList = APSArchitectureAnnotationLookup
					.lookUpStockListForInterface(version, (Interface) activityElementType);
			numberOfFiles.put(APSActivityElementType.INTERFACE_STOCKLIST,
					numberOfFiles.get(APSActivityElementType.INTERFACE_STOCKLIST) + interfaceStockList.size());
		}

		return numberOfFiles;
	}

	private void deriveTestExecutionActivities(APSArchitectureVersion baseVersion, APSArchitectureVersion targetVersion,
			List<Activity> baseActivityList) {
		List<Plant> plantsToTest = new ArrayList<Plant>();
		Activity lastActivity = null;
		for (Activity activity : baseActivityList) {
			APSArchitectureAnnotationLookup.lookUpNumberOfTests(
					determineRelevantArchitectureVersion(activity, baseVersion, targetVersion), activity, plantsToTest);
			lastActivity = activity;
		}
		addTestsForPlants(plantsToTest, lastActivity);
	}

	private void addTestsForPlants(List<Plant> plantsToTest, Activity lastActivity) {
		List<String> plantNames = new ArrayList<String>();
		for(Plant plant : plantsToTest){
			if(!plantNames.contains(plant.getName()))
				plantNames.add(plant.getName());
		}
		if (lastActivity != null) {
			for (String plantName : plantNames)
				lastActivity.addFollowupActivity(new Activity(APSActivityType.TEST_EXECUTION, APSActivityElementType.TESTCASE,
						lastActivity.getElement(), plantName + " test ", null, lastActivity.getBasicActivity(),
						"Test: " + lastActivity.getBasicActivity().getName() + " test (" + plantName
								+ " testcases)."));
		}
	}

	public static List<Activity> calculateFlattenendActivityList(List<Activity> activityList) {
		List<Activity> flatActivityList = new ArrayList<Activity>();

		for (Activity activity : activityList) {
			flatActivityList.add(activity);
			if (!activity.getSubActivities().isEmpty()) {
				flatActivityList.addAll(calculateFlattenendActivityList(activity.getSubActivities()));
			}
			if (!activity.getFollowupActivities().isEmpty()) {
				flatActivityList.addAll(calculateFlattenendActivityList(activity.getFollowupActivities()));
			}
		}

		return flatActivityList;
	}

	private static <T extends APSArchitectureVersion> T determineRelevantArchitectureVersion(Activity activity,
			T baseVersion, T targetVersion) {
		if (activity.getBasicActivity() == BasicActivity.REMOVE) {
			return baseVersion;
		} else {
			return targetVersion;
		}
	}
}
