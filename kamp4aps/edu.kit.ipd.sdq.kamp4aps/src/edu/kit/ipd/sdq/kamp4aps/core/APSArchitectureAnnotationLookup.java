package edu.kit.ipd.sdq.kamp4aps.core;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;

import edu.kit.ipd.sdq.kamp4aps.model.DeploymentContext.ComponentCorrelation;
import edu.kit.ipd.sdq.kamp4aps.model.DeploymentContext.VariableMapping;
import edu.kit.ipd.sdq.kamp.workplan.Activity;
import edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.CalibrationConfiguration;
import edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.ComponentDocumentationFiles;
import edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.ComponentDrawing;
import edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.ComponentStockList;
import edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.DocumentationFiles;
import edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.Drawing;
import edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.HMIConfiguration;
import edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.InterfaceDocumentationFiles;
import edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.InterfaceDrawing;
import edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.InterfaceStockList;
import edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.ModuleDocumentationFiles;
import edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.ModuleDrawing;
import edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.ModuleStockList;
import edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.StructureDocumentationFiles;
import edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.StructureDrawing;
import edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.StructureStockList;
import edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.SystemTest;
import edu.kit.ipd.sdq.kamp4iec.model.IECModel.Program;
import edu.kit.ipd.sdq.kamp4iec.model.IECModel.GlobalVariable;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.Plant;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Component;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.Interface;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.Module;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.StructureRepository.Structure;

/**
 * This class represents the implementation of the change rules
 * that where extracted of the scenarios described in the link below.
 * These rules are searching for the affected non-structural elements
 * which were defined in the \texttt{FieldOfActivityAnnotations} metamodel.
 * Each look up method is the manifestation of a single element of the mentioned
 * metamodel.
 * 
 * @author Sandro Koch
 * @see <a href="https://sdqweb.ipd.kit.edu/publications/pdfs/koch2017a.pdf">koch2017a<\a>
 */
public class APSArchitectureAnnotationLookup {

	public static List<?> lookUpSystemTestsForPlant(APSArchitectureVersion version, Plant plant) {
		List<SystemTest> systemTests = new ArrayList<SystemTest>();

		if (version.getFieldOfActivityRepository().getTestSpecification() != null) {
			for (SystemTest sysTest : version.getFieldOfActivityRepository().getTestSpecification().getSystemTests()) {
				if (sysTest.getSystemUnderTest() == plant) {
					systemTests.add(sysTest);
				}
			}
		}
		return systemTests;
	}

	public static List<ComponentDrawing> lookUpDrawingsForComponent(APSArchitectureVersion version, Component component) {
		List<ComponentDrawing> drawings = new ArrayList<ComponentDrawing>();

		if (version.getFieldOfActivityRepository().getEcadSpecification() != null) {
			for (Drawing drawing : version.getFieldOfActivityRepository().getEcadSpecification().getDrawings()) {
				if (drawing instanceof ComponentDrawing) {
					ComponentDrawing comDrawing = (ComponentDrawing) drawing;
					if (comDrawing.getDrawn_component() == component) {
						drawings.add(comDrawing);
					}
				}
			}
		}
		return drawings;
	}

	public static List<ModuleDrawing> lookUpDrawingsForModules(APSArchitectureVersion version, Module module) {
		List<ModuleDrawing> drawings = new ArrayList<ModuleDrawing>();

		if (version.getFieldOfActivityRepository().getEcadSpecification() != null) {
			for (Drawing drawing : version.getFieldOfActivityRepository().getEcadSpecification().getDrawings()) {
				if (drawing instanceof ModuleDrawing) {
					ModuleDrawing modDrawing = (ModuleDrawing) drawing;
					if (modDrawing.getDrawn_module() == module) {
						drawings.add(modDrawing);
					}
				}
			}
		}
		return drawings;
	}

