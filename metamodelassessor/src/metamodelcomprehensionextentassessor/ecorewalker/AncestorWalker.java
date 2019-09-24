package metamodelcomprehensionextentassessor.ecorewalker;

import java.util.Iterator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import metamodelcomprehensionextentassessor.helpers.EClassSet;

public class AncestorWalker extends AbstractWalker {

    private final boolean forgiving;

    public AncestorWalker(boolean forgiving) {
        this.forgiving = forgiving;
    }

    /**
     * Collects all superclasses.
     * 
     * @param relevantClasses
     *            All superclasses of classes in this set are added to it.
     * @param remainingClasses
     *            This may be empty. The found superclasses are merely removed from it.
     */
    @Override
    public void walk(EClassSet relevantClasses, EClassSet remainingClasses) {
        // this implementeation is not perfect with respect to performance
        // already found classes are walked over and over
        // however it works and ... no tiem

        int classCount;
        int classCountAfterWalk;
        do {
            // get ancestry to add them to the set
            EClassSet inheritedClasses = new EClassSet(forgiving);
            Iterator<EClass> iterator = relevantClasses.iterator();
            while (iterator.hasNext()) {
                EClass currentClass = iterator.next();
                EList<EClass> superTypes = currentClass.getESuperTypes();
                inheritedClasses.addAll(superTypes);
                remainingClasses.removeAll(superTypes);
            }

            // do this as long as new classes are found
            classCount = relevantClasses.size();
            relevantClasses.addAll(inheritedClasses);
            classCountAfterWalk = relevantClasses.size();
        } while (classCountAfterWalk > classCount);
    }
}
