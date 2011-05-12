/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.b3.aggregator.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.b3.aggregator.Aggregator;
import org.eclipse.b3.aggregator.AggregatorFactory;
import org.eclipse.b3.aggregator.AggregatorPackage;
import org.eclipse.b3.aggregator.EnabledStatusProvider;
import org.eclipse.b3.aggregator.InfosProvider;
import org.eclipse.b3.aggregator.LinkReceiver;
import org.eclipse.b3.aggregator.LinkSource;
import org.eclipse.b3.aggregator.StatusCode;
import org.eclipse.b3.aggregator.impl.ContributionImpl;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.notify.impl.NotificationImpl;
import org.eclipse.emf.common.notify.impl.NotifyingListImpl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;

/**
 * <!-- begin-user-doc --> The <b>Resource </b> associated with the package.
 * 
 * @extends AggregatorResource <!-- end-user-doc -->
 * @see org.eclipse.b3.aggregator.util.AggregatorResourceFactoryImpl
 * @generated
 */
public class AggregatorResourceImpl extends XMIResourceImpl implements AggregatorResource {
	class NotifyAnalyzeResourceFinished extends NotificationImpl {
		public NotifyAnalyzeResourceFinished() {
			super(Notification.SET, false, true);
		}

		@Override
		public int getFeatureID(Class<?> expectedClass) {
			return RESOURCE__ANALYSIS_FINISHED;
		}

		@Override
		public Object getNotifier() {
			return AggregatorResourceImpl.this;
		}
	}

	class NotifyAnalyzeResourceStarted extends NotificationImpl {
		public NotifyAnalyzeResourceStarted() {
			super(Notification.SET, true, false);
		}

		@Override
		public int getFeatureID(Class<?> expectedClass) {
			return RESOURCE__ANALYSIS_STARTED;
		}

		@Override
		public Object getNotifier() {
			return AggregatorResourceImpl.this;
		}
	}

	/**
	 * The infos.
	 * 
	 * @see #getInfos
	 */
	protected EList<Diagnostic> infos;

	private boolean analysisRequest;

	private boolean analysisIsRunning;

	// adapter to maintain linking of objects
	private static Adapter LINK_UPDATE_ADAPTER = new AdapterImpl() {

		@Override
		public void notifyChanged(Notification notification) {
			if(notification.getFeatureID(LinkSource.class) == AggregatorPackage.LINK_SOURCE__RECEIVER) {
				Object receiver;

				switch(notification.getEventType()) {
					case Notification.SET:
						receiver = notification.getOldValue();
						if(receiver != null)
							((LinkReceiver) receiver).unlinkSource((LinkSource) notification.getNotifier());
						receiver = notification.getNewValue();
						if(receiver != null)
							((LinkReceiver) receiver).linkSource((LinkSource) notification.getNotifier());
						break;
					case Notification.ADD:
						receiver = notification.getNewValue();
						((LinkReceiver) receiver).linkSource((LinkSource) notification.getNotifier());
						break;
					case Notification.REMOVE:
						receiver = notification.getOldValue();
						((LinkReceiver) receiver).unlinkSource((LinkSource) notification.getNotifier());
						break;
				}
			}
		}

	};

	/**
	 * Creates an instance of the resource.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param uri
	 *            the URI of the new resource.
	 * @generated
	 */
	public AggregatorResourceImpl(URI uri) {
		super(uri);
	}

	private void analyze(EObject object) {
		if(object instanceof EnabledStatusProvider && !((EnabledStatusProvider) object).isEnabled())
			return;

		if(object instanceof InfosProvider) {
			InfosProvider iProvider = (InfosProvider) object;

			for(String error : iProvider.getErrors())
				getErrors().add(new ResourceDiagnosticImpl(error, EcoreUtil.getURI(object).toString()));

			for(String warning : iProvider.getWarnings())
				getWarnings().add(new ResourceDiagnosticImpl(warning, EcoreUtil.getURI(object).toString()));

			for(String info : iProvider.getInfos())
				getInfos().add(new ResourceDiagnosticImpl(info, EcoreUtil.getURI(object).toString()));
		}

		if(object.eContents() == null)
			return;

		for(EObject childObject : object.eContents())
			analyze(childObject);
	}

