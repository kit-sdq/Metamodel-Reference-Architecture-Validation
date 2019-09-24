/**
 */
package edu.kit.ipd.sdq.kamp4iec.model.ComponentInternalDependencies.impl;

import edu.kit.ipd.sdq.kamp4iec.model.ComponentInternalDependencies.ComponentInternalDependenciesPackage;
import edu.kit.ipd.sdq.kamp4iec.model.ComponentInternalDependencies.ComponentInternalDependenciesRepository;
import edu.kit.ipd.sdq.kamp4iec.model.ComponentInternalDependencies.FunctionblockDependency;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Repository</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.ComponentInternalDependencies.impl.ComponentInternalDependenciesRepositoryImpl#getHasFunctionblockDependency <em>Has Functionblock Dependency</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentInternalDependenciesRepositoryImpl extends MinimalEObjectImpl.Container implements ComponentInternalDependenciesRepository {
	/**
	 * The cached value of the '{@link #getHasFunctionblockDependency() <em>Has Functionblock Dependency</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasFunctionblockDependency()
	 * @generated
	 * @ordered
	 */
	protected EList<FunctionblockDependency> hasFunctionblockDependency;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentInternalDependenciesRepositoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentInternalDependenciesPackage.Literals.COMPONENT_INTERNAL_DEPENDENCIES_REPOSITORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FunctionblockDependency> getHasFunctionblockDependency() {
		if (hasFunctionblockDependency == null) {
			hasFunctionblockDependency = new EObjectContainmentEList<FunctionblockDependency>(FunctionblockDependency.class, this, ComponentInternalDependenciesPackage.COMPONENT_INTERNAL_DEPENDENCIES_REPOSITORY__HAS_FUNCTIONBLOCK_DEPENDENCY);
		}
		return hasFunctionblockDependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ComponentInternalDependenciesPackage.COMPONENT_INTERNAL_DEPENDENCIES_REPOSITORY__HAS_FUNCTIONBLOCK_DEPENDENCY:
				return ((InternalEList<?>)getHasFunctionblockDependency()).basicRemove(otherEnd, msgs);
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
			case ComponentInternalDependenciesPackage.COMPONENT_INTERNAL_DEPENDENCIES_REPOSITORY__HAS_FUNCTIONBLOCK_DEPENDENCY:
				return getHasFunctionblockDependency();
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
			case ComponentInternalDependenciesPackage.COMPONENT_INTERNAL_DEPENDENCIES_REPOSITORY__HAS_FUNCTIONBLOCK_DEPENDENCY:
				getHasFunctionblockDependency().clear();
				getHasFunctionblockDependency().addAll((Collection<? extends FunctionblockDependency>)newValue);
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
			case ComponentInternalDependenciesPackage.COMPONENT_INTERNAL_DEPENDENCIES_REPOSITORY__HAS_FUNCTIONBLOCK_DEPENDENCY:
				getHasFunctionblockDependency().clear();
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
			case ComponentInternalDependenciesPackage.COMPONENT_INTERNAL_DEPENDENCIES_REPOSITORY__HAS_FUNCTIONBLOCK_DEPENDENCY:
				return hasFunctionblockDependency != null && !hasFunctionblockDependency.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ComponentInternalDependenciesRepositoryImpl
