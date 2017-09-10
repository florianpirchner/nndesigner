/**
 */
package com.lunifera.nndesigner.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input Source</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.lunifera.nndesigner.model.InputSource#getTargetLayers <em>Target Layers</em>}</li>
 * </ul>
 *
 * @see com.lunifera.nndesigner.model.ModelPackage#getInputSource()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface InputSource extends Element {
	/**
	 * Returns the value of the '<em><b>Target Layers</b></em>' reference list.
	 * The list contents are of type {@link com.lunifera.nndesigner.model.Layer}.
	 * It is bidirectional and its opposite is '{@link com.lunifera.nndesigner.model.Layer#getInputSources <em>Input Sources</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Layers</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Layers</em>' reference list.
	 * @see com.lunifera.nndesigner.model.ModelPackage#getInputSource_TargetLayers()
	 * @see com.lunifera.nndesigner.model.Layer#getInputSources
	 * @model opposite="inputSources"
	 * @generated
	 */
	EList<Layer> getTargetLayers();

} // InputSource
