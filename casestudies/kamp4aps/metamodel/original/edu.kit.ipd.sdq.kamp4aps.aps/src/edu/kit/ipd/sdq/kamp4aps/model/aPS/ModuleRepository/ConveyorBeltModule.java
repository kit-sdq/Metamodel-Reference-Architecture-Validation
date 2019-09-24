/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Frame;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.MechanicalComponents.RubberBand;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conveyor Belt Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.ConveyorBeltModule#getRubberBand <em>Rubber Band</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.ConveyorBeltModule#getFrame <em>Frame</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.ModuleRepositoryPackage#getConveyorBeltModule()
 * @model
 * @generated
 */
public interface ConveyorBeltModule extends Module {
	/**
	 * Returns the value of the '<em><b>Rubber Band</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rubber Band</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rubber Band</em>' containment reference.
	 * @see #setRubberBand(RubberBand)
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.ModuleRepositoryPackage#getConveyorBeltModule_RubberBand()
	 * @model containment="true" required="true"
	 * @generated
	 */
	RubberBand getRubberBand();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.ConveyorBeltModule#getRubberBand <em>Rubber Band</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rubber Band</em>' containment reference.
	 * @see #getRubberBand()
	 * @generated
	 */
	void setRubberBand(RubberBand value);

	/**
	 * Returns the value of the '<em><b>Frame</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Frame</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Frame</em>' containment reference.
	 * @see #setFrame(Frame)
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.ModuleRepositoryPackage#getConveyorBeltModule_Frame()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Frame getFrame();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.ConveyorBeltModule#getFrame <em>Frame</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frame</em>' containment reference.
	 * @see #getFrame()
	 * @generated
	 */
	void setFrame(Frame value);

} // ConveyorBeltModule
