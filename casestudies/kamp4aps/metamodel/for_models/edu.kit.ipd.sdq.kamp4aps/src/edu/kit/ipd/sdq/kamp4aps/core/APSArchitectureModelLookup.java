package edu.kit.ipd.sdq.kamp4aps.core;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import edu.kit.ipd.sdq.kamp.architecture.ArchitectureModelLookup;
import edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ChangePropagationDueToHardwareChange;
import edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ModifyComponent;
import edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ModifyInterface;
import edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ModifyModule;
import edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ModifyStructure;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.Plant;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.BusBox;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.BusCable;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.BusMaster;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.BusSlave;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Component;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.Interface;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.SignalInterface;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.Module;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.StructureRepository.Structure;
import edu.kit.ipd.sdq.kamp4aps.model.basic.Entity;
import edu.kit.ipd.sdq.kamp4aps.model.basic.Identifier;

/**
 * This class represents a part of the change rules implementation
 * that where extracted of the scenarios described in the link below.
 * These rules are searching for the affected structural elements
 * which were defined in the \texttt{xPPU} metamodel.
 * Each look up method is the manifestation of a single element of the mentioned
 * metamodel.
 * 
 * The internal public class \texttt{BusComponentsParams} serves as data exchange
 * class to avoid large parameter lists.
 * 
 * @author Sandro Koch
 * @see <a href="https://sdqweb.ipd.kit.edu/publications/pdfs/koch2017a.pdf">koch2017a<\a>
 *
 */

public class APSArchitectureModelLookup extends ArchitectureModelLookup {

	private static BusComponentsParams bcParams;
		
	/*	########################################################################################################################
	 * 	#  STRUCTURE LOOKUP SECTION  ###########################################################################################
	 *  ########################################################################################################################              
	 */
	/**
	 * 
	 * @param version
	 * @param initialMarkedStructures
	 * @return
	 */
	public static List<Plant> lookUpParentsOfStructures(Collection<ModifyStructure<Structure>> initialMarkedStructures){
		List<Plant> results = new ArrayList<Plant>();
		for(ModifyStructure<Structure> modifyStructure : initialMarkedStructures){
			results.add(modifyStructure.getAffectedElement().getParentPlant());
		}
		return results;
	}
	
	/**
	 * 
	 * @param version
	 * @param initialMarkedStructures
	 * @return
	 */
	public static Map<Structure, Set<Module>> lookUpModulesOfStructures(Collection<Structure> initialMarkedStructures){
		Map<Structure, Set<Module>> results = new HashMap<Structure, Set<Module>>();
		for(Structure modifyStructure : initialMarkedStructures){
			for(Module module : modifyStructure.getModules()){
				if(results.get(modifyStructure) == null)
					results.put(modifyStructure, new HashSet<Module>());
				results.get(modifyStructure).add(module);
			}
		}
		return results;
	}
	
	/**
	 * 
	 * @param version
	 * @param initialMarkedStructures
	 * @return
	 */
	public static Map<Structure, Set<Component>> lookUpComponentsOfStructures(Collection<Structure> initialMarkedStructures){
		Map<Structure, Set<Component>> results = new HashMap<Structure, Set<Component>>();
		for(Structure modifyStructure : initialMarkedStructures){
			for(Component component : modifyStructure.getComponents()){
				if(results.get(modifyStructure) == null)
					results.put(modifyStructure, new HashSet<Component>());
				results.get(modifyStructure).add(component);
			}
		}
		return results;
	}
	
