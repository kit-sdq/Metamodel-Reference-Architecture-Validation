/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.provider;


import edu.kit.ipd.sdq.kamp4aps.aps.aPS.provider.ApsEditPlugin;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.BusComponentsFactory;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.ComponentRepositoryFactory;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.ElectronicComponents.ElectronicComponentsFactory;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.MechanicalComponents.MechanicalComponentsFactory;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.Module;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.ModuleRepositoryFactory;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.ModuleRepositoryPackage;

import edu.kit.ipd.sdq.kamp4aps.model.basic.provider.EntityItemProvider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.Module} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ModuleItemProvider extends EntityItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModuleItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addParentEntityPropertyDescriptor(object);
			addInterfacesPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Parent Entity feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParentEntityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Module_parentEntity_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Module_parentEntity_feature", "_UI_Module_type"),
				 ModuleRepositoryPackage.Literals.MODULE__PARENT_ENTITY,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Interfaces feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInterfacesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Module_interfaces_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Module_interfaces_feature", "_UI_Module_type"),
				 ModuleRepositoryPackage.Literals.MODULE__INTERFACES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(ModuleRepositoryPackage.Literals.MODULE__MODULES);
			childrenFeatures.add(ModuleRepositoryPackage.Literals.MODULE__COMPONENTS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Module.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Module"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Module)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Module_type") :
			getString("_UI_Module_type") + " " + label;
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Module.class)) {
			case ModuleRepositoryPackage.MODULE__MODULES:
			case ModuleRepositoryPackage.MODULE__COMPONENTS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(ModuleRepositoryPackage.Literals.MODULE__MODULES,
				 ModuleRepositoryFactory.eINSTANCE.createModule()));

		newChildDescriptors.add
			(createChildParameter
				(ModuleRepositoryPackage.Literals.MODULE__MODULES,
				 ModuleRepositoryFactory.eINSTANCE.createMicroswitchModule()));

		newChildDescriptors.add
			(createChildParameter
				(ModuleRepositoryPackage.Literals.MODULE__MODULES,
				 ModuleRepositoryFactory.eINSTANCE.createPotentiometerModule()));

		newChildDescriptors.add
			(createChildParameter
				(ModuleRepositoryPackage.Literals.MODULE__MODULES,
				 ModuleRepositoryFactory.eINSTANCE.createRampModule()));

		newChildDescriptors.add
			(createChildParameter
				(ModuleRepositoryPackage.Literals.MODULE__MODULES,
				 ModuleRepositoryFactory.eINSTANCE.createPusherModule()));

		newChildDescriptors.add
			(createChildParameter
				(ModuleRepositoryPackage.Literals.MODULE__MODULES,
				 ModuleRepositoryFactory.eINSTANCE.createMotorModule()));

		newChildDescriptors.add
			(createChildParameter
				(ModuleRepositoryPackage.Literals.MODULE__MODULES,
				 ModuleRepositoryFactory.eINSTANCE.createSensorModule()));

		newChildDescriptors.add
			(createChildParameter
				(ModuleRepositoryPackage.Literals.MODULE__MODULES,
				 ModuleRepositoryFactory.eINSTANCE.createOpticalSensorModule()));

		newChildDescriptors.add
			(createChildParameter
				(ModuleRepositoryPackage.Literals.MODULE__MODULES,
				 ModuleRepositoryFactory.eINSTANCE.createInductiveSensorModule()));

		newChildDescriptors.add
			(createChildParameter
				(ModuleRepositoryPackage.Literals.MODULE__MODULES,
				 ModuleRepositoryFactory.eINSTANCE.createPresenceSensorModule()));

		newChildDescriptors.add
			(createChildParameter
				(ModuleRepositoryPackage.Literals.MODULE__MODULES,
				 ModuleRepositoryFactory.eINSTANCE.createPressureSensorModule()));

		newChildDescriptors.add
			(createChildParameter
				(ModuleRepositoryPackage.Literals.MODULE__MODULES,
				 ModuleRepositoryFactory.eINSTANCE.createConveyorBeltModule()));

		newChildDescriptors.add
			(createChildParameter
				(ModuleRepositoryPackage.Literals.MODULE__MODULES,
				 ModuleRepositoryFactory.eINSTANCE.createVacuumGripperModule()));

		newChildDescriptors.add
			(createChildParameter
				(ModuleRepositoryPackage.Literals.MODULE__MODULES,
				 ModuleRepositoryFactory.eINSTANCE.createMonostableCylinderModule()));

		newChildDescriptors.add
			(createChildParameter
				(ModuleRepositoryPackage.Literals.MODULE__MODULES,
				 ComponentRepositoryFactory.eINSTANCE.createTurningTable()));

		newChildDescriptors.add
			(createChildParameter
				(ModuleRepositoryPackage.Literals.MODULE__COMPONENTS,
				 ComponentRepositoryFactory.eINSTANCE.createComponent()));

		newChildDescriptors.add
			(createChildParameter
				(ModuleRepositoryPackage.Literals.MODULE__COMPONENTS,
				 ComponentRepositoryFactory.eINSTANCE.createOperationPanel()));

		newChildDescriptors.add
			(createChildParameter
				(ModuleRepositoryPackage.Literals.MODULE__COMPONENTS,
				 ComponentRepositoryFactory.eINSTANCE.createSimpleMotor()));

		newChildDescriptors.add
			(createChildParameter
				(ModuleRepositoryPackage.Literals.MODULE__COMPONENTS,
				 ComponentRepositoryFactory.eINSTANCE.createRegularRamp()));

		newChildDescriptors.add
			(createChildParameter
				(ModuleRepositoryPackage.Literals.MODULE__COMPONENTS,
				 ComponentRepositoryFactory.eINSTANCE.createSensor()));

		newChildDescriptors.add
			(createChildParameter
				(ModuleRepositoryPackage.Literals.MODULE__COMPONENTS,
				 ComponentRepositoryFactory.eINSTANCE.createOpticalSensor()));

		newChildDescriptors.add
			(createChildParameter
				(ModuleRepositoryPackage.Literals.MODULE__COMPONENTS,
				 ComponentRepositoryFactory.eINSTANCE.createInductiveSensor()));

		newChildDescriptors.add
			(createChildParameter
				(ModuleRepositoryPackage.Literals.MODULE__COMPONENTS,
				 ComponentRepositoryFactory.eINSTANCE.createPresenceSensor()));

		newChildDescriptors.add
			(createChildParameter
				(ModuleRepositoryPackage.Literals.MODULE__COMPONENTS,
				 ComponentRepositoryFactory.eINSTANCE.createPressureSensor()));

		newChildDescriptors.add
			(createChildParameter
				(ModuleRepositoryPackage.Literals.MODULE__COMPONENTS,
				 ComponentRepositoryFactory.eINSTANCE.createPneumaticPipe()));

		newChildDescriptors.add
			(createChildParameter
				(ModuleRepositoryPackage.Literals.MODULE__COMPONENTS,
				 ComponentRepositoryFactory.eINSTANCE.createCompressor()));

		newChildDescriptors.add
			(createChildParameter
				(ModuleRepositoryPackage.Literals.MODULE__COMPONENTS,
				 ComponentRepositoryFactory.eINSTANCE.createPowerCable()));

		newChildDescriptors.add
			(createChildParameter
				(ModuleRepositoryPackage.Literals.MODULE__COMPONENTS,
				 ComponentRepositoryFactory.eINSTANCE.createProportionalCylinder()));

		newChildDescriptors.add
			(createChildParameter
				(ModuleRepositoryPackage.Literals.MODULE__COMPONENTS,
				 ComponentRepositoryFactory.eINSTANCE.createBistableCylinder()));

		newChildDescriptors.add
			(createChildParameter
				(ModuleRepositoryPackage.Literals.MODULE__COMPONENTS,
				 ComponentRepositoryFactory.eINSTANCE.createRack()));

		newChildDescriptors.add
			(createChildParameter
				(ModuleRepositoryPackage.Literals.MODULE__COMPONENTS,
				 ComponentRepositoryFactory.eINSTANCE.createCorner()));

		newChildDescriptors.add
			(createChildParameter
				(ModuleRepositoryPackage.Literals.MODULE__COMPONENTS,
				 ComponentRepositoryFactory.eINSTANCE.createRegularValve()));

		newChildDescriptors.add
			(createChildParameter
				(ModuleRepositoryPackage.Literals.MODULE__COMPONENTS,
				 ComponentRepositoryFactory.eINSTANCE.createTank()));

		newChildDescriptors.add
			(createChildParameter
				(ModuleRepositoryPackage.Literals.MODULE__COMPONENTS,
				 ComponentRepositoryFactory.eINSTANCE.createDispenser()));

		newChildDescriptors.add
			(createChildParameter
				(ModuleRepositoryPackage.Literals.MODULE__COMPONENTS,
				 ComponentRepositoryFactory.eINSTANCE.createBottleSeperator()));

		newChildDescriptors.add
			(createChildParameter
				(ModuleRepositoryPackage.Literals.MODULE__COMPONENTS,
				 ComponentRepositoryFactory.eINSTANCE.createPowerSupply()));

		newChildDescriptors.add
			(createChildParameter
				(ModuleRepositoryPackage.Literals.MODULE__COMPONENTS,
				 ComponentRepositoryFactory.eINSTANCE.createConveyorBelt()));

		newChildDescriptors.add
			(createChildParameter
				(ModuleRepositoryPackage.Literals.MODULE__COMPONENTS,
				 ComponentRepositoryFactory.eINSTANCE.createFrame()));

		newChildDescriptors.add
			(createChildParameter
				(ModuleRepositoryPackage.Literals.MODULE__COMPONENTS,
				 ComponentRepositoryFactory.eINSTANCE.createPusher()));

		newChildDescriptors.add
			(createChildParameter
				(ModuleRepositoryPackage.Literals.MODULE__COMPONENTS,
				 ComponentRepositoryFactory.eINSTANCE.createController()));

		newChildDescriptors.add
			(createChildParameter
				(ModuleRepositoryPackage.Literals.MODULE__COMPONENTS,
				 ComponentRepositoryFactory.eINSTANCE.createLogicalWiring()));

		newChildDescriptors.add
			(createChildParameter
				(ModuleRepositoryPackage.Literals.MODULE__COMPONENTS,
				 ComponentRepositoryFactory.eINSTANCE.createVacuumSwitch()));

		newChildDescriptors.add
			(createChildParameter
				(ModuleRepositoryPackage.Literals.MODULE__COMPONENTS,
				 ComponentRepositoryFactory.eINSTANCE.createReedSwitch()));

		newChildDescriptors.add
			(createChildParameter
				(ModuleRepositoryPackage.Literals.MODULE__COMPONENTS,
				 ComponentRepositoryFactory.eINSTANCE.createPowerSplitter()));

		newChildDescriptors.add
			(createChildParameter
				(ModuleRepositoryPackage.Literals.MODULE__COMPONENTS,
				 ComponentRepositoryFactory.eINSTANCE.createWaterSplitter()));

		newChildDescriptors.add
			(createChildParameter
				(ModuleRepositoryPackage.Literals.MODULE__COMPONENTS,
				 ComponentRepositoryFactory.eINSTANCE.createPneumaticSplitter()));

		newChildDescriptors.add
			(createChildParameter
				(ModuleRepositoryPackage.Literals.MODULE__COMPONENTS,
				 ComponentRepositoryFactory.eINSTANCE.createCylinderPart()));

		newChildDescriptors.add
			(createChildParameter
				(ModuleRepositoryPackage.Literals.MODULE__COMPONENTS,
				 ComponentRepositoryFactory.eINSTANCE.createMonostableCylinder()));

		newChildDescriptors.add
			(createChildParameter
				(ModuleRepositoryPackage.Literals.MODULE__COMPONENTS,
				 ComponentRepositoryFactory.eINSTANCE.createFixture()));

		newChildDescriptors.add
			(createChildParameter
				(ModuleRepositoryPackage.Literals.MODULE__COMPONENTS,
				 BusComponentsFactory.eINSTANCE.createBusBox()));

		newChildDescriptors.add
			(createChildParameter
				(ModuleRepositoryPackage.Literals.MODULE__COMPONENTS,
				 BusComponentsFactory.eINSTANCE.createBusMaster()));

		newChildDescriptors.add
			(createChildParameter
				(ModuleRepositoryPackage.Literals.MODULE__COMPONENTS,
				 BusComponentsFactory.eINSTANCE.createBusSlave()));

		newChildDescriptors.add
			(createChildParameter
				(ModuleRepositoryPackage.Literals.MODULE__COMPONENTS,
				 BusComponentsFactory.eINSTANCE.createBusCable()));

		newChildDescriptors.add
			(createChildParameter
				(ModuleRepositoryPackage.Literals.MODULE__COMPONENTS,
				 BusComponentsFactory.eINSTANCE.createProfibusDPBox()));

		newChildDescriptors.add
			(createChildParameter
				(ModuleRepositoryPackage.Literals.MODULE__COMPONENTS,
				 BusComponentsFactory.eINSTANCE.createProfibusDPMaster()));

		newChildDescriptors.add
			(createChildParameter
				(ModuleRepositoryPackage.Literals.MODULE__COMPONENTS,
				 BusComponentsFactory.eINSTANCE.createProfibusDPSlave()));

		newChildDescriptors.add
			(createChildParameter
				(ModuleRepositoryPackage.Literals.MODULE__COMPONENTS,
				 BusComponentsFactory.eINSTANCE.createProfibusDPCable()));

		newChildDescriptors.add
			(createChildParameter
				(ModuleRepositoryPackage.Literals.MODULE__COMPONENTS,
				 BusComponentsFactory.eINSTANCE.createEtherCATBox()));

		newChildDescriptors.add
			(createChildParameter
				(ModuleRepositoryPackage.Literals.MODULE__COMPONENTS,
				 BusComponentsFactory.eINSTANCE.createEtherCATMaster()));

		newChildDescriptors.add
			(createChildParameter
				(ModuleRepositoryPackage.Literals.MODULE__COMPONENTS,
				 BusComponentsFactory.eINSTANCE.createEtherCATSlave()));

		newChildDescriptors.add
			(createChildParameter
				(ModuleRepositoryPackage.Literals.MODULE__COMPONENTS,
				 BusComponentsFactory.eINSTANCE.createEtherCATCable()));

		newChildDescriptors.add
			(createChildParameter
				(ModuleRepositoryPackage.Literals.MODULE__COMPONENTS,
				 ElectronicComponentsFactory.eINSTANCE.createSwitch()));

		newChildDescriptors.add
			(createChildParameter
				(ModuleRepositoryPackage.Literals.MODULE__COMPONENTS,
				 ElectronicComponentsFactory.eINSTANCE.createLED()));

		newChildDescriptors.add
			(createChildParameter
				(ModuleRepositoryPackage.Literals.MODULE__COMPONENTS,
				 ElectronicComponentsFactory.eINSTANCE.createButton()));

		newChildDescriptors.add
			(createChildParameter
				(ModuleRepositoryPackage.Literals.MODULE__COMPONENTS,
				 ElectronicComponentsFactory.eINSTANCE.createMicroSwitch()));

		newChildDescriptors.add
			(createChildParameter
				(ModuleRepositoryPackage.Literals.MODULE__COMPONENTS,
				 ElectronicComponentsFactory.eINSTANCE.createPotentiometer()));

		newChildDescriptors.add
			(createChildParameter
				(ModuleRepositoryPackage.Literals.MODULE__COMPONENTS,
				 MechanicalComponentsFactory.eINSTANCE.createHousing()));

		newChildDescriptors.add
			(createChildParameter
				(ModuleRepositoryPackage.Literals.MODULE__COMPONENTS,
				 MechanicalComponentsFactory.eINSTANCE.createReturnSpring()));

		newChildDescriptors.add
			(createChildParameter
				(ModuleRepositoryPackage.Literals.MODULE__COMPONENTS,
				 MechanicalComponentsFactory.eINSTANCE.createRubberBand()));

		newChildDescriptors.add
			(createChildParameter
				(ModuleRepositoryPackage.Literals.MODULE__COMPONENTS,
				 MechanicalComponentsFactory.eINSTANCE.createGripperPart()));

		newChildDescriptors.add
			(createChildParameter
				(ModuleRepositoryPackage.Literals.MODULE__COMPONENTS,
				 MechanicalComponentsFactory.eINSTANCE.createArm()));

		newChildDescriptors.add
			(createChildParameter
				(ModuleRepositoryPackage.Literals.MODULE__COMPONENTS,
				 MechanicalComponentsFactory.eINSTANCE.createTable()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return ApsEditPlugin.INSTANCE;
	}

}
