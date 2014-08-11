/**
 * Copyright (c) 2006-2009, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 *
 */
package org.eclipse.b3.aggregator.p2.provider;

import org.eclipse.b3.aggregator.Aggregation;
import org.eclipse.b3.p2.MetadataRepository;
import org.eclipse.b3.p2.P2Package;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.provider.ViewerNotification;

public class MetadataRepositoryItemProvider extends org.eclipse.b3.p2.provider.MetadataRepositoryItemProvider {

	public MetadataRepositoryItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	@Override
	public void notifyChanged(Notification notification) {
		super.notifyChanged(notification);

		if(notification.getFeatureID(MetadataRepository.class) != P2Package.METADATA_REPOSITORY__INSTALLABLE_UNITS)
			return;

		Aggregation aggregation = (Aggregation) ((EObject) notification.getNotifier()).eResource().getResourceSet().getResources().get(
			0).getContents().get(0);
		fireNotifyChanged(new ViewerNotification(notification, aggregation, true, true));
	}
}
