/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.b3.aggregator.util;

import org.eclipse.b3.aggregator.AggregatorPackage;
import org.eclipse.b3.aggregator.LinkReceiver;
import org.eclipse.b3.aggregator.LinkSource;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;

/** A resource implementation which maintains linking of objects */
public class BaseAggregatorResourceImpl extends XMIResourceImpl {

	// adapter to help maintaining linking of objects
	private static Adapter LINK_UPDATE_ADAPTER = new AdapterImpl() {

		@Override
		public void notifyChanged(Notification notification) {
			if(notification.getFeatureID(LinkSource.class) == AggregatorPackage.LINK_SOURCE__RECEIVER) {
				Object receiver;

				switch(notification.getEventType()) {
					case Notification.SET:
						receiver = notification.getOldValue();
						if(receiver != null)
							((LinkReceiver) receiver).unlinkSource((LinkSource) notification.getNotifier());
						receiver = notification.getNewValue();
						if(receiver != null)
							((LinkReceiver) receiver).linkSource((LinkSource) notification.getNotifier());
						break;
					case Notification.ADD:
						receiver = notification.getNewValue();
						((LinkReceiver) receiver).linkSource((LinkSource) notification.getNotifier());
						break;
					case Notification.REMOVE:
						receiver = notification.getOldValue();
						((LinkReceiver) receiver).unlinkSource((LinkSource) notification.getNotifier());
						break;
				}
			}
		}

	};

	public BaseAggregatorResourceImpl() {
		super();
	}

	public BaseAggregatorResourceImpl(URI uri) {
		super(uri);
	}

	@Override
	public void attached(EObject eObject) {
		super.attached(eObject);

		if(eObject instanceof LinkSource) {
			LinkSource linkSource = eObject.eIsProxy()
					? (LinkSource) EcoreUtil.resolve(eObject, this)
					: (LinkSource) eObject;
			LinkReceiver linkReceiver = linkSource.getReceiver();

			if(linkReceiver != null)
				linkReceiver.linkSource(linkSource);

			eObject.eAdapters().add(LINK_UPDATE_ADAPTER);
		}
	}

	@Override
	public void detached(EObject eObject) {
		super.detached(eObject);

		if(eObject instanceof LinkSource) {
			eObject.eAdapters().remove(LINK_UPDATE_ADAPTER);

			LinkSource linkSource = (LinkSource) eObject;
			LinkReceiver linkReceiver = linkSource.getReceiver();

			if(linkReceiver != null)
				linkReceiver.unlinkSource(linkSource);
		}
	}

}
