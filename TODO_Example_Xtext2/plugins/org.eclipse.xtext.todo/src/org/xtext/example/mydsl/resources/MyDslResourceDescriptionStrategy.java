package org.xtext.example.mydsl.resources;

import java.util.HashMap;

import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.impl.DefaultResourceDescriptionStrategy;
import org.eclipse.xtext.util.IAcceptor;

public class MyDslResourceDescriptionStrategy extends DefaultResourceDescriptionStrategy {
	
	private final static Logger LOG = Logger.getLogger(MyDslResourceDescriptionStrategy.class);
	
	public boolean createEObjectDescriptions(EObject eObject, IAcceptor<IEObjectDescription> acceptor) {
		if (getQualifiedNameProvider() == null)
			return false;
		try {
			QualifiedName qualifiedName = getQualifiedNameProvider().getFullyQualifiedName(eObject);
			if (qualifiedName != null) {
				acceptor.accept(new MyDslEObjectDescription(qualifiedName, eObject, new HashMap<String, String>()));
			}
		} catch (Exception exc) {
			LOG.error(exc.getMessage());
		}
		return true;
	}
}
