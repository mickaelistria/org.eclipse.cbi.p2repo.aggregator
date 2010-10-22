/**
 * Copyright (c) 2010, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 */

package org.eclipse.b3.backend.core.datatypes;

import java.io.Serializable;

/**
 * A representation of an integer with a radix
 * 
 */
public class IntegerWithRadix implements Serializable {
	private static final long serialVersionUID = 3249927626857631021L;

	private Integer value;

	private int radix;

	public IntegerWithRadix(int value) {
		this.value = new Integer(value);
		this.radix = 10;
	}

	public IntegerWithRadix(int value, int radix) {
		if(!(radix == 8 || radix == 10 || radix == 16))
			throw new IllegalArgumentException("Only radix 8, 10 or 16 supported");
		this.value = value;
		this.radix = radix;
	}

	public int getRadix() {
		return radix;
	}

	public Integer getValue() {
		return value;
	}

	@Override
	public String toString() {
		StringBuffer buf = new StringBuffer();
		if(radix == 8)
			buf.append("0");
		else if(radix == 16)
			buf.append("0x");
		buf.append(Integer.toString(value, radix));
		return buf.toString();
	}
}
