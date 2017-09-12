/**
 */
package org.eclipse.athene.nn.model.keras;

import org.eclipse.athene.nn.model.core.CorePackage;

import org.eclipse.athene.nn.model.tensorflow.TensorflowPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see org.eclipse.athene.nn.model.keras.KerasFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel childCreationExtenders='true' extensibleProviderFactory='true' editDirectory='/org.eclipse.athene.nn.model.edit/src' editorDirectory='/org.eclipse.athene.nn.model.editor/src' basePackage='org.eclipse.athene.nn.model'"
 * @generated
 */
public interface KerasPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "keras";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "org.eclipse.athene.nn.model.keras";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "keras";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	KerasPackage eINSTANCE = org.eclipse.athene.nn.model.keras.impl.KerasPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.athene.nn.model.keras.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.athene.nn.model.keras.impl.ModelImpl
	 * @see org.eclipse.athene.nn.model.keras.impl.KerasPackageImpl#getModel()
	 * @generated
	 */
	int MODEL = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__NAME = CorePackage.MODEL__NAME;

	/**
	 * The feature id for the '<em><b>Output Tensors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__OUTPUT_TENSORS = CorePackage.MODEL__OUTPUT_TENSORS;

	/**
	 * The feature id for the '<em><b>Input Tensors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__INPUT_TENSORS = CorePackage.MODEL__INPUT_TENSORS;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = CorePackage.MODEL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_OPERATION_COUNT = CorePackage.MODEL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.athene.nn.model.keras.impl.DenseImpl <em>Dense</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.athene.nn.model.keras.impl.DenseImpl
	 * @see org.eclipse.athene.nn.model.keras.impl.KerasPackageImpl#getDense()
	 * @generated
	 */
	int DENSE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENSE__NAME = TensorflowPackage.LAYER__NAME;

	/**
	 * The feature id for the '<em><b>Output Tensors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENSE__OUTPUT_TENSORS = TensorflowPackage.LAYER__OUTPUT_TENSORS;

	/**
	 * The feature id for the '<em><b>Input Tensors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENSE__INPUT_TENSORS = TensorflowPackage.LAYER__INPUT_TENSORS;

	/**
	 * The feature id for the '<em><b>Trainable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENSE__TRAINABLE = TensorflowPackage.LAYER__TRAINABLE;

	/**
	 * The feature id for the '<em><b>Number Of Output Units</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENSE__NUMBER_OF_OUTPUT_UNITS = TensorflowPackage.LAYER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input Shape</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENSE__INPUT_SHAPE = TensorflowPackage.LAYER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Use Bias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENSE__USE_BIAS = TensorflowPackage.LAYER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Activation Function</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENSE__ACTIVATION_FUNCTION = TensorflowPackage.LAYER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Weights Initializer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENSE__WEIGHTS_INITIALIZER = TensorflowPackage.LAYER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Bias Initializer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENSE__BIAS_INITIALIZER = TensorflowPackage.LAYER_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Dense</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENSE_FEATURE_COUNT = TensorflowPackage.LAYER_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Dense</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENSE_OPERATION_COUNT = TensorflowPackage.LAYER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.athene.nn.model.keras.impl.DropoutImpl <em>Dropout</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.athene.nn.model.keras.impl.DropoutImpl
	 * @see org.eclipse.athene.nn.model.keras.impl.KerasPackageImpl#getDropout()
	 * @generated
	 */
	int DROPOUT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPOUT__NAME = TensorflowPackage.LAYER__NAME;

	/**
	 * The feature id for the '<em><b>Output Tensors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPOUT__OUTPUT_TENSORS = TensorflowPackage.LAYER__OUTPUT_TENSORS;

	/**
	 * The feature id for the '<em><b>Input Tensors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPOUT__INPUT_TENSORS = TensorflowPackage.LAYER__INPUT_TENSORS;

	/**
	 * The feature id for the '<em><b>Trainable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPOUT__TRAINABLE = TensorflowPackage.LAYER__TRAINABLE;

	/**
	 * The feature id for the '<em><b>Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPOUT__RATE = TensorflowPackage.LAYER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Noise Shape</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPOUT__NOISE_SHAPE = TensorflowPackage.LAYER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Seed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPOUT__SEED = TensorflowPackage.LAYER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Dropout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPOUT_FEATURE_COUNT = TensorflowPackage.LAYER_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Dropout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPOUT_OPERATION_COUNT = TensorflowPackage.LAYER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.athene.nn.model.keras.impl.ActivationImpl <em>Activation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.athene.nn.model.keras.impl.ActivationImpl
	 * @see org.eclipse.athene.nn.model.keras.impl.KerasPackageImpl#getActivation()
	 * @generated
	 */
	int ACTIVATION = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVATION__NAME = TensorflowPackage.LAYER__NAME;

	/**
	 * The feature id for the '<em><b>Output Tensors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVATION__OUTPUT_TENSORS = TensorflowPackage.LAYER__OUTPUT_TENSORS;

	/**
	 * The feature id for the '<em><b>Input Tensors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVATION__INPUT_TENSORS = TensorflowPackage.LAYER__INPUT_TENSORS;

	/**
	 * The feature id for the '<em><b>Trainable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVATION__TRAINABLE = TensorflowPackage.LAYER__TRAINABLE;

	/**
	 * The feature id for the '<em><b>Activation Function</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVATION__ACTIVATION_FUNCTION = TensorflowPackage.LAYER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input Shape</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVATION__INPUT_SHAPE = TensorflowPackage.LAYER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Activation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVATION_FEATURE_COUNT = TensorflowPackage.LAYER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Activation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVATION_OPERATION_COUNT = TensorflowPackage.LAYER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.athene.nn.model.keras.impl.ReshapeImpl <em>Reshape</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.athene.nn.model.keras.impl.ReshapeImpl
	 * @see org.eclipse.athene.nn.model.keras.impl.KerasPackageImpl#getReshape()
	 * @generated
	 */
	int RESHAPE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESHAPE__NAME = TensorflowPackage.LAYER__NAME;

	/**
	 * The feature id for the '<em><b>Output Tensors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESHAPE__OUTPUT_TENSORS = TensorflowPackage.LAYER__OUTPUT_TENSORS;

	/**
	 * The feature id for the '<em><b>Input Tensors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESHAPE__INPUT_TENSORS = TensorflowPackage.LAYER__INPUT_TENSORS;

	/**
	 * The feature id for the '<em><b>Trainable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESHAPE__TRAINABLE = TensorflowPackage.LAYER__TRAINABLE;

	/**
	 * The feature id for the '<em><b>Target Shape</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESHAPE__TARGET_SHAPE = TensorflowPackage.LAYER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input Shape</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESHAPE__INPUT_SHAPE = TensorflowPackage.LAYER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Output Shape</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESHAPE__OUTPUT_SHAPE = TensorflowPackage.LAYER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Reshape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESHAPE_FEATURE_COUNT = TensorflowPackage.LAYER_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Reshape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESHAPE_OPERATION_COUNT = TensorflowPackage.LAYER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.athene.nn.model.keras.impl.FlattenImpl <em>Flatten</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.athene.nn.model.keras.impl.FlattenImpl
	 * @see org.eclipse.athene.nn.model.keras.impl.KerasPackageImpl#getFlatten()
	 * @generated
	 */
	int FLATTEN = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLATTEN__NAME = TensorflowPackage.LAYER__NAME;

	/**
	 * The feature id for the '<em><b>Output Tensors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLATTEN__OUTPUT_TENSORS = TensorflowPackage.LAYER__OUTPUT_TENSORS;

	/**
	 * The feature id for the '<em><b>Input Tensors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLATTEN__INPUT_TENSORS = TensorflowPackage.LAYER__INPUT_TENSORS;

	/**
	 * The feature id for the '<em><b>Trainable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLATTEN__TRAINABLE = TensorflowPackage.LAYER__TRAINABLE;

	/**
	 * The number of structural features of the '<em>Flatten</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLATTEN_FEATURE_COUNT = TensorflowPackage.LAYER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Flatten</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLATTEN_OPERATION_COUNT = TensorflowPackage.LAYER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.athene.nn.model.keras.impl.PermuteImpl <em>Permute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.athene.nn.model.keras.impl.PermuteImpl
	 * @see org.eclipse.athene.nn.model.keras.impl.KerasPackageImpl#getPermute()
	 * @generated
	 */
	int PERMUTE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMUTE__NAME = TensorflowPackage.LAYER__NAME;

	/**
	 * The feature id for the '<em><b>Output Tensors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMUTE__OUTPUT_TENSORS = TensorflowPackage.LAYER__OUTPUT_TENSORS;

	/**
	 * The feature id for the '<em><b>Input Tensors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMUTE__INPUT_TENSORS = TensorflowPackage.LAYER__INPUT_TENSORS;

	/**
	 * The feature id for the '<em><b>Trainable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMUTE__TRAINABLE = TensorflowPackage.LAYER__TRAINABLE;

	/**
	 * The feature id for the '<em><b>Dims</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMUTE__DIMS = TensorflowPackage.LAYER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input Shape</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMUTE__INPUT_SHAPE = TensorflowPackage.LAYER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Output Shape</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMUTE__OUTPUT_SHAPE = TensorflowPackage.LAYER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Permute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMUTE_FEATURE_COUNT = TensorflowPackage.LAYER_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Permute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMUTE_OPERATION_COUNT = TensorflowPackage.LAYER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.athene.nn.model.keras.impl.RepeatVectorImpl <em>Repeat Vector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.athene.nn.model.keras.impl.RepeatVectorImpl
	 * @see org.eclipse.athene.nn.model.keras.impl.KerasPackageImpl#getRepeatVector()
	 * @generated
	 */
	int REPEAT_VECTOR = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_VECTOR__NAME = TensorflowPackage.LAYER__NAME;

	/**
	 * The feature id for the '<em><b>Output Tensors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_VECTOR__OUTPUT_TENSORS = TensorflowPackage.LAYER__OUTPUT_TENSORS;

	/**
	 * The feature id for the '<em><b>Input Tensors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_VECTOR__INPUT_TENSORS = TensorflowPackage.LAYER__INPUT_TENSORS;

	/**
	 * The feature id for the '<em><b>Trainable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_VECTOR__TRAINABLE = TensorflowPackage.LAYER__TRAINABLE;

	/**
	 * The feature id for the '<em><b>Number Of Repeats</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_VECTOR__NUMBER_OF_REPEATS = TensorflowPackage.LAYER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input Shape</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_VECTOR__INPUT_SHAPE = TensorflowPackage.LAYER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Output Shape</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_VECTOR__OUTPUT_SHAPE = TensorflowPackage.LAYER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Repeat Vector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_VECTOR_FEATURE_COUNT = TensorflowPackage.LAYER_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Repeat Vector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_VECTOR_OPERATION_COUNT = TensorflowPackage.LAYER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.athene.nn.model.keras.impl.ActivityRegularizationImpl <em>Activity Regularization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.athene.nn.model.keras.impl.ActivityRegularizationImpl
	 * @see org.eclipse.athene.nn.model.keras.impl.KerasPackageImpl#getActivityRegularization()
	 * @generated
	 */
	int ACTIVITY_REGULARIZATION = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_REGULARIZATION__NAME = TensorflowPackage.LAYER__NAME;

	/**
	 * The feature id for the '<em><b>Output Tensors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_REGULARIZATION__OUTPUT_TENSORS = TensorflowPackage.LAYER__OUTPUT_TENSORS;

	/**
	 * The feature id for the '<em><b>Input Tensors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_REGULARIZATION__INPUT_TENSORS = TensorflowPackage.LAYER__INPUT_TENSORS;

	/**
	 * The feature id for the '<em><b>Trainable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_REGULARIZATION__TRAINABLE = TensorflowPackage.LAYER__TRAINABLE;

	/**
	 * The feature id for the '<em><b>L1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_REGULARIZATION__L1 = TensorflowPackage.LAYER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>L2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_REGULARIZATION__L2 = TensorflowPackage.LAYER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Input Shape</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_REGULARIZATION__INPUT_SHAPE = TensorflowPackage.LAYER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Activity Regularization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_REGULARIZATION_FEATURE_COUNT = TensorflowPackage.LAYER_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Activity Regularization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_REGULARIZATION_OPERATION_COUNT = TensorflowPackage.LAYER_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.eclipse.athene.nn.model.keras.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see org.eclipse.athene.nn.model.keras.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for class '{@link org.eclipse.athene.nn.model.keras.Dense <em>Dense</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dense</em>'.
	 * @see org.eclipse.athene.nn.model.keras.Dense
	 * @generated
	 */
	EClass getDense();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.athene.nn.model.keras.Dense#getNumberOfOutputUnits <em>Number Of Output Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Output Units</em>'.
	 * @see org.eclipse.athene.nn.model.keras.Dense#getNumberOfOutputUnits()
	 * @see #getDense()
	 * @generated
	 */
	EAttribute getDense_NumberOfOutputUnits();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.athene.nn.model.keras.Dense#getInputShape <em>Input Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Input Shape</em>'.
	 * @see org.eclipse.athene.nn.model.keras.Dense#getInputShape()
	 * @see #getDense()
	 * @generated
	 */
	EReference getDense_InputShape();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.athene.nn.model.keras.Dense#isUseBias <em>Use Bias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use Bias</em>'.
	 * @see org.eclipse.athene.nn.model.keras.Dense#isUseBias()
	 * @see #getDense()
	 * @generated
	 */
	EAttribute getDense_UseBias();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.athene.nn.model.keras.Dense#getActivationFunction <em>Activation Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Activation Function</em>'.
	 * @see org.eclipse.athene.nn.model.keras.Dense#getActivationFunction()
	 * @see #getDense()
	 * @generated
	 */
	EReference getDense_ActivationFunction();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.athene.nn.model.keras.Dense#getWeightsInitializer <em>Weights Initializer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Weights Initializer</em>'.
	 * @see org.eclipse.athene.nn.model.keras.Dense#getWeightsInitializer()
	 * @see #getDense()
	 * @generated
	 */
	EReference getDense_WeightsInitializer();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.athene.nn.model.keras.Dense#getBiasInitializer <em>Bias Initializer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bias Initializer</em>'.
	 * @see org.eclipse.athene.nn.model.keras.Dense#getBiasInitializer()
	 * @see #getDense()
	 * @generated
	 */
	EReference getDense_BiasInitializer();

	/**
	 * Returns the meta object for class '{@link org.eclipse.athene.nn.model.keras.Dropout <em>Dropout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dropout</em>'.
	 * @see org.eclipse.athene.nn.model.keras.Dropout
	 * @generated
	 */
	EClass getDropout();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.athene.nn.model.keras.Dropout#getRate <em>Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rate</em>'.
	 * @see org.eclipse.athene.nn.model.keras.Dropout#getRate()
	 * @see #getDropout()
	 * @generated
	 */
	EAttribute getDropout_Rate();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.athene.nn.model.keras.Dropout#getNoiseShape <em>Noise Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Noise Shape</em>'.
	 * @see org.eclipse.athene.nn.model.keras.Dropout#getNoiseShape()
	 * @see #getDropout()
	 * @generated
	 */
	EReference getDropout_NoiseShape();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.athene.nn.model.keras.Dropout#getSeed <em>Seed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Seed</em>'.
	 * @see org.eclipse.athene.nn.model.keras.Dropout#getSeed()
	 * @see #getDropout()
	 * @generated
	 */
	EAttribute getDropout_Seed();

	/**
	 * Returns the meta object for class '{@link org.eclipse.athene.nn.model.keras.Activation <em>Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activation</em>'.
	 * @see org.eclipse.athene.nn.model.keras.Activation
	 * @generated
	 */
	EClass getActivation();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.athene.nn.model.keras.Activation#getActivationFunction <em>Activation Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Activation Function</em>'.
	 * @see org.eclipse.athene.nn.model.keras.Activation#getActivationFunction()
	 * @see #getActivation()
	 * @generated
	 */
	EReference getActivation_ActivationFunction();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.athene.nn.model.keras.Activation#getInputShape <em>Input Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Input Shape</em>'.
	 * @see org.eclipse.athene.nn.model.keras.Activation#getInputShape()
	 * @see #getActivation()
	 * @generated
	 */
	EReference getActivation_InputShape();

	/**
	 * Returns the meta object for class '{@link org.eclipse.athene.nn.model.keras.Reshape <em>Reshape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reshape</em>'.
	 * @see org.eclipse.athene.nn.model.keras.Reshape
	 * @generated
	 */
	EClass getReshape();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.athene.nn.model.keras.Reshape#getTargetShape <em>Target Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target Shape</em>'.
	 * @see org.eclipse.athene.nn.model.keras.Reshape#getTargetShape()
	 * @see #getReshape()
	 * @generated
	 */
	EReference getReshape_TargetShape();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.athene.nn.model.keras.Reshape#getInputShape <em>Input Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Input Shape</em>'.
	 * @see org.eclipse.athene.nn.model.keras.Reshape#getInputShape()
	 * @see #getReshape()
	 * @generated
	 */
	EReference getReshape_InputShape();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.athene.nn.model.keras.Reshape#getOutputShape <em>Output Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Output Shape</em>'.
	 * @see org.eclipse.athene.nn.model.keras.Reshape#getOutputShape()
	 * @see #getReshape()
	 * @generated
	 */
	EReference getReshape_OutputShape();

	/**
	 * Returns the meta object for class '{@link org.eclipse.athene.nn.model.keras.Flatten <em>Flatten</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flatten</em>'.
	 * @see org.eclipse.athene.nn.model.keras.Flatten
	 * @generated
	 */
	EClass getFlatten();

	/**
	 * Returns the meta object for class '{@link org.eclipse.athene.nn.model.keras.Permute <em>Permute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Permute</em>'.
	 * @see org.eclipse.athene.nn.model.keras.Permute
	 * @generated
	 */
	EClass getPermute();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.athene.nn.model.keras.Permute#getDims <em>Dims</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dims</em>'.
	 * @see org.eclipse.athene.nn.model.keras.Permute#getDims()
	 * @see #getPermute()
	 * @generated
	 */
	EReference getPermute_Dims();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.athene.nn.model.keras.Permute#getInputShape <em>Input Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Input Shape</em>'.
	 * @see org.eclipse.athene.nn.model.keras.Permute#getInputShape()
	 * @see #getPermute()
	 * @generated
	 */
	EReference getPermute_InputShape();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.athene.nn.model.keras.Permute#getOutputShape <em>Output Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Output Shape</em>'.
	 * @see org.eclipse.athene.nn.model.keras.Permute#getOutputShape()
	 * @see #getPermute()
	 * @generated
	 */
	EReference getPermute_OutputShape();

	/**
	 * Returns the meta object for class '{@link org.eclipse.athene.nn.model.keras.RepeatVector <em>Repeat Vector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Repeat Vector</em>'.
	 * @see org.eclipse.athene.nn.model.keras.RepeatVector
	 * @generated
	 */
	EClass getRepeatVector();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.athene.nn.model.keras.RepeatVector#getNumberOfRepeats <em>Number Of Repeats</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Repeats</em>'.
	 * @see org.eclipse.athene.nn.model.keras.RepeatVector#getNumberOfRepeats()
	 * @see #getRepeatVector()
	 * @generated
	 */
	EAttribute getRepeatVector_NumberOfRepeats();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.athene.nn.model.keras.RepeatVector#getInputShape <em>Input Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Input Shape</em>'.
	 * @see org.eclipse.athene.nn.model.keras.RepeatVector#getInputShape()
	 * @see #getRepeatVector()
	 * @generated
	 */
	EReference getRepeatVector_InputShape();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.athene.nn.model.keras.RepeatVector#getOutputShape <em>Output Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Output Shape</em>'.
	 * @see org.eclipse.athene.nn.model.keras.RepeatVector#getOutputShape()
	 * @see #getRepeatVector()
	 * @generated
	 */
	EReference getRepeatVector_OutputShape();

	/**
	 * Returns the meta object for class '{@link org.eclipse.athene.nn.model.keras.ActivityRegularization <em>Activity Regularization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Regularization</em>'.
	 * @see org.eclipse.athene.nn.model.keras.ActivityRegularization
	 * @generated
	 */
	EClass getActivityRegularization();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.athene.nn.model.keras.ActivityRegularization#getL1 <em>L1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>L1</em>'.
	 * @see org.eclipse.athene.nn.model.keras.ActivityRegularization#getL1()
	 * @see #getActivityRegularization()
	 * @generated
	 */
	EAttribute getActivityRegularization_L1();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.athene.nn.model.keras.ActivityRegularization#getL2 <em>L2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>L2</em>'.
	 * @see org.eclipse.athene.nn.model.keras.ActivityRegularization#getL2()
	 * @see #getActivityRegularization()
	 * @generated
	 */
	EAttribute getActivityRegularization_L2();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.athene.nn.model.keras.ActivityRegularization#getInputShape <em>Input Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Input Shape</em>'.
	 * @see org.eclipse.athene.nn.model.keras.ActivityRegularization#getInputShape()
	 * @see #getActivityRegularization()
	 * @generated
	 */
	EReference getActivityRegularization_InputShape();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	KerasFactory getKerasFactory();

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
		 * The meta object literal for the '{@link org.eclipse.athene.nn.model.keras.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.athene.nn.model.keras.impl.ModelImpl
		 * @see org.eclipse.athene.nn.model.keras.impl.KerasPackageImpl#getModel()
		 * @generated
		 */
		EClass MODEL = eINSTANCE.getModel();

		/**
		 * The meta object literal for the '{@link org.eclipse.athene.nn.model.keras.impl.DenseImpl <em>Dense</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.athene.nn.model.keras.impl.DenseImpl
		 * @see org.eclipse.athene.nn.model.keras.impl.KerasPackageImpl#getDense()
		 * @generated
		 */
		EClass DENSE = eINSTANCE.getDense();

		/**
		 * The meta object literal for the '<em><b>Number Of Output Units</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DENSE__NUMBER_OF_OUTPUT_UNITS = eINSTANCE.getDense_NumberOfOutputUnits();

		/**
		 * The meta object literal for the '<em><b>Input Shape</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DENSE__INPUT_SHAPE = eINSTANCE.getDense_InputShape();

		/**
		 * The meta object literal for the '<em><b>Use Bias</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DENSE__USE_BIAS = eINSTANCE.getDense_UseBias();

		/**
		 * The meta object literal for the '<em><b>Activation Function</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DENSE__ACTIVATION_FUNCTION = eINSTANCE.getDense_ActivationFunction();

		/**
		 * The meta object literal for the '<em><b>Weights Initializer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DENSE__WEIGHTS_INITIALIZER = eINSTANCE.getDense_WeightsInitializer();

		/**
		 * The meta object literal for the '<em><b>Bias Initializer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DENSE__BIAS_INITIALIZER = eINSTANCE.getDense_BiasInitializer();

		/**
		 * The meta object literal for the '{@link org.eclipse.athene.nn.model.keras.impl.DropoutImpl <em>Dropout</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.athene.nn.model.keras.impl.DropoutImpl
		 * @see org.eclipse.athene.nn.model.keras.impl.KerasPackageImpl#getDropout()
		 * @generated
		 */
		EClass DROPOUT = eINSTANCE.getDropout();

		/**
		 * The meta object literal for the '<em><b>Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DROPOUT__RATE = eINSTANCE.getDropout_Rate();

		/**
		 * The meta object literal for the '<em><b>Noise Shape</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DROPOUT__NOISE_SHAPE = eINSTANCE.getDropout_NoiseShape();

		/**
		 * The meta object literal for the '<em><b>Seed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DROPOUT__SEED = eINSTANCE.getDropout_Seed();

		/**
		 * The meta object literal for the '{@link org.eclipse.athene.nn.model.keras.impl.ActivationImpl <em>Activation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.athene.nn.model.keras.impl.ActivationImpl
		 * @see org.eclipse.athene.nn.model.keras.impl.KerasPackageImpl#getActivation()
		 * @generated
		 */
		EClass ACTIVATION = eINSTANCE.getActivation();

		/**
		 * The meta object literal for the '<em><b>Activation Function</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVATION__ACTIVATION_FUNCTION = eINSTANCE.getActivation_ActivationFunction();

		/**
		 * The meta object literal for the '<em><b>Input Shape</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVATION__INPUT_SHAPE = eINSTANCE.getActivation_InputShape();

		/**
		 * The meta object literal for the '{@link org.eclipse.athene.nn.model.keras.impl.ReshapeImpl <em>Reshape</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.athene.nn.model.keras.impl.ReshapeImpl
		 * @see org.eclipse.athene.nn.model.keras.impl.KerasPackageImpl#getReshape()
		 * @generated
		 */
		EClass RESHAPE = eINSTANCE.getReshape();

		/**
		 * The meta object literal for the '<em><b>Target Shape</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESHAPE__TARGET_SHAPE = eINSTANCE.getReshape_TargetShape();

		/**
		 * The meta object literal for the '<em><b>Input Shape</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESHAPE__INPUT_SHAPE = eINSTANCE.getReshape_InputShape();

		/**
		 * The meta object literal for the '<em><b>Output Shape</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESHAPE__OUTPUT_SHAPE = eINSTANCE.getReshape_OutputShape();

		/**
		 * The meta object literal for the '{@link org.eclipse.athene.nn.model.keras.impl.FlattenImpl <em>Flatten</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.athene.nn.model.keras.impl.FlattenImpl
		 * @see org.eclipse.athene.nn.model.keras.impl.KerasPackageImpl#getFlatten()
		 * @generated
		 */
		EClass FLATTEN = eINSTANCE.getFlatten();

		/**
		 * The meta object literal for the '{@link org.eclipse.athene.nn.model.keras.impl.PermuteImpl <em>Permute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.athene.nn.model.keras.impl.PermuteImpl
		 * @see org.eclipse.athene.nn.model.keras.impl.KerasPackageImpl#getPermute()
		 * @generated
		 */
		EClass PERMUTE = eINSTANCE.getPermute();

		/**
		 * The meta object literal for the '<em><b>Dims</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERMUTE__DIMS = eINSTANCE.getPermute_Dims();

		/**
		 * The meta object literal for the '<em><b>Input Shape</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERMUTE__INPUT_SHAPE = eINSTANCE.getPermute_InputShape();

		/**
		 * The meta object literal for the '<em><b>Output Shape</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERMUTE__OUTPUT_SHAPE = eINSTANCE.getPermute_OutputShape();

		/**
		 * The meta object literal for the '{@link org.eclipse.athene.nn.model.keras.impl.RepeatVectorImpl <em>Repeat Vector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.athene.nn.model.keras.impl.RepeatVectorImpl
		 * @see org.eclipse.athene.nn.model.keras.impl.KerasPackageImpl#getRepeatVector()
		 * @generated
		 */
		EClass REPEAT_VECTOR = eINSTANCE.getRepeatVector();

		/**
		 * The meta object literal for the '<em><b>Number Of Repeats</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPEAT_VECTOR__NUMBER_OF_REPEATS = eINSTANCE.getRepeatVector_NumberOfRepeats();

		/**
		 * The meta object literal for the '<em><b>Input Shape</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPEAT_VECTOR__INPUT_SHAPE = eINSTANCE.getRepeatVector_InputShape();

		/**
		 * The meta object literal for the '<em><b>Output Shape</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPEAT_VECTOR__OUTPUT_SHAPE = eINSTANCE.getRepeatVector_OutputShape();

		/**
		 * The meta object literal for the '{@link org.eclipse.athene.nn.model.keras.impl.ActivityRegularizationImpl <em>Activity Regularization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.athene.nn.model.keras.impl.ActivityRegularizationImpl
		 * @see org.eclipse.athene.nn.model.keras.impl.KerasPackageImpl#getActivityRegularization()
		 * @generated
		 */
		EClass ACTIVITY_REGULARIZATION = eINSTANCE.getActivityRegularization();

		/**
		 * The meta object literal for the '<em><b>L1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY_REGULARIZATION__L1 = eINSTANCE.getActivityRegularization_L1();

		/**
		 * The meta object literal for the '<em><b>L2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY_REGULARIZATION__L2 = eINSTANCE.getActivityRegularization_L2();

		/**
		 * The meta object literal for the '<em><b>Input Shape</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_REGULARIZATION__INPUT_SHAPE = eINSTANCE.getActivityRegularization_InputShape();

	}

} //KerasPackage
