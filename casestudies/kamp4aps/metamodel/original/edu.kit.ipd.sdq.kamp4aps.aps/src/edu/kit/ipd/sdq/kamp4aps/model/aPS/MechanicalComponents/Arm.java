/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.aPS.MechanicalComponents;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.MechanicalAssembly;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.StructureRepository.Crane;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arm</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.MechanicalComponents.Arm#getMountedTo <em>Mounted To</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.MechanicalComponents.MechanicalComponentsPackage#getArm()
 * @model
 * @generated
 */
public interface Arm extends MechanicalAssembly {
	/**
	 * Returns the value of the '<em><b>Mounted To</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.StructureRepository.Crane#getArm <em>Arm</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mounted To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mounted To</em>' reference.
	 * @see #setMountedTo(Crane)
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.MechanicalComponents.MechanicalComponentsPackage#getArm_MountedTo()
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.StructureRepository.Crane#getArm
	 * @model opposite="arm" required="true"
	 * @generated
	 */
	Crane getMountedTo();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.MechanicalComponents.Arm#getMountedTo <em>Mounted To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mounted To</em>' reference.
	 * @see #getMountedTo()
	 * @generated
	 */
	void setMountedTo(Crane value);

} // Arm
