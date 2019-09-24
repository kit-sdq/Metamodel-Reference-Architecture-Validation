package edu.kit.ipd.sdq.kamp4aps.ui;

import edu.kit.ipd.sdq.kamp.ui.AbstractDeriveWorkplanAction;
import edu.kit.ipd.sdq.kamp4aps.core.APSArchitectureVersion;
import edu.kit.ipd.sdq.kamp4aps.core.APSArchitectureVersionPersistency;
import edu.kit.ipd.sdq.kamp4aps.core.derivation.APSDifferenceCalculation;
import edu.kit.ipd.sdq.kamp4aps.core.derivation.APSEnrichedWorkplanDerivation;

public class DeriveWorkplanAction extends AbstractDeriveWorkplanAction<APSArchitectureVersion> {

	public DeriveWorkplanAction() {
		this.setWorkplanDerivation(new APSDifferenceCalculation());
		this.setEnrichedWorkplanDerivation(new APSEnrichedWorkplanDerivation());
		this.setArchitectureVersionPersistency(new APSArchitectureVersionPersistency());
	}

}
