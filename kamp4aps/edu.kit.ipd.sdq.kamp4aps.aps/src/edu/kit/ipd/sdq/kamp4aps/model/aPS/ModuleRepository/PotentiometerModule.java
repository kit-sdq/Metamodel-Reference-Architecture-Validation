/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.ElectronicComponents.Potentiometer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Potentiometer Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.PotentiometerModule#getPoti <em>Poti</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.ModuleRepositoryPackage#getPotentiometerModule()
 * @model
 * @generated
 */
public interface PotentiometerModule extends Module {
	/**
	 * Returns the value of the '<em><b>Poti</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Poti</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Poti</em>' containment reference.
	 * @see #setPoti(Potentiometer)
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.ModuleRepositoryPackage#getPotentiometerModule_Poti()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Potentiometer getPoti();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.PotentiometerModule#getPoti <em>Poti</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Poti</em>' containment reference.
	 * @see #getPoti()
	 * @generated
	 */
	void setPoti(Potentiometer value);

} // PotentiometerModule
