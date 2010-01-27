/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.b3.aggregator.p2.util;

import org.eclipse.b3.aggregator.loader.IRepositoryLoader;
import org.eclipse.b3.aggregator.util.RepositoryLoaderUtils;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl;

public class MetadataRepositoryResourceFactoryImpl extends ResourceFactoryImpl {
	private IConfigurationElement loaderConfiguration = null;

	public MetadataRepositoryResourceFactoryImpl() {
		super();
	}

	public Resource createResource(URI uri) {
		if(loaderConfiguration == null || !loaderConfiguration.isValid())
			try {
				loaderConfiguration = RepositoryLoaderUtils.getLoaderFor(uri.scheme());
			}
			catch(CoreException e) {
				throw new RuntimeException(e.getMessage(), e);
			}

		try {
			return new MetadataRepositoryResourceImpl(uri,
					(IRepositoryLoader) loaderConfiguration.createExecutableExtension("class"));
		}
		catch(CoreException e) {
			throw new RuntimeException(e.getMessage(), e);
		}
	}
}
