/**
 * Copyright (c) 2006-2009, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 */

package org.eclipse.b3.ui.outline;

import org.eclipse.xtext.ui.editor.outline.XtextContentOutlinePage;

/**
 * Makes it possible to refresh the outline.
 * 
 */
public class RefreshableXtextContentOutlinePage extends XtextContentOutlinePage {
	public void externalRefresh() {
		super.refresh();
	}
}
