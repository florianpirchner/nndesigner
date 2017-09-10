/**
 */
package com.lunifera.nndesigner.model.keras.util;

import com.lunifera.nndesigner.model.Element;
import com.lunifera.nndesigner.model.InputSource;
import com.lunifera.nndesigner.model.Layer;

import com.lunifera.nndesigner.model.keras.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.lunifera.nndesigner.model.keras.KerasPackage
 * @generated
 */
public class KerasAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static KerasPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KerasAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = KerasPackage.eINSTANCE;
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
	protected KerasSwitch<Adapter> modelSwitch =
		new KerasSwitch<Adapter>() {
			@Override
			public Adapter caseModel(Model object) {
				return createModelAdapter();
			}
			@Override
			public Adapter caseDenseLayer(DenseLayer object) {
				return createDenseLayerAdapter();
			}
			@Override
			public Adapter caseDropout(Dropout object) {
				return createDropoutAdapter();
			}
			@Override
			public Adapter caseReshape(Reshape object) {
				return createReshapeAdapter();
			}
			@Override
			public Adapter caseFlatten(Flatten object) {
				return createFlattenAdapter();
			}
			@Override
			public Adapter casePermute(Permute object) {
				return createPermuteAdapter();
			}
			@Override
			public Adapter caseRepeatVector(RepeatVector object) {
				return createRepeatVectorAdapter();
			}
			@Override
			public Adapter caseActivityRegularization(ActivityRegularization object) {
				return createActivityRegularizationAdapter();
			}
			@Override
			public Adapter caseElement(Element object) {
				return createElementAdapter();
			}
			@Override
			public Adapter caseModel_Model(com.lunifera.nndesigner.model.Model object) {
				return createModel_ModelAdapter();
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
	 * Creates a new adapter for an object of class '{@link com.lunifera.nndesigner.model.keras.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.lunifera.nndesigner.model.keras.Model
	 * @generated
	 */
	public Adapter createModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.lunifera.nndesigner.model.keras.DenseLayer <em>Dense Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.lunifera.nndesigner.model.keras.DenseLayer
	 * @generated
	 */
	public Adapter createDenseLayerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.lunifera.nndesigner.model.keras.Dropout <em>Dropout</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.lunifera.nndesigner.model.keras.Dropout
	 * @generated
	 */
	public Adapter createDropoutAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.lunifera.nndesigner.model.keras.Reshape <em>Reshape</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.lunifera.nndesigner.model.keras.Reshape
	 * @generated
	 */
	public Adapter createReshapeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.lunifera.nndesigner.model.keras.Flatten <em>Flatten</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.lunifera.nndesigner.model.keras.Flatten
	 * @generated
	 */
	public Adapter createFlattenAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.lunifera.nndesigner.model.keras.Permute <em>Permute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.lunifera.nndesigner.model.keras.Permute
	 * @generated
	 */
	public Adapter createPermuteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.lunifera.nndesigner.model.keras.RepeatVector <em>Repeat Vector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.lunifera.nndesigner.model.keras.RepeatVector
	 * @generated
	 */
	public Adapter createRepeatVectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.lunifera.nndesigner.model.keras.ActivityRegularization <em>Activity Regularization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.lunifera.nndesigner.model.keras.ActivityRegularization
	 * @generated
	 */
	public Adapter createActivityRegularizationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.lunifera.nndesigner.model.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.lunifera.nndesigner.model.Element
	 * @generated
	 */
	public Adapter createElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.lunifera.nndesigner.model.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.lunifera.nndesigner.model.Model
	 * @generated
	 */
	public Adapter createModel_ModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.lunifera.nndesigner.model.InputSource <em>Input Source</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.lunifera.nndesigner.model.InputSource
	 * @generated
	 */
	public Adapter createInputSourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.lunifera.nndesigner.model.Layer <em>Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.lunifera.nndesigner.model.Layer
	 * @generated
	 */
	public Adapter createLayerAdapter() {
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

} //KerasAdapterFactory
