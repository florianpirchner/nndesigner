/**
 */
package com.lunifera.nndesigner.model.keras.impl;

import com.lunifera.nndesigner.model.keras.*;

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
			case KerasPackage.DENSE_LAYER: return createDenseLayer();
			case KerasPackage.DROPOUT: return createDropout();
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
	public DenseLayer createDenseLayer() {
		DenseLayerImpl denseLayer = new DenseLayerImpl();
		return denseLayer;
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