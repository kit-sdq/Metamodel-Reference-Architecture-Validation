package edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.editor;


import edu.kit.ipd.sdq.kamp.architecture.AbstractArchitectureVersionPersistency;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.editor.AbstractChangePropagationAction;
import edu.kit.ipd.sdq.kamp.propagation.AbstractChangePropagationAnalysis;
import edu.kit.ipd.sdq.kamp4aps.core.APSArchitectureVersion;
import edu.kit.ipd.sdq.kamp4aps.core.APSArchitectureVersionPersistency;
import edu.kit.ipd.sdq.kamp4aps.core.APSChangePropagationAnalysis;

public class ChangePropagationAction extends AbstractChangePropagationAction<APSArchitectureVersion> {

	@Override
	protected AbstractChangePropagationAnalysis<APSArchitectureVersion> createChangePropagationAnalysis() {
		return new APSChangePropagationAnalysis();
	}

	@Override
	protected AbstractArchitectureVersionPersistency<APSArchitectureVersion> createArchitectureVersionPersistency() {
		return new APSArchitectureVersionPersistency();
	}

}