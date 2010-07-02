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

import org.eclipse.b3.backend.evaluator.B3BackendLValProvider;
import org.eclipse.b3.backend.evaluator.IB3LvalProvider;
import org.eclipse.b3.backend.inference.ITypeProvider;
import org.eclipse.b3.backend.scoping.IFuncScopeProvider;
import org.eclipse.b3.evaluator.B3BuildFuncScopeProvider;
import org.eclipse.b3.evaluator.B3BuildTypeProvider;
import org.eclipse.b3.formatting.BeeLangFormatter;
import org.eclipse.b3.validation.BeeLangDiagnosticsConverter;
import org.eclipse.b3.validation.BeeLangSyntaxErrorMessageProvider;
import org.eclipse.b3.versions.DefaultVersionFormatManager;
import org.eclipse.b3.versions.IVersionFormatManager;
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
		@Override
		public XtextResourceSet get() {
			SynchronizedXtextResourceSet rs = new SynchronizedXtextResourceSet();
			URI uri = URI.createURI("b3engine:/default");
			rs.getResource(uri, true);
			// rs.getResources().add(r);
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
		binder.bind(IVersionFormatManager.class).to(DefaultVersionFormatManager.class).in(Singleton.class);
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
