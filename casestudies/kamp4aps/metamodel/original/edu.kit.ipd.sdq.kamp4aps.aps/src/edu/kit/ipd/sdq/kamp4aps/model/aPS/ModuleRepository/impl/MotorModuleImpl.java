/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.impl;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.BusBox;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.BusCable;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.BusSlave;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.SimpleMotor;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.ModuleRepositoryPackage;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.MotorModule;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Motor Module</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.impl.MotorModuleImpl#getSimpleMotor <em>Simple Motor</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.impl.MotorModuleImpl#getBusSlave <em>Bus Slave</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.impl.MotorModuleImpl#getBusBox <em>Bus Box</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.impl.MotorModuleImpl#getBusCable <em>Bus Cable</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MotorModuleImpl extends ModuleImpl implements MotorModule {
	/**
	 * The cached value of the '{@link #getSimpleMotor() <em>Simple Motor</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimpleMotor()
	 * @generated
	 * @ordered
	 */
	protected EList<SimpleMotor> simpleMotor;

	/**
	 * The cached value of the '{@link #getBusSlave() <em>Bus Slave</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusSlave()
	 * @generated
	 * @ordered
	 */
	protected EList<BusSlave> busSlave;

	/**
	 * The cached value of the '{@link #getBusBox() <em>Bus Box</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusBox()
	 * @generated
	 * @ordered
	 */
	protected BusBox busBox;

	/**
	 * The cached value of the '{@link #getBusCable() <em>Bus Cable</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusCable()
	 * @generated
	 * @ordered
	 */
	protected EList<BusCable> busCable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MotorModuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModuleRepositoryPackage.Literals.MOTOR_MODULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SimpleMotor> getSimpleMotor() {
		if (simpleMotor == null) {
			simpleMotor = new EObjectContainmentEList<SimpleMotor>(SimpleMotor.class, this, ModuleRepositoryPackage.MOTOR_MODULE__SIMPLE_MOTOR);
		}
		return simpleMotor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BusSlave> getBusSlave() {
		if (busSlave == null) {
			busSlave = new EObjectContainmentEList<BusSlave>(BusSlave.class, this, ModuleRepositoryPackage.MOTOR_MODULE__BUS_SLAVE);
		}
		return busSlave;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusBox getBusBox() {
		return busBox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBusBox(BusBox newBusBox, NotificationChain msgs) {
		BusBox oldBusBox = busBox;
		busBox = newBusBox;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModuleRepositoryPackage.MOTOR_MODULE__BUS_BOX, oldBusBox, newBusBox);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBusBox(BusBox newBusBox) {
		if (newBusBox != busBox) {
			NotificationChain msgs = null;
			if (busBox != null)
				msgs = ((InternalEObject)busBox).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModuleRepositoryPackage.MOTOR_MODULE__BUS_BOX, null, msgs);
			if (newBusBox != null)
				msgs = ((InternalEObject)newBusBox).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModuleRepositoryPackage.MOTOR_MODULE__BUS_BOX, null, msgs);
			msgs = basicSetBusBox(newBusBox, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModuleRepositoryPackage.MOTOR_MODULE__BUS_BOX, newBusBox, newBusBox));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BusCable> getBusCable() {
		if (busCable == null) {
			busCable = new EObjectContainmentEList<BusCable>(BusCable.class, this, ModuleRepositoryPackage.MOTOR_MODULE__BUS_CABLE);
		}
		return busCable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModuleRepositoryPackage.MOTOR_MODULE__SIMPLE_MOTOR:
				return ((InternalEList<?>)getSimpleMotor()).basicRemove(otherEnd, msgs);
			case ModuleRepositoryPackage.MOTOR_MODULE__BUS_SLAVE:
				return ((InternalEList<?>)getBusSlave()).basicRemove(otherEnd, msgs);
			case ModuleRepositoryPackage.MOTOR_MODULE__BUS_BOX:
				return basicSetBusBox(null, msgs);
			case ModuleRepositoryPackage.MOTOR_MODULE__BUS_CABLE:
				return ((InternalEList<?>)getBusCable()).basicRemove(otherEnd, msgs);
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
			case ModuleRepositoryPackage.MOTOR_MODULE__SIMPLE_MOTOR:
				return getSimpleMotor();
			case ModuleRepositoryPackage.MOTOR_MODULE__BUS_SLAVE:
				return getBusSlave();
			case ModuleRepositoryPackage.MOTOR_MODULE__BUS_BOX:
				return getBusBox();
			case ModuleRepositoryPackage.MOTOR_MODULE__BUS_CABLE:
				return getBusCable();
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
			case ModuleRepositoryPackage.MOTOR_MODULE__SIMPLE_MOTOR:
				getSimpleMotor().clear();
				getSimpleMotor().addAll((Collection<? extends SimpleMotor>)newValue);
				return;
			case ModuleRepositoryPackage.MOTOR_MODULE__BUS_SLAVE:
				getBusSlave().clear();
				getBusSlave().addAll((Collection<? extends BusSlave>)newValue);
				return;
			case ModuleRepositoryPackage.MOTOR_MODULE__BUS_BOX:
				setBusBox((BusBox)newValue);
				return;
			case ModuleRepositoryPackage.MOTOR_MODULE__BUS_CABLE:
				getBusCable().clear();
				getBusCable().addAll((Collection<? extends BusCable>)newValue);
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
			case ModuleRepositoryPackage.MOTOR_MODULE__SIMPLE_MOTOR:
				getSimpleMotor().clear();
				return;
			case ModuleRepositoryPackage.MOTOR_MODULE__BUS_SLAVE:
				getBusSlave().clear();
				return;
			case ModuleRepositoryPackage.MOTOR_MODULE__BUS_BOX:
				setBusBox((BusBox)null);
				return;
			case ModuleRepositoryPackage.MOTOR_MODULE__BUS_CABLE:
				getBusCable().clear();
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
			case ModuleRepositoryPackage.MOTOR_MODULE__SIMPLE_MOTOR:
				return simpleMotor != null && !simpleMotor.isEmpty();
			case ModuleRepositoryPackage.MOTOR_MODULE__BUS_SLAVE:
				return busSlave != null && !busSlave.isEmpty();
			case ModuleRepositoryPackage.MOTOR_MODULE__BUS_BOX:
				return busBox != null;
			case ModuleRepositoryPackage.MOTOR_MODULE__BUS_CABLE:
				return busCable != null && !busCable.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MotorModuleImpl
