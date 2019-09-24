/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.aPS.ElectronicComponents.impl;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.ElectronicComponents.*;

import org.eclipse.emf.ecore.EClass;
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
public class ElectronicComponentsFactoryImpl extends EFactoryImpl implements ElectronicComponentsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ElectronicComponentsFactory init() {
		try {
			ElectronicComponentsFactory theElectronicComponentsFactory = (ElectronicComponentsFactory)EPackage.Registry.INSTANCE.getEFactory(ElectronicComponentsPackage.eNS_URI);
			if (theElectronicComponentsFactory != null) {
				return theElectronicComponentsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ElectronicComponentsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElectronicComponentsFactoryImpl() {
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
			case ElectronicComponentsPackage.SWITCH: return createSwitch();
			case ElectronicComponentsPackage.LED: return createLED();
			case ElectronicComponentsPackage.BUTTON: return createButton();
			case ElectronicComponentsPackage.MICRO_SWITCH: return createMicroSwitch();
			case ElectronicComponentsPackage.POTENTIOMETER: return createPotentiometer();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Switch createSwitch() {
		SwitchImpl switch_ = new SwitchImpl();
		return switch_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LED createLED() {
		LEDImpl led = new LEDImpl();
		return led;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Button createButton() {
		ButtonImpl button = new ButtonImpl();
		return button;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MicroSwitch createMicroSwitch() {
		MicroSwitchImpl microSwitch = new MicroSwitchImpl();
		return microSwitch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Potentiometer createPotentiometer() {
		PotentiometerImpl potentiometer = new PotentiometerImpl();
		return potentiometer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElectronicComponentsPackage getElectronicComponentsPackage() {
		return (ElectronicComponentsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ElectronicComponentsPackage getPackage() {
		return ElectronicComponentsPackage.eINSTANCE;
	}

} //ElectronicComponentsFactoryImpl
