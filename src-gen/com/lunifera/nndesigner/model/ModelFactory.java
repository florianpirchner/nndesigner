/**
 */
package com.lunifera.nndesigner.model;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.lunifera.nndesigner.model.ModelPackage
 * @generated
 */
public interface ModelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModelFactory eINSTANCE = com.lunifera.nndesigner.model.impl.ModelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Design</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Design</em>'.
	 * @generated
	 */
	Design createDesign();

	/**
	 * Returns a new object of class '<em>Shape2 D</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Shape2 D</em>'.
	 * @generated
	 */
	Shape2D createShape2D();

	/**
	 * Returns a new object of class '<em>Shape3 D</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Shape3 D</em>'.
	 * @generated
	 */
	Shape3D createShape3D();

	/**
	 * Returns a new object of class '<em>Integer Duple</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Integer Duple</em>'.
	 * @generated
	 */
	IntegerDuple createIntegerDuple();

	/**
	 * Returns a new object of class '<em>Matmul Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Matmul Function</em>'.
	 * @generated
	 */
	MatmulFunction createMatmulFunction();

	/**
	 * Returns a new object of class '<em>Dot Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dot Function</em>'.
	 * @generated
	 */
	DotFunction createDotFunction();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ModelPackage getModelPackage();

} //ModelFactory
