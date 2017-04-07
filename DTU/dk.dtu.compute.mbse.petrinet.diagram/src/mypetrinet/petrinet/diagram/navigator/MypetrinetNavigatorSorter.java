package mypetrinet.petrinet.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

import mypetrinet.petrinet.diagram.part.MypetrinetVisualIDRegistry;

/**
 * @generated
 */
public class MypetrinetNavigatorSorter extends ViewerSorter {

	/**
	* @generated
	*/
	private static final int GROUP_CATEGORY = 4003;

	/**
	* @generated
	*/
	public int category(Object element) {
		if (element instanceof MypetrinetNavigatorItem) {
			MypetrinetNavigatorItem item = (MypetrinetNavigatorItem) element;
			return MypetrinetVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
