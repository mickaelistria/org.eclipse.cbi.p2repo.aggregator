/*
 * generated by Xtext
 */
package org.eclipse.b3.ui.contentassist;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.eclipse.b3.build.build.Branch;
import org.eclipse.b3.build.build.BranchPointType;
import org.eclipse.b3.build.build.Repository;
import org.eclipse.b3.build.core.RepositoryValidation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.jface.viewers.StyledString;
import org.eclipse.swt.graphics.Image;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor;

import com.google.common.collect.Lists;

/**
 * see http://www.eclipse.org/Xtext/documentation/latest/xtext.html#contentAssist on how to customize content assistant
 */
public class BeeLangProposalProvider extends AbstractBeeLangProposalProvider {
	/**
	 * @see org.eclipse.xtext.ui.editor.contentassist.ContentProposalPriorities
	 *      A priority higher than all other build in priorites.
	 */
	private static final int CUSTOM_PRIO = 2000;

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.b3.ui.contentassist.AbstractBeeLangProposalProvider#complete_EscapedQualifiedName(org.eclipse.emf.ecore.EObject,
	 * org.eclipse.xtext.RuleCall, org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext,
	 * org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor)
	 */
	@Override
	public void complete_EscapedQualifiedName(EObject model, RuleCall ruleCall, ContentAssistContext context,
			ICompletionProposalAcceptor acceptor) {
		ICompletionProposal completionProposal;
		int prio = CUSTOM_PRIO;

		completionProposal = createCompletionProposal("aName", new StyledString("An ID (example)"), prio--, context);
		acceptor.accept(completionProposal);

		completionProposal = createCompletionProposal(
			"a.qualified.name", new StyledString("A Qualified ID  (example)"), prio--, context);
		acceptor.accept(completionProposal);

		completionProposal = createCompletionProposal("\"1_Complex.Name\"", new StyledString(
			"A quoted complex name  (example)"), prio--, context);
		acceptor.accept(completionProposal);
		super.complete_EscapedQualifiedName(model, ruleCall, context, acceptor);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.b3.ui.contentassist.AbstractBeeLangProposalProvider#complete_NamePredicate(org.eclipse.emf.ecore.EObject,
	 * org.eclipse.xtext.RuleCall, org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext,
	 * org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor)
	 */
	@Override
	public void complete_NamePredicate(EObject model, RuleCall ruleCall, ContentAssistContext context,
			ICompletionProposalAcceptor acceptor) {
		ICompletionProposal completionProposal;

		int prio = CUSTOM_PRIO;
		// REGEXP
		completionProposal = createCompletionProposal(
			"~/.*/", new StyledString("Reqular Expression (example)"), null, prio--, context);
		acceptor.accept(completionProposal);

		// VERBATIM
		completionProposal = createCompletionProposal("my_name.exactly", new StyledString(
			"Verbatim Qualified ID (example)"), null, prio--, context);
		acceptor.accept(completionProposal);
		completionProposal = createCompletionProposal("\"some/path/or.complex.name\"", new StyledString(
			"Verbatim quoted path/name (example)"), null, prio--, context);
		acceptor.accept(completionProposal);

		// ANY
		completionProposal = createCompletionProposal("_", new StyledString("Any/All '_'"), null, prio--, context);
		acceptor.accept(completionProposal);

		super.complete_NamePredicate(model, ruleCall, context, acceptor);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.b3.ui.contentassist.AbstractBeeLangProposalProvider#completeBranch_BranchPoint(org.eclipse.emf.ecore.EObject,
	 * org.eclipse.xtext.Assignment, org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext,
	 * org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor)
	 */
	@Override
	public void completeBranch_BranchPoint(EObject model, Assignment assignment, ContentAssistContext context,
			ICompletionProposalAcceptor acceptor) {
		ICompletionProposal completionProposal;

		// If model (a Branch) has a branch type of Timestamp, the proposal should be a date string.
		// Other branchtypes use EscapedQualifiedName which is proposed via separate rule
		// TODO: propose timstamps in different formats?
		if(((Branch) model).getBranchPointType().getValue() == BranchPointType.TIMESTAMP_VALUE) {
			SimpleDateFormat fmt = new SimpleDateFormat("yyyyMMddHHmmssZ");
			String now = fmt.format(new Date());
			completionProposal = createCompletionProposal(
				"\"" + now + "\"", new StyledString("Timestamp — (now)"), context);
			acceptor.accept(completionProposal);
		}
		super.completeBranch_BranchPoint(model, assignment, context, acceptor);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.b3.ui.contentassist.AbstractBeeLangProposalProvider#completeBranch_Name(org.eclipse.emf.ecore.EObject,
	 * org.eclipse.xtext.Assignment, org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext,
	 * org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor)
	 */
	@Override
	public void completeBranch_Name(EObject model, Assignment assignment, ContentAssistContext context,
			ICompletionProposalAcceptor acceptor) {
		ICompletionProposal completionProposal;

		int prio = CUSTOM_PRIO;
		completionProposal = createCompletionProposal(
			"main", new StyledString("Default Branchname (main)"), prio--, context);
		acceptor.accept(completionProposal);
		if(!isValidProposal("main", context.getPrefix(), context)) {
			completionProposal = createCompletionProposal("main", new StyledString("Replace '" + context.getPrefix() +
					"' with 'main'"), null, prio--, "", context);
			acceptor.accept(completionProposal);

		}
		completionProposal = createCompletionProposal("aSimpleBranchName", new StyledString(
			"A simple Branchname (example)"), prio--, context);
		acceptor.accept(completionProposal);

		completionProposal = createCompletionProposal("a.qualified.branchname", new StyledString(
			"A Qualified Branchname  (example)"), prio--, context);
		acceptor.accept(completionProposal);

		completionProposal = createCompletionProposal("\"1_Complex.BranchName\"", new StyledString(
			"A quoted complex Branchname  (example)"), prio--, context);
		acceptor.accept(completionProposal);

		super.completeBranch_Name(model, assignment, context, acceptor);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.b3.ui.contentassist.AbstractBeeLangProposalProvider#completeRepository_HandlerType(org.eclipse.emf.ecore.EObject,
	 * org.eclipse.xtext.Assignment, org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext,
	 * org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor)
	 */
	@Override
	public void completeRepository_HandlerType(EObject model, Assignment assignment, ContentAssistContext context,
			ICompletionProposalAcceptor acceptor) {
		int valid = 0;
		for(String proposal : RepositoryValidation.getValidNames()) {
			proposal = getValueConverter().toString(proposal, "ID");
			ICompletionProposal completionProposal = createCompletionProposal(proposal, context);
			if(isValidProposal(proposal, context.getPrefix(), context))
				valid++;
			acceptor.accept(completionProposal);
		}
		if(valid == 0) {
			String display = "Replace '" + context.getPrefix() + "' with ";
			for(String proposal : RepositoryValidation.getValidNames()) {
				proposal = getValueConverter().toString(proposal, "ID");
				ICompletionProposal completionProposal = createCompletionProposal(proposal, new StyledString(display +
						"'" + proposal + "'"), "", context);
				acceptor.accept(completionProposal);
			}
		}
		// TODO: if non of the proposals are valid, then propose replacement of whatever user typed
		// (prefix) with one of the valid proposals (i.e. repeat loop but using "" as prefix.

		super.completeRepository_HandlerType(model, assignment, context, acceptor);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.b3.ui.contentassist.AbstractBeeLangProposalProvider#completeRepository_Name(org.eclipse.emf.ecore.EObject,
	 * org.eclipse.xtext.Assignment, org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext,
	 * org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor)
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void completeRepository_Name(EObject model, Assignment assignment, ContentAssistContext context,
			ICompletionProposalAcceptor acceptor) {
		String proposal = "my_" + ((Repository) model).getHandlerType() + "_";
		List<String> usedNames = Lists.newArrayList();
		for(Repository sibling : (List<Repository>) model.eContainer().eGet(model.eContainingFeature())) {
			if(sibling == model) // skip the current element
				continue;
			usedNames.add((sibling).getName());
		}
		proposal = uniqueNameProposal(proposal, usedNames);
		proposal = getValueConverter().toString(proposal, "ID");
		ICompletionProposal completionProposal = createCompletionProposal(proposal, context);
		acceptor.accept(completionProposal);
		super.completeRepository_Name(model, assignment, context, acceptor);
	}

	/**
	 * @param string
	 * @param styledString
	 * @param context
	 * @return
	 */
	ICompletionProposal createCompletionProposal(String proposal, StyledString label, ContentAssistContext context) {
		return createCompletionProposal(
			proposal, label, null, getPriorityHelper().getDefaultPriority(), context.getPrefix(), context);
	}

	ICompletionProposal createCompletionProposal(String proposal, StyledString label, Image image, int prio,
			ContentAssistContext context) {
		return createCompletionProposal(proposal, label, image, prio, context.getPrefix(), context);
	}

	ICompletionProposal createCompletionProposal(String proposal, StyledString label, int prio,
			ContentAssistContext context) {
		return createCompletionProposal(proposal, label, null, prio, context.getPrefix(), context);
	}

	ICompletionProposal createCompletionProposal(String proposal, StyledString label, String prefix,
			ContentAssistContext context) {
		return createCompletionProposal(
			proposal, label, null, getPriorityHelper().getDefaultPriority(), prefix, context);
	}

	// TODO: This is a useful utility in many places
	private String uniqueNameProposal(String proposal, List<String> usedNames) {
		List<String> similar = Lists.newArrayList();
		for(String candidate : usedNames) {
			if(candidate.startsWith(proposal))
				similar.add(candidate.substring(proposal.length()));
		}
		int max = 0;
		for(String candidate : similar)
			try {
				Integer val = Integer.valueOf(candidate);
				if(val.intValue() > max)
					max = val.intValue();
			}
			catch(NumberFormatException e) {
				// does not end with a number, so skip it
			}
		return proposal + Integer.toString(max + 1);
	}
}