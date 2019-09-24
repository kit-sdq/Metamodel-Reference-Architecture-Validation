/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.ElectronicComponents.Button;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.ElectronicComponents.LED;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.Screwing;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation Panel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.OperationPanel#getScrewing_rack <em>Screwing rack</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.OperationPanel#getLeds <em>Leds</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.OperationPanel#getButtons <em>Buttons</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.ComponentRepositoryPackage#getOperationPanel()
 * @model
 * @generated
 */
public interface OperationPanel extends Panel {
	/**
	 * Returns the value of the '<em><b>Screwing rack</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Screwing rack</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Screwing rack</em>' reference.
	 * @see #setScrewing_rack(Screwing)
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.ComponentRepositoryPackage#getOperationPanel_Screwing_rack()
	 * @model required="true"
	 * @generated
	 */
	Screwing getScrewing_rack();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.OperationPanel#getScrewing_rack <em>Screwing rack</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Screwing rack</em>' reference.
	 * @see #getScrewing_rack()
	 * @generated
	 */
	void setScrewing_rack(Screwing value);

	/**
	 * Returns the value of the '<em><b>Leds</b></em>' reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ElectronicComponents.LED}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Leds</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Leds</em>' reference list.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.ComponentRepositoryPackage#getOperationPanel_Leds()
	 * @model
	 * @generated
	 */
	EList<LED> getLeds();

	/**
	 * Returns the value of the '<em><b>Buttons</b></em>' reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ElectronicComponents.Button}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Buttons</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Buttons</em>' reference list.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.ComponentRepositoryPackage#getOperationPanel_Buttons()
	 * @model
	 * @generated
	 */
	EList<Button> getButtons();

} // OperationPanel
