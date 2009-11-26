package org.eclipse.b3.backend.evaluator.typesystem;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;

/**
 * This is work in progress...
 * 
 * Currently, the common supertype is computed on classes only.
 * There are several issues when also considering interfaces as the result of
 * common super types can be a set of interfaces (and one class - typically Object.class), and
 * there is no way to prioritize between a set of interfaces (many classes implement more than one e.g. 
 * Serializeable, Comparable and there is no way to determine if one of the other is wanted.)
 * 
 * There are some situations where an interface can be infered as a supertype - if the common 
 * supertype is Object, and the classes share a single interface. But is probably not worth
 * implementing as this probably is a rare case.
 * 
 * The code for computing supertype based on interface is still present (commented to a large 
 * part), as it may be of use for computing suggestions (i.e. answer what are the common interfaces)
 * and offer that as suggestion when doing a cast).
 * 
 * There are other special cases :
 * - if the common supertype of one or several classes and one interface is
 * wanted - the result could be the interface if the classes implementes it. A check for superinterfaces
 * does not work well as the result may be several interfaces.
 * - if the set contains more than one interface, it does not work (in general) as the interfaces
 * may have more than one interface in common.
 * 
 *  TODO: 
 *  - check if there is an interface in the set of queried types, if so, check if all others implement
 *  this interface, by doing an isAssignableFrom check on the interface type.
 *  - reduce the trivial case of more than one interface in the queried list to the result Object.class
 *
 */
public class TypeDistance {
	static final TypeDistance instance = new TypeDistance();
	
