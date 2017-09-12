/**
 */
package org.eclipse.athene.nn.model.core.impl;

import org.eclipse.athene.nn.model.core.CorePackage;
import org.eclipse.athene.nn.model.core.MathFunction;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Math Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class MathFunctionImpl extends FunctionImpl implements MathFunction {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MathFunctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.MATH_FUNCTION;
	}

} //MathFunctionImpl
