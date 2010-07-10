/**
 * Copyright (c) 2010, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 */

package org.eclipse.b3.beelang.ui.xtext;

import java.io.InputStream;
import java.net.URI;

import org.eclipse.core.filesystem.EFS;
import org.eclipse.core.resources.IStorage;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.PlatformObject;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.IPersistableElement;
import org.eclipse.ui.IStorageEditorInput;
import org.eclipse.ui.IURIEditorInput;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.model.IWorkbenchAdapter;

/**
 * An Editor input that uses EFS filestore.
 * 
 */
public class EFSEditorInput extends PlatformObject implements IEFSEditorInput, IEditorInput, IURIEditorInput,
		IStorageEditorInput, IPersistableElement {

	private URI uri;

	private String name;

	/**
	 * Create an editor input for a URI (that can be used by EFS), and a name.
	 * The name is used for information to user, and to obtain an icon.
	 * 
	 * @param uri
	 * @param name
	 */
	public EFSEditorInput(URI uri, String name) {
		this.uri = uri;
		this.name = name;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.IEditorInput#exists()
	 */
	@Override
	public boolean exists() {
		try {
			// TODO: Could be long running, needs to run in the background with a progress monitor
			// but it is ok for file: based stores.
			return EFS.getStore(uri).fetchInfo().exists();
		}
		catch(CoreException e) {
			// TODO: Log the problem
			e.printStackTrace();
			return false;
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.core.runtime.IAdaptable#getAdapter(java.lang.Class)
	 */
	@Override
	public Object getAdapter(@SuppressWarnings("rawtypes") Class adapter) {
		if(IWorkbenchAdapter.class.equals(adapter)) {
			return new IWorkbenchAdapter() {

				public Object[] getChildren(Object o) {
					return new Object[0];
				}

				public ImageDescriptor getImageDescriptor(Object object) {
					return EFSEditorInput.this.getImageDescriptor();
				}

				public String getLabel(Object o) {
					return EFSEditorInput.this.getName();
				}

				public Object getParent(Object o) {
					return EFSEditorInput.this.getParent();
				}
			};
		}
		// this input is a PlatformObject, and can thus be adapted through configuration
		// If the workspace adaption causes problems in some situations, move it to external adaption instead
		//
		return super.getAdapter(adapter);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.IPersistableElement#getFactoryId()
	 */
	@Override
	public String getFactoryId() {
		return EFSEditorInputFactory.getFactoryId();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.IEditorInput#getImageDescriptor()
	 */
	@Override
	public ImageDescriptor getImageDescriptor() {
		// IDE specific concept, try without it, as IContentType impl is internal
		// IContentType contentType = IDE.getContentType(file);
		// return PlatformUI.getWorkbench().getEditorRegistry().getImageDescriptor(getName(), contentType);

		return PlatformUI.getWorkbench().getEditorRegistry().getImageDescriptor(getName());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.IEditorInput#getName()
	 */
	@Override
	public String getName() {
		return name;
	}

	private Object getParent() {
		try {
			return EFS.getStore(uri).getParent();
		}
		catch(CoreException e) {
			// TODO log or do something more useful
			e.printStackTrace();
			return null; // can't get to a parent...
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.IEditorInput#getPersistable()
	 */
	@Override
	public IPersistableElement getPersistable() {
		return this;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.IStorageEditorInput#getStorage()
	 */
	@Override
	public IStorage getStorage() throws CoreException {
		return new IStorage() {

			@Override
			public Object getAdapter(@SuppressWarnings("rawtypes") Class adapter) {
				return EFSEditorInput.this.getAdapter(adapter);
			}

			@Override
			public InputStream getContents() throws CoreException {
				// TODO: Don't know where to get the progress monitor
				return EFS.getStore(uri).openInputStream(EFS.NONE, new NullProgressMonitor());
			}

			@Override
			public IPath getFullPath() {
				return new Path(uri.getPath());
			}

			@Override
			public String getName() {
				return EFSEditorInput.this.getName();
			}

			@Override
			public boolean isReadOnly() {
				try {
					return EFS.getStore(uri).fetchInfo().getAttribute(EFS.ATTRIBUTE_READ_ONLY);
				}
				catch(CoreException e) {
					// TODO Log error
					e.printStackTrace();
					return false; // probably not writable if we can't get the attribute
				}
			}

		};
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.IEditorInput#getToolTipText()
	 */
	@Override
	public String getToolTipText() {
		return getName();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.IURIEditorInput#getURI()
	 */
	@Override
	public URI getURI() {
		return uri;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.IPersistable#saveState(org.eclipse.ui.IMemento)
	 */
	@Override
	public void saveState(IMemento memento) {
		EFSEditorInputFactory.saveState(memento, this);
	}

}
