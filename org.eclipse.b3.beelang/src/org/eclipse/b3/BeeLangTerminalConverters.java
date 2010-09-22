/************************************************************************
 * Copyright (c) 2009, Cloudsmith Inc and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * - Cloudsmith Inc - initial API and implementation.
 * 
 *************************************************************************/
package org.eclipse.b3;

import java.net.URI;
import java.net.URISyntaxException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Hashtable;
import java.util.Map;
import java.util.TimeZone;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

import org.eclipse.b3.backend.core.datatypes.SimplePattern;
import org.eclipse.b3.build.MergeConflictStrategy;
import org.eclipse.b3.build.TriState;
import org.eclipse.b3.enums.MergeConflictStrategyEnumHelper;
import org.eclipse.b3.enums.TriStateEnumHelper;
import org.eclipse.b3.validation.FixableTimestampException;
import org.eclipse.b3.versions.IVersionFormatManager;
import org.eclipse.equinox.internal.p2.metadata.InstallableUnit;
import org.eclipse.equinox.p2.metadata.IInstallableUnit;
import org.eclipse.equinox.p2.metadata.Version;
import org.eclipse.equinox.p2.metadata.VersionRange;
import org.eclipse.equinox.p2.metadata.expression.ExpressionParseException;
import org.eclipse.equinox.p2.metadata.expression.ExpressionUtil;
import org.eclipse.equinox.p2.metadata.expression.IExpression;
import org.eclipse.equinox.p2.metadata.expression.IMatchExpression;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverter;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.conversion.impl.AbstractDeclarativeValueConverterService;
import org.eclipse.xtext.conversion.impl.AbstractNullSafeConverter;
import org.eclipse.xtext.parsetree.AbstractNode;
import org.eclipse.xtext.util.Strings;

import com.google.inject.Inject;

/**
 * Converters for BeeLang terminals.
 */
public class BeeLangTerminalConverters extends AbstractDeclarativeValueConverterService {

	/**
	 * Checks if a name is a Java Identifier and thus comply with a b3 QID
	 * 
	 * @param value
	 * @return
	 */
	private static boolean needsQuoting(String value) {
		if(value.length() < 1)
			return true;
		if(!Character.isJavaIdentifierStart(value.charAt(0)))
			return true;
		for(int i = 1; i < value.length(); i++)
			if(Character.isJavaIdentifierPart(value.charAt(i)))
				return true;
		return false;
	}

	@Inject
	private IVersionFormatManager versionFormatManager;

	@ValueConverter(rule = "BooleanValue")
	public IValueConverter<Boolean> BooleanValue() {
		return new IValueConverter<Boolean>() {

			public String toString(Boolean value) {
				return value.toString();
			}

			public Boolean toValue(String string, AbstractNode node) {
				if(Strings.isEmpty(string))
					throw new ValueConverterException("Could not convert empty string to boolean", node, null);
				return new Boolean(string).equals(Boolean.TRUE)
						? Boolean.TRUE
						: Boolean.FALSE;
			}

		};
	}

	@ValueConverter(rule = "EscapedQualifiedName")
	public IValueConverter<String> EscapedQualifiedName() {
		return new AbstractNullSafeConverter<String>() {
			@Override
			protected String internalToString(String value) {
				if(needsQuoting(value))
					return '"' + Strings.convertToJavaString(value) + '"';
				return Strings.convertToJavaString(value);
			}

			@Override
			protected String internalToValue(String string, AbstractNode node) {
				final int start = string.startsWith("\"") || string.startsWith("'")
						? 1
						: 0;
				final int end = string.endsWith("\"") || string.endsWith("'")
						? 1
						: 0;
				// System.err.print("EQN: Converting from: (" + string + ")=>(" +
				// string.substring(start, string.length() - end) + ")\n");

				return Strings.convertFromJavaString(string.substring(start, string.length() - end), true);
			}
		};
	}

	@ValueConverter(rule = "ID")
	public IValueConverter<String> ID() {
		return new AbstractNullSafeConverter<String>() {
			@Override
			protected String internalToString(String value) {
				if(GrammarUtil.getAllKeywords(getGrammar()).contains(value)) {
					return "^" + value;
				}
				return value;
			}

			@Override
			protected String internalToValue(String string, AbstractNode node) {
				return string.startsWith("^")
						? string.substring(1)
						: string;
			}
		};
	}

