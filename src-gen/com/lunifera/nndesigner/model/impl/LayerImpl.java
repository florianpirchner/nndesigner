/**
 */
package com.lunifera.nndesigner.model.impl;

import com.lunifera.nndesigner.model.InputSource;
import com.lunifera.nndesigner.model.Layer;
import com.lunifera.nndesigner.model.ModelPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

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
 *   <li>{@link com.lunifera.nndesigner.model.impl.LayerImpl#getTargetLayers <em>Target Layers</em>}</li>
 *   <li>{@link com.lunifera.nndesigner.model.impl.LayerImpl#getInputSources <em>Input Sources</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class LayerImpl extends MinimalEObjectImpl.Container implements Layer {
	/**
	 * The cached value of the '{@link #getTargetLayers() <em>Target Layers</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetLayers()
	 * @generated
	 * @ordered
	 */
	protected EList<Layer> targetLayers;

	/**
	 * The cached value of the '{@link #getInputSources() <em>Input Sources</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputSources()
	 * @generated
	 * @ordered
	 */
	protected EList<InputSource> inputSources;

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
		return ModelPackage.Literals.LAYER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Layer> getTargetLayers() {
		if (targetLayers == null) {
			targetLayers = new EObjectWithInverseResolvingEList.ManyInverse<Layer>(Layer.class, this, ModelPackage.LAYER__TARGET_LAYERS, ModelPackage.LAYER__INPUT_SOURCES);
		}
		return targetLayers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InputSource> getInputSources() {
		if (inputSources == null) {
			inputSources = new EObjectWithInverseResolvingEList.ManyInverse<InputSource>(InputSource.class, this, ModelPackage.LAYER__INPUT_SOURCES, ModelPackage.INPUT_SOURCE__TARGET_LAYERS);
		}
		return inputSources;
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
			case ModelPackage.LAYER__TARGET_LAYERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTargetLayers()).basicAdd(otherEnd, msgs);
			case ModelPackage.LAYER__INPUT_SOURCES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInputSources()).basicAdd(otherEnd, msgs);
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
			case ModelPackage.LAYER__TARGET_LAYERS:
				return ((InternalEList<?>)getTargetLayers()).basicRemove(otherEnd, msgs);
			case ModelPackage.LAYER__INPUT_SOURCES:
				return ((InternalEList<?>)getInputSources()).basicRemove(otherEnd, msgs);
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
			case ModelPackage.LAYER__TARGET_LAYERS:
				return getTargetLayers();
			case ModelPackage.LAYER__INPUT_SOURCES:
				return getInputSources();
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
			case ModelPackage.LAYER__TARGET_LAYERS:
				getTargetLayers().clear();
				getTargetLayers().addAll((Collection<? extends Layer>)newValue);
				return;
			case ModelPackage.LAYER__INPUT_SOURCES:
				getInputSources().clear();
				getInputSources().addAll((Collection<? extends InputSource>)newValue);
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
			case ModelPackage.LAYER__TARGET_LAYERS:
				getTargetLayers().clear();
				return;
			case ModelPackage.LAYER__INPUT_SOURCES:
				getInputSources().clear();
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
			case ModelPackage.LAYER__TARGET_LAYERS:
				return targetLayers != null && !targetLayers.isEmpty();
			case ModelPackage.LAYER__INPUT_SOURCES:
				return inputSources != null && !inputSources.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //LayerImpl
