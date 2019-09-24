/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.impl;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.*;

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
public class BusComponentsFactoryImpl extends EFactoryImpl implements BusComponentsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BusComponentsFactory init() {
		try {
			BusComponentsFactory theBusComponentsFactory = (BusComponentsFactory)EPackage.Registry.INSTANCE.getEFactory(BusComponentsPackage.eNS_URI);
			if (theBusComponentsFactory != null) {
				return theBusComponentsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BusComponentsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusComponentsFactoryImpl() {
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
			case BusComponentsPackage.BUS_BOX: return createBusBox();
			case BusComponentsPackage.BUS_MASTER: return createBusMaster();
			case BusComponentsPackage.BUS_SLAVE: return createBusSlave();
			case BusComponentsPackage.BUS_CABLE: return createBusCable();
			case BusComponentsPackage.PROFIBUS_DP_BOX: return createProfibusDPBox();
			case BusComponentsPackage.PROFIBUS_DP_MASTER: return createProfibusDPMaster();
			case BusComponentsPackage.PROFIBUS_DP_SLAVE: return createProfibusDPSlave();
			case BusComponentsPackage.PROFIBUS_DP_CABLE: return createProfibusDPCable();
			case BusComponentsPackage.ETHER_CAT_BOX: return createEtherCATBox();
			case BusComponentsPackage.ETHER_CAT_MASTER: return createEtherCATMaster();
			case BusComponentsPackage.ETHER_CAT_SLAVE: return createEtherCATSlave();
			case BusComponentsPackage.ETHER_CAT_CABLE: return createEtherCATCable();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusBox createBusBox() {
		BusBoxImpl busBox = new BusBoxImpl();
		return busBox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusMaster createBusMaster() {
		BusMasterImpl busMaster = new BusMasterImpl();
		return busMaster;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusSlave createBusSlave() {
		BusSlaveImpl busSlave = new BusSlaveImpl();
		return busSlave;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusCable createBusCable() {
		BusCableImpl busCable = new BusCableImpl();
		return busCable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProfibusDPBox createProfibusDPBox() {
		ProfibusDPBoxImpl profibusDPBox = new ProfibusDPBoxImpl();
		return profibusDPBox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProfibusDPMaster createProfibusDPMaster() {
		ProfibusDPMasterImpl profibusDPMaster = new ProfibusDPMasterImpl();
		return profibusDPMaster;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProfibusDPSlave createProfibusDPSlave() {
		ProfibusDPSlaveImpl profibusDPSlave = new ProfibusDPSlaveImpl();
		return profibusDPSlave;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProfibusDPCable createProfibusDPCable() {
		ProfibusDPCableImpl profibusDPCable = new ProfibusDPCableImpl();
		return profibusDPCable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EtherCATBox createEtherCATBox() {
		EtherCATBoxImpl etherCATBox = new EtherCATBoxImpl();
		return etherCATBox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EtherCATMaster createEtherCATMaster() {
		EtherCATMasterImpl etherCATMaster = new EtherCATMasterImpl();
		return etherCATMaster;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EtherCATSlave createEtherCATSlave() {
		EtherCATSlaveImpl etherCATSlave = new EtherCATSlaveImpl();
		return etherCATSlave;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EtherCATCable createEtherCATCable() {
		EtherCATCableImpl etherCATCable = new EtherCATCableImpl();
		return etherCATCable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusComponentsPackage getBusComponentsPackage() {
		return (BusComponentsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BusComponentsPackage getPackage() {
		return BusComponentsPackage.eINSTANCE;
	}

} //BusComponentsFactoryImpl
