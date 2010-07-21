package org.eclipse.b3.ui.coloring;

import java.util.List;

import org.eclipse.b3.backend.evaluator.b3backend.BLiteralExpression;
import org.eclipse.b3.build.BeeModel;
import org.eclipse.b3.build.BuildUnit;
import org.eclipse.b3.build.CapabilityPredicate;
import org.eclipse.b3.build.PathVector;
import org.eclipse.b3.build.RepoOption;
import org.eclipse.b3.build.Repository;
import org.eclipse.b3.build.RequiredCapability;
import org.eclipse.b3.build.VersionedCapability;
import org.eclipse.b3.services.BeeLangGrammarAccess;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.parsetree.AbstractNode;
import org.eclipse.xtext.parsetree.CompositeNode;
import org.eclipse.xtext.parsetree.LeafNode;
import org.eclipse.xtext.parsetree.NodeAdapter;
import org.eclipse.xtext.parsetree.NodeUtil;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.ui.editor.syntaxcoloring.ISemanticHighlightingCalculator;

import com.google.inject.Inject;

/**
 * Semantic highlighting for b3 (i.e. where highlight depends on where in grammar a particular
 * instance / token is.
 * 
 * TODO: as the number of rules increases, change implementation from using x instanceof y to
 * a declarative polymorph class.
 * 
 */
public class BeeLangSemanticHighlightingCalculator implements ISemanticHighlightingCalculator {

	private static class ZeroLengthFilteredAcceptorWrapper implements IHighlightedPositionAcceptor {
		private IHighlightedPositionAcceptor wrapped;

		public ZeroLengthFilteredAcceptorWrapper(IHighlightedPositionAcceptor wrapped) {
			this.wrapped = wrapped;
		}

		// @Override
		public void addPosition(int offset, int length, String... id) {
			// FOR DEBUGGING
			// StringBuffer buf = new StringBuffer();
			// buf.append(offset);
			// buf.append(", ");
			// buf.append(length);
			// for(String s : id)
			// buf.append(", ").append(s);
			// buf.append("\n");
			// System.err.print(buf.toString());
			if(length == 0)
				return;
			wrapped.addPosition(offset, length, id);
		}

	}

	@Inject
	private IGrammarAccess grammarAccess;

	// navigate to the parse node corresponding to the semantic object and
	// fetch the leaf node that corresponds to the first feature with the given
	// name, or the assignment of a composite node to first feature with given name.
	//
	public AbstractNode getFirstFeatureNode(EObject semantic, String feature) {
		NodeAdapter adapter = NodeUtil.getNodeAdapter(semantic);
		if(adapter != null) {
			CompositeNode node = adapter.getParserNode();
			if(node != null) {
				if(feature == null)
					return null;
				for(AbstractNode child : node.getChildren()) {
					if(child instanceof LeafNode) {
						if(feature.equals(((LeafNode) child).getFeature())) {
							return child;
						}
					}
					else if(child instanceof CompositeNode) {
						EObject ge = ((CompositeNode) child).getGrammarElement();
						if(ge.eContainer() instanceof Assignment)
							if(feature.equals(((Assignment) ge.eContainer()).getFeature()))
								return child;
					}
				}
			}
		}
		return null;
	}

	public void highlightBuildUnit(BuildUnit bu, IHighlightedPositionAcceptor acceptor) {
		highlightFirstFeature(bu, "version", BeeLangHighlightConfiguration.VERSION_ID, acceptor);
	}

	public void highlightCapabilityPredicate(CapabilityPredicate cp, IHighlightedPositionAcceptor acceptor) {
		highlightFirstFeature(cp, "versionRange", BeeLangHighlightConfiguration.VERSION_ID, acceptor);
	}

	// helper method that takes care of highlighting the first feature element
	// of a semantic object using a given text style ID
	private void highlightFirstFeature(EObject semobject, String featurename, String highlightID,
			IHighlightedPositionAcceptor acceptor) {
		// fetch the parse node for the entity
		AbstractNode nodetohighlight = getFirstFeatureNode(semobject, featurename);
		if(nodetohighlight == null) {
			// TODO: WARNING - Could not find node
			return;
		}
		acceptor.addPosition(nodetohighlight.getOffset(), nodetohighlight.getLength(), highlightID);
	}

