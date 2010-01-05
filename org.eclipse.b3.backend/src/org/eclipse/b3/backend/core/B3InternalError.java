package org.eclipse.b3.backend.core;

/**
 * Error describing that some internal error have occured. Normal application should not try to
 * catch this error - it is used to represent an unexpected error.
 */
public class B3InternalError extends Error {
	private static final long serialVersionUID = -3202502776389912375L;
	public B3InternalError(String message) {
		super(message);
	}
	public B3InternalError(String message, Throwable cause) {
		super(message, cause);
	}
}
