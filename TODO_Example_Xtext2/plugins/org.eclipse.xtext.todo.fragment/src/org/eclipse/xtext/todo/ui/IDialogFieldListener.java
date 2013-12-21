package org.eclipse.xtext.todo.ui;

/**
 * Change listener used by <code>DialogField</code>
 */
public interface IDialogFieldListener {

	/**
	 * The dialog field has changed.
	 *
	 * @param field the dialog field that changed
	 */
	void dialogFieldChanged(DialogField field);

}
