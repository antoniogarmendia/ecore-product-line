/**
 */
package pcdef.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

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
 *   <li>{@link pcdef.impl.StrongerThanImpl#getRef <em>Ref</em>}</li>
 *   <li>{@link pcdef.impl.StrongerThanImpl#isIsSourceStronger <em>Is Source Stronger</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StrongerThanImpl extends MinimalEObjectImpl.Container implements StrongerThan {
	/**
	 * The cached value of the '{@link #getRef() <em>Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRef()
	 * @generated
	 * @ordered
	 */
	protected EReference ref;

	/**
	 * The default value of the '{@link #isIsSourceStronger() <em>Is Source Stronger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsSourceStronger()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_SOURCE_STRONGER_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isIsSourceStronger() <em>Is Source Stronger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsSourceStronger()
	 * @generated
	 * @ordered
	 */
	protected boolean isSourceStronger = IS_SOURCE_STRONGER_EDEFAULT;

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
	public EReference getRef() {
		if (ref != null && ref.eIsProxy()) {
			InternalEObject oldRef = (InternalEObject) ref;
			ref = (EReference) eResolveProxy(oldRef);
			if (ref != oldRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PcdefPackage.STRONGER_THAN__REF, oldRef,
							ref));
			}
		}
		return ref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference basicGetRef() {
		return ref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRef(EReference newRef) {
		EReference oldRef = ref;
		ref = newRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PcdefPackage.STRONGER_THAN__REF, oldRef, ref));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsSourceStronger() {
		return isSourceStronger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsSourceStronger(boolean newIsSourceStronger) {
		boolean oldIsSourceStronger = isSourceStronger;
		isSourceStronger = newIsSourceStronger;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PcdefPackage.STRONGER_THAN__IS_SOURCE_STRONGER,
					oldIsSourceStronger, isSourceStronger));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case PcdefPackage.STRONGER_THAN__REF:
			if (resolve)
				return getRef();
			return basicGetRef();
		case PcdefPackage.STRONGER_THAN__IS_SOURCE_STRONGER:
			return isIsSourceStronger();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case PcdefPackage.STRONGER_THAN__REF:
			setRef((EReference) newValue);
			return;
		case PcdefPackage.STRONGER_THAN__IS_SOURCE_STRONGER:
			setIsSourceStronger((Boolean) newValue);
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
		case PcdefPackage.STRONGER_THAN__REF:
			setRef((EReference) null);
			return;
		case PcdefPackage.STRONGER_THAN__IS_SOURCE_STRONGER:
			setIsSourceStronger(IS_SOURCE_STRONGER_EDEFAULT);
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
		case PcdefPackage.STRONGER_THAN__REF:
			return ref != null;
		case PcdefPackage.STRONGER_THAN__IS_SOURCE_STRONGER:
			return isSourceStronger != IS_SOURCE_STRONGER_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (isSourceStronger: ");
		result.append(isSourceStronger);
		result.append(')');
		return result.toString();
	}

} //StrongerThanImpl
