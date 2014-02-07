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
				.addTypeToType("org.eclipse.xtext.todo.ITaskElementChecker", 
						"org.eclipse.xtext.todo.TaskElementChecker")		
				.addTypeToType("org.eclipse.xtext.ui.editor.syntaxcoloring.ISemanticHighlightingCalculator", 
						getSemanticHighlightingCalculatorName(grammar, getNaming()))		
				.addTypeToType("org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration", 
						getHighlightingConfigurationName(grammar, getNaming()))		
				.addTypeToType("org.eclipse.xtext.todo.IActivatorProvider", 
						getActivatorProviderName(grammar, getNaming()))		
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
	
	public static String getActivatorProviderName(Grammar g, Naming n) {
		return n.basePackageUi(g) + ".todo." + GrammarUtil.getName(g) + "ActivatorProvider";
	}	
	
	public static String getTodoTaskPreferencePageName(Grammar g, Naming n) {
		return n.basePackageUi(g) + ".todo." + GrammarUtil.getName(g) + "TodoTaskPreferencePage";
	}	

	public static String getTodoTaskInputDialogName(Grammar g, Naming n) {
		return n.basePackageUi(g) + ".todo." + GrammarUtil.getName(g) + "TodoTaskInputDialog";
	}	

	public static String getTodoTaskConfigurationBlockName(Grammar g, Naming n) {
		return n.basePackageUi(g) + ".todo." + GrammarUtil.getName(g) + "TodoTaskConfigurationBlock";
	}
}
