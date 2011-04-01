/**
 * Copyright (c) 2006-2009, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 */

package org.eclipse.b3.aggregator.util;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

public abstract class NotificationForwardingAdapter extends AdapterImpl {

	protected Object forwardingTarget;

	protected EClass forwardingSourceEClass;

	protected Collection<EStructuralFeature> forwardedFeatures;

	public NotificationForwardingAdapter(Object forwardingTarget, EClass forwardingSourceEClass,
			Collection<EStructuralFeature> forwardedFeatures) {
		this.forwardingTarget = forwardingTarget;
		this.forwardingSourceEClass = forwardingSourceEClass;
		this.forwardedFeatures = forwardedFeatures;

	}

	protected abstract void forwardNotification(Notification notification);

	/**
	 * @return the forwardedFeatures
	 */
	public Collection<EStructuralFeature> getForwardedFeatures() {
		return forwardedFeatures;
	}

	/**
	 * @return the forwardingTarget
	 */
	public Object getForwardingTarget() {
		return forwardingTarget;
	}

	@Override
	public boolean isAdapterForType(Object type) {
		return (type instanceof EObject && forwardingSourceEClass.isSuperTypeOf(((EObject) type).eClass()));
	}

	@Override
	public void notifyChanged(Notification notification) {
		if(forwardedFeatures == null || forwardedFeatures.contains(notification.getFeature())) {
			forwardNotification(notification);
		}
	}

}
