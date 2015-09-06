/**
 */
package escenariosCalidad.impl;

import escenariosCalidad.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EscenariosCalidadFactoryImpl extends EFactoryImpl implements EscenariosCalidadFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EscenariosCalidadFactory init() {
		try {
			EscenariosCalidadFactory theEscenariosCalidadFactory = (EscenariosCalidadFactory)EPackage.Registry.INSTANCE.getEFactory(EscenariosCalidadPackage.eNS_URI);
			if (theEscenariosCalidadFactory != null) {
				return theEscenariosCalidadFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EscenariosCalidadFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EscenariosCalidadFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case EscenariosCalidadPackage.ARQUITECTURA: return createArquitectura();
			case EscenariosCalidadPackage.ESCENARIO: return createEscenario();
			case EscenariosCalidadPackage.FUENTE: return createFuente();
			case EscenariosCalidadPackage.ESTIMULO: return createEstimulo();
			case EscenariosCalidadPackage.MEDIDA_RESPUESTA: return createMedidaRespuesta();
			case EscenariosCalidadPackage.ARTEFACTO: return createArtefacto();
			case EscenariosCalidadPackage.TEST: return createTest();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case EscenariosCalidadPackage.METRICA:
				return createMetricaFromString(eDataType, initialValue);
			case EscenariosCalidadPackage.OPERADOR:
				return createOperadorFromString(eDataType, initialValue);
			case EscenariosCalidadPackage.UNIDAD:
				return createUnidadFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case EscenariosCalidadPackage.METRICA:
				return convertMetricaToString(eDataType, instanceValue);
			case EscenariosCalidadPackage.OPERADOR:
				return convertOperadorToString(eDataType, instanceValue);
			case EscenariosCalidadPackage.UNIDAD:
				return convertUnidadToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Arquitectura createArquitectura() {
		ArquitecturaImpl arquitectura = new ArquitecturaImpl();
		return arquitectura;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Escenario createEscenario() {
		EscenarioImpl escenario = new EscenarioImpl();
		return escenario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fuente createFuente() {
		FuenteImpl fuente = new FuenteImpl();
		return fuente;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Estimulo createEstimulo() {
		EstimuloImpl estimulo = new EstimuloImpl();
		return estimulo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedidaRespuesta createMedidaRespuesta() {
		MedidaRespuestaImpl medidaRespuesta = new MedidaRespuestaImpl();
		return medidaRespuesta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Artefacto createArtefacto() {
		ArtefactoImpl artefacto = new ArtefactoImpl();
		return artefacto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Test createTest() {
		TestImpl test = new TestImpl();
		return test;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Metrica createMetricaFromString(EDataType eDataType, String initialValue) {
		Metrica result = Metrica.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMetricaToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operador createOperadorFromString(EDataType eDataType, String initialValue) {
		Operador result = Operador.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOperadorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Unidad createUnidadFromString(EDataType eDataType, String initialValue) {
		Unidad result = Unidad.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUnidadToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EscenariosCalidadPackage getEscenariosCalidadPackage() {
		return (EscenariosCalidadPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EscenariosCalidadPackage getPackage() {
		return EscenariosCalidadPackage.eINSTANCE;
	}

} //EscenariosCalidadFactoryImpl
