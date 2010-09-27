/**
 * Copyright (c) 2006-2009, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 */

package org.eclipse.b3.versions;

import java.io.StringReader;

import org.eclipse.b3.build.core.DefaultVersionFormatManager;
import org.eclipse.b3.parser.antlr.BeeLangParser;
import org.eclipse.b3.services.BeeLangGrammarAccess;
import org.eclipse.equinox.p2.metadata.Version;
import org.eclipse.equinox.p2.metadata.VersionRange;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.parser.IParser;

import com.google.inject.Inject;
import com.google.inject.Singleton;

/**
 * Specialized VersionFormatManager that quotes versions and version ranges if their unquoted form
 * can not be parsed as specified by the concrete syntax.
 * 
 */
@Singleton
public class BeeLangVersionFormatManager extends DefaultVersionFormatManager {

	@Inject
	private IParser parser;

	@Inject
	private IGrammarAccess grammarAccess;

	@Override
	public String toString(Version v) {
		String s = toUnquotedString(v);
		BeeLangGrammarAccess ga = (BeeLangGrammarAccess) grammarAccess;
		IParseResult result = ((BeeLangParser) parser).parse(ga.getVersionLiteralRule().getName(), new StringReader(s));
		// if not a clean parse, then there must be keywords or special characters in the string - quote it
		if(result.getParseErrors().size() > 0)
			return "\"" + s + "\"";
		return s;
	}

	@Override
	public String toString(VersionRange r) {
		String s = toUnquotedString(r);
		BeeLangGrammarAccess ga = (BeeLangGrammarAccess) grammarAccess;
		IParseResult result = ((BeeLangParser) parser).parse(
			ga.getVersionRangeLiteralRule().getName(), new StringReader(s));
		// if not a clean parse, then there must be keywords or special characters in the string - quote it
		if(result.getParseErrors().size() > 0)
			return "\"" + s + "\"";
		return s;
	}

}
