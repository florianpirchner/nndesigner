/**
 */
package org.eclipse.athene.nn.model.keras.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.athene.nn.model.keras.InputNode;
import org.eclipse.athene.nn.model.keras.KerasPackage;
import org.eclipse.athene.nn.model.keras.Layer;
import org.eclipse.athene.nn.model.keras.Node;
import org.eclipse.athene.nn.model.keras.OutputNode;
import org.eclipse.athene.nn.model.keras.Tensor;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Input Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.athene.nn.model.keras.impl.InputNodeImpl#getLayer <em>Layer</em>}</li>
 *   <li>{@link org.eclipse.athene.nn.model.keras.impl.InputNodeImpl#getInputTensor <em>Input Tensor</em>}</li>
 *   <li>{@link org.eclipse.athene.nn.model.keras.impl.InputNodeImpl#getConnectedNode <em>Connected Node</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InputNodeImpl extends NodeImpl implements InputNode {
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
	 * The cached value of the '{@link #getConnectedNode() <em>Connected Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectedNode()
	 * @generated
	 * @ordered
	 */
	protected OutputNode connectedNode;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InputNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KerasPackage.Literals.INPUT_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Layer getLayer() {
		if (eContainerFeatureID() != KerasPackage.INPUT_NODE__LAYER) return null;
		return (Layer)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Layer basicGetLayer() {
		if (eContainerFeatureID() != KerasPackage.INPUT_NODE__LAYER) return null;
		return (Layer)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLayer(Layer newLayer, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newLayer, KerasPackage.INPUT_NODE__LAYER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLayer(Layer newLayer) {
		if (newLayer != eInternalContainer() || (eContainerFeatureID() != KerasPackage.INPUT_NODE__LAYER && newLayer != null)) {
			if (EcoreUtil.isAncestor(this, newLayer))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newLayer != null)
				msgs = ((InternalEObject)newLayer).eInverseAdd(this, KerasPackage.LAYER__INPUT_NODES, Layer.class, msgs);
			msgs = basicSetLayer(newLayer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KerasPackage.INPUT_NODE__LAYER, newLayer, newLayer));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, KerasPackage.INPUT_NODE__INPUT_TENSOR, oldInputTensor, inputTensor));
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
	public NotificationChain basicSetInputTensor(Tensor newInputTensor, NotificationChain msgs) {
		Tensor oldInputTensor = inputTensor;
		inputTensor = newInputTensor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KerasPackage.INPUT_NODE__INPUT_TENSOR, oldInputTensor, newInputTensor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputTensor(Tensor newInputTensor) {
		if (newInputTensor != inputTensor) {
			NotificationChain msgs = null;
			if (inputTensor != null)
				msgs = ((InternalEObject)inputTensor).eInverseRemove(this, KerasPackage.TENSOR__CONSUMING_NODES, Tensor.class, msgs);
			if (newInputTensor != null)
				msgs = ((InternalEObject)newInputTensor).eInverseAdd(this, KerasPackage.TENSOR__CONSUMING_NODES, Tensor.class, msgs);
			msgs = basicSetInputTensor(newInputTensor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KerasPackage.INPUT_NODE__INPUT_TENSOR, newInputTensor, newInputTensor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputNode getConnectedNode() {
		if (connectedNode != null && connectedNode.eIsProxy()) {
			InternalEObject oldConnectedNode = (InternalEObject)connectedNode;
			connectedNode = (OutputNode)eResolveProxy(oldConnectedNode);
			if (connectedNode != oldConnectedNode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, KerasPackage.INPUT_NODE__CONNECTED_NODE, oldConnectedNode, connectedNode));
			}
		}
		return connectedNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputNode basicGetConnectedNode() {
		return connectedNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConnectedNode(OutputNode newConnectedNode, NotificationChain msgs) {
		OutputNode oldConnectedNode = connectedNode;
		connectedNode = newConnectedNode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KerasPackage.INPUT_NODE__CONNECTED_NODE, oldConnectedNode, newConnectedNode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnectedNode(OutputNode newConnectedNode) {
		if (newConnectedNode != connectedNode) {
			NotificationChain msgs = null;
			if (connectedNode != null)
				msgs = ((InternalEObject)connectedNode).eInverseRemove(this, KerasPackage.OUTPUT_NODE__CONNECTED_NODE, OutputNode.class, msgs);
			if (newConnectedNode != null)
				msgs = ((InternalEObject)newConnectedNode).eInverseAdd(this, KerasPackage.OUTPUT_NODE__CONNECTED_NODE, OutputNode.class, msgs);
			msgs = basicSetConnectedNode(newConnectedNode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KerasPackage.INPUT_NODE__CONNECTED_NODE, newConnectedNode, newConnectedNode));
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
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KerasPackage.INPUT_NODE__LAYER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetLayer((Layer)otherEnd, msgs);
			case KerasPackage.INPUT_NODE__INPUT_TENSOR:
				if (inputTensor != null)
					msgs = ((InternalEObject)inputTensor).eInverseRemove(this, KerasPackage.TENSOR__CONSUMING_NODES, Tensor.class, msgs);
				return basicSetInputTensor((Tensor)otherEnd, msgs);
			case KerasPackage.INPUT_NODE__CONNECTED_NODE:
				if (connectedNode != null)
					msgs = ((InternalEObject)connectedNode).eInverseRemove(this, KerasPackage.OUTPUT_NODE__CONNECTED_NODE, OutputNode.class, msgs);
				return basicSetConnectedNode((OutputNode)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KerasPackage.INPUT_NODE__LAYER:
				return basicSetLayer(null, msgs);
			case KerasPackage.INPUT_NODE__INPUT_TENSOR:
				return basicSetInputTensor(null, msgs);
			case KerasPackage.INPUT_NODE__CONNECTED_NODE:
				return basicSetConnectedNode(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case KerasPackage.INPUT_NODE__LAYER:
				return eInternalContainer().eInverseRemove(this, KerasPackage.LAYER__INPUT_NODES, Layer.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case KerasPackage.INPUT_NODE__LAYER:
				if (resolve) return getLayer();
				return basicGetLayer();
			case KerasPackage.INPUT_NODE__INPUT_TENSOR:
				if (resolve) return getInputTensor();
				return basicGetInputTensor();
			case KerasPackage.INPUT_NODE__CONNECTED_NODE:
				if (resolve) return getConnectedNode();
				return basicGetConnectedNode();
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
			case KerasPackage.INPUT_NODE__LAYER:
				setLayer((Layer)newValue);
				return;
			case KerasPackage.INPUT_NODE__INPUT_TENSOR:
				setInputTensor((Tensor)newValue);
				return;
			case KerasPackage.INPUT_NODE__CONNECTED_NODE:
				setConnectedNode((OutputNode)newValue);
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
			case KerasPackage.INPUT_NODE__LAYER:
				setLayer((Layer)null);
				return;
			case KerasPackage.INPUT_NODE__INPUT_TENSOR:
				setInputTensor((Tensor)null);
				return;
			case KerasPackage.INPUT_NODE__CONNECTED_NODE:
				setConnectedNode((OutputNode)null);
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
			case KerasPackage.INPUT_NODE__LAYER:
				return basicGetLayer() != null;
			case KerasPackage.INPUT_NODE__INPUT_TENSOR:
				return inputTensor != null;
			case KerasPackage.INPUT_NODE__CONNECTED_NODE:
				return connectedNode != null;
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
				case KerasPackage.NODE___REMOVE_FROM_LAYER: return KerasPackage.INPUT_NODE___REMOVE_FROM_LAYER;
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
			case KerasPackage.INPUT_NODE___REMOVE_FROM_LAYER:
				removeFromLayer();
				return null;
			case KerasPackage.INPUT_NODE___AUTO_NAME:
				autoName();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //InputNodeImpl
