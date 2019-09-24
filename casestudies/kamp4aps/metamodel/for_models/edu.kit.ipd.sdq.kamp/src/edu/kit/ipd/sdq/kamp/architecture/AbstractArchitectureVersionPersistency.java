package edu.kit.ipd.sdq.kamp.architecture;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMLParserPoolImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceImpl;

import edu.kit.ipd.sdq.kamp.model.modificationmarks.ModificationmarksPackage;
import edu.kit.ipd.sdq.kamp.util.FileAndFolderManagement;
import edu.kit.ipd.sdq.kamp.workplan.Activity;
import edu.kit.ipd.sdq.kamp.workplan.ExcelWriter;

/**
 * Supports loading and saving of model files as well as saving activities as text
 * or Excel file. The general load and save methods remain abstract, as they depend 
 * on the concrete file endings and top-level model elements (which should be loaded
 * in/saved from an {@link AbstractArchitectureVersion}).
 */
public abstract class AbstractArchitectureVersionPersistency<T extends AbstractArchitectureVersion<?>> {
	
	private ExcelWriter excelWriter = new ExcelWriter();
	
	public static final String FILEEXTENSION_ACTIVITYLIST = "activitylist";
	public static final String FILEEXTENSION_EXCEL = "xls";
	public static final String FILEEXTENSION_MODIFICATIONMARK = "modificationmarks";
	
	/**
	 * Loads model files from a folder into an {@link AbstractArchitectureVersion}. All
	 * model files should have the same name, but different file endings. You might 
	 * want to use {@link #loadEmfModelFromResource(String, String, ResourceSet)} to
	 * load single files into memory. After loading those file, you can call the
	 * constructor of the architecture version.
	 */
	public abstract T load(String folderpath, String filename, String versionname);
	
	/**
	 * Loads model files from a folder into an {@link AbstractArchitectureVersion}. 
	 * The model files can have arbitrary names; use {@link FileAndFolderManagement#retrieveFileWithExtension(IContainer, String)}
	 * to get certain model files. If you have {@link IFile} objects, the method
	 * {@link #loadEmfModelFromResource(String, String, ResourceSet)} can be used 
	 * with the file path as parameter to load single files into memory. After loading 
	 * those file, you can call the constructor of the architecture version.
	 */
	public abstract T load(IContainer folder, String versionname);
	
	/**
	 * Saves an {@link AbstractArchitectureVersion} into model files. All model files 
	 * should have the same name, but different file endings. You might want to use 
	 * {@link #saveEmfModelToResource(EObject, String, String, ResourceSet)} to
	 * save single files. For each model file, the overall code should look like
	 * {@link #saveModificationMarkFile(String, String, AbstractArchitectureVersion)}.
	 */
	public abstract void save(String targetDirectoryPath, String filename, T version);
	
	public void saveModificationMarkFile(String targetDirectoryPath, String filename, T version) throws IOException {
		ResourceSet resourceSet = new ResourceSetImpl();
		String internalModFilePath = filename + "." + FILEEXTENSION_MODIFICATIONMARK;	
		if (version.getModificationMarkRepository()!=null)
			saveEmfModelToResource(version.getModificationMarkRepository(), targetDirectoryPath, internalModFilePath, resourceSet);		
	}
	
