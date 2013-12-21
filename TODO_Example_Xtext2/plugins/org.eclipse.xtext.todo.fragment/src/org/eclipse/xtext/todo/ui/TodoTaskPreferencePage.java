package org.eclipse.xtext.todo.ui;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Link;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.jface.dialogs.ControlEnableState;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.preference.PreferencePage;
import org.eclipse.jface.window.Window;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;
import org.eclipse.ui.IWorkbenchPropertyPage;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.PreferencesUtil;
import org.eclipse.ui.preferences.IWorkbenchPreferenceContainer;
import org.eclipse.xtext.todo.Activator;

public class TodoTaskPreferencePage extends PreferencePage implements IWorkbenchPreferencePage, IWorkbenchPropertyPage {
	public static final String PREFIX= Activator.PLUGIN_ID + '.';
	public static final String TODOTASK_PROPERTY_PAGE= PREFIX + "tasktags_property_page_context"; //$NON-NLS-1$
	public static final String TODOTASK_PREFERENCE_PAGE= PREFIX + "tasktags_preference_page_context"; //$NON-NLS-1$
	public static final String TODO_TASK_INPUT_DIALOG= PREFIX + "todo_task_input_dialog_context"; //$NON-NLS-1$

	public static final String DATA_NO_LINK= "PropertyAndPreferencePage.nolink"; //$NON-NLS-1$

	public static final String PREF_ID= "org.eclipse.jdt.ui.preferences.TodoTaskPreferencePage"; //$NON-NLS-1$
	public static final String PROP_ID= "org.eclipse.jdt.ui.propertyPages.TodoTaskPreferencePage"; //$NON-NLS-1$
	public static final String TASK_TAG_INPUT_DIALOG= PREFIX + "todo_task_input_dialog_context"; //$NON-NLS-1$

	private Control fConfigurationBlockControl;
	private ControlEnableState fBlockEnableState;
	private Link fChangeWorkspaceSettings;
	private SelectionButtonDialogField fUseProjectSettings;
	private IStatus fBlockStatus;
	private Composite fParentComposite;

	private IProject fProject; // project or null
	private Map<String, Object> fData; // page data

	private TodoTaskConfigurationBlock fConfigurationBlock;

	public TodoTaskPreferencePage() {
		fBlockStatus= new StatusInfo();
		fBlockEnableState= null;
		fProject= null;
		fData= null;

		setPreferenceStore(Activator.getDefault().getPreferenceStore());
		setDescription(PreferencesMessages.TodoTaskPreferencePage_description);

		// only used when page is shown programatically
		setTitle(PreferencesMessages.TodoTaskPreferencePage_title);
	}

	protected boolean supportsProjectSpecificOptions() {
		return getPropertyPageID() != null;
	}

	protected boolean offerLink() {
		return fData == null || !Boolean.TRUE.equals(fData.get(DATA_NO_LINK));
	}

    @Override
	protected Label createDescriptionLabel(Composite parent) {
		fParentComposite= parent;
		if (isProjectPreferencePage()) {
			Composite composite= new Composite(parent, SWT.NONE);
			composite.setFont(parent.getFont());
			GridLayout layout= new GridLayout();
			layout.marginHeight= 0;
			layout.marginWidth= 0;
			layout.numColumns= 2;
			composite.setLayout(layout);
			composite.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));

			IDialogFieldListener listener= new IDialogFieldListener() {
				public void dialogFieldChanged(DialogField field) {
					boolean enabled= ((SelectionButtonDialogField) field).isSelected();
					enableProjectSpecificSettings(enabled);

					if (enabled && getData() != null) {
						applyData(getData());
					}
				}
			};

			fUseProjectSettings= new SelectionButtonDialogField(SWT.CHECK);
			fUseProjectSettings.setDialogFieldListener(listener);
			fUseProjectSettings.setLabelText(PreferencesMessages.PropertyAndPreferencePage_useprojectsettings_label);
			fUseProjectSettings.doFillIntoGrid(composite, 1);
			LayoutUtil.setHorizontalGrabbing(fUseProjectSettings.getSelectionButton(null));

			if (offerLink()) {
				fChangeWorkspaceSettings= createLink(composite, PreferencesMessages.PropertyAndPreferencePage_useworkspacesettings_change);
				fChangeWorkspaceSettings.setLayoutData(new GridData(SWT.END, SWT.CENTER, false, false));
			} else {
				LayoutUtil.setHorizontalSpan(fUseProjectSettings.getSelectionButton(null), 2);
			}

