/**
 */
package org.eclipse.athene.nn.model.core.impl;

import org.eclipse.athene.nn.model.core.ActivationFunction;
import org.eclipse.athene.nn.model.core.CorePackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activation Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class ActivationFunctionImpl extends FunctionImpl implements ActivationFunction {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivationFunctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.ACTIVATION_FUNCTION;
	}

} //ActivationFunctionImpl
