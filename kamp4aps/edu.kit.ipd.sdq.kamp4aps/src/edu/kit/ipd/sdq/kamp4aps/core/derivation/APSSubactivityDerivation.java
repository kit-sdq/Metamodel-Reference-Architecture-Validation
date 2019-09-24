package edu.kit.ipd.sdq.kamp4aps.core.derivation;

import edu.kit.ipd.sdq.kamp.workplan.AbstractActivityElementType;
import edu.kit.ipd.sdq.kamp.workplan.Activity;
import edu.kit.ipd.sdq.kamp.workplan.BasicActivity;
import edu.kit.ipd.sdq.kamp4aps.core.APSActivityElementType;
import edu.kit.ipd.sdq.kamp4aps.core.APSActivityType;
import edu.kit.ipd.sdq.kamp4aps.core.APSArchitectureVersion;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Component;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.MicroswitchModule;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.TurningTable;
import edu.kit.ipd.sdq.kamp4aps.model.basic.Identifier;
import edu.kit.ipd.sdq.kamp4aps.model.basic.NamedElement;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.Interface;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.Module;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.StructureRepository.Structure;

/**
 * 
 * 
 * 
 * @author Sandro Koch
 *
 */

public class APSSubactivityDerivation {

	public static Activity addSubActivity(Module entity, AbstractActivityElementType activityElementType,
			Module parentElement, Activity parentActivity) {
		Activity result = new Activity(APSActivityType.ARCHITECTUREMODELDIFF, activityElementType, entity, entity.getId(),
				null, parentActivity.getBasicActivity(),
				generateDescription(parentElement, entity, parentActivity.getBasicActivity()));
		parentActivity.addSubActivity(result);
		return result;
	}

	public void deriveSubactivities(NamedElement plantElement, Activity parentActivity, APSArchitectureVersion version) {
		if (plantElement instanceof Component) {
			deriveSubactivity((Component) plantElement, parentActivity, version);
		} else if (plantElement instanceof Interface) {
			deriveSubactivity((Interface) plantElement, parentActivity, version);
		} else if (plantElement instanceof Module) {
			deriveSubactivity((Module) plantElement, parentActivity, version);
		} else if (plantElement instanceof Structure) {
			deriveSubactivity((Structure) plantElement, parentActivity, version);
		}
	}

	private void deriveSubactivity(Component plantElement, Activity parentActivity, APSArchitectureVersion version) {
		if (plantElement instanceof MicroswitchModule) {
			for (Component c : version.getAPSPlant().getComponentRepository().getAllComponentsInPlant()) {
				if (c instanceof TurningTable) {
					TurningTable tt = (TurningTable) c;
					for(MicroswitchModule mm : tt.getMicroswitchModule()){
						if (plantElement.getId() == mm.getId()) {
							addSubActivity((Module) tt, APSActivityElementType.COMPONENT, c,
									parentActivity);
							addSubActivity(tt.getTable_to_stand_on().getParent(), APSActivityElementType.STRUCTURE, c,
									parentActivity);
						}
					}
				}
			}
		}
	}

	private Activity addSubActivity(Component component, APSActivityElementType elementType, Component parentElement, Activity parentActivity) {
		Activity result = new Activity(APSActivityType.ARCHITECTUREMODELDIFF, elementType, component, component.getId(), null, parentActivity.getBasicActivity(), 
				generateDescription(parentElement, component, parentActivity.getBasicActivity()));
		parentActivity.addSubActivity(result);
		return parentActivity;
	}
	
	private Activity addSubActivity(Module module, APSActivityElementType elementType, Component parentElement, Activity parentActivity) {
		Activity result = new Activity(APSActivityType.ARCHITECTUREMODELDIFF, elementType, module, module.getId(), null, parentActivity.getBasicActivity(), 
				generateDescription(parentElement, module, parentActivity.getBasicActivity()));
		parentActivity.addSubActivity(result);
		return parentActivity;
	}


	private Activity addSubActivity(Structure structure, APSActivityElementType elementType, Component parentElement, Activity parentActivity) {
		Activity result = new Activity(APSActivityType.ARCHITECTUREMODELDIFF, elementType, structure, structure.getId(), null, parentActivity.getBasicActivity(), 
				generateDescription(parentElement, structure, parentActivity.getBasicActivity()));
		parentActivity.addSubActivity(result);
		return parentActivity;
	}

	private void deriveSubactivity(Interface plantElement, Activity parentActivity, APSArchitectureVersion version) {
		// TODO Auto-generated method stub

	}

	private void deriveSubactivity(Module plantElement, Activity parentActivity, APSArchitectureVersion version) {
		// TODO Auto-generated method stub

	}

	private void deriveSubactivity(Structure plantElement, Activity parentActivity, APSArchitectureVersion version) {
		// TODO Auto-generated method stub

	}

	public static String generateDescription(Identifier superElement, Identifier subElement, BasicActivity action) {
		String result = "";
		if (action.equals(BasicActivity.ADD)) {
			result += "Add ";
		} else if (action.equals(BasicActivity.REMOVE)) {
			result += "Remove ";
		} else if (action.equals(BasicActivity.MODIFY)) {
			result += "Modify ";
		}
		result += subElement.eClass().getName() + " " + subElement.getId();
		if (action.equals(BasicActivity.ADD)) {
			result += " to ";
		} else if (action.equals(BasicActivity.REMOVE)) {
			result += " from ";
		} else if (action.equals(BasicActivity.MODIFY)) {
			result += " of ";
		}
		result += superElement.eClass().getName() + " " + superElement.getId() + ".";
		return result;
	}

}