	/**
	 * Saves a list of activities to a plain text file.
	 */
	public void saveActivityListToTextFile(String targetDirectoryPath, String filename, List<Activity> activityList) {
		String activityListFilePath = filename + "." + FILEEXTENSION_ACTIVITYLIST;
		String workspaceURI = ResourcesPlugin.getWorkspace().getRoot().getLocationURI().getPath().toString();
		
		File file = new File(workspaceURI + "/" + targetDirectoryPath + "/" + activityListFilePath);	
		if (file.getParentFile() != null && !file.getParentFile().mkdirs()) {
		    /* handle permission problems here */
		}		
		try {
			file.createNewFile();
		} catch (IOException e1) {
			throw new RuntimeException(e1);
		}
		
	  	FileWriter  writer = null;
    	try {
			writer = new FileWriter(file);
			if (writer != null) {
				saveActivityListToTextFile(writer, activityList, "");
			}
			writer.flush();
			writer.close();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
	
    protected void saveActivityListToTextFile(FileWriter writer, List<Activity> activityList, String prefix) {
    	try {
	    	if (writer != null) {
	    		if (prefix == null)
	    			prefix = "";   		
	    		for (Activity activity : activityList) {
	    			writer.write(prefix + " " + activity.getBasicActivity() + " " + activity.getElementType() + " " + activity.getElementName());
	    			writer.write("\n");
	    			if (!activity.getSubActivities().isEmpty()) {
	    				saveActivityListToTextFile(writer, activity.getSubActivities(), prefix + "=");
	    			}
	    			if (!activity.getFollowupActivities().isEmpty()) {
	    				saveActivityListToTextFile(writer, activity.getFollowupActivities(), prefix + "->");
	    			}
	    		}		
	    		writer.flush();
	    	}
    	} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
	
    /**
     * Saves a list of activities to an Excel sheet.
     */
	public void saveActivityListToExcelFile(String targetDirectoryPath, String filename, List<Activity> activityList) {
		String activityListFilePath = filename + "." + FILEEXTENSION_EXCEL;
		String workspaceURI = ResourcesPlugin.getWorkspace().getRoot().getLocationURI().getPath().toString();	
		ExcelWriter excelWriter = this.getExcelWriter();		
		excelWriter.saveActivitiesToExcelFile(workspaceURI+"/"+targetDirectoryPath+"/"+activityListFilePath, activityList, "");
	}
	
	/**
	 * Retrieves first (hopefully only top-level) element from an Ecore model 
	 * file and returns it as EObject. Make sure to override {@link #registerEPackages(ResourceSet)}
	 * in you sub-classes.
	 */
	public EObject loadEmfModelFromResource(String folderPath, String filePath, ResourceSet resourceSet) {
    	this.registerEPackages(resourceSet);	
    	URI loadURI = URI.createPlatformResourceURI(folderPath, true);
    	if (filePath != null)
    		loadURI = loadURI.appendSegment(filePath);       
        try {	
        	Resource resource = resourceSet.createResource(loadURI);  	
        	((ResourceImpl) resource).setIntrinsicIDToEObjectMap(new HashMap<String, EObject>());      	
        	Map<Object, Object> loadOptions = setupLoadOptions(resource);
        	resource.load(loadOptions);      	
        	if (!resource.getContents().isEmpty())
        		return resource.getContents().get(0);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
        
        return null;
    }
	
	/**
	 * Registers all relevant EPackages for loading resources.
	 */
	protected void registerEPackages(ResourceSet resourceSet) {
		resourceSet.getPackageRegistry().put(ModificationmarksPackage.eNS_URI, ModificationmarksPackage.eINSTANCE);
	}
	
	protected static Map<Object, Object> setupLoadOptions(Resource resource) {
		Map<Object, Object> loadOptions = ((XMLResourceImpl)resource).getDefaultLoadOptions();
        loadOptions.put(XMLResource.OPTION_DEFER_ATTACHMENT, Boolean.TRUE);
        loadOptions.put(XMLResource.OPTION_DEFER_IDREF_RESOLUTION, Boolean.TRUE);
        loadOptions.put(XMLResource.OPTION_USE_DEPRECATED_METHODS, Boolean.TRUE);
        loadOptions.put(XMLResource.OPTION_USE_PARSER_POOL, new XMLParserPoolImpl());
        loadOptions.put(XMLResource.OPTION_USE_XML_NAME_TO_FEATURE_MAP, new HashMap<Object, Object>());
        return loadOptions;
	}
	
	public static void saveEmfModelToResource(EObject model, String directoryPath, String fileName, ResourceSet resourceSet) {
        if (directoryPath != null) {
        	URI saveURI = URI.createPlatformResourceURI(directoryPath, true);
        	if (fileName != null) {
        		saveURI = saveURI.appendSegment(fileName);
        	} else if (model.eResource()!=null) {
        		String segment = model.eResource().getURI().lastSegment();
        		saveURI = saveURI.appendSegment(segment);
        	}  	
            Resource resource = resourceSet.createResource(saveURI);
            Map<Object, Object> saveOptions = setupLoadOptions(resource);     
            resource.getContents().add(model);         
            try {
                resource.save(saveOptions);
            } catch (IOException e) {
                throw new RuntimeException("Saving of resource failed", e);
            }
        }
    }

	protected ExcelWriter getExcelWriter() {
		return excelWriter;
	}

	protected void setExcelWriter(ExcelWriter excelWriter) {
		this.excelWriter = excelWriter;
	}

}
