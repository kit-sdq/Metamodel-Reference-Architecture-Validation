/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.BusBox;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.BusCable;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.PhysicalConnection;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pusher</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Pusher#getComponentsRepository <em>Components Repository</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Pusher#getFixtureCylinder <em>Fixture Cylinder</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Pusher#getMonostableCylinder <em>Monostable Cylinder</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Pusher#getBusBox <em>Bus Box</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Pusher#getBusCable <em>Bus Cable</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.ComponentRepositoryPackage#getPusher()
 * @model
 * @generated
 */
public interface Pusher extends Component {
	/**
	 * Returns the value of the '<em><b>Components Repository</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Components Repository</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Components Repository</em>' reference.
	 * @see #setComponentsRepository(Component)
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.ComponentRepositoryPackage#getPusher_ComponentsRepository()
	 * @model required="true"
	 * @generated
	 */
	Component getComponentsRepository();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Pusher#getComponentsRepository <em>Components Repository</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Components Repository</em>' reference.
	 * @see #getComponentsRepository()
	 * @generated
	 */
	void setComponentsRepository(Component value);

	/**
	 * Returns the value of the '<em><b>Fixture Cylinder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fixture Cylinder</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fixture Cylinder</em>' containment reference.
	 * @see #setFixtureCylinder(PhysicalConnection)
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.ComponentRepositoryPackage#getPusher_FixtureCylinder()
	 * @model containment="true" required="true"
	 * @generated
	 */
	PhysicalConnection getFixtureCylinder();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Pusher#getFixtureCylinder <em>Fixture Cylinder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fixture Cylinder</em>' containment reference.
	 * @see #getFixtureCylinder()
	 * @generated
	 */
	void setFixtureCylinder(PhysicalConnection value);

	/**
	 * Returns the value of the '<em><b>Monostable Cylinder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Monostable Cylinder</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Monostable Cylinder</em>' containment reference.
	 * @see #setMonostableCylinder(MonostableCylinder)
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.ComponentRepositoryPackage#getPusher_MonostableCylinder()
	 * @model containment="true" required="true"
	 * @generated
	 */
	MonostableCylinder getMonostableCylinder();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Pusher#getMonostableCylinder <em>Monostable Cylinder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Monostable Cylinder</em>' containment reference.
	 * @see #getMonostableCylinder()
	 * @generated
	 */
	void setMonostableCylinder(MonostableCylinder value);

	/**
	 * Returns the value of the '<em><b>Bus Box</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bus Box</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bus Box</em>' containment reference.
	 * @see #setBusBox(BusBox)
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.ComponentRepositoryPackage#getPusher_BusBox()
	 * @model containment="true" required="true"
	 * @generated
	 */
	BusBox getBusBox();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Pusher#getBusBox <em>Bus Box</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bus Box</em>' containment reference.
	 * @see #getBusBox()
	 * @generated
	 */
	void setBusBox(BusBox value);

	/**
	 * Returns the value of the '<em><b>Bus Cable</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.BusCable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bus Cable</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bus Cable</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.ComponentRepositoryPackage#getPusher_BusCable()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<BusCable> getBusCable();

} // Pusher
