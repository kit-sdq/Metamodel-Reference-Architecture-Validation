package edu.kit.ipd.sdq.kamp4aps.core.changepropagation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import edu.kit.ipd.sdq.kamp4aps.core.APSArchitectureModelLookup;
import edu.kit.ipd.sdq.kamp4aps.core.APSArchitectureVersion;
import edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ChangePropagationDueToHardwareChange;
import edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.KAMP4aPSModificationmarksFactory;
import edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ModifyComponent;
import edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ModifyInterface;
import edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ModifyModule;
import edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ModifyStructure;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Component;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.Interface;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.Module;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.StructureRepository.Structure;

public class ModuleChanges extends Change {
	
	private Collection<Module> initialMarkedModules;
	
	public ModuleChanges(APSArchitectureVersion v){
		super(v);
		initialMarkedModules = APSArchitectureModelLookup.lookUpMarkedObjectsOfAType(version, Module.class);
	}
	
	public void addInitialMarkedModulesToList(
			ChangePropagationDueToHardwareChange changePropagationDueToHardwareChange) {
		for(Module module : initialMarkedModules){
			if(!modifyModulesContainsInitialMarkedModule(module, changePropagationDueToHardwareChange)){
				ModifyModule<Module> modifyModule = KAMP4aPSModificationmarksFactory.eINSTANCE.createModifyModule();
				modifyModule.setToolderived(false);
				modifyModule.setAffectedElement(module);
				modifyModule.setId("Modification of " + module.getName());
				changePropagationDueToHardwareChange.getModuleModifications().add(modifyModule);
			}

//			changePropagationDueToHardwareChange.setChanged(true);
		}
	}
	
	private boolean modifyModulesContainsInitialMarkedModule(Module module, ChangePropagationDueToHardwareChange cp) {
		boolean isIdentical = false;
		for(ModifyModule<Module> modifyModule : cp.getModuleModifications()){
			if(modifyModule.getAffectedElement() instanceof Module){
				Module moduleOfModification = (Module)modifyModule.getAffectedElement();
				if(moduleOfModification.getId() == module.getId())
					isIdentical = true;
			}
		}
		return isIdentical;
	}

	public void calculateAndMarkToModulePropagation(ChangePropagationDueToHardwareChange changePropagationDueToHardwareChange){
		calculateModuleToModulePropagation(changePropagationDueToHardwareChange);
	}

		private void calculateModuleToModulePropagation(
				ChangePropagationDueToHardwareChange changePropagationDueToHardwareChange) {
			Map<Module, Set<Module>> modulesToBeMarked = new HashMap<Module, Set<Module>>();
			List<ModifyModule<Module>> modifyModules = null;
			int mapHash = modulesToBeMarked.hashCode();
			do{
				mapHash = modulesToBeMarked.hashCode();
				modulesToBeMarked = APSArchitectureModelLookup.lookUpModulesOfModules(initialMarkedModules, changePropagationDueToHardwareChange);
				modifyModules = createModifyModulesFromAffectedModules(modulesToBeMarked);
				addToModifyModulesToChangePropagation(modifyModules, changePropagationDueToHardwareChange);
			} while (mapHash != modulesToBeMarked.hashCode());
		}
		
