/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.impl;

import edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.KAMP4aPSModificationmarksPackage;
import edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ModifySensor;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Sensor;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.PhysicalConnection;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.SignalInterface;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Modify Sensor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.impl.ModifySensorImpl#getModifySignalInterfaces <em>Modify Signal Interfaces</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.impl.ModifySensorImpl#getModifyPhysicalConnections <em>Modify Physical Connections</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModifySensorImpl extends ModifyComponentImpl<Sensor> implements ModifySensor {
	/**
	 * The cached value of the '{@link #getModifySignalInterfaces() <em>Modify Signal Interfaces</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModifySignalInterfaces()
	 * @generated
	 * @ordered
	 */
	protected EList<SignalInterface> modifySignalInterfaces;

	/**
	 * The cached value of the '{@link #getModifyPhysicalConnections() <em>Modify Physical Connections</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModifyPhysicalConnections()
	 * @generated
	 * @ordered
	 */
	protected EList<PhysicalConnection> modifyPhysicalConnections;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModifySensorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KAMP4aPSModificationmarksPackage.Literals.MODIFY_SENSOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SignalInterface> getModifySignalInterfaces() {
		if (modifySignalInterfaces == null) {
			modifySignalInterfaces = new EObjectContainmentEList<SignalInterface>(SignalInterface.class, this, KAMP4aPSModificationmarksPackage.MODIFY_SENSOR__MODIFY_SIGNAL_INTERFACES);
		}
		return modifySignalInterfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PhysicalConnection> getModifyPhysicalConnections() {
		if (modifyPhysicalConnections == null) {
			modifyPhysicalConnections = new EObjectContainmentEList<PhysicalConnection>(PhysicalConnection.class, this, KAMP4aPSModificationmarksPackage.MODIFY_SENSOR__MODIFY_PHYSICAL_CONNECTIONS);
		}
		return modifyPhysicalConnections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KAMP4aPSModificationmarksPackage.MODIFY_SENSOR__MODIFY_SIGNAL_INTERFACES:
				return ((InternalEList<?>)getModifySignalInterfaces()).basicRemove(otherEnd, msgs);
			case KAMP4aPSModificationmarksPackage.MODIFY_SENSOR__MODIFY_PHYSICAL_CONNECTIONS:
				return ((InternalEList<?>)getModifyPhysicalConnections()).basicRemove(otherEnd, msgs);
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
			case KAMP4aPSModificationmarksPackage.MODIFY_SENSOR__MODIFY_SIGNAL_INTERFACES:
				return getModifySignalInterfaces();
			case KAMP4aPSModificationmarksPackage.MODIFY_SENSOR__MODIFY_PHYSICAL_CONNECTIONS:
				return getModifyPhysicalConnections();
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
			case KAMP4aPSModificationmarksPackage.MODIFY_SENSOR__MODIFY_SIGNAL_INTERFACES:
				getModifySignalInterfaces().clear();
				getModifySignalInterfaces().addAll((Collection<? extends SignalInterface>)newValue);
				return;
			case KAMP4aPSModificationmarksPackage.MODIFY_SENSOR__MODIFY_PHYSICAL_CONNECTIONS:
				getModifyPhysicalConnections().clear();
				getModifyPhysicalConnections().addAll((Collection<? extends PhysicalConnection>)newValue);
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
			case KAMP4aPSModificationmarksPackage.MODIFY_SENSOR__MODIFY_SIGNAL_INTERFACES:
				getModifySignalInterfaces().clear();
				return;
			case KAMP4aPSModificationmarksPackage.MODIFY_SENSOR__MODIFY_PHYSICAL_CONNECTIONS:
				getModifyPhysicalConnections().clear();
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
			case KAMP4aPSModificationmarksPackage.MODIFY_SENSOR__MODIFY_SIGNAL_INTERFACES:
				return modifySignalInterfaces != null && !modifySignalInterfaces.isEmpty();
			case KAMP4aPSModificationmarksPackage.MODIFY_SENSOR__MODIFY_PHYSICAL_CONNECTIONS:
				return modifyPhysicalConnections != null && !modifyPhysicalConnections.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ModifySensorImpl
