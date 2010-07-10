/**
 * Copyright (c) 2010, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 */

package org.eclipse.b3.beelang.ui.xtext.linked;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.ui.URIEditorInput;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.IURIEditorInput;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.xtext.ui.editor.XtextEditor;

/**
 * This class extends the standard XtextEditor to make it capable of
 * opening and saving external files, by managing them as linked resources.
 */
public class ExtLinkedXtextEditor extends XtextEditor {
	private static final String AUTOLINK_PROJECT_NAME = "AutoLinked_B3ExternalFiles";

	/**
	 * Does nothing except server as a place to set a breakpoint :)
	 */
	public ExtLinkedXtextEditor() {
		super();
	}

	private void createLink(IProject project, IFile linkFile, java.net.URI uri) throws CoreException {
		IPath path = linkFile.getFullPath();

		IPath folders = path.removeLastSegments(1).removeFirstSegments(1);
		IPath checkPath = Path.ROOT;
		int segmentCount = folders.segmentCount();
		for(int i = 0; i < segmentCount; i++) {
			checkPath = checkPath.addTrailingSeparator().append(folders.segment(i));
			IFolder folder = project.getFolder(checkPath);
			if(!folder.exists())
				folder.create(true, true, null);
		}
		linkFile.createLink(uri, IResource.ALLOW_MISSING_LOCAL, null);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.xtext.ui.editor.XtextEditor#dispose()
	 */
	@Override
	public void dispose() {
		// Unlink the input if it was linked
		IEditorInput input = getEditorInput();
		if(input instanceof IFileEditorInput) {
			IFile file = ((IFileEditorInput) input).getFile();
			if(file.isLinked()) {
				file.getProject().getName().equals(AUTOLINK_PROJECT_NAME);
				try {
					// if the editor is disposed because workbench is shutting down, it is NOT a good
					// idea to delete the link
					if(PlatformUI.isWorkbenchRunning() && !PlatformUI.getWorkbench().isClosing())
						file.delete(true, null);
				}
				catch(CoreException e) {
					// Nothing to do really, it will be recreated/refreshed later if ever used - some garbage may stay behind...
					// TODO: log the issue
					e.printStackTrace();
				}
			}
		}
		super.dispose();
	}

	/**
	 * Translates an incoming IEditorInput being an FilestoreEditorInput, or IURIEditorInput
	 * that is not also a IFileEditorInput.
	 * FilestoreEditorInput is used when opening external files in an IDE environment.
	 * The result is that the regular XtextEditor gets an IEFSEditorInput which is also an
	 * IStorageEditorInput.
	 */
	@Override
	public void init(IEditorSite site, IEditorInput input) throws PartInitException {
		// THE ISSUE HERE:
		// In the IDE, the File Open Dialog (and elsewhere) uses a FilestoreEditorInput class
		// which is an IDE specific implementation.
		// The state at this point:
		// 1. When creating a file, the IEditorInput is an IURIEditorInput
		// 2. The only (non IDE specific) interface implemented by FilestoreEditorInput is IURIEditorInput
		// 3. The creation of a file is however also an IFileEditorInput
		//
		// Remedy:
		if(input instanceof IURIEditorInput && !(input instanceof IFileEditorInput)) {
			java.net.URI uri = ((IURIEditorInput) input).getURI();
			String name = ((IURIEditorInput) input).getName();
			// Check if this is linkable input
			if(uri.getScheme().equals("file")) {
				IFile linkedFile = obtainLink(uri);
				IFileEditorInput linkedInput = new FileEditorInput(linkedFile);
				super.init(site, linkedInput);

			}
			else {
				// use EMF URI (readonly) input - will open without validation though...
				// (Could be improved, i.e. perform a download, make readonly, and keep in project,
				// or stored in tmp, and processed as the other linked resources..
				URIEditorInput uriInput = new URIEditorInput(URI.createURI(uri.toString()), name);
				super.init(site, uriInput);
				return;
			}
			// super.init(site, new EFSEditorInput(((IURIEditorInput) input).getURI(), input.getName()));
			return;
		}
		super.init(site, input);
	}

	/**
	 * Throws WrappedException - the URI must refer to an existing file!
	 * 
	 * @param uri
	 * @return
	 */
	private IFile obtainLink(java.net.URI uri) {
		try {
			IWorkspace ws = ResourcesPlugin.getWorkspace();
			// get, or create project if non existing
			IProject project = ws.getRoot().getProject(AUTOLINK_PROJECT_NAME);
			if(!project.exists()) {
				project.create(null);
			}
			if(!project.isOpen()) {
				project.open(null);
				project.setHidden(true);
			}

			// path in project that is the same as the external file's path
			IFile linkFile = project.getFile(uri.getPath());
			if(linkFile.exists())
				linkFile.refreshLocal(1, null); // don't know if needed (or should be avoided...)
			else {
				// create the link
				createLink(project, linkFile, uri);
				// linkFile.createLink(uri, IResource.ALLOW_MISSING_LOCAL, null);
			}
			return linkFile;

			// IPath location = new Path(name);
			// IFile file = project.getFile(location.lastSegment());
			// file.createLink(location, IResource.NONE, null);
		}
		catch(CoreException e) {
			throw new WrappedException(e);
		}
	}
}
