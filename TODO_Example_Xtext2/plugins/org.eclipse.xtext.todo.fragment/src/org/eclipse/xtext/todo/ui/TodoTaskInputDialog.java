package org.eclipse.xtext.todo.ui;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.dialogs.StatusDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.eclipse.xtext.todo.ui.TodoTaskConfigurationBlock.TodoTask;

/**
 * Dialog to enter a na new task tag
 */
public abstract class TodoTaskInputDialog extends StatusDialog {
	
	public static final String COMPILER_TASK_PRIORITY_HIGH = "HIGH"; //$NON-NLS-1$
	public static final String COMPILER_TASK_PRIORITY_LOW = "LOW"; //$NON-NLS-1$
	public static final String COMPILER_TASK_PRIORITY_NORMAL = "NORMAL"; //$NON-NLS-1$
	public static final String ENABLED = "enabled"; //$NON-NLS-1$
	public static final String DISABLED = "disabled"; //$NON-NLS-1$

	private class CompilerTodoTaskInputAdapter implements IDialogFieldListener {
		public void dialogFieldChanged(DialogField field) {
			doValidation();
		}
	}

	private StringDialogField fNameDialogField;
	private ComboDialogField fPriorityDialogField;

	private List<String> fExistingNames;

	public TodoTaskInputDialog(Shell parent, TodoTask task, List<TodoTask> existingEntries) {
		super(parent);

		fExistingNames= new ArrayList<String>(existingEntries.size());
		for (int i= 0; i < existingEntries.size(); i++) {
			TodoTask curr= existingEntries.get(i);
			if (!curr.equals(task)) {
				fExistingNames.add(curr.name);
			}
		}

		if (task == null) {
			setTitle(PreferencesMessages.TodoTaskInputDialog_new_title);
		} else {
			setTitle(PreferencesMessages.TodoTaskInputDialog_edit_title);
		}

		CompilerTodoTaskInputAdapter adapter= new CompilerTodoTaskInputAdapter();

		fNameDialogField= new StringDialogField();
		fNameDialogField.setLabelText(PreferencesMessages.TodoTaskInputDialog_name_label);
		fNameDialogField.setDialogFieldListener(adapter);

		fNameDialogField.setText((task != null) ? task.name : ""); //$NON-NLS-1$

		String[] items= new String[] {
			PreferencesMessages.TodoTaskInputDialog_priority_high,
			PreferencesMessages.TodoTaskInputDialog_priority_normal,
			PreferencesMessages.TodoTaskInputDialog_priority_low
		};

		fPriorityDialogField= new ComboDialogField(SWT.READ_ONLY);
		fPriorityDialogField.setLabelText(PreferencesMessages.TodoTaskInputDialog_priority_label);
		fPriorityDialogField.setItems(items);
		if (task != null) {
			if (COMPILER_TASK_PRIORITY_HIGH.equals(task.priority)) {
				fPriorityDialogField.selectItem(0);
			} else if (COMPILER_TASK_PRIORITY_NORMAL.equals(task.priority)) {
				fPriorityDialogField.selectItem(1);
			} else {
				fPriorityDialogField.selectItem(2);
			}
		} else {
			fPriorityDialogField.selectItem(1);
		}
	}

	public TodoTask getResult() {
		TodoTask task= new TodoTask();
		task.name= fNameDialogField.getText().trim();
		switch (fPriorityDialogField.getSelectionIndex()) {
			case 0 :
					task.priority= COMPILER_TASK_PRIORITY_HIGH;
				break;
			case 1 :
					task.priority= COMPILER_TASK_PRIORITY_NORMAL;
				break;
			default :
					task.priority= COMPILER_TASK_PRIORITY_LOW;
				break;
		}
		return task;
	}

	@Override
	protected Control createDialogArea(Composite parent) {
		Composite composite= (Composite) super.createDialogArea(parent);

		Composite inner= new Composite(composite, SWT.NONE);
		GridLayout layout= new GridLayout();
		layout.marginHeight= 0;
		layout.marginWidth= 0;
		layout.numColumns= 2;
		inner.setLayout(layout);

		fNameDialogField.doFillIntoGrid(inner, 2);
		fPriorityDialogField.doFillIntoGrid(inner, 2);

		LayoutUtil.setHorizontalGrabbing(fNameDialogField.getTextControl(null));
		LayoutUtil.setWidthHint(fNameDialogField.getTextControl(null), convertWidthInCharsToPixels(45));

		fNameDialogField.postSetFocusOnDialogField(parent.getDisplay());

		applyDialogFont(composite);

		PlatformUI.getWorkbench().getHelpSystem().setHelp(composite, getTaskTagInputDialog());

		return composite;
	}
	
	protected abstract String getPrefix();
	
	public String getTaskTagInputDialog() {
		return getPrefix() + "todo_task_input_dialog_context"; //$NON-NLS-1$
	}

	public String getTodoTagInputDialog() {
		return getPrefix() + "todo_task_input_dialog_context"; //$NON-NLS-1$
	}

	private void doValidation() {
		StatusInfo status= new StatusInfo();
		String newText= fNameDialogField.getText();
		if (newText.length() == 0) {
			status.setError(PreferencesMessages.TodoTaskInputDialog_error_enterName);
		} else {
			if (newText.indexOf(',') != -1) {
				status.setError(PreferencesMessages.TodoTaskInputDialog_error_comma);
			} else if (fExistingNames.contains(newText)) {
				status.setError(PreferencesMessages.TodoTaskInputDialog_error_entryExists);
			} else if (Character.isWhitespace(newText.charAt(0)) ||  Character.isWhitespace(newText.charAt(newText.length() - 1))) {
				status.setError(PreferencesMessages.TodoTaskInputDialog_error_noSpace);
			}
		}
		updateStatus(status);
	}

	/*
	 * @see org.eclipse.jface.window.Window#configureShell(Shell)
	 */
	@Override
	protected void configureShell(Shell newShell) {
		super.configureShell(newShell);
		PlatformUI.getWorkbench().getHelpSystem().setHelp(newShell, getTodoTagInputDialog());
	}
}

