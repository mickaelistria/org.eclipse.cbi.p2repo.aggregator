/**
 * Copyright (c) 2010, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 */

package org.eclipse.b3.validation;

import org.eclipse.xtext.parser.antlr.SyntaxErrorMessage;
import org.eclipse.xtext.parser.antlr.SyntaxErrorMessageProvider;

/**
 * Overrides default SyntaxErrorMessageProvider by creating fixable value converter errors.
 */
public class BeeLangSyntaxErrorMessageProvider extends SyntaxErrorMessageProvider {
	@Override
	public SyntaxErrorMessage getSyntaxErrorMessage(IValueConverterErrorContext context) {
		if(!(context.getValueConverterException().getCause() instanceof FixableTimestampException))
			return super.getSyntaxErrorMessage(context);
		return new SyntaxErrorMessage(context.getDefaultMessage(), IBeeLangDiagnostic.ISSUE_TIMESTAMP__NON_UTC);

	}
}
