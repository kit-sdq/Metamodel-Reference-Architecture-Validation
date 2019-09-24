/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.aPS.StructureRepository.impl;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Component;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.ComponentRepositoryPackage;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.Module;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.Plant;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.StructureRepository.Structure;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.StructureRepository.StructureRepositoryPackage;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.apsPackage;

import edu.kit.ipd.sdq.kamp4aps.model.basic.impl.EntityImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Structure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.StructureRepository.impl.StructureImpl#getParentPlant <em>Parent Plant</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.StructureRepository.impl.StructureImpl#getModules <em>Modules</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.StructureRepository.impl.StructureImpl#getComponents <em>Components</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StructureImpl extends EntityImpl implements Structure {
	/**
	 * The cached value of the '{@link #getModules() <em>Modules</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModules()
	 * @generated
	 * @ordered
	 */
	protected EList<Module> modules;

	/**
	 * The cached value of the '{@link #getComponents() <em>Components</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<Component> components;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StructureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StructureRepositoryPackage.Literals.STRUCTURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Plant getParentPlant() {
		if (eContainerFeatureID() != StructureRepositoryPackage.STRUCTURE__PARENT_PLANT) return null;
		return (Plant)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentPlant(Plant newParentPlant, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParentPlant, StructureRepositoryPackage.STRUCTURE__PARENT_PLANT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentPlant(Plant newParentPlant) {
		if (newParentPlant != eInternalContainer() || (eContainerFeatureID() != StructureRepositoryPackage.STRUCTURE__PARENT_PLANT && newParentPlant != null)) {
			if (EcoreUtil.isAncestor(this, newParentPlant))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParentPlant != null)
				msgs = ((InternalEObject)newParentPlant).eInverseAdd(this, apsPackage.PLANT__STRUCTURES, Plant.class, msgs);
			msgs = basicSetParentPlant(newParentPlant, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructureRepositoryPackage.STRUCTURE__PARENT_PLANT, newParentPlant, newParentPlant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Module> getModules() {
		if (modules == null) {
			modules = new EObjectContainmentEList<Module>(Module.class, this, StructureRepositoryPackage.STRUCTURE__MODULES);
		}
		return modules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Component> getComponents() {
		if (components == null) {
			components = new EObjectContainmentWithInverseEList<Component>(Component.class, this, StructureRepositoryPackage.STRUCTURE__COMPONENTS, ComponentRepositoryPackage.COMPONENT__PARENT);
		}
		return components;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StructureRepositoryPackage.STRUCTURE__PARENT_PLANT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParentPlant((Plant)otherEnd, msgs);
			case StructureRepositoryPackage.STRUCTURE__COMPONENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getComponents()).basicAdd(otherEnd, msgs);
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
			case StructureRepositoryPackage.STRUCTURE__PARENT_PLANT:
				return basicSetParentPlant(null, msgs);
			case StructureRepositoryPackage.STRUCTURE__MODULES:
				return ((InternalEList<?>)getModules()).basicRemove(otherEnd, msgs);
			case StructureRepositoryPackage.STRUCTURE__COMPONENTS:
				return ((InternalEList<?>)getComponents()).basicRemove(otherEnd, msgs);
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
			case StructureRepositoryPackage.STRUCTURE__PARENT_PLANT:
				return eInternalContainer().eInverseRemove(this, apsPackage.PLANT__STRUCTURES, Plant.class, msgs);
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
			case StructureRepositoryPackage.STRUCTURE__PARENT_PLANT:
				return getParentPlant();
			case StructureRepositoryPackage.STRUCTURE__MODULES:
				return getModules();
			case StructureRepositoryPackage.STRUCTURE__COMPONENTS:
				return getComponents();
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
			case StructureRepositoryPackage.STRUCTURE__PARENT_PLANT:
				setParentPlant((Plant)newValue);
				return;
			case StructureRepositoryPackage.STRUCTURE__MODULES:
				getModules().clear();
				getModules().addAll((Collection<? extends Module>)newValue);
				return;
			case StructureRepositoryPackage.STRUCTURE__COMPONENTS:
				getComponents().clear();
				getComponents().addAll((Collection<? extends Component>)newValue);
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
			case StructureRepositoryPackage.STRUCTURE__PARENT_PLANT:
				setParentPlant((Plant)null);
				return;
			case StructureRepositoryPackage.STRUCTURE__MODULES:
				getModules().clear();
				return;
			case StructureRepositoryPackage.STRUCTURE__COMPONENTS:
				getComponents().clear();
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
			case StructureRepositoryPackage.STRUCTURE__PARENT_PLANT:
				return getParentPlant() != null;
			case StructureRepositoryPackage.STRUCTURE__MODULES:
				return modules != null && !modules.isEmpty();
			case StructureRepositoryPackage.STRUCTURE__COMPONENTS:
				return components != null && !components.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //StructureImpl
