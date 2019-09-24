package edu.kit.ipd.sdq.kamp4aps.core;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import edu.kit.ipd.sdq.kamp.architecture.AbstractArchitectureVersionPersistency;
import edu.kit.ipd.sdq.kamp.util.FileAndFolderManagement;
import edu.kit.ipd.sdq.kamp4aps.core.APSArchitectureVersion.ArchitectureVersionParams;
import edu.kit.ipd.sdq.kamp4aps.model.DeploymentContext.DeploymentContextRepository;
import edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.KAMP4aPSModificationRepository;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.Plant;
import edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.FieldOfActivityAnnotationRepository;

/**
 * 
 * This class provides the loading and saving of 
 * the aPS specific models.
 * 
 * @author Sandro Koch
 *
 */
public class APSArchitectureVersionPersistency extends AbstractArchitectureVersionPersistency<APSArchitectureVersion> {

	private ArchitectureVersionParams archParams = new ArchitectureVersionParams();
	public static final String FILEEXTENSION_REPOSITORY = "repository";
	public static final String FILEEXTENSION_SYSTEM = "system";
	public static final String FILEEXTENSION_FIELDOFACTIVITYANNOTATIONS = "fieldofactivityannotations";
	public static final String FILEEXTENSION_APS = "aps";
	public static final String FILEEXTENSION_MODIFICATIONMARKS = "modificationmarks";
	public static final String FILEEXTENSION_DEPLOYMENTCONTEXT = "deploymentcontext";

	@Override
	public APSArchitectureVersion load(String folderpath, String filename, String versionname) {
		ResourceSet loadResourceSet = new ResourceSetImpl();
		String fieldOfActivityRepositoryFilePath = filename + "." + FILEEXTENSION_FIELDOFACTIVITYANNOTATIONS;
		String internalModFilePath = filename + "." + FILEEXTENSION_MODIFICATIONMARKS;
		String xppufilePath = filename + "." + FILEEXTENSION_APS;

		archParams.name = versionname;
		archParams.fieldOfActivityRepository = (FieldOfActivityAnnotationRepository) loadEmfModelFromResource(
				folderpath, fieldOfActivityRepositoryFilePath, loadResourceSet);
		archParams.modificationMarkRepository = (KAMP4aPSModificationRepository) loadEmfModelFromResource(
				folderpath, internalModFilePath, loadResourceSet);
		archParams.aPSPlant = (Plant) loadEmfModelFromResource(folderpath, xppufilePath, loadResourceSet);
		archParams.deploymentContextRepository = (DeploymentContextRepository) loadEmfModelFromResource(folderpath,
				internalModFilePath, loadResourceSet);
		return new APSArchitectureVersion(archParams);
	}

	@Override
	public APSArchitectureVersion load(IContainer folder, String versionname) {
		ResourceSet loadResourceSet = new ResourceSetImpl();
		IFile fieldOfActivityRepositoryFile = FileAndFolderManagement.retrieveFileWithExtension(folder,
				FILEEXTENSION_FIELDOFACTIVITYANNOTATIONS);
		IFile internalModFile = FileAndFolderManagement.retrieveFileWithExtension(folder,
				FILEEXTENSION_MODIFICATIONMARKS);
		IFile xppufile = FileAndFolderManagement.retrieveFileWithExtension(folder, FILEEXTENSION_APS);
		IFile deploymentContextFile = FileAndFolderManagement.retrieveFileWithExtension(folder,
				FILEEXTENSION_DEPLOYMENTCONTEXT);

		archParams.fieldOfActivityRepository = null;
		archParams.modificationMarkRepository = null;
		archParams.aPSPlant = null;
		archParams.deploymentContextRepository = null;

		archParams.name = versionname;
		if (fieldOfActivityRepositoryFile != null && fieldOfActivityRepositoryFile.exists())
			archParams.fieldOfActivityRepository = (FieldOfActivityAnnotationRepository) loadEmfModelFromResource(
					fieldOfActivityRepositoryFile.getFullPath().toString(), null, loadResourceSet);
		if (internalModFile != null && internalModFile.exists())
			archParams.modificationMarkRepository = (KAMP4aPSModificationRepository) loadEmfModelFromResource(
					internalModFile.getFullPath().toString(), null, loadResourceSet);
		if (xppufile != null && xppufile.exists())
			archParams.aPSPlant = (Plant) loadEmfModelFromResource(xppufile.getFullPath().toString(), null,
					loadResourceSet);
		if (deploymentContextFile != null && deploymentContextFile.exists())
			archParams.deploymentContextRepository = (DeploymentContextRepository) loadEmfModelFromResource(
					deploymentContextFile.getFullPath().toString(), null, loadResourceSet);
		return new APSArchitectureVersion(archParams);
	}

	@Override
	public void save(String targetDirectoryPath, String filename, APSArchitectureVersion version) {
		savePCMAndKAMP4APSModels(targetDirectoryPath, filename, version);
	}

	public static void savePCMAndKAMP4APSModels(String targetDirectoryPath, String filename, APSArchitectureVersion version) {
		ResourceSet resourceSet = new ResourceSetImpl();
		String internalModFilePath = filename + "." + FILEEXTENSION_MODIFICATIONMARKS;
		String fieldOfActivityRepositoryFilePath = filename + "." + FILEEXTENSION_FIELDOFACTIVITYANNOTATIONS;
		String programsFilePath = filename + "." + FILEEXTENSION_DEPLOYMENTCONTEXT;
		String xppuFilePath = filename + "." + FILEEXTENSION_APS;

		if (version.getModificationMarkRepository() != null)
			saveEmfModelToResource(version.getModificationMarkRepository(), targetDirectoryPath, internalModFilePath,
					resourceSet);
		if (version.getFieldOfActivityRepository() != null)
			saveEmfModelToResource(version.getFieldOfActivityRepository(), targetDirectoryPath,
					fieldOfActivityRepositoryFilePath, resourceSet);
		if (version.getDeploymentContextRepository() != null)
			saveEmfModelToResource(version.getDeploymentContextRepository(), targetDirectoryPath, programsFilePath,
					resourceSet);
		if (version.getAPSPlant() != null)
			saveEmfModelToResource(version.getAPSPlant(), targetDirectoryPath, xppuFilePath,
					resourceSet);
	}

}
