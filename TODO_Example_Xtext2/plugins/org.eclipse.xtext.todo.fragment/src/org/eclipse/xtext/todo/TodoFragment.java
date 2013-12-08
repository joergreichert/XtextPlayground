package org.eclipse.xtext.todo;

import java.util.Collections;
import java.util.List;
import java.util.Set;

import org.eclipse.xpand2.XpandExecutionContext;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.generator.AbstractGeneratorFragment;
import org.eclipse.xtext.generator.BindFactory;
import org.eclipse.xtext.generator.Binding;
import org.eclipse.xtext.generator.Naming;
import org.eclipse.xtext.ui.editor.IXtextEditorCallback;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.ISemanticHighlightingCalculator;

import com.google.inject.name.Names;

public class TodoFragment extends AbstractGeneratorFragment {

	@Override
	protected String getTemplate() {
		return super.getTemplate();
	}
	
	@Override
	public void generate(Grammar grammar, XpandExecutionContext ctx) {
		super.generate(grammar, ctx);
	}
	
	@Override
	protected List<Object> getParameters(Grammar grammar) {
		return Collections.emptyList();
	}
	
	@Override
	public Set<Binding> getGuiceBindingsUi(Grammar grammar) {
		BindFactory bindFactory = new BindFactory();
		return bindFactory
				.addTypeToType(ITaskElementChecker.class.getCanonicalName(), 
						TaskElementChecker.class.getCanonicalName())		
				.addConfiguredBinding("MatchingTagMarker",
					"binder.bind("
							+ IXtextEditorCallback.class.getCanonicalName() + ".class"
							+ ").annotatedWith("
							+ Names.class.getCanonicalName() + ".named(" + TaskConstants.class.getCanonicalName() + ".XTEXT_TASKS)"
							+ ").to(" 
							+ XtextTaskCalculator.class.getCanonicalName() + ".class)")				
				.addTypeToType(ISemanticHighlightingCalculator.class.getCanonicalName(), 
						getSemanticHighlightingCalculatorName(grammar, getNaming()))		
				.addTypeToType(DefaultHighlightingConfiguration.class.getCanonicalName(), 
						getHighlightingConfigurationName(grammar, getNaming()))		
				.getBindings();
	}
	
 	@Override
 	public String[]  getRequiredBundlesUi(Grammar grammar) {
 		return new String [] {  "org.eclipse.xtext.todo.fragment"  };
 	}	
	
	public static String getSemanticHighlightingCalculatorName(Grammar g, Naming n) {
		return n.basePackageUi(g) + ".highlighting." + GrammarUtil.getName(g) + "SemanticHighlightingCalculator";
	}	
	
	public static String getHighlightingConfigurationName(Grammar g, Naming n) {
		return n.basePackageUi(g) + ".highlighting." + GrammarUtil.getName(g) + "HighlightingConfiguration";
	}	
}
