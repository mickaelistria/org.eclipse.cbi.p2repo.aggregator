package org.eclipse.b3.aggregator.legacy;

import java.util.Map;

import org.eclipse.b3.aggregator.transformer.TransformerContextContributor;

/**
 * Copyright (c) 2006-2009, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 */

/**
 * @author Karel Brezina
 *
 */
public class AggregatorTransformer_090_2_100_ContextContributor extends TransformerContextContributor {

	@Override
	public void contributeDefaultsToContext(Map<String, Object> context) {
		context.put(AggregatorTransformer_090_2_100.CONTEXT_FIXED_VERSION, true);
	}
}
