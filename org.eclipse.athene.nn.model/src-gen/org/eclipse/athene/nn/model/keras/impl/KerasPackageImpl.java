/**
 */
package org.eclipse.athene.nn.model.keras.impl;

import org.eclipse.athene.nn.model.core.CorePackage;

import org.eclipse.athene.nn.model.keras.Activation;
import org.eclipse.athene.nn.model.keras.ActivityRegularization;
import org.eclipse.athene.nn.model.keras.Backend;
import org.eclipse.athene.nn.model.keras.Dense;
import org.eclipse.athene.nn.model.keras.Dropout;
import org.eclipse.athene.nn.model.keras.Flatten;
import org.eclipse.athene.nn.model.keras.InputNode;
import org.eclipse.athene.nn.model.keras.KerasFactory;
import org.eclipse.athene.nn.model.keras.KerasPackage;
import org.eclipse.athene.nn.model.keras.Layer;
import org.eclipse.athene.nn.model.keras.Model;
import org.eclipse.athene.nn.model.keras.Node;
import org.eclipse.athene.nn.model.keras.OutputNode;
import org.eclipse.athene.nn.model.keras.Permute;
import org.eclipse.athene.nn.model.keras.RepeatVector;
import org.eclipse.athene.nn.model.keras.Reshape;
import org.eclipse.athene.nn.model.keras.Tensor;

