/**
 */
package com.lunifera.nndesigner.model.keras;

import com.lunifera.nndesigner.model.Layer;
import com.lunifera.nndesigner.model.Shape;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dropout</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Dropout consists in randomly setting a fraction rate of input units to 0 at each update during training time,
 * which helps prevent overfitting.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.lunifera.nndesigner.model.keras.Dropout#getRate <em>Rate</em>}</li>
 *   <li>{@link com.lunifera.nndesigner.model.keras.Dropout#getNoiseShape <em>Noise Shape</em>}</li>
 *   <li>{@link com.lunifera.nndesigner.model.keras.Dropout#getSeed <em>Seed</em>}</li>
 * </ul>
 *
 * @see com.lunifera.nndesigner.model.keras.KerasPackage#getDropout()
 * @model
 * @generated
 */
public interface Dropout extends Layer {
	/**
	 * Returns the value of the '<em><b>Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rate</em>' attribute.
	 * @see #setRate(float)
	 * @see com.lunifera.nndesigner.model.keras.KerasPackage#getDropout_Rate()
	 * @model unique="false"
	 * @generated
	 */
	float getRate();

	/**
	 * Sets the value of the '{@link com.lunifera.nndesigner.model.keras.Dropout#getRate <em>Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rate</em>' attribute.
	 * @see #getRate()
	 * @generated
	 */
	void setRate(float value);

	/**
	 * Returns the value of the '<em><b>Noise Shape</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 1D integer tensor representing the shape of the binary dropout mask that will be multiplied with the input. <br>
	 * For instance, if your inputs have shape  (batch_size, timesteps, features) and you want the dropout mask to be
	 * the same for all timesteps, you can use noise_shape=(batch_size, 1, features).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Noise Shape</em>' containment reference.
	 * @see #setNoiseShape(Shape)
	 * @see com.lunifera.nndesigner.model.keras.KerasPackage#getDropout_NoiseShape()
	 * @model containment="true"
	 * @generated
	 */
	Shape getNoiseShape();

	/**
	 * Sets the value of the '{@link com.lunifera.nndesigner.model.keras.Dropout#getNoiseShape <em>Noise Shape</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Noise Shape</em>' containment reference.
	 * @see #getNoiseShape()
	 * @generated
	 */
	void setNoiseShape(Shape value);

	/**
	 * Returns the value of the '<em><b>Seed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Seed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Seed</em>' attribute.
	 * @see #setSeed(int)
	 * @see com.lunifera.nndesigner.model.keras.KerasPackage#getDropout_Seed()
	 * @model unique="false"
	 * @generated
	 */
	int getSeed();

	/**
	 * Sets the value of the '{@link com.lunifera.nndesigner.model.keras.Dropout#getSeed <em>Seed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Seed</em>' attribute.
	 * @see #getSeed()
	 * @generated
	 */
	void setSeed(int value);

} // Dropout
