/**
 */
package nndesigner;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see nndesigner.NndesignerPackage
 * @generated
 */
public interface NndesignerFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	NndesignerFactory eINSTANCE = nndesigner.impl.NndesignerFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Design</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Design</em>'.
	 * @generated
	 */
	Design createDesign();

	/**
	 * Returns a new object of class '<em>Keras Dense Layer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Keras Dense Layer</em>'.
	 * @generated
	 */
	KerasDenseLayer createKerasDenseLayer();

	/**
	 * Returns a new object of class '<em>Keras Dropout</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Keras Dropout</em>'.
	 * @generated
	 */
	KerasDropout createKerasDropout();

	/**
	 * Returns a new object of class '<em>Keras Reshape</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Keras Reshape</em>'.
	 * @generated
	 */
	KerasReshape createKerasReshape();

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
	NndesignerPackage getNndesignerPackage();

} //NndesignerFactory
