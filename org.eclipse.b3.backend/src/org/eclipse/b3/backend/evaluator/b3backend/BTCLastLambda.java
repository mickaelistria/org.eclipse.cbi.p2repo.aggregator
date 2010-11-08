/**
 * Copyright (c) 2010, Cloudsmith Inc and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 * - Cloudsmith Inc - initial API and implementation.
 * 
 */
package org.eclipse.b3.backend.evaluator.b3backend;

/**
 * <!-- begin-user-doc -->
 * A type calculator for
 * (?<T>, args, λ( λ-args)=>List<T>)=>List<T>
 * whew args is 0 or more arguments, and where no args and an explicit Any ('_' in b3 syntax) is replaced by T
 * e.g.
 * (?<T>, λ(T)=>List<T>)=>List<T>
 * (?<T>, _, λ(T)=>List<T>)=>List<T>
 * (?<T>, 1, _, λ(Integer, T)=>List<T>)=>List<T>
 * (?<T>, _, 1, λ(T, Integer)=>List<T>)=>List<T>
 * 
 * @see org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage#getBTCLastLambda()
 * @model
 * @generated
 */
public interface BTCLastLambda extends BTypeCalculator {
} // BTCLastLambda
