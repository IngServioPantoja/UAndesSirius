/**
 */
package escenariosCalidad.impl;

import escenariosCalidad.Arquitectura;
import escenariosCalidad.Artefacto;
import escenariosCalidad.Escenario;
import escenariosCalidad.EscenariosCalidadPackage;

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
 * An implementation of the model object '<em><b>Arquitectura</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link escenariosCalidad.impl.ArquitecturaImpl#getEscenarios <em>Escenarios</em>}</li>
 *   <li>{@link escenariosCalidad.impl.ArquitecturaImpl#getArtefactos <em>Artefactos</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ArquitecturaImpl extends MinimalEObjectImpl.Container implements Arquitectura {
	/**
	 * The cached value of the '{@link #getEscenarios() <em>Escenarios</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEscenarios()
	 * @generated
	 * @ordered
	 */
	protected EList<Escenario> escenarios;

	/**
	 * The cached value of the '{@link #getArtefactos() <em>Artefactos</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArtefactos()
	 * @generated
	 * @ordered
	 */
	protected EList<Artefacto> artefactos;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArquitecturaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EscenariosCalidadPackage.Literals.ARQUITECTURA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Escenario> getEscenarios() {
		if (escenarios == null) {
			escenarios = new EObjectContainmentEList<Escenario>(Escenario.class, this, EscenariosCalidadPackage.ARQUITECTURA__ESCENARIOS);
		}
		return escenarios;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Artefacto> getArtefactos() {
		if (artefactos == null) {
			artefactos = new EObjectContainmentEList<Artefacto>(Artefacto.class, this, EscenariosCalidadPackage.ARQUITECTURA__ARTEFACTOS);
		}
		return artefactos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EscenariosCalidadPackage.ARQUITECTURA__ESCENARIOS:
				return ((InternalEList<?>)getEscenarios()).basicRemove(otherEnd, msgs);
			case EscenariosCalidadPackage.ARQUITECTURA__ARTEFACTOS:
				return ((InternalEList<?>)getArtefactos()).basicRemove(otherEnd, msgs);
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
			case EscenariosCalidadPackage.ARQUITECTURA__ESCENARIOS:
				return getEscenarios();
			case EscenariosCalidadPackage.ARQUITECTURA__ARTEFACTOS:
				return getArtefactos();
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
			case EscenariosCalidadPackage.ARQUITECTURA__ESCENARIOS:
				getEscenarios().clear();
				getEscenarios().addAll((Collection<? extends Escenario>)newValue);
				return;
			case EscenariosCalidadPackage.ARQUITECTURA__ARTEFACTOS:
				getArtefactos().clear();
				getArtefactos().addAll((Collection<? extends Artefacto>)newValue);
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
			case EscenariosCalidadPackage.ARQUITECTURA__ESCENARIOS:
				getEscenarios().clear();
				return;
			case EscenariosCalidadPackage.ARQUITECTURA__ARTEFACTOS:
				getArtefactos().clear();
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
			case EscenariosCalidadPackage.ARQUITECTURA__ESCENARIOS:
				return escenarios != null && !escenarios.isEmpty();
			case EscenariosCalidadPackage.ARQUITECTURA__ARTEFACTOS:
				return artefactos != null && !artefactos.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ArquitecturaImpl
