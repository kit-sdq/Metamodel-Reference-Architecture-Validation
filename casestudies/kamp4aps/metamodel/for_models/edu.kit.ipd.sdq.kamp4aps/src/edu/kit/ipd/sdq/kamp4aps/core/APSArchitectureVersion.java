package edu.kit.ipd.sdq.kamp4aps.core;

import edu.kit.ipd.sdq.kamp4aps.model.DeploymentContext.DeploymentContextFactory;
import edu.kit.ipd.sdq.kamp4aps.model.DeploymentContext.DeploymentContextRepository;
import edu.kit.ipd.sdq.kamp.architecture.AbstractArchitectureVersion;
import edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.FieldOfActivityAnnotationRepository;
import edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.KAMP4aPSFieldofactivityannotationsFactory;
import edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.AbstractKAMP4aPSModificationRepository;
import edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.KAMP4aPSModificationRepository;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.Plant;

/**
 * This class creates the structural and non-structural
 * in memory representations.
 * 
 * @author Sandro Koch
 *
 */

public class APSArchitectureVersion extends AbstractArchitectureVersion<AbstractKAMP4aPSModificationRepository<?>> {
	private FieldOfActivityAnnotationRepository _fieldOfActivityRepository;
	private Plant _aPSPlant;
	private DeploymentContextRepository _deploymentContextRepository;
	
	public static class ArchitectureVersionParams{
		public String name;
		public FieldOfActivityAnnotationRepository fieldOfActivityRepository;
		public KAMP4aPSModificationRepository modificationMarkRepository;
		public DeploymentContextRepository deploymentContextRepository;
		public Plant aPSPlant;
	}
	
	public APSArchitectureVersion(ArchitectureVersionParams params) {
		super(params.name, params.modificationMarkRepository);
		// Some of the files describing the architecture might not exist; prevent NullPointer
		// in propagation algorithm by setting newly created objects (whose EReferences are
		// instantiated with empty collections, so the algorithm can handle them)
		
		if (params.fieldOfActivityRepository == null)
			params.fieldOfActivityRepository = KAMP4aPSFieldofactivityannotationsFactory.eINSTANCE.
					createFieldOfActivityAnnotationRepository();

		_fieldOfActivityRepository = params.fieldOfActivityRepository;
		_aPSPlant = params.aPSPlant;
		
		if(params.deploymentContextRepository == null)
			params.deploymentContextRepository = DeploymentContextFactory.eINSTANCE.createDeploymentContextRepository();
		_deploymentContextRepository = params.deploymentContextRepository;
	}

	public FieldOfActivityAnnotationRepository getFieldOfActivityRepository() {
		return _fieldOfActivityRepository;
	}

	public void setFieldOfActivityRepository(
			FieldOfActivityAnnotationRepository fieldOfActivityRepository) {
		this._fieldOfActivityRepository = fieldOfActivityRepository;
	}

	public Plant getAPSPlant(){
		return _aPSPlant;
	}

	public void setAPSPlant(Plant plant) {
		this._aPSPlant = plant;
	}

	public DeploymentContextRepository getDeploymentContextRepository(){
		return _deploymentContextRepository;
	}
}
