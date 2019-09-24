package metamodelcomprehensionextentassessor.collectors;

import metamodelcomprehensionextentassessor.helpers.EClassSet;

public interface ICollector {
    CollectionResult execute(EClassSet classSet);
}
