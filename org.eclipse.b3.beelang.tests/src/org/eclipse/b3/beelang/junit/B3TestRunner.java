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

import org.junit.runners.Suite;


/**
 * <p>
 * The custom runner <code>B3TestRunner</code> implements execution of B3 language functions as JUnit tests. The runner
 * executes all functions from specified B3 files which names start with the prefix of "test".
 * </p>
 * 
 * The B3 files to be scanned for the test methods are specified as follows:
 * 
 * <pre>
 * &#064;RunWith (B3TestRunner.class)
 * &#064;B3TestRunner.B3Files ( { &quot;/b3/test1.b3&quot;, &quot;/b3/test2.b3&quot; })
 * public class AllB3Test {
 * }
 * </pre>
 * 
 * @author michal.ruzicka@cloudsmith.com
 */
public class B3TestRunner extends Suite {

	/**
	 * Annotation for a class which specifies the B3 files to be scanned for the test functions
	 */
	@Retention (RetentionPolicy.RUNTIME)
	@Target (ElementType.TYPE)
	public @interface B3Files {
		/**
		 * @return URI strings of the B3 files to be run
		 */
		public String[] value();
	}

	/**
	 * Only called reflectively. Do not use programmatically.
	 */
	public B3TestRunner(Class<?> klass) throws Throwable {
		super(klass, new B3RunnerFactory(klass).getB3FileRunners());
	}

}