	/*	#####################################################################################################################
	 * 	#  MODULE LOOKUP SECTION  ###########################################################################################
	 *  #####################################################################################################################               
	 */
	/**
	 * Returns a map with modules and their parent structure.
	 * For reverse LookUp.
	 * @param initialMarkedModules
	 * @param changePropagationDueToHardwareChange
	 * @return
	 */
	public static Map<Module, Structure> lookUpParentStructuresOfModules(Collection<ModifyModule<Module>> initialMarkedModules,
			ChangePropagationDueToHardwareChange changePropagationDueToHardwareChange){
		Map<Module, Structure> results = new HashMap<Module, Structure>();
		for(ModifyModule<Module> modifyModule : initialMarkedModules){
			if(modifyModule.getAffectedElement().getParentEntity() != null &&
					modifyModule.getAffectedElement().getParentEntity() instanceof Structure)
				results.put(modifyModule.getAffectedElement(), (Structure) modifyModule.getAffectedElement().getParentEntity());
		}
		
		
		List<ModifyModule<Module>> modulesToModify = changePropagationDueToHardwareChange.getModuleModifications();
		for(ModifyModule<Module> moduleToModify : modulesToModify){
			Module affectedModule = moduleToModify.getAffectedElement();
			Entity parent = affectedModule.getParentEntity();
			if(parent instanceof Structure){
				results.put(affectedModule, (Structure) parent);
			}
		}
		return results;
	}
	
	/**
	 * Returns a map with modules and their parent module.
	 * For reverse LookUp.
	 * @param initialMarkedModules
	 * @param changePropagationDueToHardwareChange
	 * @return
	 */
	public static Map<Module, Module> lookUpParentModulesOfModules(Collection<ModifyModule<Module>> initialMarkedModules,
			ChangePropagationDueToHardwareChange changePropagationDueToHardwareChange){
		Map<Module, Module> results = new HashMap<Module, Module>();
		for(ModifyModule<Module> modifyModule : initialMarkedModules){
			if(modifyModule.getAffectedElement().getParentEntity() != null &&
					modifyModule.getAffectedElement().getParentEntity() instanceof Module)
				results.put(modifyModule.getAffectedElement(), (Module) modifyModule.getAffectedElement().getParentEntity());
		}
		
		List<ModifyModule<Module>> modulesToModify = changePropagationDueToHardwareChange.getModuleModifications();
		for(ModifyModule<Module> moduleToModify : modulesToModify){
			Module affectedModule = moduleToModify.getAffectedElement();
			Entity parent = affectedModule.getParentEntity();
			if(parent instanceof Module){
				results.put(affectedModule, (Module) parent);
			}
		}
		
		
		return results;
	}
	
	/**
	 * 
	 * @param initialMarkedModules
	 * @param changePropagationDueToHardwareChange
	 * @return
	 */
	public static Map<Module, Set<Module>> lookUpModulesOfModules(Collection<Module> initialMarkedModules, 
			ChangePropagationDueToHardwareChange changePropagationDueToHardwareChange){
		Map<Module, Set<Module>> results = new HashMap<Module, Set<Module>>();
		for(Module modifyModule: initialMarkedModules){
			for(Module module : modifyModule.getModules()){
				if(results.get(modifyModule) == null)
					results.put(modifyModule, new HashSet<Module>());
				results.get(modifyModule).add(module);
			}
		}
		
		List<ModifyModule<Module>> modulesToModify = changePropagationDueToHardwareChange.getModuleModifications();
		for(ModifyModule<Module> moduleToModify : modulesToModify){
			Module affectedModule = moduleToModify.getAffectedElement();
			for(Module module : affectedModule.getModules()){
				if(results.get(affectedModule) == null)
					results.put(affectedModule, new HashSet<Module>());
				results.get(affectedModule).add(module);
			}
		}
		return results;
	}
	
