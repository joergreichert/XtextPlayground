package org.eclipse.xtext.todo;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.ui.actions.WorkspaceModifyOperation;
import org.eclipse.xtext.ui.editor.IXtextEditorCallback;
import org.eclipse.xtext.ui.editor.XtextEditor;

import com.google.inject.Inject;

public class XtextTaskCalculator extends IXtextEditorCallback.NullImpl {

	@Inject
	private UpdateTaskMarkerJob objTaskMarkJob;

	@Override
	public void afterCreatePartControl(XtextEditor editor) {
		updateTaskMarkers(editor);
	}

	// update markers after a save
	@Override
	public void afterSave(XtextEditor argEditor) {
		updateTaskMarkers(argEditor);
	}

	private void updateTaskMarkers(XtextEditor argEditor) {
		// cancel does not really make sense, as it should be called
		// just *before* saving, unfortunately there is no corresponding
		// callback
		objTaskMarkJob.cancel();
		objTaskMarkJob.setEditor(argEditor);
		if (objTaskMarkJob.isSystem()) {
			objTaskMarkJob.setSystem(false);
		}
		objTaskMarkJob.setPriority(Job.DECORATE);
		objTaskMarkJob.schedule();
	}

	public static class UpdateTaskMarkerJob extends Job {
		@Inject
		private ITaskElementChecker objElementChecker;
		private XtextEditor objEditor;

		public UpdateTaskMarkerJob() {
			super("Xtext-Task-Marker-Update-Job");
		}

		void setEditor(XtextEditor argEditor) {
			objEditor = argEditor;
		}

		@Override
		public IStatus run(final IProgressMonitor argMonitor) {
			if (!argMonitor.isCanceled()) {
				try {
					new UpdateTaskMarkersOperation(objEditor, objElementChecker)
							.run(SubMonitor.convert(argMonitor));
				} catch (Exception e) {
					// don't care for now
				}
			}
			return argMonitor.isCanceled() ? Status.CANCEL_STATUS
					: Status.OK_STATUS;
		}
	}

	static class UpdateTaskMarkersOperation extends WorkspaceModifyOperation {
		private XtextEditor objEditor;
		private ITaskElementChecker objElementChecker;

		UpdateTaskMarkersOperation(XtextEditor argEditor,
				ITaskElementChecker argElementChecker) {
			objEditor = argEditor;
			objElementChecker = argElementChecker;
		}

		@Override
		protected void execute(IProgressMonitor monitor) throws CoreException,
				InvocationTargetException, InterruptedException {
			IResource resource = objEditor.getResource();
			resource.deleteMarkers(MarkerCreator.getMarkerType(), true,
					IResource.DEPTH_INFINITE);
			if (!monitor.isCanceled()) {
				createNewMarkers(objEditor, monitor);
			}
		}

		private void createNewMarkers(final XtextEditor argEditor,
				final IProgressMonitor argMonitor) throws CoreException {
			final IResource varResource = argEditor.getResource();
			argEditor.getDocument().readOnly(
					new MarkerCreator(varResource, objElementChecker, argMonitor));
		}
	}
}
