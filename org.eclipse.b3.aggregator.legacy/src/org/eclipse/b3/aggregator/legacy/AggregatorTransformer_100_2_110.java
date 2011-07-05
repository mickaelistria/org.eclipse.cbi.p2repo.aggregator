/**
 * Copyright (c) 2006-2009, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 */

package org.eclipse.b3.aggregator.legacy;

import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;

/**
 * Transforms aggregator model instance from version 0.9.0 to 1.0.0
 * 
 * @author Karel Brezina
 */
public class AggregatorTransformer_100_2_110 extends ResourceTransformer {

	private static final String AGGREGATOR_NODE = "Aggregator";

	private static final String AGGREGATION_NODE = "Aggregation";

	@Override
	protected void doTransform(EObject srcEObject, TreePath trgtParentTreePath) {
		EClass scrEClass = srcEObject.eClass();
		if(AGGREGATOR_NODE.equals(scrEClass.getName()))
			transformAggregatorNode(srcEObject, trgtParentTreePath);
		else
			super.doTransform(srcEObject, trgtParentTreePath);
	}

	@Override
	public void initTransformer(Resource srcResource, Resource trgtResource, EPackage trgtPackage,
			Map<String, Object> context) {
		super.initTransformer(srcResource, trgtResource, trgtPackage, context);
	}

	private void transformAggregatorNode(EObject srcEObject, TreePath trgtParentTreePath) {
		EObject trgtEObject = createTrgtEObject(AGGREGATION_NODE, srcEObject);
		trgtParentTreePath.addToLastSegmentContainer(trgtEObject);
		copyAttributes(srcEObject, trgtEObject);
		copyReferences(srcEObject, trgtEObject, trgtParentTreePath);
	}
}
