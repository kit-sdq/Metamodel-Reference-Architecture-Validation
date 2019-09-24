/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.aPS.ElectronicComponents.impl;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.ElectronicComponents.ElectronicComponentsPackage;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.ElectronicComponents.MicroSwitch;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.MicroswitchModule;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.ModuleRepositoryPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Micro Switch</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ElectronicComponents.impl.MicroSwitchImpl#getMsModule <em>Ms Module</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MicroSwitchImpl extends SwitchImpl implements MicroSwitch {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MicroSwitchImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ElectronicComponentsPackage.Literals.MICRO_SWITCH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MicroswitchModule getMsModule() {
		if (eContainerFeatureID() != ElectronicComponentsPackage.MICRO_SWITCH__MS_MODULE) return null;
		return (MicroswitchModule)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMsModule(MicroswitchModule newMsModule, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newMsModule, ElectronicComponentsPackage.MICRO_SWITCH__MS_MODULE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMsModule(MicroswitchModule newMsModule) {
		if (newMsModule != eInternalContainer() || (eContainerFeatureID() != ElectronicComponentsPackage.MICRO_SWITCH__MS_MODULE && newMsModule != null)) {
			if (EcoreUtil.isAncestor(this, newMsModule))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newMsModule != null)
				msgs = ((InternalEObject)newMsModule).eInverseAdd(this, ModuleRepositoryPackage.MICROSWITCH_MODULE__SWITCH, MicroswitchModule.class, msgs);
			msgs = basicSetMsModule(newMsModule, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElectronicComponentsPackage.MICRO_SWITCH__MS_MODULE, newMsModule, newMsModule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ElectronicComponentsPackage.MICRO_SWITCH__MS_MODULE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetMsModule((MicroswitchModule)otherEnd, msgs);
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
			case ElectronicComponentsPackage.MICRO_SWITCH__MS_MODULE:
				return basicSetMsModule(null, msgs);
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
			case ElectronicComponentsPackage.MICRO_SWITCH__MS_MODULE:
				return eInternalContainer().eInverseRemove(this, ModuleRepositoryPackage.MICROSWITCH_MODULE__SWITCH, MicroswitchModule.class, msgs);
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
			case ElectronicComponentsPackage.MICRO_SWITCH__MS_MODULE:
				return getMsModule();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ElectronicComponentsPackage.MICRO_SWITCH__MS_MODULE:
				setMsModule((MicroswitchModule)newValue);
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
			case ElectronicComponentsPackage.MICRO_SWITCH__MS_MODULE:
				setMsModule((MicroswitchModule)null);
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
			case ElectronicComponentsPackage.MICRO_SWITCH__MS_MODULE:
				return getMsModule() != null;
		}
		return super.eIsSet(featureID);
	}

} //MicroSwitchImpl
