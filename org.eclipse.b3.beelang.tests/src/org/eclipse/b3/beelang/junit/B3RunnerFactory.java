/*******************************************************************************
 * Copyright (c) 2006-2007, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 ******************************************************************************/

package org.eclipse.b3.beelang.junit;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.b3.BeeLangRuntimeModule;
import org.eclipse.b3.backend.core.B3Engine;
import org.eclipse.b3.backend.core.B3EngineException;
import org.eclipse.b3.backend.evaluator.b3backend.B3JavaImport;
import org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext;
import org.eclipse.b3.backend.evaluator.b3backend.BFunction;
import org.eclipse.b3.backend.evaluator.typesystem.TypeUtils;
import org.eclipse.b3.beeLang.BeeModel;
import org.eclipse.b3.beelang.junit.B3TestRunner.B3Files;
import org.eclipse.b3.beelang.tests.Activator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.xtext.resource.IResourceFactory;
import org.eclipse.xtext.resource.XtextResource;
import org.junit.runner.Description;
import org.junit.runner.Runner;
import org.junit.runner.notification.Failure;
import org.junit.runner.notification.RunNotifier;
import org.junit.runners.ParentRunner;

import com.google.inject.Guice;
import com.google.inject.Injector;

/**
 * <p>
 * A factory class for building JUnit 4 runners capable of executing B3 language functions from the specified B3 file as
 * JUnit tests. The runners built by this factory execute all functions from specified B3 file which names start with
 * the prefix of "test".
 * </p>
 * 
 * @author michal.ruzicka@cloudsmith.com
 */
class B3RunnerFactory {

	public static final String TEST_FUNCTION_PREFIX = "test";

	protected static final Object[] EMPTY_PARAMETER_ARRAY = new Object[] {};

	protected static final Type[] EMPTY_TYPE_ARRAY = new Type[] {};

	protected class B3FileRunner extends ParentRunner<B3FileRunner.B3FunctionDescriptor> {

		protected class B3FunctionDescriptor {

			protected BFunction testFunction;

			protected Description testFunctionDescription;

			public B3FunctionDescriptor(BFunction function) {
				testFunction = function;
				testFunctionDescription = Description.createTestDescription(definitionClass, testFunction.getName());
			}

			public BFunction getFunction() {
				return testFunction;
			}

			public Description getDescription() {
				return testFunctionDescription;
			}

		}

		protected String testB3File;

		protected ArrayList<B3FunctionDescriptor> functionDescriptors;

		protected B3Engine engine;

		public B3FileRunner(String b3File) throws Exception {
			super(definitionClass);

			XtextResource resource = (XtextResource) beeLangResourceFactory.createResource(URI.createPlatformPluginURI(
					Activator.PLUGIN_ID + '/' + b3File, true));

			try {
				resource.load(null);
			} catch(IOException e) {
				throw new Exception("Failed to load B3 file: " + b3File, e);
			}
			// TODO: consult resource.getErrors() and report possible errors

			testB3File = b3File;

			BeeModel beeModel = (BeeModel) resource.getParseResult().getRootASTElement();
			BExecutionContext context = (engine = new B3Engine()).getContext();

			try {
				// Define all imports as constants
				for(Type type : beeModel.getImports()) {
					if(type instanceof B3JavaImport) {
						Class<?> klass = TypeUtils.getRaw(type);
						context.defineValue(((B3JavaImport) type).getName(), klass, klass);
					}
				}

				functionDescriptors = new ArrayList<B3FunctionDescriptor>();

				// Define all functions and create descriptors of test functions
				for(BFunction function : beeModel.getFunctions()) {
					context.defineFunction(function);

					String functionName = function.getName();

					if(functionName.length() > TEST_FUNCTION_PREFIX.length()
							&& functionName.startsWith(TEST_FUNCTION_PREFIX)
							&& function.getParameterTypes().length == 0)
						functionDescriptors.add(new B3FunctionDescriptor(function));
				}
			} catch(B3EngineException e) {
				throw new Exception("Failed to initialize B3Engine in preparation for testing of: " + b3File, e);
			}
		}

		@Override
		protected String getName() {
			return testB3File;
		}

		@Override
		protected Description describeChild(B3FunctionDescriptor child) {
			return child.getDescription();
		}

		@Override
		protected void runChild(B3FunctionDescriptor child, RunNotifier notifier) {
			Description childDescription = child.getDescription();
			String childFunctionName = child.getFunction().getName();

			notifier.fireTestStarted(childDescription);
			try {
				try {
					engine.getContext().callFunction(childFunctionName, EMPTY_PARAMETER_ARRAY, EMPTY_TYPE_ARRAY);
				} catch(Throwable t) {
					throw new RuntimeException("An exception was thrown during execution of: " + childFunctionName, t);
				}
			} catch(Throwable e) {
				notifier.fireTestFailure(new Failure(childDescription, e));
			} finally {
				notifier.fireTestFinished(childDescription);
			}
		}

		@Override
		protected List<B3FunctionDescriptor> getChildren() {
			return functionDescriptors;
		}

	}

	protected IResourceFactory beeLangResourceFactory;

	protected final Class<?> definitionClass;

	protected List<Runner> b3FileRunners;

	{
		Injector beeLangInjector = Guice.createInjector(new BeeLangRuntimeModule());

		beeLangResourceFactory = beeLangInjector.getInstance(IResourceFactory.class);
	}

	public B3RunnerFactory(Class<?> klass) throws Throwable {
		definitionClass = klass;

		Annotation[] testClassAnnotations = klass.getAnnotations();

		for(Annotation annotation : testClassAnnotations) {
			if(annotation instanceof B3Files) {
				createB3FileRunners(((B3Files) annotation).value());
				return;
			}
		}

		throw new Exception("No B3Files specified for class " + klass.getName());
	}

	protected void createB3FileRunners(String[] b3Files) throws Throwable {
		ArrayList<Runner> runners = new ArrayList<Runner>(b3Files.length);

		for(String b3File : b3Files) {
			runners.add(new B3FileRunner(b3File));
		}

		b3FileRunners = runners;
	}

	public List<Runner> getB3FileRunners() {
		return b3FileRunners;
	}

}
