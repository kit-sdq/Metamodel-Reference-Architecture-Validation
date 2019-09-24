/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.ComponentRepositoryPackage;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.ConveyorBelt;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Frame;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.MechanicalComponents.RubberBand;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.StructureRepository.Conveyor;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.StructureRepository.StructureRepositoryPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conveyor Belt</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.ConveyorBeltImpl#getMountedTo <em>Mounted To</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.ConveyorBeltImpl#getFrame <em>Frame</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.impl.ConveyorBeltImpl#getRubberBand <em>Rubber Band</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConveyorBeltImpl extends ComponentImpl implements ConveyorBelt {
	/**
	 * The cached value of the '{@link #getFrame() <em>Frame</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrame()
	 * @generated
	 * @ordered
	 */
	protected Frame frame;

	/**
	 * The cached value of the '{@link #getRubberBand() <em>Rubber Band</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRubberBand()
	 * @generated
	 * @ordered
	 */
	protected RubberBand rubberBand;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConveyorBeltImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentRepositoryPackage.Literals.CONVEYOR_BELT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Conveyor getMountedTo() {
		if (eContainerFeatureID() != ComponentRepositoryPackage.CONVEYOR_BELT__MOUNTED_TO) return null;
		return (Conveyor)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMountedTo(Conveyor newMountedTo, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newMountedTo, ComponentRepositoryPackage.CONVEYOR_BELT__MOUNTED_TO, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMountedTo(Conveyor newMountedTo) {
		if (newMountedTo != eInternalContainer() || (eContainerFeatureID() != ComponentRepositoryPackage.CONVEYOR_BELT__MOUNTED_TO && newMountedTo != null)) {
			if (EcoreUtil.isAncestor(this, newMountedTo))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newMountedTo != null)
				msgs = ((InternalEObject)newMountedTo).eInverseAdd(this, StructureRepositoryPackage.CONVEYOR__BELTS, Conveyor.class, msgs);
			msgs = basicSetMountedTo(newMountedTo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentRepositoryPackage.CONVEYOR_BELT__MOUNTED_TO, newMountedTo, newMountedTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Frame getFrame() {
		return frame;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFrame(Frame newFrame, NotificationChain msgs) {
		Frame oldFrame = frame;
		frame = newFrame;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ComponentRepositoryPackage.CONVEYOR_BELT__FRAME, oldFrame, newFrame);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrame(Frame newFrame) {
		if (newFrame != frame) {
			NotificationChain msgs = null;
			if (frame != null)
				msgs = ((InternalEObject)frame).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ComponentRepositoryPackage.CONVEYOR_BELT__FRAME, null, msgs);
			if (newFrame != null)
				msgs = ((InternalEObject)newFrame).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ComponentRepositoryPackage.CONVEYOR_BELT__FRAME, null, msgs);
			msgs = basicSetFrame(newFrame, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentRepositoryPackage.CONVEYOR_BELT__FRAME, newFrame, newFrame));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RubberBand getRubberBand() {
		return rubberBand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRubberBand(RubberBand newRubberBand, NotificationChain msgs) {
		RubberBand oldRubberBand = rubberBand;
		rubberBand = newRubberBand;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ComponentRepositoryPackage.CONVEYOR_BELT__RUBBER_BAND, oldRubberBand, newRubberBand);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRubberBand(RubberBand newRubberBand) {
		if (newRubberBand != rubberBand) {
			NotificationChain msgs = null;
			if (rubberBand != null)
				msgs = ((InternalEObject)rubberBand).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ComponentRepositoryPackage.CONVEYOR_BELT__RUBBER_BAND, null, msgs);
			if (newRubberBand != null)
				msgs = ((InternalEObject)newRubberBand).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ComponentRepositoryPackage.CONVEYOR_BELT__RUBBER_BAND, null, msgs);
			msgs = basicSetRubberBand(newRubberBand, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentRepositoryPackage.CONVEYOR_BELT__RUBBER_BAND, newRubberBand, newRubberBand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ComponentRepositoryPackage.CONVEYOR_BELT__MOUNTED_TO:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetMountedTo((Conveyor)otherEnd, msgs);
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
			case ComponentRepositoryPackage.CONVEYOR_BELT__MOUNTED_TO:
				return basicSetMountedTo(null, msgs);
			case ComponentRepositoryPackage.CONVEYOR_BELT__FRAME:
				return basicSetFrame(null, msgs);
			case ComponentRepositoryPackage.CONVEYOR_BELT__RUBBER_BAND:
				return basicSetRubberBand(null, msgs);
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
			case ComponentRepositoryPackage.CONVEYOR_BELT__MOUNTED_TO:
				return eInternalContainer().eInverseRemove(this, StructureRepositoryPackage.CONVEYOR__BELTS, Conveyor.class, msgs);
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
			case ComponentRepositoryPackage.CONVEYOR_BELT__MOUNTED_TO:
				return getMountedTo();
			case ComponentRepositoryPackage.CONVEYOR_BELT__FRAME:
				return getFrame();
			case ComponentRepositoryPackage.CONVEYOR_BELT__RUBBER_BAND:
				return getRubberBand();
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
			case ComponentRepositoryPackage.CONVEYOR_BELT__MOUNTED_TO:
				setMountedTo((Conveyor)newValue);
				return;
			case ComponentRepositoryPackage.CONVEYOR_BELT__FRAME:
				setFrame((Frame)newValue);
				return;
			case ComponentRepositoryPackage.CONVEYOR_BELT__RUBBER_BAND:
				setRubberBand((RubberBand)newValue);
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
			case ComponentRepositoryPackage.CONVEYOR_BELT__MOUNTED_TO:
				setMountedTo((Conveyor)null);
				return;
			case ComponentRepositoryPackage.CONVEYOR_BELT__FRAME:
				setFrame((Frame)null);
				return;
			case ComponentRepositoryPackage.CONVEYOR_BELT__RUBBER_BAND:
				setRubberBand((RubberBand)null);
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
			case ComponentRepositoryPackage.CONVEYOR_BELT__MOUNTED_TO:
				return getMountedTo() != null;
			case ComponentRepositoryPackage.CONVEYOR_BELT__FRAME:
				return frame != null;
			case ComponentRepositoryPackage.CONVEYOR_BELT__RUBBER_BAND:
				return rubberBand != null;
		}
		return super.eIsSet(featureID);
	}

} //ConveyorBeltImpl
