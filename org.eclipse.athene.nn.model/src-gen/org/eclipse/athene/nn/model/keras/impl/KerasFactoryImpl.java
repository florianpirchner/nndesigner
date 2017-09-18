/**
 */
package org.eclipse.athene.nn.model.keras.impl;

import org.eclipse.athene.nn.model.keras.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class KerasFactoryImpl extends EFactoryImpl implements KerasFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static KerasFactory init() {
		try {
			KerasFactory theKerasFactory = (KerasFactory)EPackage.Registry.INSTANCE.getEFactory(KerasPackage.eNS_URI);
			if (theKerasFactory != null) {
				return theKerasFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new KerasFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KerasFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case KerasPackage.MODEL: return createModel();
			case KerasPackage.LAYER: return createLayer();
			case KerasPackage.INPUT_NODE: return createInputNode();
			case KerasPackage.OUTPUT_NODE: return createOutputNode();
			case KerasPackage.TENSOR: return createTensor();
			case KerasPackage.BACKEND: return createBackend();
			case KerasPackage.INPUT: return createInput();
			case KerasPackage.DENSE: return createDense();
			case KerasPackage.DROPOUT: return createDropout();
			case KerasPackage.ACTIVATION: return createActivation();
			case KerasPackage.RESHAPE: return createReshape();
			case KerasPackage.FLATTEN: return createFlatten();
			case KerasPackage.PERMUTE: return createPermute();
			case KerasPackage.REPEAT_VECTOR: return createRepeatVector();
			case KerasPackage.ACTIVITY_REGULARIZATION: return createActivityRegularization();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model createModel() {
		ModelImpl model = new ModelImpl();
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Layer createLayer() {
		LayerImpl layer = new LayerImpl();
		return layer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputNode createInputNode() {
		InputNodeImpl inputNode = new InputNodeImpl();
		return inputNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputNode createOutputNode() {
		OutputNodeImpl outputNode = new OutputNodeImpl();
		return outputNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tensor createTensor() {
		TensorImpl tensor = new TensorImpl();
		return tensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Backend createBackend() {
		BackendImpl backend = new BackendImpl();
		return backend;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Input createInput() {
		InputImpl input = new InputImpl();
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dense createDense() {
		DenseImpl dense = new DenseImpl();
		return dense;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dropout createDropout() {
		DropoutImpl dropout = new DropoutImpl();
		return dropout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activation createActivation() {
		ActivationImpl activation = new ActivationImpl();
		return activation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reshape createReshape() {
		ReshapeImpl reshape = new ReshapeImpl();
		return reshape;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Flatten createFlatten() {
		FlattenImpl flatten = new FlattenImpl();
		return flatten;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Permute createPermute() {
		PermuteImpl permute = new PermuteImpl();
		return permute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepeatVector createRepeatVector() {
		RepeatVectorImpl repeatVector = new RepeatVectorImpl();
		return repeatVector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityRegularization createActivityRegularization() {
		ActivityRegularizationImpl activityRegularization = new ActivityRegularizationImpl();
		return activityRegularization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KerasPackage getKerasPackage() {
		return (KerasPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static KerasPackage getPackage() {
		return KerasPackage.eINSTANCE;
	}

} //KerasFactoryImpl
