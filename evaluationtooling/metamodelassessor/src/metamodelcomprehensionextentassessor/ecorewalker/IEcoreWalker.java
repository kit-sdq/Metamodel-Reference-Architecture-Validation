package metamodelcomprehensionextentassessor.ecorewalker;

import metamodelcomprehensionextentassessor.MetamodelSubgraph;
import metamodelcomprehensionextentassessor.exceptions.MetamodelAnalysisException;
import metamodelcomprehensionextentassessor.exceptions.MetamodelAssessorException;
import metamodelcomprehensionextentassessor.helpers.EClassSet;

/**
 * Traverses an ecore metamodel and searches for classes which are reachable depending on the
 * implemented strategy.
 */
public interface IEcoreWalker {

    /**
     * Traverses the metamodel starting from the relevantClasses set and adds classes which are
     * reachable according to the implemented strategy.
     * 
     * @param relevantClasses
     *            in/out: Set of classes from which to start the search. Classes which are found are
     *            added to this list.
     * @param remainingClasses
     *            in/out: Classes which are found during search are removed from this set.
     * @throws MetamodelAssessorException
     */
    void walk(EClassSet relevantClasses, EClassSet remainingClasses) throws MetamodelAnalysisException;

    void walk(MetamodelSubgraph subgraph) throws MetamodelAnalysisException;
}
