/**
 */
package mbse.yawl.impl;

import mbse.yawl.YAWLNet;
import mbse.yawl.YawlPackage;

import org.eclipse.emf.ecore.EClass;

import org.pnml.tools.epnk.pnmlcoremodel.impl.PetriNetTypeImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>YAWL Net</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class YAWLNetImpl extends PetriNetTypeImpl implements YAWLNet {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * @author Tolga
	 */
	public YAWLNetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return YawlPackage.Literals.YAWL_NET;
	}

	@Override
	public String toString() {
		return "http://se.compute.dtu.dk/mbse/yawl";
	}

} //YAWLNetImpl
