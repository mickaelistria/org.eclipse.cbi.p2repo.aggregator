package org.eclipse.b3.backend.evaluator;

import java.util.IdentityHashMap;

import org.eclipse.b3.backend.evaluator.b3backend.BCachedExpression;

public class B3ExpressionCache {
	private IdentityHashMap<BCachedExpression, Object> cache = new IdentityHashMap<BCachedExpression, Object>();

	public B3ExpressionCache() {
	}

	public Object get(BCachedExpression expr) {
		return cache.get(expr);
	}

	public boolean isCached(BCachedExpression expr) {
		return cache.containsKey(expr);
	}

	public void put(BCachedExpression expr, Object value) {
		cache.put(expr, value);
	}
}
