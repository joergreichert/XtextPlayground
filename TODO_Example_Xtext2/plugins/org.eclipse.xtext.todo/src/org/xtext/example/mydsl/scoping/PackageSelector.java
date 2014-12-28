package org.xtext.example.mydsl.scoping;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.common.util.EList;
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
import com.google.common.collect.Maps;

public class PackageSelector {

    public List<EPackage> getFilteredEPackages(EObject modelElement) {
        List<EPackage> ePackages = getEPackages();
        IJavaProject project = getJavaProject(modelElement);
        if (project != null) {
            ePackages = filterAccessibleEPackages(project, ePackages);
        }
        return ePackages;
    }

    public List<EPackage> getEPackages() {
        registerWorkspaceEPackagesAndGenModels();
        Set<Entry<String, Object>> packages = EPackage.Registry.INSTANCE.entrySet();
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

    public void registerWorkspaceEPackagesAndGenModels() {
        IWorkspace ws = ResourcesPlugin.getWorkspace();
        if (ws != null) {
            final IWorkspaceRoot wsRoot = ws.getRoot();
            for (IProject project : wsRoot.getProjects()) {
                try {
                    if (project.hasNature("org.eclipse.pde.PluginNature")) {
                        project.accept(new IResourceVisitor() {
                            private Map<String, String> nameToEPackageNsURI = new HashMap<String, String>();
                            private Map<String, URI> nameTOGenModelURI = new HashMap<String, URI>();
                            private String ePackageNsURI;
                            private URI genModelURI;

                            public boolean visit(IResource resource) throws CoreException {
                                if (resource instanceof IContainer) {
                                    IContainer folder = (IContainer) resource;
                                    if ("bin".equals(folder.getName()) || "target".equals(folder.getName())) {
                                        return false;
                                    }
                                    for (IResource member : folder.members()) {
                                        visit(member);
                                    }
                                } else if (resource instanceof IFile) {
                                    visitFile((IFile) resource);
                                }
                                return false;
                            }

                            public void visitFile(IFile resource) {
                                String name = resource.getName();
                                name = name.replace("." + resource.getFileExtension(), "");
                                String locationURI = resource.getLocationURI().toString();
                                if (locationURI.endsWith(".genmodel")) {
                                    String location = resource.getLocation().makeRelativeTo(wsRoot.getLocation())
                                            .toString();
                                    nameTOGenModelURI.put(name, URI.createPlatformResourceURI("/" + location, true));

                                } else if (locationURI.endsWith(".ecore")) {
                                    ResourceSet rs = new ResourceSetImpl();
                                    Resource r = rs.createResource(URI.createURI(locationURI));
                                    try {
                                        r.load(Maps.newHashMap());
                                        EList<EObject> contents = r.getContents();
                                        for (EObject content : contents) {
                                            if (content instanceof EPackage) {
                                                EPackage pack = (EPackage) content;
                                                EPackage.Registry.INSTANCE.put(pack.getNsURI(), pack);
                                                nameToEPackageNsURI.put(name, pack.getNsURI());
                                            }
                                        }
                                    } catch (IOException e) {
                                        e.printStackTrace();
                                    }
                                }
                                for (String resourceName : nameToEPackageNsURI.keySet()) {
                                    if ((ePackageNsURI = nameToEPackageNsURI.get(resourceName)) != null
                                            && (genModelURI = nameTOGenModelURI.get(resourceName)) != null) {
                                        EcorePlugin.getEPackageNsURIToGenModelLocationMap(false).put(ePackageNsURI,
                                                genModelURI);
                                    }
                                }
                            }

                        });
                    }
                } catch (CoreException e) {
                    e.printStackTrace();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        EcorePlugin.computePlatformPluginToPlatformResourceMap();
        EcorePlugin.computePlatformURIMap(false);
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
                    fullqualifiedPackageClassName = genPackage.getClassPackageName() + "."
                            + genPackage.getPackageClassName();
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
        return getGenPackage(pack.getNsURI(), pack.getName());
    }

    public GenPackage getGenPackage(String uri, String packageName) {
        URI genModelLoc = EcorePlugin.getEPackageNsURIToGenModelLocationMap(false).get(uri);
        if (genModelLoc == null) {
            throw new IllegalStateException("No genmodel found for package URI " + uri
                    + ". If you are running in stanalone mode make sure register the genmodel file.");
        }
        ResourceSet rs = new ResourceSetImpl();
        Resource genModelResource;
        try {
            genModelResource = rs.getResource(genModelLoc, true);
            for (GenModel g : Iterables.filter(genModelResource.getContents(), GenModel.class)) {
                for (GenPackage genPack : g.getGenPackages()) {
                    if (genPack.getEcorePackage().getNsURI().equals(uri)
                            && genPack.getEcorePackage().getName().equals(packageName)) {
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
