package org.eclipse.b3;

import org.eclipse.b3.build.build.B3BuildPackage;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.parsetree.reconstr.impl.DefaultTransientValueService;

public class BeeLangGrammarSerialization extends DefaultTransientValueService {

	// /*
	// * (non-Javadoc)
	// *
	// * @see org.eclipse.xtext.parsetree.reconstr.ITransientValueService#isCheckElementsIndividually(org.eclipse.emf.ecore.EObject,
	// * org.eclipse.emf.ecore.EStructuralFeature)
	// */
	// public boolean isCheckElementsIndividually(EObject owner, EStructuralFeature feature) {
	// return true;
	// }

	// public boolean isMixedList(EObject owner, EStructuralFeature feature) {
	// return true;
	// }

	// public boolean isTransient(EObject owner, EStructuralFeature feature, int index) {
	// if(!(owner instanceof BuildUnit))
	// return false;
	// if(feature.getFeatureID() == B3BuildPackage.BUILD_UNIT__NAME_SPACE)
	// return true;
	// return false;
	// }
	@Override
	public boolean isTransient(EObject owner, EStructuralFeature feature, int index) {
		if(owner.eClass() == B3BuildPackage.Literals.BUILD_UNIT &&
				feature == B3BuildPackage.Literals.CAPABILITY__NAME_SPACE) {
			return true;
		}
		return super.isTransient(owner, feature, index);
	}
}
