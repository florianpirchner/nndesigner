/**
 */
package nndesigner;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Design</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link nndesigner.Design#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see nndesigner.NndesignerPackage#getDesign()
 * @model
 * @generated
 */
public interface Design extends EObject {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link nndesigner.Element}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see nndesigner.NndesignerPackage#getDesign_Elements()
	 * @model containment="true"
	 * @generated
	 */
	EList<Element> getElements();

} // Design
