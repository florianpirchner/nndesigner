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
 *   <li>{@link org.eclipse.athene.nn.model.keras.Layer#getNodes <em>Nodes</em>}</li>
 * </ul>
 *
 * @see org.eclipse.athene.nn.model.keras.KerasPackage#getLayer()
 * @model
 * @generated
 */
public interface Layer extends org.eclipse.athene.nn.model.tensorflow.Layer {
	/**
	 * Returns the value of the '<em><b>Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.athene.nn.model.keras.Node}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nodes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes</em>' containment reference list.
	 * @see org.eclipse.athene.nn.model.keras.KerasPackage#getLayer_Nodes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Node> getNodes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Returns the output tensor for the given node index
	 * <!-- end-model-doc -->
	 * @model unique="false" indexUnique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return this.getNodes().get(index).getOutput();'"
	 * @generated
	 */
	Tensor getOutput(int index);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Returns the input tensor for the given node index
	 * <!-- end-model-doc -->
	 * @model unique="false" indexUnique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return this.getNodes().get(index).getInput();'"
	 * @generated
	 */
	Tensor getInput(int index);

} // Layer
