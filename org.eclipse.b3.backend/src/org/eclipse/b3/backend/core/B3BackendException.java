package org.eclipse.b3.backend.core;
import org.eclipse.b3.provisional.core.BuildException;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;


public class B3BackendException extends BuildException{

	private static final long serialVersionUID = -6421837092231644297L;
	protected B3BackendException(IStatus status) {
		super(status);
	}
	public static CoreException fromMessage(String file, int line, Throwable cause, String message, Object... args)
	{
		CoreException ce = new B3BackendException(createStatus(cause, fileMsg(file, line)+message, args));
		if(cause != null)
			ce.initCause(cause);
		return ce;
	}
	private static String fileMsg(String file, int line)
	{
		return "line: "+String.valueOf(line) + ", " + file + ": ";
	}

}
