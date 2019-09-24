package metamodelcomprehensionextentassessor.classdetection;

import java.util.Objects;

import org.eclipse.emf.ecore.EClass;

class PackageNameClassNamePair {
    private final String packageName;
    private final String className;
    private final boolean allowWildcards;

    public PackageNameClassNamePair(String packageName, String className, boolean allowWildcards) {
        this.packageName = packageName;
        this.className = className;
        this.allowWildcards = allowWildcards;
    }

    public boolean matches(EClass eClass) {
        return doClassNamesMatch(eClass) && doPackageNamesMatch(eClass);
    }

    private boolean doClassNamesMatch(EClass eClass) {
        if (allowWildcards && className.equals("*")) {
            return true;
        } else {
            return className.equalsIgnoreCase(eClass.getName());
        }
    }

    private boolean doPackageNamesMatch(EClass eClass) {
        if (allowWildcards && packageName.equals("*")) {
            return true;
        } else {
            return packageName.equalsIgnoreCase(eClass.getEPackage().getName());
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(packageName, className);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PackageNameClassNamePair)) {
            return false;
        }
        PackageNameClassNamePair otherPair = (PackageNameClassNamePair) obj;
        return packageName.equalsIgnoreCase(otherPair.packageName) && className.equalsIgnoreCase(otherPair.className);
    }

    @Override
    public String toString() {
        return packageName + '.' + className;
    }

    public boolean containsWildcard() {
        return packageName.equals("*") || className.equals("*");
    }
}