	/*
	 * Analysis aggregator errors, warnings & infos
	 */
	public void analyzeResource() {
		Runnable runnable = new Runnable() {
			public void run() {
				synchronized(AggregatorResourceImpl.this) {
					while(analysisRequest)
						try {
							analysisRequest = false;
							analysisIsRunning = true;

							eNotify(new NotifyAnalyzeResourceStarted());

							if(errors != null) {
								Iterator<Diagnostic> iterator = errors.iterator();

								while(iterator.hasNext())
									if(iterator.next().getClass() == ResourceDiagnosticImpl.class)
										iterator.remove();
							}

							if(warnings != null) {
								Iterator<Diagnostic> iterator = warnings.iterator();

								while(iterator.hasNext())
									if(iterator.next().getClass() == ResourceDiagnosticImpl.class)
										iterator.remove();
							}

							if(infos != null) {
								Iterator<Diagnostic> iterator = infos.iterator();

								while(iterator.hasNext())
									if(iterator.next().getClass() == ResourceDiagnosticImpl.class)
										iterator.remove();
							}

							Aggregator aggregator = (Aggregator) getContents().get(0);

							analyze((EObject) aggregator);
						}
						finally {
							eNotify(new NotifyAnalyzeResourceFinished());

							analysisIsRunning = false;
						}
				}
			}
		};

		if(analysisRequest)
			return;

		analysisRequest = true;

		if(analysisIsRunning)
			return;

		new Thread(runnable).start();
	}

	// maintain linking of objects
	@Override
	public void attached(EObject eObject) {
		super.attached(eObject);

		if(eObject instanceof LinkSource) {
			LinkSource linkSource = (LinkSource) eObject;
			LinkReceiver linkReceiver = linkSource.getReceiver();

			if(linkReceiver != null)
				linkReceiver.linkSource(linkSource);

			eObject.eAdapters().add(LINK_UPDATE_ADAPTER);
		}
	}

	// maintain linking of objects
	@Override
	public void detached(EObject eObject) {
		super.detached(eObject);

		if(eObject instanceof LinkSource) {
			eObject.eAdapters().remove(LINK_UPDATE_ADAPTER);

			LinkSource linkSource = (LinkSource) eObject;
			LinkReceiver linkReceiver = linkSource.getReceiver();

			if(linkReceiver != null)
				linkReceiver.unlinkSource(linkSource);
		}
	}

	/**
	 * Returns the {@link Aggregator} instance contained in this {@link Resource}.
	 * 
	 * @return the {@code Aggregator} instance contained in this {@code Resource}.
	 */
	public Aggregator getAggregator() {
		return (Aggregator) getContents().get(0);
	}

	public EList<Diagnostic> getInfos() {
		if(infos == null) {
			infos = new NotifyingListImpl<Diagnostic>() {
				private static final long serialVersionUID = 1L;

				@Override
				public int getFeatureID() {
					return RESOURCE__INFOS;
				}

				@Override
				public Object getNotifier() {
					return AggregatorResourceImpl.this;
				}

				@Override
				protected boolean isNotificationRequired() {
					return AggregatorResourceImpl.this.eNotificationRequired();
				}
			};
		}
		return infos;
	}

	public void updateVerificationMarkers(List<VerificationDiagnostic> verificationDiagnostics) {
		synchronized(this) {
			if(errors != null) {
				Iterator<Diagnostic> iterator = errors.iterator();

				while(iterator.hasNext())
					if(iterator.next() instanceof VerificationDiagnostic)
						iterator.remove();
			}

			// wee need to resolve all the diagnostics first as they may link to each other which may result in unresolved diagnostics being used
			// and consequently in exceptions being thrown
			ArrayList<VerificationDiagnostic> resolvedVerificationDiagnostics = new ArrayList<VerificationDiagnostic>(
				verificationDiagnostics.size());
			for(VerificationDiagnostic verificationDiagnostic : verificationDiagnostics)
				if(verificationDiagnostic.resolve(this))
					resolvedVerificationDiagnostics.add(verificationDiagnostic);

			EList<Diagnostic> errors = getErrors();
			for(VerificationDiagnostic verificationDiagnostic : resolvedVerificationDiagnostics) {
				EObject eObject = getResourceSet().getEObject(verificationDiagnostic.getLocationURI(), true);
				if(eObject instanceof ContributionImpl) {
					((ContributionImpl) eObject).setStatus(AggregatorFactory.eINSTANCE.createStatus(StatusCode.BROKEN));
				}
				errors.add(verificationDiagnostic);
			}
		}
	}
} // AggregatorResourceImpl
