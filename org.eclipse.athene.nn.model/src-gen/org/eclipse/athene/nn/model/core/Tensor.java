/**
 */
package org.eclipse.athene.nn.model.core;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tensor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.athene.nn.model.core.Tensor#getProvidingLayer <em>Providing Layer</em>}</li>
 *   <li>{@link org.eclipse.athene.nn.model.core.Tensor#getConsumingLayers <em>Consuming Layers</em>}</li>
 * </ul>
 *
 * @see org.eclipse.athene.nn.model.core.CorePackage#getTensor()
 * @model
 * @generated
 */
public interface Tensor extends EObject {
	/**
	 * Returns the value of the '<em><b>Providing Layer</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.athene.nn.model.core.Layer#getOutputTensors <em>Output Tensors</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Providing Layer</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Providing Layer</em>' container reference.
	 * @see #setProvidingLayer(Layer)
	 * @see org.eclipse.athene.nn.model.core.CorePackage#getTensor_ProvidingLayer()
	 * @see org.eclipse.athene.nn.model.core.Layer#getOutputTensors
	 * @model opposite="outputTensors" transient="false"
	 * @generated
	 */
	Layer getProvidingLayer();

	/**
	 * Sets the value of the '{@link org.eclipse.athene.nn.model.core.Tensor#getProvidingLayer <em>Providing Layer</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Providing Layer</em>' container reference.
	 * @see #getProvidingLayer()
	 * @generated
	 */
	void setProvidingLayer(Layer value);

	/**
	 * Returns the value of the '<em><b>Consuming Layers</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.athene.nn.model.core.Layer}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.athene.nn.model.core.Layer#getInputTensors <em>Input Tensors</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Consuming Layers</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consuming Layers</em>' reference list.
	 * @see org.eclipse.athene.nn.model.core.CorePackage#getTensor_ConsumingLayers()
	 * @see org.eclipse.athene.nn.model.core.Layer#getInputTensors
	 * @model opposite="inputTensors"
	 * @generated
	 */
	EList<Layer> getConsumingLayers();

} // Tensor
