/**
 */
package nndesigner.impl;

import java.util.Collection;

import nndesigner.InputSource;
import nndesigner.Layer;
import nndesigner.NndesignerPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Layer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link nndesigner.impl.LayerImpl#getInputSource <em>Input Source</em>}</li>
 *   <li>{@link nndesigner.impl.LayerImpl#getTargetLayers <em>Target Layers</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class LayerImpl extends MinimalEObjectImpl.Container implements Layer {
	/**
	 * The cached value of the '{@link #getInputSource() <em>Input Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputSource()
	 * @generated
	 * @ordered
	 */
	protected InputSource inputSource;

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
		return NndesignerPackage.Literals.LAYER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputSource getInputSource() {
		if (inputSource != null && inputSource.eIsProxy()) {
			InternalEObject oldInputSource = (InternalEObject)inputSource;
			inputSource = (InputSource)eResolveProxy(oldInputSource);
			if (inputSource != oldInputSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, NndesignerPackage.LAYER__INPUT_SOURCE, oldInputSource, inputSource));
			}
		}
		return inputSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputSource basicGetInputSource() {
		return inputSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputSource(InputSource newInputSource) {
		InputSource oldInputSource = inputSource;
		inputSource = newInputSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NndesignerPackage.LAYER__INPUT_SOURCE, oldInputSource, inputSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Layer> getTargetLayers() {
		if (targetLayers == null) {
			targetLayers = new EObjectResolvingEList<Layer>(Layer.class, this, NndesignerPackage.LAYER__TARGET_LAYERS);
		}
		return targetLayers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case NndesignerPackage.LAYER__INPUT_SOURCE:
				if (resolve) return getInputSource();
				return basicGetInputSource();
			case NndesignerPackage.LAYER__TARGET_LAYERS:
				return getTargetLayers();
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
			case NndesignerPackage.LAYER__INPUT_SOURCE:
				setInputSource((InputSource)newValue);
				return;
			case NndesignerPackage.LAYER__TARGET_LAYERS:
				getTargetLayers().clear();
				getTargetLayers().addAll((Collection<? extends Layer>)newValue);
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
			case NndesignerPackage.LAYER__INPUT_SOURCE:
				setInputSource((InputSource)null);
				return;
			case NndesignerPackage.LAYER__TARGET_LAYERS:
				getTargetLayers().clear();
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
			case NndesignerPackage.LAYER__INPUT_SOURCE:
				return inputSource != null;
			case NndesignerPackage.LAYER__TARGET_LAYERS:
				return targetLayers != null && !targetLayers.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //LayerImpl
