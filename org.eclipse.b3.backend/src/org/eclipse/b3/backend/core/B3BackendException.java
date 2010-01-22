package org.eclipse.b3.backend.core;
import org.eclipse.b3.backend.evaluator.b3backend.BExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BFileReference;
import org.eclipse.b3.provisional.core.BuildException;
import org.eclipse.core.runtime.IStatus;


public class B3BackendException extends BuildException{

	private static final long serialVersionUID = -6421837092231644297L;
	protected B3BackendException(IStatus status) {
		super(status);
	}
	public static B3BackendException fromMessage(String file, int line, Throwable cause, String message, Object... args)
	{
		B3BackendException ce = new B3BackendException(createStatus(cause, fileMsg(file, line)+message, args));
		if(cause != null)
			ce.initCause(cause);
		return ce;
	}
	public static B3BackendException fromMessage(BExpression expr, Throwable cause, String message, Object... args)
	{
		B3BackendException ce = new B3BackendException(createStatus(cause, 
				fileMsg(expr.getFileReference().getFileName(), expr.getLineNumber())
				+ message, args));
		if(cause != null)
			ce.initCause(cause);
		return ce;
	}
	public static B3BackendException fromMessage(BExpression expr, String message, Object... args)
	{
		B3BackendException ce = new B3BackendException(createStatus(null, 
				fileMsg(expr.getFileReference().getFileName(), expr.getLineNumber())
				+ message, args));
		return ce;
	}
	private static String fileMsg(String file, int line)
	{
		return "line: "+String.valueOf(line) + ", " + file + ": ";
	}

}
