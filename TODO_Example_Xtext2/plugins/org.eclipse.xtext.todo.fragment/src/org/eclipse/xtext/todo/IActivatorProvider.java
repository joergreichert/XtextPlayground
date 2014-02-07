package org.eclipse.xtext.todo;

import org.eclipse.ui.plugin.AbstractUIPlugin;

public interface IActivatorProvider {

	public AbstractUIPlugin getActivator();
	
	public String getCompilerTaskTagsKey();
	public String getCompilerTaskPrioritiesKey();
	public String getCompilerTaskCaseSensitiveKey();
}
