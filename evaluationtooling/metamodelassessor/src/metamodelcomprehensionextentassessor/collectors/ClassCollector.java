package metamodelcomprehensionextentassessor.collectors;

import org.eclipse.emf.ecore.EClass;

import metamodelcomprehensionextentassessor.helpers.EClassSet;

public class ClassCollector implements ICollector {

    EClassSet tangentialClasses;
    CollectionResult results;

    public ClassCollector(boolean forgiving) {
        tangentialClasses = new EClassSet(forgiving);
    }

    @Override
    public CollectionResult execute(EClassSet classSet) {
        results = new CollectionResult();
        classSet.forEach(eClass -> processClass(eClass, classSet));
        return results;
    }

    private void processClass(EClass eClass, EClassSet classSet) {
        results.addClass();
    }
}
