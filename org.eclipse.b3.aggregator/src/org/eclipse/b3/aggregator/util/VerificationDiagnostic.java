package org.eclipse.b3.aggregator.util;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.b3.aggregator.Contribution;
import org.eclipse.b3.aggregator.IdentificationProvider;
import org.eclipse.b3.aggregator.MappedRepository;
import org.eclipse.b3.aggregator.MappedUnit;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.equinox.p2.metadata.IInstallableUnit;
import org.eclipse.equinox.p2.metadata.IRequirement;
import org.eclipse.osgi.util.NLS;

public abstract class VerificationDiagnostic extends ResourceDiagnosticImpl {

	private static class DependencyChainIdentifier {

		private static final String IDENTIFICATION_SEPEATOR = "/";

		private CharSequence identification = new StringBuilder();

		private URI modelElementURI;

		private StringBuilder reverser = new StringBuilder();

		public String getIdentification(int stripLength) {
			if(reverser != null)
				throw new IllegalStateException("The identification has not been sealed yet.");

			return identification.subSequence(0, identification.length() - stripLength).toString();
		}

		public URI getModelElementURI() {
			return modelElementURI;
		}

		protected StringBuilder getReverser() {
			if(reverser == null)
				throw new IllegalStateException("The identification has already been sealed.");

			reverser.setLength(0);
			return reverser;
		}

		public int length() {
			return identification.length();
		}

		public boolean prepend(DependencyLink link, EObject eObject) {
			if(link != null) {
				String identification = link.getIdentification();

				if(identification != null) { // if the link already has an identifier then we can finish the current identification right away
					if(length() == 0) { // reuse the identification directly if our own is empty
						this.identification = identification;
						modelElementURI = link.getModelElementURI();
						reverser = null;
					}
					else { // prepend the identification to our own
						prepend(identification);
						seal(link.getModelElementURI());
					}
					return true;
				}

				link.setIdentifier(this);
				if(eObject == null) {
					prepend("InstallableUnit", link.getInstallableUnit().toString());
					return false;
				} // else fall through
			}

			prepend(eObject.eClass().getName(), eObject instanceof IdentificationProvider
					? ((IdentificationProvider) eObject).getIdentification()
					: eObject.toString());
			return false;
		}

		protected void prepend(String value) {
			StringBuilder reverser = getReverser();

			reverser.append(value);

			prepend(reverser);
		}

		public void prepend(String type, String instance) {
			StringBuilder reverser = getReverser();

			reverser.append(type).append('(').append(instance).append(')');

			prepend(reverser);
		}

		protected void prepend(StringBuilder reverser) {
			((StringBuilder) identification).append(reverser.reverse()).append(IDENTIFICATION_SEPEATOR);
		}

		public void seal(URI modelElementURI) {
			getReverser(); // check that the identification is not sealed yet
			identification = ((StringBuilder) identification).reverse().substring(IDENTIFICATION_SEPEATOR.length());
			this.modelElementURI = modelElementURI;
			reverser = null;
		}

	}

	public static class DependencyLink {

		private IInstallableUnit installableUnit;

		private DependencyLink parent;

		private DependencyChainIdentifier identifier;

		private int downstreamLinksLabelLength;

		public DependencyLink(IInstallableUnit value, DependencyLink parent) {
			this.installableUnit = value;
			this.parent = parent;
		}

		public String getIdentification() {
			return identifier != null
					? identifier.getIdentification(downstreamLinksLabelLength)
					: null;
		}

		public IInstallableUnit getInstallableUnit() {
			return installableUnit;
		}

		public URI getModelElementURI() {
			return identifier != null
					? identifier.getModelElementURI()
					: null;
		}

		public DependencyLink getParent() {
			return parent;
		}

		public void setIdentifier(DependencyChainIdentifier identifier) {
			this.identifier = identifier;
			this.downstreamLinksLabelLength = identifier.length();
		}

	}

	public static class MissingIU extends VerificationDiagnostic {

