/**
 */
package pcdef.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import pcdef.PcdefPackage;
import pcdef.StrongerThan;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stronger Than</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pcdef.impl.StrongerThanImpl#getStrongerThanRef <em>Stronger Than Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StrongerThanImpl extends MinimalEObjectImpl.Container implements StrongerThan {
	/**
	 * The cached value of the '{@link #getStrongerThanRef() <em>Stronger Than Ref</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrongerThanRef()
	 * @generated
	 * @ordered
	 */
	protected EList<EReference> strongerThanRef;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StrongerThanImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PcdefPackage.Literals.STRONGER_THAN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EReference> getStrongerThanRef() {
		if (strongerThanRef == null) {
			strongerThanRef = new EObjectResolvingEList<EReference>(EReference.class, this,
					PcdefPackage.STRONGER_THAN__STRONGER_THAN_REF);
		}
		return strongerThanRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case PcdefPackage.STRONGER_THAN__STRONGER_THAN_REF:
			return getStrongerThanRef();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case PcdefPackage.STRONGER_THAN__STRONGER_THAN_REF:
			getStrongerThanRef().clear();
			getStrongerThanRef().addAll((Collection<? extends EReference>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case PcdefPackage.STRONGER_THAN__STRONGER_THAN_REF:
			getStrongerThanRef().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case PcdefPackage.STRONGER_THAN__STRONGER_THAN_REF:
			return strongerThanRef != null && !strongerThanRef.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //StrongerThanImpl
