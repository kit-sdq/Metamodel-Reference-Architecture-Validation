package metamodelcomprehensionextentassessor;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Shell;

import metamodelcomprehensionextentassessor.exceptions.MetamodelAssessorException;
import metamodelcomprehensionextentassessor.helpers.EclipseHelper;

public class AssessorInitializer {

    protected static final String MODE_PARAM_NAME = "MetamodelAssessor.assessSeries.type";

    private static volatile boolean running = false;

    public void execute(AssessmentInputData data, Shell shell) {

        // allow only one analysis at a time
        synchronized (this) {
            if (running) {
                preReportingPrompt("An analysis is already running. Please wait for it to finish.");
                return;
            }
            running = true;
        }

        // start async execution
        new Thread() {
            @Override
            public void run() {
                asyncExecution(data, shell);
            }
        }.start();
    }

    private void preReportingPrompt(String message) {
        Shell shell = EclipseHelper.getShell();
        MessageDialog.openInformation(shell, "Metamodel Assessor", message);
        System.out.println(message);
    }

    private void asyncExecution(AssessmentInputData data, Shell shell) {

        // setup reporting
        Reporting reporting = new Reporting(shell);
        Reporting.setCurrentReporting(reporting);

        try {
            Assessor assessor = new Assessor(shell);
            dispatch(data, assessor);
            reporting.promptAndLog("Analysis done");
        } catch (MetamodelAssessorException e) {
            reporting.reportExpectedException(e);
        } catch (RuntimeException e) {
            reporting.reportException("An unexpected exception occured. Terminating.", e, true);
        } finally {
            reporting.flushPrompts();
            reporting.close();
            running = false;
        }
    }

    private void dispatch(AssessmentInputData data, Assessor assessor) throws MetamodelAssessorException {
        if (data.getMode().isSeries()) {
            assessor.compareSeries(data);
        } else if (data.getMode() == Mode.METAMODEL_COMPARISON) {
            assessor.compareMetamodels(data);
        } else if (data.getMode() == Mode.METAMODEL) {
            assessor.assessSingleMetamodel(data);
        } else if (data.getMode() == Mode.METAMODELS) {
            assessor.assessMultipleMetamodel(data);
        } else {
            throw new RuntimeException("Unexpected assessment mode!");
        }
    }
}
