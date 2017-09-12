/**
 */
package org.eclipse.athene.nn.model.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shape3 D</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.athene.nn.model.core.Shape3D#getValue2 <em>Value2</em>}</li>
 * </ul>
 *
 * @see org.eclipse.athene.nn.model.core.CorePackage#getShape3D()
 * @model
 * @generated
 */
public interface Shape3D extends Shape2D {
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
	 * @see org.eclipse.athene.nn.model.core.CorePackage#getShape3D_Value2()
	 * @model unique="false"
	 * @generated
	 */
	int getValue2();

	/**
	 * Sets the value of the '{@link org.eclipse.athene.nn.model.core.Shape3D#getValue2 <em>Value2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value2</em>' attribute.
	 * @see #getValue2()
	 * @generated
	 */
	void setValue2(int value);

} // Shape3D
