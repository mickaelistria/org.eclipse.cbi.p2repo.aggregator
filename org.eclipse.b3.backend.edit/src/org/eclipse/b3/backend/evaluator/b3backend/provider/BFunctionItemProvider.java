/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.b3.backend.evaluator.b3backend.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.b3.backend.evaluator.b3backend.B3backendFactory;
import org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage;
import org.eclipse.b3.backend.evaluator.b3backend.BFunction;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.eclipse.b3.backend.evaluator.b3backend.BFunction} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BFunctionItemProvider
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2009, Cloudsmith Inc and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\rContributors:\n- Cloudsmith Inc - initial API and implementation.\r";

	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BFunctionItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addVisibilityPropertyDescriptor(object);
			addFinalPropertyDescriptor(object);
			addExecutionModePropertyDescriptor(object);
			addNamePropertyDescriptor(object);
			addParameterTypesPropertyDescriptor(object);
			addExceptionTypesPropertyDescriptor(object);
			addTypeParametersPropertyDescriptor(object);
			addParameterNamesPropertyDescriptor(object);
			addVarArgsPropertyDescriptor(object);
			addDocumentationPropertyDescriptor(object);
			addClosurePropertyDescriptor(object);
			addLineNumberPropertyDescriptor(object);
			addFileReferencePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Visibility feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVisibilityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IFunction_visibility_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IFunction_visibility_feature", "_UI_IFunction_type"),
				 B3backendPackage.Literals.IFUNCTION__VISIBILITY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Final feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFinalPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IFunction_final_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IFunction_final_feature", "_UI_IFunction_type"),
				 B3backendPackage.Literals.IFUNCTION__FINAL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Execution Mode feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExecutionModePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IFunction_executionMode_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IFunction_executionMode_feature", "_UI_IFunction_type"),
				 B3backendPackage.Literals.IFUNCTION__EXECUTION_MODE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IFunction_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IFunction_name_feature", "_UI_IFunction_type"),
				 B3backendPackage.Literals.IFUNCTION__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Closure feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addClosurePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IFunction_closure_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IFunction_closure_feature", "_UI_IFunction_type"),
				 B3backendPackage.Literals.IFUNCTION__CLOSURE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Line Number feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLineNumberPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BSourceLink_lineNumber_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BSourceLink_lineNumber_feature", "_UI_BSourceLink_type"),
				 B3backendPackage.Literals.BSOURCE_LINK__LINE_NUMBER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the File Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFileReferencePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BSourceLink_fileReference_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BSourceLink_fileReference_feature", "_UI_BSourceLink_type"),
				 B3backendPackage.Literals.BSOURCE_LINK__FILE_REFERENCE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Parameter Types feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParameterTypesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IFunction_parameterTypes_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IFunction_parameterTypes_feature", "_UI_IFunction_type"),
				 B3backendPackage.Literals.IFUNCTION__PARAMETER_TYPES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Exception Types feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExceptionTypesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IFunction_exceptionTypes_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IFunction_exceptionTypes_feature", "_UI_IFunction_type"),
				 B3backendPackage.Literals.IFUNCTION__EXCEPTION_TYPES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Type Parameters feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTypeParametersPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IFunction_typeParameters_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IFunction_typeParameters_feature", "_UI_IFunction_type"),
				 B3backendPackage.Literals.IFUNCTION__TYPE_PARAMETERS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Parameter Names feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParameterNamesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IFunction_parameterNames_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IFunction_parameterNames_feature", "_UI_IFunction_type"),
				 B3backendPackage.Literals.IFUNCTION__PARAMETER_NAMES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Var Args feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVarArgsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IFunction_varArgs_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IFunction_varArgs_feature", "_UI_IFunction_type"),
				 B3backendPackage.Literals.IFUNCTION__VAR_ARGS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Documentation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDocumentationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IFunction_documentation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IFunction_documentation_feature", "_UI_IFunction_type"),
				 B3backendPackage.Literals.IFUNCTION__DOCUMENTATION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(B3backendPackage.Literals.IFUNCTION__GUARD);
			childrenFeatures.add(B3backendPackage.Literals.IFUNCTION__PARAMETERS);
			childrenFeatures.add(B3backendPackage.Literals.IFUNCTION__RETURN_TYPE);
			childrenFeatures.add(B3backendPackage.Literals.IFUNCTION__TYPE_CALCULATOR);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns BFunction.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/BFunction"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((BFunction)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_BFunction_type") :
			getString("_UI_BFunction_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(BFunction.class)) {
			case B3backendPackage.BFUNCTION__VISIBILITY:
			case B3backendPackage.BFUNCTION__FINAL:
			case B3backendPackage.BFUNCTION__EXECUTION_MODE:
			case B3backendPackage.BFUNCTION__NAME:
			case B3backendPackage.BFUNCTION__PARAMETER_TYPES:
			case B3backendPackage.BFUNCTION__EXCEPTION_TYPES:
			case B3backendPackage.BFUNCTION__TYPE_PARAMETERS:
			case B3backendPackage.BFUNCTION__PARAMETER_NAMES:
			case B3backendPackage.BFUNCTION__VAR_ARGS:
			case B3backendPackage.BFUNCTION__DOCUMENTATION:
			case B3backendPackage.BFUNCTION__LINE_NUMBER:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case B3backendPackage.BFUNCTION__GUARD:
			case B3backendPackage.BFUNCTION__PARAMETERS:
			case B3backendPackage.BFUNCTION__RETURN_TYPE:
			case B3backendPackage.BFUNCTION__TYPE_CALCULATOR:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(B3backendPackage.Literals.IFUNCTION__GUARD,
				 B3backendFactory.eINSTANCE.createBGuardInstance()));

		newChildDescriptors.add
			(createChildParameter
				(B3backendPackage.Literals.IFUNCTION__GUARD,
				 B3backendFactory.eINSTANCE.createBGuardExpression()));

		newChildDescriptors.add
			(createChildParameter
				(B3backendPackage.Literals.IFUNCTION__GUARD,
				 B3backendFactory.eINSTANCE.createBGuardFunction()));

		newChildDescriptors.add
			(createChildParameter
				(B3backendPackage.Literals.IFUNCTION__PARAMETERS,
				 B3backendFactory.eINSTANCE.createBParameterDeclaration()));

		newChildDescriptors.add
			(createChildParameter
				(B3backendPackage.Literals.IFUNCTION__RETURN_TYPE,
				 B3backendFactory.eINSTANCE.createB3FunctionType()));

		newChildDescriptors.add
			(createChildParameter
				(B3backendPackage.Literals.IFUNCTION__RETURN_TYPE,
				 B3backendFactory.eINSTANCE.createB3ParameterizedType()));

		newChildDescriptors.add
			(createChildParameter
				(B3backendPackage.Literals.IFUNCTION__RETURN_TYPE,
				 B3backendFactory.eINSTANCE.createB3WildcardType()));

		newChildDescriptors.add
			(createChildParameter
				(B3backendPackage.Literals.IFUNCTION__RETURN_TYPE,
				 B3backendFactory.eINSTANCE.createB3FuncTypeVariable()));

		newChildDescriptors.add
			(createChildParameter
				(B3backendPackage.Literals.IFUNCTION__RETURN_TYPE,
				 B3backendFactory.eINSTANCE.createB3JavaImport()));

		newChildDescriptors.add
			(createChildParameter
				(B3backendPackage.Literals.IFUNCTION__TYPE_CALCULATOR,
				 B3backendFactory.eINSTANCE.createBTypeCalculator()));

		newChildDescriptors.add
			(createChildParameter
				(B3backendPackage.Literals.IFUNCTION__TYPE_CALCULATOR,
				 B3backendFactory.eINSTANCE.createBTypeCalculatorFunction()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return B3BackendEditPlugin.INSTANCE;
	}

}
