package org.eclipse.xtext.todo;

import java.io.IOException;
import java.util.Collections;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.xtext.Constants;
import org.eclipse.xtext.builder.IXtextBuilderParticipant;
import org.eclipse.xtext.resource.IResourceDescription;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceFactory;

import com.google.inject.Inject;
import com.google.inject.name.Named;

public class XtextTaskCalculator implements IXtextBuilderParticipant {

	@Inject
	private XtextResourceFactory xtextResourceFactory;

	@Inject
	private ITaskElementChecker objElementChecker;

	@Inject
	private IActivatorProvider activatorProvider;

	@Inject
	@Named(Constants.FILE_EXTENSIONS)
	private String dslFileExtension;

	@Override
	public void build(IBuildContext context, IProgressMonitor monitor)
			throws CoreException {
		for (IResourceDescription.Delta delta : context.getDeltas()) {
			URI uri = delta.getUri();
			if (dslFileExtension.equals(uri.fileExtension())) {
				IResource resource;
				if (uri.isPlatformResource()) {
					IPath path = new Path(uri.toPlatformString(true));
					resource = ResourcesPlugin.getWorkspace().getRoot()
							.getFile(path);
				} else {
					IStatus status = new Status(IStatus.WARNING,
							activatorProvider.getActivator().getBundle()
									.getSymbolicName(), "Unexpected URI: "
									+ uri);
					Activator.getDefault().getLog().log(status);
					continue;
				}

				if (resource.exists()) {
					resource.deleteMarkers(MarkerCreator.getMarkerType(), true,
							IResource.DEPTH_INFINITE);
				}

				XtextResource xtextResource = (XtextResource) xtextResourceFactory
						.createResource(delta.getUri());
				try {
					xtextResource.load(Collections.EMPTY_MAP);
					new MarkerCreator(resource, objElementChecker,
							activatorProvider, monitor).exec(xtextResource);
				} catch (IOException e) {
					IStatus status = new Status(IStatus.ERROR,
							activatorProvider.getActivator().getBundle()
									.getSymbolicName(),
							"Could not create marker for Xtext resource "
									+ delta.getUri(), e);
					Activator.getDefault().getLog().log(status);
				}
			}
		}
	}
}
