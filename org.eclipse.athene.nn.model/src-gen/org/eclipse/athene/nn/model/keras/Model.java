/**
 */
package org.eclipse.athene.nn.model.keras;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.athene.nn.model.keras.Model#getKerasVersion <em>Keras Version</em>}</li>
 *   <li>{@link org.eclipse.athene.nn.model.keras.Model#getBackend <em>Backend</em>}</li>
 * </ul>
 *
 * @see org.eclipse.athene.nn.model.keras.KerasPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends org.eclipse.athene.nn.model.core.Model {
	/**
	 * Returns the value of the '<em><b>Keras Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Keras Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Keras Version</em>' attribute.
	 * @see #setKerasVersion(String)
	 * @see org.eclipse.athene.nn.model.keras.KerasPackage#getModel_KerasVersion()
	 * @model unique="false"
	 * @generated
	 */
	String getKerasVersion();

	/**
	 * Sets the value of the '{@link org.eclipse.athene.nn.model.keras.Model#getKerasVersion <em>Keras Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Keras Version</em>' attribute.
	 * @see #getKerasVersion()
	 * @generated
	 */
	void setKerasVersion(String value);

	/**
	 * Returns the value of the '<em><b>Backend</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Backend</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Backend</em>' reference.
	 * @see #setBackend(Backend)
	 * @see org.eclipse.athene.nn.model.keras.KerasPackage#getModel_Backend()
	 * @model
	 * @generated
	 */
	Backend getBackend();

	/**
	 * Sets the value of the '{@link org.eclipse.athene.nn.model.keras.Model#getBackend <em>Backend</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Backend</em>' reference.
	 * @see #getBackend()
	 * @generated
	 */
	void setBackend(Backend value);

} // Model
