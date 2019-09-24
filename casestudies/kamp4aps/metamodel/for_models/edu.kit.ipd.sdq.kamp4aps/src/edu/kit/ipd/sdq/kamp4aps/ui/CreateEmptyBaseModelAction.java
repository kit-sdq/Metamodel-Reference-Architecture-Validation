package edu.kit.ipd.sdq.kamp4aps.ui;

import edu.kit.ipd.sdq.kamp.ui.AbstractCreateEmptyBaseModelAction;
import edu.kit.ipd.sdq.kamp4aps.core.APSArchitectureModelFactoryFacade;
import edu.kit.ipd.sdq.kamp4aps.core.APSArchitectureVersion;
import edu.kit.ipd.sdq.kamp4aps.core.APSArchitectureVersionPersistency;

public class CreateEmptyBaseModelAction  extends AbstractCreateEmptyBaseModelAction<APSArchitectureVersion> {
	
	public CreateEmptyBaseModelAction() {
		this.setArchitectureVersionPersistency(new APSArchitectureVersionPersistency());
	}
	
	@Override
	protected APSArchitectureVersion createArchitectureVersion() {
		return APSArchitectureModelFactoryFacade.createEmptyModel("architecturemodel");
	}

}

