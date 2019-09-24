package metamodelcomprehensionextentassessor.classdetection;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EClass;

public class SimpleClassIdentificator implements IClassIdentificator {

    private String className;
    private int matches;

    public SimpleClassIdentificator(String className) {
        this.className = className;
        matches = 0;
    }

    @Override
    public boolean matches(EClass eClass) {
        boolean doesMatch = eClass.getName().equalsIgnoreCase(className);
        if (doesMatch)
            matches++;
        return doesMatch;
    }

    @Override
    public int hashCode() {
        return 241 + className.toLowerCase().hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        SimpleClassIdentificator other = (SimpleClassIdentificator) obj;
        if (className == null)
            return other.className == null;

        return className.equalsIgnoreCase(other.className);
    }

    @Override
    public List<String> getMatchingErrorsAndReset() {
        List<String> errors = new ArrayList<>(1);
        if (matches == 0) {
            errors.add("Class not found: " + className);
        } else if (matches > 1) {
            errors.add("Class was matched multiple times: " + className);
        }

        matches = 0;
        return errors;
    }

    @Override
    public String toString() {
        return className;
    }
}
