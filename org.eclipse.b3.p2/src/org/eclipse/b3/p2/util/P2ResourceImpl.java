/**
 * Copyright (c) 2006-2009, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 */
package org.eclipse.b3.p2.util;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Map;

import org.eclipse.b3.p2.P2Factory;
import org.eclipse.b3.p2.impl.MetadataRepositoryImpl;
import org.eclipse.b3.p2.loader.IRepositoryLoader;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceImpl;
import org.eclipse.emf.ecore.resource.Resource;

/**
 * <!-- begin-user-doc -->
 * The <b>Resource </b> associated with the package.
 * <!-- end-user-doc -->
 * 
 * @see org.eclipse.b3.p2.util.P2ResourceFactoryImpl
 * @generated
 */
public class P2ResourceImpl extends XMLResourceImpl {
	private class LoaderJob extends Job {

		private java.net.URI location = null;

		public LoaderJob(String name, java.net.URI location) {
			super(name);
			this.location = location;
		}

		@Override
		protected IStatus run(IProgressMonitor monitor) {

			try {
				MetadataRepositoryImpl repository = (MetadataRepositoryImpl) P2Factory.eINSTANCE.createMetadataRepository();
				loader.open(location, null, repository);
				loader.load(monitor);
				loader.close();
				getContents().add(repository);
			}
			catch(final Exception e) {
				errors.add(new Resource.Diagnostic() {

					public int getColumn() {
						return 0;
					}

					public int getLine() {
						return 0;
					}

					public String getLocation() {
						return location.toString();
					}

					public String getMessage() {
						return e.getMessage();
					}
				});
			}
			finally {
				synchronized(lock) {
					setLoaded(true);
					isLoading = false;
				}
			}

			return Status.OK_STATUS;
		}

	}

	private IRepositoryLoader loader;

	private final Object lock = new Object();

	private Job loaderJob;

	/**
	 * Creates an instance of the resource.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param uri
	 *            the URI of the new resource.
	 * @generated NOT
	 */
	public P2ResourceImpl(URI uri) {
		throw new IllegalArgumentException("Use constructor with loader");
	}

	/**
	 * @param uri
	 * @param loader
	 */
	public P2ResourceImpl(URI uri, IRepositoryLoader loader) {
		super(uri);
		this.loader = loader;
	}

	@Override
	public void load(Map<?, ?> options) throws IOException {
		synchronized(lock) {
			if(isLoaded)
				return;

			if(!isLoading) {
				isLoading = true;

				if(errors == null)
					errors = new BasicEList<Diagnostic>();
				if(warnings == null)
					warnings = new BasicEList<Diagnostic>();

				errors.clear();
				warnings.clear();

				try {
					loaderJob = new LoaderJob("Loading repository " + getURI().toFileString(),
							getLocationFromURI(getURI()));
					loaderJob.setUser(false);
					loaderJob.schedule();
				}
				catch(URISyntaxException e) {
					IOException ex = new IOException();
					ex.initCause(e);
					throw ex;
				}
			}
		}

		try {
			loaderJob.join();
		}
		catch(InterruptedException e) {
			// ignore
		}
	}

	@Override
	public void save(Map<?, ?> options) {
		// do nothing by default
		return;
	}

	private java.net.URI getLocationFromURI(URI uri) throws URISyntaxException {
		String opaquePart = uri.opaquePart();
		int pos = opaquePart.indexOf(':');
		return new java.net.URI(opaquePart.substring(pos + 1));
	}

} // P2ResourceImpl
