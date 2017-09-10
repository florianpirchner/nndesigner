/**
 */
package com.lunifera.nndesigner.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Design</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.lunifera.nndesigner.model.Design#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see com.lunifera.nndesigner.model.ModelPackage#getDesign()
 * @model
 * @generated
 */
public interface Design extends EObject {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link com.lunifera.nndesigner.model.Element}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see com.lunifera.nndesigner.model.ModelPackage#getDesign_Elements()
	 * @model containment="true"
	 * @generated
	 */
	EList<Element> getElements();

} // Design