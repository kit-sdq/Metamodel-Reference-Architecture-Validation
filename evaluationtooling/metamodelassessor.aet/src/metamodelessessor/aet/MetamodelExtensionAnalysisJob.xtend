package metamodelessessor.aet

import de.cau.cs.se.software.evaluation.jobs.AbstractHypergraphAnalysisJob
import de.cau.cs.se.software.evaluation.views.AnalysisResultModelProvider
import java.util.Set
import metamodelessessor.aet.transformation.TransformationEClassesToHypergraph
import org.eclipse.core.resources.IProject
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.core.runtime.Status
import org.eclipse.emf.ecore.EClass
import org.eclipse.swt.widgets.Shell

class MetamodelExtensionAnalysisJob extends AbstractHypergraphAnalysisJob {

	val Set<EClass> classes

	new(Set<EClass> classes, IProject project, Shell shell) {
		super(project, shell)
		this.classes = classes
	}

	override protected run(IProgressMonitor monitor) {

		val result = AnalysisResultModelProvider.INSTANCE
		result.clearValues

		val transformation = new TransformationEClassesToHypergraph(monitor, true, true)
		transformation.generate(classes)
		val hypergraph = transformation.result

		result.addResult(project.name, "number of modules", hypergraph.modules.size)
		result.addResult(project.name, "number of nodes", hypergraph.nodes.size)
		result.addResult(project.name, "number of edges", hypergraph.edges.size)

		calculateSize(hypergraph, monitor, result)
		calculateComplexity(hypergraph, monitor, result)
		calculateCoupling(hypergraph, monitor, result)
		calculateCohesion(hypergraph, monitor, result)

		result.hypergraph = hypergraph
		updateView()

		monitor.done()
		Status.OK_STATUS
	}

}
