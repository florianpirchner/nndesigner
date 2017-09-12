/**
 */
package org.eclipse.athene.nn.model.keras;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.athene.nn.model.keras.InputNode#getInputLayer <em>Input Layer</em>}</li>
 * </ul>
 *
 * @see org.eclipse.athene.nn.model.keras.KerasPackage#getInputNode()
 * @model
 * @generated
 */
public interface InputNode extends Node {
	/**
	 * Returns the value of the '<em><b>Input Layer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Layer</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Layer</em>' reference.
	 * @see #setInputLayer(Layer)
	 * @see org.eclipse.athene.nn.model.keras.KerasPackage#getInputNode_InputLayer()
	 * @model
	 * @generated
	 */
	Layer getInputLayer();

	/**
	 * Sets the value of the '{@link org.eclipse.athene.nn.model.keras.InputNode#getInputLayer <em>Input Layer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Layer</em>' reference.
	 * @see #getInputLayer()
	 * @generated
	 */
	void setInputLayer(Layer value);

} // InputNode
