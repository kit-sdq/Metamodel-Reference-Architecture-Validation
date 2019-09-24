/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.Module;

import edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.KAMP4aPSFieldofactivityannotationsPackage;
import edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.ModuleStockList;
import edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.StockSpecification;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Module Stock List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.ModuleStockListImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.ModuleStockListImpl#getModules <em>Modules</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModuleStockListImpl extends StockListImpl implements ModuleStockList {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModuleStockListImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KAMP4aPSFieldofactivityannotationsPackage.Literals.MODULE_STOCK_LIST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StockSpecification getParent() {
		if (eContainerFeatureID() != KAMP4aPSFieldofactivityannotationsPackage.MODULE_STOCK_LIST__PARENT) return null;
		return (StockSpecification)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(StockSpecification newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, KAMP4aPSFieldofactivityannotationsPackage.MODULE_STOCK_LIST__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(StockSpecification newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != KAMP4aPSFieldofactivityannotationsPackage.MODULE_STOCK_LIST__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, KAMP4aPSFieldofactivityannotationsPackage.STOCK_SPECIFICATION__MODULE_STOCK_LIST, StockSpecification.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KAMP4aPSFieldofactivityannotationsPackage.MODULE_STOCK_LIST__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Module> getModules() {
		if (modules == null) {
			modules = new EObjectResolvingEList<Module>(Module.class, this, KAMP4aPSFieldofactivityannotationsPackage.MODULE_STOCK_LIST__MODULES);
		}
		return modules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KAMP4aPSFieldofactivityannotationsPackage.MODULE_STOCK_LIST__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((StockSpecification)otherEnd, msgs);
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
			case KAMP4aPSFieldofactivityannotationsPackage.MODULE_STOCK_LIST__PARENT:
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
			case KAMP4aPSFieldofactivityannotationsPackage.MODULE_STOCK_LIST__PARENT:
				return eInternalContainer().eInverseRemove(this, KAMP4aPSFieldofactivityannotationsPackage.STOCK_SPECIFICATION__MODULE_STOCK_LIST, StockSpecification.class, msgs);
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
			case KAMP4aPSFieldofactivityannotationsPackage.MODULE_STOCK_LIST__PARENT:
				return getParent();
			case KAMP4aPSFieldofactivityannotationsPackage.MODULE_STOCK_LIST__MODULES:
				return getModules();
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
			case KAMP4aPSFieldofactivityannotationsPackage.MODULE_STOCK_LIST__PARENT:
				setParent((StockSpecification)newValue);
				return;
			case KAMP4aPSFieldofactivityannotationsPackage.MODULE_STOCK_LIST__MODULES:
				getModules().clear();
				getModules().addAll((Collection<? extends Module>)newValue);
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
			case KAMP4aPSFieldofactivityannotationsPackage.MODULE_STOCK_LIST__PARENT:
				setParent((StockSpecification)null);
				return;
			case KAMP4aPSFieldofactivityannotationsPackage.MODULE_STOCK_LIST__MODULES:
				getModules().clear();
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
			case KAMP4aPSFieldofactivityannotationsPackage.MODULE_STOCK_LIST__PARENT:
				return getParent() != null;
			case KAMP4aPSFieldofactivityannotationsPackage.MODULE_STOCK_LIST__MODULES:
				return modules != null && !modules.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ModuleStockListImpl
