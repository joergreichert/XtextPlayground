package org.eclipse.xtext.todo;

import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.impl.LeafNode;

import com.google.inject.Inject;

public class TaskElementChecker implements ITaskElementChecker {

	@Inject
	private TerminalsGrammarAccess objGrammarAccess;

	public String getPrefixToIgnore(INode argNode) {
		boolean singleLineComment = getSingleLineCommentRule()
				.equals(argNode.getGrammarElement());
		boolean multiLineComment = getMultiLineCommentRule()
				.equals(argNode.getGrammarElement());
		boolean containsTodoKeyword = argNode instanceof LeafNode ? ((LeafNode) argNode)
				.getText().contains(TaskConstants.TODO_PREFIX) : false;
		if ((singleLineComment || multiLineComment) && containsTodoKeyword) {
			return TaskConstants.TODO_PREFIX;
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
