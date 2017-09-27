/**
 */
package org.eclipse.athene.nn.model.keras.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.athene.nn.model.keras.InputNode;
import org.eclipse.athene.nn.model.keras.KerasFactory;
import org.eclipse.athene.nn.model.keras.KerasPackage;
import org.eclipse.athene.nn.model.keras.OutputNode;
import org.eclipse.athene.nn.model.keras.SingleInputNodeProvider;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Single Input Node Provider</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class SingleInputNodeProviderImpl extends MinimalEObjectImpl.Container implements SingleInputNodeProvider {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SingleInputNodeProviderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KerasPackage.Literals.SINGLE_INPUT_NODE_PROVIDER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputNode createInputNode() {
		return KerasFactory.eINSTANCE.createSingleInputNode();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputNode creatOutputNode() {
		return KerasFactory.eINSTANCE.createOutputNode();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case KerasPackage.SINGLE_INPUT_NODE_PROVIDER___CREATE_INPUT_NODE:
				return createInputNode();
			case KerasPackage.SINGLE_INPUT_NODE_PROVIDER___CREAT_OUTPUT_NODE:
				return creatOutputNode();
		}
		return super.eInvoke(operationID, arguments);
	}

} //SingleInputNodeProviderImpl
