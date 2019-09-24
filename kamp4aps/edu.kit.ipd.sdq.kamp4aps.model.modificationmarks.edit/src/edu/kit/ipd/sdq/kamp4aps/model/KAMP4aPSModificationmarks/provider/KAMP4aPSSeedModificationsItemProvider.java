/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.provider;


import edu.kit.ipd.sdq.kamp.model.modificationmarks.provider.AbstractSeedModificationsItemProvider;

import edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.KAMP4aPSModificationmarksFactory;
import edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.KAMP4aPSModificationmarksPackage;
import edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.KAMP4aPSSeedModifications;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.KAMP4aPSSeedModifications} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class KAMP4aPSSeedModificationsItemProvider extends AbstractSeedModificationsItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KAMP4aPSSeedModificationsItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(KAMP4aPSModificationmarksPackage.Literals.KAMP_4A_PS_SEED_MODIFICATIONS__STRUCTURE_MODIFICATIONS);
			childrenFeatures.add(KAMP4aPSModificationmarksPackage.Literals.KAMP_4A_PS_SEED_MODIFICATIONS__MODULE_MODIFICATIONS);
			childrenFeatures.add(KAMP4aPSModificationmarksPackage.Literals.KAMP_4A_PS_SEED_MODIFICATIONS__COMPONENT_MODIFICATIONS);
			childrenFeatures.add(KAMP4aPSModificationmarksPackage.Literals.KAMP_4A_PS_SEED_MODIFICATIONS__INTERFACE_MODIFICATIONS);
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
	 * This returns KAMP4aPSSeedModifications.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/KAMP4aPSSeedModifications"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_KAMP4aPSSeedModifications_type");
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

		switch (notification.getFeatureID(KAMP4aPSSeedModifications.class)) {
			case KAMP4aPSModificationmarksPackage.KAMP_4A_PS_SEED_MODIFICATIONS__STRUCTURE_MODIFICATIONS:
			case KAMP4aPSModificationmarksPackage.KAMP_4A_PS_SEED_MODIFICATIONS__MODULE_MODIFICATIONS:
			case KAMP4aPSModificationmarksPackage.KAMP_4A_PS_SEED_MODIFICATIONS__COMPONENT_MODIFICATIONS:
			case KAMP4aPSModificationmarksPackage.KAMP_4A_PS_SEED_MODIFICATIONS__INTERFACE_MODIFICATIONS:
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
				(KAMP4aPSModificationmarksPackage.Literals.KAMP_4A_PS_SEED_MODIFICATIONS__STRUCTURE_MODIFICATIONS,
				 KAMP4aPSModificationmarksFactory.eINSTANCE.createModifyStructure()));

		newChildDescriptors.add
			(createChildParameter
				(KAMP4aPSModificationmarksPackage.Literals.KAMP_4A_PS_SEED_MODIFICATIONS__MODULE_MODIFICATIONS,
				 KAMP4aPSModificationmarksFactory.eINSTANCE.createModifyModule()));

		newChildDescriptors.add
			(createChildParameter
				(KAMP4aPSModificationmarksPackage.Literals.KAMP_4A_PS_SEED_MODIFICATIONS__MODULE_MODIFICATIONS,
				 KAMP4aPSModificationmarksFactory.eINSTANCE.createModifyMicroSwitchModule()));

		newChildDescriptors.add
			(createChildParameter
				(KAMP4aPSModificationmarksPackage.Literals.KAMP_4A_PS_SEED_MODIFICATIONS__COMPONENT_MODIFICATIONS,
				 KAMP4aPSModificationmarksFactory.eINSTANCE.createModifyComponent()));

		newChildDescriptors.add
			(createChildParameter
				(KAMP4aPSModificationmarksPackage.Literals.KAMP_4A_PS_SEED_MODIFICATIONS__COMPONENT_MODIFICATIONS,
				 KAMP4aPSModificationmarksFactory.eINSTANCE.createModifyBusBox()));

		newChildDescriptors.add
			(createChildParameter
				(KAMP4aPSModificationmarksPackage.Literals.KAMP_4A_PS_SEED_MODIFICATIONS__COMPONENT_MODIFICATIONS,
				 KAMP4aPSModificationmarksFactory.eINSTANCE.createModifyBusMaster()));

		newChildDescriptors.add
			(createChildParameter
				(KAMP4aPSModificationmarksPackage.Literals.KAMP_4A_PS_SEED_MODIFICATIONS__COMPONENT_MODIFICATIONS,
				 KAMP4aPSModificationmarksFactory.eINSTANCE.createModifyBusSlave()));

		newChildDescriptors.add
			(createChildParameter
				(KAMP4aPSModificationmarksPackage.Literals.KAMP_4A_PS_SEED_MODIFICATIONS__COMPONENT_MODIFICATIONS,
				 KAMP4aPSModificationmarksFactory.eINSTANCE.createModifyBusCable()));

		newChildDescriptors.add
			(createChildParameter
				(KAMP4aPSModificationmarksPackage.Literals.KAMP_4A_PS_SEED_MODIFICATIONS__COMPONENT_MODIFICATIONS,
				 KAMP4aPSModificationmarksFactory.eINSTANCE.createModifySensor()));

		newChildDescriptors.add
			(createChildParameter
				(KAMP4aPSModificationmarksPackage.Literals.KAMP_4A_PS_SEED_MODIFICATIONS__COMPONENT_MODIFICATIONS,
				 KAMP4aPSModificationmarksFactory.eINSTANCE.createModifyRamp()));

		newChildDescriptors.add
			(createChildParameter
				(KAMP4aPSModificationmarksPackage.Literals.KAMP_4A_PS_SEED_MODIFICATIONS__INTERFACE_MODIFICATIONS,
				 KAMP4aPSModificationmarksFactory.eINSTANCE.createModifyInterface()));

		newChildDescriptors.add
			(createChildParameter
				(KAMP4aPSModificationmarksPackage.Literals.KAMP_4A_PS_SEED_MODIFICATIONS__INTERFACE_MODIFICATIONS,
				 KAMP4aPSModificationmarksFactory.eINSTANCE.createModifySignalinterface()));

		newChildDescriptors.add
			(createChildParameter
				(KAMP4aPSModificationmarksPackage.Literals.KAMP_4A_PS_SEED_MODIFICATIONS__INTERFACE_MODIFICATIONS,
				 KAMP4aPSModificationmarksFactory.eINSTANCE.createModifyPhysicalConnection()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return KAMP4aPSModificationmarksEditPlugin.INSTANCE;
	}

}
