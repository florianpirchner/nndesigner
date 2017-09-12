/**
 */
package org.eclipse.athene.nn.model.keras;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.athene.nn.model.keras.Node#getInput <em>Input</em>}</li>
 *   <li>{@link org.eclipse.athene.nn.model.keras.Node#getOutput <em>Output</em>}</li>
 * </ul>
 *
 * @see org.eclipse.athene.nn.model.keras.KerasPackage#getNode()
 * @model
 * @generated
 */
public interface Node extends EObject {
	/**
	 * Returns the value of the '<em><b>Input</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.athene.nn.model.keras.Tensor#getProvidingNode <em>Providing Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' reference.
	 * @see #setInput(Tensor)
	 * @see org.eclipse.athene.nn.model.keras.KerasPackage#getNode_Input()
	 * @see org.eclipse.athene.nn.model.keras.Tensor#getProvidingNode
	 * @model opposite="providingNode"
	 * @generated
	 */
	Tensor getInput();

	/**
	 * Sets the value of the '{@link org.eclipse.athene.nn.model.keras.Node#getInput <em>Input</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input</em>' reference.
	 * @see #getInput()
	 * @generated
	 */
	void setInput(Tensor value);

	/**
	 * Returns the value of the '<em><b>Output</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output</em>' containment reference.
	 * @see #setOutput(Tensor)
	 * @see org.eclipse.athene.nn.model.keras.KerasPackage#getNode_Output()
	 * @model containment="true"
	 * @generated
	 */
	Tensor getOutput();

	/**
	 * Sets the value of the '{@link org.eclipse.athene.nn.model.keras.Node#getOutput <em>Output</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output</em>' containment reference.
	 * @see #getOutput()
	 * @generated
	 */
	void setOutput(Tensor value);

} // Node
