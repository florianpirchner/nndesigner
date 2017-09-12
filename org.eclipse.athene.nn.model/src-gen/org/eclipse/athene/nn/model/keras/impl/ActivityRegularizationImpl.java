/**
 */
package org.eclipse.athene.nn.model.keras.impl;

import org.eclipse.athene.nn.model.core.Shape2D;

import org.eclipse.athene.nn.model.keras.ActivityRegularization;
import org.eclipse.athene.nn.model.keras.KerasPackage;

import org.eclipse.athene.nn.model.tensorflow.impl.LayerImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity Regularization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.athene.nn.model.keras.impl.ActivityRegularizationImpl#getL1 <em>L1</em>}</li>
 *   <li>{@link org.eclipse.athene.nn.model.keras.impl.ActivityRegularizationImpl#getL2 <em>L2</em>}</li>
 *   <li>{@link org.eclipse.athene.nn.model.keras.impl.ActivityRegularizationImpl#getInputShape <em>Input Shape</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActivityRegularizationImpl extends LayerImpl implements ActivityRegularization {
	/**
	 * The default value of the '{@link #getL1() <em>L1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getL1()
	 * @generated
	 * @ordered
	 */
	protected static final int L1_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getL1() <em>L1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getL1()
	 * @generated
	 * @ordered
	 */
	protected int l1 = L1_EDEFAULT;

	/**
	 * The default value of the '{@link #getL2() <em>L2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getL2()
	 * @generated
	 * @ordered
	 */
	protected static final int L2_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getL2() <em>L2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getL2()
	 * @generated
	 * @ordered
	 */
	protected int l2 = L2_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInputShape() <em>Input Shape</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputShape()
	 * @generated
	 * @ordered
	 */
	protected Shape2D inputShape;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityRegularizationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KerasPackage.Literals.ACTIVITY_REGULARIZATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getL1() {
		return l1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setL1(int newL1) {
		int oldL1 = l1;
		l1 = newL1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KerasPackage.ACTIVITY_REGULARIZATION__L1, oldL1, l1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getL2() {
		return l2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setL2(int newL2) {
		int oldL2 = l2;
		l2 = newL2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KerasPackage.ACTIVITY_REGULARIZATION__L2, oldL2, l2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Shape2D getInputShape() {
		return inputShape;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInputShape(Shape2D newInputShape, NotificationChain msgs) {
		Shape2D oldInputShape = inputShape;
		inputShape = newInputShape;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KerasPackage.ACTIVITY_REGULARIZATION__INPUT_SHAPE, oldInputShape, newInputShape);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputShape(Shape2D newInputShape) {
		if (newInputShape != inputShape) {
			NotificationChain msgs = null;
			if (inputShape != null)
				msgs = ((InternalEObject)inputShape).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KerasPackage.ACTIVITY_REGULARIZATION__INPUT_SHAPE, null, msgs);
			if (newInputShape != null)
				msgs = ((InternalEObject)newInputShape).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KerasPackage.ACTIVITY_REGULARIZATION__INPUT_SHAPE, null, msgs);
			msgs = basicSetInputShape(newInputShape, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KerasPackage.ACTIVITY_REGULARIZATION__INPUT_SHAPE, newInputShape, newInputShape));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KerasPackage.ACTIVITY_REGULARIZATION__INPUT_SHAPE:
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
			case KerasPackage.ACTIVITY_REGULARIZATION__L1:
				return getL1();
			case KerasPackage.ACTIVITY_REGULARIZATION__L2:
				return getL2();
			case KerasPackage.ACTIVITY_REGULARIZATION__INPUT_SHAPE:
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
			case KerasPackage.ACTIVITY_REGULARIZATION__L1:
				setL1((Integer)newValue);
				return;
			case KerasPackage.ACTIVITY_REGULARIZATION__L2:
				setL2((Integer)newValue);
				return;
			case KerasPackage.ACTIVITY_REGULARIZATION__INPUT_SHAPE:
				setInputShape((Shape2D)newValue);
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
			case KerasPackage.ACTIVITY_REGULARIZATION__L1:
				setL1(L1_EDEFAULT);
				return;
			case KerasPackage.ACTIVITY_REGULARIZATION__L2:
				setL2(L2_EDEFAULT);
				return;
			case KerasPackage.ACTIVITY_REGULARIZATION__INPUT_SHAPE:
				setInputShape((Shape2D)null);
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
			case KerasPackage.ACTIVITY_REGULARIZATION__L1:
				return l1 != L1_EDEFAULT;
			case KerasPackage.ACTIVITY_REGULARIZATION__L2:
				return l2 != L2_EDEFAULT;
			case KerasPackage.ACTIVITY_REGULARIZATION__INPUT_SHAPE:
				return inputShape != null;
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
		result.append(" (l1: ");
		result.append(l1);
		result.append(", l2: ");
		result.append(l2);
		result.append(')');
		return result.toString();
	}

} //ActivityRegularizationImpl