	/**
	 * 
	 * @param initialMarkedModules
	 * @param changePropagationDueToHardwareChange
	 * @return
	 */
	public static Map<Module, Set<Component>> lookUpComponentsOfModules(Collection<Module> initialMarkedModules,
			ChangePropagationDueToHardwareChange changePropagationDueToHardwareChange){
		Map<Module, Set<Component>> results = new HashMap<Module, Set<Component>>();
		
		for(Module modifyModule: initialMarkedModules){
			for(Component component : modifyModule.getComponents()){
				if(results.get(modifyModule) == null)
					results.put(modifyModule, new HashSet<Component>());
				results.get(modifyModule).add(component);
			}
		}
		
		List<ModifyModule<Module>> modulesToModify = changePropagationDueToHardwareChange.getModuleModifications();
		for(ModifyModule<Module> moduleToModify : modulesToModify){
			Module affectedModule = moduleToModify.getAffectedElement();
			for(Component component : affectedModule.getComponents()){
				if(results.get(affectedModule) == null)
					results.put(affectedModule, new HashSet<Component>());
				results.get(affectedModule).add(component);
			}
		}
		
		return results;
	}
	
	/**
	 * 
	 * @param initialMarkedModules
	 * @param changePropagationDueToHardwareChange
	 * @return
	 */
	public static Map<Module, Set<Interface>> lookUpInterfacesOfModules(Collection<Module> initialMarkedModules,
			ChangePropagationDueToHardwareChange changePropagationDueToHardwareChange){
		Map<Module, Set<Interface>> results = new HashMap<Module, Set<Interface>>();
		
		for(Module modifyModule: initialMarkedModules){
			for(Interface interfac : modifyModule.getInterfaces()){
				if(results.get(modifyModule) == null)
					results.put(modifyModule, new HashSet<Interface>());
				results.get(modifyModule).add(interfac);
			}
		}
		
		List<ModifyModule<Module>> modulesToModify = changePropagationDueToHardwareChange.getModuleModifications();
		for(ModifyModule<Module> moduleToModify : modulesToModify){
			Module affectedModule = moduleToModify.getAffectedElement();
			for(Interface interfac : affectedModule.getInterfaces()){
				if(results.get(affectedModule) == null)
					results.put(affectedModule, new HashSet<Interface>());
				results.get(affectedModule).add(interfac);
			}
		}
		
		return results;
	}
	
	/*	########################################################################################################################
	 * 	#  COMPONENT LOOKUP SECTION  ###########################################################################################
	 *  ########################################################################################################################
	 */
	
	/**
	 * 
	 * @param version
	 * @param initialMarkedComponents
	 * @return
	 */
	public static Map<Component, Structure> lookUpParentStructuresOfComponents(Collection<Component> initialMarkedComponents, 
			ChangePropagationDueToHardwareChange changePropagationDueToHardwareChange){
		Map<Component, Structure> results = new HashMap<Component, Structure>();
		for(Component modifyComponent : initialMarkedComponents){
			if(modifyComponent.getParent() != null)
				results.put(modifyComponent, (Structure) modifyComponent.getParent());
		}
		
		List<ModifyComponent<Component>> componentsToModify = changePropagationDueToHardwareChange.getComponentModifications();
		for(ModifyComponent<Component> componentToModify : componentsToModify){
			Component affectedComponent = componentToModify.getAffectedElement();
			Structure parent = affectedComponent.getParent();
			if(parent != null){
				results.put(affectedComponent, parent);
			}
		}
		return results;
	}
	
	/**
	 * 
	 * @param version
	 * @param initialMarkedComponents
	 * @return
	 */
	public static Map<Component, Module> lookUpParentModulesOfComponents(Collection<Component> initialMarkedComponents,
			ChangePropagationDueToHardwareChange changePropagationDueToHardwareChange){
		Map<Component, Module> results = new HashMap<Component, Module>();
		for(Component modifyComponent : initialMarkedComponents){
			if(modifyComponent.getParentModule() instanceof Module)
				results.put(modifyComponent, (Module)modifyComponent.getParentModule());
		}
		
		List<ModifyComponent<Component>> componentsToModify = changePropagationDueToHardwareChange.getComponentModifications();
		for(ModifyComponent<Component> componentToModify : componentsToModify){
			Component affectedComponent = componentToModify.getAffectedElement();
			Module parent = affectedComponent.getParentModule();
			if(parent != null){
				results.put(affectedComponent, parent);
			}
		}
		return results;
	}
	