		protected IRequirement requirement;

		public MissingIU(DependencyLink missingIU, IRequirement requirement) {
			super(missingIU);
			this.requirement = requirement;
		}

		@Override
		public boolean resolve(Resource resource) {
			if(location != null)
				return true;

			if(!super.resolve(resource))
				return false;

			this.message = (requirement != null)
					? NLS.bind(
						org.eclipse.equinox.internal.p2.director.Messages.Explanation_missingRequired,
						problemIU.getIdentification(), requirement)
					: NLS.bind(
						org.eclipse.equinox.internal.p2.director.Messages.Explanation_missingNonGreedyRequired,
						problemIU.getIdentification());
			return true;
		}

	}

	public static class Singleton extends VerificationDiagnostic {

		/** A helper class to hold data shared among related instances of {@link Singleton}. */
		public static class SharedData {

			protected static final String CONFLICTING_IUS_SEPEATOR = ", ";

			/** map of unique identified (matched to model nodes) diagnostics */
			protected Map<URI, Singleton> identifiedDiagnosticMap = new HashMap<URI, Singleton>();

			/** the message shared by all related diagnostics */
			protected CharSequence message;

			{
				StringBuilder messageBuilder = new StringBuilder();

				// the first character of the StringBuilder is used as a counter of the related diagnostics
				message = messageBuilder.append((char) 0);
			}

			protected void buildMessage(String identification) {
				StringBuilder messageBuilder = getMessageBuilder();

				messageBuilder.append(CONFLICTING_IUS_SEPEATOR).append(identification);

				int diagnosticsLeftToIdentify = messageBuilder.charAt(0) - 1;

				if(diagnosticsLeftToIdentify == 0) { // seal the shared data if we do not expect any more diagnostics
					message = NLS.bind(
						org.eclipse.equinox.internal.p2.director.Messages.Explanation_singleton,
						messageBuilder.substring(1 + CONFLICTING_IUS_SEPEATOR.length()));
				}
				else
					messageBuilder.setCharAt(0, (char) diagnosticsLeftToIdentify);
			}

			protected String getMessage() {
				if(!(message instanceof String))
					throw new IllegalStateException("The shared data has not been sealed yet.");

				return (String) message;
			}

			protected StringBuilder getMessageBuilder() {
				if(!(message instanceof StringBuilder))
					throw new IllegalStateException("The shared data has already been sealed.");

				return (StringBuilder) message;
			}

			protected Map<URI, Singleton> getRelatedDiagnosticMap() {
				return identifiedDiagnosticMap;
			}

			protected boolean identifyDiagnostic(Singleton singleton) {
				buildMessage(singleton.problemIU.getIdentification());

				URI locationURI = singleton.getLocationURI();

				if(identifiedDiagnosticMap.containsKey(locationURI))
					return false;

				identifiedDiagnosticMap.put(locationURI, singleton);
				return true;
			}

			protected boolean isDuplicateDiagnostic(Singleton singleton) {
				return identifiedDiagnosticMap.containsKey(singleton.getLocationURI());
			}

			protected SharedData registerDiagnostic(Singleton singleton) {
				StringBuilder messageBuilder = getMessageBuilder();

				int registeredDiagnosticsCount = messageBuilder.charAt(0) + 1;

				messageBuilder.setCharAt(0, (char) registeredDiagnosticsCount);

				return this;
			}

			public void unregisterDiagnostics(Singleton singleton) {
				StringBuilder messageBuilder;
				try {
					messageBuilder = getMessageBuilder();
				}
				catch(IllegalStateException e) {
					return;
				}

				int registeredDiagnosticsCount = messageBuilder.charAt(0) - 1;

				messageBuilder.setCharAt(0, (char) registeredDiagnosticsCount);
			}

		}

		protected SharedData sharedData;

		public Singleton(DependencyLink conflictingIU, SharedData sharedData) {
			super(conflictingIU);
			this.sharedData = sharedData.registerDiagnostic(this);
		}

