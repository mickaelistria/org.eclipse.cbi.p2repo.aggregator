/*******************************************************************************
 * Copyright (c) 2009, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 ******************************************************************************/

package org.eclipse.b3.beelang.junit;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * An annotation for a class which specifies B3 files to be scanned for test functions.
 * 
 * @author michal.ruzicka@cloudsmith.com
 * 
 * @see JUnitB3FileRunnerFactory
 */
@Retention (RetentionPolicy.RUNTIME)
@Target (ElementType.TYPE)
public @interface B3TestFiles {
	/**
	 * @return bundle relative paths of the B3 files to be scanned for the test functions
	 */
	public String[] value();
}
