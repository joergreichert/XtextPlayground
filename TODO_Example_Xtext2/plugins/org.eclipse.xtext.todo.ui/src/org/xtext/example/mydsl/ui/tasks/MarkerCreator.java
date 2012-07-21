package org.xtext.example.mydsl.ui.tasks;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang.StringUtils;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.nodemodel.BidiIterator;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;
import org.xtext.example.mydsl.ui.internal.MyDslActivator;

public class MarkerCreator implements IUnitOfWork<Void, XtextResource> {
   private static final String TASK_MARKER_TYPE = "";
   private final IResource varResource;
   private final ITaskElementChecker objElementChecker;
   private final IProgressMonitor argMonitor;

   MarkerCreator(final IResource varResource, final ITaskElementChecker objElementChecker,
        final IProgressMonitor argMonitor) {
      this.varResource = varResource;
      this.objElementChecker = objElementChecker;
      this.argMonitor = argMonitor;
   }

   @Override
   public java.lang.Void exec(XtextResource argState) {
      if (argState != null && !argState.getContents().isEmpty()) {
         EObject varModel = argState.getContents().get(0);
         ICompositeNode varRoot = NodeModelUtils.getNode(varModel);
         try {
            visit(varRoot, varResource, argMonitor);
         } catch (CoreException e) {
            MyDslActivator.getInstance().getLog().log(
                 new Status(IStatus.ERROR, MyDslActivator.ORG_XTEXT_EXAMPLE_MYDSL_MYDSL,
                      "Could not create marker", e));
         }
      }
      return null;
   }

   private void visit(ICompositeNode node, final IResource varResource,
        final IProgressMonitor argMonitor) throws CoreException {
      BidiIterator<INode> varAllContents = node.getChildren().iterator();
      while (varAllContents.hasNext() && !argMonitor.isCanceled()) {
         INode varNext = varAllContents.next();
         internalCreateMarker(varNext, varResource);
         if (varNext instanceof ICompositeNode) {
            visit((ICompositeNode) varNext, varResource, argMonitor);
         }
      }
   }

   private void internalCreateMarker(INode argNode, IResource argRresource)
        throws CoreException {
      String varIgnorePrefix = objElementChecker.getPrefixToIgnore(argNode);
      if (varIgnorePrefix != null) {
         IMarker varMarker = argRresource.createMarker(getMarkerType());
         String text = argNode.getText();
         // match from varIgnorePrefix until end of line
         Matcher matcher = Pattern.compile("(?s).*" + varIgnorePrefix + "(.*?)(\\r)?\\n.*").matcher(text);
         if (matcher.matches()) {
        	 text = matcher.group(1);
         }
         varMarker.setAttribute(IMarker.MESSAGE, text.trim());
         varMarker.setAttribute(IMarker.LOCATION, "line " + argNode.getStartLine());
         varMarker.setAttribute(IMarker.CHAR_START, argNode.getOffset());
         varMarker.setAttribute(IMarker.CHAR_END, argNode.getOffset()
              + argNode.getLength());
         varMarker.setAttribute(IMarker.USER_EDITABLE, false);
      }
   }

   public static String getMarkerType() {
      if (StringUtils.isEmpty(TASK_MARKER_TYPE)) {
         String foundMarkerType = "";
         IConfigurationElement[] config = Platform.getExtensionRegistry()
              .getConfigurationElementsFor("org.eclipse.ui.editors.annotationTypes");
         String markerType = null;
         for (IConfigurationElement e : config) {
            if (e != null) {
               markerType = e.getAttribute("markerType");
               if (markerType != null && markerType
                    .endsWith(TaskConstants.XTEXT_MARKER_SIMPLE_NAME)) {
                  foundMarkerType = markerType;
                  break;
               }
            }
         }
         return foundMarkerType;
      } else {
         return TASK_MARKER_TYPE;
      }
   }
}
