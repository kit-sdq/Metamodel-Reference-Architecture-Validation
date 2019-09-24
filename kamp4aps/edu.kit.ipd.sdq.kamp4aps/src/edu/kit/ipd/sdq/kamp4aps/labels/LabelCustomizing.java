package edu.kit.ipd.sdq.kamp4aps.labels;

import edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ModifyComponent;
import edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ModifyInterface;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.BusBox;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.BusCable;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.BusMaster;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.BusSlave;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Component;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.MicroswitchModule;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.PowerSupply;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Sensor;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.Interface;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.PhysicalConnection;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.SignalInterface;

public class LabelCustomizing {

	public static String customize(ModifyComponent<Component> modification) {
		if (hasAffectedElement(modification)) {
			String custom = "";
			custom += customizeBusComponent(modification);
			if (custom.isEmpty())
				custom += customizeSensor(modification);
			else if (custom.isEmpty())
				custom += customizeMicroswitchModule(modification);
			else if (custom.isEmpty())
				custom += customizePowerSupply(modification);
			if (custom.isEmpty())
				return modification.getAffectedElement().getId();
			else
				return custom;
		} else {
			return "(Please select a component!)";
		}
	}

	public static String customize(ModifyInterface<Interface> modification) {
		if (hasAffectedElement(modification)) {
			String custom = "";
			if (custom.isEmpty())
				custom += customizePhysicalConnection(modification);
			else if (custom.isEmpty())
				custom += customizeSignalInterface(modification);
			else if (custom.isEmpty())
				custom += customizePowerSupply(modification);
			if (custom.isEmpty())
				return modification.getAffectedElement().getId();
			return custom;
		} else {
			return "(Please select a interface)";
		}

	}

	private static String customizeSignalInterface(ModifyInterface<Interface> modification) {
		if (modification.getAffectedElement() instanceof SignalInterface) {
			SignalInterface si = (SignalInterface) modification.getAffectedElement();
			return getOutputString(si.getId());
		}
		return "";
	}

	private static String customizePhysicalConnection(ModifyInterface<Interface> modification) {
		if (modification.getAffectedElement() instanceof PhysicalConnection) {
			PhysicalConnection physicalConn = (PhysicalConnection) modification.getAffectedElement();
			return getOutputString(physicalConn.getId());
		}
		return "";
	}

	private static String customizeMicroswitchModule(ModifyComponent<Component> modification) {
		if (modification.getAffectedElement() instanceof MicroswitchModule) {
			MicroswitchModule microSwitch = (MicroswitchModule) modification.getAffectedElement();
			return getOutputString(microSwitch.getId());
		}
		return "";
	}

	private static String customizeSensor(ModifyComponent<Component> modification) {
		if (modification.getAffectedElement() instanceof Sensor) {
			Sensor sensor = (Sensor) modification.getAffectedElement();
			return getOutputString(sensor.getId());
		}
		return "";
	}

	private static String getOutputString(String from, String to) {
		return "\"" + from + "->" + to + "\"";
	}

	private static String getOutputString(String affectedElement) {
		return "\"" + affectedElement + "\"";
	}

	private static String customizeBusComponent(ModifyComponent<Component> modification) {
		if (modification.getAffectedElement() instanceof BusBox) {
			BusBox busBox = (BusBox) modification.getAffectedElement();
			String custom = "";
			for (SignalInterface si : busBox.getSignalinterfaces()) {
				custom += getOutputString(busBox.getSignalinterface_box().getId(), si.getId());
			}
			return custom += getOutputString(busBox.getSignalinterface_box().getId(),
					busBox.getSignalinterface_master().getId());
		} else if (modification.getAffectedElement() instanceof BusMaster) {
			BusMaster busMaster = (BusMaster) modification.getAffectedElement();
			String custom = "";
			for (SignalInterface si : busMaster.getSignalinterfaces()) {
				custom += getOutputString(busMaster.getSignalinterface_controller().getId(), si.getId()) + "\n";
			}
			return custom;
		} else if (modification.getAffectedElement() instanceof BusSlave) {
			BusSlave busSlave = (BusSlave) modification.getAffectedElement();
			return getOutputString(busSlave.getSignalinterface_slave().getId(),
					busSlave.getSignalinterface_master().getId());
		} else if (modification.getAffectedElement() instanceof BusCable) {
			BusCable busCable = (BusCable) modification.getAffectedElement();
			return getOutputString(busCable.getSignalPlug1().getId(), busCable.getSignalPlug2().getId());
		}
		return "";
	}

	private static String customizePowerSupply(ModifyComponent<Component> modification) {
		if (modification.getAffectedElement() instanceof PowerSupply) {
			PowerSupply powerSupply = (PowerSupply) modification.getAffectedElement();
			return getOutputString(powerSupply.getId());
		}
		return "";
	}

	private static String customizePowerSupply(ModifyInterface<Interface> modification) {
		if (modification.getAffectedElement() instanceof PowerSupply) {
			PowerSupply powerSupply = (PowerSupply) modification.getAffectedElement();
			return getOutputString(powerSupply.getId());
		}
		return "";
	}

	private static boolean hasAffectedElement(ModifyComponent<Component> modification) {
		return modification.getAffectedElement() != null;
	}

	private static boolean hasAffectedElement(ModifyInterface<Interface> modification) {
		return modification.getAffectedElement() != null;
	}

	public static String getName(edu.kit.ipd.sdq.kamp4aps.model.basic.NamedElement architectureElement) {
		return architectureElement.getName();
	}

}