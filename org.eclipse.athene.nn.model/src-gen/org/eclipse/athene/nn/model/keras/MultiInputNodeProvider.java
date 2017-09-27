/**
 */
package org.eclipse.athene.nn.model.keras;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multi Input Node Provider</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * Provides a MultiInputNode. Multiple Tensors can connect to MultiInputNode.
 * <!-- end-model-doc -->
 *
 *
 * @see org.eclipse.athene.nn.model.keras.KerasPackage#getMultiInputNodeProvider()
 * @model abstract="true"
 * @generated
 */
public interface MultiInputNodeProvider extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return &lt;%org.eclipse.athene.nn.model.keras.KerasFactory%&gt;.eINSTANCE.createMultiInputNode();'"
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

} // MultiInputNodeProvider
