/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.impl;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.Interface;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.InterfaceRepository;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.InterfaceRepositoryPackage;

import edu.kit.ipd.sdq.kamp4aps.model.basic.impl.EntityImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interface Repository</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.impl.InterfaceRepositoryImpl#getAllInterfacesInPlant <em>All Interfaces In Plant</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InterfaceRepositoryImpl extends EntityImpl implements InterfaceRepository {
	/**
	 * The cached value of the '{@link #getAllInterfacesInPlant() <em>All Interfaces In Plant</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllInterfacesInPlant()
	 * @generated
	 * @ordered
	 */
	protected EList<Interface> allInterfacesInPlant;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterfaceRepositoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InterfaceRepositoryPackage.Literals.INTERFACE_REPOSITORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Interface> getAllInterfacesInPlant() {
		if (allInterfacesInPlant == null) {
			allInterfacesInPlant = new EObjectContainmentEList<Interface>(Interface.class, this, InterfaceRepositoryPackage.INTERFACE_REPOSITORY__ALL_INTERFACES_IN_PLANT);
		}
		return allInterfacesInPlant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InterfaceRepositoryPackage.INTERFACE_REPOSITORY__ALL_INTERFACES_IN_PLANT:
				return ((InternalEList<?>)getAllInterfacesInPlant()).basicRemove(otherEnd, msgs);
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
			case InterfaceRepositoryPackage.INTERFACE_REPOSITORY__ALL_INTERFACES_IN_PLANT:
				return getAllInterfacesInPlant();
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
			case InterfaceRepositoryPackage.INTERFACE_REPOSITORY__ALL_INTERFACES_IN_PLANT:
				getAllInterfacesInPlant().clear();
				getAllInterfacesInPlant().addAll((Collection<? extends Interface>)newValue);
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
			case InterfaceRepositoryPackage.INTERFACE_REPOSITORY__ALL_INTERFACES_IN_PLANT:
				getAllInterfacesInPlant().clear();
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
			case InterfaceRepositoryPackage.INTERFACE_REPOSITORY__ALL_INTERFACES_IN_PLANT:
				return allInterfacesInPlant != null && !allInterfacesInPlant.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //InterfaceRepositoryImpl
