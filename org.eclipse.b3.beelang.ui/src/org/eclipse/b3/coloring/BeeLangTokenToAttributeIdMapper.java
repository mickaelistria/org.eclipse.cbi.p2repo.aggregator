package org.eclipse.b3.coloring;

import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.antlr.DefaultAntlrTokenToAttributeIdMapper;

public class BeeLangTokenToAttributeIdMapper extends DefaultAntlrTokenToAttributeIdMapper {
	@Override
	protected String calculateId(String tokenName, int tokenType) {
		// DEBUG PRINT
		// System.out.print("Highlight id for token: " + tokenName + "\n");

		// treat, 'true', 'false', and 'null' differently
		if(tokenName.startsWith("'") && tokenName.endsWith("'")) {
			if(tokenName.equals("'true'") || tokenName.equals("'false'"))
				return BeeLangHighlightConfiguration.BOOLEAN_ID;
			if(tokenName.equals("'null'"))
				return BeeLangHighlightConfiguration.NULL_ID;
		}
		if("RULE_JAVADOC".equals(tokenName)) {
			return BeeLangHighlightConfiguration.JAVADOC_ID;
		}

		if("RULE_TEXT".equals(tokenName)) {
			return BeeLangHighlightConfiguration.TEXT_ID;
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

		if("RULE_PID".equals(tokenName)) {
			return BeeLangHighlightConfiguration.PROPERTY_ID;
		}

		return super.calculateId(tokenName, tokenType);
	}
}
