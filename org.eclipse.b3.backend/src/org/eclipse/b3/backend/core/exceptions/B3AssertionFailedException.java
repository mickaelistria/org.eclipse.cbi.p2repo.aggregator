package org.eclipse.b3.backend.core.exceptions;

public class B3AssertionFailedException extends Exception {

	private static final long serialVersionUID = 4928003041323332709L;

	private String message;

	private Object expected;

	private Object actual;

	public B3AssertionFailedException(Object expected, Object actual) {
		super("Assertion failed - expected: " + (expected == null
				? "null"
				: expected.toString()) + " actual: " + (actual == null
				? "null"
				: actual.toString()));
		this.message = "";
		this.expected = expected;
		this.actual = actual;
	}

	public B3AssertionFailedException(String message, Object expected, Object actual) {
		super("Assertion failed: '" + message + "' expected: " + (expected == null
				? "null"
				: expected.toString()) + " actual: " + (actual == null
				? "null"
				: actual.toString()));
		this.message = message;
		this.expected = expected;
		this.actual = actual;
	}

	public Object getActual() {
		return actual;
	}

	public Object getExpected() {
		return expected;
	}

	public String getUserMessage() {
		return message;
	}

}
