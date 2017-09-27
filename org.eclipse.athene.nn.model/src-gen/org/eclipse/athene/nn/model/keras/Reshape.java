/**
 */
package org.eclipse.athene.nn.model.keras;

import org.eclipse.athene.nn.model.core.Shape;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reshape</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Reshapes an output to a certain shape.<br>
 * <code>
 * 	# as first layer in a Sequential model<br>
 * 		model = Sequential()<br>
 * 		model.add(Reshape((3, 4), input_shape=(12,)))<br>
 * # now: model.output_shape == (None, 3, 4)<br>
 * # note: `None` is the batch dimension<br>
 * <br>
 * # as intermediate layer in a Sequential model<br>
 * 		model.add(Reshape((6, 2)))<br>
 * # now: model.output_shape == (None, 6, 2)<br>
 * <br>
 * # also supports shape inference using `-1` as dimension<br>
 * 		model.add(Reshape((-1, 2, 2)))<br>
 * # now: model.output_shape == (None, 3, 2, 2)<br>
 * </code>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.athene.nn.model.keras.Reshape#getTargetShape <em>Target Shape</em>}</li>
 *   <li>{@link org.eclipse.athene.nn.model.keras.Reshape#getInputShape <em>Input Shape</em>}</li>
 *   <li>{@link org.eclipse.athene.nn.model.keras.Reshape#getOutputShape <em>Output Shape</em>}</li>
 * </ul>
 *
 * @see org.eclipse.athene.nn.model.keras.KerasPackage#getReshape()
 * @model
 * @generated
 */
public interface Reshape extends Layer, SingleInputNodeProvider {
	/**
	 * Returns the value of the '<em><b>Target Shape</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Tuple of integers,
	 * does not include the samples dimension (batch size).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target Shape</em>' containment reference.
	 * @see #setTargetShape(Shape)
	 * @see org.eclipse.athene.nn.model.keras.KerasPackage#getReshape_TargetShape()
	 * @model containment="true"
	 * @generated
	 */
	Shape getTargetShape();

	/**
	 * Sets the value of the '{@link org.eclipse.athene.nn.model.keras.Reshape#getTargetShape <em>Target Shape</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Shape</em>' containment reference.
	 * @see #getTargetShape()
	 * @generated
	 */
	void setTargetShape(Shape value);

	/**
	 * Returns the value of the '<em><b>Input Shape</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Arbitrary, although all dimensions in the input shaped must be fixed. <br>
	 * Use the keyword argument input_shape (tuple of integers, does not include the batch axis) when using this layer as the
	 * first layer in a model.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Input Shape</em>' containment reference.
	 * @see #setInputShape(Shape)
	 * @see org.eclipse.athene.nn.model.keras.KerasPackage#getReshape_InputShape()
	 * @model containment="true"
	 * @generated
	 */
	Shape getInputShape();

	/**
	 * Sets the value of the '{@link org.eclipse.athene.nn.model.keras.Reshape#getInputShape <em>Input Shape</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Shape</em>' containment reference.
	 * @see #getInputShape()
	 * @generated
	 */
	void setInputShape(Shape value);

	/**
	 * Returns the value of the '<em><b>Output Shape</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Tuple of integers. Does not include the batch axis.<br>
	 * <code>(batch_size,) + target_shape</code>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Output Shape</em>' containment reference.
	 * @see #setOutputShape(Shape)
	 * @see org.eclipse.athene.nn.model.keras.KerasPackage#getReshape_OutputShape()
	 * @model containment="true"
	 * @generated
	 */
	Shape getOutputShape();

	/**
	 * Sets the value of the '{@link org.eclipse.athene.nn.model.keras.Reshape#getOutputShape <em>Output Shape</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Shape</em>' containment reference.
	 * @see #getOutputShape()
	 * @generated
	 */
	void setOutputShape(Shape value);

} // Reshape
