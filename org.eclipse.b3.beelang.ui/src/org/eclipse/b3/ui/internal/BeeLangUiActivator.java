/**
 * Copyright (c) 2010, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 */

package org.eclipse.b3.ui.internal;

import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.eclipse.b3.backend.core.exceptions.B3EngineException;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

import com.google.common.collect.Lists;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Module;
import com.google.inject.util.Modules;

/**
 * Use this activator instead of the generated activator (this is the activator that should be used in the manifest).
 * 
 * 
 */
public class BeeLangUiActivator extends AbstractUIPlugin {
	public static final String EXTENSION__UI_MODULE = "org.eclipse.b3.beelang.ui.B3BeeLangUiModule";

	public static final String EXTENSION__TEMPLATES_RESOURCE = "org.eclipse.b3.beelang.ui.B3Templates";

	public static BeeLangUiActivator getInstance() {
		return INSTANCE;
	}

	private Map<String, Injector> injectors = new HashMap<String, Injector>();

	private static BeeLangUiActivator INSTANCE;

	public Injector getInjector(String languageName) {
		return injectors.get(languageName);
	}

	public List<URL> getTemplateExtensions() {
		IConfigurationElement[] configs = Platform.getExtensionRegistry().getConfigurationElementsFor(
			EXTENSION__TEMPLATES_RESOURCE);
		List<URL> urls = Lists.newArrayList();
		for(IConfigurationElement elem : configs) {
			String filename = elem.getAttribute("file");
			URL resource = Platform.getBundle(elem.getContributor().getName()).getResource(filename);
			urls.add(resource);
		}
		return urls;
	}

	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		INSTANCE = this;
		try {

			injectors.put(
				"org.eclipse.b3.BeeLang",
				Guice.createInjector(Modules.override(
					Modules.override(
						Modules.override(getRuntimeModule("org.eclipse.b3.BeeLang")).with(
							getUiModule("org.eclipse.b3.BeeLang"))).with(getSharedStateModule())).with(
					getExtensionModules())));

		}
		catch(Exception e) {
			Logger.getLogger(getClass()).error(e.getMessage(), e);
			throw e;
		}
	}

	protected Module getExtensionModules() throws B3EngineException {
		IConfigurationElement[] configs = Platform.getExtensionRegistry().getConfigurationElementsFor(
			EXTENSION__UI_MODULE);
		List<Module> modules = Lists.newArrayList();
		for(IConfigurationElement e : configs) {
			try {
				modules.add(Module.class.cast(e.createExecutableExtension("moduleClass")));
			}
			catch(CoreException e1) {
				throw new B3EngineException("Loading of RuntimeModule extension failed with exception", e1);
			}
		}
		if(modules.size() < 1)
			return Modules.EMPTY_MODULE;
		return Modules.combine(modules);
	}

	protected Module getRuntimeModule(String grammar) {

		if("org.eclipse.b3.BeeLang".equals(grammar)) {
			return new org.eclipse.b3.BeeLangRuntimeModule();
		}

		throw new IllegalArgumentException(grammar);
	}

	protected Module getSharedStateModule() {
		return new org.eclipse.xtext.ui.shared.SharedStateModule();
	}

	protected Module getUiModule(String grammar) {

		if("org.eclipse.b3.BeeLang".equals(grammar)) {
			return new org.eclipse.b3.ui.BeeLangUiModule(this);
		}

		throw new IllegalArgumentException(grammar);
	}

}
