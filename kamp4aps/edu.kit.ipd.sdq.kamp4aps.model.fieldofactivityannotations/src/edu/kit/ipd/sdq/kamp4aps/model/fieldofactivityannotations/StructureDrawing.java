/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.StructureRepository.Structure;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Structure Drawing</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.StructureDrawing#getDrawn_structure <em>Drawn structure</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.KAMP4aPSFieldofactivityannotationsPackage#getStructureDrawing()
 * @model
 * @generated
 */
public interface StructureDrawing extends Drawing {
	/**
	 * Returns the value of the '<em><b>Drawn structure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Drawn structure</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Drawn structure</em>' reference.
	 * @see #setDrawn_structure(Structure)
	 * @see edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.KAMP4aPSFieldofactivityannotationsPackage#getStructureDrawing_Drawn_structure()
	 * @model
	 * @generated
	 */
	Structure getDrawn_structure();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.StructureDrawing#getDrawn_structure <em>Drawn structure</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Drawn structure</em>' reference.
	 * @see #getDrawn_structure()
	 * @generated
	 */
	void setDrawn_structure(Structure value);

} // StructureDrawing
