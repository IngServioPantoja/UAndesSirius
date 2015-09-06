/**
 */
package escenariosCalidad;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Escenario</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link escenariosCalidad.Escenario#getId <em>Id</em>}</li>
 *   <li>{@link escenariosCalidad.Escenario#getFuente <em>Fuente</em>}</li>
 *   <li>{@link escenariosCalidad.Escenario#getEstimulo <em>Estimulo</em>}</li>
 *   <li>{@link escenariosCalidad.Escenario#getMedida <em>Medida</em>}</li>
 * </ul>
 * </p>
 *
 * @see escenariosCalidad.EscenariosCalidadPackage#getEscenario()
 * @model
 * @generated
 */
public interface Escenario extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see escenariosCalidad.EscenariosCalidadPackage#getEscenario_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link escenariosCalidad.Escenario#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Fuente</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fuente</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fuente</em>' containment reference.
	 * @see #setFuente(Fuente)
	 * @see escenariosCalidad.EscenariosCalidadPackage#getEscenario_Fuente()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Fuente getFuente();

	/**
	 * Sets the value of the '{@link escenariosCalidad.Escenario#getFuente <em>Fuente</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fuente</em>' containment reference.
	 * @see #getFuente()
	 * @generated
	 */
	void setFuente(Fuente value);

	/**
	 * Returns the value of the '<em><b>Estimulo</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Estimulo</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Estimulo</em>' containment reference.
	 * @see #setEstimulo(Estimulo)
	 * @see escenariosCalidad.EscenariosCalidadPackage#getEscenario_Estimulo()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Estimulo getEstimulo();

	/**
	 * Sets the value of the '{@link escenariosCalidad.Escenario#getEstimulo <em>Estimulo</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Estimulo</em>' containment reference.
	 * @see #getEstimulo()
	 * @generated
	 */
	void setEstimulo(Estimulo value);

	/**
	 * Returns the value of the '<em><b>Medida</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Medida</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Medida</em>' containment reference.
	 * @see #setMedida(MedidaRespuesta)
	 * @see escenariosCalidad.EscenariosCalidadPackage#getEscenario_Medida()
	 * @model containment="true" required="true"
	 * @generated
	 */
	MedidaRespuesta getMedida();

	/**
	 * Sets the value of the '{@link escenariosCalidad.Escenario#getMedida <em>Medida</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Medida</em>' containment reference.
	 * @see #getMedida()
	 * @generated
	 */
	void setMedida(MedidaRespuesta value);

} // Escenario
