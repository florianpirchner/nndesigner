/**
 */
package org.eclipse.athene.nn.model.keras;

import org.eclipse.athene.nn.model.core.ActivationFunction;
import org.eclipse.athene.nn.model.core.InitializerFunction;
import org.eclipse.athene.nn.model.core.Shape;

import org.eclipse.athene.nn.model.tensorflow.Layer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dense</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.athene.nn.model.keras.Dense#getNumberOfOutputUnits <em>Number Of Output Units</em>}</li>
 *   <li>{@link org.eclipse.athene.nn.model.keras.Dense#getInputShape <em>Input Shape</em>}</li>
 *   <li>{@link org.eclipse.athene.nn.model.keras.Dense#isUseBias <em>Use Bias</em>}</li>
 *   <li>{@link org.eclipse.athene.nn.model.keras.Dense#getActivationFunction <em>Activation Function</em>}</li>
 *   <li>{@link org.eclipse.athene.nn.model.keras.Dense#getWeightsInitializer <em>Weights Initializer</em>}</li>
 *   <li>{@link org.eclipse.athene.nn.model.keras.Dense#getBiasInitializer <em>Bias Initializer</em>}</li>
 * </ul>
 *
 * @see org.eclipse.athene.nn.model.keras.KerasPackage#getDense()
 * @model
 * @generated
 */
public interface Dense extends Layer {
	/**
	 * Returns the value of the '<em><b>Number Of Output Units</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Of Output Units</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Output Units</em>' attribute.
	 * @see #setNumberOfOutputUnits(int)
	 * @see org.eclipse.athene.nn.model.keras.KerasPackage#getDense_NumberOfOutputUnits()
	 * @model unique="false"
	 * @generated
	 */
	int getNumberOfOutputUnits();

	/**
	 * Sets the value of the '{@link org.eclipse.athene.nn.model.keras.Dense#getNumberOfOutputUnits <em>Number Of Output Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Output Units</em>' attribute.
	 * @see #getNumberOfOutputUnits()
	 * @generated
	 */
	void setNumberOfOutputUnits(int value);

	/**
	 * Returns the value of the '<em><b>Input Shape</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * nD tensor with shape: (batch_size, ..., input_dim).
	 * The most common situation would be a 2D input with shape (batch_size, input_dim)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Input Shape</em>' containment reference.
	 * @see #setInputShape(Shape)
	 * @see org.eclipse.athene.nn.model.keras.KerasPackage#getDense_InputShape()
	 * @model containment="true"
	 * @generated
	 */
	Shape getInputShape();

	/**
	 * Sets the value of the '{@link org.eclipse.athene.nn.model.keras.Dense#getInputShape <em>Input Shape</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Shape</em>' containment reference.
	 * @see #getInputShape()
	 * @generated
	 */
	void setInputShape(Shape value);

	/**
	 * Returns the value of the '<em><b>Use Bias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use Bias</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Bias</em>' attribute.
	 * @see #setUseBias(boolean)
	 * @see org.eclipse.athene.nn.model.keras.KerasPackage#getDense_UseBias()
	 * @model unique="false"
	 * @generated
	 */
	boolean isUseBias();

	/**
	 * Sets the value of the '{@link org.eclipse.athene.nn.model.keras.Dense#isUseBias <em>Use Bias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Bias</em>' attribute.
	 * @see #isUseBias()
	 * @generated
	 */
	void setUseBias(boolean value);

	/**
	 * Returns the value of the '<em><b>Activation Function</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Activation function to use (see <a href="https://keras.io/activations/">activations</a>). <br>
	 * If you don't specify anything, no activation is applied (ie. "linear" activation: a(x) = x).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Activation Function</em>' reference.
	 * @see #setActivationFunction(ActivationFunction)
	 * @see org.eclipse.athene.nn.model.keras.KerasPackage#getDense_ActivationFunction()
	 * @model
	 * @generated
	 */
	ActivationFunction getActivationFunction();

	/**
	 * Sets the value of the '{@link org.eclipse.athene.nn.model.keras.Dense#getActivationFunction <em>Activation Function</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activation Function</em>' reference.
	 * @see #getActivationFunction()
	 * @generated
	 */
	void setActivationFunction(ActivationFunction value);

	/**
	 * Returns the value of the '<em><b>Weights Initializer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Initializer for the kernel weights matrix (see <a href="https://keras.io/initializers/">initializers</a>).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Weights Initializer</em>' reference.
	 * @see #setWeightsInitializer(InitializerFunction)
	 * @see org.eclipse.athene.nn.model.keras.KerasPackage#getDense_WeightsInitializer()
	 * @model
	 * @generated
	 */
	InitializerFunction getWeightsInitializer();

	/**
	 * Sets the value of the '{@link org.eclipse.athene.nn.model.keras.Dense#getWeightsInitializer <em>Weights Initializer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weights Initializer</em>' reference.
	 * @see #getWeightsInitializer()
	 * @generated
	 */
	void setWeightsInitializer(InitializerFunction value);

	/**
	 * Returns the value of the '<em><b>Bias Initializer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Initializer for the bias vector (see <a href="https://keras.io/initializers/">initializers</a>).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bias Initializer</em>' reference.
	 * @see #setBiasInitializer(InitializerFunction)
	 * @see org.eclipse.athene.nn.model.keras.KerasPackage#getDense_BiasInitializer()
	 * @model
	 * @generated
	 */
	InitializerFunction getBiasInitializer();

	/**
	 * Sets the value of the '{@link org.eclipse.athene.nn.model.keras.Dense#getBiasInitializer <em>Bias Initializer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bias Initializer</em>' reference.
	 * @see #getBiasInitializer()
	 * @generated
	 */
	void setBiasInitializer(InitializerFunction value);

} // Dense
