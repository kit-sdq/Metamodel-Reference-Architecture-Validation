package metamodelcomprehensionextentassessor;

import org.eclipse.jface.viewers.IStructuredSelection;

import metamodelcomprehensionextentassessor.metamodelhandles.MetamodelHandle;

public class AssessmentInputData {
    private Mode mode;
    private IStructuredSelection selection;
    private MetamodelHandle target1;
    private MetamodelHandle target2;

    public Mode getMode() {
        return mode;
    }

    public IStructuredSelection getSelection() {
        assert mode.expectedExplorerSelection() != Mode.ExplorerSelection.NONE;
        return selection;
    }

    public MetamodelHandle getTarget1() {
        assert mode.needsTargetMetamodel1();
        return target1;
    }

    public MetamodelHandle getTarget2() {
        assert mode.needsTargetMetamodel2();
        return target2;
    }

    public AssessmentInputData(Mode mode, IStructuredSelection selection, MetamodelHandle target1, MetamodelHandle target2) {
        this.mode = mode;
        this.selection = selection;
        this.target1 = target1;
        this.target2 = target2;
    }
}