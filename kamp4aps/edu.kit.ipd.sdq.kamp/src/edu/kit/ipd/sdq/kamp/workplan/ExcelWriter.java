package edu.kit.ipd.sdq.kamp.workplan;

import java.io.IOException;
import java.util.Collection;
import java.util.List;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

/**
 * Writes a list of Activities to an Excel worksheet.
 */
public class ExcelWriter {

	public static final int COLUMN_PREFIX = 0;
	public static final int COLUMN_ACTIVITYTYPE = 1;
	public static final int COLUMN_DESCRIPTION = 2;
	public static final int COLUMN_ELEMENTNAME = 3;
	public static final int COLUMN_CAUSES = 4;
	
	private int currentRow;
	private WritableSheet sheet;

	public void saveActivitiesToExcelFile(String filename, List<Activity> activityList, String prefix) {	
    	WritableWorkbook workbook = null;
    	this.currentRow = 0;
    	
    	try {
			workbook = Workbook.createWorkbook(new java.io.File(filename));
		} catch (IOException e) {
			throw new RuntimeException(e);
		} 

    	if (workbook!=null) {
        	String username = System.getProperty("user.name");
    		this.sheet = workbook.createSheet("Work plan" + ((username!=null) ? " " + username : ""), 0); 
    		
    		addLabelToSheet(this.sheet, COLUMN_ACTIVITYTYPE, this.currentRow, "Activity type");
    		addLabelToSheet(this.sheet, COLUMN_DESCRIPTION, this.currentRow, "Activity description");
    		addLabelToSheet(this.sheet, COLUMN_ELEMENTNAME, this.currentRow, "Affected element");
    		addLabelToSheet(this.sheet, COLUMN_CAUSES, this.currentRow, "Causing elements");
    		this.currentRow++;
    		
    		saveActivitiesToExcelFile(activityList, ""); 		
    		try {
				workbook.write();
	    		workbook.close(); 
			} catch (IOException e) {
				throw new RuntimeException(e);
			} catch (WriteException e) {
				throw new RuntimeException(e);
			}
    	}
    	
	}   
   
    protected void addLabelToSheet(WritableSheet sheet, int column, int row, String text) {
    	Label label = new Label(column, row, text);  	
    	try {
			sheet.addCell(label);
		} catch (RowsExceededException e) {
			throw new RuntimeException(e);
		} catch (WriteException e) {
			throw new RuntimeException(e);
		} 
    }
    
    protected void saveActivitiesToExcelFile(List<Activity> activityList, String prefix) {
    	for (Activity activity : activityList) {			
			addLabelToSheet(this.sheet, COLUMN_PREFIX, this.currentRow, prefix);
			addLabelToSheet(this.sheet, COLUMN_ACTIVITYTYPE, this.currentRow, 
					activity.getType().getName());
			addLabelToSheet(this.sheet, COLUMN_DESCRIPTION, this.currentRow, 
					activity.getDescription());
			addLabelToSheet(this.sheet, COLUMN_ELEMENTNAME, this.currentRow, 
					activity.getElementName());
			addLabelToSheet(this.sheet, COLUMN_CAUSES, this.currentRow, 
					concatenate(activity.getCausingElementsNames()));
			this.currentRow++;

			saveActivitiesToExcelFile(activity.getSubActivities(), prefix + "=");
			saveActivitiesToExcelFile(activity.getFollowupActivities(), prefix+"=>");
		}
	}  
    
    private static String concatenate(Collection<String> strings) {
    	StringBuilder result = new StringBuilder();
    	for (String oneString: strings) {
    		result = result.append(oneString).append(", ");
    	}
    	if (result.length() >= 2) {
    		result.delete(result.length() - 2, result.length());
    	}
    	return result.toString();
    }
}
