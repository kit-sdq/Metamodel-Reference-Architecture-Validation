package metamodelcomprehensionextentassessor.classdetection;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.eclipse.emf.ecore.EClass;

import metamodelcomprehensionextentassessor.Reporting;
import metamodelcomprehensionextentassessor.exceptions.MetamodelAssessorIoException;
import metamodelcomprehensionextentassessor.metamodelhandles.MetamodelHandle;

/**
 * A DistinguishMatchException is used to distinguish between two EClasses with the same name. As
 * the package names can generally change during the modularization refactoring, a correct matching
 * of the classes in the original metamodel to the classes in the modular metamodel is in general
 * impossible without explicit this information. It follows the format:
 * disti:packagename1.classname1>packagename2.classname2
 * 
 * Examples:<br>
 * disti:ComponentRepository.Fixture>components.Fixture
 * disti:InterfaceRepository.Fixture>interfaces.Fixture
 */
public class DistinguishMatchException implements IMatchException {

    public static final String PREFIX = "disti:";

    private MetamodelHandle sourceMetamodel;
    private PackageNameClassNamePair sourceClass;
    private MetamodelHandle targetMetamodel;
    private PackageNameClassNamePair targetClass;
    private int matches;

    public static DistinguishMatchException parse(String string, MetamodelHandle sourceMetamodel, MetamodelHandle targetMetamodel) throws MetamodelAssessorIoException {
        //process prefix
        if (!string.startsWith(PREFIX)) {
            throw new MetamodelAssessorIoException("This entry does not belong to a DistinguishMatchException: " + string);
        }
        string = string.substring(PREFIX.length());

        //extract the mapping
        String[] splitMapping = string.split("[>.]");
        if (splitMapping.length != 4) {
            throw new MetamodelAssessorIoException("Something is wrong with this DistinguishMatchException string: " + string);
        }

        DistinguishMatchException instance = new DistinguishMatchException();

        instance.sourceClass = new PackageNameClassNamePair(splitMapping[0], splitMapping[1], false);
        instance.targetClass = new PackageNameClassNamePair(splitMapping[2], splitMapping[3], false);

        instance.sourceMetamodel = sourceMetamodel;
        instance.targetMetamodel = targetMetamodel;
        instance.matches = 0;

        return instance;
    }

    public static boolean canParse(String string) {
        return string.startsWith(PREFIX);
    }

    @Override
    public boolean applies(EClass eClass) {
        return sourceClass.matches(eClass);
    }

    @Override
    public boolean matches(EClass eClass) {
        MetamodelHandle metamodelHandle = Reporting.getCurrentReporting().getContext().getMetamodel();
        PackageNameClassNamePair currentClass = getCurrentClass(metamodelHandle);
        boolean doesMatch = currentClass.matches(eClass);
        if (doesMatch) {
            matches++;
            Reporting.getCurrentReporting().message("DistinguishMatchException matched class " + currentClass + ": " + this);
        }
        return doesMatch;
    }

    public PackageNameClassNamePair getCurrentClass(MetamodelHandle metamodelHandle) {
        if (metamodelHandle == sourceMetamodel) {
            return sourceClass;
        } else if (metamodelHandle == targetMetamodel) {
            return targetClass;
        }
        throw new RuntimeException("Unexpected metamodel: " + metamodelHandle);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sourceClass, targetClass);
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
        DistinguishMatchException other = (DistinguishMatchException) obj;

        if (sourceClass == null) {
            if (other.sourceClass != null) {
                return false;
            }
        } else if (!sourceClass.equals(other.sourceClass)) {
            return false;
        }

        if (targetClass == null) {
            if (other.targetClass != null) {
                return false;
            }
        } else if (!targetClass.equals(other.targetClass)) {
            return false;
        }

        return true;
    }

    @Override
    public List<String> getMatchingErrorsAndReset() {
        PackageNameClassNamePair currentClass = getCurrentClass(Reporting.getCurrentReporting().getContext().getMetamodel());

        List<String> errors = new ArrayList<>(1);
        if (matches == 0) {
            errors.add("Class not found: " + currentClass);
        } else if (matches > 1) {
            errors.add("Class was matched multiple times: " + currentClass);
        }

        matches = 0;
        return errors;
    }

    @Override
    public String toString() {
        return PREFIX + sourceClass + '>' + targetClass;
    }
}
