/**
 */
package com.lunifera.nndesigner.model.keras;

import com.lunifera.nndesigner.model.Layer;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.lunifera.nndesigner.model.keras.Model#getInputs <em>Inputs</em>}</li>
 *   <li>{@link com.lunifera.nndesigner.model.keras.Model#getOutputs <em>Outputs</em>}</li>
 * </ul>
 *
 * @see com.lunifera.nndesigner.model.keras.KerasPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends com.lunifera.nndesigner.model.Model {
	/**
	 * Returns the value of the '<em><b>Inputs</b></em>' reference list.
	 * The list contents are of type {@link com.lunifera.nndesigner.model.Layer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inputs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inputs</em>' reference list.
	 * @see com.lunifera.nndesigner.model.keras.KerasPackage#getModel_Inputs()
	 * @model
	 * @generated
	 */
	EList<Layer> getInputs();

	/**
	 * Returns the value of the '<em><b>Outputs</b></em>' reference list.
	 * The list contents are of type {@link com.lunifera.nndesigner.model.Layer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outputs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outputs</em>' reference list.
	 * @see com.lunifera.nndesigner.model.keras.KerasPackage#getModel_Outputs()
	 * @model
	 * @generated
	 */
	EList<Layer> getOutputs();

} // Model
