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

import org.eclipse.b3.validation.BeeLangDiagnosticsConverter;
import org.eclipse.b3.validation.BeeLangSyntaxErrorMessageProvider;
import org.eclipse.xtext.conversion.IValueConverterService;
import org.eclipse.xtext.parser.antlr.ISyntaxErrorMessageProvider;
import org.eclipse.xtext.validation.IDiagnosticConverter;

/**
 * Use this class to register components to be used within the IDE.
 */
public class BeeLangRuntimeModule extends org.eclipse.b3.AbstractBeeLangRuntimeModule {

	public Class<? extends IDiagnosticConverter> bindIDiagnosticConverter() {
		return BeeLangDiagnosticsConverter.class;
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

	@Override
	public Class<? extends IValueConverterService> bindIValueConverterService() {
		return BeeLangTerminalConverters.class;
	}
}