	public static List<InterfaceDrawing> lookUpDrawingsForInterfaces(APSArchitectureVersion version,
			Interface interfacemodule) {
		List<InterfaceDrawing> drawings = new ArrayList<InterfaceDrawing>();

		if (version.getFieldOfActivityRepository().getEcadSpecification() != null) {
			for (Drawing drawing : version.getFieldOfActivityRepository().getEcadSpecification().getDrawings()) {
				if (drawing instanceof InterfaceDrawing) {
					InterfaceDrawing interfaceDrawing = (InterfaceDrawing) drawing;
					if (interfaceDrawing.getDrawn_interface() == interfacemodule) {
						drawings.add(interfaceDrawing);
					}
				}
			}
		}

		return drawings;
	}

	public static List<StructureDrawing> lookUpDrawingsForStructures(APSArchitectureVersion version, Structure structure) {
		List<StructureDrawing> drawings = new ArrayList<StructureDrawing>();

		if (version.getFieldOfActivityRepository().getEcadSpecification() != null) {
			for (Drawing drawing : version.getFieldOfActivityRepository().getEcadSpecification().getDrawings()) {
				if (drawing instanceof StructureDrawing) {
					StructureDrawing structureDrawing = (StructureDrawing) drawing;
					if (structureDrawing.getDrawn_structure() == structure) {
						drawings.add(structureDrawing);
					}
				}
			}
		}
		return drawings;
	}

	public static List<ComponentDocumentationFiles> lookUpDocumentationForComponents(APSArchitectureVersion version,
			Component component) {
		List<ComponentDocumentationFiles> doc = new ArrayList<ComponentDocumentationFiles>();
		if (version.getFieldOfActivityRepository().getDocumentationSpecification() != null) {
			for (ComponentDocumentationFiles cdf : version.getFieldOfActivityRepository()
					.getDocumentationSpecification().getComponentDocumentation()) {
				if (cdf.getDocumentedComponent() == component)
					doc.add(cdf);
			}
		}
		return doc;
	}

	public static List<ModuleDocumentationFiles> lookUpDocumentationForModules(APSArchitectureVersion version,
			Module module) {
		List<ModuleDocumentationFiles> doc = new ArrayList<ModuleDocumentationFiles>();
		if (version.getFieldOfActivityRepository().getDocumentationSpecification() != null) {
			for (ModuleDocumentationFiles mdf : version.getFieldOfActivityRepository().getDocumentationSpecification()
					.getModuleDocumentation()) {
				if (mdf.getDocumentedModule() == module)
					doc.add(mdf);
			}
		}
		return doc;
	}

	public static List<? extends DocumentationFiles> lookUpDocumentationForInterfaces(APSArchitectureVersion version,
			Interface interfaceElement) {
		List<InterfaceDocumentationFiles> doc = new ArrayList<InterfaceDocumentationFiles>();
		if (version.getFieldOfActivityRepository().getDocumentationSpecification() != null) {
			for (InterfaceDocumentationFiles idf : version.getFieldOfActivityRepository()
					.getDocumentationSpecification().getInterfaceDocumentation()) {
				if (idf.getDocumentedInterface() == interfaceElement)
					doc.add(idf);
			}
		}
		return doc;
	}

	public static List<? extends DocumentationFiles> lookUpDocumentationForStructures(APSArchitectureVersion version,
			Structure structure) {
		List<StructureDocumentationFiles> doc = new ArrayList<StructureDocumentationFiles>();
		if (version.getFieldOfActivityRepository().getDocumentationSpecification() != null) {
			for (StructureDocumentationFiles sdf : version.getFieldOfActivityRepository()
					.getDocumentationSpecification().getStructureDocumentation()) {
				if (sdf.getDocumentedStructure() == structure)
					doc.add(sdf);
			}
		}
		return doc;
	}

	public static List<ComponentStockList> lookUpStockListForComponent(APSArchitectureVersion version,
			Component component) {
		List<ComponentStockList> componentStockList = new ArrayList<ComponentStockList>();
		if (version.getFieldOfActivityRepository().getStockSpecification() != null) {
			for (ComponentStockList stock : version.getFieldOfActivityRepository().getStockSpecification()
					.getComponentStockList()) {
				if (stock.getComponents().contains(component))
					componentStockList.add(stock);
			}
		}
		return componentStockList;
	}

