/*******************************************************************************
 * Copyright (c) 2008-2010 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * - initial implementation and API - Itemis AG
 * - adapted to b3 and templates via extension
 *
 *******************************************************************************/

package org.eclipse.b3.beelang.ui.templates;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.b3.ui.internal.BeeLangUiActivator;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.text.templates.ContextTypeRegistry;
import org.eclipse.jface.text.templates.persistence.TemplatePersistenceData;
import org.eclipse.jface.text.templates.persistence.TemplateReaderWriter;
import org.eclipse.jface.text.templates.persistence.TemplateStore;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.Constants;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.google.inject.name.Named;

@Singleton
public class B3TemplateStore extends TemplateStore {

	private final static Logger log = Logger.getLogger(B3TemplateStore.class);

	private final List<URL> res;

	@Inject
	public B3TemplateStore(ContextTypeRegistry registry, IPreferenceStore store,
			@Named(Constants.LANGUAGE_NAME) String key, AbstractUIPlugin plugin) {
		super(registry, store, key + ".templates");
		res = getTemplateFileURL(plugin);
		try {
			load();
		}
		catch(IOException e) {
			log.error(e.getMessage(), e);
		}
	}

	protected List<URL> getTemplateFileURL(AbstractUIPlugin plugin) {
		// get contributions from extension points
		//
		List<URL> urls = BeeLangUiActivator.getInstance().getTemplateExtensions();
		urls.add(0, plugin.getBundle().getEntry("templates/templates.xml"));
		return urls;
	}

	@Override
	protected void handleException(IOException x) {
		log.error(x.getMessage(), x);
	}

	@Override
	protected void loadContributedTemplates() throws IOException {
		if(res == null || res.size() == 0)
			return;
		TemplateReaderWriter reader = new TemplateReaderWriter();
		InputStream openStream = null;
		for(URL templates : res) {
			try {
				openStream = templates.openStream();
				try {
					TemplatePersistenceData[] read = reader.read(openStream, null);
					for(TemplatePersistenceData templatePersistenceData : read) {
						internalAdd(templatePersistenceData);
					}
				}
				finally {
					openStream.close();
				}
			}
			catch(IOException e) {
				log.error(e);
			}
		}
	}
}
