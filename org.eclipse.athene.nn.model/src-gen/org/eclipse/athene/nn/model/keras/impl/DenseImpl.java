/**
 */
package org.eclipse.athene.nn.model.keras.impl;

import org.eclipse.athene.nn.model.core.ActivationFunction;
import org.eclipse.athene.nn.model.core.InitializerFunction;
import org.eclipse.athene.nn.model.core.Shape;

import org.eclipse.athene.nn.model.keras.Dense;
import org.eclipse.athene.nn.model.keras.KerasPackage;

import org.eclipse.athene.nn.model.tensorflow.impl.LayerImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dense</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.athene.nn.model.keras.impl.DenseImpl#getNumberOfOutputUnits <em>Number Of Output Units</em>}</li>
 *   <li>{@link org.eclipse.athene.nn.model.keras.impl.DenseImpl#getInputShape <em>Input Shape</em>}</li>
 *   <li>{@link org.eclipse.athene.nn.model.keras.impl.DenseImpl#isUseBias <em>Use Bias</em>}</li>
 *   <li>{@link org.eclipse.athene.nn.model.keras.impl.DenseImpl#getActivationFunction <em>Activation Function</em>}</li>
 *   <li>{@link org.eclipse.athene.nn.model.keras.impl.DenseImpl#getWeightsInitializer <em>Weights Initializer</em>}</li>
 *   <li>{@link org.eclipse.athene.nn.model.keras.impl.DenseImpl#getBiasInitializer <em>Bias Initializer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DenseImpl extends LayerImpl implements Dense {
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
	 * The cached value of the '{@link #getInputShape() <em>Input Shape</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputShape()
	 * @generated
	 * @ordered
	 */
	protected Shape inputShape;

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
	protected DenseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KerasPackage.Literals.DENSE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, KerasPackage.DENSE__NUMBER_OF_OUTPUT_UNITS, oldNumberOfOutputUnits, numberOfOutputUnits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Shape getInputShape() {
		return inputShape;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInputShape(Shape newInputShape, NotificationChain msgs) {
		Shape oldInputShape = inputShape;
		inputShape = newInputShape;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KerasPackage.DENSE__INPUT_SHAPE, oldInputShape, newInputShape);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputShape(Shape newInputShape) {
		if (newInputShape != inputShape) {
			NotificationChain msgs = null;
			if (inputShape != null)
				msgs = ((InternalEObject)inputShape).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KerasPackage.DENSE__INPUT_SHAPE, null, msgs);
			if (newInputShape != null)
				msgs = ((InternalEObject)newInputShape).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KerasPackage.DENSE__INPUT_SHAPE, null, msgs);
			msgs = basicSetInputShape(newInputShape, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KerasPackage.DENSE__INPUT_SHAPE, newInputShape, newInputShape));
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
			eNotify(new ENotificationImpl(this, Notification.SET, KerasPackage.DENSE__USE_BIAS, oldUseBias, useBias));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, KerasPackage.DENSE__ACTIVATION_FUNCTION, oldActivationFunction, activationFunction));
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
			eNotify(new ENotificationImpl(this, Notification.SET, KerasPackage.DENSE__ACTIVATION_FUNCTION, oldActivationFunction, activationFunction));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, KerasPackage.DENSE__WEIGHTS_INITIALIZER, oldWeightsInitializer, weightsInitializer));
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
			eNotify(new ENotificationImpl(this, Notification.SET, KerasPackage.DENSE__WEIGHTS_INITIALIZER, oldWeightsInitializer, weightsInitializer));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, KerasPackage.DENSE__BIAS_INITIALIZER, oldBiasInitializer, biasInitializer));
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
			eNotify(new ENotificationImpl(this, Notification.SET, KerasPackage.DENSE__BIAS_INITIALIZER, oldBiasInitializer, biasInitializer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KerasPackage.DENSE__INPUT_SHAPE:
				return basicSetInputShape(null, msgs);
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
			case KerasPackage.DENSE__NUMBER_OF_OUTPUT_UNITS:
				return getNumberOfOutputUnits();
			case KerasPackage.DENSE__INPUT_SHAPE:
				return getInputShape();
			case KerasPackage.DENSE__USE_BIAS:
				return isUseBias();
			case KerasPackage.DENSE__ACTIVATION_FUNCTION:
				if (resolve) return getActivationFunction();
				return basicGetActivationFunction();
			case KerasPackage.DENSE__WEIGHTS_INITIALIZER:
				if (resolve) return getWeightsInitializer();
				return basicGetWeightsInitializer();
			case KerasPackage.DENSE__BIAS_INITIALIZER:
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
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case KerasPackage.DENSE__NUMBER_OF_OUTPUT_UNITS:
				setNumberOfOutputUnits((Integer)newValue);
				return;
			case KerasPackage.DENSE__INPUT_SHAPE:
				setInputShape((Shape)newValue);
				return;
			case KerasPackage.DENSE__USE_BIAS:
				setUseBias((Boolean)newValue);
				return;
			case KerasPackage.DENSE__ACTIVATION_FUNCTION:
				setActivationFunction((ActivationFunction)newValue);
				return;
			case KerasPackage.DENSE__WEIGHTS_INITIALIZER:
				setWeightsInitializer((InitializerFunction)newValue);
				return;
			case KerasPackage.DENSE__BIAS_INITIALIZER:
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
			case KerasPackage.DENSE__NUMBER_OF_OUTPUT_UNITS:
				setNumberOfOutputUnits(NUMBER_OF_OUTPUT_UNITS_EDEFAULT);
				return;
			case KerasPackage.DENSE__INPUT_SHAPE:
				setInputShape((Shape)null);
				return;
			case KerasPackage.DENSE__USE_BIAS:
				setUseBias(USE_BIAS_EDEFAULT);
				return;
			case KerasPackage.DENSE__ACTIVATION_FUNCTION:
				setActivationFunction((ActivationFunction)null);
				return;
			case KerasPackage.DENSE__WEIGHTS_INITIALIZER:
				setWeightsInitializer((InitializerFunction)null);
				return;
			case KerasPackage.DENSE__BIAS_INITIALIZER:
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
			case KerasPackage.DENSE__NUMBER_OF_OUTPUT_UNITS:
				return numberOfOutputUnits != NUMBER_OF_OUTPUT_UNITS_EDEFAULT;
			case KerasPackage.DENSE__INPUT_SHAPE:
				return inputShape != null;
			case KerasPackage.DENSE__USE_BIAS:
				return useBias != USE_BIAS_EDEFAULT;
			case KerasPackage.DENSE__ACTIVATION_FUNCTION:
				return activationFunction != null;
			case KerasPackage.DENSE__WEIGHTS_INITIALIZER:
				return weightsInitializer != null;
			case KerasPackage.DENSE__BIAS_INITIALIZER:
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
		result.append(", useBias: ");
		result.append(useBias);
		result.append(')');
		return result.toString();
	}

} //DenseImpl
