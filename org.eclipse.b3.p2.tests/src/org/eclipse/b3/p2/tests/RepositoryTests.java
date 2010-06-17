/**
 * Copyright (c) 2006-2010, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 */

package org.eclipse.b3.p2.tests;

import java.io.File;
import java.net.URI;
import java.net.URL;

import org.eclipse.b3.util.Trivial;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.equinox.p2.repository.IRepository;
import org.junit.Assert;

public class RepositoryTests<T> {
	public static URI getTestData(String fileName) throws Exception {
		URI testDataURI = URI.create("platform:/plugin/org.eclipse.b3.p2.tests/testData/" + fileName);
		URL resolved = FileLocator.resolve(testDataURI.toURL());
		if(!"file".equalsIgnoreCase(resolved.getProtocol()))
			Assert.fail("Unable to resolve URL" + testDataURI);
		testDataURI = resolved.toURI();
		File file = new File(testDataURI);
		if(!file.canRead())
			Assert.fail("File does not exist: " + file.getAbsolutePath());
		return testDataURI;
	}

	private static void assertFieldEquals(String field, Object a, Object b) {
		if(!Trivial.equalsAllowNull(a, b))
			Assert.fail("Repository " + field + " differs");
	}

	protected IProgressMonitor monitor = new NullProgressMonitor();

	public void assertEquals(IRepository<T> a, IRepository<T> b) {
		assertFieldEquals("name", a.getName(), b.getName());
		assertFieldEquals("location", a.getLocation(), b.getLocation());
		assertFieldEquals("description", a.getDescription(), b.getDescription());
		assertFieldEquals("provider", a.getProvider(), b.getProvider());
		assertFieldEquals("type", a.getType(), b.getType());
		assertFieldEquals("version", a.getVersion(), b.getVersion());
		assertFieldEquals("properties", a.getProperties(), b.getProperties());
	}
}
