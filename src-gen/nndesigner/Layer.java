/**
 */
package nndesigner;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Layer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link nndesigner.Layer#getInputSource <em>Input Source</em>}</li>
 *   <li>{@link nndesigner.Layer#getTargetLayers <em>Target Layers</em>}</li>
 * </ul>
 *
 * @see nndesigner.NndesignerPackage#getLayer()
 * @model abstract="true"
 * @generated
 */
public interface Layer extends Element, InputSource {
	/**
	 * Returns the value of the '<em><b>Input Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Source</em>' reference.
	 * @see #setInputSource(InputSource)
	 * @see nndesigner.NndesignerPackage#getLayer_InputSource()
	 * @model
	 * @generated
	 */
	InputSource getInputSource();

	/**
	 * Sets the value of the '{@link nndesigner.Layer#getInputSource <em>Input Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Source</em>' reference.
	 * @see #getInputSource()
	 * @generated
	 */
	void setInputSource(InputSource value);

	/**
	 * Returns the value of the '<em><b>Target Layers</b></em>' reference list.
	 * The list contents are of type {@link nndesigner.Layer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Layers</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Layers</em>' reference list.
	 * @see nndesigner.NndesignerPackage#getLayer_TargetLayers()
	 * @model
	 * @generated
	 */
	EList<Layer> getTargetLayers();

} // Layer
