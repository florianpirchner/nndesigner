/**
 */
package org.eclipse.athene.nn.model.keras.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.athene.nn.model.core.Shape2D;
import org.eclipse.athene.nn.model.core.Shape3D;

import org.eclipse.athene.nn.model.keras.InputNode;
import org.eclipse.athene.nn.model.keras.KerasFactory;
import org.eclipse.athene.nn.model.keras.KerasPackage;
import org.eclipse.athene.nn.model.keras.Layer;
import org.eclipse.athene.nn.model.keras.OutputNode;
import org.eclipse.athene.nn.model.keras.RepeatVector;
import org.eclipse.athene.nn.model.keras.SingleInputNodeProvider;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Repeat Vector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.athene.nn.model.keras.impl.RepeatVectorImpl#getNumberOfRepeats <em>Number Of Repeats</em>}</li>
 *   <li>{@link org.eclipse.athene.nn.model.keras.impl.RepeatVectorImpl#getInputShape <em>Input Shape</em>}</li>
 *   <li>{@link org.eclipse.athene.nn.model.keras.impl.RepeatVectorImpl#getOutputShape <em>Output Shape</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RepeatVectorImpl extends LayerImpl implements RepeatVector {
	/**
	 * The default value of the '{@link #getNumberOfRepeats() <em>Number Of Repeats</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfRepeats()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_OF_REPEATS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumberOfRepeats() <em>Number Of Repeats</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfRepeats()
	 * @generated
	 * @ordered
	 */
	protected int numberOfRepeats = NUMBER_OF_REPEATS_EDEFAULT;

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
	 * The cached value of the '{@link #getOutputShape() <em>Output Shape</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputShape()
	 * @generated
	 * @ordered
	 */
	protected Shape3D outputShape;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RepeatVectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KerasPackage.Literals.REPEAT_VECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumberOfRepeats() {
		return numberOfRepeats;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfRepeats(int newNumberOfRepeats) {
		int oldNumberOfRepeats = numberOfRepeats;
		numberOfRepeats = newNumberOfRepeats;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KerasPackage.REPEAT_VECTOR__NUMBER_OF_REPEATS, oldNumberOfRepeats, numberOfRepeats));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KerasPackage.REPEAT_VECTOR__INPUT_SHAPE, oldInputShape, newInputShape);
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
				msgs = ((InternalEObject)inputShape).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KerasPackage.REPEAT_VECTOR__INPUT_SHAPE, null, msgs);
			if (newInputShape != null)
				msgs = ((InternalEObject)newInputShape).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KerasPackage.REPEAT_VECTOR__INPUT_SHAPE, null, msgs);
			msgs = basicSetInputShape(newInputShape, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KerasPackage.REPEAT_VECTOR__INPUT_SHAPE, newInputShape, newInputShape));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Shape3D getOutputShape() {
		return outputShape;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutputShape(Shape3D newOutputShape, NotificationChain msgs) {
		Shape3D oldOutputShape = outputShape;
		outputShape = newOutputShape;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KerasPackage.REPEAT_VECTOR__OUTPUT_SHAPE, oldOutputShape, newOutputShape);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutputShape(Shape3D newOutputShape) {
		if (newOutputShape != outputShape) {
			NotificationChain msgs = null;
			if (outputShape != null)
				msgs = ((InternalEObject)outputShape).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KerasPackage.REPEAT_VECTOR__OUTPUT_SHAPE, null, msgs);
			if (newOutputShape != null)
				msgs = ((InternalEObject)newOutputShape).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KerasPackage.REPEAT_VECTOR__OUTPUT_SHAPE, null, msgs);
			msgs = basicSetOutputShape(newOutputShape, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KerasPackage.REPEAT_VECTOR__OUTPUT_SHAPE, newOutputShape, newOutputShape));
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
			case KerasPackage.REPEAT_VECTOR__INPUT_SHAPE:
				return basicSetInputShape(null, msgs);
			case KerasPackage.REPEAT_VECTOR__OUTPUT_SHAPE:
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
			case KerasPackage.REPEAT_VECTOR__NUMBER_OF_REPEATS:
				return getNumberOfRepeats();
			case KerasPackage.REPEAT_VECTOR__INPUT_SHAPE:
				return getInputShape();
			case KerasPackage.REPEAT_VECTOR__OUTPUT_SHAPE:
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
			case KerasPackage.REPEAT_VECTOR__NUMBER_OF_REPEATS:
				setNumberOfRepeats((Integer)newValue);
				return;
			case KerasPackage.REPEAT_VECTOR__INPUT_SHAPE:
				setInputShape((Shape2D)newValue);
				return;
			case KerasPackage.REPEAT_VECTOR__OUTPUT_SHAPE:
				setOutputShape((Shape3D)newValue);
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
			case KerasPackage.REPEAT_VECTOR__NUMBER_OF_REPEATS:
				setNumberOfRepeats(NUMBER_OF_REPEATS_EDEFAULT);
				return;
			case KerasPackage.REPEAT_VECTOR__INPUT_SHAPE:
				setInputShape((Shape2D)null);
				return;
			case KerasPackage.REPEAT_VECTOR__OUTPUT_SHAPE:
				setOutputShape((Shape3D)null);
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
			case KerasPackage.REPEAT_VECTOR__NUMBER_OF_REPEATS:
				return numberOfRepeats != NUMBER_OF_REPEATS_EDEFAULT;
			case KerasPackage.REPEAT_VECTOR__INPUT_SHAPE:
				return inputShape != null;
			case KerasPackage.REPEAT_VECTOR__OUTPUT_SHAPE:
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
				case KerasPackage.LAYER___CREATE_INPUT_NODE: return KerasPackage.REPEAT_VECTOR___CREATE_INPUT_NODE;
				case KerasPackage.LAYER___CREAT_OUTPUT_NODE: return KerasPackage.REPEAT_VECTOR___CREAT_OUTPUT_NODE;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == SingleInputNodeProvider.class) {
			switch (baseOperationID) {
				case KerasPackage.SINGLE_INPUT_NODE_PROVIDER___CREATE_INPUT_NODE: return KerasPackage.REPEAT_VECTOR___CREATE_INPUT_NODE;
				case KerasPackage.SINGLE_INPUT_NODE_PROVIDER___CREAT_OUTPUT_NODE: return KerasPackage.REPEAT_VECTOR___CREAT_OUTPUT_NODE;
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
			case KerasPackage.REPEAT_VECTOR___CREATE_INPUT_NODE:
				return createInputNode();
			case KerasPackage.REPEAT_VECTOR___CREAT_OUTPUT_NODE:
				return creatOutputNode();
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (numberOfRepeats: ");
		result.append(numberOfRepeats);
		result.append(')');
		return result.toString();
	}

} //RepeatVectorImpl
