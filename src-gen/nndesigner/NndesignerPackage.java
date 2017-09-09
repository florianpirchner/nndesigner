/**
 */
package nndesigner;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see nndesigner.NndesignerFactory
 * @model kind="package"
 * @generated
 */
public interface NndesignerPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "nndesigner";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "nndesigner";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "nndesigner";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	NndesignerPackage eINSTANCE = nndesigner.impl.NndesignerPackageImpl.init();

	/**
	 * The meta object id for the '{@link nndesigner.impl.DesignImpl <em>Design</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nndesigner.impl.DesignImpl
	 * @see nndesigner.impl.NndesignerPackageImpl#getDesign()
	 * @generated
	 */
	int DESIGN = 0;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN__ELEMENTS = 0;

	/**
	 * The number of structural features of the '<em>Design</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Design</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link nndesigner.Element <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nndesigner.Element
	 * @see nndesigner.impl.NndesignerPackageImpl#getElement()
	 * @generated
	 */
	int ELEMENT = 1;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link nndesigner.InputSource <em>Input Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nndesigner.InputSource
	 * @see nndesigner.impl.NndesignerPackageImpl#getInputSource()
	 * @generated
	 */
	int INPUT_SOURCE = 2;

	/**
	 * The number of structural features of the '<em>Input Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_SOURCE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Input Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_SOURCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link nndesigner.impl.LayerImpl <em>Layer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nndesigner.impl.LayerImpl
	 * @see nndesigner.impl.NndesignerPackageImpl#getLayer()
	 * @generated
	 */
	int LAYER = 3;

	/**
	 * The feature id for the '<em><b>Input Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER__INPUT_SOURCE = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target Layers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER__TARGET_LAYERS = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link nndesigner.impl.FunctionImpl <em>Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nndesigner.impl.FunctionImpl
	 * @see nndesigner.impl.NndesignerPackageImpl#getFunction()
	 * @generated
	 */
	int FUNCTION = 4;

	/**
	 * The number of structural features of the '<em>Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link nndesigner.impl.KerasDenseLayerImpl <em>Keras Dense Layer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nndesigner.impl.KerasDenseLayerImpl
	 * @see nndesigner.impl.NndesignerPackageImpl#getKerasDenseLayer()
	 * @generated
	 */
	int KERAS_DENSE_LAYER = 5;

	/**
	 * The feature id for the '<em><b>Input Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KERAS_DENSE_LAYER__INPUT_SOURCE = LAYER__INPUT_SOURCE;

	/**
	 * The feature id for the '<em><b>Target Layers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KERAS_DENSE_LAYER__TARGET_LAYERS = LAYER__TARGET_LAYERS;

	/**
	 * The feature id for the '<em><b>Number Of Output Units</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KERAS_DENSE_LAYER__NUMBER_OF_OUTPUT_UNITS = LAYER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input Shape</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KERAS_DENSE_LAYER__INPUT_SHAPE = LAYER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Use Bias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KERAS_DENSE_LAYER__USE_BIAS = LAYER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Activation Function</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KERAS_DENSE_LAYER__ACTIVATION_FUNCTION = LAYER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Weights Initializer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KERAS_DENSE_LAYER__WEIGHTS_INITIALIZER = LAYER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Bias Initializer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KERAS_DENSE_LAYER__BIAS_INITIALIZER = LAYER_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Keras Dense Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KERAS_DENSE_LAYER_FEATURE_COUNT = LAYER_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Keras Dense Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KERAS_DENSE_LAYER_OPERATION_COUNT = LAYER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link nndesigner.impl.KerasDropoutImpl <em>Keras Dropout</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nndesigner.impl.KerasDropoutImpl
	 * @see nndesigner.impl.NndesignerPackageImpl#getKerasDropout()
	 * @generated
	 */
	int KERAS_DROPOUT = 6;

	/**
	 * The feature id for the '<em><b>Input Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KERAS_DROPOUT__INPUT_SOURCE = LAYER__INPUT_SOURCE;

	/**
	 * The feature id for the '<em><b>Target Layers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KERAS_DROPOUT__TARGET_LAYERS = LAYER__TARGET_LAYERS;

	/**
	 * The feature id for the '<em><b>Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KERAS_DROPOUT__RATE = LAYER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Noise Shape</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KERAS_DROPOUT__NOISE_SHAPE = LAYER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Seed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KERAS_DROPOUT__SEED = LAYER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Keras Dropout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KERAS_DROPOUT_FEATURE_COUNT = LAYER_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Keras Dropout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KERAS_DROPOUT_OPERATION_COUNT = LAYER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link nndesigner.impl.KerasReshapeImpl <em>Keras Reshape</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nndesigner.impl.KerasReshapeImpl
	 * @see nndesigner.impl.NndesignerPackageImpl#getKerasReshape()
	 * @generated
	 */
	int KERAS_RESHAPE = 7;

	/**
	 * The feature id for the '<em><b>Input Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KERAS_RESHAPE__INPUT_SOURCE = LAYER__INPUT_SOURCE;

	/**
	 * The feature id for the '<em><b>Target Layers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KERAS_RESHAPE__TARGET_LAYERS = LAYER__TARGET_LAYERS;

	/**
	 * The feature id for the '<em><b>Input Shape</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KERAS_RESHAPE__INPUT_SHAPE = LAYER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Output Shape</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KERAS_RESHAPE__OUTPUT_SHAPE = LAYER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Keras Reshape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KERAS_RESHAPE_FEATURE_COUNT = LAYER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Keras Reshape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KERAS_RESHAPE_OPERATION_COUNT = LAYER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link nndesigner.impl.ActivationFunctionImpl <em>Activation Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nndesigner.impl.ActivationFunctionImpl
	 * @see nndesigner.impl.NndesignerPackageImpl#getActivationFunction()
	 * @generated
	 */
	int ACTIVATION_FUNCTION = 8;

	/**
	 * The number of structural features of the '<em>Activation Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVATION_FUNCTION_FEATURE_COUNT = FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Activation Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVATION_FUNCTION_OPERATION_COUNT = FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link nndesigner.impl.LossFunctionImpl <em>Loss Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nndesigner.impl.LossFunctionImpl
	 * @see nndesigner.impl.NndesignerPackageImpl#getLossFunction()
	 * @generated
	 */
	int LOSS_FUNCTION = 9;

	/**
	 * The number of structural features of the '<em>Loss Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOSS_FUNCTION_FEATURE_COUNT = FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Loss Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOSS_FUNCTION_OPERATION_COUNT = FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link nndesigner.impl.InitializerFunctionImpl <em>Initializer Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nndesigner.impl.InitializerFunctionImpl
	 * @see nndesigner.impl.NndesignerPackageImpl#getInitializerFunction()
	 * @generated
	 */
	int INITIALIZER_FUNCTION = 10;

	/**
	 * The number of structural features of the '<em>Initializer Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIALIZER_FUNCTION_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Initializer Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIALIZER_FUNCTION_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link nndesigner.impl.MathFunctionImpl <em>Math Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nndesigner.impl.MathFunctionImpl
	 * @see nndesigner.impl.NndesignerPackageImpl#getMathFunction()
	 * @generated
	 */
	int MATH_FUNCTION = 11;

	/**
	 * The number of structural features of the '<em>Math Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATH_FUNCTION_FEATURE_COUNT = FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Math Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATH_FUNCTION_OPERATION_COUNT = FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link nndesigner.impl.MatmulFunctionImpl <em>Matmul Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nndesigner.impl.MatmulFunctionImpl
	 * @see nndesigner.impl.NndesignerPackageImpl#getMatmulFunction()
	 * @generated
	 */
	int MATMUL_FUNCTION = 12;

	/**
	 * The number of structural features of the '<em>Matmul Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATMUL_FUNCTION_FEATURE_COUNT = MATH_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Matmul Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATMUL_FUNCTION_OPERATION_COUNT = MATH_FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link nndesigner.impl.DotFunctionImpl <em>Dot Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nndesigner.impl.DotFunctionImpl
	 * @see nndesigner.impl.NndesignerPackageImpl#getDotFunction()
	 * @generated
	 */
	int DOT_FUNCTION = 13;

	/**
	 * The number of structural features of the '<em>Dot Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOT_FUNCTION_FEATURE_COUNT = MATH_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Dot Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOT_FUNCTION_OPERATION_COUNT = MATH_FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link nndesigner.Padding <em>Padding</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nndesigner.Padding
	 * @see nndesigner.impl.NndesignerPackageImpl#getPadding()
	 * @generated
	 */
	int PADDING = 14;


	/**
	 * Returns the meta object for class '{@link nndesigner.Design <em>Design</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Design</em>'.
	 * @see nndesigner.Design
	 * @generated
	 */
	EClass getDesign();

	/**
	 * Returns the meta object for the containment reference list '{@link nndesigner.Design#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see nndesigner.Design#getElements()
	 * @see #getDesign()
	 * @generated
	 */
	EReference getDesign_Elements();

	/**
	 * Returns the meta object for class '{@link nndesigner.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see nndesigner.Element
	 * @generated
	 */
	EClass getElement();

	/**
	 * Returns the meta object for class '{@link nndesigner.InputSource <em>Input Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Source</em>'.
	 * @see nndesigner.InputSource
	 * @generated
	 */
	EClass getInputSource();

	/**
	 * Returns the meta object for class '{@link nndesigner.Layer <em>Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Layer</em>'.
	 * @see nndesigner.Layer
	 * @generated
	 */
	EClass getLayer();

	/**
	 * Returns the meta object for the reference '{@link nndesigner.Layer#getInputSource <em>Input Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input Source</em>'.
	 * @see nndesigner.Layer#getInputSource()
	 * @see #getLayer()
	 * @generated
	 */
	EReference getLayer_InputSource();

	/**
	 * Returns the meta object for the reference list '{@link nndesigner.Layer#getTargetLayers <em>Target Layers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Target Layers</em>'.
	 * @see nndesigner.Layer#getTargetLayers()
	 * @see #getLayer()
	 * @generated
	 */
	EReference getLayer_TargetLayers();

	/**
	 * Returns the meta object for class '{@link nndesigner.Function <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function</em>'.
	 * @see nndesigner.Function
	 * @generated
	 */
	EClass getFunction();

	/**
	 * Returns the meta object for class '{@link nndesigner.KerasDenseLayer <em>Keras Dense Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Keras Dense Layer</em>'.
	 * @see nndesigner.KerasDenseLayer
	 * @generated
	 */
	EClass getKerasDenseLayer();

	/**
	 * Returns the meta object for the attribute '{@link nndesigner.KerasDenseLayer#getNumberOfOutputUnits <em>Number Of Output Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Output Units</em>'.
	 * @see nndesigner.KerasDenseLayer#getNumberOfOutputUnits()
	 * @see #getKerasDenseLayer()
	 * @generated
	 */
	EAttribute getKerasDenseLayer_NumberOfOutputUnits();

	/**
	 * Returns the meta object for the attribute list '{@link nndesigner.KerasDenseLayer#getInputShape <em>Input Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Input Shape</em>'.
	 * @see nndesigner.KerasDenseLayer#getInputShape()
	 * @see #getKerasDenseLayer()
	 * @generated
	 */
	EAttribute getKerasDenseLayer_InputShape();

	/**
	 * Returns the meta object for the attribute '{@link nndesigner.KerasDenseLayer#isUseBias <em>Use Bias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use Bias</em>'.
	 * @see nndesigner.KerasDenseLayer#isUseBias()
	 * @see #getKerasDenseLayer()
	 * @generated
	 */
	EAttribute getKerasDenseLayer_UseBias();

	/**
	 * Returns the meta object for the reference '{@link nndesigner.KerasDenseLayer#getActivationFunction <em>Activation Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Activation Function</em>'.
	 * @see nndesigner.KerasDenseLayer#getActivationFunction()
	 * @see #getKerasDenseLayer()
	 * @generated
	 */
	EReference getKerasDenseLayer_ActivationFunction();

	/**
	 * Returns the meta object for the reference '{@link nndesigner.KerasDenseLayer#getWeightsInitializer <em>Weights Initializer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Weights Initializer</em>'.
	 * @see nndesigner.KerasDenseLayer#getWeightsInitializer()
	 * @see #getKerasDenseLayer()
	 * @generated
	 */
	EReference getKerasDenseLayer_WeightsInitializer();

	/**
	 * Returns the meta object for the reference '{@link nndesigner.KerasDenseLayer#getBiasInitializer <em>Bias Initializer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bias Initializer</em>'.
	 * @see nndesigner.KerasDenseLayer#getBiasInitializer()
	 * @see #getKerasDenseLayer()
	 * @generated
	 */
	EReference getKerasDenseLayer_BiasInitializer();

	/**
	 * Returns the meta object for class '{@link nndesigner.KerasDropout <em>Keras Dropout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Keras Dropout</em>'.
	 * @see nndesigner.KerasDropout
	 * @generated
	 */
	EClass getKerasDropout();

	/**
	 * Returns the meta object for the attribute '{@link nndesigner.KerasDropout#getRate <em>Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rate</em>'.
	 * @see nndesigner.KerasDropout#getRate()
	 * @see #getKerasDropout()
	 * @generated
	 */
	EAttribute getKerasDropout_Rate();

	/**
	 * Returns the meta object for the attribute list '{@link nndesigner.KerasDropout#getNoiseShape <em>Noise Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Noise Shape</em>'.
	 * @see nndesigner.KerasDropout#getNoiseShape()
	 * @see #getKerasDropout()
	 * @generated
	 */
	EAttribute getKerasDropout_NoiseShape();

	/**
	 * Returns the meta object for the attribute '{@link nndesigner.KerasDropout#getSeed <em>Seed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Seed</em>'.
	 * @see nndesigner.KerasDropout#getSeed()
	 * @see #getKerasDropout()
	 * @generated
	 */
	EAttribute getKerasDropout_Seed();

	/**
	 * Returns the meta object for class '{@link nndesigner.KerasReshape <em>Keras Reshape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Keras Reshape</em>'.
	 * @see nndesigner.KerasReshape
	 * @generated
	 */
	EClass getKerasReshape();

	/**
	 * Returns the meta object for the attribute list '{@link nndesigner.KerasReshape#getInputShape <em>Input Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Input Shape</em>'.
	 * @see nndesigner.KerasReshape#getInputShape()
	 * @see #getKerasReshape()
	 * @generated
	 */
	EAttribute getKerasReshape_InputShape();

	/**
	 * Returns the meta object for the attribute list '{@link nndesigner.KerasReshape#getOutputShape <em>Output Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Output Shape</em>'.
	 * @see nndesigner.KerasReshape#getOutputShape()
	 * @see #getKerasReshape()
	 * @generated
	 */
	EAttribute getKerasReshape_OutputShape();

	/**
	 * Returns the meta object for class '{@link nndesigner.ActivationFunction <em>Activation Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activation Function</em>'.
	 * @see nndesigner.ActivationFunction
	 * @generated
	 */
	EClass getActivationFunction();

	/**
	 * Returns the meta object for class '{@link nndesigner.LossFunction <em>Loss Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Loss Function</em>'.
	 * @see nndesigner.LossFunction
	 * @generated
	 */
	EClass getLossFunction();

	/**
	 * Returns the meta object for class '{@link nndesigner.InitializerFunction <em>Initializer Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Initializer Function</em>'.
	 * @see nndesigner.InitializerFunction
	 * @generated
	 */
	EClass getInitializerFunction();

	/**
	 * Returns the meta object for class '{@link nndesigner.MathFunction <em>Math Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Math Function</em>'.
	 * @see nndesigner.MathFunction
	 * @generated
	 */
	EClass getMathFunction();

	/**
	 * Returns the meta object for class '{@link nndesigner.MatmulFunction <em>Matmul Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Matmul Function</em>'.
	 * @see nndesigner.MatmulFunction
	 * @generated
	 */
	EClass getMatmulFunction();

	/**
	 * Returns the meta object for class '{@link nndesigner.DotFunction <em>Dot Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dot Function</em>'.
	 * @see nndesigner.DotFunction
	 * @generated
	 */
	EClass getDotFunction();

	/**
	 * Returns the meta object for enum '{@link nndesigner.Padding <em>Padding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Padding</em>'.
	 * @see nndesigner.Padding
	 * @generated
	 */
	EEnum getPadding();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	NndesignerFactory getNndesignerFactory();

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
		 * The meta object literal for the '{@link nndesigner.impl.DesignImpl <em>Design</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nndesigner.impl.DesignImpl
		 * @see nndesigner.impl.NndesignerPackageImpl#getDesign()
		 * @generated
		 */
		EClass DESIGN = eINSTANCE.getDesign();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESIGN__ELEMENTS = eINSTANCE.getDesign_Elements();

		/**
		 * The meta object literal for the '{@link nndesigner.Element <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nndesigner.Element
		 * @see nndesigner.impl.NndesignerPackageImpl#getElement()
		 * @generated
		 */
		EClass ELEMENT = eINSTANCE.getElement();

		/**
		 * The meta object literal for the '{@link nndesigner.InputSource <em>Input Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nndesigner.InputSource
		 * @see nndesigner.impl.NndesignerPackageImpl#getInputSource()
		 * @generated
		 */
		EClass INPUT_SOURCE = eINSTANCE.getInputSource();

		/**
		 * The meta object literal for the '{@link nndesigner.impl.LayerImpl <em>Layer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nndesigner.impl.LayerImpl
		 * @see nndesigner.impl.NndesignerPackageImpl#getLayer()
		 * @generated
		 */
		EClass LAYER = eINSTANCE.getLayer();

		/**
		 * The meta object literal for the '<em><b>Input Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAYER__INPUT_SOURCE = eINSTANCE.getLayer_InputSource();

		/**
		 * The meta object literal for the '<em><b>Target Layers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAYER__TARGET_LAYERS = eINSTANCE.getLayer_TargetLayers();

		/**
		 * The meta object literal for the '{@link nndesigner.impl.FunctionImpl <em>Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nndesigner.impl.FunctionImpl
		 * @see nndesigner.impl.NndesignerPackageImpl#getFunction()
		 * @generated
		 */
		EClass FUNCTION = eINSTANCE.getFunction();

		/**
		 * The meta object literal for the '{@link nndesigner.impl.KerasDenseLayerImpl <em>Keras Dense Layer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nndesigner.impl.KerasDenseLayerImpl
		 * @see nndesigner.impl.NndesignerPackageImpl#getKerasDenseLayer()
		 * @generated
		 */
		EClass KERAS_DENSE_LAYER = eINSTANCE.getKerasDenseLayer();

		/**
		 * The meta object literal for the '<em><b>Number Of Output Units</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KERAS_DENSE_LAYER__NUMBER_OF_OUTPUT_UNITS = eINSTANCE.getKerasDenseLayer_NumberOfOutputUnits();

		/**
		 * The meta object literal for the '<em><b>Input Shape</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KERAS_DENSE_LAYER__INPUT_SHAPE = eINSTANCE.getKerasDenseLayer_InputShape();

		/**
		 * The meta object literal for the '<em><b>Use Bias</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KERAS_DENSE_LAYER__USE_BIAS = eINSTANCE.getKerasDenseLayer_UseBias();

		/**
		 * The meta object literal for the '<em><b>Activation Function</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KERAS_DENSE_LAYER__ACTIVATION_FUNCTION = eINSTANCE.getKerasDenseLayer_ActivationFunction();

		/**
		 * The meta object literal for the '<em><b>Weights Initializer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KERAS_DENSE_LAYER__WEIGHTS_INITIALIZER = eINSTANCE.getKerasDenseLayer_WeightsInitializer();

		/**
		 * The meta object literal for the '<em><b>Bias Initializer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KERAS_DENSE_LAYER__BIAS_INITIALIZER = eINSTANCE.getKerasDenseLayer_BiasInitializer();

		/**
		 * The meta object literal for the '{@link nndesigner.impl.KerasDropoutImpl <em>Keras Dropout</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nndesigner.impl.KerasDropoutImpl
		 * @see nndesigner.impl.NndesignerPackageImpl#getKerasDropout()
		 * @generated
		 */
		EClass KERAS_DROPOUT = eINSTANCE.getKerasDropout();

		/**
		 * The meta object literal for the '<em><b>Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KERAS_DROPOUT__RATE = eINSTANCE.getKerasDropout_Rate();

		/**
		 * The meta object literal for the '<em><b>Noise Shape</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KERAS_DROPOUT__NOISE_SHAPE = eINSTANCE.getKerasDropout_NoiseShape();

		/**
		 * The meta object literal for the '<em><b>Seed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KERAS_DROPOUT__SEED = eINSTANCE.getKerasDropout_Seed();

		/**
		 * The meta object literal for the '{@link nndesigner.impl.KerasReshapeImpl <em>Keras Reshape</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nndesigner.impl.KerasReshapeImpl
		 * @see nndesigner.impl.NndesignerPackageImpl#getKerasReshape()
		 * @generated
		 */
		EClass KERAS_RESHAPE = eINSTANCE.getKerasReshape();

		/**
		 * The meta object literal for the '<em><b>Input Shape</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KERAS_RESHAPE__INPUT_SHAPE = eINSTANCE.getKerasReshape_InputShape();

		/**
		 * The meta object literal for the '<em><b>Output Shape</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KERAS_RESHAPE__OUTPUT_SHAPE = eINSTANCE.getKerasReshape_OutputShape();

		/**
		 * The meta object literal for the '{@link nndesigner.impl.ActivationFunctionImpl <em>Activation Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nndesigner.impl.ActivationFunctionImpl
		 * @see nndesigner.impl.NndesignerPackageImpl#getActivationFunction()
		 * @generated
		 */
		EClass ACTIVATION_FUNCTION = eINSTANCE.getActivationFunction();

		/**
		 * The meta object literal for the '{@link nndesigner.impl.LossFunctionImpl <em>Loss Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nndesigner.impl.LossFunctionImpl
		 * @see nndesigner.impl.NndesignerPackageImpl#getLossFunction()
		 * @generated
		 */
		EClass LOSS_FUNCTION = eINSTANCE.getLossFunction();

		/**
		 * The meta object literal for the '{@link nndesigner.impl.InitializerFunctionImpl <em>Initializer Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nndesigner.impl.InitializerFunctionImpl
		 * @see nndesigner.impl.NndesignerPackageImpl#getInitializerFunction()
		 * @generated
		 */
		EClass INITIALIZER_FUNCTION = eINSTANCE.getInitializerFunction();

		/**
		 * The meta object literal for the '{@link nndesigner.impl.MathFunctionImpl <em>Math Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nndesigner.impl.MathFunctionImpl
		 * @see nndesigner.impl.NndesignerPackageImpl#getMathFunction()
		 * @generated
		 */
		EClass MATH_FUNCTION = eINSTANCE.getMathFunction();

		/**
		 * The meta object literal for the '{@link nndesigner.impl.MatmulFunctionImpl <em>Matmul Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nndesigner.impl.MatmulFunctionImpl
		 * @see nndesigner.impl.NndesignerPackageImpl#getMatmulFunction()
		 * @generated
		 */
		EClass MATMUL_FUNCTION = eINSTANCE.getMatmulFunction();

		/**
		 * The meta object literal for the '{@link nndesigner.impl.DotFunctionImpl <em>Dot Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nndesigner.impl.DotFunctionImpl
		 * @see nndesigner.impl.NndesignerPackageImpl#getDotFunction()
		 * @generated
		 */
		EClass DOT_FUNCTION = eINSTANCE.getDotFunction();

		/**
		 * The meta object literal for the '{@link nndesigner.Padding <em>Padding</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nndesigner.Padding
		 * @see nndesigner.impl.NndesignerPackageImpl#getPadding()
		 * @generated
		 */
		EEnum PADDING = eINSTANCE.getPadding();

	}

} //NndesignerPackage
