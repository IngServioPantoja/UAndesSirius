/**
 */
package escenariosCalidad;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see escenariosCalidad.EscenariosCalidadFactory
 * @model kind="package"
 * @generated
 */
public interface EscenariosCalidadPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "escenariosCalidad";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/escenariosCalidad";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "escenariosCalidad";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EscenariosCalidadPackage eINSTANCE = escenariosCalidad.impl.EscenariosCalidadPackageImpl.init();

	/**
	 * The meta object id for the '{@link escenariosCalidad.impl.ArquitecturaImpl <em>Arquitectura</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see escenariosCalidad.impl.ArquitecturaImpl
	 * @see escenariosCalidad.impl.EscenariosCalidadPackageImpl#getArquitectura()
	 * @generated
	 */
	int ARQUITECTURA = 0;

	/**
	 * The feature id for the '<em><b>Escenarios</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARQUITECTURA__ESCENARIOS = 0;

	/**
	 * The feature id for the '<em><b>Artefactos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARQUITECTURA__ARTEFACTOS = 1;

	/**
	 * The number of structural features of the '<em>Arquitectura</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARQUITECTURA_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Arquitectura</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARQUITECTURA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link escenariosCalidad.impl.EscenarioImpl <em>Escenario</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see escenariosCalidad.impl.EscenarioImpl
	 * @see escenariosCalidad.impl.EscenariosCalidadPackageImpl#getEscenario()
	 * @generated
	 */
	int ESCENARIO = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESCENARIO__ID = 0;

	/**
	 * The feature id for the '<em><b>Fuente</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESCENARIO__FUENTE = 1;

	/**
	 * The feature id for the '<em><b>Estimulo</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESCENARIO__ESTIMULO = 2;

	/**
	 * The feature id for the '<em><b>Medida</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESCENARIO__MEDIDA = 3;

	/**
	 * The number of structural features of the '<em>Escenario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESCENARIO_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Escenario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESCENARIO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link escenariosCalidad.impl.FuenteImpl <em>Fuente</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see escenariosCalidad.impl.FuenteImpl
	 * @see escenariosCalidad.impl.EscenariosCalidadPackageImpl#getFuente()
	 * @generated
	 */
	int FUENTE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUENTE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Fuente</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUENTE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Fuente</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUENTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link escenariosCalidad.impl.EstimuloImpl <em>Estimulo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see escenariosCalidad.impl.EstimuloImpl
	 * @see escenariosCalidad.impl.EscenariosCalidadPackageImpl#getEstimulo()
	 * @generated
	 */
	int ESTIMULO = 3;

	/**
	 * The feature id for the '<em><b>Artefacto</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTIMULO__ARTEFACTO = 0;

	/**
	 * The number of structural features of the '<em>Estimulo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTIMULO_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Estimulo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTIMULO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link escenariosCalidad.impl.MedidaRespuestaImpl <em>Medida Respuesta</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see escenariosCalidad.impl.MedidaRespuestaImpl
	 * @see escenariosCalidad.impl.EscenariosCalidadPackageImpl#getMedidaRespuesta()
	 * @generated
	 */
	int MEDIDA_RESPUESTA = 4;

	/**
	 * The feature id for the '<em><b>Metrica</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIDA_RESPUESTA__METRICA = 0;

	/**
	 * The feature id for the '<em><b>Valor Esperado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIDA_RESPUESTA__VALOR_ESPERADO = 1;

	/**
	 * The feature id for the '<em><b>Unidad</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIDA_RESPUESTA__UNIDAD = 2;

	/**
	 * The feature id for the '<em><b>Operador</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIDA_RESPUESTA__OPERADOR = 3;

	/**
	 * The number of structural features of the '<em>Medida Respuesta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIDA_RESPUESTA_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Medida Respuesta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIDA_RESPUESTA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link escenariosCalidad.impl.ArtefactoImpl <em>Artefacto</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see escenariosCalidad.impl.ArtefactoImpl
	 * @see escenariosCalidad.impl.EscenariosCalidadPackageImpl#getArtefacto()
	 * @generated
	 */
	int ARTEFACTO = 5;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTEFACTO__URL = 0;

	/**
	 * The number of structural features of the '<em>Artefacto</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTEFACTO_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Artefacto</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTEFACTO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link escenariosCalidad.impl.TestImpl <em>Test</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see escenariosCalidad.impl.TestImpl
	 * @see escenariosCalidad.impl.EscenariosCalidadPackageImpl#getTest()
	 * @generated
	 */
	int TEST = 6;

	/**
	 * The feature id for the '<em><b>Arquitecturas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST__ARQUITECTURAS = 0;

	/**
	 * The number of structural features of the '<em>Test</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Test</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link escenariosCalidad.Metrica <em>Metrica</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see escenariosCalidad.Metrica
	 * @see escenariosCalidad.impl.EscenariosCalidadPackageImpl#getMetrica()
	 * @generated
	 */
	int METRICA = 7;

	/**
	 * The meta object id for the '{@link escenariosCalidad.Operador <em>Operador</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see escenariosCalidad.Operador
	 * @see escenariosCalidad.impl.EscenariosCalidadPackageImpl#getOperador()
	 * @generated
	 */
	int OPERADOR = 8;

	/**
	 * The meta object id for the '{@link escenariosCalidad.Unidad <em>Unidad</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see escenariosCalidad.Unidad
	 * @see escenariosCalidad.impl.EscenariosCalidadPackageImpl#getUnidad()
	 * @generated
	 */
	int UNIDAD = 9;


	/**
	 * Returns the meta object for class '{@link escenariosCalidad.Arquitectura <em>Arquitectura</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arquitectura</em>'.
	 * @see escenariosCalidad.Arquitectura
	 * @generated
	 */
	EClass getArquitectura();

	/**
	 * Returns the meta object for the containment reference list '{@link escenariosCalidad.Arquitectura#getEscenarios <em>Escenarios</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Escenarios</em>'.
	 * @see escenariosCalidad.Arquitectura#getEscenarios()
	 * @see #getArquitectura()
	 * @generated
	 */
	EReference getArquitectura_Escenarios();

	/**
	 * Returns the meta object for the containment reference list '{@link escenariosCalidad.Arquitectura#getArtefactos <em>Artefactos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Artefactos</em>'.
	 * @see escenariosCalidad.Arquitectura#getArtefactos()
	 * @see #getArquitectura()
	 * @generated
	 */
	EReference getArquitectura_Artefactos();

	/**
	 * Returns the meta object for class '{@link escenariosCalidad.Escenario <em>Escenario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Escenario</em>'.
	 * @see escenariosCalidad.Escenario
	 * @generated
	 */
	EClass getEscenario();

	/**
	 * Returns the meta object for the attribute '{@link escenariosCalidad.Escenario#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see escenariosCalidad.Escenario#getId()
	 * @see #getEscenario()
	 * @generated
	 */
	EAttribute getEscenario_Id();

	/**
	 * Returns the meta object for the containment reference '{@link escenariosCalidad.Escenario#getFuente <em>Fuente</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fuente</em>'.
	 * @see escenariosCalidad.Escenario#getFuente()
	 * @see #getEscenario()
	 * @generated
	 */
	EReference getEscenario_Fuente();

	/**
	 * Returns the meta object for the containment reference '{@link escenariosCalidad.Escenario#getEstimulo <em>Estimulo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Estimulo</em>'.
	 * @see escenariosCalidad.Escenario#getEstimulo()
	 * @see #getEscenario()
	 * @generated
	 */
	EReference getEscenario_Estimulo();

	/**
	 * Returns the meta object for the containment reference '{@link escenariosCalidad.Escenario#getMedida <em>Medida</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Medida</em>'.
	 * @see escenariosCalidad.Escenario#getMedida()
	 * @see #getEscenario()
	 * @generated
	 */
	EReference getEscenario_Medida();

	/**
	 * Returns the meta object for class '{@link escenariosCalidad.Fuente <em>Fuente</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fuente</em>'.
	 * @see escenariosCalidad.Fuente
	 * @generated
	 */
	EClass getFuente();

	/**
	 * Returns the meta object for the attribute '{@link escenariosCalidad.Fuente#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see escenariosCalidad.Fuente#getName()
	 * @see #getFuente()
	 * @generated
	 */
	EAttribute getFuente_Name();

	/**
	 * Returns the meta object for class '{@link escenariosCalidad.Estimulo <em>Estimulo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Estimulo</em>'.
	 * @see escenariosCalidad.Estimulo
	 * @generated
	 */
	EClass getEstimulo();

	/**
	 * Returns the meta object for the reference '{@link escenariosCalidad.Estimulo#getArtefacto <em>Artefacto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Artefacto</em>'.
	 * @see escenariosCalidad.Estimulo#getArtefacto()
	 * @see #getEstimulo()
	 * @generated
	 */
	EReference getEstimulo_Artefacto();

	/**
	 * Returns the meta object for class '{@link escenariosCalidad.MedidaRespuesta <em>Medida Respuesta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Medida Respuesta</em>'.
	 * @see escenariosCalidad.MedidaRespuesta
	 * @generated
	 */
	EClass getMedidaRespuesta();

	/**
	 * Returns the meta object for the attribute '{@link escenariosCalidad.MedidaRespuesta#getMetrica <em>Metrica</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Metrica</em>'.
	 * @see escenariosCalidad.MedidaRespuesta#getMetrica()
	 * @see #getMedidaRespuesta()
	 * @generated
	 */
	EAttribute getMedidaRespuesta_Metrica();

	/**
	 * Returns the meta object for the attribute '{@link escenariosCalidad.MedidaRespuesta#getValorEsperado <em>Valor Esperado</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valor Esperado</em>'.
	 * @see escenariosCalidad.MedidaRespuesta#getValorEsperado()
	 * @see #getMedidaRespuesta()
	 * @generated
	 */
	EAttribute getMedidaRespuesta_ValorEsperado();

	/**
	 * Returns the meta object for the attribute '{@link escenariosCalidad.MedidaRespuesta#getUnidad <em>Unidad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unidad</em>'.
	 * @see escenariosCalidad.MedidaRespuesta#getUnidad()
	 * @see #getMedidaRespuesta()
	 * @generated
	 */
	EAttribute getMedidaRespuesta_Unidad();

	/**
	 * Returns the meta object for the attribute '{@link escenariosCalidad.MedidaRespuesta#getOperador <em>Operador</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operador</em>'.
	 * @see escenariosCalidad.MedidaRespuesta#getOperador()
	 * @see #getMedidaRespuesta()
	 * @generated
	 */
	EAttribute getMedidaRespuesta_Operador();

	/**
	 * Returns the meta object for class '{@link escenariosCalidad.Artefacto <em>Artefacto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Artefacto</em>'.
	 * @see escenariosCalidad.Artefacto
	 * @generated
	 */
	EClass getArtefacto();

	/**
	 * Returns the meta object for the attribute '{@link escenariosCalidad.Artefacto#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see escenariosCalidad.Artefacto#getUrl()
	 * @see #getArtefacto()
	 * @generated
	 */
	EAttribute getArtefacto_Url();

	/**
	 * Returns the meta object for class '{@link escenariosCalidad.Test <em>Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test</em>'.
	 * @see escenariosCalidad.Test
	 * @generated
	 */
	EClass getTest();

	/**
	 * Returns the meta object for the containment reference list '{@link escenariosCalidad.Test#getArquitecturas <em>Arquitecturas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arquitecturas</em>'.
	 * @see escenariosCalidad.Test#getArquitecturas()
	 * @see #getTest()
	 * @generated
	 */
	EReference getTest_Arquitecturas();

	/**
	 * Returns the meta object for enum '{@link escenariosCalidad.Metrica <em>Metrica</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Metrica</em>'.
	 * @see escenariosCalidad.Metrica
	 * @generated
	 */
	EEnum getMetrica();

	/**
	 * Returns the meta object for enum '{@link escenariosCalidad.Operador <em>Operador</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Operador</em>'.
	 * @see escenariosCalidad.Operador
	 * @generated
	 */
	EEnum getOperador();

	/**
	 * Returns the meta object for enum '{@link escenariosCalidad.Unidad <em>Unidad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Unidad</em>'.
	 * @see escenariosCalidad.Unidad
	 * @generated
	 */
	EEnum getUnidad();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EscenariosCalidadFactory getEscenariosCalidadFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link escenariosCalidad.impl.ArquitecturaImpl <em>Arquitectura</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see escenariosCalidad.impl.ArquitecturaImpl
		 * @see escenariosCalidad.impl.EscenariosCalidadPackageImpl#getArquitectura()
		 * @generated
		 */
		EClass ARQUITECTURA = eINSTANCE.getArquitectura();

		/**
		 * The meta object literal for the '<em><b>Escenarios</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARQUITECTURA__ESCENARIOS = eINSTANCE.getArquitectura_Escenarios();

		/**
		 * The meta object literal for the '<em><b>Artefactos</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARQUITECTURA__ARTEFACTOS = eINSTANCE.getArquitectura_Artefactos();

		/**
		 * The meta object literal for the '{@link escenariosCalidad.impl.EscenarioImpl <em>Escenario</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see escenariosCalidad.impl.EscenarioImpl
		 * @see escenariosCalidad.impl.EscenariosCalidadPackageImpl#getEscenario()
		 * @generated
		 */
		EClass ESCENARIO = eINSTANCE.getEscenario();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESCENARIO__ID = eINSTANCE.getEscenario_Id();

		/**
		 * The meta object literal for the '<em><b>Fuente</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESCENARIO__FUENTE = eINSTANCE.getEscenario_Fuente();

		/**
		 * The meta object literal for the '<em><b>Estimulo</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESCENARIO__ESTIMULO = eINSTANCE.getEscenario_Estimulo();

		/**
		 * The meta object literal for the '<em><b>Medida</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESCENARIO__MEDIDA = eINSTANCE.getEscenario_Medida();

		/**
		 * The meta object literal for the '{@link escenariosCalidad.impl.FuenteImpl <em>Fuente</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see escenariosCalidad.impl.FuenteImpl
		 * @see escenariosCalidad.impl.EscenariosCalidadPackageImpl#getFuente()
		 * @generated
		 */
		EClass FUENTE = eINSTANCE.getFuente();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUENTE__NAME = eINSTANCE.getFuente_Name();

		/**
		 * The meta object literal for the '{@link escenariosCalidad.impl.EstimuloImpl <em>Estimulo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see escenariosCalidad.impl.EstimuloImpl
		 * @see escenariosCalidad.impl.EscenariosCalidadPackageImpl#getEstimulo()
		 * @generated
		 */
		EClass ESTIMULO = eINSTANCE.getEstimulo();

		/**
		 * The meta object literal for the '<em><b>Artefacto</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESTIMULO__ARTEFACTO = eINSTANCE.getEstimulo_Artefacto();

		/**
		 * The meta object literal for the '{@link escenariosCalidad.impl.MedidaRespuestaImpl <em>Medida Respuesta</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see escenariosCalidad.impl.MedidaRespuestaImpl
		 * @see escenariosCalidad.impl.EscenariosCalidadPackageImpl#getMedidaRespuesta()
		 * @generated
		 */
		EClass MEDIDA_RESPUESTA = eINSTANCE.getMedidaRespuesta();

		/**
		 * The meta object literal for the '<em><b>Metrica</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDIDA_RESPUESTA__METRICA = eINSTANCE.getMedidaRespuesta_Metrica();

		/**
		 * The meta object literal for the '<em><b>Valor Esperado</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDIDA_RESPUESTA__VALOR_ESPERADO = eINSTANCE.getMedidaRespuesta_ValorEsperado();

		/**
		 * The meta object literal for the '<em><b>Unidad</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDIDA_RESPUESTA__UNIDAD = eINSTANCE.getMedidaRespuesta_Unidad();

		/**
		 * The meta object literal for the '<em><b>Operador</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDIDA_RESPUESTA__OPERADOR = eINSTANCE.getMedidaRespuesta_Operador();

		/**
		 * The meta object literal for the '{@link escenariosCalidad.impl.ArtefactoImpl <em>Artefacto</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see escenariosCalidad.impl.ArtefactoImpl
		 * @see escenariosCalidad.impl.EscenariosCalidadPackageImpl#getArtefacto()
		 * @generated
		 */
		EClass ARTEFACTO = eINSTANCE.getArtefacto();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARTEFACTO__URL = eINSTANCE.getArtefacto_Url();

		/**
		 * The meta object literal for the '{@link escenariosCalidad.impl.TestImpl <em>Test</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see escenariosCalidad.impl.TestImpl
		 * @see escenariosCalidad.impl.EscenariosCalidadPackageImpl#getTest()
		 * @generated
		 */
		EClass TEST = eINSTANCE.getTest();

		/**
		 * The meta object literal for the '<em><b>Arquitecturas</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST__ARQUITECTURAS = eINSTANCE.getTest_Arquitecturas();

		/**
		 * The meta object literal for the '{@link escenariosCalidad.Metrica <em>Metrica</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see escenariosCalidad.Metrica
		 * @see escenariosCalidad.impl.EscenariosCalidadPackageImpl#getMetrica()
		 * @generated
		 */
		EEnum METRICA = eINSTANCE.getMetrica();

		/**
		 * The meta object literal for the '{@link escenariosCalidad.Operador <em>Operador</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see escenariosCalidad.Operador
		 * @see escenariosCalidad.impl.EscenariosCalidadPackageImpl#getOperador()
		 * @generated
		 */
		EEnum OPERADOR = eINSTANCE.getOperador();

		/**
		 * The meta object literal for the '{@link escenariosCalidad.Unidad <em>Unidad</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see escenariosCalidad.Unidad
		 * @see escenariosCalidad.impl.EscenariosCalidadPackageImpl#getUnidad()
		 * @generated
		 */
		EEnum UNIDAD = eINSTANCE.getUnidad();

	}

} //EscenariosCalidadPackage