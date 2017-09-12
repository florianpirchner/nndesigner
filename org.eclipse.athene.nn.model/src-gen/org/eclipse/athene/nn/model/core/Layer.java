/**
 */
package org.eclipse.athene.nn.model.core;

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
 *   <li>{@link org.eclipse.athene.nn.model.core.Layer#getOutputTensors <em>Output Tensors</em>}</li>
 *   <li>{@link org.eclipse.athene.nn.model.core.Layer#getInputTensors <em>Input Tensors</em>}</li>
 * </ul>
 *
 * @see org.eclipse.athene.nn.model.core.CorePackage#getLayer()
 * @model abstract="true"
 * @generated
 */
public interface Layer extends Element {
	/**
	 * Returns the value of the '<em><b>Output Tensors</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.athene.nn.model.core.Tensor}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.athene.nn.model.core.Tensor#getProvidingLayer <em>Providing Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Tensors</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Tensors</em>' containment reference list.
	 * @see org.eclipse.athene.nn.model.core.CorePackage#getLayer_OutputTensors()
	 * @see org.eclipse.athene.nn.model.core.Tensor#getProvidingLayer
	 * @model opposite="providingLayer" containment="true"
	 * @generated
	 */
	EList<Tensor> getOutputTensors();

	/**
	 * Returns the value of the '<em><b>Input Tensors</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.athene.nn.model.core.Tensor}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.athene.nn.model.core.Tensor#getConsumingLayers <em>Consuming Layers</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Tensors</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Tensors</em>' reference list.
	 * @see org.eclipse.athene.nn.model.core.CorePackage#getLayer_InputTensors()
	 * @see org.eclipse.athene.nn.model.core.Tensor#getConsumingLayers
	 * @model opposite="consumingLayers"
	 * @generated
	 */
	EList<Tensor> getInputTensors();

} // Layer
