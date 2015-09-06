/**
 */
package escenariosCalidad.impl;

import escenariosCalidad.Artefacto;
import escenariosCalidad.EscenariosCalidadPackage;
import escenariosCalidad.Estimulo;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Estimulo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link escenariosCalidad.impl.EstimuloImpl#getArtefacto <em>Artefacto</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EstimuloImpl extends MinimalEObjectImpl.Container implements Estimulo {
	/**
	 * The cached value of the '{@link #getArtefacto() <em>Artefacto</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArtefacto()
	 * @generated
	 * @ordered
	 */
	protected Artefacto artefacto;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EstimuloImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EscenariosCalidadPackage.Literals.ESTIMULO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Artefacto getArtefacto() {
		if (artefacto != null && artefacto.eIsProxy()) {
			InternalEObject oldArtefacto = (InternalEObject)artefacto;
			artefacto = (Artefacto)eResolveProxy(oldArtefacto);
			if (artefacto != oldArtefacto) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EscenariosCalidadPackage.ESTIMULO__ARTEFACTO, oldArtefacto, artefacto));
			}
		}
		return artefacto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Artefacto basicGetArtefacto() {
		return artefacto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArtefacto(Artefacto newArtefacto) {
		Artefacto oldArtefacto = artefacto;
		artefacto = newArtefacto;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EscenariosCalidadPackage.ESTIMULO__ARTEFACTO, oldArtefacto, artefacto));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EscenariosCalidadPackage.ESTIMULO__ARTEFACTO:
				if (resolve) return getArtefacto();
				return basicGetArtefacto();
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
			case EscenariosCalidadPackage.ESTIMULO__ARTEFACTO:
				setArtefacto((Artefacto)newValue);
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
			case EscenariosCalidadPackage.ESTIMULO__ARTEFACTO:
				setArtefacto((Artefacto)null);
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
			case EscenariosCalidadPackage.ESTIMULO__ARTEFACTO:
				return artefacto != null;
		}
		return super.eIsSet(featureID);
	}

} //EstimuloImpl
