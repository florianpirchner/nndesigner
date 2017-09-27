/**
 */
package org.eclipse.athene.nn.model.keras;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Layer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.athene.nn.model.keras.Layer#getInputNodes <em>Input Nodes</em>}</li>
 *   <li>{@link org.eclipse.athene.nn.model.keras.Layer#getOutputNodes <em>Output Nodes</em>}</li>
 * </ul>
 *
 * @see org.eclipse.athene.nn.model.keras.KerasPackage#getLayer()
 * @model
 * @generated
 */
public interface Layer extends org.eclipse.athene.nn.model.tensorflow.Layer {
	/**
	 * Returns the value of the '<em><b>Input Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.athene.nn.model.keras.InputNode}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.athene.nn.model.keras.InputNode#getLayer <em>Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Nodes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Nodes</em>' containment reference list.
	 * @see org.eclipse.athene.nn.model.keras.KerasPackage#getLayer_InputNodes()
	 * @see org.eclipse.athene.nn.model.keras.InputNode#getLayer
	 * @model opposite="layer" containment="true"
	 * @generated
	 */
	EList<InputNode> getInputNodes();

	/**
	 * Returns the value of the '<em><b>Output Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.athene.nn.model.keras.OutputNode}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.athene.nn.model.keras.OutputNode#getLayer <em>Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Nodes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Nodes</em>' containment reference list.
	 * @see org.eclipse.athene.nn.model.keras.KerasPackage#getLayer_OutputNodes()
	 * @see org.eclipse.athene.nn.model.keras.OutputNode#getLayer
	 * @model opposite="layer" containment="true"
	 * @generated
	 */
	EList<OutputNode> getOutputNodes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='throw new &lt;%java.lang.UnsupportedOperationException%&gt;(\"Override in subclass\");'"
	 * @generated
	 */
	InputNode createInputNode();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='throw new &lt;%java.lang.UnsupportedOperationException%&gt;(\"Override in subclass\");'"
	 * @generated
	 */
	OutputNode creatOutputNode();

} // Layer
