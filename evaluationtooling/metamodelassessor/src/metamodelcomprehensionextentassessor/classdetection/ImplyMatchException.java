package metamodelcomprehensionextentassessor.classdetection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EClass;

import metamodelcomprehensionextentassessor.Reporting;
import metamodelcomprehensionextentassessor.exceptions.MetamodelAssessorIoException;
import metamodelcomprehensionextentassessor.metamodelhandles.MetamodelHandle;

/**
 * This matching exception should be used, when during the modularization of a metamodel new classes
 * are created. It is only meaningful in combination with the model analysis mode (in other modes,
 * the traversal strategy handles this). When certain classes in the original metamodel are used
 * implies that the newly created classes are used, you should create an implies matching exception.
 * You also have to imply the same class name, except if the class no longer exists or is renamed.
 * The definition for a imply exception is as follows:<br>
 * imply:classname1>classname1,classname2,...,classnameN
 * 
 * Example:<br>
 * imply:NetworkNodeType>NetworkNodeType,TypeApplications,NetworkNodeTypeApplication
 */
public class ImplyMatchException implements IMatchException {

    public static final String PREFIX = "imply:";

    private final MetamodelHandle sourceMetamodel;
    private final String sourceClassName;
    private int sourceMatches;
    private final MetamodelHandle targetMetamodel;
    private final Map<String, Integer> targetClassNamesAndMatches;

    public ImplyMatchException(String sourceClassName, Map<String, Integer> targetClassNamesAndMatches, MetamodelHandle sourceMetamodel, MetamodelHandle targetMetamodel) {
        this.sourceClassName = sourceClassName;
        this.targetClassNamesAndMatches = targetClassNamesAndMatches;
        this.sourceMetamodel = sourceMetamodel;
        this.targetMetamodel = targetMetamodel;
        sourceMatches = 0;
    }

    public static ImplyMatchException parse(String string, MetamodelHandle sourceMetamodel, MetamodelHandle targetMetamodel) throws MetamodelAssessorIoException {

        //process prefix
        if (!canParse(string)) {
            throw new MetamodelAssessorIoException("This entry does not belong to a ImplyMatchException: " + string);
        }
        string = string.substring(PREFIX.length());

        String[] split = string.split("[>,]");
        if (split.length <= 2) {
            throw new MetamodelAssessorIoException("Something is wrong with this ImplyMatchException string: " + string);
        }

        // parse target classes
        int numberOfTargetClasses = split.length - 1;
        HashMap<String, Integer> targetClassNamesAndMatches = new HashMap<>(numberOfTargetClasses);
        for (int i = 1; i < split.length; i++) {
            String targetClass = split[i];
            targetClassNamesAndMatches.put(targetClass, 0);
        }

        String sourceClassName = split[0];
        return new ImplyMatchException(sourceClassName, targetClassNamesAndMatches, sourceMetamodel, targetMetamodel);
    }

    public static boolean canParse(String string) {
        return string.startsWith(PREFIX);
    }

    @Override
    public boolean applies(EClass eClass) {
        return sourceClassName.equals(eClass.getName());
    }

    @Override
    public boolean matches(EClass eClass) {
        String className = eClass.getName();
        boolean doesMatch;
        MetamodelHandle currentMetamodel = Reporting.getCurrentReporting().getContext().getMetamodel();
        if (currentMetamodel == sourceMetamodel) {
            doesMatch = sourceClassName.equals(className);
            if (doesMatch) {
                sourceMatches++;
                Reporting.getCurrentReporting().message("ImplyMatchException matched class " + className + " in the source metamodel: " + this);
            }
        } else if (currentMetamodel == targetMetamodel) {
            Integer matches = targetClassNamesAndMatches.get(className);
            doesMatch = matches != null;
            if (doesMatch) {
                matches++;
                targetClassNamesAndMatches.put(className, matches);
                Reporting.getCurrentReporting().message("ImplyMatchException matched class " + className + " in the target metamodel." + this);
            }
        } else
            throw new RuntimeException("Unexpected metamodel: " + currentMetamodel);
        return doesMatch;
    }

    @Override
    public List<String> getMatchingErrorsAndReset() {
        List<String> errors = new ArrayList<>();

        MetamodelHandle currentMetamodel = Reporting.getCurrentReporting().getContext().getMetamodel();
        if (currentMetamodel == sourceMetamodel) {
            checkForOneMatch(sourceClassName, sourceMatches, errors);
            sourceMatches = 0;
        } else if (currentMetamodel == targetMetamodel) {
            for (Entry<String, Integer> entry : targetClassNamesAndMatches.entrySet()) {
                checkForOneMatch(entry.getKey(), entry.getValue(), errors);
                entry.setValue(0);
            }
        } else
            throw new RuntimeException("Unexpected metamodel: " + currentMetamodel);

        return errors;
    }

    private void checkForOneMatch(String className, int matches, List<String> errors) {
        if (matches == 0) {
            errors.add("Class not found: " + className);
        } else if (matches > 1) {
            errors.add("Class was matched multiple times: " + className);
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(sourceClassName, targetClassNamesAndMatches);
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
        ImplyMatchException other = (ImplyMatchException) obj;

        if (sourceClassName == null) {
            if (other.sourceClassName != null) {
                return false;
            }
        } else if (!sourceClassName.equals(other.sourceClassName)) {
            return false;
        }

        if (sourceMatches != other.sourceMatches) {
            return false;
        }

        if (targetClassNamesAndMatches == null) {
            if (other.targetClassNamesAndMatches != null) {
                return false;
            }
        } else if (!targetClassNamesAndMatches.equals(other.targetClassNamesAndMatches)) {
            return false;
        }

        return true;
    }

    @Override
    public String toString() {
        return PREFIX + sourceClassName + '>' + targetClassNamesAndMatches.keySet().stream().collect(Collectors.joining(","));
    }
}
