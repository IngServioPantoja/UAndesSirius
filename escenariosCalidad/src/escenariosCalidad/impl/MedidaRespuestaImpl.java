/**
 */
package escenariosCalidad.impl;

import escenariosCalidad.EscenariosCalidadPackage;
import escenariosCalidad.MedidaRespuesta;
import escenariosCalidad.Metrica;
import escenariosCalidad.Operador;
import escenariosCalidad.Unidad;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Medida Respuesta</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link escenariosCalidad.impl.MedidaRespuestaImpl#getMetrica <em>Metrica</em>}</li>
 *   <li>{@link escenariosCalidad.impl.MedidaRespuestaImpl#getValorEsperado <em>Valor Esperado</em>}</li>
 *   <li>{@link escenariosCalidad.impl.MedidaRespuestaImpl#getUnidad <em>Unidad</em>}</li>
 *   <li>{@link escenariosCalidad.impl.MedidaRespuestaImpl#getOperador <em>Operador</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MedidaRespuestaImpl extends MinimalEObjectImpl.Container implements MedidaRespuesta {
	/**
	 * The default value of the '{@link #getMetrica() <em>Metrica</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetrica()
	 * @generated
	 * @ordered
	 */
	protected static final Metrica METRICA_EDEFAULT = Metrica.LATENCY;

	/**
	 * The cached value of the '{@link #getMetrica() <em>Metrica</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetrica()
	 * @generated
	 * @ordered
	 */
	protected Metrica metrica = METRICA_EDEFAULT;

	/**
	 * The default value of the '{@link #getValorEsperado() <em>Valor Esperado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValorEsperado()
	 * @generated
	 * @ordered
	 */
	protected static final double VALOR_ESPERADO_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getValorEsperado() <em>Valor Esperado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValorEsperado()
	 * @generated
	 * @ordered
	 */
	protected double valorEsperado = VALOR_ESPERADO_EDEFAULT;

	/**
	 * The default value of the '{@link #getUnidad() <em>Unidad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnidad()
	 * @generated
	 * @ordered
	 */
	protected static final Unidad UNIDAD_EDEFAULT = Unidad.SEGUNDOS;

	/**
	 * The cached value of the '{@link #getUnidad() <em>Unidad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnidad()
	 * @generated
	 * @ordered
	 */
	protected Unidad unidad = UNIDAD_EDEFAULT;

	/**
	 * The default value of the '{@link #getOperador() <em>Operador</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperador()
	 * @generated
	 * @ordered
	 */
	protected static final Operador OPERADOR_EDEFAULT = Operador.GT;

	/**
	 * The cached value of the '{@link #getOperador() <em>Operador</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperador()
	 * @generated
	 * @ordered
	 */
	protected Operador operador = OPERADOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedidaRespuestaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EscenariosCalidadPackage.Literals.MEDIDA_RESPUESTA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Metrica getMetrica() {
		return metrica;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetrica(Metrica newMetrica) {
		Metrica oldMetrica = metrica;
		metrica = newMetrica == null ? METRICA_EDEFAULT : newMetrica;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EscenariosCalidadPackage.MEDIDA_RESPUESTA__METRICA, oldMetrica, metrica));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getValorEsperado() {
		return valorEsperado;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValorEsperado(double newValorEsperado) {
		double oldValorEsperado = valorEsperado;
		valorEsperado = newValorEsperado;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EscenariosCalidadPackage.MEDIDA_RESPUESTA__VALOR_ESPERADO, oldValorEsperado, valorEsperado));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Unidad getUnidad() {
		return unidad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnidad(Unidad newUnidad) {
		Unidad oldUnidad = unidad;
		unidad = newUnidad == null ? UNIDAD_EDEFAULT : newUnidad;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EscenariosCalidadPackage.MEDIDA_RESPUESTA__UNIDAD, oldUnidad, unidad));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operador getOperador() {
		return operador;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperador(Operador newOperador) {
		Operador oldOperador = operador;
		operador = newOperador == null ? OPERADOR_EDEFAULT : newOperador;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EscenariosCalidadPackage.MEDIDA_RESPUESTA__OPERADOR, oldOperador, operador));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EscenariosCalidadPackage.MEDIDA_RESPUESTA__METRICA:
				return getMetrica();
			case EscenariosCalidadPackage.MEDIDA_RESPUESTA__VALOR_ESPERADO:
				return getValorEsperado();
			case EscenariosCalidadPackage.MEDIDA_RESPUESTA__UNIDAD:
				return getUnidad();
			case EscenariosCalidadPackage.MEDIDA_RESPUESTA__OPERADOR:
				return getOperador();
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
			case EscenariosCalidadPackage.MEDIDA_RESPUESTA__METRICA:
				setMetrica((Metrica)newValue);
				return;
			case EscenariosCalidadPackage.MEDIDA_RESPUESTA__VALOR_ESPERADO:
				setValorEsperado((Double)newValue);
				return;
			case EscenariosCalidadPackage.MEDIDA_RESPUESTA__UNIDAD:
				setUnidad((Unidad)newValue);
				return;
			case EscenariosCalidadPackage.MEDIDA_RESPUESTA__OPERADOR:
				setOperador((Operador)newValue);
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
			case EscenariosCalidadPackage.MEDIDA_RESPUESTA__METRICA:
				setMetrica(METRICA_EDEFAULT);
				return;
			case EscenariosCalidadPackage.MEDIDA_RESPUESTA__VALOR_ESPERADO:
				setValorEsperado(VALOR_ESPERADO_EDEFAULT);
				return;
			case EscenariosCalidadPackage.MEDIDA_RESPUESTA__UNIDAD:
				setUnidad(UNIDAD_EDEFAULT);
				return;
			case EscenariosCalidadPackage.MEDIDA_RESPUESTA__OPERADOR:
				setOperador(OPERADOR_EDEFAULT);
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
			case EscenariosCalidadPackage.MEDIDA_RESPUESTA__METRICA:
				return metrica != METRICA_EDEFAULT;
			case EscenariosCalidadPackage.MEDIDA_RESPUESTA__VALOR_ESPERADO:
				return valorEsperado != VALOR_ESPERADO_EDEFAULT;
			case EscenariosCalidadPackage.MEDIDA_RESPUESTA__UNIDAD:
				return unidad != UNIDAD_EDEFAULT;
			case EscenariosCalidadPackage.MEDIDA_RESPUESTA__OPERADOR:
				return operador != OPERADOR_EDEFAULT;
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
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (metrica: ");
		result.append(metrica);
		result.append(", valorEsperado: ");
		result.append(valorEsperado);
		result.append(", unidad: ");
		result.append(unidad);
		result.append(", operador: ");
		result.append(operador);
		result.append(')');
		return result.toString();
	}

} //MedidaRespuestaImpl
