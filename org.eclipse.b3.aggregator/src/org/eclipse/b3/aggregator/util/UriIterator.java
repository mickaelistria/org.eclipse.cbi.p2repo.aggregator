package org.eclipse.b3.aggregator.util;

import java.net.URI;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.regex.Pattern;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;

public class UriIterator implements Iterator<URI> {
	private final URI root;

	private final URI[] uris;

	private final Pattern excludePattern;

	private int index;

	public UriIterator(URI root, Pattern excludePattern, IProgressMonitor monitor) throws CoreException {
		this.uris = UriUtils.list(UriUtils.appendTrailingSlash(root), monitor);
		this.excludePattern = excludePattern;
		this.root = root;
		index = -1;
		positionNext();
	}

	public UriIterator(URI root, Pattern excludePattern, URI[] uris) {
		this.uris = uris;
		this.excludePattern = excludePattern;
		this.root = root;
		index = -1;
		positionNext();
	}

	public URI getRoot() {
		return root;
	}

	public URI[] getURIs() {
		return uris;
	}

	public boolean hasNext() {
		return index < uris.length;
	}

	public URI next() {
		if(!hasNext())
			throw new NoSuchElementException();

		URI nextURL = uris[index];
		positionNext();
		return nextURL;
	}

	public void remove() {
		throw new UnsupportedOperationException();
	}

	public int size() {
		return uris.length;
	}

	private void positionNext() {
		if(excludePattern == null)
			++index;
		else {
			int top = uris.length;
			for(;;) {
				if(++index >= top || !excludePattern.matcher(uris[index].toString()).matches())
					break;
			}
		}
	}
}
