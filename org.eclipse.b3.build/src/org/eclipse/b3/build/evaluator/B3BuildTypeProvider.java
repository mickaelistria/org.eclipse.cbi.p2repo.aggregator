/**
 * Copyright (c) 2010, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 */

package org.eclipse.b3.build.evaluator;

import java.lang.reflect.Type;

import org.eclipse.b3.backend.evaluator.b3backend.B3Function;
import org.eclipse.b3.backend.evaluator.b3backend.B3FunctionType;
import org.eclipse.b3.backend.evaluator.b3backend.B3Type;
import org.eclipse.b3.backend.evaluator.b3backend.B3backendFactory;
import org.eclipse.b3.backend.evaluator.b3backend.BParameterDeclaration;
import org.eclipse.b3.backend.evaluator.typesystem.TypeUtils;
import org.eclipse.b3.backend.inference.B3BackendTypeProvider;
import org.eclipse.b3.build.BeeModel;
import org.eclipse.b3.build.BuildSet;
import org.eclipse.b3.build.BuildUnit;
import org.eclipse.b3.build.Builder;
import org.eclipse.b3.build.BuilderInput;
import org.eclipse.b3.build.BuilderNamePredicate;
import org.eclipse.b3.build.ImplementsPredicate;
import org.eclipse.b3.build.InputPredicate;
import org.eclipse.b3.build.PathGroupPredicate;
import org.eclipse.b3.build.ProvidesPredicate;
import org.eclipse.b3.build.Repository;
import org.eclipse.b3.build.RequiresPredicate;
import org.eclipse.b3.build.UnitNamePredicate;
import org.eclipse.b3.build.UnitProvider;
import org.eclipse.b3.build.core.adapters.BuildUnitProxyAdapterFactory;
import org.eclipse.b3.build.repository.IBuildUnitRepository;
import org.eclipse.emf.common.util.EList;

/**
 * Extension for build model
 * 
 */
public class B3BuildTypeProvider extends B3BackendTypeProvider {

	public Type type(BeeModel o) {
		return BeeModel.class;
	}

	public Type type(Builder o) {
		B3FunctionType t = B3backendFactory.eINSTANCE.createB3FunctionType();

		// TODO: This is probably wrong - but current impl uses this class for
		// both B3Function, and JavaFunction ??? Probably a Bug??
		t.setFunctionType(B3Function.class);

		// Return type is always B3BuilderJob.class
		t.setReturnType(o.getReturnType());
		t.setVarArgs(o.isVarArgs());
		t.setTypeCalculator(o.getTypeCalculator());

		// Infer the type of the parameters
		EList<Type> pt = t.getParameterTypes();
		EList<BParameterDeclaration> pList = o.getParameters();
		int pCount = pList.size();
		int insertUnit = (pCount > 0 && "unit".equals(pList.get(0).getName()))
				? 0
				: 1;

		pCount += insertUnit;
		if(insertUnit > 0) {
			B3Type tunit = B3backendFactory.eINSTANCE.createB3Type();
			tunit.setRawType(o.getUnitType());
			pt.add(tunit);
		}
		for(BParameterDeclaration p : o.getParameters())
			pt.add(doGetInferredType(p));

		// override the inference that a varargs parameter is a List<T> and use only a T
		if(o.isVarArgs()) {
			int lastIndex = pt.size() - 1;
			pt.set(lastIndex, TypeUtils.getElementType(pt.get(lastIndex)));
		}

		return t;
	}

	// Replaced by type(BuilderInput.o)
	// public Type type(Prerequisite o) {
	// return BuildSet.class;
	// }
	public Type type(BuilderInput o) {
		return BuildSet.class;
	}

	public Type type(BuilderNamePredicate o) {
		return Boolean.class;
	}

	public Type type(BuildUnit o) {
		return BuildUnitProxyAdapterFactory.eINSTANCE.adapt(o).getProxy().getClass();
	}

	public Type type(ImplementsPredicate o) {
		return Boolean.class;
	}

	public Type type(InputPredicate o) {
		return Boolean.class;
	}

	public Type type(PathGroupPredicate o) {
		return Boolean.class;
	}

	public Type type(ProvidesPredicate o) {
		return Boolean.class;
	}

	public Type type(Repository o) {
		return IBuildUnitRepository.class;
	}

	public Type type(RequiresPredicate o) {
		return Boolean.class;
	}

	public Type type(UnitNamePredicate o) {
		return Boolean.class;
	}

	public Type type(UnitProvider o) {
		return UnitProvider.class;
	}
}
