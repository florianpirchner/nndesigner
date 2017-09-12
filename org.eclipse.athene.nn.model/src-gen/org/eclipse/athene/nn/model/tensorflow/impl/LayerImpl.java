/**
 */
package org.eclipse.athene.nn.model.tensorflow.impl;

import org.eclipse.athene.nn.model.tensorflow.Layer;
import org.eclipse.athene.nn.model.tensorflow.TensorflowPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Layer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.athene.nn.model.tensorflow.impl.LayerImpl#isTrainable <em>Trainable</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LayerImpl extends org.eclipse.athene.nn.model.core.impl.LayerImpl implements Layer {
	/**
	 * The default value of the '{@link #isTrainable() <em>Trainable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTrainable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TRAINABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isTrainable() <em>Trainable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTrainable()
	 * @generated
	 * @ordered
	 */
	protected boolean trainable = TRAINABLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LayerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TensorflowPackage.Literals.LAYER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTrainable() {
		return trainable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrainable(boolean newTrainable) {
		boolean oldTrainable = trainable;
		trainable = newTrainable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TensorflowPackage.LAYER__TRAINABLE, oldTrainable, trainable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TensorflowPackage.LAYER__TRAINABLE:
				return isTrainable();
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
			case TensorflowPackage.LAYER__TRAINABLE:
				setTrainable((Boolean)newValue);
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
			case TensorflowPackage.LAYER__TRAINABLE:
				setTrainable(TRAINABLE_EDEFAULT);
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
			case TensorflowPackage.LAYER__TRAINABLE:
				return trainable != TRAINABLE_EDEFAULT;
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
		result.append(" (trainable: ");
		result.append(trainable);
		result.append(')');
		return result.toString();
	}

} //LayerImpl
