package metamodelassessor.ui;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.handlers.HandlerUtil;

import metamodelassessor.ui.editor.ConfigEditor.ConfigEditorInput;

public class startUiHandler extends AbstractHandler {

    @Override
    public Object execute(ExecutionEvent event) {

        IWorkbenchPage page = HandlerUtil.getActiveWorkbenchWindow(event).getActivePage();
        try {
            page.openEditor(new ConfigEditorInput(), "metamodelassessor.ui.editor.ConfigEditor");
        } catch (PartInitException e) {
            e.printStackTrace();
        }
        return null;
    }
}
