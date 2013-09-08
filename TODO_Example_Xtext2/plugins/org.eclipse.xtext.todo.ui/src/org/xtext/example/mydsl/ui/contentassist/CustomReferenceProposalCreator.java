package org.xtext.example.mydsl.ui.contentassist;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.xtext.resource.IEObjectDescription;

import com.google.common.base.Function;

public class CustomReferenceProposalCreator extends org.eclipse.xtext.common.types.xtext.ui.TypeAwareReferenceProposalCreator {

	@Override
	protected Function<IEObjectDescription, ICompletionProposal> getWrappedFactory(
			EObject model, EReference reference,
			Function<IEObjectDescription, ICompletionProposal> proposalFactory) {
		return super.getWrappedFactory(model, reference, proposalFactory);
	}
}
