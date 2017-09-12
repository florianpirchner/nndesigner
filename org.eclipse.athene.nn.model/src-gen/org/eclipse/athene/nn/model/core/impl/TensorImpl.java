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
 *   <li>{@link org.eclipse.athene.nn.model.core.impl.TensorImpl#getProvidingLayer <em>Providing Layer</em>}</li>
 *   <li>{@link org.eclipse.athene.nn.model.core.impl.TensorImpl#getConsumingLayers <em>Consuming Layers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TensorImpl extends MinimalEObjectImpl.Container implements Tensor {
	/**
	 * The cached value of the '{@link #getConsumingLayers() <em>Consuming Layers</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsumingLayers()
	 * @generated
	 * @ordered
	 */
	protected EList<Layer> consumingLayers;

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
		return CorePackage.Literals.TENSOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Layer getProvidingLayer() {
		if (eContainerFeatureID() != CorePackage.TENSOR__PROVIDING_LAYER) return null;
		return (Layer)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Layer basicGetProvidingLayer() {
		if (eContainerFeatureID() != CorePackage.TENSOR__PROVIDING_LAYER) return null;
		return (Layer)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProvidingLayer(Layer newProvidingLayer, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newProvidingLayer, CorePackage.TENSOR__PROVIDING_LAYER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProvidingLayer(Layer newProvidingLayer) {
		if (newProvidingLayer != eInternalContainer() || (eContainerFeatureID() != CorePackage.TENSOR__PROVIDING_LAYER && newProvidingLayer != null)) {
			if (EcoreUtil.isAncestor(this, newProvidingLayer))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newProvidingLayer != null)
				msgs = ((InternalEObject)newProvidingLayer).eInverseAdd(this, CorePackage.LAYER__OUTPUT_TENSORS, Layer.class, msgs);
			msgs = basicSetProvidingLayer(newProvidingLayer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.TENSOR__PROVIDING_LAYER, newProvidingLayer, newProvidingLayer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Layer> getConsumingLayers() {
		if (consumingLayers == null) {
			consumingLayers = new EObjectWithInverseResolvingEList.ManyInverse<Layer>(Layer.class, this, CorePackage.TENSOR__CONSUMING_LAYERS, CorePackage.LAYER__INPUT_TENSORS);
		}
		return consumingLayers;
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
			case CorePackage.TENSOR__PROVIDING_LAYER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetProvidingLayer((Layer)otherEnd, msgs);
			case CorePackage.TENSOR__CONSUMING_LAYERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConsumingLayers()).basicAdd(otherEnd, msgs);
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
			case CorePackage.TENSOR__PROVIDING_LAYER:
				return basicSetProvidingLayer(null, msgs);
			case CorePackage.TENSOR__CONSUMING_LAYERS:
				return ((InternalEList<?>)getConsumingLayers()).basicRemove(otherEnd, msgs);
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
			case CorePackage.TENSOR__PROVIDING_LAYER:
				return eInternalContainer().eInverseRemove(this, CorePackage.LAYER__OUTPUT_TENSORS, Layer.class, msgs);
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
			case CorePackage.TENSOR__PROVIDING_LAYER:
				if (resolve) return getProvidingLayer();
				return basicGetProvidingLayer();
			case CorePackage.TENSOR__CONSUMING_LAYERS:
				return getConsumingLayers();
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
			case CorePackage.TENSOR__PROVIDING_LAYER:
				setProvidingLayer((Layer)newValue);
				return;
			case CorePackage.TENSOR__CONSUMING_LAYERS:
				getConsumingLayers().clear();
				getConsumingLayers().addAll((Collection<? extends Layer>)newValue);
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
			case CorePackage.TENSOR__PROVIDING_LAYER:
				setProvidingLayer((Layer)null);
				return;
			case CorePackage.TENSOR__CONSUMING_LAYERS:
				getConsumingLayers().clear();
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
			case CorePackage.TENSOR__PROVIDING_LAYER:
				return basicGetProvidingLayer() != null;
			case CorePackage.TENSOR__CONSUMING_LAYERS:
				return consumingLayers != null && !consumingLayers.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TensorImpl
