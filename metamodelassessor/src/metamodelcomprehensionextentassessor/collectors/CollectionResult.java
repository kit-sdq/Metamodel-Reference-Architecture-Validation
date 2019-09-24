package metamodelcomprehensionextentassessor.collectors;

public class CollectionResult {
    private int classCount;
    private int attributeCount;
    private int inheritanceCount;
    private int referenceCount;
    private int containmentCount;
    private int packageCount;

    public void addClass() {
        classCount++;
    }

    public void addAttribute() {
        attributeCount++;
    }

    public void addAttributes(int count) {
        attributeCount += count;
    }

    public void addInheritance() {
        inheritanceCount++;
    }

    public void addInheritances(int count) {
        inheritanceCount += count;
    }

    public void addReference() {
        referenceCount++;
    }

    public void addContainment() {
        containmentCount++;
    }

    public void addPackages(int count) {
        packageCount += count;
    }

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder();
        string.append("Classes ");
        string.append(classCount);
        string.append("\nAttributes ");
        string.append(attributeCount);
        string.append("\nInheritances ");
        string.append(inheritanceCount);
        string.append("\nReferences ");
        string.append(referenceCount);
        string.append("\nContainments ");
        string.append(containmentCount);
        string.append("\nPackages ");
        string.append(packageCount);
        return string.toString();
    }
}
