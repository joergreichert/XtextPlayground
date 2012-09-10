package org.xtext.example.mydsl.ui.highlighting;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.ILeafNode;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.xbase.ui.highlighting.XbaseHighlightingCalculator;
import org.xtext.example.mydsl.ui.tasks.ITaskElementChecker;

import com.google.inject.Inject;

public class MyDslSemanticHighlightingCalculator extends XbaseHighlightingCalculator {

	@Inject
	private ITaskElementChecker objElementChecker;

	@Override
	public void provideHighlightingFor(XtextResource resource,
			IHighlightedPositionAcceptor acceptor) {
		super.provideHighlightingFor(resource, acceptor);
		if (resource == null) {
			return;
		}
		EList<EObject> contents = resource.getContents();
		if (contents.size() == 0) {
			return;
		}
		EObject root = contents.get(0);
		highlightSemanticModel(NodeModelUtils.findActualNodeFor(root), acceptor);
	}

	protected void highlightSemanticModel(INode node,
			IHighlightedPositionAcceptor acceptor) {
		if (node instanceof ICompositeNode) {
			for (INode child : ((ICompositeNode) node).getChildren()) {
				highlightSemanticModel(child, acceptor);
			}
		} else if (node instanceof ILeafNode) {
			highlghtLeafNode((ILeafNode) node, acceptor);
		}
	}

	protected void highlghtLeafNode(ILeafNode node,
			IHighlightedPositionAcceptor acceptor) {
		EObject grammarElement = node.getGrammarElement();
		if (grammarElement instanceof Keyword) {
			ParserRule parserRule = EcoreUtil2.getContainerOfType(
					grammarElement, ParserRule.class);
			if ("XID".equals(parserRule.getName())) {
				applyDefaultStyle(node, acceptor);
			}
		}

		String varIgnorePrefix = objElementChecker.getPrefixToIgnore(node);
		if (varIgnorePrefix != null) {
			int start = node.getOffset()
					+ node.getText().indexOf(varIgnorePrefix);
			acceptor.addPosition(start, varIgnorePrefix.length(),
					MyDslHighlightingConfiguration.TODO_STYLE);
		}
	}

	protected void applyDefaultStyle(ILeafNode node,
			IHighlightedPositionAcceptor acceptor) {
		acceptor.addPosition(node.getOffset(), node.getLength(),
				MyDslHighlightingConfiguration.DEFAULT_ID);
	}
}
