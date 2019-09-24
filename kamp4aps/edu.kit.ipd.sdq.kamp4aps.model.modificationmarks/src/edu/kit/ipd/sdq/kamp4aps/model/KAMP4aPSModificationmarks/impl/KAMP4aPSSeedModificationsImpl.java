/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.impl;

import edu.kit.ipd.sdq.kamp.model.modificationmarks.impl.AbstractSeedModificationsImpl;

import edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.KAMP4aPSModificationmarksPackage;
import edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.KAMP4aPSSeedModifications;
import edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ModifyComponent;
import edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ModifyInterface;
import edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ModifyModule;
import edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ModifyStructure;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Component;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.Interface;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.Module;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.StructureRepository.Structure;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>KAMP 4a PS Seed Modifications</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.impl.KAMP4aPSSeedModificationsImpl#getStructureModifications <em>Structure Modifications</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.impl.KAMP4aPSSeedModificationsImpl#getModuleModifications <em>Module Modifications</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.impl.KAMP4aPSSeedModificationsImpl#getComponentModifications <em>Component Modifications</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.impl.KAMP4aPSSeedModificationsImpl#getInterfaceModifications <em>Interface Modifications</em>}</li>
 * </ul>
 *
 * @generated
 */
public class KAMP4aPSSeedModificationsImpl extends AbstractSeedModificationsImpl implements KAMP4aPSSeedModifications {
	/**
	 * The cached value of the '{@link #getStructureModifications() <em>Structure Modifications</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructureModifications()
	 * @generated
	 * @ordered
	 */
	protected EList<ModifyStructure<Structure>> structureModifications;

	/**
	 * The cached value of the '{@link #getModuleModifications() <em>Module Modifications</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModuleModifications()
	 * @generated
	 * @ordered
	 */
	protected EList<ModifyModule<Module>> moduleModifications;

	/**
	 * The cached value of the '{@link #getComponentModifications() <em>Component Modifications</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentModifications()
	 * @generated
	 * @ordered
	 */
	protected EList<ModifyComponent<Component>> componentModifications;

