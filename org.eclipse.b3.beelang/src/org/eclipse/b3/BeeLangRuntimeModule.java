/************************************************************************
 * Copyright (c) 2009, Cloudsmith Inc and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * - Cloudsmith Inc - initial API and implementation.
 * 
 *************************************************************************/

package org.eclipse.b3;

import java.io.PrintStream;

import org.eclipse.b3.backend.core.B3BackendConstants;
import org.eclipse.b3.backend.core.B3BackendStringProvider;
import org.eclipse.b3.backend.core.B3Debug;
import org.eclipse.b3.backend.core.IB3LvalProvider;
import org.eclipse.b3.backend.core.IStringProvider;
import org.eclipse.b3.backend.evaluator.B3BackendLValProvider;
import org.eclipse.b3.backend.inference.FunctionUtils;
import org.eclipse.b3.backend.inference.ITypeProvider;
import org.eclipse.b3.backend.scoping.IFuncScopeProvider;
import org.eclipse.b3.build.core.IVersionFormatManager;
import org.eclipse.b3.build.engine.B3BuildEngineResource;
import org.eclipse.b3.build.evaluator.B3BuildFuncScopeProvider;
import org.eclipse.b3.build.evaluator.B3BuildTypeProvider;
import org.eclipse.b3.formatting.BeeLangFormatter;
import org.eclipse.b3.validation.BeeLangDiagnosticsConverter;
import org.eclipse.b3.validation.BeeLangSyntaxErrorMessageProvider;
import org.eclipse.b3.versions.BeeLangVersionFormatManager;
import org.eclipse.emf.common.util.URI;
import org.eclipse.xtext.conversion.IValueConverterService;
import org.eclipse.xtext.formatting.IFormatter;
import org.eclipse.xtext.parser.antlr.ISyntaxErrorMessageProvider;
import org.eclipse.xtext.resource.SynchronizedXtextResourceSet;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.validation.IDiagnosticConverter;

import com.google.inject.Binder;
import com.google.inject.Provider;
import com.google.inject.Singleton;
import com.google.inject.name.Names;

/**
 * Use this class to register components to be used within the IDE.
 */
public class BeeLangRuntimeModule extends org.eclipse.b3.AbstractBeeLangRuntimeModule {
	/**
	 * Override the binding of the XtextResourceSetProvider with an implementation
	 * that adds the "b3engine:/" resource
	 * 
	 */
	public static class XtextResourceSetProvider implements Provider<XtextResourceSet> {
		public XtextResourceSet get() {
			SynchronizedXtextResourceSet rs = new SynchronizedXtextResourceSet();
			URI uri = URI.createURI("b3engine:/default");
			rs.getResource(uri, true);
			return rs;
		}
	}

	public Class<? extends IB3LvalProvider> bindIB3LValProvider() {
		// Note: Currently no LValues in the build package, and hence no provider
		return B3BackendLValProvider.class;
	}

	public Class<? extends IDiagnosticConverter> bindIDiagnosticConverter() {
		return BeeLangDiagnosticsConverter.class;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.b3.AbstractBeeLangRuntimeModule#bindIFormatter()
	 */
	@Override
	public Class<? extends IFormatter> bindIFormatter() {
		return BeeLangFormatter.class;
	}

	public Class<? extends IFuncScopeProvider> bindIFuncScopeProvider() {
		// TODO: probably need different bindings for filtered and unfiltered
		return B3BuildFuncScopeProvider.Unfiltered.class;
	}

	public Class<? extends IStringProvider> bindIStringProvider() {
		return B3BackendStringProvider.class;
	}

	public Class<? extends ISyntaxErrorMessageProvider> bindISyntaxErrorMessageProvider() {
		return BeeLangSyntaxErrorMessageProvider.class;
	}

	// add transient value serialization service to enable skipping values that are transient from
	// a grammar perspective
	@Override
	public Class<? extends org.eclipse.xtext.parsetree.reconstr.ITransientValueService> bindITransientValueService() {
		return BeeLangGrammarSerialization.class;
	}

	public Class<? extends ITypeProvider> bindITypeProvider() {
		return B3BuildTypeProvider.class;
	}

	@Override
	public Class<? extends IValueConverterService> bindIValueConverterService() {
		return BeeLangTerminalConverters.class;
	}

	@Override
	public Class<? extends XtextResourceSet> bindXtextResourceSet() {
		return null; // return SynchronizedXtextResourceSet.class;
	}

	@Override
	public void configure(Binder binder) {
		super.configure(binder);
		// don't know how to do this using Xtext declarative approach...
		binder.bind(IVersionFormatManager.class).to(BeeLangVersionFormatManager.class).in(Singleton.class);
		// binder.bind(ITypeProvider.class).to(B3BuildTypeProvider.class);
		// binder.bind(IFuncScopeProvider.class).to(B3BuildFuncScopeProvider.Unfiltered.class);

		// Needs access to injector from a static context
		binder.requestStaticInjection(FunctionUtils.class);
		binder.requestStaticInjection(B3BuildEngineResource.class);
		binder.requestStaticInjection(B3Debug.class);
		binder.bind(PrintStream.class).annotatedWith(Names.named(B3BackendConstants.B3_STREAM_OUTPUT)).toInstance(
			System.out);

	}

	public Class<? extends Provider<XtextResourceSet>> provideXtextResourceSet() {
		return XtextResourceSetProvider.class;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.b3.AbstractBeeLangRuntimeModule#configure(com.google.inject.Binder)
	 */
}
