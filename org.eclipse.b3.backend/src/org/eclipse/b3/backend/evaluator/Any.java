package org.eclipse.b3.backend.evaluator;

import java.io.Serializable;

public class Any implements Comparable<Object>, Serializable{

	private static final long serialVersionUID = 1L;
	public static final Any ANY = new Any();
	
	public int compareTo(Object o) {
		return 0;
	}

}
