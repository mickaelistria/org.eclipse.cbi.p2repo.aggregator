/*******************************************************************************
 * Copyright (c) 2007, 2009 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *     Cloudsmith Inc - modifications for b3
 *******************************************************************************/
package org.eclipse.b3.internal.core;

import java.util.EventObject;

import org.eclipse.b3.provisional.core.eventbus.IBuildEventBus;
import org.eclipse.b3.provisional.core.eventbus.IBuildListener;
import org.eclipse.b3.provisional.core.eventbus.ISynchronousBuildListener;
import org.eclipse.osgi.framework.eventmgr.CopyOnWriteIdentityMap;
import org.eclipse.osgi.framework.eventmgr.EventDispatcher;
import org.eclipse.osgi.framework.eventmgr.EventManager;
import org.eclipse.osgi.framework.eventmgr.ListenerQueue;

/**
 * Default implementation of the {@link IBuildEventBus} service.
 */
public class BuildEventBus implements EventDispatcher<IBuildListener, IBuildListener, EventObject>, IBuildEventBus {
	private final CopyOnWriteIdentityMap<IBuildListener, IBuildListener> syncListeners = new CopyOnWriteIdentityMap<IBuildListener, IBuildListener>();

	private final CopyOnWriteIdentityMap<IBuildListener, IBuildListener> asyncListeners = new CopyOnWriteIdentityMap<IBuildListener, IBuildListener>();

	private EventManager eventManager = new EventManager("B3 Event Dispatcher"); //$NON-NLS-1$

	private Object dispatchEventLock = new Object();

	/* @GuardedBy("dispatchEventLock") */
	private boolean closed = false;

	/* @GuardedBy("dispatchEventLock") */
	private int dispatchingEvents = 0;

	public BuildEventBus() {
		super();
	}

	public void addListener(IBuildListener toAdd) {
		if(toAdd instanceof ISynchronousBuildListener) {
			synchronized(syncListeners) {
				syncListeners.put(toAdd, toAdd);
			}
		}
		else {
			synchronized(asyncListeners) {
				asyncListeners.put(toAdd, toAdd);
			}
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.equinox.internal.provisional.p2.core.eventbus.IProvisioningEventBus#close()
	 */
	public void close() {
		boolean interrupted = false;
		synchronized(dispatchEventLock) {
			eventManager.close();
			closed = true;
			while(dispatchingEvents != 0) {
				try {
					dispatchEventLock.wait(30000); // we're going to cap waiting time at 30s
					break;
				}
				catch(InterruptedException e) {
					// keep waiting but flag interrupted
					interrupted = true;
				}
			}
		}
		if(interrupted)
			Thread.currentThread().interrupt();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.equinox.internal.provisional.p2.core.eventbus.IProvisioningEventBus#dispatchEvent(java.lang.Object,
	 * java.lang.Object, int, java.lang.Object)
	 */
	public void dispatchEvent(IBuildListener eventListener, IBuildListener listenerObject, int eventAction,
			EventObject eventObject) {
		synchronized(dispatchEventLock) {
			if(closed)
				return;
			dispatchingEvents++;
		}
		try {
			eventListener.notify(eventObject);
		}
		catch(Exception e) {
			e.printStackTrace();
			// TODO Need to do the appropriate logging
		}
		finally {
			synchronized(dispatchEventLock) {
				dispatchingEvents--;
				if(dispatchingEvents == 0)
					dispatchEventLock.notifyAll();
			}
		}
	}

	public void publishEvent(EventObject event) {
		synchronized(dispatchEventLock) {
			if(closed)
				return;
		}
		/* queue to hold set of listeners */
		ListenerQueue<IBuildListener, IBuildListener, EventObject> listeners = new ListenerQueue<IBuildListener, IBuildListener, EventObject>(
			eventManager);

		/* synchronize while building the listener list */
		synchronized(syncListeners) {
			/* add set of BundleContexts w/ listeners to queue */
			listeners.queueListeners(syncListeners.entrySet(), this);
			/* synchronously dispatch to populate listeners queue */
			listeners.dispatchEventSynchronous(0, event);
		}

		listeners = new ListenerQueue<IBuildListener, IBuildListener, EventObject>(eventManager);
		synchronized(asyncListeners) {
			listeners.queueListeners(asyncListeners.entrySet(), this);
			synchronized(dispatchEventLock) {
				if(!closed)
					listeners.dispatchEventAsynchronous(0, event);
			}
		}
	}

	public void removeListener(IBuildListener toRemove) {
		if(toRemove instanceof ISynchronousBuildListener) {
			synchronized(syncListeners) {
				syncListeners.remove(toRemove);
			}
		}
		else {
			synchronized(asyncListeners) {
				asyncListeners.remove(toRemove);
			}
		}
	}
}
