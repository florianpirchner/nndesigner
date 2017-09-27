/**
 */
package org.eclipse.athene.nn.model.keras;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multi Input Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * Multiple tensors can connect to this node as an input.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.athene.nn.model.keras.MultiInputNode#getInputTensors <em>Input Tensors</em>}</li>
 * </ul>
 *
 * @see org.eclipse.athene.nn.model.keras.KerasPackage#getMultiInputNode()
 * @model
 * @generated
 */
public interface MultiInputNode extends InputNode {
	/**
	 * Returns the value of the '<em><b>Input Tensors</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.athene.nn.model.keras.Tensor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Tensors</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Tensors</em>' reference list.
	 * @see org.eclipse.athene.nn.model.keras.KerasPackage#getMultiInputNode_InputTensors()
	 * @model
	 * @generated
	 */
	EList<Tensor> getInputTensors();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Removes the input node and its connected output node from the layer
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='&lt;%org.eclipse.athene.nn.model.keras.Layer%&gt; _layer = this.getLayer();\nboolean _tripleEquals = (_layer == null);\nif (_tripleEquals)\n{\n\treturn;\n}\nthis.setLayer(null);\nthis.getInputTensors().clear();\nthis.getConnectedNode().removeFromLayer();\nthis.setConnectedNode(null);'"
	 * @generated
	 */
	void removeFromLayer();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='int _size = this.getLayer().getInputNodes().size();\n&lt;%java.lang.String%&gt; _plus = (\"I\" + &lt;%java.lang.Integer%&gt;.valueOf(_size));\nthis.setName(_plus);'"
	 * @generated
	 */
	void autoName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model tUnique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='&lt;%org.eclipse.emf.common.util.EList%&gt;&lt;&lt;%org.eclipse.athene.nn.model.keras.Tensor%&gt;&gt; _inputTensors = this.getInputTensors();\n_inputTensors.add(t);\n&lt;%org.eclipse.emf.common.util.EList%&gt;&lt;&lt;%org.eclipse.athene.nn.model.keras.InputNode%&gt;&gt; _consumingNodes = t.getConsumingNodes();\n_consumingNodes.add(this);'"
	 * @generated
	 */
	void connectInputTensor(Tensor t);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model tUnique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='&lt;%org.eclipse.emf.common.util.EList%&gt;&lt;&lt;%org.eclipse.athene.nn.model.keras.Tensor%&gt;&gt; _inputTensors = this.getInputTensors();\n_inputTensors.remove(t);\n&lt;%org.eclipse.emf.common.util.EList%&gt;&lt;&lt;%org.eclipse.athene.nn.model.keras.InputNode%&gt;&gt; _consumingNodes = t.getConsumingNodes();\n_consumingNodes.remove(this);'"
	 * @generated
	 */
	void deconnectInputTensor(Tensor t);

} // MultiInputNode
