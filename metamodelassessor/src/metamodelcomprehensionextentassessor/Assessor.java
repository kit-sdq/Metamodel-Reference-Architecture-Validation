package metamodelcomprehensionextentassessor;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.Diagnostic;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.swt.widgets.Shell;

import metamodelcomprehensionextentassessor.classdetection.IClassIdentificator;
import metamodelcomprehensionextentassessor.classdetection.IMatchException;
import metamodelcomprehensionextentassessor.collectors.CollectionResult;
import metamodelcomprehensionextentassessor.collectors.CompleteCollector;
import metamodelcomprehensionextentassessor.collectors.ICollector;
import metamodelcomprehensionextentassessor.ecorewalker.AncestorWalker;
import metamodelcomprehensionextentassessor.ecorewalker.ContainmentWalker;
import metamodelcomprehensionextentassessor.ecorewalker.IEcoreWalker;
import metamodelcomprehensionextentassessor.exceptions.MetamodelAnalysisException;
import metamodelcomprehensionextentassessor.exceptions.MetamodelAssessorException;
import metamodelcomprehensionextentassessor.exceptions.MetamodelAssessorIoException;
import metamodelcomprehensionextentassessor.helpers.EClassSet;
import metamodelcomprehensionextentassessor.helpers.ECoreContentHelper;
import metamodelcomprehensionextentassessor.helpers.ECoreLoadHelper;
import metamodelcomprehensionextentassessor.helpers.ECoreReportingHelper;
import metamodelcomprehensionextentassessor.helpers.EclipseHelper;
import metamodelcomprehensionextentassessor.helpers.MyResourceSet;
import metamodelcomprehensionextentassessor.metamodelhandles.MetamodelHandle;
import metamodelcomprehensionextentassessor.metamodelhandles.MultipleModularMetamodelsHandle;
import metamodelessessor.aet.MetamodelDependenciesAnalysisJob;
import metamodelessessor.aet.MetamodelExtensionAnalysisJob;

public class Assessor {

    private final Reporting reporting;
    private final AnalysisContext context;
    private final Shell shell;
    private Job analysisJob;

    public Assessor(Shell shell) {
        reporting = Reporting.getCurrentReporting();
        context = reporting.getContext();
        this.shell = shell;
    }

    public void assessFromClassNameList(MetamodelHandle metamodelHandle, Collection<IClassIdentificator> classIds) throws MetamodelAssessorException {

        context.setMetamodel(metamodelHandle);
        reporting.message("Metamodel: " + metamodelHandle);
        reporting.message("Assessing: extent from txt file");
        reporting.reportCollection("EntryClassNames", classIds, false);

        MetamodelSubgraph subgraph = loadSubgraphAndClassesFromIds(classIds);
        ECoreReportingHelper.reportResources("Metamodels", subgraph.getResourceSet().getResources());
        ECoreReportingHelper.reportResourcesOfClasses("Relevant modules", subgraph.getRelevantClasses());

        if (subgraph.getRelevantClasses().size() == 0) {
            reporting.promptAndLog("No entry classes, relevant subgraph is empty. Aborting assessment of this metamodel.");
            return;
        }

        evaluate(subgraph, new ContainmentWalker(), true);

        IProject dummyProject = EclipseHelper.createDummyProject(metamodelHandle.toString());
        analysisJob = new MetamodelExtensionAnalysisJob(subgraph.getRelevantClasses(), dummyProject, shell);
        analysisJob.schedule();
    }

    private void compareModification(MetamodelHandle metamodel1, MetamodelHandle metamodel2, List<String> entryClassNames) throws MetamodelAssessorException {

        List<IClassIdentificator> classIds = IClassIdentificator.create(entryClassNames, metamodel1, metamodel2);

        // perform modification analysis on the first metamodel
        assessFromClassNameList(metamodel1, classIds);
        joinAndPersistHypergraphAnalysis();

        // perform analysis from the class names on the second metamodel
        assessFromClassNameList(metamodel2, classIds);
        joinAndPersistHypergraphAnalysis();
    }

