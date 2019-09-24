package edu.kit.ipd.sdq.kamp4aps.core.changepropagation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

import edu.kit.ipd.sdq.kamp4aps.core.APSArchitectureModelLookup;
import edu.kit.ipd.sdq.kamp4aps.core.APSArchitectureVersion;
import edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ChangePropagationDueToHardwareChange;
import edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ModifyComponent;
import edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ModifyModule;
import edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ModifyStructure;
import edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.KAMP4aPSModificationmarksFactory;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Component;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.Module;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.StructureRepository.Structure;

public class StructureChanges extends Change {
	private Collection<Structure> initialMarkedStructures;
	
	public StructureChanges(APSArchitectureVersion v){
		super(v);
		initialMarkedStructures = APSArchitectureModelLookup.lookUpMarkedObjectsOfAType(version, Structure.class);
	}
	
	public void addInitialMarkedStructuresToList(
			ChangePropagationDueToHardwareChange changePropagationDueToHardwareChange) {
		for(Structure structure : initialMarkedStructures){
			if(!modifyStructureContainsInitialMarkedStructure(structure, changePropagationDueToHardwareChange)){
				ModifyStructure<Structure> modifyStructure = KAMP4aPSModificationmarksFactory.eINSTANCE.createModifyStructure();
				modifyStructure.setToolderived(false);
				modifyStructure.setAffectedElement(structure);
				modifyStructure.setId("Modification of " + structure.getName());
				changePropagationDueToHardwareChange.getStructureModifications().add(modifyStructure);
				changePropagationDueToHardwareChange.setChanged(true);	
			}
		}
	}
	
		private boolean modifyStructureContainsInitialMarkedStructure(Structure structure,
				ChangePropagationDueToHardwareChange changePropagationDueToHardwareChange) {
			boolean isIdentical = false;
			for(ModifyStructure<Structure> modifyStructure : changePropagationDueToHardwareChange.getStructureModifications()){
				if(modifyStructure.getAffectedElement() instanceof Structure){
					Structure moduleOfModification = (Structure)modifyStructure.getAffectedElement();
					if(moduleOfModification.getId() == structure.getId())
						isIdentical = true;
				}
			}
			return isIdentical;
		}

	public void calculateAndMarkToModulePropagation(ChangePropagationDueToHardwareChange changePropagationDueToHardwareChange){
		Map<Structure, Set<Module>> modulesToBeMarked = APSArchitectureModelLookup.lookUpModulesOfStructures(initialMarkedStructures);
		List<ModifyModule<Module>> modifyModules = createModifyModulesFromAffectedModules(modulesToBeMarked);
		changePropagationDueToHardwareChange.getModuleModifications().addAll(modifyModules);
		if(!modifyModules.isEmpty())
			changePropagationDueToHardwareChange.setChanged(true);
	}
	
		private List<ModifyModule<Module>> createModifyModulesFromAffectedModules(
				Map<Structure, Set<Module>> modulesToBeMarked) {
			List<ModifyModule<Module>> modifyModules = new ArrayList<ModifyModule<Module>>();
			for(Map.Entry<Structure, Set<Module>> modulesToBeMarkedEntry : modulesToBeMarked.entrySet()){
				for(Module module : modulesToBeMarkedEntry.getValue()){
					ModifyModule<Module> modifyModule = KAMP4aPSModificationmarksFactory.eINSTANCE.createModifyModule();
					modifyModule.setToolderived(true);
					modifyModule.setAffectedElement(module);
					modifyModule.getCausingElements().add(modulesToBeMarkedEntry.getKey());
					modifyModule.setId(module.getId() + "_" + module.getName());
					modifyModules.add(modifyModule);
				}
			}
			return modifyModules;
		}

	public void calculateAndMarkToComponentPropagation(ChangePropagationDueToHardwareChange changePropagationDueToHardwareChange){
		Map<Structure, Set<Component>> componentsToBeMarked = APSArchitectureModelLookup.lookUpComponentsOfStructures(initialMarkedStructures);
		List<ModifyComponent<Component>> modifyComponents = createModifyComponentsFromAffectedComponents(componentsToBeMarked);
		changePropagationDueToHardwareChange.getComponentModifications().addAll(modifyComponents);
		if(!modifyComponents.isEmpty())
			changePropagationDueToHardwareChange.setChanged(true);
	}

		private List<ModifyComponent<Component>> createModifyComponentsFromAffectedComponents(
				Map<Structure, Set<Component>> componentsToBeMarked) {
			List<ModifyComponent<Component>> modifyComponents = new ArrayList<ModifyComponent<Component>>();
			for(Map.Entry<Structure, Set<Component>> componentsToBeMarkedEntry : componentsToBeMarked.entrySet()){
				for(Component component : componentsToBeMarkedEntry.getValue()){
					ModifyComponent<Component> modifyComponent = KAMP4aPSModificationmarksFactory.eINSTANCE.createModifyComponent();
					modifyComponent.setToolderived(true);
					modifyComponent.setAffectedElement(component);
					modifyComponent.getCausingElements().add(componentsToBeMarkedEntry.getKey());
					modifyComponent.setId(component.getId() + "_" + component.getName());
					modifyComponents.add(modifyComponent);
				}
			}
			return modifyComponents;
		}

}
