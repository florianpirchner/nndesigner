/**
 */
package com.lunifera.nndesigner.model.keras.impl;

import com.lunifera.nndesigner.model.ModelPackage;

import com.lunifera.nndesigner.model.keras.ActivityRegularization;
import com.lunifera.nndesigner.model.keras.DenseLayer;
import com.lunifera.nndesigner.model.keras.Dropout;
import com.lunifera.nndesigner.model.keras.Flatten;
import com.lunifera.nndesigner.model.keras.KerasFactory;
import com.lunifera.nndesigner.model.keras.KerasPackage;
import com.lunifera.nndesigner.model.keras.Model;
import com.lunifera.nndesigner.model.keras.Permute;
import com.lunifera.nndesigner.model.keras.RepeatVector;
import com.lunifera.nndesigner.model.keras.Reshape;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
	private EClass denseLayerEClass = null;

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
	 * @see com.lunifera.nndesigner.model.keras.KerasPackage#eNS_URI
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
		ModelPackage.eINSTANCE.eClass();

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
	public EReference getModel_Inputs() {
		return (EReference)modelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModel_Outputs() {
		return (EReference)modelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDenseLayer() {
		return denseLayerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDenseLayer_NumberOfOutputUnits() {
		return (EAttribute)denseLayerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDenseLayer_InputShape() {
		return (EReference)denseLayerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDenseLayer_UseBias() {
		return (EAttribute)denseLayerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDenseLayer_ActivationFunction() {
		return (EReference)denseLayerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDenseLayer_WeightsInitializer() {
		return (EReference)denseLayerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDenseLayer_BiasInitializer() {
		return (EReference)denseLayerEClass.getEStructuralFeatures().get(5);
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
	public EClass getReshape() {
		return reshapeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReshape_InputShape() {
		return (EReference)reshapeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReshape_OutputShape() {
		return (EReference)reshapeEClass.getEStructuralFeatures().get(1);
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
		createEReference(modelEClass, MODEL__INPUTS);
		createEReference(modelEClass, MODEL__OUTPUTS);

		denseLayerEClass = createEClass(DENSE_LAYER);
		createEAttribute(denseLayerEClass, DENSE_LAYER__NUMBER_OF_OUTPUT_UNITS);
		createEReference(denseLayerEClass, DENSE_LAYER__INPUT_SHAPE);
		createEAttribute(denseLayerEClass, DENSE_LAYER__USE_BIAS);
		createEReference(denseLayerEClass, DENSE_LAYER__ACTIVATION_FUNCTION);
		createEReference(denseLayerEClass, DENSE_LAYER__WEIGHTS_INITIALIZER);
		createEReference(denseLayerEClass, DENSE_LAYER__BIAS_INITIALIZER);

		dropoutEClass = createEClass(DROPOUT);
		createEAttribute(dropoutEClass, DROPOUT__RATE);
		createEReference(dropoutEClass, DROPOUT__NOISE_SHAPE);
		createEAttribute(dropoutEClass, DROPOUT__SEED);

		reshapeEClass = createEClass(RESHAPE);
		createEReference(reshapeEClass, RESHAPE__INPUT_SHAPE);
		createEReference(reshapeEClass, RESHAPE__OUTPUT_SHAPE);

		flattenEClass = createEClass(FLATTEN);

		permuteEClass = createEClass(PERMUTE);
		createEReference(permuteEClass, PERMUTE__DIMS);
		createEReference(permuteEClass, PERMUTE__INPUT_SHAPE);

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
		ModelPackage theModelPackage = (ModelPackage)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		modelEClass.getESuperTypes().add(theModelPackage.getModel());
		denseLayerEClass.getESuperTypes().add(theModelPackage.getLayer());
		dropoutEClass.getESuperTypes().add(theModelPackage.getLayer());
		reshapeEClass.getESuperTypes().add(theModelPackage.getLayer());
		flattenEClass.getESuperTypes().add(theModelPackage.getLayer());
		permuteEClass.getESuperTypes().add(theModelPackage.getLayer());
		repeatVectorEClass.getESuperTypes().add(theModelPackage.getLayer());
		activityRegularizationEClass.getESuperTypes().add(theModelPackage.getLayer());

		// Initialize classes, features, and operations; add parameters
		initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModel_Inputs(), theModelPackage.getLayer(), null, "inputs", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModel_Outputs(), theModelPackage.getLayer(), null, "outputs", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(denseLayerEClass, DenseLayer.class, "DenseLayer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDenseLayer_NumberOfOutputUnits(), theEcorePackage.getEInt(), "numberOfOutputUnits", null, 0, 1, DenseLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDenseLayer_InputShape(), theModelPackage.getShape(), null, "inputShape", null, 0, 1, DenseLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDenseLayer_UseBias(), theEcorePackage.getEBoolean(), "useBias", null, 0, 1, DenseLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDenseLayer_ActivationFunction(), theModelPackage.getActivationFunction(), null, "activationFunction", null, 0, 1, DenseLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDenseLayer_WeightsInitializer(), theModelPackage.getInitializerFunction(), null, "weightsInitializer", null, 0, 1, DenseLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDenseLayer_BiasInitializer(), theModelPackage.getInitializerFunction(), null, "biasInitializer", null, 0, 1, DenseLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dropoutEClass, Dropout.class, "Dropout", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDropout_Rate(), theEcorePackage.getEFloat(), "rate", null, 0, 1, Dropout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDropout_NoiseShape(), theModelPackage.getShape(), null, "noiseShape", null, 0, 1, Dropout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDropout_Seed(), theEcorePackage.getEInt(), "seed", null, 0, 1, Dropout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(reshapeEClass, Reshape.class, "Reshape", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReshape_InputShape(), theModelPackage.getShape(), null, "inputShape", null, 0, 1, Reshape.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReshape_OutputShape(), theModelPackage.getShape(), null, "outputShape", null, 0, 1, Reshape.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(flattenEClass, Flatten.class, "Flatten", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(permuteEClass, Permute.class, "Permute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPermute_Dims(), theModelPackage.getIntegerDuple(), null, "dims", null, 0, 1, Permute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPermute_InputShape(), theModelPackage.getShape(), null, "inputShape", null, 0, 1, Permute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(repeatVectorEClass, RepeatVector.class, "RepeatVector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRepeatVector_NumberOfRepeats(), theEcorePackage.getEInt(), "numberOfRepeats", null, 0, 1, RepeatVector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRepeatVector_InputShape(), theModelPackage.getShape2D(), null, "inputShape", null, 0, 1, RepeatVector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRepeatVector_OutputShape(), theModelPackage.getShape3D(), null, "outputShape", null, 0, 1, RepeatVector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(activityRegularizationEClass, ActivityRegularization.class, "ActivityRegularization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActivityRegularization_L1(), theEcorePackage.getEInt(), "l1", null, 0, 1, ActivityRegularization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActivityRegularization_L2(), theEcorePackage.getEInt(), "l2", null, 0, 1, ActivityRegularization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivityRegularization_InputShape(), theModelPackage.getShape2D(), null, "inputShape", null, 0, 1, ActivityRegularization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //KerasPackageImpl
