/**
 * Copyright (c) 2010, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 */

package org.eclipse.b3.ui.contentassist;

import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor;

/**
 * Default implementation of IProposalCustomizer that performs no customization.
 * 
 */
public class BeeLangDefaultProposalCustomizer implements IProposalCustomizer {

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.b3.ui.contentassist.IProposalCustomizer#completeKeyword(org.eclipse.xtext.Keyword,
	 * org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext, org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor)
	 */
	@Override
	public boolean completeKeyword(Keyword keyword, ContentAssistContext contentAssistContext,
			ICompletionProposalAcceptor acceptor) {
		// TODO: Remove this test
		if(keyword.getValue().equals("sequential") || keyword.getValue().equals("final"))
			return false;
		return true; // include all keywords
	}

}
