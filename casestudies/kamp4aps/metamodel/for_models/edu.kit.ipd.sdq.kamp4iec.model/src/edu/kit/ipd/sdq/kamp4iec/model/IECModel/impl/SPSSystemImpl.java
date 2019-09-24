/**
 */
package edu.kit.ipd.sdq.kamp4iec.model.IECModel.impl;

import edu.kit.ipd.sdq.kamp4iec.model.ComponentInternalDependencies.ComponentInternalDependenciesRepository;

import edu.kit.ipd.sdq.kamp4iec.model.IECModel.IECModelPackage;
import edu.kit.ipd.sdq.kamp4iec.model.IECModel.Program;
import edu.kit.ipd.sdq.kamp4iec.model.IECModel.SPSSystem;

import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IdentifierImpl;
import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SPS System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECModel.impl.SPSSystemImpl#getContainsProgram <em>Contains Program</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECModel.impl.SPSSystemImpl#getComponentInternalDependencies <em>Component Internal Dependencies</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SPSSystemImpl extends IdentifierImpl implements SPSSystem {
	/**
	 * The cached value of the '{@link #getContainsProgram() <em>Contains Program</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsProgram()
	 * @generated
	 * @ordered
	 */
	protected EList<Program> containsProgram;

	/**
	 * The cached value of the '{@link #getComponentInternalDependencies() <em>Component Internal Dependencies</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentInternalDependencies()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentInternalDependenciesRepository> componentInternalDependencies;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SPSSystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IECModelPackage.Literals.SPS_SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Program> getContainsProgram() {
		if (containsProgram == null) {
			containsProgram = new EObjectContainmentEList<Program>(Program.class, this, IECModelPackage.SPS_SYSTEM__CONTAINS_PROGRAM);
		}
		return containsProgram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComponentInternalDependenciesRepository> getComponentInternalDependencies() {
		if (componentInternalDependencies == null) {
			componentInternalDependencies = new EObjectResolvingEList<ComponentInternalDependenciesRepository>(ComponentInternalDependenciesRepository.class, this, IECModelPackage.SPS_SYSTEM__COMPONENT_INTERNAL_DEPENDENCIES);
		}
		return componentInternalDependencies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IECModelPackage.SPS_SYSTEM__CONTAINS_PROGRAM:
				return ((InternalEList<?>)getContainsProgram()).basicRemove(otherEnd, msgs);
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
			case IECModelPackage.SPS_SYSTEM__CONTAINS_PROGRAM:
				return getContainsProgram();
			case IECModelPackage.SPS_SYSTEM__COMPONENT_INTERNAL_DEPENDENCIES:
				return getComponentInternalDependencies();
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
			case IECModelPackage.SPS_SYSTEM__CONTAINS_PROGRAM:
				getContainsProgram().clear();
				getContainsProgram().addAll((Collection<? extends Program>)newValue);
				return;
			case IECModelPackage.SPS_SYSTEM__COMPONENT_INTERNAL_DEPENDENCIES:
				getComponentInternalDependencies().clear();
				getComponentInternalDependencies().addAll((Collection<? extends ComponentInternalDependenciesRepository>)newValue);
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
			case IECModelPackage.SPS_SYSTEM__CONTAINS_PROGRAM:
				getContainsProgram().clear();
				return;
			case IECModelPackage.SPS_SYSTEM__COMPONENT_INTERNAL_DEPENDENCIES:
				getComponentInternalDependencies().clear();
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
			case IECModelPackage.SPS_SYSTEM__CONTAINS_PROGRAM:
				return containsProgram != null && !containsProgram.isEmpty();
			case IECModelPackage.SPS_SYSTEM__COMPONENT_INTERNAL_DEPENDENCIES:
				return componentInternalDependencies != null && !componentInternalDependencies.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SPSSystemImpl
