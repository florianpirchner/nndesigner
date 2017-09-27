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
 *   <li>{@link org.eclipse.athene.nn.model.keras.OutputNode#getLayer <em>Layer</em>}</li>
 *   <li>{@link org.eclipse.athene.nn.model.keras.OutputNode#getOutputTensor <em>Output Tensor</em>}</li>
 *   <li>{@link org.eclipse.athene.nn.model.keras.OutputNode#getConnectedNode <em>Connected Node</em>}</li>
 * </ul>
 *
 * @see org.eclipse.athene.nn.model.keras.KerasPackage#getOutputNode()
 * @model
 * @generated
 */
public interface OutputNode extends Node {
	/**
	 * Returns the value of the '<em><b>Layer</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.athene.nn.model.keras.Layer#getOutputNodes <em>Output Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Layer</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Layer</em>' container reference.
	 * @see #setLayer(Layer)
	 * @see org.eclipse.athene.nn.model.keras.KerasPackage#getOutputNode_Layer()
	 * @see org.eclipse.athene.nn.model.keras.Layer#getOutputNodes
	 * @model opposite="outputNodes" transient="false"
	 * @generated
	 */
	Layer getLayer();

	/**
	 * Sets the value of the '{@link org.eclipse.athene.nn.model.keras.OutputNode#getLayer <em>Layer</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Layer</em>' container reference.
	 * @see #getLayer()
	 * @generated
	 */
	void setLayer(Layer value);

	/**
	 * Returns the value of the '<em><b>Output Tensor</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.athene.nn.model.keras.Tensor#getContainerNode <em>Container Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Tensor</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Tensor</em>' containment reference.
	 * @see #setOutputTensor(Tensor)
	 * @see org.eclipse.athene.nn.model.keras.KerasPackage#getOutputNode_OutputTensor()
	 * @see org.eclipse.athene.nn.model.keras.Tensor#getContainerNode
	 * @model opposite="containerNode" containment="true"
	 * @generated
	 */
	Tensor getOutputTensor();

	/**
	 * Sets the value of the '{@link org.eclipse.athene.nn.model.keras.OutputNode#getOutputTensor <em>Output Tensor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Tensor</em>' containment reference.
	 * @see #getOutputTensor()
	 * @generated
	 */
	void setOutputTensor(Tensor value);

	/**
	 * Returns the value of the '<em><b>Connected Node</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.athene.nn.model.keras.InputNode#getConnectedNode <em>Connected Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connected Node</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connected Node</em>' reference.
	 * @see #setConnectedNode(InputNode)
	 * @see org.eclipse.athene.nn.model.keras.KerasPackage#getOutputNode_ConnectedNode()
	 * @see org.eclipse.athene.nn.model.keras.InputNode#getConnectedNode
	 * @model opposite="connectedNode"
	 * @generated
	 */
	InputNode getConnectedNode();

	/**
	 * Sets the value of the '{@link org.eclipse.athene.nn.model.keras.OutputNode#getConnectedNode <em>Connected Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connected Node</em>' reference.
	 * @see #getConnectedNode()
	 * @generated
	 */
	void setConnectedNode(InputNode value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='int _size = this.getLayer().getOutputNodes().size();\n&lt;%java.lang.String%&gt; _plus = (\"O\" + &lt;%java.lang.Integer%&gt;.valueOf(_size));\nthis.setName(_plus);'"
	 * @generated
	 */
	void autoName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Removes the input node and its connected input node from the layer
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='&lt;%org.eclipse.athene.nn.model.keras.Layer%&gt; _layer = this.getLayer();\nboolean _tripleEquals = (_layer == null);\nif (_tripleEquals)\n{\n\treturn;\n}\nthis.setLayer(null);\nthis.setOutputTensor(null);\nthis.getConnectedNode().removeFromLayer();\nthis.setConnectedNode(null);'"
	 * @generated
	 */
	void removeFromLayer();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetUnique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='&lt;%org.eclipse.athene.nn.model.keras.Tensor%&gt; tensor = null;\n&lt;%org.eclipse.athene.nn.model.keras.Tensor%&gt; _outputTensor = this.getOutputTensor();\nboolean _tripleNotEquals = (_outputTensor != null);\nif (_tripleNotEquals)\n{\n\ttensor = this.getOutputTensor();\n}\nelse\n{\n\ttensor = &lt;%org.eclipse.athene.nn.model.keras.KerasFactory%&gt;.eINSTANCE.createTensor();\n\tthis.setOutputTensor(tensor);\n}\nfinal &lt;%org.eclipse.athene.nn.model.keras.InputNode%&gt; targetInputNode = target.createInputNode();\ntarget.getInputNodes().add(targetInputNode);\ntargetInputNode.autoName();\nfinal &lt;%org.eclipse.athene.nn.model.keras.OutputNode%&gt; targetOutputNode = target.creatOutputNode();\ntarget.getOutputNodes().add(targetOutputNode);\ntargetOutputNode.autoName();\ntargetOutputNode.setConnectedNode(targetInputNode);\ntargetInputNode.connectInputTensor(tensor);\n&lt;%java.lang.String%&gt; _name = tensor.getName();\nboolean _tripleEquals = (_name == null);\nif (_tripleEquals)\n{\n\ttensor.autoName();\n}'"
	 * @generated
	 */
	void connectToInputLayer(Layer target);

} // OutputNode
