/**
 */
package org.eclipse.athene.nn.model.tensorflow;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Layer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.athene.nn.model.tensorflow.Layer#isTrainable <em>Trainable</em>}</li>
 * </ul>
 *
 * @see org.eclipse.athene.nn.model.tensorflow.TensorflowPackage#getLayer()
 * @model
 * @generated
 */
public interface Layer extends org.eclipse.athene.nn.model.core.Layer {
	/**
	 * Returns the value of the '<em><b>Trainable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trainable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trainable</em>' attribute.
	 * @see #setTrainable(boolean)
	 * @see org.eclipse.athene.nn.model.tensorflow.TensorflowPackage#getLayer_Trainable()
	 * @model unique="false"
	 * @generated
	 */
	boolean isTrainable();

	/**
	 * Sets the value of the '{@link org.eclipse.athene.nn.model.tensorflow.Layer#isTrainable <em>Trainable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trainable</em>' attribute.
	 * @see #isTrainable()
	 * @generated
	 */
	void setTrainable(boolean value);

} // Layer
