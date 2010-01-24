package org.eclipse.b3.backend.core;

import org.eclipse.b3.backend.evaluator.b3backend.BExpression;

public class B3UserException extends B3BackendException {
	private Object data = null;
	private static final long serialVersionUID = 1L;
	public B3UserException(BExpression expr, Object o) {
		super(expr, createStatus(null, "User data exception: " + o.toString(), (Object[])null));
		data = o;
	}
	public Object getData() { return data; }
}
