/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.aPS;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.ComponentRepository;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.InterfaceRepository;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.ModuleRepository;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.StructureRepository.Structure;

import edu.kit.ipd.sdq.kamp4aps.model.basic.Entity;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Plant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.Plant#getPlantName <em>Plant Name</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.Plant#getStructures <em>Structures</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.Plant#getInterfaceRepository <em>Interface Repository</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.Plant#getComponentRepository <em>Component Repository</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.Plant#getModuleRepository <em>Module Repository</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.apsPackage#getPlant()
 * @model
 * @generated
 */
public interface Plant extends Entity {
	/**
	 * Returns the value of the '<em><b>Plant Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Plant Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plant Name</em>' attribute.
	 * @see #setPlantName(String)
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.apsPackage#getPlant_PlantName()
	 * @model
	 * @generated
	 */
	String getPlantName();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.Plant#getPlantName <em>Plant Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plant Name</em>' attribute.
	 * @see #getPlantName()
	 * @generated
	 */
	void setPlantName(String value);

	/**
	 * Returns the value of the '<em><b>Structures</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4aps.model.aPS.StructureRepository.Structure}.
	 * It is bidirectional and its opposite is '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.StructureRepository.Structure#getParentPlant <em>Parent Plant</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Structures</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Structures</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.apsPackage#getPlant_Structures()
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.StructureRepository.Structure#getParentPlant
	 * @model opposite="parentPlant" containment="true"
	 * @generated
	 */
	EList<Structure> getStructures();

	/**
	 * Returns the value of the '<em><b>Interface Repository</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface Repository</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface Repository</em>' containment reference.
	 * @see #setInterfaceRepository(InterfaceRepository)
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.apsPackage#getPlant_InterfaceRepository()
	 * @model containment="true" required="true"
	 * @generated
	 */
	InterfaceRepository getInterfaceRepository();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.Plant#getInterfaceRepository <em>Interface Repository</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interface Repository</em>' containment reference.
	 * @see #getInterfaceRepository()
	 * @generated
	 */
	void setInterfaceRepository(InterfaceRepository value);

	/**
	 * Returns the value of the '<em><b>Component Repository</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component Repository</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Repository</em>' containment reference.
	 * @see #setComponentRepository(ComponentRepository)
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.apsPackage#getPlant_ComponentRepository()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ComponentRepository getComponentRepository();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.Plant#getComponentRepository <em>Component Repository</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Repository</em>' containment reference.
	 * @see #getComponentRepository()
	 * @generated
	 */
	void setComponentRepository(ComponentRepository value);

	/**
	 * Returns the value of the '<em><b>Module Repository</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Module Repository</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Module Repository</em>' containment reference.
	 * @see #setModuleRepository(ModuleRepository)
	 * @see edu.kit.ipd.sdq.kamp4aps.model.aPS.apsPackage#getPlant_ModuleRepository()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ModuleRepository getModuleRepository();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.Plant#getModuleRepository <em>Module Repository</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Module Repository</em>' containment reference.
	 * @see #getModuleRepository()
	 * @generated
	 */
	void setModuleRepository(ModuleRepository value);

} // Plant
