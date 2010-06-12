/**
 * Copyright (c) 2010, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 */

package org.eclipse.b3.enums;

import org.eclipse.b3.build.build.UpdateStrategy;
import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.parsetree.AbstractNode;

import com.google.common.collect.BiMap;
import com.google.common.collect.EnumHashBiMap;
import com.google.common.collect.Maps;

public class UpdateStrategyEnumHelper {
	public static final BiMap<UpdateStrategy, String> converterMap = createEnumMap();

	public static final String BRANCH_POINT_DEFAULT_STR = "default";;

	public static final String FAIL_MODIFIED_STR = "fail_modified";

	public static final String KEEP_MODIFIED_STR = "keep_modified";

	public static final String MERGE_STR = "merge_modified";

	public static final String NO_UPDATE_STR = "no_update";

	public static final String REPLACE_MODIFIED_STR = "replace_modified";

	private static BiMap<UpdateStrategy, String> createEnumMap() {
		BiMap<UpdateStrategy, String> map = new EnumHashBiMap<UpdateStrategy, String>(UpdateStrategy.class);
		map.put(UpdateStrategy.BRANCH_POINT_DEFAULT, BRANCH_POINT_DEFAULT_STR);
		map.put(UpdateStrategy.FAIL_MODIFIED, FAIL_MODIFIED_STR);
		map.put(UpdateStrategy.KEEP_MODIFIED, KEEP_MODIFIED_STR);
		map.put(UpdateStrategy.MERGE, MERGE_STR);
		map.put(UpdateStrategy.NO_UPDATE, NO_UPDATE_STR);
		map.put(UpdateStrategy.BRANCH_POINT_DEFAULT, BRANCH_POINT_DEFAULT_STR);
		map.put(UpdateStrategy.REPLACE_MODIFIED, REPLACE_MODIFIED_STR);

		return Maps.unmodifiableBiMap(map);
	}

	public static IValueConverter<UpdateStrategy> getValueConverter() {
		return new IValueConverter<UpdateStrategy>() {

			@Override
			public String toString(UpdateStrategy value) {
				String r = converterMap.get(value);
				return r == null
						? "unknown_update_policy"
						: r;
			}

			@Override
			public UpdateStrategy toValue(String string, AbstractNode node) throws ValueConverterException {
				UpdateStrategy x = converterMap.inverse().get(string);
				if(x != null)
					return x;
				throw new ValueConverterException(
					"The value '" + string + "' is not a valid update-policy: ", node, null);
			}
		};
	}
}
