/**
 */
package org.eclipse.athene.nn.model.keras.impl;

import org.eclipse.athene.nn.model.keras.Backend;
import org.eclipse.athene.nn.model.keras.KerasPackage;
import org.eclipse.athene.nn.model.keras.Model;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.athene.nn.model.keras.impl.ModelImpl#getKerasVersion <em>Keras Version</em>}</li>
 *   <li>{@link org.eclipse.athene.nn.model.keras.impl.ModelImpl#getBackend <em>Backend</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelImpl extends org.eclipse.athene.nn.model.core.impl.ModelImpl implements Model {
	/**
	 * The default value of the '{@link #getKerasVersion() <em>Keras Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKerasVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String KERAS_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKerasVersion() <em>Keras Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKerasVersion()
	 * @generated
	 * @ordered
	 */
	protected String kerasVersion = KERAS_VERSION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBackend() <em>Backend</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackend()
	 * @generated
	 * @ordered
	 */
	protected Backend backend;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KerasPackage.Literals.MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getKerasVersion() {
		return kerasVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKerasVersion(String newKerasVersion) {
		String oldKerasVersion = kerasVersion;
		kerasVersion = newKerasVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KerasPackage.MODEL__KERAS_VERSION, oldKerasVersion, kerasVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Backend getBackend() {
		if (backend != null && backend.eIsProxy()) {
			InternalEObject oldBackend = (InternalEObject)backend;
			backend = (Backend)eResolveProxy(oldBackend);
			if (backend != oldBackend) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, KerasPackage.MODEL__BACKEND, oldBackend, backend));
			}
		}
		return backend;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Backend basicGetBackend() {
		return backend;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBackend(Backend newBackend) {
		Backend oldBackend = backend;
		backend = newBackend;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KerasPackage.MODEL__BACKEND, oldBackend, backend));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case KerasPackage.MODEL__KERAS_VERSION:
				return getKerasVersion();
			case KerasPackage.MODEL__BACKEND:
				if (resolve) return getBackend();
				return basicGetBackend();
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
			case KerasPackage.MODEL__KERAS_VERSION:
				setKerasVersion((String)newValue);
				return;
			case KerasPackage.MODEL__BACKEND:
				setBackend((Backend)newValue);
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
			case KerasPackage.MODEL__KERAS_VERSION:
				setKerasVersion(KERAS_VERSION_EDEFAULT);
				return;
			case KerasPackage.MODEL__BACKEND:
				setBackend((Backend)null);
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
			case KerasPackage.MODEL__KERAS_VERSION:
				return KERAS_VERSION_EDEFAULT == null ? kerasVersion != null : !KERAS_VERSION_EDEFAULT.equals(kerasVersion);
			case KerasPackage.MODEL__BACKEND:
				return backend != null;
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
		result.append(" (kerasVersion: ");
		result.append(kerasVersion);
		result.append(')');
		return result.toString();
	}

} //ModelImpl