	@ValueConverter(rule = "P2QL")
	public IValueConverter<IMatchExpression<IInstallableUnit>> IExpression() {
		return new IValueConverter<IMatchExpression<IInstallableUnit>>() {
			public String toString(IMatchExpression<IInstallableUnit> value) {
				return value.toString();
			}

			public IMatchExpression<IInstallableUnit> toValue(String string, AbstractNode node) {
				if(Strings.isEmpty(string))
					throw new ValueConverterException("Could not convert empty string to p2ql expression", node, null);
				if(string.startsWith("\"") || string.startsWith("'"))
					string = string.substring(1);
				if(string.endsWith("\"") || string.endsWith("'"))
					string = string.substring(0, string.length() - 1);
				try {
					IExpression expr = ExpressionUtil.parse(string);
					if(expr != null) {
						// validate it
						Map<String, String> env = new Hashtable<String, String>(3);
						env.put("osgi.os", "linux");
						env.put("osgi.ws", "gtk");
						env.put("osgi.arch", "x86");
						IInstallableUnit envIU = InstallableUnit.contextIU(env);
						IMatchExpression<IInstallableUnit> matchExpr = ExpressionUtil.getFactory().matchExpression(expr);
						matchExpr.isMatch(envIU);
						return matchExpr;
					}
					return null;
				}
				catch(ExpressionParseException e) {
					throw new ValueConverterException("p2ql syntax error: " + e.getMessage(), node, null);
				}
				catch(IllegalArgumentException e) {
					throw new ValueConverterException("p2ql error: " + e.getMessage(), node, null);
				}
			}
		};
	}

	@ValueConverter(rule = "IntValue")
	public IValueConverter<Integer> IntValue() {
		return new IValueConverter<Integer>() {

			public String toString(Integer value) {
				return value.toString();
			}

			public Integer toValue(String string, AbstractNode node) throws ValueConverterException {
				int radix = 10;
				if(Strings.isEmpty(string))
					throw new ValueConverterException("Can not convert empty string to int", node, null);
				try {
					if(string.startsWith("0x") || string.startsWith("0X")) {
						radix = 16;
						string = string.substring(2);
					}
					else if(string.startsWith("0") && string.length() > 1)
						radix = 8;

					return new Integer(Integer.valueOf(string, radix));
				}
				catch(NumberFormatException e) {
					String format = "";
					switch(radix) {
						case 8:
							format = "octal";
							break;
						case 10:
							format = "decimal";
							break;
						case 16:
							format = "hexadecimal";
							break;
					}
					throw new ValueConverterException(
						"Can not convert to " + format + " integer : " + string, node, null);
				}
			}

		};
	}

	@ValueConverter(rule = "JAVADOC")
	public IValueConverter<String> JAVADOC() {
		return new AbstractNullSafeConverter<String>() {
			@Override
			protected String internalToString(String value) {
				String converted = Strings.convertToJavaString(value, true);
				converted = converted.substring(2, converted.length() - 2);
				return "/**\n" + converted + (converted.length() > 0
						? "\n"
						: "") + "*/\n";
			}

			@Override
			protected String internalToValue(String string, AbstractNode node) {
				String lines[] = string.split("[\n\r]");
				StringBuffer buf = new StringBuffer();
				for(int i = 0; i < lines.length; i++) {
					// get rid of documentation start
					String s = lines[i];
					if(s.startsWith("/**"))
						lines[i] = s = s.substring(3);
					// get rid of documentation end
					if(s.endsWith("*/"))
						lines[i] = s = s.substring(0, s.length() - 2);
					String trimmed = s.trim();
					if(!trimmed.startsWith("*")) {
						// no leading *, keep the whitespace at the beginning
						int pos = s.indexOf(trimmed);
						if(pos > 0)
							lines[i] = s.substring(0, pos) + trimmed;
					}
					else {
						while(trimmed.startsWith("*"))
							trimmed = trimmed.substring(1, trimmed.length());
						lines[i] = trimmed;
					}
					if(i != 0)
						buf.append("\n");
					buf.append(lines[i]);
				}
				return Strings.convertFromJavaString(buf.toString(), true);
			}
		};
	}

	@ValueConverter(rule = "MergeStrategy")
	public IValueConverter<MergeConflictStrategy> MergeStrategy() {
		return MergeConflictStrategyEnumHelper.getValueConverter();
	}

	@ValueConverter(rule = "Path")
	public IValueConverter<URI> Path() {
		return URI();
	}