    public MetamodelSubgraphFromExtension assessExtension(MetamodelHandle metamodelHandle, ResourceSet extensionSet, boolean includeDependingModules)
            throws MetamodelAssessorIoException, MetamodelAnalysisException {

        reporting.message("Assessing: extension extent");
        reporting.message("Including depending modules: " + includeDependingModules);
        ECoreReportingHelper.reportResources("Extension Metamodels", extensionSet);

        MetamodelSubgraphFromExtension subgraph = new MetamodelSubgraphFromExtension(extensionSet);
        subgraph.loadExtensions();

        if (subgraph.getRelevantClasses().isEmpty()) {
            throw new MetamodelAssessorIoException("Found no extensions.");
        }

        /*
         * currently, depending modules do not have to be loaded, as no incoming dependencies are
         * considered. If this is changed, depending modules have to be loaded!
         */
        subgraph.loadRemainingClasses();

        ECoreReportingHelper.reportResources("Metamodels", subgraph.getResourceSet());

        evaluate(subgraph, new ContainmentWalker(), true);

        IProject dummyProject = EclipseHelper.createDummyProject(metamodelHandle.toString());
        analysisJob = new MetamodelExtensionAnalysisJob(subgraph.getRelevantClasses(), dummyProject, shell);
        analysisJob.schedule();
        return subgraph;
    }

    private void compareExtension(MetamodelHandle metamodel1, MetamodelHandle metamodel2, ResourceSet extensionSet) throws MetamodelAssessorException {

        // perform extension analysis on PCM
        context.setMetamodel(metamodel1);
        MetamodelSubgraphFromExtension subgraph = assessExtension(metamodel1, extensionSet, false);
        joinAndPersistHypergraphAnalysis();

        // extract list of class identificators
        List<String> classNames = subgraph.getExtendedClasses().stream().map(eClass -> eClass.getName()).collect(Collectors.toList());
        classNames.remove("EObject");
        List<IClassIdentificator> classIds = IClassIdentificator.create(classNames, metamodel1, metamodel2);

        if (classIds.stream().anyMatch(IMatchException.class::isInstance)) {
            throw new MetamodelAnalysisException("A matching exception was found in the identificators which were extracted from an extension. This is very unexpected.");
        }

        // perform analysis from the class names onto the mPCM
        assessFromClassNameList(metamodel2, classIds);
        joinAndPersistHypergraphAnalysis();
    }

    private void joinAndPersistHypergraphAnalysis() {
        try {
            reporting.message("Waiting for hypergraph analysis job.");
            analysisJob.join();
        } catch (InterruptedException e) {
            throw new RuntimeException("The analysis was interrupted while waiting for the AET. This should not have happened.", e);
        }
        reporting.persistHypergraphAnalysisResults();
    }

    public void compareModelUtil(MetamodelHandle metamodel1, MetamodelHandle metamodel2, ResourceSet modelsResourceSet, String modelName, List<IMatchException> exceptions)
            throws MetamodelAssessorException {

        // First, assess all models together
        compareModelUtil(metamodel1, metamodel2, modelsResourceSet, modelName, "Full", exceptions);

        // Then, assess the models individually
        List<Resource> resources = new ArrayList<>(modelsResourceSet.getResources());
        if (resources.size() > 1) {
            for (Resource resource : resources) {
                ResourceSet singleModelresourceSet = new ResourceSetImpl();
                singleModelresourceSet.getResources().add(resource);
                context.incrementLogFileNumber();
                compareModelUtil(metamodel1, metamodel2, singleModelresourceSet, modelName, "Single", exceptions);
            }
        }
    }

