package mypetrinet.petrinet.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import mypetrinet.petrinet.diagram.edit.parts.PlaceEditPart;
import mypetrinet.petrinet.diagram.edit.parts.TransitionEditPart;
import mypetrinet.petrinet.diagram.providers.MypetrinetElementTypes;
import mypetrinet.petrinet.diagram.providers.MypetrinetModelingAssistantProvider;

/**
 * @generated
 */
public class MypetrinetModelingAssistantProviderOfTransitionEditPart extends MypetrinetModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((TransitionEditPart) sourceEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSource(TransitionEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(MypetrinetElementTypes.Arc_4001);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source, IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget((TransitionEditPart) sourceEditPart, targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSourceAndTarget(TransitionEditPart source,
			IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof PlaceEditPart) {
			types.add(MypetrinetElementTypes.Arc_4001);
		}
		if (targetEditPart instanceof TransitionEditPart) {
			types.add(MypetrinetElementTypes.Arc_4001);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForTarget(IAdaptable source, IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((TransitionEditPart) sourceEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForTarget(TransitionEditPart source, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == MypetrinetElementTypes.Arc_4001) {
			types.add(MypetrinetElementTypes.Place_2001);
			types.add(MypetrinetElementTypes.Transition_2002);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((TransitionEditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(TransitionEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(MypetrinetElementTypes.Arc_4001);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((TransitionEditPart) targetEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(TransitionEditPart target, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == MypetrinetElementTypes.Arc_4001) {
			types.add(MypetrinetElementTypes.Place_2001);
			types.add(MypetrinetElementTypes.Transition_2002);
		}
		return types;
	}

}