	private void highlightObject(EObject semantic, String highlightID, IHighlightedPositionAcceptor acceptor) {
		NodeAdapter adapter = NodeUtil.getNodeAdapter(semantic);
		if(adapter == null) {
			// TODO: WARNING - Could not find node
			return;
		}
		CompositeNode node = adapter.getParserNode();
		if(node == null) {
			// TODO: WARNING - Could not find node
			return;
		}
		acceptor.addPosition(node.getOffset(), node.getLength(), highlightID);
	}

	public void highlightPaths(PathVector v, IHighlightedPositionAcceptor acceptor) {
		highlightObject(v, BeeLangHighlightConfiguration.PATH_ID, acceptor);
	}

	public void highlightRepoOption(RepoOption option, IHighlightedPositionAcceptor acceptor) {
		highlightFirstFeature(option, "name", BeeLangHighlightConfiguration.KEYWORD_ID, acceptor);
	}

	public void highlightRepository(Repository repo, IHighlightedPositionAcceptor acceptor) {
		highlightFirstFeature(repo, "handlerType", BeeLangHighlightConfiguration.KEYWORD_ID, acceptor);
	}

	public void highlightRequiredCapability(RequiredCapability rc, IHighlightedPositionAcceptor acceptor) {
		highlightFirstFeature(rc, "versionRange", BeeLangHighlightConfiguration.VERSION_ID, acceptor);
	}

	public void highlightVersionedCapability(VersionedCapability vc, IHighlightedPositionAcceptor acceptor) {
		highlightFirstFeature(vc, "version", BeeLangHighlightConfiguration.VERSION_ID, acceptor);
	}

	public void provideHighlightingFor(XtextResource resource, IHighlightedPositionAcceptor acceptor) {
		if(resource == null)
			return;
		acceptor = new ZeroLengthFilteredAcceptorWrapper(acceptor);
		BeeLangGrammarAccess f = (BeeLangGrammarAccess) grammarAccess;
		List<RuleCall> x = f.findRuleCalls(f.getID_or_KWRule());
		Iterable<AbstractNode> allNodes = NodeUtil.getAllContents(resource.getParseResult().getRootNode());

		for(AbstractNode node : allNodes) {
			EObject gElem = node.getGrammarElement();
			// EObject elem = node.getElement();
			// is this a RuleCall of the specified type
			if(gElem instanceof RuleCall)
				if(x != null && x.contains(gElem)) {
					acceptor.addPosition(node.getOffset(), node.getLength(), BeeLangHighlightConfiguration.DEFAULT_ID);
				}
		}
		provideHighlightingFor2(resource, acceptor);
	}

	public void provideHighlightingFor2(XtextResource resource, IHighlightedPositionAcceptor acceptor) {
		if(resource == null)
			return;
		EList<EObject> contents = resource.getContents();
		if(contents == null || contents.size() == 0)
			return; // nothing there at all - probably an empty file
		BeeModel model = (BeeModel) contents.get(0);
		// BuildUnit bu = model.getBody();
		TreeIterator<EObject> all = model.eAllContents();
		while(all.hasNext()) {
			EObject o = all.next();
			// TODO: OPTIMIZE the if-then-else below using an EMF switch
			if(o instanceof BuildUnit)
				highlightBuildUnit((BuildUnit) o, acceptor);

			// handle literals
			else if(o instanceof BLiteralExpression) {
				Object val = ((BLiteralExpression) o).getValue();
				// handle real numbers (INT and HEX are handled by terminal rules)
				if(val instanceof Float || val instanceof Double)
					highlightObject(o, BeeLangHighlightConfiguration.REAL_ID, acceptor);
			}
			else if(o instanceof PathVector)
				highlightPaths((PathVector) o, acceptor);
			else if(o instanceof RequiredCapability)
				highlightRequiredCapability((RequiredCapability) o, acceptor);
			else if(o instanceof VersionedCapability)
				highlightVersionedCapability((VersionedCapability) o, acceptor);
			else if(o instanceof CapabilityPredicate)
				highlightCapabilityPredicate((CapabilityPredicate) o, acceptor);
			else if(o instanceof Repository)
				highlightRepository((Repository) o, acceptor);
			else if(o instanceof RepoOption)
				highlightRepoOption((RepoOption) o, acceptor);

		}
	}
}
