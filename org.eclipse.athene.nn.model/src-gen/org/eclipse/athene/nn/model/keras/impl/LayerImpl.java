/**
 */
package org.eclipse.athene.nn.model.keras.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.athene.nn.model.keras.InputNode;
import org.eclipse.athene.nn.model.keras.KerasPackage;
import org.eclipse.athene.nn.model.keras.Layer;
import org.eclipse.athene.nn.model.keras.OutputNode;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Layer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.athene.nn.model.keras.impl.LayerImpl#getInputNodes <em>Input Nodes</em>}</li>
 *   <li>{@link org.eclipse.athene.nn.model.keras.impl.LayerImpl#getOutputNodes <em>Output Nodes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LayerImpl extends org.eclipse.athene.nn.model.tensorflow.impl.LayerImpl implements Layer {
	/**
	 * The cached value of the '{@link #getInputNodes() <em>Input Nodes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputNodes()
	 * @generated
	 * @ordered
	 */
	protected EList<InputNode> inputNodes;

	/**
	 * The cached value of the '{@link #getOutputNodes() <em>Output Nodes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputNodes()
	 * @generated
	 * @ordered
	 */
	protected EList<OutputNode> outputNodes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LayerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KerasPackage.Literals.LAYER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InputNode> getInputNodes() {
		if (inputNodes == null) {
			inputNodes = new EObjectContainmentWithInverseEList<InputNode>(InputNode.class, this, KerasPackage.LAYER__INPUT_NODES, KerasPackage.INPUT_NODE__LAYER);
		}
		return inputNodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OutputNode> getOutputNodes() {
		if (outputNodes == null) {
			outputNodes = new EObjectContainmentWithInverseEList<OutputNode>(OutputNode.class, this, KerasPackage.LAYER__OUTPUT_NODES, KerasPackage.OUTPUT_NODE__LAYER);
		}
		return outputNodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputNode createInputNode() {
		throw new UnsupportedOperationException("Override in subclass");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputNode creatOutputNode() {
		throw new UnsupportedOperationException("Override in subclass");
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
			case KerasPackage.LAYER__INPUT_NODES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInputNodes()).basicAdd(otherEnd, msgs);
			case KerasPackage.LAYER__OUTPUT_NODES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutputNodes()).basicAdd(otherEnd, msgs);
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
			case KerasPackage.LAYER__INPUT_NODES:
				return ((InternalEList<?>)getInputNodes()).basicRemove(otherEnd, msgs);
			case KerasPackage.LAYER__OUTPUT_NODES:
				return ((InternalEList<?>)getOutputNodes()).basicRemove(otherEnd, msgs);
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
			case KerasPackage.LAYER__INPUT_NODES:
				return getInputNodes();
			case KerasPackage.LAYER__OUTPUT_NODES:
				return getOutputNodes();
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
			case KerasPackage.LAYER__INPUT_NODES:
				getInputNodes().clear();
				getInputNodes().addAll((Collection<? extends InputNode>)newValue);
				return;
			case KerasPackage.LAYER__OUTPUT_NODES:
				getOutputNodes().clear();
				getOutputNodes().addAll((Collection<? extends OutputNode>)newValue);
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
			case KerasPackage.LAYER__INPUT_NODES:
				getInputNodes().clear();
				return;
			case KerasPackage.LAYER__OUTPUT_NODES:
				getOutputNodes().clear();
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
			case KerasPackage.LAYER__INPUT_NODES:
				return inputNodes != null && !inputNodes.isEmpty();
			case KerasPackage.LAYER__OUTPUT_NODES:
				return outputNodes != null && !outputNodes.isEmpty();
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
			case KerasPackage.LAYER___CREATE_INPUT_NODE:
				return createInputNode();
			case KerasPackage.LAYER___CREAT_OUTPUT_NODE:
				return creatOutputNode();
		}
		return super.eInvoke(operationID, arguments);
	}

} //LayerImpl
