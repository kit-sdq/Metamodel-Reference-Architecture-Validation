/**
 */
package edu.kit.ipd.sdq.kamp4iec.model.IECRepository.provider;


import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECMethodImplementation;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECRepositoryPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

/**
 * This is the item provider adapter for a {@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECMethodImplementation} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class IECMethodImplementationItemProvider extends IdentifierItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IECMethodImplementationItemProvider(AdapterFactory adapterFactory) {
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

			addImplementsPropertyDescriptor(object);
			addAccessesPropertyPropertyDescriptor(object);
			addAccessesVariablePropertyDescriptor(object);
			addUsesEnumPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Implements feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addImplementsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IECMethodImplementation_implements_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IECMethodImplementation_implements_feature", "_UI_IECMethodImplementation_type"),
				 IECRepositoryPackage.Literals.IEC_METHOD_IMPLEMENTATION__IMPLEMENTS,
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
				 getString("_UI_IECMethodImplementation_AccessesProperty_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IECMethodImplementation_AccessesProperty_feature", "_UI_IECMethodImplementation_type"),
				 IECRepositoryPackage.Literals.IEC_METHOD_IMPLEMENTATION__ACCESSES_PROPERTY,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Accesses Variable feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAccessesVariablePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IECMethodImplementation_AccessesVariable_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IECMethodImplementation_AccessesVariable_feature", "_UI_IECMethodImplementation_type"),
				 IECRepositoryPackage.Literals.IEC_METHOD_IMPLEMENTATION__ACCESSES_VARIABLE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Uses Enum feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUsesEnumPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IECMethodImplementation_UsesEnum_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IECMethodImplementation_UsesEnum_feature", "_UI_IECMethodImplementation_type"),
				 IECRepositoryPackage.Literals.IEC_METHOD_IMPLEMENTATION__USES_ENUM,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns IECMethodImplementation.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/IECMethodImplementation"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((IECMethodImplementation)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_IECMethodImplementation_type") :
			getString("_UI_IECMethodImplementation_type") + " " + label;
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
	}

}