	public static List<ModuleStockList> lookUpStockListForModule(APSArchitectureVersion version, Module module) {
		List<ModuleStockList> moduleStockList = new ArrayList<ModuleStockList>();
		for (ModuleStockList stock : version.getFieldOfActivityRepository().getStockSpecification()
				.getModuleStockList()) {
			if (stock.getModules().contains(module))
				moduleStockList.add(stock);
		}
		return moduleStockList;
	}

	public static List<StructureStockList> lookUpStockListForStructure(APSArchitectureVersion version,
			Structure structure) {
		List<StructureStockList> structureStockList = new ArrayList<StructureStockList>();
		if (version.getFieldOfActivityRepository().getStockSpecification() != null) {
			for (StructureStockList stock : version.getFieldOfActivityRepository().getStockSpecification()
					.getStructureStockList()) {
				if (stock.getStructures().contains(structure))
					structureStockList.add(stock);
			}
		}
		return structureStockList;
	}

	public static List<InterfaceStockList> lookUpStockListForInterface(APSArchitectureVersion version,
			Interface interfaceElement) {
		List<InterfaceStockList> interfaceStockList = new ArrayList<InterfaceStockList>();
		if (version.getFieldOfActivityRepository().getStockSpecification() != null) {
			for (InterfaceStockList stock : version.getFieldOfActivityRepository().getStockSpecification()
					.getInterfaceStockList()) {
				if (stock.getInterfaces().contains(interfaceElement))
					interfaceStockList.add(stock);
			}
		}
		return interfaceStockList;
	}

	public static void lookUpNumberOfTests(APSArchitectureVersion version, Activity activity, List<Plant> plantsToTest) {
		if (version.getFieldOfActivityRepository().getTestSpecification() != null) {
			List<SystemTest> tests = version.getFieldOfActivityRepository().getTestSpecification().getSystemTests();
			for (SystemTest test : tests) {
				if (!plantsToTest.contains(test.getSystemUnderTest()))
					plantsToTest.add(test.getSystemUnderTest());
			}
		}
	}

	public static void lookUpNumberOfHmiChanges(APSArchitectureVersion version, Activity activity,
			Map<APSActivityElementType, List<? extends EObject>> hmiAffectingParts) {
		if (version.getFieldOfActivityRepository().getHmiSpecification() != null) {
			List<HMIConfiguration> hmiConfigs = version.getFieldOfActivityRepository().getHmiSpecification()
					.getHmiConfig();
			for (HMIConfiguration hmiConfig : hmiConfigs) {
				if (activity.getElement() instanceof Component) {
					if (!hmiConfig.getComponents().isEmpty()
							&& !hmiAffectingParts.containsValue(hmiConfig.getComponents())
							&& hmiConfig.getComponents().contains((Component) activity.getElement()))
						hmiAffectingParts.put(APSActivityElementType.COMPONENT, hmiConfig.getComponents());
				}
				if (activity.getElement() instanceof Interface) {
					if (!hmiConfig.getInterfaces().isEmpty()
							&& !hmiAffectingParts.containsValue(hmiConfig.getInterfaces())
							&& hmiConfig.getInterfaces().contains((Interface) activity.getElement()))
						hmiAffectingParts.put(APSActivityElementType.INTERFACE, hmiConfig.getInterfaces());
				}
				if (activity.getElement() instanceof Structure) {
					if (!hmiConfig.getStructures().isEmpty()
							&& !hmiAffectingParts.containsValue(hmiConfig.getStructures())
							&& hmiConfig.getStructures().contains((Structure) activity.getElement()))
						hmiAffectingParts.put(APSActivityElementType.STRUCTURE, hmiConfig.getStructures());
				}
				if (activity.getElement() instanceof Module) {
					if (!hmiConfig.getModules().isEmpty() 
							&& !hmiAffectingParts.containsValue(hmiConfig.getModules())
							&& hmiConfig.getModules().contains((Module) activity.getElement()))
						hmiAffectingParts.put(APSActivityElementType.MODULE, hmiConfig.getModules());
				}
			}
		}
	}

