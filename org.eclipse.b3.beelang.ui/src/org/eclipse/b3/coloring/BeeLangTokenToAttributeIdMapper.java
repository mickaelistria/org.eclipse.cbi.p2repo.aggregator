package org.eclipse.b3.coloring;

import org.eclipse.b3.services.BeeLangGrammarAccess;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.antlr.DefaultAntlrTokenToAttributeIdMapper;

public class BeeLangTokenToAttributeIdMapper extends DefaultAntlrTokenToAttributeIdMapper {
	@Override
	protected String calculateId(String tokenName, int tokenType) {
		BeeLangGrammarAccess ga;
		// DEBUG PRINT System.out.print("Highlight id for token: "+tokenName+"\n");

		// treat, 'true', 'false', and 'null' differently
		if(tokenName.startsWith("'") && tokenName.endsWith("'")) {
			if(tokenName.equals("'true'") || tokenName.equals("'false'"))
				return BeeLangHighlightConfiguration.BOOLEAN_ID;
			if(tokenName.equals("'null'"))
				return BeeLangHighlightConfiguration.NULL_ID;
		}
		if("RULE_DOCUMENTATION".equals(tokenName)) {
			return BeeLangHighlightConfiguration.DOCUMENTATION_ID;
		}

		if("RULE_REGULAR_EXPR".equals(tokenName)) {
			return BeeLangHighlightConfiguration.REGEXP_ID;
		}
		if("RULE_SIMPLE_PATTERN".equals(tokenName)) {
			return BeeLangHighlightConfiguration.REGEXP_ID;
		}

		if("RULE_HEX".equals(tokenName)) {
			return DefaultHighlightingConfiguration.NUMBER_ID;
		}

		return super.calculateId(tokenName, tokenType);
	}
}
