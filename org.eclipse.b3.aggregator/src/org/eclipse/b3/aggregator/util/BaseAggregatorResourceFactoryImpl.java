/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.b3.aggregator.util;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl;

public class BaseAggregatorResourceFactoryImpl extends ResourceFactoryImpl {

	@Override
	public Resource createResource(URI uri) {
		return new BaseAggregatorResourceImpl(uri);
	}

}
