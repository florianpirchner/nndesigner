/**
 */
package com.lunifera.nndesigner.model;

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
 * @see com.lunifera.nndesigner.model.ModelFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel basePackage='com.lunifera.nndesigner'"
 * @generated
 */
public interface ModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "model";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "com.lunifera.nndesigner.model";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "model";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModelPackage eINSTANCE = com.lunifera.nndesigner.model.impl.ModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.lunifera.nndesigner.model.impl.DesignImpl <em>Design</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.lunifera.nndesigner.model.impl.DesignImpl
	 * @see com.lunifera.nndesigner.model.impl.ModelPackageImpl#getDesign()
	 * @generated
	 */
	int DESIGN = 0;

	/**
	 * The feature id for the '<em><b>Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN__MODEL = 0;

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
	 * The meta object id for the '{@link com.lunifera.nndesigner.model.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.lunifera.nndesigner.model.impl.ModelImpl
	 * @see com.lunifera.nndesigner.model.impl.ModelPackageImpl#getModel()
	 * @generated
	 */
	int MODEL = 1;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__ELEMENTS = 0;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.lunifera.nndesigner.model.Element <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.lunifera.nndesigner.model.Element
	 * @see com.lunifera.nndesigner.model.impl.ModelPackageImpl#getElement()
	 * @generated
	 */
	int ELEMENT = 2;

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
	 * The meta object id for the '{@link com.lunifera.nndesigner.model.InputSource <em>Input Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.lunifera.nndesigner.model.InputSource
	 * @see com.lunifera.nndesigner.model.impl.ModelPackageImpl#getInputSource()
	 * @generated
	 */
	int INPUT_SOURCE = 3;

	/**
	 * The feature id for the '<em><b>Target Layers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_SOURCE__TARGET_LAYERS = 0;

	/**
	 * The number of structural features of the '<em>Input Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_SOURCE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Input Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_SOURCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.lunifera.nndesigner.model.impl.LayerImpl <em>Layer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.lunifera.nndesigner.model.impl.LayerImpl
	 * @see com.lunifera.nndesigner.model.impl.ModelPackageImpl#getLayer()
	 * @generated
	 */
	int LAYER = 4;

	/**
	 * The feature id for the '<em><b>Target Layers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER__TARGET_LAYERS = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input Sources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER__INPUT_SOURCES = ELEMENT_FEATURE_COUNT + 1;

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
	 * The meta object id for the '{@link com.lunifera.nndesigner.model.impl.FunctionImpl <em>Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.lunifera.nndesigner.model.impl.FunctionImpl
	 * @see com.lunifera.nndesigner.model.impl.ModelPackageImpl#getFunction()
	 * @generated
	 */
	int FUNCTION = 5;

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
	 * The meta object id for the '{@link com.lunifera.nndesigner.model.impl.ShapeImpl <em>Shape</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.lunifera.nndesigner.model.impl.ShapeImpl
	 * @see com.lunifera.nndesigner.model.impl.ModelPackageImpl#getShape()
	 * @generated
	 */
	int SHAPE = 6;

	/**
	 * The feature id for the '<em><b>Batch Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__BATCH_SIZE = 0;

	/**
	 * The number of structural features of the '<em>Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.lunifera.nndesigner.model.impl.Shape2DImpl <em>Shape2 D</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.lunifera.nndesigner.model.impl.Shape2DImpl
	 * @see com.lunifera.nndesigner.model.impl.ModelPackageImpl#getShape2D()
	 * @generated
	 */
	int SHAPE2_D = 7;

	/**
	 * The feature id for the '<em><b>Batch Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE2_D__BATCH_SIZE = SHAPE__BATCH_SIZE;

	/**
	 * The feature id for the '<em><b>Value1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE2_D__VALUE1 = SHAPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Shape2 D</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE2_D_FEATURE_COUNT = SHAPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Shape2 D</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE2_D_OPERATION_COUNT = SHAPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.lunifera.nndesigner.model.impl.Shape3DImpl <em>Shape3 D</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.lunifera.nndesigner.model.impl.Shape3DImpl
	 * @see com.lunifera.nndesigner.model.impl.ModelPackageImpl#getShape3D()
	 * @generated
	 */
	int SHAPE3_D = 8;

	/**
	 * The feature id for the '<em><b>Batch Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE3_D__BATCH_SIZE = SHAPE2_D__BATCH_SIZE;

	/**
	 * The feature id for the '<em><b>Value1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE3_D__VALUE1 = SHAPE2_D__VALUE1;

	/**
	 * The feature id for the '<em><b>Value2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE3_D__VALUE2 = SHAPE2_D_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Shape3 D</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE3_D_FEATURE_COUNT = SHAPE2_D_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Shape3 D</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE3_D_OPERATION_COUNT = SHAPE2_D_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.lunifera.nndesigner.model.impl.IntegerDupleImpl <em>Integer Duple</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.lunifera.nndesigner.model.impl.IntegerDupleImpl
	 * @see com.lunifera.nndesigner.model.impl.ModelPackageImpl#getIntegerDuple()
	 * @generated
	 */
	int INTEGER_DUPLE = 9;

	/**
	 * The feature id for the '<em><b>Value1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_DUPLE__VALUE1 = 0;

	/**
	 * The feature id for the '<em><b>Value2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_DUPLE__VALUE2 = 1;

	/**
	 * The number of structural features of the '<em>Integer Duple</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_DUPLE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Integer Duple</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_DUPLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.lunifera.nndesigner.model.impl.ActivationFunctionImpl <em>Activation Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.lunifera.nndesigner.model.impl.ActivationFunctionImpl
	 * @see com.lunifera.nndesigner.model.impl.ModelPackageImpl#getActivationFunction()
	 * @generated
	 */
	int ACTIVATION_FUNCTION = 10;

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
	 * The meta object id for the '{@link com.lunifera.nndesigner.model.impl.LossFunctionImpl <em>Loss Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.lunifera.nndesigner.model.impl.LossFunctionImpl
	 * @see com.lunifera.nndesigner.model.impl.ModelPackageImpl#getLossFunction()
	 * @generated
	 */
	int LOSS_FUNCTION = 11;

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
	 * The meta object id for the '{@link com.lunifera.nndesigner.model.impl.InitializerFunctionImpl <em>Initializer Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.lunifera.nndesigner.model.impl.InitializerFunctionImpl
	 * @see com.lunifera.nndesigner.model.impl.ModelPackageImpl#getInitializerFunction()
	 * @generated
	 */
	int INITIALIZER_FUNCTION = 12;

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
	 * The meta object id for the '{@link com.lunifera.nndesigner.model.impl.MathFunctionImpl <em>Math Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.lunifera.nndesigner.model.impl.MathFunctionImpl
	 * @see com.lunifera.nndesigner.model.impl.ModelPackageImpl#getMathFunction()
	 * @generated
	 */
	int MATH_FUNCTION = 13;

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
	 * The meta object id for the '{@link com.lunifera.nndesigner.model.impl.MatmulFunctionImpl <em>Matmul Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.lunifera.nndesigner.model.impl.MatmulFunctionImpl
	 * @see com.lunifera.nndesigner.model.impl.ModelPackageImpl#getMatmulFunction()
	 * @generated
	 */
	int MATMUL_FUNCTION = 14;

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
	 * The meta object id for the '{@link com.lunifera.nndesigner.model.impl.DotFunctionImpl <em>Dot Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.lunifera.nndesigner.model.impl.DotFunctionImpl
	 * @see com.lunifera.nndesigner.model.impl.ModelPackageImpl#getDotFunction()
	 * @generated
	 */
	int DOT_FUNCTION = 15;

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
	 * The meta object id for the '{@link com.lunifera.nndesigner.model.Padding <em>Padding</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.lunifera.nndesigner.model.Padding
	 * @see com.lunifera.nndesigner.model.impl.ModelPackageImpl#getPadding()
	 * @generated
	 */
	int PADDING = 16;


	/**
	 * Returns the meta object for class '{@link com.lunifera.nndesigner.model.Design <em>Design</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Design</em>'.
	 * @see com.lunifera.nndesigner.model.Design
	 * @generated
	 */
	EClass getDesign();

	/**
	 * Returns the meta object for the containment reference '{@link com.lunifera.nndesigner.model.Design#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Model</em>'.
	 * @see com.lunifera.nndesigner.model.Design#getModel()
	 * @see #getDesign()
	 * @generated
	 */
	EReference getDesign_Model();

	/**
	 * Returns the meta object for class '{@link com.lunifera.nndesigner.model.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see com.lunifera.nndesigner.model.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for the containment reference list '{@link com.lunifera.nndesigner.model.Model#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see com.lunifera.nndesigner.model.Model#getElements()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Elements();

	/**
	 * Returns the meta object for class '{@link com.lunifera.nndesigner.model.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see com.lunifera.nndesigner.model.Element
	 * @generated
	 */
	EClass getElement();

	/**
	 * Returns the meta object for class '{@link com.lunifera.nndesigner.model.InputSource <em>Input Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Source</em>'.
	 * @see com.lunifera.nndesigner.model.InputSource
	 * @generated
	 */
	EClass getInputSource();

	/**
	 * Returns the meta object for the reference list '{@link com.lunifera.nndesigner.model.InputSource#getTargetLayers <em>Target Layers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Target Layers</em>'.
	 * @see com.lunifera.nndesigner.model.InputSource#getTargetLayers()
	 * @see #getInputSource()
	 * @generated
	 */
	EReference getInputSource_TargetLayers();

	/**
	 * Returns the meta object for class '{@link com.lunifera.nndesigner.model.Layer <em>Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Layer</em>'.
	 * @see com.lunifera.nndesigner.model.Layer
	 * @generated
	 */
	EClass getLayer();

	/**
	 * Returns the meta object for the reference list '{@link com.lunifera.nndesigner.model.Layer#getInputSources <em>Input Sources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Input Sources</em>'.
	 * @see com.lunifera.nndesigner.model.Layer#getInputSources()
	 * @see #getLayer()
	 * @generated
	 */
	EReference getLayer_InputSources();

	/**
	 * Returns the meta object for class '{@link com.lunifera.nndesigner.model.Function <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function</em>'.
	 * @see com.lunifera.nndesigner.model.Function
	 * @generated
	 */
	EClass getFunction();

	/**
	 * Returns the meta object for class '{@link com.lunifera.nndesigner.model.Shape <em>Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shape</em>'.
	 * @see com.lunifera.nndesigner.model.Shape
	 * @generated
	 */
	EClass getShape();

	/**
	 * Returns the meta object for the attribute '{@link com.lunifera.nndesigner.model.Shape#getBatchSize <em>Batch Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Batch Size</em>'.
	 * @see com.lunifera.nndesigner.model.Shape#getBatchSize()
	 * @see #getShape()
	 * @generated
	 */
	EAttribute getShape_BatchSize();

	/**
	 * Returns the meta object for class '{@link com.lunifera.nndesigner.model.Shape2D <em>Shape2 D</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shape2 D</em>'.
	 * @see com.lunifera.nndesigner.model.Shape2D
	 * @generated
	 */
	EClass getShape2D();

	/**
	 * Returns the meta object for the attribute '{@link com.lunifera.nndesigner.model.Shape2D#getValue1 <em>Value1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value1</em>'.
	 * @see com.lunifera.nndesigner.model.Shape2D#getValue1()
	 * @see #getShape2D()
	 * @generated
	 */
	EAttribute getShape2D_Value1();

	/**
	 * Returns the meta object for class '{@link com.lunifera.nndesigner.model.Shape3D <em>Shape3 D</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shape3 D</em>'.
	 * @see com.lunifera.nndesigner.model.Shape3D
	 * @generated
	 */
	EClass getShape3D();

	/**
	 * Returns the meta object for the attribute '{@link com.lunifera.nndesigner.model.Shape3D#getValue2 <em>Value2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value2</em>'.
	 * @see com.lunifera.nndesigner.model.Shape3D#getValue2()
	 * @see #getShape3D()
	 * @generated
	 */
	EAttribute getShape3D_Value2();

	/**
	 * Returns the meta object for class '{@link com.lunifera.nndesigner.model.IntegerDuple <em>Integer Duple</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Duple</em>'.
	 * @see com.lunifera.nndesigner.model.IntegerDuple
	 * @generated
	 */
	EClass getIntegerDuple();

	/**
	 * Returns the meta object for the attribute '{@link com.lunifera.nndesigner.model.IntegerDuple#getValue1 <em>Value1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value1</em>'.
	 * @see com.lunifera.nndesigner.model.IntegerDuple#getValue1()
	 * @see #getIntegerDuple()
	 * @generated
	 */
	EAttribute getIntegerDuple_Value1();

	/**
	 * Returns the meta object for the attribute '{@link com.lunifera.nndesigner.model.IntegerDuple#getValue2 <em>Value2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value2</em>'.
	 * @see com.lunifera.nndesigner.model.IntegerDuple#getValue2()
	 * @see #getIntegerDuple()
	 * @generated
	 */
	EAttribute getIntegerDuple_Value2();

	/**
	 * Returns the meta object for class '{@link com.lunifera.nndesigner.model.ActivationFunction <em>Activation Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activation Function</em>'.
	 * @see com.lunifera.nndesigner.model.ActivationFunction
	 * @generated
	 */
	EClass getActivationFunction();

	/**
	 * Returns the meta object for class '{@link com.lunifera.nndesigner.model.LossFunction <em>Loss Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Loss Function</em>'.
	 * @see com.lunifera.nndesigner.model.LossFunction
	 * @generated
	 */
	EClass getLossFunction();

	/**
	 * Returns the meta object for class '{@link com.lunifera.nndesigner.model.InitializerFunction <em>Initializer Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Initializer Function</em>'.
	 * @see com.lunifera.nndesigner.model.InitializerFunction
	 * @generated
	 */
	EClass getInitializerFunction();

	/**
	 * Returns the meta object for class '{@link com.lunifera.nndesigner.model.MathFunction <em>Math Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Math Function</em>'.
	 * @see com.lunifera.nndesigner.model.MathFunction
	 * @generated
	 */
	EClass getMathFunction();

	/**
	 * Returns the meta object for class '{@link com.lunifera.nndesigner.model.MatmulFunction <em>Matmul Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Matmul Function</em>'.
	 * @see com.lunifera.nndesigner.model.MatmulFunction
	 * @generated
	 */
	EClass getMatmulFunction();

	/**
	 * Returns the meta object for class '{@link com.lunifera.nndesigner.model.DotFunction <em>Dot Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dot Function</em>'.
	 * @see com.lunifera.nndesigner.model.DotFunction
	 * @generated
	 */
	EClass getDotFunction();

	/**
	 * Returns the meta object for enum '{@link com.lunifera.nndesigner.model.Padding <em>Padding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Padding</em>'.
	 * @see com.lunifera.nndesigner.model.Padding
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
	ModelFactory getModelFactory();

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
		 * The meta object literal for the '{@link com.lunifera.nndesigner.model.impl.DesignImpl <em>Design</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.lunifera.nndesigner.model.impl.DesignImpl
		 * @see com.lunifera.nndesigner.model.impl.ModelPackageImpl#getDesign()
		 * @generated
		 */
		EClass DESIGN = eINSTANCE.getDesign();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESIGN__MODEL = eINSTANCE.getDesign_Model();

		/**
		 * The meta object literal for the '{@link com.lunifera.nndesigner.model.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.lunifera.nndesigner.model.impl.ModelImpl
		 * @see com.lunifera.nndesigner.model.impl.ModelPackageImpl#getModel()
		 * @generated
		 */
		EClass MODEL = eINSTANCE.getModel();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__ELEMENTS = eINSTANCE.getModel_Elements();

		/**
		 * The meta object literal for the '{@link com.lunifera.nndesigner.model.Element <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.lunifera.nndesigner.model.Element
		 * @see com.lunifera.nndesigner.model.impl.ModelPackageImpl#getElement()
		 * @generated
		 */
		EClass ELEMENT = eINSTANCE.getElement();

		/**
		 * The meta object literal for the '{@link com.lunifera.nndesigner.model.InputSource <em>Input Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.lunifera.nndesigner.model.InputSource
		 * @see com.lunifera.nndesigner.model.impl.ModelPackageImpl#getInputSource()
		 * @generated
		 */
		EClass INPUT_SOURCE = eINSTANCE.getInputSource();

		/**
		 * The meta object literal for the '<em><b>Target Layers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_SOURCE__TARGET_LAYERS = eINSTANCE.getInputSource_TargetLayers();

		/**
		 * The meta object literal for the '{@link com.lunifera.nndesigner.model.impl.LayerImpl <em>Layer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.lunifera.nndesigner.model.impl.LayerImpl
		 * @see com.lunifera.nndesigner.model.impl.ModelPackageImpl#getLayer()
		 * @generated
		 */
		EClass LAYER = eINSTANCE.getLayer();

		/**
		 * The meta object literal for the '<em><b>Input Sources</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAYER__INPUT_SOURCES = eINSTANCE.getLayer_InputSources();

		/**
		 * The meta object literal for the '{@link com.lunifera.nndesigner.model.impl.FunctionImpl <em>Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.lunifera.nndesigner.model.impl.FunctionImpl
		 * @see com.lunifera.nndesigner.model.impl.ModelPackageImpl#getFunction()
		 * @generated
		 */
		EClass FUNCTION = eINSTANCE.getFunction();

		/**
		 * The meta object literal for the '{@link com.lunifera.nndesigner.model.impl.ShapeImpl <em>Shape</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.lunifera.nndesigner.model.impl.ShapeImpl
		 * @see com.lunifera.nndesigner.model.impl.ModelPackageImpl#getShape()
		 * @generated
		 */
		EClass SHAPE = eINSTANCE.getShape();

		/**
		 * The meta object literal for the '<em><b>Batch Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHAPE__BATCH_SIZE = eINSTANCE.getShape_BatchSize();

		/**
		 * The meta object literal for the '{@link com.lunifera.nndesigner.model.impl.Shape2DImpl <em>Shape2 D</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.lunifera.nndesigner.model.impl.Shape2DImpl
		 * @see com.lunifera.nndesigner.model.impl.ModelPackageImpl#getShape2D()
		 * @generated
		 */
		EClass SHAPE2_D = eINSTANCE.getShape2D();

		/**
		 * The meta object literal for the '<em><b>Value1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHAPE2_D__VALUE1 = eINSTANCE.getShape2D_Value1();

		/**
		 * The meta object literal for the '{@link com.lunifera.nndesigner.model.impl.Shape3DImpl <em>Shape3 D</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.lunifera.nndesigner.model.impl.Shape3DImpl
		 * @see com.lunifera.nndesigner.model.impl.ModelPackageImpl#getShape3D()
		 * @generated
		 */
		EClass SHAPE3_D = eINSTANCE.getShape3D();

		/**
		 * The meta object literal for the '<em><b>Value2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHAPE3_D__VALUE2 = eINSTANCE.getShape3D_Value2();

		/**
		 * The meta object literal for the '{@link com.lunifera.nndesigner.model.impl.IntegerDupleImpl <em>Integer Duple</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.lunifera.nndesigner.model.impl.IntegerDupleImpl
		 * @see com.lunifera.nndesigner.model.impl.ModelPackageImpl#getIntegerDuple()
		 * @generated
		 */
		EClass INTEGER_DUPLE = eINSTANCE.getIntegerDuple();

		/**
		 * The meta object literal for the '<em><b>Value1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER_DUPLE__VALUE1 = eINSTANCE.getIntegerDuple_Value1();

		/**
		 * The meta object literal for the '<em><b>Value2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER_DUPLE__VALUE2 = eINSTANCE.getIntegerDuple_Value2();

		/**
		 * The meta object literal for the '{@link com.lunifera.nndesigner.model.impl.ActivationFunctionImpl <em>Activation Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.lunifera.nndesigner.model.impl.ActivationFunctionImpl
		 * @see com.lunifera.nndesigner.model.impl.ModelPackageImpl#getActivationFunction()
		 * @generated
		 */
		EClass ACTIVATION_FUNCTION = eINSTANCE.getActivationFunction();

		/**
		 * The meta object literal for the '{@link com.lunifera.nndesigner.model.impl.LossFunctionImpl <em>Loss Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.lunifera.nndesigner.model.impl.LossFunctionImpl
		 * @see com.lunifera.nndesigner.model.impl.ModelPackageImpl#getLossFunction()
		 * @generated
		 */
		EClass LOSS_FUNCTION = eINSTANCE.getLossFunction();

		/**
		 * The meta object literal for the '{@link com.lunifera.nndesigner.model.impl.InitializerFunctionImpl <em>Initializer Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.lunifera.nndesigner.model.impl.InitializerFunctionImpl
		 * @see com.lunifera.nndesigner.model.impl.ModelPackageImpl#getInitializerFunction()
		 * @generated
		 */
		EClass INITIALIZER_FUNCTION = eINSTANCE.getInitializerFunction();

		/**
		 * The meta object literal for the '{@link com.lunifera.nndesigner.model.impl.MathFunctionImpl <em>Math Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.lunifera.nndesigner.model.impl.MathFunctionImpl
		 * @see com.lunifera.nndesigner.model.impl.ModelPackageImpl#getMathFunction()
		 * @generated
		 */
		EClass MATH_FUNCTION = eINSTANCE.getMathFunction();

		/**
		 * The meta object literal for the '{@link com.lunifera.nndesigner.model.impl.MatmulFunctionImpl <em>Matmul Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.lunifera.nndesigner.model.impl.MatmulFunctionImpl
		 * @see com.lunifera.nndesigner.model.impl.ModelPackageImpl#getMatmulFunction()
		 * @generated
		 */
		EClass MATMUL_FUNCTION = eINSTANCE.getMatmulFunction();

		/**
		 * The meta object literal for the '{@link com.lunifera.nndesigner.model.impl.DotFunctionImpl <em>Dot Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.lunifera.nndesigner.model.impl.DotFunctionImpl
		 * @see com.lunifera.nndesigner.model.impl.ModelPackageImpl#getDotFunction()
		 * @generated
		 */
		EClass DOT_FUNCTION = eINSTANCE.getDotFunction();

		/**
		 * The meta object literal for the '{@link com.lunifera.nndesigner.model.Padding <em>Padding</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.lunifera.nndesigner.model.Padding
		 * @see com.lunifera.nndesigner.model.impl.ModelPackageImpl#getPadding()
		 * @generated
		 */
		EEnum PADDING = eINSTANCE.getPadding();

	}

} //ModelPackage
