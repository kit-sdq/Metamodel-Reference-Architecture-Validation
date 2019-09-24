/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.aPS.StructureRepository;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.ConveyorBelt;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conveyor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.StructureRepository.Conveyor#getBelts <em>Belts</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.StructureRepository.StructureRepositoryPackage#getConveyor()
 * @model
 * @generated
 */
public interface Conveyor extends Structure {
	/**
	 * Returns the value of the '<em><b>Belts</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.ConveyorBelt}.
	 * It is bidirectional and its opposite is '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.ConveyorBelt#getMountedTo <em>Mounted To</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Belts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Belts</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.StructureRepository.StructureRepositoryPackage#getConveyor_Belts()
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.ConveyorBelt#getMountedTo
	 * @model opposite="mountedTo" containment="true"
	 * @generated
	 */
	EList<ConveyorBelt> getBelts();

} // Conveyor
