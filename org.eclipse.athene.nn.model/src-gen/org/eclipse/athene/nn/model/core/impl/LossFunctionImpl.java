/**
 */
package org.eclipse.athene.nn.model.core.impl;

import org.eclipse.athene.nn.model.core.CorePackage;
import org.eclipse.athene.nn.model.core.LossFunction;

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
		return CorePackage.Literals.LOSS_FUNCTION;
	}

} //LossFunctionImpl