	@ValueConverter(rule = "REGULAR_EXPR")
	public IValueConverter<Pattern> Pattern() {
		return new IValueConverter<Pattern>() {

			public String toString(Pattern value) {
				StringBuffer buffer = new StringBuffer();
				buffer.append("/");
				buffer.append(value.toString());
				buffer.append("/");
				int flags = value.flags();
				if((flags & Pattern.CANON_EQ) != 0)
					buffer.append('c');
				if((flags & Pattern.DOTALL) != 0)
					buffer.append('d');
				if((flags & Pattern.CASE_INSENSITIVE) != 0)
					buffer.append('i');
				if((flags & Pattern.MULTILINE) != 0)
					buffer.append('m');
				if((flags & Pattern.UNICODE_CASE) != 0)
					buffer.append('u');
				return buffer.toString();
			}

			public Pattern toValue(String string, AbstractNode node) {
				if(Strings.isEmpty(string))
					throw new ValueConverterException(
						"Could not convert empty string to regular expression", node, null);
				int firstSlash = string.indexOf('/');
				int lastSlash = string.lastIndexOf('/');
				if(lastSlash - firstSlash <= 0)
					throw new ValueConverterException("The regular expression is empty", node, null);
				String patternString = string.substring(firstSlash + 1, lastSlash);
				String flagString = string.substring(lastSlash + 1);
				int flags = 0;
				int counts[] = new int[5];
				for(int i = 0; i < flagString.length(); i++)
					switch(flagString.charAt(i)) {
						case 'i':
							counts[0]++;
							flags |= Pattern.CASE_INSENSITIVE;
							break;
						case 'm':
							counts[1]++;
							flags |= Pattern.MULTILINE;
							break;
						case 'u':
							counts[2]++;
							flags |= Pattern.UNICODE_CASE;
							break;
						case 'c':
							counts[3]++;
							flags |= Pattern.CANON_EQ;
							break;
						case 'd':
							counts[4]++;
							flags |= Pattern.DOTALL;
							break;
						default:
							throw new ValueConverterException(
								"Flag character after /: expected one of i, m, u, c, d, but got: '" +
										flagString.charAt(i) + "'.", node, null);
					}
				for(int i = 0; i < counts.length; i++)
					if(counts[i] > 1)
						throw new ValueConverterException("Flag character after /: used multiple times.", node, null);
				try {
					return Pattern.compile(patternString, flags);
				}
				catch(PatternSyntaxException e) {
					throw new ValueConverterException(
						"Could not convert '" + string + "' to regular expression", node, e);
				}
				catch(IllegalArgumentException e) {
					throw new ValueConverterException(
						"Internal error translating pattern flags - please log bug report", node, e);
				}
			}

		};
	}

	@ValueConverter(rule = "RealValue")
	public IValueConverter<Double> RealValue() {
		return new IValueConverter<Double>() {

			public String toString(Double value) {
				return value.toString();
			}

			public Double toValue(String string, AbstractNode node) {
				if(Strings.isEmpty(string))
					throw new ValueConverterException("Could not convert empty string to double", node, null);
				try {
					return new Double(string);
				}
				catch(NumberFormatException e) {
					throw new ValueConverterException("Could not convert '" + string + "' to double", node, null);
				}
			}

		};
	}

	@ValueConverter(rule = "SIMPLE_PATTERN")
	public IValueConverter<SimplePattern> SimplePattern() {
		return new IValueConverter<SimplePattern>() {
			public String toString(SimplePattern value) {
				return value.toString();
			}

			public SimplePattern toValue(String string, AbstractNode node) {
				if(Strings.isEmpty(string))
					throw new ValueConverterException(
						"Could not convert empty string to simple pattern expression", node, null);
				try {
					return SimplePattern.compile(string);
				}
				catch(IllegalArgumentException e) {
					throw new ValueConverterException("Simple pattern syntax error: " + e.getMessage(), node, null);
				}
			}
		};
	}

	@ValueConverter(rule = "STRING")
	public IValueConverter<String> STRING() {
		return new AbstractNullSafeConverter<String>() {
			@Override
			protected String internalToString(String value) {
				return '"' + Strings.convertToJavaString(value) + '"';
			}

			@Override
			protected String internalToValue(String string, AbstractNode node) {
				// System.err.print("STRING: Converting from: (" + string + ")=>(" +
				// string.substring(1, string.length() - 1) + ")\n");
				return Strings.convertFromJavaString(string.substring(1, string.length() - 1), true);
			}
		};
	}

	@ValueConverter(rule = "TEXT")
	public IValueConverter<String> TEXT() {
		return new AbstractNullSafeConverter<String>() {
			@Override
			protected String internalToString(String value) {
				String converted = Strings.convertToJavaString(value, true);
				converted = converted.substring(1, converted.length() - 2);
				// any » must be converted to \»
				converted.replace("»", "\\»");
				return "«" + converted + "»";
			}

			@Override
			protected String internalToValue(String string, AbstractNode node) {
				if(string.startsWith("«"))
					string = string.substring(1);
				if(string.endsWith("»"))
					string = string.substring(0, string.length() - 1);
				String lines[] = string.split("[\n\r]");
				StringBuffer buf = new StringBuffer();
				for(int i = 0; i < lines.length; i++) {
					if(i != 0)
						buf.append("\n");
					buf.append(lines[i].trim());
				}
				return Strings.convertFromJavaString(buf.toString(), true);
			}
		};
	}

