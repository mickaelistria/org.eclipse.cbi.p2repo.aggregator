package org.eclipse.b3.backend.core;
import org.eclipse.b3.backend.evaluator.b3backend.BExpression;
import org.eclipse.b3.provisional.core.BuildException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;


public class B3BackendException extends BuildException{

	private static final long serialVersionUID = -6421837092231644297L;
	private BExpression expr;
	protected B3BackendException(BExpression expr, IStatus status) {
		super(status);
		this.expr = expr;
	}
	/**
	 * Returns the expression associated with the exception.
	 * @return
	 */
	public BExpression getExpression() {
		return expr;
	}
	/**
	 * Returns the {@link Resource} associated with the expression associated with the error.
	 * @return null if there is no expression, or known resource.
	 */
	public Resource getResource() {
		return expr != null ? expr.eResource() : null;
	}
	/**
	 * Returns a string describing the location where the exception occurred in b3.
	 * May report "unknown source". Does not report line number.
	 * @return
	 */
	public String getLocationString() {
		String location = null;
		Resource r = expr.eResource();
		if(r != null) {
			URI uri = r.getURI();
			if(uri != null) {
				if(uri.isFile())
					location = uri.toFileString();
				else if(uri.isPlatform())
					location = uri.toPlatformString(true);
				else
					location = uri.toString();
			}
		}
		if(location == null || location.length() < 1)
			location = "unknown resource";

		return location;
		
	}
	public static B3BackendException fromMessage(BExpression expr, Throwable cause, String message, Object... args)
	{
		if(args == null)
			args = new Object[0];
		
		B3BackendException ce = new B3BackendException(expr, createStatus(cause, message, args));
		if(cause != null)
			ce.initCause(cause);
		return ce;
	}
	public static B3BackendException fromMessage(BExpression expr, String message, Object... args)
	{
		return fromMessage(expr, null, message, args);
	}
	public static B3BackendException fromMessage(BExpression expr, String message)
	{
		return fromMessage(expr, null, message, new Object[0]);
	}

}
