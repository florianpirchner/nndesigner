/**
 */
package org.eclipse.athene.nn.model.keras;

import org.eclipse.athene.nn.model.core.Shape2D;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity Regularization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * Layer that applies an update to the cost function cored input activity.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.athene.nn.model.keras.ActivityRegularization#getL1 <em>L1</em>}</li>
 *   <li>{@link org.eclipse.athene.nn.model.keras.ActivityRegularization#getL2 <em>L2</em>}</li>
 *   <li>{@link org.eclipse.athene.nn.model.keras.ActivityRegularization#getInputShape <em>Input Shape</em>}</li>
 * </ul>
 *
 * @see org.eclipse.athene.nn.model.keras.KerasPackage#getActivityRegularization()
 * @model
 * @generated
 */
public interface ActivityRegularization extends Layer {
	/**
	 * Returns the value of the '<em><b>L1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>L1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>L1</em>' attribute.
	 * @see #setL1(int)
	 * @see org.eclipse.athene.nn.model.keras.KerasPackage#getActivityRegularization_L1()
	 * @model unique="false"
	 * @generated
	 */
	int getL1();

	/**
	 * Sets the value of the '{@link org.eclipse.athene.nn.model.keras.ActivityRegularization#getL1 <em>L1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>L1</em>' attribute.
	 * @see #getL1()
	 * @generated
	 */
	void setL1(int value);

	/**
	 * Returns the value of the '<em><b>L2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>L2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>L2</em>' attribute.
	 * @see #setL2(int)
	 * @see org.eclipse.athene.nn.model.keras.KerasPackage#getActivityRegularization_L2()
	 * @model unique="false"
	 * @generated
	 */
	int getL2();

	/**
	 * Sets the value of the '{@link org.eclipse.athene.nn.model.keras.ActivityRegularization#getL2 <em>L2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>L2</em>' attribute.
	 * @see #getL2()
	 * @generated
	 */
	void setL2(int value);

	/**
	 * Returns the value of the '<em><b>Input Shape</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Arbitrary. Use the keyword argument input_shape (tuple of integers, does not include the samples axis)
	 * when using this layer as the first layer in a model.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Input Shape</em>' containment reference.
	 * @see #setInputShape(Shape2D)
	 * @see org.eclipse.athene.nn.model.keras.KerasPackage#getActivityRegularization_InputShape()
	 * @model containment="true"
	 * @generated
	 */
	Shape2D getInputShape();

	/**
	 * Sets the value of the '{@link org.eclipse.athene.nn.model.keras.ActivityRegularization#getInputShape <em>Input Shape</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Shape</em>' containment reference.
	 * @see #getInputShape()
	 * @generated
	 */
	void setInputShape(Shape2D value);

} // ActivityRegularization
