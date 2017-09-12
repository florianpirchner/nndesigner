/**
 */
package org.eclipse.athene.nn.model.keras.impl;

import org.eclipse.athene.nn.model.core.Shape;

import org.eclipse.athene.nn.model.keras.Dropout;
import org.eclipse.athene.nn.model.keras.KerasPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dropout</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.athene.nn.model.keras.impl.DropoutImpl#getRate <em>Rate</em>}</li>
 *   <li>{@link org.eclipse.athene.nn.model.keras.impl.DropoutImpl#getNoiseShape <em>Noise Shape</em>}</li>
 *   <li>{@link org.eclipse.athene.nn.model.keras.impl.DropoutImpl#getSeed <em>Seed</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DropoutImpl extends LayerImpl implements Dropout {
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
	 * The cached value of the '{@link #getNoiseShape() <em>Noise Shape</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoiseShape()
	 * @generated
	 * @ordered
	 */
	protected Shape noiseShape;

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
	protected DropoutImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KerasPackage.Literals.DROPOUT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, KerasPackage.DROPOUT__RATE, oldRate, rate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Shape getNoiseShape() {
		return noiseShape;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNoiseShape(Shape newNoiseShape, NotificationChain msgs) {
		Shape oldNoiseShape = noiseShape;
		noiseShape = newNoiseShape;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KerasPackage.DROPOUT__NOISE_SHAPE, oldNoiseShape, newNoiseShape);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNoiseShape(Shape newNoiseShape) {
		if (newNoiseShape != noiseShape) {
			NotificationChain msgs = null;
			if (noiseShape != null)
				msgs = ((InternalEObject)noiseShape).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KerasPackage.DROPOUT__NOISE_SHAPE, null, msgs);
			if (newNoiseShape != null)
				msgs = ((InternalEObject)newNoiseShape).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KerasPackage.DROPOUT__NOISE_SHAPE, null, msgs);
			msgs = basicSetNoiseShape(newNoiseShape, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KerasPackage.DROPOUT__NOISE_SHAPE, newNoiseShape, newNoiseShape));
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
			eNotify(new ENotificationImpl(this, Notification.SET, KerasPackage.DROPOUT__SEED, oldSeed, seed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KerasPackage.DROPOUT__NOISE_SHAPE:
				return basicSetNoiseShape(null, msgs);
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
			case KerasPackage.DROPOUT__RATE:
				return getRate();
			case KerasPackage.DROPOUT__NOISE_SHAPE:
				return getNoiseShape();
			case KerasPackage.DROPOUT__SEED:
				return getSeed();
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
			case KerasPackage.DROPOUT__RATE:
				setRate((Float)newValue);
				return;
			case KerasPackage.DROPOUT__NOISE_SHAPE:
				setNoiseShape((Shape)newValue);
				return;
			case KerasPackage.DROPOUT__SEED:
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
			case KerasPackage.DROPOUT__RATE:
				setRate(RATE_EDEFAULT);
				return;
			case KerasPackage.DROPOUT__NOISE_SHAPE:
				setNoiseShape((Shape)null);
				return;
			case KerasPackage.DROPOUT__SEED:
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
			case KerasPackage.DROPOUT__RATE:
				return rate != RATE_EDEFAULT;
			case KerasPackage.DROPOUT__NOISE_SHAPE:
				return noiseShape != null;
			case KerasPackage.DROPOUT__SEED:
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
		result.append(", seed: ");
		result.append(seed);
		result.append(')');
		return result.toString();
	}

} //DropoutImpl
