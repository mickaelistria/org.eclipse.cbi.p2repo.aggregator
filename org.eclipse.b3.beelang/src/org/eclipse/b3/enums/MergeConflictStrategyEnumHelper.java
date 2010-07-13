/**
 * Copyright (c) 2010, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 */

package org.eclipse.b3.enums;

import org.eclipse.b3.build.MergeConflictStrategy;
import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.parsetree.AbstractNode;

import com.google.common.collect.BiMap;
import com.google.common.collect.EnumHashBiMap;
import com.google.common.collect.Maps;

public class MergeConflictStrategyEnumHelper {

	public static final BiMap<MergeConflictStrategy, String> converterMap = createEnumMap();

	public static final String BRANCH_POINT_DEFAULT_STR = "default";;

	public static final String FAIL_STR = "fail";

	public static final String USE_WORKSPACE_STR = "use_workspace";

	public static final String USE_SCM_STR = "use_scm";

	private static BiMap<MergeConflictStrategy, String> createEnumMap() {
		BiMap<MergeConflictStrategy, String> map = new EnumHashBiMap<MergeConflictStrategy, String>(
			MergeConflictStrategy.class);
		map.put(MergeConflictStrategy.DEFAULT, BRANCH_POINT_DEFAULT_STR);
		map.put(MergeConflictStrategy.FAIL, FAIL_STR);
		map.put(MergeConflictStrategy.USE_WORKSPACE, USE_WORKSPACE_STR);
		map.put(MergeConflictStrategy.USE_SCM, USE_SCM_STR);

		return Maps.unmodifiableBiMap(map);
	}

	public static IValueConverter<MergeConflictStrategy> getValueConverter() {
		return new IValueConverter<MergeConflictStrategy>() {

			// @Override
			public String toString(MergeConflictStrategy value) {
				String r = converterMap.get(value);
				return r == null
						? "unknown_merge_conflict_strategy"
						: r;
			}

			// @Override
			public MergeConflictStrategy toValue(String string, AbstractNode node) throws ValueConverterException {
				MergeConflictStrategy x = converterMap.inverse().get(string);
				if(x != null)
					return x;
				throw new ValueConverterException(
					"The value '" + string + "' is not a valid merge conflict strategy: ", node, null);
			}
		};
	}
}
