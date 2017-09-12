/**
 */
package org.eclipse.athene.nn.model.tensorflow;

import org.eclipse.athene.nn.model.core.CorePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.athene.nn.model.tensorflow.TensorflowFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel childCreationExtenders='true' extensibleProviderFactory='true' editDirectory='/org.eclipse.athene.nn.model.edit/src' editorDirectory='/org.eclipse.athene.nn.model.editor/src' basePackage='org.eclipse.athene.nn.model'"
 * @generated
 */
public interface TensorflowPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "tensorflow";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "org.eclipse.athene.nn.model.tensorflow";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "tensorflow";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TensorflowPackage eINSTANCE = org.eclipse.athene.nn.model.tensorflow.impl.TensorflowPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.athene.nn.model.tensorflow.impl.LayerImpl <em>Layer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.athene.nn.model.tensorflow.impl.LayerImpl
	 * @see org.eclipse.athene.nn.model.tensorflow.impl.TensorflowPackageImpl#getLayer()
	 * @generated
	 */
	int LAYER = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER__NAME = CorePackage.LAYER__NAME;

	/**
	 * The feature id for the '<em><b>Output Tensors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER__OUTPUT_TENSORS = CorePackage.LAYER__OUTPUT_TENSORS;

	/**
	 * The feature id for the '<em><b>Input Tensors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER__INPUT_TENSORS = CorePackage.LAYER__INPUT_TENSORS;

	/**
	 * The feature id for the '<em><b>Trainable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER__TRAINABLE = CorePackage.LAYER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_FEATURE_COUNT = CorePackage.LAYER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_OPERATION_COUNT = CorePackage.LAYER_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.eclipse.athene.nn.model.tensorflow.Layer <em>Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Layer</em>'.
	 * @see org.eclipse.athene.nn.model.tensorflow.Layer
	 * @generated
	 */
	EClass getLayer();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.athene.nn.model.tensorflow.Layer#isTrainable <em>Trainable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Trainable</em>'.
	 * @see org.eclipse.athene.nn.model.tensorflow.Layer#isTrainable()
	 * @see #getLayer()
	 * @generated
	 */
	EAttribute getLayer_Trainable();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TensorflowFactory getTensorflowFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.athene.nn.model.tensorflow.impl.LayerImpl <em>Layer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.athene.nn.model.tensorflow.impl.LayerImpl
		 * @see org.eclipse.athene.nn.model.tensorflow.impl.TensorflowPackageImpl#getLayer()
		 * @generated
		 */
		EClass LAYER = eINSTANCE.getLayer();

		/**
		 * The meta object literal for the '<em><b>Trainable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAYER__TRAINABLE = eINSTANCE.getLayer_Trainable();

	}

} //TensorflowPackage