    private void compareModelUtil(MetamodelHandle metamodel1, MetamodelHandle metamodel2, ResourceSet modelsResourceSet, String modelName, String modeName, List<IMatchException> exceptions)
            throws MetamodelAssessorException {

        String resourceNamesInline = modelsResourceSet.getResources().stream().map(resource -> ECoreContentHelper.getModelResourceName(resource)).collect(Collectors.joining(" "));

        /* assess for primary metamodel */
        context.setMetamodel(metamodel1);
        reporting.message("Assessing: model extent onto " + metamodel1);
        reporting.message("Mode: " + modeName + ", Model: " + modelName);
        ECoreReportingHelper.reportModelResources("Assessing the following resources", modelsResourceSet);

        /*
         * It would have been nice to determine metamodels dynamically (however the API does not
         * support it the easy way (using EObject.eClass does not yield proper resources)).
         * Therefore, here, we work with a list of class names.
         */
        // determine the list of names of used classes
        Collection<IClassIdentificator> classIds = ECoreContentHelper.getClassIdentificatorsFromModels(modelsResourceSet, exceptions);
        classIds = Collections.unmodifiableCollection(classIds);
        reporting.reportCollection("Instantiated classes", classIds, false);

        MetamodelSubgraph subgraph = loadSubgraphAndClassesFromIds(classIds);
        evaluate(subgraph, new AncestorWalker(false), false);
        if (subgraph.getRelevantClasses().size() == 0) {
            reporting.promptAndLog("No entry classes, relevant subgraph is empty. Aborting assessment of this metamodel.");
            return;
        }

        double util = analyzeUtil(subgraph);
        reporting.appendCsvReport(modeName + ';' + modelName + ';' + resourceNamesInline + ';' + metamodel1 + ';' + util);

        /* assess for secondary metamodel */
        context.setMetamodel(metamodel2);
        reporting.message("Assessing: model extent, transfered class names onto " + metamodel2);
        reporting.message("Mode: " + modeName + ", Model: " + modelName);
        ECoreReportingHelper.reportModelResources("Assessing the following resources", modelsResourceSet);
        reporting.reportCollection("Instantiated classes", classIds, false);

        subgraph.dispose();
        subgraph = loadSubgraphAndClassesFromIds(classIds);
        if (subgraph.getRelevantClasses().size() == 0) {
            reporting.promptAndLog("No entry classes, relevant subgraph is empty. Aborting assessment of this metamodel.");
            return;
        }

        evaluate(subgraph, new AncestorWalker(false), false);
        EClassSet relevantClasses = subgraph.getRelevantClasses();

        /* all mPCM modules were loaded. So now we have to find out, which ones were really used. */
        Set<Resource> resourcesOfRelevantClasses = subgraph.getResourcesOfRelevantClasses();
        ResourceSet resourceSet = new ResourceSetImpl();
        resourceSet.getResources().addAll(resourcesOfRelevantClasses);
        EcoreUtil.resolveAll(resourceSet);

        subgraph = new MetamodelSubgraph(resourceSet, false);
        subgraph.setRelevantClasses(relevantClasses);

        reporting.message("Determining the remaining classes (only from used modules)");
        subgraph.loadRemainingClasses();

        util = analyzeUtil(subgraph);
        reporting.appendCsvReport(modeName + ';' + modelName + ';' + resourceNamesInline + ';' + metamodel2 + ';' + util);

        subgraph.dispose();
    }

    private void evaluate(MetamodelSubgraph subgraph, IEcoreWalker walker, boolean useCollector) throws MetamodelAnalysisException {

        ECoreReportingHelper.reportClasses("EntryClasses", subgraph.getRelevantClasses());
        ECoreReportingHelper.reportClasses("RemainingClasses", subgraph.getRemainingClasses());

        // walk the subgraph
        reporting.message("Using " + walker);
        walker.walk(subgraph);

        ECoreReportingHelper.reportClasses("EntryClasses after walk", subgraph.getRelevantClasses());
        ECoreReportingHelper.reportClasses("RemainingClasses after walk", subgraph.getRemainingClasses());

        // determine (un)used modules
        MyResourceSet modulesOfDetectedClasses = subgraph.getResourcesOfRelevantClasses();
        MyResourceSet modulesOfRemainingClasses = subgraph.getResourcesOfRemainingClasses();
        modulesOfRemainingClasses.removeAll(modulesOfDetectedClasses);
        ECoreReportingHelper.reportResources("Used Modules", modulesOfDetectedClasses);
        ECoreReportingHelper.reportResources("Unused Modules", modulesOfRemainingClasses);

        if (useCollector) {
            // collect simple results
            ICollector collector = new CompleteCollector(false);
            reporting.message("Using " + collector.getClass().getSimpleName());
            CollectionResult results = collector.execute(subgraph.getRelevantClasses());
            reporting.message("Results raw:\n" + results);
        }
    }

