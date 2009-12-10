package org.eclipse.b3.backend.core;

public class B3AssertionFailedException extends Exception {
	
	private static final long serialVersionUID = 4928003041323332709L;
	private String message;
	private Object expected;
	private Object actual;

	public B3AssertionFailedException(String message, Object expected, Object actual) {
		super("Assertion failed: '"+ message + "' expected: " + expected.toString() + "actual: " + actual.toString());
		this.message = message;
		this.expected = expected;
		this.actual = actual;
	}
	public B3AssertionFailedException(Object expected, Object actual) {
		super("Assertion failed - expected: " + expected.toString() + "actual: " + actual.toString());
		this.message = "";
		this.expected = expected;
		this.actual = actual;
	}
	public String getUserMessage() {
		return message;
	}
	public Object getExpected() {
		return expected;
	}
	public Object getActual() {
		return actual;
	}
	
}
