/**
 * Copyright (c) 2010, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 */

package org.eclipse.b3.build.ui.commands;

import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Map;

import org.eclipse.b3.build.core.B3BuildEngine;
import org.eclipse.b3.build.core.B3BuildStatusCodes;
import org.eclipse.b3.build.operations.RunCmdOnResourceOperation;
import org.eclipse.b3.build.ui.Activator;
import org.eclipse.b3.build.ui.core.B3BuildUIErrorCodes;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.xtext.resource.IResourceServiceProvider;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;
import org.eclipse.xtext.validation.CheckMode;
import org.eclipse.xtext.validation.IResourceValidator;
import org.eclipse.xtext.validation.Issue;

import com.google.common.collect.Maps;

/**
 * A helper class capable of running one xtextDocument inside the context of another resource.
 * 
 */
public class CmdUnitOfWork implements IRunnableWithProgress {
	private IXtextDocument xtextDocument;

	private String cmdPath;

	private String cmdFunction;

	private IStatus result;

	private Map<String, String> propertyMap = Maps.newHashMap();

	public CmdUnitOfWork(IXtextDocument xtextDocument, String cmdPath, String cmdFunction) {
		this.xtextDocument = xtextDocument;
		this.cmdPath = cmdPath;
		this.cmdFunction = cmdFunction;
	}

	public Map<String, String> getPropertyMap() {
		return propertyMap;
	}

	public IStatus getResult() {
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jface.operation.IRunnableWithProgress#run(org.eclipse.core.runtime.IProgressMonitor)
	 */
	public void run(final IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
		// this is what the wizard should run
		// it needs properties and stuff that only the wizard knows about

		result = xtextDocument.readOnly(new IUnitOfWork<IStatus, XtextResource>() {
			// @Override
			public IStatus exec(XtextResource state) throws Exception {

				// Check for syntax errors in 'state'
				IResourceServiceProvider serviceProvider = state.getResourceServiceProvider();
				IResourceValidator resourceValidator = serviceProvider.getResourceValidator();
				List<Issue> validate = resourceValidator.validate(state, CheckMode.ALL, null);
				if(validate.size() > 0) {
					MultiStatus ms = new MultiStatus(
						Activator.PLUGIN_ID, IStatus.ERROR, "Syntax errors in b3 file!", null);
					for(Issue issue : validate)
						ms.add(new Status(IStatus.ERROR, Activator.PLUGIN_ID, "line " + issue.getLineNumber() + ": " +
								issue.getMessage()));
					return ms;
				}

				// 1. if the path starts with b3: it means try resource:, then plugin: schemes
				// 2. Else, the path should be a URI and only one attempt is made
				// 3. If the result in any case is a bad URI, the configuration is bad
				String cmdURI = cmdPath;
				URI uris[] = null;
				try {
					if(cmdURI.startsWith("b3:")) {
						String pathPart = cmdURI.substring(3);
						uris = new URI[2];
						uris[0] = URI.createPlatformResourceURI(pathPart, true);
						uris[1] = URI.createPlatformPluginURI(pathPart, true);
					}
					else {
						uris = new URI[1];
						uris[0] = URI.createURI(cmdURI);
					}
				}
				catch(IllegalArgumentException e) {
					return new Status(
						IStatus.ERROR, Activator.PLUGIN_ID, B3BuildUIErrorCodes.BAD_UI_CONFIGURATION,
						"Faulty cmd URI in UI configuration", e);
				}
				// TODO: if there is a wizard for this uri:
				// - initialize it with an IRunnableWithProgress that performs the bulk of the job
				// - the wizard will produce parameters for this runnable
				//
				for(int i = 0; i < uris.length; i++) {
					URI uri = uris[i];
					// Try different URIs - the first to succeed is used

					// Set properties provided by the wizard
					B3BuildEngine engine = new B3BuildEngine();
					engine.setProperties(getPropertyMap());
					IStatus result = engine.run(
						new RunCmdOnResourceOperation(uri, cmdFunction, getPropertyMap(), state), monitor);
					if(result.isOK())
						return result;
					if(result.getCode() != B3BuildStatusCodes.COULD_NOT_LOAD_RESOURCE)
						return result;
				}
				return new Status(
					IStatus.ERROR, Activator.PLUGIN_ID, B3BuildUIErrorCodes.BAD_UI_CONFIGURATION,
					"Bad menu/command configuration - could not find cmd: " + cmdURI, null);
			}
		});
	}

}