    private MetamodelSubgraph loadSubgraphAndClassesFromIds(Collection<IClassIdentificator> classIds) throws MetamodelAssessorException {
        MetamodelSubgraph subgraph = new MetamodelSubgraph(false);
        subgraph.loadMetmaodel(context.getMetamodel());
        subgraph.resolveAll();
        subgraph.loadClassesFromNameList(classIds);
        return subgraph;
    }

    private double analyzeUtil(MetamodelSubgraph subgraph) {
        int usedClassCount = subgraph.getRelevantClasses().size();
        int unusedClassCount = subgraph.getRemainingClasses().size();
        int totalClassCount = unusedClassCount + usedClassCount;
        double util = (double) usedClassCount / totalClassCount;

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Utilization = ").append(usedClassCount).append('/').append(totalClassCount).append(" = ").append(util);
        String result = stringBuilder.toString();

        reporting.message(result);
        return util;
    }

    public void compareMetamodels(AssessmentInputData data) throws MetamodelAssessorException {

        assessMetamodel(data.getTarget1());
        assessMetamodel(data.getTarget2());
        reporting.flushCSVReport("Hypergraph Type;Metamodel;Metric;Value");
    }

    public void assessSingleMetamodel(AssessmentInputData data) throws MetamodelAssessorException {

        assessMetamodel(data.getTarget1());
        reporting.flushCSVReport("Hypergraph Type;Metamodel;Metric;Value");
    }

    private void assessMetamodel(MetamodelHandle metamodelHandle) throws MetamodelAssessorException {

        context.reset();
        context.setMetamodel(metamodelHandle);

        // load metamodel
        MetamodelSubgraph subgraph = new MetamodelSubgraph(false);
        subgraph.loadMetmaodel(metamodelHandle);
        subgraph.resolveAll();
        Collection<Resource> resources = subgraph.getResourceSet().getResources();

        // set sorted after length of Strings
        TreeSet<String> sortedReport = new TreeSet<>((S1, S2) -> {
            int diff = S1.length() - S2.length();
            if (diff == 0)
                diff = 1;
            return diff;
        });

        // this map is needed for the transformation to hypergraph
        Map<String, HashSet<String>> adjacencyTable = new HashMap<>();
        EClassSet classes = new EClassSet(true);
        Map<String, Integer> classCounts = new HashMap<>(resources.size()); //TODO: use map that allows multiple identical keys or other data structure

        reporting.message("Assessing: dependencies: " + metamodelHandle);

        // iterate over all metamodels
        for (Resource resource : resources) {

            // inspect if resource is valid
            EList<Diagnostic> errors = resource.getErrors();
            if (errors.size() > 0) {
                reporting.message("WARNING: there were errors with resource " + resource + ". Skipping.");
                errors.forEach(e -> reporting.message(e.toString()));
                continue;
            }

            String resourceName = ECoreContentHelper.getResourceName(resource);
            HashSet<String> moduleDependencies = new HashSet<>();
            adjacencyTable.put(resourceName, moduleDependencies);

            // iterate over all classes
            int classCount = 0;
            TreeIterator<EObject> iterator = resource.getAllContents();
            while (iterator.hasNext()) {
                EObject eObject = iterator.next();
                if (eObject instanceof EClass) {
                    classCount++;
                    EClass eClass = (EClass) eObject;
                    classes.add(eClass);
                    collectModuleDependencies(eClass, resource, moduleDependencies, adjacencyTable);
                }
            }

            sortedReport.add(resourceName + ": " + moduleDependencies);
            classCounts.put(resourceName, classCount);
        }

        reporting.message("Modules assessed: " + resources.size());

        // report module dependencies
        sortedReport.forEach(s -> reporting.message(s));

        // report class counts
        List<String> classCountStrings = classCounts.entrySet().stream().map(entry -> entry.getKey() + ": " + entry.getValue()).collect(Collectors.toList());
        reporting.reportCollection("Class counts", classCountStrings, false);

        // overall counting metrics
        ICollector collector = new CompleteCollector(true);
        reporting.message("Using " + collector.getClass().getSimpleName());
        CollectionResult results = collector.execute(classes);
        reporting.message("Results raw:\n" + results);

        context.startNewRun("package graph");
        context.setMetamodel(metamodelHandle);
        IProject dummyProject = EclipseHelper.createDummyProject(metamodelHandle.toString() + " package graph");
        analysisJob = new MetamodelExtensionAnalysisJob(classes, dummyProject, shell);
        analysisJob.schedule();
        joinAndPersistHypergraphAnalysis();

        context.startNewRun("module graph");
        context.setMetamodel(metamodelHandle);
        dummyProject = EclipseHelper.createDummyProject(metamodelHandle.toString() + " module graph");
        analysisJob = new MetamodelDependenciesAnalysisJob(adjacencyTable, dummyProject, shell);
        analysisJob.schedule();
        joinAndPersistHypergraphAnalysis();
    }

