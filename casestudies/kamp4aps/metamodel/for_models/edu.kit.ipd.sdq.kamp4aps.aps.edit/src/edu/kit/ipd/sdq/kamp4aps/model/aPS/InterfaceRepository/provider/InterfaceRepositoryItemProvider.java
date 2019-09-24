/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.provider;


import edu.kit.ipd.sdq.kamp4aps.aps.aPS.provider.ApsEditPlugin;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.ComponentRepositoryFactory;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.InterfaceRepository;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.InterfaceRepositoryFactory;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.InterfaceRepositoryPackage;

import edu.kit.ipd.sdq.kamp4aps.model.basic.provider.EntityItemProvider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.InterfaceRepository} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class InterfaceRepositoryItemProvider extends EntityItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceRepositoryItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(InterfaceRepositoryPackage.Literals.INTERFACE_REPOSITORY__ALL_INTERFACES_IN_PLANT);
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
	 * This returns InterfaceRepository.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/InterfaceRepository"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((InterfaceRepository)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_InterfaceRepository_type") :
			getString("_UI_InterfaceRepository_type") + " " + label;
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

		switch (notification.getFeatureID(InterfaceRepository.class)) {
			case InterfaceRepositoryPackage.INTERFACE_REPOSITORY__ALL_INTERFACES_IN_PLANT:
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
				(InterfaceRepositoryPackage.Literals.INTERFACE_REPOSITORY__ALL_INTERFACES_IN_PLANT,
				 InterfaceRepositoryFactory.eINSTANCE.createInterface()));

		newChildDescriptors.add
			(createChildParameter
				(InterfaceRepositoryPackage.Literals.INTERFACE_REPOSITORY__ALL_INTERFACES_IN_PLANT,
				 InterfaceRepositoryFactory.eINSTANCE.createScrewing()));

		newChildDescriptors.add
			(createChildParameter
				(InterfaceRepositoryPackage.Literals.INTERFACE_REPOSITORY__ALL_INTERFACES_IN_PLANT,
				 InterfaceRepositoryFactory.eINSTANCE.createSuspension()));

		newChildDescriptors.add
			(createChildParameter
				(InterfaceRepositoryPackage.Literals.INTERFACE_REPOSITORY__ALL_INTERFACES_IN_PLANT,
				 InterfaceRepositoryFactory.eINSTANCE.createGearing()));

		newChildDescriptors.add
			(createChildParameter
				(InterfaceRepositoryPackage.Literals.INTERFACE_REPOSITORY__ALL_INTERFACES_IN_PLANT,
				 InterfaceRepositoryFactory.eINSTANCE.createClamping()));

		newChildDescriptors.add
			(createChildParameter
				(InterfaceRepositoryPackage.Literals.INTERFACE_REPOSITORY__ALL_INTERFACES_IN_PLANT,
				 InterfaceRepositoryFactory.eINSTANCE.createPneumaticSupply()));

		newChildDescriptors.add
			(createChildParameter
				(InterfaceRepositoryPackage.Literals.INTERFACE_REPOSITORY__ALL_INTERFACES_IN_PLANT,
				 InterfaceRepositoryFactory.eINSTANCE.createSignalInterface()));

		newChildDescriptors.add
			(createChildParameter
				(InterfaceRepositoryPackage.Literals.INTERFACE_REPOSITORY__ALL_INTERFACES_IN_PLANT,
				 InterfaceRepositoryFactory.eINSTANCE.createWaterSupply()));

		newChildDescriptors.add
			(createChildParameter
				(InterfaceRepositoryPackage.Literals.INTERFACE_REPOSITORY__ALL_INTERFACES_IN_PLANT,
				 InterfaceRepositoryFactory.eINSTANCE.createPhysicalConnection()));

		newChildDescriptors.add
			(createChildParameter
				(InterfaceRepositoryPackage.Literals.INTERFACE_REPOSITORY__ALL_INTERFACES_IN_PLANT,
				 InterfaceRepositoryFactory.eINSTANCE.createTransportConnection()));

		newChildDescriptors.add
			(createChildParameter
				(InterfaceRepositoryPackage.Literals.INTERFACE_REPOSITORY__ALL_INTERFACES_IN_PLANT,
				 InterfaceRepositoryFactory.eINSTANCE.createFixture()));

		newChildDescriptors.add
			(createChildParameter
				(InterfaceRepositoryPackage.Literals.INTERFACE_REPOSITORY__ALL_INTERFACES_IN_PLANT,
				 ComponentRepositoryFactory.eINSTANCE.createPowerSupply()));
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
