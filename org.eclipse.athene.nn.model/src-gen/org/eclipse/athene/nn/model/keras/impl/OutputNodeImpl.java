/**
 */
package org.eclipse.athene.nn.model.keras.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.athene.nn.model.keras.InputNode;
import org.eclipse.athene.nn.model.keras.KerasFactory;
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
 * An implementation of the model object '<em><b>Output Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.athene.nn.model.keras.impl.OutputNodeImpl#getLayer <em>Layer</em>}</li>
 *   <li>{@link org.eclipse.athene.nn.model.keras.impl.OutputNodeImpl#getOutputTensor <em>Output Tensor</em>}</li>
 *   <li>{@link org.eclipse.athene.nn.model.keras.impl.OutputNodeImpl#getConnectedNode <em>Connected Node</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OutputNodeImpl extends NodeImpl implements OutputNode {
	/**
	 * The cached value of the '{@link #getOutputTensor() <em>Output Tensor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputTensor()
	 * @generated
	 * @ordered
	 */
	protected Tensor outputTensor;

	/**
	 * The cached value of the '{@link #getConnectedNode() <em>Connected Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectedNode()
	 * @generated
	 * @ordered
	 */
	protected InputNode connectedNode;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutputNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KerasPackage.Literals.OUTPUT_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Layer getLayer() {
		if (eContainerFeatureID() != KerasPackage.OUTPUT_NODE__LAYER) return null;
		return (Layer)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Layer basicGetLayer() {
		if (eContainerFeatureID() != KerasPackage.OUTPUT_NODE__LAYER) return null;
		return (Layer)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLayer(Layer newLayer, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newLayer, KerasPackage.OUTPUT_NODE__LAYER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLayer(Layer newLayer) {
		if (newLayer != eInternalContainer() || (eContainerFeatureID() != KerasPackage.OUTPUT_NODE__LAYER && newLayer != null)) {
			if (EcoreUtil.isAncestor(this, newLayer))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newLayer != null)
				msgs = ((InternalEObject)newLayer).eInverseAdd(this, KerasPackage.LAYER__OUTPUT_NODES, Layer.class, msgs);
			msgs = basicSetLayer(newLayer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KerasPackage.OUTPUT_NODE__LAYER, newLayer, newLayer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tensor getOutputTensor() {
		return outputTensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutputTensor(Tensor newOutputTensor, NotificationChain msgs) {
		Tensor oldOutputTensor = outputTensor;
		outputTensor = newOutputTensor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KerasPackage.OUTPUT_NODE__OUTPUT_TENSOR, oldOutputTensor, newOutputTensor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutputTensor(Tensor newOutputTensor) {
		if (newOutputTensor != outputTensor) {
			NotificationChain msgs = null;
			if (outputTensor != null)
				msgs = ((InternalEObject)outputTensor).eInverseRemove(this, KerasPackage.TENSOR__CONTAINER_NODE, Tensor.class, msgs);
			if (newOutputTensor != null)
				msgs = ((InternalEObject)newOutputTensor).eInverseAdd(this, KerasPackage.TENSOR__CONTAINER_NODE, Tensor.class, msgs);
			msgs = basicSetOutputTensor(newOutputTensor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KerasPackage.OUTPUT_NODE__OUTPUT_TENSOR, newOutputTensor, newOutputTensor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputNode getConnectedNode() {
		if (connectedNode != null && connectedNode.eIsProxy()) {
			InternalEObject oldConnectedNode = (InternalEObject)connectedNode;
			connectedNode = (InputNode)eResolveProxy(oldConnectedNode);
			if (connectedNode != oldConnectedNode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, KerasPackage.OUTPUT_NODE__CONNECTED_NODE, oldConnectedNode, connectedNode));
			}
		}
		return connectedNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputNode basicGetConnectedNode() {
		return connectedNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConnectedNode(InputNode newConnectedNode, NotificationChain msgs) {
		InputNode oldConnectedNode = connectedNode;
		connectedNode = newConnectedNode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KerasPackage.OUTPUT_NODE__CONNECTED_NODE, oldConnectedNode, newConnectedNode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnectedNode(InputNode newConnectedNode) {
		if (newConnectedNode != connectedNode) {
			NotificationChain msgs = null;
			if (connectedNode != null)
				msgs = ((InternalEObject)connectedNode).eInverseRemove(this, KerasPackage.INPUT_NODE__CONNECTED_NODE, InputNode.class, msgs);
			if (newConnectedNode != null)
				msgs = ((InternalEObject)newConnectedNode).eInverseAdd(this, KerasPackage.INPUT_NODE__CONNECTED_NODE, InputNode.class, msgs);
			msgs = basicSetConnectedNode(newConnectedNode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KerasPackage.OUTPUT_NODE__CONNECTED_NODE, newConnectedNode, newConnectedNode));
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
		this.setOutputTensor(null);
		this.getConnectedNode().removeFromLayer();
		this.setConnectedNode(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void connectToLayer(final Layer target) {
		Tensor tensor = null;
		Tensor _outputTensor = this.getOutputTensor();
		boolean _tripleNotEquals = (_outputTensor != null);
		if (_tripleNotEquals) {
			tensor = this.getOutputTensor();
		}
		else {
			tensor = KerasFactory.eINSTANCE.createTensor();
			this.setOutputTensor(tensor);
		}
		final InputNode targetInputNode = KerasFactory.eINSTANCE.createInputNode();
		target.getInputNodes().add(targetInputNode);
		final OutputNode targetOutputNode = KerasFactory.eINSTANCE.createOutputNode();
		target.getOutputNodes().add(targetOutputNode);
		targetOutputNode.setConnectedNode(targetInputNode);
		targetInputNode.setInputTensor(tensor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KerasPackage.OUTPUT_NODE__LAYER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetLayer((Layer)otherEnd, msgs);
			case KerasPackage.OUTPUT_NODE__OUTPUT_TENSOR:
				if (outputTensor != null)
					msgs = ((InternalEObject)outputTensor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KerasPackage.OUTPUT_NODE__OUTPUT_TENSOR, null, msgs);
				return basicSetOutputTensor((Tensor)otherEnd, msgs);
			case KerasPackage.OUTPUT_NODE__CONNECTED_NODE:
				if (connectedNode != null)
					msgs = ((InternalEObject)connectedNode).eInverseRemove(this, KerasPackage.INPUT_NODE__CONNECTED_NODE, InputNode.class, msgs);
				return basicSetConnectedNode((InputNode)otherEnd, msgs);
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
			case KerasPackage.OUTPUT_NODE__LAYER:
				return basicSetLayer(null, msgs);
			case KerasPackage.OUTPUT_NODE__OUTPUT_TENSOR:
				return basicSetOutputTensor(null, msgs);
			case KerasPackage.OUTPUT_NODE__CONNECTED_NODE:
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
			case KerasPackage.OUTPUT_NODE__LAYER:
				return eInternalContainer().eInverseRemove(this, KerasPackage.LAYER__OUTPUT_NODES, Layer.class, msgs);
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
			case KerasPackage.OUTPUT_NODE__LAYER:
				if (resolve) return getLayer();
				return basicGetLayer();
			case KerasPackage.OUTPUT_NODE__OUTPUT_TENSOR:
				return getOutputTensor();
			case KerasPackage.OUTPUT_NODE__CONNECTED_NODE:
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
			case KerasPackage.OUTPUT_NODE__LAYER:
				setLayer((Layer)newValue);
				return;
			case KerasPackage.OUTPUT_NODE__OUTPUT_TENSOR:
				setOutputTensor((Tensor)newValue);
				return;
			case KerasPackage.OUTPUT_NODE__CONNECTED_NODE:
				setConnectedNode((InputNode)newValue);
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
			case KerasPackage.OUTPUT_NODE__LAYER:
				setLayer((Layer)null);
				return;
			case KerasPackage.OUTPUT_NODE__OUTPUT_TENSOR:
				setOutputTensor((Tensor)null);
				return;
			case KerasPackage.OUTPUT_NODE__CONNECTED_NODE:
				setConnectedNode((InputNode)null);
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
			case KerasPackage.OUTPUT_NODE__LAYER:
				return basicGetLayer() != null;
			case KerasPackage.OUTPUT_NODE__OUTPUT_TENSOR:
				return outputTensor != null;
			case KerasPackage.OUTPUT_NODE__CONNECTED_NODE:
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
				case KerasPackage.NODE___REMOVE_FROM_LAYER: return KerasPackage.OUTPUT_NODE___REMOVE_FROM_LAYER;
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
			case KerasPackage.OUTPUT_NODE___REMOVE_FROM_LAYER:
				removeFromLayer();
				return null;
			case KerasPackage.OUTPUT_NODE___CONNECT_TO_LAYER__LAYER:
				connectToLayer((Layer)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //OutputNodeImpl
