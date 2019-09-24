/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.provider;


import edu.kit.ipd.sdq.kamp4aps.aps.aPS.provider.ApsEditPlugin;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.BusComponentsFactory;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.ComponentRepositoryFactory;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.ComponentRepositoryPackage;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.TurningTable;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.ElectronicComponents.ElectronicComponentsFactory;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.MechanicalComponents.MechanicalComponentsFactory;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.ModuleRepositoryFactory;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.ModuleRepositoryPackage;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.provider.ModuleItemProvider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.TurningTable} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TurningTableItemProvider extends ModuleItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TurningTableItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
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
			childrenFeatures.add(ComponentRepositoryPackage.Literals.TURNING_TABLE__RACK_FOR_TURNINGTABLE);
			childrenFeatures.add(ComponentRepositoryPackage.Literals.TURNING_TABLE__TABLE_TO_STAND_ON);
			childrenFeatures.add(ComponentRepositoryPackage.Literals.TURNING_TABLE__MOTOR_TO_DRIVE);
			childrenFeatures.add(ComponentRepositoryPackage.Literals.TURNING_TABLE__MICROSWITCH_MODULE);
			childrenFeatures.add(ComponentRepositoryPackage.Literals.TURNING_TABLE__BUS_SLAVE);
			childrenFeatures.add(ComponentRepositoryPackage.Literals.TURNING_TABLE__BUS_BOX);
			childrenFeatures.add(ComponentRepositoryPackage.Literals.TURNING_TABLE__BUS_CABLE);
			childrenFeatures.add(ComponentRepositoryPackage.Literals.TURNING_TABLE__POTENTIOMETER);
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
	 * This returns TurningTable.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/TurningTable"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((TurningTable)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_TurningTable_type") :
			getString("_UI_TurningTable_type") + " " + label;
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

		switch (notification.getFeatureID(TurningTable.class)) {
			case ComponentRepositoryPackage.TURNING_TABLE__RACK_FOR_TURNINGTABLE:
			case ComponentRepositoryPackage.TURNING_TABLE__TABLE_TO_STAND_ON:
			case ComponentRepositoryPackage.TURNING_TABLE__MOTOR_TO_DRIVE:
			case ComponentRepositoryPackage.TURNING_TABLE__MICROSWITCH_MODULE:
			case ComponentRepositoryPackage.TURNING_TABLE__BUS_SLAVE:
			case ComponentRepositoryPackage.TURNING_TABLE__BUS_BOX:
			case ComponentRepositoryPackage.TURNING_TABLE__BUS_CABLE:
			case ComponentRepositoryPackage.TURNING_TABLE__POTENTIOMETER:
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
				(ComponentRepositoryPackage.Literals.TURNING_TABLE__RACK_FOR_TURNINGTABLE,
				 ComponentRepositoryFactory.eINSTANCE.createRack()));

		newChildDescriptors.add
			(createChildParameter
				(ComponentRepositoryPackage.Literals.TURNING_TABLE__TABLE_TO_STAND_ON,
				 MechanicalComponentsFactory.eINSTANCE.createTable()));

		newChildDescriptors.add
			(createChildParameter
				(ComponentRepositoryPackage.Literals.TURNING_TABLE__MOTOR_TO_DRIVE,
				 ComponentRepositoryFactory.eINSTANCE.createSimpleMotor()));

		newChildDescriptors.add
			(createChildParameter
				(ComponentRepositoryPackage.Literals.TURNING_TABLE__MICROSWITCH_MODULE,
				 ModuleRepositoryFactory.eINSTANCE.createMicroswitchModule()));

		newChildDescriptors.add
			(createChildParameter
				(ComponentRepositoryPackage.Literals.TURNING_TABLE__BUS_SLAVE,
				 BusComponentsFactory.eINSTANCE.createBusSlave()));

		newChildDescriptors.add
			(createChildParameter
				(ComponentRepositoryPackage.Literals.TURNING_TABLE__BUS_SLAVE,
				 BusComponentsFactory.eINSTANCE.createProfibusDPSlave()));

		newChildDescriptors.add
			(createChildParameter
				(ComponentRepositoryPackage.Literals.TURNING_TABLE__BUS_SLAVE,
				 BusComponentsFactory.eINSTANCE.createEtherCATSlave()));

		newChildDescriptors.add
			(createChildParameter
				(ComponentRepositoryPackage.Literals.TURNING_TABLE__BUS_BOX,
				 BusComponentsFactory.eINSTANCE.createBusBox()));

		newChildDescriptors.add
			(createChildParameter
				(ComponentRepositoryPackage.Literals.TURNING_TABLE__BUS_BOX,
				 BusComponentsFactory.eINSTANCE.createProfibusDPBox()));

		newChildDescriptors.add
			(createChildParameter
				(ComponentRepositoryPackage.Literals.TURNING_TABLE__BUS_BOX,
				 BusComponentsFactory.eINSTANCE.createEtherCATBox()));

		newChildDescriptors.add
			(createChildParameter
				(ComponentRepositoryPackage.Literals.TURNING_TABLE__BUS_CABLE,
				 BusComponentsFactory.eINSTANCE.createBusCable()));

		newChildDescriptors.add
			(createChildParameter
				(ComponentRepositoryPackage.Literals.TURNING_TABLE__BUS_CABLE,
				 BusComponentsFactory.eINSTANCE.createProfibusDPCable()));

		newChildDescriptors.add
			(createChildParameter
				(ComponentRepositoryPackage.Literals.TURNING_TABLE__BUS_CABLE,
				 BusComponentsFactory.eINSTANCE.createEtherCATCable()));

		newChildDescriptors.add
			(createChildParameter
				(ComponentRepositoryPackage.Literals.TURNING_TABLE__POTENTIOMETER,
				 ElectronicComponentsFactory.eINSTANCE.createPotentiometer()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == ModuleRepositoryPackage.Literals.MODULE__MODULES ||
			childFeature == ComponentRepositoryPackage.Literals.TURNING_TABLE__MICROSWITCH_MODULE ||
			childFeature == ModuleRepositoryPackage.Literals.MODULE__COMPONENTS ||
			childFeature == ComponentRepositoryPackage.Literals.TURNING_TABLE__MOTOR_TO_DRIVE ||
			childFeature == ComponentRepositoryPackage.Literals.TURNING_TABLE__RACK_FOR_TURNINGTABLE ||
			childFeature == ComponentRepositoryPackage.Literals.TURNING_TABLE__BUS_BOX ||
			childFeature == ComponentRepositoryPackage.Literals.TURNING_TABLE__BUS_SLAVE ||
			childFeature == ComponentRepositoryPackage.Literals.TURNING_TABLE__BUS_CABLE ||
			childFeature == ComponentRepositoryPackage.Literals.TURNING_TABLE__POTENTIOMETER ||
			childFeature == ComponentRepositoryPackage.Literals.TURNING_TABLE__TABLE_TO_STAND_ON;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
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
