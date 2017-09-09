/**
 */
package nndesigner;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Keras Dense Layer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link nndesigner.KerasDenseLayer#getNumberOfOutputUnits <em>Number Of Output Units</em>}</li>
 *   <li>{@link nndesigner.KerasDenseLayer#getInputShape <em>Input Shape</em>}</li>
 *   <li>{@link nndesigner.KerasDenseLayer#isUseBias <em>Use Bias</em>}</li>
 *   <li>{@link nndesigner.KerasDenseLayer#getActivationFunction <em>Activation Function</em>}</li>
 *   <li>{@link nndesigner.KerasDenseLayer#getWeightsInitializer <em>Weights Initializer</em>}</li>
 *   <li>{@link nndesigner.KerasDenseLayer#getBiasInitializer <em>Bias Initializer</em>}</li>
 * </ul>
 *
 * @see nndesigner.NndesignerPackage#getKerasDenseLayer()
 * @model
 * @generated
 */
public interface KerasDenseLayer extends Layer {
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
	 * @see nndesigner.NndesignerPackage#getKerasDenseLayer_NumberOfOutputUnits()
	 * @model unique="false"
	 * @generated
	 */
	int getNumberOfOutputUnits();

	/**
	 * Sets the value of the '{@link nndesigner.KerasDenseLayer#getNumberOfOutputUnits <em>Number Of Output Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Output Units</em>' attribute.
	 * @see #getNumberOfOutputUnits()
	 * @generated
	 */
	void setNumberOfOutputUnits(int value);

	/**
	 * Returns the value of the '<em><b>Input Shape</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * nD tensor with shape: (batch_size, ..., input_dim).
	 * The most common situation would be a 2D input with shape (batch_size, input_dim)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Input Shape</em>' attribute list.
	 * @see nndesigner.NndesignerPackage#getKerasDenseLayer_InputShape()
	 * @model unique="false"
	 * @generated
	 */
	EList<Integer> getInputShape();

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
	 * @see nndesigner.NndesignerPackage#getKerasDenseLayer_UseBias()
	 * @model unique="false"
	 * @generated
	 */
	boolean isUseBias();

	/**
	 * Sets the value of the '{@link nndesigner.KerasDenseLayer#isUseBias <em>Use Bias</em>}' attribute.
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
	 * @see nndesigner.NndesignerPackage#getKerasDenseLayer_ActivationFunction()
	 * @model
	 * @generated
	 */
	ActivationFunction getActivationFunction();

	/**
	 * Sets the value of the '{@link nndesigner.KerasDenseLayer#getActivationFunction <em>Activation Function</em>}' reference.
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
	 * @see nndesigner.NndesignerPackage#getKerasDenseLayer_WeightsInitializer()
	 * @model
	 * @generated
	 */
	InitializerFunction getWeightsInitializer();

	/**
	 * Sets the value of the '{@link nndesigner.KerasDenseLayer#getWeightsInitializer <em>Weights Initializer</em>}' reference.
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
	 * @see nndesigner.NndesignerPackage#getKerasDenseLayer_BiasInitializer()
	 * @model
	 * @generated
	 */
	InitializerFunction getBiasInitializer();

	/**
	 * Sets the value of the '{@link nndesigner.KerasDenseLayer#getBiasInitializer <em>Bias Initializer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bias Initializer</em>' reference.
	 * @see #getBiasInitializer()
	 * @generated
	 */
	void setBiasInitializer(InitializerFunction value);

} // KerasDenseLayer
