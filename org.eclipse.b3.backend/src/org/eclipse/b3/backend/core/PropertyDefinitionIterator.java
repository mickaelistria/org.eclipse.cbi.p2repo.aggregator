package org.eclipse.b3.backend.core;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.eclipse.b3.backend.evaluator.b3backend.BConditionalPropertyOperation;
import org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext;
import org.eclipse.b3.backend.evaluator.b3backend.BExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BPropertyDefinitionOperation;
import org.eclipse.b3.backend.evaluator.b3backend.BPropertyOperation;
import org.eclipse.b3.backend.evaluator.b3backend.BPropertySet;
import org.eclipse.b3.backend.evaluator.b3backend.BPropertySetOperation;

/**
 * Iterates over the (complex) structure of property sets.
 * Sets are visited in super-most order.
 * When a nested set is detected, it is visited in depth first order.
 * When a conditional set is detected, it is visited in depth first order.
 * 
 * The end result is an iteration over all property definitions in the order they should be
 * defined.
 * 
 * Remove operation is supported. Remove can be called immediately after a next() (without any intervening call to
 * hasNext) to remove the just returned instance.
 */
public class PropertyDefinitionIterator implements Iterator<BPropertyDefinitionOperation> {
	protected BPropertyDefinitionOperation theNext;
	protected List<PropertyOperationIterator> itorStack;
	private Set<BPropertySet> visitedSets;
	
	public PropertyDefinitionIterator(BPropertySet set) {
		itorStack = new ArrayList<PropertyOperationIterator>();
		visitedSets = new HashSet<BPropertySet>();
		push(new PropertyOperationIterator(set));
		findNext();
	}

	public boolean hasNext() {
		if(theNext == null)
			findNext();
		return theNext != null;
	}

	public BPropertyDefinitionOperation next() {
		BPropertyDefinitionOperation result = theNext;
		theNext = null;
		return result;
	}

	public void remove() {
		peek().remove();		
	}
	
	private void findNext() {
		theNext = null;
		while(itorStack != null && !itorStack.isEmpty() && theNext == null) {
			while(peek().hasNext() && theNext == null)
				opSwitch(peek().next());
			if(theNext == null)
				pop();
		}
	}
	/**
	 * recurse on conditional, and push iterator if op is a property set, else set theNext
	 */
	protected void opSwitch(BPropertyOperation op) {
		if(op instanceof BConditionalPropertyOperation)
			conditionalOp((BConditionalPropertyOperation)op);
		else if(op instanceof BPropertySetOperation)
			push( new PropertyOperationIterator(((BPropertySetOperation)op).getPropertySet(), visitedSets));
		else if(op instanceof BPropertyDefinitionOperation)
			theNext = (BPropertyDefinitionOperation)op;
		else
			throw new IllegalArgumentException("Unknown BPropertyOperation subclass: "+ op.getClass().getName().toString());
	}
	protected void conditionalOp(BConditionalPropertyOperation op) {
		opSwitch(op.getBody());
	}
	private void push(PropertyOperationIterator itor) {
		itorStack.add(itor);
	}
	private void pop() {
		if(itorStack == null)
			return; // special "error case"
		int size = itorStack.size();
		if(size == 0)
			throw new IllegalStateException("Stack underflow");
		
		itorStack.remove(itorStack.size()-1);
		return;
	}
	private PropertyOperationIterator peek() {
		return itorStack.get(itorStack.size()-1);
	}
	/**
	 * Variant of the iterator that returns a filtered sequence of operations.
	 */
	public static class Effective extends PropertyDefinitionIterator {
		
		BExecutionContext evalCtx;
		Throwable lastError;
		public Effective(BPropertySet propertySet, BExecutionContext ctx) {
			super(propertySet);
			evalCtx = ctx;
			lastError = null;
		}
		protected void conditionalOp(BConditionalPropertyOperation op) {
			try {
				BExpression condExpr = op.getCondExpr();
				Object result = null;
				if(condExpr != null) {
					result = condExpr.evaluate(evalCtx);
				if(result != null && result instanceof Boolean && !((Boolean)result).booleanValue())
					return;
				opSwitch(op.getBody());
				}
			} catch (Throwable e) {
				lastError = e;
				itorStack = null; // signal that iteration stops immediately
			}
		}
		/**
		 * Returns the last error (or null if hasNext() returned successfully).
		 * @return
		 */
		public Throwable getLastError() {
			return lastError;
		}
	}
}
