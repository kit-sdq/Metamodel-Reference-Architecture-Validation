/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Component;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.SignalInterface;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bus Slave</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.BusSlave#getSignalinterface_master <em>Signalinterface master</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.BusSlave#getSignalinterface_slave <em>Signalinterface slave</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.BusComponentsPackage#getBusSlave()
 * @model
 * @generated
 */
public interface BusSlave extends Component {
	/**
	 * Returns the value of the '<em><b>Signalinterface master</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Signalinterface master</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signalinterface master</em>' reference.
	 * @see #setSignalinterface_master(SignalInterface)
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.BusComponentsPackage#getBusSlave_Signalinterface_master()
	 * @model required="true"
	 * @generated
	 */
	SignalInterface getSignalinterface_master();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.BusSlave#getSignalinterface_master <em>Signalinterface master</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signalinterface master</em>' reference.
	 * @see #getSignalinterface_master()
	 * @generated
	 */
	void setSignalinterface_master(SignalInterface value);

	/**
	 * Returns the value of the '<em><b>Signalinterface slave</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Signalinterface slave</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signalinterface slave</em>' reference.
	 * @see #setSignalinterface_slave(SignalInterface)
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.BusComponentsPackage#getBusSlave_Signalinterface_slave()
	 * @model required="true"
	 * @generated
	 */
	SignalInterface getSignalinterface_slave();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.BusSlave#getSignalinterface_slave <em>Signalinterface slave</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signalinterface slave</em>' reference.
	 * @see #getSignalinterface_slave()
	 * @generated
	 */
	void setSignalinterface_slave(SignalInterface value);

} // BusSlave
