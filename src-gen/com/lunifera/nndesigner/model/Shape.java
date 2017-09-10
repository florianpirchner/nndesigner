/**
 */
package com.lunifera.nndesigner.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shape</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.lunifera.nndesigner.model.Shape#getBatchSize <em>Batch Size</em>}</li>
 * </ul>
 *
 * @see com.lunifera.nndesigner.model.ModelPackage#getShape()
 * @model abstract="true"
 * @generated
 */
public interface Shape extends EObject {
	/**
	 * Returns the value of the '<em><b>Batch Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Batch Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Batch Size</em>' attribute.
	 * @see #setBatchSize(int)
	 * @see com.lunifera.nndesigner.model.ModelPackage#getShape_BatchSize()
	 * @model unique="false"
	 * @generated
	 */
	int getBatchSize();

	/**
	 * Sets the value of the '{@link com.lunifera.nndesigner.model.Shape#getBatchSize <em>Batch Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Batch Size</em>' attribute.
	 * @see #getBatchSize()
	 * @generated
	 */
	void setBatchSize(int value);

} // Shape
