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
 *   <li>{@link org.eclipse.athene.nn.model.keras.InputNode#getLayer <em>Layer</em>}</li>
 *   <li>{@link org.eclipse.athene.nn.model.keras.InputNode#getInputTensor <em>Input Tensor</em>}</li>
 *   <li>{@link org.eclipse.athene.nn.model.keras.InputNode#getConnectedNode <em>Connected Node</em>}</li>
 * </ul>
 *
 * @see org.eclipse.athene.nn.model.keras.KerasPackage#getInputNode()
 * @model
 * @generated
 */
public interface InputNode extends Node {
	/**
	 * Returns the value of the '<em><b>Layer</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.athene.nn.model.keras.Layer#getInputNodes <em>Input Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Layer</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Layer</em>' container reference.
	 * @see #setLayer(Layer)
	 * @see org.eclipse.athene.nn.model.keras.KerasPackage#getInputNode_Layer()
	 * @see org.eclipse.athene.nn.model.keras.Layer#getInputNodes
	 * @model opposite="inputNodes" transient="false"
	 * @generated
	 */
	Layer getLayer();

	/**
	 * Sets the value of the '{@link org.eclipse.athene.nn.model.keras.InputNode#getLayer <em>Layer</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Layer</em>' container reference.
	 * @see #getLayer()
	 * @generated
	 */
	void setLayer(Layer value);

	/**
	 * Returns the value of the '<em><b>Input Tensor</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.athene.nn.model.keras.Tensor#getConsumingNodes <em>Consuming Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Tensor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Tensor</em>' reference.
	 * @see #setInputTensor(Tensor)
	 * @see org.eclipse.athene.nn.model.keras.KerasPackage#getInputNode_InputTensor()
	 * @see org.eclipse.athene.nn.model.keras.Tensor#getConsumingNodes
	 * @model opposite="consumingNodes"
	 * @generated
	 */
	Tensor getInputTensor();

	/**
	 * Sets the value of the '{@link org.eclipse.athene.nn.model.keras.InputNode#getInputTensor <em>Input Tensor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Tensor</em>' reference.
	 * @see #getInputTensor()
	 * @generated
	 */
	void setInputTensor(Tensor value);

	/**
	 * Returns the value of the '<em><b>Connected Node</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.athene.nn.model.keras.OutputNode#getConnectedNode <em>Connected Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connected Node</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connected Node</em>' reference.
	 * @see #setConnectedNode(OutputNode)
	 * @see org.eclipse.athene.nn.model.keras.KerasPackage#getInputNode_ConnectedNode()
	 * @see org.eclipse.athene.nn.model.keras.OutputNode#getConnectedNode
	 * @model opposite="connectedNode"
	 * @generated
	 */
	OutputNode getConnectedNode();

	/**
	 * Sets the value of the '{@link org.eclipse.athene.nn.model.keras.InputNode#getConnectedNode <em>Connected Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connected Node</em>' reference.
	 * @see #getConnectedNode()
	 * @generated
	 */
	void setConnectedNode(OutputNode value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Removes the input node and its connected output node from the layer
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='&lt;%org.eclipse.athene.nn.model.keras.Layer%&gt; _layer = this.getLayer();\nboolean _tripleEquals = (_layer == null);\nif (_tripleEquals)\n{\n\treturn;\n}\nthis.setLayer(null);\nthis.setInputTensor(null);\nthis.getConnectedNode().removeFromLayer();\nthis.setConnectedNode(null);'"
	 * @generated
	 */
	void removeFromLayer();

} // InputNode
