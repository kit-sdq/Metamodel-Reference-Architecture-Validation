/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.aPS.provider;


import edu.kit.ipd.sdq.kamp4aps.aps.aPS.provider.ApsEditPlugin;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.ComponentRepositoryFactory;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.InterfaceRepositoryFactory;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.ModuleRepositoryFactory;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.Plant;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.StructureRepository.StructureRepositoryFactory;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.apsPackage;

import edu.kit.ipd.sdq.kamp4aps.model.basic.provider.EntityItemProvider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link edu.kit.ipd.sdq.kamp4aps.model.aPS.Plant} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PlantItemProvider extends EntityItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlantItemProvider(AdapterFactory adapterFactory) {
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

			addPlantNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Plant Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPlantNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Plant_PlantName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Plant_PlantName_feature", "_UI_Plant_type"),
				 apsPackage.Literals.PLANT__PLANT_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
			childrenFeatures.add(apsPackage.Literals.PLANT__STRUCTURES);
			childrenFeatures.add(apsPackage.Literals.PLANT__INTERFACE_REPOSITORY);
			childrenFeatures.add(apsPackage.Literals.PLANT__COMPONENT_REPOSITORY);
			childrenFeatures.add(apsPackage.Literals.PLANT__MODULE_REPOSITORY);
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
	 * This returns Plant.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Plant"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Plant)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Plant_type") :
			getString("_UI_Plant_type") + " " + label;
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

		switch (notification.getFeatureID(Plant.class)) {
			case apsPackage.PLANT__PLANT_NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case apsPackage.PLANT__STRUCTURES:
			case apsPackage.PLANT__INTERFACE_REPOSITORY:
			case apsPackage.PLANT__COMPONENT_REPOSITORY:
			case apsPackage.PLANT__MODULE_REPOSITORY:
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
				(apsPackage.Literals.PLANT__STRUCTURES,
				 StructureRepositoryFactory.eINSTANCE.createStructure()));

		newChildDescriptors.add
			(createChildParameter
				(apsPackage.Literals.PLANT__STRUCTURES,
				 StructureRepositoryFactory.eINSTANCE.createCommunicationNetwork()));

		newChildDescriptors.add
			(createChildParameter
				(apsPackage.Literals.PLANT__STRUCTURES,
				 StructureRepositoryFactory.eINSTANCE.createPowerNetwork()));

		newChildDescriptors.add
			(createChildParameter
				(apsPackage.Literals.PLANT__STRUCTURES,
				 StructureRepositoryFactory.eINSTANCE.createControlCabinet()));

		newChildDescriptors.add
			(createChildParameter
				(apsPackage.Literals.PLANT__STRUCTURES,
				 StructureRepositoryFactory.eINSTANCE.createPneumaticNetwork()));

		newChildDescriptors.add
			(createChildParameter
				(apsPackage.Literals.PLANT__STRUCTURES,
				 StructureRepositoryFactory.eINSTANCE.createConveyor()));

		newChildDescriptors.add
			(createChildParameter
				(apsPackage.Literals.PLANT__STRUCTURES,
				 StructureRepositoryFactory.eINSTANCE.createCrane()));

		newChildDescriptors.add
			(createChildParameter
				(apsPackage.Literals.PLANT__STRUCTURES,
				 StructureRepositoryFactory.eINSTANCE.createPowerWiring()));

		newChildDescriptors.add
			(createChildParameter
				(apsPackage.Literals.PLANT__STRUCTURES,
				 StructureRepositoryFactory.eINSTANCE.createLogicalWiring()));

		newChildDescriptors.add
			(createChildParameter
				(apsPackage.Literals.PLANT__INTERFACE_REPOSITORY,
				 InterfaceRepositoryFactory.eINSTANCE.createInterfaceRepository()));

		newChildDescriptors.add
			(createChildParameter
				(apsPackage.Literals.PLANT__COMPONENT_REPOSITORY,
				 ComponentRepositoryFactory.eINSTANCE.createComponentRepository()));

		newChildDescriptors.add
			(createChildParameter
				(apsPackage.Literals.PLANT__MODULE_REPOSITORY,
				 ModuleRepositoryFactory.eINSTANCE.createModuleRepository()));
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
