package metamodelcomprehensionextentassessor.exceptions;

public class MetamodelAnalysisException extends MetamodelAssessorException {

    private static final long serialVersionUID = -2627014717733598503L;

    public MetamodelAnalysisException(String message) {
        super(message);
    }

    public MetamodelAnalysisException(String message, Throwable cause) {
        super(message, cause);
    }
}
