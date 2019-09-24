/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.DeploymentContext.impl;

import edu.kit.ipd.sdq.kamp4aps.model.DeploymentContext.ComponentCorrelation;
import edu.kit.ipd.sdq.kamp4aps.model.DeploymentContext.DeploymentContextPackage;
import edu.kit.ipd.sdq.kamp4aps.model.DeploymentContext.VariableMapping;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.Interface;

import edu.kit.ipd.sdq.kamp4iec.model.IECModel.GlobalVariable;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.DeploymentContext.impl.VariableMappingImpl#getName <em>Name</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.DeploymentContext.impl.VariableMappingImpl#getProgramVariable <em>Program Variable</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.DeploymentContext.impl.VariableMappingImpl#getInterfaceDeclaration <em>Interface Declaration</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.DeploymentContext.impl.VariableMappingImpl#getParent <em>Parent</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VariableMappingImpl extends MinimalEObjectImpl.Container implements VariableMapping {
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
	 * The cached value of the '{@link #getProgramVariable() <em>Program Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgramVariable()
	 * @generated
	 * @ordered
	 */
	protected GlobalVariable programVariable;

	/**
	 * The cached value of the '{@link #getInterfaceDeclaration() <em>Interface Declaration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaceDeclaration()
	 * @generated
	 * @ordered
	 */
	protected Interface interfaceDeclaration;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariableMappingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DeploymentContextPackage.Literals.VARIABLE_MAPPING;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DeploymentContextPackage.VARIABLE_MAPPING__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalVariable getProgramVariable() {
		if (programVariable != null && programVariable.eIsProxy()) {
			InternalEObject oldProgramVariable = (InternalEObject)programVariable;
			programVariable = (GlobalVariable)eResolveProxy(oldProgramVariable);
			if (programVariable != oldProgramVariable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DeploymentContextPackage.VARIABLE_MAPPING__PROGRAM_VARIABLE, oldProgramVariable, programVariable));
			}
		}
		return programVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalVariable basicGetProgramVariable() {
		return programVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProgramVariable(GlobalVariable newProgramVariable) {
		GlobalVariable oldProgramVariable = programVariable;
		programVariable = newProgramVariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeploymentContextPackage.VARIABLE_MAPPING__PROGRAM_VARIABLE, oldProgramVariable, programVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface getInterfaceDeclaration() {
		if (interfaceDeclaration != null && interfaceDeclaration.eIsProxy()) {
			InternalEObject oldInterfaceDeclaration = (InternalEObject)interfaceDeclaration;
			interfaceDeclaration = (Interface)eResolveProxy(oldInterfaceDeclaration);
			if (interfaceDeclaration != oldInterfaceDeclaration) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DeploymentContextPackage.VARIABLE_MAPPING__INTERFACE_DECLARATION, oldInterfaceDeclaration, interfaceDeclaration));
			}
		}
		return interfaceDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface basicGetInterfaceDeclaration() {
		return interfaceDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterfaceDeclaration(Interface newInterfaceDeclaration) {
		Interface oldInterfaceDeclaration = interfaceDeclaration;
		interfaceDeclaration = newInterfaceDeclaration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeploymentContextPackage.VARIABLE_MAPPING__INTERFACE_DECLARATION, oldInterfaceDeclaration, interfaceDeclaration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentCorrelation getParent() {
		if (eContainerFeatureID() != DeploymentContextPackage.VARIABLE_MAPPING__PARENT) return null;
		return (ComponentCorrelation)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(ComponentCorrelation newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, DeploymentContextPackage.VARIABLE_MAPPING__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(ComponentCorrelation newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != DeploymentContextPackage.VARIABLE_MAPPING__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, DeploymentContextPackage.COMPONENT_CORRELATION__VARIABLE_MAPPING, ComponentCorrelation.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeploymentContextPackage.VARIABLE_MAPPING__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DeploymentContextPackage.VARIABLE_MAPPING__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((ComponentCorrelation)otherEnd, msgs);
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
			case DeploymentContextPackage.VARIABLE_MAPPING__PARENT:
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
			case DeploymentContextPackage.VARIABLE_MAPPING__PARENT:
				return eInternalContainer().eInverseRemove(this, DeploymentContextPackage.COMPONENT_CORRELATION__VARIABLE_MAPPING, ComponentCorrelation.class, msgs);
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
			case DeploymentContextPackage.VARIABLE_MAPPING__NAME:
				return getName();
			case DeploymentContextPackage.VARIABLE_MAPPING__PROGRAM_VARIABLE:
				if (resolve) return getProgramVariable();
				return basicGetProgramVariable();
			case DeploymentContextPackage.VARIABLE_MAPPING__INTERFACE_DECLARATION:
				if (resolve) return getInterfaceDeclaration();
				return basicGetInterfaceDeclaration();
			case DeploymentContextPackage.VARIABLE_MAPPING__PARENT:
				return getParent();
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
			case DeploymentContextPackage.VARIABLE_MAPPING__NAME:
				setName((String)newValue);
				return;
			case DeploymentContextPackage.VARIABLE_MAPPING__PROGRAM_VARIABLE:
				setProgramVariable((GlobalVariable)newValue);
				return;
			case DeploymentContextPackage.VARIABLE_MAPPING__INTERFACE_DECLARATION:
				setInterfaceDeclaration((Interface)newValue);
				return;
			case DeploymentContextPackage.VARIABLE_MAPPING__PARENT:
				setParent((ComponentCorrelation)newValue);
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
			case DeploymentContextPackage.VARIABLE_MAPPING__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DeploymentContextPackage.VARIABLE_MAPPING__PROGRAM_VARIABLE:
				setProgramVariable((GlobalVariable)null);
				return;
			case DeploymentContextPackage.VARIABLE_MAPPING__INTERFACE_DECLARATION:
				setInterfaceDeclaration((Interface)null);
				return;
			case DeploymentContextPackage.VARIABLE_MAPPING__PARENT:
				setParent((ComponentCorrelation)null);
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
			case DeploymentContextPackage.VARIABLE_MAPPING__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DeploymentContextPackage.VARIABLE_MAPPING__PROGRAM_VARIABLE:
				return programVariable != null;
			case DeploymentContextPackage.VARIABLE_MAPPING__INTERFACE_DECLARATION:
				return interfaceDeclaration != null;
			case DeploymentContextPackage.VARIABLE_MAPPING__PARENT:
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

} //VariableMappingImpl
