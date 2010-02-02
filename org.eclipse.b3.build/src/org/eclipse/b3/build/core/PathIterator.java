package org.eclipse.b3.build.core;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.b3.backend.core.SerialIterator;
import org.eclipse.b3.build.build.PathGroup;
import org.eclipse.b3.build.build.PathVector;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.EList;

public class PathIterator implements Iterator<IPath> {
	
	private Iterator<IPath> itor;
	
	public PathIterator(PathGroup pathGroup) {
		SerialIterator<IPath> sitor = new SerialIterator<IPath>();
		for(PathVector pv : pathGroup.getPathVectors())
			sitor.addIterator(new PathVectorIterator(pv));
		itor = sitor;
	}
	public PathIterator(PathVector pathVector) {
		itor = new PathVectorIterator(pathVector);
	}

	public boolean hasNext() {
		return itor.hasNext();
	}

	public IPath next() {
		return itor.next();
	}
	
	/**
	 * @throws UnsupportedOperationException
	 */
	public void remove() {
		throw new UnsupportedOperationException();
		
	}
	public List<IPath> toList() {
		List<IPath> list = new ArrayList<IPath>();
		while(hasNext())
			list.add(next());
		return list;
	}
	public static class PathVectorIterator implements Iterator<IPath> {
		private String basePathString;
		int	index;
		private EList<String> pathStrings;
		
		public PathVectorIterator(PathVector pathVector) {
			index = 0;
			basePathString = pathVector.getBasePath();
			pathStrings = pathVector.getPaths();
		}
		public boolean hasNext() {
			if(index == 0 && basePathString != null && pathStrings.size() == 0)
				return true;
			return index < pathStrings.size();
		}

		public IPath next() {
			IPath result = null;
			if(index == 0 && basePathString != null && pathStrings.size() == 0)
				result = new Path(basePathString);
			else if(basePathString != null) {
				IPath base = new Path(basePathString);
				result =  base.append(pathStrings.get(index));
			}
			else
				result = new Path(pathStrings.get(index));
			index++;
			return result;
		}

		/**
		 * Throws {@link UnsupportedOperationException}.
		 */
		public void remove() {
			throw new UnsupportedOperationException();
		}
		
	}
}
