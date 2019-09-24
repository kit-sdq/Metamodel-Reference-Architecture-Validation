/**
 */
package edu.kit.ipd.sdq.kamp4iec.model.ComponentInternalDependencies.impl;

import edu.kit.ipd.sdq.kamp4iec.model.ComponentInternalDependencies.ComponentInternalDependenciesPackage;
import edu.kit.ipd.sdq.kamp4iec.model.ComponentInternalDependencies.FunctionblockDependency;
import edu.kit.ipd.sdq.kamp4iec.model.ComponentInternalDependencies.MethodDependency;

import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.FunctionBlock;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.FunctionblockResource;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Functionblock Dependency</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.ComponentInternalDependencies.impl.FunctionblockDependencyImpl#getProvidedFunctionBlock <em>Provided Function Block</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.ComponentInternalDependencies.impl.FunctionblockDependencyImpl#getRequiredResource <em>Required Resource</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.ComponentInternalDependencies.impl.FunctionblockDependencyImpl#getHasMethodDependency <em>Has Method Dependency</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FunctionblockDependencyImpl extends MinimalEObjectImpl.Container implements FunctionblockDependency {
	/**
	 * The cached value of the '{@link #getProvidedFunctionBlock() <em>Provided Function Block</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvidedFunctionBlock()
	 * @generated
	 * @ordered
	 */
	protected FunctionBlock providedFunctionBlock;

	/**
	 * The cached value of the '{@link #getRequiredResource() <em>Required Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredResource()
	 * @generated
	 * @ordered
	 */
	protected FunctionblockResource requiredResource;

	/**
	 * The cached value of the '{@link #getHasMethodDependency() <em>Has Method Dependency</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasMethodDependency()
	 * @generated
	 * @ordered
	 */
	protected EList<MethodDependency> hasMethodDependency;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionblockDependencyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentInternalDependenciesPackage.Literals.FUNCTIONBLOCK_DEPENDENCY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionBlock getProvidedFunctionBlock() {
		if (providedFunctionBlock != null && providedFunctionBlock.eIsProxy()) {
			InternalEObject oldProvidedFunctionBlock = (InternalEObject)providedFunctionBlock;
			providedFunctionBlock = (FunctionBlock)eResolveProxy(oldProvidedFunctionBlock);
			if (providedFunctionBlock != oldProvidedFunctionBlock) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComponentInternalDependenciesPackage.FUNCTIONBLOCK_DEPENDENCY__PROVIDED_FUNCTION_BLOCK, oldProvidedFunctionBlock, providedFunctionBlock));
			}
		}
		return providedFunctionBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionBlock basicGetProvidedFunctionBlock() {
		return providedFunctionBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProvidedFunctionBlock(FunctionBlock newProvidedFunctionBlock) {
		FunctionBlock oldProvidedFunctionBlock = providedFunctionBlock;
		providedFunctionBlock = newProvidedFunctionBlock;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentInternalDependenciesPackage.FUNCTIONBLOCK_DEPENDENCY__PROVIDED_FUNCTION_BLOCK, oldProvidedFunctionBlock, providedFunctionBlock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionblockResource getRequiredResource() {
		if (requiredResource != null && requiredResource.eIsProxy()) {
			InternalEObject oldRequiredResource = (InternalEObject)requiredResource;
			requiredResource = (FunctionblockResource)eResolveProxy(oldRequiredResource);
			if (requiredResource != oldRequiredResource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComponentInternalDependenciesPackage.FUNCTIONBLOCK_DEPENDENCY__REQUIRED_RESOURCE, oldRequiredResource, requiredResource));
			}
		}
		return requiredResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionblockResource basicGetRequiredResource() {
		return requiredResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequiredResource(FunctionblockResource newRequiredResource) {
		FunctionblockResource oldRequiredResource = requiredResource;
		requiredResource = newRequiredResource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentInternalDependenciesPackage.FUNCTIONBLOCK_DEPENDENCY__REQUIRED_RESOURCE, oldRequiredResource, requiredResource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MethodDependency> getHasMethodDependency() {
		if (hasMethodDependency == null) {
			hasMethodDependency = new EObjectContainmentEList<MethodDependency>(MethodDependency.class, this, ComponentInternalDependenciesPackage.FUNCTIONBLOCK_DEPENDENCY__HAS_METHOD_DEPENDENCY);
		}
		return hasMethodDependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ComponentInternalDependenciesPackage.FUNCTIONBLOCK_DEPENDENCY__HAS_METHOD_DEPENDENCY:
				return ((InternalEList<?>)getHasMethodDependency()).basicRemove(otherEnd, msgs);
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
			case ComponentInternalDependenciesPackage.FUNCTIONBLOCK_DEPENDENCY__PROVIDED_FUNCTION_BLOCK:
				if (resolve) return getProvidedFunctionBlock();
				return basicGetProvidedFunctionBlock();
			case ComponentInternalDependenciesPackage.FUNCTIONBLOCK_DEPENDENCY__REQUIRED_RESOURCE:
				if (resolve) return getRequiredResource();
				return basicGetRequiredResource();
			case ComponentInternalDependenciesPackage.FUNCTIONBLOCK_DEPENDENCY__HAS_METHOD_DEPENDENCY:
				return getHasMethodDependency();
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
			case ComponentInternalDependenciesPackage.FUNCTIONBLOCK_DEPENDENCY__PROVIDED_FUNCTION_BLOCK:
				setProvidedFunctionBlock((FunctionBlock)newValue);
				return;
			case ComponentInternalDependenciesPackage.FUNCTIONBLOCK_DEPENDENCY__REQUIRED_RESOURCE:
				setRequiredResource((FunctionblockResource)newValue);
				return;
			case ComponentInternalDependenciesPackage.FUNCTIONBLOCK_DEPENDENCY__HAS_METHOD_DEPENDENCY:
				getHasMethodDependency().clear();
				getHasMethodDependency().addAll((Collection<? extends MethodDependency>)newValue);
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
			case ComponentInternalDependenciesPackage.FUNCTIONBLOCK_DEPENDENCY__PROVIDED_FUNCTION_BLOCK:
				setProvidedFunctionBlock((FunctionBlock)null);
				return;
			case ComponentInternalDependenciesPackage.FUNCTIONBLOCK_DEPENDENCY__REQUIRED_RESOURCE:
				setRequiredResource((FunctionblockResource)null);
				return;
			case ComponentInternalDependenciesPackage.FUNCTIONBLOCK_DEPENDENCY__HAS_METHOD_DEPENDENCY:
				getHasMethodDependency().clear();
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
			case ComponentInternalDependenciesPackage.FUNCTIONBLOCK_DEPENDENCY__PROVIDED_FUNCTION_BLOCK:
				return providedFunctionBlock != null;
			case ComponentInternalDependenciesPackage.FUNCTIONBLOCK_DEPENDENCY__REQUIRED_RESOURCE:
				return requiredResource != null;
			case ComponentInternalDependenciesPackage.FUNCTIONBLOCK_DEPENDENCY__HAS_METHOD_DEPENDENCY:
				return hasMethodDependency != null && !hasMethodDependency.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FunctionblockDependencyImpl
