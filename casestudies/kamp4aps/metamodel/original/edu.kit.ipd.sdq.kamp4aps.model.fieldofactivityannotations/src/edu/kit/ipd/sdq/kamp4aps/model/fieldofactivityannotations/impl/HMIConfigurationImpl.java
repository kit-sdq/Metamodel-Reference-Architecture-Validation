/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Component;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.Interface;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.Module;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.StructureRepository.Structure;

import edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.HMIConfiguration;
import edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.HMISpecification;
import edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.KAMP4aPSFieldofactivityannotationsPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HMI Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.HMIConfigurationImpl#getName <em>Name</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.HMIConfigurationImpl#getComponents <em>Components</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.HMIConfigurationImpl#getModules <em>Modules</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.HMIConfigurationImpl#getInterfaces <em>Interfaces</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.HMIConfigurationImpl#getStructures <em>Structures</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.HMIConfigurationImpl#getParent <em>Parent</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HMIConfigurationImpl extends MinimalEObjectImpl.Container implements HMIConfiguration {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getComponents() <em>Components</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<Component> components;

	/**
	 * The cached value of the '{@link #getModules() <em>Modules</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModules()
	 * @generated
	 * @ordered
	 */
	protected EList<Module> modules;

	/**
	 * The cached value of the '{@link #getInterfaces() <em>Interfaces</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaces()
	 * @generated
	 * @ordered
	 */
	protected EList<Interface> interfaces;

	/**
	 * The cached value of the '{@link #getStructures() <em>Structures</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructures()
	 * @generated
	 * @ordered
	 */
	protected EList<Structure> structures;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HMIConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KAMP4aPSFieldofactivityannotationsPackage.Literals.HMI_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KAMP4aPSFieldofactivityannotationsPackage.HMI_CONFIGURATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Component> getComponents() {
		if (components == null) {
			components = new EObjectResolvingEList<Component>(Component.class, this, KAMP4aPSFieldofactivityannotationsPackage.HMI_CONFIGURATION__COMPONENTS);
		}
		return components;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Module> getModules() {
		if (modules == null) {
			modules = new EObjectResolvingEList<Module>(Module.class, this, KAMP4aPSFieldofactivityannotationsPackage.HMI_CONFIGURATION__MODULES);
		}
		return modules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Interface> getInterfaces() {
		if (interfaces == null) {
			interfaces = new EObjectResolvingEList<Interface>(Interface.class, this, KAMP4aPSFieldofactivityannotationsPackage.HMI_CONFIGURATION__INTERFACES);
		}
		return interfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Structure> getStructures() {
		if (structures == null) {
			structures = new EObjectResolvingEList<Structure>(Structure.class, this, KAMP4aPSFieldofactivityannotationsPackage.HMI_CONFIGURATION__STRUCTURES);
		}
		return structures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HMISpecification getParent() {
		if (eContainerFeatureID() != KAMP4aPSFieldofactivityannotationsPackage.HMI_CONFIGURATION__PARENT) return null;
		return (HMISpecification)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(HMISpecification newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, KAMP4aPSFieldofactivityannotationsPackage.HMI_CONFIGURATION__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(HMISpecification newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != KAMP4aPSFieldofactivityannotationsPackage.HMI_CONFIGURATION__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, KAMP4aPSFieldofactivityannotationsPackage.HMI_SPECIFICATION__HMI_CONFIG, HMISpecification.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KAMP4aPSFieldofactivityannotationsPackage.HMI_CONFIGURATION__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KAMP4aPSFieldofactivityannotationsPackage.HMI_CONFIGURATION__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((HMISpecification)otherEnd, msgs);
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
			case KAMP4aPSFieldofactivityannotationsPackage.HMI_CONFIGURATION__PARENT:
				return basicSetParent(null, msgs);
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
			case KAMP4aPSFieldofactivityannotationsPackage.HMI_CONFIGURATION__PARENT:
				return eInternalContainer().eInverseRemove(this, KAMP4aPSFieldofactivityannotationsPackage.HMI_SPECIFICATION__HMI_CONFIG, HMISpecification.class, msgs);
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
			case KAMP4aPSFieldofactivityannotationsPackage.HMI_CONFIGURATION__NAME:
				return getName();
			case KAMP4aPSFieldofactivityannotationsPackage.HMI_CONFIGURATION__COMPONENTS:
				return getComponents();
			case KAMP4aPSFieldofactivityannotationsPackage.HMI_CONFIGURATION__MODULES:
				return getModules();
			case KAMP4aPSFieldofactivityannotationsPackage.HMI_CONFIGURATION__INTERFACES:
				return getInterfaces();
			case KAMP4aPSFieldofactivityannotationsPackage.HMI_CONFIGURATION__STRUCTURES:
				return getStructures();
			case KAMP4aPSFieldofactivityannotationsPackage.HMI_CONFIGURATION__PARENT:
				return getParent();
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
			case KAMP4aPSFieldofactivityannotationsPackage.HMI_CONFIGURATION__NAME:
				setName((String)newValue);
				return;
			case KAMP4aPSFieldofactivityannotationsPackage.HMI_CONFIGURATION__COMPONENTS:
				getComponents().clear();
				getComponents().addAll((Collection<? extends Component>)newValue);
				return;
			case KAMP4aPSFieldofactivityannotationsPackage.HMI_CONFIGURATION__MODULES:
				getModules().clear();
				getModules().addAll((Collection<? extends Module>)newValue);
				return;
			case KAMP4aPSFieldofactivityannotationsPackage.HMI_CONFIGURATION__INTERFACES:
				getInterfaces().clear();
				getInterfaces().addAll((Collection<? extends Interface>)newValue);
				return;
			case KAMP4aPSFieldofactivityannotationsPackage.HMI_CONFIGURATION__STRUCTURES:
				getStructures().clear();
				getStructures().addAll((Collection<? extends Structure>)newValue);
				return;
			case KAMP4aPSFieldofactivityannotationsPackage.HMI_CONFIGURATION__PARENT:
				setParent((HMISpecification)newValue);
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
			case KAMP4aPSFieldofactivityannotationsPackage.HMI_CONFIGURATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case KAMP4aPSFieldofactivityannotationsPackage.HMI_CONFIGURATION__COMPONENTS:
				getComponents().clear();
				return;
			case KAMP4aPSFieldofactivityannotationsPackage.HMI_CONFIGURATION__MODULES:
				getModules().clear();
				return;
			case KAMP4aPSFieldofactivityannotationsPackage.HMI_CONFIGURATION__INTERFACES:
				getInterfaces().clear();
				return;
			case KAMP4aPSFieldofactivityannotationsPackage.HMI_CONFIGURATION__STRUCTURES:
				getStructures().clear();
				return;
			case KAMP4aPSFieldofactivityannotationsPackage.HMI_CONFIGURATION__PARENT:
				setParent((HMISpecification)null);
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
			case KAMP4aPSFieldofactivityannotationsPackage.HMI_CONFIGURATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case KAMP4aPSFieldofactivityannotationsPackage.HMI_CONFIGURATION__COMPONENTS:
				return components != null && !components.isEmpty();
			case KAMP4aPSFieldofactivityannotationsPackage.HMI_CONFIGURATION__MODULES:
				return modules != null && !modules.isEmpty();
			case KAMP4aPSFieldofactivityannotationsPackage.HMI_CONFIGURATION__INTERFACES:
				return interfaces != null && !interfaces.isEmpty();
			case KAMP4aPSFieldofactivityannotationsPackage.HMI_CONFIGURATION__STRUCTURES:
				return structures != null && !structures.isEmpty();
			case KAMP4aPSFieldofactivityannotationsPackage.HMI_CONFIGURATION__PARENT:
				return getParent() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //HMIConfigurationImpl
