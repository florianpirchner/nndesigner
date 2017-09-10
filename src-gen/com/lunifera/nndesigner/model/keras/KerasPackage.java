/**
 */
package com.lunifera.nndesigner.model.keras;

import com.lunifera.nndesigner.model.ModelPackage;

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
 * @see com.lunifera.nndesigner.model.keras.KerasFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel basePackage='com.lunifera.nndesigner.model'"
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
	String eNS_URI = "com.lunifera.nndesigner.model.keras";

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
	KerasPackage eINSTANCE = com.lunifera.nndesigner.model.keras.impl.KerasPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.lunifera.nndesigner.model.keras.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.lunifera.nndesigner.model.keras.impl.ModelImpl
	 * @see com.lunifera.nndesigner.model.keras.impl.KerasPackageImpl#getModel()
	 * @generated
	 */
	int MODEL = 0;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__ELEMENTS = ModelPackage.MODEL__ELEMENTS;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = ModelPackage.MODEL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_OPERATION_COUNT = ModelPackage.MODEL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.lunifera.nndesigner.model.keras.impl.DenseLayerImpl <em>Dense Layer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.lunifera.nndesigner.model.keras.impl.DenseLayerImpl
	 * @see com.lunifera.nndesigner.model.keras.impl.KerasPackageImpl#getDenseLayer()
	 * @generated
	 */
	int DENSE_LAYER = 1;

	/**
	 * The feature id for the '<em><b>Target Layers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENSE_LAYER__TARGET_LAYERS = ModelPackage.LAYER__TARGET_LAYERS;

	/**
	 * The feature id for the '<em><b>Input Sources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENSE_LAYER__INPUT_SOURCES = ModelPackage.LAYER__INPUT_SOURCES;

	/**
	 * The feature id for the '<em><b>Number Of Output Units</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENSE_LAYER__NUMBER_OF_OUTPUT_UNITS = ModelPackage.LAYER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input Shape</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENSE_LAYER__INPUT_SHAPE = ModelPackage.LAYER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Use Bias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENSE_LAYER__USE_BIAS = ModelPackage.LAYER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Activation Function</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENSE_LAYER__ACTIVATION_FUNCTION = ModelPackage.LAYER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Weights Initializer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENSE_LAYER__WEIGHTS_INITIALIZER = ModelPackage.LAYER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Bias Initializer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENSE_LAYER__BIAS_INITIALIZER = ModelPackage.LAYER_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Dense Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENSE_LAYER_FEATURE_COUNT = ModelPackage.LAYER_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Dense Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENSE_LAYER_OPERATION_COUNT = ModelPackage.LAYER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.lunifera.nndesigner.model.keras.impl.DropoutImpl <em>Dropout</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.lunifera.nndesigner.model.keras.impl.DropoutImpl
	 * @see com.lunifera.nndesigner.model.keras.impl.KerasPackageImpl#getDropout()
	 * @generated
	 */
	int DROPOUT = 2;

	/**
	 * The feature id for the '<em><b>Target Layers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPOUT__TARGET_LAYERS = ModelPackage.LAYER__TARGET_LAYERS;

	/**
	 * The feature id for the '<em><b>Input Sources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPOUT__INPUT_SOURCES = ModelPackage.LAYER__INPUT_SOURCES;

	/**
	 * The feature id for the '<em><b>Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPOUT__RATE = ModelPackage.LAYER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Noise Shape</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPOUT__NOISE_SHAPE = ModelPackage.LAYER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Seed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPOUT__SEED = ModelPackage.LAYER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Dropout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPOUT_FEATURE_COUNT = ModelPackage.LAYER_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Dropout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPOUT_OPERATION_COUNT = ModelPackage.LAYER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.lunifera.nndesigner.model.keras.impl.ReshapeImpl <em>Reshape</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.lunifera.nndesigner.model.keras.impl.ReshapeImpl
	 * @see com.lunifera.nndesigner.model.keras.impl.KerasPackageImpl#getReshape()
	 * @generated
	 */
	int RESHAPE = 3;

	/**
	 * The feature id for the '<em><b>Target Layers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESHAPE__TARGET_LAYERS = ModelPackage.LAYER__TARGET_LAYERS;

	/**
	 * The feature id for the '<em><b>Input Sources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESHAPE__INPUT_SOURCES = ModelPackage.LAYER__INPUT_SOURCES;

	/**
	 * The feature id for the '<em><b>Input Shape</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESHAPE__INPUT_SHAPE = ModelPackage.LAYER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Output Shape</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESHAPE__OUTPUT_SHAPE = ModelPackage.LAYER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Reshape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESHAPE_FEATURE_COUNT = ModelPackage.LAYER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Reshape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESHAPE_OPERATION_COUNT = ModelPackage.LAYER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.lunifera.nndesigner.model.keras.impl.FlattenImpl <em>Flatten</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.lunifera.nndesigner.model.keras.impl.FlattenImpl
	 * @see com.lunifera.nndesigner.model.keras.impl.KerasPackageImpl#getFlatten()
	 * @generated
	 */
	int FLATTEN = 4;

	/**
	 * The feature id for the '<em><b>Target Layers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLATTEN__TARGET_LAYERS = ModelPackage.LAYER__TARGET_LAYERS;

	/**
	 * The feature id for the '<em><b>Input Sources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLATTEN__INPUT_SOURCES = ModelPackage.LAYER__INPUT_SOURCES;

	/**
	 * The number of structural features of the '<em>Flatten</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLATTEN_FEATURE_COUNT = ModelPackage.LAYER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Flatten</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLATTEN_OPERATION_COUNT = ModelPackage.LAYER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.lunifera.nndesigner.model.keras.impl.PermuteImpl <em>Permute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.lunifera.nndesigner.model.keras.impl.PermuteImpl
	 * @see com.lunifera.nndesigner.model.keras.impl.KerasPackageImpl#getPermute()
	 * @generated
	 */
	int PERMUTE = 5;

	/**
	 * The feature id for the '<em><b>Target Layers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMUTE__TARGET_LAYERS = ModelPackage.LAYER__TARGET_LAYERS;

	/**
	 * The feature id for the '<em><b>Input Sources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMUTE__INPUT_SOURCES = ModelPackage.LAYER__INPUT_SOURCES;

	/**
	 * The feature id for the '<em><b>Dims</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMUTE__DIMS = ModelPackage.LAYER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input Shape</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMUTE__INPUT_SHAPE = ModelPackage.LAYER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Permute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMUTE_FEATURE_COUNT = ModelPackage.LAYER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Permute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMUTE_OPERATION_COUNT = ModelPackage.LAYER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.lunifera.nndesigner.model.keras.impl.RepeatVectorImpl <em>Repeat Vector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.lunifera.nndesigner.model.keras.impl.RepeatVectorImpl
	 * @see com.lunifera.nndesigner.model.keras.impl.KerasPackageImpl#getRepeatVector()
	 * @generated
	 */
	int REPEAT_VECTOR = 6;

	/**
	 * The feature id for the '<em><b>Target Layers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_VECTOR__TARGET_LAYERS = ModelPackage.LAYER__TARGET_LAYERS;

	/**
	 * The feature id for the '<em><b>Input Sources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_VECTOR__INPUT_SOURCES = ModelPackage.LAYER__INPUT_SOURCES;

	/**
	 * The feature id for the '<em><b>Number Of Repeats</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_VECTOR__NUMBER_OF_REPEATS = ModelPackage.LAYER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input Shape</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_VECTOR__INPUT_SHAPE = ModelPackage.LAYER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Output Shape</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_VECTOR__OUTPUT_SHAPE = ModelPackage.LAYER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Repeat Vector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_VECTOR_FEATURE_COUNT = ModelPackage.LAYER_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Repeat Vector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_VECTOR_OPERATION_COUNT = ModelPackage.LAYER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.lunifera.nndesigner.model.keras.impl.ActivityRegularizationImpl <em>Activity Regularization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.lunifera.nndesigner.model.keras.impl.ActivityRegularizationImpl
	 * @see com.lunifera.nndesigner.model.keras.impl.KerasPackageImpl#getActivityRegularization()
	 * @generated
	 */
	int ACTIVITY_REGULARIZATION = 7;

	/**
	 * The feature id for the '<em><b>Target Layers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_REGULARIZATION__TARGET_LAYERS = ModelPackage.LAYER__TARGET_LAYERS;

	/**
	 * The feature id for the '<em><b>Input Sources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_REGULARIZATION__INPUT_SOURCES = ModelPackage.LAYER__INPUT_SOURCES;

	/**
	 * The feature id for the '<em><b>L1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_REGULARIZATION__L1 = ModelPackage.LAYER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>L2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_REGULARIZATION__L2 = ModelPackage.LAYER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Input Shape</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_REGULARIZATION__INPUT_SHAPE = ModelPackage.LAYER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Activity Regularization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_REGULARIZATION_FEATURE_COUNT = ModelPackage.LAYER_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Activity Regularization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_REGULARIZATION_OPERATION_COUNT = ModelPackage.LAYER_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link com.lunifera.nndesigner.model.keras.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see com.lunifera.nndesigner.model.keras.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for class '{@link com.lunifera.nndesigner.model.keras.DenseLayer <em>Dense Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dense Layer</em>'.
	 * @see com.lunifera.nndesigner.model.keras.DenseLayer
	 * @generated
	 */
	EClass getDenseLayer();

	/**
	 * Returns the meta object for the attribute '{@link com.lunifera.nndesigner.model.keras.DenseLayer#getNumberOfOutputUnits <em>Number Of Output Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Output Units</em>'.
	 * @see com.lunifera.nndesigner.model.keras.DenseLayer#getNumberOfOutputUnits()
	 * @see #getDenseLayer()
	 * @generated
	 */
	EAttribute getDenseLayer_NumberOfOutputUnits();

	/**
	 * Returns the meta object for the containment reference '{@link com.lunifera.nndesigner.model.keras.DenseLayer#getInputShape <em>Input Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Input Shape</em>'.
	 * @see com.lunifera.nndesigner.model.keras.DenseLayer#getInputShape()
	 * @see #getDenseLayer()
	 * @generated
	 */
	EReference getDenseLayer_InputShape();

	/**
	 * Returns the meta object for the attribute '{@link com.lunifera.nndesigner.model.keras.DenseLayer#isUseBias <em>Use Bias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use Bias</em>'.
	 * @see com.lunifera.nndesigner.model.keras.DenseLayer#isUseBias()
	 * @see #getDenseLayer()
	 * @generated
	 */
	EAttribute getDenseLayer_UseBias();

	/**
	 * Returns the meta object for the reference '{@link com.lunifera.nndesigner.model.keras.DenseLayer#getActivationFunction <em>Activation Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Activation Function</em>'.
	 * @see com.lunifera.nndesigner.model.keras.DenseLayer#getActivationFunction()
	 * @see #getDenseLayer()
	 * @generated
	 */
	EReference getDenseLayer_ActivationFunction();

	/**
	 * Returns the meta object for the reference '{@link com.lunifera.nndesigner.model.keras.DenseLayer#getWeightsInitializer <em>Weights Initializer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Weights Initializer</em>'.
	 * @see com.lunifera.nndesigner.model.keras.DenseLayer#getWeightsInitializer()
	 * @see #getDenseLayer()
	 * @generated
	 */
	EReference getDenseLayer_WeightsInitializer();

	/**
	 * Returns the meta object for the reference '{@link com.lunifera.nndesigner.model.keras.DenseLayer#getBiasInitializer <em>Bias Initializer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bias Initializer</em>'.
	 * @see com.lunifera.nndesigner.model.keras.DenseLayer#getBiasInitializer()
	 * @see #getDenseLayer()
	 * @generated
	 */
	EReference getDenseLayer_BiasInitializer();

	/**
	 * Returns the meta object for class '{@link com.lunifera.nndesigner.model.keras.Dropout <em>Dropout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dropout</em>'.
	 * @see com.lunifera.nndesigner.model.keras.Dropout
	 * @generated
	 */
	EClass getDropout();

	/**
	 * Returns the meta object for the attribute '{@link com.lunifera.nndesigner.model.keras.Dropout#getRate <em>Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rate</em>'.
	 * @see com.lunifera.nndesigner.model.keras.Dropout#getRate()
	 * @see #getDropout()
	 * @generated
	 */
	EAttribute getDropout_Rate();

	/**
	 * Returns the meta object for the containment reference '{@link com.lunifera.nndesigner.model.keras.Dropout#getNoiseShape <em>Noise Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Noise Shape</em>'.
	 * @see com.lunifera.nndesigner.model.keras.Dropout#getNoiseShape()
	 * @see #getDropout()
	 * @generated
	 */
	EReference getDropout_NoiseShape();

	/**
	 * Returns the meta object for the attribute '{@link com.lunifera.nndesigner.model.keras.Dropout#getSeed <em>Seed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Seed</em>'.
	 * @see com.lunifera.nndesigner.model.keras.Dropout#getSeed()
	 * @see #getDropout()
	 * @generated
	 */
	EAttribute getDropout_Seed();

	/**
	 * Returns the meta object for class '{@link com.lunifera.nndesigner.model.keras.Reshape <em>Reshape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reshape</em>'.
	 * @see com.lunifera.nndesigner.model.keras.Reshape
	 * @generated
	 */
	EClass getReshape();

	/**
	 * Returns the meta object for the containment reference '{@link com.lunifera.nndesigner.model.keras.Reshape#getInputShape <em>Input Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Input Shape</em>'.
	 * @see com.lunifera.nndesigner.model.keras.Reshape#getInputShape()
	 * @see #getReshape()
	 * @generated
	 */
	EReference getReshape_InputShape();

	/**
	 * Returns the meta object for the containment reference '{@link com.lunifera.nndesigner.model.keras.Reshape#getOutputShape <em>Output Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Output Shape</em>'.
	 * @see com.lunifera.nndesigner.model.keras.Reshape#getOutputShape()
	 * @see #getReshape()
	 * @generated
	 */
	EReference getReshape_OutputShape();

	/**
	 * Returns the meta object for class '{@link com.lunifera.nndesigner.model.keras.Flatten <em>Flatten</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flatten</em>'.
	 * @see com.lunifera.nndesigner.model.keras.Flatten
	 * @generated
	 */
	EClass getFlatten();

	/**
	 * Returns the meta object for class '{@link com.lunifera.nndesigner.model.keras.Permute <em>Permute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Permute</em>'.
	 * @see com.lunifera.nndesigner.model.keras.Permute
	 * @generated
	 */
	EClass getPermute();

	/**
	 * Returns the meta object for the containment reference '{@link com.lunifera.nndesigner.model.keras.Permute#getDims <em>Dims</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dims</em>'.
	 * @see com.lunifera.nndesigner.model.keras.Permute#getDims()
	 * @see #getPermute()
	 * @generated
	 */
	EReference getPermute_Dims();

	/**
	 * Returns the meta object for the containment reference '{@link com.lunifera.nndesigner.model.keras.Permute#getInputShape <em>Input Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Input Shape</em>'.
	 * @see com.lunifera.nndesigner.model.keras.Permute#getInputShape()
	 * @see #getPermute()
	 * @generated
	 */
	EReference getPermute_InputShape();

	/**
	 * Returns the meta object for class '{@link com.lunifera.nndesigner.model.keras.RepeatVector <em>Repeat Vector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Repeat Vector</em>'.
	 * @see com.lunifera.nndesigner.model.keras.RepeatVector
	 * @generated
	 */
	EClass getRepeatVector();

	/**
	 * Returns the meta object for the attribute '{@link com.lunifera.nndesigner.model.keras.RepeatVector#getNumberOfRepeats <em>Number Of Repeats</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Repeats</em>'.
	 * @see com.lunifera.nndesigner.model.keras.RepeatVector#getNumberOfRepeats()
	 * @see #getRepeatVector()
	 * @generated
	 */
	EAttribute getRepeatVector_NumberOfRepeats();

	/**
	 * Returns the meta object for the containment reference '{@link com.lunifera.nndesigner.model.keras.RepeatVector#getInputShape <em>Input Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Input Shape</em>'.
	 * @see com.lunifera.nndesigner.model.keras.RepeatVector#getInputShape()
	 * @see #getRepeatVector()
	 * @generated
	 */
	EReference getRepeatVector_InputShape();

	/**
	 * Returns the meta object for the containment reference '{@link com.lunifera.nndesigner.model.keras.RepeatVector#getOutputShape <em>Output Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Output Shape</em>'.
	 * @see com.lunifera.nndesigner.model.keras.RepeatVector#getOutputShape()
	 * @see #getRepeatVector()
	 * @generated
	 */
	EReference getRepeatVector_OutputShape();

	/**
	 * Returns the meta object for class '{@link com.lunifera.nndesigner.model.keras.ActivityRegularization <em>Activity Regularization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Regularization</em>'.
	 * @see com.lunifera.nndesigner.model.keras.ActivityRegularization
	 * @generated
	 */
	EClass getActivityRegularization();

	/**
	 * Returns the meta object for the attribute '{@link com.lunifera.nndesigner.model.keras.ActivityRegularization#getL1 <em>L1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>L1</em>'.
	 * @see com.lunifera.nndesigner.model.keras.ActivityRegularization#getL1()
	 * @see #getActivityRegularization()
	 * @generated
	 */
	EAttribute getActivityRegularization_L1();

	/**
	 * Returns the meta object for the attribute '{@link com.lunifera.nndesigner.model.keras.ActivityRegularization#getL2 <em>L2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>L2</em>'.
	 * @see com.lunifera.nndesigner.model.keras.ActivityRegularization#getL2()
	 * @see #getActivityRegularization()
	 * @generated
	 */
	EAttribute getActivityRegularization_L2();

	/**
	 * Returns the meta object for the containment reference '{@link com.lunifera.nndesigner.model.keras.ActivityRegularization#getInputShape <em>Input Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Input Shape</em>'.
	 * @see com.lunifera.nndesigner.model.keras.ActivityRegularization#getInputShape()
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
		 * The meta object literal for the '{@link com.lunifera.nndesigner.model.keras.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.lunifera.nndesigner.model.keras.impl.ModelImpl
		 * @see com.lunifera.nndesigner.model.keras.impl.KerasPackageImpl#getModel()
		 * @generated
		 */
		EClass MODEL = eINSTANCE.getModel();

		/**
		 * The meta object literal for the '{@link com.lunifera.nndesigner.model.keras.impl.DenseLayerImpl <em>Dense Layer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.lunifera.nndesigner.model.keras.impl.DenseLayerImpl
		 * @see com.lunifera.nndesigner.model.keras.impl.KerasPackageImpl#getDenseLayer()
		 * @generated
		 */
		EClass DENSE_LAYER = eINSTANCE.getDenseLayer();

		/**
		 * The meta object literal for the '<em><b>Number Of Output Units</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DENSE_LAYER__NUMBER_OF_OUTPUT_UNITS = eINSTANCE.getDenseLayer_NumberOfOutputUnits();

		/**
		 * The meta object literal for the '<em><b>Input Shape</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DENSE_LAYER__INPUT_SHAPE = eINSTANCE.getDenseLayer_InputShape();

		/**
		 * The meta object literal for the '<em><b>Use Bias</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DENSE_LAYER__USE_BIAS = eINSTANCE.getDenseLayer_UseBias();

		/**
		 * The meta object literal for the '<em><b>Activation Function</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DENSE_LAYER__ACTIVATION_FUNCTION = eINSTANCE.getDenseLayer_ActivationFunction();

		/**
		 * The meta object literal for the '<em><b>Weights Initializer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DENSE_LAYER__WEIGHTS_INITIALIZER = eINSTANCE.getDenseLayer_WeightsInitializer();

		/**
		 * The meta object literal for the '<em><b>Bias Initializer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DENSE_LAYER__BIAS_INITIALIZER = eINSTANCE.getDenseLayer_BiasInitializer();

		/**
		 * The meta object literal for the '{@link com.lunifera.nndesigner.model.keras.impl.DropoutImpl <em>Dropout</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.lunifera.nndesigner.model.keras.impl.DropoutImpl
		 * @see com.lunifera.nndesigner.model.keras.impl.KerasPackageImpl#getDropout()
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
		 * The meta object literal for the '{@link com.lunifera.nndesigner.model.keras.impl.ReshapeImpl <em>Reshape</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.lunifera.nndesigner.model.keras.impl.ReshapeImpl
		 * @see com.lunifera.nndesigner.model.keras.impl.KerasPackageImpl#getReshape()
		 * @generated
		 */
		EClass RESHAPE = eINSTANCE.getReshape();

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
		 * The meta object literal for the '{@link com.lunifera.nndesigner.model.keras.impl.FlattenImpl <em>Flatten</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.lunifera.nndesigner.model.keras.impl.FlattenImpl
		 * @see com.lunifera.nndesigner.model.keras.impl.KerasPackageImpl#getFlatten()
		 * @generated
		 */
		EClass FLATTEN = eINSTANCE.getFlatten();

		/**
		 * The meta object literal for the '{@link com.lunifera.nndesigner.model.keras.impl.PermuteImpl <em>Permute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.lunifera.nndesigner.model.keras.impl.PermuteImpl
		 * @see com.lunifera.nndesigner.model.keras.impl.KerasPackageImpl#getPermute()
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
		 * The meta object literal for the '{@link com.lunifera.nndesigner.model.keras.impl.RepeatVectorImpl <em>Repeat Vector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.lunifera.nndesigner.model.keras.impl.RepeatVectorImpl
		 * @see com.lunifera.nndesigner.model.keras.impl.KerasPackageImpl#getRepeatVector()
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
		 * The meta object literal for the '{@link com.lunifera.nndesigner.model.keras.impl.ActivityRegularizationImpl <em>Activity Regularization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.lunifera.nndesigner.model.keras.impl.ActivityRegularizationImpl
		 * @see com.lunifera.nndesigner.model.keras.impl.KerasPackageImpl#getActivityRegularization()
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
