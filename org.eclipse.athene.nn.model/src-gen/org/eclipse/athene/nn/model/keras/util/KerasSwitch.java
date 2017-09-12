/**
 */
package org.eclipse.athene.nn.model.keras.util;

import org.eclipse.athene.nn.model.core.Element;

import org.eclipse.athene.nn.model.keras.*;

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
 * @see org.eclipse.athene.nn.model.keras.KerasPackage
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
				if (result == null) result = caseCore_Model(model);
				if (result == null) result = caseCore_Layer(model);
				if (result == null) result = caseElement(model);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KerasPackage.LAYER: {
				Layer layer = (Layer)theEObject;
				T result = caseLayer(layer);
				if (result == null) result = caseTensorflow_Layer(layer);
				if (result == null) result = caseCore_Layer(layer);
				if (result == null) result = caseElement(layer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KerasPackage.NODE: {
				Node node = (Node)theEObject;
				T result = caseNode(node);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KerasPackage.TENSOR: {
				Tensor tensor = (Tensor)theEObject;
				T result = caseTensor(tensor);
				if (result == null) result = caseCore_Tensor(tensor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KerasPackage.INPUT_NODE: {
				InputNode inputNode = (InputNode)theEObject;
				T result = caseInputNode(inputNode);
				if (result == null) result = caseNode(inputNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KerasPackage.OUTPUT_NODE: {
				OutputNode outputNode = (OutputNode)theEObject;
				T result = caseOutputNode(outputNode);
				if (result == null) result = caseNode(outputNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KerasPackage.BACKEND: {
				Backend backend = (Backend)theEObject;
				T result = caseBackend(backend);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KerasPackage.DENSE: {
				Dense dense = (Dense)theEObject;
				T result = caseDense(dense);
				if (result == null) result = caseLayer(dense);
				if (result == null) result = caseTensorflow_Layer(dense);
				if (result == null) result = caseCore_Layer(dense);
				if (result == null) result = caseElement(dense);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KerasPackage.DROPOUT: {
				Dropout dropout = (Dropout)theEObject;
				T result = caseDropout(dropout);
				if (result == null) result = caseLayer(dropout);
				if (result == null) result = caseTensorflow_Layer(dropout);
				if (result == null) result = caseCore_Layer(dropout);
				if (result == null) result = caseElement(dropout);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KerasPackage.ACTIVATION: {
				Activation activation = (Activation)theEObject;
				T result = caseActivation(activation);
				if (result == null) result = caseLayer(activation);
				if (result == null) result = caseTensorflow_Layer(activation);
				if (result == null) result = caseCore_Layer(activation);
				if (result == null) result = caseElement(activation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KerasPackage.RESHAPE: {
				Reshape reshape = (Reshape)theEObject;
				T result = caseReshape(reshape);
				if (result == null) result = caseLayer(reshape);
				if (result == null) result = caseTensorflow_Layer(reshape);
				if (result == null) result = caseCore_Layer(reshape);
				if (result == null) result = caseElement(reshape);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KerasPackage.FLATTEN: {
				Flatten flatten = (Flatten)theEObject;
				T result = caseFlatten(flatten);
				if (result == null) result = caseLayer(flatten);
				if (result == null) result = caseTensorflow_Layer(flatten);
				if (result == null) result = caseCore_Layer(flatten);
				if (result == null) result = caseElement(flatten);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KerasPackage.PERMUTE: {
				Permute permute = (Permute)theEObject;
				T result = casePermute(permute);
				if (result == null) result = caseLayer(permute);
				if (result == null) result = caseTensorflow_Layer(permute);
				if (result == null) result = caseCore_Layer(permute);
				if (result == null) result = caseElement(permute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KerasPackage.REPEAT_VECTOR: {
				RepeatVector repeatVector = (RepeatVector)theEObject;
				T result = caseRepeatVector(repeatVector);
				if (result == null) result = caseLayer(repeatVector);
				if (result == null) result = caseTensorflow_Layer(repeatVector);
				if (result == null) result = caseCore_Layer(repeatVector);
				if (result == null) result = caseElement(repeatVector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KerasPackage.ACTIVITY_REGULARIZATION: {
				ActivityRegularization activityRegularization = (ActivityRegularization)theEObject;
				T result = caseActivityRegularization(activityRegularization);
				if (result == null) result = caseLayer(activityRegularization);
				if (result == null) result = caseTensorflow_Layer(activityRegularization);
				if (result == null) result = caseCore_Layer(activityRegularization);
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
	 * Returns the result of interpreting the object as an instance of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNode(Node object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tensor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tensor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTensor(Tensor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInputNode(InputNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Output Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Output Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutputNode(OutputNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Backend</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Backend</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBackend(Backend object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dense</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dense</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDense(Dense object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Activation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivation(Activation object) {
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
	public T caseCore_Layer(org.eclipse.athene.nn.model.core.Layer object) {
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
	public T caseCore_Model(org.eclipse.athene.nn.model.core.Model object) {
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
	public T caseTensorflow_Layer(org.eclipse.athene.nn.model.tensorflow.Layer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tensor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tensor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCore_Tensor(org.eclipse.athene.nn.model.core.Tensor object) {
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