	public static void lookUpNumberOfCalibrationChanges(APSArchitectureVersion version,
			Activity activity, Map<APSActivityElementType, List<? extends EObject>> calibrationAffectingParts) {
		if (version.getFieldOfActivityRepository().getHmiSpecification() != null) {
			List<CalibrationConfiguration> calibrationConfigs = version.getFieldOfActivityRepository().getCalibrationSpecification()
					.getCalibrationConfig();
			for (CalibrationConfiguration calibrationConfig : calibrationConfigs) {
				if (activity.getElement() instanceof Component) {
					if (!calibrationConfig.getComponents().isEmpty()
							&& !calibrationAffectingParts.containsValue(calibrationConfig.getComponents())
							&& calibrationConfig.getComponents().contains((Component) activity.getElement()))
						calibrationAffectingParts.put(APSActivityElementType.COMPONENT, calibrationConfig.getComponents());
				}
				if (activity.getElement() instanceof Interface) {
					if (!calibrationConfig.getInterfaces().isEmpty()
							&& !calibrationAffectingParts.containsValue(calibrationConfig.getInterfaces())
							&& calibrationConfig.getInterfaces().contains((Interface) activity.getElement()))
						calibrationAffectingParts.put(APSActivityElementType.INTERFACE, calibrationConfig.getInterfaces());
				}
				if (activity.getElement() instanceof Structure) {
					if (!calibrationConfig.getStructures().isEmpty()
							&& !calibrationAffectingParts.containsValue(calibrationConfig.getStructures())
							&& calibrationConfig.getStructures().contains((Structure) activity.getElement()))
						calibrationAffectingParts.put(APSActivityElementType.STRUCTURE, calibrationConfig.getStructures());
				}
				if (activity.getElement() instanceof Module) {
					if (!calibrationConfig.getModules().isEmpty() 
							&& !calibrationAffectingParts.containsValue(calibrationConfig.getModules())
							&& calibrationConfig.getModules().contains((Module) activity.getElement()))
						calibrationAffectingParts.put(APSActivityElementType.MODULE, calibrationConfig.getModules());
				}
			}
		}
	}

	public static Map<Component, Program> lookUpToChangeSoftware(APSArchitectureVersion version,
			Activity activity) {
		Map<Component, Program> softwareChangeAffectedParts = new HashMap<Component, Program>();
		if(activity.getElement() instanceof Component){
			Component component = (Component)activity.getElement();
			for(ComponentCorrelation cc : version.getDeploymentContextRepository().getComponentCorrelation()){
				if(cc.getComponent() == component)
					softwareChangeAffectedParts.put(component, cc.getProgram());
			}
		} else if (activity.getElement() instanceof Interface){
			Interface interfaze = (Interface)activity.getElement();
			for(ComponentCorrelation cc : version.getDeploymentContextRepository().getComponentCorrelation()){
				if(cc.getComponent().getConnectedInterfaces().contains(interfaze)){
					softwareChangeAffectedParts.put(cc.getComponent(), cc.getProgram());
				}
			}
		}
		return softwareChangeAffectedParts;
	}

	public static Map<Interface, GlobalVariable> lookUpInterfacesOfSoftwareChanges(APSArchitectureVersion version,
			Activity activity) {
		Map<Interface, GlobalVariable> variableChanges = new HashMap<Interface, GlobalVariable>();
		if(activity.getElement() instanceof Component){
			Component component = (Component)activity.getElement();
			for(ComponentCorrelation cc : version.getDeploymentContextRepository().getComponentCorrelation()){
				if(cc.getComponent() == component){
					List<VariableMapping> mappings = cc.getVariableMapping();
					for(VariableMapping mapping : mappings){
						variableChanges.put(mapping.getInterfaceDeclaration(), mapping.getProgramVariable());
					}
				}
			}
		} else if (activity.getElement() instanceof Interface){
			Interface interfaze = (Interface)activity.getElement();
			for(ComponentCorrelation cc : version.getDeploymentContextRepository().getComponentCorrelation()){
				if(cc.getComponent().getConnectedInterfaces().contains(interfaze)){
					List<VariableMapping> mappings = cc.getVariableMapping();
					for(VariableMapping mapping : mappings){
						variableChanges.put(mapping.getInterfaceDeclaration(), mapping.getProgramVariable());
					}
				}
			}
		}
		return variableChanges;
	}
}