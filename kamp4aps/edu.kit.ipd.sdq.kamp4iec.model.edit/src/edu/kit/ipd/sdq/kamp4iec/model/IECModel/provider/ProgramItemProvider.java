/**
 */
package edu.kit.ipd.sdq.kamp4iec.model.IECModel.provider;


import edu.kit.ipd.sdq.kamp4iec.model.IECModel.IECModelFactory;
import edu.kit.ipd.sdq.kamp4iec.model.IECModel.IECModelPackage;
import edu.kit.ipd.sdq.kamp4iec.model.IECModel.Program;

import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.provider.IdentifierItemProvider;
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
 * This is the item provider adapter for a {@link edu.kit.ipd.sdq.kamp4iec.model.IECModel.Program} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ProgramItemProvider 
	extends IdentifierItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProgramItemProvider(AdapterFactory adapterFactory) {
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

			addTypePropertyDescriptor(object);
			addAccessesPropertyPropertyDescriptor(object);
			addCallsMethodPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Program_Type_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Program_Type_feature", "_UI_Program_type"),
				 IECModelPackage.Literals.PROGRAM__TYPE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Accesses Property feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAccessesPropertyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Program_AccessesProperty_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Program_AccessesProperty_feature", "_UI_Program_type"),
				 IECModelPackage.Literals.PROGRAM__ACCESSES_PROPERTY,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Calls Method feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCallsMethodPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Program_CallsMethod_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Program_CallsMethod_feature", "_UI_Program_type"),
				 IECModelPackage.Literals.PROGRAM__CALLS_METHOD,
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
			childrenFeatures.add(IECModelPackage.Literals.PROGRAM__CALLS_FUNCTION);
			childrenFeatures.add(IECModelPackage.Literals.PROGRAM__CALLS_FUNCTION_BLOCK);
			childrenFeatures.add(IECModelPackage.Literals.PROGRAM__IMPLEMENTS_INTERFACE);
			childrenFeatures.add(IECModelPackage.Literals.PROGRAM__DECLARES_VARIABLE);
			childrenFeatures.add(IECModelPackage.Literals.PROGRAM__USES_ENUM);
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
	 * This returns Program.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Program"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Program)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Program_type") :
			getString("_UI_Program_type") + " " + label;
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

		switch (notification.getFeatureID(Program.class)) {
			case IECModelPackage.PROGRAM__CALLS_FUNCTION:
			case IECModelPackage.PROGRAM__CALLS_FUNCTION_BLOCK:
			case IECModelPackage.PROGRAM__IMPLEMENTS_INTERFACE:
			case IECModelPackage.PROGRAM__DECLARES_VARIABLE:
			case IECModelPackage.PROGRAM__USES_ENUM:
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
				(IECModelPackage.Literals.PROGRAM__CALLS_FUNCTION,
				 IECModelFactory.eINSTANCE.createFunction()));

		newChildDescriptors.add
			(createChildParameter
				(IECModelPackage.Literals.PROGRAM__CALLS_FUNCTION_BLOCK,
				 IECModelFactory.eINSTANCE.createFunctionBlock()));

		newChildDescriptors.add
			(createChildParameter
				(IECModelPackage.Literals.PROGRAM__IMPLEMENTS_INTERFACE,
				 IECModelFactory.eINSTANCE.createIECInterface()));

		newChildDescriptors.add
			(createChildParameter
				(IECModelPackage.Literals.PROGRAM__DECLARES_VARIABLE,
				 IECModelFactory.eINSTANCE.createGlobalVariable()));

		newChildDescriptors.add
			(createChildParameter
				(IECModelPackage.Literals.PROGRAM__USES_ENUM,
				 IECModelFactory.eINSTANCE.createEnum()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return IECModelEditPlugin.INSTANCE;
	}

}
