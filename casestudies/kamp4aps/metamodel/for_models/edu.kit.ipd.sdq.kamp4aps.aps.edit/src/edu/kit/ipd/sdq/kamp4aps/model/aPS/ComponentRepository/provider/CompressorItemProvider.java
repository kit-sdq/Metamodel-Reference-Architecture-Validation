/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.provider;


import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.ComponentRepositoryFactory;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.ComponentRepositoryPackage;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Compressor;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.ElectronicComponents.ElectronicComponentsFactory;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.InterfaceRepositoryFactory;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Compressor} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CompressorItemProvider extends ComponentItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompressorItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(ComponentRepositoryPackage.Literals.COMPRESSOR__POWERSUPPLY);
			childrenFeatures.add(ComponentRepositoryPackage.Literals.COMPRESSOR__PNEUMATICSUPPLY);
			childrenFeatures.add(ComponentRepositoryPackage.Literals.COMPRESSOR__PINS);
			childrenFeatures.add(ComponentRepositoryPackage.Literals.COMPRESSOR__SCREWING);
			childrenFeatures.add(ComponentRepositoryPackage.Literals.COMPRESSOR__SWITCH);
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
	 * This returns Compressor.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Compressor"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Compressor)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Compressor_type") :
			getString("_UI_Compressor_type") + " " + label;
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

		switch (notification.getFeatureID(Compressor.class)) {
			case ComponentRepositoryPackage.COMPRESSOR__POWERSUPPLY:
			case ComponentRepositoryPackage.COMPRESSOR__PNEUMATICSUPPLY:
			case ComponentRepositoryPackage.COMPRESSOR__PINS:
			case ComponentRepositoryPackage.COMPRESSOR__SCREWING:
			case ComponentRepositoryPackage.COMPRESSOR__SWITCH:
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
				(ComponentRepositoryPackage.Literals.COMPRESSOR__POWERSUPPLY,
				 ComponentRepositoryFactory.eINSTANCE.createPowerSupply()));

		newChildDescriptors.add
			(createChildParameter
				(ComponentRepositoryPackage.Literals.COMPRESSOR__PNEUMATICSUPPLY,
				 InterfaceRepositoryFactory.eINSTANCE.createPneumaticSupply()));

		newChildDescriptors.add
			(createChildParameter
				(ComponentRepositoryPackage.Literals.COMPRESSOR__PINS,
				 InterfaceRepositoryFactory.eINSTANCE.createSignalInterface()));

		newChildDescriptors.add
			(createChildParameter
				(ComponentRepositoryPackage.Literals.COMPRESSOR__SCREWING,
				 InterfaceRepositoryFactory.eINSTANCE.createScrewing()));

		newChildDescriptors.add
			(createChildParameter
				(ComponentRepositoryPackage.Literals.COMPRESSOR__SWITCH,
				 ComponentRepositoryFactory.eINSTANCE.createVacuumSwitch()));

		newChildDescriptors.add
			(createChildParameter
				(ComponentRepositoryPackage.Literals.COMPRESSOR__SWITCH,
				 ComponentRepositoryFactory.eINSTANCE.createReedSwitch()));

		newChildDescriptors.add
			(createChildParameter
				(ComponentRepositoryPackage.Literals.COMPRESSOR__SWITCH,
				 ElectronicComponentsFactory.eINSTANCE.createSwitch()));

		newChildDescriptors.add
			(createChildParameter
				(ComponentRepositoryPackage.Literals.COMPRESSOR__SWITCH,
				 ElectronicComponentsFactory.eINSTANCE.createMicroSwitch()));
	}

}
