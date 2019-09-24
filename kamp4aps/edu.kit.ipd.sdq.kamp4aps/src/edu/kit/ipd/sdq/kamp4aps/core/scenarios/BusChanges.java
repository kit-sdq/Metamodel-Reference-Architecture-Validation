package edu.kit.ipd.sdq.kamp4aps.core.scenarios;

import java.util.Collection;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import edu.kit.ipd.sdq.kamp.architecture.ArchitectureModelLookup;
import edu.kit.ipd.sdq.kamp4aps.core.APSArchitectureVersion;
import edu.kit.ipd.sdq.kamp4aps.core.changepropagation.Change;
import edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ChangePropagationDueToHardwareChange;
import edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ModifyBusBox;
import edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ModifyBusCable;
import edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ModifyBusMaster;
import edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ModifyBusSlave;
import edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.KAMP4aPSModificationmarksFactory;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.Plant;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.BusBox;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.BusCable;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.BusMaster;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.BusSlave;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Component;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.SignalInterface;
import edu.kit.ipd.sdq.kamp4aps.model.basic.Identifier;

public class BusChanges extends Change {

	public BusChanges(APSArchitectureVersion v) {
		super(v);
	}

	public Collection<BusBox> getInitialMarkedBusBoxes() {
		return ArchitectureModelLookup.lookUpMarkedObjectsOfAType(version, BusBox.class);
	}
	public Collection<BusMaster> getInitialMarkedBusMaster() {
		return ArchitectureModelLookup.lookUpMarkedObjectsOfAType(version, BusMaster.class);
	}
	public Collection<BusSlave> getInitialMarkedBusSlave() {
		return ArchitectureModelLookup.lookUpMarkedObjectsOfAType(version, BusSlave.class);
	}
	
	public Collection<BusCable> getInitialMarkedBusCable() {
		return ArchitectureModelLookup.lookUpMarkedObjectsOfAType(version, BusCable.class);
	}

	public ModifyBusBox createNewModifyBusBox(BusBox busBox) {
		Collection<BusBox> initialMarkedBusBoxes = getInitialMarkedBusBoxes();
		ModifyBusBox modifyBusBox = KAMP4aPSModificationmarksFactory.eINSTANCE.createModifyBusBox();
		modifyBusBox.setToolderived(true);
		modifyBusBox.setAffectedElement(busBox);
		modifyBusBox.getCausingElements().addAll(initialMarkedBusBoxes);
		return modifyBusBox;
	}
	
	public ModifyBusMaster createNewModifyBusMaster(BusMaster busMaster, Set<Identifier> causingElements) {
		ModifyBusMaster modifyBusMaster = KAMP4aPSModificationmarksFactory.eINSTANCE.createModifyBusMaster();
		modifyBusMaster.setToolderived(true);
		modifyBusMaster.setAffectedElement(busMaster);
		modifyBusMaster.getCausingElements().addAll(getInitialMarkedBusMaster());
		modifyBusMaster.getCausingElements().addAll(causingElements);
		return modifyBusMaster;
	}
	
	public ModifyBusSlave createNewModifyBusSlave(BusSlave busSlave, Set<Identifier> causingElements) {
		ModifyBusSlave modifyBusSlave = KAMP4aPSModificationmarksFactory.eINSTANCE.createModifyBusSlave();
		modifyBusSlave.setToolderived(true);
		modifyBusSlave.setAffectedElement(busSlave);
		modifyBusSlave.getCausingElements().addAll(getInitialMarkedBusSlave());
		modifyBusSlave.getCausingElements().addAll(causingElements);
		return modifyBusSlave;
	}
	
	public ModifyBusCable createNewModifyBusCable(BusCable busCable, Set<Identifier> causingElements) {
		ModifyBusCable modifyBusCable = KAMP4aPSModificationmarksFactory.eINSTANCE.createModifyBusCable();
		modifyBusCable.setToolderived(true);
		modifyBusCable.setAffectedElement(busCable);
		modifyBusCable.getCausingElements().addAll(getInitialMarkedBusCable());
		modifyBusCable.getCausingElements().addAll(causingElements);
		return modifyBusCable;
	}
	
	public void markChangesBasedOnBusBox(BusBox busBox, ChangePropagationDueToHardwareChange changePropagationDueToHardwareChange){
		SignalInterface siMaster = busBox.getSignalinterface_master();

		Plant xPPUPlant = version.getAPSPlant();
		EList<Component> xppuComponents = xPPUPlant.getComponentRepository().getAllComponentsInPlant();
		if(siMaster != null){
			for(Component component : xppuComponents){
				if(component instanceof BusMaster){
					EList<SignalInterface> sis = ((BusMaster)component).getSignalinterfaces();
					for(SignalInterface si : sis){
						if(si == siMaster){
							BusMaster bm = (BusMaster) component;
							ModifyBusMaster modifyBusMaster = KAMP4aPSModificationmarksFactory.eINSTANCE.createModifyBusMaster();
							modifyBusMaster.setToolderived(true);
							modifyBusMaster.setAffectedElement(bm);
							modifyBusMaster.getCausingElements().addAll(getInitialMarkedBusBoxes());
							changePropagationDueToHardwareChange.getBusMasterModifications().add(modifyBusMaster);
						}
					}
				}
			}
		}
		
		EList<SignalInterface> siSlaves = busBox.getSignalinterfaces();
		if(siSlaves != null){
			for(Component component : xppuComponents){
				if(component instanceof BusSlave){
					SignalInterface slaveSignalInterface = ((BusSlave)component).getSignalinterface_slave();
					for(SignalInterface si : siSlaves){
						if(si == slaveSignalInterface){
							BusSlave bs = (BusSlave) component;
							ModifyBusSlave modifyBusSlave = KAMP4aPSModificationmarksFactory.eINSTANCE.createModifyBusSlave();
							modifyBusSlave.setToolderived(true);
							modifyBusSlave.setAffectedElement(bs);
							modifyBusSlave.getCausingElements().addAll(getInitialMarkedBusBoxes());
							changePropagationDueToHardwareChange.getBusSlaveModifications().add(modifyBusSlave);
						}
					}
				} else if (component instanceof BusCable){
					BusCable busCable = ((BusCable)component);
					ModifyBusCable modifyBusCable = KAMP4aPSModificationmarksFactory.eINSTANCE.createModifyBusCable();
					modifyBusCable.setToolderived(true);
					modifyBusCable.setAffectedElement(busCable);
					modifyBusCable.getCausingElements().addAll(getInitialMarkedBusBoxes());
					changePropagationDueToHardwareChange.getBusCableModifications().add(modifyBusCable);
				}
			}
		}
	}
	
