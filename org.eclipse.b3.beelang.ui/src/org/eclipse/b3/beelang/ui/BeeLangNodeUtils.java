/**
 * Copyright (c) 2006-2009, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 */

package org.eclipse.b3.beelang.ui;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.parsetree.AbstractNode;
import org.eclipse.xtext.parsetree.CompositeNode;
import org.eclipse.xtext.parsetree.LeafNode;
import org.eclipse.xtext.parsetree.NodeAdapter;
import org.eclipse.xtext.parsetree.NodeUtil;

/**
 * Utils for navigating nodes.
 * 
 */
public class BeeLangNodeUtils {
	/**
	 * Navigate to the parse node corresponding to the semantic object and
	 * fetch the leaf node that corresponds to the first feature with the given
	 * name, or the assignment of a composite node to first feature with given name.
	 * 
	 * @return null if there is no adapter, or feature does not exist.
	 */
	public static AbstractNode getFirstFeatureNode(EObject semantic, String feature) {
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
}
