/**
 * Copyright (c) 2006-2009, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 */

package org.eclipse.b3.build.engine;

import java.io.IOException;
import java.util.List;

import org.eclipse.b3.build.BeeModel;
import org.eclipse.b3.build.internal.B3BuildActivator;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource.Diagnostic;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.resource.XtextResource;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimaps;
import com.google.inject.Singleton;
import com.google.inject.internal.Lists;

/**
 * Loads extension to b3 - i.e. b3 files registered via an extension point with a key.
 * 
 */
@Singleton
public class B3ExtensionLoader {
	/**
	 * b3 extension point id "b3id" for default use import/export.
	 */
	public final static String B3EXTENSION__USE_EXPORT = "b3.use.export";

	private ArrayListMultimap<String, BeeModel> modelsByKey = Multimaps.newArrayListMultimap();

	private ArrayListMultimap<String, URI> keyToURIsMap = Multimaps.newArrayListMultimap();

	public List<BeeModel> getModelsByKey(ResourceSet rs, String key) {
		// may call loadModels for the key multiple times, but should be fast if
		// does not find any...
		if(!modelsByKey.containsKey(key))
			loadModels(rs, key);
		return modelsByKey.get(key);
	}

	private List<URI> findURIsForKey(String key) {
		List<URI> result = Lists.newArrayList();
		IConfigurationElement[] configs = Platform.getExtensionRegistry().getConfigurationElementsFor(
			B3BuildActivator.EXTENSION__B3_FILE);
		for(IConfigurationElement e : configs) {
			if(e.getAttribute("b3id").equals(key))
				result.add(URI.createURI(e.getAttribute("extensionURI")));
		}
		return result;
	}

	// URI b3FileURI = URI.createPlatformPluginURI("/org.eclipse.b3.build/src-b3/javaimports.b3", true);

	private List<BeeModel> loadModels(ResourceSet rs, String key) {
		// get the URI for the key
		synchronized(rs) {
			if(!keyToURIsMap.containsKey(key))
				keyToURIsMap.putAll(key, findURIsForKey(key));

			for(URI u : keyToURIsMap.get(key)) {
				XtextResource theB3Resource = (XtextResource) rs.getResource(u, true);
				// b3FileURI, ContentHandler.UNSPECIFIED_CONTENT_TYPE);
				try {
					if(!theB3Resource.isLoaded()) {
						theB3Resource.load(null);
						EList<Diagnostic> errors = theB3Resource.getErrors();
						if(errors.size() > 0) {
							System.err.printf("Syntax error while loading b3 file declared in extension point:%s\n" +
									u.toString());
							continue;
						}
					}
				}
				catch(IOException e) {
					System.err.printf("I/O error while loading b3 file declared in extension point:%s\n" + u.toString());
					// TODO Auto-generated catch block
					e.printStackTrace();
					continue;
				}

				// XtextResource javaimports = (XtextResource) rs.getResource(b3FileURI, true);
				BeeModel beeModel = (BeeModel) theB3Resource.getParseResult().getRootASTElement();
				modelsByKey.put(key, beeModel);
			}

		}
		return modelsByKey.get(key);
	}
}
