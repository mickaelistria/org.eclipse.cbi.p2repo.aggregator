/**
 * Copyright (c) 2010, Cloudsmith Inc and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 * - Cloudsmith Inc - initial API and implementation.
 */
package org.eclipse.b3.build.core.exceptions;

import org.eclipse.b3.backend.core.exceptions.B3EngineException;
import org.eclipse.b3.build.Repository;
import org.eclipse.b3.build.UnitRepositoryDescription;
import org.eclipse.osgi.util.NLS;

public class B3UndefinedRepositoryHandlerException extends B3EngineException {

	private static final long serialVersionUID = 1L;

	public B3UndefinedRepositoryHandlerException(Repository repo) {
		super(NLS.bind(
			"Unresolved repository handler. No handler bound for repository type \"{0}\" in repository \"{1}\".",
			new Object[] { repo.getHandlerType(), repo.getName() }));

	}

	public B3UndefinedRepositoryHandlerException(UnitRepositoryDescription repoDescription) {
		super(
			NLS.bind(
				"Unresolved repository handler. No handler bound for repository type \"{0}\" in repository \"{1}\".",
				new Object[] {
						repoDescription.getRepository().getHandlerType(), repoDescription.getRepository().getName() }));
	}

}
