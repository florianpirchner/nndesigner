/**
 */
package nndesigner.impl;

import java.util.Collection;

import nndesigner.ActivationFunction;
import nndesigner.InitializerFunction;
import nndesigner.KerasDenseLayer;
import nndesigner.NndesignerPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Keras Dense Layer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link nndesigner.impl.KerasDenseLayerImpl#getNumberOfOutputUnits <em>Number Of Output Units</em>}</li>
 *   <li>{@link nndesigner.impl.KerasDenseLayerImpl#getInputShape <em>Input Shape</em>}</li>
 *   <li>{@link nndesigner.impl.KerasDenseLayerImpl#isUseBias <em>Use Bias</em>}</li>
 *   <li>{@link nndesigner.impl.KerasDenseLayerImpl#getActivationFunction <em>Activation Function</em>}</li>
 *   <li>{@link nndesigner.impl.KerasDenseLayerImpl#getWeightsInitializer <em>Weights Initializer</em>}</li>
 *   <li>{@link nndesigner.impl.KerasDenseLayerImpl#getBiasInitializer <em>Bias Initializer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class KerasDenseLayerImpl extends LayerImpl implements KerasDenseLayer {
	/**
	 * The default value of the '{@link #getNumberOfOutputUnits() <em>Number Of Output Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfOutputUnits()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_OF_OUTPUT_UNITS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumberOfOutputUnits() <em>Number Of Output Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfOutputUnits()
	 * @generated
	 * @ordered
	 */
	protected int numberOfOutputUnits = NUMBER_OF_OUTPUT_UNITS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInputShape() <em>Input Shape</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputShape()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> inputShape;

	/**
	 * The default value of the '{@link #isUseBias() <em>Use Bias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseBias()
	 * @generated
	 * @ordered
	 */
	protected static final boolean USE_BIAS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUseBias() <em>Use Bias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseBias()
	 * @generated
	 * @ordered
	 */
	protected boolean useBias = USE_BIAS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getActivationFunction() <em>Activation Function</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivationFunction()
	 * @generated
	 * @ordered
	 */
	protected ActivationFunction activationFunction;

	/**
	 * The cached value of the '{@link #getWeightsInitializer() <em>Weights Initializer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeightsInitializer()
	 * @generated
	 * @ordered
	 */
	protected InitializerFunction weightsInitializer;

	/**
	 * The cached value of the '{@link #getBiasInitializer() <em>Bias Initializer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBiasInitializer()
	 * @generated
	 * @ordered
	 */
	protected InitializerFunction biasInitializer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KerasDenseLayerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NndesignerPackage.Literals.KERAS_DENSE_LAYER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumberOfOutputUnits() {
		return numberOfOutputUnits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfOutputUnits(int newNumberOfOutputUnits) {
		int oldNumberOfOutputUnits = numberOfOutputUnits;
		numberOfOutputUnits = newNumberOfOutputUnits;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NndesignerPackage.KERAS_DENSE_LAYER__NUMBER_OF_OUTPUT_UNITS, oldNumberOfOutputUnits, numberOfOutputUnits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Integer> getInputShape() {
		if (inputShape == null) {
			inputShape = new EDataTypeEList<Integer>(Integer.class, this, NndesignerPackage.KERAS_DENSE_LAYER__INPUT_SHAPE);
		}
		return inputShape;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUseBias() {
		return useBias;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUseBias(boolean newUseBias) {
		boolean oldUseBias = useBias;
		useBias = newUseBias;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NndesignerPackage.KERAS_DENSE_LAYER__USE_BIAS, oldUseBias, useBias));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivationFunction getActivationFunction() {
		if (activationFunction != null && activationFunction.eIsProxy()) {
			InternalEObject oldActivationFunction = (InternalEObject)activationFunction;
			activationFunction = (ActivationFunction)eResolveProxy(oldActivationFunction);
			if (activationFunction != oldActivationFunction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, NndesignerPackage.KERAS_DENSE_LAYER__ACTIVATION_FUNCTION, oldActivationFunction, activationFunction));
			}
		}
		return activationFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivationFunction basicGetActivationFunction() {
		return activationFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivationFunction(ActivationFunction newActivationFunction) {
		ActivationFunction oldActivationFunction = activationFunction;
		activationFunction = newActivationFunction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NndesignerPackage.KERAS_DENSE_LAYER__ACTIVATION_FUNCTION, oldActivationFunction, activationFunction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitializerFunction getWeightsInitializer() {
		if (weightsInitializer != null && weightsInitializer.eIsProxy()) {
			InternalEObject oldWeightsInitializer = (InternalEObject)weightsInitializer;
			weightsInitializer = (InitializerFunction)eResolveProxy(oldWeightsInitializer);
			if (weightsInitializer != oldWeightsInitializer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, NndesignerPackage.KERAS_DENSE_LAYER__WEIGHTS_INITIALIZER, oldWeightsInitializer, weightsInitializer));
			}
		}
		return weightsInitializer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitializerFunction basicGetWeightsInitializer() {
		return weightsInitializer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWeightsInitializer(InitializerFunction newWeightsInitializer) {
		InitializerFunction oldWeightsInitializer = weightsInitializer;
		weightsInitializer = newWeightsInitializer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NndesignerPackage.KERAS_DENSE_LAYER__WEIGHTS_INITIALIZER, oldWeightsInitializer, weightsInitializer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitializerFunction getBiasInitializer() {
		if (biasInitializer != null && biasInitializer.eIsProxy()) {
			InternalEObject oldBiasInitializer = (InternalEObject)biasInitializer;
			biasInitializer = (InitializerFunction)eResolveProxy(oldBiasInitializer);
			if (biasInitializer != oldBiasInitializer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, NndesignerPackage.KERAS_DENSE_LAYER__BIAS_INITIALIZER, oldBiasInitializer, biasInitializer));
			}
		}
		return biasInitializer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitializerFunction basicGetBiasInitializer() {
		return biasInitializer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBiasInitializer(InitializerFunction newBiasInitializer) {
		InitializerFunction oldBiasInitializer = biasInitializer;
		biasInitializer = newBiasInitializer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NndesignerPackage.KERAS_DENSE_LAYER__BIAS_INITIALIZER, oldBiasInitializer, biasInitializer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case NndesignerPackage.KERAS_DENSE_LAYER__NUMBER_OF_OUTPUT_UNITS:
				return getNumberOfOutputUnits();
			case NndesignerPackage.KERAS_DENSE_LAYER__INPUT_SHAPE:
				return getInputShape();
			case NndesignerPackage.KERAS_DENSE_LAYER__USE_BIAS:
				return isUseBias();
			case NndesignerPackage.KERAS_DENSE_LAYER__ACTIVATION_FUNCTION:
				if (resolve) return getActivationFunction();
				return basicGetActivationFunction();
			case NndesignerPackage.KERAS_DENSE_LAYER__WEIGHTS_INITIALIZER:
				if (resolve) return getWeightsInitializer();
				return basicGetWeightsInitializer();
			case NndesignerPackage.KERAS_DENSE_LAYER__BIAS_INITIALIZER:
				if (resolve) return getBiasInitializer();
				return basicGetBiasInitializer();
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
			case NndesignerPackage.KERAS_DENSE_LAYER__NUMBER_OF_OUTPUT_UNITS:
				setNumberOfOutputUnits((Integer)newValue);
				return;
			case NndesignerPackage.KERAS_DENSE_LAYER__INPUT_SHAPE:
				getInputShape().clear();
				getInputShape().addAll((Collection<? extends Integer>)newValue);
				return;
			case NndesignerPackage.KERAS_DENSE_LAYER__USE_BIAS:
				setUseBias((Boolean)newValue);
				return;
			case NndesignerPackage.KERAS_DENSE_LAYER__ACTIVATION_FUNCTION:
				setActivationFunction((ActivationFunction)newValue);
				return;
			case NndesignerPackage.KERAS_DENSE_LAYER__WEIGHTS_INITIALIZER:
				setWeightsInitializer((InitializerFunction)newValue);
				return;
			case NndesignerPackage.KERAS_DENSE_LAYER__BIAS_INITIALIZER:
				setBiasInitializer((InitializerFunction)newValue);
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
			case NndesignerPackage.KERAS_DENSE_LAYER__NUMBER_OF_OUTPUT_UNITS:
				setNumberOfOutputUnits(NUMBER_OF_OUTPUT_UNITS_EDEFAULT);
				return;
			case NndesignerPackage.KERAS_DENSE_LAYER__INPUT_SHAPE:
				getInputShape().clear();
				return;
			case NndesignerPackage.KERAS_DENSE_LAYER__USE_BIAS:
				setUseBias(USE_BIAS_EDEFAULT);
				return;
			case NndesignerPackage.KERAS_DENSE_LAYER__ACTIVATION_FUNCTION:
				setActivationFunction((ActivationFunction)null);
				return;
			case NndesignerPackage.KERAS_DENSE_LAYER__WEIGHTS_INITIALIZER:
				setWeightsInitializer((InitializerFunction)null);
				return;
			case NndesignerPackage.KERAS_DENSE_LAYER__BIAS_INITIALIZER:
				setBiasInitializer((InitializerFunction)null);
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
			case NndesignerPackage.KERAS_DENSE_LAYER__NUMBER_OF_OUTPUT_UNITS:
				return numberOfOutputUnits != NUMBER_OF_OUTPUT_UNITS_EDEFAULT;
			case NndesignerPackage.KERAS_DENSE_LAYER__INPUT_SHAPE:
				return inputShape != null && !inputShape.isEmpty();
			case NndesignerPackage.KERAS_DENSE_LAYER__USE_BIAS:
				return useBias != USE_BIAS_EDEFAULT;
			case NndesignerPackage.KERAS_DENSE_LAYER__ACTIVATION_FUNCTION:
				return activationFunction != null;
			case NndesignerPackage.KERAS_DENSE_LAYER__WEIGHTS_INITIALIZER:
				return weightsInitializer != null;
			case NndesignerPackage.KERAS_DENSE_LAYER__BIAS_INITIALIZER:
				return biasInitializer != null;
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
		result.append(" (numberOfOutputUnits: ");
		result.append(numberOfOutputUnits);
		result.append(", inputShape: ");
		result.append(inputShape);
		result.append(", useBias: ");
		result.append(useBias);
		result.append(')');
		return result.toString();
	}

} //KerasDenseLayerImpl
