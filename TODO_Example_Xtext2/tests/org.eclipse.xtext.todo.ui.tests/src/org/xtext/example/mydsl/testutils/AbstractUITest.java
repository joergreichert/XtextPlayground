package org.xtext.example.mydsl.testutils;

import java.util.Arrays;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swtbot.eclipse.finder.SWTBotEclipseTestCase;
import org.eclipse.swtbot.eclipse.finder.SWTWorkbenchBot;
import org.eclipse.swtbot.eclipse.finder.matchers.WithPartName;
import org.eclipse.swtbot.eclipse.finder.waits.Conditions;
import org.eclipse.swtbot.eclipse.finder.widgets.SWTBotPerspective;
import org.eclipse.swtbot.eclipse.finder.widgets.SWTBotView;
import org.eclipse.swtbot.swt.finder.SWTBot;
import org.eclipse.swtbot.swt.finder.finders.UIThreadRunnable;
import org.eclipse.swtbot.swt.finder.results.VoidResult;
import org.eclipse.swtbot.swt.finder.waits.DefaultCondition;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotMenu;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotShell;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotTree;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotTreeItem;
import org.eclipse.swtbot.swt.finder.widgets.TimeoutException;
import org.eclipse.ui.IEditorReference;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.WorkbenchException;
import org.hamcrest.Matcher;
import org.hamcrest.Matchers;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;

public abstract class AbstractUITest extends SWTBotEclipseTestCase {
	private static final String NEW = "New";
	private static final String FILE_MENU = "File";
	private static final int ONE_SECOND = 1000;
	private static final int TWO_MINUTES = 120 * ONE_SECOND;
	private SimpleProjectWizardTestHelper wizardTestHelper = null;

	@Before
	public void setUp() throws Exception {
		SWTBotView view = getBot().activeView();
		if (view != null && view.getTitle().equals("Welcome")) {
			view.close();
		}
	}

	protected SWTWorkbenchBot getBot() {
		return bot;
	}

	protected SimpleProjectWizardTestHelper getWizardTestHelper() {
		if (wizardTestHelper == null) {
			wizardTestHelper = new SimpleProjectWizardTestHelper(getBot());
		}
		return wizardTestHelper;
	}

	protected void createNewProject() {
		SWTBotShell shell = startCreateNewProject("General", "Project");
		executeProjectWizard(shell);
		finishWizard(shell);
	}

	protected void openPerspective(final String perspectiveLabel) {
		final SWTBotPerspective perspective = getBot().perspectiveByLabel(
				perspectiveLabel);
		Assert.assertNotNull(perspectiveLabel + "Perspective", perspective);
		perspective.activate();
		getBot().waitUntil(new DefaultCondition() {

			public boolean test() {
				return perspective.isActive();
			}

			public String getFailureMessage() {
				return "Perspective '" + perspectiveLabel
						+ "' was not activated";
			}
		});
		getBot().waitUntil(new DefaultCondition() {
			
			public boolean test() throws Exception {
				return getBot().activeShell() != null;
			}
			
			public String getFailureMessage() {
				return "No active shell not found";
			}
		});
	}

	protected void executeProjectWizard(SWTBotShell shell) {
		getWizardTestHelper().setText(0, getProjectName());
	}

	protected void finishWizard(SWTBotShell shell) {
		getBot().button("Finish").click();
		getBot().waitUntil(Conditions.shellCloses(shell), TWO_MINUTES);
	}

	protected SWTBotShell startCreateNewProject(String... path) {
		SWTBot bot = (SWTBot) getBot().activeShell().bot();
		SWTBotMenu fileMenu = bot.menu(FILE_MENU);
		SWTBotShell shell = null;
		if(fileMenu == null) {
			getBot().activeShell().pressShortcut(SWT.CTRL, 'N');
			bot.waitUntil(Conditions.shellIsActive(NEW));
			shell = bot.shell(NEW);
			shell.activate();
		} else {
			Assert.assertNotNull("fileMenu", fileMenu);
			SWTBotMenu newMenu = fileMenu.menu(NEW);
			Assert.assertNotNull("newMenu", newMenu);
			SWTBotMenu projectMenu = newMenu.menu("Project...");
			Assert.assertNotNull("projectMenu", projectMenu);
			projectMenu.click();
			bot.waitUntil(Conditions.shellIsActive("New Project"));
			shell = bot.shell("New Project");
			shell.activate();
		}
		bot = shell.bot();
		bot.tree().expandNode(path).select();
		// press "Next >"
		bot.button("Next >").click();
		return shell;
	}

	protected SWTBotTreeItem selectFolderNode(String... folder) {
		SWTBotView packageExplorer = getBot().viewByTitle("Package Explorer");
		SWTBotTree treeViewer = packageExplorer.bot().tree();
		return openNodePathFromTree(treeViewer, folder).select();
	}

