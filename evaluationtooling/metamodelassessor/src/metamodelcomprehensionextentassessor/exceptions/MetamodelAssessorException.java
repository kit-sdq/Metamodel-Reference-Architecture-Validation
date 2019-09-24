package metamodelcomprehensionextentassessor.exceptions;

public abstract class MetamodelAssessorException extends Exception {

    private static final long serialVersionUID = 2470078912496842288L;

    public MetamodelAssessorException(String message) {
        super(message);
    }

    public MetamodelAssessorException(String message, Throwable cause) {
        super(message, cause);
    }
}
