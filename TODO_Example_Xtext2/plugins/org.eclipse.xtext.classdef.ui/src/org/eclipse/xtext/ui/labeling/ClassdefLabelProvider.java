/*
* generated by Xtext
*/
package org.eclipse.xtext.ui.labeling;

import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.xtext.xbase.ui.labeling.XbaseLabelProvider; 
 
import com.google.inject.Inject;

/**
 * Provides labels for a EObjects.
 * 
 * see http://www.eclipse.org/Xtext/documentation/latest/xtext.html#labelProvider
 */
public class ClassdefLabelProvider extends XbaseLabelProvider {

	@Inject
	public ClassdefLabelProvider(AdapterFactoryLabelProvider delegate) {
		super(delegate);
	}

/*
	//Labels and icons can be computed like this:
	
	String text(MyModel ele) {
	  return "my "+ele.getName();
	}
	 
    String image(MyModel ele) {
      return "MyModel.gif";
    }
*/
}
