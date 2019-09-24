/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.provider;


import edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.BusComponentsFactory;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.ComponentRepositoryFactory;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.ComponentRepositoryPackage;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.MonostableCylinder;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.MechanicalComponents.MechanicalComponentsFactory;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.MonostableCylinder} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MonostableCylinderItemProvider extends CylinderItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MonostableCylinderItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(ComponentRepositoryPackage.Literals.MONOSTABLE_CYLINDER__HOUSING);
			childrenFeatures.add(ComponentRepositoryPackage.Literals.MONOSTABLE_CYLINDER__SPRING);
			childrenFeatures.add(ComponentRepositoryPackage.Literals.MONOSTABLE_CYLINDER__REED_SWITCHES);
			childrenFeatures.add(ComponentRepositoryPackage.Literals.MONOSTABLE_CYLINDER__CYLINDER_PART);
			childrenFeatures.add(ComponentRepositoryPackage.Literals.MONOSTABLE_CYLINDER__VALVE);
			childrenFeatures.add(ComponentRepositoryPackage.Literals.MONOSTABLE_CYLINDER__BUS_SLAVE);
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
	 * This returns MonostableCylinder.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/MonostableCylinder"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((MonostableCylinder)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_MonostableCylinder_type") :
			getString("_UI_MonostableCylinder_type") + " " + label;
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

		switch (notification.getFeatureID(MonostableCylinder.class)) {
			case ComponentRepositoryPackage.MONOSTABLE_CYLINDER__HOUSING:
			case ComponentRepositoryPackage.MONOSTABLE_CYLINDER__SPRING:
			case ComponentRepositoryPackage.MONOSTABLE_CYLINDER__REED_SWITCHES:
			case ComponentRepositoryPackage.MONOSTABLE_CYLINDER__CYLINDER_PART:
			case ComponentRepositoryPackage.MONOSTABLE_CYLINDER__VALVE:
			case ComponentRepositoryPackage.MONOSTABLE_CYLINDER__BUS_SLAVE:
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
				(ComponentRepositoryPackage.Literals.MONOSTABLE_CYLINDER__HOUSING,
				 MechanicalComponentsFactory.eINSTANCE.createHousing()));

		newChildDescriptors.add
			(createChildParameter
				(ComponentRepositoryPackage.Literals.MONOSTABLE_CYLINDER__SPRING,
				 MechanicalComponentsFactory.eINSTANCE.createReturnSpring()));

		newChildDescriptors.add
			(createChildParameter
				(ComponentRepositoryPackage.Literals.MONOSTABLE_CYLINDER__REED_SWITCHES,
				 ComponentRepositoryFactory.eINSTANCE.createReedSwitch()));

		newChildDescriptors.add
			(createChildParameter
				(ComponentRepositoryPackage.Literals.MONOSTABLE_CYLINDER__CYLINDER_PART,
				 ComponentRepositoryFactory.eINSTANCE.createCylinderPart()));

		newChildDescriptors.add
			(createChildParameter
				(ComponentRepositoryPackage.Literals.MONOSTABLE_CYLINDER__VALVE,
				 ComponentRepositoryFactory.eINSTANCE.createRegularValve()));

		newChildDescriptors.add
			(createChildParameter
				(ComponentRepositoryPackage.Literals.MONOSTABLE_CYLINDER__BUS_SLAVE,
				 BusComponentsFactory.eINSTANCE.createProfibusDPSlave()));
	}

}
