package org.eclipse.b3.backend.core;
import java.lang.annotation.*; 

@Retention(RetentionPolicy.RUNTIME)
public @interface B3Backend {
	/**
	 * Used to declare a parameter name. These may be picked up by the UI to provide better information
	 * to the user about the parameters than just a ordinal number and type.
	 */
	String name() default "";
	
	/**
	 * Declares function names that this function should be registered under in addition to its original
	 * name (as declared in Java). The original name can be surpressed by using {@link #hideOriginal}.
	 */
	String[] funcNames() default {};
	
	/** 
	* If true, the original name of the function is not used. Requires that at least one alias is declared
	* using {@link #funcNames()}.
	*/
	boolean hideOriginal() default false;
	
	/**
	* Marks the function as sequential. This is relevant when there is the need to serialize execution
	* across otherwise disjunct functions.
	*/
	boolean sequential() default false;
	   
	/**
	 * Marks the function as private (the semantics of 'private' depends on context).
	 */
	boolean isPrivate() default false;
	
	/**
	* The optional name of a guard function defined in the same class. By default, functions are unguarded.
	* A guard function can return false to signal that this function should not be picked by the 
	* polymorphic function picker.
	*/
	String guardFunction() default "";
	
	/**
	* Marks the static method as a guard function. The method must have the same signature as a system
	* function. See {@link #system()}. Note that {@link #guard} and {@link #system} are mutually exclusive.
	* The guard is not available unless some other function references it using {@link #guardFunction()}.
	* 
	* Note to implementor of guard function: The Object parameter[] may contain null values for all parameters
	* when the guard is called during type inference. TODO: This is a really bad signal to the guard.
	* TODO: TYPESYSTEM IMPROVEMENT
	*/
	boolean guard() default false;
	
	/**
	 * The optional name of a system function (a function annotated using {@link #system} that will be 
	 * the target of the call instead of the function. The function is only used as a parameter declaration.
	 */
	String systemFunction() default "";
	
	/**
	 * Marks the static function as a system function. The method must have a signature of
	 * BExecutionContext, Object[] params, Type[] types. This method is only loaded if some other
	 * function references it by name via the tag systemFunction. 
	 * Note that {@link #guard} and {@link #system} are mutually exclusive.
	 */
	boolean system() default false;
	
	/**
	 * Declares that the last parameter is a varargs array.
	 */
	boolean varargs() default false;
	
	/**
	 * Declares the minimum number of variable arguments that must be passed.
	 */
	int minVarargs() default 0;
}
