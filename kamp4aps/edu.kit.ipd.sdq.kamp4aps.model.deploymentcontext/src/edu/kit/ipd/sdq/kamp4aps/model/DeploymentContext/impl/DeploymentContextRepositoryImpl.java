/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.DeploymentContext.impl;

import edu.kit.ipd.sdq.kamp4aps.model.DeploymentContext.ComponentCorrelation;
import edu.kit.ipd.sdq.kamp4aps.model.DeploymentContext.DeploymentContextPackage;
import edu.kit.ipd.sdq.kamp4aps.model.DeploymentContext.DeploymentContextRepository;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Repository</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.DeploymentContext.impl.DeploymentContextRepositoryImpl#getComponentCorrelation <em>Component Correlation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeploymentContextRepositoryImpl extends MinimalEObjectImpl.Container implements DeploymentContextRepository {
	/**
	 * The cached value of the '{@link #getComponentCorrelation() <em>Component Correlation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentCorrelation()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentCorrelation> componentCorrelation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeploymentContextRepositoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DeploymentContextPackage.Literals.DEPLOYMENT_CONTEXT_REPOSITORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComponentCorrelation> getComponentCorrelation() {
		if (componentCorrelation == null) {
			componentCorrelation = new EObjectContainmentWithInverseEList<ComponentCorrelation>(ComponentCorrelation.class, this, DeploymentContextPackage.DEPLOYMENT_CONTEXT_REPOSITORY__COMPONENT_CORRELATION, DeploymentContextPackage.COMPONENT_CORRELATION__PARENT);
		}
		return componentCorrelation;
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
			case DeploymentContextPackage.DEPLOYMENT_CONTEXT_REPOSITORY__COMPONENT_CORRELATION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getComponentCorrelation()).basicAdd(otherEnd, msgs);
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
			case DeploymentContextPackage.DEPLOYMENT_CONTEXT_REPOSITORY__COMPONENT_CORRELATION:
				return ((InternalEList<?>)getComponentCorrelation()).basicRemove(otherEnd, msgs);
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
			case DeploymentContextPackage.DEPLOYMENT_CONTEXT_REPOSITORY__COMPONENT_CORRELATION:
				return getComponentCorrelation();
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
			case DeploymentContextPackage.DEPLOYMENT_CONTEXT_REPOSITORY__COMPONENT_CORRELATION:
				getComponentCorrelation().clear();
				getComponentCorrelation().addAll((Collection<? extends ComponentCorrelation>)newValue);
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
			case DeploymentContextPackage.DEPLOYMENT_CONTEXT_REPOSITORY__COMPONENT_CORRELATION:
				getComponentCorrelation().clear();
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
			case DeploymentContextPackage.DEPLOYMENT_CONTEXT_REPOSITORY__COMPONENT_CORRELATION:
				return componentCorrelation != null && !componentCorrelation.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DeploymentContextRepositoryImpl
