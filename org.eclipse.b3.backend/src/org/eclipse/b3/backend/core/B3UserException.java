package org.eclipse.b3.backend.core;

public class B3UserException extends B3EngineException {
	private Object data = null;
	private static final long serialVersionUID = 1L;
	public B3UserException(String file, int line, Object o) {
		super("User exception thrown from file: '"+file + "' ["+ Integer.valueOf(line).toString() +"] "+
				o.toString());
		data = o;
	}
	public Object getData() { return data; }
}
