/**
 */
package com.lunifera.nndesigner.model.util;

import com.lunifera.nndesigner.model.*;

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
 * @see com.lunifera.nndesigner.model.ModelPackage
 * @generated
 */
public class ModelSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ModelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelSwitch() {
		if (modelPackage == null) {
			modelPackage = ModelPackage.eINSTANCE;
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
			case ModelPackage.DESIGN: {
				Design design = (Design)theEObject;
				T result = caseDesign(design);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.ELEMENT: {
				Element element = (Element)theEObject;
				T result = caseElement(element);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.MODEL: {
				Model model = (Model)theEObject;
				T result = caseModel(model);
				if (result == null) result = caseElement(model);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.INPUT_SOURCE: {
				InputSource inputSource = (InputSource)theEObject;
				T result = caseInputSource(inputSource);
				if (result == null) result = caseElement(inputSource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.LAYER: {
				Layer layer = (Layer)theEObject;
				T result = caseLayer(layer);
				if (result == null) result = caseInputSource(layer);
				if (result == null) result = caseElement(layer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.FUNCTION: {
				Function function = (Function)theEObject;
				T result = caseFunction(function);
				if (result == null) result = caseElement(function);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.SHAPE: {
				Shape shape = (Shape)theEObject;
				T result = caseShape(shape);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.SHAPE2_D: {
				Shape2D shape2D = (Shape2D)theEObject;
				T result = caseShape2D(shape2D);
				if (result == null) result = caseShape(shape2D);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.SHAPE3_D: {
				Shape3D shape3D = (Shape3D)theEObject;
				T result = caseShape3D(shape3D);
				if (result == null) result = caseShape2D(shape3D);
				if (result == null) result = caseShape(shape3D);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.INTEGER_DUPLE: {
				IntegerDuple integerDuple = (IntegerDuple)theEObject;
				T result = caseIntegerDuple(integerDuple);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.ACTIVATION_FUNCTION: {
				ActivationFunction activationFunction = (ActivationFunction)theEObject;
				T result = caseActivationFunction(activationFunction);
				if (result == null) result = caseFunction(activationFunction);
				if (result == null) result = caseElement(activationFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.LOSS_FUNCTION: {
				LossFunction lossFunction = (LossFunction)theEObject;
				T result = caseLossFunction(lossFunction);
				if (result == null) result = caseFunction(lossFunction);
				if (result == null) result = caseElement(lossFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.INITIALIZER_FUNCTION: {
				InitializerFunction initializerFunction = (InitializerFunction)theEObject;
				T result = caseInitializerFunction(initializerFunction);
				if (result == null) result = caseElement(initializerFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.MATH_FUNCTION: {
				MathFunction mathFunction = (MathFunction)theEObject;
				T result = caseMathFunction(mathFunction);
				if (result == null) result = caseFunction(mathFunction);
				if (result == null) result = caseElement(mathFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.MATMUL_FUNCTION: {
				MatmulFunction matmulFunction = (MatmulFunction)theEObject;
				T result = caseMatmulFunction(matmulFunction);
				if (result == null) result = caseMathFunction(matmulFunction);
				if (result == null) result = caseFunction(matmulFunction);
				if (result == null) result = caseElement(matmulFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.DOT_FUNCTION: {
				DotFunction dotFunction = (DotFunction)theEObject;
				T result = caseDotFunction(dotFunction);
				if (result == null) result = caseMathFunction(dotFunction);
				if (result == null) result = caseFunction(dotFunction);
				if (result == null) result = caseElement(dotFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Design</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Design</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDesign(Design object) {
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
	public T caseModel(Model object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunction(Function object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Shape</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Shape</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseShape(Shape object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Shape2 D</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Shape2 D</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseShape2D(Shape2D object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Shape3 D</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Shape3 D</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseShape3D(Shape3D object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Duple</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Duple</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntegerDuple(IntegerDuple object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activation Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activation Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivationFunction(ActivationFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Loss Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Loss Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLossFunction(LossFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Initializer Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Initializer Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInitializerFunction(InitializerFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Math Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Math Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMathFunction(MathFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Matmul Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Matmul Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMatmulFunction(MatmulFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dot Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dot Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDotFunction(DotFunction object) {
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

} //ModelSwitch
