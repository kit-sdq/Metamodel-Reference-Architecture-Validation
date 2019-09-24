/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.provider;


import edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.BusComponentsFactory;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.ComponentRepositoryFactory;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.ComponentRepositoryPackage;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Pusher;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.InterfaceRepositoryFactory;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Pusher} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PusherItemProvider extends ComponentItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PusherItemProvider(AdapterFactory adapterFactory) {
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

			addComponentsRepositoryPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Components Repository feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addComponentsRepositoryPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Pusher_componentsRepository_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Pusher_componentsRepository_feature", "_UI_Pusher_type"),
				 ComponentRepositoryPackage.Literals.PUSHER__COMPONENTS_REPOSITORY,
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
			childrenFeatures.add(ComponentRepositoryPackage.Literals.PUSHER__FIXTURE_CYLINDER);
			childrenFeatures.add(ComponentRepositoryPackage.Literals.PUSHER__MONOSTABLE_CYLINDER);
			childrenFeatures.add(ComponentRepositoryPackage.Literals.PUSHER__BUS_BOX);
			childrenFeatures.add(ComponentRepositoryPackage.Literals.PUSHER__BUS_CABLE);
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
	 * This returns Pusher.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Pusher"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Pusher)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Pusher_type") :
			getString("_UI_Pusher_type") + " " + label;
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

		switch (notification.getFeatureID(Pusher.class)) {
			case ComponentRepositoryPackage.PUSHER__FIXTURE_CYLINDER:
			case ComponentRepositoryPackage.PUSHER__MONOSTABLE_CYLINDER:
			case ComponentRepositoryPackage.PUSHER__BUS_BOX:
			case ComponentRepositoryPackage.PUSHER__BUS_CABLE:
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
				(ComponentRepositoryPackage.Literals.PUSHER__FIXTURE_CYLINDER,
				 InterfaceRepositoryFactory.eINSTANCE.createPhysicalConnection()));

		newChildDescriptors.add
			(createChildParameter
				(ComponentRepositoryPackage.Literals.PUSHER__MONOSTABLE_CYLINDER,
				 ComponentRepositoryFactory.eINSTANCE.createMonostableCylinder()));

		newChildDescriptors.add
			(createChildParameter
				(ComponentRepositoryPackage.Literals.PUSHER__BUS_BOX,
				 BusComponentsFactory.eINSTANCE.createBusBox()));

		newChildDescriptors.add
			(createChildParameter
				(ComponentRepositoryPackage.Literals.PUSHER__BUS_BOX,
				 BusComponentsFactory.eINSTANCE.createProfibusDPBox()));

		newChildDescriptors.add
			(createChildParameter
				(ComponentRepositoryPackage.Literals.PUSHER__BUS_BOX,
				 BusComponentsFactory.eINSTANCE.createEtherCATBox()));

		newChildDescriptors.add
			(createChildParameter
				(ComponentRepositoryPackage.Literals.PUSHER__BUS_CABLE,
				 BusComponentsFactory.eINSTANCE.createBusCable()));

		newChildDescriptors.add
			(createChildParameter
				(ComponentRepositoryPackage.Literals.PUSHER__BUS_CABLE,
				 BusComponentsFactory.eINSTANCE.createProfibusDPCable()));

		newChildDescriptors.add
			(createChildParameter
				(ComponentRepositoryPackage.Literals.PUSHER__BUS_CABLE,
				 BusComponentsFactory.eINSTANCE.createEtherCATCable()));
	}

}
