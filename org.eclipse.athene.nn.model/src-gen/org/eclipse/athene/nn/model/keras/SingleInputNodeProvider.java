/**
 */
package org.eclipse.athene.nn.model.keras;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Single Input Node Provider</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * Provides a SingleInputNode. Only one Tensor can connect to SingleInputNode.
 * <!-- end-model-doc -->
 *
 *
 * @see org.eclipse.athene.nn.model.keras.KerasPackage#getSingleInputNodeProvider()
 * @model abstract="true"
 * @generated
 */
public interface SingleInputNodeProvider extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return &lt;%org.eclipse.athene.nn.model.keras.KerasFactory%&gt;.eINSTANCE.createSingleInputNode();'"
	 * @generated
	 */
	InputNode createInputNode();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return &lt;%org.eclipse.athene.nn.model.keras.KerasFactory%&gt;.eINSTANCE.createOutputNode();'"
	 * @generated
	 */
	OutputNode creatOutputNode();

} // SingleInputNodeProvider
