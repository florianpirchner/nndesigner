/**
 */
package com.lunifera.nndesigner.model.keras.util;

import com.lunifera.nndesigner.model.Element;
import com.lunifera.nndesigner.model.InputSource;
import com.lunifera.nndesigner.model.Layer;

import com.lunifera.nndesigner.model.keras.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see com.lunifera.nndesigner.model.keras.KerasPackage
 * @generated
 */
public class KerasSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static KerasPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KerasSwitch() {
		if (modelPackage == null) {
			modelPackage = KerasPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case KerasPackage.MODEL: {
				Model model = (Model)theEObject;
				T result = caseModel(model);
				if (result == null) result = caseModel_Model(model);
				if (result == null) result = caseElement(model);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KerasPackage.DENSE_LAYER: {
				DenseLayer denseLayer = (DenseLayer)theEObject;
				T result = caseDenseLayer(denseLayer);
				if (result == null) result = caseLayer(denseLayer);
				if (result == null) result = caseInputSource(denseLayer);
				if (result == null) result = caseElement(denseLayer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KerasPackage.DROPOUT: {
				Dropout dropout = (Dropout)theEObject;
				T result = caseDropout(dropout);
				if (result == null) result = caseLayer(dropout);
				if (result == null) result = caseInputSource(dropout);
				if (result == null) result = caseElement(dropout);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KerasPackage.RESHAPE: {
				Reshape reshape = (Reshape)theEObject;
				T result = caseReshape(reshape);
				if (result == null) result = caseLayer(reshape);
				if (result == null) result = caseInputSource(reshape);
				if (result == null) result = caseElement(reshape);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KerasPackage.FLATTEN: {
				Flatten flatten = (Flatten)theEObject;
				T result = caseFlatten(flatten);
				if (result == null) result = caseLayer(flatten);
				if (result == null) result = caseInputSource(flatten);
				if (result == null) result = caseElement(flatten);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KerasPackage.PERMUTE: {
				Permute permute = (Permute)theEObject;
				T result = casePermute(permute);
				if (result == null) result = caseLayer(permute);
				if (result == null) result = caseInputSource(permute);
				if (result == null) result = caseElement(permute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KerasPackage.REPEAT_VECTOR: {
				RepeatVector repeatVector = (RepeatVector)theEObject;
				T result = caseRepeatVector(repeatVector);
				if (result == null) result = caseLayer(repeatVector);
				if (result == null) result = caseInputSource(repeatVector);
				if (result == null) result = caseElement(repeatVector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KerasPackage.ACTIVITY_REGULARIZATION: {
				ActivityRegularization activityRegularization = (ActivityRegularization)theEObject;
				T result = caseActivityRegularization(activityRegularization);
				if (result == null) result = caseLayer(activityRegularization);
				if (result == null) result = caseInputSource(activityRegularization);
				if (result == null) result = caseElement(activityRegularization);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModel(Model object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dense Layer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dense Layer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDenseLayer(DenseLayer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dropout</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dropout</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDropout(Dropout object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reshape</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reshape</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReshape(Reshape object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Flatten</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flatten</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFlatten(Flatten object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Permute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Permute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePermute(Permute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Repeat Vector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Repeat Vector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRepeatVector(RepeatVector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Regularization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Regularization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivityRegularization(ActivityRegularization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElement(Element object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModel_Model(com.lunifera.nndesigner.model.Model object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input Source</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input Source</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInputSource(InputSource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Layer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Layer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLayer(Layer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //KerasSwitch
