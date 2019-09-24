package edu.kit.ipd.sdq.kamp4aps.core.scenarios;

import java.util.Collection;

import edu.kit.ipd.sdq.kamp4aps.core.APSArchitectureModelLookup;
import edu.kit.ipd.sdq.kamp4aps.core.APSArchitectureVersion;
import edu.kit.ipd.sdq.kamp4aps.core.changepropagation.Change;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.MicroswitchModule;

public class MicroSwitchModuleChange extends Change {

	private Collection<MicroswitchModule> initialMarkedMicroswitches;

	public MicroSwitchModuleChange(APSArchitectureVersion v) {
		super(v);
		initialMarkedMicroswitches = APSArchitectureModelLookup.lookUpMarkedObjectsOfAType(version,
				MicroswitchModule.class);
	}

}