	/**
	 * The cached value of the '{@link #getInterfaceModifications() <em>Interface Modifications</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaceModifications()
	 * @generated
	 * @ordered
	 */
	protected EList<ModifyInterface<Interface>> interfaceModifications;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KAMP4aPSSeedModificationsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KAMP4aPSModificationmarksPackage.Literals.KAMP_4A_PS_SEED_MODIFICATIONS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModifyStructure<Structure>> getStructureModifications() {
		if (structureModifications == null) {
			structureModifications = new EObjectContainmentEList<ModifyStructure<Structure>>(ModifyStructure.class, this, KAMP4aPSModificationmarksPackage.KAMP_4A_PS_SEED_MODIFICATIONS__STRUCTURE_MODIFICATIONS);
		}
		return structureModifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModifyModule<Module>> getModuleModifications() {
		if (moduleModifications == null) {
			moduleModifications = new EObjectContainmentEList<ModifyModule<Module>>(ModifyModule.class, this, KAMP4aPSModificationmarksPackage.KAMP_4A_PS_SEED_MODIFICATIONS__MODULE_MODIFICATIONS);
		}
		return moduleModifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModifyComponent<Component>> getComponentModifications() {
		if (componentModifications == null) {
			componentModifications = new EObjectContainmentEList<ModifyComponent<Component>>(ModifyComponent.class, this, KAMP4aPSModificationmarksPackage.KAMP_4A_PS_SEED_MODIFICATIONS__COMPONENT_MODIFICATIONS);
		}
		return componentModifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModifyInterface<Interface>> getInterfaceModifications() {
		if (interfaceModifications == null) {
			interfaceModifications = new EObjectContainmentEList<ModifyInterface<Interface>>(ModifyInterface.class, this, KAMP4aPSModificationmarksPackage.KAMP_4A_PS_SEED_MODIFICATIONS__INTERFACE_MODIFICATIONS);
		}
		return interfaceModifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KAMP4aPSModificationmarksPackage.KAMP_4A_PS_SEED_MODIFICATIONS__STRUCTURE_MODIFICATIONS:
				return ((InternalEList<?>)getStructureModifications()).basicRemove(otherEnd, msgs);
			case KAMP4aPSModificationmarksPackage.KAMP_4A_PS_SEED_MODIFICATIONS__MODULE_MODIFICATIONS:
				return ((InternalEList<?>)getModuleModifications()).basicRemove(otherEnd, msgs);
			case KAMP4aPSModificationmarksPackage.KAMP_4A_PS_SEED_MODIFICATIONS__COMPONENT_MODIFICATIONS:
				return ((InternalEList<?>)getComponentModifications()).basicRemove(otherEnd, msgs);
			case KAMP4aPSModificationmarksPackage.KAMP_4A_PS_SEED_MODIFICATIONS__INTERFACE_MODIFICATIONS:
				return ((InternalEList<?>)getInterfaceModifications()).basicRemove(otherEnd, msgs);
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
			case KAMP4aPSModificationmarksPackage.KAMP_4A_PS_SEED_MODIFICATIONS__STRUCTURE_MODIFICATIONS:
				return getStructureModifications();
			case KAMP4aPSModificationmarksPackage.KAMP_4A_PS_SEED_MODIFICATIONS__MODULE_MODIFICATIONS:
				return getModuleModifications();
			case KAMP4aPSModificationmarksPackage.KAMP_4A_PS_SEED_MODIFICATIONS__COMPONENT_MODIFICATIONS:
				return getComponentModifications();
			case KAMP4aPSModificationmarksPackage.KAMP_4A_PS_SEED_MODIFICATIONS__INTERFACE_MODIFICATIONS:
				return getInterfaceModifications();
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
			case KAMP4aPSModificationmarksPackage.KAMP_4A_PS_SEED_MODIFICATIONS__STRUCTURE_MODIFICATIONS:
				getStructureModifications().clear();
				getStructureModifications().addAll((Collection<? extends ModifyStructure<Structure>>)newValue);
				return;
			case KAMP4aPSModificationmarksPackage.KAMP_4A_PS_SEED_MODIFICATIONS__MODULE_MODIFICATIONS:
				getModuleModifications().clear();
				getModuleModifications().addAll((Collection<? extends ModifyModule<Module>>)newValue);
				return;
			case KAMP4aPSModificationmarksPackage.KAMP_4A_PS_SEED_MODIFICATIONS__COMPONENT_MODIFICATIONS:
				getComponentModifications().clear();
				getComponentModifications().addAll((Collection<? extends ModifyComponent<Component>>)newValue);
				return;
			case KAMP4aPSModificationmarksPackage.KAMP_4A_PS_SEED_MODIFICATIONS__INTERFACE_MODIFICATIONS:
				getInterfaceModifications().clear();
				getInterfaceModifications().addAll((Collection<? extends ModifyInterface<Interface>>)newValue);
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
			case KAMP4aPSModificationmarksPackage.KAMP_4A_PS_SEED_MODIFICATIONS__STRUCTURE_MODIFICATIONS:
				getStructureModifications().clear();
				return;
			case KAMP4aPSModificationmarksPackage.KAMP_4A_PS_SEED_MODIFICATIONS__MODULE_MODIFICATIONS:
				getModuleModifications().clear();
				return;
			case KAMP4aPSModificationmarksPackage.KAMP_4A_PS_SEED_MODIFICATIONS__COMPONENT_MODIFICATIONS:
				getComponentModifications().clear();
				return;
			case KAMP4aPSModificationmarksPackage.KAMP_4A_PS_SEED_MODIFICATIONS__INTERFACE_MODIFICATIONS:
				getInterfaceModifications().clear();
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
			case KAMP4aPSModificationmarksPackage.KAMP_4A_PS_SEED_MODIFICATIONS__STRUCTURE_MODIFICATIONS:
				return structureModifications != null && !structureModifications.isEmpty();
			case KAMP4aPSModificationmarksPackage.KAMP_4A_PS_SEED_MODIFICATIONS__MODULE_MODIFICATIONS:
				return moduleModifications != null && !moduleModifications.isEmpty();
			case KAMP4aPSModificationmarksPackage.KAMP_4A_PS_SEED_MODIFICATIONS__COMPONENT_MODIFICATIONS:
				return componentModifications != null && !componentModifications.isEmpty();
			case KAMP4aPSModificationmarksPackage.KAMP_4A_PS_SEED_MODIFICATIONS__INTERFACE_MODIFICATIONS:
				return interfaceModifications != null && !interfaceModifications.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //KAMP4aPSSeedModificationsImpl
