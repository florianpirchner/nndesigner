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
 *   <li>{@link org.eclipse.athene.nn.model.keras.Tensor#getContainerNode <em>Container Node</em>}</li>
 *   <li>{@link org.eclipse.athene.nn.model.keras.Tensor#getConsumingNodes <em>Consuming Nodes</em>}</li>
 * </ul>
 *
 * @see org.eclipse.athene.nn.model.keras.KerasPackage#getTensor()
 * @model
 * @generated
 */
public interface Tensor extends org.eclipse.athene.nn.model.core.Tensor {
	/**
	 * Returns the value of the '<em><b>Container Node</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.athene.nn.model.keras.OutputNode#getOutputTensor <em>Output Tensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container Node</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container Node</em>' container reference.
	 * @see #setContainerNode(OutputNode)
	 * @see org.eclipse.athene.nn.model.keras.KerasPackage#getTensor_ContainerNode()
	 * @see org.eclipse.athene.nn.model.keras.OutputNode#getOutputTensor
	 * @model opposite="outputTensor" transient="false"
	 * @generated
	 */
	OutputNode getContainerNode();

	/**
	 * Sets the value of the '{@link org.eclipse.athene.nn.model.keras.Tensor#getContainerNode <em>Container Node</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container Node</em>' container reference.
	 * @see #getContainerNode()
	 * @generated
	 */
	void setContainerNode(OutputNode value);

	/**
	 * Returns the value of the '<em><b>Consuming Nodes</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.athene.nn.model.keras.InputNode}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.athene.nn.model.keras.InputNode#getInputTensor <em>Input Tensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Consuming Nodes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consuming Nodes</em>' reference list.
	 * @see org.eclipse.athene.nn.model.keras.KerasPackage#getTensor_ConsumingNodes()
	 * @see org.eclipse.athene.nn.model.keras.InputNode#getInputTensor
	 * @model opposite="inputTensor"
	 * @generated
	 */
	EList<InputNode> getConsumingNodes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Removes the tensor and its container node from its layer
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='&lt;%org.eclipse.athene.nn.model.keras.OutputNode%&gt; _containerNode = this.getContainerNode();\n_containerNode.setLayer(null);\nthis.getConsumingNodes().clear();'"
	 * @generated
	 */
	void removeFromLayer();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Removes the tensor and its container node from its layer
	 * <!-- end-model-doc -->
	 * @model targetInputNodeUnique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='this.getConsumingNodes().remove(targetInputNode);\nboolean _isEmpty = this.getConsumingNodes().isEmpty();\nif (_isEmpty)\n{\n\tthis.removeFromLayer();\n}'"
	 * @generated
	 */
	void unconnectFromTargetInput(InputNode targetInputNode);

} // Tensor
