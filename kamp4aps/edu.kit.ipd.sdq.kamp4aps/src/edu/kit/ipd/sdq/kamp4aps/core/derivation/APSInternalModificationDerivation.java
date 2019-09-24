package edu.kit.ipd.sdq.kamp4aps.core.derivation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import edu.kit.ipd.sdq.kamp.architecture.ArchitectureModelLookup;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractModification;
import edu.kit.ipd.sdq.kamp.workplan.AbstractActivityElementType;
import edu.kit.ipd.sdq.kamp.workplan.Activity;
import edu.kit.ipd.sdq.kamp.workplan.BasicActivity;
import edu.kit.ipd.sdq.kamp4aps.core.APSActivityElementType;
import edu.kit.ipd.sdq.kamp4aps.core.APSActivityType;
import edu.kit.ipd.sdq.kamp4aps.core.APSArchitectureAnnotationLookup;
import edu.kit.ipd.sdq.kamp4aps.core.APSArchitectureVersion;
import edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ModifyComponent;
import edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ModifyInterface;
import edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ModifyModule;
import edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ModifyStructure;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Component;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.Interface;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.Module;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.StructureRepository.Structure;

/**
 * 
 * This class uses the look up methods of \texttt{ArchitectureModelLookup}
 * to add the activities based on the structural changes to the workplan.
 * 
 * @author Sandro Koch
 * @see ArchitectureModelLookup
 */

public class APSInternalModificationDerivation {

	public static List<String> getCausingElementsNames(AbstractModification<?, ?> modification) {
		List<String> causingElementNames = new LinkedList<String>();
		for (Object causingElement : modification.getCausingElements()) {
			if (causingElement instanceof Component) {
				Component causingCompoenent = (Component) causingElement;
				causingElementNames.add(causingCompoenent.eClass().
						getName() + " \"" + causingCompoenent.getName() + "\"");
			} else if (causingElement instanceof Module) {
				Module causingModule = (Module) causingElement;
				causingElementNames.add(causingModule.eClass().
						getName() + " \"" + causingModule.getName() + "\"");
			} else if (causingElement instanceof Interface) {
				Interface causingInterface = (Interface) causingElement;
				causingElementNames.add(causingInterface.eClass().
						getName() + " \"" + causingInterface.getName() + "\"");
			} else if (causingElement instanceof Structure) {
				Structure causingStructure = (Structure) causingElement;
				causingElementNames.add(causingStructure.eClass().
						getName() + " \"" + causingStructure.getName() + "\"");
			}
		}
		return causingElementNames;
	}

	public static Activity createModificationActivity(AbstractModification<?, ?> modification,
			List<String> causingElementNames, AbstractActivityElementType activityElementType) {
		if (modification instanceof ModifyComponent<?>){
			Component component = ((ModifyComponent<?>) modification).getAffectedElement();
			return new Activity(APSActivityType.INTERNALMODIFICATIONMARK, activityElementType, component,
					component.getName(), causingElementNames, BasicActivity.MODIFY, "Modify " + component.eClass().getName() + ".");
		}
		if (modification instanceof ModifyInterface<?>){
			Interface interfaceElement = ((ModifyInterface<?>) modification).getAffectedElement();
			return new Activity(APSActivityType.INTERNALMODIFICATIONMARK, activityElementType, interfaceElement,
					interfaceElement.getName(), causingElementNames, BasicActivity.MODIFY, "Modify " + interfaceElement.eClass().getName() + ".");
		}
		if (modification instanceof ModifyStructure<?>){
			Structure structure = ((ModifyStructure<?>) modification).getAffectedElement();
			return new Activity(APSActivityType.INTERNALMODIFICATIONMARK, activityElementType, structure,
					structure.getName(), causingElementNames, BasicActivity.MODIFY, "Modify " + structure.eClass().getName() + ".");
		}
		if (modification instanceof ModifyModule<?>){
			Module module = ((ModifyModule<?>) modification).getAffectedElement();
			return new Activity(APSActivityType.INTERNALMODIFICATIONMARK, activityElementType, module,
					module.getName(), causingElementNames, BasicActivity.MODIFY, "Modify " + module.eClass().getName() + ".");
		} else {
			return null;
		}
	}

