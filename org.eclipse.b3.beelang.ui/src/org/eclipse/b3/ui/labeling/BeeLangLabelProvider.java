/**
 * Copyright (c) 2010, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 */

package org.eclipse.b3.ui.labeling;

import java.lang.reflect.Type;

import org.eclipse.b3.backend.core.IStringProvider;
import org.eclipse.b3.backend.evaluator.b3backend.B3FunctionType;
import org.eclipse.b3.backend.evaluator.b3backend.B3JavaImport;
import org.eclipse.b3.backend.evaluator.b3backend.BAtExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BChainedExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BConcern;
import org.eclipse.b3.backend.evaluator.b3backend.BDefaultPropertySet;
import org.eclipse.b3.backend.evaluator.b3backend.BFunction;
import org.eclipse.b3.backend.evaluator.b3backend.BLiteralExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BLiteralListExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BLiteralMapExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BLiteralType;
import org.eclipse.b3.backend.evaluator.b3backend.BPropertySet;
import org.eclipse.b3.backend.evaluator.b3backend.BRegularExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BVariableExpression;
import org.eclipse.b3.backend.evaluator.b3backend.IFunction;
import org.eclipse.b3.backend.inference.ITypeProvider;
import org.eclipse.b3.build.B3BuildPackage;
import org.eclipse.b3.build.BeeModel;
import org.eclipse.b3.build.BuildUnit;
import org.eclipse.b3.build.Builder;
import org.eclipse.b3.build.Capability;
import org.eclipse.b3.build.FragmentHost;
import org.eclipse.b3.build.IBuilder;
import org.eclipse.b3.build.Repository;
import org.eclipse.b3.build.RequiredCapability;
import org.eclipse.b3.build.UnitProvider;
import org.eclipse.b3.build.VersionedCapability;
import org.eclipse.b3.build.core.B3BuildConstants;
import org.eclipse.b3.build.core.IVersionFormatManager;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.preference.JFacePreferences;
import org.eclipse.jface.resource.ColorRegistry;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.jface.viewers.StyledString;
import org.eclipse.jface.viewers.StyledString.Styler;
import org.eclipse.swt.graphics.TextStyle;
import org.eclipse.xtext.ui.label.DefaultEObjectLabelProvider;
import org.eclipse.xtext.util.Strings;

import com.google.inject.Inject;

/**
 * Provides labels for a EObjects.
 * 
 * see http://www.eclipse.org/Xtext/documentation/latest/xtext.html#labelProvider
 */
public class BeeLangLabelProvider extends DefaultEObjectLabelProvider {
	private static class DefaultStyler extends Styler {
		private final String fForegroundColorName;

		private final String fBackgroundColorName;

		public DefaultStyler(String foregroundColorName, String backgroundColorName) {
			fForegroundColorName = foregroundColorName;
			fBackgroundColorName = backgroundColorName;
		}

		@Override
		public void applyStyles(TextStyle textStyle) {
			ColorRegistry colorRegistry = JFaceResources.getColorRegistry();
			if(fForegroundColorName != null) {
				textStyle.foreground = colorRegistry.get(fForegroundColorName);
			}
			if(fBackgroundColorName != null) {
				textStyle.background = colorRegistry.get(fBackgroundColorName);
			}
		}
	}

	public static final String UNIT = "obj16/unit_obj.gif";

	public static final String IMPORT_LIST = "obj16/impc_obj.gif";

	public static final String IMPORT = "obj16/imp_obj.gif";

	public static final String METHOD_PUBLIC = "obj16/methpub_obj.gif";

	public static final String FILE = "obj16/file_obj.gif";

	public static final String FEATURE = "obj16/field_public_obj.gif";

	public static final String BUILDER = "obj16/builder.png";

	public static final String PROVIDED = "obj16/provided.png";

	public static final String REQUIRED = "obj16/required.png";

	public static final String FRAGMENT_HOST = "obj16/fragment_host.png";

	public static final String CONCERN = "obj16/concern.png";

	public static final String FUNCTION = "obj16/function.png";

	public static final String REPO = "obj16/repo.png";

	public static final String UNIT_PROVIDER = "obj16/unit_provider.png";

	@Inject
	private IVersionFormatManager versionFormatManager;

	@Inject
	private ITypeProvider typeProvider;

	@Inject
	private IStringProvider stringProvider;

	public static final Styler ERROR_STYLER = new DefaultStyler(JFacePreferences.ERROR_COLOR, null);

	@Inject
	public BeeLangLabelProvider(AdapterFactoryLabelProvider delegate) {
		super(delegate);
	}

	public Object image(B3JavaImport element) {
		return IMPORT;
	}

	public Object image(BConcern element) {
		return CONCERN;
	}

	public Object image(BeeModel element) {
		return FILE;
	}

	public Object image(BuildUnit element) {
		return UNIT;
	}

	public Object image(Capability element) {
		return PROVIDED;
	}

	public Object image(FragmentHost element) {
		return FRAGMENT_HOST;
	}

	public Object image(IBuilder element) {
		return BUILDER;
	}

	public Object image(IFunction element) {
		return FUNCTION;
	}

	public Object image(Repository element) {
		return REPO;
	}

	public Object image(RequiredCapability element) {
		if(element.eContainer().eClass().getClassifierID() == B3BuildPackage.FRAGMENT_HOST)
			return FRAGMENT_HOST;
		return REQUIRED;
	}

