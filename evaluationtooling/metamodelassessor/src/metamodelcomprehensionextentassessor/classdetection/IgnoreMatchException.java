package metamodelcomprehensionextentassessor.classdetection;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.eclipse.emf.ecore.EClass;

import metamodelcomprehensionextentassessor.Reporting;
import metamodelcomprehensionextentassessor.exceptions.MetamodelAssessorIoException;

public class IgnoreMatchException implements IMatchException {

    public static final String PREFIX = "ignor:";

    private final PackageNameClassNamePair targetClass;
    private int matches;

    private IgnoreMatchException(PackageNameClassNamePair targetClass) {
        this.targetClass = targetClass;
        matches = 0;
    }

    public static IgnoreMatchException parse(String string) throws MetamodelAssessorIoException {
        //process prefix
        if (!string.startsWith(PREFIX)) {
            throw new MetamodelAssessorIoException("This entry does not belong to a IgnoreMatchException: " + string);
        }
        string = string.substring(PREFIX.length());

        //extract the mapping
        String[] splitMapping = string.split("\\.");
        if (splitMapping.length != 2) {
            throw new MetamodelAssessorIoException("Something is wrong with this IgnoreMatchException string: " + string);
        }

        PackageNameClassNamePair targetClass = new PackageNameClassNamePair(splitMapping[0], splitMapping[1], true);
        return new IgnoreMatchException(targetClass);
    }

    @Override
    public boolean matches(EClass eClass) {
        if (targetClass.matches(eClass)) {
            matches++;
            Reporting.getCurrentReporting().message("Ignoring class " + eClass.getName() + ": " + this);
        }
        return false;
    }

    @Override
    public List<String> getMatchingErrorsAndReset() {
        List<String> errors = new ArrayList<>(1);
        if (!targetClass.containsWildcard() && matches > 1) {
            errors.add("Class was ignored multiple times: " + targetClass);
        }
        matches = 0;
        return errors;
    }

    @Override
    public boolean applies(EClass eClass) {
        return targetClass.matches(eClass);
    }

    public static boolean canParse(String string) {
        return string.startsWith(PREFIX);
    }

    @Override
    public String toString() {
        return PREFIX + targetClass;
    }

    @Override
    public int hashCode() {
        return Objects.hash(targetClass);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        IgnoreMatchException other = (IgnoreMatchException) obj;
        if (targetClass == null) {
            if (other.targetClass != null) {
                return false;
            }
        } else if (!targetClass.equals(other.targetClass)) {
            return false;
        }
        return true;
    }
}
