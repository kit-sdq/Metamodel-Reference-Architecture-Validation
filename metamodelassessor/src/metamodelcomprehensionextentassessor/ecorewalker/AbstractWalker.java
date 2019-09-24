package metamodelcomprehensionextentassessor.ecorewalker;

import metamodelcomprehensionextentassessor.MetamodelSubgraph;
import metamodelcomprehensionextentassessor.exceptions.MetamodelAnalysisException;

public abstract class AbstractWalker implements IEcoreWalker {

    @Override
    public void walk(MetamodelSubgraph subgraph) throws MetamodelAnalysisException {
        this.walk(subgraph.getRelevantClasses(), subgraph.getRemainingClasses());
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}