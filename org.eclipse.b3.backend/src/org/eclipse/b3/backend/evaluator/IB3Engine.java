/**
 * Copyright (c) 2010, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 */

package org.eclipse.b3.backend.evaluator;

/**
 * A marker interface for a B3 Engine. The intent is to add functions with this interface as the reference type.
 * When running a b3 script, some instance implementing this interface should be bound to the variable name "b3".
 */
public interface IB3Engine {

}
