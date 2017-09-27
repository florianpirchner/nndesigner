/**
 */
package org.eclipse.athene.nn.model.keras.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.athene.nn.model.keras.InputNode;
import org.eclipse.athene.nn.model.keras.KerasPackage;
import org.eclipse.athene.nn.model.keras.Layer;
import org.eclipse.athene.nn.model.keras.Node;
import org.eclipse.athene.nn.model.keras.SingleInputNode;
import org.eclipse.athene.nn.model.keras.Tensor;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Single Input Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.athene.nn.model.keras.impl.SingleInputNodeImpl#getInputTensor <em>Input Tensor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SingleInputNodeImpl extends InputNodeImpl implements SingleInputNode {
	/**
	 * The cached value of the '{@link #getInputTensor() <em>Input Tensor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputTensor()
	 * @generated
	 * @ordered
	 */
	protected Tensor inputTensor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SingleInputNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KerasPackage.Literals.SINGLE_INPUT_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tensor getInputTensor() {
		if (inputTensor != null && inputTensor.eIsProxy()) {
			InternalEObject oldInputTensor = (InternalEObject)inputTensor;
			inputTensor = (Tensor)eResolveProxy(oldInputTensor);
			if (inputTensor != oldInputTensor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, KerasPackage.SINGLE_INPUT_NODE__INPUT_TENSOR, oldInputTensor, inputTensor));
			}
		}
		return inputTensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tensor basicGetInputTensor() {
		return inputTensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputTensor(Tensor newInputTensor) {
		Tensor oldInputTensor = inputTensor;
		inputTensor = newInputTensor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KerasPackage.SINGLE_INPUT_NODE__INPUT_TENSOR, oldInputTensor, inputTensor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeFromLayer() {
		Layer _layer = this.getLayer();
		boolean _tripleEquals = (_layer == null);
		if (_tripleEquals) {
			return;
		}
		this.setLayer(null);
		this.setInputTensor(null);
		this.getConnectedNode().removeFromLayer();
		this.setConnectedNode(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void autoName() {
		int _size = this.getLayer().getInputNodes().size();
		String _plus = ("I" + Integer.valueOf(_size));
		this.setName(_plus);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void connectInputTensor(final Tensor t) {
		this.setInputTensor(t);
		EList<InputNode> _consumingNodes = t.getConsumingNodes();
		_consumingNodes.add(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void deconnectInputTensor(final Tensor t) {
		Tensor _inputTensor = this.getInputTensor();
		boolean _tripleEquals = (_inputTensor == t);
		if (_tripleEquals) {
			this.setInputTensor(t);
			EList<InputNode> _consumingNodes = t.getConsumingNodes();
			_consumingNodes.remove(this);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case KerasPackage.SINGLE_INPUT_NODE__INPUT_TENSOR:
				if (resolve) return getInputTensor();
				return basicGetInputTensor();
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
			case KerasPackage.SINGLE_INPUT_NODE__INPUT_TENSOR:
				setInputTensor((Tensor)newValue);
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
			case KerasPackage.SINGLE_INPUT_NODE__INPUT_TENSOR:
				setInputTensor((Tensor)null);
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
			case KerasPackage.SINGLE_INPUT_NODE__INPUT_TENSOR:
				return inputTensor != null;
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
		if (baseClass == Node.class) {
			switch (baseOperationID) {
				case KerasPackage.NODE___REMOVE_FROM_LAYER: return KerasPackage.SINGLE_INPUT_NODE___REMOVE_FROM_LAYER;
				case KerasPackage.NODE___AUTO_NAME: return KerasPackage.SINGLE_INPUT_NODE___AUTO_NAME;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == InputNode.class) {
			switch (baseOperationID) {
				case KerasPackage.INPUT_NODE___CONNECT_INPUT_TENSOR__TENSOR: return KerasPackage.SINGLE_INPUT_NODE___CONNECT_INPUT_TENSOR__TENSOR;
				case KerasPackage.INPUT_NODE___DECONNECT_INPUT_TENSOR__TENSOR: return KerasPackage.SINGLE_INPUT_NODE___DECONNECT_INPUT_TENSOR__TENSOR;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
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
			case KerasPackage.SINGLE_INPUT_NODE___REMOVE_FROM_LAYER:
				removeFromLayer();
				return null;
			case KerasPackage.SINGLE_INPUT_NODE___AUTO_NAME:
				autoName();
				return null;
			case KerasPackage.SINGLE_INPUT_NODE___CONNECT_INPUT_TENSOR__TENSOR:
				connectInputTensor((Tensor)arguments.get(0));
				return null;
			case KerasPackage.SINGLE_INPUT_NODE___DECONNECT_INPUT_TENSOR__TENSOR:
				deconnectInputTensor((Tensor)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //SingleInputNodeImpl
