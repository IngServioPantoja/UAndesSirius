/**
 */
package escenariosCalidad;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Metrica</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see escenariosCalidad.EscenariosCalidadPackage#getMetrica()
 * @model
 * @generated
 */
public enum Metrica implements Enumerator {
	/**
	 * The '<em><b>Latency</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LATENCY_VALUE
	 * @generated
	 * @ordered
	 */
	LATENCY(1, "latency", "latency"),

	/**
	 * The '<em><b>Throughput</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #THROUGHPUT_VALUE
	 * @generated
	 * @ordered
	 */
	THROUGHPUT(2, "throughput", "throughput"),

	/**
	 * The '<em><b>Error Percentage</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ERROR_PERCENTAGE_VALUE
	 * @generated
	 * @ordered
	 */
	ERROR_PERCENTAGE(3, "errorPercentage", "errorPercentage"),

	/**
	 * The '<em><b>Response Code</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESPONSE_CODE_VALUE
	 * @generated
	 * @ordered
	 */
	RESPONSE_CODE(4, "responseCode", "responseCode");

	/**
	 * The '<em><b>Latency</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Latency</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LATENCY
	 * @model name="latency"
	 * @generated
	 * @ordered
	 */
	public static final int LATENCY_VALUE = 1;

	/**
	 * The '<em><b>Throughput</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Throughput</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #THROUGHPUT
	 * @model name="throughput"
	 * @generated
	 * @ordered
	 */
	public static final int THROUGHPUT_VALUE = 2;

	/**
	 * The '<em><b>Error Percentage</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Error Percentage</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ERROR_PERCENTAGE
	 * @model name="errorPercentage"
	 * @generated
	 * @ordered
	 */
	public static final int ERROR_PERCENTAGE_VALUE = 3;

	/**
	 * The '<em><b>Response Code</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Response Code</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RESPONSE_CODE
	 * @model name="responseCode"
	 * @generated
	 * @ordered
	 */
	public static final int RESPONSE_CODE_VALUE = 4;

	/**
	 * An array of all the '<em><b>Metrica</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Metrica[] VALUES_ARRAY =
		new Metrica[] {
			LATENCY,
			THROUGHPUT,
			ERROR_PERCENTAGE,
			RESPONSE_CODE,
		};

	/**
	 * A public read-only list of all the '<em><b>Metrica</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Metrica> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Metrica</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Metrica get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Metrica result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Metrica</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Metrica getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Metrica result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Metrica</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Metrica get(int value) {
		switch (value) {
			case LATENCY_VALUE: return LATENCY;
			case THROUGHPUT_VALUE: return THROUGHPUT;
			case ERROR_PERCENTAGE_VALUE: return ERROR_PERCENTAGE;
			case RESPONSE_CODE_VALUE: return RESPONSE_CODE;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Metrica(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //Metrica
