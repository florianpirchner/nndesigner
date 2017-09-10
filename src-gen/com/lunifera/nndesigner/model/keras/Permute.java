/**
 */
package com.lunifera.nndesigner.model.keras;

import com.lunifera.nndesigner.model.IntegerDuple;
import com.lunifera.nndesigner.model.Layer;
import com.lunifera.nndesigner.model.Shape;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Permute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Permutes the dimensions of the input according to a given pattern.<br>
 * Useful for e.g. connecting RNNs and convnets together.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.lunifera.nndesigner.model.keras.Permute#getDims <em>Dims</em>}</li>
 *   <li>{@link com.lunifera.nndesigner.model.keras.Permute#getInputShape <em>Input Shape</em>}</li>
 * </ul>
 *
 * @see com.lunifera.nndesigner.model.keras.KerasPackage#getPermute()
 * @model
 * @generated
 */
public interface Permute extends Layer {
	/**
	 * Returns the value of the '<em><b>Dims</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 *  Tuple of integers. Permutation pattern, does not include the samples dimension. <br>
	 * Indexing starts at 1. For instance,  (2, 1) permutes the first and second dimension of the input.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dims</em>' containment reference.
	 * @see #setDims(IntegerDuple)
	 * @see com.lunifera.nndesigner.model.keras.KerasPackage#getPermute_Dims()
	 * @model containment="true"
	 * @generated
	 */
	IntegerDuple getDims();

	/**
	 * Sets the value of the '{@link com.lunifera.nndesigner.model.keras.Permute#getDims <em>Dims</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dims</em>' containment reference.
	 * @see #getDims()
	 * @generated
	 */
	void setDims(IntegerDuple value);

	/**
	 * Returns the value of the '<em><b>Input Shape</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Arbitrary. Use the keyword argument input_shape (tuple of integers, does not include the samples axis)
	 * when using this layer as the first layer in a model.<br>
	 * OutputShape:<br>
	 * Same as the input shape, but with the dimensions re-ordered according to the specified pattern.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Input Shape</em>' containment reference.
	 * @see #setInputShape(Shape)
	 * @see com.lunifera.nndesigner.model.keras.KerasPackage#getPermute_InputShape()
	 * @model containment="true"
	 * @generated
	 */
	Shape getInputShape();

	/**
	 * Sets the value of the '{@link com.lunifera.nndesigner.model.keras.Permute#getInputShape <em>Input Shape</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Shape</em>' containment reference.
	 * @see #getInputShape()
	 * @generated
	 */
	void setInputShape(Shape value);

} // Permute
