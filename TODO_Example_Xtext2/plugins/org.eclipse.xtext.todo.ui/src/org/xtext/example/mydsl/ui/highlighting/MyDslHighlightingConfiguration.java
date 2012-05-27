package org.xtext.example.mydsl.ui.highlighting;

import org.eclipse.swt.SWT;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor;
import org.eclipse.xtext.ui.editor.utils.TextStyle;

public class MyDslHighlightingConfiguration extends
		DefaultHighlightingConfiguration {

	public static final String TODO_STYLE = "TODO_STYLE";
	
	@Override
	public void configure(IHighlightingConfigurationAcceptor acceptor) {
		super.configure(acceptor);
		acceptor.acceptDefaultHighlighting(TODO_STYLE, TODO_STYLE, todoTextStyle());
	}
	
	public TextStyle todoTextStyle() {
		TextStyle textStyle = commentTextStyle().copy();
		textStyle.setStyle(SWT.BOLD);
		return textStyle;
	}
}
