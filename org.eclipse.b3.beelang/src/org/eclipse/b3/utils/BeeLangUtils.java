/**
 * Copyright (c) 2006-2009, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 */

package org.eclipse.b3.utils;

import org.eclipse.b3.backend.evaluator.b3backend.BExpression;
import org.eclipse.b3.backend.evaluator.b3backend.IFunction;
import org.eclipse.b3.build.BeeModel;
import org.eclipse.b3.build.IBuilder;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parsetree.CompositeNode;
import org.eclipse.xtext.parsetree.NodeAdapter;
import org.eclipse.xtext.parsetree.NodeUtil;
import org.eclipse.xtext.util.Strings;

/**
 * Contains useful utilities when working with b3 language files.
 * 
 */
public class BeeLangUtils {

	/**
	 * Returns a human readable name/type for the closest named element e.g. function, builder or the global
	 * BeeModel.
	 * 
	 * @param expr
	 * @return A string that helps identify where an expression is located.
	 */
	public static String closestNamedElement(BExpression expr) {
		EObject e = expr;
		do {
			if(isExpressionContainer(e))
				return humanDescriptionOf(e);
			e = e.eContainer();
		} while(e != null);
		return "";

	}

	/**
	 * Returns the line number associated with the given EObject, or 0 if no line number information
	 * is found.
	 * 
	 * @param e
	 * @return line number of e, or 0 if not found.
	 */
	public static int getLineNumber(EObject e) {
		int lineNumber = 0;
		if(e != null) {
			NodeAdapter adapter = NodeUtil.getNodeAdapter(e);
			if(adapter != null) {
				CompositeNode node = adapter.getParserNode();
				if(node != null) {
					lineNumber = node.getTotalLine();
				}
			}
		}
		return lineNumber;

	}

	private static String humanDescriptionOf(EObject e) {
		if(e instanceof IBuilder)
			return "builder " + ((IBuilder) e).getName();
		if(e instanceof IFunction)
			return "function " + ((IFunction) e).getName();
		// TODO: Add more
		if(e instanceof BeeModel)
			return "b3 model";
		return "";
	}

	private static String humanFriendlyResourceURI(URI uri) {
		if(uri.isFile())
			return uri.toFileString();
		if(uri.isPlatform())
			return uri.toPlatformString(true);
		return uri.toString();
	}

	private static boolean isExpressionContainer(EObject o) {
		if(o instanceof IFunction && !Strings.isEmpty(((IFunction) o).getName()))
			return true;
		if(o instanceof BeeModel)
			return true;
		// TODO: add more (concerns)
		return false;
	}

}
