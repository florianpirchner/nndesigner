/**
 */
package nndesigner;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Keras Reshape</b></em>'.
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
 *   <li>{@link nndesigner.KerasReshape#getInputShape <em>Input Shape</em>}</li>
 *   <li>{@link nndesigner.KerasReshape#getOutputShape <em>Output Shape</em>}</li>
 * </ul>
 *
 * @see nndesigner.NndesignerPackage#getKerasReshape()
 * @model
 * @generated
 */
public interface KerasReshape extends Layer {
	/**
	 * Returns the value of the '<em><b>Input Shape</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Arbitrary, although all dimensions in the input shaped must be fixed. <br>
	 * Use the keyword argument input_shape (tuple of integers, does not include the batch axis) when using this layer as the
	 * first layer in a model.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Input Shape</em>' attribute list.
	 * @see nndesigner.NndesignerPackage#getKerasReshape_InputShape()
	 * @model unique="false"
	 * @generated
	 */
	EList<Integer> getInputShape();

	/**
	 * Returns the value of the '<em><b>Output Shape</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Tuple of integers. Does not include the batch axis.<br>
	 * <code>(batch_size,) + target_shape</code>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Output Shape</em>' attribute list.
	 * @see nndesigner.NndesignerPackage#getKerasReshape_OutputShape()
	 * @model unique="false"
	 * @generated
	 */
	EList<Integer> getOutputShape();

} // KerasReshape
