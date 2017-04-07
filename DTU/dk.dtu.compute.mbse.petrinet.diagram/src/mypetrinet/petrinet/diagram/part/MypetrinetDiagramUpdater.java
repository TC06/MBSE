package mypetrinet.petrinet.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

import dk.dtu.compute.mbse.petrinet.Arc;
import dk.dtu.compute.mbse.petrinet.Node;
import dk.dtu.compute.mbse.petrinet.Petrinet;
import dk.dtu.compute.mbse.petrinet.PetrinetPackage;
import dk.dtu.compute.mbse.petrinet.Place;
import dk.dtu.compute.mbse.petrinet.Token;
import dk.dtu.compute.mbse.petrinet.Transition;
import mypetrinet.petrinet.diagram.edit.parts.ArcEditPart;
import mypetrinet.petrinet.diagram.edit.parts.PetrinetEditPart;
import mypetrinet.petrinet.diagram.edit.parts.PlaceEditPart;
import mypetrinet.petrinet.diagram.edit.parts.TokenEditPart;
import mypetrinet.petrinet.diagram.edit.parts.TransitionEditPart;
import mypetrinet.petrinet.diagram.providers.MypetrinetElementTypes;

/**
 * @generated
 */
public class MypetrinetDiagramUpdater {

	/**
	* @generated
	*/
	public static List<MypetrinetNodeDescriptor> getSemanticChildren(View view) {
		switch (MypetrinetVisualIDRegistry.getVisualID(view)) {
		case PetrinetEditPart.VISUAL_ID:
			return getPetrinet_1000SemanticChildren(view);
		case PlaceEditPart.VISUAL_ID:
			return getPlace_2001SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<MypetrinetNodeDescriptor> getPetrinet_1000SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		Petrinet modelElement = (Petrinet) view.getElement();
		LinkedList<MypetrinetNodeDescriptor> result = new LinkedList<MypetrinetNodeDescriptor>();
		for (Iterator<?> it = modelElement.getNodes().iterator(); it.hasNext();) {
			Node childElement = (Node) it.next();
			int visualID = MypetrinetVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PlaceEditPart.VISUAL_ID) {
				result.add(new MypetrinetNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == TransitionEditPart.VISUAL_ID) {
				result.add(new MypetrinetNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<MypetrinetNodeDescriptor> getPlace_2001SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		Place modelElement = (Place) view.getElement();
		LinkedList<MypetrinetNodeDescriptor> result = new LinkedList<MypetrinetNodeDescriptor>();
		for (Iterator<?> it = modelElement.getTokens().iterator(); it.hasNext();) {
			Token childElement = (Token) it.next();
			int visualID = MypetrinetVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == TokenEditPart.VISUAL_ID) {
				result.add(new MypetrinetNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<MypetrinetLinkDescriptor> getContainedLinks(View view) {
		switch (MypetrinetVisualIDRegistry.getVisualID(view)) {
		case PetrinetEditPart.VISUAL_ID:
			return getPetrinet_1000ContainedLinks(view);
		case PlaceEditPart.VISUAL_ID:
			return getPlace_2001ContainedLinks(view);
		case TransitionEditPart.VISUAL_ID:
			return getTransition_2002ContainedLinks(view);
		case TokenEditPart.VISUAL_ID:
			return getToken_3001ContainedLinks(view);
		case ArcEditPart.VISUAL_ID:
			return getArc_4001ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<MypetrinetLinkDescriptor> getIncomingLinks(View view) {
		switch (MypetrinetVisualIDRegistry.getVisualID(view)) {
		case PlaceEditPart.VISUAL_ID:
			return getPlace_2001IncomingLinks(view);
		case TransitionEditPart.VISUAL_ID:
			return getTransition_2002IncomingLinks(view);
		case TokenEditPart.VISUAL_ID:
			return getToken_3001IncomingLinks(view);
		case ArcEditPart.VISUAL_ID:
			return getArc_4001IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<MypetrinetLinkDescriptor> getOutgoingLinks(View view) {
		switch (MypetrinetVisualIDRegistry.getVisualID(view)) {
		case PlaceEditPart.VISUAL_ID:
			return getPlace_2001OutgoingLinks(view);
		case TransitionEditPart.VISUAL_ID:
			return getTransition_2002OutgoingLinks(view);
		case TokenEditPart.VISUAL_ID:
			return getToken_3001OutgoingLinks(view);
		case ArcEditPart.VISUAL_ID:
			return getArc_4001OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MypetrinetLinkDescriptor> getPetrinet_1000ContainedLinks(View view) {
		Petrinet modelElement = (Petrinet) view.getElement();
		LinkedList<MypetrinetLinkDescriptor> result = new LinkedList<MypetrinetLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Arc_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MypetrinetLinkDescriptor> getPlace_2001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MypetrinetLinkDescriptor> getTransition_2002ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<MypetrinetLinkDescriptor> getToken_3001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MypetrinetLinkDescriptor> getArc_4001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MypetrinetLinkDescriptor> getPlace_2001IncomingLinks(View view) {
		Place modelElement = (Place) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<MypetrinetLinkDescriptor> result = new LinkedList<MypetrinetLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Arc_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MypetrinetLinkDescriptor> getTransition_2002IncomingLinks(View view) {
		Transition modelElement = (Transition) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<MypetrinetLinkDescriptor> result = new LinkedList<MypetrinetLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Arc_4001(modelElement, crossReferences));
		return result;
	}

	/**
	* @generated
	*/
	public static List<MypetrinetLinkDescriptor> getToken_3001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MypetrinetLinkDescriptor> getArc_4001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MypetrinetLinkDescriptor> getPlace_2001OutgoingLinks(View view) {
		Place modelElement = (Place) view.getElement();
		LinkedList<MypetrinetLinkDescriptor> result = new LinkedList<MypetrinetLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Arc_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MypetrinetLinkDescriptor> getTransition_2002OutgoingLinks(View view) {
		Transition modelElement = (Transition) view.getElement();
		LinkedList<MypetrinetLinkDescriptor> result = new LinkedList<MypetrinetLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Arc_4001(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<MypetrinetLinkDescriptor> getToken_3001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MypetrinetLinkDescriptor> getArc_4001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	private static Collection<MypetrinetLinkDescriptor> getContainedTypeModelFacetLinks_Arc_4001(Petrinet container) {
		LinkedList<MypetrinetLinkDescriptor> result = new LinkedList<MypetrinetLinkDescriptor>();
		for (Iterator<?> links = container.getArcs().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Arc) {
				continue;
			}
			Arc link = (Arc) linkObject;
			if (ArcEditPart.VISUAL_ID != MypetrinetVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Node dst = link.getTarget();
			Node src = link.getSource();
			result.add(new MypetrinetLinkDescriptor(src, dst, link, MypetrinetElementTypes.Arc_4001,
					ArcEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<MypetrinetLinkDescriptor> getIncomingTypeModelFacetLinks_Arc_4001(Node target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<MypetrinetLinkDescriptor> result = new LinkedList<MypetrinetLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != PetrinetPackage.eINSTANCE.getArc_Target()
					|| false == setting.getEObject() instanceof Arc) {
				continue;
			}
			Arc link = (Arc) setting.getEObject();
			if (ArcEditPart.VISUAL_ID != MypetrinetVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Node src = link.getSource();
			result.add(new MypetrinetLinkDescriptor(src, target, link, MypetrinetElementTypes.Arc_4001,
					ArcEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<MypetrinetLinkDescriptor> getOutgoingTypeModelFacetLinks_Arc_4001(Node source) {
		Petrinet container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof Petrinet) {
				container = (Petrinet) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<MypetrinetLinkDescriptor> result = new LinkedList<MypetrinetLinkDescriptor>();
		for (Iterator<?> links = container.getArcs().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Arc) {
				continue;
			}
			Arc link = (Arc) linkObject;
			if (ArcEditPart.VISUAL_ID != MypetrinetVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Node dst = link.getTarget();
			Node src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new MypetrinetLinkDescriptor(src, dst, link, MypetrinetElementTypes.Arc_4001,
					ArcEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		* @generated
		*/
		@Override

		public List<MypetrinetNodeDescriptor> getSemanticChildren(View view) {
			return MypetrinetDiagramUpdater.getSemanticChildren(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<MypetrinetLinkDescriptor> getContainedLinks(View view) {
			return MypetrinetDiagramUpdater.getContainedLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<MypetrinetLinkDescriptor> getIncomingLinks(View view) {
			return MypetrinetDiagramUpdater.getIncomingLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<MypetrinetLinkDescriptor> getOutgoingLinks(View view) {
			return MypetrinetDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
