package metamodelcomprehensionextentassessor.actions;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.resources.IProject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.handlers.HandlerUtil;

import metamodelcomprehensionextentassessor.Assessor;
import metamodelcomprehensionextentassessor.Reporting;
import metamodelcomprehensionextentassessor.exceptions.MetamodelAssessorException;
import metamodelcomprehensionextentassessor.helpers.EclipseHelper;

public abstract class AbstractAssessAction extends AbstractHandler {

    @Override
    public Object execute(ExecutionEvent event) {
        // template method pattern

        Reporting reporting = null;
        try {
            // setup user reporting
            Shell shell = HandlerUtil.getActiveShell(event);
            reporting = new Reporting(shell);
            Reporting.setCurrentReporting(reporting);

            // get fileselection from context menu
            IStructuredSelection selection = (IStructuredSelection) HandlerUtil.getActiveMenuSelection(event);
            IProject project = EclipseHelper.getProjectOfSelection(selection); // project of the "first" selection. only needed by aet

            ResourceSet resourceSet = loadResources(selection);

            Assessor assessor = new Assessor(project, shell);
            dispatchAssessment(event, resourceSet, assessor);
        } catch (MetamodelAssessorException e) {
            reporting.reportExpectedException(e);
        } catch (RuntimeException e) {
            reporting.reportException("An uncaught exception occured. Terminating.", e, true);
        }

        reporting.close();
        return null;
    }

    protected abstract ResourceSet loadResources(IStructuredSelection selection) throws MetamodelAssessorException;

    protected abstract void dispatchAssessment(ExecutionEvent event, ResourceSet resourceSet, Assessor assessor) throws MetamodelAssessorException;
}