	public static Activity createModificationActivity(AbstractModification<?, ?> modification,
			AbstractActivityElementType activityElementType) {
		List<String> causingElementNames = getCausingElementsNames(modification);
		return createModificationActivity(modification, causingElementNames, activityElementType);
	}

	public static Activity addModificationSubActivity(AbstractModification<?, ?> modification,
			AbstractActivityElementType activityType, Activity superActivity) {
		Activity result = createModificationActivity(modification, activityType);
		superActivity.addSubActivity(result);
		return result;
	}

	public List<Activity> deriveInternalModifications(APSArchitectureVersion targetVersion) {
		List<Activity> activityList = new ArrayList<Activity>();

		this.deriveComponentModifications(targetVersion, activityList);
		this.deriveInterfaceModifications(targetVersion, activityList);
		this.deriveModuleModifications(targetVersion, activityList);
		this.deriveStructureModifications(targetVersion, activityList);

		return activityList;
	}

	private void deriveComponentModifications(APSArchitectureVersion targetVersion, List<Activity> activityList) {
		Collection<ModifyComponent> modifyComponents = ArchitectureModelLookup
				.lookUpAllCalculatedMarksOfAType(targetVersion, ModifyComponent.class);
		for (ModifyComponent<Component> modifyComponent : modifyComponents) {
			Activity componentActivity = createModificationActivity(modifyComponent, APSActivityElementType.COMPONENT);
			activityList.add(componentActivity);
//			this.deriveSubActivities(modifyComponent, componentActivity);
		}
	}

	private void deriveInterfaceModifications(APSArchitectureVersion targetVersion, List<Activity> activityList) {
		Collection<ModifyInterface> modifyInterfaces = ArchitectureModelLookup
				.lookUpAllCalculatedMarksOfAType(targetVersion, ModifyInterface.class);
		for (ModifyInterface<?> modifyInterface : modifyInterfaces) {
			Activity interfaceActivity = createModificationActivity(modifyInterface, APSActivityElementType.INTERFACE);
			activityList.add(interfaceActivity);
		}
	}

	private void deriveModuleModifications(APSArchitectureVersion targetVersion, List<Activity> activityList) {
		Collection<ModifyModule> modifyModules = ArchitectureModelLookup
				.lookUpAllCalculatedMarksOfAType(targetVersion, ModifyModule.class);
		for (ModifyModule<?> modifyInterface : modifyModules) {
			Activity interfaceActivity = createModificationActivity(modifyInterface, APSActivityElementType.MODULE);
			activityList.add(interfaceActivity);
		}
	}
	
	private void deriveStructureModifications(APSArchitectureVersion targetVersion, List<Activity> activityList) {
		Collection<ModifyStructure> modifyStructure = ArchitectureModelLookup
				.lookUpAllCalculatedMarksOfAType(targetVersion, ModifyStructure.class);
		for (ModifyStructure<?> modifyInterface : modifyStructure) {
			Activity interfaceActivity = createModificationActivity(modifyInterface, APSActivityElementType.STRUCTURE);
			activityList.add(interfaceActivity);
		}
	}
	
//	private void deriveSubActivities(ModifyComponent modifyComponent, Activity componentActivity) {
//		for (ModifyProvidedRole modifyProvidedRole : modifyComponent.getProvidedRoleModifications()) {
//			Activity providedRoleActivity = addModificationSubActivity(modifyProvidedRole,
//					ActivityElementType.PROVIDEDROLE, componentActivity);
//			for (ModifySignature modifySignature : modifyProvidedRole.getSignatureModifications()) {
//				addModificationSubActivity(modifySignature, ActivityElementType.PROVIDEDOPERATION,
//						providedRoleActivity);
//			}
//		}
//		for (ModifyRequiredRole modifyRequiredRole : modifyComponent.getRequiredRoleModifications()) {
//			Activity requiredRoleActivity = addModificationSubActivity(modifyRequiredRole,
//					ActivityElementType.REQUIREDROLE, componentActivity);
//			for (ModifySignature modifySignature : modifyRequiredRole.getSignatureModifications()) {
//				addModificationSubActivity(modifySignature, ActivityElementType.REQUIREDOPERATION,
//						requiredRoleActivity);
//			}
//		}
//	}
}
