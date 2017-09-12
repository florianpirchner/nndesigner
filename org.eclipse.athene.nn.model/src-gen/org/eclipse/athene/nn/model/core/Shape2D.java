/**
 */
package org.eclipse.athene.nn.model.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shape2 D</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.athene.nn.model.core.Shape2D#getValue1 <em>Value1</em>}</li>
 * </ul>
 *
 * @see org.eclipse.athene.nn.model.core.CorePackage#getShape2D()
 * @model
 * @generated
 */
public interface Shape2D extends Shape {
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
	 * @see org.eclipse.athene.nn.model.core.CorePackage#getShape2D_Value1()
	 * @model unique="false"
	 * @generated
	 */
	int getValue1();

	/**
	 * Sets the value of the '{@link org.eclipse.athene.nn.model.core.Shape2D#getValue1 <em>Value1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value1</em>' attribute.
	 * @see #getValue1()
	 * @generated
	 */
	void setValue1(int value);

} // Shape2D
