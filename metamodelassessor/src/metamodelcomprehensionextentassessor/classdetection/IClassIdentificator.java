package metamodelcomprehensionextentassessor.classdetection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import metamodelcomprehensionextentassessor.AnalysisContext;
import metamodelcomprehensionextentassessor.exceptions.MetamodelAssessorIoException;
import metamodelcomprehensionextentassessor.metamodelhandles.MetamodelHandle;

/**
 * A class identificator is used to find classes in a metamodel. Each class of a metamodel is
 * checked against each identificator. The most simple identificator is just matching the name of
 * the class. There are, however, special more complex identificators for special cases.
 */
public interface IClassIdentificator {

    public static IClassIdentificator create(EObject eObject, Collection<IMatchException> exceptions) {
        EClass eClass = eObject.eClass();
        for (IMatchException exception : exceptions) {
            if (exception.applies(eClass))
                return exception;
        }
        return new SimpleClassIdentificator(eClass.getName());
    }

    public static List<IClassIdentificator> create(List<String> classNames, MetamodelHandle metamodel1, MetamodelHandle metamodel2) throws MetamodelAssessorIoException {
        List<IClassIdentificator> ids = new ArrayList<>(classNames.size());
        for (String className : classNames) {
            if (IMatchException.canParse(className)) {
                ids.add(IMatchException.parse(className, metamodel1, metamodel2));
            } else {
                ids.add(new SimpleClassIdentificator(className));
            }
        }
        return ids;
    }

    /**
     * Checks (for the metamodel specified in the {@link AnalysisContext}) if the eClass is searched
     * by this identificator.
     * 
     * @param eClass
     *            that should be ckecked
     * @return if the eClass is amongst the ones that should identified by this identificator
     */
    boolean matches(EClass eClass);

    List<String> getMatchingErrorsAndReset();
}
