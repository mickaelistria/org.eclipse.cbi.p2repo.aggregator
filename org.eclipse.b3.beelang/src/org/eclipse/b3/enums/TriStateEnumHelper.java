/**
 * Copyright (c) 2010, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 */

package org.eclipse.b3.enums;

import org.eclipse.b3.build.TriState;
import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.parsetree.AbstractNode;

import com.google.common.collect.BiMap;
import com.google.common.collect.EnumHashBiMap;
import com.google.common.collect.Maps;

public class TriStateEnumHelper {

	public static final BiMap<TriState, String> converterMap = createEnumMap();

	public static final String DEFAULT_STR = "default";;

	public static final String TRUE_STR = "true";

	public static final String FALSE_STR = "false";

	private static BiMap<TriState, String> createEnumMap() {
		BiMap<TriState, String> map = new EnumHashBiMap<TriState, String>(TriState.class);
		map.put(TriState.DEFAULT, DEFAULT_STR);
		map.put(TriState.TRUE, TRUE_STR);
		map.put(TriState.FALSE, FALSE_STR);

		return Maps.unmodifiableBiMap(map);
	}

	public static IValueConverter<TriState> getValueConverter() {
		return new IValueConverter<TriState>() {

			// @Override
			public String toString(TriState value) {
				String r = converterMap.get(value);
				return r == null
						? "unknown_tri_state"
						: r;
			}

			// @Override
			public TriState toValue(String string, AbstractNode node) throws ValueConverterException {
				TriState x = converterMap.inverse().get(string);
				if(x != null)
					return x;
				throw new ValueConverterException("The value '" + string +
						"' is not a valid tri state value (default, true, false): ", node, null);
			}
		};
	}
}
