/**
 */
package org.eclipse.athene.nn.model.core.impl;

import java.util.Collection;

import org.eclipse.athene.nn.model.core.CorePackage;
import org.eclipse.athene.nn.model.core.Layer;
import org.eclipse.athene.nn.model.core.Tensor;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Layer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.athene.nn.model.core.impl.LayerImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.athene.nn.model.core.impl.LayerImpl#getOutputTensors <em>Output Tensors</em>}</li>
 *   <li>{@link org.eclipse.athene.nn.model.core.impl.LayerImpl#getInputTensors <em>Input Tensors</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class LayerImpl extends MinimalEObjectImpl.Container implements Layer {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOutputTensors() <em>Output Tensors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputTensors()
	 * @generated
	 * @ordered
	 */
	protected EList<Tensor> outputTensors;

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
		return CorePackage.Literals.LAYER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.LAYER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Tensor> getOutputTensors() {
		if (outputTensors == null) {
			outputTensors = new EObjectContainmentWithInverseEList<Tensor>(Tensor.class, this, CorePackage.LAYER__OUTPUT_TENSORS, CorePackage.TENSOR__PROVIDING_LAYER);
		}
		return outputTensors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Tensor> getInputTensors() {
		if (inputTensors == null) {
			inputTensors = new EObjectWithInverseResolvingEList.ManyInverse<Tensor>(Tensor.class, this, CorePackage.LAYER__INPUT_TENSORS, CorePackage.TENSOR__CONSUMING_LAYERS);
		}
		return inputTensors;
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
			case CorePackage.LAYER__OUTPUT_TENSORS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutputTensors()).basicAdd(otherEnd, msgs);
			case CorePackage.LAYER__INPUT_TENSORS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInputTensors()).basicAdd(otherEnd, msgs);
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
			case CorePackage.LAYER__OUTPUT_TENSORS:
				return ((InternalEList<?>)getOutputTensors()).basicRemove(otherEnd, msgs);
			case CorePackage.LAYER__INPUT_TENSORS:
				return ((InternalEList<?>)getInputTensors()).basicRemove(otherEnd, msgs);
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
			case CorePackage.LAYER__NAME:
				return getName();
			case CorePackage.LAYER__OUTPUT_TENSORS:
				return getOutputTensors();
			case CorePackage.LAYER__INPUT_TENSORS:
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
			case CorePackage.LAYER__NAME:
				setName((String)newValue);
				return;
			case CorePackage.LAYER__OUTPUT_TENSORS:
				getOutputTensors().clear();
				getOutputTensors().addAll((Collection<? extends Tensor>)newValue);
				return;
			case CorePackage.LAYER__INPUT_TENSORS:
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
			case CorePackage.LAYER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CorePackage.LAYER__OUTPUT_TENSORS:
				getOutputTensors().clear();
				return;
			case CorePackage.LAYER__INPUT_TENSORS:
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
			case CorePackage.LAYER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CorePackage.LAYER__OUTPUT_TENSORS:
				return outputTensors != null && !outputTensors.isEmpty();
			case CorePackage.LAYER__INPUT_TENSORS:
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
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //LayerImpl
