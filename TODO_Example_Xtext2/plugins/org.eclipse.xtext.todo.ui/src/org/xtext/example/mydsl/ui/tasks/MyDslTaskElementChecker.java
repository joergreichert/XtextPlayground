package org.xtext.example.mydsl.ui.tasks;

import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.impl.LeafNode;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;

import com.google.inject.Inject;

public class MyDslTaskElementChecker implements ITaskElementChecker {

	@Inject
	private MyDslGrammarAccess objGrammarAccess;

	public String getPrefixToIgnore(INode argNode) {
		boolean singleLineComment = objGrammarAccess.getSL_COMMENTRule()
				.equals(argNode.getGrammarElement());
		boolean multiLineComment = objGrammarAccess.getML_COMMENTRule()
				.equals(argNode.getGrammarElement());
		boolean containsTodoKeyword = argNode instanceof LeafNode ? ((LeafNode) argNode)
				.getText().contains(TaskConstants.TODO_PREFIX) : false;
		if ((singleLineComment || multiLineComment) && containsTodoKeyword) {
			return TaskConstants.TODO_PREFIX;
		}
		return null;
	}	
}
