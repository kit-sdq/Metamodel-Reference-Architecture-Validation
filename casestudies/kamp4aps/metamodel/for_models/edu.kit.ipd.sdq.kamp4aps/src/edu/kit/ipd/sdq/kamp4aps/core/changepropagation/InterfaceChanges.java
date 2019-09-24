package edu.kit.ipd.sdq.kamp4aps.core.changepropagation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.EList;

import edu.kit.ipd.sdq.kamp4aps.core.APSArchitectureModelLookup;
import edu.kit.ipd.sdq.kamp4aps.core.APSArchitectureVersion;
import edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ChangePropagationDueToHardwareChange;
import edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.KAMP4aPSModificationmarksFactory;
import edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ModifyComponent;
import edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ModifyInterface;
import edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ModifyModule;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Component;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.Interface;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.Module;

public class InterfaceChanges extends Change {

	private Collection<Interface> initialMarkedInterfaces;

	public InterfaceChanges(APSArchitectureVersion v) {
		super(v);
		initialMarkedInterfaces = APSArchitectureModelLookup.lookUpMarkedObjectsOfAType(version, Interface.class);
	}
	
	public void addInitialMarkedInterfacesToList(
			ChangePropagationDueToHardwareChange changePropagationDueToHardwareChange) {
		for(Interface interfac : initialMarkedInterfaces){
			ModifyInterface<Interface> modifyInterface = KAMP4aPSModificationmarksFactory.eINSTANCE.createModifyInterface();
			modifyInterface.setToolderived(false);
			modifyInterface.setAffectedElement(interfac);
			modifyInterface.setId("Modification of " + interfac.getName());
			changePropagationDueToHardwareChange.getInterfaceModifications().add(modifyInterface);
//			changePropagationDueToHardwareChange.setChanged(true);
		}
	}

	public void calculateAndMarkToModulePropagation(
			ChangePropagationDueToHardwareChange changePropagationDueToHardwareChange) {
		Map<Interface, Set<Module>> modulesToBeMarked = new HashMap<Interface, Set<Module>>();
		List<ModifyModule<Module>> modifyModules = null;
		int mapHash;
		do {
			mapHash = modulesToBeMarked.hashCode();
			modulesToBeMarked = APSArchitectureModelLookup.lookUpParentModulesOfInterfaces(initialMarkedInterfaces, changePropagationDueToHardwareChange);
			modifyModules = createModifyModulesFromAffectedModules(modulesToBeMarked);
			addToModifyModulesToChangePropagation(modifyModules, changePropagationDueToHardwareChange);
		} while (mapHash != modulesToBeMarked.hashCode());
	}
	
		protected List<ModifyModule<Module>> createModifyModulesFromAffectedModules(
				Map<Interface, Set<Module>> modulesToBeMarked) {
			List<ModifyModule<Module>> modifyModules = new ArrayList<ModifyModule<Module>>();
			for(Map.Entry<Interface, Set<Module>> modulesToBeMarkedEntry : modulesToBeMarked.entrySet()){
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
		
	
		protected void addToModifyModulesToChangePropagation(List<ModifyModule<Module>> modifyModules,
				ChangePropagationDueToHardwareChange changePropagationDueToHardwareChange) {
			List<ModifyModule<Module>> modifyModulesToRemove = new ArrayList<ModifyModule<Module>>();
			for(ModifyModule<Module> currentModifyModule : changePropagationDueToHardwareChange.getModuleModifications()){
				for(ModifyModule<Module> newModifyModule : modifyModules){
					if(currentModifyModule.getAffectedElement().getId() == newModifyModule.getAffectedElement().getId())
						modifyModulesToRemove.add(newModifyModule);
				}
			}
			
			for(ModifyModule<Module> modifyModuleToRemove : modifyModulesToRemove){
				modifyModules.remove(modifyModuleToRemove);
			}
			if(!modifyModules.isEmpty())
				changePropagationDueToHardwareChange.setChanged(true);
			changePropagationDueToHardwareChange.getModuleModifications().addAll(modifyModules);	
		}

	public void calculateAndMarkToComponentPropagation(
			ChangePropagationDueToHardwareChange changePropagationDueToHardwareChange) {
		Map<Interface, Set<Component>> componentsToBeMarked = new HashMap<Interface, Set<Component>>();
		List<ModifyComponent<Component>> modifyComponents = null;
		int mapHash;
		do {
			mapHash = componentsToBeMarked.hashCode();
			componentsToBeMarked = APSArchitectureModelLookup.lookUpParentComponentsOfInterfaces(initialMarkedInterfaces, changePropagationDueToHardwareChange);
			modifyComponents = createModifyComponentsFromAffectedComponents(componentsToBeMarked);
			addToModifyComponentsToChangePropagation(modifyComponents, changePropagationDueToHardwareChange);
		} while (mapHash != componentsToBeMarked.hashCode());		
	}
	
		protected List<ModifyComponent<Component>> createModifyComponentsFromAffectedComponents(
				Map<Interface, Set<Component>> componentsToBeMarked) {
			List<ModifyComponent<Component>> modifyComponents = new ArrayList<ModifyComponent<Component>>();
			for(Map.Entry<Interface, Set<Component>> componentsToBeMarkedEntry : componentsToBeMarked.entrySet()){
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
	
		protected void addToModifyComponentsToChangePropagation(List<ModifyComponent<Component>> modifyComponents,
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

	public void flattenAllModifyInterfaces(
			ChangePropagationDueToHardwareChange changePropagationDueToHardwareChange) {
		EList<ModifyInterface<Interface>> modifyInterfaces = changePropagationDueToHardwareChange.getInterfaceModifications();
		List<ModifyInterface<Interface>> flattenModifyInterfaces = new ArrayList<ModifyInterface<Interface>>();
		for(ModifyInterface<Interface> modifyInterface : modifyInterfaces){
			boolean modifyWasSet = false;
			for(ModifyInterface<Interface> secondModifyInterface : modifyInterfaces){
				if(modifyInterface.getAffectedElement().getId() == secondModifyInterface.getAffectedElement().getId()
						&& modifyInterface != secondModifyInterface){
					ModifyInterface<Interface> newModifyInterface = KAMP4aPSModificationmarksFactory.eINSTANCE.createModifyInterface();
					newModifyInterface.setToolderived(true);
					newModifyInterface.setAffectedElement(modifyInterface.getAffectedElement());
					newModifyInterface.setId(modifyInterface.getId());
					newModifyInterface.getCausingElements().addAll(modifyInterface.getCausingElements());
					newModifyInterface.getCausingElements().addAll(secondModifyInterface.getCausingElements());
					flattenModifyInterfaces.add(newModifyInterface);
					modifyWasSet = true;
				}
			}
			if(!modifyWasSet)
				flattenModifyInterfaces.add(modifyInterface);
		}
		
		List<ModifyInterface<Interface>> plainModifyInterfaces = new ArrayList<ModifyInterface<Interface>>();
		for(ModifyInterface<Interface> modifyInterface : flattenModifyInterfaces){
			boolean containsModifyInterface = false;
			for(ModifyInterface<Interface> plainModifyInterface : plainModifyInterfaces){
				if(plainModifyInterface.getAffectedElement().getId() == modifyInterface.getAffectedElement().getId()){
					containsModifyInterface = true;
				}
			}
			if(!containsModifyInterface)
				plainModifyInterfaces.add(modifyInterface);
		}
		changePropagationDueToHardwareChange.getInterfaceModifications().clear();
		changePropagationDueToHardwareChange.getInterfaceModifications().addAll(plainModifyInterfaces);
	}	
}
