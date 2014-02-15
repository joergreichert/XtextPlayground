package org.xtext.example.mydsl;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.swtbot.eclipse.finder.widgets.SWTBotEclipseEditor;
import org.eclipse.swtbot.eclipse.finder.widgets.SWTBotView;
import org.eclipse.swtbot.swt.finder.junit.SWTBotJunit4ClassRunner;
import org.eclipse.swtbot.swt.finder.waits.Conditions;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotTree;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.xtext.example.mydsl.testutils.AbstractUITest;

@RunWith(SWTBotJunit4ClassRunner.class)
public class XtextTodoTest extends AbstractUITest {
	private static final String PROJECT_NAME = "Test";

	@Test
	public void testCreateSimpleDsl() {
		String sourceFolder = "model";
		String dslFile = "test.mydsl";
		openPerspective("Java");
		createNewProject();
		selectFolderNode(getProjectName()).select();
		createFolder(sourceFolder);
		createFirstXtextFile(getProjectName(), sourceFolder, dslFile);
		SWTBotEclipseEditor dslEditor = getBot().activeEditor().toTextEditor();
		dslEditor.setText("// TODO change name!\nHallöchen Jörg!");
		dslEditor.save();
		waitForAutoBuild();
		getBot().menu("Window").menu("Show View").menu("Tasks").click();
		SWTBotView view = getBot().viewById("org.eclipse.ui.views.TaskList");
		view.show();
		SWTBotTree tree = getBot().tree();
		getBot().waitUntil(Conditions.treeHasRows(tree, 1));
		// TODO assert TODO Highlighting
		// TODO assert Marker Existence
		// TODO assert Marker Hyper Linking
	}
	
	public static void waitForAutoBuild() {
		boolean wasInterrupted = false;
		do {
			try {
				Job[] foundJobs = Job.getJobManager().find(ResourcesPlugin.FAMILY_AUTO_BUILD);
				if (foundJobs.length > 0) {
					Job.getJobManager().join(ResourcesPlugin.FAMILY_AUTO_BUILD,
							null);
				}
				wasInterrupted = false;
			} catch (OperationCanceledException e) {
				e.printStackTrace();
			} catch (InterruptedException e) {
				wasInterrupted = true;
			}
		} while (wasInterrupted);
	}	

	@Override
	protected String getProjectName() {
		return PROJECT_NAME;
	}
}
