/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.impl;

import edu.kit.ipd.sdq.kamp.model.modificationmarks.impl.AbstractModificationImpl;

import edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.KAMP4aPSModificationmarksPackage;
import edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ModifyEntity;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Modify Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class ModifyEntityImpl<T extends edu.kit.ipd.sdq.kamp4aps.model.basic.Entity> extends AbstractModificationImpl<T, EObject> implements ModifyEntity<T> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModifyEntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KAMP4aPSModificationmarksPackage.Literals.MODIFY_ENTITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public void setAffectedElement(T newAffectedElement) {
		super.setAffectedElement(newAffectedElement);
	}

} //ModifyEntityImpl