import org.eclipse.athene.nn.model.tensorflow.TensorflowPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class KerasPackageImpl extends EPackageImpl implements KerasPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass layerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outputNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass backendEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass denseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dropoutEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reshapeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flattenEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass permuteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass repeatVectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityRegularizationEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.athene.nn.model.keras.KerasPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private KerasPackageImpl() {
		super(eNS_URI, KerasFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link KerasPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static KerasPackage init() {
		if (isInited) return (KerasPackage)EPackage.Registry.INSTANCE.getEPackage(KerasPackage.eNS_URI);

		// Obtain or create and register package
		KerasPackageImpl theKerasPackage = (KerasPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof KerasPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new KerasPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		CorePackage.eINSTANCE.eClass();
		EcorePackage.eINSTANCE.eClass();
		TensorflowPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theKerasPackage.createPackageContents();

		// Initialize created meta-data
		theKerasPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theKerasPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(KerasPackage.eNS_URI, theKerasPackage);
		return theKerasPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModel() {
		return modelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModel_KerasVersion() {
		return (EAttribute)modelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModel_Backend() {
		return (EReference)modelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLayer() {
		return layerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLayer_InputNodes() {
		return (EReference)layerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLayer_OutputNodes() {
		return (EReference)layerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLayer__GetOutput__int() {
		return layerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLayer__GetInput__int() {
		return layerEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNode() {
		return nodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNode_Shape() {
		return (EReference)nodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNode__RemoveFromLayer() {
		return nodeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInputNode() {
		return inputNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInputNode_Layer() {
		return (EReference)inputNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInputNode_InputTensor() {
		return (EReference)inputNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInputNode_ConnectedNode() {
		return (EReference)inputNodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInputNode__RemoveFromLayer() {
		return inputNodeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutputNode() {
		return outputNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutputNode_Layer() {
		return (EReference)outputNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutputNode_OutputTensor() {
		return (EReference)outputNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutputNode_ConnectedNode() {
		return (EReference)outputNodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOutputNode__RemoveFromLayer() {
		return outputNodeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOutputNode__ConnectToLayer__Layer() {
		return outputNodeEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTensor() {
		return tensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTensor_ContainerNode() {
		return (EReference)tensorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTensor_ConsumingNodes() {
		return (EReference)tensorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTensor__RemoveFromLayer() {
		return tensorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTensor__UnconnectFromTargetInput__InputNode() {
		return tensorEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBackend() {
		return backendEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBackend_Name() {
		return (EAttribute)backendEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDense() {
		return denseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDense_Units() {
		return (EAttribute)denseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDense_InputShape() {
		return (EReference)denseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDense_UseBias() {
		return (EAttribute)denseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDense_ActivationFunction() {
		return (EReference)denseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDense_WeightsInitializer() {
		return (EReference)denseEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDense_BiasInitializer() {
		return (EReference)denseEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDropout() {
		return dropoutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDropout_Rate() {
		return (EAttribute)dropoutEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDropout_NoiseShape() {
		return (EReference)dropoutEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDropout_Seed() {
		return (EAttribute)dropoutEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivation() {
		return activationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivation_ActivationFunction() {
		return (EReference)activationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivation_InputShape() {
		return (EReference)activationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReshape() {
		return reshapeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReshape_TargetShape() {
		return (EReference)reshapeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReshape_InputShape() {
		return (EReference)reshapeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReshape_OutputShape() {
		return (EReference)reshapeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFlatten() {
		return flattenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPermute() {
		return permuteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPermute_Dims() {
		return (EReference)permuteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPermute_InputShape() {
		return (EReference)permuteEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPermute_OutputShape() {
		return (EReference)permuteEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRepeatVector() {
		return repeatVectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRepeatVector_NumberOfRepeats() {
		return (EAttribute)repeatVectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepeatVector_InputShape() {
		return (EReference)repeatVectorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepeatVector_OutputShape() {
		return (EReference)repeatVectorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityRegularization() {
		return activityRegularizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivityRegularization_L1() {
		return (EAttribute)activityRegularizationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivityRegularization_L2() {
		return (EAttribute)activityRegularizationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityRegularization_InputShape() {
		return (EReference)activityRegularizationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KerasFactory getKerasFactory() {
		return (KerasFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		modelEClass = createEClass(MODEL);
		createEAttribute(modelEClass, MODEL__KERAS_VERSION);
		createEReference(modelEClass, MODEL__BACKEND);

		layerEClass = createEClass(LAYER);
		createEReference(layerEClass, LAYER__INPUT_NODES);
		createEReference(layerEClass, LAYER__OUTPUT_NODES);
		createEOperation(layerEClass, LAYER___GET_OUTPUT__INT);
		createEOperation(layerEClass, LAYER___GET_INPUT__INT);

		nodeEClass = createEClass(NODE);
		createEReference(nodeEClass, NODE__SHAPE);
		createEOperation(nodeEClass, NODE___REMOVE_FROM_LAYER);

		inputNodeEClass = createEClass(INPUT_NODE);
		createEReference(inputNodeEClass, INPUT_NODE__LAYER);
		createEReference(inputNodeEClass, INPUT_NODE__INPUT_TENSOR);
		createEReference(inputNodeEClass, INPUT_NODE__CONNECTED_NODE);
		createEOperation(inputNodeEClass, INPUT_NODE___REMOVE_FROM_LAYER);

		outputNodeEClass = createEClass(OUTPUT_NODE);
		createEReference(outputNodeEClass, OUTPUT_NODE__LAYER);
		createEReference(outputNodeEClass, OUTPUT_NODE__OUTPUT_TENSOR);
		createEReference(outputNodeEClass, OUTPUT_NODE__CONNECTED_NODE);
		createEOperation(outputNodeEClass, OUTPUT_NODE___REMOVE_FROM_LAYER);
		createEOperation(outputNodeEClass, OUTPUT_NODE___CONNECT_TO_LAYER__LAYER);

		tensorEClass = createEClass(TENSOR);
		createEReference(tensorEClass, TENSOR__CONTAINER_NODE);
		createEReference(tensorEClass, TENSOR__CONSUMING_NODES);
		createEOperation(tensorEClass, TENSOR___REMOVE_FROM_LAYER);
		createEOperation(tensorEClass, TENSOR___UNCONNECT_FROM_TARGET_INPUT__INPUTNODE);

		backendEClass = createEClass(BACKEND);
		createEAttribute(backendEClass, BACKEND__NAME);

		denseEClass = createEClass(DENSE);
		createEAttribute(denseEClass, DENSE__UNITS);
		createEReference(denseEClass, DENSE__INPUT_SHAPE);
		createEAttribute(denseEClass, DENSE__USE_BIAS);
		createEReference(denseEClass, DENSE__ACTIVATION_FUNCTION);
		createEReference(denseEClass, DENSE__WEIGHTS_INITIALIZER);
		createEReference(denseEClass, DENSE__BIAS_INITIALIZER);

		dropoutEClass = createEClass(DROPOUT);
		createEAttribute(dropoutEClass, DROPOUT__RATE);
		createEReference(dropoutEClass, DROPOUT__NOISE_SHAPE);
		createEAttribute(dropoutEClass, DROPOUT__SEED);

		activationEClass = createEClass(ACTIVATION);
		createEReference(activationEClass, ACTIVATION__ACTIVATION_FUNCTION);
		createEReference(activationEClass, ACTIVATION__INPUT_SHAPE);

		reshapeEClass = createEClass(RESHAPE);
		createEReference(reshapeEClass, RESHAPE__TARGET_SHAPE);
		createEReference(reshapeEClass, RESHAPE__INPUT_SHAPE);
		createEReference(reshapeEClass, RESHAPE__OUTPUT_SHAPE);

		flattenEClass = createEClass(FLATTEN);

		permuteEClass = createEClass(PERMUTE);
		createEReference(permuteEClass, PERMUTE__DIMS);
		createEReference(permuteEClass, PERMUTE__INPUT_SHAPE);
		createEReference(permuteEClass, PERMUTE__OUTPUT_SHAPE);

		repeatVectorEClass = createEClass(REPEAT_VECTOR);
		createEAttribute(repeatVectorEClass, REPEAT_VECTOR__NUMBER_OF_REPEATS);
		createEReference(repeatVectorEClass, REPEAT_VECTOR__INPUT_SHAPE);
		createEReference(repeatVectorEClass, REPEAT_VECTOR__OUTPUT_SHAPE);

		activityRegularizationEClass = createEClass(ACTIVITY_REGULARIZATION);
		createEAttribute(activityRegularizationEClass, ACTIVITY_REGULARIZATION__L1);
		createEAttribute(activityRegularizationEClass, ACTIVITY_REGULARIZATION__L2);
		createEReference(activityRegularizationEClass, ACTIVITY_REGULARIZATION__INPUT_SHAPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		CorePackage theCorePackage = (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		TensorflowPackage theTensorflowPackage = (TensorflowPackage)EPackage.Registry.INSTANCE.getEPackage(TensorflowPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		modelEClass.getESuperTypes().add(theCorePackage.getModel());
		layerEClass.getESuperTypes().add(theTensorflowPackage.getLayer());
		inputNodeEClass.getESuperTypes().add(this.getNode());
		outputNodeEClass.getESuperTypes().add(this.getNode());
		tensorEClass.getESuperTypes().add(theCorePackage.getTensor());
		denseEClass.getESuperTypes().add(this.getLayer());
		dropoutEClass.getESuperTypes().add(this.getLayer());
		activationEClass.getESuperTypes().add(this.getLayer());
		reshapeEClass.getESuperTypes().add(this.getLayer());
		flattenEClass.getESuperTypes().add(this.getLayer());
		permuteEClass.getESuperTypes().add(this.getLayer());
		repeatVectorEClass.getESuperTypes().add(this.getLayer());
		activityRegularizationEClass.getESuperTypes().add(this.getLayer());

		// Initialize classes, features, and operations; add parameters
		initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModel_KerasVersion(), theEcorePackage.getEString(), "kerasVersion", null, 0, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModel_Backend(), this.getBackend(), null, "backend", null, 0, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(layerEClass, Layer.class, "Layer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLayer_InputNodes(), this.getInputNode(), this.getInputNode_Layer(), "inputNodes", null, 0, -1, Layer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLayer_OutputNodes(), this.getOutputNode(), this.getOutputNode_Layer(), "outputNodes", null, 0, -1, Layer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getLayer__GetOutput__int(), this.getTensor(), "getOutput", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEInt(), "index", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getLayer__GetInput__int(), this.getTensor(), "getInput", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEInt(), "index", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(nodeEClass, Node.class, "Node", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNode_Shape(), theCorePackage.getShape(), null, "shape", null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getNode__RemoveFromLayer(), null, "removeFromLayer", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(inputNodeEClass, InputNode.class, "InputNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInputNode_Layer(), this.getLayer(), this.getLayer_InputNodes(), "layer", null, 0, 1, InputNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInputNode_InputTensor(), this.getTensor(), this.getTensor_ConsumingNodes(), "inputTensor", null, 0, 1, InputNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInputNode_ConnectedNode(), this.getOutputNode(), this.getOutputNode_ConnectedNode(), "connectedNode", null, 0, 1, InputNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getInputNode__RemoveFromLayer(), null, "removeFromLayer", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(outputNodeEClass, OutputNode.class, "OutputNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOutputNode_Layer(), this.getLayer(), this.getLayer_OutputNodes(), "layer", null, 0, 1, OutputNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOutputNode_OutputTensor(), this.getTensor(), this.getTensor_ContainerNode(), "outputTensor", null, 0, 1, OutputNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOutputNode_ConnectedNode(), this.getInputNode(), this.getInputNode_ConnectedNode(), "connectedNode", null, 0, 1, OutputNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getOutputNode__RemoveFromLayer(), null, "removeFromLayer", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getOutputNode__ConnectToLayer__Layer(), null, "connectToLayer", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getLayer(), "target", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(tensorEClass, Tensor.class, "Tensor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTensor_ContainerNode(), this.getOutputNode(), this.getOutputNode_OutputTensor(), "containerNode", null, 0, 1, Tensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTensor_ConsumingNodes(), this.getInputNode(), this.getInputNode_InputTensor(), "consumingNodes", null, 0, -1, Tensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getTensor__RemoveFromLayer(), null, "removeFromLayer", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTensor__UnconnectFromTargetInput__InputNode(), null, "unconnectFromTargetInput", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getInputNode(), "targetInputNode", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(backendEClass, Backend.class, "Backend", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBackend_Name(), theEcorePackage.getEString(), "name", null, 0, 1, Backend.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(denseEClass, Dense.class, "Dense", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDense_Units(), theEcorePackage.getEInt(), "units", null, 0, 1, Dense.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDense_InputShape(), theCorePackage.getShape(), null, "inputShape", null, 0, 1, Dense.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDense_UseBias(), theEcorePackage.getEBoolean(), "useBias", null, 0, 1, Dense.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDense_ActivationFunction(), theCorePackage.getActivationFunction(), null, "activationFunction", null, 0, 1, Dense.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDense_WeightsInitializer(), theCorePackage.getInitializerFunction(), null, "weightsInitializer", null, 0, 1, Dense.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDense_BiasInitializer(), theCorePackage.getInitializerFunction(), null, "biasInitializer", null, 0, 1, Dense.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dropoutEClass, Dropout.class, "Dropout", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDropout_Rate(), theEcorePackage.getEFloat(), "rate", null, 0, 1, Dropout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDropout_NoiseShape(), theCorePackage.getShape(), null, "noiseShape", null, 0, 1, Dropout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDropout_Seed(), theEcorePackage.getEInt(), "seed", null, 0, 1, Dropout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(activationEClass, Activation.class, "Activation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActivation_ActivationFunction(), theCorePackage.getActivationFunction(), null, "activationFunction", null, 0, 1, Activation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivation_InputShape(), theCorePackage.getShape(), null, "inputShape", null, 0, 1, Activation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(reshapeEClass, Reshape.class, "Reshape", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReshape_TargetShape(), theCorePackage.getShape(), null, "targetShape", null, 0, 1, Reshape.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReshape_InputShape(), theCorePackage.getShape(), null, "inputShape", null, 0, 1, Reshape.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReshape_OutputShape(), theCorePackage.getShape(), null, "outputShape", null, 0, 1, Reshape.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(flattenEClass, Flatten.class, "Flatten", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(permuteEClass, Permute.class, "Permute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPermute_Dims(), theCorePackage.getIntegerDuple(), null, "dims", null, 0, 1, Permute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPermute_InputShape(), theCorePackage.getShape(), null, "inputShape", null, 0, 1, Permute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPermute_OutputShape(), theCorePackage.getShape(), null, "outputShape", null, 0, 1, Permute.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(repeatVectorEClass, RepeatVector.class, "RepeatVector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRepeatVector_NumberOfRepeats(), theEcorePackage.getEInt(), "numberOfRepeats", null, 0, 1, RepeatVector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRepeatVector_InputShape(), theCorePackage.getShape2D(), null, "inputShape", null, 0, 1, RepeatVector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRepeatVector_OutputShape(), theCorePackage.getShape3D(), null, "outputShape", null, 0, 1, RepeatVector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(activityRegularizationEClass, ActivityRegularization.class, "ActivityRegularization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActivityRegularization_L1(), theEcorePackage.getEInt(), "l1", null, 0, 1, ActivityRegularization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActivityRegularization_L2(), theEcorePackage.getEInt(), "l2", null, 0, 1, ActivityRegularization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivityRegularization_InputShape(), theCorePackage.getShape2D(), null, "inputShape", null, 0, 1, ActivityRegularization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //KerasPackageImpl
