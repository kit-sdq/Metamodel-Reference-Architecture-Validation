package metamodelassessor.ui.editor;

import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowData;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.wb.swt.ResourceManager;
import org.eclipse.wb.swt.SWTResourceManager;

import metamodelcomprehensionextentassessor.AssessmentInputData;
import metamodelcomprehensionextentassessor.AssessorInitializer;
import metamodelcomprehensionextentassessor.Mode;
import metamodelcomprehensionextentassessor.helpers.EclipseHelper;
import metamodelcomprehensionextentassessor.metamodelhandles.MetamodelHandle;
import metamodelcomprehensionextentassessor.metamodelhandles.MpcmHandle;
import metamodelcomprehensionextentassessor.metamodelhandles.MultipleModularMetamodelsHandle;
import metamodelcomprehensionextentassessor.metamodelhandles.PcmHandle;
import metamodelcomprehensionextentassessor.metamodelhandles.PrefixMetamodelHandle;
import metamodelcomprehensionextentassessor.metamodelhandles.SelectionMetamodelHandle;

public class ConfigComposite extends Composite {

    private static final String MODEL_EXPLORERE_VIEW_ID = "org.eclipse.sirius.ui.tools.views.model.explorer";
    private static final String PREFIX_TEXTBOX_DEFAULT_TEXT = "Project Prefix";
    private static final String CUSTOM_RADIO_BUTTON_LABEL = "Custom";

    private Button btnStart;
    private Text txtProjectPrefix1;
    private Text txtProjectPrefix2;
    private Button btnExtension;
    private Button btnModification;
    private Button btnModel;
    private Button btnMetamodel;
    private Button btnRadioButtonPcm1;
    private Button btnRadioButtonMpcm1;
    private Button btnRadioButtonCustom1;
    private Button btnRadioButtonPcm2;
    private Button btnRadioButtonMpcm2;
    private Button btnRadioButtonCustom2;
    private CLabel lblTooltipMod;
    private CLabel lblTooltipExt;
    private CLabel lblTooltipModel;
    private CLabel lblTooltipComparison;
    private CLabel lblTooltipMetamodel;
    private CLabel lblTooltipSingleMetamodel;
    private Button btnSingleMetamodel;
    private Button btnSingleFromTxt;
    private Button btnSingleExtension;
    private Button btnMultiMetamodel;
    private CLabel lblTooltipMultiMetamodel;

