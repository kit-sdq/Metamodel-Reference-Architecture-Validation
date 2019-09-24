package metamodelassessor.ui;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.wb.swt.ResourceManager;
import org.eclipse.wb.swt.SWTResourceManager;
import org.osgi.framework.BundleContext;

public class Activator extends AbstractUIPlugin {

    @Override
    public void stop(BundleContext context) throws Exception {
        try {
            ResourceManager.dispose();
        } catch (Exception e) {
            System.out.println("ResourceManager failed while disposing its resources.");
            e.printStackTrace();
        }
        try {
            SWTResourceManager.dispose();
        } catch (Exception e) {
            System.out.println("SWTResourceManager failed while disposing its resources.");
            e.printStackTrace();
        }
        super.stop(context);
    }
}
