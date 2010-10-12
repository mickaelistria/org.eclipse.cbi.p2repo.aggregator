package org.eclipse.b3.ui.coloring;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor;
import org.eclipse.xtext.ui.editor.utils.TextStyle;

public class BeeLangHighlightConfiguration extends DefaultHighlightingConfiguration {

	public static final String TEXT_ID = "text";

	public static final String TEMPLATE_TEXT_ID = "template";

	public static final String JAVADOC_ID = "javadoc";

	public static final String REGEXP_ID = "regexp";

	public static final String BOOLEAN_ID = "boolean";

	public static final String NULL_ID = "null";

	public static final String VERSION_ID = "version";

	public static final String PATH_ID = "path";

	public static final String REAL_ID = "real";

	public static final String PROPERTY_ID = "property";

	@Override
	public void configure(IHighlightingConfigurationAcceptor acceptor) {
		super.configure(acceptor);
		acceptor.acceptDefaultHighlighting(TEMPLATE_TEXT_ID, "Template Text", templateTextStyle());
		acceptor.acceptDefaultHighlighting(TEXT_ID, "Text", docTextStyle());
		acceptor.acceptDefaultHighlighting(JAVADOC_ID, "Documentation", docJavaDocStyle());
		acceptor.acceptDefaultHighlighting(REGEXP_ID, "Regular Expression", regexpTextStyle());
		acceptor.acceptDefaultHighlighting(BOOLEAN_ID, "Boolean Literal", italicKeywordLightStyle());
		acceptor.acceptDefaultHighlighting(NULL_ID, "Null Literal", nullTextStyle());
		acceptor.acceptDefaultHighlighting(PROPERTY_ID, "Properties", propertyTextStyle());

		// from semantic
		acceptor.acceptDefaultHighlighting(VERSION_ID, "Version", versionTextStyle());
		acceptor.acceptDefaultHighlighting(PATH_ID, "Path", pathTextStyle());
		acceptor.acceptDefaultHighlighting(REAL_ID, "Floating point", realTextStyle());

	}

	public TextStyle docJavaDocStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setColor(new RGB(63, 95, 191));
		return textStyle;
	}

	public TextStyle docTextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setColor(new RGB(63, 95, 191));
		// Does not look as good as background color affects only what is behind the text.
		// textStyle.setBackgroundColor(new RGB(252, 255, 240)); // titanium white
		textStyle.setStyle(SWT.ITALIC);
		return textStyle;
	}

	public TextStyle italicKeywordLightStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setColor(new RGB(127, 0, 85));
		textStyle.setStyle(SWT.ITALIC);
		return textStyle;
	}

	public TextStyle nullTextStyle() {
		TextStyle textStyle = italicKeywordLightStyle().copy();
		return textStyle;
	}

	public TextStyle pathTextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setColor(new RGB(63, 95, 191));
		textStyle.setStyle(SWT.ITALIC);
		return textStyle;
	}

	public TextStyle propertyTextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setColor(new RGB(0x99, 0x33, 0x00)); // Brownish
		return textStyle;

	}

	public TextStyle realTextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setColor(new RGB(125, 125, 125));
		return textStyle;
	}

	public TextStyle regexpTextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setColor(new RGB(0, 0, 192));
		textStyle.setStyle(SWT.BOLD);
		return textStyle;
	}

	public TextStyle templateTextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setColor(new RGB(63, 95, 191));
		// Affects what is behind the text and WS - important since this is a verbatim style
		// and whitespace counts.
		// textStyle.setBackgroundColor(new RGB(252, 255, 240)); // titanium white
		textStyle.setBackgroundColor(new RGB(231, 255, 232)); // pale green
		textStyle.setStyle(SWT.ITALIC);
		return textStyle;
	}

	public TextStyle versionTextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setColor(new RGB(63, 95, 191));
		textStyle.setStyle(SWT.ITALIC);
		return textStyle;
	}
}
