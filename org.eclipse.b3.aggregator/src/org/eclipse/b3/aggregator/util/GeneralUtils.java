/*******************************************************************************
 * Copyright (c) 2006-2007, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 ******************************************************************************/

package org.eclipse.b3.aggregator.util;

import org.eclipse.b3.aggregator.Aggregation;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

/**
 * @author Karel Brezina
 * 
 */
public class GeneralUtils {

	public static Aggregation getAggregator(EObject eObject) {
		EList<EObject> contents = getAggregatorResource(eObject).getContents();

		if(contents != null && contents.size() > 0)
			return (Aggregation) contents.get(0);

		throw new IllegalArgumentException("Aggregator was not found");
	}

	public static AggregatorResource getAggregatorResource(EObject eObject) {

		try {
			for(Resource resource : eObject.eResource().getResourceSet().getResources())
				if(resource instanceof AggregatorResource)
					return (AggregatorResource) resource;
		}
		catch(Exception e) {
			throw new IllegalArgumentException("AggregatorResource was not found", e);
		}

		throw new IllegalArgumentException("AggregatorResource was not found");
	}

}
