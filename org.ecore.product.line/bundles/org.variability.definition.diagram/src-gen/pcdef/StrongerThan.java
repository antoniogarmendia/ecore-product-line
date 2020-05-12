/**
 */
package pcdef;

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
 *   <li>{@link pcdef.StrongerThan#getRef <em>Ref</em>}</li>
 *   <li>{@link pcdef.StrongerThan#isIsSourceStronger <em>Is Source Stronger</em>}</li>
 * </ul>
 *
 * @see pcdef.PcdefPackage#getStrongerThan()
 * @model
 * @generated
 */
public interface StrongerThan extends EObject {
	/**
	 * Returns the value of the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref</em>' reference.
	 * @see #setRef(EReference)
	 * @see pcdef.PcdefPackage#getStrongerThan_Ref()
	 * @model required="true"
	 * @generated
	 */
	EReference getRef();

	/**
	 * Sets the value of the '{@link pcdef.StrongerThan#getRef <em>Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref</em>' reference.
	 * @see #getRef()
	 * @generated
	 */
	void setRef(EReference value);

	/**
	 * Returns the value of the '<em><b>Is Source Stronger</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Source Stronger</em>' attribute.
	 * @see #setIsSourceStronger(boolean)
	 * @see pcdef.PcdefPackage#getStrongerThan_IsSourceStronger()
	 * @model default="true"
	 * @generated
	 */
	boolean isIsSourceStronger();

	/**
	 * Sets the value of the '{@link pcdef.StrongerThan#isIsSourceStronger <em>Is Source Stronger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Source Stronger</em>' attribute.
	 * @see #isIsSourceStronger()
	 * @generated
	 */
	void setIsSourceStronger(boolean value);

} // StrongerThan
