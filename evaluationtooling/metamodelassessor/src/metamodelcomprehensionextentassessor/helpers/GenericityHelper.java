package metamodelcomprehensionextentassessor.helpers;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.ETypeParameter;

public class GenericityHelper {

    public static void visitGenericity(EClass eClass, EClassSet classesFound) {
        eClass.getETypeParameters().forEach(typeParam -> visitTypeParam(typeParam, classesFound));
        eClass.getEGenericSuperTypes().forEach(genericSuperType -> visitGenericSuperType(genericSuperType, classesFound));
        eClass.getEReferences().forEach(ref -> visitGenericRef(ref.getEGenericType(), classesFound));
    }

    public static void visitTypeParam(ETypeParameter typeParam, EClassSet classesFound) {
        typeParam.getEBounds().forEach(bound -> visitGenericType(bound, classesFound));
    }

    private static void visitGenericSuperType(EGenericType genericSuperType, EClassSet classesFound) {
        if (genericSuperType.getETypeArguments().size() > 0)
            visitGenericType(genericSuperType, classesFound);
    }

    private static void visitGenericRef(EGenericType genericTypeOfRef, EClassSet classesFound) {
        if (genericTypeOfRef.getETypeArguments().size() > 0)
            visitGenericType(genericTypeOfRef, classesFound);
    }

    public static void visitGenericType(EGenericType genericType, EClassSet classesFound) {
        if (genericType == null)
            return;

        EClassifier eClassifier = genericType.getEClassifier();
        if (eClassifier != null) {
            if (!(eClassifier instanceof EClass)) {
                // we currently exclude classifiers besides EClasses, they were not changed during the refactoring
            } else
                classesFound.add((EClass) eClassifier);
        }

        visitGenericType(genericType.getEUpperBound(), classesFound);
        visitGenericType(genericType.getELowerBound(), classesFound);
        genericType.getETypeArguments().forEach(t -> visitGenericType(t, classesFound));

        ETypeParameter typeParam = genericType.getETypeParameter();
        if (typeParam != null) {
            visitTypeParam(typeParam, classesFound);
        }
    }
}