			private List<ModifyModule<Module>> createModifyModulesFromAffectedModules(Map<Module, Set<Module>> modulesToBeMarked) {
				List<ModifyModule<Module>> modifyModules = new ArrayList<ModifyModule<Module>>();
				for(Map.Entry<Module, Set<Module>> modulesToBeMarkedEntry : modulesToBeMarked.entrySet()){
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
			
			private void addToModifyModulesToChangePropagation(List<ModifyModule<Module>> modifyModules, ChangePropagationDueToHardwareChange cp) {
				List<ModifyModule<Module>> modifyModulesToRemove = new ArrayList<ModifyModule<Module>>();
				for(ModifyModule<Module> currentModifyModule : cp.getModuleModifications()){
					for(ModifyModule<Module> newModifyModule : modifyModules){
						if(currentModifyModule.getAffectedElement().getId() == newModifyModule.getAffectedElement().getId())
							modifyModulesToRemove.add(newModifyModule);
					}
				}
				
				for(ModifyModule<Module> modifyModuleToRemove : modifyModulesToRemove){
					modifyModules.remove(modifyModuleToRemove);
				}
				if(!modifyModules.isEmpty())
					cp.setChanged(true);
				cp.getModuleModifications().addAll(modifyModules);			
			}

	public void calculateAndMarkToComponentPropagation(
			ChangePropagationDueToHardwareChange changePropagationDueToHardwareChange) {
		calculateModuleToComponentPropagation(changePropagationDueToHardwareChange);
	}
	
		private void calculateModuleToComponentPropagation(
				ChangePropagationDueToHardwareChange changePropagationDueToHardwareChange) {
			Map<Module, Set<Component>> componentsToBeMarked = new HashMap<Module, Set<Component>>();
			List<ModifyComponent<Component>> modifyComponent = null;
			int mapHash;
			do {
				mapHash = componentsToBeMarked.hashCode();
				componentsToBeMarked = APSArchitectureModelLookup.lookUpComponentsOfModules(initialMarkedModules, changePropagationDueToHardwareChange);
				modifyComponent = createModifyComponentFromAffectedComponents(componentsToBeMarked);
				addToModifyComponentsToChangePropagation(modifyComponent, changePropagationDueToHardwareChange);
			} while (mapHash != componentsToBeMarked.hashCode());
		}
	
			private List<ModifyComponent<Component>> createModifyComponentFromAffectedComponents(
					Map<Module, Set<Component>> componentsToBeMarked) {
				List<ModifyComponent<Component>> modifyComponents = new ArrayList<ModifyComponent<Component>>();
				for(Map.Entry<Module, Set<Component>> componentsToBeMarkedEntry : componentsToBeMarked.entrySet()){
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
			
			private void addToModifyComponentsToChangePropagation(List<ModifyComponent<Component>> modifyComponents,
					ChangePropagationDueToHardwareChange changePropagationDueToHardwareChange) {
				List<ModifyComponent<Component>> modifyComponentsToRemove = new ArrayList<ModifyComponent<Component>>();
				for(ModifyComponent<Component> currentModifyComponent : changePropagationDueToHardwareChange.getComponentModifications()){
					for(ModifyComponent<Component> newModifyComponent : modifyComponents){
						if(currentModifyComponent.getAffectedElement().getId() == newModifyComponent.getAffectedElement().getId())
							modifyComponentsToRemove.add(newModifyComponent);
					}
				}
				
				for(ModifyComponent<Component> modifyComponentToRemove : modifyComponentsToRemove){
					modifyComponents.remove(modifyComponentToRemove);
				}
				if(!modifyComponents.isEmpty())
					changePropagationDueToHardwareChange.setChanged(true);
				changePropagationDueToHardwareChange.getComponentModifications().addAll(modifyComponents);		
			}

	public void calculateAndMarkToInterfacePropagation(
			ChangePropagationDueToHardwareChange changePropagationDueToHardwareChange) {
		calculateModuleToInterfacePropagation(changePropagationDueToHardwareChange);
	}

		private void calculateModuleToInterfacePropagation(
				ChangePropagationDueToHardwareChange changePropagationDueToHardwareChange) {
			Map<Module, Set<Interface>> interfacesToBeMarked = new HashMap<Module, Set<Interface>>();
			List<ModifyInterface<Interface>> modifyInterfaces = null;
			int mapHash;
			do {
				mapHash = interfacesToBeMarked.hashCode();
				interfacesToBeMarked = APSArchitectureModelLookup.lookUpInterfacesOfModules(initialMarkedModules, changePropagationDueToHardwareChange);
				modifyInterfaces = createModifyInterfaceFromAffectedInterfaces(interfacesToBeMarked);
				addToModifyInterfacesToChangePropagation(modifyInterfaces, changePropagationDueToHardwareChange);
			} while (mapHash != interfacesToBeMarked.hashCode());			
		}

			private List<ModifyInterface<Interface>> createModifyInterfaceFromAffectedInterfaces(
					Map<Module, Set<Interface>> interfacesToBeMarked) {
				List<ModifyInterface<Interface>> modifyInterfaces = new ArrayList<ModifyInterface<Interface>>();
				for(Map.Entry<Module, Set<Interface>> interfacesToBeMarkedEntry : interfacesToBeMarked.entrySet()){
					for(Interface interfac : interfacesToBeMarkedEntry.getValue()){
						ModifyInterface<Interface> modifyInterface = KAMP4aPSModificationmarksFactory.eINSTANCE.createModifyInterface();
						modifyInterface.setToolderived(true);
						modifyInterface.setAffectedElement(interfac);
						modifyInterface.getCausingElements().add(interfacesToBeMarkedEntry.getKey());
						modifyInterface.setId(interfac.getId() + "_" + interfac.getName());
						modifyInterfaces.add(modifyInterface);
					}
				}
				return modifyInterfaces;
			}
	
			private void addToModifyInterfacesToChangePropagation(List<ModifyInterface<Interface>> modifyInterfaces,
					ChangePropagationDueToHardwareChange changePropagationDueToHardwareChange) {
				List<ModifyInterface<Interface>> modifyInterfacesToRemove = new ArrayList<ModifyInterface<Interface>>();
				for(ModifyInterface<Interface> currentModifyInterface : changePropagationDueToHardwareChange.getInterfaceModifications()){
					for(ModifyInterface<Interface> newModifyInterface : modifyInterfaces){
						if(currentModifyInterface.getAffectedElement().getId() == newModifyInterface.getAffectedElement().getId())
							modifyInterfacesToRemove.add(newModifyInterface);
					}
				}
				
				for(ModifyInterface<Interface> modifyInterfaceToRemove : modifyInterfacesToRemove){
					modifyInterfaces.remove(modifyInterfaceToRemove);
				}
				if(!modifyInterfaces.isEmpty())
					changePropagationDueToHardwareChange.setChanged(true);
				changePropagationDueToHardwareChange.getInterfaceModifications().addAll(modifyInterfaces);	
			}


}
