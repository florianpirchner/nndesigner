/**
 */
package org.eclipse.athene.nn.model.keras.impl;

import org.eclipse.athene.nn.model.core.ActivationFunction;
import org.eclipse.athene.nn.model.core.Shape;

import org.eclipse.athene.nn.model.keras.Activation;
import org.eclipse.athene.nn.model.keras.KerasPackage;

import org.eclipse.athene.nn.model.tensorflow.impl.LayerImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.athene.nn.model.keras.impl.ActivationImpl#getActivationFunction <em>Activation Function</em>}</li>
 *   <li>{@link org.eclipse.athene.nn.model.keras.impl.ActivationImpl#getInputShape <em>Input Shape</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActivationImpl extends LayerImpl implements Activation {
	/**
	 * The cached value of the '{@link #getActivationFunction() <em>Activation Function</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivationFunction()
	 * @generated
	 * @ordered
	 */
	protected ActivationFunction activationFunction;

	/**
	 * The cached value of the '{@link #getInputShape() <em>Input Shape</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputShape()
	 * @generated
	 * @ordered
	 */
	protected Shape inputShape;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KerasPackage.Literals.ACTIVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivationFunction getActivationFunction() {
		if (activationFunction != null && activationFunction.eIsProxy()) {
			InternalEObject oldActivationFunction = (InternalEObject)activationFunction;
			activationFunction = (ActivationFunction)eResolveProxy(oldActivationFunction);
			if (activationFunction != oldActivationFunction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, KerasPackage.ACTIVATION__ACTIVATION_FUNCTION, oldActivationFunction, activationFunction));
			}
		}
		return activationFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivationFunction basicGetActivationFunction() {
		return activationFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivationFunction(ActivationFunction newActivationFunction) {
		ActivationFunction oldActivationFunction = activationFunction;
		activationFunction = newActivationFunction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KerasPackage.ACTIVATION__ACTIVATION_FUNCTION, oldActivationFunction, activationFunction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Shape getInputShape() {
		return inputShape;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInputShape(Shape newInputShape, NotificationChain msgs) {
		Shape oldInputShape = inputShape;
		inputShape = newInputShape;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KerasPackage.ACTIVATION__INPUT_SHAPE, oldInputShape, newInputShape);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputShape(Shape newInputShape) {
		if (newInputShape != inputShape) {
			NotificationChain msgs = null;
			if (inputShape != null)
				msgs = ((InternalEObject)inputShape).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KerasPackage.ACTIVATION__INPUT_SHAPE, null, msgs);
			if (newInputShape != null)
				msgs = ((InternalEObject)newInputShape).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KerasPackage.ACTIVATION__INPUT_SHAPE, null, msgs);
			msgs = basicSetInputShape(newInputShape, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KerasPackage.ACTIVATION__INPUT_SHAPE, newInputShape, newInputShape));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KerasPackage.ACTIVATION__INPUT_SHAPE:
				return basicSetInputShape(null, msgs);
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
			case KerasPackage.ACTIVATION__ACTIVATION_FUNCTION:
				if (resolve) return getActivationFunction();
				return basicGetActivationFunction();
			case KerasPackage.ACTIVATION__INPUT_SHAPE:
				return getInputShape();
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
			case KerasPackage.ACTIVATION__ACTIVATION_FUNCTION:
				setActivationFunction((ActivationFunction)newValue);
				return;
			case KerasPackage.ACTIVATION__INPUT_SHAPE:
				setInputShape((Shape)newValue);
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
			case KerasPackage.ACTIVATION__ACTIVATION_FUNCTION:
				setActivationFunction((ActivationFunction)null);
				return;
			case KerasPackage.ACTIVATION__INPUT_SHAPE:
				setInputShape((Shape)null);
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
			case KerasPackage.ACTIVATION__ACTIVATION_FUNCTION:
				return activationFunction != null;
			case KerasPackage.ACTIVATION__INPUT_SHAPE:
				return inputShape != null;
		}
		return super.eIsSet(featureID);
	}

} //ActivationImpl