	private Map<Class<?>, TreeNode> classToNodeMap = new IdentityHashMap<Class<?>, TreeNode>();
	private TreeNode root;
	private List<Class<?>> classList = null;
	private static ClassSet OBJECT_SET;
	public TypeDistance() {
		root = new TreeNode(Object.class);
		root.rank = 0; // patch the root node's rank (only do it like this here)
		classToNodeMap.put(Object.class, root);
		OBJECT_SET = new ClassSet();
		OBJECT_SET.add(Object.class);
	}
	public Type getMostSpecificCommonType(Type[] types) {
		return computeCommonClass(types);
//		return mostSpecific(r);			
	}
//	public Type getLeastSpecificCommonType(Type[] types) {
//		ClassSet r = computeCommonClasses(types);
//		return leastSpecific(r);			
//	}
	
//	private ClassSet computeCommonClasses(Type[] types) {	
//		// collect nodes for which commonality should be computed
//		List<TreeNode> nodesToCompute = new ArrayList<TreeNode>();
//		// The class of each type must have been encoded
//		for(Type t : types)
//			nodesToCompute.add(nodeOfClass(TypeUtils.getRaw(t)));
//		
//		// if cache is gone - recompute it
//		if(classList == null)
//			eulerize();
//		//
//		// TODO: SHOULD NOT RETURN A SET - DO NOT PERFORM UNIT - SIMPLY ITERATE WITH
//		// RESULT & NEXT
//		//
//		Class<?> r = nodesToCompute.get(0).clazz;
//		int limit = nodesToCompute.size();
//		for(int i = 1; i < limit; i++) {
//			r = computeCommonClasses(r, nodesToCompute.get(i).clazz);
//			if(r == Object.class)
//				return Object.class;
//		}
//		return r;
//	}
	private Class<?> computeCommonClass(Type[] types) {	
		// collect nodes for which commonality should be computed
		List<TreeNode> nodesToCompute = new ArrayList<TreeNode>();
		// The class of each type must have been encoded
		for(Type t : types)
			nodesToCompute.add(nodeOfClass(TypeUtils.getRaw(t)));
		
		// if cache is gone - recompute it
		if(classList == null)
			eulerize();

		Class<?> r = nodesToCompute.get(0).clazz;
		int limit = nodesToCompute.size();
		for(int i = 1; i < limit; i++) {
			r = computeCommonClass(r, nodesToCompute.get(i).clazz);
			if(r == Object.class)
				return Object.class;
		}
		return r;
	}
	private TreeNode nodeOfClass(Class<?> c) {
		TreeNode n = classToNodeMap.get(c);
		if(n != null)
			return n;
		Class<?> su = c.getSuperclass();
		
		// interfaces have null superclass, but they should all be added as 
		// children of Object since any implementor of an interface is 
		// also an extension of Object.
		if(su == null)
			su = Object.class;
		n = nodeOfClass(su);
		TreeNode child;
		n.addExtendedBy(child = new TreeNode(c));
		classToNodeMap.put(c, child);
		classList = null; // clear cache 
		
//		// all interfaces implemented by this class must also be processed
//		for(Class<?> i : c.getInterfaces()) {
//			n = nodeOfClass(i);
//			n.addImplements(child);
//		}
			
		return child;
	}
	private void eulerize() {
		classList = new ArrayList<Class<?>>();
		visitTree(root);
	}
	/**
	 * Produce a list of classes in Euler order
	 * @param n
	 */
	private void visitTree(TreeNode n) {
		classList.add(n.clazz);
		for(TreeNode c : n.extensions) {
			visitTree(c);
			classList.add(n.clazz);
		}
	}
//	private Class<?> computeMostSpecificCommonClass(Class<?> ac, Class<?> bc) {
//		ClassSet candidates = computeCommonClasses(ac, bc);
//		return mostSpecific(candidates);
//	}
//	private Class<?> mostSpecific(ClassSet candidates) {
//		// find the class with the highest rank
//		int maxClassRank = Integer.MIN_VALUE;
////		int maxInterfaceRank = Integer.MIN_VALUE;
//		Class<?> maxClass = null;
//		Class<?> maxInterface = null;
//		for(Class<?> c : candidates) {
//			TreeNode n = classToNodeMap.get(c);
//			if(!c.isInterface() && n.rank > maxClassRank) {
//				maxClassRank = n.rank;
//				maxClass = n.clazz;
//			} 
////				else if(c.isInterface() && n.rank > maxInterfaceRank) {
////				maxInterfaceRank = n.rank;
////				maxInterface = n.clazz;
////			} 
//		}		
//		return maxClass == Object.class && maxInterface != null ? maxInterface : maxClass;
//	}
//	private Class<?> computeLeastSpecificCommonClass(Class<?> ac, Class<?> bc) {
//		ClassSet candidates = computeCommonClasses(ac, bc);
//		return leastSpecific(candidates);
//	}
//	private Class<?> leastSpecific(ClassSet candidates) {
//		// find the class with the highest rank
//		int minRank = Integer.MAX_VALUE;
//		Class<?> minClass = null;
//		for(Class<?> c : candidates) {
//			TreeNode n = classToNodeMap.get(c);
//			if(n.rank < minRank) {
//				minRank = n.rank;
//				minClass = n.clazz;
//			}
//		}
//		return minClass;
//	}
	private Class<?> computeCommonClass(Class<?> ac, Class<?> bc) {
		// eliminate trivial case of equal class
		if(ac == bc) {
			return ac;
		}
		// also eliminate trivial case of super classes being equal
		if(ac.getSuperclass() == bc.getSuperclass())
			return ac.getSuperclass();
		
		int a = classList.indexOf(ac);
		int b = classList.indexOf(bc);
		List<Class<?>> seq = (a < b) ? classList.subList(a, b) : classList.subList(b, a);
		int minRank = Integer.MAX_VALUE;
		Class<?> minClass = null;
		for(Class<?> c : seq) {
			TreeNode n = classToNodeMap.get(c);
			if(n.rank < minRank) {
				minRank = n.rank;
				minClass = n.clazz;
				}
			}
		return minClass;
		
	}
//	private ClassSet computeCommonClasses(Class<?> ac, Class<?> bc) {
//		// eliminate trivial case of equal class
//		if(ac == bc) {
//			return new ClassSet(ac);
//		}
//		// also eliminate trivial case of super classes being equal
//		if(ac.getSuperclass() == bc.getSuperclass())
//			return new ClassSet(ac.getSuperclass());
//		
//		// for all occurrences of a, find minimum rank to all occurrences of b
//		// and return this set.
//		//
//		int limit = classList.size();
//		int bStart = -1;
//		ClassSet candidates = new ClassSet();
//
//		for(int a = 0; a < limit; a++) {
//			Class<?> e = classList.get(a);
//			// as we are iterating, we can figure out where to start b.
//			if(bStart == -1 && e == bc)
//				bStart = a;
//			if(e != ac)
//				continue;
//			for(int b = (bStart == -1 ? 0 : bStart); b < limit; b++) {
//				e = classList.get(b);
//				if(e != bc)
//					continue;
//				List<Class<?>> seq = null;
//				if(a < b)
//					seq = classList.subList(a+1, b);
//				else
//					seq = classList.subList(b+1, a);
//				int minRank = Integer.MAX_VALUE;
//				Class<?> minClass = null;
//				for(Class<?> c : seq) {
//					TreeNode n = classToNodeMap.get(c);
//					if(n.rank < minRank) {
//						minRank = n.rank;
//						minClass = n.clazz;
//						}
//					}
//				candidates.add(minClass);
//			}
//		}
//		return candidates;
//	}
	
	
	private static class TreeNode {
		Class<?> clazz;
		int rank;
		List<TreeNode> extensions = new ArrayList<TreeNode>();
		TreeNode(Class<?> c) {
			clazz = c; 
			rank = -1; // unranked
		}
//		int getClassRank() {
//			return rank; 
//		}
		void addExtendedBy(TreeNode child) {
			if(extensions.contains(child))
				return;
			extensions.add(child);
			child.rank = rank+1;
		}
//		void addImplements(TreeNode child) {
//			if(extensions.contains(child))
//				return;
//			extensions.add(child);
//			// interfaces sink as they are specialized, classes are fixed in ranking.
//			if(child.clazz.isInterface())
//				child.rank = Math.max(child.rank, rank +1);
//		}
		public String toString() { return "rank="+Integer.toString(rank); }
	}
	private static class ClassSet extends HashSet<Class<?>> {
		private static final long serialVersionUID = 1L;		
		ClassSet() { super(); }
//		ClassSet(Class<?> c) { add(c); }
	}
}
