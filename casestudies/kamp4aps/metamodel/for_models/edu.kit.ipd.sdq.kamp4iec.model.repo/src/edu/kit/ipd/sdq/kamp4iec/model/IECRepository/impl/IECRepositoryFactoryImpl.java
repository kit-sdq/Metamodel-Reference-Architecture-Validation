/**
 */
package edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl;

import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.Function;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.FunctionBlock;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.GlobalVariable;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECInterface;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECMethod;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECMethodImplementation;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECProperty;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECPropertyImplementation;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECRepositoryFactory;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECRepositoryPackage;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.ImplementsInterface;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.Program;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.Repository;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.VariableType;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
public class IECRepositoryFactoryImpl extends EFactoryImpl implements IECRepositoryFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IECRepositoryFactory init() {
		try {
			IECRepositoryFactory theIECRepositoryFactory = (IECRepositoryFactory)EPackage.Registry.INSTANCE.getEFactory(IECRepositoryPackage.eNS_URI);
			if (theIECRepositoryFactory != null) {
				return theIECRepositoryFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new IECRepositoryFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IECRepositoryFactoryImpl() {
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
			case IECRepositoryPackage.FUNCTION_BLOCK: return createFunctionBlock();
			case IECRepositoryPackage.GLOBAL_VARIABLE: return createGlobalVariable();
			case IECRepositoryPackage.IEC_INTERFACE: return createIECInterface();
			case IECRepositoryPackage.IEC_METHOD_IMPLEMENTATION: return createIECMethodImplementation();
			case IECRepositoryPackage.FUNCTION: return createFunction();
			case IECRepositoryPackage.PROGRAM: return createProgram();
			case IECRepositoryPackage.REPOSITORY: return createRepository();
			case IECRepositoryPackage.IEC_PROPERTY_IMPLEMENTATION: return createIECPropertyImplementation();
			case IECRepositoryPackage.IEC_PROPERTY: return createIECProperty();
			case IECRepositoryPackage.IEC_METHOD: return createIECMethod();
			case IECRepositoryPackage.ENUM: return createEnum();
			case IECRepositoryPackage.IMPLEMENTS_INTERFACE: return createImplementsInterface();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case IECRepositoryPackage.VARIABLE_TYPE:
				return createVariableTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case IECRepositoryPackage.VARIABLE_TYPE:
				return convertVariableTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionBlock createFunctionBlock() {
		FunctionBlockImpl functionBlock = new FunctionBlockImpl();
		return functionBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalVariable createGlobalVariable() {
		GlobalVariableImpl globalVariable = new GlobalVariableImpl();
		return globalVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IECInterface createIECInterface() {
		IECInterfaceImpl iecInterface = new IECInterfaceImpl();
		return iecInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IECMethodImplementation createIECMethodImplementation() {
		IECMethodImplementationImpl iecMethodImplementation = new IECMethodImplementationImpl();
		return iecMethodImplementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Function createFunction() {
		FunctionImpl function = new FunctionImpl();
		return function;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Program createProgram() {
		ProgramImpl program = new ProgramImpl();
		return program;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Repository createRepository() {
		RepositoryImpl repository = new RepositoryImpl();
		return repository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IECPropertyImplementation createIECPropertyImplementation() {
		IECPropertyImplementationImpl iecPropertyImplementation = new IECPropertyImplementationImpl();
		return iecPropertyImplementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IECProperty createIECProperty() {
		IECPropertyImpl iecProperty = new IECPropertyImpl();
		return iecProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IECMethod createIECMethod() {
		IECMethodImpl iecMethod = new IECMethodImpl();
		return iecMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public edu.kit.ipd.sdq.kamp4iec.model.IECRepository.Enum createEnum() {
		EnumImpl enum_ = new EnumImpl();
		return enum_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplementsInterface createImplementsInterface() {
		ImplementsInterfaceImpl implementsInterface = new ImplementsInterfaceImpl();
		return implementsInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableType createVariableTypeFromString(EDataType eDataType, String initialValue) {
		VariableType result = VariableType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVariableTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IECRepositoryPackage getIECRepositoryPackage() {
		return (IECRepositoryPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static IECRepositoryPackage getPackage() {
		return IECRepositoryPackage.eINSTANCE;
	}

} //IECRepositoryFactoryImpl