	/**
	 * 
	 * @param version
	 * @param initialMarkedComponents
	 * @return
	 */
	public static Map<Component, Set<Interface>> lookUpInterfacesOfComponents(Collection<? extends Component> initialMarkedComponents, 
			ChangePropagationDueToHardwareChange changePropagationDueToHardwareChange){
		Map<Component, Set<Interface>> results = new HashMap<Component, Set<Interface>>();
		for(Component modifyComponent : initialMarkedComponents){
			for(Interface interfac : modifyComponent.getConnectedInterfaces()){
				if(results.get(modifyComponent) == null)
					results.put(modifyComponent, new HashSet<Interface>());
				results.get(modifyComponent).add(interfac);
			}
		}
		
		List<ModifyComponent<Component>> componentsToModify = changePropagationDueToHardwareChange.getComponentModifications();
		for(ModifyComponent<Component> componentToModify : componentsToModify){
			Component affectedComponent = componentToModify.getAffectedElement();
			for(Interface interfac : affectedComponent.getConnectedInterfaces()){
				if(results.get(affectedComponent) == null)
					results.put(affectedComponent, new HashSet<Interface>());
				results.get(affectedComponent).add(interfac);
			}
		}
		
		return results;
	}
	
	
	
	/*	########################################################################################################################
	 * 	#  INTERFACE LOOKUP SECTION  ###########################################################################################
	 *  ########################################################################################################################              
	 */
	
	/**
	 * 
	 * @param initialMarkedInterfaces
	 * @return
	 */
	public static Map<Interface, Set<Module>> lookUpParentModulesOfInterfaces(
			Collection<? extends Interface> initialMarkedInterfaces,
			ChangePropagationDueToHardwareChange changePropagationDueToHardwareChange){
		Map<Interface, Set<Module>> results = new HashMap<Interface, Set<Module>>();
		for(Interface modifyInterface : initialMarkedInterfaces){
			for(Identifier parent : modifyInterface.getParentElement()){
				if(parent instanceof Module){
					if(results.get(modifyInterface) == null)
						results.put(modifyInterface, new HashSet<Module>());
					results.get(modifyInterface).add((Module) parent);
				}
			}
			
		}
		
		List<ModifyInterface<Interface>> interfacesToModify = changePropagationDueToHardwareChange.getInterfaceModifications();
		for(ModifyInterface<Interface> modifyInterface : interfacesToModify){
			for(Identifier parent : modifyInterface.getAffectedElement().getParentElement()){
				if(parent instanceof Module){
					if(results.get(modifyInterface.getAffectedElement()) == null)
						results.put(modifyInterface.getAffectedElement(), new HashSet<Module>());
					results.get(modifyInterface.getAffectedElement()).add((Module) parent);
				}
			}
		}
		
		return results;
	}
	
	/**
	 * 
	 * @param initialMarkedInterfaces
	 * @return
	 */
	public static Map<Interface, Set<Component>> lookUpParentComponentsOfInterfaces(
			Collection<? extends Interface> initialMarkedInterfaces,
			ChangePropagationDueToHardwareChange changePropagationDueToHardwareChange){
		Map<Interface, Set<Component>> results = new HashMap<Interface, Set<Component>>();
		for(Interface modifyInterface : initialMarkedInterfaces){
			for(Identifier parent : modifyInterface.getParentElement()){
				if(parent instanceof Component){
					if(results.get(modifyInterface) == null)
						results.put(modifyInterface, new HashSet<Component>());
					results.get(modifyInterface).add((Component) parent);
				}
			}
			
		}
		
		for(ModifyInterface<Interface> modifyInterface : changePropagationDueToHardwareChange.getInterfaceModifications()){
			for(Identifier parent : modifyInterface.getAffectedElement().getParentElement()){
				if(parent instanceof Component){
					if(results.get(modifyInterface.getAffectedElement()) == null)
						results.put(modifyInterface.getAffectedElement(), new HashSet<Component>());
					results.get(modifyInterface.getAffectedElement()).add((Component) parent);
				}
			}
		}
		return results;
	}

	
//#########################################################################################################################################
//#########################################################################################################################################
//#########################################################################################################################################
	
