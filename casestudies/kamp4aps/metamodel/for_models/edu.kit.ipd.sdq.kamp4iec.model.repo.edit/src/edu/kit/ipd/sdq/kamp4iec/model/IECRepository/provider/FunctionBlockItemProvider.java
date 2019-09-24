/**
 */
package edu.kit.ipd.sdq.kamp4iec.model.IECRepository.provider;


import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.FunctionBlock;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECRepositoryFactory;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECRepositoryPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.FunctionBlock} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FunctionBlockItemProvider extends IdentifierItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionBlockItemProvider(AdapterFactory adapterFactory) {
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

			addAccessesVariablePropertyDescriptor(object);
			addUsesFunctionBlockPropertyDescriptor(object);
			addCallsFunctionPropertyDescriptor(object);
			addUsesEnumPropertyDescriptor(object);
			addUsesInterfacePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
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
				 getString("_UI_FunctionBlock_AccessesVariable_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FunctionBlock_AccessesVariable_feature", "_UI_FunctionBlock_type"),
				 IECRepositoryPackage.Literals.FUNCTION_BLOCK__ACCESSES_VARIABLE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Uses Function Block feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUsesFunctionBlockPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FunctionBlock_UsesFunctionBlock_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FunctionBlock_UsesFunctionBlock_feature", "_UI_FunctionBlock_type"),
				 IECRepositoryPackage.Literals.FUNCTION_BLOCK__USES_FUNCTION_BLOCK,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Calls Function feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCallsFunctionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FunctionBlock_CallsFunction_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FunctionBlock_CallsFunction_feature", "_UI_FunctionBlock_type"),
				 IECRepositoryPackage.Literals.FUNCTION_BLOCK__CALLS_FUNCTION,
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
				 getString("_UI_FunctionBlock_UsesEnum_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FunctionBlock_UsesEnum_feature", "_UI_FunctionBlock_type"),
				 IECRepositoryPackage.Literals.FUNCTION_BLOCK__USES_ENUM,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Uses Interface feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUsesInterfacePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FunctionBlock_UsesInterface_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FunctionBlock_UsesInterface_feature", "_UI_FunctionBlock_type"),
				 IECRepositoryPackage.Literals.FUNCTION_BLOCK__USES_INTERFACE,
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
			childrenFeatures.add(IECRepositoryPackage.Literals.FUNCTION_BLOCK__HAS_IEC_METHOD);
			childrenFeatures.add(IECRepositoryPackage.Literals.FUNCTION_BLOCK__HAS_IEC_PROPERTY);
			childrenFeatures.add(IECRepositoryPackage.Literals.FUNCTION_BLOCK__HAS_INTERFACE);
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
	 * This returns FunctionBlock.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/FunctionBlock"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((FunctionBlock)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_FunctionBlock_type") :
			getString("_UI_FunctionBlock_type") + " " + label;
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

		switch (notification.getFeatureID(FunctionBlock.class)) {
			case IECRepositoryPackage.FUNCTION_BLOCK__HAS_IEC_METHOD:
			case IECRepositoryPackage.FUNCTION_BLOCK__HAS_IEC_PROPERTY:
			case IECRepositoryPackage.FUNCTION_BLOCK__HAS_INTERFACE:
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
				(IECRepositoryPackage.Literals.FUNCTION_BLOCK__HAS_IEC_METHOD,
				 IECRepositoryFactory.eINSTANCE.createIECMethodImplementation()));

		newChildDescriptors.add
			(createChildParameter
				(IECRepositoryPackage.Literals.FUNCTION_BLOCK__HAS_IEC_PROPERTY,
				 IECRepositoryFactory.eINSTANCE.createIECPropertyImplementation()));

		newChildDescriptors.add
			(createChildParameter
				(IECRepositoryPackage.Literals.FUNCTION_BLOCK__HAS_INTERFACE,
				 IECRepositoryFactory.eINSTANCE.createImplementsInterface()));
	}

}
