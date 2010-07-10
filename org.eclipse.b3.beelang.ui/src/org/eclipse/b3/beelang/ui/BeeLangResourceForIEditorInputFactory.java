/**
 * Copyright (c) 2010, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 */

package org.eclipse.b3.beelang.ui;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.ui.ide.FileStoreEditorInput;
import org.eclipse.xtext.ui.editor.model.JavaClassPathResourceForIEditorInputFactory;

/**
 * Factory that handles regular files, outside of the Eclipse Workspace.
 * 
 */
public class BeeLangResourceForIEditorInputFactory extends JavaClassPathResourceForIEditorInputFactory {
	protected Resource createResource(FileStoreEditorInput editorInput) throws CoreException {
		return null;
	}
}