	public static Map<Component, Set<ModifyInterface<Interface>>> lookUpChangesBasedOnSignalInterfaces(APSArchitectureVersion version,
			Collection<ModifyInterface<Interface>> initialMarkedInterfaces){
		Map<Component, Set<ModifyInterface<Interface>>> results = new HashMap<Component, Set<ModifyInterface<Interface>>>();
		for(ModifyInterface<Interface> modifyInterface : initialMarkedInterfaces){
			for(Component component : version.getAPSPlant().getComponentRepository().getAllComponentsInPlant()){
				if(modifyInterface.getAffectedElement() instanceof Interface){
					for(Interface componentInterface : component.getConnectedInterfaces()){
						if(componentInterface.getId() == modifyInterface.getAffectedElement().getId()){
							if(results.get(component) == null)
								results.put(component, new HashSet<ModifyInterface<Interface>>());
							results.get(component).add(modifyInterface);
						}
					}
				}
			}
		}
		return results;
	}

	public static BusComponentsParams lookUpChangesBasedOnBusModification(APSArchitectureVersion version,
			Collection<BusBox> initialMarkedBusBoxes){
		EList<Component> allComponents = version.getAPSPlant().getComponentRepository().getAllComponentsInPlant();
		bcParams = initBusComponentParams(initialMarkedBusBoxes);
		setAllBusComponentsInParams(allComponents);
		
		while(bcParams.hasChanged){
			bcParams.hasChanged = false;
			
			EList<Interface> interfacesOfBusBoxes = getAllInterfacesOfMarkedBusBoxes();
			EList<Interface> interfacesOfBusMasters = getAllInterfacesOfMarkedBusMasters();
			EList<Interface> interfacesOfBusSlaves = getAllInterfacesOfMarkedBusSlaves();
			EList<Interface> interfacesOfBusCables = getAllInterfacesOfMarkedBusCables();
			
			addAllBusMastersThatAreConnectedToTheBusCables(interfacesOfBusCables);
			addAllBusSlavessThatAreConnectedToTheBusCables(interfacesOfBusCables);
			
			removeAllBusCablesThatAreNotConnectedToBusComponent(interfacesOfBusBoxes);
			removeAllBusCablesThatAreNotConnectedToBusComponent(interfacesOfBusMasters);
			removeAllBusCablesThatAreNotConnectedToBusComponent(interfacesOfBusSlaves);
			
			addAllBusMastersThatAreConnectedToTheBusCables(interfacesOfBusCables);
			addAllBusSlavessThatAreConnectedToTheBusCables(interfacesOfBusCables);
		}
		
		updateBusCableCausingsByBusMasters();
		updateBusCableCausingsByBusSlaves();
		updateBusCableCausingsByBusBoxes();
		
		return bcParams;
	}

	private static void updateBusCableCausingsByBusBoxes() {
		for(BusBox key : bcParams.causingElementsOfBusBox.keySet()){
			for(BusCable cable : bcParams.busCablesToChange){
				if(bcParams.causingElementsOfBusCable.get(cable) == null){
					bcParams.causingElementsOfBusCable.put(cable, new HashSet<Identifier>());
				}
				if(bcParams.causingElementsOfBusBox.get(key).contains(cable.getSignalPlug1())){
					Set<Identifier> causingElement = bcParams.causingElementsOfBusCable.get(cable);
					causingElement.add((Identifier)cable.getSignalPlug1());
					bcParams.causingElementsOfBusCable.put(cable, causingElement);
				} else if(bcParams.causingElementsOfBusBox.get(key).contains(cable.getSignalPlug2())){
					Set<Identifier> causingElement = bcParams.causingElementsOfBusCable.get(cable);
					causingElement.add((Identifier)cable.getSignalPlug2());
					bcParams.causingElementsOfBusCable.put(cable, causingElement);
				}
			}
		}
	}