	public Object image(UnitProvider element) {
		return UNIT_PROVIDER;
	}

	// String text(B3FunctionType ele) {
	// return stringProvider.doToString(ele);
	// // StringBuffer buf = new StringBuffer();
	// // buf.append("type: (");
	// // int counter = 0;
	// // for(Type t : ele.getParameterTypes()) {
	// // if(counter++ > 0)
	// // buf.append(", ");
	// // buf.append(t);
	// // }
	// // buf.append(")=>");
	// // buf.append(safeToString(ele.getReturnType()));
	// // return buf.toString();
	// }

	String text(BAtExpression ele) {
		return "[n]";
	}

	String text(BChainedExpression ele) {
		return "{ ... }";
	}

	String text(BDefaultPropertySet ele) {
		return "default-properties";
	}

	String text(BeeModel ele) {
		String s = ele.eResource().getURI().lastSegment();
		return Strings.isEmpty(s)
				? "resource"
				: s;
	}

	StyledString text(BFunction ele) {
		StyledString result = new StyledString(ele.getName());
		Type t = typeProvider.doGetInferredType(ele);
		if(t == null || !(t instanceof B3FunctionType)) {
			result.append(" : ", StyledString.DECORATIONS_STYLER);
			result.append("not inferrable", ERROR_STYLER);
			return result;
		}
		;
		result.append(" => " + doGetText(((B3FunctionType) t).getReturnType()), StyledString.DECORATIONS_STYLER);
		return result;
	}

	String text(BLiteralExpression ele) {
		return "literal<" + safeClassToString(ele.getValue()) + ">" + safeToString(ele.getValue());
	}

	String text(BLiteralListExpression ele) {
		return "list: <" + safeToString(ele.getEntryType()) + ">";
	}

	String text(BLiteralMapExpression ele) {
		return "list: <" + safeToString(ele.getKeyType()) + ", " + safeToString(ele.getValueType()) + ">";
	}

	String text(BLiteralType ele) {
		return "literal type:";
	}

	StyledString text(BPropertySet element) {
		StyledString bld = new StyledString(element.getName());
		bld.append(" : properties", StyledString.DECORATIONS_STYLER);
		return bld;
	}

	String text(BRegularExpression ele) {
		return "regexp: " + safeToString(ele.getPattern());
	}

	StyledString text(Builder ele) {
		StyledString result = new StyledString(ele.getName());
		result.append(" : builder", StyledString.DECORATIONS_STYLER);
		return result;
	}

	StyledString text(BuildUnit ele) {
		StyledString bld = new StyledString(ele.getName());

		String versionString = ele.getVersion() != null
				? versionFormatManager.toString(ele.getVersion())
				: null;

		bld.append(" : unit" + (versionString != null
				? " - " + versionString
				: ""), StyledString.DECORATIONS_STYLER);
		return bld;

	}

	String text(BVariableExpression ele) {
		return "value of: " + ele.getNamedValue().getName();
	}

	StyledString text(Capability element) {
		StyledString result = new StyledString(element.getName());
		String ns = element.getNameSpace().equals(B3BuildConstants.B3_NS_BUILDUNIT)
				? "unit"
				: element.getNameSpace();

		result.append(" : " + ns, StyledString.DECORATIONS_STYLER);
		return result;
	}

	StyledString text(RequiredCapability element) {
		StyledString result = new StyledString(element.getName());
		String ns = element.getNameSpace().equals(B3BuildConstants.B3_NS_BUILDUNIT)
				? "unit"
				: element.getNameSpace();
		String versionString = element.getVersionRange() != null
				? versionFormatManager.toString(element.getVersionRange())
				: null;

		result.append(" : " + ns + (versionString != null
				? " - " + versionString
				: ""), StyledString.DECORATIONS_STYLER);
		return result;
	}

	// String text(B3ParameterizedType ele) {
	// return stringProvider.doToString(ele);
	// // Type t = ele.getRawType();
	// // return "type: " + safeToString(t);
	// }
	String text(Type ele) {
		return stringProvider.doToString(ele);
	}

	// String text(B3Type ele) {
	// return stringProvider.doToString(ele);
	// // String fqn = ele.getRawType().toString();
	// // int ix = fqn.lastIndexOf('.');
	// // return fqn.substring(ix == -1
	// // ? 0
	// // : ix + 1);
	// }

	StyledString text(VersionedCapability element) {
		StyledString result = new StyledString(element.getName());
		String ns = element.getNameSpace().equals(B3BuildConstants.B3_NS_BUILDUNIT)
				? "unit"
				: element.getNameSpace();
		String versionString = element.getVersion() != null
				? versionFormatManager.toString(element.getVersion())
				: null;

		result.append(" : " + ns + (versionString != null
				? " - " + versionString
				: ""), StyledString.DECORATIONS_STYLER);
		return result;
	}

	/*
	 * //Labels and icons can be computed like this:
	 * 
	 * String text(MyModel ele) {
	 * return "my "+ele.getName();
	 * }
	 * 
	 * String image(MyModel ele) {
	 * return "MyModel.gif";
	 * }
	 */
	private String safeClassToString(Object o) {
		return o == null
				? "null"
				: o.getClass().getName();
	}

	/*
	 * String image(MyModel ele) {
	 * return "MyModel.gif";
	 * }
	 */
	private String safeToString(Object o) {
		return (o == null)
				? "null"
				: o.toString();
	}
}
