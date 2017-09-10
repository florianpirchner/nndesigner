/**
 */
package com.lunifera.nndesigner.model.keras;

import com.lunifera.nndesigner.model.Layer;
import com.lunifera.nndesigner.model.Shape2D;
import com.lunifera.nndesigner.model.Shape3D;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Repeat Vector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Repeats the input n times.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.lunifera.nndesigner.model.keras.RepeatVector#getNumberOfRepeats <em>Number Of Repeats</em>}</li>
 *   <li>{@link com.lunifera.nndesigner.model.keras.RepeatVector#getInputShape <em>Input Shape</em>}</li>
 *   <li>{@link com.lunifera.nndesigner.model.keras.RepeatVector#getOutputShape <em>Output Shape</em>}</li>
 * </ul>
 *
 * @see com.lunifera.nndesigner.model.keras.KerasPackage#getRepeatVector()
 * @model
 * @generated
 */
public interface RepeatVector extends Layer {
	/**
	 * Returns the value of the '<em><b>Number Of Repeats</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Of Repeats</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Repeats</em>' attribute.
	 * @see #setNumberOfRepeats(int)
	 * @see com.lunifera.nndesigner.model.keras.KerasPackage#getRepeatVector_NumberOfRepeats()
	 * @model unique="false"
	 * @generated
	 */
	int getNumberOfRepeats();

	/**
	 * Sets the value of the '{@link com.lunifera.nndesigner.model.keras.RepeatVector#getNumberOfRepeats <em>Number Of Repeats</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Repeats</em>' attribute.
	 * @see #getNumberOfRepeats()
	 * @generated
	 */
	void setNumberOfRepeats(int value);

	/**
	 * Returns the value of the '<em><b>Input Shape</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Shape</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Shape</em>' containment reference.
	 * @see #setInputShape(Shape2D)
	 * @see com.lunifera.nndesigner.model.keras.KerasPackage#getRepeatVector_InputShape()
	 * @model containment="true"
	 * @generated
	 */
	Shape2D getInputShape();

	/**
	 * Sets the value of the '{@link com.lunifera.nndesigner.model.keras.RepeatVector#getInputShape <em>Input Shape</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Shape</em>' containment reference.
	 * @see #getInputShape()
	 * @generated
	 */
	void setInputShape(Shape2D value);

	/**
	 * Returns the value of the '<em><b>Output Shape</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Shape</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Shape</em>' containment reference.
	 * @see #setOutputShape(Shape3D)
	 * @see com.lunifera.nndesigner.model.keras.KerasPackage#getRepeatVector_OutputShape()
	 * @model containment="true"
	 * @generated
	 */
	Shape3D getOutputShape();

	/**
	 * Sets the value of the '{@link com.lunifera.nndesigner.model.keras.RepeatVector#getOutputShape <em>Output Shape</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Shape</em>' containment reference.
	 * @see #getOutputShape()
	 * @generated
	 */
	void setOutputShape(Shape3D value);

} // RepeatVector
