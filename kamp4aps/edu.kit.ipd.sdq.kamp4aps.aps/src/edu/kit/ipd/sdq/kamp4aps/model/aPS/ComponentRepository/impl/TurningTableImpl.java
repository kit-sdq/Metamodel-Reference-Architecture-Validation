/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.BusBox;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.BusCable;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.BusSlave;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.ComponentRepositoryPackage;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Rack;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.SimpleMotor;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.TurningTable;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.ElectronicComponents.Potentiometer;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.MechanicalComponents.Table;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.MicroswitchModule;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.impl.ModuleImpl;

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
 * An implementation of the model object '<em><b>Turning Table</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.TurningTableImpl#getRack_for_turningtable <em>Rack for turningtable</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.TurningTableImpl#getTable_to_stand_on <em>Table to stand on</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.TurningTableImpl#getMotor_to_drive <em>Motor to drive</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.TurningTableImpl#getMicroswitchModule <em>Microswitch Module</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.TurningTableImpl#getBusSlave <em>Bus Slave</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.TurningTableImpl#getBusBox <em>Bus Box</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.TurningTableImpl#getBusCable <em>Bus Cable</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.TurningTableImpl#getPotentiometer <em>Potentiometer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TurningTableImpl extends ModuleImpl implements TurningTable {
	/**
	 * The cached value of the '{@link #getRack_for_turningtable() <em>Rack for turningtable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRack_for_turningtable()
	 * @generated
	 * @ordered
	 */
	protected Rack rack_for_turningtable;

	/**
	 * The cached value of the '{@link #getTable_to_stand_on() <em>Table to stand on</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTable_to_stand_on()
	 * @generated
	 * @ordered
	 */
	protected Table table_to_stand_on;

	/**
	 * The cached value of the '{@link #getMotor_to_drive() <em>Motor to drive</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMotor_to_drive()
	 * @generated
	 * @ordered
	 */
	protected SimpleMotor motor_to_drive;

	/**
	 * The cached value of the '{@link #getMicroswitchModule() <em>Microswitch Module</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMicroswitchModule()
	 * @generated
	 * @ordered
	 */
	protected EList<MicroswitchModule> microswitchModule;

	/**
	 * The cached value of the '{@link #getBusSlave() <em>Bus Slave</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusSlave()
	 * @generated
	 * @ordered
	 */
	protected BusSlave busSlave;

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
	 * The cached value of the '{@link #getPotentiometer() <em>Potentiometer</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPotentiometer()
	 * @generated
	 * @ordered
	 */
	protected EList<Potentiometer> potentiometer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TurningTableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentRepositoryPackage.Literals.TURNING_TABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rack getRack_for_turningtable() {
		return rack_for_turningtable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRack_for_turningtable(Rack newRack_for_turningtable, NotificationChain msgs) {
		Rack oldRack_for_turningtable = rack_for_turningtable;
		rack_for_turningtable = newRack_for_turningtable;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ComponentRepositoryPackage.TURNING_TABLE__RACK_FOR_TURNINGTABLE, oldRack_for_turningtable, newRack_for_turningtable);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRack_for_turningtable(Rack newRack_for_turningtable) {
		if (newRack_for_turningtable != rack_for_turningtable) {
			NotificationChain msgs = null;
			if (rack_for_turningtable != null)
				msgs = ((InternalEObject)rack_for_turningtable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ComponentRepositoryPackage.TURNING_TABLE__RACK_FOR_TURNINGTABLE, null, msgs);
			if (newRack_for_turningtable != null)
				msgs = ((InternalEObject)newRack_for_turningtable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ComponentRepositoryPackage.TURNING_TABLE__RACK_FOR_TURNINGTABLE, null, msgs);
			msgs = basicSetRack_for_turningtable(newRack_for_turningtable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentRepositoryPackage.TURNING_TABLE__RACK_FOR_TURNINGTABLE, newRack_for_turningtable, newRack_for_turningtable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table getTable_to_stand_on() {
		return table_to_stand_on;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTable_to_stand_on(Table newTable_to_stand_on, NotificationChain msgs) {
		Table oldTable_to_stand_on = table_to_stand_on;
		table_to_stand_on = newTable_to_stand_on;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ComponentRepositoryPackage.TURNING_TABLE__TABLE_TO_STAND_ON, oldTable_to_stand_on, newTable_to_stand_on);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTable_to_stand_on(Table newTable_to_stand_on) {
		if (newTable_to_stand_on != table_to_stand_on) {
			NotificationChain msgs = null;
			if (table_to_stand_on != null)
				msgs = ((InternalEObject)table_to_stand_on).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ComponentRepositoryPackage.TURNING_TABLE__TABLE_TO_STAND_ON, null, msgs);
			if (newTable_to_stand_on != null)
				msgs = ((InternalEObject)newTable_to_stand_on).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ComponentRepositoryPackage.TURNING_TABLE__TABLE_TO_STAND_ON, null, msgs);
			msgs = basicSetTable_to_stand_on(newTable_to_stand_on, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentRepositoryPackage.TURNING_TABLE__TABLE_TO_STAND_ON, newTable_to_stand_on, newTable_to_stand_on));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleMotor getMotor_to_drive() {
		return motor_to_drive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMotor_to_drive(SimpleMotor newMotor_to_drive, NotificationChain msgs) {
		SimpleMotor oldMotor_to_drive = motor_to_drive;
		motor_to_drive = newMotor_to_drive;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ComponentRepositoryPackage.TURNING_TABLE__MOTOR_TO_DRIVE, oldMotor_to_drive, newMotor_to_drive);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMotor_to_drive(SimpleMotor newMotor_to_drive) {
		if (newMotor_to_drive != motor_to_drive) {
			NotificationChain msgs = null;
			if (motor_to_drive != null)
				msgs = ((InternalEObject)motor_to_drive).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ComponentRepositoryPackage.TURNING_TABLE__MOTOR_TO_DRIVE, null, msgs);
			if (newMotor_to_drive != null)
				msgs = ((InternalEObject)newMotor_to_drive).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ComponentRepositoryPackage.TURNING_TABLE__MOTOR_TO_DRIVE, null, msgs);
			msgs = basicSetMotor_to_drive(newMotor_to_drive, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentRepositoryPackage.TURNING_TABLE__MOTOR_TO_DRIVE, newMotor_to_drive, newMotor_to_drive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MicroswitchModule> getMicroswitchModule() {
		if (microswitchModule == null) {
			microswitchModule = new EObjectContainmentEList<MicroswitchModule>(MicroswitchModule.class, this, ComponentRepositoryPackage.TURNING_TABLE__MICROSWITCH_MODULE);
		}
		return microswitchModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusSlave getBusSlave() {
		return busSlave;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBusSlave(BusSlave newBusSlave, NotificationChain msgs) {
		BusSlave oldBusSlave = busSlave;
		busSlave = newBusSlave;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ComponentRepositoryPackage.TURNING_TABLE__BUS_SLAVE, oldBusSlave, newBusSlave);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBusSlave(BusSlave newBusSlave) {
		if (newBusSlave != busSlave) {
			NotificationChain msgs = null;
			if (busSlave != null)
				msgs = ((InternalEObject)busSlave).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ComponentRepositoryPackage.TURNING_TABLE__BUS_SLAVE, null, msgs);
			if (newBusSlave != null)
				msgs = ((InternalEObject)newBusSlave).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ComponentRepositoryPackage.TURNING_TABLE__BUS_SLAVE, null, msgs);
			msgs = basicSetBusSlave(newBusSlave, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentRepositoryPackage.TURNING_TABLE__BUS_SLAVE, newBusSlave, newBusSlave));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ComponentRepositoryPackage.TURNING_TABLE__BUS_BOX, oldBusBox, newBusBox);
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
				msgs = ((InternalEObject)busBox).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ComponentRepositoryPackage.TURNING_TABLE__BUS_BOX, null, msgs);
			if (newBusBox != null)
				msgs = ((InternalEObject)newBusBox).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ComponentRepositoryPackage.TURNING_TABLE__BUS_BOX, null, msgs);
			msgs = basicSetBusBox(newBusBox, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentRepositoryPackage.TURNING_TABLE__BUS_BOX, newBusBox, newBusBox));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BusCable> getBusCable() {
		if (busCable == null) {
			busCable = new EObjectContainmentEList<BusCable>(BusCable.class, this, ComponentRepositoryPackage.TURNING_TABLE__BUS_CABLE);
		}
		return busCable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Potentiometer> getPotentiometer() {
		if (potentiometer == null) {
			potentiometer = new EObjectContainmentEList<Potentiometer>(Potentiometer.class, this, ComponentRepositoryPackage.TURNING_TABLE__POTENTIOMETER);
		}
		return potentiometer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ComponentRepositoryPackage.TURNING_TABLE__RACK_FOR_TURNINGTABLE:
				return basicSetRack_for_turningtable(null, msgs);
			case ComponentRepositoryPackage.TURNING_TABLE__TABLE_TO_STAND_ON:
				return basicSetTable_to_stand_on(null, msgs);
			case ComponentRepositoryPackage.TURNING_TABLE__MOTOR_TO_DRIVE:
				return basicSetMotor_to_drive(null, msgs);
			case ComponentRepositoryPackage.TURNING_TABLE__MICROSWITCH_MODULE:
				return ((InternalEList<?>)getMicroswitchModule()).basicRemove(otherEnd, msgs);
			case ComponentRepositoryPackage.TURNING_TABLE__BUS_SLAVE:
				return basicSetBusSlave(null, msgs);
			case ComponentRepositoryPackage.TURNING_TABLE__BUS_BOX:
				return basicSetBusBox(null, msgs);
			case ComponentRepositoryPackage.TURNING_TABLE__BUS_CABLE:
				return ((InternalEList<?>)getBusCable()).basicRemove(otherEnd, msgs);
			case ComponentRepositoryPackage.TURNING_TABLE__POTENTIOMETER:
				return ((InternalEList<?>)getPotentiometer()).basicRemove(otherEnd, msgs);
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
			case ComponentRepositoryPackage.TURNING_TABLE__RACK_FOR_TURNINGTABLE:
				return getRack_for_turningtable();
			case ComponentRepositoryPackage.TURNING_TABLE__TABLE_TO_STAND_ON:
				return getTable_to_stand_on();
			case ComponentRepositoryPackage.TURNING_TABLE__MOTOR_TO_DRIVE:
				return getMotor_to_drive();
			case ComponentRepositoryPackage.TURNING_TABLE__MICROSWITCH_MODULE:
				return getMicroswitchModule();
			case ComponentRepositoryPackage.TURNING_TABLE__BUS_SLAVE:
				return getBusSlave();
			case ComponentRepositoryPackage.TURNING_TABLE__BUS_BOX:
				return getBusBox();
			case ComponentRepositoryPackage.TURNING_TABLE__BUS_CABLE:
				return getBusCable();
			case ComponentRepositoryPackage.TURNING_TABLE__POTENTIOMETER:
				return getPotentiometer();
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
			case ComponentRepositoryPackage.TURNING_TABLE__RACK_FOR_TURNINGTABLE:
				setRack_for_turningtable((Rack)newValue);
				return;
			case ComponentRepositoryPackage.TURNING_TABLE__TABLE_TO_STAND_ON:
				setTable_to_stand_on((Table)newValue);
				return;
			case ComponentRepositoryPackage.TURNING_TABLE__MOTOR_TO_DRIVE:
				setMotor_to_drive((SimpleMotor)newValue);
				return;
			case ComponentRepositoryPackage.TURNING_TABLE__MICROSWITCH_MODULE:
				getMicroswitchModule().clear();
				getMicroswitchModule().addAll((Collection<? extends MicroswitchModule>)newValue);
				return;
			case ComponentRepositoryPackage.TURNING_TABLE__BUS_SLAVE:
				setBusSlave((BusSlave)newValue);
				return;
			case ComponentRepositoryPackage.TURNING_TABLE__BUS_BOX:
				setBusBox((BusBox)newValue);
				return;
			case ComponentRepositoryPackage.TURNING_TABLE__BUS_CABLE:
				getBusCable().clear();
				getBusCable().addAll((Collection<? extends BusCable>)newValue);
				return;
			case ComponentRepositoryPackage.TURNING_TABLE__POTENTIOMETER:
				getPotentiometer().clear();
				getPotentiometer().addAll((Collection<? extends Potentiometer>)newValue);
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
			case ComponentRepositoryPackage.TURNING_TABLE__RACK_FOR_TURNINGTABLE:
				setRack_for_turningtable((Rack)null);
				return;
			case ComponentRepositoryPackage.TURNING_TABLE__TABLE_TO_STAND_ON:
				setTable_to_stand_on((Table)null);
				return;
			case ComponentRepositoryPackage.TURNING_TABLE__MOTOR_TO_DRIVE:
				setMotor_to_drive((SimpleMotor)null);
				return;
			case ComponentRepositoryPackage.TURNING_TABLE__MICROSWITCH_MODULE:
				getMicroswitchModule().clear();
				return;
			case ComponentRepositoryPackage.TURNING_TABLE__BUS_SLAVE:
				setBusSlave((BusSlave)null);
				return;
			case ComponentRepositoryPackage.TURNING_TABLE__BUS_BOX:
				setBusBox((BusBox)null);
				return;
			case ComponentRepositoryPackage.TURNING_TABLE__BUS_CABLE:
				getBusCable().clear();
				return;
			case ComponentRepositoryPackage.TURNING_TABLE__POTENTIOMETER:
				getPotentiometer().clear();
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
			case ComponentRepositoryPackage.TURNING_TABLE__RACK_FOR_TURNINGTABLE:
				return rack_for_turningtable != null;
			case ComponentRepositoryPackage.TURNING_TABLE__TABLE_TO_STAND_ON:
				return table_to_stand_on != null;
			case ComponentRepositoryPackage.TURNING_TABLE__MOTOR_TO_DRIVE:
				return motor_to_drive != null;
			case ComponentRepositoryPackage.TURNING_TABLE__MICROSWITCH_MODULE:
				return microswitchModule != null && !microswitchModule.isEmpty();
			case ComponentRepositoryPackage.TURNING_TABLE__BUS_SLAVE:
				return busSlave != null;
			case ComponentRepositoryPackage.TURNING_TABLE__BUS_BOX:
				return busBox != null;
			case ComponentRepositoryPackage.TURNING_TABLE__BUS_CABLE:
				return busCable != null && !busCable.isEmpty();
			case ComponentRepositoryPackage.TURNING_TABLE__POTENTIOMETER:
				return potentiometer != null && !potentiometer.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TurningTableImpl
