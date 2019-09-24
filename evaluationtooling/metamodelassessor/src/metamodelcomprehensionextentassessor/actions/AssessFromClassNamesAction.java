package metamodelcomprehensionextentassessor.actions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.resources.IFile;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;

import metamodelcomprehensionextentassessor.Assessor;
import metamodelcomprehensionextentassessor.MetamodelType;
import metamodelcomprehensionextentassessor.exceptions.MetamodelAnalysisException;
import metamodelcomprehensionextentassessor.exceptions.MetamodelAssessorIoException;

public class AssessFromClassNamesAction extends AbstractAssessAction {

    @Override
    protected ResourceSet loadResources(IStructuredSelection selection) {
        return new ResourceSetImpl();
    }

    @Override
    protected void dispatchAssessment(ExecutionEvent event, ResourceSet resourceSet, Assessor assessor) throws MetamodelAssessorIoException, MetamodelAnalysisException {

        IStructuredSelection selection = (IStructuredSelection) HandlerUtil.getActiveMenuSelection(event);
        Object firstSelection = selection.getFirstElement();
        if (!(firstSelection instanceof IFile)) {
            throw new MetamodelAssessorIoException("The first selection wasn't a file.");
        }

        IFile file = (IFile) firstSelection;

        //read entries
        Path path = file.getLocation().toFile().toPath();
        List<String> entryClassNames;
        try {
            entryClassNames = Files.readAllLines(path);
        } catch (IOException e) {
            throw new MetamodelAssessorIoException("Could not read file with class names.", e);
        }

        // evaluate metamodel parameter
        String metamodelName = event.getParameter("MetamodelAssessor.assessFromClassNames.target");
        MetamodelType metamodel;
        if (metamodelName.equalsIgnoreCase("mPCM")) {
            metamodel = MetamodelType.MPCM;
        } else if (metamodelName.equalsIgnoreCase("PCM")) {
            metamodel = MetamodelType.PCM;
        } else
            throw new RuntimeException("Unknown metamodel: " + metamodelName);

        assessor.assessFromClassNameList(metamodel, entryClassNames);
    }
}
