/**
 */
package nndesigner.util;

import nndesigner.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see nndesigner.NndesignerPackage
 * @generated
 */
public class NndesignerAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static NndesignerPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NndesignerAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = NndesignerPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NndesignerSwitch<Adapter> modelSwitch =
		new NndesignerSwitch<Adapter>() {
			@Override
			public Adapter caseDesign(Design object) {
				return createDesignAdapter();
			}
			@Override
			public Adapter caseElement(Element object) {
				return createElementAdapter();
			}
			@Override
			public Adapter caseInputSource(InputSource object) {
				return createInputSourceAdapter();
			}
			@Override
			public Adapter caseLayer(Layer object) {
				return createLayerAdapter();
			}
			@Override
			public Adapter caseFunction(Function object) {
				return createFunctionAdapter();
			}
			@Override
			public Adapter caseKerasDenseLayer(KerasDenseLayer object) {
				return createKerasDenseLayerAdapter();
			}
			@Override
			public Adapter caseKerasDropout(KerasDropout object) {
				return createKerasDropoutAdapter();
			}
			@Override
			public Adapter caseKerasReshape(KerasReshape object) {
				return createKerasReshapeAdapter();
			}
			@Override
			public Adapter caseActivationFunction(ActivationFunction object) {
				return createActivationFunctionAdapter();
			}
			@Override
			public Adapter caseLossFunction(LossFunction object) {
				return createLossFunctionAdapter();
			}
			@Override
			public Adapter caseInitializerFunction(InitializerFunction object) {
				return createInitializerFunctionAdapter();
			}
			@Override
			public Adapter caseMathFunction(MathFunction object) {
				return createMathFunctionAdapter();
			}
			@Override
			public Adapter caseMatmulFunction(MatmulFunction object) {
				return createMatmulFunctionAdapter();
			}
			@Override
			public Adapter caseDotFunction(DotFunction object) {
				return createDotFunctionAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link nndesigner.Design <em>Design</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nndesigner.Design
	 * @generated
	 */
	public Adapter createDesignAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nndesigner.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nndesigner.Element
	 * @generated
	 */
	public Adapter createElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nndesigner.InputSource <em>Input Source</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nndesigner.InputSource
	 * @generated
	 */
	public Adapter createInputSourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nndesigner.Layer <em>Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nndesigner.Layer
	 * @generated
	 */
	public Adapter createLayerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nndesigner.Function <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nndesigner.Function
	 * @generated
	 */
	public Adapter createFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nndesigner.KerasDenseLayer <em>Keras Dense Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nndesigner.KerasDenseLayer
	 * @generated
	 */
	public Adapter createKerasDenseLayerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nndesigner.KerasDropout <em>Keras Dropout</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nndesigner.KerasDropout
	 * @generated
	 */
	public Adapter createKerasDropoutAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nndesigner.KerasReshape <em>Keras Reshape</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nndesigner.KerasReshape
	 * @generated
	 */
	public Adapter createKerasReshapeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nndesigner.ActivationFunction <em>Activation Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nndesigner.ActivationFunction
	 * @generated
	 */
	public Adapter createActivationFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nndesigner.LossFunction <em>Loss Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nndesigner.LossFunction
	 * @generated
	 */
	public Adapter createLossFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nndesigner.InitializerFunction <em>Initializer Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nndesigner.InitializerFunction
	 * @generated
	 */
	public Adapter createInitializerFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nndesigner.MathFunction <em>Math Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nndesigner.MathFunction
	 * @generated
	 */
	public Adapter createMathFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nndesigner.MatmulFunction <em>Matmul Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nndesigner.MatmulFunction
	 * @generated
	 */
	public Adapter createMatmulFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nndesigner.DotFunction <em>Dot Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nndesigner.DotFunction
	 * @generated
	 */
	public Adapter createDotFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //NndesignerAdapterFactory
