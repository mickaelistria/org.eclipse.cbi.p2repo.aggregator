package org.eclipse.b3.backend.core;

public class B3EngineException extends Exception {
	private static final long serialVersionUID = 1L;
	B3EngineException(String message) { super(message); }
	B3EngineException(String message, Throwable cause) { super(message, cause); }
}
