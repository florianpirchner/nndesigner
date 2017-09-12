/**
 */
package org.eclipse.athene.nn.model.keras;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Output Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.athene.nn.model.keras.OutputNode#getOutputLayer <em>Output Layer</em>}</li>
 * </ul>
 *
 * @see org.eclipse.athene.nn.model.keras.KerasPackage#getOutputNode()
 * @model
 * @generated
 */
public interface OutputNode extends Node {
	/**
	 * Returns the value of the '<em><b>Output Layer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Layer</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Layer</em>' reference.
	 * @see #setOutputLayer(Layer)
	 * @see org.eclipse.athene.nn.model.keras.KerasPackage#getOutputNode_OutputLayer()
	 * @model
	 * @generated
	 */
	Layer getOutputLayer();

	/**
	 * Sets the value of the '{@link org.eclipse.athene.nn.model.keras.OutputNode#getOutputLayer <em>Output Layer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Layer</em>' reference.
	 * @see #getOutputLayer()
	 * @generated
	 */
	void setOutputLayer(Layer value);

} // OutputNode
