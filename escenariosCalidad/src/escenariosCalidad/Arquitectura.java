/**
 */
package escenariosCalidad;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arquitectura</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link escenariosCalidad.Arquitectura#getEscenarios <em>Escenarios</em>}</li>
 *   <li>{@link escenariosCalidad.Arquitectura#getArtefactos <em>Artefactos</em>}</li>
 * </ul>
 * </p>
 *
 * @see escenariosCalidad.EscenariosCalidadPackage#getArquitectura()
 * @model
 * @generated
 */
public interface Arquitectura extends EObject {
	/**
	 * Returns the value of the '<em><b>Escenarios</b></em>' containment reference list.
	 * The list contents are of type {@link escenariosCalidad.Escenario}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Escenarios</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Escenarios</em>' containment reference list.
	 * @see escenariosCalidad.EscenariosCalidadPackage#getArquitectura_Escenarios()
	 * @model containment="true"
	 * @generated
	 */
	EList<Escenario> getEscenarios();

	/**
	 * Returns the value of the '<em><b>Artefactos</b></em>' containment reference list.
	 * The list contents are of type {@link escenariosCalidad.Artefacto}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Artefactos</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Artefactos</em>' containment reference list.
	 * @see escenariosCalidad.EscenariosCalidadPackage#getArquitectura_Artefactos()
	 * @model containment="true"
	 * @generated
	 */
	EList<Artefacto> getArtefactos();

} // Arquitectura
