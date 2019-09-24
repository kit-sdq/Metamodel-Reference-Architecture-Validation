/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.DeploymentContext.impl;

import edu.kit.ipd.sdq.kamp4aps.model.DeploymentContext.ComponentCorrelation;
import edu.kit.ipd.sdq.kamp4aps.model.DeploymentContext.DeploymentContextPackage;
import edu.kit.ipd.sdq.kamp4aps.model.DeploymentContext.DeploymentContextRepository;
import edu.kit.ipd.sdq.kamp4aps.model.DeploymentContext.VariableMapping;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Component;

import edu.kit.ipd.sdq.kamp4iec.model.IECModel.Program;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Correlation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.DeploymentContext.impl.ComponentCorrelationImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.DeploymentContext.impl.ComponentCorrelationImpl#getComponent <em>Component</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.DeploymentContext.impl.ComponentCorrelationImpl#getProgram <em>Program</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.DeploymentContext.impl.ComponentCorrelationImpl#getName <em>Name</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.DeploymentContext.impl.ComponentCorrelationImpl#getVariableMapping <em>Variable Mapping</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentCorrelationImpl extends MinimalEObjectImpl.Container implements ComponentCorrelation {
	/**
	 * The cached value of the '{@link #getComponent() <em>Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponent()
	 * @generated
	 * @ordered
	 */
	protected Component component;

	/**
	 * The cached value of the '{@link #getProgram() <em>Program</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgram()
	 * @generated
	 * @ordered
	 */
	protected Program program;

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
	 * The cached value of the '{@link #getVariableMapping() <em>Variable Mapping</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariableMapping()
	 * @generated
	 * @ordered
	 */
	protected EList<VariableMapping> variableMapping;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentCorrelationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DeploymentContextPackage.Literals.COMPONENT_CORRELATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeploymentContextRepository getParent() {
		if (eContainerFeatureID() != DeploymentContextPackage.COMPONENT_CORRELATION__PARENT) return null;
		return (DeploymentContextRepository)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(DeploymentContextRepository newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, DeploymentContextPackage.COMPONENT_CORRELATION__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(DeploymentContextRepository newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != DeploymentContextPackage.COMPONENT_CORRELATION__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, DeploymentContextPackage.DEPLOYMENT_CONTEXT_REPOSITORY__COMPONENT_CORRELATION, DeploymentContextRepository.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeploymentContextPackage.COMPONENT_CORRELATION__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component getComponent() {
		if (component != null && component.eIsProxy()) {
			InternalEObject oldComponent = (InternalEObject)component;
			component = (Component)eResolveProxy(oldComponent);
			if (component != oldComponent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DeploymentContextPackage.COMPONENT_CORRELATION__COMPONENT, oldComponent, component));
			}
		}
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component basicGetComponent() {
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponent(Component newComponent) {
		Component oldComponent = component;
		component = newComponent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeploymentContextPackage.COMPONENT_CORRELATION__COMPONENT, oldComponent, component));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Program getProgram() {
		if (program != null && program.eIsProxy()) {
			InternalEObject oldProgram = (InternalEObject)program;
			program = (Program)eResolveProxy(oldProgram);
			if (program != oldProgram) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DeploymentContextPackage.COMPONENT_CORRELATION__PROGRAM, oldProgram, program));
			}
		}
		return program;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Program basicGetProgram() {
		return program;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProgram(Program newProgram) {
		Program oldProgram = program;
		program = newProgram;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeploymentContextPackage.COMPONENT_CORRELATION__PROGRAM, oldProgram, program));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DeploymentContextPackage.COMPONENT_CORRELATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VariableMapping> getVariableMapping() {
		if (variableMapping == null) {
			variableMapping = new EObjectContainmentWithInverseEList<VariableMapping>(VariableMapping.class, this, DeploymentContextPackage.COMPONENT_CORRELATION__VARIABLE_MAPPING, DeploymentContextPackage.VARIABLE_MAPPING__PARENT);
		}
		return variableMapping;
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
			case DeploymentContextPackage.COMPONENT_CORRELATION__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((DeploymentContextRepository)otherEnd, msgs);
			case DeploymentContextPackage.COMPONENT_CORRELATION__VARIABLE_MAPPING:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getVariableMapping()).basicAdd(otherEnd, msgs);
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
			case DeploymentContextPackage.COMPONENT_CORRELATION__PARENT:
				return basicSetParent(null, msgs);
			case DeploymentContextPackage.COMPONENT_CORRELATION__VARIABLE_MAPPING:
				return ((InternalEList<?>)getVariableMapping()).basicRemove(otherEnd, msgs);
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
			case DeploymentContextPackage.COMPONENT_CORRELATION__PARENT:
				return eInternalContainer().eInverseRemove(this, DeploymentContextPackage.DEPLOYMENT_CONTEXT_REPOSITORY__COMPONENT_CORRELATION, DeploymentContextRepository.class, msgs);
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
			case DeploymentContextPackage.COMPONENT_CORRELATION__PARENT:
				return getParent();
			case DeploymentContextPackage.COMPONENT_CORRELATION__COMPONENT:
				if (resolve) return getComponent();
				return basicGetComponent();
			case DeploymentContextPackage.COMPONENT_CORRELATION__PROGRAM:
				if (resolve) return getProgram();
				return basicGetProgram();
			case DeploymentContextPackage.COMPONENT_CORRELATION__NAME:
				return getName();
			case DeploymentContextPackage.COMPONENT_CORRELATION__VARIABLE_MAPPING:
				return getVariableMapping();
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
			case DeploymentContextPackage.COMPONENT_CORRELATION__PARENT:
				setParent((DeploymentContextRepository)newValue);
				return;
			case DeploymentContextPackage.COMPONENT_CORRELATION__COMPONENT:
				setComponent((Component)newValue);
				return;
			case DeploymentContextPackage.COMPONENT_CORRELATION__PROGRAM:
				setProgram((Program)newValue);
				return;
			case DeploymentContextPackage.COMPONENT_CORRELATION__NAME:
				setName((String)newValue);
				return;
			case DeploymentContextPackage.COMPONENT_CORRELATION__VARIABLE_MAPPING:
				getVariableMapping().clear();
				getVariableMapping().addAll((Collection<? extends VariableMapping>)newValue);
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
			case DeploymentContextPackage.COMPONENT_CORRELATION__PARENT:
				setParent((DeploymentContextRepository)null);
				return;
			case DeploymentContextPackage.COMPONENT_CORRELATION__COMPONENT:
				setComponent((Component)null);
				return;
			case DeploymentContextPackage.COMPONENT_CORRELATION__PROGRAM:
				setProgram((Program)null);
				return;
			case DeploymentContextPackage.COMPONENT_CORRELATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DeploymentContextPackage.COMPONENT_CORRELATION__VARIABLE_MAPPING:
				getVariableMapping().clear();
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
			case DeploymentContextPackage.COMPONENT_CORRELATION__PARENT:
				return getParent() != null;
			case DeploymentContextPackage.COMPONENT_CORRELATION__COMPONENT:
				return component != null;
			case DeploymentContextPackage.COMPONENT_CORRELATION__PROGRAM:
				return program != null;
			case DeploymentContextPackage.COMPONENT_CORRELATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DeploymentContextPackage.COMPONENT_CORRELATION__VARIABLE_MAPPING:
				return variableMapping != null && !variableMapping.isEmpty();
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

} //ComponentCorrelationImpl
