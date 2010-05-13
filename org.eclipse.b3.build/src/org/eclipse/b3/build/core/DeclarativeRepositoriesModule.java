/**
 * Copyright (c) 2006-2009, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 */

package org.eclipse.b3.build.core;

import org.eclipse.b3.build.build.B3BuildPackage;
import org.eclipse.b3.build.build.BeeModelRepository;
import org.eclipse.b3.build.build.UnitRepositoryDescription;

import com.google.inject.name.Named;
import com.google.inject.name.Names;

/**
 * This Guice Module binds declarative unit providers for unknown repository types.
 * 
 */
public class DeclarativeRepositoriesModule extends AbstractB3Module {

	/**
	 * Binds a Repository named "b3" to an instance of {@link BeeModelRepository}.
	 */
	protected void bindBuildUnitRepository_b3() {
		bind(IBuildUnitRepository.class).annotatedWith(Names.named("b3")).toProvider(
			buildModelProvider(IBuildUnitRepository.class, B3BuildPackage.Literals.BEE_MODEL_REPOSITORY));

	}

	/**
	 * Binds what to return by default when a Repository requests an instance for a particular repository.
	 * This implementation returns {@link UnitRepositoryDescription} which is (only) a description of
	 * a Repository connector.
	 * <p>
	 * Specific binding should be added by a call to:<br/>
	 * <code>
	 * bind(IBuildUnitRepository.class).annotatedWith(Names.named("xyz").to...
	 * </code>
	 * </p>
	 * Where <code>"xyz"</code> is the repository type name, and <code>to...</code> is one of the binding operations
	 * provided by guice, e.g. <code>to(XYZ.class)</code>, or <code>toProvider(aProvider)</code>.
	 * 
	 */
	protected void bindBuildUnitRepository_Default() {
		bind(IBuildUnitRepository.class).annotatedWith(Named.class).toProvider(
			buildModelProvider(IBuildUnitRepository.class, B3BuildPackage.Literals.UNIT_REPOSITORY_DESCRIPTION));

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.google.inject.AbstractModule#configure()
	 */
	@Override
	protected void configure() {
		bindBuildUnitRepository_Default();
		bindBuildUnitRepository_b3();
	}
}
