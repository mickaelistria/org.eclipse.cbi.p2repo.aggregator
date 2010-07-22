package org.eclipse.b3.backend.core.adapters;

import java.util.List;

import org.eclipse.b3.backend.evaluator.b3backend.BPropertyOperation;
import org.eclipse.emf.common.notify.impl.AdapterImpl;

public class LoadedPropertySetAdapter extends AdapterImpl {
	List<BPropertyOperation> associatedOps = null;

	public List<BPropertyOperation> getAssociatedOps() {
		return associatedOps;
	}

	@Override
	public boolean isAdapterForType(Object type) {
		return type == LoadedPropertySetAdapter.class;
	}

	public void setAssociatedOps(List<BPropertyOperation> associatedOps) {
		this.associatedOps = associatedOps;
	}
}
