/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Sensor;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.PhysicalConnection;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.SignalInterface;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Modify Sensor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ModifySensor#getModifySignalInterfaces <em>Modify Signal Interfaces</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ModifySensor#getModifyPhysicalConnections <em>Modify Physical Connections</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.KAMP4aPSModificationmarksPackage#getModifySensor()
 * @model
 * @generated
 */
public interface ModifySensor extends ModifyComponent<Sensor> {
	/**
	 * Returns the value of the '<em><b>Modify Signal Interfaces</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.SignalInterface}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modify Signal Interfaces</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modify Signal Interfaces</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.KAMP4aPSModificationmarksPackage#getModifySensor_ModifySignalInterfaces()
	 * @model containment="true"
	 * @generated
	 */
	EList<SignalInterface> getModifySignalInterfaces();

	/**
	 * Returns the value of the '<em><b>Modify Physical Connections</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.PhysicalConnection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modify Physical Connections</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modify Physical Connections</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.KAMP4aPSModificationmarksPackage#getModifySensor_ModifyPhysicalConnections()
	 * @model containment="true"
	 * @generated
	 */
	EList<PhysicalConnection> getModifyPhysicalConnections();

} // ModifySensor
