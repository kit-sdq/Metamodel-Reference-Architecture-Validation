package metamodelcomprehensionextentassessor.collectors;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import metamodelcomprehensionextentassessor.helpers.EClassSet;

public class CompleteCollector implements ICollector {

    private final EClassSet tangentialClasses;
    private final Set<EPackage> packages;
    private final CollectionResult results;

    public CompleteCollector(boolean forgiving) {
        tangentialClasses = new EClassSet(forgiving);
        packages = new HashSet<>();
        results = new CollectionResult();
    }

    @Override
    public CollectionResult execute(EClassSet classSet) {

        classSet.forEach(eClass -> processClass(eClass, classSet));
        results.addPackages(packages.size());
        return results;
    }

    private void processClass(EClass eClass, EClassSet classSet) {
        results.addClass();
        results.addAttributes(eClass.getEAttributes().size());
        results.addInheritances(eClass.getESuperTypes().size());
        packages.add(eClass.getEPackage());
        eClass.getEReferences().forEach(eRef -> {
            EClass referencedClass = eRef.getEReferenceType();
            if (!classSet.contains(referencedClass)) {
                boolean notYetEncountered = tangentialClasses.add(referencedClass);
                if (notYetEncountered) {
                    results.addClass();
                }
            }

            if (eRef.isContainment())
                results.addContainment();
            else
                results.addReference();
        });
    }
}