	protected SWTBotTreeItem openNodePathFromTree(SWTBotTree treeViewer,
			String... path) {
		int length = path.length;
		SWTBotTreeItem item = null;
		if (length > 0) {
			SWTBotTreeItem rootItem = getNodeUnderTree(treeViewer, path[0]);
			String[] childPath = Arrays.copyOfRange(path, 1, length);
			item = openNodePathFromNode(rootItem, childPath);
		}
		return item;
	}

	protected SWTBotTreeItem openNodePathFromNode(SWTBotTreeItem startItem,
			String... path) {
		return openNode(startItem, path, 0, path.length);
	}

	private SWTBotTreeItem openNode(SWTBotTreeItem item, String[] path, int i,
			int max) {
		SWTBotTreeItem node = null;
		if (i < max) {
			SWTBotTreeItem childItem = expandParentNodeAndGetChildNode(item,
					path[i]);
			node = openNode(childItem, path, i + 1, max);
		} else {
			node = item;
		}
		return node;
	}

	protected SWTBotTreeItem getNodeUnderTree(SWTBotTree tree,
			String childNodeName) {
		return tree.getTreeItem(childNodeName);
	}

	protected SWTBotTreeItem expandParentNodeAndGetChildNode(
			SWTBotTreeItem parentNode, String childNodeName) {
		expandNode(parentNode);
		return parentNode.getNode(childNodeName);
	}

	protected void expandNode(SWTBotTreeItem item) {
		item.expand();
		getBot().sleep(ONE_SECOND);
	}

	protected void createSourceFolder(String sourceFolder) {
		createFolder(sourceFolder, "Source Folder");
	}

	protected void createFolder(String folder) {
		createFolder(folder, "Folder");
	}

	private void createFolder(String folder, String folderLabel) {
		SWTBotMenu newMenu = getBot().menu(FILE_MENU).menu(NEW);
		if(newMenu == null) {
			getBot().activeShell().pressShortcut(SWT.ALT | SWT.SHIFT, 'R');
		}
		SWTBotMenu folderMenu = newMenu.menu(folderLabel);
		folderMenu.click();
		getBot().waitUntil(Conditions.shellIsActive("New " + folderLabel));
		getWizardTestHelper().setText(1, folder);
		finishWizard(getBot().activeShell());
	}

	protected void createFile(String... segments) {
		int count = segments.length - 1;
		if (count < 2) {
			throw new IllegalArgumentException(
					"To create file at least one folder and one file have to be passed.");
		}
		String[] pathSegements = new String[count];
		System.arraycopy(segments, 0, pathSegements, 0, count);
		String fileSegment = segments[count];
		selectFolderNode(pathSegements);
		getBot().menu(NEW).menu(FILE_MENU).click();
		getBot().waitUntil(Conditions.shellIsActive("New File"));
		getWizardTestHelper().setText(1, fileSegment);
		getBot().button("Finish").click();
	}

	protected void createFirstXtextFile(String projectName,
			String sourceFolder, String dslFile) {
		createFile(projectName, sourceFolder, dslFile);
		getBot().waitUntil(Conditions.shellIsActive("Add Xtext Nature"));
		getBot().button(0).click();
		Matcher<IEditorReference> withPartName = WithPartName
				.withPartName(Matchers.containsString(dslFile));
		try {
			bot.waitUntil(Conditions.waitForEditor(withPartName));
		} catch (TimeoutException toe) {
			bot.waitUntil(Conditions.waitForEditor(withPartName));
		}
	}

	protected void openView(String view, String... path) {
		getBot().menu("Window").menu("Show View").menu("Other...").click();
		getBot().shell("Show View").activate();
		SWTBotTree tree = getBot().tree();
		SWTBotTreeItem expandNode = tree.expandNode(path);
		expandNode.select(view).click();
		getBot().button("OK").click();
		getBot().viewByTitle(view).show();
	}

	public void destroy() {
		UIThreadRunnable.syncExec(new VoidResult() {
			public void run() {
				resetWorkbench();
			}
		});
	}

	private void resetWorkbench() {
		try {
			IWorkbench workbench = PlatformUI.getWorkbench();
			IWorkbenchWindow workbenchWindow = workbench
					.getActiveWorkbenchWindow();
			IWorkbenchPage page = workbenchWindow.getActivePage();
			Shell activeShell = Display.getCurrent().getActiveShell();
			if (activeShell != null
					&& activeShell != workbenchWindow.getShell()) {
				activeShell.close();
			}
			page.closeAllEditors(false);
			String defaultPerspectiveId = workbench.getPerspectiveRegistry()
					.getDefaultPerspective();
			workbench.showPerspective(defaultPerspectiveId, workbenchWindow);
			page.resetPerspective();
		} catch (WorkbenchException e) {
			throw new IllegalStateException("Workbench could not be reset:\n" + e);
		}
	}

	@After
	public void tearDown() throws Exception {
		// SWTBotTreeItem projectNode = selectFolderNode(getProjectName());
		// projectNode.contextMenu("Delete");
		// try {
		// bot.checkBox().select();
		// bot.button("OK").click();
		// } catch(WidgetNotFoundException e) {
		// e.printStackTrace();
		// }
		destroy();
	}

	protected abstract String getProjectName();
}
