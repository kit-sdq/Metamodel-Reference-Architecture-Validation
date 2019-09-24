/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.aPS.StructureRepository.impl;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.StructureRepository.*;

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
public class StructureRepositoryFactoryImpl extends EFactoryImpl implements StructureRepositoryFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StructureRepositoryFactory init() {
		try {
			StructureRepositoryFactory theStructureRepositoryFactory = (StructureRepositoryFactory)EPackage.Registry.INSTANCE.getEFactory(StructureRepositoryPackage.eNS_URI);
			if (theStructureRepositoryFactory != null) {
				return theStructureRepositoryFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new StructureRepositoryFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureRepositoryFactoryImpl() {
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
			case StructureRepositoryPackage.STRUCTURE: return createStructure();
			case StructureRepositoryPackage.COMMUNICATION_NETWORK: return createCommunicationNetwork();
			case StructureRepositoryPackage.POWER_NETWORK: return createPowerNetwork();
			case StructureRepositoryPackage.CONTROL_CABINET: return createControlCabinet();
			case StructureRepositoryPackage.PNEUMATIC_NETWORK: return createPneumaticNetwork();
			case StructureRepositoryPackage.CONVEYOR: return createConveyor();
			case StructureRepositoryPackage.CRANE: return createCrane();
			case StructureRepositoryPackage.POWER_WIRING: return createPowerWiring();
			case StructureRepositoryPackage.LOGICAL_WIRING: return createLogicalWiring();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Structure createStructure() {
		StructureImpl structure = new StructureImpl();
		return structure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationNetwork createCommunicationNetwork() {
		CommunicationNetworkImpl communicationNetwork = new CommunicationNetworkImpl();
		return communicationNetwork;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PowerNetwork createPowerNetwork() {
		PowerNetworkImpl powerNetwork = new PowerNetworkImpl();
		return powerNetwork;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlCabinet createControlCabinet() {
		ControlCabinetImpl controlCabinet = new ControlCabinetImpl();
		return controlCabinet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PneumaticNetwork createPneumaticNetwork() {
		PneumaticNetworkImpl pneumaticNetwork = new PneumaticNetworkImpl();
		return pneumaticNetwork;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Conveyor createConveyor() {
		ConveyorImpl conveyor = new ConveyorImpl();
		return conveyor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Crane createCrane() {
		CraneImpl crane = new CraneImpl();
		return crane;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PowerWiring createPowerWiring() {
		PowerWiringImpl powerWiring = new PowerWiringImpl();
		return powerWiring;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalWiring createLogicalWiring() {
		LogicalWiringImpl logicalWiring = new LogicalWiringImpl();
		return logicalWiring;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureRepositoryPackage getStructureRepositoryPackage() {
		return (StructureRepositoryPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static StructureRepositoryPackage getPackage() {
		return StructureRepositoryPackage.eINSTANCE;
	}

} //StructureRepositoryFactoryImpl
