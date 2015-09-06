/**
 */
package escenariosCalidad;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Estimulo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link escenariosCalidad.Estimulo#getArtefacto <em>Artefacto</em>}</li>
 * </ul>
 * </p>
 *
 * @see escenariosCalidad.EscenariosCalidadPackage#getEstimulo()
 * @model
 * @generated
 */
public interface Estimulo extends EObject {
	/**
	 * Returns the value of the '<em><b>Artefacto</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Artefacto</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Artefacto</em>' reference.
	 * @see #setArtefacto(Artefacto)
	 * @see escenariosCalidad.EscenariosCalidadPackage#getEstimulo_Artefacto()
	 * @model required="true"
	 * @generated
	 */
	Artefacto getArtefacto();

	/**
	 * Sets the value of the '{@link escenariosCalidad.Estimulo#getArtefacto <em>Artefacto</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Artefacto</em>' reference.
	 * @see #getArtefacto()
	 * @generated
	 */
	void setArtefacto(Artefacto value);

} // Estimulo
