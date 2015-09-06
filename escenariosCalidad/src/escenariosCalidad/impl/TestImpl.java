/**
 */
package escenariosCalidad.impl;

import escenariosCalidad.Arquitectura;
import escenariosCalidad.EscenariosCalidadPackage;
import escenariosCalidad.Test;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Test</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link escenariosCalidad.impl.TestImpl#getArquitecturas <em>Arquitecturas</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TestImpl extends MinimalEObjectImpl.Container implements Test {
	/**
	 * The cached value of the '{@link #getArquitecturas() <em>Arquitecturas</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArquitecturas()
	 * @generated
	 * @ordered
	 */
	protected EList<Arquitectura> arquitecturas;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EscenariosCalidadPackage.Literals.TEST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Arquitectura> getArquitecturas() {
		if (arquitecturas == null) {
			arquitecturas = new EObjectContainmentEList<Arquitectura>(Arquitectura.class, this, EscenariosCalidadPackage.TEST__ARQUITECTURAS);
		}
		return arquitecturas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EscenariosCalidadPackage.TEST__ARQUITECTURAS:
				return ((InternalEList<?>)getArquitecturas()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EscenariosCalidadPackage.TEST__ARQUITECTURAS:
				return getArquitecturas();
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
			case EscenariosCalidadPackage.TEST__ARQUITECTURAS:
				getArquitecturas().clear();
				getArquitecturas().addAll((Collection<? extends Arquitectura>)newValue);
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
			case EscenariosCalidadPackage.TEST__ARQUITECTURAS:
				getArquitecturas().clear();
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
			case EscenariosCalidadPackage.TEST__ARQUITECTURAS:
				return arquitecturas != null && !arquitecturas.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TestImpl
