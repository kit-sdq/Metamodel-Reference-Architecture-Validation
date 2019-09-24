package edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.editor;

import edu.kit.ipd.sdq.kamp.model.modificationmarks.editor.AbstractArchitectureBasedWorkplanDerivationAction;
import edu.kit.ipd.sdq.kamp4aps.core.APSArchitectureVersion;
import edu.kit.ipd.sdq.kamp4aps.core.APSArchitectureVersionPersistency;
import edu.kit.ipd.sdq.kamp4aps.core.derivation.APSDifferenceCalculation;
import edu.kit.ipd.sdq.kamp4aps.core.derivation.APSEnrichedWorkplanDerivation;

public class ArchitectureBasedWorkplanDerivationAction extends AbstractArchitectureBasedWorkplanDerivationAction<APSArchitectureVersion> {
	
	public ArchitectureBasedWorkplanDerivationAction() {
		setWorkplanDerivation(new APSDifferenceCalculation());
		setEnrichedWorkplanDerivation(new APSEnrichedWorkplanDerivation());
		setArchitectureVersionPersistency(new APSArchitectureVersionPersistency());
	}

}