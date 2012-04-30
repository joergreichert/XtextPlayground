package org.xtext.example.mydsl.ui.outline.tasks;

import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.impl.LeafNode;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;

import com.google.inject.Inject;

public class MyDslTaskElementChecker implements ITaskElementChecker {

	@Inject
	private MyDslGrammarAccess objGrammarAccess;

	@Override
	public String getPrefixToIgnore(INode argNode) {
		if(objGrammarAccess.getSL_COMMENTRule().equals(argNode.getGrammarElement())){
			//if it's a single line comment, its a leaf node
			if(((LeafNode)argNode).getText().contains(TaskConstants.TODO_PREFIX)){
				return TaskConstants.TODO_PREFIX;
			}
		}
		return null;
	}

}
