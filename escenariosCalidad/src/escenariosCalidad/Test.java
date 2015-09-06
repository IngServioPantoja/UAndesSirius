/**
 */
package escenariosCalidad;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link escenariosCalidad.Test#getArquitecturas <em>Arquitecturas</em>}</li>
 * </ul>
 * </p>
 *
 * @see escenariosCalidad.EscenariosCalidadPackage#getTest()
 * @model
 * @generated
 */
public interface Test extends EObject {
	/**
	 * Returns the value of the '<em><b>Arquitecturas</b></em>' containment reference list.
	 * The list contents are of type {@link escenariosCalidad.Arquitectura}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arquitecturas</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arquitecturas</em>' containment reference list.
	 * @see escenariosCalidad.EscenariosCalidadPackage#getTest_Arquitecturas()
	 * @model containment="true"
	 * @generated
	 */
	EList<Arquitectura> getArquitecturas();

} // Test
