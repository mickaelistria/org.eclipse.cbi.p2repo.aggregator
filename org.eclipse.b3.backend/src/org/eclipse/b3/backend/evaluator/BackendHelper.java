package org.eclipse.b3.backend.evaluator;

import org.eclipse.b3.backend.core.B3Backend;
import org.eclipse.b3.backend.core.B3BackendException;
import org.eclipse.b3.backend.evaluator.b3backend.BExpression;
import org.eclipse.b3.backend.evaluator.b3backend.ExecutionMode;
import org.eclipse.b3.backend.evaluator.b3backend.Visibility;
import org.eclipse.core.runtime.CoreException;

public class BackendHelper {

	public static int intValue(Object exprValue, BExpression expr) throws CoreException
	{
		if(exprValue instanceof Number)
			return ((Number)exprValue).intValue();
		throw B3BackendException.fromMessage(expr, "Expression is not an number");
	}
	public static CoreException createException(BExpression expr, String message) {
		return createException(expr, message, (Object[])null);
	}
	public static CoreException createException(BExpression expr, String message, Object[] args)
	{
		return createException(expr, null, message, args);
	}
	public static CoreException createException(BExpression expr, Throwable t, String message)
	{
		return createException(expr, t, message, null);
	}
	public static CoreException createException(BExpression expr, Throwable t, String message, Object[] args)
	{
		return B3BackendException.fromMessage(expr, t, message, args);
		
	}
	/**
	 * TODO - could benefit from caching
	 * @param featureName
	 * @return
	 */
	public static String getGetter(String featureName) {
		return "get"+featureName.substring(0,1).toUpperCase() + featureName.substring(1);
	}
	public static String getSetter(String featureName) {
		return "set"+featureName.substring(0,1).toUpperCase() + featureName.substring(1);
	}
	/**
	 * TODO: could benefit from caching
	 * @param featureName
	 * @return
	 */
	public static String getIsGetter(String featureName) {
		return "is"+featureName.substring(0,1).toUpperCase() + featureName.substring(1);
	}
	
	public static Visibility getVisibility(B3Backend annotation) {
		return annotation.isPrivate() ?
			Visibility.PRIVATE : Visibility.PUBLIC ;
	}
	public static ExecutionMode getExecutionMode(B3Backend annotation) {
		return annotation.sequential() ? ExecutionMode.SEQUENTIAL : ExecutionMode.PARALLEL;
	}	

}
 