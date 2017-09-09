/**
 */
package nndesigner.impl;

import nndesigner.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class NndesignerFactoryImpl extends EFactoryImpl implements NndesignerFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static NndesignerFactory init() {
		try {
			NndesignerFactory theNndesignerFactory = (NndesignerFactory)EPackage.Registry.INSTANCE.getEFactory(NndesignerPackage.eNS_URI);
			if (theNndesignerFactory != null) {
				return theNndesignerFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new NndesignerFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NndesignerFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case NndesignerPackage.DESIGN: return createDesign();
			case NndesignerPackage.KERAS_DENSE_LAYER: return createKerasDenseLayer();
			case NndesignerPackage.KERAS_DROPOUT: return createKerasDropout();
			case NndesignerPackage.KERAS_RESHAPE: return createKerasReshape();
			case NndesignerPackage.MATMUL_FUNCTION: return createMatmulFunction();
			case NndesignerPackage.DOT_FUNCTION: return createDotFunction();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case NndesignerPackage.PADDING:
				return createPaddingFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case NndesignerPackage.PADDING:
				return convertPaddingToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Design createDesign() {
		DesignImpl design = new DesignImpl();
		return design;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KerasDenseLayer createKerasDenseLayer() {
		KerasDenseLayerImpl kerasDenseLayer = new KerasDenseLayerImpl();
		return kerasDenseLayer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KerasDropout createKerasDropout() {
		KerasDropoutImpl kerasDropout = new KerasDropoutImpl();
		return kerasDropout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KerasReshape createKerasReshape() {
		KerasReshapeImpl kerasReshape = new KerasReshapeImpl();
		return kerasReshape;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MatmulFunction createMatmulFunction() {
		MatmulFunctionImpl matmulFunction = new MatmulFunctionImpl();
		return matmulFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DotFunction createDotFunction() {
		DotFunctionImpl dotFunction = new DotFunctionImpl();
		return dotFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Padding createPaddingFromString(EDataType eDataType, String initialValue) {
		Padding result = Padding.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPaddingToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NndesignerPackage getNndesignerPackage() {
		return (NndesignerPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static NndesignerPackage getPackage() {
		return NndesignerPackage.eINSTANCE;
	}

} //NndesignerFactoryImpl
