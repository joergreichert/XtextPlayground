package org.xtext.example.mydsl.resources;

import java.util.Map;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.EObjectDescription;

public class MyDslEObjectDescription extends EObjectDescription {

	public static final String PACKAGE_KEY = "package";

	public MyDslEObjectDescription(QualifiedName qualifiedName, EObject element,
			Map<String, String> userData) {
		super(qualifiedName, element, userData);
		Resource resource = element.eResource();
		handleImport(userData, resource, element);
	}

	private void handleImport(Map<String, String> userData, Resource resource,
			EObject eObject) {
		if(eObject.eClass() instanceof EClassifier) {
			EClassifier eClassifier = (EClassifier) eObject.eClass();
			EPackage pack = eClassifier.getEPackage();
			if(pack != null) {
				userData.put(PACKAGE_KEY, pack.getName());
			}
		}
	}
}
