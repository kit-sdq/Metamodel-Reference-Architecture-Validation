/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Component;

import edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.ComponentDrawing;
import edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.KAMP4aPSFieldofactivityannotationsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Drawing</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.ComponentDrawingImpl#getDrawn_component <em>Drawn component</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentDrawingImpl extends DrawingImpl implements ComponentDrawing {
	/**
	 * The cached value of the '{@link #getDrawn_component() <em>Drawn component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDrawn_component()
	 * @generated
	 * @ordered
	 */
	protected Component drawn_component;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentDrawingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KAMP4aPSFieldofactivityannotationsPackage.Literals.COMPONENT_DRAWING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component getDrawn_component() {
		if (drawn_component != null && drawn_component.eIsProxy()) {
			InternalEObject oldDrawn_component = (InternalEObject)drawn_component;
			drawn_component = (Component)eResolveProxy(oldDrawn_component);
			if (drawn_component != oldDrawn_component) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, KAMP4aPSFieldofactivityannotationsPackage.COMPONENT_DRAWING__DRAWN_COMPONENT, oldDrawn_component, drawn_component));
			}
		}
		return drawn_component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component basicGetDrawn_component() {
		return drawn_component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDrawn_component(Component newDrawn_component) {
		Component oldDrawn_component = drawn_component;
		drawn_component = newDrawn_component;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KAMP4aPSFieldofactivityannotationsPackage.COMPONENT_DRAWING__DRAWN_COMPONENT, oldDrawn_component, drawn_component));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case KAMP4aPSFieldofactivityannotationsPackage.COMPONENT_DRAWING__DRAWN_COMPONENT:
				if (resolve) return getDrawn_component();
				return basicGetDrawn_component();
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
			case KAMP4aPSFieldofactivityannotationsPackage.COMPONENT_DRAWING__DRAWN_COMPONENT:
				setDrawn_component((Component)newValue);
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
			case KAMP4aPSFieldofactivityannotationsPackage.COMPONENT_DRAWING__DRAWN_COMPONENT:
				setDrawn_component((Component)null);
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
			case KAMP4aPSFieldofactivityannotationsPackage.COMPONENT_DRAWING__DRAWN_COMPONENT:
				return drawn_component != null;
		}
		return super.eIsSet(featureID);
	}

} //ComponentDrawingImpl