	public void markChangesBasedOnBusMaster(BusMaster busMaster, ChangePropagationDueToHardwareChange changePropagationDueToHardwareChange){
		SignalInterface siController = busMaster.getSignalinterface_controller();
		
		Plant xPPUPlant = version.getAPSPlant();
		EList<Component> xppuComponents = xPPUPlant.getComponentRepository().getAllComponentsInPlant();
		
		if(siController != null){
			for(Component component : xppuComponents){
				if(component instanceof BusMaster){
					EList<SignalInterface> sis = ((BusMaster)component).getSignalinterfaces();
					for(SignalInterface si : sis){
						if(si == siController){
							BusMaster bm = (BusMaster) component;
							ModifyBusMaster modifyBusMaster = KAMP4aPSModificationmarksFactory.eINSTANCE.createModifyBusMaster();
							modifyBusMaster.setToolderived(true);
							modifyBusMaster.setAffectedElement(bm);
							modifyBusMaster.getCausingElements().addAll(getInitialMarkedBusMaster());
							changePropagationDueToHardwareChange.getBusMasterModifications().add(modifyBusMaster);
						}
					}
				}
			}
		}
		
		EList<SignalInterface> siSlaves = busMaster.getSignalinterfaces();
		if(siSlaves != null){
			for(Component component : xppuComponents){
				if(component instanceof BusSlave){
					SignalInterface slaveSignalInterface = ((BusSlave)component).getSignalinterface_slave();
					for(SignalInterface si : siSlaves){
						if(si == slaveSignalInterface){
							BusSlave bs = (BusSlave) component;
							ModifyBusSlave modifyBusSlave = KAMP4aPSModificationmarksFactory.eINSTANCE.createModifyBusSlave();
							modifyBusSlave.setToolderived(true);
							modifyBusSlave.setAffectedElement(bs);
							modifyBusSlave.getCausingElements().addAll(getInitialMarkedBusSlave());
							changePropagationDueToHardwareChange.getBusSlaveModifications().add(modifyBusSlave);
						}
					}
				} else if (component instanceof BusCable){
					BusCable busCable = ((BusCable)component);
					ModifyBusCable modifyBusCable = KAMP4aPSModificationmarksFactory.eINSTANCE.createModifyBusCable();
					modifyBusCable.setToolderived(true);
					modifyBusCable.setAffectedElement(busCable);
					modifyBusCable.getCausingElements().addAll(getInitialMarkedBusCable());
					changePropagationDueToHardwareChange.getBusCableModifications().add(modifyBusCable);
				}
			}
		}
	}
	
	public void markChangesBasedOnBusSlave(BusSlave busSlave, ChangePropagationDueToHardwareChange changePropagationDueToHardwareChange){
		Plant xPPUPlant = version.getAPSPlant();
		EList<Component> xppuComponents = xPPUPlant.getComponentRepository().getAllComponentsInPlant();
		
		SignalInterface siMaster = busSlave.getSignalinterface_master();
		if(siMaster != null){
			for(Component component : xppuComponents){
				if(component instanceof BusMaster){
					EList<SignalInterface> sis = ((BusMaster)component).getSignalinterfaces();
					for(SignalInterface si : sis){
						if(si == siMaster){
							BusMaster bm = (BusMaster) component;
							ModifyBusMaster modifyBusMaster = KAMP4aPSModificationmarksFactory.eINSTANCE.createModifyBusMaster();
							modifyBusMaster.setToolderived(true);
							modifyBusMaster.setAffectedElement(bm);
							modifyBusMaster.getCausingElements().addAll(getInitialMarkedBusMaster());
							changePropagationDueToHardwareChange.getBusMasterModifications().add(modifyBusMaster);
						}
					}
				}
			}
		}
		
        SignalInterface siSlave = busSlave.getSignalinterface_slave();
        if(siSlave != null){
        	for(Component component : xppuComponents){
        		if(component instanceof BusSlave){
                    if(component == siSlave){
                        BusSlave bs = (BusSlave) component;
                        ModifyBusSlave modifyBusSlave = KAMP4aPSModificationmarksFactory.eINSTANCE.createModifyBusSlave();
                        modifyBusSlave.setToolderived(true);
                        modifyBusSlave.setAffectedElement(bs);
                        modifyBusSlave.getCausingElements().addAll(getInitialMarkedBusSlave());
                        changePropagationDueToHardwareChange.getBusSlaveModifications().add(modifyBusSlave);
                    }
                }
            }
        }
	}


}
