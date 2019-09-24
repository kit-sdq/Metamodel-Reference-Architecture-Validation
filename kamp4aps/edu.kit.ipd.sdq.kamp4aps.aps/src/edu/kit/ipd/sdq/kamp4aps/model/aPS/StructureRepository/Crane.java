/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.aPS.StructureRepository;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.TurningTable;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.MechanicalComponents.Arm;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.VacuumGripperModule;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Crane</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.StructureRepository.Crane#getArm <em>Arm</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.StructureRepository.Crane#getMountedOn <em>Mounted On</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.StructureRepository.Crane#getVacuumgripper <em>Vacuumgripper</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.StructureRepository.StructureRepositoryPackage#getCrane()
 * @model
 * @generated
 */
public interface Crane extends Structure {
	/**
	 * Returns the value of the '<em><b>Arm</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.MechanicalComponents.Arm#getMountedTo <em>Mounted To</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arm</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arm</em>' reference.
	 * @see #setArm(Arm)
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.StructureRepository.StructureRepositoryPackage#getCrane_Arm()
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.MechanicalComponents.Arm#getMountedTo
	 * @model opposite="mountedTo" required="true"
	 * @generated
	 */
	Arm getArm();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.StructureRepository.Crane#getArm <em>Arm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arm</em>' reference.
	 * @see #getArm()
	 * @generated
	 */
	void setArm(Arm value);

	/**
	 * Returns the value of the '<em><b>Mounted On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mounted On</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mounted On</em>' reference.
	 * @see #setMountedOn(TurningTable)
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.StructureRepository.StructureRepositoryPackage#getCrane_MountedOn()
	 * @model required="true"
	 * @generated
	 */
	TurningTable getMountedOn();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.StructureRepository.Crane#getMountedOn <em>Mounted On</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mounted On</em>' reference.
	 * @see #getMountedOn()
	 * @generated
	 */
	void setMountedOn(TurningTable value);

	/**
	 * Returns the value of the '<em><b>Vacuumgripper</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vacuumgripper</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vacuumgripper</em>' reference.
	 * @see #setVacuumgripper(VacuumGripperModule)
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.StructureRepository.StructureRepositoryPackage#getCrane_Vacuumgripper()
	 * @model required="true"
	 * @generated
	 */
	VacuumGripperModule getVacuumgripper();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.StructureRepository.Crane#getVacuumgripper <em>Vacuumgripper</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vacuumgripper</em>' reference.
	 * @see #getVacuumgripper()
	 * @generated
	 */
	void setVacuumgripper(VacuumGripperModule value);

} // Crane
