/**
 */
package nndesigner.impl;

import java.util.Collection;

import nndesigner.KerasReshape;
import nndesigner.NndesignerPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Keras Reshape</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link nndesigner.impl.KerasReshapeImpl#getInputShape <em>Input Shape</em>}</li>
 *   <li>{@link nndesigner.impl.KerasReshapeImpl#getOutputShape <em>Output Shape</em>}</li>
 * </ul>
 *
 * @generated
 */
public class KerasReshapeImpl extends LayerImpl implements KerasReshape {
	/**
	 * The cached value of the '{@link #getInputShape() <em>Input Shape</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputShape()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> inputShape;

	/**
	 * The cached value of the '{@link #getOutputShape() <em>Output Shape</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputShape()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> outputShape;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KerasReshapeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NndesignerPackage.Literals.KERAS_RESHAPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Integer> getInputShape() {
		if (inputShape == null) {
			inputShape = new EDataTypeEList<Integer>(Integer.class, this, NndesignerPackage.KERAS_RESHAPE__INPUT_SHAPE);
		}
		return inputShape;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Integer> getOutputShape() {
		if (outputShape == null) {
			outputShape = new EDataTypeEList<Integer>(Integer.class, this, NndesignerPackage.KERAS_RESHAPE__OUTPUT_SHAPE);
		}
		return outputShape;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case NndesignerPackage.KERAS_RESHAPE__INPUT_SHAPE:
				return getInputShape();
			case NndesignerPackage.KERAS_RESHAPE__OUTPUT_SHAPE:
				return getOutputShape();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case NndesignerPackage.KERAS_RESHAPE__INPUT_SHAPE:
				getInputShape().clear();
				getInputShape().addAll((Collection<? extends Integer>)newValue);
				return;
			case NndesignerPackage.KERAS_RESHAPE__OUTPUT_SHAPE:
				getOutputShape().clear();
				getOutputShape().addAll((Collection<? extends Integer>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case NndesignerPackage.KERAS_RESHAPE__INPUT_SHAPE:
				getInputShape().clear();
				return;
			case NndesignerPackage.KERAS_RESHAPE__OUTPUT_SHAPE:
				getOutputShape().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case NndesignerPackage.KERAS_RESHAPE__INPUT_SHAPE:
				return inputShape != null && !inputShape.isEmpty();
			case NndesignerPackage.KERAS_RESHAPE__OUTPUT_SHAPE:
				return outputShape != null && !outputShape.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (inputShape: ");
		result.append(inputShape);
		result.append(", outputShape: ");
		result.append(outputShape);
		result.append(')');
		return result.toString();
	}

} //KerasReshapeImpl
