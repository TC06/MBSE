package mypetrinet.petrinet.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

import mypetrinet.petrinet.diagram.providers.MypetrinetElementTypes;

/**
 * @generated
 */
public class ArcItemSemanticEditPolicy extends MypetrinetBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public ArcItemSemanticEditPolicy() {
		super(MypetrinetElementTypes.Arc_4001);
	}

	/**
	* @generated
	*/
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
