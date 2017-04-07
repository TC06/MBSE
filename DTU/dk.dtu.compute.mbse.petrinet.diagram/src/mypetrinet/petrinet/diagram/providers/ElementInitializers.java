package mypetrinet.petrinet.diagram.providers;

import mypetrinet.petrinet.diagram.part.MypetrinetDiagramEditorPlugin;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	* @generated
	*/
	public static ElementInitializers getInstance() {
		ElementInitializers cached = MypetrinetDiagramEditorPlugin.getInstance().getElementInitializers();
		if (cached == null) {
			MypetrinetDiagramEditorPlugin.getInstance().setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}
}