	private static void updateBusCableCausingsByBusSlaves() {
		for(BusSlave key : bcParams.causingElementsOfBusSlave.keySet()){
			for(BusCable cable : bcParams.busCablesToChange){
				if(bcParams.causingElementsOfBusCable.get(cable) == null){
					bcParams.causingElementsOfBusCable.put(cable, new HashSet<Identifier>());
				}
				if(bcParams.causingElementsOfBusSlave.get(key).contains(cable.getSignalPlug1())){
					Set<Identifier> causingElement = bcParams.causingElementsOfBusCable.get(cable);
					causingElement.add((Identifier)cable.getSignalPlug1());
					bcParams.causingElementsOfBusCable.put(cable, causingElement);
				} else if(bcParams.causingElementsOfBusSlave.get(key).contains(cable.getSignalPlug2())){
					Set<Identifier> causingElement = bcParams.causingElementsOfBusCable.get(cable);
					causingElement.add((Identifier)cable.getSignalPlug2());
					bcParams.causingElementsOfBusCable.put(cable, causingElement);
				}
			}
		}
	}

	private static void updateBusCableCausingsByBusMasters() {
		for(BusMaster key : bcParams.causingElementsOfBusMaster.keySet()){
			for(BusCable cable : bcParams.busCablesToChange){
				if(bcParams.causingElementsOfBusCable.get(cable) == null){
					bcParams.causingElementsOfBusCable.put(cable, new HashSet<Identifier>());
				}
				if(bcParams.causingElementsOfBusMaster.get(key).contains(cable.getSignalPlug1())){
					Set<Identifier> causingElement = bcParams.causingElementsOfBusCable.get(cable);
					causingElement.add((Identifier)cable.getSignalPlug1());
					bcParams.causingElementsOfBusCable.put(cable, causingElement);
				} else if(bcParams.causingElementsOfBusMaster.get(key).contains(cable.getSignalPlug2())){
					Set<Identifier> causingElement = bcParams.causingElementsOfBusCable.get(cable);
					causingElement.add((Identifier)cable.getSignalPlug2());
					bcParams.causingElementsOfBusCable.put(cable, causingElement);
				}
			}
		}
	}

	private static void addAllBusSlavessThatAreConnectedToTheBusCables(EList<Interface> interfacesOfBusCables) {
		EList<BusSlave> slavesToAdd = new BasicEList<BusSlave>();
		for(BusSlave bs : bcParams.allBusSlaves){
			for(Interface bcInterface : interfacesOfBusCables){
				if(bs.getSignalinterface_master() != null){
					if(bcInterface.getId() == bs.getSignalinterface_master().getId()){
						updateSlavesToAdd(slavesToAdd, bs, bcInterface);
					}
				} 
				if (bs.getSignalinterface_slave() != null){
					if(bcInterface.getId() == bs.getSignalinterface_slave().getId()){
						updateSlavesToAdd(slavesToAdd, bs, bcInterface);
					}
				}
					
			}
		}
		for(BusSlave bs : slavesToAdd){
			if(!bcParams.busSlavesToChange.contains(bs)){
				bcParams.busSlavesToChange.add(bs);
				bcParams.hasChanged = true;
			}
		}
	}
	
