/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.StructureRepository.Structure;

import edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.KAMP4aPSFieldofactivityannotationsPackage;
import edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.StructureDrawing;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Structure Drawing</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.StructureDrawingImpl#getDrawn_structure <em>Drawn structure</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StructureDrawingImpl extends DrawingImpl implements StructureDrawing {
	/**
	 * The cached value of the '{@link #getDrawn_structure() <em>Drawn structure</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDrawn_structure()
	 * @generated
	 * @ordered
	 */
	protected Structure drawn_structure;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StructureDrawingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KAMP4aPSFieldofactivityannotationsPackage.Literals.STRUCTURE_DRAWING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Structure getDrawn_structure() {
		if (drawn_structure != null && drawn_structure.eIsProxy()) {
			InternalEObject oldDrawn_structure = (InternalEObject)drawn_structure;
			drawn_structure = (Structure)eResolveProxy(oldDrawn_structure);
			if (drawn_structure != oldDrawn_structure) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, KAMP4aPSFieldofactivityannotationsPackage.STRUCTURE_DRAWING__DRAWN_STRUCTURE, oldDrawn_structure, drawn_structure));
			}
		}
		return drawn_structure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Structure basicGetDrawn_structure() {
		return drawn_structure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDrawn_structure(Structure newDrawn_structure) {
		Structure oldDrawn_structure = drawn_structure;
		drawn_structure = newDrawn_structure;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KAMP4aPSFieldofactivityannotationsPackage.STRUCTURE_DRAWING__DRAWN_STRUCTURE, oldDrawn_structure, drawn_structure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case KAMP4aPSFieldofactivityannotationsPackage.STRUCTURE_DRAWING__DRAWN_STRUCTURE:
				if (resolve) return getDrawn_structure();
				return basicGetDrawn_structure();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case KAMP4aPSFieldofactivityannotationsPackage.STRUCTURE_DRAWING__DRAWN_STRUCTURE:
				setDrawn_structure((Structure)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case KAMP4aPSFieldofactivityannotationsPackage.STRUCTURE_DRAWING__DRAWN_STRUCTURE:
				setDrawn_structure((Structure)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case KAMP4aPSFieldofactivityannotationsPackage.STRUCTURE_DRAWING__DRAWN_STRUCTURE:
				return drawn_structure != null;
		}
		return super.eIsSet(featureID);
	}

} //StructureDrawingImpl
