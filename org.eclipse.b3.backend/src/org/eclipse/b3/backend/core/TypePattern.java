/*******************************************************************************
 * Copyright (c) 2009 Cloudsmith Inc. and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Cloudsmith Inc. - initial API and implementation
 *******************************************************************************/
package org.eclipse.b3.backend.core;

import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;

import org.eclipse.b3.backend.evaluator.b3backend.BParameterDeclaration;
import org.eclipse.b3.backend.evaluator.b3backend.BParameterPredicate;
import org.eclipse.b3.backend.evaluator.typesystem.TypeUtils;

public class TypePattern {
	private static class EmptyVectorNode extends Node {
		EmptyVectorNode() {
			super(0, null);
		}
		boolean match(List<BParameterDeclaration> value, int pos, Matcher matcher) {
			return value == null || value.size() == 0;
		}
	}
	private static class TypeNode extends Node {
		final Type type;
		int min;
		int max;

		/** {1:1}*/
		TypeNode(int rulepos, Node next, Type type) {
			super(rulepos, next);
			this.type = type;
			min = 1;
			max = 1;
		}
		/** {min:*} */
		TypeNode(int rulepos, Node next, Type type, int min) {
			this(rulepos, next, type, min, Integer.MAX_VALUE);
		}
		
		/** {min:max} */
		TypeNode(int rulepos, Node next, Type type, int min, int max) {
			super(rulepos, next);
			this.type = type;
			this.min = min;
			this.max = max;
			if(min < 0)
				throw new IllegalArgumentException("min must be >= 0"); //$NON-NLS-1$
			if(min > max) 
				throw new IllegalArgumentException("min must be >= max"); //$NON-NLS-1$
		}
		boolean match(List<BParameterDeclaration> value, int pos, Matcher matcher) {
			int origPos = pos;
			int top = value.size();
			int limit = pos + min;
			int optlimit = max == Integer.MAX_VALUE ? top : Math.min(pos + max, top);
			if(limit > top)
				return false;
			// match required number
			while(pos < limit)
				if(!typeMatches(value.get(pos++), type))
					return false;
			
			// match optional until next matches
			while(pos < optlimit) {
				if(next.match(value, pos, matcher)) {
					matcher.addMatchStart(rulePos, origPos);
					return true;
				}
				else if(!typeMatches(value.get(pos), type))
					return false;
				pos++;
			}
			matcher.addMatchStart(rulePos, origPos);
			return next == null ? true : next.match(value, pos, matcher);
		}
	}
	/**
	 * Matches declaration against type. If type is null it is taken as "match any",
	 * @param paramDecl
	 * @param type
	 * @return
	 */
	private static boolean typeMatches(BParameterDeclaration paramDecl, Type type) {
		Type pt = paramDecl.getType();
		if(type == null)
			return true;
		// too simple, but a starting point
		return TypeUtils.getRaw(pt) == TypeUtils.getRaw(type);
		
	}

	private static abstract class Node {
		final Node next;
		final int rulePos;

		Node(int rulepos, Node next) {
			this.next = next;
			this.rulePos = rulepos;
		}

		abstract boolean match(List<BParameterDeclaration> value, int pos, Matcher matcher);
	}

	public static TypePattern compile(List<BParameterPredicate> pattern) {
		if(pattern == null || pattern.size() < 1)
			return new TypePattern(new EmptyVectorNode());
		return new TypePattern(parse(pattern, 0));
	}

	private static Node parse(List<BParameterPredicate> pattern, int pos) {
		int top = pattern.size();
		Node parsedNode = null;
		if (pos < top) {
			BParameterPredicate p = pattern.get(pos);
			String op = p.getTypePredicateOp();
			if(op == null || op.length() < 1)
				parsedNode = new TypeNode(pos, parse(pattern, pos+1), p.getType());
			else {
				char opc = op.charAt(0);
				switch(opc) {
				case '?':
					parsedNode = new TypeNode(pos, parse(pattern, pos+1), p.getType(),0,1); break;
				case '+':
					parsedNode = new TypeNode(pos, parse(pattern, pos+1), p.getType(),1); break;
				case '*':
					parsedNode = new TypeNode(pos, parse(pattern, pos+1), p.getType(),0); break;
				default:
					throw new IllegalArgumentException("Invalid Parameter predicate, expected (none) or '?', '*', or '+' got: "+op);
				}
			}
		}
		return parsedNode;
	}

	private final Node node;

	private TypePattern(Node node) {
		this.node = node;
	}

	public boolean isMatch(List<BParameterDeclaration> value) {
		return node.match(value, 0, new Matcher(value.size()));
	}
	public Matcher match(List<BParameterDeclaration> value) {
		Matcher m = new Matcher(value.size());
		boolean r = node.match(value, 0, m);
		m.setMatched(r);
		return m;
	}
	public static class Matcher {
		private int[] matchStarts;
		private boolean matched;
		private Matcher(int numRules) {
			matchStarts = new int[numRules];
			Arrays.fill(matchStarts, -1);
			matched = false;
		}
		private void setMatched(boolean flag) {
			matched = flag;
		}
		private void addMatchStart(int rulePos, int paramPos) {
			matchStarts[rulePos] = paramPos;
		}
		public boolean isMatch() {
			return matched;
		}
		public int size() {
			return matchStarts.length;
		}
		/**
		 * Returns -1 for an unmatched rule, and the parameter number (first is 0) of the first parameter matched
		 * by the rule at idx.
		 * @param idx
		 * @return
		 */
		public int getMatchStart(int idx) {
			return matchStarts[idx];
		}
	}
}
