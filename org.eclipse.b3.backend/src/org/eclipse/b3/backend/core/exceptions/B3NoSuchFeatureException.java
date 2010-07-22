package org.eclipse.b3.backend.core.exceptions;

public class B3NoSuchFeatureException extends B3EngineException {

	private static final long serialVersionUID = 1L;

	public B3NoSuchFeatureException(String key) {
		super("Feature not found: " + key);
	}

	public B3NoSuchFeatureException(String key, Throwable cause) {
		super("Feature not found: " + key, cause);
	}
}
