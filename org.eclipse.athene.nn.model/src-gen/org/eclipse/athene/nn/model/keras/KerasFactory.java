/**
 */
package org.eclipse.athene.nn.model.keras;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.athene.nn.model.keras.KerasPackage
 * @generated
 */
public interface KerasFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	KerasFactory eINSTANCE = org.eclipse.athene.nn.model.keras.impl.KerasFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model</em>'.
	 * @generated
	 */
	Model createModel();

	/**
	 * Returns a new object of class '<em>Dense</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dense</em>'.
	 * @generated
	 */
	Dense createDense();

	/**
	 * Returns a new object of class '<em>Dropout</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dropout</em>'.
	 * @generated
	 */
	Dropout createDropout();

	/**
	 * Returns a new object of class '<em>Activation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Activation</em>'.
	 * @generated
	 */
	Activation createActivation();

	/**
	 * Returns a new object of class '<em>Reshape</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reshape</em>'.
	 * @generated
	 */
	Reshape createReshape();

	/**
	 * Returns a new object of class '<em>Flatten</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Flatten</em>'.
	 * @generated
	 */
	Flatten createFlatten();

	/**
	 * Returns a new object of class '<em>Permute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Permute</em>'.
	 * @generated
	 */
	Permute createPermute();

	/**
	 * Returns a new object of class '<em>Repeat Vector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Repeat Vector</em>'.
	 * @generated
	 */
	RepeatVector createRepeatVector();

	/**
	 * Returns a new object of class '<em>Activity Regularization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Activity Regularization</em>'.
	 * @generated
	 */
	ActivityRegularization createActivityRegularization();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	KerasPackage getKerasPackage();

} //KerasFactory
