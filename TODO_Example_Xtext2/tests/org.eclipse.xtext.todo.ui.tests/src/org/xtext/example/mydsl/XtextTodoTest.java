package org.xtext.example.mydsl;

import java.util.Iterator;

import org.eclipse.jface.text.source.Annotation;
import org.eclipse.jface.text.source.IAnnotationModel;
import org.eclipse.swtbot.eclipse.finder.widgets.SWTBotEclipseEditor;
import org.eclipse.swtbot.eclipse.finder.widgets.SWTBotView;
import org.eclipse.swtbot.swt.finder.junit.SWTBotJunit4ClassRunner;
import org.eclipse.swtbot.swt.finder.waits.Conditions;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotTree;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.junit.Assert;
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

//		openTaskTagsPreferencePageForDsl("MyDsl");

		openTaskTagsPropertiesPageForDsl("MyDsl");

		addNewTaskEntry("HACK", "High");
		
		XtextEditor editor = (XtextEditor) dslEditor.getReference().getEditor(false);
		final IAnnotationModel model = editor.getDocumentProvider().getAnnotationModel(editor.getEditorInput());
		Iterator<?> annotationIterator = model.getAnnotationIterator();
		Assert.assertTrue(annotationIterator.hasNext());
		Annotation annotation = (Annotation) annotationIterator.next();
		Assert.assertEquals("2 changed lines ", annotation.getText());
		Assert.assertFalse(annotationIterator.hasNext());
		
		// TODO assert TODO Highlighting
		// TODO assert Marker Existence
		// TODO assert Marker Hyper Linking
	}

	@Override
	protected String getProjectName() {
		return PROJECT_NAME;
	}
}