    public ConfigComposite(Composite parent) {
        super(parent, SWT.NO_FOCUS);
        setBackground(SWTResourceManager.getColor(240, 240, 240));
        addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                btnStart.setFocus();
            }
        });
        setLayout(new RowLayout(SWT.VERTICAL));

        Group grpMode = new Group(this, SWT.NONE);
        grpMode.setText("Mode");
        GridLayout gl_grpMode = new GridLayout(2, false);
        grpMode.setLayout(gl_grpMode);

        Label lblComparison = new Label(grpMode, SWT.NONE);
        lblComparison.setText("Comparison");

        lblTooltipComparison = new CLabel(grpMode, SWT.NONE);
        lblTooltipComparison.setToolTipText(
                "Compares assessments of two metamodels. With the exception of \"Metamodel\", an input project has to be selected in the project or model explorer. It is strongly advised to put the original metamodel first (e.g., due to match exceptions).");
        lblTooltipComparison.setText("");
        lblTooltipComparison.setImage(ResourceManager.getPluginImage("metamodelassessor.ui", "icons/information.gif"));

        btnExtension = new Button(grpMode, SWT.RADIO);
        btnExtension.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                setMetamodelSpecificationEnabled(true);
            }
        });
        btnExtension.setSelection(true);
        btnExtension.setText("Extension");

        lblTooltipExt = new CLabel(grpMode, SWT.NONE);
        lblTooltipExt.setToolTipText(
                "First, an extension is evaluated. The referenced metamodels are assessed. Then, the extended class list is transfered to the other metamodel.\r\n\r\nThe declaration of the first metamodel is currently only for documentation. Actually, the referenced metamodels are used. Currently there are no incoming dependencies evaluated. So, this is sufficient.");
        lblTooltipExt.setText("");
        lblTooltipExt.setImage(ResourceManager.getPluginImage("metamodelassessor.ui", "icons/information.gif"));

        btnModification = new Button(grpMode, SWT.RADIO);
        btnModification.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                setMetamodelSpecificationEnabled(true);
            }
        });
        btnModification.setText("Modification");

        lblTooltipMod = new CLabel(grpMode, SWT.NONE);
        lblTooltipMod.setToolTipText("A changelist in the form of a textfile is applied to both metamodels.");
        lblTooltipMod.setImage(ResourceManager.getPluginImage("metamodelassessor.ui", "icons/information.gif"));
        lblTooltipMod.setText("");

        btnModel = new Button(grpMode, SWT.RADIO);
        btnModel.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                setMetamodelSpecificationEnabled(true);
            }
        });
        btnModel.setText("Model");

        lblTooltipModel = new CLabel(grpMode, SWT.NONE);
        lblTooltipModel.setToolTipText(
                "The list of instanciated classes is determined from the model. From this list, the utilization is assessed for both metamodels. An 'exceptions.txt' file can be placed in the base folder of the project that holds the models.");
        lblTooltipModel.setText("");
        lblTooltipModel.setImage(ResourceManager.getPluginImage("metamodelassessor.ui", "icons/information.gif"));

        btnMetamodel = new Button(grpMode, SWT.RADIO);
        btnMetamodel.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                setMetamodelSpecificationEnabled(true);
            }
        });
        btnMetamodel.setText("Metamodel");

        lblTooltipMetamodel = new CLabel(grpMode, SWT.NONE);
        lblTooltipMetamodel.setToolTipText(
                "Computes various information for two modular metamodels (module dependencies, allen metrics for the module and package graphs). The metamodels must be specified below. No selection in a explorer view is necessary.");
        lblTooltipMetamodel.setText("");
        lblTooltipMetamodel.setImage(ResourceManager.getPluginImage("metamodelassessor.ui", "icons/information.gif"));

        Label lblSingleMetamodel = new Label(grpMode, SWT.NONE);
        lblSingleMetamodel.setText("Single Metamodel");
        new Label(grpMode, SWT.NONE);

        btnSingleExtension = new Button(grpMode, SWT.RADIO);
        btnSingleExtension.setEnabled(false);
        btnSingleExtension.setText("Extension");
        new Label(grpMode, SWT.NONE);

        btnSingleFromTxt = new Button(grpMode, SWT.RADIO);
        btnSingleFromTxt.setEnabled(false);
        btnSingleFromTxt.setText("From Class Names");
        new Label(grpMode, SWT.NONE);

        btnSingleMetamodel = new Button(grpMode, SWT.RADIO);
        btnSingleMetamodel.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                setMetamodelSpecificationEnabled(false);
            }
        });
        btnSingleMetamodel.setText("Metamodel");

        lblTooltipSingleMetamodel = new CLabel(grpMode, SWT.NONE);
        lblTooltipSingleMetamodel.setToolTipText(
                "Computes various information for a modular metamodel (module dependencies, allen metrics for the module and package graphs). The selection in the model or package explorer is used. Multiple selections are possible. The selection is recursively searched for metamodels.");
        lblTooltipSingleMetamodel.setText("");
        lblTooltipSingleMetamodel.setImage(ResourceManager.getPluginImage("metamodelassessor.ui", "icons/information.gif"));

        btnMultiMetamodel = new Button(grpMode, SWT.RADIO);
        btnMultiMetamodel.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                setMetamodelSpecificationEnabled(false);
            }
        });
        btnMultiMetamodel.setText("Metamodel Folders");

        lblTooltipMultiMetamodel = new CLabel(grpMode, SWT.NONE);
        lblTooltipMultiMetamodel.setToolTipText(
                "Computes various information for metamodels (module dependencies, allen metrics for the module and package graphs). The selection in the model or package explorer is used. Multiple selections are possible. The selection is recursively searched for folders that contain metamodels. All metamodels per folder are treated as one modular metamodel.");
        lblTooltipMultiMetamodel.setText("");
        lblTooltipMultiMetamodel.setImage(ResourceManager.getPluginImage("metamodelassessor.ui", "icons/information.gif"));

        Group grpMetamodel1 = new Group(this, SWT.NONE);
        grpMetamodel1.setText("Metamodel 1");
        grpMetamodel1.setLayout(new GridLayout(2, false));

        btnRadioButtonPcm1 = new Button(grpMetamodel1, SWT.RADIO);
        btnRadioButtonPcm1.setSelection(true);
        btnRadioButtonPcm1.setText("PCM");
        new Label(grpMetamodel1, SWT.NONE);

        btnRadioButtonMpcm1 = new Button(grpMetamodel1, SWT.RADIO);
        btnRadioButtonMpcm1.setText("mPCM");
        new Label(grpMetamodel1, SWT.NONE);

        btnRadioButtonCustom1 = new Button(grpMetamodel1, SWT.RADIO);
        btnRadioButtonCustom1.setLayoutData(new GridData(SWT.LEFT, SWT.TOP, false, false, 1, 1));
        btnRadioButtonCustom1.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                if (((Button) e.widget).getSelection())
                    txtProjectPrefix1.setFocus();
            }
        });
        btnRadioButtonCustom1.setText(CUSTOM_RADIO_BUTTON_LABEL);

        FocusAdapter textBoxListener = new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                // set radio buttons
                Control[] controls = ((Control) e.widget).getParent().getChildren();
                for (Control control : controls) {
                    if (control instanceof Button) {
                        Button button = (Button) control;
                        boolean set = button.getText().equals(CUSTOM_RADIO_BUTTON_LABEL);
                        if (set) {
                            Text textBox = (Text) e.widget;
                            if (textBox.getText().equals(PREFIX_TEXTBOX_DEFAULT_TEXT))
                                textBox.setText("");
                        }
                        button.setSelection(set);
                    }
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                Text textBox = (Text) e.widget;
                if (textBox.getText().equals(""))
                    textBox.setText(PREFIX_TEXTBOX_DEFAULT_TEXT);
            }
        };

        txtProjectPrefix1 = new Text(grpMetamodel1, SWT.BORDER);
        GridData gd_txtProjectPrefix1 = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
        gd_txtProjectPrefix1.widthHint = 250;
        txtProjectPrefix1.setLayoutData(gd_txtProjectPrefix1);
        txtProjectPrefix1.addFocusListener(textBoxListener);
        txtProjectPrefix1.setText(PREFIX_TEXTBOX_DEFAULT_TEXT);

        Group grpMetamodel2 = new Group(this, SWT.NONE);
        grpMetamodel2.setText("Metamodel 2");
        grpMetamodel2.setLayout(new GridLayout(2, false));

        btnRadioButtonPcm2 = new Button(grpMetamodel2, SWT.RADIO);
        btnRadioButtonPcm2.setText("PCM");
        new Label(grpMetamodel2, SWT.NONE);

        btnRadioButtonMpcm2 = new Button(grpMetamodel2, SWT.RADIO);
        btnRadioButtonMpcm2.setSelection(true);
        btnRadioButtonMpcm2.setText("mPCM");
        new Label(grpMetamodel2, SWT.NONE);

        btnRadioButtonCustom2 = new Button(grpMetamodel2, SWT.RADIO);
        btnRadioButtonCustom2.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                if (((Button) e.widget).getSelection())
                    txtProjectPrefix2.setFocus();
            }
        });
        btnRadioButtonCustom2.setLayoutData(new GridData(SWT.LEFT, SWT.TOP, false, false, 1, 1));
        btnRadioButtonCustom2.setText(CUSTOM_RADIO_BUTTON_LABEL);

        txtProjectPrefix2 = new Text(grpMetamodel2, SWT.BORDER);
        GridData gd_txtProjectPrefix2 = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
        gd_txtProjectPrefix2.widthHint = 250;
        txtProjectPrefix2.setLayoutData(gd_txtProjectPrefix2);
        txtProjectPrefix2.addFocusListener(textBoxListener);
        txtProjectPrefix2.setText(PREFIX_TEXTBOX_DEFAULT_TEXT);

        btnStart = new Button(this, SWT.NONE);
        btnStart.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                buttonHandler();
            }
        });
        btnStart.setLayoutData(new RowData(50, SWT.DEFAULT));
        btnStart.setText("Start");
    }

    protected void setMetamodelSpecificationEnabled(boolean enabled) {
        btnRadioButtonPcm1.setEnabled(enabled);
        btnRadioButtonPcm2.setEnabled(enabled);
        btnRadioButtonMpcm1.setEnabled(enabled);
        btnRadioButtonMpcm2.setEnabled(enabled);
        btnRadioButtonCustom1.setEnabled(enabled);
        btnRadioButtonCustom2.setEnabled(enabled);
        txtProjectPrefix1.setEnabled(enabled);
        txtProjectPrefix2.setEnabled(enabled);
    }

    private void buttonHandler() {
        IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
        Shell shell = window.getShell();
        IWorkbenchPage page = window.getActivePage();

        // set mode
        Mode mode;
        if (btnExtension.getSelection()) {
            mode = Mode.EXT_SERIES;
        } else if (btnModification.getSelection()) {
            mode = Mode.MOD_SERIES;
        } else if (btnModel.getSelection()) {
            mode = Mode.MODEL_SERIES;
        } else if (btnMetamodel.getSelection()) {
            mode = Mode.METAMODEL_COMPARISON;
        } else if (btnSingleMetamodel.getSelection()) {
            mode = Mode.METAMODEL;
        } else if (btnMultiMetamodel.getSelection()) {
            mode = Mode.METAMODELS;
        } else {
            throw new RuntimeException("Non of the expected radio buttons were selected.");
        }

        MetamodelHandle target1 = null;
        if (mode.needsTargetMetamodel1()) {
            if (btnRadioButtonPcm1.getSelection()) {
                target1 = new PcmHandle();
            } else if (btnRadioButtonMpcm1.getSelection()) {
                target1 = new MpcmHandle();
            } else {
                target1 = new PrefixMetamodelHandle(txtProjectPrefix1.getText());
            }
        }

        MetamodelHandle target2 = null;
        if (mode.needsTargetMetamodel2()) {
            if (btnRadioButtonPcm2.getSelection()) {
                target2 = new PcmHandle();
            } else if (btnRadioButtonMpcm2.getSelection()) {
                target2 = new MpcmHandle();
            } else {
                target2 = new PrefixMetamodelHandle(txtProjectPrefix2.getText());
            }
        }

        IStructuredSelection selection = null;
        if (mode.expectedExplorerSelection() != Mode.ExplorerSelection.NONE) {
            selection = getSelectionFromView(page, MODEL_EXPLORERE_VIEW_ID);
            if (selection == null || selection.size() == 0) {
                EclipseHelper.prompt("This analysis requires a selection. Please perform a selection in the model explorer.", shell);
            }

            if (mode == Mode.METAMODEL) {
                target1 = new SelectionMetamodelHandle(selection);
            } else if (mode == Mode.METAMODELS) {
                target1 = new MultipleModularMetamodelsHandle(selection);
            }
        }

        AssessmentInputData data = new AssessmentInputData(mode, selection, target1, target2);
        new AssessorInitializer().execute(data, shell);
    }

    private IStructuredSelection getSelectionFromView(IWorkbenchPage page, String viewId) {
        IStructuredSelection packageExplorerSelection;
        IViewPart view = page.findView(viewId);
        if (view == null) {
            packageExplorerSelection = null;
        } else {
            ISelectionProvider selProvider = view.getSite().getSelectionProvider();
            packageExplorerSelection = (IStructuredSelection) selProvider.getSelection();
        }
        return packageExplorerSelection;
    }

    @Override
    protected void checkSubclass() {
        // Disable the check that prevents subclassing of SWT components
    }
}
