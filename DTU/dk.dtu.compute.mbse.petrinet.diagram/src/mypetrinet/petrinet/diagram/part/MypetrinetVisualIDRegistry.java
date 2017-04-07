package mypetrinet.petrinet.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

import dk.dtu.compute.mbse.petrinet.Petrinet;
import dk.dtu.compute.mbse.petrinet.PetrinetPackage;
import mypetrinet.petrinet.diagram.edit.parts.ArcEditPart;
import mypetrinet.petrinet.diagram.edit.parts.PetrinetEditPart;
import mypetrinet.petrinet.diagram.edit.parts.PlaceEditPart;
import mypetrinet.petrinet.diagram.edit.parts.PlaceNameEditPart;
import mypetrinet.petrinet.diagram.edit.parts.TokenEditPart;
import mypetrinet.petrinet.diagram.edit.parts.TransitionEditPart;
import mypetrinet.petrinet.diagram.edit.parts.TransitionNameEditPart;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class MypetrinetVisualIDRegistry {

	/**
	* @generated
	*/
	private static final String DEBUG_KEY = "my.petrinet.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	* @generated
	*/
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (PetrinetEditPart.MODEL_ID.equals(view.getType())) {
				return PetrinetEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return mypetrinet.petrinet.diagram.part.MypetrinetVisualIDRegistry.getVisualID(view.getType());
	}

	/**
	* @generated
	*/
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	* @generated
	*/
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(Platform.getDebugOption(DEBUG_KEY))) {
				MypetrinetDiagramEditorPlugin.getInstance()
						.logError("Unable to parse view type as a visualID number: " + type);
			}
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	* @generated
	*/
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (PetrinetPackage.eINSTANCE.getPetrinet().isSuperTypeOf(domainElement.eClass())
				&& isDiagram((Petrinet) domainElement)) {
			return PetrinetEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = mypetrinet.petrinet.diagram.part.MypetrinetVisualIDRegistry.getModelID(containerView);
		if (!PetrinetEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (PetrinetEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = mypetrinet.petrinet.diagram.part.MypetrinetVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = PetrinetEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case PetrinetEditPart.VISUAL_ID:
			if (PetrinetPackage.eINSTANCE.getPlace().isSuperTypeOf(domainElement.eClass())) {
				return PlaceEditPart.VISUAL_ID;
			}
			if (PetrinetPackage.eINSTANCE.getTransition().isSuperTypeOf(domainElement.eClass())) {
				return TransitionEditPart.VISUAL_ID;
			}
			break;
		case PlaceEditPart.VISUAL_ID:
			if (PetrinetPackage.eINSTANCE.getToken().isSuperTypeOf(domainElement.eClass())) {
				return TokenEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = mypetrinet.petrinet.diagram.part.MypetrinetVisualIDRegistry.getModelID(containerView);
		if (!PetrinetEditPart.MODEL_ID.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (PetrinetEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = mypetrinet.petrinet.diagram.part.MypetrinetVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = PetrinetEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case PetrinetEditPart.VISUAL_ID:
			if (PlaceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TransitionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PlaceEditPart.VISUAL_ID:
			if (PlaceNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TokenEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TransitionEditPart.VISUAL_ID:
			if (TransitionNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (PetrinetPackage.eINSTANCE.getArc().isSuperTypeOf(domainElement.eClass())) {
			return ArcEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	* User can change implementation of this method to handle some specific
	* situations not covered by default logic.
	* 
	* @generated
	*/
	private static boolean isDiagram(Petrinet element) {
		return true;
	}

	/**
	* @generated
	*/
	public static boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate;
	}

	/**
	* @generated
	*/
	public static boolean isCompartmentVisualID(int visualID) {
		return false;
	}

	/**
	* @generated
	*/
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case PetrinetEditPart.VISUAL_ID:
			return false;
		case TransitionEditPart.VISUAL_ID:
		case TokenEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		* @generated
		*/
		@Override

		public int getVisualID(View view) {
			return mypetrinet.petrinet.diagram.part.MypetrinetVisualIDRegistry.getVisualID(view);
		}

		/**
		* @generated
		*/
		@Override

		public String getModelID(View view) {
			return mypetrinet.petrinet.diagram.part.MypetrinetVisualIDRegistry.getModelID(view);
		}

		/**
		* @generated
		*/
		@Override

		public int getNodeVisualID(View containerView, EObject domainElement) {
			return mypetrinet.petrinet.diagram.part.MypetrinetVisualIDRegistry.getNodeVisualID(containerView,
					domainElement);
		}

		/**
		* @generated
		*/
		@Override

		public boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
			return mypetrinet.petrinet.diagram.part.MypetrinetVisualIDRegistry.checkNodeVisualID(containerView,
					domainElement, candidate);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isCompartmentVisualID(int visualID) {
			return mypetrinet.petrinet.diagram.part.MypetrinetVisualIDRegistry.isCompartmentVisualID(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isSemanticLeafVisualID(int visualID) {
			return mypetrinet.petrinet.diagram.part.MypetrinetVisualIDRegistry.isSemanticLeafVisualID(visualID);
		}
	};

}
