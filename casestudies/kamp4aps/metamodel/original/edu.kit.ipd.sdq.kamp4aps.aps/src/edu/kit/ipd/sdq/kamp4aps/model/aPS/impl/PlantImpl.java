/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.aPS.impl;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.ComponentRepository;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.InterfaceRepository;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.ModuleRepository;

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

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Plant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.impl.PlantImpl#getPlantName <em>Plant Name</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.impl.PlantImpl#getStructures <em>Structures</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.impl.PlantImpl#getInterfaceRepository <em>Interface Repository</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.impl.PlantImpl#getComponentRepository <em>Component Repository</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.impl.PlantImpl#getModuleRepository <em>Module Repository</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PlantImpl extends EntityImpl implements Plant {
	/**
	 * The default value of the '{@link #getPlantName() <em>Plant Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlantName()
	 * @generated
	 * @ordered
	 */
	protected static final String PLANT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPlantName() <em>Plant Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlantName()
	 * @generated
	 * @ordered
	 */
	protected String plantName = PLANT_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStructures() <em>Structures</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructures()
	 * @generated
	 * @ordered
	 */
	protected EList<Structure> structures;

	/**
	 * The cached value of the '{@link #getInterfaceRepository() <em>Interface Repository</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaceRepository()
	 * @generated
	 * @ordered
	 */
	protected InterfaceRepository interfaceRepository;

	/**
	 * The cached value of the '{@link #getComponentRepository() <em>Component Repository</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentRepository()
	 * @generated
	 * @ordered
	 */
	protected ComponentRepository componentRepository;

	/**
	 * The cached value of the '{@link #getModuleRepository() <em>Module Repository</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModuleRepository()
	 * @generated
	 * @ordered
	 */
	protected ModuleRepository moduleRepository;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlantImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return apsPackage.Literals.PLANT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPlantName() {
		return plantName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlantName(String newPlantName) {
		String oldPlantName = plantName;
		plantName = newPlantName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, apsPackage.PLANT__PLANT_NAME, oldPlantName, plantName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Structure> getStructures() {
		if (structures == null) {
			structures = new EObjectContainmentWithInverseEList<Structure>(Structure.class, this, apsPackage.PLANT__STRUCTURES, StructureRepositoryPackage.STRUCTURE__PARENT_PLANT);
		}
		return structures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceRepository getInterfaceRepository() {
		return interfaceRepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInterfaceRepository(InterfaceRepository newInterfaceRepository, NotificationChain msgs) {
		InterfaceRepository oldInterfaceRepository = interfaceRepository;
		interfaceRepository = newInterfaceRepository;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, apsPackage.PLANT__INTERFACE_REPOSITORY, oldInterfaceRepository, newInterfaceRepository);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterfaceRepository(InterfaceRepository newInterfaceRepository) {
		if (newInterfaceRepository != interfaceRepository) {
			NotificationChain msgs = null;
			if (interfaceRepository != null)
				msgs = ((InternalEObject)interfaceRepository).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - apsPackage.PLANT__INTERFACE_REPOSITORY, null, msgs);
			if (newInterfaceRepository != null)
				msgs = ((InternalEObject)newInterfaceRepository).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - apsPackage.PLANT__INTERFACE_REPOSITORY, null, msgs);
			msgs = basicSetInterfaceRepository(newInterfaceRepository, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, apsPackage.PLANT__INTERFACE_REPOSITORY, newInterfaceRepository, newInterfaceRepository));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentRepository getComponentRepository() {
		return componentRepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComponentRepository(ComponentRepository newComponentRepository, NotificationChain msgs) {
		ComponentRepository oldComponentRepository = componentRepository;
		componentRepository = newComponentRepository;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, apsPackage.PLANT__COMPONENT_REPOSITORY, oldComponentRepository, newComponentRepository);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponentRepository(ComponentRepository newComponentRepository) {
		if (newComponentRepository != componentRepository) {
			NotificationChain msgs = null;
			if (componentRepository != null)
				msgs = ((InternalEObject)componentRepository).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - apsPackage.PLANT__COMPONENT_REPOSITORY, null, msgs);
			if (newComponentRepository != null)
				msgs = ((InternalEObject)newComponentRepository).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - apsPackage.PLANT__COMPONENT_REPOSITORY, null, msgs);
			msgs = basicSetComponentRepository(newComponentRepository, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, apsPackage.PLANT__COMPONENT_REPOSITORY, newComponentRepository, newComponentRepository));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModuleRepository getModuleRepository() {
		return moduleRepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModuleRepository(ModuleRepository newModuleRepository, NotificationChain msgs) {
		ModuleRepository oldModuleRepository = moduleRepository;
		moduleRepository = newModuleRepository;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, apsPackage.PLANT__MODULE_REPOSITORY, oldModuleRepository, newModuleRepository);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModuleRepository(ModuleRepository newModuleRepository) {
		if (newModuleRepository != moduleRepository) {
			NotificationChain msgs = null;
			if (moduleRepository != null)
				msgs = ((InternalEObject)moduleRepository).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - apsPackage.PLANT__MODULE_REPOSITORY, null, msgs);
			if (newModuleRepository != null)
				msgs = ((InternalEObject)newModuleRepository).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - apsPackage.PLANT__MODULE_REPOSITORY, null, msgs);
			msgs = basicSetModuleRepository(newModuleRepository, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, apsPackage.PLANT__MODULE_REPOSITORY, newModuleRepository, newModuleRepository));
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
			case apsPackage.PLANT__STRUCTURES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getStructures()).basicAdd(otherEnd, msgs);
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
			case apsPackage.PLANT__STRUCTURES:
				return ((InternalEList<?>)getStructures()).basicRemove(otherEnd, msgs);
			case apsPackage.PLANT__INTERFACE_REPOSITORY:
				return basicSetInterfaceRepository(null, msgs);
			case apsPackage.PLANT__COMPONENT_REPOSITORY:
				return basicSetComponentRepository(null, msgs);
			case apsPackage.PLANT__MODULE_REPOSITORY:
				return basicSetModuleRepository(null, msgs);
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
			case apsPackage.PLANT__PLANT_NAME:
				return getPlantName();
			case apsPackage.PLANT__STRUCTURES:
				return getStructures();
			case apsPackage.PLANT__INTERFACE_REPOSITORY:
				return getInterfaceRepository();
			case apsPackage.PLANT__COMPONENT_REPOSITORY:
				return getComponentRepository();
			case apsPackage.PLANT__MODULE_REPOSITORY:
				return getModuleRepository();
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
			case apsPackage.PLANT__PLANT_NAME:
				setPlantName((String)newValue);
				return;
			case apsPackage.PLANT__STRUCTURES:
				getStructures().clear();
				getStructures().addAll((Collection<? extends Structure>)newValue);
				return;
			case apsPackage.PLANT__INTERFACE_REPOSITORY:
				setInterfaceRepository((InterfaceRepository)newValue);
				return;
			case apsPackage.PLANT__COMPONENT_REPOSITORY:
				setComponentRepository((ComponentRepository)newValue);
				return;
			case apsPackage.PLANT__MODULE_REPOSITORY:
				setModuleRepository((ModuleRepository)newValue);
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
			case apsPackage.PLANT__PLANT_NAME:
				setPlantName(PLANT_NAME_EDEFAULT);
				return;
			case apsPackage.PLANT__STRUCTURES:
				getStructures().clear();
				return;
			case apsPackage.PLANT__INTERFACE_REPOSITORY:
				setInterfaceRepository((InterfaceRepository)null);
				return;
			case apsPackage.PLANT__COMPONENT_REPOSITORY:
				setComponentRepository((ComponentRepository)null);
				return;
			case apsPackage.PLANT__MODULE_REPOSITORY:
				setModuleRepository((ModuleRepository)null);
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
			case apsPackage.PLANT__PLANT_NAME:
				return PLANT_NAME_EDEFAULT == null ? plantName != null : !PLANT_NAME_EDEFAULT.equals(plantName);
			case apsPackage.PLANT__STRUCTURES:
				return structures != null && !structures.isEmpty();
			case apsPackage.PLANT__INTERFACE_REPOSITORY:
				return interfaceRepository != null;
			case apsPackage.PLANT__COMPONENT_REPOSITORY:
				return componentRepository != null;
			case apsPackage.PLANT__MODULE_REPOSITORY:
				return moduleRepository != null;
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
		result.append(" (PlantName: ");
		result.append(plantName);
		result.append(')');
		return result.toString();
	}

} //PlantImpl
