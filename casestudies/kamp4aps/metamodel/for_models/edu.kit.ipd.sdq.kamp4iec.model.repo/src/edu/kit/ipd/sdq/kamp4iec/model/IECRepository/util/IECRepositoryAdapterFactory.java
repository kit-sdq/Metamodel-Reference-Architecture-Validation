/**
 */
package edu.kit.ipd.sdq.kamp4iec.model.IECRepository.util;

import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.Function;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.FunctionBlock;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.FunctionblockResource;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.GlobalVariable;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECInterface;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECMethod;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECMethodImplementation;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECProperty;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECPropertyImplementation;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECRepositoryPackage;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.Identifier;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.ImplementsInterface;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.MethodResource;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.Program;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.Repository;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECRepositoryPackage
 * @generated
 */
public class IECRepositoryAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static IECRepositoryPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IECRepositoryAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = IECRepositoryPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IECRepositorySwitch<Adapter> modelSwitch =
		new IECRepositorySwitch<Adapter>() {
			@Override
			public Adapter caseFunctionBlock(FunctionBlock object) {
				return createFunctionBlockAdapter();
			}
			@Override
			public Adapter caseGlobalVariable(GlobalVariable object) {
				return createGlobalVariableAdapter();
			}
			@Override
			public Adapter caseIECInterface(IECInterface object) {
				return createIECInterfaceAdapter();
			}
			@Override
			public Adapter caseIECMethodImplementation(IECMethodImplementation object) {
				return createIECMethodImplementationAdapter();
			}
			@Override
			public Adapter caseFunction(Function object) {
				return createFunctionAdapter();
			}
			@Override
			public Adapter caseProgram(Program object) {
				return createProgramAdapter();
			}
			@Override
			public Adapter caseRepository(Repository object) {
				return createRepositoryAdapter();
			}
			@Override
			public Adapter caseIECPropertyImplementation(IECPropertyImplementation object) {
				return createIECPropertyImplementationAdapter();
			}
			@Override
			public Adapter caseIECProperty(IECProperty object) {
				return createIECPropertyAdapter();
			}
			@Override
			public Adapter caseIECMethod(IECMethod object) {
				return createIECMethodAdapter();
			}
			@Override
			public Adapter caseFunctionblockResource(FunctionblockResource object) {
				return createFunctionblockResourceAdapter();
			}
			@Override
			public Adapter caseMethodResource(MethodResource object) {
				return createMethodResourceAdapter();
			}
			@Override
			public Adapter caseEnum(edu.kit.ipd.sdq.kamp4iec.model.IECRepository.Enum object) {
				return createEnumAdapter();
			}
			@Override
			public Adapter caseIdentifier(Identifier object) {
				return createIdentifierAdapter();
			}
			@Override
			public Adapter caseImplementsInterface(ImplementsInterface object) {
				return createImplementsInterfaceAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.FunctionBlock <em>Function Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.FunctionBlock
	 * @generated
	 */
	public Adapter createFunctionBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.GlobalVariable <em>Global Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.GlobalVariable
	 * @generated
	 */
	public Adapter createGlobalVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECInterface <em>IEC Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECInterface
	 * @generated
	 */
	public Adapter createIECInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECMethodImplementation <em>IEC Method Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECMethodImplementation
	 * @generated
	 */
	public Adapter createIECMethodImplementationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.Function <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.Function
	 * @generated
	 */
	public Adapter createFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.Program <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.Program
	 * @generated
	 */
	public Adapter createProgramAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.Repository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.Repository
	 * @generated
	 */
	public Adapter createRepositoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECPropertyImplementation <em>IEC Property Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECPropertyImplementation
	 * @generated
	 */
	public Adapter createIECPropertyImplementationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECProperty <em>IEC Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECProperty
	 * @generated
	 */
	public Adapter createIECPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECMethod <em>IEC Method</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECMethod
	 * @generated
	 */
	public Adapter createIECMethodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.FunctionblockResource <em>Functionblock Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.FunctionblockResource
	 * @generated
	 */
	public Adapter createFunctionblockResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.MethodResource <em>Method Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.MethodResource
	 * @generated
	 */
	public Adapter createMethodResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.Enum <em>Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.Enum
	 * @generated
	 */
	public Adapter createEnumAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.Identifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.Identifier
	 * @generated
	 */
	public Adapter createIdentifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.ImplementsInterface <em>Implements Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.ImplementsInterface
	 * @generated
	 */
	public Adapter createImplementsInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //IECRepositoryAdapterFactory
