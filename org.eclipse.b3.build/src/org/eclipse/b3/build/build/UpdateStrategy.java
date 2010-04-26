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
package org.eclipse.b3.build.build;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Update Strategy</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * 
 * @see org.eclipse.b3.build.build.B3BuildPackage#getUpdateStrategy()
 * @model
 * @generated
 */
public enum UpdateStrategy implements Enumerator {
	/**
	 * The '<em><b>Branch Point Default</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #BRANCH_POINT_DEFAULT_VALUE
	 * @generated
	 * @ordered
	 */
	BRANCH_POINT_DEFAULT(0, "BranchPointDefault", "BranchPointDefault"),

	/**
	 * The '<em><b>No Update</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #NO_UPDATE_VALUE
	 * @generated
	 * @ordered
	 */
	NO_UPDATE(1, "NoUpdate", "NoUpdate"),

	/**
	 * The '<em><b>Merge</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #MERGE_VALUE
	 * @generated
	 * @ordered
	 */
	MERGE(2, "Merge", "Merge"),

	/**
	 * The '<em><b>Keep Modified</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #KEEP_MODIFIED_VALUE
	 * @generated
	 * @ordered
	 */
	KEEP_MODIFIED(3, "KeepModified", "KeepModified"),

	/**
	 * The '<em><b>Replace Modified</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #REPLACE_MODIFIED_VALUE
	 * @generated
	 * @ordered
	 */
	REPLACE_MODIFIED(4, "ReplaceModified", "ReplaceModified"),

	/**
	 * The '<em><b>Fail Modified</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #FAIL_MODIFIED_VALUE
	 * @generated
	 * @ordered
	 */
	FAIL_MODIFIED(5, "FailModified", "FailModified");

	/**
	 * The '<em><b>Branch Point Default</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Branch Point Default</b></em>' literal object isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @see #BRANCH_POINT_DEFAULT
	 * @model name="BranchPointDefault"
	 * @generated
	 * @ordered
	 */
	public static final int BRANCH_POINT_DEFAULT_VALUE = 0;

	/**
	 * The '<em><b>No Update</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>No Update</b></em>' literal object isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @see #NO_UPDATE
	 * @model name="NoUpdate"
	 * @generated
	 * @ordered
	 */
	public static final int NO_UPDATE_VALUE = 1;

	/**
	 * The '<em><b>Merge</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Merge</b></em>' literal object isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @see #MERGE
	 * @model name="Merge"
	 * @generated
	 * @ordered
	 */
	public static final int MERGE_VALUE = 2;

	/**
	 * The '<em><b>Keep Modified</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Keep Modified</b></em>' literal object isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @see #KEEP_MODIFIED
	 * @model name="KeepModified"
	 * @generated
	 * @ordered
	 */
	public static final int KEEP_MODIFIED_VALUE = 3;

	/**
	 * The '<em><b>Replace Modified</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Replace Modified</b></em>' literal object isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @see #REPLACE_MODIFIED
	 * @model name="ReplaceModified"
	 * @generated
	 * @ordered
	 */
	public static final int REPLACE_MODIFIED_VALUE = 4;

	/**
	 * The '<em><b>Fail Modified</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Fail Modified</b></em>' literal object isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @see #FAIL_MODIFIED
	 * @model name="FailModified"
	 * @generated
	 * @ordered
	 */
	public static final int FAIL_MODIFIED_VALUE = 5;

	/**
	 * An array of all the '<em><b>Update Strategy</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private static final UpdateStrategy[] VALUES_ARRAY = new UpdateStrategy[] {
			BRANCH_POINT_DEFAULT, NO_UPDATE, MERGE, KEEP_MODIFIED, REPLACE_MODIFIED, FAIL_MODIFIED, };

	/**
	 * A public read-only list of all the '<em><b>Update Strategy</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final List<UpdateStrategy> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Update Strategy</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static UpdateStrategy get(int value) {
		switch(value) {
			case BRANCH_POINT_DEFAULT_VALUE:
				return BRANCH_POINT_DEFAULT;
			case NO_UPDATE_VALUE:
				return NO_UPDATE;
			case MERGE_VALUE:
				return MERGE;
			case KEEP_MODIFIED_VALUE:
				return KEEP_MODIFIED;
			case REPLACE_MODIFIED_VALUE:
				return REPLACE_MODIFIED;
			case FAIL_MODIFIED_VALUE:
				return FAIL_MODIFIED;
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Update Strategy</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static UpdateStrategy get(String literal) {
		for(int i = 0; i < VALUES_ARRAY.length; ++i) {
			UpdateStrategy result = VALUES_ARRAY[i];
			if(result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Update Strategy</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static UpdateStrategy getByName(String name) {
		for(int i = 0; i < VALUES_ARRAY.length; ++i) {
			UpdateStrategy result = VALUES_ARRAY[i];
			if(result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private UpdateStrategy(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getLiteral() {
		return literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public int getValue() {
		return value;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} // UpdateStrategy
