/**
 * Copyright (c) 2006-2009, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 */

package org.eclipse.b3.aggregator.util;

import java.util.Map;

/**
 * Capable of adding data to context. It's used for aggregator transformations.
 * 
 * @author Karel Brezina
 * 
 */
public interface ITransformerContextContributor {

	/**
	 * Add data to context
	 * 
	 * @param context
	 */
	void contributeToContext(Map<String, Object> context);
}
