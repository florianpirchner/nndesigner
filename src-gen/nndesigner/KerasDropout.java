/**
 */
package nndesigner;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Keras Dropout</b></em>'.
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
 *   <li>{@link nndesigner.KerasDropout#getRate <em>Rate</em>}</li>
 *   <li>{@link nndesigner.KerasDropout#getNoiseShape <em>Noise Shape</em>}</li>
 *   <li>{@link nndesigner.KerasDropout#getSeed <em>Seed</em>}</li>
 * </ul>
 *
 * @see nndesigner.NndesignerPackage#getKerasDropout()
 * @model
 * @generated
 */
public interface KerasDropout extends Layer {
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
	 * @see nndesigner.NndesignerPackage#getKerasDropout_Rate()
	 * @model unique="false"
	 * @generated
	 */
	float getRate();

	/**
	 * Sets the value of the '{@link nndesigner.KerasDropout#getRate <em>Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rate</em>' attribute.
	 * @see #getRate()
	 * @generated
	 */
	void setRate(float value);

	/**
	 * Returns the value of the '<em><b>Noise Shape</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 1D integer tensor representing the shape of the binary dropout mask that will be multiplied with the input. <br>
	 * For instance, if your inputs have shape  (batch_size, timesteps, features) and you want the dropout mask to be
	 * the same for all timesteps, you can use noise_shape=(batch_size, 1, features).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Noise Shape</em>' attribute list.
	 * @see nndesigner.NndesignerPackage#getKerasDropout_NoiseShape()
	 * @model unique="false"
	 * @generated
	 */
	EList<Integer> getNoiseShape();

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
	 * @see nndesigner.NndesignerPackage#getKerasDropout_Seed()
	 * @model unique="false"
	 * @generated
	 */
	int getSeed();

	/**
	 * Sets the value of the '{@link nndesigner.KerasDropout#getSeed <em>Seed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Seed</em>' attribute.
	 * @see #getSeed()
	 * @generated
	 */
	void setSeed(int value);

} // KerasDropout
