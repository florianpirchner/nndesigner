/**
 */
package org.eclipse.athene.nn.model.keras;

import org.eclipse.athene.nn.model.core.ActivationFunction;
import org.eclipse.athene.nn.model.core.Shape;

import org.eclipse.athene.nn.model.tensorflow.Layer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Applies an activation function to an output.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.athene.nn.model.keras.Activation#getActivationFunction <em>Activation Function</em>}</li>
 *   <li>{@link org.eclipse.athene.nn.model.keras.Activation#getInputShape <em>Input Shape</em>}</li>
 * </ul>
 *
 * @see org.eclipse.athene.nn.model.keras.KerasPackage#getActivation()
 * @model
 * @generated
 */
public interface Activation extends Layer {
	/**
	 * Returns the value of the '<em><b>Activation Function</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activation Function</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activation Function</em>' reference.
	 * @see #setActivationFunction(ActivationFunction)
	 * @see org.eclipse.athene.nn.model.keras.KerasPackage#getActivation_ActivationFunction()
	 * @model
	 * @generated
	 */
	ActivationFunction getActivationFunction();

	/**
	 * Sets the value of the '{@link org.eclipse.athene.nn.model.keras.Activation#getActivationFunction <em>Activation Function</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activation Function</em>' reference.
	 * @see #getActivationFunction()
	 * @generated
	 */
	void setActivationFunction(ActivationFunction value);

	/**
	 * Returns the value of the '<em><b>Input Shape</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Arbitrary. Use the keyword argument `input_shape`
	 * (tuple of integers, does not include the samples axis)
	 * when using this layer as the first layer in a model.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Input Shape</em>' containment reference.
	 * @see #setInputShape(Shape)
	 * @see org.eclipse.athene.nn.model.keras.KerasPackage#getActivation_InputShape()
	 * @model containment="true"
	 * @generated
	 */
	Shape getInputShape();

	/**
	 * Sets the value of the '{@link org.eclipse.athene.nn.model.keras.Activation#getInputShape <em>Input Shape</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Shape</em>' containment reference.
	 * @see #getInputShape()
	 * @generated
	 */
	void setInputShape(Shape value);

} // Activation
