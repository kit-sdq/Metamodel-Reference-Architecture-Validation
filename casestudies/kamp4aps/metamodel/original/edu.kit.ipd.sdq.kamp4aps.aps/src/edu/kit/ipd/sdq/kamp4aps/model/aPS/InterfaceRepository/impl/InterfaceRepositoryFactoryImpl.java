/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.impl;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.*;

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
public class InterfaceRepositoryFactoryImpl extends EFactoryImpl implements InterfaceRepositoryFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static InterfaceRepositoryFactory init() {
		try {
			InterfaceRepositoryFactory theInterfaceRepositoryFactory = (InterfaceRepositoryFactory)EPackage.Registry.INSTANCE.getEFactory(InterfaceRepositoryPackage.eNS_URI);
			if (theInterfaceRepositoryFactory != null) {
				return theInterfaceRepositoryFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new InterfaceRepositoryFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceRepositoryFactoryImpl() {
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
			case InterfaceRepositoryPackage.INTERFACE_REPOSITORY: return createInterfaceRepository();
			case InterfaceRepositoryPackage.INTERFACE: return createInterface();
			case InterfaceRepositoryPackage.SCREWING: return createScrewing();
			case InterfaceRepositoryPackage.SUSPENSION: return createSuspension();
			case InterfaceRepositoryPackage.GEARING: return createGearing();
			case InterfaceRepositoryPackage.CLAMPING: return createClamping();
			case InterfaceRepositoryPackage.PNEUMATIC_SUPPLY: return createPneumaticSupply();
			case InterfaceRepositoryPackage.SIGNAL_INTERFACE: return createSignalInterface();
			case InterfaceRepositoryPackage.WATER_SUPPLY: return createWaterSupply();
			case InterfaceRepositoryPackage.PHYSICAL_CONNECTION: return createPhysicalConnection();
			case InterfaceRepositoryPackage.TRANSPORT_CONNECTION: return createTransportConnection();
			case InterfaceRepositoryPackage.FIXTURE: return createFixture();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceRepository createInterfaceRepository() {
		InterfaceRepositoryImpl interfaceRepository = new InterfaceRepositoryImpl();
		return interfaceRepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface createInterface() {
		InterfaceImpl interface_ = new InterfaceImpl();
		return interface_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Screwing createScrewing() {
		ScrewingImpl screwing = new ScrewingImpl();
		return screwing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Suspension createSuspension() {
		SuspensionImpl suspension = new SuspensionImpl();
		return suspension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Gearing createGearing() {
		GearingImpl gearing = new GearingImpl();
		return gearing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Clamping createClamping() {
		ClampingImpl clamping = new ClampingImpl();
		return clamping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PneumaticSupply createPneumaticSupply() {
		PneumaticSupplyImpl pneumaticSupply = new PneumaticSupplyImpl();
		return pneumaticSupply;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignalInterface createSignalInterface() {
		SignalInterfaceImpl signalInterface = new SignalInterfaceImpl();
		return signalInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WaterSupply createWaterSupply() {
		WaterSupplyImpl waterSupply = new WaterSupplyImpl();
		return waterSupply;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalConnection createPhysicalConnection() {
		PhysicalConnectionImpl physicalConnection = new PhysicalConnectionImpl();
		return physicalConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransportConnection createTransportConnection() {
		TransportConnectionImpl transportConnection = new TransportConnectionImpl();
		return transportConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fixture createFixture() {
		FixtureImpl fixture = new FixtureImpl();
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceRepositoryPackage getInterfaceRepositoryPackage() {
		return (InterfaceRepositoryPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static InterfaceRepositoryPackage getPackage() {
		return InterfaceRepositoryPackage.eINSTANCE;
	}

} //InterfaceRepositoryFactoryImpl
