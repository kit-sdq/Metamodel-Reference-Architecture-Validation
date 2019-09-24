package metamodelcomprehensionextentassessor.classdetection;

import org.eclipse.emf.ecore.EClass;

import metamodelcomprehensionextentassessor.exceptions.MetamodelAssessorIoException;
import metamodelcomprehensionextentassessor.metamodelhandles.MetamodelHandle;

/**
 * Represents an exception in the matching of classes of two metamodels. Classes are usually matched
 * 1:1 according their name.
 */
public interface IMatchException extends IClassIdentificator {

    public static IMatchException parse(String string, MetamodelHandle metamodel1, MetamodelHandle metamodel2) throws MetamodelAssessorIoException {
        if (DistinguishMatchException.canParse(string))
            return DistinguishMatchException.parse(string, metamodel1, metamodel2);
        else if (ImplyMatchException.canParse(string))
            return ImplyMatchException.parse(string, metamodel1, metamodel2);
        else if (IgnoreMatchException.canParse(string))
            return IgnoreMatchException.parse(string);
        throw new MetamodelAssessorIoException("Unknown prefix for exception entry: " + string);
    }

    public static boolean canParse(String string) {
        return DistinguishMatchException.canParse(string) || ImplyMatchException.canParse(string) || IgnoreMatchException.canParse(string);
    }

    /**
     * Is applied to a class of the source metamodel (when doing a txt compare (not yet
     * implemented)) or to the types of a model (when doing metamodel utilization comparison). If
     * the exception applies to the class, it means that this exception has to be used when
     * searching for the class in the target metamodel.
     * 
     * @param eClass
     *            from the source metamodel
     * @return if this exception applies to the class
     */
    boolean applies(EClass eClass);
}
