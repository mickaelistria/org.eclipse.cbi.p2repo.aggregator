/**
 * Copyright (c) 2010, Cloudsmith Inc and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 * - Cloudsmith Inc - initial API and implementation.
 */
package org.eclipse.b3.build.core.iterators;

import java.net.URI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.b3.backend.core.B3URIUtils;
import org.eclipse.b3.backend.core.SerialIterator;
import org.eclipse.b3.build.BuildSet;
import org.eclipse.b3.build.ConditionalPathVector;
import org.eclipse.b3.build.PathGroup;
import org.eclipse.b3.build.PathVector;
import org.eclipse.emf.common.util.EList;

public class PathIterator implements Iterator<URI> {

	public static class PathVectorIterator implements Iterator<URI> {
		private URI baseURI;

		int index;

		private EList<URI> fragmentURIs;

		private PathVector vector;

		public PathVectorIterator(PathVector pathVector) {
			vector = pathVector;
			index = 0;
			baseURI = pathVector.getBasePath();
			fragmentURIs = pathVector.getPaths();
		}

		public boolean hasNext() {
			if(index == 0 && baseURI != null && fragmentURIs.size() == 0)
				return true;
			return index < fragmentURIs.size();
		}

		public URI next() {
			URI result = null;
			if(index == 0 && baseURI != null && fragmentURIs.size() == 0)
				result = baseURI;
			else if(baseURI != null) {
				result = B3URIUtils.appendPath(baseURI, fragmentURIs.get(index));
			}
			else
				result = fragmentURIs.get(index);
			index++;
			return result;
		}

		public void remove() {
			if(index == 0)
				throw new IllegalStateException("Remove without preceeding next");
			if(index == 1 && baseURI != null && fragmentURIs.size() == 0)
				vector.setBasePath(null);
			else {
				fragmentURIs.remove(index - 1);
				// don't leave the basepath if all subpaths have been removed
				if(fragmentURIs.size() == 0)
					vector.setBasePath(null);
			}
		}

	}

	private Iterator<URI> itor;

	/**
	 * Returns paths from build result.
	 * 
	 * @param buildResult
	 */
	public PathIterator(BuildSet buildResult) {
		SerialIterator<URI> sitor = new SerialIterator<URI>();
		for(PathVector pv : buildResult.getPathVectors())
			sitor.addIterator(new PathIterator(pv));
		itor = sitor;
	}

	/**
	 * Returns paths from ConditionalPathVector - NO EVALUATION OF FILTERS !!
	 * 
	 * @param cpv
	 */
	public PathIterator(ConditionalPathVector cpv) {
		EList<PathVector> pvs = cpv.getPathVectors();
		if(pvs.size() == 1)
			itor = new PathVectorIterator(pvs.get(0));
		else {
			SerialIterator<URI> sitor = new SerialIterator<URI>();
			for(PathVector pv : pvs)
				sitor.addIterator(new PathVectorIterator(pv));
			itor = sitor;
		}
	}

	/**
	 * Returns paths from a PathGroup (i.e. "builder output") - NO EVALUATION OF FILTERS !!
	 * 
	 * @param pathGroup
	 */
	public PathIterator(PathGroup pathGroup) {
		SerialIterator<URI> sitor = new SerialIterator<URI>();
		for(ConditionalPathVector cpv : pathGroup.getPathVectors())
			sitor.addIterator(new PathIterator(cpv));
		itor = sitor;
	}

	public PathIterator(PathVector pathVector) {
		itor = new PathVectorIterator(pathVector);
	}

	public boolean hasNext() {
		return itor.hasNext();
	}

	public URI next() {
		return itor.next();
	}

	public void remove() {
		itor.remove();
	}

	public List<URI> toList() {
		List<URI> list = new ArrayList<URI>();
		while(hasNext())
			list.add(next());
		return list;
	}
}