	private static void updateSlavesToAdd(EList<BusSlave> slavesToAdd, BusSlave bs, Interface bcInterface) {
		slavesToAdd.add(bs);
		if(bcParams.causingElementsOfBusSlave.get(bs) == null)
			bcParams.causingElementsOfBusSlave.put(bs, new HashSet<Identifier>());
		Set<Identifier> causingElements = bcParams.causingElementsOfBusSlave.get(bs);
		causingElements.add((Identifier)bcInterface);
	}
	private static void addAllBusMastersThatAreConnectedToTheBusCables(EList<Interface> interfacesOfBusCables) {
		EList<BusMaster> mastersToAdd = new BasicEList<BusMaster>();
		for(BusMaster bm : bcParams.allBusMasters){
			for(Interface bcInterface : interfacesOfBusCables){
				for(Interface si : bm.getSignalinterfaces()){
					if(bcInterface.getId().equals(si.getId())){
						updateMastersToAdd(mastersToAdd, bm, bcInterface);
					}
				}
				if(bm.getSignalinterface_controller().getId() == bcInterface.getId()){
					updateMastersToAdd(mastersToAdd, bm, bcInterface);
				}
			}
			
		}
		for(BusMaster bm : mastersToAdd){
			if(!bcParams.busMastersToChange.contains(bm)){
				bcParams.busMastersToChange.add(bm);
				bcParams.hasChanged = true;
			}
		}
	}

	private static void updateMastersToAdd(EList<BusMaster> mastersToAdd, BusMaster bm, Interface bcInterface) {
		mastersToAdd.add(bm);
		if(bcParams.causingElementsOfBusMaster.get(bm) == null)
			bcParams.causingElementsOfBusMaster.put(bm, new HashSet<Identifier>());
		Set<Identifier> causingElements = bcParams.causingElementsOfBusMaster.get(bm);
		causingElements.add((Identifier)bcInterface);
	}

	private static void setAllBusComponentsInParams(EList<Component> allComponents) {
		getAllBusBoxesInTheSystem(allComponents);			
		getAllBusMastersInTheSystem(allComponents);
		getAllBusSlavesInTheSystem(allComponents);
		getAllBusCablesInTheSystem(allComponents);
  	}

		private static BusComponentsParams initBusComponentParams(Collection<BusBox> initialMarkedBusBoxes) {
			BusComponentsParams bcParams = new BusComponentsParams();
			bcParams.busBoxesToChange = new HashSet<BusBox>(initialMarkedBusBoxes);
			bcParams.busMastersToChange = new HashSet<BusMaster>();
			bcParams.busSlavesToChange = new HashSet<BusSlave>();
			bcParams.busCablesToChange = new HashSet<BusCable>();
			bcParams.allBusBoxes = new HashSet<BusBox>();
			bcParams.allBusMasters = new HashSet<BusMaster>();
			bcParams.allBusSlaves = new HashSet<BusSlave>();
			bcParams.allBusCables = new HashSet<BusCable>();
			bcParams.causingElementsOfBusBox = new HashMap<BusBox, Set<Identifier>>();
			bcParams.causingElementsOfBusMaster = new HashMap<BusMaster, Set<Identifier>>();
			bcParams.causingElementsOfBusSlave = new HashMap<BusSlave, Set<Identifier>>();
			bcParams.causingElementsOfBusCable = new HashMap<BusCable, Set<Identifier>>();
			bcParams.hasChanged = true;
			return bcParams;
		}
		
		private static void removeAllBusCablesThatAreNotConnectedToBusComponent(EList<Interface> interfacesOfBusComponent) {
			EList<BusCable> cablesToAdd = new BasicEList<BusCable>();
			for(BusCable bc : bcParams.allBusCables){
				for(Interface si : interfacesOfBusComponent){
					if(si != null){
						if(si.getId() == bc.getSignalPlug1().getId() ||
						   si.getId() == bc.getSignalPlug2().getId()){
							cablesToAdd.add(bc);
						}
					}
				}
			}
			for(BusCable bc : cablesToAdd){
				if(!bcParams.busCablesToChange.contains(bc)){
					bcParams.busCablesToChange.add(bc);
					bcParams.hasChanged = true;
				}				
			}
		}
	
		private static void getAllBusBoxesInTheSystem(EList<Component> allComponents) {
			for(Component component : allComponents){
				if(component instanceof BusBox)
					bcParams.allBusBoxes.add((BusBox)component);
			}
		}
		
