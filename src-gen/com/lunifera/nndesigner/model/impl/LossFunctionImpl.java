/**
 */
package com.lunifera.nndesigner.model.impl;

import com.lunifera.nndesigner.model.LossFunction;
import com.lunifera.nndesigner.model.ModelPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Loss Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class LossFunctionImpl extends FunctionImpl implements LossFunction {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LossFunctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.LOSS_FUNCTION;
	}

} //LossFunctionImpl
