package mypetrinet.petrinet.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import mypetrinet.petrinet.diagram.providers.MypetrinetElementTypes;
import mypetrinet.petrinet.diagram.providers.MypetrinetModelingAssistantProvider;

/**
 * @generated
 */
public class MypetrinetModelingAssistantProviderOfPetrinetEditPart extends MypetrinetModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(MypetrinetElementTypes.Place_2001);
		types.add(MypetrinetElementTypes.Transition_2002);
		return types;
	}

}
