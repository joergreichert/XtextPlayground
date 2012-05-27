package org.xtext.example.mydsl.scoping;

import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.xtext.EcoreUtil2;
import org.xtext.example.mydsl.myDsl.Import;
import org.xtext.example.mydsl.myDsl.Model;

import com.google.common.collect.Iterables;

public class PackageSelector {

	
	public List<EPackage> getFilteredEPackages(EObject modelElement, Set<Entry<String, Object>> packages) {
		List<EPackage> ePackages = getEPackages(packages);
		IJavaProject project = getJavaProject(modelElement);
		if (project != null) {
			ePackages = filterAccessibleEPackages(project, ePackages);
		}
		return ePackages;
	}
	
	public List<EPackage> getEPackages(Set<Entry<String, Object>> packages) {
		List<EPackage> ePackages = new ArrayList<EPackage>();
		try {
			Object packageObj = null;
			EPackage.Descriptor ePackageDescriptor = null;
			EPackage ePackage = null;
			for (Entry<String, Object> entry : packages) {
				packageObj = entry.getValue();
				if (packageObj instanceof EPackage) {
					ePackages.add((EPackage) packageObj);
				} else if (packageObj instanceof EPackage.Descriptor) {
					ePackageDescriptor = (EPackage.Descriptor) packageObj;
					ePackage = ePackageDescriptor.getEPackage();
					if (ePackage != null) {
						ePackages.add(ePackage);
					}
				}
			}
			return ePackages;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ePackages;
	}
    
    public List<String> getAlreadyImportedForElement(EObject modelElement) {
    	EObject container = EcoreUtil2.getContainerOfType(modelElement, Model.class);
    	return getAlreadyImported(container);
	}
	
    public List<String> getAlreadyImported(EObject container) {
        Import ni;
        List<String> alreadyImported = new ArrayList<String>();
        for (EObject child : container.eContents()) {
            if (child instanceof Import) {
                ni = (Import) child;
                alreadyImported.add(ni.getImportedNamespace());
            }
        }
        return alreadyImported;
    }

    public List<EPackage> filterAccessibleEPackages(IJavaProject javaProject, List<EPackage> ePackages) {
        List<EPackage> filteredEPackages = new ArrayList<EPackage>();
        try {
            GenPackage genPackage = null;
            String fullqualifiedPackageClassName = null;
            IType type = null;
            for (EPackage ePackage : ePackages) {
                genPackage = getGenPackage(ePackage);
                if (genPackage != null) {
                    fullqualifiedPackageClassName = genPackage.getClassPackageName() + "." + genPackage.getPackageClassName();
                    type = javaProject.findType(fullqualifiedPackageClassName);
                    if (type != null) {
                        filteredEPackages.add(ePackage);
                    }
                }
            }
        } catch (JavaModelException e) {
            e.printStackTrace();
        }
        return filteredEPackages;
    }

    public GenPackage getGenPackage(EPackage pack) {
        URI genModelLoc = EcorePlugin.getEPackageNsURIToGenModelLocationMap().get(pack.getNsURI());
        if (genModelLoc == null) {
            throw new IllegalStateException("No genmodel found for package URI " + pack.getNsURI() + ". If you are running in stanalone mode make sure register the genmodel file.");
        }
        ResourceSet rs = new ResourceSetImpl();
        Resource genModelResource;
        try {
            genModelResource = rs.getResource(genModelLoc, true);
            for (GenModel g : Iterables.filter(genModelResource.getContents(), GenModel.class)) {
                for (GenPackage genPack : g.getGenPackages()) {
                    if (genPack.getEcorePackage().getNsURI().equals(pack.getNsURI()) && genPack.getEcorePackage().getName().equals(pack.getName())) {
                        return genPack;
                    }
                }
            }
        } catch (Exception e) {
            if (e instanceof java.io.FileNotFoundException) {
                System.err.println(e.getMessage());
            } else {
                e.printStackTrace();
            }
        }
        return null;
    }

    public IJavaProject getJavaProject(EObject model) {
        IJavaProject javaProject = null;
        IContainer container = getProject(model);
        if (container instanceof IProject) {
            IProject project = (IProject) container;
            javaProject = JavaCore.create(project);
        }
        return javaProject;
    }

    private IContainer getProject(EObject model) {
        String fileStr = model.eResource().getURI().toPlatformString(true);
        if (fileStr == null) {
            return null;
        }
        IFile file = ResourcesPlugin.getWorkspace().getRoot().getFile(Path.fromOSString(fileStr));
        return getProject(file);
    }

    private IContainer getProject(IResource res) {
        IContainer parent = res.getParent();
        if (parent == null) {
            parent = null;
        }
        if (!(parent instanceof IProject)) {
            parent = getProject(parent);
        }
        return parent;
    }
}
