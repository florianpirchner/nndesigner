/**
 */
package org.eclipse.athene.nn.model.keras.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.athene.nn.model.keras.InputNode;
import org.eclipse.athene.nn.model.keras.KerasPackage;
import org.eclipse.athene.nn.model.keras.Layer;
import org.eclipse.athene.nn.model.keras.MultiInputNode;
import org.eclipse.athene.nn.model.keras.Node;
import org.eclipse.athene.nn.model.keras.Tensor;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Multi Input Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.athene.nn.model.keras.impl.MultiInputNodeImpl#getInputTensors <em>Input Tensors</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MultiInputNodeImpl extends InputNodeImpl implements MultiInputNode {
	/**
	 * The cached value of the '{@link #getInputTensors() <em>Input Tensors</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputTensors()
	 * @generated
	 * @ordered
	 */
	protected EList<Tensor> inputTensors;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MultiInputNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KerasPackage.Literals.MULTI_INPUT_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Tensor> getInputTensors() {
		if (inputTensors == null) {
			inputTensors = new EObjectResolvingEList<Tensor>(Tensor.class, this, KerasPackage.MULTI_INPUT_NODE__INPUT_TENSORS);
		}
		return inputTensors;
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
		this.getInputTensors().clear();
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
		EList<Tensor> _inputTensors = this.getInputTensors();
		_inputTensors.add(t);
		EList<InputNode> _consumingNodes = t.getConsumingNodes();
		_consumingNodes.add(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void deconnectInputTensor(final Tensor t) {
		EList<Tensor> _inputTensors = this.getInputTensors();
		_inputTensors.remove(t);
		EList<InputNode> _consumingNodes = t.getConsumingNodes();
		_consumingNodes.remove(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case KerasPackage.MULTI_INPUT_NODE__INPUT_TENSORS:
				return getInputTensors();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case KerasPackage.MULTI_INPUT_NODE__INPUT_TENSORS:
				getInputTensors().clear();
				getInputTensors().addAll((Collection<? extends Tensor>)newValue);
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
			case KerasPackage.MULTI_INPUT_NODE__INPUT_TENSORS:
				getInputTensors().clear();
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
			case KerasPackage.MULTI_INPUT_NODE__INPUT_TENSORS:
				return inputTensors != null && !inputTensors.isEmpty();
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
				case KerasPackage.NODE___REMOVE_FROM_LAYER: return KerasPackage.MULTI_INPUT_NODE___REMOVE_FROM_LAYER;
				case KerasPackage.NODE___AUTO_NAME: return KerasPackage.MULTI_INPUT_NODE___AUTO_NAME;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == InputNode.class) {
			switch (baseOperationID) {
				case KerasPackage.INPUT_NODE___CONNECT_INPUT_TENSOR__TENSOR: return KerasPackage.MULTI_INPUT_NODE___CONNECT_INPUT_TENSOR__TENSOR;
				case KerasPackage.INPUT_NODE___DECONNECT_INPUT_TENSOR__TENSOR: return KerasPackage.MULTI_INPUT_NODE___DECONNECT_INPUT_TENSOR__TENSOR;
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
			case KerasPackage.MULTI_INPUT_NODE___REMOVE_FROM_LAYER:
				removeFromLayer();
				return null;
			case KerasPackage.MULTI_INPUT_NODE___AUTO_NAME:
				autoName();
				return null;
			case KerasPackage.MULTI_INPUT_NODE___CONNECT_INPUT_TENSOR__TENSOR:
				connectInputTensor((Tensor)arguments.get(0));
				return null;
			case KerasPackage.MULTI_INPUT_NODE___DECONNECT_INPUT_TENSOR__TENSOR:
				deconnectInputTensor((Tensor)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //MultiInputNodeImpl
