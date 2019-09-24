package metamodelcomprehensionextentassessor;

import org.eclipse.core.runtime.IPath;

import metamodelcomprehensionextentassessor.metamodelhandles.MetamodelHandle;

public class AnalysisContext {

    private final String basePath;
    private String runName;
    private MetamodelHandle metamodelHandle;
    private int logNumber;

    public String getCurrentRunName() {
        return runName;
    }

    public MetamodelHandle getMetamodel() {
        return metamodelHandle;
    }

    public AnalysisContext(String basePath) {
        this.basePath = basePath;
        runName = null;
        logNumber = 0;
    }

    public void reset() {
        runName = null;
        metamodelHandle = null;
        logNumber = 0;
    }

    public void startNewRun(String name) {
        if (!name.equalsIgnoreCase(runName)) {
            metamodelHandle = null;
            logNumber = 0;
            runName = name;
        }
    }

    public String getCurrentPath() {
        if (runName == null) {
            return basePath;
        } else {
            return basePath + IPath.SEPARATOR + runName;
        }
    }

    public void setMetamodel(MetamodelHandle metamodelHandle) {
        this.metamodelHandle = metamodelHandle;
    }

    public void incrementLogFileNumber() {
        logNumber++;
    }

    public String getCurrentLogfilePath() {
        StringBuilder path = new StringBuilder();
        path.append(getCurrentPath()).append(IPath.SEPARATOR);

        if (metamodelHandle != null) {
            path.append(metamodelHandle);
        } else {
            path.append("log");
        }

        if (logNumber > 0) {
            path.append(logNumber);
        }

        path.append(".txt");
        return path.toString();
    }

    public String createFilenameInCurrentDir(String fileName) {
        return getCurrentPath() + IPath.SEPARATOR + fileName;
    }

    public String createFilenameInBaseDir(String fileName) {
        return basePath + IPath.SEPARATOR + fileName;
    }
}
