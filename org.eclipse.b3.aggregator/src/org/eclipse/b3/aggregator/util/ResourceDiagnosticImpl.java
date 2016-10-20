/*******************************************************************************
 * Copyright (c) 2006-2007, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 ******************************************************************************/

package org.eclipse.b3.aggregator.util;

import org.eclipse.emf.ecore.resource.Resource.Diagnostic;

/**
 * @author Karel Brezina
 *
 */
public class ResourceDiagnosticImpl implements Diagnostic {
	protected String location;

	protected String message;

	public ResourceDiagnosticImpl(String message, String location) {
		this.message = message;
		this.location = location;
	}

	public int getColumn() {
		return 0;
	}

	public int getLine() {
		return 0;
	}

	public String getLocation() {
		return location;
	}

	public String getMessage() {
		return message;
	}
}
