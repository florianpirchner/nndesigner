/**
 */
package org.eclipse.athene.nn.model.keras.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.athene.nn.model.core.Shape;

import org.eclipse.athene.nn.model.keras.InputNode;
import org.eclipse.athene.nn.model.keras.KerasFactory;
import org.eclipse.athene.nn.model.keras.KerasPackage;
import org.eclipse.athene.nn.model.keras.Layer;
import org.eclipse.athene.nn.model.keras.OutputNode;
import org.eclipse.athene.nn.model.keras.Reshape;
import org.eclipse.athene.nn.model.keras.SingleInputNodeProvider;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reshape</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.athene.nn.model.keras.impl.ReshapeImpl#getTargetShape <em>Target Shape</em>}</li>
 *   <li>{@link org.eclipse.athene.nn.model.keras.impl.ReshapeImpl#getInputShape <em>Input Shape</em>}</li>
 *   <li>{@link org.eclipse.athene.nn.model.keras.impl.ReshapeImpl#getOutputShape <em>Output Shape</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReshapeImpl extends LayerImpl implements Reshape {
	/**
	 * The cached value of the '{@link #getTargetShape() <em>Target Shape</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetShape()
	 * @generated
	 * @ordered
	 */
	protected Shape targetShape;

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
	 * The cached value of the '{@link #getOutputShape() <em>Output Shape</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputShape()
	 * @generated
	 * @ordered
	 */
	protected Shape outputShape;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReshapeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KerasPackage.Literals.RESHAPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Shape getTargetShape() {
		return targetShape;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTargetShape(Shape newTargetShape, NotificationChain msgs) {
		Shape oldTargetShape = targetShape;
		targetShape = newTargetShape;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KerasPackage.RESHAPE__TARGET_SHAPE, oldTargetShape, newTargetShape);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetShape(Shape newTargetShape) {
		if (newTargetShape != targetShape) {
			NotificationChain msgs = null;
			if (targetShape != null)
				msgs = ((InternalEObject)targetShape).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KerasPackage.RESHAPE__TARGET_SHAPE, null, msgs);
			if (newTargetShape != null)
				msgs = ((InternalEObject)newTargetShape).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KerasPackage.RESHAPE__TARGET_SHAPE, null, msgs);
			msgs = basicSetTargetShape(newTargetShape, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KerasPackage.RESHAPE__TARGET_SHAPE, newTargetShape, newTargetShape));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KerasPackage.RESHAPE__INPUT_SHAPE, oldInputShape, newInputShape);
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
				msgs = ((InternalEObject)inputShape).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KerasPackage.RESHAPE__INPUT_SHAPE, null, msgs);
			if (newInputShape != null)
				msgs = ((InternalEObject)newInputShape).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KerasPackage.RESHAPE__INPUT_SHAPE, null, msgs);
			msgs = basicSetInputShape(newInputShape, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KerasPackage.RESHAPE__INPUT_SHAPE, newInputShape, newInputShape));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Shape getOutputShape() {
		return outputShape;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutputShape(Shape newOutputShape, NotificationChain msgs) {
		Shape oldOutputShape = outputShape;
		outputShape = newOutputShape;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KerasPackage.RESHAPE__OUTPUT_SHAPE, oldOutputShape, newOutputShape);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutputShape(Shape newOutputShape) {
		if (newOutputShape != outputShape) {
			NotificationChain msgs = null;
			if (outputShape != null)
				msgs = ((InternalEObject)outputShape).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KerasPackage.RESHAPE__OUTPUT_SHAPE, null, msgs);
			if (newOutputShape != null)
				msgs = ((InternalEObject)newOutputShape).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KerasPackage.RESHAPE__OUTPUT_SHAPE, null, msgs);
			msgs = basicSetOutputShape(newOutputShape, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KerasPackage.RESHAPE__OUTPUT_SHAPE, newOutputShape, newOutputShape));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputNode createInputNode() {
		return KerasFactory.eINSTANCE.createSingleInputNode();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputNode creatOutputNode() {
		return KerasFactory.eINSTANCE.createOutputNode();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KerasPackage.RESHAPE__TARGET_SHAPE:
				return basicSetTargetShape(null, msgs);
			case KerasPackage.RESHAPE__INPUT_SHAPE:
				return basicSetInputShape(null, msgs);
			case KerasPackage.RESHAPE__OUTPUT_SHAPE:
				return basicSetOutputShape(null, msgs);
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
			case KerasPackage.RESHAPE__TARGET_SHAPE:
				return getTargetShape();
			case KerasPackage.RESHAPE__INPUT_SHAPE:
				return getInputShape();
			case KerasPackage.RESHAPE__OUTPUT_SHAPE:
				return getOutputShape();
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
			case KerasPackage.RESHAPE__TARGET_SHAPE:
				setTargetShape((Shape)newValue);
				return;
			case KerasPackage.RESHAPE__INPUT_SHAPE:
				setInputShape((Shape)newValue);
				return;
			case KerasPackage.RESHAPE__OUTPUT_SHAPE:
				setOutputShape((Shape)newValue);
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
			case KerasPackage.RESHAPE__TARGET_SHAPE:
				setTargetShape((Shape)null);
				return;
			case KerasPackage.RESHAPE__INPUT_SHAPE:
				setInputShape((Shape)null);
				return;
			case KerasPackage.RESHAPE__OUTPUT_SHAPE:
				setOutputShape((Shape)null);
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
			case KerasPackage.RESHAPE__TARGET_SHAPE:
				return targetShape != null;
			case KerasPackage.RESHAPE__INPUT_SHAPE:
				return inputShape != null;
			case KerasPackage.RESHAPE__OUTPUT_SHAPE:
				return outputShape != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == Layer.class) {
			switch (baseOperationID) {
				case KerasPackage.LAYER___CREATE_INPUT_NODE: return KerasPackage.RESHAPE___CREATE_INPUT_NODE;
				case KerasPackage.LAYER___CREAT_OUTPUT_NODE: return KerasPackage.RESHAPE___CREAT_OUTPUT_NODE;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == SingleInputNodeProvider.class) {
			switch (baseOperationID) {
				case KerasPackage.SINGLE_INPUT_NODE_PROVIDER___CREATE_INPUT_NODE: return KerasPackage.RESHAPE___CREATE_INPUT_NODE;
				case KerasPackage.SINGLE_INPUT_NODE_PROVIDER___CREAT_OUTPUT_NODE: return KerasPackage.RESHAPE___CREAT_OUTPUT_NODE;
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case KerasPackage.RESHAPE___CREATE_INPUT_NODE:
				return createInputNode();
			case KerasPackage.RESHAPE___CREAT_OUTPUT_NODE:
				return creatOutputNode();
		}
		return super.eInvoke(operationID, arguments);
	}

} //ReshapeImpl
