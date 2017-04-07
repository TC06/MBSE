package mypetrinet.petrinet.diagram.providers;

import org.eclipse.gmf.tooling.runtime.providers.DefaultEditPartProvider;

import mypetrinet.petrinet.diagram.edit.parts.MypetrinetEditPartFactory;
import mypetrinet.petrinet.diagram.edit.parts.PetrinetEditPart;
import mypetrinet.petrinet.diagram.part.MypetrinetVisualIDRegistry;

/**
 * @generated
 */
public class MypetrinetEditPartProvider extends DefaultEditPartProvider {

	/**
	* @generated
	*/
	public MypetrinetEditPartProvider() {
		super(new MypetrinetEditPartFactory(), MypetrinetVisualIDRegistry.TYPED_INSTANCE, PetrinetEditPart.MODEL_ID);
	}

}
