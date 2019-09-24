/**
 */
package edu.kit.ipd.sdq.kamp.model.modificationmarks.impl;

import edu.kit.ipd.sdq.kamp.model.modificationmarks.ModificationmarksPackage;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.SeedModifications;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Seed Modifications</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp.model.modificationmarks.impl.SeedModificationsImpl#getSeedElements <em>Seed Elements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SeedModificationsImpl extends AbstractSeedModificationsImpl implements SeedModifications {
	/**
	 * The cached value of the '{@link #getSeedElements() <em>Seed Elements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeedElements()
	 * @generated
	 * @ordered
	 */
	protected EList<EObject> seedElements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SeedModificationsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModificationmarksPackage.Literals.SEED_MODIFICATIONS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getSeedElements() {
		if (seedElements == null) {
			seedElements = new EObjectResolvingEList<EObject>(EObject.class, this, ModificationmarksPackage.SEED_MODIFICATIONS__SEED_ELEMENTS);
		}
		return seedElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModificationmarksPackage.SEED_MODIFICATIONS__SEED_ELEMENTS:
				return getSeedElements();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ModificationmarksPackage.SEED_MODIFICATIONS__SEED_ELEMENTS:
				getSeedElements().clear();
				getSeedElements().addAll((Collection<? extends EObject>)newValue);
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
			case ModificationmarksPackage.SEED_MODIFICATIONS__SEED_ELEMENTS:
				getSeedElements().clear();
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
			case ModificationmarksPackage.SEED_MODIFICATIONS__SEED_ELEMENTS:
				return seedElements != null && !seedElements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SeedModificationsImpl
