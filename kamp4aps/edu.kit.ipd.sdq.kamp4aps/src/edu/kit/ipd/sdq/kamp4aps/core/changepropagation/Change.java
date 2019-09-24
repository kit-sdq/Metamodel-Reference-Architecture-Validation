package edu.kit.ipd.sdq.kamp4aps.core.changepropagation;

import edu.kit.ipd.sdq.kamp4aps.core.APSArchitectureVersion;

public abstract class Change {
	protected APSArchitectureVersion version;
	
	public Change(APSArchitectureVersion v) {
		version = v;
	}
}
