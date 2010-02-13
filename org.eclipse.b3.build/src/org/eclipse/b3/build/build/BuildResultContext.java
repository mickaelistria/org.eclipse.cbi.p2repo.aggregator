/**
 * Copyright (c) 2009, Cloudsmith Inc and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 * - Cloudsmith Inc - initial API and implementation.
 * 
 */
package org.eclipse.b3.build.build;

import org.eclipse.b3.backend.evaluator.b3backend.BInnerContext;
import org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Build Result Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This specialization of BExecutionContext is used to evaluate properties and default properties against its ValueMap, but in contrast to the regular BExecutionContext, the check for existience of already set properties is limited to this specific context (i.e. no check in parent contexts is performed). 
 * The intended use is to collect a set of property values that are used in BuildResult (i.e. named values that are not set as regular properties).
 * <!-- end-model-doc -->
 *
 *
 * @see org.eclipse.b3.build.build.B3BuildPackage#getBuildResultContext()
 * @model
 * @generated
 */
public interface BuildResultContext extends BInnerContext {
} // BuildResultContext
