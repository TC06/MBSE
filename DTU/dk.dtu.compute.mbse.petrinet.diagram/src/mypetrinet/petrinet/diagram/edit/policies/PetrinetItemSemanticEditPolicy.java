package mypetrinet.petrinet.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

import mypetrinet.petrinet.diagram.edit.commands.PlaceCreateCommand;
import mypetrinet.petrinet.diagram.edit.commands.TransitionCreateCommand;
import mypetrinet.petrinet.diagram.providers.MypetrinetElementTypes;

/**
 * @generated
 */
public class PetrinetItemSemanticEditPolicy extends MypetrinetBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public PetrinetItemSemanticEditPolicy() {
		super(MypetrinetElementTypes.Petrinet_1000);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (MypetrinetElementTypes.Place_2001 == req.getElementType()) {
			return getGEFWrapper(new PlaceCreateCommand(req));
		}
		if (MypetrinetElementTypes.Transition_2002 == req.getElementType()) {
			return getGEFWrapper(new TransitionCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	* @generated
	*/
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost()).getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	* @generated
	*/
	private static class DuplicateAnythingCommand extends DuplicateEObjectsCommand {

		/**
		* @generated
		*/
		public DuplicateAnythingCommand(TransactionalEditingDomain editingDomain, DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req.getElementsToBeDuplicated(), req.getAllDuplicatedElementsMap());
		}

	}

}
