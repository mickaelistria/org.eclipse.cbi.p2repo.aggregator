package org.eclipse.b3.build.core;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.b3.backend.core.SerialIterator;
import org.eclipse.b3.build.build.ConditionalPathVector;
import org.eclipse.b3.build.build.PathGroup;
import org.eclipse.b3.build.build.PathVector;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.EList;

public class PathIterator implements Iterator<IPath> {
	
	private Iterator<IPath> itor;
	
	public PathIterator(PathGroup pathGroup) {
		SerialIterator<IPath> sitor = new SerialIterator<IPath>();
		for(ConditionalPathVector pv : pathGroup.getPathVectors())
			sitor.addIterator(new PathIterator(pv));
		itor = sitor;
	}
	public PathIterator(ConditionalPathVector cpv) {
		EList<PathVector> pvs = cpv.getPathVectors();
		if(pvs.size() == 1)
			itor = new PathVectorIterator(pvs.get(0));
		else {
			SerialIterator<IPath> sitor = new SerialIterator<IPath>();
			for(PathVector pv : pvs)
				sitor.addIterator(new PathVectorIterator(pv));
			itor = sitor;
		}
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
	
	public void remove() {
		itor.remove();
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
		private PathVector vector;
		
		public PathVectorIterator(PathVector pathVector) {
			vector = pathVector;
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

		public void remove() {
			if(index == 0)
				throw new IllegalStateException("Remove without preceeding next");
			if(index == 1 && basePathString != null && pathStrings.size() == 0)
				vector.setBasePath(null);
			else {
				pathStrings.remove(index-1);
				// don't leave the basepath if all subpaths have been removed
				if(pathStrings.size() == 0)
					vector.setBasePath(null);
			}
		}
		
	}
}
