/**
 */
package org.eclipse.athene.nn.model.keras;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tensor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.athene.nn.model.keras.Tensor#getProvidingNode <em>Providing Node</em>}</li>
 *   <li>{@link org.eclipse.athene.nn.model.keras.Tensor#getConsumingNodes <em>Consuming Nodes</em>}</li>
 * </ul>
 *
 * @see org.eclipse.athene.nn.model.keras.KerasPackage#getTensor()
 * @model
 * @generated
 */
public interface Tensor extends org.eclipse.athene.nn.model.core.Tensor {
	/**
	 * Returns the value of the '<em><b>Providing Node</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.athene.nn.model.keras.Node#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Providing Node</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Providing Node</em>' reference.
	 * @see #setProvidingNode(Node)
	 * @see org.eclipse.athene.nn.model.keras.KerasPackage#getTensor_ProvidingNode()
	 * @see org.eclipse.athene.nn.model.keras.Node#getInput
	 * @model opposite="input"
	 * @generated
	 */
	Node getProvidingNode();

	/**
	 * Sets the value of the '{@link org.eclipse.athene.nn.model.keras.Tensor#getProvidingNode <em>Providing Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Providing Node</em>' reference.
	 * @see #getProvidingNode()
	 * @generated
	 */
	void setProvidingNode(Node value);

	/**
	 * Returns the value of the '<em><b>Consuming Nodes</b></em>' container reference list.
	 * The list contents are of type {@link org.eclipse.athene.nn.model.keras.Node}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.athene.nn.model.keras.Node#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Consuming Nodes</em>' container reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consuming Nodes</em>' container reference list.
	 * @see org.eclipse.athene.nn.model.keras.KerasPackage#getTensor_ConsumingNodes()
	 * @see org.eclipse.athene.nn.model.keras.Node#getOutput
	 * @model opposite="output" transient="false"
	 * @generated
	 */
	EList<Node> getConsumingNodes();

} // Tensor