    private void collectModuleDependencies(EClass eClass, Resource resource, Set<String> moduleDependencies, Map<String, HashSet<String>> adjacencyTable) {
        // iterate over references
        EList<EReference> references = eClass.getEReferences();
        for (EReference reference : references) {

            // does reference point into other metamodel?
            EClass targetClass = reference.getEReferenceType();
            if (targetClass == null) {
                reporting.message("WARNING: the reference " + eClass.getName() + '.' + reference.getName() + " has no type. This metamodel contains validation errors.");
                continue;
            }
            Resource targetResource = targetClass.eResource();

            if (targetResource == null) {
                reporting.message("WARNING: There is an unresolvable proxy in the metamodel: " + eClass.getName() + '.' + reference.getName() + " points to " + targetClass);
                continue;
            }

            if (!targetResource.equals(resource)) {

                // extended class found
                String resourceName = ECoreContentHelper.getResourceName(targetResource);
                moduleDependencies.add(resourceName);
                reporting.message("Found inter-metamodel reference " + reference.getName() + " from " + eClass.getName() + " to " + targetClass.getName() + " (" + resourceName + ')');
            }
        }

        // iterate over all superclasses
        EList<EClass> superClasses = eClass.getESuperTypes();
        for (EClass superClass : superClasses) {

            // get metamodel of superclass and check for unresolvable proxy
            Resource targetResource = superClass.eResource();
            if (targetResource == null) {

                reporting.message("WARNING: There is an unresolvable proxy in the metamodel: " + superClass + ". It is superclass of " + eClass.getName() + " from "
                        + ECoreContentHelper.getModelResourceName(resource) + '.');
                continue;
            }

            // does inheritance point into other metamodel?
            if (!targetResource.equals(resource)) {

                // extended class found
                String resourceName = ECoreContentHelper.getResourceName(targetResource);
                moduleDependencies.add(resourceName);
                reporting.message("Found inter-metamodel inheritance from " + eClass.getName() + " to " + superClass.getName() + " (" + resourceName + ')');
            }
        }
    }