	@ValueConverter(rule = "TIMESTAMP")
	public IValueConverter<java.util.Date> TimestampValue() {
		return new AbstractNullSafeConverter<Date>() {

			@Override
			protected String internalToString(Date value) {
				SimpleDateFormat fmt = new SimpleDateFormat("yyyyMMddHHmmssZ");
				fmt.setTimeZone(TimeZone.getTimeZone("UTC"));
				return '"' + fmt.format(value) + '"';
			}

			@Override
			protected Date internalToValue(String string, AbstractNode node) throws ValueConverterException {
				string = string.substring(1, string.length() - 1);

				// First choice, if a timestamp string, use it.
				try {
					// Allow non UTC strings since they are fully qualified with offset and can thus
					// be parsed by anyone.
					SimpleDateFormat fmt = new SimpleDateFormat("yyyyMMddHHmmssZ");
					fmt.setTimeZone(TimeZone.getTimeZone("UTC"));
					return fmt.parse(string);
				}
				catch(ParseException e) {
					// ignore and try timestamp format
				}
				// Second choice - if using java default for the locale
				// Needs special processing as it probably does not contain TZ in the string)
				try {
					// try the default locale style of Date Time and see if it parses
					DateFormat.getDateTimeInstance().parse(string);
					// if this parsed, it is not likely that the default is the full
					// format with timezone offset, so flag this as a special error :)
					// that is fixable
					// Although simple, it makes sense from a user perspective, a time in
					// local format can be entered and transformed to a timestamp.
					throw new ValueConverterException("Not in timestamp format", node, new FixableTimestampException());
				}
				catch(ParseException e) {
					DateFormat fmt = DateFormat.getDateTimeInstance();
					String defaultFormat = (fmt instanceof SimpleDateFormat)
							? ((SimpleDateFormat) fmt).toLocalizedPattern()
							: "Default format for the locale";
					throw new ValueConverterException("Not in valid format: Use 'yyyyMMddHHmmssZ' or " + defaultFormat +
							"Parse error:" + e.getMessage(), node, null);

				}
			}
		};
	}

	@ValueConverter(rule = "TriState")
	public IValueConverter<TriState> TriState() {
		return TriStateEnumHelper.getValueConverter();
	}

	@ValueConverter(rule = "URI")
	public IValueConverter<URI> URI() {
		return new IValueConverter<URI>() {

			public String toString(URI value) {
				if(value == null)
					return null;
				return '"' + value.toString() + '"';
			}

			public URI toValue(String string, AbstractNode node) throws ValueConverterException {
				if(string == null)
					return null;
				// if(Strings.isEmpty(string))
				// throw new ValueConverterException("Can not convert empty string to URI", node, null);
				try {
					int truncate = string.startsWith("\"") && string.endsWith("\"")
							? 1
							: 0;
					string = Strings.convertFromJavaString(string.substring(truncate, string.length() - truncate), true);

					return new URI(string);
				}
				catch(URISyntaxException e) {
					throw new ValueConverterException(
						"Value'" + string + "' is not a valid URI :" + e.getMessage(), node, null);
				}
			}

		};
	}

	@ValueConverter(rule = "VersionLiteral")
	public IValueConverter<Version> Version() {
		return new IValueConverter<Version>() {

			public String toString(Version value) {
				return versionFormatManager.toString(value);
				// return value.toString();
			}

			public Version toValue(String string, AbstractNode node) throws ValueConverterException {
				if(Strings.isEmpty(string))
					throw new ValueConverterException("Can not convert empty string to Version", node, null);
				try {
					char c = string.charAt(0);
					if(c == '"' || c == '\"')
						string = Strings.convertFromJavaString(string.substring(1, string.length() - 1), true);

					// INJECT IVersionFormatManager and create Version
					return versionFormatManager.toVersionValue(string);
					// return Version.create(string);
				}
				catch(IllegalArgumentException e) {
					throw new ValueConverterException("Version '" + string + "' is not a valid version: " +
							e.getMessage(), node, null);
				}
			}

		};
	}

	@ValueConverter(rule = "VersionRangeLiteral")
	public IValueConverter<VersionRange> VersionRange() {
		return new IValueConverter<VersionRange>() {

			public String toString(VersionRange value) {
				return versionFormatManager.toString(value);
			}

			public VersionRange toValue(String string, AbstractNode node) throws ValueConverterException {
				if(Strings.isEmpty(string))
					throw new ValueConverterException("Can not convert empty string to VersionRange", node, null);
				try {
					char c = string.charAt(0);
					if(c == '"' || c == '\"')
						string = Strings.convertFromJavaString(string.substring(1, string.length() - 1), true);

					return versionFormatManager.toVersionRangeValue(string);
				}
				catch(IllegalArgumentException e) {
					throw new ValueConverterException("VersionRange '" + string + "' is not a valid range: " +
							e.getMessage(), node, null);
				}
			}

		};
	}
}
