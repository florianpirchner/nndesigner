/**
 */
package org.eclipse.athene.nn.model.keras.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.athene.nn.model.keras.InputNode;
import org.eclipse.athene.nn.model.keras.KerasPackage;
import org.eclipse.athene.nn.model.keras.OutputNode;
import org.eclipse.athene.nn.model.keras.Tensor;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tensor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.athene.nn.model.keras.impl.TensorImpl#getContainerNode <em>Container Node</em>}</li>
 *   <li>{@link org.eclipse.athene.nn.model.keras.impl.TensorImpl#getConsumingNodes <em>Consuming Nodes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TensorImpl extends org.eclipse.athene.nn.model.core.impl.TensorImpl implements Tensor {
	/**
	 * The cached value of the '{@link #getConsumingNodes() <em>Consuming Nodes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsumingNodes()
	 * @generated
	 * @ordered
	 */
	protected EList<InputNode> consumingNodes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TensorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KerasPackage.Literals.TENSOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputNode getContainerNode() {
		if (eContainerFeatureID() != KerasPackage.TENSOR__CONTAINER_NODE) return null;
		return (OutputNode)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputNode basicGetContainerNode() {
		if (eContainerFeatureID() != KerasPackage.TENSOR__CONTAINER_NODE) return null;
		return (OutputNode)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainerNode(OutputNode newContainerNode, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newContainerNode, KerasPackage.TENSOR__CONTAINER_NODE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainerNode(OutputNode newContainerNode) {
		if (newContainerNode != eInternalContainer() || (eContainerFeatureID() != KerasPackage.TENSOR__CONTAINER_NODE && newContainerNode != null)) {
			if (EcoreUtil.isAncestor(this, newContainerNode))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newContainerNode != null)
				msgs = ((InternalEObject)newContainerNode).eInverseAdd(this, KerasPackage.OUTPUT_NODE__OUTPUT_TENSOR, OutputNode.class, msgs);
			msgs = basicSetContainerNode(newContainerNode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KerasPackage.TENSOR__CONTAINER_NODE, newContainerNode, newContainerNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InputNode> getConsumingNodes() {
		if (consumingNodes == null) {
			consumingNodes = new EObjectWithInverseResolvingEList<InputNode>(InputNode.class, this, KerasPackage.TENSOR__CONSUMING_NODES, KerasPackage.INPUT_NODE__INPUT_TENSOR);
		}
		return consumingNodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeFromLayer() {
		OutputNode _containerNode = this.getContainerNode();
		_containerNode.setLayer(null);
		this.getConsumingNodes().clear();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unconnectFromTargetInput(final InputNode targetInputNode) {
		this.getConsumingNodes().remove(targetInputNode);
		boolean _isEmpty = this.getConsumingNodes().isEmpty();
		if (_isEmpty) {
			this.removeFromLayer();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KerasPackage.TENSOR__CONTAINER_NODE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetContainerNode((OutputNode)otherEnd, msgs);
			case KerasPackage.TENSOR__CONSUMING_NODES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConsumingNodes()).basicAdd(otherEnd, msgs);
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
			case KerasPackage.TENSOR__CONTAINER_NODE:
				return basicSetContainerNode(null, msgs);
			case KerasPackage.TENSOR__CONSUMING_NODES:
				return ((InternalEList<?>)getConsumingNodes()).basicRemove(otherEnd, msgs);
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
			case KerasPackage.TENSOR__CONTAINER_NODE:
				return eInternalContainer().eInverseRemove(this, KerasPackage.OUTPUT_NODE__OUTPUT_TENSOR, OutputNode.class, msgs);
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
			case KerasPackage.TENSOR__CONTAINER_NODE:
				if (resolve) return getContainerNode();
				return basicGetContainerNode();
			case KerasPackage.TENSOR__CONSUMING_NODES:
				return getConsumingNodes();
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
			case KerasPackage.TENSOR__CONTAINER_NODE:
				setContainerNode((OutputNode)newValue);
				return;
			case KerasPackage.TENSOR__CONSUMING_NODES:
				getConsumingNodes().clear();
				getConsumingNodes().addAll((Collection<? extends InputNode>)newValue);
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
			case KerasPackage.TENSOR__CONTAINER_NODE:
				setContainerNode((OutputNode)null);
				return;
			case KerasPackage.TENSOR__CONSUMING_NODES:
				getConsumingNodes().clear();
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
			case KerasPackage.TENSOR__CONTAINER_NODE:
				return basicGetContainerNode() != null;
			case KerasPackage.TENSOR__CONSUMING_NODES:
				return consumingNodes != null && !consumingNodes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case KerasPackage.TENSOR___REMOVE_FROM_LAYER:
				removeFromLayer();
				return null;
			case KerasPackage.TENSOR___UNCONNECT_FROM_TARGET_INPUT__INPUTNODE:
				unconnectFromTargetInput((InputNode)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //TensorImpl
