package metamodelcomprehensionextentassessor;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.swt.widgets.Shell;

import de.cau.cs.se.software.evaluation.views.AnalysisResultModelProvider;
import de.cau.cs.se.software.evaluation.views.NamedValue;
import metamodelcomprehensionextentassessor.exceptions.MetamodelAssessorException;
import metamodelcomprehensionextentassessor.helpers.EclipseHelper;
import metamodelcomprehensionextentassessor.helpers.JavaHelper;
import metamodelcomprehensionextentassessor.metamodelhandles.MetamodelHandle;

public class Reporting {

    private static final String ANALYSIS_SEPARATOR = "________________________________________________________________________________";
    private static final String MULTILINE_SEPARATOR = "################################################################################";
    private static final String RESULTS_FOLDER_PREFIX = "results";

    private static Reporting currentReporting;

    public static void setCurrentReporting(Reporting reporting) {
        currentReporting = reporting;
    }

    public static Reporting getCurrentReporting() {
        return currentReporting;
    }

    private final Shell shell;
    private final IProject resultsProject;
    private final AnalysisContext context;
    private PrintWriter printWriter;
    private CsvSummary csvSummary;
//    private StringBuilder csvSummary;
    private final Set<String> prompts;

    private String lastLogPath; //this is used only to detect changes in the log path

    public Reporting(Shell shell) {

        this.shell = shell;

        csvSummary = new CsvSummary();
        printWriter = null;
        prompts = new HashSet<String>();

        // determine results project
        IProject[] projects = ResourcesPlugin.getWorkspace().getRoot().getProjects();
        resultsProject = Arrays.stream(projects).filter(project -> project.getName().equalsIgnoreCase("metamodelassessor.results")).findFirst().get();
        String projectPath = resultsProject.getLocation().toOSString();

        // determine and create analysis base dir
        String nextFreeDir = findNextFreeDirPath(projectPath);
        new File(nextFreeDir).mkdir();

        context = new AnalysisContext(nextFreeDir);
    }

    public AnalysisContext getContext() {
        return context;
    }

    /**
     * Iterates over the subdirectories and looks which number is the first one, for which the
     * foldername <code>subDirPrefix+number</code> does not exist.
     * 
     * @param basePath
     *            the path to the directory whose subdirectories should be targeted
     * @throws MetamodelAssessorException
     */
    private String findNextFreeDirPath(final String basePath) {
        final File dir = new File(basePath);
        List<String> subDirNames = Arrays.stream(dir.listFiles()).filter(File::isDirectory).map(File::getName).collect(Collectors.toList());
        for (int i = 1; i < Integer.MAX_VALUE; i++) {
            boolean exists = false;

            // look if directory exists
            for (String subDirName : subDirNames) {
                if (subDirName.equals(RESULTS_FOLDER_PREFIX + i)) {
                    exists = true;
                    break;
                }
            }

            if (!exists) {
                return basePath + IPath.SEPARATOR + RESULTS_FOLDER_PREFIX + i;
            }
        }
        throw new RuntimeException("Experiment numbers exhausted!?");
    }

    private void ensureLogWriter() {
        String currentLogPath = context.getCurrentLogfilePath();
        if (!currentLogPath.equalsIgnoreCase(lastLogPath)) {

            // ensure directory
            File currentDir = new File(context.getCurrentPath());
            if (!currentDir.exists()) {
                currentDir.mkdir();
            }

            if (printWriter != null) {
                close();
            }

            // setup print writer
            try {
                printWriter = new PrintWriter(new FileWriter(currentLogPath, true));
            } catch (IOException e) {
                throw new RuntimeException("Cannot write on file " + currentLogPath);
            }

            lastLogPath = currentLogPath;

            System.out.println(ANALYSIS_SEPARATOR);
            logTimestamp();
        }
    }

    public void logTimestamp() {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        message(dateFormat.format(new Date()));
    }

    public void message(String message) {
        if (message.contains("\n")) {
            message = new StringBuilder().append(MULTILINE_SEPARATOR).append('\n').append(message).append('\n').append(MULTILINE_SEPARATOR).toString();
        }

        ensureLogWriter();
        System.out.println(message);
        printWriter.println(message);
    }

    public void promptAndLog(String message) {
        message(message);
        prompts.add(message);
    }

    public void reportToFile(String fileName, String content, String name) {
        reportToPath(context.createFilenameInCurrentDir(fileName), content, name);
    }

