/**
 */
package org.eclipse.athene.nn.model.keras.impl;

import java.util.Collection;

import org.eclipse.athene.nn.model.keras.KerasPackage;
import org.eclipse.athene.nn.model.keras.Node;
import org.eclipse.athene.nn.model.keras.Tensor;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tensor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.athene.nn.model.keras.impl.TensorImpl#getProvidingNode <em>Providing Node</em>}</li>
 *   <li>{@link org.eclipse.athene.nn.model.keras.impl.TensorImpl#getConsumingNodes <em>Consuming Nodes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TensorImpl extends org.eclipse.athene.nn.model.core.impl.TensorImpl implements Tensor {
	/**
	 * The cached value of the '{@link #getProvidingNode() <em>Providing Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvidingNode()
	 * @generated
	 * @ordered
	 */
	protected Node providingNode;

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
	public Node getProvidingNode() {
		if (providingNode != null && providingNode.eIsProxy()) {
			InternalEObject oldProvidingNode = (InternalEObject)providingNode;
			providingNode = (Node)eResolveProxy(oldProvidingNode);
			if (providingNode != oldProvidingNode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, KerasPackage.TENSOR__PROVIDING_NODE, oldProvidingNode, providingNode));
			}
		}
		return providingNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node basicGetProvidingNode() {
		return providingNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProvidingNode(Node newProvidingNode, NotificationChain msgs) {
		Node oldProvidingNode = providingNode;
		providingNode = newProvidingNode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KerasPackage.TENSOR__PROVIDING_NODE, oldProvidingNode, newProvidingNode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProvidingNode(Node newProvidingNode) {
		if (newProvidingNode != providingNode) {
			NotificationChain msgs = null;
			if (providingNode != null)
				msgs = ((InternalEObject)providingNode).eInverseRemove(this, KerasPackage.NODE__INPUT, Node.class, msgs);
			if (newProvidingNode != null)
				msgs = ((InternalEObject)newProvidingNode).eInverseAdd(this, KerasPackage.NODE__INPUT, Node.class, msgs);
			msgs = basicSetProvidingNode(newProvidingNode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KerasPackage.TENSOR__PROVIDING_NODE, newProvidingNode, newProvidingNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Node> getConsumingNodes() {
		if (consumingNodes == null) {
			consumingNodes = new EObjectWithInverseResolvingEList<Node>(Node.class, this, KerasPackage.TENSOR__CONSUMING_NODES, KerasPackage.NODE__OUTPUT);
		}
		return consumingNodes;
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
			case KerasPackage.TENSOR__PROVIDING_NODE:
				if (providingNode != null)
					msgs = ((InternalEObject)providingNode).eInverseRemove(this, KerasPackage.NODE__INPUT, Node.class, msgs);
				return basicSetProvidingNode((Node)otherEnd, msgs);
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
			case KerasPackage.TENSOR__PROVIDING_NODE:
				return basicSetProvidingNode(null, msgs);
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
			case KerasPackage.TENSOR__CONSUMING_NODES:
				return eInternalContainer().eInverseRemove(this, KerasPackage.NODE__OUTPUT, Node.class, msgs);
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
			case KerasPackage.TENSOR__PROVIDING_NODE:
				if (resolve) return getProvidingNode();
				return basicGetProvidingNode();
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
			case KerasPackage.TENSOR__PROVIDING_NODE:
				setProvidingNode((Node)newValue);
				return;
			case KerasPackage.TENSOR__CONSUMING_NODES:
				getConsumingNodes().clear();
				getConsumingNodes().addAll((Collection<? extends Node>)newValue);
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
			case KerasPackage.TENSOR__PROVIDING_NODE:
				setProvidingNode((Node)null);
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
			case KerasPackage.TENSOR__PROVIDING_NODE:
				return providingNode != null;
			case KerasPackage.TENSOR__CONSUMING_NODES:
				return !getConsumingNodes().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TensorImpl
