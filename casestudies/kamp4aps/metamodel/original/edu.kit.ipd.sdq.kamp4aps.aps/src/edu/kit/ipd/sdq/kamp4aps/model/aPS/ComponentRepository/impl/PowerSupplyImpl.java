/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.ComponentRepositoryPackage;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.PowerSupply;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.Interface;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.InterfaceRepositoryPackage;

import edu.kit.ipd.sdq.kamp4aps.model.basic.Entity;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Power Supply</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.PowerSupplyImpl#getParentElement <em>Parent Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PowerSupplyImpl extends ComponentImpl implements PowerSupply {
	/**
	 * The cached value of the '{@link #getParentElement() <em>Parent Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentElement()
	 * @generated
	 * @ordered
	 */
	protected EList<Entity> parentElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PowerSupplyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentRepositoryPackage.Literals.POWER_SUPPLY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Entity> getParentElement() {
		if (parentElement == null) {
			parentElement = new EObjectResolvingEList<Entity>(Entity.class, this, ComponentRepositoryPackage.POWER_SUPPLY__PARENT_ELEMENT);
		}
		return parentElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ComponentRepositoryPackage.POWER_SUPPLY__PARENT_ELEMENT:
				return getParentElement();
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
			case ComponentRepositoryPackage.POWER_SUPPLY__PARENT_ELEMENT:
				getParentElement().clear();
				getParentElement().addAll((Collection<? extends Entity>)newValue);
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
			case ComponentRepositoryPackage.POWER_SUPPLY__PARENT_ELEMENT:
				getParentElement().clear();
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
			case ComponentRepositoryPackage.POWER_SUPPLY__PARENT_ELEMENT:
				return parentElement != null && !parentElement.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Interface.class) {
			switch (derivedFeatureID) {
				case ComponentRepositoryPackage.POWER_SUPPLY__PARENT_ELEMENT: return InterfaceRepositoryPackage.INTERFACE__PARENT_ELEMENT;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Interface.class) {
			switch (baseFeatureID) {
				case InterfaceRepositoryPackage.INTERFACE__PARENT_ELEMENT: return ComponentRepositoryPackage.POWER_SUPPLY__PARENT_ELEMENT;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //PowerSupplyImpl
