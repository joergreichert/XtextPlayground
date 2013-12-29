package org.eclipse.xtext.todo;

import java.util.StringTokenizer;

import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.impl.LeafNode;
import org.eclipse.xtext.todo.ui.TodoTaskInputDialog;

import com.google.inject.Inject;

public class TaskElementChecker implements ITaskElementChecker {

	@Inject
	private TerminalsGrammarAccess objGrammarAccess;

	public String getPrefixToIgnore(INode argNode) {
		boolean singleLineComment = getSingleLineCommentRule().equals(
				argNode.getGrammarElement());
		boolean multiLineComment = getMultiLineCommentRule().equals(
				argNode.getGrammarElement());
		if (argNode instanceof LeafNode) {
			String value = Activator.getDefault().getPreferenceStore()
					.getString(TodoTaskInputDialog.COMPILER_TASK_TAGS);
			if (value != null) {
				StringTokenizer st = new StringTokenizer(value, ",");
				String token;
				while (st.hasMoreTokens()) {
					token = st.nextToken();
					if (token.trim().length() > 0) {
						boolean containsTodoKeyword = ((LeafNode) argNode)
								.getText().contains(token);
						if ((singleLineComment || multiLineComment)
								&& containsTodoKeyword) {
							return token;
						}
					}
				}
			}
		}
		return null;
	}

	protected TerminalRule getMultiLineCommentRule() {
		return objGrammarAccess.getML_COMMENTRule();
	}

	protected TerminalRule getSingleLineCommentRule() {
		return objGrammarAccess.getSL_COMMENTRule();
	}
}
