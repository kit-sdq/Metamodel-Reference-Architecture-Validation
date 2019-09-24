/**
 */
package edu.kit.ipd.sdq.kamp4iec.model.ComponentInternalDependencies.impl;

import edu.kit.ipd.sdq.kamp4iec.model.ComponentInternalDependencies.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ComponentInternalDependenciesFactoryImpl extends EFactoryImpl implements ComponentInternalDependenciesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ComponentInternalDependenciesFactory init() {
		try {
			ComponentInternalDependenciesFactory theComponentInternalDependenciesFactory = (ComponentInternalDependenciesFactory)EPackage.Registry.INSTANCE.getEFactory(ComponentInternalDependenciesPackage.eNS_URI);
			if (theComponentInternalDependenciesFactory != null) {
				return theComponentInternalDependenciesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ComponentInternalDependenciesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentInternalDependenciesFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ComponentInternalDependenciesPackage.COMPONENT_INTERNAL_DEPENDENCIES_REPOSITORY: return createComponentInternalDependenciesRepository();
			case ComponentInternalDependenciesPackage.FUNCTIONBLOCK_DEPENDENCY: return createFunctionblockDependency();
			case ComponentInternalDependenciesPackage.METHOD_DEPENDENCY: return createMethodDependency();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentInternalDependenciesRepository createComponentInternalDependenciesRepository() {
		ComponentInternalDependenciesRepositoryImpl componentInternalDependenciesRepository = new ComponentInternalDependenciesRepositoryImpl();
		return componentInternalDependenciesRepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionblockDependency createFunctionblockDependency() {
		FunctionblockDependencyImpl functionblockDependency = new FunctionblockDependencyImpl();
		return functionblockDependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodDependency createMethodDependency() {
		MethodDependencyImpl methodDependency = new MethodDependencyImpl();
		return methodDependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentInternalDependenciesPackage getComponentInternalDependenciesPackage() {
		return (ComponentInternalDependenciesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ComponentInternalDependenciesPackage getPackage() {
		return ComponentInternalDependenciesPackage.eINSTANCE;
	}

} //ComponentInternalDependenciesFactoryImpl
