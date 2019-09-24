/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Component;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.ComponentRepositoryPackage;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.Interface;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.Module;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.ModuleRepositoryPackage;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.StructureRepository.Structure;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.StructureRepository.StructureRepositoryPackage;

import edu.kit.ipd.sdq.kamp4aps.model.basic.impl.EntityImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.ComponentImpl#getConnectedInterfaces <em>Connected Interfaces</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.ComponentImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.ComponentImpl#getParentModule <em>Parent Module</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentImpl extends EntityImpl implements Component {
	/**
	 * The cached value of the '{@link #getConnectedInterfaces() <em>Connected Interfaces</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectedInterfaces()
	 * @generated
	 * @ordered
	 */
	protected EList<Interface> connectedInterfaces;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentRepositoryPackage.Literals.COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Interface> getConnectedInterfaces() {
		if (connectedInterfaces == null) {
			connectedInterfaces = new EObjectResolvingEList<Interface>(Interface.class, this, ComponentRepositoryPackage.COMPONENT__CONNECTED_INTERFACES);
		}
		return connectedInterfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Structure getParent() {
		if (eContainerFeatureID() != ComponentRepositoryPackage.COMPONENT__PARENT) return null;
		return (Structure)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(Structure newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, ComponentRepositoryPackage.COMPONENT__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(Structure newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != ComponentRepositoryPackage.COMPONENT__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, StructureRepositoryPackage.STRUCTURE__COMPONENTS, Structure.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentRepositoryPackage.COMPONENT__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Module getParentModule() {
		if (eContainerFeatureID() != ComponentRepositoryPackage.COMPONENT__PARENT_MODULE) return null;
		return (Module)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentModule(Module newParentModule, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParentModule, ComponentRepositoryPackage.COMPONENT__PARENT_MODULE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentModule(Module newParentModule) {
		if (newParentModule != eInternalContainer() || (eContainerFeatureID() != ComponentRepositoryPackage.COMPONENT__PARENT_MODULE && newParentModule != null)) {
			if (EcoreUtil.isAncestor(this, newParentModule))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParentModule != null)
				msgs = ((InternalEObject)newParentModule).eInverseAdd(this, ModuleRepositoryPackage.MODULE__COMPONENTS, Module.class, msgs);
			msgs = basicSetParentModule(newParentModule, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentRepositoryPackage.COMPONENT__PARENT_MODULE, newParentModule, newParentModule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ComponentRepositoryPackage.COMPONENT__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((Structure)otherEnd, msgs);
			case ComponentRepositoryPackage.COMPONENT__PARENT_MODULE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParentModule((Module)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ComponentRepositoryPackage.COMPONENT__PARENT:
				return basicSetParent(null, msgs);
			case ComponentRepositoryPackage.COMPONENT__PARENT_MODULE:
				return basicSetParentModule(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case ComponentRepositoryPackage.COMPONENT__PARENT:
				return eInternalContainer().eInverseRemove(this, StructureRepositoryPackage.STRUCTURE__COMPONENTS, Structure.class, msgs);
			case ComponentRepositoryPackage.COMPONENT__PARENT_MODULE:
				return eInternalContainer().eInverseRemove(this, ModuleRepositoryPackage.MODULE__COMPONENTS, Module.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ComponentRepositoryPackage.COMPONENT__CONNECTED_INTERFACES:
				return getConnectedInterfaces();
			case ComponentRepositoryPackage.COMPONENT__PARENT:
				return getParent();
			case ComponentRepositoryPackage.COMPONENT__PARENT_MODULE:
				return getParentModule();
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
			case ComponentRepositoryPackage.COMPONENT__CONNECTED_INTERFACES:
				getConnectedInterfaces().clear();
				getConnectedInterfaces().addAll((Collection<? extends Interface>)newValue);
				return;
			case ComponentRepositoryPackage.COMPONENT__PARENT:
				setParent((Structure)newValue);
				return;
			case ComponentRepositoryPackage.COMPONENT__PARENT_MODULE:
				setParentModule((Module)newValue);
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
			case ComponentRepositoryPackage.COMPONENT__CONNECTED_INTERFACES:
				getConnectedInterfaces().clear();
				return;
			case ComponentRepositoryPackage.COMPONENT__PARENT:
				setParent((Structure)null);
				return;
			case ComponentRepositoryPackage.COMPONENT__PARENT_MODULE:
				setParentModule((Module)null);
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
			case ComponentRepositoryPackage.COMPONENT__CONNECTED_INTERFACES:
				return connectedInterfaces != null && !connectedInterfaces.isEmpty();
			case ComponentRepositoryPackage.COMPONENT__PARENT:
				return getParent() != null;
			case ComponentRepositoryPackage.COMPONENT__PARENT_MODULE:
				return getParentModule() != null;
		}
		return super.eIsSet(featureID);
	}

} //ComponentImpl
