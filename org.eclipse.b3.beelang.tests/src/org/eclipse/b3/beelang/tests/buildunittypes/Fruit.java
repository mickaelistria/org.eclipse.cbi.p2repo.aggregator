package org.eclipse.b3.beelang.tests.buildunittypes;

import org.eclipse.b3.build.BuildUnit;
import org.eclipse.b3.build.core.B3BuilderJob;

/**
 * Marker interface for "Fruit" build units.
 * 
 */
public interface Fruit extends BuildUnit {
	public B3BuilderJob peel();

	public B3BuilderJob pulp();

	public B3BuilderJob seeds();
}
