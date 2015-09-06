/**
 */
package escenariosCalidad;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Medida Respuesta</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link escenariosCalidad.MedidaRespuesta#getMetrica <em>Metrica</em>}</li>
 *   <li>{@link escenariosCalidad.MedidaRespuesta#getValorEsperado <em>Valor Esperado</em>}</li>
 *   <li>{@link escenariosCalidad.MedidaRespuesta#getUnidad <em>Unidad</em>}</li>
 *   <li>{@link escenariosCalidad.MedidaRespuesta#getOperador <em>Operador</em>}</li>
 * </ul>
 * </p>
 *
 * @see escenariosCalidad.EscenariosCalidadPackage#getMedidaRespuesta()
 * @model
 * @generated
 */
public interface MedidaRespuesta extends EObject {
	/**
	 * Returns the value of the '<em><b>Metrica</b></em>' attribute.
	 * The literals are from the enumeration {@link escenariosCalidad.Metrica}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metrica</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metrica</em>' attribute.
	 * @see escenariosCalidad.Metrica
	 * @see #setMetrica(Metrica)
	 * @see escenariosCalidad.EscenariosCalidadPackage#getMedidaRespuesta_Metrica()
	 * @model
	 * @generated
	 */
	Metrica getMetrica();

	/**
	 * Sets the value of the '{@link escenariosCalidad.MedidaRespuesta#getMetrica <em>Metrica</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metrica</em>' attribute.
	 * @see escenariosCalidad.Metrica
	 * @see #getMetrica()
	 * @generated
	 */
	void setMetrica(Metrica value);

	/**
	 * Returns the value of the '<em><b>Valor Esperado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Valor Esperado</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valor Esperado</em>' attribute.
	 * @see #setValorEsperado(double)
	 * @see escenariosCalidad.EscenariosCalidadPackage#getMedidaRespuesta_ValorEsperado()
	 * @model
	 * @generated
	 */
	double getValorEsperado();

	/**
	 * Sets the value of the '{@link escenariosCalidad.MedidaRespuesta#getValorEsperado <em>Valor Esperado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valor Esperado</em>' attribute.
	 * @see #getValorEsperado()
	 * @generated
	 */
	void setValorEsperado(double value);

	/**
	 * Returns the value of the '<em><b>Unidad</b></em>' attribute.
	 * The literals are from the enumeration {@link escenariosCalidad.Unidad}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unidad</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unidad</em>' attribute.
	 * @see escenariosCalidad.Unidad
	 * @see #setUnidad(Unidad)
	 * @see escenariosCalidad.EscenariosCalidadPackage#getMedidaRespuesta_Unidad()
	 * @model
	 * @generated
	 */
	Unidad getUnidad();

	/**
	 * Sets the value of the '{@link escenariosCalidad.MedidaRespuesta#getUnidad <em>Unidad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unidad</em>' attribute.
	 * @see escenariosCalidad.Unidad
	 * @see #getUnidad()
	 * @generated
	 */
	void setUnidad(Unidad value);

	/**
	 * Returns the value of the '<em><b>Operador</b></em>' attribute.
	 * The literals are from the enumeration {@link escenariosCalidad.Operador}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operador</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operador</em>' attribute.
	 * @see escenariosCalidad.Operador
	 * @see #setOperador(Operador)
	 * @see escenariosCalidad.EscenariosCalidadPackage#getMedidaRespuesta_Operador()
	 * @model
	 * @generated
	 */
	Operador getOperador();

	/**
	 * Sets the value of the '{@link escenariosCalidad.MedidaRespuesta#getOperador <em>Operador</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operador</em>' attribute.
	 * @see escenariosCalidad.Operador
	 * @see #getOperador()
	 * @generated
	 */
	void setOperador(Operador value);

} // MedidaRespuesta