			Label horizontalLine= new Label(composite, SWT.SEPARATOR | SWT.HORIZONTAL);
			horizontalLine.setLayoutData(new GridData(GridData.FILL, GridData.FILL, true, false, 2, 1));
			horizontalLine.setFont(composite.getFont());
		} else if (supportsProjectSpecificOptions() && offerLink()) {
			fChangeWorkspaceSettings= createLink(parent, PreferencesMessages.PropertyAndPreferencePage_showprojectspecificsettings_label);
			fChangeWorkspaceSettings.setLayoutData(new GridData(SWT.END, SWT.CENTER, true, false));
		}

		return super.createDescriptionLabel(parent);
    }

	/*
	 * @see org.eclipse.jface.preference.IPreferencePage#createContents(Composite)
	 */
	@Override
	protected Control createContents(Composite parent) {
		Composite composite= new Composite(parent, SWT.NONE);
		GridLayout layout= new GridLayout();
		layout.marginHeight= 0;
		layout.marginWidth= 0;
		composite.setLayout(layout);
		composite.setFont(parent.getFont());

		GridData data= new GridData(GridData.FILL, GridData.FILL, true, true);

		fConfigurationBlockControl= createPreferenceContent(composite);
		fConfigurationBlockControl.setLayoutData(data);

		if (isProjectPreferencePage()) {
			boolean useProjectSettings= hasProjectSpecificOptions(getProject());
			enableProjectSpecificSettings(useProjectSettings);
		}

		Dialog.applyDialogFont(composite);
		return composite;
	}

	private Link createLink(Composite composite, String text) {
		Link link= new Link(composite, SWT.NONE);
		link.setFont(composite.getFont());
		link.setText("<A>" + text + "</A>");  //$NON-NLS-1$//$NON-NLS-2$
		link.addSelectionListener(new SelectionListener() {
			public void widgetSelected(SelectionEvent e) {
				doLinkActivated((Link) e.widget);
			}

			public void widgetDefaultSelected(SelectionEvent e) {
				doLinkActivated((Link) e.widget);
			}
		});
		return link;
	}

	protected boolean useProjectSettings() {
		return isProjectPreferencePage() && fUseProjectSettings != null && fUseProjectSettings.isSelected();
	}

	protected boolean isProjectPreferencePage() {
		return fProject != null;
	}

	protected IProject getProject() {
		return fProject;
	}

	/**
	 * Handle link activation.
	 *
	 * @param link the link
	 */
	final void doLinkActivated(Link link) {
		Map<String, Object> data= getData();
		if (data == null)
			data= new HashMap<String, Object>();
		data.put(DATA_NO_LINK, Boolean.TRUE);

		if (isProjectPreferencePage()) {
			openWorkspacePreferences(data);
		} else {
			HashSet<IProject> projectsWithSpecifics= new HashSet<IProject>();
			IProject[] projects= ResourcesPlugin.getWorkspace().getRoot().getProjects();
			for (int i= 0; i < projects.length; i++) {
				IProject curr= projects[i];
				if (hasProjectSpecificOptions(curr.getProject())) {
					projectsWithSpecifics.add(curr);
				}
			}
			ProjectSelectionDialog dialog= new ProjectSelectionDialog(getShell(), projectsWithSpecifics);
			if (dialog.open() == Window.OK) {
				IProject res= (IProject) dialog.getFirstResult();
				openProjectProperties(res.getProject(), data);
			}
		}
	}

	protected final void openWorkspacePreferences(Object data) {
		String id= getPreferencePageID();
		PreferencesUtil.createPreferenceDialogOn(getShell(), id, new String[] { id }, data).open();
	}

	protected final void openProjectProperties(IProject project, Object data) {
		String id= getPropertyPageID();
		if (id != null) {
			PreferencesUtil.createPropertyDialogOn(getShell(), project, id, new String[] { id }, data).open();
		}
	}

	private void updateLinkVisibility() {
		if (fChangeWorkspaceSettings == null || fChangeWorkspaceSettings.isDisposed()) {
			return;
		}

		if (isProjectPreferencePage()) {
			fChangeWorkspaceSettings.setEnabled(!useProjectSettings());
		}
	}


	protected void setPreferenceContentStatus(IStatus status) {
		fBlockStatus= status;
		doStatusChanged();
	}

	/**
	 * Returns a new status change listener that calls {@link #setPreferenceContentStatus(IStatus)}
	 * when the status has changed
	 * @return The new listener
	 */
	protected IStatusChangeListener getNewStatusChangedListener() {
		return new IStatusChangeListener() {
			public void statusChanged(IStatus status) {
				setPreferenceContentStatus(status);
			}
		};
	}

	protected IStatus getPreferenceContentStatus() {
		return fBlockStatus;
	}

	protected void doStatusChanged() {
		if (!isProjectPreferencePage() || useProjectSettings()) {
			updateStatus(fBlockStatus);
		} else {
			updateStatus(new StatusInfo());
		}
	}

	protected void enablePreferenceContent(boolean enable) {
		if (enable) {
			if (fBlockEnableState != null) {
				fBlockEnableState.restore();
				fBlockEnableState= null;
			}
		} else {
			if (fBlockEnableState == null) {
				fBlockEnableState= ControlEnableState.disable(fConfigurationBlockControl);
			}
		}
	}

	private void updateStatus(IStatus status) {
		setValid(!status.matches(IStatus.ERROR));
		StatusUtil.applyToStatusLine(this, status);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.IWorkbenchPreferencePage#init(org.eclipse.ui.IWorkbench)
	 */
	public void init(IWorkbench workbench) {
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.IWorkbenchPropertyPage#getElement()
	 */
	public IAdaptable getElement() {
		return fProject;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.IWorkbenchPropertyPage#setElement(org.eclipse.core.runtime.IAdaptable)
	 */
	public void setElement(IAdaptable element) {
		fProject= (IProject) element.getAdapter(IResource.class);
	}


	/* (non-Javadoc)
	 * @see org.eclipse.jface.preference.PreferencePage#applyData(java.lang.Object)
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void applyData(Object data) {
		if (data instanceof Map) {
			fData= (Map<String, Object>) data;
		}
		if (fChangeWorkspaceSettings != null) {
			if (!offerLink()) {
				fChangeWorkspaceSettings.dispose();
				fParentComposite.layout(true, true);
			}
		}
 	}

	protected Map<String, Object> getData() {
		return fData;
	}


	/*
	 * @see org.eclipse.jface.dialogs.IDialogPage#createControl(org.eclipse.swt.widgets.Composite)
	 */
	@Override
	public void createControl(Composite parent) {
		IWorkbenchPreferenceContainer container= (IWorkbenchPreferenceContainer) getContainer();
		fConfigurationBlock= new TodoTaskConfigurationBlock(getNewStatusChangedListener(), getProject(), container);

		super.createControl(parent);

		if (isProjectPreferencePage()) {
			PlatformUI.getWorkbench().getHelpSystem().setHelp(getControl(), TODOTASK_PROPERTY_PAGE);
		} else {
			PlatformUI.getWorkbench().getHelpSystem().setHelp(getControl(), TODOTASK_PREFERENCE_PAGE);
		}
	}

	protected Control createPreferenceContent(Composite composite) {
		return fConfigurationBlock.createContents(composite);
	}

	protected boolean hasProjectSpecificOptions(IProject project) {
		return fConfigurationBlock.hasProjectSpecificOptions(project);
	}


	protected String getPreferencePageID() {
		return PREF_ID;
	}

	protected String getPropertyPageID() {
		return PROP_ID;
	}

	protected void enableProjectSpecificSettings(boolean useProjectSpecificSettings) {
		fUseProjectSettings.setSelection(useProjectSpecificSettings);
		enablePreferenceContent(useProjectSpecificSettings);
		updateLinkVisibility();
		doStatusChanged();
		if (fConfigurationBlock != null) {
			fConfigurationBlock.useProjectSpecificSettings(useProjectSpecificSettings);
		}
	}

	/*
	 * @see org.eclipse.jface.preference.IPreferencePage#performDefaults()
	 */
	@Override
	protected void performDefaults() {
		super.performDefaults();
		if (fConfigurationBlock != null) {
			fConfigurationBlock.performDefaults();
		}
	}

	/*
	 * @see org.eclipse.jface.preference.IPreferencePage#performOk()
	 */
	@Override
	public boolean performOk() {
		if (fConfigurationBlock != null && !fConfigurationBlock.performOk()) {
			return false;
		}
		return super.performOk();
	}

	/*
	 * @see org.eclipse.jface.preference.IPreferencePage#performApply()
	 */
	@Override
	public void performApply() {
		if (fConfigurationBlock != null) {
			fConfigurationBlock.performApply();
		}
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.dialogs.DialogPage#dispose()
	 */
	@Override
	public void dispose() {
		if (fConfigurationBlock != null) {
			fConfigurationBlock.dispose();
		}
		super.dispose();
	}
}