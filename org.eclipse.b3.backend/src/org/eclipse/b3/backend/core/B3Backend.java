package org.eclipse.b3.backend.core;
import java.lang.annotation.*; 

@Retention(RetentionPolicy.RUNTIME)
public @interface B3Backend {
	/**
	 * Used to declare a parameter name. 
	 */
	String name() default "";
	
	/**
	 * Declares function names that this function should be registered under.
	 */
	String[] funcNames() default {};
	
	/** 
	* If true, the original name of the function is not used. Requires that at least one alias is used.
	*/
	boolean hideOriginal() default false;
	
	/**
	* Marks the function as sequential.
	*/
	boolean sequential() default false;
	   
	/**
	 * Marks the function as private (i.e. as a private method of the first parameter type).
	 */
	boolean isPrivate() default false;
	
	/**
	* The optional name of a guard function defined in the same class. By default, functions are unguarded.
	*/
	String guardFunction() default "";
	
	/**
	* Marks the static method as a guard function. The method must have a signature of Object[].
	* It may be used as a declared guardFunction of some other function.
	*/
	boolean guard() default false;
	
	/**
	 * The optional name of a system function that will be the target of the call instead of
	 * the function. The function is only used as a parameter declaration.
	 * @return
	 */
	String systemFunction() default "";
	
	/**
	 * Marks the static function as a system function. The method must have a signature of
	 * BExecutionContext, Object[] params, Type[] types. This method is only loaded if some other
	 * function references it by name via the tag systemFunction.
	 */
	boolean system() default false;
	
	/**
	 * Declares that the last parameter is a varargs array.
	 * @return
	 */
	boolean varargs() default false;
	
	/**
	 * Declares the minimum number of variable arguments that must be passed.
	 * @return
	 */
	int minVarargs() default 0;
}
