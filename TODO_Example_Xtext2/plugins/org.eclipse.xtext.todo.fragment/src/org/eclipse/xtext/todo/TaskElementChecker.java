package org.eclipse.xtext.todo;

import java.util.StringTokenizer;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ProjectScope;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.core.runtime.preferences.IScopeContext;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.impl.LeafNode;
import org.eclipse.xtext.todo.ui.TodoTaskConfigurationBlock;

import com.google.inject.Inject;

public class TaskElementChecker implements ITaskElementChecker {

	@Inject
	private TerminalsGrammarAccess objGrammarAccess;

	@Inject
	private IActivatorProvider activatorProvider;

	public String getPrefixToIgnore(INode argNode) {
		boolean singleLineComment = getSingleLineCommentRule().equals(
				argNode.getGrammarElement());
		boolean multiLineComment = getMultiLineCommentRule().equals(
				argNode.getGrammarElement());
		if (argNode instanceof LeafNode) {
			String value = activatorProvider.getActivator()
					.getPreferenceStore()
					.getString(activatorProvider.getCompilerTaskTagsKey());
			if (argNode.getSemanticElement() != null
					&& argNode.getSemanticElement().eResource() != null
					&& argNode.getSemanticElement().eResource().getURI() != null
					&& argNode.getSemanticElement().eResource().getURI()
							.segmentCount() > 0) {
				String projectName = argNode.getSemanticElement().eResource()
						.getURI().segment(1);
				IProject project = ResourcesPlugin.getWorkspace().getRoot()
						.getProject(projectName);
				if (project != null) {
					IScopeContext projectScope = new ProjectScope(project);
					IEclipsePreferences todoPreferences = projectScope
							.getNode(activatorProvider.getActivator()
									.getBundle().getSymbolicName());
					value = todoPreferences.get(
							activatorProvider.getCompilerTaskTagsKey(), value);
					if (value == null) {
						value = TodoTaskConfigurationBlock.DEFAULT_TASK_TAGS;
						activatorProvider
								.getActivator()
								.getPreferenceStore()
								.putValue(
										activatorProvider
												.getCompilerTaskTagsKey(),
										value);
					}
					String caseSensitiveStr = activatorProvider
							.getActivator()
							.getPreferenceStore()
							.getString(
									activatorProvider
											.getCompilerTaskCaseSensitiveKey());
					caseSensitiveStr = todoPreferences
							.get(activatorProvider
									.getCompilerTaskCaseSensitiveKey(),
									caseSensitiveStr);
					boolean caseSensitive = Boolean.valueOf(caseSensitiveStr);
					StringTokenizer st = new StringTokenizer(value, ",");
					String token;
					while (st.hasMoreTokens()) {
						token = st.nextToken();
						if (token.trim().length() > 0) {
							boolean containsTodoKeyword = containsToken(
									((LeafNode) argNode).getText(), token,
									caseSensitive);
							if ((singleLineComment || multiLineComment)
									&& containsTodoKeyword) {
								return token;
							}
						}
					}
				}
			}
		}
		return null;
	}

	protected boolean containsToken(String text, String token,
			boolean caseSensitive) {
		if (caseSensitive) {
			return text.contains(token);
		} else {
			return text.toLowerCase().contains(token.toLowerCase());
		}
	}

	protected TerminalRule getMultiLineCommentRule() {
		return objGrammarAccess.getML_COMMENTRule();
	}

	protected TerminalRule getSingleLineCommentRule() {
		return objGrammarAccess.getSL_COMMENTRule();
	}
}
