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

import com.google.inject.ImplementedBy;

/**
 * A Proposal Customizer that when bound via Guice has effect on the BeeLang proposal provider.
 * 
 */
@ImplementedBy(BeeLangDefaultProposalCustomizer.class)
public interface IProposalCustomizer {

	/**
	 * Customization that makes it possible to filter out and customize keyword proposals.
	 * By returning 'false' the default proposal for the keyword is not generated, and this method
	 * may add a customized proposal (or add several proposals).
	 * 
	 * @param keyword
	 *            - the keyword for which proposals should be generated
	 * @param contentAssistContext
	 *            - the context in which the keyword appears
	 * @param acceptor
	 *            - collector of proposals
	 * @return true to include the default keyword proposal(s), false otherwise
	 */
	public boolean completeKeyword(Keyword keyword, ContentAssistContext contentAssistContext,
			ICompletionProposalAcceptor acceptor);
}
