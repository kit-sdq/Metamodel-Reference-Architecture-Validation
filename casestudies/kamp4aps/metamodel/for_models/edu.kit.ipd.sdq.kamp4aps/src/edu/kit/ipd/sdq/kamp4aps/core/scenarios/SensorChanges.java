package edu.kit.ipd.sdq.kamp4aps.core.scenarios;

import java.util.Collection;

import edu.kit.ipd.sdq.kamp.architecture.ArchitectureModelLookup;
import edu.kit.ipd.sdq.kamp4aps.core.APSArchitectureVersion;
import edu.kit.ipd.sdq.kamp4aps.core.changepropagation.Change;
import edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ChangePropagationDueToHardwareChange;
import edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ModifyPhysicalConnection;
import edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ModifySensor;
import edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ModifySignalinterface;
import edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.KAMP4aPSModificationmarksFactory;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Sensor;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.PhysicalConnection;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.SignalInterface;

public class SensorChanges extends Change {
	
	public SensorChanges(APSArchitectureVersion v) {
		super(v);
	}
	
	public Collection<Sensor> getInitialMarkedSensors(){
		return ArchitectureModelLookup.lookUpMarkedObjectsOfAType(version, Sensor.class);
	}

	public void addSensorModificationToChangePropagation(Sensor sensor, 
			ChangePropagationDueToHardwareChange changePropagationDueToHardwareChange,
			Collection<SignalInterface> signalInterfaceToChange,
			Collection<PhysicalConnection> physicalConnectionToChange) {
		signalInterfaceToChange.add(sensor.getSignalinterface());
		physicalConnectionToChange.add(sensor.getPhysicalconnection());
		ModifySensor modifySensor = KAMP4aPSModificationmarksFactory.eINSTANCE.createModifySensor();
		modifySensor.setToolderived(true);
		modifySensor.setAffectedElement(sensor);
		modifySensor.getCausingElements().addAll(getInitialMarkedSensors());
	
		for(SignalInterface signalInterface : signalInterfaceToChange){
			if(signalInterface != null){
				ModifySignalinterface msi = KAMP4aPSModificationmarksFactory.eINSTANCE.createModifySignalinterface();
				msi.setToolderived(true);
				msi.setAffectedElement(signalInterface);
				msi.getCausingElements().add(sensor);
				modifySensor.getModifySignalInterfaces().add(signalInterface);
			}
		}
		
		for(PhysicalConnection physicalConnection : physicalConnectionToChange){
			if(physicalConnection != null){
				ModifyPhysicalConnection mpc = KAMP4aPSModificationmarksFactory.eINSTANCE.createModifyPhysicalConnection();
				mpc.setToolderived(true);
				mpc.setAffectedElement(physicalConnection);
				mpc.getCausingElements().add(sensor);
				modifySensor.getModifyPhysicalConnections().add(physicalConnection);
			}
		}
		
		changePropagationDueToHardwareChange.getSensorModifications().add(modifySensor);
	}

}
