/**
 */
package org.eclipse.athene.nn.model.core;

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
 * @see org.eclipse.athene.nn.model.core.CoreFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel fileExtensions='athene' modelName='Athene' childCreationExtenders='true' extensibleProviderFactory='true' editDirectory='/org.eclipse.athene.nn.model.edit/src' editorDirectory='/org.eclipse.athene.nn.model.editor/src' basePackage='org.eclipse.athene.nn.model'"
 * @generated
 */
public interface CorePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "core";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "org.eclipse.athene.nn.model.core";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "athene";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CorePackage eINSTANCE = org.eclipse.athene.nn.model.core.impl.CorePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.athene.nn.model.core.impl.DesignImpl <em>Design</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.athene.nn.model.core.impl.DesignImpl
	 * @see org.eclipse.athene.nn.model.core.impl.CorePackageImpl#getDesign()
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
	 * The meta object id for the '{@link org.eclipse.athene.nn.model.core.Element <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.athene.nn.model.core.Element
	 * @see org.eclipse.athene.nn.model.core.impl.CorePackageImpl#getElement()
	 * @generated
	 */
	int ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.athene.nn.model.core.impl.TensorImpl <em>Tensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.athene.nn.model.core.impl.TensorImpl
	 * @see org.eclipse.athene.nn.model.core.impl.CorePackageImpl#getTensor()
	 * @generated
	 */
	int TENSOR = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENSOR__NAME = 0;

	/**
	 * The number of structural features of the '<em>Tensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENSOR_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Tensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENSOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.athene.nn.model.core.impl.LayerImpl <em>Layer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.athene.nn.model.core.impl.LayerImpl
	 * @see org.eclipse.athene.nn.model.core.impl.CorePackageImpl#getLayer()
	 * @generated
	 */
	int LAYER = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER__NAME = ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.athene.nn.model.core.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.athene.nn.model.core.impl.ModelImpl
	 * @see org.eclipse.athene.nn.model.core.impl.CorePackageImpl#getModel()
	 * @generated
	 */
	int MODEL = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__NAME = LAYER__NAME;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = LAYER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_OPERATION_COUNT = LAYER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.athene.nn.model.core.impl.FunctionImpl <em>Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.athene.nn.model.core.impl.FunctionImpl
	 * @see org.eclipse.athene.nn.model.core.impl.CorePackageImpl#getFunction()
	 * @generated
	 */
	int FUNCTION = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__NAME = ELEMENT__NAME;

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
	 * The meta object id for the '{@link org.eclipse.athene.nn.model.core.impl.ShapeImpl <em>Shape</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.athene.nn.model.core.impl.ShapeImpl
	 * @see org.eclipse.athene.nn.model.core.impl.CorePackageImpl#getShape()
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
	 * The meta object id for the '{@link org.eclipse.athene.nn.model.core.impl.Shape2DImpl <em>Shape2 D</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.athene.nn.model.core.impl.Shape2DImpl
	 * @see org.eclipse.athene.nn.model.core.impl.CorePackageImpl#getShape2D()
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
	 * The meta object id for the '{@link org.eclipse.athene.nn.model.core.impl.Shape3DImpl <em>Shape3 D</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.athene.nn.model.core.impl.Shape3DImpl
	 * @see org.eclipse.athene.nn.model.core.impl.CorePackageImpl#getShape3D()
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
	 * The meta object id for the '{@link org.eclipse.athene.nn.model.core.impl.IntegerDupleImpl <em>Integer Duple</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.athene.nn.model.core.impl.IntegerDupleImpl
	 * @see org.eclipse.athene.nn.model.core.impl.CorePackageImpl#getIntegerDuple()
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
	 * The meta object id for the '{@link org.eclipse.athene.nn.model.core.impl.ActivationFunctionImpl <em>Activation Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.athene.nn.model.core.impl.ActivationFunctionImpl
	 * @see org.eclipse.athene.nn.model.core.impl.CorePackageImpl#getActivationFunction()
	 * @generated
	 */
	int ACTIVATION_FUNCTION = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVATION_FUNCTION__NAME = FUNCTION__NAME;

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
	 * The meta object id for the '{@link org.eclipse.athene.nn.model.core.impl.LossFunctionImpl <em>Loss Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.athene.nn.model.core.impl.LossFunctionImpl
	 * @see org.eclipse.athene.nn.model.core.impl.CorePackageImpl#getLossFunction()
	 * @generated
	 */
	int LOSS_FUNCTION = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOSS_FUNCTION__NAME = FUNCTION__NAME;

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
	 * The meta object id for the '{@link org.eclipse.athene.nn.model.core.impl.InitializerFunctionImpl <em>Initializer Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.athene.nn.model.core.impl.InitializerFunctionImpl
	 * @see org.eclipse.athene.nn.model.core.impl.CorePackageImpl#getInitializerFunction()
	 * @generated
	 */
	int INITIALIZER_FUNCTION = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIALIZER_FUNCTION__NAME = ELEMENT__NAME;

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
	 * The meta object id for the '{@link org.eclipse.athene.nn.model.core.impl.MathFunctionImpl <em>Math Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.athene.nn.model.core.impl.MathFunctionImpl
	 * @see org.eclipse.athene.nn.model.core.impl.CorePackageImpl#getMathFunction()
	 * @generated
	 */
	int MATH_FUNCTION = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATH_FUNCTION__NAME = FUNCTION__NAME;

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
	 * The meta object id for the '{@link org.eclipse.athene.nn.model.core.impl.MatmulFunctionImpl <em>Matmul Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.athene.nn.model.core.impl.MatmulFunctionImpl
	 * @see org.eclipse.athene.nn.model.core.impl.CorePackageImpl#getMatmulFunction()
	 * @generated
	 */
	int MATMUL_FUNCTION = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATMUL_FUNCTION__NAME = MATH_FUNCTION__NAME;

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
	 * The meta object id for the '{@link org.eclipse.athene.nn.model.core.impl.DotFunctionImpl <em>Dot Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.athene.nn.model.core.impl.DotFunctionImpl
	 * @see org.eclipse.athene.nn.model.core.impl.CorePackageImpl#getDotFunction()
	 * @generated
	 */
	int DOT_FUNCTION = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOT_FUNCTION__NAME = MATH_FUNCTION__NAME;

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
	 * The meta object id for the '{@link org.eclipse.athene.nn.model.core.Padding <em>Padding</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.athene.nn.model.core.Padding
	 * @see org.eclipse.athene.nn.model.core.impl.CorePackageImpl#getPadding()
	 * @generated
	 */
	int PADDING = 16;


	/**
	 * Returns the meta object for class '{@link org.eclipse.athene.nn.model.core.Design <em>Design</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Design</em>'.
	 * @see org.eclipse.athene.nn.model.core.Design
	 * @generated
	 */
	EClass getDesign();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.athene.nn.model.core.Design#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see org.eclipse.athene.nn.model.core.Design#getElements()
	 * @see #getDesign()
	 * @generated
	 */
	EReference getDesign_Elements();

	/**
	 * Returns the meta object for class '{@link org.eclipse.athene.nn.model.core.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see org.eclipse.athene.nn.model.core.Element
	 * @generated
	 */
	EClass getElement();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.athene.nn.model.core.Element#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.athene.nn.model.core.Element#getName()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.athene.nn.model.core.Tensor <em>Tensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tensor</em>'.
	 * @see org.eclipse.athene.nn.model.core.Tensor
	 * @generated
	 */
	EClass getTensor();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.athene.nn.model.core.Tensor#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.athene.nn.model.core.Tensor#getName()
	 * @see #getTensor()
	 * @generated
	 */
	EAttribute getTensor_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.athene.nn.model.core.Layer <em>Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Layer</em>'.
	 * @see org.eclipse.athene.nn.model.core.Layer
	 * @generated
	 */
	EClass getLayer();

	/**
	 * Returns the meta object for class '{@link org.eclipse.athene.nn.model.core.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see org.eclipse.athene.nn.model.core.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for class '{@link org.eclipse.athene.nn.model.core.Function <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function</em>'.
	 * @see org.eclipse.athene.nn.model.core.Function
	 * @generated
	 */
	EClass getFunction();

	/**
	 * Returns the meta object for class '{@link org.eclipse.athene.nn.model.core.Shape <em>Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shape</em>'.
	 * @see org.eclipse.athene.nn.model.core.Shape
	 * @generated
	 */
	EClass getShape();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.athene.nn.model.core.Shape#getBatchSize <em>Batch Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Batch Size</em>'.
	 * @see org.eclipse.athene.nn.model.core.Shape#getBatchSize()
	 * @see #getShape()
	 * @generated
	 */
	EAttribute getShape_BatchSize();

	/**
	 * Returns the meta object for class '{@link org.eclipse.athene.nn.model.core.Shape2D <em>Shape2 D</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shape2 D</em>'.
	 * @see org.eclipse.athene.nn.model.core.Shape2D
	 * @generated
	 */
	EClass getShape2D();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.athene.nn.model.core.Shape2D#getValue1 <em>Value1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value1</em>'.
	 * @see org.eclipse.athene.nn.model.core.Shape2D#getValue1()
	 * @see #getShape2D()
	 * @generated
	 */
	EAttribute getShape2D_Value1();

	/**
	 * Returns the meta object for class '{@link org.eclipse.athene.nn.model.core.Shape3D <em>Shape3 D</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shape3 D</em>'.
	 * @see org.eclipse.athene.nn.model.core.Shape3D
	 * @generated
	 */
	EClass getShape3D();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.athene.nn.model.core.Shape3D#getValue2 <em>Value2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value2</em>'.
	 * @see org.eclipse.athene.nn.model.core.Shape3D#getValue2()
	 * @see #getShape3D()
	 * @generated
	 */
	EAttribute getShape3D_Value2();

	/**
	 * Returns the meta object for class '{@link org.eclipse.athene.nn.model.core.IntegerDuple <em>Integer Duple</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Duple</em>'.
	 * @see org.eclipse.athene.nn.model.core.IntegerDuple
	 * @generated
	 */
	EClass getIntegerDuple();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.athene.nn.model.core.IntegerDuple#getValue1 <em>Value1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value1</em>'.
	 * @see org.eclipse.athene.nn.model.core.IntegerDuple#getValue1()
	 * @see #getIntegerDuple()
	 * @generated
	 */
	EAttribute getIntegerDuple_Value1();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.athene.nn.model.core.IntegerDuple#getValue2 <em>Value2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value2</em>'.
	 * @see org.eclipse.athene.nn.model.core.IntegerDuple#getValue2()
	 * @see #getIntegerDuple()
	 * @generated
	 */
	EAttribute getIntegerDuple_Value2();

	/**
	 * Returns the meta object for class '{@link org.eclipse.athene.nn.model.core.ActivationFunction <em>Activation Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activation Function</em>'.
	 * @see org.eclipse.athene.nn.model.core.ActivationFunction
	 * @generated
	 */
	EClass getActivationFunction();

	/**
	 * Returns the meta object for class '{@link org.eclipse.athene.nn.model.core.LossFunction <em>Loss Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Loss Function</em>'.
	 * @see org.eclipse.athene.nn.model.core.LossFunction
	 * @generated
	 */
	EClass getLossFunction();

	/**
	 * Returns the meta object for class '{@link org.eclipse.athene.nn.model.core.InitializerFunction <em>Initializer Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Initializer Function</em>'.
	 * @see org.eclipse.athene.nn.model.core.InitializerFunction
	 * @generated
	 */
	EClass getInitializerFunction();

	/**
	 * Returns the meta object for class '{@link org.eclipse.athene.nn.model.core.MathFunction <em>Math Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Math Function</em>'.
	 * @see org.eclipse.athene.nn.model.core.MathFunction
	 * @generated
	 */
	EClass getMathFunction();

	/**
	 * Returns the meta object for class '{@link org.eclipse.athene.nn.model.core.MatmulFunction <em>Matmul Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Matmul Function</em>'.
	 * @see org.eclipse.athene.nn.model.core.MatmulFunction
	 * @generated
	 */
	EClass getMatmulFunction();

	/**
	 * Returns the meta object for class '{@link org.eclipse.athene.nn.model.core.DotFunction <em>Dot Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dot Function</em>'.
	 * @see org.eclipse.athene.nn.model.core.DotFunction
	 * @generated
	 */
	EClass getDotFunction();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.athene.nn.model.core.Padding <em>Padding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Padding</em>'.
	 * @see org.eclipse.athene.nn.model.core.Padding
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
	CoreFactory getCoreFactory();

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
		 * The meta object literal for the '{@link org.eclipse.athene.nn.model.core.impl.DesignImpl <em>Design</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.athene.nn.model.core.impl.DesignImpl
		 * @see org.eclipse.athene.nn.model.core.impl.CorePackageImpl#getDesign()
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
		 * The meta object literal for the '{@link org.eclipse.athene.nn.model.core.Element <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.athene.nn.model.core.Element
		 * @see org.eclipse.athene.nn.model.core.impl.CorePackageImpl#getElement()
		 * @generated
		 */
		EClass ELEMENT = eINSTANCE.getElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__NAME = eINSTANCE.getElement_Name();

		/**
		 * The meta object literal for the '{@link org.eclipse.athene.nn.model.core.impl.TensorImpl <em>Tensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.athene.nn.model.core.impl.TensorImpl
		 * @see org.eclipse.athene.nn.model.core.impl.CorePackageImpl#getTensor()
		 * @generated
		 */
		EClass TENSOR = eINSTANCE.getTensor();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TENSOR__NAME = eINSTANCE.getTensor_Name();

		/**
		 * The meta object literal for the '{@link org.eclipse.athene.nn.model.core.impl.LayerImpl <em>Layer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.athene.nn.model.core.impl.LayerImpl
		 * @see org.eclipse.athene.nn.model.core.impl.CorePackageImpl#getLayer()
		 * @generated
		 */
		EClass LAYER = eINSTANCE.getLayer();

		/**
		 * The meta object literal for the '{@link org.eclipse.athene.nn.model.core.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.athene.nn.model.core.impl.ModelImpl
		 * @see org.eclipse.athene.nn.model.core.impl.CorePackageImpl#getModel()
		 * @generated
		 */
		EClass MODEL = eINSTANCE.getModel();

		/**
		 * The meta object literal for the '{@link org.eclipse.athene.nn.model.core.impl.FunctionImpl <em>Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.athene.nn.model.core.impl.FunctionImpl
		 * @see org.eclipse.athene.nn.model.core.impl.CorePackageImpl#getFunction()
		 * @generated
		 */
		EClass FUNCTION = eINSTANCE.getFunction();

		/**
		 * The meta object literal for the '{@link org.eclipse.athene.nn.model.core.impl.ShapeImpl <em>Shape</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.athene.nn.model.core.impl.ShapeImpl
		 * @see org.eclipse.athene.nn.model.core.impl.CorePackageImpl#getShape()
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
		 * The meta object literal for the '{@link org.eclipse.athene.nn.model.core.impl.Shape2DImpl <em>Shape2 D</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.athene.nn.model.core.impl.Shape2DImpl
		 * @see org.eclipse.athene.nn.model.core.impl.CorePackageImpl#getShape2D()
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
		 * The meta object literal for the '{@link org.eclipse.athene.nn.model.core.impl.Shape3DImpl <em>Shape3 D</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.athene.nn.model.core.impl.Shape3DImpl
		 * @see org.eclipse.athene.nn.model.core.impl.CorePackageImpl#getShape3D()
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
		 * The meta object literal for the '{@link org.eclipse.athene.nn.model.core.impl.IntegerDupleImpl <em>Integer Duple</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.athene.nn.model.core.impl.IntegerDupleImpl
		 * @see org.eclipse.athene.nn.model.core.impl.CorePackageImpl#getIntegerDuple()
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
		 * The meta object literal for the '{@link org.eclipse.athene.nn.model.core.impl.ActivationFunctionImpl <em>Activation Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.athene.nn.model.core.impl.ActivationFunctionImpl
		 * @see org.eclipse.athene.nn.model.core.impl.CorePackageImpl#getActivationFunction()
		 * @generated
		 */
		EClass ACTIVATION_FUNCTION = eINSTANCE.getActivationFunction();

		/**
		 * The meta object literal for the '{@link org.eclipse.athene.nn.model.core.impl.LossFunctionImpl <em>Loss Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.athene.nn.model.core.impl.LossFunctionImpl
		 * @see org.eclipse.athene.nn.model.core.impl.CorePackageImpl#getLossFunction()
		 * @generated
		 */
		EClass LOSS_FUNCTION = eINSTANCE.getLossFunction();

		/**
		 * The meta object literal for the '{@link org.eclipse.athene.nn.model.core.impl.InitializerFunctionImpl <em>Initializer Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.athene.nn.model.core.impl.InitializerFunctionImpl
		 * @see org.eclipse.athene.nn.model.core.impl.CorePackageImpl#getInitializerFunction()
		 * @generated
		 */
		EClass INITIALIZER_FUNCTION = eINSTANCE.getInitializerFunction();

		/**
		 * The meta object literal for the '{@link org.eclipse.athene.nn.model.core.impl.MathFunctionImpl <em>Math Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.athene.nn.model.core.impl.MathFunctionImpl
		 * @see org.eclipse.athene.nn.model.core.impl.CorePackageImpl#getMathFunction()
		 * @generated
		 */
		EClass MATH_FUNCTION = eINSTANCE.getMathFunction();

		/**
		 * The meta object literal for the '{@link org.eclipse.athene.nn.model.core.impl.MatmulFunctionImpl <em>Matmul Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.athene.nn.model.core.impl.MatmulFunctionImpl
		 * @see org.eclipse.athene.nn.model.core.impl.CorePackageImpl#getMatmulFunction()
		 * @generated
		 */
		EClass MATMUL_FUNCTION = eINSTANCE.getMatmulFunction();

		/**
		 * The meta object literal for the '{@link org.eclipse.athene.nn.model.core.impl.DotFunctionImpl <em>Dot Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.athene.nn.model.core.impl.DotFunctionImpl
		 * @see org.eclipse.athene.nn.model.core.impl.CorePackageImpl#getDotFunction()
		 * @generated
		 */
		EClass DOT_FUNCTION = eINSTANCE.getDotFunction();

		/**
		 * The meta object literal for the '{@link org.eclipse.athene.nn.model.core.Padding <em>Padding</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.athene.nn.model.core.Padding
		 * @see org.eclipse.athene.nn.model.core.impl.CorePackageImpl#getPadding()
		 * @generated
		 */
		EEnum PADDING = eINSTANCE.getPadding();

	}

} //CorePackage