		@Override
		public String getMessage() {
			if(message == null)
				message = sharedData.getMessage();
			return message;
		}

		@Override
		public boolean resolve(Resource resource) {
			if(location != null)
				return sharedData.isDuplicateDiagnostic(this);

			if(!super.resolve(resource)) {
				sharedData.unregisterDiagnostics(this);
				return false;
			}

			return sharedData.identifyDiagnostic(this);
		}

	}

	public static final String ATTR_VERIFICATION_TYPE = "p2.verification.error.type";

	public static final String PROP_AGGREGATOR_MODEL_ELEMENT_URI = "org.eclipse.b3.aggregator.model.element.URI"; //$NON-NLS-1$

	protected DependencyLink problemIU;

	public VerificationDiagnostic(DependencyLink problemIU) {
		super(null, null);
		this.problemIU = problemIU;
	}

	protected EObject getCorrespondingModelObject(Resource resource, DependencyLink link) {
		String relativeEObjectURI = link.getInstallableUnit().getProperty(PROP_AGGREGATOR_MODEL_ELEMENT_URI);
		URI absoluteEObjectURI = URI.createURI(relativeEObjectURI).resolve(resource.getURI());

		return resource.getResourceSet().getEObject(absoluteEObjectURI, true);
	}

	public URI getLocationURI() {
		return problemIU.getModelElementURI();
	}

	protected void identifyDependencyChain(Resource resource, DependencyLink dependencyChain) {
		DependencyChainIdentifier chainIdentifier = new DependencyChainIdentifier();

		DependencyLink currentLink = problemIU;
		DependencyLink parentLink = currentLink.getParent();
		EObject modelObject;

		// build the path of dependencies up to a dependency which corresponds to a model element
		if(parentLink != null) {
			LINK_LOOP: while(true) {
				DependencyLink previousLink = currentLink;

				currentLink = parentLink;
				parentLink = currentLink.getParent();

				if(parentLink == null) { // the current link is the head of the chain
					// the head of the chain must have the model URI information attached
					modelObject = getCorrespondingModelObject(resource, currentLink);

					// try to locate a more specific model object corresponding to the currentIU
					if(modelObject instanceof MappedRepository) {
						IInstallableUnit previousIU = previousLink.getInstallableUnit();

						for(MappedUnit mu : ((MappedRepository) modelObject).getUnits(true)) {
							if(mu.getRequirement().isMatch(previousIU)) {
								currentLink = previousLink;
								modelObject = (EObject) mu;
								// we don't want to prepend the current link to the chainIdentifier as the corresponding model node will be prepended
								// instead
								break LINK_LOOP;
							}
						}
					}

					if(chainIdentifier.prepend(previousLink, null)) // if the link already has an identifier then we are done
						return;

					// we've reached the head of the chain
					break;
				}

				if(chainIdentifier.prepend(previousLink, null)) // if the link already has an identifier then we are done
					return;
			}
		}
		else
			// the chain consists of just one link - which is its head (which must have the model URI information attached)
			modelObject = getCorrespondingModelObject(resource, currentLink);

		if(chainIdentifier.prepend(currentLink, modelObject)) // if the link already has an identifier then we are done
			return;

		// build a path of model elements up to a Contribution (or root) node
		URI modelElementURI;
		while(true) {
			if(modelObject instanceof Contribution) {
				modelElementURI = EcoreUtil.getURI(modelObject);
				break;
			}

			modelObject = modelObject.eContainer();

			if(modelObject == null) {
				modelElementURI = null;
				break;
			}

			chainIdentifier.prepend(null, modelObject);
		}

		// finish the chain identification
		chainIdentifier.seal(modelElementURI);
	}

	public boolean resolve(Resource resource) {
		if(location == null) {
			identifyDependencyChain(resource, problemIU);

			URI modelElementURI = problemIU.getModelElementURI();

			if(modelElementURI == null)
				return false;

			this.location = modelElementURI.toString();
		}

		return true;
	}

}
