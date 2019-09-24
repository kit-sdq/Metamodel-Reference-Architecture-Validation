package metamodelcomprehensionextentassessor.ecorewalker;

import java.util.Iterator;

import org.eclipse.emf.ecore.EClass;

import metamodelcomprehensionextentassessor.exceptions.MetamodelAnalysisException;
import metamodelcomprehensionextentassessor.exceptions.MetamodelAssessorException;
import metamodelcomprehensionextentassessor.helpers.EClassSet;

public class InheritanceWalker extends AbstractWalker {

    protected final boolean forgiving;

    public InheritanceWalker(boolean forgiving) {
        this.forgiving = forgiving;
    }

    /**
     * First, collects all superclasses. Then collects all child classes. However, other
     * superclasses of the child classes are by purpose not collected.
     * 
     * @param relevantClasses
     *            in/out: Set of classes from which to start the search. Classes which are found are
     *            added to this list.
     * @param remainingClasses
     *            in/out: Classes which are found during the search are removed from this set. This
     *            has to be non-empty, as child classes are searched here.
     * @throws MetamodelAssessorException
     */
    @Override
    public void walk(EClassSet relevantClasses, EClassSet remainingClasses) throws MetamodelAnalysisException {

        if (remainingClasses.isEmpty()) {
            throw new MetamodelAnalysisException("There are no remaining classes!");
        }

        // walk all ancestors
        new AncestorWalker(forgiving).walk(relevantClasses, remainingClasses);

        // as long as the set of relevant classes grows
        boolean setChanged = true;
        while (setChanged) {

            // walk children
            setChanged = childrenWalk(relevantClasses, remainingClasses);
        }
    }

    private boolean childrenWalk(EClassSet relevantClasses, EClassSet remainingClasses) {
        boolean setChanged = false;

        // check in not yet included classes, if they might be subclasses of included classes
        Iterator<EClass> iterator = remainingClasses.iterator();
        while (iterator.hasNext()) {
            EClass remainingClass = iterator.next();

            // check all superclasses if relevant
            for (EClass superClass : remainingClass.getESuperTypes()) {
                if (relevantClasses.contains(superClass)) {

                    // we have found a subclass
                    relevantClasses.add(remainingClass);
                    iterator.remove();
                    setChanged = true;
                    break;
                }
            }
        }
        return setChanged;
    }
}
