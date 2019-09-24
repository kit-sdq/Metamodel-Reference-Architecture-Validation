/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.aPS.MechanicalComponents.impl;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.MechanicalComponents.*;

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
public class MechanicalComponentsFactoryImpl extends EFactoryImpl implements MechanicalComponentsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MechanicalComponentsFactory init() {
		try {
			MechanicalComponentsFactory theMechanicalComponentsFactory = (MechanicalComponentsFactory)EPackage.Registry.INSTANCE.getEFactory(MechanicalComponentsPackage.eNS_URI);
			if (theMechanicalComponentsFactory != null) {
				return theMechanicalComponentsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MechanicalComponentsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MechanicalComponentsFactoryImpl() {
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
			case MechanicalComponentsPackage.HOUSING: return createHousing();
			case MechanicalComponentsPackage.RETURN_SPRING: return createReturnSpring();
			case MechanicalComponentsPackage.RUBBER_BAND: return createRubberBand();
			case MechanicalComponentsPackage.GRIPPER_PART: return createGripperPart();
			case MechanicalComponentsPackage.ARM: return createArm();
			case MechanicalComponentsPackage.TABLE: return createTable();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Housing createHousing() {
		HousingImpl housing = new HousingImpl();
		return housing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReturnSpring createReturnSpring() {
		ReturnSpringImpl returnSpring = new ReturnSpringImpl();
		return returnSpring;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RubberBand createRubberBand() {
		RubberBandImpl rubberBand = new RubberBandImpl();
		return rubberBand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GripperPart createGripperPart() {
		GripperPartImpl gripperPart = new GripperPartImpl();
		return gripperPart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Arm createArm() {
		ArmImpl arm = new ArmImpl();
		return arm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table createTable() {
		TableImpl table = new TableImpl();
		return table;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MechanicalComponentsPackage getMechanicalComponentsPackage() {
		return (MechanicalComponentsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MechanicalComponentsPackage getPackage() {
		return MechanicalComponentsPackage.eINSTANCE;
	}

} //MechanicalComponentsFactoryImpl
