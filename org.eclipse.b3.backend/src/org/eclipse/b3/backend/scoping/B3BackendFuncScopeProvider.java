/**
 * Copyright (c) 2006-2009, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 */

package org.eclipse.b3.backend.scoping;

import java.util.ArrayList;
import java.util.Iterator;

import org.eclipse.b3.backend.evaluator.b3backend.BConcern;
import org.eclipse.b3.backend.evaluator.b3backend.BConcernContext;
import org.eclipse.b3.backend.evaluator.b3backend.BFunctionContainer;
import org.eclipse.b3.backend.evaluator.b3backend.BWithExpression;
import org.eclipse.b3.backend.evaluator.b3backend.IFunction;
import org.eclipse.xtext.resource.EObjectDescription;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;

/**
 * Function Scope Provider for B3Backend
 * 
 */
public class B3BackendFuncScopeProvider extends DeclarativeFuncScopeProvider {
	IScope funcScope(BFunctionContainer container) {
		ArrayList<IEObjectDescription> result = new ArrayList<IEObjectDescription>();

		for(IFunction func : container.getFunctions())
			result.add(new EObjectDescription(func.getName(), func, null));

		if(result.size() < 1)
			return doGetFuncScope(container.eContainer());
		return createScope(doGetFuncScope(container.eContainer()), result);
	}

	IScope funcScope(BWithExpression container) {
		ArrayList<IEObjectDescription> result = new ArrayList<IEObjectDescription>();
		IScope outermost = null;
		for(BConcern c : container.getConcerns()) {
			// iterator in supermost order
			//
			Iterator<BConcernContext> itor = c.getConcernContextIterator();
			while(itor.hasNext()) {
				BConcernContext cc = itor.next();
				for(IFunction func : cc.getFunctions())
					result.add(new EObjectDescription(func.getName(), func, null));
				if(result.size() < 1)
					continue;
				if(outermost == null)
					outermost = createScope(doGetFuncScope(container.eContainer()), result);
				else
					outermost = createScope(outermost, result);
				// clear for next
				result = new ArrayList<IEObjectDescription>();
			}

			for(IFunction func : c.getFunctions())
				result.add(new EObjectDescription(func.getName(), func, null));
			if(result.size() > 0) {
				if(outermost == null)
					outermost = createScope(doGetFuncScope(container.eContainer()), result);
				else
					outermost = createScope(outermost, result);
			}
		}
		return outermost != null
				? outermost
				: doGetFuncScope(container.eContainer());
	}
}
