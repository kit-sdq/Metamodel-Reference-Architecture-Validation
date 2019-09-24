package metamodelcomprehensionextentassessor.actions;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.resources.IProject;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.handlers.HandlerUtil;

import metamodelcomprehensionextentassessor.Assessor;
import metamodelcomprehensionextentassessor.Reporting;
import metamodelcomprehensionextentassessor.exceptions.MetamodelAssessorException;
import metamodelcomprehensionextentassessor.helpers.EclipseHelper;

public abstract class SingleProjectAssessAction extends AbstractHandler {

    protected static final String MODE_PARAM_NAME = "MetamodelAssessor.assessSeries.type";

    private static volatile boolean running = false;
    private Shell shell;
    private Reporting reporting;
    protected Assessor assessor;

    public SingleProjectAssessAction() {
        super();
    }

    @Override
    public Object execute(ExecutionEvent event) {

        shell = HandlerUtil.getActiveShell(event);

        // allow only one analysis at a time
        synchronized (this) {
            if (running) {
                EclipseHelper.prompt("An analysis is already running. Please wait for it to finish.", shell);
                return null;
            }
            running = true;
        }

        // setup reporting
        reporting = new Reporting(shell);
        Reporting.setCurrentReporting(reporting);

        // get and ensure selection
        IStructuredSelection selection = (IStructuredSelection) HandlerUtil.getActiveMenuSelection(event);
        if (selection.size() != 1) {
            reporting.prompt("Please select exactly one project.");
            running = false;
            return null;
        }

        // get selected project
        IProject project;
        try {
            project = EclipseHelper.getProjectOfSelection(selection);
        } catch (MetamodelAssessorException e) {
            reporting.reportException("Could not get project from selection.", e, false);
            reporting.prompt("Please select a project.");
            running = false;
            return null;
        }

        assessor = new Assessor(project, shell);

        processEventInformation(event);

        // start async execution
        new Thread() {
            @Override
            public void run() {
                asyncExecution();
            }
        }.start();

        return null;
    }

    private void asyncExecution() {

        try {
            dispatchAssessment();
        } catch (MetamodelAssessorException e) {
            reporting.reportExpectedException(e);
        } catch (RuntimeException e) {
            reporting.reportException("An uncaught exception occured. Terminating.", e, true);
        } finally {
            reporting.close();
        }

        running = false;
    }

    protected abstract void processEventInformation(ExecutionEvent event);

    protected abstract void dispatchAssessment() throws MetamodelAssessorException;
}