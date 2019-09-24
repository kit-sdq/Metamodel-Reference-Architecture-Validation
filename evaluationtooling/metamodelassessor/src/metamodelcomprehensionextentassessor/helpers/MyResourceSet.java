package metamodelcomprehensionextentassessor.helpers;

import java.util.HashSet;
import java.util.stream.Stream;

import org.eclipse.emf.ecore.resource.Resource;

import metamodelcomprehensionextentassessor.Reporting;

// TODO this is mostly a clone of EClassSet :(
public class MyResourceSet extends HashSet<Resource> {

    private static final long serialVersionUID = -4662786697734529454L;

    public MyResourceSet() {
        super();
    }

    public MyResourceSet(int size) {
        super(size);
    }

    public MyResourceSet(MyResourceSet otherSet) {
        super(otherSet);
    }

    public MyResourceSet(Stream<Resource> stream) {
        stream.forEach(this::add);
    }

    @Override
    public boolean add(Resource e) {
        if (contains(e)) {
            return false;
        }
        return super.add(e);
    }

    @Override
    public boolean contains(Object o) {

        // if object already present => true
        if (super.contains(o)) {
            return true;
        }

        // not a Resource => false
        if (!(o instanceof Resource)) {
            return false;
        }
        Resource resource = (Resource) o;
        String name = ECoreContentHelper.getResourceName(resource);

        // duplicate might still exist in the set
        Reporting reporting = Reporting.getCurrentReporting();
        for (Resource containedResource : this) {

            if (name.equalsIgnoreCase(ECoreContentHelper.getResourceName(containedResource))) {
                if (ECoreContentHelper.resourceEquals(resource, containedResource)) {
//                    reporting.message("The Resources with the name " + name + " are identical.");
                    return true;
                } else {
                    reporting.promptAndLog("Different Metamodels with the same name (" + name + ") were found!");
                    reporting.message("Other resource:     " + resource.toString());
                    reporting.message("Contained resource: " + containedResource.toString());
                    return false;
                }
            }
        }

        return false;
    }

    //TODO code clone much?
    @Override
    public boolean remove(Object o) {
        if (super.remove(o)) {
            return true;
        }

        // not a Resource => false
        if (!(o instanceof Resource)) {
            return false;
        }
        Resource resource = (Resource) o;
        String name = ECoreContentHelper.getResourceName(resource);

        // duplicate might still exist in the set
        Reporting reporting = Reporting.getCurrentReporting();
        for (Resource containedResource : this) {

            if (name.equalsIgnoreCase(ECoreContentHelper.getResourceName(containedResource))) {
                if (ECoreContentHelper.resourceEquals(resource, containedResource)) {
                    reporting.message("The Resources with the name " + name + " are identical.");
                    super.remove(containedResource);
                    return true;
                } else {
                    reporting.promptAndLog("Different Resources with the same name (" + name + ") were found!");
                    reporting.message("Other resource:     " + resource.toString());
                    reporting.message("Contained resource: " + containedResource.toString());
                }
            }
        }

        return false;
    }
}
