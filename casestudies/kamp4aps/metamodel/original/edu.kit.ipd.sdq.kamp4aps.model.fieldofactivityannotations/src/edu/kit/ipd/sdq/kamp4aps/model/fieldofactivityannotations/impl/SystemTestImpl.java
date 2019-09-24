/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.Plant;

import edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.KAMP4aPSFieldofactivityannotationsPackage;
import edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.SystemTest;
import edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.TestSpecification;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System Test</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.SystemTestImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.SystemTestImpl#getSystemUnderTest <em>System Under Test</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SystemTestImpl extends TestCaseImpl implements SystemTest {
	/**
	 * The cached value of the '{@link #getSystemUnderTest() <em>System Under Test</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemUnderTest()
	 * @generated
	 * @ordered
	 */
	protected Plant systemUnderTest;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemTestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KAMP4aPSFieldofactivityannotationsPackage.Literals.SYSTEM_TEST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestSpecification getParent() {
		if (eContainerFeatureID() != KAMP4aPSFieldofactivityannotationsPackage.SYSTEM_TEST__PARENT) return null;
		return (TestSpecification)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(TestSpecification newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, KAMP4aPSFieldofactivityannotationsPackage.SYSTEM_TEST__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(TestSpecification newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != KAMP4aPSFieldofactivityannotationsPackage.SYSTEM_TEST__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, KAMP4aPSFieldofactivityannotationsPackage.TEST_SPECIFICATION__SYSTEM_TESTS, TestSpecification.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KAMP4aPSFieldofactivityannotationsPackage.SYSTEM_TEST__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Plant getSystemUnderTest() {
		if (systemUnderTest != null && systemUnderTest.eIsProxy()) {
			InternalEObject oldSystemUnderTest = (InternalEObject)systemUnderTest;
			systemUnderTest = (Plant)eResolveProxy(oldSystemUnderTest);
			if (systemUnderTest != oldSystemUnderTest) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, KAMP4aPSFieldofactivityannotationsPackage.SYSTEM_TEST__SYSTEM_UNDER_TEST, oldSystemUnderTest, systemUnderTest));
			}
		}
		return systemUnderTest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Plant basicGetSystemUnderTest() {
		return systemUnderTest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSystemUnderTest(Plant newSystemUnderTest) {
		Plant oldSystemUnderTest = systemUnderTest;
		systemUnderTest = newSystemUnderTest;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KAMP4aPSFieldofactivityannotationsPackage.SYSTEM_TEST__SYSTEM_UNDER_TEST, oldSystemUnderTest, systemUnderTest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KAMP4aPSFieldofactivityannotationsPackage.SYSTEM_TEST__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((TestSpecification)otherEnd, msgs);
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
			case KAMP4aPSFieldofactivityannotationsPackage.SYSTEM_TEST__PARENT:
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
			case KAMP4aPSFieldofactivityannotationsPackage.SYSTEM_TEST__PARENT:
				return eInternalContainer().eInverseRemove(this, KAMP4aPSFieldofactivityannotationsPackage.TEST_SPECIFICATION__SYSTEM_TESTS, TestSpecification.class, msgs);
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
			case KAMP4aPSFieldofactivityannotationsPackage.SYSTEM_TEST__PARENT:
				return getParent();
			case KAMP4aPSFieldofactivityannotationsPackage.SYSTEM_TEST__SYSTEM_UNDER_TEST:
				if (resolve) return getSystemUnderTest();
				return basicGetSystemUnderTest();
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
			case KAMP4aPSFieldofactivityannotationsPackage.SYSTEM_TEST__PARENT:
				setParent((TestSpecification)newValue);
				return;
			case KAMP4aPSFieldofactivityannotationsPackage.SYSTEM_TEST__SYSTEM_UNDER_TEST:
				setSystemUnderTest((Plant)newValue);
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
			case KAMP4aPSFieldofactivityannotationsPackage.SYSTEM_TEST__PARENT:
				setParent((TestSpecification)null);
				return;
			case KAMP4aPSFieldofactivityannotationsPackage.SYSTEM_TEST__SYSTEM_UNDER_TEST:
				setSystemUnderTest((Plant)null);
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
			case KAMP4aPSFieldofactivityannotationsPackage.SYSTEM_TEST__PARENT:
				return getParent() != null;
			case KAMP4aPSFieldofactivityannotationsPackage.SYSTEM_TEST__SYSTEM_UNDER_TEST:
				return systemUnderTest != null;
		}
		return super.eIsSet(featureID);
	}

} //SystemTestImpl
