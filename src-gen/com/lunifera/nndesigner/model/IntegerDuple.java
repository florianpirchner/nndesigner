/**
 */
package com.lunifera.nndesigner.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Integer Duple</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.lunifera.nndesigner.model.IntegerDuple#getValue1 <em>Value1</em>}</li>
 *   <li>{@link com.lunifera.nndesigner.model.IntegerDuple#getValue2 <em>Value2</em>}</li>
 * </ul>
 *
 * @see com.lunifera.nndesigner.model.ModelPackage#getIntegerDuple()
 * @model
 * @generated
 */
public interface IntegerDuple extends EObject {
	/**
	 * Returns the value of the '<em><b>Value1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value1</em>' attribute.
	 * @see #setValue1(int)
	 * @see com.lunifera.nndesigner.model.ModelPackage#getIntegerDuple_Value1()
	 * @model unique="false"
	 * @generated
	 */
	int getValue1();

	/**
	 * Sets the value of the '{@link com.lunifera.nndesigner.model.IntegerDuple#getValue1 <em>Value1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value1</em>' attribute.
	 * @see #getValue1()
	 * @generated
	 */
	void setValue1(int value);

	/**
	 * Returns the value of the '<em><b>Value2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value2</em>' attribute.
	 * @see #setValue2(int)
	 * @see com.lunifera.nndesigner.model.ModelPackage#getIntegerDuple_Value2()
	 * @model unique="false"
	 * @generated
	 */
	int getValue2();

	/**
	 * Sets the value of the '{@link com.lunifera.nndesigner.model.IntegerDuple#getValue2 <em>Value2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value2</em>' attribute.
	 * @see #getValue2()
	 * @generated
	 */
	void setValue2(int value);

} // IntegerDuple
