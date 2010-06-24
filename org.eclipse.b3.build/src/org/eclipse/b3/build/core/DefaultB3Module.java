/**
 * Copyright (c) 2006-2009, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 */

package org.eclipse.b3.build.core;

import org.eclipse.b3.build.B3BuildPackage;
import org.eclipse.b3.build.BeeModelRepository;
import org.eclipse.b3.build.UnitRepositoryDescription;
import org.eclipse.b3.build.repository.IBuildUnitRepository;
import org.eclipse.b3.build.repository.IBuildUnitResolver;

import com.google.inject.name.Named;
import com.google.inject.name.Names;

/**
 * This Guice Module is the default for a b3 build engine.
 * 
 */
public class DefaultB3Module extends AbstractB3Module {

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

	/**
	 * Binds IBuildUnitResolver to SimpleResolver (which resolves all defined build units defined on the stack).
	 * The binding is made in ResolutionScoped - which means that such a scope must have been created and
	 * entered (but not exited) before getting the instance.
	 */
	protected void bindBuildUnitResolver() {
		bind(IBuildUnitResolver.class).to(SimpleResolver.class).in(ResolutionScoped.class);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.google.inject.AbstractModule#configure()
	 */
	@Override
	protected void configure() {
		super.configure();
		bindBuildUnitRepository_Default();
		bindBuildUnitRepository_b3();
		bindBuildUnitResolver();
	}
}
