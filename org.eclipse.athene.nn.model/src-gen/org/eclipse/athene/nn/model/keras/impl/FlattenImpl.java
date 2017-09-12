/**
 */
package org.eclipse.athene.nn.model.keras.impl;

import org.eclipse.athene.nn.model.keras.Flatten;
import org.eclipse.athene.nn.model.keras.KerasPackage;

import org.eclipse.athene.nn.model.tensorflow.impl.LayerImpl;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Flatten</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class FlattenImpl extends LayerImpl implements Flatten {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FlattenImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KerasPackage.Literals.FLATTEN;
	}

} //FlattenImpl
