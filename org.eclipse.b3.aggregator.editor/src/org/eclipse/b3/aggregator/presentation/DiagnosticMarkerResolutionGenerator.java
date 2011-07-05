package org.eclipse.b3.aggregator.presentation;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;

import org.eclipse.b3.aggregator.Aggregation;
import org.eclipse.b3.aggregator.AggregatorFactory;
import org.eclipse.b3.aggregator.Contribution;
import org.eclipse.b3.aggregator.LinkSource;
import org.eclipse.b3.aggregator.ValidationSet;
import org.eclipse.b3.aggregator.engine.Builder;
import org.eclipse.b3.aggregator.engine.Engine;
import org.eclipse.b3.aggregator.engine.RepositoryVerifier.AnalyzedPlannerStatus;
import org.eclipse.b3.aggregator.impl.ContributionImpl;
import org.eclipse.b3.aggregator.util.AggregatorResourceImpl;
import org.eclipse.b3.aggregator.util.ResourceUtils;
import org.eclipse.b3.aggregator.util.VerificationDiagnostic;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.equinox.app.IApplication;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorReference;
import org.eclipse.ui.IMarkerResolution;
import org.eclipse.ui.IMarkerResolutionGenerator2;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.internal.Workbench;
import org.eclipse.ui.part.FileEditorInput;
import org.xml.sax.SAXException;

public class DiagnosticMarkerResolutionGenerator implements IMarkerResolutionGenerator2 {

	static abstract class AggregatorMarkerResolution implements IMarkerResolution {
		abstract ValidationSet getReceiver(IMarker marker, AggregatorEditor editor);

		public void run(IMarker marker) {
			String uriAttribute = marker.getAttribute(EValidator.URI_ATTRIBUTE, null);
			URI uri = URI.createURI(uriAttribute);
			if(uri.fragment() == null)
				return;

			AggregatorEditor editor = getAggregatorEditor(marker);
			if(editor == null)
				return;

			ResourceSet resourceSet = editor.getEditingDomain().getResourceSet();
			Contribution contrib = (Contribution) resourceSet.getEObject(uri, true);
			ValidationSet child = getReceiver(marker, editor);
			child.getLinkedSources().add(contrib);
			contrib.setReceiver(child);
			editor.doSave(new NullProgressMonitor());
			Aggregation aggregator = ResourceUtils.getAggregator(resourceSet);
			verifyAggregation(aggregator);
		}
	}

	static class MoveToExistingChild extends AggregatorMarkerResolution {
		private final ValidationSet receiver;

		MoveToExistingChild(ValidationSet receiver) {
			this.receiver = receiver;
		}

		public String getLabel() {
			return "Move contribution into composite member '" + receiver.getLabel() + '\'';
		}

		@Override
		ValidationSet getReceiver(IMarker marker, AggregatorEditor editor) {
			return receiver;
		}
	}

	static final IMarkerResolution moveToNew = new AggregatorMarkerResolution() {

		public String getLabel() {
			return "Move contribution into a new validation set";
		}

		@Override
		ValidationSet getReceiver(IMarker marker, AggregatorEditor editor) {
			ResourceSet resourceSet = editor.getEditingDomain().getResourceSet();
			Contribution contrib = getContribution(marker, resourceSet);
			if(contrib == null)
				return null;

			((ContributionImpl) contrib).setStatus(null);
			Aggregation aggregator = ResourceUtils.getAggregator(resourceSet);
			ValidationSet child = AggregatorFactory.eINSTANCE.createValidationSet();
			child.setLabel(contrib.getLabel());
			aggregator.getValidationSets().add(child);
			return child;
		}
	};

	static void clearVerificationMarkers(Aggregation aggregator) {
		for(Contribution contrib : aggregator.getContributions())
			((ContributionImpl) contrib).setStatus(null);
	}

	static AggregatorEditor getAggregatorEditor(IMarker marker) {
		try {
			IFile file = (IFile) marker.getResource();
			AggregatorEditor editor = null;
			IWorkbenchPage firstPage = null;
			for(IWorkbenchWindow wbw : Workbench.getInstance().getWorkbenchWindows()) {
				for(IWorkbenchPage wbp : wbw.getPages()) {
					if(firstPage == null)
						firstPage = wbp;
					for(IEditorReference eref : wbp.getEditorReferences()) {
						IEditorPart ep = eref.getEditor(false);
						if(ep instanceof AggregatorEditor) {
							IEditorInput epInput = ep.getEditorInput();
							if(epInput instanceof FileEditorInput) {
								if(((FileEditorInput) epInput).getFile().equals(file)) {
									editor = (AggregatorEditor) ep;
									break;
								}
							}
						}
					}
				}
			}

			if(editor == null && firstPage != null) {
				IEditorPart ep = IDE.openEditor(firstPage, file);
				if(ep instanceof AggregatorEditor)
					editor = (AggregatorEditor) ep;
			}
			return editor;
		}
		catch(CoreException e) {
			return null;
		}
	}