    public void compareSeries(AssessmentInputData data) throws MetamodelAssessorException {
        Mode mode = data.getMode();
        MetamodelHandle metamodel1 = data.getTarget1();
        MetamodelHandle metamodel2 = data.getTarget2();

        // ensure single selection
        if (data.getSelection().size() != 1) {
            reporting.promptAndLog("Please select exactly one project.");
            return;
        }

        // get project from selection
        IProject inputProject;
        try {
            inputProject = EclipseHelper.getProjectOfSelection(data.getSelection());
        } catch (MetamodelAssessorException e) {
            reporting.reportException("Could not get project from selection.", e, false);
            reporting.promptAndLog("Please select a project.");
            return;
        }

        // look for exceptions file
        List<IMatchException> exceptions = null;
        if (mode == Mode.MODEL_SERIES) {
            IFile exceptionFile = inputProject.getFile("exceptions.txt");
            if (exceptionFile != null && exceptionFile.exists()) {
                List<String> exceptionStrings = EclipseHelper.readLinesOfFile(exceptionFile);
                exceptions = parseExceptions(exceptionStrings, metamodel1, metamodel2);
            } else {
                exceptions = Collections.emptyList();
            }
        }

        // iterate over subfolders
//        int i = 0;
        Collection<IFolder> folders = EclipseHelper.getMembersOfContainer(inputProject, IFolder.class);
        for (IResource resource : folders) {
//            i++; // only for testing
//            if (i <= 60) {
//                continue;
//            } else if (i > 120)
//                break;

            IFolder folder = (IFolder) resource;
            String folderName = folder.getName();

            if (folderName.matches("_+ignore"))
                continue;

            context.startNewRun(folderName);

            if (mode == Mode.EXT_SERIES) {
                ResourceSet resourceSet = new ResourceSetImpl();
                ECoreLoadHelper.loadResourcesFromContainer(resourceSet, folder, true);
                compareExtension(metamodel1, metamodel2, resourceSet);
            } else if (mode == Mode.MOD_SERIES) {
                List<String> entryClassNames = EclipseHelper.readLinesOfFile(folder.getFile("mod.txt"));
                compareModification(metamodel1, metamodel2, entryClassNames);
            } else if (mode == Mode.MODEL_SERIES) {
                ResourceSet resourceSet = new ResourceSetImpl();
                try {
                    ECoreLoadHelper.loadResourcesFromContainer(resourceSet, folder, false);
                    compareModelUtil(metamodel1, metamodel2, resourceSet, folderName, exceptions);
                } catch (MetamodelAssessorIoException e) {
                    reporting.reportException("There was a problem with the contents of " + folderName + ". Skipping folder.", e, true);
                }
                ECoreLoadHelper.disposeResourceSet(resourceSet);
            } else {
                throw new RuntimeException("Unexpected assessment mode!");
            }
        }

        // write csv
        if (mode == Mode.MODEL_SERIES) {
            reporting.flushCSVReport("Mode;Model;Resource;Metamodel;Util");
        } else {
            reporting.flushCSVReportWithResultClasses("Scenario;Metamodel;Metric;Value");
        }
    }

    private ArrayList<IMatchException> parseExceptions(List<String> exceptionStrings, MetamodelHandle metamodel1, MetamodelHandle metamodel2) throws MetamodelAssessorIoException {
        ArrayList<IMatchException> exceptionList = new ArrayList<>(exceptionStrings.size());
        for (String line : exceptionStrings) {
            exceptionList.add(IMatchException.parse(line, metamodel1, metamodel2));
        }
        return exceptionList;
    }

    public void assessMultipleMetamodel(AssessmentInputData data) throws MetamodelAssessorException {
        assert data.getTarget1() instanceof MultipleModularMetamodelsHandle;
        MultipleModularMetamodelsHandle multiHandle = (MultipleModularMetamodelsHandle) data.getTarget1();

        while (multiHandle.hasNext()) {
            assessMetamodel(multiHandle);
            multiHandle.advance();
        }
        reporting.flushCSVReport("Hypergraph Type;Metamodel;Metric;Value");
    }
}
