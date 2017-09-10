/**
 */
package com.lunifera.nndesigner.model;

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
 *   <li>{@link com.lunifera.nndesigner.model.Layer#getInputSources <em>Input Sources</em>}</li>
 * </ul>
 *
 * @see com.lunifera.nndesigner.model.ModelPackage#getLayer()
 * @model abstract="true"
 * @generated
 */
public interface Layer extends InputSource {
	/**
	 * Returns the value of the '<em><b>Input Sources</b></em>' reference list.
	 * The list contents are of type {@link com.lunifera.nndesigner.model.InputSource}.
	 * It is bidirectional and its opposite is '{@link com.lunifera.nndesigner.model.InputSource#getTargetLayers <em>Target Layers</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Sources</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Sources</em>' reference list.
	 * @see com.lunifera.nndesigner.model.ModelPackage#getLayer_InputSources()
	 * @see com.lunifera.nndesigner.model.InputSource#getTargetLayers
	 * @model opposite="targetLayers"
	 * @generated
	 */
	EList<InputSource> getInputSources();

} // Layer
