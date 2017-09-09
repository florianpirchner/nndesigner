/**
 */
package nndesigner.impl;

import java.util.Collection;

import nndesigner.KerasDropout;
import nndesigner.NndesignerPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Keras Dropout</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link nndesigner.impl.KerasDropoutImpl#getRate <em>Rate</em>}</li>
 *   <li>{@link nndesigner.impl.KerasDropoutImpl#getNoiseShape <em>Noise Shape</em>}</li>
 *   <li>{@link nndesigner.impl.KerasDropoutImpl#getSeed <em>Seed</em>}</li>
 * </ul>
 *
 * @generated
 */
public class KerasDropoutImpl extends LayerImpl implements KerasDropout {
	/**
	 * The default value of the '{@link #getRate() <em>Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRate()
	 * @generated
	 * @ordered
	 */
	protected static final float RATE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getRate() <em>Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRate()
	 * @generated
	 * @ordered
	 */
	protected float rate = RATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNoiseShape() <em>Noise Shape</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoiseShape()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> noiseShape;

	/**
	 * The default value of the '{@link #getSeed() <em>Seed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeed()
	 * @generated
	 * @ordered
	 */
	protected static final int SEED_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSeed() <em>Seed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeed()
	 * @generated
	 * @ordered
	 */
	protected int seed = SEED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KerasDropoutImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NndesignerPackage.Literals.KERAS_DROPOUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getRate() {
		return rate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRate(float newRate) {
		float oldRate = rate;
		rate = newRate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NndesignerPackage.KERAS_DROPOUT__RATE, oldRate, rate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Integer> getNoiseShape() {
		if (noiseShape == null) {
			noiseShape = new EDataTypeEList<Integer>(Integer.class, this, NndesignerPackage.KERAS_DROPOUT__NOISE_SHAPE);
		}
		return noiseShape;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSeed() {
		return seed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeed(int newSeed) {
		int oldSeed = seed;
		seed = newSeed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NndesignerPackage.KERAS_DROPOUT__SEED, oldSeed, seed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case NndesignerPackage.KERAS_DROPOUT__RATE:
				return getRate();
			case NndesignerPackage.KERAS_DROPOUT__NOISE_SHAPE:
				return getNoiseShape();
			case NndesignerPackage.KERAS_DROPOUT__SEED:
				return getSeed();
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
			case NndesignerPackage.KERAS_DROPOUT__RATE:
				setRate((Float)newValue);
				return;
			case NndesignerPackage.KERAS_DROPOUT__NOISE_SHAPE:
				getNoiseShape().clear();
				getNoiseShape().addAll((Collection<? extends Integer>)newValue);
				return;
			case NndesignerPackage.KERAS_DROPOUT__SEED:
				setSeed((Integer)newValue);
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
			case NndesignerPackage.KERAS_DROPOUT__RATE:
				setRate(RATE_EDEFAULT);
				return;
			case NndesignerPackage.KERAS_DROPOUT__NOISE_SHAPE:
				getNoiseShape().clear();
				return;
			case NndesignerPackage.KERAS_DROPOUT__SEED:
				setSeed(SEED_EDEFAULT);
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
			case NndesignerPackage.KERAS_DROPOUT__RATE:
				return rate != RATE_EDEFAULT;
			case NndesignerPackage.KERAS_DROPOUT__NOISE_SHAPE:
				return noiseShape != null && !noiseShape.isEmpty();
			case NndesignerPackage.KERAS_DROPOUT__SEED:
				return seed != SEED_EDEFAULT;
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
		result.append(" (rate: ");
		result.append(rate);
		result.append(", noiseShape: ");
		result.append(noiseShape);
		result.append(", seed: ");
		result.append(seed);
		result.append(')');
		return result.toString();
	}

} //KerasDropoutImpl