		private static void getAllBusMastersInTheSystem(EList<Component> allComponents) {
			for(Component component : allComponents){
				if(component instanceof BusMaster)
					bcParams.allBusMasters.add((BusMaster)component);
			}
		}
		
		private static void getAllBusSlavesInTheSystem(EList<Component> allComponents) {
			for(Component component : allComponents){
				if(component instanceof BusSlave)
					bcParams.allBusSlaves.add((BusSlave)component);
			}
		}
		
		private static void getAllBusCablesInTheSystem(EList<Component> allComponents) {
			for(Component component : allComponents){
				if(component instanceof BusCable)
					bcParams.allBusCables.add((BusCable)component);
			}
		}

		private static EList<Interface> getAllInterfacesOfMarkedBusBoxes() {
			EList<Interface> interfacesOfBusBox = new BasicEList<Interface>();
			for(BusBox bb : bcParams.busBoxesToChange){
				interfacesOfBusBox.add(bb.getPowersupply());
				interfacesOfBusBox.add(bb.getSignalinterface_box());
				interfacesOfBusBox.add(bb.getSignalinterface_master());
				for(SignalInterface si : bb.getSignalinterfaces())
					interfacesOfBusBox.add(si);
			}
			return interfacesOfBusBox;
		}
		
		private static EList<Interface> getAllInterfacesOfMarkedBusMasters() {
			EList<Interface> interfacesOfBusMasters = new BasicEList<Interface>();
			for(BusMaster bm : bcParams.busMastersToChange){
				interfacesOfBusMasters.add(bm.getSignalinterface_controller());
				for(SignalInterface si : bm.getSignalinterfaces())
					interfacesOfBusMasters.add(si);
			}
			return interfacesOfBusMasters;
		}
		
		private static EList<Interface> getAllInterfacesOfMarkedBusSlaves() {
			EList<Interface> interfacesOfBusSlaves = new BasicEList<Interface>();
			for(BusSlave bs : bcParams.busSlavesToChange){
				interfacesOfBusSlaves.add(bs.getSignalinterface_master());
				interfacesOfBusSlaves.add(bs.getSignalinterface_slave());
				interfacesOfBusSlaves.addAll(bs.getConnectedInterfaces());
			}
			return interfacesOfBusSlaves;
		}
		
		private static EList<Interface> getAllInterfacesOfMarkedBusCables() {
			EList<Interface> interfacesOfBusCables = new BasicEList<Interface>();
			for(BusCable bc : bcParams.busCablesToChange){
				interfacesOfBusCables.add(bc.getSignalPlug1());
				interfacesOfBusCables.add(bc.getSignalPlug2());
			}
			return interfacesOfBusCables;
		}
	
	/**
	 * 
	 * This class is a data exchange class to avoid large
	 * parameter lists. It stores all bus components of the system
	 * as well as the identified bus components which are affected
	 * by a change. Also the causing entities are stored in this class
	 * The look up methods of the parent class 
	 * \texttt{ArchitectureModelLookup} fill the parameters of the class.
	 * 
	 * @author Sandro Koch
	 *
	 */
	public static class BusComponentsParams{
		public Set<BusBox> busBoxesToChange;
		public Set<BusMaster> busMastersToChange;
		public Set<BusSlave> busSlavesToChange;
		public Set<BusCable> busCablesToChange;
		public Set<BusBox> allBusBoxes;
		public Set<BusMaster> allBusMasters;
		public Set<BusSlave> allBusSlaves;
		public Set<BusCable> allBusCables;
		public Map<BusBox, Set<Identifier>> causingElementsOfBusBox;
		public Map<BusMaster, Set<Identifier>> causingElementsOfBusMaster;
		public Map<BusSlave, Set<Identifier>> causingElementsOfBusSlave;
		public Map<BusCable, Set<Identifier>> causingElementsOfBusCable;
		public boolean hasChanged;
	}



	
}
