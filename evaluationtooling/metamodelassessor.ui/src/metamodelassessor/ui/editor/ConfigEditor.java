package metamodelassessor.ui.editor;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IPersistableElement;
import org.eclipse.ui.part.EditorPart;

public class ConfigEditor extends EditorPart {

    @Override
    public void doSave(IProgressMonitor monitor) {
    }

    @Override
    public void doSaveAs() {
    }

    @Override
    public void init(IEditorSite site, IEditorInput input) {
        setSite(site);
        setInput(input);
    }

    @Override
    public boolean isDirty() {
        return false;
    }

    @Override
    public boolean isSaveAsAllowed() {
        return false;
    }

    @Override
    public void createPartControl(Composite parent) {
        new ConfigComposite(parent);
    }

    @Override
    public void setFocus() {
    }

    public static class ConfigEditorInput implements IEditorInput {

        @Override
        public <T> T getAdapter(Class<T> adapter) {
            return null;
        }

        @Override
        public boolean exists() {
            return true;
        }

        @Override
        public ImageDescriptor getImageDescriptor() {
            // TODO Auto-generated method stub
            return null;
        }

        @Override
        public String getName() {
            return "Metamodel Assessor Config Editor Input";
        }

        @Override
        public IPersistableElement getPersistable() {
            return null;
        }

        @Override
        public String getToolTipText() {
            return "Metamodel Assessor Config Editor Input";
        }

        @Override
        public boolean equals(Object obj) {
            return obj instanceof ConfigEditorInput;
        }
    }
}
