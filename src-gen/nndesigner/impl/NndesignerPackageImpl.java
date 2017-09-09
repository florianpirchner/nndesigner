/**
 */
package nndesigner.impl;

import nndesigner.ActivationFunction;
import nndesigner.Design;
import nndesigner.DotFunction;
import nndesigner.Element;
import nndesigner.Function;
import nndesigner.InitializerFunction;
import nndesigner.InputSource;
import nndesigner.KerasDenseLayer;
import nndesigner.KerasDropout;
import nndesigner.KerasReshape;
import nndesigner.Layer;
import nndesigner.LossFunction;
import nndesigner.MathFunction;
import nndesigner.MatmulFunction;
import nndesigner.NndesignerFactory;
import nndesigner.NndesignerPackage;
import nndesigner.Padding;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
public class NndesignerPackageImpl extends EPackageImpl implements NndesignerPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass designEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputSourceEClass = null;

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
	private EClass functionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass kerasDenseLayerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass kerasDropoutEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass kerasReshapeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activationFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lossFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass initializerFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mathFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass matmulFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dotFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum paddingEEnum = null;

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
	 * @see nndesigner.NndesignerPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private NndesignerPackageImpl() {
		super(eNS_URI, NndesignerFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link NndesignerPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static NndesignerPackage init() {
		if (isInited) return (NndesignerPackage)EPackage.Registry.INSTANCE.getEPackage(NndesignerPackage.eNS_URI);

		// Obtain or create and register package
		NndesignerPackageImpl theNndesignerPackage = (NndesignerPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof NndesignerPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new NndesignerPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theNndesignerPackage.createPackageContents();

		// Initialize created meta-data
		theNndesignerPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theNndesignerPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(NndesignerPackage.eNS_URI, theNndesignerPackage);
		return theNndesignerPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDesign() {
		return designEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDesign_Elements() {
		return (EReference)designEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElement() {
		return elementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInputSource() {
		return inputSourceEClass;
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
	public EReference getLayer_InputSource() {
		return (EReference)layerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLayer_TargetLayers() {
		return (EReference)layerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunction() {
		return functionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKerasDenseLayer() {
		return kerasDenseLayerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKerasDenseLayer_NumberOfOutputUnits() {
		return (EAttribute)kerasDenseLayerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKerasDenseLayer_InputShape() {
		return (EAttribute)kerasDenseLayerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKerasDenseLayer_UseBias() {
		return (EAttribute)kerasDenseLayerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKerasDenseLayer_ActivationFunction() {
		return (EReference)kerasDenseLayerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKerasDenseLayer_WeightsInitializer() {
		return (EReference)kerasDenseLayerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKerasDenseLayer_BiasInitializer() {
		return (EReference)kerasDenseLayerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKerasDropout() {
		return kerasDropoutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKerasDropout_Rate() {
		return (EAttribute)kerasDropoutEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKerasDropout_NoiseShape() {
		return (EAttribute)kerasDropoutEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKerasDropout_Seed() {
		return (EAttribute)kerasDropoutEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKerasReshape() {
		return kerasReshapeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKerasReshape_InputShape() {
		return (EAttribute)kerasReshapeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKerasReshape_OutputShape() {
		return (EAttribute)kerasReshapeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivationFunction() {
		return activationFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLossFunction() {
		return lossFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInitializerFunction() {
		return initializerFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMathFunction() {
		return mathFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMatmulFunction() {
		return matmulFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDotFunction() {
		return dotFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPadding() {
		return paddingEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NndesignerFactory getNndesignerFactory() {
		return (NndesignerFactory)getEFactoryInstance();
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
		designEClass = createEClass(DESIGN);
		createEReference(designEClass, DESIGN__ELEMENTS);

		elementEClass = createEClass(ELEMENT);

		inputSourceEClass = createEClass(INPUT_SOURCE);

		layerEClass = createEClass(LAYER);
		createEReference(layerEClass, LAYER__INPUT_SOURCE);
		createEReference(layerEClass, LAYER__TARGET_LAYERS);

		functionEClass = createEClass(FUNCTION);

		kerasDenseLayerEClass = createEClass(KERAS_DENSE_LAYER);
		createEAttribute(kerasDenseLayerEClass, KERAS_DENSE_LAYER__NUMBER_OF_OUTPUT_UNITS);
		createEAttribute(kerasDenseLayerEClass, KERAS_DENSE_LAYER__INPUT_SHAPE);
		createEAttribute(kerasDenseLayerEClass, KERAS_DENSE_LAYER__USE_BIAS);
		createEReference(kerasDenseLayerEClass, KERAS_DENSE_LAYER__ACTIVATION_FUNCTION);
		createEReference(kerasDenseLayerEClass, KERAS_DENSE_LAYER__WEIGHTS_INITIALIZER);
		createEReference(kerasDenseLayerEClass, KERAS_DENSE_LAYER__BIAS_INITIALIZER);

		kerasDropoutEClass = createEClass(KERAS_DROPOUT);
		createEAttribute(kerasDropoutEClass, KERAS_DROPOUT__RATE);
		createEAttribute(kerasDropoutEClass, KERAS_DROPOUT__NOISE_SHAPE);
		createEAttribute(kerasDropoutEClass, KERAS_DROPOUT__SEED);

		kerasReshapeEClass = createEClass(KERAS_RESHAPE);
		createEAttribute(kerasReshapeEClass, KERAS_RESHAPE__INPUT_SHAPE);
		createEAttribute(kerasReshapeEClass, KERAS_RESHAPE__OUTPUT_SHAPE);

		activationFunctionEClass = createEClass(ACTIVATION_FUNCTION);

		lossFunctionEClass = createEClass(LOSS_FUNCTION);

		initializerFunctionEClass = createEClass(INITIALIZER_FUNCTION);

		mathFunctionEClass = createEClass(MATH_FUNCTION);

		matmulFunctionEClass = createEClass(MATMUL_FUNCTION);

		dotFunctionEClass = createEClass(DOT_FUNCTION);

		// Create enums
		paddingEEnum = createEEnum(PADDING);
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
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		layerEClass.getESuperTypes().add(this.getElement());
		layerEClass.getESuperTypes().add(this.getInputSource());
		functionEClass.getESuperTypes().add(this.getElement());
		kerasDenseLayerEClass.getESuperTypes().add(this.getLayer());
		kerasDropoutEClass.getESuperTypes().add(this.getLayer());
		kerasReshapeEClass.getESuperTypes().add(this.getLayer());
		activationFunctionEClass.getESuperTypes().add(this.getFunction());
		lossFunctionEClass.getESuperTypes().add(this.getFunction());
		initializerFunctionEClass.getESuperTypes().add(this.getElement());
		mathFunctionEClass.getESuperTypes().add(this.getFunction());
		matmulFunctionEClass.getESuperTypes().add(this.getMathFunction());
		dotFunctionEClass.getESuperTypes().add(this.getMathFunction());

		// Initialize classes, features, and operations; add parameters
		initEClass(designEClass, Design.class, "Design", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDesign_Elements(), this.getElement(), null, "elements", null, 0, -1, Design.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(elementEClass, Element.class, "Element", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(inputSourceEClass, InputSource.class, "InputSource", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(layerEClass, Layer.class, "Layer", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLayer_InputSource(), this.getInputSource(), null, "inputSource", null, 0, 1, Layer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLayer_TargetLayers(), this.getLayer(), null, "targetLayers", null, 0, -1, Layer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(functionEClass, Function.class, "Function", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(kerasDenseLayerEClass, KerasDenseLayer.class, "KerasDenseLayer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getKerasDenseLayer_NumberOfOutputUnits(), theEcorePackage.getEInt(), "numberOfOutputUnits", null, 0, 1, KerasDenseLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKerasDenseLayer_InputShape(), theEcorePackage.getEInt(), "inputShape", null, 0, -1, KerasDenseLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKerasDenseLayer_UseBias(), theEcorePackage.getEBoolean(), "useBias", null, 0, 1, KerasDenseLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKerasDenseLayer_ActivationFunction(), this.getActivationFunction(), null, "activationFunction", null, 0, 1, KerasDenseLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKerasDenseLayer_WeightsInitializer(), this.getInitializerFunction(), null, "weightsInitializer", null, 0, 1, KerasDenseLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKerasDenseLayer_BiasInitializer(), this.getInitializerFunction(), null, "biasInitializer", null, 0, 1, KerasDenseLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(kerasDropoutEClass, KerasDropout.class, "KerasDropout", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getKerasDropout_Rate(), theEcorePackage.getEFloat(), "rate", null, 0, 1, KerasDropout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKerasDropout_NoiseShape(), theEcorePackage.getEInt(), "noiseShape", null, 0, -1, KerasDropout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKerasDropout_Seed(), theEcorePackage.getEInt(), "seed", null, 0, 1, KerasDropout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(kerasReshapeEClass, KerasReshape.class, "KerasReshape", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getKerasReshape_InputShape(), theEcorePackage.getEInt(), "inputShape", null, 0, -1, KerasReshape.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKerasReshape_OutputShape(), theEcorePackage.getEInt(), "outputShape", null, 0, -1, KerasReshape.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(activationFunctionEClass, ActivationFunction.class, "ActivationFunction", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(lossFunctionEClass, LossFunction.class, "LossFunction", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(initializerFunctionEClass, InitializerFunction.class, "InitializerFunction", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mathFunctionEClass, MathFunction.class, "MathFunction", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(matmulFunctionEClass, MatmulFunction.class, "MatmulFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dotFunctionEClass, DotFunction.class, "DotFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(paddingEEnum, Padding.class, "Padding");
		addEEnumLiteral(paddingEEnum, Padding.VALID);
		addEEnumLiteral(paddingEEnum, Padding.SAME);

		// Create resource
		createResource(eNS_URI);
	}

} //NndesignerPackageImpl
