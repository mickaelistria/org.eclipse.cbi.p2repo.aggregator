package org.eclipse.b3.backend.core;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import org.eclipse.b3.backend.evaluator.b3backend.BTypeCalculator;

/**
 * Annotations for functions loaded by the b3 function loader.
 * 
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface B3Backend {
	/**
	 * Declares function names that this function should be registered under in addition to its original
	 * name (as declared in Java). The original name can be surpressed by using {@link #hideOriginal}.
	 */
	String[] funcNames() default {};

	/**
	 * Marks the static method as a guard function. The method must have the same signature as a system
	 * function. See {@link #system()}. Note that {@link #guard}, {@link #system} and {@link #typeCalculator()} are
	 * mutually exclusive.
	 * The guard is not available unless some other function references it using {@link #guardFunction()}.
	 * 
	 * Note to implementor of guard function: The Object parameter[] may contain null values for all parameters
	 * when the guard is called during type inference. TODO: This is a really bad signal to the guard.
	 * TODO: TYPESYSTEM IMPROVEMENT
	 */
	boolean guard() default false;

	/**
	 * The optional name of a guard function defined in the same class. By default, functions are unguarded.
	 * A guard function can return false to signal that this function should not be picked by the
	 * polymorphic function picker.
	 */
	String guardFunction() default "";

	/**
	 * If true, the original name of the function is not used. Requires that at least one alias is declared
	 * using {@link #funcNames()}.
	 */
	boolean hideOriginal() default false;

	/**
	 * Marks the function as private (the semantics of 'private' depends on context).
	 */
	boolean isPrivate() default false;

	/**
	 * Declares the minimum number of variable arguments that must be passed.
	 */
	int minVarargs() default 0;

	/**
	 * Used to declare a parameter name. These may be picked up by the UI to provide better information
	 * to the user about the parameters than just a ordinal number and type.
	 */
	String name() default "";

	/**
	 * Marks the function as sequential. This is relevant when there is the need to serialize execution
	 * across otherwise disjunct functions.
	 */
	boolean sequential() default false;

	/**
	 * Marks the static function as a system function. The method must have a signature of
	 * BExecutionContext, Object[] params, Type[] types. This method is only loaded if some other
	 * function references it by name via the tag systemFunction.
	 * Note that {@link #guard}, {@link #system} and {@link #typeCalculator()} are mutually exclusive.
	 */
	boolean system() default false;

	/**
	 * The optional name of a system function (a function annotated using {@link #system} that will be
	 * the target of the call instead of the function. The function is only used as a parameter declaration.
	 */
	String systemFunction() default "";

	/**
	 * Marks the static method as a type calculator function. The method must have the same signature as a system
	 * function. See {@link #system()}. Note that {@link #guard}, {@link #system} and {@link #typeCalculator()} are
	 * mutually exclusive.
	 * The typeCalculator is not used unless some other function references it using {@link #typeFunction()}.
	 * 
	 * TODO: TYPESYSTEM IMPROVEMENT
	 */
	boolean typeCalculator() default false;

	Class<? extends BTypeCalculator> typeClass() default (BTypeCalculator.class);

	/**
	 * The optional name of a typeCalculator function (a function annotated using {@link #typeCalculator()} that will be
	 * used to calculate the return type of a function based on the parameter types.
	 */
	String typeFunction() default "";

	/**
	 * Declares that the last parameter is a varargs array.
	 */
	boolean varargs() default false;
}
