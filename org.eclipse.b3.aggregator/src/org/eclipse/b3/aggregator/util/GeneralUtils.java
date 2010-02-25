/*******************************************************************************
 * Copyright (c) 2006-2007, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 ******************************************************************************/

package org.eclipse.b3.aggregator.util;

import org.eclipse.b3.aggregator.Aggregator;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.equinox.p2.metadata.Version;

/**
 * @author Karel Brezina
 * 
 */
public class GeneralUtils {

	public static String encodeFilterValue(String value) {
		boolean encoded = false;
		int inlen = value.length();
		int outlen = inlen << 1; /* inlen * 2 */

		char[] output = new char[outlen];
		value.getChars(0, inlen, output, inlen);

		int cursor = 0;
		for(int i = inlen; i < outlen; i++) {
			char c = output[i];

			switch(c) {
			case '(':
			case '*':
			case ')':
			case '\\': {
				output[cursor] = '\\';
				cursor++;
				encoded = true;

				break;
			}
			}

			output[cursor] = c;
			cursor++;
		}

		return encoded
				? new String(output, 0, cursor)
				: value;
	}

	public static Aggregator getAggregator(EObject eObject) {
		EList<EObject> contents = getAggregatorResource(eObject).getContents();

		if(contents != null && contents.size() > 0)
			return (Aggregator) contents.get(0);

		throw new IllegalArgumentException("Aggregator was not found");
	}

	public static AggregatorResource getAggregatorResource(EObject eObject) {

		try {
			for(Resource resource : eObject.eResource().getResourceSet().getResources())
				if(resource instanceof AggregatorResource)
					return (AggregatorResource) resource;
		}
		catch(Exception e) {
			throw new IllegalArgumentException("AggregatorResource was not found", e);
		}

		throw new IllegalArgumentException("AggregatorResource was not found");
	}

	public static String stringifyVersion(Version version) {
		String result = version.getOriginal();

		if(result == null)
			result = version.toString();

		return result;
	}
}
