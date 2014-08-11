/**
 * Copyright (c) 2006-2009, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 */

package org.eclipse.b3.aggregator.transformer;

import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.Diagnostic;

/**
 * Transforms source resource to target resource
 *
 * @author Karel Brezina
 */
public interface ITransformer {

	/**
	 * Returns resource errors.
	 *
	 * @return Returns a list of resource errors.
	 */
	List<Diagnostic> getResourceErrors();

	/**
	 * Initialize transformer
	 *
	 * @param srcResource
	 *            source resource
	 * @param trgtResource
	 *            target resource
	 * @param trgtPackage
	 *            target package which is used for target resource generation
	 */
	void initTransformer(Resource srcResource, Resource trgtResource, EPackage trgtPackage, Map<String, Object> context);

	/**
	 * Starts transformation
	 */
	void startTransformation(boolean resolveProxies);
}
