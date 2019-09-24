package edu.kit.ipd.sdq.kamp4aps.core.scenarios;

import java.util.List;

import edu.kit.ipd.sdq.kamp4aps.core.APSArchitectureVersion;
import edu.kit.ipd.sdq.kamp4aps.core.changepropagation.Change;
import edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.KAMP4aPSModificationmarksFactory;
import edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ChangePropagationDueToHardwareChange;
import edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ModifyComponent;
import edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ModifyInterface;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Component;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.Interface;

public class SignalInterfacePropagation extends Change {

	public SignalInterfacePropagation(APSArchitectureVersion v) {
		super(v);
	}

	public void markChangesBasedOnSignalInterfaces(Component component, ChangePropagationDueToHardwareChange cp, boolean hasChanged) {
		List<Interface> interfaces = component.getConnectedInterfaces();
		for(Interface i : interfaces){
			ModifyInterface<Interface> mf = KAMP4aPSModificationmarksFactory.eINSTANCE.createModifyInterface();
			mf.setToolderived(true);
			mf.setAffectedElement(i);
			mf.getCausingElements().add(component);
			
			boolean isNewInterface = true;
			for(ModifyInterface<Interface> modInterface : cp.getInterfaceModifications()){
				if(modInterface.getAffectedElement() == i){
					isNewInterface = false;
				}
			}
			if(isNewInterface){
				cp.getInterfaceModifications().add(mf);
				hasChanged = true;
			}
		}
		
		boolean isNewComponent = true;
		for(ModifyComponent<Component> modComponent : cp.getComponentModifications()){
			if(modComponent.getAffectedElement() == component)
				isNewComponent = false;
		}
		if(isNewComponent){
			ModifyComponent<Component> modComponent = KAMP4aPSModificationmarksFactory.eINSTANCE.createModifyComponent();
			modComponent.setAffectedElement(component);
			modComponent.getCausingElements().addAll(interfaces);
			modComponent.setToolderived(true);
			cp.getComponentModifications().add(modComponent);
		}
	}
}
