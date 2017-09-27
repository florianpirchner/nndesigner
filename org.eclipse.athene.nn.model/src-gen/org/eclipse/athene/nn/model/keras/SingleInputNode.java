/**
 */
package org.eclipse.athene.nn.model.keras;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Single Input Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * Only one tensor can connect to this node as an input.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.athene.nn.model.keras.SingleInputNode#getInputTensor <em>Input Tensor</em>}</li>
 * </ul>
 *
 * @see org.eclipse.athene.nn.model.keras.KerasPackage#getSingleInputNode()
 * @model
 * @generated
 */
public interface SingleInputNode extends InputNode {
	/**
	 * Returns the value of the '<em><b>Input Tensor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Tensor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Tensor</em>' reference.
	 * @see #setInputTensor(Tensor)
	 * @see org.eclipse.athene.nn.model.keras.KerasPackage#getSingleInputNode_InputTensor()
	 * @model
	 * @generated
	 */
	Tensor getInputTensor();

	/**
	 * Sets the value of the '{@link org.eclipse.athene.nn.model.keras.SingleInputNode#getInputTensor <em>Input Tensor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Tensor</em>' reference.
	 * @see #getInputTensor()
	 * @generated
	 */
	void setInputTensor(Tensor value);

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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='this.setInputTensor(t);\n&lt;%org.eclipse.emf.common.util.EList%&gt;&lt;&lt;%org.eclipse.athene.nn.model.keras.InputNode%&gt;&gt; _consumingNodes = t.getConsumingNodes();\n_consumingNodes.add(this);'"
	 * @generated
	 */
	void connectInputTensor(Tensor t);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model tUnique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='&lt;%org.eclipse.athene.nn.model.keras.Tensor%&gt; _inputTensor = this.getInputTensor();\nboolean _tripleEquals = (_inputTensor == t);\nif (_tripleEquals)\n{\n\tthis.setInputTensor(t);\n\t&lt;%org.eclipse.emf.common.util.EList%&gt;&lt;&lt;%org.eclipse.athene.nn.model.keras.InputNode%&gt;&gt; _consumingNodes = t.getConsumingNodes();\n\t_consumingNodes.remove(this);\n}'"
	 * @generated
	 */
	void deconnectInputTensor(Tensor t);

} // SingleInputNode
