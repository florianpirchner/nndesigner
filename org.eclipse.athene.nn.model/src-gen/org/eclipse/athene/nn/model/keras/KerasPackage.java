/**
 */
package org.eclipse.athene.nn.model.keras;

import org.eclipse.athene.nn.model.core.CorePackage;

import org.eclipse.athene.nn.model.tensorflow.TensorflowPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
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
	 * The feature id for the '<em><b>Keras Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__KERAS_VERSION = CorePackage.MODEL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Backend</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__BACKEND = CorePackage.MODEL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = CorePackage.MODEL_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_OPERATION_COUNT = CorePackage.MODEL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.athene.nn.model.keras.impl.LayerImpl <em>Layer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.athene.nn.model.keras.impl.LayerImpl
	 * @see org.eclipse.athene.nn.model.keras.impl.KerasPackageImpl#getLayer()
	 * @generated
	 */
	int LAYER = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER__NAME = TensorflowPackage.LAYER__NAME;

	/**
	 * The feature id for the '<em><b>Trainable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER__TRAINABLE = TensorflowPackage.LAYER__TRAINABLE;

	/**
	 * The feature id for the '<em><b>Input Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER__INPUT_NODES = TensorflowPackage.LAYER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Output Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER__OUTPUT_NODES = TensorflowPackage.LAYER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_FEATURE_COUNT = TensorflowPackage.LAYER_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Output</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER___GET_OUTPUT__INT = TensorflowPackage.LAYER_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Input</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER___GET_INPUT__INT = TensorflowPackage.LAYER_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_OPERATION_COUNT = TensorflowPackage.LAYER_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.athene.nn.model.keras.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.athene.nn.model.keras.impl.NodeImpl
	 * @see org.eclipse.athene.nn.model.keras.impl.KerasPackageImpl#getNode()
	 * @generated
	 */
	int NODE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Shape</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__SHAPE = 1;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Remove From Layer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___REMOVE_FROM_LAYER = 0;

	/**
	 * The number of operations of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.athene.nn.model.keras.impl.InputNodeImpl <em>Input Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.athene.nn.model.keras.impl.InputNodeImpl
	 * @see org.eclipse.athene.nn.model.keras.impl.KerasPackageImpl#getInputNode()
	 * @generated
	 */
	int INPUT_NODE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_NODE__NAME = NODE__NAME;

	/**
	 * The feature id for the '<em><b>Shape</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_NODE__SHAPE = NODE__SHAPE;

	/**
	 * The feature id for the '<em><b>Layer</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_NODE__LAYER = NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input Tensor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_NODE__INPUT_TENSOR = NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Connected Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_NODE__CONNECTED_NODE = NODE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Input Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_NODE_FEATURE_COUNT = NODE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Remove From Layer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_NODE___REMOVE_FROM_LAYER = NODE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Auto Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_NODE___AUTO_NAME = NODE_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Input Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_NODE_OPERATION_COUNT = NODE_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.athene.nn.model.keras.impl.OutputNodeImpl <em>Output Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.athene.nn.model.keras.impl.OutputNodeImpl
	 * @see org.eclipse.athene.nn.model.keras.impl.KerasPackageImpl#getOutputNode()
	 * @generated
	 */
	int OUTPUT_NODE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_NODE__NAME = NODE__NAME;

	/**
	 * The feature id for the '<em><b>Shape</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_NODE__SHAPE = NODE__SHAPE;

	/**
	 * The feature id for the '<em><b>Layer</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_NODE__LAYER = NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Output Tensor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_NODE__OUTPUT_TENSOR = NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Connected Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_NODE__CONNECTED_NODE = NODE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Output Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_NODE_FEATURE_COUNT = NODE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Auto Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_NODE___AUTO_NAME = NODE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Remove From Layer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_NODE___REMOVE_FROM_LAYER = NODE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Connect To Input Layer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_NODE___CONNECT_TO_INPUT_LAYER__LAYER = NODE_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Output Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_NODE_OPERATION_COUNT = NODE_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.athene.nn.model.keras.impl.TensorImpl <em>Tensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.athene.nn.model.keras.impl.TensorImpl
	 * @see org.eclipse.athene.nn.model.keras.impl.KerasPackageImpl#getTensor()
	 * @generated
	 */
	int TENSOR = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENSOR__NAME = CorePackage.TENSOR__NAME;

	/**
	 * The feature id for the '<em><b>Container Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENSOR__CONTAINER_NODE = CorePackage.TENSOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Consuming Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENSOR__CONSUMING_NODES = CorePackage.TENSOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Tensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENSOR_FEATURE_COUNT = CorePackage.TENSOR_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Remove From Layer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENSOR___REMOVE_FROM_LAYER = CorePackage.TENSOR_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Auto Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENSOR___AUTO_NAME = CorePackage.TENSOR_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Unconnect From Target Input</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENSOR___UNCONNECT_FROM_TARGET_INPUT__INPUTNODE = CorePackage.TENSOR_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Tensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENSOR_OPERATION_COUNT = CorePackage.TENSOR_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.athene.nn.model.keras.impl.BackendImpl <em>Backend</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.athene.nn.model.keras.impl.BackendImpl
	 * @see org.eclipse.athene.nn.model.keras.impl.KerasPackageImpl#getBackend()
	 * @generated
	 */
	int BACKEND = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKEND__NAME = 0;

	/**
	 * The number of structural features of the '<em>Backend</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKEND_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Backend</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKEND_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.athene.nn.model.keras.impl.InputImpl <em>Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.athene.nn.model.keras.impl.InputImpl
	 * @see org.eclipse.athene.nn.model.keras.impl.KerasPackageImpl#getInput()
	 * @generated
	 */
	int INPUT = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__NAME = LAYER__NAME;

	/**
	 * The feature id for the '<em><b>Trainable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__TRAINABLE = LAYER__TRAINABLE;

	/**
	 * The feature id for the '<em><b>Input Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__INPUT_NODES = LAYER__INPUT_NODES;

	/**
	 * The feature id for the '<em><b>Output Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__OUTPUT_NODES = LAYER__OUTPUT_NODES;

	/**
	 * The number of structural features of the '<em>Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_FEATURE_COUNT = LAYER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Output</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT___GET_OUTPUT__INT = LAYER___GET_OUTPUT__INT;

	/**
	 * The operation id for the '<em>Get Input</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT___GET_INPUT__INT = LAYER___GET_INPUT__INT;

	/**
	 * The number of operations of the '<em>Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_OPERATION_COUNT = LAYER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.athene.nn.model.keras.impl.DenseImpl <em>Dense</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.athene.nn.model.keras.impl.DenseImpl
	 * @see org.eclipse.athene.nn.model.keras.impl.KerasPackageImpl#getDense()
	 * @generated
	 */
	int DENSE = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENSE__NAME = LAYER__NAME;

	/**
	 * The feature id for the '<em><b>Trainable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENSE__TRAINABLE = LAYER__TRAINABLE;

	/**
	 * The feature id for the '<em><b>Input Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENSE__INPUT_NODES = LAYER__INPUT_NODES;

	/**
	 * The feature id for the '<em><b>Output Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENSE__OUTPUT_NODES = LAYER__OUTPUT_NODES;

	/**
	 * The feature id for the '<em><b>Units</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENSE__UNITS = LAYER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input Shape</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENSE__INPUT_SHAPE = LAYER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Use Bias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENSE__USE_BIAS = LAYER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Activation Function</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENSE__ACTIVATION_FUNCTION = LAYER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Weights Initializer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENSE__WEIGHTS_INITIALIZER = LAYER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Bias Initializer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENSE__BIAS_INITIALIZER = LAYER_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Dense</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENSE_FEATURE_COUNT = LAYER_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Get Output</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENSE___GET_OUTPUT__INT = LAYER___GET_OUTPUT__INT;

	/**
	 * The operation id for the '<em>Get Input</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENSE___GET_INPUT__INT = LAYER___GET_INPUT__INT;

	/**
	 * The number of operations of the '<em>Dense</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENSE_OPERATION_COUNT = LAYER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.athene.nn.model.keras.impl.DropoutImpl <em>Dropout</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.athene.nn.model.keras.impl.DropoutImpl
	 * @see org.eclipse.athene.nn.model.keras.impl.KerasPackageImpl#getDropout()
	 * @generated
	 */
	int DROPOUT = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPOUT__NAME = LAYER__NAME;

	/**
	 * The feature id for the '<em><b>Trainable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPOUT__TRAINABLE = LAYER__TRAINABLE;

	/**
	 * The feature id for the '<em><b>Input Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPOUT__INPUT_NODES = LAYER__INPUT_NODES;

	/**
	 * The feature id for the '<em><b>Output Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPOUT__OUTPUT_NODES = LAYER__OUTPUT_NODES;

	/**
	 * The feature id for the '<em><b>Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPOUT__RATE = LAYER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Noise Shape</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPOUT__NOISE_SHAPE = LAYER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Seed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPOUT__SEED = LAYER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Dropout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPOUT_FEATURE_COUNT = LAYER_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Output</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPOUT___GET_OUTPUT__INT = LAYER___GET_OUTPUT__INT;

	/**
	 * The operation id for the '<em>Get Input</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPOUT___GET_INPUT__INT = LAYER___GET_INPUT__INT;

	/**
	 * The number of operations of the '<em>Dropout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPOUT_OPERATION_COUNT = LAYER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.athene.nn.model.keras.impl.ActivationImpl <em>Activation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.athene.nn.model.keras.impl.ActivationImpl
	 * @see org.eclipse.athene.nn.model.keras.impl.KerasPackageImpl#getActivation()
	 * @generated
	 */
	int ACTIVATION = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVATION__NAME = LAYER__NAME;

	/**
	 * The feature id for the '<em><b>Trainable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVATION__TRAINABLE = LAYER__TRAINABLE;

	/**
	 * The feature id for the '<em><b>Input Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVATION__INPUT_NODES = LAYER__INPUT_NODES;

	/**
	 * The feature id for the '<em><b>Output Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVATION__OUTPUT_NODES = LAYER__OUTPUT_NODES;

	/**
	 * The feature id for the '<em><b>Activation Function</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVATION__ACTIVATION_FUNCTION = LAYER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input Shape</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVATION__INPUT_SHAPE = LAYER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Activation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVATION_FEATURE_COUNT = LAYER_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Output</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVATION___GET_OUTPUT__INT = LAYER___GET_OUTPUT__INT;

	/**
	 * The operation id for the '<em>Get Input</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVATION___GET_INPUT__INT = LAYER___GET_INPUT__INT;

	/**
	 * The number of operations of the '<em>Activation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVATION_OPERATION_COUNT = LAYER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.athene.nn.model.keras.impl.ReshapeImpl <em>Reshape</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.athene.nn.model.keras.impl.ReshapeImpl
	 * @see org.eclipse.athene.nn.model.keras.impl.KerasPackageImpl#getReshape()
	 * @generated
	 */
	int RESHAPE = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESHAPE__NAME = LAYER__NAME;

	/**
	 * The feature id for the '<em><b>Trainable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESHAPE__TRAINABLE = LAYER__TRAINABLE;

	/**
	 * The feature id for the '<em><b>Input Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESHAPE__INPUT_NODES = LAYER__INPUT_NODES;

	/**
	 * The feature id for the '<em><b>Output Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESHAPE__OUTPUT_NODES = LAYER__OUTPUT_NODES;

	/**
	 * The feature id for the '<em><b>Target Shape</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESHAPE__TARGET_SHAPE = LAYER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input Shape</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESHAPE__INPUT_SHAPE = LAYER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Output Shape</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESHAPE__OUTPUT_SHAPE = LAYER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Reshape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESHAPE_FEATURE_COUNT = LAYER_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Output</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESHAPE___GET_OUTPUT__INT = LAYER___GET_OUTPUT__INT;

	/**
	 * The operation id for the '<em>Get Input</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESHAPE___GET_INPUT__INT = LAYER___GET_INPUT__INT;

	/**
	 * The number of operations of the '<em>Reshape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESHAPE_OPERATION_COUNT = LAYER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.athene.nn.model.keras.impl.FlattenImpl <em>Flatten</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.athene.nn.model.keras.impl.FlattenImpl
	 * @see org.eclipse.athene.nn.model.keras.impl.KerasPackageImpl#getFlatten()
	 * @generated
	 */
	int FLATTEN = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLATTEN__NAME = LAYER__NAME;

	/**
	 * The feature id for the '<em><b>Trainable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLATTEN__TRAINABLE = LAYER__TRAINABLE;

	/**
	 * The feature id for the '<em><b>Input Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLATTEN__INPUT_NODES = LAYER__INPUT_NODES;

	/**
	 * The feature id for the '<em><b>Output Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLATTEN__OUTPUT_NODES = LAYER__OUTPUT_NODES;

	/**
	 * The number of structural features of the '<em>Flatten</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLATTEN_FEATURE_COUNT = LAYER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Output</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLATTEN___GET_OUTPUT__INT = LAYER___GET_OUTPUT__INT;

	/**
	 * The operation id for the '<em>Get Input</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLATTEN___GET_INPUT__INT = LAYER___GET_INPUT__INT;

	/**
	 * The number of operations of the '<em>Flatten</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLATTEN_OPERATION_COUNT = LAYER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.athene.nn.model.keras.impl.PermuteImpl <em>Permute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.athene.nn.model.keras.impl.PermuteImpl
	 * @see org.eclipse.athene.nn.model.keras.impl.KerasPackageImpl#getPermute()
	 * @generated
	 */
	int PERMUTE = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMUTE__NAME = LAYER__NAME;

	/**
	 * The feature id for the '<em><b>Trainable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMUTE__TRAINABLE = LAYER__TRAINABLE;

	/**
	 * The feature id for the '<em><b>Input Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMUTE__INPUT_NODES = LAYER__INPUT_NODES;

	/**
	 * The feature id for the '<em><b>Output Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMUTE__OUTPUT_NODES = LAYER__OUTPUT_NODES;

	/**
	 * The feature id for the '<em><b>Dims</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMUTE__DIMS = LAYER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input Shape</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMUTE__INPUT_SHAPE = LAYER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Output Shape</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMUTE__OUTPUT_SHAPE = LAYER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Permute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMUTE_FEATURE_COUNT = LAYER_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Output</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMUTE___GET_OUTPUT__INT = LAYER___GET_OUTPUT__INT;

	/**
	 * The operation id for the '<em>Get Input</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMUTE___GET_INPUT__INT = LAYER___GET_INPUT__INT;

	/**
	 * The number of operations of the '<em>Permute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMUTE_OPERATION_COUNT = LAYER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.athene.nn.model.keras.impl.RepeatVectorImpl <em>Repeat Vector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.athene.nn.model.keras.impl.RepeatVectorImpl
	 * @see org.eclipse.athene.nn.model.keras.impl.KerasPackageImpl#getRepeatVector()
	 * @generated
	 */
	int REPEAT_VECTOR = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_VECTOR__NAME = LAYER__NAME;

	/**
	 * The feature id for the '<em><b>Trainable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_VECTOR__TRAINABLE = LAYER__TRAINABLE;

	/**
	 * The feature id for the '<em><b>Input Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_VECTOR__INPUT_NODES = LAYER__INPUT_NODES;

	/**
	 * The feature id for the '<em><b>Output Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_VECTOR__OUTPUT_NODES = LAYER__OUTPUT_NODES;

	/**
	 * The feature id for the '<em><b>Number Of Repeats</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_VECTOR__NUMBER_OF_REPEATS = LAYER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input Shape</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_VECTOR__INPUT_SHAPE = LAYER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Output Shape</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_VECTOR__OUTPUT_SHAPE = LAYER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Repeat Vector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_VECTOR_FEATURE_COUNT = LAYER_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Output</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_VECTOR___GET_OUTPUT__INT = LAYER___GET_OUTPUT__INT;

	/**
	 * The operation id for the '<em>Get Input</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_VECTOR___GET_INPUT__INT = LAYER___GET_INPUT__INT;

	/**
	 * The number of operations of the '<em>Repeat Vector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_VECTOR_OPERATION_COUNT = LAYER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.athene.nn.model.keras.impl.ActivityRegularizationImpl <em>Activity Regularization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.athene.nn.model.keras.impl.ActivityRegularizationImpl
	 * @see org.eclipse.athene.nn.model.keras.impl.KerasPackageImpl#getActivityRegularization()
	 * @generated
	 */
	int ACTIVITY_REGULARIZATION = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_REGULARIZATION__NAME = LAYER__NAME;

	/**
	 * The feature id for the '<em><b>Trainable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_REGULARIZATION__TRAINABLE = LAYER__TRAINABLE;

	/**
	 * The feature id for the '<em><b>Input Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_REGULARIZATION__INPUT_NODES = LAYER__INPUT_NODES;

	/**
	 * The feature id for the '<em><b>Output Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_REGULARIZATION__OUTPUT_NODES = LAYER__OUTPUT_NODES;

	/**
	 * The feature id for the '<em><b>L1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_REGULARIZATION__L1 = LAYER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>L2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_REGULARIZATION__L2 = LAYER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Input Shape</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_REGULARIZATION__INPUT_SHAPE = LAYER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Activity Regularization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_REGULARIZATION_FEATURE_COUNT = LAYER_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Output</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_REGULARIZATION___GET_OUTPUT__INT = LAYER___GET_OUTPUT__INT;

	/**
	 * The operation id for the '<em>Get Input</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_REGULARIZATION___GET_INPUT__INT = LAYER___GET_INPUT__INT;

	/**
	 * The number of operations of the '<em>Activity Regularization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_REGULARIZATION_OPERATION_COUNT = LAYER_OPERATION_COUNT + 0;


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
	 * Returns the meta object for the attribute '{@link org.eclipse.athene.nn.model.keras.Model#getKerasVersion <em>Keras Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Keras Version</em>'.
	 * @see org.eclipse.athene.nn.model.keras.Model#getKerasVersion()
	 * @see #getModel()
	 * @generated
	 */
	EAttribute getModel_KerasVersion();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.athene.nn.model.keras.Model#getBackend <em>Backend</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Backend</em>'.
	 * @see org.eclipse.athene.nn.model.keras.Model#getBackend()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Backend();

	/**
	 * Returns the meta object for class '{@link org.eclipse.athene.nn.model.keras.Layer <em>Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Layer</em>'.
	 * @see org.eclipse.athene.nn.model.keras.Layer
	 * @generated
	 */
	EClass getLayer();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.athene.nn.model.keras.Layer#getInputNodes <em>Input Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Input Nodes</em>'.
	 * @see org.eclipse.athene.nn.model.keras.Layer#getInputNodes()
	 * @see #getLayer()
	 * @generated
	 */
	EReference getLayer_InputNodes();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.athene.nn.model.keras.Layer#getOutputNodes <em>Output Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Output Nodes</em>'.
	 * @see org.eclipse.athene.nn.model.keras.Layer#getOutputNodes()
	 * @see #getLayer()
	 * @generated
	 */
	EReference getLayer_OutputNodes();

	/**
	 * Returns the meta object for the '{@link org.eclipse.athene.nn.model.keras.Layer#getOutput(int) <em>Get Output</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Output</em>' operation.
	 * @see org.eclipse.athene.nn.model.keras.Layer#getOutput(int)
	 * @generated
	 */
	EOperation getLayer__GetOutput__int();

	/**
	 * Returns the meta object for the '{@link org.eclipse.athene.nn.model.keras.Layer#getInput(int) <em>Get Input</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Input</em>' operation.
	 * @see org.eclipse.athene.nn.model.keras.Layer#getInput(int)
	 * @generated
	 */
	EOperation getLayer__GetInput__int();

	/**
	 * Returns the meta object for class '{@link org.eclipse.athene.nn.model.keras.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see org.eclipse.athene.nn.model.keras.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.athene.nn.model.keras.Node#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.athene.nn.model.keras.Node#getName()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Name();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.athene.nn.model.keras.Node#getShape <em>Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Shape</em>'.
	 * @see org.eclipse.athene.nn.model.keras.Node#getShape()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Shape();

	/**
	 * Returns the meta object for the '{@link org.eclipse.athene.nn.model.keras.Node#removeFromLayer() <em>Remove From Layer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove From Layer</em>' operation.
	 * @see org.eclipse.athene.nn.model.keras.Node#removeFromLayer()
	 * @generated
	 */
	EOperation getNode__RemoveFromLayer();

	/**
	 * Returns the meta object for class '{@link org.eclipse.athene.nn.model.keras.InputNode <em>Input Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Node</em>'.
	 * @see org.eclipse.athene.nn.model.keras.InputNode
	 * @generated
	 */
	EClass getInputNode();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.athene.nn.model.keras.InputNode#getLayer <em>Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Layer</em>'.
	 * @see org.eclipse.athene.nn.model.keras.InputNode#getLayer()
	 * @see #getInputNode()
	 * @generated
	 */
	EReference getInputNode_Layer();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.athene.nn.model.keras.InputNode#getInputTensor <em>Input Tensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input Tensor</em>'.
	 * @see org.eclipse.athene.nn.model.keras.InputNode#getInputTensor()
	 * @see #getInputNode()
	 * @generated
	 */
	EReference getInputNode_InputTensor();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.athene.nn.model.keras.InputNode#getConnectedNode <em>Connected Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Connected Node</em>'.
	 * @see org.eclipse.athene.nn.model.keras.InputNode#getConnectedNode()
	 * @see #getInputNode()
	 * @generated
	 */
	EReference getInputNode_ConnectedNode();

	/**
	 * Returns the meta object for the '{@link org.eclipse.athene.nn.model.keras.InputNode#removeFromLayer() <em>Remove From Layer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove From Layer</em>' operation.
	 * @see org.eclipse.athene.nn.model.keras.InputNode#removeFromLayer()
	 * @generated
	 */
	EOperation getInputNode__RemoveFromLayer();

	/**
	 * Returns the meta object for the '{@link org.eclipse.athene.nn.model.keras.InputNode#autoName() <em>Auto Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Auto Name</em>' operation.
	 * @see org.eclipse.athene.nn.model.keras.InputNode#autoName()
	 * @generated
	 */
	EOperation getInputNode__AutoName();

	/**
	 * Returns the meta object for class '{@link org.eclipse.athene.nn.model.keras.OutputNode <em>Output Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Node</em>'.
	 * @see org.eclipse.athene.nn.model.keras.OutputNode
	 * @generated
	 */
	EClass getOutputNode();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.athene.nn.model.keras.OutputNode#getLayer <em>Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Layer</em>'.
	 * @see org.eclipse.athene.nn.model.keras.OutputNode#getLayer()
	 * @see #getOutputNode()
	 * @generated
	 */
	EReference getOutputNode_Layer();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.athene.nn.model.keras.OutputNode#getOutputTensor <em>Output Tensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Output Tensor</em>'.
	 * @see org.eclipse.athene.nn.model.keras.OutputNode#getOutputTensor()
	 * @see #getOutputNode()
	 * @generated
	 */
	EReference getOutputNode_OutputTensor();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.athene.nn.model.keras.OutputNode#getConnectedNode <em>Connected Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Connected Node</em>'.
	 * @see org.eclipse.athene.nn.model.keras.OutputNode#getConnectedNode()
	 * @see #getOutputNode()
	 * @generated
	 */
	EReference getOutputNode_ConnectedNode();

	/**
	 * Returns the meta object for the '{@link org.eclipse.athene.nn.model.keras.OutputNode#autoName() <em>Auto Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Auto Name</em>' operation.
	 * @see org.eclipse.athene.nn.model.keras.OutputNode#autoName()
	 * @generated
	 */
	EOperation getOutputNode__AutoName();

	/**
	 * Returns the meta object for the '{@link org.eclipse.athene.nn.model.keras.OutputNode#removeFromLayer() <em>Remove From Layer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove From Layer</em>' operation.
	 * @see org.eclipse.athene.nn.model.keras.OutputNode#removeFromLayer()
	 * @generated
	 */
	EOperation getOutputNode__RemoveFromLayer();

	/**
	 * Returns the meta object for the '{@link org.eclipse.athene.nn.model.keras.OutputNode#connectToInputLayer(org.eclipse.athene.nn.model.keras.Layer) <em>Connect To Input Layer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Connect To Input Layer</em>' operation.
	 * @see org.eclipse.athene.nn.model.keras.OutputNode#connectToInputLayer(org.eclipse.athene.nn.model.keras.Layer)
	 * @generated
	 */
	EOperation getOutputNode__ConnectToInputLayer__Layer();

	/**
	 * Returns the meta object for class '{@link org.eclipse.athene.nn.model.keras.Tensor <em>Tensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tensor</em>'.
	 * @see org.eclipse.athene.nn.model.keras.Tensor
	 * @generated
	 */
	EClass getTensor();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.athene.nn.model.keras.Tensor#getContainerNode <em>Container Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Container Node</em>'.
	 * @see org.eclipse.athene.nn.model.keras.Tensor#getContainerNode()
	 * @see #getTensor()
	 * @generated
	 */
	EReference getTensor_ContainerNode();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.athene.nn.model.keras.Tensor#getConsumingNodes <em>Consuming Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Consuming Nodes</em>'.
	 * @see org.eclipse.athene.nn.model.keras.Tensor#getConsumingNodes()
	 * @see #getTensor()
	 * @generated
	 */
	EReference getTensor_ConsumingNodes();

	/**
	 * Returns the meta object for the '{@link org.eclipse.athene.nn.model.keras.Tensor#removeFromLayer() <em>Remove From Layer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove From Layer</em>' operation.
	 * @see org.eclipse.athene.nn.model.keras.Tensor#removeFromLayer()
	 * @generated
	 */
	EOperation getTensor__RemoveFromLayer();

	/**
	 * Returns the meta object for the '{@link org.eclipse.athene.nn.model.keras.Tensor#autoName() <em>Auto Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Auto Name</em>' operation.
	 * @see org.eclipse.athene.nn.model.keras.Tensor#autoName()
	 * @generated
	 */
	EOperation getTensor__AutoName();

	/**
	 * Returns the meta object for the '{@link org.eclipse.athene.nn.model.keras.Tensor#unconnectFromTargetInput(org.eclipse.athene.nn.model.keras.InputNode) <em>Unconnect From Target Input</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Unconnect From Target Input</em>' operation.
	 * @see org.eclipse.athene.nn.model.keras.Tensor#unconnectFromTargetInput(org.eclipse.athene.nn.model.keras.InputNode)
	 * @generated
	 */
	EOperation getTensor__UnconnectFromTargetInput__InputNode();

	/**
	 * Returns the meta object for class '{@link org.eclipse.athene.nn.model.keras.Backend <em>Backend</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Backend</em>'.
	 * @see org.eclipse.athene.nn.model.keras.Backend
	 * @generated
	 */
	EClass getBackend();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.athene.nn.model.keras.Backend#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.athene.nn.model.keras.Backend#getName()
	 * @see #getBackend()
	 * @generated
	 */
	EAttribute getBackend_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.athene.nn.model.keras.Input <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input</em>'.
	 * @see org.eclipse.athene.nn.model.keras.Input
	 * @generated
	 */
	EClass getInput();

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
	 * Returns the meta object for the attribute '{@link org.eclipse.athene.nn.model.keras.Dense#getUnits <em>Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Units</em>'.
	 * @see org.eclipse.athene.nn.model.keras.Dense#getUnits()
	 * @see #getDense()
	 * @generated
	 */
	EAttribute getDense_Units();

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
		 * The meta object literal for the '<em><b>Keras Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL__KERAS_VERSION = eINSTANCE.getModel_KerasVersion();

		/**
		 * The meta object literal for the '<em><b>Backend</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__BACKEND = eINSTANCE.getModel_Backend();

		/**
		 * The meta object literal for the '{@link org.eclipse.athene.nn.model.keras.impl.LayerImpl <em>Layer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.athene.nn.model.keras.impl.LayerImpl
		 * @see org.eclipse.athene.nn.model.keras.impl.KerasPackageImpl#getLayer()
		 * @generated
		 */
		EClass LAYER = eINSTANCE.getLayer();

		/**
		 * The meta object literal for the '<em><b>Input Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAYER__INPUT_NODES = eINSTANCE.getLayer_InputNodes();

		/**
		 * The meta object literal for the '<em><b>Output Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAYER__OUTPUT_NODES = eINSTANCE.getLayer_OutputNodes();

		/**
		 * The meta object literal for the '<em><b>Get Output</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LAYER___GET_OUTPUT__INT = eINSTANCE.getLayer__GetOutput__int();

		/**
		 * The meta object literal for the '<em><b>Get Input</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LAYER___GET_INPUT__INT = eINSTANCE.getLayer__GetInput__int();

		/**
		 * The meta object literal for the '{@link org.eclipse.athene.nn.model.keras.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.athene.nn.model.keras.impl.NodeImpl
		 * @see org.eclipse.athene.nn.model.keras.impl.KerasPackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__NAME = eINSTANCE.getNode_Name();

		/**
		 * The meta object literal for the '<em><b>Shape</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__SHAPE = eINSTANCE.getNode_Shape();

		/**
		 * The meta object literal for the '<em><b>Remove From Layer</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NODE___REMOVE_FROM_LAYER = eINSTANCE.getNode__RemoveFromLayer();

		/**
		 * The meta object literal for the '{@link org.eclipse.athene.nn.model.keras.impl.InputNodeImpl <em>Input Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.athene.nn.model.keras.impl.InputNodeImpl
		 * @see org.eclipse.athene.nn.model.keras.impl.KerasPackageImpl#getInputNode()
		 * @generated
		 */
		EClass INPUT_NODE = eINSTANCE.getInputNode();

		/**
		 * The meta object literal for the '<em><b>Layer</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_NODE__LAYER = eINSTANCE.getInputNode_Layer();

		/**
		 * The meta object literal for the '<em><b>Input Tensor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_NODE__INPUT_TENSOR = eINSTANCE.getInputNode_InputTensor();

		/**
		 * The meta object literal for the '<em><b>Connected Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_NODE__CONNECTED_NODE = eINSTANCE.getInputNode_ConnectedNode();

		/**
		 * The meta object literal for the '<em><b>Remove From Layer</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INPUT_NODE___REMOVE_FROM_LAYER = eINSTANCE.getInputNode__RemoveFromLayer();

		/**
		 * The meta object literal for the '<em><b>Auto Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INPUT_NODE___AUTO_NAME = eINSTANCE.getInputNode__AutoName();

		/**
		 * The meta object literal for the '{@link org.eclipse.athene.nn.model.keras.impl.OutputNodeImpl <em>Output Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.athene.nn.model.keras.impl.OutputNodeImpl
		 * @see org.eclipse.athene.nn.model.keras.impl.KerasPackageImpl#getOutputNode()
		 * @generated
		 */
		EClass OUTPUT_NODE = eINSTANCE.getOutputNode();

		/**
		 * The meta object literal for the '<em><b>Layer</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT_NODE__LAYER = eINSTANCE.getOutputNode_Layer();

		/**
		 * The meta object literal for the '<em><b>Output Tensor</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT_NODE__OUTPUT_TENSOR = eINSTANCE.getOutputNode_OutputTensor();

		/**
		 * The meta object literal for the '<em><b>Connected Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT_NODE__CONNECTED_NODE = eINSTANCE.getOutputNode_ConnectedNode();

		/**
		 * The meta object literal for the '<em><b>Auto Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OUTPUT_NODE___AUTO_NAME = eINSTANCE.getOutputNode__AutoName();

		/**
		 * The meta object literal for the '<em><b>Remove From Layer</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OUTPUT_NODE___REMOVE_FROM_LAYER = eINSTANCE.getOutputNode__RemoveFromLayer();

		/**
		 * The meta object literal for the '<em><b>Connect To Input Layer</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OUTPUT_NODE___CONNECT_TO_INPUT_LAYER__LAYER = eINSTANCE.getOutputNode__ConnectToInputLayer__Layer();

		/**
		 * The meta object literal for the '{@link org.eclipse.athene.nn.model.keras.impl.TensorImpl <em>Tensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.athene.nn.model.keras.impl.TensorImpl
		 * @see org.eclipse.athene.nn.model.keras.impl.KerasPackageImpl#getTensor()
		 * @generated
		 */
		EClass TENSOR = eINSTANCE.getTensor();

		/**
		 * The meta object literal for the '<em><b>Container Node</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TENSOR__CONTAINER_NODE = eINSTANCE.getTensor_ContainerNode();

		/**
		 * The meta object literal for the '<em><b>Consuming Nodes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TENSOR__CONSUMING_NODES = eINSTANCE.getTensor_ConsumingNodes();

		/**
		 * The meta object literal for the '<em><b>Remove From Layer</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TENSOR___REMOVE_FROM_LAYER = eINSTANCE.getTensor__RemoveFromLayer();

		/**
		 * The meta object literal for the '<em><b>Auto Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TENSOR___AUTO_NAME = eINSTANCE.getTensor__AutoName();

		/**
		 * The meta object literal for the '<em><b>Unconnect From Target Input</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TENSOR___UNCONNECT_FROM_TARGET_INPUT__INPUTNODE = eINSTANCE.getTensor__UnconnectFromTargetInput__InputNode();

		/**
		 * The meta object literal for the '{@link org.eclipse.athene.nn.model.keras.impl.BackendImpl <em>Backend</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.athene.nn.model.keras.impl.BackendImpl
		 * @see org.eclipse.athene.nn.model.keras.impl.KerasPackageImpl#getBackend()
		 * @generated
		 */
		EClass BACKEND = eINSTANCE.getBackend();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BACKEND__NAME = eINSTANCE.getBackend_Name();

		/**
		 * The meta object literal for the '{@link org.eclipse.athene.nn.model.keras.impl.InputImpl <em>Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.athene.nn.model.keras.impl.InputImpl
		 * @see org.eclipse.athene.nn.model.keras.impl.KerasPackageImpl#getInput()
		 * @generated
		 */
		EClass INPUT = eINSTANCE.getInput();

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
		 * The meta object literal for the '<em><b>Units</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DENSE__UNITS = eINSTANCE.getDense_Units();

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
