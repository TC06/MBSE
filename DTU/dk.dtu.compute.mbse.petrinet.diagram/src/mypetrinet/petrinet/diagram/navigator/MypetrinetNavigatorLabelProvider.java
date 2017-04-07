package mypetrinet.petrinet.diagram.navigator;

import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

import dk.dtu.compute.mbse.petrinet.Petrinet;
import mypetrinet.petrinet.diagram.edit.parts.ArcEditPart;
import mypetrinet.petrinet.diagram.edit.parts.PetrinetEditPart;
import mypetrinet.petrinet.diagram.edit.parts.PlaceEditPart;
import mypetrinet.petrinet.diagram.edit.parts.PlaceNameEditPart;
import mypetrinet.petrinet.diagram.edit.parts.TokenEditPart;
import mypetrinet.petrinet.diagram.edit.parts.TransitionEditPart;
import mypetrinet.petrinet.diagram.edit.parts.TransitionNameEditPart;
import mypetrinet.petrinet.diagram.part.MypetrinetDiagramEditorPlugin;
import mypetrinet.petrinet.diagram.part.MypetrinetVisualIDRegistry;
import mypetrinet.petrinet.diagram.providers.MypetrinetElementTypes;
import mypetrinet.petrinet.diagram.providers.MypetrinetParserProvider;

/**
 * @generated
 */
public class MypetrinetNavigatorLabelProvider extends LabelProvider
		implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	* @generated
	*/
	static {
		MypetrinetDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?UnknownElement", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
		MypetrinetDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?ImageNotFound", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
	}

	/**
	* @generated
	*/
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof MypetrinetNavigatorItem && !isOwnView(((MypetrinetNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	* @generated
	*/
	public Image getImage(Object element) {
		if (element instanceof MypetrinetNavigatorGroup) {
			MypetrinetNavigatorGroup group = (MypetrinetNavigatorGroup) element;
			return MypetrinetDiagramEditorPlugin.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof MypetrinetNavigatorItem) {
			MypetrinetNavigatorItem navigatorItem = (MypetrinetNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		return super.getImage(element);
	}

	/**
	* @generated
	*/
	public Image getImage(View view) {
		switch (MypetrinetVisualIDRegistry.getVisualID(view)) {
		case PetrinetEditPart.VISUAL_ID:
			return getImage("Navigator?Diagram?http://mbse.compute.dtu.dk/mypetrinet?Petrinet", //$NON-NLS-1$
					MypetrinetElementTypes.Petrinet_1000);
		case PlaceEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://mbse.compute.dtu.dk/mypetrinet?Place", //$NON-NLS-1$
					MypetrinetElementTypes.Place_2001);
		case TransitionEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://mbse.compute.dtu.dk/mypetrinet?Transition", //$NON-NLS-1$
					MypetrinetElementTypes.Transition_2002);
		case TokenEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://mbse.compute.dtu.dk/mypetrinet?Token", //$NON-NLS-1$
					MypetrinetElementTypes.Token_3001);
		case ArcEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://mbse.compute.dtu.dk/mypetrinet?Arc", //$NON-NLS-1$
					MypetrinetElementTypes.Arc_4001);
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = MypetrinetDiagramEditorPlugin.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null && MypetrinetElementTypes.isKnownElementType(elementType)) {
			image = MypetrinetElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	* @generated
	*/
	public String getText(Object element) {
		if (element instanceof MypetrinetNavigatorGroup) {
			MypetrinetNavigatorGroup group = (MypetrinetNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof MypetrinetNavigatorItem) {
			MypetrinetNavigatorItem navigatorItem = (MypetrinetNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		return super.getText(element);
	}

	/**
	* @generated
	*/
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (MypetrinetVisualIDRegistry.getVisualID(view)) {
		case PetrinetEditPart.VISUAL_ID:
			return getPetrinet_1000Text(view);
		case PlaceEditPart.VISUAL_ID:
			return getPlace_2001Text(view);
		case TransitionEditPart.VISUAL_ID:
			return getTransition_2002Text(view);
		case TokenEditPart.VISUAL_ID:
			return getToken_3001Text(view);
		case ArcEditPart.VISUAL_ID:
			return getArc_4001Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	* @generated
	*/
	private String getPetrinet_1000Text(View view) {
		Petrinet domainModelElement = (Petrinet) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			MypetrinetDiagramEditorPlugin.getInstance().logError("No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getPlace_2001Text(View view) {
		IParser parser = MypetrinetParserProvider.getParser(MypetrinetElementTypes.Place_2001,
				view.getElement() != null ? view.getElement() : view,
				MypetrinetVisualIDRegistry.getType(PlaceNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MypetrinetDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getTransition_2002Text(View view) {
		IParser parser = MypetrinetParserProvider.getParser(MypetrinetElementTypes.Transition_2002,
				view.getElement() != null ? view.getElement() : view,
				MypetrinetVisualIDRegistry.getType(TransitionNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MypetrinetDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getToken_3001Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getArc_4001Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	* @generated
	*/
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	* @generated
	*/
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	* @generated
	*/
	public void restoreState(IMemento aMemento) {
	}

	/**
	* @generated
	*/
	public void saveState(IMemento aMemento) {
	}

	/**
	* @generated
	*/
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	* @generated
	*/
	private boolean isOwnView(View view) {
		return PetrinetEditPart.MODEL_ID.equals(MypetrinetVisualIDRegistry.getModelID(view));
	}

}
