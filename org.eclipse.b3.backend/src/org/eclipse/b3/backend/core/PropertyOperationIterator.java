package org.eclipse.b3.backend.core;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.eclipse.b3.backend.evaluator.b3backend.BPropertyOperation;
import org.eclipse.b3.backend.evaluator.b3backend.BPropertySet;

import com.google.common.base.Predicate;
import com.google.common.collect.Iterators;

/**
 * Iterates over a PropertySet in super-most order and returns BProperyOperation instances.
 * Note that these instances in turn have a complex structure. If you want each PropertyDefinition in
 * the order they should be evaluated - see {@link PropertyDefinitionIterator}.
 * 
 */
public class PropertyOperationIterator implements Iterator<BPropertyOperation> {
	SerialIterator<BPropertyOperation> itor;

	private Set<BPropertySet> visitedSets;

	private BPropertyOperation[] excludedOperations;

	public PropertyOperationIterator(BPropertySet propertySet, BPropertyOperation... excludedOps) {
		visitedSets = new HashSet<BPropertySet>();
		itor = new SerialIterator<BPropertyOperation>();
		excludedOperations = excludedOps;
		addAllSets(propertySet);
	}

	public PropertyOperationIterator(BPropertySet propertySet, Set<BPropertySet> visitedSets,
			BPropertyOperation... excludedOps) {
		this.visitedSets = visitedSets;
		itor = new SerialIterator<BPropertyOperation>();
		excludedOperations = excludedOps;
		addAllSets(propertySet);
	}

	private void addAllSets(BPropertySet set) {
		if(set == null)
			return;
		if(visitedSets.contains(set))
			throw new IllegalArgumentException("Recursive Property Set Definition - set already visited: " +
					set.getName());
		visitedSets.add(set);
		addAllSets(set.getExtends());
		itor.addIterator(Iterators.filter(set.getOperations().iterator(), new Predicate<BPropertyOperation>() {

			@Override
			public boolean apply(BPropertyOperation input) {
				if(excludedOperations != null)
					for(int i = 0; i < excludedOperations.length; i++) {
						if(excludedOperations[i] == input)
							return false;
					}
				return true;
			}
		}));
		//
		// itor.addIterator(set.getOperations().iterator());
	}

	public boolean hasNext() {
		return itor.hasNext();
	}

	public BPropertyOperation next() {
		return itor.next();
	}

	public void remove() {
		// looks like endless recursion, but will eventually hit a the list iterator from set.getOperation().iterator()
		itor.remove();
	}

}