	static Contribution getContribution(IMarker marker, ResourceSet resourceSet) {
		String uriAttribute = marker.getAttribute(EValidator.URI_ATTRIBUTE, null);
		URI uri = URI.createURI(uriAttribute);
		return uri.fragment() == null
				? null
				: (Contribution) resourceSet.getEObject(uri, true);
	};

	static Throwable unwind(Throwable t) {
		for(;;) {
			Class<?> tc = t.getClass();

			// We don't use instanceof operator since we want
			// the explicit class, not subclasses.
			//
			if(tc != RuntimeException.class && tc != InvocationTargetException.class && tc != SAXException.class &&
					tc != IOException.class)
				break;

			Throwable cause = t.getCause();
			if(cause == null)
				break;

			String msg = t.getMessage();
			if(msg != null && !msg.equals(cause.toString()))
				break;

			t = cause;
		}
		return t;
	}

	static void verifyAggregation(final Aggregation aggregator) {
		new Job("b3 Aggregator") {
			{
				setUser(true);
				setPriority(Job.LONG);
			}

			@Override
			protected IStatus run(IProgressMonitor monitor) {
				Resource resource = ((EObject) aggregator).eResource();
				try {
					clearVerificationMarkers(aggregator);
					Builder builder = new Builder();

					URI emfURI = resource.getURI();
					URL fileURL = FileLocator.toFileURL(new java.net.URI(emfURI.toString()).toURL());
					if(!"file".equals(fileURL.getProtocol()))
						throw new Exception("URI scheme is not \"file\"");
					java.net.URI uri = new java.net.URI(fileURL.getProtocol() + ":/" +
							URLEncoder.encode(fileURL.getPath(), "UTF-8").replaceAll("\\+", "%20"));
					builder.setBuildModelLocation(new File(uri));
					// builder.setLogLevel(LogUtils.DEBUG);
					builder.setAction(Builder.ActionType.VERIFY);

					if(builder.run(true, monitor) != IApplication.EXIT_OK)
						throw new Exception("Build failed (see log for more details)");
				}
				catch(Exception e) {
					Throwable cause = unwind(e);
					IStatus status = (cause instanceof CoreException)
							? ((CoreException) cause).getStatus()
							: new Status(IStatus.ERROR, Engine.PLUGIN_ID, IStatus.OK, cause.getMessage(), cause);

					if(resource != null && status instanceof AnalyzedPlannerStatus)
						((AggregatorResourceImpl) resource).updateVerificationMarkers(((AnalyzedPlannerStatus) status).getVerificationDiagnostics());

					return status;
				}

				return Status.OK_STATUS;
			}
		}.schedule();
	}

	public IMarkerResolution[] getResolutions(IMarker marker) {
		AggregatorEditor editor = getAggregatorEditor(marker);
		ResourceSet resourceSet = editor.getEditingDomain().getResourceSet();
		Contribution contrib = getContribution(marker, resourceSet);
		Aggregation aggregator = ResourceUtils.getAggregator(resourceSet);
		ArrayList<IMarkerResolution> resolutions = new ArrayList<IMarkerResolution>();
		boolean hasSelf = false;
		nextValidationSet: for(ValidationSet child : aggregator.getValidationSets()) {
			for(LinkSource link : child.getLinkedSources()) {
				if(link == contrib)
					continue nextValidationSet;
			}
			if(child.getLabel().equals(contrib.getLabel()))
				hasSelf = true;
			resolutions.add(new MoveToExistingChild(child));
		}
		if(!hasSelf)
			resolutions.add(moveToNew);
		return resolutions.toArray(new IMarkerResolution[resolutions.size()]);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.IMarkerResolutionGenerator2#hasResolutions(org.eclipse.core.resources.IMarker)
	 */
	public boolean hasResolutions(IMarker marker) {
		try {
			return isConflict(marker);
		}
		catch(CoreException e) {
			return false;
		}
	}

	/**
	 * @param marker
	 * @return
	 */
	private boolean isConflict(IMarker marker) throws CoreException {
		Object severity = marker.getAttribute(IMarker.SEVERITY);
		if(!(severity instanceof Integer && ((Integer) severity).intValue() == IMarker.SEVERITY_ERROR))
			return false;

		Object verType = marker.getAttribute(VerificationDiagnostic.ATTR_VERIFICATION_TYPE);
		return VerificationDiagnostic.Singleton.class.getName().equals(verType);
	}
}