    public void reportToPath(String filePath, String content, String name) {
        message("Persisting " + name + " to text file " + filePath);
        try {
            final PrintWriter printWriter = new PrintWriter(new FileWriter(filePath, false));
            printWriter.print(content);
            printWriter.close();

        } catch (IOException e) {
            promptAndLog("Could not write to File: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public void close() {
        if (printWriter != null) {
            printWriter.close();
            try {
                resultsProject.refreshLocal(IResource.DEPTH_INFINITE, null);
            } catch (CoreException e) {
                System.out.println("Could not referesh results project.");
                e.printStackTrace();
            }
        }
    }

    public void reportException(String message, Exception e, boolean prompt) {
        String messageBeginning = "ERROR: " + message + '\n';
        if (prompt)
            prompts.add(messageBeginning + e.toString());
        message(messageBeginning + JavaHelper.stackTraceToString(e));
    }

    public void reportExpectedException(MetamodelAssessorException e) {
        prompts.add("ERROR: " + e.getMessage());
        message("ERROR: " + JavaHelper.stackTraceToString(e));
    }

    public void persistHypergraphAnalysisResults() {
        MetamodelHandle metamodelHandle = context.getMetamodel();
        try {
            persistCurrentHypergraph(metamodelHandle);
            persistCurrentData(metamodelHandle);
        } catch (Exception e) {
            reportException("Could not persist hypergraph analysis results.", e, true);
        }
    }

    private void persistCurrentHypergraph(MetamodelHandle metamodelHandle) throws Exception {

        final String filePath = context.createFilenameInCurrentDir(metamodelHandle + ".xmi");
        message("Persisting current hypergraph to " + filePath);

        final ResourceSet resourceSet = new ResourceSetImpl();

        // Register XMI Factory implementation to handle .ecore files
        resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());

        // Create empty resource with the given URI
        final Resource resource = resourceSet.createResource(URI.createURI(filePath));

        // Add model to contents list of the resource
        resource.getContents().add(AnalysisResultModelProvider.INSTANCE.getHypergraph());

        // Save the resource
        final File file = new File(filePath);
        final FileOutputStream stream = new FileOutputStream(file);
        resource.save(stream, null);
        stream.close();
    }

    private void persistCurrentData(MetamodelHandle metamodelHandle) {

        // collect results
        final StringBuilder stringBuilder = new StringBuilder();
        for (final NamedValue element : AnalysisResultModelProvider.INSTANCE.getValues()) {
            stringBuilder.append(context.getCurrentRunName()).append(';').append(context.getMetamodel()).append(';').append(element.getPropertyName()).append(';').append(element.getValue())
                    .append('\n');
        }

        // add results to summary
        String csvReport = stringBuilder.toString();
        csvSummary.append(csvReport);

        // save to file
        reportToFile(metamodelHandle + ".csv", csvReport, "current csv data");
    }

    public void appendCsvReport(String row) {
        csvSummary.append(row + '\n');
    }

    public void flushCSVReport(String head) {

        csvSummary.setHeadder(head);

        String fileName = context.createFilenameInBaseDir("summary.csv");
        reportToPath(fileName, csvSummary.getFullReport(), "csv summary");

        csvSummary = new CsvSummary();
    }

    public void flushCSVReportWithResultClasses(String head) {
        String fileName;

        csvSummary.setHeadder(head);

        // print full report
        fileName = context.createFilenameInBaseDir("summary.csv");
        reportToPath(fileName, csvSummary.getFullReport(), "csv summary");

        // print classed report
        csvSummary.createResultClasses();
        fileName = context.createFilenameInBaseDir("summary classes.csv");
        reportToPath(fileName, csvSummary.getClassReport(), "csv summary classed");

        // print groups
        fileName = context.createFilenameInBaseDir("result classes.txt");
        reportToPath(fileName, csvSummary.getResultClasses(), "result classes");

        csvSummary = new CsvSummary();
    }

    public void reportCollection(String collectionName, Collection<?> collection, boolean inline) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(collectionName);
        stringBuilder.append(" (");
        stringBuilder.append(collection.size());
        stringBuilder.append(')');

        if (collection.size() > 0) {
            String separator;
            if (inline) {
                stringBuilder.append(": ");
                separator = " ";
            } else {
                stringBuilder.append(":\n");
                separator = "\n";
            }
            String collectionToString = collection.stream().map(Object::toString).collect(Collectors.joining(separator));
            stringBuilder.append(collectionToString);
        }

        message(stringBuilder.toString());
    }

    public void flushPrompts() {
        if (prompts.size() > 0) {

            // show dialog
            String promptsDialogText = prompts.stream().collect(Collectors.joining("\n\n"));
            EclipseHelper.prompt(promptsDialogText, shell);

            // report prompts to main log
            context.reset();
            List<String> oneLinePrompts = prompts.stream().map(prompt -> prompt.replace("\n", "; ")).collect(Collectors.toList());
            reportCollection("Prompts summary", oneLinePrompts, false);

            prompts.clear();
        }
    }
}
