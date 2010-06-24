package org.eclipse.b3.build.core;

import java.util.WeakHashMap;

import org.eclipse.b3.build.ResolutionInfo;
import org.eclipse.emf.common.notify.impl.AdapterImpl;

/**
 * The resolution info adapter associates an instance of ResolutionInfo with a (weak) key.
 * The intended use is that a resolver associates information about its resolution progress.
 */
public class ResolutionInfoAdapter extends AdapterImpl {
	WeakHashMap<Object, ResolutionInfo> associatedInfo = new WeakHashMap<Object, ResolutionInfo>();

	public ResolutionInfo getAssociatedInfo(Object key) {
		return associatedInfo.get(key);
	}

	@Override
	public boolean isAdapterForType(Object type) {
		return type == ResolutionInfoAdapter.class;
	}

	public void setAssociatedInfo(Object key, ResolutionInfo resolutionInfo) {
		associatedInfo.put(key, resolutionInfo);
	}
}
