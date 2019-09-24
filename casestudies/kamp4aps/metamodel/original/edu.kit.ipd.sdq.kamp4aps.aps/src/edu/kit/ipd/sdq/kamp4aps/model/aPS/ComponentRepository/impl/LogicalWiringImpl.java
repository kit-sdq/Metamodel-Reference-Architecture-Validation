/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.BusCable;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.ComponentRepositoryPackage;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.LogicalWiring;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Logical Wiring</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.LogicalWiringImpl#getBusCable <em>Bus Cable</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LogicalWiringImpl extends ComponentImpl implements LogicalWiring {
	/**
	 * The cached value of the '{@link #getBusCable() <em>Bus Cable</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusCable()
	 * @generated
	 * @ordered
	 */
	protected EList<BusCable> busCable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LogicalWiringImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentRepositoryPackage.Literals.LOGICAL_WIRING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BusCable> getBusCable() {
		if (busCable == null) {
			busCable = new EObjectContainmentEList<BusCable>(BusCable.class, this, ComponentRepositoryPackage.LOGICAL_WIRING__BUS_CABLE);
		}
		return busCable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ComponentRepositoryPackage.LOGICAL_WIRING__BUS_CABLE:
				return ((InternalEList<?>)getBusCable()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ComponentRepositoryPackage.LOGICAL_WIRING__BUS_CABLE:
				return getBusCable();
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
			case ComponentRepositoryPackage.LOGICAL_WIRING__BUS_CABLE:
				getBusCable().clear();
				getBusCable().addAll((Collection<? extends BusCable>)newValue);
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
			case ComponentRepositoryPackage.LOGICAL_WIRING__BUS_CABLE:
				getBusCable().clear();
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
			case ComponentRepositoryPackage.LOGICAL_WIRING__BUS_CABLE:
				return busCable != null && !busCable.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //LogicalWiringImpl
