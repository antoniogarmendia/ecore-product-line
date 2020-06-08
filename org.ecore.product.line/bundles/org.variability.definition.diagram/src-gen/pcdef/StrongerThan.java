/**
 */
package pcdef;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stronger Than</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pcdef.StrongerThan#getStrongerThanRef <em>Stronger Than Ref</em>}</li>
 * </ul>
 *
 * @see pcdef.PcdefPackage#getStrongerThan()
 * @model
 * @generated
 */
public interface StrongerThan extends EObject {
	/**
	 * Returns the value of the '<em><b>Stronger Than Ref</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stronger Than Ref</em>' reference list.
	 * @see pcdef.PcdefPackage#getStrongerThan_StrongerThanRef()
	 * @model
	 * @generated
	 */
	EList<EReference> getStrongerThanRef();

} // StrongerThan
