/**
 */
package escenariosCalidad.impl;

import escenariosCalidad.Escenario;
import escenariosCalidad.EscenariosCalidadPackage;
import escenariosCalidad.Estimulo;
import escenariosCalidad.Fuente;
import escenariosCalidad.MedidaRespuesta;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Escenario</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link escenariosCalidad.impl.EscenarioImpl#getId <em>Id</em>}</li>
 *   <li>{@link escenariosCalidad.impl.EscenarioImpl#getFuente <em>Fuente</em>}</li>
 *   <li>{@link escenariosCalidad.impl.EscenarioImpl#getEstimulo <em>Estimulo</em>}</li>
 *   <li>{@link escenariosCalidad.impl.EscenarioImpl#getMedida <em>Medida</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EscenarioImpl extends MinimalEObjectImpl.Container implements Escenario {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFuente() <em>Fuente</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFuente()
	 * @generated
	 * @ordered
	 */
	protected Fuente fuente;

	/**
	 * The cached value of the '{@link #getEstimulo() <em>Estimulo</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstimulo()
	 * @generated
	 * @ordered
	 */
	protected Estimulo estimulo;

	/**
	 * The cached value of the '{@link #getMedida() <em>Medida</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedida()
	 * @generated
	 * @ordered
	 */
	protected MedidaRespuesta medida;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EscenarioImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EscenariosCalidadPackage.Literals.ESCENARIO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EscenariosCalidadPackage.ESCENARIO__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fuente getFuente() {
		return fuente;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFuente(Fuente newFuente, NotificationChain msgs) {
		Fuente oldFuente = fuente;
		fuente = newFuente;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EscenariosCalidadPackage.ESCENARIO__FUENTE, oldFuente, newFuente);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFuente(Fuente newFuente) {
		if (newFuente != fuente) {
			NotificationChain msgs = null;
			if (fuente != null)
				msgs = ((InternalEObject)fuente).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EscenariosCalidadPackage.ESCENARIO__FUENTE, null, msgs);
			if (newFuente != null)
				msgs = ((InternalEObject)newFuente).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EscenariosCalidadPackage.ESCENARIO__FUENTE, null, msgs);
			msgs = basicSetFuente(newFuente, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EscenariosCalidadPackage.ESCENARIO__FUENTE, newFuente, newFuente));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Estimulo getEstimulo() {
		return estimulo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEstimulo(Estimulo newEstimulo, NotificationChain msgs) {
		Estimulo oldEstimulo = estimulo;
		estimulo = newEstimulo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EscenariosCalidadPackage.ESCENARIO__ESTIMULO, oldEstimulo, newEstimulo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstimulo(Estimulo newEstimulo) {
		if (newEstimulo != estimulo) {
			NotificationChain msgs = null;
			if (estimulo != null)
				msgs = ((InternalEObject)estimulo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EscenariosCalidadPackage.ESCENARIO__ESTIMULO, null, msgs);
			if (newEstimulo != null)
				msgs = ((InternalEObject)newEstimulo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EscenariosCalidadPackage.ESCENARIO__ESTIMULO, null, msgs);
			msgs = basicSetEstimulo(newEstimulo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EscenariosCalidadPackage.ESCENARIO__ESTIMULO, newEstimulo, newEstimulo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedidaRespuesta getMedida() {
		return medida;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMedida(MedidaRespuesta newMedida, NotificationChain msgs) {
		MedidaRespuesta oldMedida = medida;
		medida = newMedida;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EscenariosCalidadPackage.ESCENARIO__MEDIDA, oldMedida, newMedida);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMedida(MedidaRespuesta newMedida) {
		if (newMedida != medida) {
			NotificationChain msgs = null;
			if (medida != null)
				msgs = ((InternalEObject)medida).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EscenariosCalidadPackage.ESCENARIO__MEDIDA, null, msgs);
			if (newMedida != null)
				msgs = ((InternalEObject)newMedida).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EscenariosCalidadPackage.ESCENARIO__MEDIDA, null, msgs);
			msgs = basicSetMedida(newMedida, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EscenariosCalidadPackage.ESCENARIO__MEDIDA, newMedida, newMedida));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EscenariosCalidadPackage.ESCENARIO__FUENTE:
				return basicSetFuente(null, msgs);
			case EscenariosCalidadPackage.ESCENARIO__ESTIMULO:
				return basicSetEstimulo(null, msgs);
			case EscenariosCalidadPackage.ESCENARIO__MEDIDA:
				return basicSetMedida(null, msgs);
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
			case EscenariosCalidadPackage.ESCENARIO__ID:
				return getId();
			case EscenariosCalidadPackage.ESCENARIO__FUENTE:
				return getFuente();
			case EscenariosCalidadPackage.ESCENARIO__ESTIMULO:
				return getEstimulo();
			case EscenariosCalidadPackage.ESCENARIO__MEDIDA:
				return getMedida();
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
			case EscenariosCalidadPackage.ESCENARIO__ID:
				setId((String)newValue);
				return;
			case EscenariosCalidadPackage.ESCENARIO__FUENTE:
				setFuente((Fuente)newValue);
				return;
			case EscenariosCalidadPackage.ESCENARIO__ESTIMULO:
				setEstimulo((Estimulo)newValue);
				return;
			case EscenariosCalidadPackage.ESCENARIO__MEDIDA:
				setMedida((MedidaRespuesta)newValue);
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
			case EscenariosCalidadPackage.ESCENARIO__ID:
				setId(ID_EDEFAULT);
				return;
			case EscenariosCalidadPackage.ESCENARIO__FUENTE:
				setFuente((Fuente)null);
				return;
			case EscenariosCalidadPackage.ESCENARIO__ESTIMULO:
				setEstimulo((Estimulo)null);
				return;
			case EscenariosCalidadPackage.ESCENARIO__MEDIDA:
				setMedida((MedidaRespuesta)null);
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
			case EscenariosCalidadPackage.ESCENARIO__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case EscenariosCalidadPackage.ESCENARIO__FUENTE:
				return fuente != null;
			case EscenariosCalidadPackage.ESCENARIO__ESTIMULO:
				return estimulo != null;
			case EscenariosCalidadPackage.ESCENARIO__MEDIDA:
				return medida != null;
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
		result.append(" (id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //EscenarioImpl
